package com.google.inputmethod;

import androidx.compose.p001foundation.BackgroundKt;
import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0016\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u001b²\u0006\f\u0010\u0019\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\u001a\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/google/android/pkc;", "", "<init>", "()V", "Landroidx/compose/ui/b;", "modifier", "Lcom/google/android/ff3;", "height", "Lcom/google/android/ei1;", "color", "", "b", "(Landroidx/compose/ui/b;FJLandroidx/compose/runtime/d;II)V", "F", "getScrollableTabRowMinTabWidth-D9Ej5fM", "()F", "ScrollableTabRowMinTabWidth", "c", "getScrollableTabRowEdgeStartPadding-D9Ej5fM", "ScrollableTabRowEdgeStartPadding", "d", "(Landroidx/compose/runtime/d;I)J", "secondaryContainerColor", "e", "secondaryContentColor", "currentTabWidth", "indicatorOffset", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class pkc {
    public static final pkc a = new pkc();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final float ScrollableTabRowMinTabWidth = ff3.i(90);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final float ScrollableTabRowEdgeStartPadding = ff3.i(52);

    private pkc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(pkc pkcVar, b bVar, float f, long j, int i, int i2, d dVar, int i3) {
        pkcVar.b(bVar, f, j, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b A[PHI: r2 r3 r4
  0x008b: PHI (r2v7 androidx.compose.ui.b) = (r2v4 androidx.compose.ui.b), (r2v9 androidx.compose.ui.b) binds: [B:58:0x009f, B:49:0x0089] A[DONT_GENERATE, DONT_INLINE]
  0x008b: PHI (r3v11 float) = (r3v7 float), (r3v12 float) binds: [B:58:0x009f, B:49:0x0089] A[DONT_GENERATE, DONT_INLINE]
  0x008b: PHI (r4v16 int) = (r4v9 int), (r4v17 int) binds: [B:58:0x009f, B:49:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00db  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public final void b(b bVar, float f, long j, d dVar, final int i, final int i2) {
        b bVar2;
        int i3;
        float f2;
        long j2;
        boolean z;
        final b bVar3;
        final float fB;
        final long j3;
        s6b s6bVarH;
        long jL;
        d dVarF = dVar.F(-1498258020);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            bVar2 = bVar;
        } else if ((i & 6) == 0) {
            bVar2 = bVar;
            i3 = (dVarF.x(bVar2) ? 4 : 2) | i;
        } else {
            bVar2 = bVar;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                f2 = f;
                i3 |= dVarF.B(f2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    j2 = j;
                    int i6 = dVarF.D(j2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    j2 = j;
                }
                i3 |= i6;
            } else {
                j2 = j;
            }
            if ((i3 & 147) != 146) {
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
                    if (i5 != 0) {
                        fB = mm9.a.b();
                    } else {
                        fB = f2;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        jL = bj1.l(mm9.a.a(), dVarF, 6);
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-1498258020, i3, -1, "androidx.compose.material3.TabRowDefaults.SecondaryIndicator (TabRow.kt:1081)");
                    }
                    j.b(BackgroundKt.d(SizeKt.i(SizeKt.h(bVar3, 0.0f, 1, null), fB), jL, null, 2, null), dVarF, 0);
                    if (e.k()) {
                        e.n();
                    }
                    j3 = jL;
                } else {
                    dVarF.q();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    bVar3 = bVar2;
                    fB = f2;
                }
                jL = j2;
                dVarF.M();
                if (e.k()) {
                    e.o(-1498258020, i3, -1, "androidx.compose.material3.TabRowDefaults.SecondaryIndicator (TabRow.kt:1081)");
                }
                j.b(BackgroundKt.d(SizeKt.i(SizeKt.h(bVar3, 0.0f, 1, null), fB), jL, null, 2, null), dVarF, 0);
                if (e.k()) {
                    e.n();
                }
                j3 = jL;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                fB = f2;
                j3 = j2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.okc
                    public final Object invoke(Object obj, Object obj2) {
                        return pkc.c(this.a, bVar3, fB, j3, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 48;
        f2 = f;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j2 = j;
                if (dVarF.D(j2)) {
                }
                i3 |= i6;
            } else {
                j2 = j;
            }
            i3 |= i6;
        } else {
            j2 = j;
        }
        if ((i3 & 147) != 146) {
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
                if (i5 != 0) {
                    fB = mm9.a.b();
                } else {
                    fB = f2;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    jL = bj1.l(mm9.a.a(), dVarF, 6);
                } else {
                    jL = j2;
                }
            } else {
                if (i4 != 0) {
                    bVar3 = b.INSTANCE;
                } else {
                    bVar3 = bVar2;
                }
                if (i5 != 0) {
                    fB = mm9.a.b();
                } else {
                    fB = f2;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    jL = bj1.l(mm9.a.a(), dVarF, 6);
                } else {
                    jL = j2;
                }
            }
            dVarF.M();
            if (e.k()) {
                e.o(-1498258020, i3, -1, "androidx.compose.material3.TabRowDefaults.SecondaryIndicator (TabRow.kt:1081)");
            }
            j.b(BackgroundKt.d(SizeKt.i(SizeKt.h(bVar3, 0.0f, 1, null), fB), jL, null, 2, null), dVarF, 0);
            if (e.k()) {
                e.n();
            }
            j3 = jL;
        } else {
            dVarF.q();
            bVar3 = bVar2;
            fB = f2;
            j3 = j2;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.okc
                public final Object invoke(Object obj, Object obj2) {
                    return pkc.c(this.a, bVar3, fB, j3, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final long d(d dVar, int i) {
        if (e.k()) {
            e.o(-1938007129, i, -1, "androidx.compose.material3.TabRowDefaults.<get-secondaryContainerColor> (TabRow.kt:1002)");
        }
        long jL = bj1.l(obb.a.b(), dVar, 6);
        if (e.k()) {
            e.n();
        }
        return jL;
    }

    public final long e(d dVar, int i) {
        if (e.k()) {
            e.o(1166419479, i, -1, "androidx.compose.material3.TabRowDefaults.<get-secondaryContentColor> (TabRow.kt:1018)");
        }
        long jL = bj1.l(obb.a.a(), dVar, 6);
        if (e.k()) {
            e.n();
        }
        return jL;
    }
}
