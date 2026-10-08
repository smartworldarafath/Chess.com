package com.google.inputmethod;

import androidx.compose.p000animation.core.AnimateAsStateKt;
import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p002material3.InteractiveComponentSizeKt;
import androidx.compose.p002material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.b;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.drawscope.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aQ\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010\"\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0015"}, d2 = {"", "selected", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/b;", "modifier", "enabled", "Lcom/google/android/e2a;", "colors", "Lcom/google/android/r48;", "interactionSource", "c", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/b;ZLcom/google/android/e2a;Lcom/google/android/r48;Landroidx/compose/runtime/d;II)V", "Lcom/google/android/ff3;", "a", "F", "RadioButtonPadding", "b", "RadioButtonDotSize", "RadioStrokeWidth", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class i2a {
    private static final float a;
    private static final float b = ff3.i(12);
    private static final float c;

    static {
        float f = 2;
        a = ff3.i(f);
        c = ff3.i(f);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0124  */
    /* JADX WARN: Code duplicated, block: B:103:0x0152  */
    /* JADX WARN: Code duplicated, block: B:104:0x0186  */
    /* JADX WARN: Code duplicated, block: B:106:0x018e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0195  */
    /* JADX WARN: Code duplicated, block: B:110:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:115:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:117:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x0078  */
    /* JADX WARN: Code duplicated, block: B:49:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:55:0x008d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0095  */
    /* JADX WARN: Code duplicated, block: B:60:0x0099  */
    /* JADX WARN: Code duplicated, block: B:62:0x009c  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:92:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x0105  */
    /* JADX WARN: Code duplicated, block: B:96:0x0112  */
    /* JADX WARN: Code duplicated, block: B:98:0x011a  */
    public static final void c(final boolean z, final Function0<Unit> function0, b bVar, boolean z2, e2a e2aVar, r48 r48Var, d dVar, final int i, final int i2) {
        int i3;
        b bVar2;
        int i4;
        boolean z3;
        int i5;
        e2a e2aVarA;
        int i6;
        int i7;
        boolean z4;
        final r48 r48Var2;
        final b bVar3;
        final boolean z5;
        final e2a e2aVar2;
        s6b s6bVarH;
        b bVar4;
        int i8;
        boolean z6;
        e2a e2aVar3;
        float fI;
        final q6c<ff3> q6cVarD;
        final q6c<ei1> q6cVarA;
        Object obj;
        b bVar5;
        b bVarA;
        b bVarH;
        boolean zX;
        Object objR;
        d dVarF = dVar.F(408580840);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.A(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= dVarF.T(function0) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                bVar2 = bVar;
                i3 |= dVarF.x(bVar2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z3 = z2;
                    if (dVarF.A(z3)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        e2aVarA = e2aVar;
                        int i10 = dVarF.x(e2aVarA) ? 16384 : 8192;
                        i3 |= i10;
                    } else {
                        e2aVarA = e2aVar;
                    }
                    i3 |= i10;
                } else {
                    e2aVarA = e2aVar;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        if (dVarF.x(r48Var)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((74899 & i3) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (dVarF.g(z4, i3 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0 || dVarF.t()) {
                            if (i9 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                e2aVarA = f2a.a.a(dVarF, 6);
                            }
                            if (i6 != 0) {
                                i8 = i3;
                                z6 = z3;
                                e2aVar3 = e2aVarA;
                                r48Var = null;
                            } else {
                                i8 = i3;
                            }
                            dVarF.M();
                            if (e.k()) {
                                e.o(408580840, i8, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:80)");
                            }
                            if (z) {
                                fI = ff3.i(b / 2);
                            } else {
                                fI = ff3.i(0);
                            }
                            q6cVarD = AnimateAsStateKt.d(fI, d08.b(MotionSchemeKeyTokens.FastSpatial, dVarF, 6), null, null, dVarF, 0, 12);
                            q6cVarA = e2aVar3.a(z6, z, dVarF, ((i8 >> 6) & 896) | ((i8 >> 9) & 14) | ((i8 << 3) & 112));
                            if (function0 != null) {
                                b bVar6 = bVar4;
                                z5 = z6;
                                bVar5 = bVar6;
                                obj = null;
                                bVarA = hdb.a(b.INSTANCE, z, r48Var, xoa.e(false, ff3.i(j2a.a.e() / 2), 0L, 4, null), z5, hpa.j(hpa.INSTANCE.f()), function0);
                            } else {
                                obj = null;
                                bVar5 = bVar4;
                                z5 = z6;
                                bVarA = b.INSTANCE;
                            }
                            if (function0 != null) {
                                bVarH = InteractiveComponentSizeKt.h(b.INSTANCE);
                            } else {
                                bVarH = b.INSTANCE;
                            }
                            b bVarM = SizeKt.m(nx8.n(SizeKt.E(bVar5.then(bVarH).then(bVarA), tc.INSTANCE.e(), false, 2, obj), a), j2a.a.c());
                            zX = dVarF.x(q6cVarA) | dVarF.x(q6cVarD);
                            objR = dVarF.R();
                            if (zX || objR == d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.g2a
                                    public final Object invoke(Object obj2) {
                                        return i2a.d(q6cVarA, q6cVarD, (DrawScope) obj2);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            v51.b(bVarM, (Function1) objR, dVarF, 0);
                            if (e.k()) {
                                e.n();
                            }
                            r48Var2 = r48Var;
                            e2aVar2 = e2aVar3;
                            bVar3 = bVar5;
                        } else {
                            dVarF.q();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            i8 = i3;
                            bVar4 = bVar2;
                        }
                        z6 = z3;
                        e2aVar3 = e2aVarA;
                        dVarF.M();
                        if (e.k()) {
                            e.o(408580840, i8, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:80)");
                        }
                        if (z) {
                            fI = ff3.i(b / 2);
                        } else {
                            fI = ff3.i(0);
                        }
                        q6cVarD = AnimateAsStateKt.d(fI, d08.b(MotionSchemeKeyTokens.FastSpatial, dVarF, 6), null, null, dVarF, 0, 12);
                        q6cVarA = e2aVar3.a(z6, z, dVarF, ((i8 >> 6) & 896) | ((i8 >> 9) & 14) | ((i8 << 3) & 112));
                        if (function0 != null) {
                            b bVar7 = bVar4;
                            z5 = z6;
                            bVar5 = bVar7;
                            obj = null;
                            bVarA = hdb.a(b.INSTANCE, z, r48Var, xoa.e(false, ff3.i(j2a.a.e() / 2), 0L, 4, null), z5, hpa.j(hpa.INSTANCE.f()), function0);
                        } else {
                            obj = null;
                            bVar5 = bVar4;
                            z5 = z6;
                            bVarA = b.INSTANCE;
                        }
                        if (function0 != null) {
                            bVarH = InteractiveComponentSizeKt.h(b.INSTANCE);
                        } else {
                            bVarH = b.INSTANCE;
                        }
                        b bVarM2 = SizeKt.m(nx8.n(SizeKt.E(bVar5.then(bVarH).then(bVarA), tc.INSTANCE.e(), false, 2, obj), a), j2a.a.c());
                        zX = dVarF.x(q6cVarA) | dVarF.x(q6cVarD);
                        objR = dVarF.R();
                        if (zX) {
                            objR = new Function1() { // from class: com.google.android.g2a
                                public final Object invoke(Object obj2) {
                                    return i2a.d(q6cVarA, q6cVarD, (DrawScope) obj2);
                                }
                            };
                            dVarF.L(objR);
                        } else {
                            objR = new Function1() { // from class: com.google.android.g2a
                                public final Object invoke(Object obj2) {
                                    return i2a.d(q6cVarA, q6cVarD, (DrawScope) obj2);
                                }
                            };
                            dVarF.L(objR);
                        }
                        v51.b(bVarM2, (Function1) objR, dVarF, 0);
                        if (e.k()) {
                            e.n();
                        }
                        r48Var2 = r48Var;
                        e2aVar2 = e2aVar3;
                        bVar3 = bVar5;
                    } else {
                        dVarF.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        z5 = z3;
                        e2aVar2 = e2aVarA;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.h2a
                            public final Object invoke(Object obj2, Object obj3) {
                                return i2a.e(z, function0, bVar3, z5, e2aVar2, r48Var2, i, i2, (d) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i3 |= 196608;
                if ((74899 & i3) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dVarF.g(z4, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            e2aVarA = f2a.a.a(dVarF, 6);
                        }
                        if (i6 != 0) {
                            i8 = i3;
                            z6 = z3;
                            e2aVar3 = e2aVarA;
                            r48Var = null;
                        } else {
                            i8 = i3;
                            z6 = z3;
                            e2aVar3 = e2aVarA;
                        }
                    } else {
                        if (i9 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            e2aVarA = f2a.a.a(dVarF, 6);
                        }
                        if (i6 != 0) {
                            i8 = i3;
                            z6 = z3;
                            e2aVar3 = e2aVarA;
                            r48Var = null;
                        } else {
                            i8 = i3;
                            z6 = z3;
                            e2aVar3 = e2aVarA;
                        }
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(408580840, i8, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:80)");
                    }
                    if (z) {
                        fI = ff3.i(b / 2);
                    } else {
                        fI = ff3.i(0);
                    }
                    q6cVarD = AnimateAsStateKt.d(fI, d08.b(MotionSchemeKeyTokens.FastSpatial, dVarF, 6), null, null, dVarF, 0, 12);
                    q6cVarA = e2aVar3.a(z6, z, dVarF, ((i8 >> 6) & 896) | ((i8 >> 9) & 14) | ((i8 << 3) & 112));
                    if (function0 != null) {
                        b bVar8 = bVar4;
                        z5 = z6;
                        bVar5 = bVar8;
                        obj = null;
                        bVarA = hdb.a(b.INSTANCE, z, r48Var, xoa.e(false, ff3.i(j2a.a.e() / 2), 0L, 4, null), z5, hpa.j(hpa.INSTANCE.f()), function0);
                    } else {
                        obj = null;
                        bVar5 = bVar4;
                        z5 = z6;
                        bVarA = b.INSTANCE;
                    }
                    if (function0 != null) {
                        bVarH = InteractiveComponentSizeKt.h(b.INSTANCE);
                    } else {
                        bVarH = b.INSTANCE;
                    }
                    b bVarM3 = SizeKt.m(nx8.n(SizeKt.E(bVar5.then(bVarH).then(bVarA), tc.INSTANCE.e(), false, 2, obj), a), j2a.a.c());
                    zX = dVarF.x(q6cVarA) | dVarF.x(q6cVarD);
                    objR = dVarF.R();
                    if (zX) {
                        objR = new Function1() { // from class: com.google.android.g2a
                            public final Object invoke(Object obj2) {
                                return i2a.d(q6cVarA, q6cVarD, (DrawScope) obj2);
                            }
                        };
                        dVarF.L(objR);
                    } else {
                        objR = new Function1() { // from class: com.google.android.g2a
                            public final Object invoke(Object obj2) {
                                return i2a.d(q6cVarA, q6cVarD, (DrawScope) obj2);
                            }
                        };
                        dVarF.L(objR);
                    }
                    v51.b(bVarM3, (Function1) objR, dVarF, 0);
                    if (e.k()) {
                        e.n();
                    }
                    r48Var2 = r48Var;
                    e2aVar2 = e2aVar3;
                    bVar3 = bVar5;
                } else {
                    dVarF.q();
                    r48Var2 = r48Var;
                    bVar3 = bVar2;
                    z5 = z3;
                    e2aVar2 = e2aVarA;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.h2a
                        public final Object invoke(Object obj2, Object obj3) {
                            return i2a.e(z, function0, bVar3, z5, e2aVar2, r48Var2, i, i2, (d) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i3 |= 3072;
            z3 = z2;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    e2aVarA = e2aVar;
                    if (dVarF.x(e2aVarA)) {
                    }
                    i3 |= i10;
                } else {
                    e2aVarA = e2aVar;
                }
                i3 |= i10;
            } else {
                e2aVarA = e2aVar;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    if (dVarF.x(r48Var)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((74899 & i3) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dVarF.g(z4, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            e2aVarA = f2a.a.a(dVarF, 6);
                        }
                        if (i6 != 0) {
                            i8 = i3;
                            z6 = z3;
                            e2aVar3 = e2aVarA;
                            r48Var = null;
                        } else {
                            i8 = i3;
                            z6 = z3;
                            e2aVar3 = e2aVarA;
                        }
                    } else {
                        if (i9 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            e2aVarA = f2a.a.a(dVarF, 6);
                        }
                        if (i6 != 0) {
                            i8 = i3;
                            z6 = z3;
                            e2aVar3 = e2aVarA;
                            r48Var = null;
                        } else {
                            i8 = i3;
                            z6 = z3;
                            e2aVar3 = e2aVarA;
                        }
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(408580840, i8, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:80)");
                    }
                    if (z) {
                        fI = ff3.i(b / 2);
                    } else {
                        fI = ff3.i(0);
                    }
                    q6cVarD = AnimateAsStateKt.d(fI, d08.b(MotionSchemeKeyTokens.FastSpatial, dVarF, 6), null, null, dVarF, 0, 12);
                    q6cVarA = e2aVar3.a(z6, z, dVarF, ((i8 >> 6) & 896) | ((i8 >> 9) & 14) | ((i8 << 3) & 112));
                    if (function0 != null) {
                        b bVar9 = bVar4;
                        z5 = z6;
                        bVar5 = bVar9;
                        obj = null;
                        bVarA = hdb.a(b.INSTANCE, z, r48Var, xoa.e(false, ff3.i(j2a.a.e() / 2), 0L, 4, null), z5, hpa.j(hpa.INSTANCE.f()), function0);
                    } else {
                        obj = null;
                        bVar5 = bVar4;
                        z5 = z6;
                        bVarA = b.INSTANCE;
                    }
                    if (function0 != null) {
                        bVarH = InteractiveComponentSizeKt.h(b.INSTANCE);
                    } else {
                        bVarH = b.INSTANCE;
                    }
                    b bVarM4 = SizeKt.m(nx8.n(SizeKt.E(bVar5.then(bVarH).then(bVarA), tc.INSTANCE.e(), false, 2, obj), a), j2a.a.c());
                    zX = dVarF.x(q6cVarA) | dVarF.x(q6cVarD);
                    objR = dVarF.R();
                    if (zX) {
                        objR = new Function1() { // from class: com.google.android.g2a
                            public final Object invoke(Object obj2) {
                                return i2a.d(q6cVarA, q6cVarD, (DrawScope) obj2);
                            }
                        };
                        dVarF.L(objR);
                    } else {
                        objR = new Function1() { // from class: com.google.android.g2a
                            public final Object invoke(Object obj2) {
                                return i2a.d(q6cVarA, q6cVarD, (DrawScope) obj2);
                            }
                        };
                        dVarF.L(objR);
                    }
                    v51.b(bVarM4, (Function1) objR, dVarF, 0);
                    if (e.k()) {
                        e.n();
                    }
                    r48Var2 = r48Var;
                    e2aVar2 = e2aVar3;
                    bVar3 = bVar5;
                } else {
                    dVarF.q();
                    r48Var2 = r48Var;
                    bVar3 = bVar2;
                    z5 = z3;
                    e2aVar2 = e2aVarA;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.h2a
                        public final Object invoke(Object obj2, Object obj3) {
                            return i2a.e(z, function0, bVar3, z5, e2aVar2, r48Var2, i, i2, (d) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i3 |= 196608;
            if ((74899 & i3) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dVarF.g(z4, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        e2aVarA = f2a.a.a(dVarF, 6);
                    }
                    if (i6 != 0) {
                        i8 = i3;
                        z6 = z3;
                        e2aVar3 = e2aVarA;
                        r48Var = null;
                    } else {
                        i8 = i3;
                        z6 = z3;
                        e2aVar3 = e2aVarA;
                    }
                } else {
                    if (i9 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        e2aVarA = f2a.a.a(dVarF, 6);
                    }
                    if (i6 != 0) {
                        i8 = i3;
                        z6 = z3;
                        e2aVar3 = e2aVarA;
                        r48Var = null;
                    } else {
                        i8 = i3;
                        z6 = z3;
                        e2aVar3 = e2aVarA;
                    }
                }
                dVarF.M();
                if (e.k()) {
                    e.o(408580840, i8, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:80)");
                }
                if (z) {
                    fI = ff3.i(b / 2);
                } else {
                    fI = ff3.i(0);
                }
                q6cVarD = AnimateAsStateKt.d(fI, d08.b(MotionSchemeKeyTokens.FastSpatial, dVarF, 6), null, null, dVarF, 0, 12);
                q6cVarA = e2aVar3.a(z6, z, dVarF, ((i8 >> 6) & 896) | ((i8 >> 9) & 14) | ((i8 << 3) & 112));
                if (function0 != null) {
                    b bVar10 = bVar4;
                    z5 = z6;
                    bVar5 = bVar10;
                    obj = null;
                    bVarA = hdb.a(b.INSTANCE, z, r48Var, xoa.e(false, ff3.i(j2a.a.e() / 2), 0L, 4, null), z5, hpa.j(hpa.INSTANCE.f()), function0);
                } else {
                    obj = null;
                    bVar5 = bVar4;
                    z5 = z6;
                    bVarA = b.INSTANCE;
                }
                if (function0 != null) {
                    bVarH = InteractiveComponentSizeKt.h(b.INSTANCE);
                } else {
                    bVarH = b.INSTANCE;
                }
                b bVarM5 = SizeKt.m(nx8.n(SizeKt.E(bVar5.then(bVarH).then(bVarA), tc.INSTANCE.e(), false, 2, obj), a), j2a.a.c());
                zX = dVarF.x(q6cVarA) | dVarF.x(q6cVarD);
                objR = dVarF.R();
                if (zX) {
                    objR = new Function1() { // from class: com.google.android.g2a
                        public final Object invoke(Object obj2) {
                            return i2a.d(q6cVarA, q6cVarD, (DrawScope) obj2);
                        }
                    };
                    dVarF.L(objR);
                } else {
                    objR = new Function1() { // from class: com.google.android.g2a
                        public final Object invoke(Object obj2) {
                            return i2a.d(q6cVarA, q6cVarD, (DrawScope) obj2);
                        }
                    };
                    dVarF.L(objR);
                }
                v51.b(bVarM5, (Function1) objR, dVarF, 0);
                if (e.k()) {
                    e.n();
                }
                r48Var2 = r48Var;
                e2aVar2 = e2aVar3;
                bVar3 = bVar5;
            } else {
                dVarF.q();
                r48Var2 = r48Var;
                bVar3 = bVar2;
                z5 = z3;
                e2aVar2 = e2aVarA;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.h2a
                    public final Object invoke(Object obj2, Object obj3) {
                        return i2a.e(z, function0, bVar3, z5, e2aVar2, r48Var2, i, i2, (d) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        bVar2 = bVar;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z3 = z2;
                if (dVarF.A(z3)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    e2aVarA = e2aVar;
                    if (dVarF.x(e2aVarA)) {
                    }
                    i3 |= i10;
                } else {
                    e2aVarA = e2aVar;
                }
                i3 |= i10;
            } else {
                e2aVarA = e2aVar;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    if (dVarF.x(r48Var)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((74899 & i3) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dVarF.g(z4, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            e2aVarA = f2a.a.a(dVarF, 6);
                        }
                        if (i6 != 0) {
                            i8 = i3;
                            z6 = z3;
                            e2aVar3 = e2aVarA;
                            r48Var = null;
                        } else {
                            i8 = i3;
                            z6 = z3;
                            e2aVar3 = e2aVarA;
                        }
                    } else {
                        if (i9 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            e2aVarA = f2a.a.a(dVarF, 6);
                        }
                        if (i6 != 0) {
                            i8 = i3;
                            z6 = z3;
                            e2aVar3 = e2aVarA;
                            r48Var = null;
                        } else {
                            i8 = i3;
                            z6 = z3;
                            e2aVar3 = e2aVarA;
                        }
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(408580840, i8, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:80)");
                    }
                    if (z) {
                        fI = ff3.i(b / 2);
                    } else {
                        fI = ff3.i(0);
                    }
                    q6cVarD = AnimateAsStateKt.d(fI, d08.b(MotionSchemeKeyTokens.FastSpatial, dVarF, 6), null, null, dVarF, 0, 12);
                    q6cVarA = e2aVar3.a(z6, z, dVarF, ((i8 >> 6) & 896) | ((i8 >> 9) & 14) | ((i8 << 3) & 112));
                    if (function0 != null) {
                        b bVar11 = bVar4;
                        z5 = z6;
                        bVar5 = bVar11;
                        obj = null;
                        bVarA = hdb.a(b.INSTANCE, z, r48Var, xoa.e(false, ff3.i(j2a.a.e() / 2), 0L, 4, null), z5, hpa.j(hpa.INSTANCE.f()), function0);
                    } else {
                        obj = null;
                        bVar5 = bVar4;
                        z5 = z6;
                        bVarA = b.INSTANCE;
                    }
                    if (function0 != null) {
                        bVarH = InteractiveComponentSizeKt.h(b.INSTANCE);
                    } else {
                        bVarH = b.INSTANCE;
                    }
                    b bVarM6 = SizeKt.m(nx8.n(SizeKt.E(bVar5.then(bVarH).then(bVarA), tc.INSTANCE.e(), false, 2, obj), a), j2a.a.c());
                    zX = dVarF.x(q6cVarA) | dVarF.x(q6cVarD);
                    objR = dVarF.R();
                    if (zX) {
                        objR = new Function1() { // from class: com.google.android.g2a
                            public final Object invoke(Object obj2) {
                                return i2a.d(q6cVarA, q6cVarD, (DrawScope) obj2);
                            }
                        };
                        dVarF.L(objR);
                    } else {
                        objR = new Function1() { // from class: com.google.android.g2a
                            public final Object invoke(Object obj2) {
                                return i2a.d(q6cVarA, q6cVarD, (DrawScope) obj2);
                            }
                        };
                        dVarF.L(objR);
                    }
                    v51.b(bVarM6, (Function1) objR, dVarF, 0);
                    if (e.k()) {
                        e.n();
                    }
                    r48Var2 = r48Var;
                    e2aVar2 = e2aVar3;
                    bVar3 = bVar5;
                } else {
                    dVarF.q();
                    r48Var2 = r48Var;
                    bVar3 = bVar2;
                    z5 = z3;
                    e2aVar2 = e2aVarA;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.h2a
                        public final Object invoke(Object obj2, Object obj3) {
                            return i2a.e(z, function0, bVar3, z5, e2aVar2, r48Var2, i, i2, (d) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i3 |= 196608;
            if ((74899 & i3) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dVarF.g(z4, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        e2aVarA = f2a.a.a(dVarF, 6);
                    }
                    if (i6 != 0) {
                        i8 = i3;
                        z6 = z3;
                        e2aVar3 = e2aVarA;
                        r48Var = null;
                    } else {
                        i8 = i3;
                        z6 = z3;
                        e2aVar3 = e2aVarA;
                    }
                } else {
                    if (i9 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        e2aVarA = f2a.a.a(dVarF, 6);
                    }
                    if (i6 != 0) {
                        i8 = i3;
                        z6 = z3;
                        e2aVar3 = e2aVarA;
                        r48Var = null;
                    } else {
                        i8 = i3;
                        z6 = z3;
                        e2aVar3 = e2aVarA;
                    }
                }
                dVarF.M();
                if (e.k()) {
                    e.o(408580840, i8, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:80)");
                }
                if (z) {
                    fI = ff3.i(b / 2);
                } else {
                    fI = ff3.i(0);
                }
                q6cVarD = AnimateAsStateKt.d(fI, d08.b(MotionSchemeKeyTokens.FastSpatial, dVarF, 6), null, null, dVarF, 0, 12);
                q6cVarA = e2aVar3.a(z6, z, dVarF, ((i8 >> 6) & 896) | ((i8 >> 9) & 14) | ((i8 << 3) & 112));
                if (function0 != null) {
                    b bVar12 = bVar4;
                    z5 = z6;
                    bVar5 = bVar12;
                    obj = null;
                    bVarA = hdb.a(b.INSTANCE, z, r48Var, xoa.e(false, ff3.i(j2a.a.e() / 2), 0L, 4, null), z5, hpa.j(hpa.INSTANCE.f()), function0);
                } else {
                    obj = null;
                    bVar5 = bVar4;
                    z5 = z6;
                    bVarA = b.INSTANCE;
                }
                if (function0 != null) {
                    bVarH = InteractiveComponentSizeKt.h(b.INSTANCE);
                } else {
                    bVarH = b.INSTANCE;
                }
                b bVarM7 = SizeKt.m(nx8.n(SizeKt.E(bVar5.then(bVarH).then(bVarA), tc.INSTANCE.e(), false, 2, obj), a), j2a.a.c());
                zX = dVarF.x(q6cVarA) | dVarF.x(q6cVarD);
                objR = dVarF.R();
                if (zX) {
                    objR = new Function1() { // from class: com.google.android.g2a
                        public final Object invoke(Object obj2) {
                            return i2a.d(q6cVarA, q6cVarD, (DrawScope) obj2);
                        }
                    };
                    dVarF.L(objR);
                } else {
                    objR = new Function1() { // from class: com.google.android.g2a
                        public final Object invoke(Object obj2) {
                            return i2a.d(q6cVarA, q6cVarD, (DrawScope) obj2);
                        }
                    };
                    dVarF.L(objR);
                }
                v51.b(bVarM7, (Function1) objR, dVarF, 0);
                if (e.k()) {
                    e.n();
                }
                r48Var2 = r48Var;
                e2aVar2 = e2aVar3;
                bVar3 = bVar5;
            } else {
                dVarF.q();
                r48Var2 = r48Var;
                bVar3 = bVar2;
                z5 = z3;
                e2aVar2 = e2aVarA;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.h2a
                    public final Object invoke(Object obj2, Object obj3) {
                        return i2a.e(z, function0, bVar3, z5, e2aVar2, r48Var2, i, i2, (d) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i3 |= 3072;
        z3 = z2;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                e2aVarA = e2aVar;
                if (dVarF.x(e2aVarA)) {
                }
                i3 |= i10;
            } else {
                e2aVarA = e2aVar;
            }
            i3 |= i10;
        } else {
            e2aVarA = e2aVar;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                if (dVarF.x(r48Var)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((74899 & i3) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dVarF.g(z4, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        e2aVarA = f2a.a.a(dVarF, 6);
                    }
                    if (i6 != 0) {
                        i8 = i3;
                        z6 = z3;
                        e2aVar3 = e2aVarA;
                        r48Var = null;
                    } else {
                        i8 = i3;
                        z6 = z3;
                        e2aVar3 = e2aVarA;
                    }
                } else {
                    if (i9 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        e2aVarA = f2a.a.a(dVarF, 6);
                    }
                    if (i6 != 0) {
                        i8 = i3;
                        z6 = z3;
                        e2aVar3 = e2aVarA;
                        r48Var = null;
                    } else {
                        i8 = i3;
                        z6 = z3;
                        e2aVar3 = e2aVarA;
                    }
                }
                dVarF.M();
                if (e.k()) {
                    e.o(408580840, i8, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:80)");
                }
                if (z) {
                    fI = ff3.i(b / 2);
                } else {
                    fI = ff3.i(0);
                }
                q6cVarD = AnimateAsStateKt.d(fI, d08.b(MotionSchemeKeyTokens.FastSpatial, dVarF, 6), null, null, dVarF, 0, 12);
                q6cVarA = e2aVar3.a(z6, z, dVarF, ((i8 >> 6) & 896) | ((i8 >> 9) & 14) | ((i8 << 3) & 112));
                if (function0 != null) {
                    b bVar13 = bVar4;
                    z5 = z6;
                    bVar5 = bVar13;
                    obj = null;
                    bVarA = hdb.a(b.INSTANCE, z, r48Var, xoa.e(false, ff3.i(j2a.a.e() / 2), 0L, 4, null), z5, hpa.j(hpa.INSTANCE.f()), function0);
                } else {
                    obj = null;
                    bVar5 = bVar4;
                    z5 = z6;
                    bVarA = b.INSTANCE;
                }
                if (function0 != null) {
                    bVarH = InteractiveComponentSizeKt.h(b.INSTANCE);
                } else {
                    bVarH = b.INSTANCE;
                }
                b bVarM8 = SizeKt.m(nx8.n(SizeKt.E(bVar5.then(bVarH).then(bVarA), tc.INSTANCE.e(), false, 2, obj), a), j2a.a.c());
                zX = dVarF.x(q6cVarA) | dVarF.x(q6cVarD);
                objR = dVarF.R();
                if (zX) {
                    objR = new Function1() { // from class: com.google.android.g2a
                        public final Object invoke(Object obj2) {
                            return i2a.d(q6cVarA, q6cVarD, (DrawScope) obj2);
                        }
                    };
                    dVarF.L(objR);
                } else {
                    objR = new Function1() { // from class: com.google.android.g2a
                        public final Object invoke(Object obj2) {
                            return i2a.d(q6cVarA, q6cVarD, (DrawScope) obj2);
                        }
                    };
                    dVarF.L(objR);
                }
                v51.b(bVarM8, (Function1) objR, dVarF, 0);
                if (e.k()) {
                    e.n();
                }
                r48Var2 = r48Var;
                e2aVar2 = e2aVar3;
                bVar3 = bVar5;
            } else {
                dVarF.q();
                r48Var2 = r48Var;
                bVar3 = bVar2;
                z5 = z3;
                e2aVar2 = e2aVarA;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.h2a
                    public final Object invoke(Object obj2, Object obj3) {
                        return i2a.e(z, function0, bVar3, z5, e2aVar2, r48Var2, i, i2, (d) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i3 |= 196608;
        if ((74899 & i3) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (dVarF.g(z4, i3 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    e2aVarA = f2a.a.a(dVarF, 6);
                }
                if (i6 != 0) {
                    i8 = i3;
                    z6 = z3;
                    e2aVar3 = e2aVarA;
                    r48Var = null;
                } else {
                    i8 = i3;
                    z6 = z3;
                    e2aVar3 = e2aVarA;
                }
            } else {
                if (i9 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    e2aVarA = f2a.a.a(dVarF, 6);
                }
                if (i6 != 0) {
                    i8 = i3;
                    z6 = z3;
                    e2aVar3 = e2aVarA;
                    r48Var = null;
                } else {
                    i8 = i3;
                    z6 = z3;
                    e2aVar3 = e2aVarA;
                }
            }
            dVarF.M();
            if (e.k()) {
                e.o(408580840, i8, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:80)");
            }
            if (z) {
                fI = ff3.i(b / 2);
            } else {
                fI = ff3.i(0);
            }
            q6cVarD = AnimateAsStateKt.d(fI, d08.b(MotionSchemeKeyTokens.FastSpatial, dVarF, 6), null, null, dVarF, 0, 12);
            q6cVarA = e2aVar3.a(z6, z, dVarF, ((i8 >> 6) & 896) | ((i8 >> 9) & 14) | ((i8 << 3) & 112));
            if (function0 != null) {
                b bVar14 = bVar4;
                z5 = z6;
                bVar5 = bVar14;
                obj = null;
                bVarA = hdb.a(b.INSTANCE, z, r48Var, xoa.e(false, ff3.i(j2a.a.e() / 2), 0L, 4, null), z5, hpa.j(hpa.INSTANCE.f()), function0);
            } else {
                obj = null;
                bVar5 = bVar4;
                z5 = z6;
                bVarA = b.INSTANCE;
            }
            if (function0 != null) {
                bVarH = InteractiveComponentSizeKt.h(b.INSTANCE);
            } else {
                bVarH = b.INSTANCE;
            }
            b bVarM9 = SizeKt.m(nx8.n(SizeKt.E(bVar5.then(bVarH).then(bVarA), tc.INSTANCE.e(), false, 2, obj), a), j2a.a.c());
            zX = dVarF.x(q6cVarA) | dVarF.x(q6cVarD);
            objR = dVarF.R();
            if (zX) {
                objR = new Function1() { // from class: com.google.android.g2a
                    public final Object invoke(Object obj2) {
                        return i2a.d(q6cVarA, q6cVarD, (DrawScope) obj2);
                    }
                };
                dVarF.L(objR);
            } else {
                objR = new Function1() { // from class: com.google.android.g2a
                    public final Object invoke(Object obj2) {
                        return i2a.d(q6cVarA, q6cVarD, (DrawScope) obj2);
                    }
                };
                dVarF.L(objR);
            }
            v51.b(bVarM9, (Function1) objR, dVarF, 0);
            if (e.k()) {
                e.n();
            }
            r48Var2 = r48Var;
            e2aVar2 = e2aVar3;
            bVar3 = bVar5;
        } else {
            dVarF.q();
            r48Var2 = r48Var;
            bVar3 = bVar2;
            z5 = z3;
            e2aVar2 = e2aVarA;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.h2a
                public final Object invoke(Object obj2, Object obj3) {
                    return i2a.e(z, function0, bVar3, z5, e2aVar2, r48Var2, i, i2, (d) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(q6c q6cVar, q6c q6cVar2, DrawScope drawScope) {
        float fX2 = drawScope.x2(c);
        float f = 2;
        float f2 = fX2 / f;
        DrawScope.i1(drawScope, ((ei1) q6cVar.getValue()).getValue(), drawScope.x2(ff3.i(j2a.a.c() / f)) - f2, 0L, 0.0f, new Stroke(fX2, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
        if (ff3.h(((ff3) q6cVar2.getValue()).getValue(), ff3.i(0)) > 0) {
            DrawScope.i1(drawScope, ((ei1) q6cVar.getValue()).getValue(), drawScope.x2(((ff3) q6cVar2.getValue()).getValue()) - f2, 0L, 0.0f, c.b, null, 0, 108, null);
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(boolean z, Function0 function0, b bVar, boolean z2, e2a e2aVar, r48 r48Var, int i, int i2, d dVar, int i3) {
        c(z, function0, bVar, z2, e2aVar, r48Var, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }
}
