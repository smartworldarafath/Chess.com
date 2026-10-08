package com.google.inputmethod;

import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.b;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a-\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/b;", "modifier", "Lcom/google/android/ff3;", "thickness", "Lcom/google/android/ei1;", "color", "", "e", "(Landroidx/compose/ui/b;FJLandroidx/compose/runtime/d;II)V", "h", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ce3 {
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:81:0x0103  */
    /* JADX WARN: Code duplicated, block: B:84:0x010e  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    public static final void e(b bVar, float f, long j, d dVar, final int i, final int i2) {
        b bVar2;
        int i3;
        float f2;
        final long jA;
        boolean z;
        boolean z2;
        b bVar3;
        final float fB;
        s6b s6bVarH;
        boolean z3;
        boolean z4;
        Object objR;
        int i4;
        d dVarF = dVar.F(75144485);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            bVar2 = bVar;
        } else if ((i & 6) == 0) {
            bVar2 = bVar;
            i3 = (dVarF.x(bVar2) ? 4 : 2) | i;
        } else {
            bVar2 = bVar;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                f2 = f;
                i3 |= dVarF.B(f2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                jA = j;
                if ((i2 & 4) == 0 || !dVarF.D(jA)) {
                    i4 = 128;
                } else {
                    i4 = 256;
                }
                i3 |= i4;
            } else {
                jA = j;
            }
            z = true;
            if ((i3 & 147) != 146) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (dVarF.g(z2, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0 || dVarF.t()) {
                    if (i5 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i6 != 0) {
                        fB = xd3.a.b();
                    } else {
                        fB = f2;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        jA = xd3.a.a(dVarF, 6);
                    }
                } else {
                    dVarF.q();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    bVar3 = bVar2;
                    fB = f2;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(75144485, i3, -1, "androidx.compose.material3.HorizontalDivider (Divider.kt:53)");
                }
                b bVarI = SizeKt.i(SizeKt.h(bVar3, 0.0f, 1, null), fB);
                if ((i3 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((((i3 & 896) ^ 384) > 256 || !dVarF.D(jA)) && (i3 & 384) != 256) {
                }
                z4 = z3 | z;
                objR = dVarF.R();
                if (z4 || objR == d.INSTANCE.a()) {
                    objR = new Function1() { // from class: com.google.android.yd3
                        public final Object invoke(Object obj) {
                            return ce3.f(fB, jA, (DrawScope) obj);
                        }
                    };
                    dVarF.L(objR);
                }
                v51.b(bVarI, (Function1) objR, dVarF, 0);
                if (e.k()) {
                    e.n();
                }
            } else {
                dVarF.q();
                bVar3 = bVar2;
                fB = f2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                final b bVar4 = bVar3;
                final float f3 = fB;
                final long j2 = jA;
                s6bVarH.a(new Function2() { // from class: com.google.android.zd3
                    public final Object invoke(Object obj, Object obj2) {
                        return ce3.g(bVar4, f3, j2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 48;
        f2 = f;
        if ((i & 384) == 0) {
            jA = j;
            if ((i2 & 4) == 0) {
                i4 = 128;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        } else {
            jA = j;
        }
        z = true;
        if ((i3 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (dVarF.g(z2, i3 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    bVar3 = b.INSTANCE;
                } else {
                    bVar3 = bVar2;
                }
                if (i6 != 0) {
                    fB = xd3.a.b();
                } else {
                    fB = f2;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    jA = xd3.a.a(dVarF, 6);
                }
            } else {
                if (i5 != 0) {
                    bVar3 = b.INSTANCE;
                } else {
                    bVar3 = bVar2;
                }
                if (i6 != 0) {
                    fB = xd3.a.b();
                } else {
                    fB = f2;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    jA = xd3.a.a(dVarF, 6);
                }
            }
            dVarF.M();
            if (e.k()) {
                e.o(75144485, i3, -1, "androidx.compose.material3.HorizontalDivider (Divider.kt:53)");
            }
            b bVarI2 = SizeKt.i(SizeKt.h(bVar3, 0.0f, 1, null), fB);
            if ((i3 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            z = ((i3 & 896) ^ 384) > 256 ? false : false;
            z4 = z3 | z;
            objR = dVarF.R();
            if (z4) {
                objR = new Function1() { // from class: com.google.android.yd3
                    public final Object invoke(Object obj) {
                        return ce3.f(fB, jA, (DrawScope) obj);
                    }
                };
                dVarF.L(objR);
            } else {
                objR = new Function1() { // from class: com.google.android.yd3
                    public final Object invoke(Object obj) {
                        return ce3.f(fB, jA, (DrawScope) obj);
                    }
                };
                dVarF.L(objR);
            }
            v51.b(bVarI2, (Function1) objR, dVarF, 0);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
            bVar3 = bVar2;
            fB = f2;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            final b bVar5 = bVar3;
            final float f4 = fB;
            final long j3 = jA;
            s6bVarH.a(new Function2() { // from class: com.google.android.zd3
                public final Object invoke(Object obj, Object obj2) {
                    return ce3.g(bVar5, f4, j3, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(float f, long j, DrawScope drawScope) {
        float fX2 = drawScope.x2(f);
        float f2 = 2;
        DrawScope.e1(drawScope, j, rn8.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(drawScope.x2(f) / f2)) & 4294967295L)), rn8.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(drawScope.x2(f) / f2)) & 4294967295L)), fX2, 0, null, 0.0f, null, 0, 496, null);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(b bVar, float f, long j, int i, int i2, d dVar, int i3) {
        e(bVar, f, j, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:81:0x0103  */
    /* JADX WARN: Code duplicated, block: B:84:0x010e  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    public static final void h(b bVar, float f, long j, d dVar, final int i, final int i2) {
        b bVar2;
        int i3;
        float f2;
        final long jA;
        boolean z;
        boolean z2;
        b bVar3;
        final float fB;
        s6b s6bVarH;
        boolean z3;
        boolean z4;
        Object objR;
        int i4;
        d dVarF = dVar.F(-1534852205);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            bVar2 = bVar;
        } else if ((i & 6) == 0) {
            bVar2 = bVar;
            i3 = (dVarF.x(bVar2) ? 4 : 2) | i;
        } else {
            bVar2 = bVar;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                f2 = f;
                i3 |= dVarF.B(f2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                jA = j;
                if ((i2 & 4) == 0 || !dVarF.D(jA)) {
                    i4 = 128;
                } else {
                    i4 = 256;
                }
                i3 |= i4;
            } else {
                jA = j;
            }
            z = true;
            if ((i3 & 147) != 146) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (dVarF.g(z2, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0 || dVarF.t()) {
                    if (i5 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i6 != 0) {
                        fB = xd3.a.b();
                    } else {
                        fB = f2;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        jA = xd3.a.a(dVarF, 6);
                    }
                } else {
                    dVarF.q();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    bVar3 = bVar2;
                    fB = f2;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-1534852205, i3, -1, "androidx.compose.material3.VerticalDivider (Divider.kt:81)");
                }
                b bVarY = SizeKt.y(SizeKt.d(bVar3, 0.0f, 1, null), fB);
                if ((i3 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((((i3 & 896) ^ 384) > 256 || !dVarF.D(jA)) && (i3 & 384) != 256) {
                }
                z4 = z3 | z;
                objR = dVarF.R();
                if (z4 || objR == d.INSTANCE.a()) {
                    objR = new Function1() { // from class: com.google.android.ae3
                        public final Object invoke(Object obj) {
                            return ce3.i(fB, jA, (DrawScope) obj);
                        }
                    };
                    dVarF.L(objR);
                }
                v51.b(bVarY, (Function1) objR, dVarF, 0);
                if (e.k()) {
                    e.n();
                }
            } else {
                dVarF.q();
                bVar3 = bVar2;
                fB = f2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                final b bVar4 = bVar3;
                final float f3 = fB;
                final long j2 = jA;
                s6bVarH.a(new Function2() { // from class: com.google.android.be3
                    public final Object invoke(Object obj, Object obj2) {
                        return ce3.j(bVar4, f3, j2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 48;
        f2 = f;
        if ((i & 384) == 0) {
            jA = j;
            if ((i2 & 4) == 0) {
                i4 = 128;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        } else {
            jA = j;
        }
        z = true;
        if ((i3 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (dVarF.g(z2, i3 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    bVar3 = b.INSTANCE;
                } else {
                    bVar3 = bVar2;
                }
                if (i6 != 0) {
                    fB = xd3.a.b();
                } else {
                    fB = f2;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    jA = xd3.a.a(dVarF, 6);
                }
            } else {
                if (i5 != 0) {
                    bVar3 = b.INSTANCE;
                } else {
                    bVar3 = bVar2;
                }
                if (i6 != 0) {
                    fB = xd3.a.b();
                } else {
                    fB = f2;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    jA = xd3.a.a(dVarF, 6);
                }
            }
            dVarF.M();
            if (e.k()) {
                e.o(-1534852205, i3, -1, "androidx.compose.material3.VerticalDivider (Divider.kt:81)");
            }
            b bVarY2 = SizeKt.y(SizeKt.d(bVar3, 0.0f, 1, null), fB);
            if ((i3 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            z = ((i3 & 896) ^ 384) > 256 ? false : false;
            z4 = z3 | z;
            objR = dVarF.R();
            if (z4) {
                objR = new Function1() { // from class: com.google.android.ae3
                    public final Object invoke(Object obj) {
                        return ce3.i(fB, jA, (DrawScope) obj);
                    }
                };
                dVarF.L(objR);
            } else {
                objR = new Function1() { // from class: com.google.android.ae3
                    public final Object invoke(Object obj) {
                        return ce3.i(fB, jA, (DrawScope) obj);
                    }
                };
                dVarF.L(objR);
            }
            v51.b(bVarY2, (Function1) objR, dVarF, 0);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
            bVar3 = bVar2;
            fB = f2;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            final b bVar5 = bVar3;
            final float f4 = fB;
            final long j3 = jA;
            s6bVarH.a(new Function2() { // from class: com.google.android.be3
                public final Object invoke(Object obj, Object obj2) {
                    return ce3.j(bVar5, f4, j3, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(float f, long j, DrawScope drawScope) {
        float fX2 = drawScope.x2(f);
        float f2 = 2;
        DrawScope.e1(drawScope, j, rn8.e((((long) Float.floatToRawIntBits(drawScope.x2(f) / f2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)), rn8.e((((long) Float.floatToRawIntBits(drawScope.x2(f) / f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.d() & 4294967295L)))) & 4294967295L)), fX2, 0, null, 0.0f, null, 0, 496, null);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(b bVar, float f, long j, int i, int i2, d dVar, int i3) {
        h(bVar, f, j, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }
}
