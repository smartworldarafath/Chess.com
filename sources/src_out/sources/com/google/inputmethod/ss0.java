package com.google.inputmethod;

import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p001foundation.layout.g1;
import androidx.compose.p001foundation.layout.i1;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p002material3.m1;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.b;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u001a\u0010\u001c\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u001a\u0010\u001f\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\"\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010#R\u0011\u0010&\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0011\u0010*\u001a\u00020'8G¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/google/android/ss0;", "", "<init>", "()V", "Landroidx/compose/ui/b;", "modifier", "Lcom/google/android/ff3;", "width", "height", "Lcom/google/android/xkb;", "shape", "Lcom/google/android/ei1;", "color", "", "c", "(Landroidx/compose/ui/b;FFLcom/google/android/xkb;JLandroidx/compose/runtime/d;II)V", "b", "F", "g", "()F", "Elevation", "getSheetPeekHeight-D9Ej5fM", "SheetPeekHeight", "d", "k", "SheetMaxWidth", "e", "i", "PositionalThreshold", "f", "l", "VelocityThreshold", "h", "(Landroidx/compose/runtime/d;I)Lcom/google/android/xkb;", "ExpandedShape", "(Landroidx/compose/runtime/d;I)J", "ContainerColor", "j", "ScrimColor", "Landroidx/compose/foundation/layout/g1;", "m", "(Landroidx/compose/runtime/d;I)Landroidx/compose/foundation/layout/g1;", "windowInsets", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ss0 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final float SheetPeekHeight;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final float PositionalThreshold;
    public static final ss0 a = new ss0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final float Elevation = kmb.a.f();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final float SheetMaxWidth = ff3.i(640);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final float VelocityThreshold = ff3.i(125);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements Function2<d, Integer, Unit> {
        final /* synthetic */ float a;
        final /* synthetic */ float b;

        a(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        public final void a(d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(-1039573072, i, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle.<anonymous> (SheetDefaults.kt:425)");
            }
            j.b(SizeKt.v(b.INSTANCE, this.a, this.b), dVar, 0);
            if (e.k()) {
                e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    static {
        float f = 56;
        SheetPeekHeight = ff3.i(f);
        PositionalThreshold = ff3.i(f);
    }

    private ss0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(String str, nfb nfbVar) {
        SemanticsPropertiesKt.b0(nfbVar, str);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(ss0 ss0Var, b bVar, float f, float f2, xkb xkbVar, long j, int i, int i2, d dVar, int i3) {
        ss0Var.c(bVar, f, f2, xkbVar, j, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0181  */
    /* JADX WARN: Code duplicated, block: B:105:0x018f  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:91:0x010e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0135  */
    /* JADX WARN: Code duplicated, block: B:96:0x013d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0179  */
    public final void c(b bVar, float f, float f2, xkb xkbVar, long j, d dVar, final int i, final int i2) {
        b bVar2;
        int i3;
        float fE;
        int i4;
        float fD;
        int i5;
        xkb extraLarge;
        long jL;
        boolean z;
        d dVar2;
        final b bVar3;
        final float f3;
        final float f4;
        final xkb xkbVar2;
        final long j2;
        s6b s6bVarH;
        final String strB;
        boolean zX;
        Object objR;
        d dVarF = dVar.F(-1364277227);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            bVar2 = bVar;
        } else if ((i & 6) == 0) {
            bVar2 = bVar;
            i3 = (dVarF.x(bVar2) ? 4 : 2) | i;
        } else {
            bVar2 = bVar;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                fE = f;
                i3 |= dVarF.B(fE) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    fD = f2;
                    if (dVarF.B(fD)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        extraLarge = xkbVar;
                        int i8 = dVarF.x(extraLarge) ? 2048 : 1024;
                        i3 |= i8;
                    } else {
                        extraLarge = xkbVar;
                    }
                    i3 |= i8;
                } else {
                    extraLarge = xkbVar;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        jL = j;
                        int i9 = dVarF.D(jL) ? 16384 : 8192;
                        i3 |= i9;
                    } else {
                        jL = j;
                    }
                    i3 |= i9;
                } else {
                    jL = j;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0 || dVarF.t()) {
                        if (i6 != 0) {
                            bVar3 = b.INSTANCE;
                        } else {
                            bVar3 = bVar2;
                        }
                        if (i7 != 0) {
                            fE = kmb.a.e();
                        }
                        if (i4 != 0) {
                            fD = kmb.a.d();
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            extraLarge = kh7.a.d(dVarF, 6).getExtraLarge();
                        }
                        if ((i2 & 16) != 0) {
                            jL = bj1.l(kmb.a.c(), dVarF, 6);
                            i3 &= -57345;
                        }
                    } else {
                        dVarF.q();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        bVar3 = bVar2;
                    }
                    float f5 = fD;
                    dVarF.M();
                    if (e.k()) {
                        e.o(-1364277227, i3, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:415)");
                    }
                    rbc.Companion companion = rbc.INSTANCE;
                    strB = vbc.b(rbc.a(wz9.c), dVarF, 0);
                    b bVarP = nx8.p(bVar3, 0.0f, m1.a, 1, null);
                    zX = dVarF.x(strB);
                    objR = dVarF.R();
                    if (zX || objR == d.INSTANCE.a()) {
                        objR = new Function1() { // from class: com.google.android.qs0
                            public final Object invoke(Object obj) {
                                return ss0.d(strB, (nfb) obj);
                            }
                        };
                        dVarF.L(objR);
                    }
                    int i10 = i3 >> 6;
                    dVar2 = dVarF;
                    afc.c(afb.d(bVarP, false, (Function1) objR, 1, null), extraLarge, jL, 0L, 0.0f, 0.0f, null, ko1.e(-1039573072, true, new a(fE, f5), dVarF, 54), dVar2, (i10 & 112) | 12582912 | (i10 & 896), 120);
                    if (e.k()) {
                        e.n();
                    }
                    f3 = f5;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar3 = bVar2;
                    f3 = fD;
                }
                f4 = fE;
                xkbVar2 = extraLarge;
                j2 = jL;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.rs0
                        public final Object invoke(Object obj, Object obj2) {
                            return ss0.e(this.a, bVar3, f4, f3, xkbVar2, j2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 384;
            fD = f2;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    extraLarge = xkbVar;
                    if (dVarF.x(extraLarge)) {
                    }
                    i3 |= i8;
                } else {
                    extraLarge = xkbVar;
                }
                i3 |= i8;
            } else {
                extraLarge = xkbVar;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    jL = j;
                    if (dVarF.D(jL)) {
                    }
                    i3 |= i9;
                } else {
                    jL = j;
                }
                i3 |= i9;
            } else {
                jL = j;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i7 != 0) {
                        fE = kmb.a.e();
                    }
                    if (i4 != 0) {
                        fD = kmb.a.d();
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        extraLarge = kh7.a.d(dVarF, 6).getExtraLarge();
                    }
                    if ((i2 & 16) != 0) {
                        jL = bj1.l(kmb.a.c(), dVarF, 6);
                        i3 &= -57345;
                    }
                } else {
                    if (i6 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i7 != 0) {
                        fE = kmb.a.e();
                    }
                    if (i4 != 0) {
                        fD = kmb.a.d();
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        extraLarge = kh7.a.d(dVarF, 6).getExtraLarge();
                    }
                    if ((i2 & 16) != 0) {
                        jL = bj1.l(kmb.a.c(), dVarF, 6);
                        i3 &= -57345;
                    }
                }
                float f6 = fD;
                dVarF.M();
                if (e.k()) {
                    e.o(-1364277227, i3, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:415)");
                }
                rbc.Companion companion2 = rbc.INSTANCE;
                strB = vbc.b(rbc.a(wz9.c), dVarF, 0);
                b bVarP2 = nx8.p(bVar3, 0.0f, m1.a, 1, null);
                zX = dVarF.x(strB);
                objR = dVarF.R();
                if (zX) {
                    objR = new Function1() { // from class: com.google.android.qs0
                        public final Object invoke(Object obj) {
                            return ss0.d(strB, (nfb) obj);
                        }
                    };
                    dVarF.L(objR);
                } else {
                    objR = new Function1() { // from class: com.google.android.qs0
                        public final Object invoke(Object obj) {
                            return ss0.d(strB, (nfb) obj);
                        }
                    };
                    dVarF.L(objR);
                }
                int i11 = i3 >> 6;
                dVar2 = dVarF;
                afc.c(afb.d(bVarP2, false, (Function1) objR, 1, null), extraLarge, jL, 0L, 0.0f, 0.0f, null, ko1.e(-1039573072, true, new a(fE, f6), dVarF, 54), dVar2, (i11 & 112) | 12582912 | (i11 & 896), 120);
                if (e.k()) {
                    e.n();
                }
                f3 = f6;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar3 = bVar2;
                f3 = fD;
            }
            f4 = fE;
            xkbVar2 = extraLarge;
            j2 = jL;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.rs0
                    public final Object invoke(Object obj, Object obj2) {
                        return ss0.e(this.a, bVar3, f4, f3, xkbVar2, j2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 48;
        fE = f;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                fD = f2;
                if (dVarF.B(fD)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    extraLarge = xkbVar;
                    if (dVarF.x(extraLarge)) {
                    }
                    i3 |= i8;
                } else {
                    extraLarge = xkbVar;
                }
                i3 |= i8;
            } else {
                extraLarge = xkbVar;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    jL = j;
                    if (dVarF.D(jL)) {
                    }
                    i3 |= i9;
                } else {
                    jL = j;
                }
                i3 |= i9;
            } else {
                jL = j;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i7 != 0) {
                        fE = kmb.a.e();
                    }
                    if (i4 != 0) {
                        fD = kmb.a.d();
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        extraLarge = kh7.a.d(dVarF, 6).getExtraLarge();
                    }
                    if ((i2 & 16) != 0) {
                        jL = bj1.l(kmb.a.c(), dVarF, 6);
                        i3 &= -57345;
                    }
                } else {
                    if (i6 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i7 != 0) {
                        fE = kmb.a.e();
                    }
                    if (i4 != 0) {
                        fD = kmb.a.d();
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        extraLarge = kh7.a.d(dVarF, 6).getExtraLarge();
                    }
                    if ((i2 & 16) != 0) {
                        jL = bj1.l(kmb.a.c(), dVarF, 6);
                        i3 &= -57345;
                    }
                }
                float f7 = fD;
                dVarF.M();
                if (e.k()) {
                    e.o(-1364277227, i3, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:415)");
                }
                rbc.Companion companion3 = rbc.INSTANCE;
                strB = vbc.b(rbc.a(wz9.c), dVarF, 0);
                b bVarP3 = nx8.p(bVar3, 0.0f, m1.a, 1, null);
                zX = dVarF.x(strB);
                objR = dVarF.R();
                if (zX) {
                    objR = new Function1() { // from class: com.google.android.qs0
                        public final Object invoke(Object obj) {
                            return ss0.d(strB, (nfb) obj);
                        }
                    };
                    dVarF.L(objR);
                } else {
                    objR = new Function1() { // from class: com.google.android.qs0
                        public final Object invoke(Object obj) {
                            return ss0.d(strB, (nfb) obj);
                        }
                    };
                    dVarF.L(objR);
                }
                int i12 = i3 >> 6;
                dVar2 = dVarF;
                afc.c(afb.d(bVarP3, false, (Function1) objR, 1, null), extraLarge, jL, 0L, 0.0f, 0.0f, null, ko1.e(-1039573072, true, new a(fE, f7), dVarF, 54), dVar2, (i12 & 112) | 12582912 | (i12 & 896), 120);
                if (e.k()) {
                    e.n();
                }
                f3 = f7;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar3 = bVar2;
                f3 = fD;
            }
            f4 = fE;
            xkbVar2 = extraLarge;
            j2 = jL;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.rs0
                    public final Object invoke(Object obj, Object obj2) {
                        return ss0.e(this.a, bVar3, f4, f3, xkbVar2, j2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        fD = f2;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                extraLarge = xkbVar;
                if (dVarF.x(extraLarge)) {
                }
                i3 |= i8;
            } else {
                extraLarge = xkbVar;
            }
            i3 |= i8;
        } else {
            extraLarge = xkbVar;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                jL = j;
                if (dVarF.D(jL)) {
                }
                i3 |= i9;
            } else {
                jL = j;
            }
            i3 |= i9;
        } else {
            jL = j;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (dVarF.g(z, i3 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    bVar3 = b.INSTANCE;
                } else {
                    bVar3 = bVar2;
                }
                if (i7 != 0) {
                    fE = kmb.a.e();
                }
                if (i4 != 0) {
                    fD = kmb.a.d();
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    extraLarge = kh7.a.d(dVarF, 6).getExtraLarge();
                }
                if ((i2 & 16) != 0) {
                    jL = bj1.l(kmb.a.c(), dVarF, 6);
                    i3 &= -57345;
                }
            } else {
                if (i6 != 0) {
                    bVar3 = b.INSTANCE;
                } else {
                    bVar3 = bVar2;
                }
                if (i7 != 0) {
                    fE = kmb.a.e();
                }
                if (i4 != 0) {
                    fD = kmb.a.d();
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    extraLarge = kh7.a.d(dVarF, 6).getExtraLarge();
                }
                if ((i2 & 16) != 0) {
                    jL = bj1.l(kmb.a.c(), dVarF, 6);
                    i3 &= -57345;
                }
            }
            float f8 = fD;
            dVarF.M();
            if (e.k()) {
                e.o(-1364277227, i3, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:415)");
            }
            rbc.Companion companion4 = rbc.INSTANCE;
            strB = vbc.b(rbc.a(wz9.c), dVarF, 0);
            b bVarP4 = nx8.p(bVar3, 0.0f, m1.a, 1, null);
            zX = dVarF.x(strB);
            objR = dVarF.R();
            if (zX) {
                objR = new Function1() { // from class: com.google.android.qs0
                    public final Object invoke(Object obj) {
                        return ss0.d(strB, (nfb) obj);
                    }
                };
                dVarF.L(objR);
            } else {
                objR = new Function1() { // from class: com.google.android.qs0
                    public final Object invoke(Object obj) {
                        return ss0.d(strB, (nfb) obj);
                    }
                };
                dVarF.L(objR);
            }
            int i13 = i3 >> 6;
            dVar2 = dVarF;
            afc.c(afb.d(bVarP4, false, (Function1) objR, 1, null), extraLarge, jL, 0L, 0.0f, 0.0f, null, ko1.e(-1039573072, true, new a(fE, f8), dVarF, 54), dVar2, (i13 & 112) | 12582912 | (i13 & 896), 120);
            if (e.k()) {
                e.n();
            }
            f3 = f8;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            bVar3 = bVar2;
            f3 = fD;
        }
        f4 = fE;
        xkbVar2 = extraLarge;
        j2 = jL;
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.rs0
                public final Object invoke(Object obj, Object obj2) {
                    return ss0.e(this.a, bVar3, f4, f3, xkbVar2, j2, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final long f(d dVar, int i) {
        if (e.k()) {
            e.o(433375448, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ContainerColor> (SheetDefaults.kt:383)");
        }
        long jL = bj1.l(kmb.a.a(), dVar, 6);
        if (e.k()) {
            e.n();
        }
        return jL;
    }

    public final float g() {
        return Elevation;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final xkb h(d dVar, int i) throws NoWhenBranchMatchedException {
        if (e.k()) {
            e.o(1683783414, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ExpandedShape> (SheetDefaults.kt:379)");
        }
        xkb xkbVarI = ulb.i(kmb.a.b(), dVar, 6);
        if (e.k()) {
            e.n();
        }
        return xkbVarI;
    }

    public final float i() {
        return PositionalThreshold;
    }

    public final long j(d dVar, int i) {
        if (e.k()) {
            e.o(-2040719176, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ScrimColor> (SheetDefaults.kt:390)");
        }
        long jP = ei1.p(bj1.l(r8b.a.a(), dVar, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (e.k()) {
            e.n();
        }
        return jP;
    }

    public final float k() {
        return SheetMaxWidth;
    }

    public final float l() {
        return VelocityThreshold;
    }

    public final g1 m(d dVar, int i) {
        if (e.k()) {
            e.o(-511309409, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-windowInsets> (SheetDefaults.kt:401)");
        }
        g1 g1VarH = i1.h(g1.INSTANCE, dVar, 6);
        fke.Companion companion = fke.INSTANCE;
        g1 g1VarK = rje.k(g1VarH, fke.n(companion.e(), companion.h()));
        if (e.k()) {
            e.n();
        }
        return g1VarK;
    }
}
