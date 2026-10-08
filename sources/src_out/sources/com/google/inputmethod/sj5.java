package com.google.inputmethod;

import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.b;
import androidx.compose.ui.draw.i;
import androidx.compose.ui.graphics.h;
import androidx.compose.ui.graphics.l;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u000f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/google/android/pp5;", "imageVector", "", "contentDescription", "Landroidx/compose/ui/b;", "modifier", "Lcom/google/android/ei1;", "tint", "", "e", "(Lcom/google/android/pp5;Ljava/lang/String;Landroidx/compose/ui/b;JLandroidx/compose/runtime/d;II)V", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "d", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/b;JLandroidx/compose/runtime/d;II)V", "i", "(Landroidx/compose/ui/b;Landroidx/compose/ui/graphics/painter/Painter;)Landroidx/compose/ui/b;", "Lcom/google/android/tsb;", "", "j", "(J)Z", "a", "Landroidx/compose/ui/b;", "DefaultIconSizeModifier", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class sj5 {
    private static final b a = SizeKt.t(b.INSTANCE, avb.a.d());

    /* JADX WARN: Code duplicated, block: B:102:0x014d  */
    /* JADX WARN: Code duplicated, block: B:105:0x017e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0185  */
    /* JADX WARN: Code duplicated, block: B:110:0x0190  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:86:0x0101  */
    /* JADX WARN: Code duplicated, block: B:87:0x0105  */
    /* JADX WARN: Code duplicated, block: B:91:0x011c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0128  */
    /* JADX WARN: Code duplicated, block: B:94:0x012a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0139  */
    public static final void d(final Painter painter, final String str, b bVar, long j, d dVar, final int i, final int i2) {
        int i3;
        b bVar2;
        long j2;
        boolean z;
        final b bVar3;
        final long j3;
        s6b s6bVarH;
        b bVar4;
        long value;
        b bVar5;
        boolean z2;
        Object objR;
        long j4;
        b bVarD;
        boolean z3;
        Object objR2;
        int i4;
        d dVarF = dVar.F(-2142239481);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.T(painter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= dVarF.x(str) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                bVar2 = bVar;
                i3 |= dVarF.x(bVar2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                j2 = j;
                if ((i2 & 8) == 0 || !dVarF.D(j2)) {
                    i4 = 1024;
                } else {
                    i4 = 2048;
                }
                i3 |= i4;
            } else {
                j2 = j;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0 || dVarF.t()) {
                    if (i5 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i2 & 8) != 0) {
                        value = ((ei1) dVarF.v(cz1.a())).getValue();
                        i3 &= -7169;
                    } else {
                        value = j2;
                    }
                    bVar5 = bVar4;
                } else {
                    dVarF.q();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    long j5 = j2;
                    bVar5 = bVar2;
                    value = j5;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-2142239481, i3, -1, "androidx.compose.material3.Icon (Icon.kt:142)");
                }
                z2 = (((i3 & 7168) ^ 3072) <= 2048 && dVarF.D(value)) || (i3 & 3072) == 2048;
                objR = dVarF.R();
                if (!z2 || objR == d.INSTANCE.a()) {
                    if (ei1.r(value, ei1.INSTANCE.i())) {
                        j4 = value;
                        objR = null;
                    } else {
                        j4 = value;
                        objR = h.Companion.c(h.INSTANCE, j4, 0, 2, null);
                    }
                    dVarF.L(objR);
                } else {
                    j4 = value;
                }
                h hVar = (h) objR;
                if (str != null) {
                    dVarF.y(-536990979);
                    b.Companion companion = b.INSTANCE;
                    if ((i3 & 112) == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objR2 = dVarF.R();
                    if (z3 || objR2 == d.INSTANCE.a()) {
                        objR2 = new Function1() { // from class: com.google.android.pj5
                            public final Object invoke(Object obj) {
                                return sj5.g(str, (nfb) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    bVarD = afb.d(companion, false, (Function1) objR2, 1, null);
                    dVarF.u();
                } else {
                    dVarF.y(-536832197);
                    dVarF.u();
                    bVarD = b.INSTANCE;
                }
                j.b(i.b(i(l.h(bVar5), painter), painter, false, null, d02.INSTANCE.e(), 0.0f, hVar, 22, null).then(bVarD), dVarF, 0);
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar5;
                j3 = j4;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                j3 = j2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.qj5
                    public final Object invoke(Object obj, Object obj2) {
                        return sj5.h(painter, str, bVar3, j3, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        bVar2 = bVar;
        if ((i & 3072) == 0) {
            j2 = j;
            if ((i2 & 8) == 0) {
                i4 = 1024;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        } else {
            j2 = j;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (dVarF.g(z, i3 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if ((i2 & 8) != 0) {
                    value = ((ei1) dVarF.v(cz1.a())).getValue();
                    i3 &= -7169;
                } else {
                    value = j2;
                }
                bVar5 = bVar4;
            } else {
                if (i5 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if ((i2 & 8) != 0) {
                    value = ((ei1) dVarF.v(cz1.a())).getValue();
                    i3 &= -7169;
                } else {
                    value = j2;
                }
                bVar5 = bVar4;
            }
            dVarF.M();
            if (e.k()) {
                e.o(-2142239481, i3, -1, "androidx.compose.material3.Icon (Icon.kt:142)");
            }
            if (((i3 & 7168) ^ 3072) <= 2048) {
            }
            objR = dVarF.R();
            if (z2) {
                if (ei1.r(value, ei1.INSTANCE.i())) {
                    j4 = value;
                    objR = null;
                } else {
                    j4 = value;
                    objR = h.Companion.c(h.INSTANCE, j4, 0, 2, null);
                }
                dVarF.L(objR);
            } else {
                if (ei1.r(value, ei1.INSTANCE.i())) {
                    j4 = value;
                    objR = null;
                } else {
                    j4 = value;
                    objR = h.Companion.c(h.INSTANCE, j4, 0, 2, null);
                }
                dVarF.L(objR);
            }
            h hVar2 = (h) objR;
            if (str != null) {
                dVarF.y(-536990979);
                b.Companion companion2 = b.INSTANCE;
                if ((i3 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objR2 = dVarF.R();
                if (z3) {
                    objR2 = new Function1() { // from class: com.google.android.pj5
                        public final Object invoke(Object obj) {
                            return sj5.g(str, (nfb) obj);
                        }
                    };
                    dVarF.L(objR2);
                } else {
                    objR2 = new Function1() { // from class: com.google.android.pj5
                        public final Object invoke(Object obj) {
                            return sj5.g(str, (nfb) obj);
                        }
                    };
                    dVarF.L(objR2);
                }
                bVarD = afb.d(companion2, false, (Function1) objR2, 1, null);
                dVarF.u();
            } else {
                dVarF.y(-536832197);
                dVarF.u();
                bVarD = b.INSTANCE;
            }
            j.b(i.b(i(l.h(bVar5), painter), painter, false, null, d02.INSTANCE.e(), 0.0f, hVar2, 22, null).then(bVarD), dVarF, 0);
            if (e.k()) {
                e.n();
            }
            bVar3 = bVar5;
            j3 = j4;
        } else {
            dVarF.q();
            bVar3 = bVar2;
            j3 = j2;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.qj5
                public final Object invoke(Object obj, Object obj2) {
                    return sj5.h(painter, str, bVar3, j3, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:61:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final void e(final pp5 pp5Var, final String str, b bVar, long j, d dVar, final int i, final int i2) {
        int i3;
        String str2;
        final b bVar2;
        final long j2;
        boolean z;
        s6b s6bVarH;
        b bVar3;
        b bVar4;
        long value;
        d dVarF = dVar.F(-126890956);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.x(pp5Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 48) == 0) {
                i3 |= dVarF.x(str2) ? 32 : 16;
            }
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                bVar2 = bVar;
                i3 |= dVarF.x(bVar2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    j2 = j;
                    int i5 = dVarF.D(j2) ? 2048 : 1024;
                    i3 |= i5;
                } else {
                    j2 = j;
                }
                i3 |= i5;
            } else {
                j2 = j;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0 || dVarF.t()) {
                    if (i4 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        bVar4 = bVar3;
                        value = ((ei1) dVarF.v(cz1.a())).getValue();
                    } else {
                        bVar4 = bVar3;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-126890956, i3, -1, "androidx.compose.material3.Icon (Icon.kt:69)");
                    }
                    d(c3e.g(pp5Var, dVarF, i3 & 14), str2, bVar4, value, dVarF, VectorPainter.n | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                    if (e.k()) {
                        e.n();
                    }
                    bVar2 = bVar4;
                    j2 = value;
                } else {
                    dVarF.q();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    bVar4 = bVar2;
                }
                value = j2;
                dVarF.M();
                if (e.k()) {
                    e.o(-126890956, i3, -1, "androidx.compose.material3.Icon (Icon.kt:69)");
                }
                d(c3e.g(pp5Var, dVarF, i3 & 14), str2, bVar4, value, dVarF, VectorPainter.n | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                if (e.k()) {
                    e.n();
                }
                bVar2 = bVar4;
                j2 = value;
            } else {
                dVarF.q();
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.rj5
                    public final Object invoke(Object obj, Object obj2) {
                        return sj5.f(pp5Var, str, bVar2, j2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        bVar2 = bVar;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                j2 = j;
                if (dVarF.D(j2)) {
                }
                i3 |= i5;
            } else {
                j2 = j;
            }
            i3 |= i5;
        } else {
            j2 = j;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (dVarF.g(z, i3 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    bVar3 = b.INSTANCE;
                } else {
                    bVar3 = bVar2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    bVar4 = bVar3;
                    value = ((ei1) dVarF.v(cz1.a())).getValue();
                } else {
                    bVar4 = bVar3;
                    value = j2;
                }
            } else {
                if (i4 != 0) {
                    bVar3 = b.INSTANCE;
                } else {
                    bVar3 = bVar2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    bVar4 = bVar3;
                    value = ((ei1) dVarF.v(cz1.a())).getValue();
                } else {
                    bVar4 = bVar3;
                    value = j2;
                }
            }
            dVarF.M();
            if (e.k()) {
                e.o(-126890956, i3, -1, "androidx.compose.material3.Icon (Icon.kt:69)");
            }
            d(c3e.g(pp5Var, dVarF, i3 & 14), str2, bVar4, value, dVarF, VectorPainter.n | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
            if (e.k()) {
                e.n();
            }
            bVar2 = bVar4;
            j2 = value;
        } else {
            dVarF.q();
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.rj5
                public final Object invoke(Object obj, Object obj2) {
                    return sj5.f(pp5Var, str, bVar2, j2, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(pp5 pp5Var, String str, b bVar, long j, int i, int i2, d dVar, int i3) {
        e(pp5Var, str, bVar, j, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(String str, nfb nfbVar) {
        SemanticsPropertiesKt.b0(nfbVar, str);
        SemanticsPropertiesKt.p0(nfbVar, hpa.INSTANCE.e());
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Painter painter, String str, b bVar, long j, int i, int i2, d dVar, int i3) {
        d(painter, str, bVar, j, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    private static final b i(b bVar, Painter painter) {
        return bVar.then((tsb.h(painter.getIntrinsicSize(), tsb.INSTANCE.a()) || j(painter.getIntrinsicSize())) ? a : b.INSTANCE);
    }

    private static final boolean j(long j) {
        return Float.isInfinite(Float.intBitsToFloat((int) (j >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
