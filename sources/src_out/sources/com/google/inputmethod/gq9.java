package com.google.inputmethod;

import androidx.compose.p000animation.core.InfiniteTransition;
import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.b;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u001ae\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a;\u0010\u0015\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001aK\u0010\u0017\u001a\u00020\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001d\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a3\u0010\u001f\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010\u001e\"\u001a\u0010$\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u001a\u0010'\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#\"\u001a\u0010*\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#\"\u001a\u0010-\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010#\"\u001a\u00103\u001a\u00020.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u001a\u00106\u001a\u00020.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u00102\"\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0001078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u00109\"\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0001078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b;\u00109\"\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0001078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b=\u00109¨\u0006?"}, d2 = {"Lkotlin/Function0;", "", "progress", "Landroidx/compose/ui/b;", "modifier", "Lcom/google/android/ei1;", "color", "trackColor", "Lcom/google/android/wbc;", "strokeCap", "Lcom/google/android/ff3;", "gapSize", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "drawStopIndicator", "m", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/b;JJIFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;II)V", "startFraction", "endFraction", "strokeWidth", "w", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJFI)V", "j", "(Landroidx/compose/ui/b;JFJIFLandroidx/compose/runtime/d;II)V", "startAngle", "sweep", "Landroidx/compose/ui/graphics/drawscope/d;", "stroke", "u", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/d;)V", "v", "a", "F", "getLinearIndicatorWidth", "()F", "LinearIndicatorWidth", "b", "getLinearIndicatorHeight", "LinearIndicatorHeight", "c", "A", "StopIndicatorTrailingSpace", "d", "getCircularIndicatorDiameter", "CircularIndicatorDiameter", "Lcom/google/android/ch2;", "e", "Lcom/google/android/ch2;", "getLinearIndeterminateProgressEasing", "()Lcom/google/android/ch2;", "LinearIndeterminateProgressEasing", "f", "getCircularProgressEasing", "CircularProgressEasing", "Lcom/google/android/ov5;", "x", "()Lcom/google/android/ov5;", "circularIndeterminateGlobalRotationAnimationSpec", "z", "circularIndeterminateRotationAnimationSpec", "y", "circularIndeterminateProgressAnimationSpec", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class gq9 {
    private static final float a = ff3.i(240);
    private static final float b = p27.a.a();
    private static final float c = ff3.i(6);
    private static final float d = ec1.a.a();
    private static final CubicBezierEasing e;
    private static final CubicBezierEasing f;

    static {
        g08 g08Var = g08.a;
        e = g08Var.a();
        f = g08Var.c();
    }

    public static final float A() {
        return c;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0139  */
    /* JADX WARN: Code duplicated, block: B:106:0x0200  */
    /* JADX WARN: Code duplicated, block: B:107:0x0202  */
    /* JADX WARN: Code duplicated, block: B:110:0x020b  */
    /* JADX WARN: Code duplicated, block: B:111:0x020d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0215  */
    /* JADX WARN: Code duplicated, block: B:115:0x0217  */
    /* JADX WARN: Code duplicated, block: B:118:0x022b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0231  */
    /* JADX WARN: Code duplicated, block: B:126:0x0246  */
    /* JADX WARN: Code duplicated, block: B:128:0x024c  */
    /* JADX WARN: Code duplicated, block: B:134:0x025d  */
    /* JADX WARN: Code duplicated, block: B:138:0x026d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0291  */
    /* JADX WARN: Code duplicated, block: B:143:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:146:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x0101  */
    /* JADX WARN: Code duplicated, block: B:93:0x010c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0116  */
    /* JADX WARN: Code duplicated, block: B:96:0x0119  */
    /* JADX WARN: Code duplicated, block: B:98:0x0122  */
    public static final void j(b bVar, long j, float f2, long j2, int i, float f3, d dVar, final int i2, final int i3) {
        b bVar2;
        int i4;
        long jC;
        float fG;
        long j3;
        int i5;
        int iD;
        int i6;
        int i7;
        float f4;
        int i8;
        boolean z;
        d dVar2;
        final b bVar3;
        final long j4;
        final float f5;
        final float f6;
        final int i9;
        final long j5;
        s6b s6bVarH;
        b bVar4;
        long jE;
        final float f7;
        final int i10;
        final Stroke stroke;
        final q6c<Float> q6cVarC;
        final q6c<Float> q6cVarC2;
        final q6c<Float> q6cVarC3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean zX;
        Object objR;
        final long j6;
        final long j7;
        final float f8;
        int i11;
        d dVarF = dVar.F(333154241);
        int i12 = i3 & 1;
        if (i12 != 0) {
            i4 = i2 | 6;
            bVar2 = bVar;
        } else if ((i2 & 6) == 0) {
            bVar2 = bVar;
            i4 = (dVarF.x(bVar2) ? 4 : 2) | i2;
        } else {
            bVar2 = bVar;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            jC = j;
            i4 |= ((i3 & 2) == 0 && dVarF.D(jC)) ? 32 : 16;
        } else {
            jC = j;
        }
        int i13 = i3 & 4;
        if (i13 == 0) {
            if ((i2 & 384) == 0) {
                fG = f2;
                i4 |= dVarF.B(fG) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                j3 = j2;
                if ((i3 & 8) == 0 || !dVarF.D(j3)) {
                    i11 = 1024;
                } else {
                    i11 = 2048;
                }
                i4 |= i11;
            } else {
                j3 = j2;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    iD = i;
                    if (dVarF.C(iD)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= 196608;
                    f4 = f3;
                } else {
                    f4 = f3;
                    if ((i2 & 196608) == 0) {
                        if (dVarF.B(f4)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i4 |= i8;
                    }
                }
                if ((i4 & 74899) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i4 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0 || dVarF.t()) {
                        if (i12 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 2) != 0) {
                            jC = wp9.a.c(dVarF, 6);
                            i4 &= -113;
                        }
                        if (i13 != 0) {
                            fG = wp9.a.g();
                        }
                        if ((i3 & 8) != 0) {
                            jE = wp9.a.e(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            jE = j3;
                        }
                        if (i5 != 0) {
                            iD = wp9.a.d();
                        }
                        if (i7 != 0) {
                            f7 = wp9.a.f();
                        } else {
                            f7 = f4;
                        }
                        i10 = iD;
                    } else {
                        dVarF.q();
                        if ((i3 & 2) != 0) {
                            i4 &= -113;
                        }
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        bVar4 = bVar2;
                        f7 = f4;
                        i10 = iD;
                        jE = j3;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(333154241, i4, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:630)");
                    }
                    stroke = new Stroke(((f43) dVarF.v(CompositionLocalsKt.g())).x2(fG), 0.0f, i10, 0, null, 26, null);
                    InfiniteTransition infiniteTransitionG = androidx.compose.p000animation.core.d.g(null, dVarF, 0, 1);
                    ov5<Float> ov5VarX = x();
                    int i14 = InfiniteTransition.f;
                    int i15 = ov5.d;
                    q6cVarC = androidx.compose.p000animation.core.d.c(infiniteTransitionG, 0.0f, 1080.0f, ov5VarX, null, dVarF, i14 | 432 | (i15 << 9), 8);
                    q6cVarC2 = androidx.compose.p000animation.core.d.c(infiniteTransitionG, 0.0f, 360.0f, z(), null, dVarF, i14 | 432 | (i15 << 9), 8);
                    q6cVarC3 = androidx.compose.p000animation.core.d.c(infiniteTransitionG, 0.1f, 0.87f, y(), null, dVarF, i14 | 432 | (i15 << 9), 8);
                    dVar2 = dVarF;
                    b bVarT = SizeKt.t(kq9.b(bVar4), d);
                    boolean zX2 = dVar2.x(q6cVarC3);
                    b bVar5 = bVar4;
                    if ((57344 & i4) == 16384) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z5 = z2 | zX2;
                    if ((458752 & i4) == 131072) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z6 = z5 | z3;
                    if ((i4 & 896) == 256) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zX = z6 | z4 | dVar2.x(q6cVarC) | dVar2.x(q6cVarC2) | ((((i4 & 7168) ^ 3072) <= 2048 && dVar2.D(jE)) || (i4 & 3072) == 2048) | dVar2.T(stroke) | ((((i4 & 112) ^ 48) <= 32 && dVar2.D(jC)) || (i4 & 48) == 32);
                    objR = dVar2.R();
                    if (!zX || objR == d.INSTANCE.a()) {
                        j6 = jE;
                        j7 = jC;
                        f8 = fG;
                        objR = new Function1() { // from class: com.google.android.xp9
                            public final Object invoke(Object obj) {
                                return gq9.k(q6cVarC3, i10, f7, f8, q6cVarC, q6cVarC2, j6, stroke, j7, (DrawScope) obj);
                            }
                        };
                        dVar2.L(objR);
                    } else {
                        j6 = jE;
                        j7 = jC;
                        f8 = fG;
                    }
                    v51.b(bVarT, (Function1) objR, dVar2, 0);
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar5;
                    i9 = i10;
                    f5 = f7;
                    f6 = f8;
                    j5 = j6;
                    j4 = j7;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar3 = bVar2;
                    j4 = jC;
                    f5 = f4;
                    f6 = fG;
                    i9 = iD;
                    j5 = j3;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.yp9
                        public final Object invoke(Object obj, Object obj2) {
                            return gq9.l(bVar3, j4, f6, j5, i9, f5, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 24576;
            iD = i;
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= 196608;
                f4 = f3;
            } else {
                f4 = f3;
                if ((i2 & 196608) == 0) {
                    if (dVarF.B(f4)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
            }
            if ((i4 & 74899) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i4 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 2) != 0) {
                        jC = wp9.a.c(dVarF, 6);
                        i4 &= -113;
                    }
                    if (i13 != 0) {
                        fG = wp9.a.g();
                    }
                    if ((i3 & 8) != 0) {
                        jE = wp9.a.e(dVarF, 6);
                        i4 &= -7169;
                    } else {
                        jE = j3;
                    }
                    if (i5 != 0) {
                        iD = wp9.a.d();
                    }
                    if (i7 != 0) {
                        f7 = wp9.a.f();
                    } else {
                        f7 = f4;
                    }
                    i10 = iD;
                } else {
                    if (i12 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 2) != 0) {
                        jC = wp9.a.c(dVarF, 6);
                        i4 &= -113;
                    }
                    if (i13 != 0) {
                        fG = wp9.a.g();
                    }
                    if ((i3 & 8) != 0) {
                        jE = wp9.a.e(dVarF, 6);
                        i4 &= -7169;
                    } else {
                        jE = j3;
                    }
                    if (i5 != 0) {
                        iD = wp9.a.d();
                    }
                    if (i7 != 0) {
                        f7 = wp9.a.f();
                    } else {
                        f7 = f4;
                    }
                    i10 = iD;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(333154241, i4, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:630)");
                }
                stroke = new Stroke(((f43) dVarF.v(CompositionLocalsKt.g())).x2(fG), 0.0f, i10, 0, null, 26, null);
                InfiniteTransition infiniteTransitionG2 = androidx.compose.p000animation.core.d.g(null, dVarF, 0, 1);
                ov5<Float> ov5VarX2 = x();
                int i16 = InfiniteTransition.f;
                int i17 = ov5.d;
                q6cVarC = androidx.compose.p000animation.core.d.c(infiniteTransitionG2, 0.0f, 1080.0f, ov5VarX2, null, dVarF, i16 | 432 | (i17 << 9), 8);
                q6cVarC2 = androidx.compose.p000animation.core.d.c(infiniteTransitionG2, 0.0f, 360.0f, z(), null, dVarF, i16 | 432 | (i17 << 9), 8);
                q6cVarC3 = androidx.compose.p000animation.core.d.c(infiniteTransitionG2, 0.1f, 0.87f, y(), null, dVarF, i16 | 432 | (i17 << 9), 8);
                dVar2 = dVarF;
                b bVarT2 = SizeKt.t(kq9.b(bVar4), d);
                boolean zX3 = dVar2.x(q6cVarC3);
                b bVar6 = bVar4;
                if ((57344 & i4) == 16384) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z7 = z2 | zX3;
                if ((458752 & i4) == 131072) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z8 = z7 | z3;
                if ((i4 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zX = z8 | z4 | dVar2.x(q6cVarC) | dVar2.x(q6cVarC2) | ((((i4 & 7168) ^ 3072) <= 2048 && dVar2.D(jE)) || (i4 & 3072) == 2048) | dVar2.T(stroke) | ((((i4 & 112) ^ 48) <= 32 && dVar2.D(jC)) || (i4 & 48) == 32);
                objR = dVar2.R();
                if (zX) {
                    j6 = jE;
                    j7 = jC;
                    f8 = fG;
                    objR = new Function1() { // from class: com.google.android.xp9
                        public final Object invoke(Object obj) {
                            return gq9.k(q6cVarC3, i10, f7, f8, q6cVarC, q6cVarC2, j6, stroke, j7, (DrawScope) obj);
                        }
                    };
                    dVar2.L(objR);
                } else {
                    j6 = jE;
                    j7 = jC;
                    f8 = fG;
                    objR = new Function1() { // from class: com.google.android.xp9
                        public final Object invoke(Object obj) {
                            return gq9.k(q6cVarC3, i10, f7, f8, q6cVarC, q6cVarC2, j6, stroke, j7, (DrawScope) obj);
                        }
                    };
                    dVar2.L(objR);
                }
                v51.b(bVarT2, (Function1) objR, dVar2, 0);
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar6;
                i9 = i10;
                f5 = f7;
                f6 = f8;
                j5 = j6;
                j4 = j7;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar3 = bVar2;
                j4 = jC;
                f5 = f4;
                f6 = fG;
                i9 = iD;
                j5 = j3;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.yp9
                    public final Object invoke(Object obj, Object obj2) {
                        return gq9.l(bVar3, j4, f6, j5, i9, f5, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 384;
        fG = f2;
        if ((i2 & 3072) == 0) {
            j3 = j2;
            if ((i3 & 8) == 0) {
                i11 = 1024;
            } else {
                i11 = 1024;
            }
            i4 |= i11;
        } else {
            j3 = j2;
        }
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i2 & 24576) == 0) {
                iD = i;
                if (dVarF.C(iD)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= 196608;
                f4 = f3;
            } else {
                f4 = f3;
                if ((i2 & 196608) == 0) {
                    if (dVarF.B(f4)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
            }
            if ((i4 & 74899) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i4 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 2) != 0) {
                        jC = wp9.a.c(dVarF, 6);
                        i4 &= -113;
                    }
                    if (i13 != 0) {
                        fG = wp9.a.g();
                    }
                    if ((i3 & 8) != 0) {
                        jE = wp9.a.e(dVarF, 6);
                        i4 &= -7169;
                    } else {
                        jE = j3;
                    }
                    if (i5 != 0) {
                        iD = wp9.a.d();
                    }
                    if (i7 != 0) {
                        f7 = wp9.a.f();
                    } else {
                        f7 = f4;
                    }
                    i10 = iD;
                } else {
                    if (i12 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 2) != 0) {
                        jC = wp9.a.c(dVarF, 6);
                        i4 &= -113;
                    }
                    if (i13 != 0) {
                        fG = wp9.a.g();
                    }
                    if ((i3 & 8) != 0) {
                        jE = wp9.a.e(dVarF, 6);
                        i4 &= -7169;
                    } else {
                        jE = j3;
                    }
                    if (i5 != 0) {
                        iD = wp9.a.d();
                    }
                    if (i7 != 0) {
                        f7 = wp9.a.f();
                    } else {
                        f7 = f4;
                    }
                    i10 = iD;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(333154241, i4, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:630)");
                }
                stroke = new Stroke(((f43) dVarF.v(CompositionLocalsKt.g())).x2(fG), 0.0f, i10, 0, null, 26, null);
                InfiniteTransition infiniteTransitionG3 = androidx.compose.p000animation.core.d.g(null, dVarF, 0, 1);
                ov5<Float> ov5VarX3 = x();
                int i18 = InfiniteTransition.f;
                int i19 = ov5.d;
                q6cVarC = androidx.compose.p000animation.core.d.c(infiniteTransitionG3, 0.0f, 1080.0f, ov5VarX3, null, dVarF, i18 | 432 | (i19 << 9), 8);
                q6cVarC2 = androidx.compose.p000animation.core.d.c(infiniteTransitionG3, 0.0f, 360.0f, z(), null, dVarF, i18 | 432 | (i19 << 9), 8);
                q6cVarC3 = androidx.compose.p000animation.core.d.c(infiniteTransitionG3, 0.1f, 0.87f, y(), null, dVarF, i18 | 432 | (i19 << 9), 8);
                dVar2 = dVarF;
                b bVarT3 = SizeKt.t(kq9.b(bVar4), d);
                boolean zX4 = dVar2.x(q6cVarC3);
                b bVar7 = bVar4;
                if ((57344 & i4) == 16384) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z9 = z2 | zX4;
                if ((458752 & i4) == 131072) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z10 = z9 | z3;
                if ((i4 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zX = z10 | z4 | dVar2.x(q6cVarC) | dVar2.x(q6cVarC2) | ((((i4 & 7168) ^ 3072) <= 2048 && dVar2.D(jE)) || (i4 & 3072) == 2048) | dVar2.T(stroke) | ((((i4 & 112) ^ 48) <= 32 && dVar2.D(jC)) || (i4 & 48) == 32);
                objR = dVar2.R();
                if (zX) {
                    j6 = jE;
                    j7 = jC;
                    f8 = fG;
                    objR = new Function1() { // from class: com.google.android.xp9
                        public final Object invoke(Object obj) {
                            return gq9.k(q6cVarC3, i10, f7, f8, q6cVarC, q6cVarC2, j6, stroke, j7, (DrawScope) obj);
                        }
                    };
                    dVar2.L(objR);
                } else {
                    j6 = jE;
                    j7 = jC;
                    f8 = fG;
                    objR = new Function1() { // from class: com.google.android.xp9
                        public final Object invoke(Object obj) {
                            return gq9.k(q6cVarC3, i10, f7, f8, q6cVarC, q6cVarC2, j6, stroke, j7, (DrawScope) obj);
                        }
                    };
                    dVar2.L(objR);
                }
                v51.b(bVarT3, (Function1) objR, dVar2, 0);
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar7;
                i9 = i10;
                f5 = f7;
                f6 = f8;
                j5 = j6;
                j4 = j7;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar3 = bVar2;
                j4 = jC;
                f5 = f4;
                f6 = fG;
                i9 = iD;
                j5 = j3;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.yp9
                    public final Object invoke(Object obj, Object obj2) {
                        return gq9.l(bVar3, j4, f6, j5, i9, f5, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 24576;
        iD = i;
        i7 = i3 & 32;
        if (i7 != 0) {
            i4 |= 196608;
            f4 = f3;
        } else {
            f4 = f3;
            if ((i2 & 196608) == 0) {
                if (dVarF.B(f4)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
        }
        if ((i4 & 74899) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (dVarF.g(z, i4 & 1)) {
            dVarF.U();
            if ((i2 & 1) != 0) {
                if (i12 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if ((i3 & 2) != 0) {
                    jC = wp9.a.c(dVarF, 6);
                    i4 &= -113;
                }
                if (i13 != 0) {
                    fG = wp9.a.g();
                }
                if ((i3 & 8) != 0) {
                    jE = wp9.a.e(dVarF, 6);
                    i4 &= -7169;
                } else {
                    jE = j3;
                }
                if (i5 != 0) {
                    iD = wp9.a.d();
                }
                if (i7 != 0) {
                    f7 = wp9.a.f();
                } else {
                    f7 = f4;
                }
                i10 = iD;
            } else {
                if (i12 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if ((i3 & 2) != 0) {
                    jC = wp9.a.c(dVarF, 6);
                    i4 &= -113;
                }
                if (i13 != 0) {
                    fG = wp9.a.g();
                }
                if ((i3 & 8) != 0) {
                    jE = wp9.a.e(dVarF, 6);
                    i4 &= -7169;
                } else {
                    jE = j3;
                }
                if (i5 != 0) {
                    iD = wp9.a.d();
                }
                if (i7 != 0) {
                    f7 = wp9.a.f();
                } else {
                    f7 = f4;
                }
                i10 = iD;
            }
            dVarF.M();
            if (e.k()) {
                e.o(333154241, i4, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:630)");
            }
            stroke = new Stroke(((f43) dVarF.v(CompositionLocalsKt.g())).x2(fG), 0.0f, i10, 0, null, 26, null);
            InfiniteTransition infiniteTransitionG4 = androidx.compose.p000animation.core.d.g(null, dVarF, 0, 1);
            ov5<Float> ov5VarX4 = x();
            int i110 = InfiniteTransition.f;
            int i111 = ov5.d;
            q6cVarC = androidx.compose.p000animation.core.d.c(infiniteTransitionG4, 0.0f, 1080.0f, ov5VarX4, null, dVarF, i110 | 432 | (i111 << 9), 8);
            q6cVarC2 = androidx.compose.p000animation.core.d.c(infiniteTransitionG4, 0.0f, 360.0f, z(), null, dVarF, i110 | 432 | (i111 << 9), 8);
            q6cVarC3 = androidx.compose.p000animation.core.d.c(infiniteTransitionG4, 0.1f, 0.87f, y(), null, dVarF, i110 | 432 | (i111 << 9), 8);
            dVar2 = dVarF;
            b bVarT4 = SizeKt.t(kq9.b(bVar4), d);
            boolean zX5 = dVar2.x(q6cVarC3);
            b bVar8 = bVar4;
            if ((57344 & i4) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z11 = z2 | zX5;
            if ((458752 & i4) == 131072) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z12 = z11 | z3;
            if ((i4 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            zX = z12 | z4 | dVar2.x(q6cVarC) | dVar2.x(q6cVarC2) | ((((i4 & 7168) ^ 3072) <= 2048 && dVar2.D(jE)) || (i4 & 3072) == 2048) | dVar2.T(stroke) | ((((i4 & 112) ^ 48) <= 32 && dVar2.D(jC)) || (i4 & 48) == 32);
            objR = dVar2.R();
            if (zX) {
                j6 = jE;
                j7 = jC;
                f8 = fG;
                objR = new Function1() { // from class: com.google.android.xp9
                    public final Object invoke(Object obj) {
                        return gq9.k(q6cVarC3, i10, f7, f8, q6cVarC, q6cVarC2, j6, stroke, j7, (DrawScope) obj);
                    }
                };
                dVar2.L(objR);
            } else {
                j6 = jE;
                j7 = jC;
                f8 = fG;
                objR = new Function1() { // from class: com.google.android.xp9
                    public final Object invoke(Object obj) {
                        return gq9.k(q6cVarC3, i10, f7, f8, q6cVarC, q6cVarC2, j6, stroke, j7, (DrawScope) obj);
                    }
                };
                dVar2.L(objR);
            }
            v51.b(bVarT4, (Function1) objR, dVar2, 0);
            if (e.k()) {
                e.n();
            }
            bVar3 = bVar8;
            i9 = i10;
            f5 = f7;
            f6 = f8;
            j5 = j6;
            j4 = j7;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            bVar3 = bVar2;
            j4 = jC;
            f5 = f4;
            f6 = fG;
            i9 = iD;
            j5 = j3;
        }
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.yp9
                public final Object invoke(Object obj, Object obj2) {
                    return gq9.l(bVar3, j4, f6, j5, i9, f5, i2, i3, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(q6c q6cVar, int i, float f2, float f3, q6c q6cVar2, q6c q6cVar3, long j, Stroke stroke, long j2, DrawScope drawScope) {
        float fFloatValue = ((Number) q6cVar.getValue()).floatValue() * 360.0f;
        if (!wbc.e(i, wbc.INSTANCE.a()) && Float.intBitsToFloat((int) (drawScope.d() & 4294967295L)) <= Float.intBitsToFloat((int) (drawScope.d() >> 32))) {
            f2 = ff3.i(f2 + f3);
        }
        float fP0 = (f2 / ((float) (((double) drawScope.P0(Float.intBitsToFloat((int) (drawScope.d() >> 32)))) * 3.141592653589793d))) * 360.0f;
        float fFloatValue2 = ((Number) q6cVar2.getValue()).floatValue() + ((Number) q6cVar3.getValue()).floatValue();
        long jA = drawScope.A();
        vg3 drawContext = drawScope.getDrawContext();
        long jD = drawContext.d();
        drawContext.b().v();
        try {
            drawContext.getTransform().h(fFloatValue2, jA);
            u(drawScope, fFloatValue + Math.min(fFloatValue, fP0), (360.0f - fFloatValue) - (Math.min(fFloatValue, fP0) * 2), j, stroke);
            v(drawScope, 0.0f, fFloatValue, j2, stroke);
            return Unit.a;
        } finally {
            drawContext.b().o();
            drawContext.c(jD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(b bVar, long j, float f2, long j2, int i, float f3, int i2, int i3, d dVar, int i4) {
        j(bVar, j, f2, j2, i, f3, dVar, saa.a(i2 | 1), i3);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0116  */
    /* JADX WARN: Code duplicated, block: B:104:0x0122  */
    /* JADX WARN: Code duplicated, block: B:106:0x012c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0133  */
    /* JADX WARN: Code duplicated, block: B:109:0x0136  */
    /* JADX WARN: Code duplicated, block: B:112:0x0140  */
    /* JADX WARN: Code duplicated, block: B:114:0x0148  */
    /* JADX WARN: Code duplicated, block: B:116:0x014e  */
    /* JADX WARN: Code duplicated, block: B:122:0x015d  */
    /* JADX WARN: Code duplicated, block: B:123:0x015f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0167  */
    /* JADX WARN: Code duplicated, block: B:128:0x016f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0183  */
    /* JADX WARN: Code duplicated, block: B:134:0x018f  */
    /* JADX WARN: Code duplicated, block: B:137:0x019d  */
    /* JADX WARN: Code duplicated, block: B:138:0x019f  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:151:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:152:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:155:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:156:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:159:0x020b  */
    /* JADX WARN: Code duplicated, block: B:161:0x0211  */
    /* JADX WARN: Code duplicated, block: B:167:0x0221  */
    /* JADX WARN: Code duplicated, block: B:169:0x0227  */
    /* JADX WARN: Code duplicated, block: B:175:0x0238  */
    /* JADX WARN: Code duplicated, block: B:177:0x023e  */
    /* JADX WARN: Code duplicated, block: B:183:0x024b  */
    /* JADX WARN: Code duplicated, block: B:187:0x025b  */
    /* JADX WARN: Code duplicated, block: B:190:0x0279  */
    /* JADX WARN: Code duplicated, block: B:192:0x0285  */
    /* JADX WARN: Code duplicated, block: B:195:0x0296  */
    /* JADX WARN: Code duplicated, block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x007a  */
    /* JADX WARN: Code duplicated, block: B:50:0x007e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x0089  */
    /* JADX WARN: Code duplicated, block: B:57:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:96:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x010d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0110  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void m(final Function0<Float> function0, b bVar, long j, long j2, int i, float f2, Function1<? super DrawScope, Unit> function1, d dVar, final int i2, final int i3) {
        int i4;
        b bVar2;
        final long jH;
        long jK;
        int i5;
        int i6;
        int i7;
        int i8;
        float fI;
        int i9;
        boolean z;
        boolean z2;
        final float f3;
        b bVar3;
        final int i10;
        final long j3;
        final long j4;
        final Function1<? super DrawScope, Unit> function2;
        s6b s6bVarH;
        final int iJ;
        Function1<? super DrawScope, Unit> function3;
        final float f4;
        final int i11;
        boolean z3;
        boolean z4;
        Object objR;
        boolean z5;
        Object objR2;
        final Function0 function4;
        boolean zX;
        Object objR3;
        boolean z6;
        boolean z7;
        boolean z8;
        Object objR4;
        final Function1<? super DrawScope, Unit> function5;
        final long j5;
        int i12;
        int i13;
        int i14;
        d dVarF = dVar.F(-339970038);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (dVarF.T(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i15 = i3 & 2;
        if (i15 == 0) {
            if ((i2 & 48) == 0) {
                bVar2 = bVar;
                i4 |= dVarF.x(bVar2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                jH = j;
                if ((i3 & 4) == 0 || !dVarF.D(jH)) {
                    i14 = 128;
                } else {
                    i14 = 256;
                }
                i4 |= i14;
            } else {
                jH = j;
            }
            if ((i2 & 3072) == 0) {
                jK = j2;
                if ((i3 & 8) == 0 || !dVarF.D(jK)) {
                    i13 = 1024;
                } else {
                    i13 = 2048;
                }
                i4 |= i13;
            } else {
                jK = j2;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    i6 = i;
                    if (dVarF.C(i6)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i4 |= i7;
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    i4 |= 196608;
                    fI = f2;
                } else {
                    fI = f2;
                    if ((i2 & 196608) == 0) {
                        if (dVarF.B(fI)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i4 |= i9;
                    }
                }
                if ((i2 & 1572864) != 0) {
                    if ((i3 & 64) == 0 || !dVarF.T(function1)) {
                        i12 = 524288;
                    } else {
                        i12 = 1048576;
                    }
                    i4 |= i12;
                }
                z = true;
                if ((i4 & 599187) != 599186) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (dVarF.g(z2, i4 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0 || dVarF.t()) {
                        if (i15 != 0) {
                            bVar3 = b.INSTANCE;
                        } else {
                            bVar3 = bVar2;
                        }
                        if ((i3 & 4) != 0) {
                            jH = wp9.a.h(dVarF, 6);
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jK = wp9.a.k(dVarF, 6);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            iJ = wp9.a.j();
                        } else {
                            iJ = i6;
                        }
                        if (i8 != 0) {
                            fI = wp9.a.i();
                        }
                        if ((i3 & 64) != 0) {
                            boolean z9 = (((i4 & 896) ^ 384) <= 256 && dVarF.D(jH)) || (i4 & 384) == 256;
                            if ((57344 & i4) == 16384) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            z4 = z9 | z3;
                            objR = dVarF.R();
                            if (z4 || objR == d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.zp9
                                    public final Object invoke(Object obj) {
                                        return gq9.o(jH, iJ, (DrawScope) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function3 = (Function1) objR;
                            i4 &= -3670017;
                        } else {
                            function3 = function1;
                        }
                        f4 = fI;
                        i11 = iJ;
                    } else {
                        dVarF.q();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                        }
                        function3 = function1;
                        f4 = fI;
                        bVar3 = bVar2;
                        i11 = i6;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-339970038, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:153)");
                    }
                    if ((i4 & 14) == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objR2 = dVarF.R();
                    if (z5 || objR2 == d.INSTANCE.a()) {
                        objR2 = new Function0() { // from class: com.google.android.aq9
                            public final Object invoke() {
                                return Float.valueOf(gq9.p(function0));
                            }
                        };
                        dVarF.L(objR2);
                    }
                    function4 = (Function0) objR2;
                    b bVarThen = bVar3.then(i7.m());
                    zX = dVarF.x(function4);
                    objR3 = dVarF.R();
                    if (zX || objR3 == d.INSTANCE.a()) {
                        objR3 = new Function1() { // from class: com.google.android.bq9
                            public final Object invoke(Object obj) {
                                return gq9.q(function4, (nfb) obj);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    b bVarV = SizeKt.v(afb.c(bVarThen, true, (Function1) objR3), a, b);
                    if ((57344 & i4) == 16384) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if ((458752 & i4) == 131072) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean zX2 = z6 | z7 | dVarF.x(function4) | ((((i4 & 7168) ^ 3072) <= 2048 && dVarF.D(jK)) || (i4 & 3072) == 2048) | ((((i4 & 896) ^ 384) <= 256 && dVarF.D(jH)) || (i4 & 384) == 256);
                    if ((((3670016 & i4) ^ 1572864) > 1048576 || !dVarF.x(function3)) && (i4 & 1572864) != 1048576) {
                    }
                    z8 = z | zX2;
                    objR4 = dVarF.R();
                    if (!z8 || objR4 == d.INSTANCE.a()) {
                        function5 = function3;
                        j5 = jH;
                        j4 = jK;
                        objR4 = new Function1() { // from class: com.google.android.cq9
                            public final Object invoke(Object obj) {
                                return gq9.r(i11, f4, function4, j4, j5, function5, (DrawScope) obj);
                            }
                        };
                        dVarF.L(objR4);
                    } else {
                        function5 = function3;
                        j5 = jH;
                        j4 = jK;
                    }
                    v51.b(bVarV, (Function1) objR4, dVarF, 0);
                    if (e.k()) {
                        e.n();
                    }
                    i10 = i11;
                    f3 = f4;
                    j3 = j5;
                    function2 = function5;
                } else {
                    dVarF.q();
                    f3 = fI;
                    bVar3 = bVar2;
                    i10 = i6;
                    j3 = jH;
                    j4 = jK;
                    function2 = function1;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    final b bVar4 = bVar3;
                    final long j6 = j4;
                    s6bVarH.a(new Function2() { // from class: com.google.android.dq9
                        public final Object invoke(Object obj, Object obj2) {
                            return gq9.n(function0, bVar4, j3, j6, i10, f3, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 24576;
            i6 = i;
            i8 = i3 & 32;
            if (i8 != 0) {
                i4 |= 196608;
                fI = f2;
            } else {
                fI = f2;
                if ((i2 & 196608) == 0) {
                    if (dVarF.B(fI)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
            }
            if ((i2 & 1572864) != 0) {
                if ((i3 & 64) == 0) {
                    i12 = 524288;
                } else {
                    i12 = 524288;
                }
                i4 |= i12;
            }
            z = true;
            if ((i4 & 599187) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (dVarF.g(z2, i4 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0) {
                    if (i15 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar2;
                    }
                    if ((i3 & 4) != 0) {
                        jH = wp9.a.h(dVarF, 6);
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jK = wp9.a.k(dVarF, 6);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        iJ = wp9.a.j();
                    } else {
                        iJ = i6;
                    }
                    if (i8 != 0) {
                        fI = wp9.a.i();
                    }
                    if ((i3 & 64) != 0) {
                        if (((i4 & 896) ^ 384) <= 256) {
                        }
                        if ((57344 & i4) == 16384) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z4 = z9 | z3;
                        objR = dVarF.R();
                        if (z4) {
                            objR = new Function1() { // from class: com.google.android.zp9
                                public final Object invoke(Object obj) {
                                    return gq9.o(jH, iJ, (DrawScope) obj);
                                }
                            };
                            dVarF.L(objR);
                        } else {
                            objR = new Function1() { // from class: com.google.android.zp9
                                public final Object invoke(Object obj) {
                                    return gq9.o(jH, iJ, (DrawScope) obj);
                                }
                            };
                            dVarF.L(objR);
                        }
                        function3 = (Function1) objR;
                        i4 &= -3670017;
                    } else {
                        function3 = function1;
                    }
                    f4 = fI;
                    i11 = iJ;
                } else {
                    if (i15 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar2;
                    }
                    if ((i3 & 4) != 0) {
                        jH = wp9.a.h(dVarF, 6);
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jK = wp9.a.k(dVarF, 6);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        iJ = wp9.a.j();
                    } else {
                        iJ = i6;
                    }
                    if (i8 != 0) {
                        fI = wp9.a.i();
                    }
                    if ((i3 & 64) != 0) {
                        if (((i4 & 896) ^ 384) <= 256) {
                        }
                        if ((57344 & i4) == 16384) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z4 = z9 | z3;
                        objR = dVarF.R();
                        if (z4) {
                            objR = new Function1() { // from class: com.google.android.zp9
                                public final Object invoke(Object obj) {
                                    return gq9.o(jH, iJ, (DrawScope) obj);
                                }
                            };
                            dVarF.L(objR);
                        } else {
                            objR = new Function1() { // from class: com.google.android.zp9
                                public final Object invoke(Object obj) {
                                    return gq9.o(jH, iJ, (DrawScope) obj);
                                }
                            };
                            dVarF.L(objR);
                        }
                        function3 = (Function1) objR;
                        i4 &= -3670017;
                    } else {
                        function3 = function1;
                    }
                    f4 = fI;
                    i11 = iJ;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-339970038, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:153)");
                }
                if ((i4 & 14) == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objR2 = dVarF.R();
                if (z5) {
                    objR2 = new Function0() { // from class: com.google.android.aq9
                        public final Object invoke() {
                            return Float.valueOf(gq9.p(function0));
                        }
                    };
                    dVarF.L(objR2);
                } else {
                    objR2 = new Function0() { // from class: com.google.android.aq9
                        public final Object invoke() {
                            return Float.valueOf(gq9.p(function0));
                        }
                    };
                    dVarF.L(objR2);
                }
                function4 = (Function0) objR2;
                b bVarThen2 = bVar3.then(i7.m());
                zX = dVarF.x(function4);
                objR3 = dVarF.R();
                if (zX) {
                    objR3 = new Function1() { // from class: com.google.android.bq9
                        public final Object invoke(Object obj) {
                            return gq9.q(function4, (nfb) obj);
                        }
                    };
                    dVarF.L(objR3);
                } else {
                    objR3 = new Function1() { // from class: com.google.android.bq9
                        public final Object invoke(Object obj) {
                            return gq9.q(function4, (nfb) obj);
                        }
                    };
                    dVarF.L(objR3);
                }
                b bVarV2 = SizeKt.v(afb.c(bVarThen2, true, (Function1) objR3), a, b);
                if ((57344 & i4) == 16384) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if ((458752 & i4) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean zX3 = z6 | z7 | dVarF.x(function4) | ((((i4 & 7168) ^ 3072) <= 2048 && dVarF.D(jK)) || (i4 & 3072) == 2048) | ((((i4 & 896) ^ 384) <= 256 && dVarF.D(jH)) || (i4 & 384) == 256);
                z = ((3670016 & i4) ^ 1572864) > 1048576 ? false : false;
                z8 = z | zX3;
                objR4 = dVarF.R();
                if (z8) {
                    function5 = function3;
                    j5 = jH;
                    j4 = jK;
                    objR4 = new Function1() { // from class: com.google.android.cq9
                        public final Object invoke(Object obj) {
                            return gq9.r(i11, f4, function4, j4, j5, function5, (DrawScope) obj);
                        }
                    };
                    dVarF.L(objR4);
                } else {
                    function5 = function3;
                    j5 = jH;
                    j4 = jK;
                    objR4 = new Function1() { // from class: com.google.android.cq9
                        public final Object invoke(Object obj) {
                            return gq9.r(i11, f4, function4, j4, j5, function5, (DrawScope) obj);
                        }
                    };
                    dVarF.L(objR4);
                }
                v51.b(bVarV2, (Function1) objR4, dVarF, 0);
                if (e.k()) {
                    e.n();
                }
                i10 = i11;
                f3 = f4;
                j3 = j5;
                function2 = function5;
            } else {
                dVarF.q();
                f3 = fI;
                bVar3 = bVar2;
                i10 = i6;
                j3 = jH;
                j4 = jK;
                function2 = function1;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                final b bVar5 = bVar3;
                final long j7 = j4;
                s6bVarH.a(new Function2() { // from class: com.google.android.dq9
                    public final Object invoke(Object obj, Object obj2) {
                        return gq9.n(function0, bVar5, j3, j7, i10, f3, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 48;
        bVar2 = bVar;
        if ((i2 & 384) == 0) {
            jH = j;
            if ((i3 & 4) == 0) {
                i14 = 128;
            } else {
                i14 = 128;
            }
            i4 |= i14;
        } else {
            jH = j;
        }
        if ((i2 & 3072) == 0) {
            jK = j2;
            if ((i3 & 8) == 0) {
                i13 = 1024;
            } else {
                i13 = 1024;
            }
            i4 |= i13;
        } else {
            jK = j2;
        }
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i2 & 24576) == 0) {
                i6 = i;
                if (dVarF.C(i6)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i4 |= i7;
            }
            i8 = i3 & 32;
            if (i8 != 0) {
                i4 |= 196608;
                fI = f2;
            } else {
                fI = f2;
                if ((i2 & 196608) == 0) {
                    if (dVarF.B(fI)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
            }
            if ((i2 & 1572864) != 0) {
                if ((i3 & 64) == 0) {
                    i12 = 524288;
                } else {
                    i12 = 524288;
                }
                i4 |= i12;
            }
            z = true;
            if ((i4 & 599187) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (dVarF.g(z2, i4 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0) {
                    if (i15 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar2;
                    }
                    if ((i3 & 4) != 0) {
                        jH = wp9.a.h(dVarF, 6);
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jK = wp9.a.k(dVarF, 6);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        iJ = wp9.a.j();
                    } else {
                        iJ = i6;
                    }
                    if (i8 != 0) {
                        fI = wp9.a.i();
                    }
                    if ((i3 & 64) != 0) {
                        if (((i4 & 896) ^ 384) <= 256) {
                        }
                        if ((57344 & i4) == 16384) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z4 = z9 | z3;
                        objR = dVarF.R();
                        if (z4) {
                            objR = new Function1() { // from class: com.google.android.zp9
                                public final Object invoke(Object obj) {
                                    return gq9.o(jH, iJ, (DrawScope) obj);
                                }
                            };
                            dVarF.L(objR);
                        } else {
                            objR = new Function1() { // from class: com.google.android.zp9
                                public final Object invoke(Object obj) {
                                    return gq9.o(jH, iJ, (DrawScope) obj);
                                }
                            };
                            dVarF.L(objR);
                        }
                        function3 = (Function1) objR;
                        i4 &= -3670017;
                    } else {
                        function3 = function1;
                    }
                    f4 = fI;
                    i11 = iJ;
                } else {
                    if (i15 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar2;
                    }
                    if ((i3 & 4) != 0) {
                        jH = wp9.a.h(dVarF, 6);
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jK = wp9.a.k(dVarF, 6);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        iJ = wp9.a.j();
                    } else {
                        iJ = i6;
                    }
                    if (i8 != 0) {
                        fI = wp9.a.i();
                    }
                    if ((i3 & 64) != 0) {
                        if (((i4 & 896) ^ 384) <= 256) {
                        }
                        if ((57344 & i4) == 16384) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z4 = z9 | z3;
                        objR = dVarF.R();
                        if (z4) {
                            objR = new Function1() { // from class: com.google.android.zp9
                                public final Object invoke(Object obj) {
                                    return gq9.o(jH, iJ, (DrawScope) obj);
                                }
                            };
                            dVarF.L(objR);
                        } else {
                            objR = new Function1() { // from class: com.google.android.zp9
                                public final Object invoke(Object obj) {
                                    return gq9.o(jH, iJ, (DrawScope) obj);
                                }
                            };
                            dVarF.L(objR);
                        }
                        function3 = (Function1) objR;
                        i4 &= -3670017;
                    } else {
                        function3 = function1;
                    }
                    f4 = fI;
                    i11 = iJ;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-339970038, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:153)");
                }
                if ((i4 & 14) == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objR2 = dVarF.R();
                if (z5) {
                    objR2 = new Function0() { // from class: com.google.android.aq9
                        public final Object invoke() {
                            return Float.valueOf(gq9.p(function0));
                        }
                    };
                    dVarF.L(objR2);
                } else {
                    objR2 = new Function0() { // from class: com.google.android.aq9
                        public final Object invoke() {
                            return Float.valueOf(gq9.p(function0));
                        }
                    };
                    dVarF.L(objR2);
                }
                function4 = (Function0) objR2;
                b bVarThen3 = bVar3.then(i7.m());
                zX = dVarF.x(function4);
                objR3 = dVarF.R();
                if (zX) {
                    objR3 = new Function1() { // from class: com.google.android.bq9
                        public final Object invoke(Object obj) {
                            return gq9.q(function4, (nfb) obj);
                        }
                    };
                    dVarF.L(objR3);
                } else {
                    objR3 = new Function1() { // from class: com.google.android.bq9
                        public final Object invoke(Object obj) {
                            return gq9.q(function4, (nfb) obj);
                        }
                    };
                    dVarF.L(objR3);
                }
                b bVarV3 = SizeKt.v(afb.c(bVarThen3, true, (Function1) objR3), a, b);
                if ((57344 & i4) == 16384) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if ((458752 & i4) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean zX4 = z6 | z7 | dVarF.x(function4) | ((((i4 & 7168) ^ 3072) <= 2048 && dVarF.D(jK)) || (i4 & 3072) == 2048) | ((((i4 & 896) ^ 384) <= 256 && dVarF.D(jH)) || (i4 & 384) == 256);
                if (((3670016 & i4) ^ 1572864) > 1048576) {
                }
                z8 = z | zX4;
                objR4 = dVarF.R();
                if (z8) {
                    function5 = function3;
                    j5 = jH;
                    j4 = jK;
                    objR4 = new Function1() { // from class: com.google.android.cq9
                        public final Object invoke(Object obj) {
                            return gq9.r(i11, f4, function4, j4, j5, function5, (DrawScope) obj);
                        }
                    };
                    dVarF.L(objR4);
                } else {
                    function5 = function3;
                    j5 = jH;
                    j4 = jK;
                    objR4 = new Function1() { // from class: com.google.android.cq9
                        public final Object invoke(Object obj) {
                            return gq9.r(i11, f4, function4, j4, j5, function5, (DrawScope) obj);
                        }
                    };
                    dVarF.L(objR4);
                }
                v51.b(bVarV3, (Function1) objR4, dVarF, 0);
                if (e.k()) {
                    e.n();
                }
                i10 = i11;
                f3 = f4;
                j3 = j5;
                function2 = function5;
            } else {
                dVarF.q();
                f3 = fI;
                bVar3 = bVar2;
                i10 = i6;
                j3 = jH;
                j4 = jK;
                function2 = function1;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                final b bVar6 = bVar3;
                final long j8 = j4;
                s6bVarH.a(new Function2() { // from class: com.google.android.dq9
                    public final Object invoke(Object obj, Object obj2) {
                        return gq9.n(function0, bVar6, j3, j8, i10, f3, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 24576;
        i6 = i;
        i8 = i3 & 32;
        if (i8 != 0) {
            i4 |= 196608;
            fI = f2;
        } else {
            fI = f2;
            if ((i2 & 196608) == 0) {
                if (dVarF.B(fI)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i4 |= i9;
            }
        }
        if ((i2 & 1572864) != 0) {
            if ((i3 & 64) == 0) {
                i12 = 524288;
            } else {
                i12 = 524288;
            }
            i4 |= i12;
        }
        z = true;
        if ((i4 & 599187) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (dVarF.g(z2, i4 & 1)) {
            dVarF.U();
            if ((i2 & 1) != 0) {
                if (i15 != 0) {
                    bVar3 = b.INSTANCE;
                } else {
                    bVar3 = bVar2;
                }
                if ((i3 & 4) != 0) {
                    jH = wp9.a.h(dVarF, 6);
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    jK = wp9.a.k(dVarF, 6);
                    i4 &= -7169;
                }
                if (i5 != 0) {
                    iJ = wp9.a.j();
                } else {
                    iJ = i6;
                }
                if (i8 != 0) {
                    fI = wp9.a.i();
                }
                if ((i3 & 64) != 0) {
                    if (((i4 & 896) ^ 384) <= 256) {
                    }
                    if ((57344 & i4) == 16384) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = z9 | z3;
                    objR = dVarF.R();
                    if (z4) {
                        objR = new Function1() { // from class: com.google.android.zp9
                            public final Object invoke(Object obj) {
                                return gq9.o(jH, iJ, (DrawScope) obj);
                            }
                        };
                        dVarF.L(objR);
                    } else {
                        objR = new Function1() { // from class: com.google.android.zp9
                            public final Object invoke(Object obj) {
                                return gq9.o(jH, iJ, (DrawScope) obj);
                            }
                        };
                        dVarF.L(objR);
                    }
                    function3 = (Function1) objR;
                    i4 &= -3670017;
                } else {
                    function3 = function1;
                }
                f4 = fI;
                i11 = iJ;
            } else {
                if (i15 != 0) {
                    bVar3 = b.INSTANCE;
                } else {
                    bVar3 = bVar2;
                }
                if ((i3 & 4) != 0) {
                    jH = wp9.a.h(dVarF, 6);
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    jK = wp9.a.k(dVarF, 6);
                    i4 &= -7169;
                }
                if (i5 != 0) {
                    iJ = wp9.a.j();
                } else {
                    iJ = i6;
                }
                if (i8 != 0) {
                    fI = wp9.a.i();
                }
                if ((i3 & 64) != 0) {
                    if (((i4 & 896) ^ 384) <= 256) {
                    }
                    if ((57344 & i4) == 16384) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = z9 | z3;
                    objR = dVarF.R();
                    if (z4) {
                        objR = new Function1() { // from class: com.google.android.zp9
                            public final Object invoke(Object obj) {
                                return gq9.o(jH, iJ, (DrawScope) obj);
                            }
                        };
                        dVarF.L(objR);
                    } else {
                        objR = new Function1() { // from class: com.google.android.zp9
                            public final Object invoke(Object obj) {
                                return gq9.o(jH, iJ, (DrawScope) obj);
                            }
                        };
                        dVarF.L(objR);
                    }
                    function3 = (Function1) objR;
                    i4 &= -3670017;
                } else {
                    function3 = function1;
                }
                f4 = fI;
                i11 = iJ;
            }
            dVarF.M();
            if (e.k()) {
                e.o(-339970038, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:153)");
            }
            if ((i4 & 14) == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            objR2 = dVarF.R();
            if (z5) {
                objR2 = new Function0() { // from class: com.google.android.aq9
                    public final Object invoke() {
                        return Float.valueOf(gq9.p(function0));
                    }
                };
                dVarF.L(objR2);
            } else {
                objR2 = new Function0() { // from class: com.google.android.aq9
                    public final Object invoke() {
                        return Float.valueOf(gq9.p(function0));
                    }
                };
                dVarF.L(objR2);
            }
            function4 = (Function0) objR2;
            b bVarThen4 = bVar3.then(i7.m());
            zX = dVarF.x(function4);
            objR3 = dVarF.R();
            if (zX) {
                objR3 = new Function1() { // from class: com.google.android.bq9
                    public final Object invoke(Object obj) {
                        return gq9.q(function4, (nfb) obj);
                    }
                };
                dVarF.L(objR3);
            } else {
                objR3 = new Function1() { // from class: com.google.android.bq9
                    public final Object invoke(Object obj) {
                        return gq9.q(function4, (nfb) obj);
                    }
                };
                dVarF.L(objR3);
            }
            b bVarV4 = SizeKt.v(afb.c(bVarThen4, true, (Function1) objR3), a, b);
            if ((57344 & i4) == 16384) {
                z6 = true;
            } else {
                z6 = false;
            }
            if ((458752 & i4) == 131072) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean zX5 = z6 | z7 | dVarF.x(function4) | ((((i4 & 7168) ^ 3072) <= 2048 && dVarF.D(jK)) || (i4 & 3072) == 2048) | ((((i4 & 896) ^ 384) <= 256 && dVarF.D(jH)) || (i4 & 384) == 256);
            if (((3670016 & i4) ^ 1572864) > 1048576) {
            }
            z8 = z | zX5;
            objR4 = dVarF.R();
            if (z8) {
                function5 = function3;
                j5 = jH;
                j4 = jK;
                objR4 = new Function1() { // from class: com.google.android.cq9
                    public final Object invoke(Object obj) {
                        return gq9.r(i11, f4, function4, j4, j5, function5, (DrawScope) obj);
                    }
                };
                dVarF.L(objR4);
            } else {
                function5 = function3;
                j5 = jH;
                j4 = jK;
                objR4 = new Function1() { // from class: com.google.android.cq9
                    public final Object invoke(Object obj) {
                        return gq9.r(i11, f4, function4, j4, j5, function5, (DrawScope) obj);
                    }
                };
                dVarF.L(objR4);
            }
            v51.b(bVarV4, (Function1) objR4, dVarF, 0);
            if (e.k()) {
                e.n();
            }
            i10 = i11;
            f3 = f4;
            j3 = j5;
            function2 = function5;
        } else {
            dVarF.q();
            f3 = fI;
            bVar3 = bVar2;
            i10 = i6;
            j3 = jH;
            j4 = jK;
            function2 = function1;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            final b bVar7 = bVar3;
            final long j9 = j4;
            s6bVarH.a(new Function2() { // from class: com.google.android.dq9
                public final Object invoke(Object obj, Object obj2) {
                    return gq9.n(function0, bVar7, j3, j9, i10, f3, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(Function0 function0, b bVar, long j, long j2, int i, float f2, Function1 function1, int i2, int i3, d dVar, int i4) {
        m(function0, bVar, j, j2, i, f2, function1, dVar, saa.a(i2 | 1), i3);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(long j, int i, DrawScope drawScope) {
        wp9 wp9Var = wp9.a;
        wp9Var.a(drawScope, wp9Var.l(), j, i);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float p(Function0 function0) {
        float fFloatValue = ((Number) function0.invoke()).floatValue();
        if (fFloatValue < 0.0f) {
            fFloatValue = 0.0f;
        }
        if (fFloatValue > 1.0f) {
            return 1.0f;
        }
        return fFloatValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(Function0 function0, nfb nfbVar) {
        Object objInvoke = function0.invoke();
        if (Float.isNaN(((Number) objInvoke).floatValue())) {
            objInvoke = null;
        }
        Float f2 = (Float) objInvoke;
        SemanticsPropertiesKt.o0(nfbVar, new ProgressBarRangeInfo(f2 != null ? f2.floatValue() : 0.0f, g.b(0.0f, 1.0f), 0, 4, null));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(int i, float f2, Function0 function0, long j, long j2, Function1 function1, DrawScope drawScope) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.d() & 4294967295L));
        if (!wbc.e(i, wbc.INSTANCE.a()) && Float.intBitsToFloat((int) (4294967295L & drawScope.d())) <= Float.intBitsToFloat((int) (drawScope.d() >> 32))) {
            f2 = ff3.i(f2 + drawScope.P0(fIntBitsToFloat));
        }
        float fP0 = f2 / drawScope.P0(Float.intBitsToFloat((int) (drawScope.d() >> 32)));
        float fFloatValue = ((Number) function0.invoke()).floatValue();
        float fMin = fFloatValue + Math.min(fFloatValue, fP0);
        if (fMin <= 1.0f) {
            w(drawScope, fMin, 1.0f, j, fIntBitsToFloat, i);
        }
        w(drawScope, 0.0f, fFloatValue, j2, fIntBitsToFloat, i);
        function1.invoke(drawScope);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(zj6.b bVar) {
        bVar.d(6000);
        bVar.e(bVar.f(Float.valueOf(0.87f), 3000), f);
        bVar.f(Float.valueOf(0.1f), 6000);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(zj6.b bVar) {
        bVar.d(6000);
        Float fValueOf = Float.valueOf(90.0f);
        bVar.e(bVar.f(fValueOf, 300), g08.a.b());
        bVar.f(fValueOf, 1500);
        Float fValueOf2 = Float.valueOf(180.0f);
        bVar.f(fValueOf2, 1800);
        bVar.f(fValueOf2, 3000);
        Float fValueOf3 = Float.valueOf(270.0f);
        bVar.f(fValueOf3, 3300);
        bVar.f(fValueOf3, 4500);
        Float fValueOf4 = Float.valueOf(360.0f);
        bVar.f(fValueOf4, 4800);
        bVar.f(fValueOf4, 6000);
        return Unit.a;
    }

    private static final void u(DrawScope drawScope, float f2, float f3, long j, Stroke stroke) {
        float f4 = 2;
        float width = stroke.getWidth() / f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.d() >> 32)) - (f4 * width);
        DrawScope.n0(drawScope, j, f2, f3, false, rn8.e((((long) Float.floatToRawIntBits(width)) & 4294967295L) | (Float.floatToRawIntBits(width) << 32)), tsb.d((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L)), 0.0f, stroke, null, 0, 832, null);
    }

    private static final void v(DrawScope drawScope, float f2, float f3, long j, Stroke stroke) {
        u(drawScope, f2, f3, j, stroke);
    }

    private static final void w(DrawScope drawScope, float f2, float f3, long j, float f4, int i) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.d() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.d() & 4294967295L));
        float f5 = 2;
        float f6 = fIntBitsToFloat2 / f5;
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Ltr;
        float f7 = (z ? f2 : 1.0f - f3) * fIntBitsToFloat;
        float f8 = (z ? f3 : 1.0f - f2) * fIntBitsToFloat;
        if (wbc.e(i, wbc.INSTANCE.a()) || fIntBitsToFloat2 > fIntBitsToFloat) {
            DrawScope.e1(drawScope, j, rn8.e((((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L)), rn8.e((((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L)), f4, 0, null, 0.0f, null, 0, 496, null);
            return;
        }
        float f9 = f4 / f5;
        float f10 = fIntBitsToFloat - f9;
        if (f7 < f9) {
            f7 = f9;
        }
        if (f7 > f10) {
            f7 = f10;
        }
        if (f8 < f9) {
            f8 = f9;
        }
        if (f8 <= f10) {
            f10 = f8;
        }
        if (Math.abs(f3 - f2) > 0.0f) {
            DrawScope.e1(drawScope, j, rn8.e((((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L)), rn8.e((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L)), f4, i, null, 0.0f, null, 0, 480, null);
        }
    }

    public static final ov5<Float> x() {
        return lr.e(lr.l(6000, 0, em3.e(), 2, null), null, 0L, 6, null);
    }

    public static final ov5<Float> y() {
        return lr.e(lr.f(new Function1() { // from class: com.google.android.eq9
            public final Object invoke(Object obj) {
                return gq9.s((zj6.b) obj);
            }
        }), null, 0L, 6, null);
    }

    public static final ov5<Float> z() {
        return lr.e(lr.f(new Function1() { // from class: com.google.android.fq9
            public final Object invoke(Object obj) {
                return gq9.t((zj6.b) obj);
            }
        }), null, 0L, 6, null);
    }
}
