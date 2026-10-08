package com.google.inputmethod;

import androidx.compose.p000animation.CrossfadeKt;
import androidx.compose.p001foundation.BackgroundKt;
import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p002material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.draw.c;
import androidx.compose.ui.graphics.m;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.ps4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b!\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\n2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016JG\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010!\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0017\u0010&\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010)\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R\u0017\u0010,\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R\u0017\u0010.\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0018\u0010#\u001a\u0004\b-\u0010%R\u0011\u00101\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u00103\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b2\u00100¨\u00064"}, d2 = {"Lcom/google/android/vt9;", "", "<init>", "()V", "Lcom/google/android/eu9;", "state", "", "isRefreshing", "Landroidx/compose/ui/b;", "modifier", "Lcom/google/android/ff3;", "maxDistance", "Lcom/google/android/xkb;", "shape", "Lcom/google/android/ei1;", "containerColor", "elevation", "Lkotlin/Function1;", "Lcom/google/android/mt0;", "", "content", "h", "(Lcom/google/android/eu9;ZLandroidx/compose/ui/b;FLcom/google/android/xkb;JFLcom/google/android/ps4;Landroidx/compose/runtime/d;II)V", "color", "g", "(Lcom/google/android/eu9;ZLandroidx/compose/ui/b;JJFLandroidx/compose/runtime/d;II)V", "b", "Lcom/google/android/xkb;", "getShape", "()Lcom/google/android/xkb;", "getShape$annotations", "c", "getIndicatorShape", "indicatorShape", "d", "F", "q", "()F", "PositionalThreshold", "e", "getIndicatorMaxDistance-D9Ej5fM", "IndicatorMaxDistance", "f", "getElevation-D9Ej5fM", "Elevation", "getLoadingIndicatorElevation-D9Ej5fM", "LoadingIndicatorElevation", "p", "(Landroidx/compose/runtime/d;I)J", "indicatorContainerColor", "o", "indicatorColor", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class vt9 {
    public static final vt9 a = new vt9();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final xkb shape = lqa.g();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final xkb indicatorShape = lqa.g();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final float PositionalThreshold;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final float IndicatorMaxDistance;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final float Elevation;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final float LoadingIndicatorElevation;
    public static final int h = 0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements ps4<mt0, d, Integer, Unit> {
        final /* synthetic */ boolean a;
        final /* synthetic */ long b;
        final /* synthetic */ eu9 c;

        /* JADX INFO: renamed from: com.google.android.vt9$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class C0128a implements ps4<Boolean, d, Integer, Unit> {
            final /* synthetic */ long a;
            final /* synthetic */ eu9 b;

            C0128a(long j, eu9 eu9Var) {
                this.a = j;
                this.b = eu9Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final float c(eu9 eu9Var) {
                return eu9Var.a();
            }

            public final void b(boolean z, d dVar, int i) {
                if ((i & 6) == 0) {
                    i |= dVar.A(z) ? 4 : 2;
                }
                if (!dVar.g((i & 19) != 18, i & 1)) {
                    dVar.q();
                    return;
                }
                if (e.k()) {
                    e.o(-2064098104, i, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator.<anonymous>.<anonymous> (PullToRefresh.kt:528)");
                }
                if (z) {
                    dVar.y(-499784343);
                    gq9.j(SizeKt.t(b.INSTANCE, du9.u()), this.a, du9.a, 0L, 0, 0.0f, dVar, 390, 56);
                    dVar.u();
                } else {
                    dVar.y(-499540745);
                    boolean zX = dVar.x(this.b);
                    final eu9 eu9Var = this.b;
                    Object objR = dVar.R();
                    if (zX || objR == d.INSTANCE.a()) {
                        objR = new hh4() { // from class: com.google.android.ut9
                            @Override // com.google.inputmethod.hh4
                            public final float invoke() {
                                return vt9.a.C0128a.c(eu9Var);
                            }
                        };
                        dVar.L(objR);
                    }
                    du9.h((hh4) objR, this.a, dVar, 0);
                    dVar.u();
                }
                if (e.k()) {
                    e.n();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b(((Boolean) obj).booleanValue(), (d) obj2, ((Number) obj3).intValue());
                return Unit.a;
            }
        }

        a(boolean z, long j, eu9 eu9Var) {
            this.a = z;
            this.b = j;
            this.c = eu9Var;
        }

        public final void a(mt0 mt0Var, d dVar, int i) {
            if (!dVar.g((i & 17) != 16, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(298232649, i, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator.<anonymous> (PullToRefresh.kt:524)");
            }
            CrossfadeKt.b(Boolean.valueOf(this.a), null, d08.b(MotionSchemeKeyTokens.DefaultEffects, dVar, 6), null, ko1.e(-2064098104, true, new C0128a(this.b, this.c), dVar, 54), dVar, 24576, 10);
            if (e.k()) {
                e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((mt0) obj, (d) obj2, ((Number) obj3).intValue());
            return Unit.a;
        }
    }

    static {
        float fI = ff3.i(80);
        PositionalThreshold = fI;
        IndicatorMaxDistance = fI;
        go3 go3Var = go3.a;
        Elevation = go3Var.c();
        LoadingIndicatorElevation = go3Var.a();
    }

    private vt9() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(fz1 fz1Var) {
        int iB = gf1.INSTANCE.b();
        vg3 drawContext = fz1Var.getDrawContext();
        long jD = drawContext.d();
        drawContext.b().v();
        try {
            drawContext.getTransform().b(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, iB);
            fz1Var.j1();
            return Unit.a;
        } finally {
            drawContext.b().o();
            drawContext.c(jD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fj7 j(final eu9 eu9Var, final boolean z, final float f, final float f2, final xkb xkbVar, j jVar, dj7 dj7Var, kx1 kx1Var) {
        final o oVarR0 = dj7Var.r0(kx1Var.getValue());
        return j.Q1(jVar, oVarR0.getWidth(), oVarR0.getHeight(), null, new Function1() { // from class: com.google.android.st9
            public final Object invoke(Object obj) {
                return vt9.k(oVarR0, eu9Var, z, f, f2, xkbVar, (o.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(o oVar, final eu9 eu9Var, final boolean z, final float f, final float f2, final xkb xkbVar, o.a aVar) {
        o.a.d0(aVar, oVar, 0, 0, 0.0f, new Function1() { // from class: com.google.android.tt9
            public final Object invoke(Object obj) {
                return vt9.l(eu9Var, z, f, f2, xkbVar, (m) obj);
            }
        }, 4, null);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(eu9 eu9Var, boolean z, float f, float f2, xkb xkbVar, m mVar) {
        boolean z2 = eu9Var.a() > 0.0f || z;
        mVar.setTranslationY((eu9Var.a() * mVar.O1(f)) - Float.intBitsToFloat((int) (mVar.getSize() & 4294967295L)));
        mVar.s(z2 ? mVar.x2(f2) : 0.0f);
        mVar.R0(xkbVar);
        mVar.l(true);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(vt9 vt9Var, eu9 eu9Var, boolean z, b bVar, float f, xkb xkbVar, long j, float f2, ps4 ps4Var, int i, int i2, d dVar, int i3) {
        vt9Var.h(eu9Var, z, bVar, f, xkbVar, j, f2, ps4Var, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(vt9 vt9Var, eu9 eu9Var, boolean z, b bVar, long j, long j2, float f, int i, int i2, d dVar, int i3) {
        vt9Var.g(eu9Var, z, bVar, j, j2, f, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x010f  */
    /* JADX WARN: Code duplicated, block: B:103:0x011a  */
    /* JADX WARN: Code duplicated, block: B:106:0x011f  */
    /* JADX WARN: Code duplicated, block: B:109:0x012d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0135  */
    /* JADX WARN: Code duplicated, block: B:114:0x0141  */
    /* JADX WARN: Code duplicated, block: B:117:0x0181  */
    /* JADX WARN: Code duplicated, block: B:119:0x0189  */
    /* JADX WARN: Code duplicated, block: B:122:0x0195  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x0097  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:97:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0107  */
    /* JADX WARN: Code duplicated, block: B:99:0x010a  */
    public final void g(final eu9 eu9Var, final boolean z, b bVar, long j, long j2, float f, d dVar, final int i, final int i2) {
        int i3;
        b bVar2;
        long j3;
        long jO;
        final float f2;
        int i4;
        boolean z2;
        final b bVar3;
        final long j4;
        final long j5;
        s6b s6bVarH;
        b bVar4;
        long jP;
        int i5;
        float f3;
        long j6;
        int i6;
        d dVarF = dVar.F(-1076870256);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.x(eu9Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= dVarF.A(z) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                bVar2 = bVar;
                i3 |= dVarF.x(bVar2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    j3 = j;
                    int i8 = dVarF.D(j3) ? 2048 : 1024;
                    i3 |= i8;
                } else {
                    j3 = j;
                }
                i3 |= i8;
            } else {
                j3 = j;
            }
            if ((i & 24576) == 0) {
                jO = j2;
                if ((i2 & 16) == 0 || !dVarF.D(jO)) {
                    i6 = 8192;
                } else {
                    i6 = 16384;
                }
                i3 |= i6;
            } else {
                jO = j2;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    f2 = f;
                    int i9 = dVarF.B(f2) ? 131072 : 65536;
                    i3 |= i9;
                } else {
                    f2 = f;
                }
                i3 |= i9;
            } else {
                f2 = f;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (dVarF.x(this)) {
                    i4 = 1048576;
                } else {
                    i4 = 524288;
                }
                i3 |= i4;
            }
            if ((599187 & i3) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (dVarF.g(z2, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0 || dVarF.t()) {
                    if (i7 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i2 & 8) != 0) {
                        jP = p(dVarF, (i3 >> 18) & 14);
                        i3 &= -7169;
                    } else {
                        jP = j3;
                    }
                    if ((i2 & 16) != 0) {
                        jO = o(dVarF, (i3 >> 18) & 14);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i5 = i3 & (-458753);
                        f3 = IndicatorMaxDistance;
                    } else {
                        i5 = i3;
                        f3 = f2;
                    }
                    j6 = jO;
                } else {
                    dVarF.q();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    bVar4 = bVar2;
                    jP = j3;
                    j6 = jO;
                    i5 = i3;
                    f3 = f2;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-1076870256, i5, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator (PullToRefresh.kt:515)");
                }
                int i10 = (i5 & 14) | 12582912 | (i5 & 112) | (i5 & 896) | ((i5 >> 6) & 7168);
                int i11 = i5 << 6;
                int i12 = i10 | (458752 & i11) | (i11 & 234881024);
                b bVar5 = bVar4;
                h(eu9Var, z, bVar5, f3, null, jP, 0.0f, ko1.e(298232649, true, new a(z, j6, eu9Var), dVarF, 54), dVarF, i12, 80);
                if (e.k()) {
                    e.n();
                }
                f2 = f3;
                j4 = jP;
                j5 = j6;
                bVar3 = bVar5;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                j4 = j3;
                j5 = jO;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.ot9
                    public final Object invoke(Object obj, Object obj2) {
                        return vt9.n(this.a, eu9Var, z, bVar3, j4, j5, f2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        bVar2 = bVar;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                j3 = j;
                if (dVarF.D(j3)) {
                }
                i3 |= i8;
            } else {
                j3 = j;
            }
            i3 |= i8;
        } else {
            j3 = j;
        }
        if ((i & 24576) == 0) {
            jO = j2;
            if ((i2 & 16) == 0) {
                i6 = 8192;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        } else {
            jO = j2;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                f2 = f;
                if (dVarF.B(f2)) {
                }
                i3 |= i9;
            } else {
                f2 = f;
            }
            i3 |= i9;
        } else {
            f2 = f;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (dVarF.x(this)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i3 |= i4;
        }
        if ((599187 & i3) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (dVarF.g(z2, i3 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if ((i2 & 8) != 0) {
                    jP = p(dVarF, (i3 >> 18) & 14);
                    i3 &= -7169;
                } else {
                    jP = j3;
                }
                if ((i2 & 16) != 0) {
                    jO = o(dVarF, (i3 >> 18) & 14);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i5 = i3 & (-458753);
                    f3 = IndicatorMaxDistance;
                } else {
                    i5 = i3;
                    f3 = f2;
                }
                j6 = jO;
            } else {
                if (i7 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if ((i2 & 8) != 0) {
                    jP = p(dVarF, (i3 >> 18) & 14);
                    i3 &= -7169;
                } else {
                    jP = j3;
                }
                if ((i2 & 16) != 0) {
                    jO = o(dVarF, (i3 >> 18) & 14);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i5 = i3 & (-458753);
                    f3 = IndicatorMaxDistance;
                } else {
                    i5 = i3;
                    f3 = f2;
                }
                j6 = jO;
            }
            dVarF.M();
            if (e.k()) {
                e.o(-1076870256, i5, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator (PullToRefresh.kt:515)");
            }
            int i13 = (i5 & 14) | 12582912 | (i5 & 112) | (i5 & 896) | ((i5 >> 6) & 7168);
            int i14 = i5 << 6;
            int i15 = i13 | (458752 & i14) | (i14 & 234881024);
            b bVar6 = bVar4;
            h(eu9Var, z, bVar6, f3, null, jP, 0.0f, ko1.e(298232649, true, new a(z, j6, eu9Var), dVarF, 54), dVarF, i15, 80);
            if (e.k()) {
                e.n();
            }
            f2 = f3;
            j4 = jP;
            j5 = j6;
            bVar3 = bVar6;
        } else {
            dVarF.q();
            bVar3 = bVar2;
            j4 = j3;
            j5 = jO;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.ot9
                public final Object invoke(Object obj, Object obj2) {
                    return vt9.n(this.a, eu9Var, z, bVar3, j4, j5, f2, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0117  */
    /* JADX WARN: Code duplicated, block: B:101:0x011a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0123  */
    /* JADX WARN: Code duplicated, block: B:106:0x012a  */
    /* JADX WARN: Code duplicated, block: B:119:0x014d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x014f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0156  */
    /* JADX WARN: Code duplicated, block: B:126:0x015f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0167  */
    /* JADX WARN: Code duplicated, block: B:129:0x016b  */
    /* JADX WARN: Code duplicated, block: B:132:0x0175  */
    /* JADX WARN: Code duplicated, block: B:135:0x0185  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:149:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:159:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:165:0x0208  */
    /* JADX WARN: Code duplicated, block: B:167:0x020e  */
    /* JADX WARN: Code duplicated, block: B:173:0x021d  */
    /* JADX WARN: Code duplicated, block: B:175:0x0223  */
    /* JADX WARN: Code duplicated, block: B:178:0x026e  */
    /* JADX WARN: Code duplicated, block: B:181:0x027a  */
    /* JADX WARN: Code duplicated, block: B:182:0x027e  */
    /* JADX WARN: Code duplicated, block: B:185:0x029f  */
    /* JADX WARN: Code duplicated, block: B:187:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:190:0x02da  */
    /* JADX WARN: Code duplicated, block: B:193:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:196:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:95:0x0104  */
    /* JADX WARN: Code duplicated, block: B:96:0x0107  */
    public final void h(final eu9 eu9Var, final boolean z, b bVar, float f, xkb xkbVar, long j, float f2, final ps4<? super mt0, ? super d, ? super Integer, Unit> ps4Var, d dVar, final int i, final int i2) {
        int i3;
        int i4;
        b bVar2;
        int i5;
        float f3;
        int i6;
        long jI;
        int i7;
        float f4;
        int i8;
        int i9;
        boolean z2;
        boolean z3;
        final xkb xkbVar2;
        final b bVar3;
        final float f5;
        final long j2;
        final float f6;
        s6b s6bVarH;
        xkb xkbVar3;
        Object objR;
        d.Companion companion;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objR2;
        int iA;
        Function0<ComposeUiNode> function0B;
        d dVarC;
        Function2<ComposeUiNode, Integer, Unit> function2C;
        int i10;
        d dVarF = dVar.F(-1341144489);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.x(eu9Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 48) == 0) {
                i3 |= dVarF.A(z) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    bVar2 = bVar;
                    if (dVarF.x(bVar2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        f3 = f;
                        int i11 = dVarF.B(f3) ? 2048 : 1024;
                        i3 |= i11;
                    } else {
                        f3 = f;
                    }
                    i3 |= i11;
                } else {
                    f3 = f;
                }
                if ((i & 24576) != 0) {
                    i3 |= ((i2 & 16) == 0 || !dVarF.x(xkbVar)) ? 8192 : 16384;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    i3 |= 196608;
                    jI = j;
                } else {
                    jI = j;
                    if ((i & 196608) == 0) {
                        if (dVarF.D(jI)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                }
                if ((i & 1572864) == 0) {
                    f4 = f2;
                    if ((i2 & 64) == 0 || !dVarF.B(f4)) {
                        i10 = 524288;
                    } else {
                        i10 = 1048576;
                    }
                    i3 |= i10;
                } else {
                    f4 = f2;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                if ((i2 & 256) != 0) {
                    if ((100663296 & i) == 0) {
                        if (dVarF.x(this)) {
                            i9 = 67108864;
                        } else {
                            i9 = 33554432;
                        }
                        i3 |= i9;
                    }
                    z2 = true;
                    if ((i3 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i3 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0 || dVarF.t()) {
                            if (i4 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                f3 = IndicatorMaxDistance;
                            }
                            if ((i2 & 16) != 0) {
                                xkbVar3 = indicatorShape;
                                i3 = (-57345) & i3;
                            } else {
                                xkbVar3 = xkbVar;
                            }
                            if (i6 != 0) {
                                jI = ei1.INSTANCE.i();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                f4 = Elevation;
                            }
                        } else {
                            dVarF.q();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            xkbVar3 = xkbVar;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(-1341144489, i3, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox (PullToRefresh.kt:456)");
                        }
                        b bVarT = SizeKt.t(bVar2, du9.t());
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = new Function1() { // from class: com.google.android.pt9
                                public final Object invoke(Object obj) {
                                    return vt9.i((fz1) obj);
                                }
                            };
                            dVarF.L(objR);
                        }
                        b bVarD = c.d(bVarT, (Function1) objR);
                        if ((i3 & 14) == 4) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        boolean z7 = z4;
                        if ((i3 & 112) == 32) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        boolean z8 = z7 | z5 | ((((i3 & 7168) ^ 3072) <= 2048 && dVarF.B(f3)) || (i3 & 3072) == 2048) | ((((3670016 & i3) ^ 1572864) <= 1048576 && dVarF.B(f4)) || (i3 & 1572864) == 1048576);
                        if ((((57344 & i3) ^ 24576) > 16384 || !dVarF.x(xkbVar3)) && (i3 & 24576) != 16384) {
                        }
                        z6 = z8 | z2;
                        objR2 = dVarF.R();
                        if (z6 || objR2 == companion.a()) {
                            final xkb xkbVar4 = xkbVar3;
                            final float f7 = f3;
                            final float f8 = f4;
                            objR2 = new ps4() { // from class: com.google.android.qt9
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    return vt9.j(eu9Var, z, f7, f8, xkbVar4, (j) obj, (dj7) obj2, (kx1) obj3);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        b bVarC = BackgroundKt.c(zn6.a(bVarD, (ps4) objR2), jI, xkbVar3);
                        int i12 = ((i3 >> 12) & 7168) | 48;
                        ej7 ej7VarI = androidx.compose.p001foundation.layout.j.i(tc.INSTANCE.e(), false);
                        iA = pp1.a(dVarF, 0);
                        gs1 gs1VarJ = dVarF.j();
                        b bVarE = ComposedModifierKt.e(dVarF, bVarC);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        xkb xkbVar5 = xkbVar3;
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
                        dVarC = dud.c(dVarF);
                        dud.i(dVarC, ej7VarI, companion2.d());
                        dud.i(dVarC, gs1VarJ, companion2.f());
                        function2C = companion2.c();
                        if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                            dVarC.L(Integer.valueOf(iA));
                            dVarC.e(Integer.valueOf(iA), function2C);
                        }
                        dud.i(dVarC, bVarE, companion2.e());
                        ps4Var.invoke(BoxScopeInstance.a, dVarF, Integer.valueOf(((i12 >> 6) & 112) | 6));
                        dVarF.m();
                        if (e.k()) {
                            e.n();
                        }
                        xkbVar2 = xkbVar5;
                    } else {
                        dVarF.q();
                        xkbVar2 = xkbVar;
                    }
                    bVar3 = bVar2;
                    f5 = f3;
                    j2 = jI;
                    f6 = f4;
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.rt9
                            public final Object invoke(Object obj, Object obj2) {
                                return vt9.m(this.a, eu9Var, z, bVar3, f5, xkbVar2, j2, f6, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 100663296;
                z2 = true;
                if ((i3 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            f3 = IndicatorMaxDistance;
                        }
                        if ((i2 & 16) != 0) {
                            xkbVar3 = indicatorShape;
                            i3 = (-57345) & i3;
                        } else {
                            xkbVar3 = xkbVar;
                        }
                        if (i6 != 0) {
                            jI = ei1.INSTANCE.i();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            f4 = Elevation;
                        }
                    } else {
                        if (i4 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            f3 = IndicatorMaxDistance;
                        }
                        if ((i2 & 16) != 0) {
                            xkbVar3 = indicatorShape;
                            i3 = (-57345) & i3;
                        } else {
                            xkbVar3 = xkbVar;
                        }
                        if (i6 != 0) {
                            jI = ei1.INSTANCE.i();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            f4 = Elevation;
                        }
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-1341144489, i3, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox (PullToRefresh.kt:456)");
                    }
                    b bVarT2 = SizeKt.t(bVar2, du9.t());
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = new Function1() { // from class: com.google.android.pt9
                            public final Object invoke(Object obj) {
                                return vt9.i((fz1) obj);
                            }
                        };
                        dVarF.L(objR);
                    }
                    b bVarD2 = c.d(bVarT2, (Function1) objR);
                    if ((i3 & 14) == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z9 = z4;
                    if ((i3 & 112) == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean z10 = z9 | z5 | ((((i3 & 7168) ^ 3072) <= 2048 && dVarF.B(f3)) || (i3 & 3072) == 2048) | ((((3670016 & i3) ^ 1572864) <= 1048576 && dVarF.B(f4)) || (i3 & 1572864) == 1048576);
                    z2 = ((57344 & i3) ^ 24576) > 16384 ? false : false;
                    z6 = z10 | z2;
                    objR2 = dVarF.R();
                    if (z6) {
                        final xkb xkbVar6 = xkbVar3;
                        final float f9 = f3;
                        final float f10 = f4;
                        objR2 = new ps4() { // from class: com.google.android.qt9
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                return vt9.j(eu9Var, z, f9, f10, xkbVar6, (j) obj, (dj7) obj2, (kx1) obj3);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        final xkb xkbVar7 = xkbVar3;
                        final float f11 = f3;
                        final float f12 = f4;
                        objR2 = new ps4() { // from class: com.google.android.qt9
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                return vt9.j(eu9Var, z, f11, f12, xkbVar7, (j) obj, (dj7) obj2, (kx1) obj3);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    b bVarC2 = BackgroundKt.c(zn6.a(bVarD2, (ps4) objR2), jI, xkbVar3);
                    int i13 = ((i3 >> 12) & 7168) | 48;
                    ej7 ej7VarI2 = androidx.compose.p001foundation.layout.j.i(tc.INSTANCE.e(), false);
                    iA = pp1.a(dVarF, 0);
                    gs1 gs1VarJ2 = dVarF.j();
                    b bVarE2 = ComposedModifierKt.e(dVarF, bVarC2);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    xkb xkbVar8 = xkbVar3;
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
                    dVarC = dud.c(dVarF);
                    dud.i(dVarC, ej7VarI2, companion3.d());
                    dud.i(dVarC, gs1VarJ2, companion3.f());
                    function2C = companion3.c();
                    if (dVarC.getInserting()) {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    } else {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    }
                    dud.i(dVarC, bVarE2, companion3.e());
                    ps4Var.invoke(BoxScopeInstance.a, dVarF, Integer.valueOf(((i13 >> 6) & 112) | 6));
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                    xkbVar2 = xkbVar8;
                } else {
                    dVarF.q();
                    xkbVar2 = xkbVar;
                }
                bVar3 = bVar2;
                f5 = f3;
                j2 = jI;
                f6 = f4;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.rt9
                        public final Object invoke(Object obj, Object obj2) {
                            return vt9.m(this.a, eu9Var, z, bVar3, f5, xkbVar2, j2, f6, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 384;
            bVar2 = bVar;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    f3 = f;
                    if (dVarF.B(f3)) {
                    }
                    i3 |= i11;
                } else {
                    f3 = f;
                }
                i3 |= i11;
            } else {
                f3 = f;
            }
            if ((i & 24576) != 0) {
                i3 |= ((i2 & 16) == 0 || !dVarF.x(xkbVar)) ? 8192 : 16384;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= 196608;
                jI = j;
            } else {
                jI = j;
                if ((i & 196608) == 0) {
                    if (dVarF.D(jI)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
            }
            if ((i & 1572864) == 0) {
                f4 = f2;
                if ((i2 & 64) == 0) {
                    i10 = 524288;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            } else {
                f4 = f2;
            }
            if ((i2 & 128) != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (dVarF.T(ps4Var)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i3 |= i8;
            }
            if ((i2 & 256) != 0) {
                if ((100663296 & i) == 0) {
                    if (dVarF.x(this)) {
                        i9 = 67108864;
                    } else {
                        i9 = 33554432;
                    }
                    i3 |= i9;
                }
                z2 = true;
                if ((i3 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            f3 = IndicatorMaxDistance;
                        }
                        if ((i2 & 16) != 0) {
                            xkbVar3 = indicatorShape;
                            i3 = (-57345) & i3;
                        } else {
                            xkbVar3 = xkbVar;
                        }
                        if (i6 != 0) {
                            jI = ei1.INSTANCE.i();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            f4 = Elevation;
                        }
                    } else {
                        if (i4 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            f3 = IndicatorMaxDistance;
                        }
                        if ((i2 & 16) != 0) {
                            xkbVar3 = indicatorShape;
                            i3 = (-57345) & i3;
                        } else {
                            xkbVar3 = xkbVar;
                        }
                        if (i6 != 0) {
                            jI = ei1.INSTANCE.i();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            f4 = Elevation;
                        }
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-1341144489, i3, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox (PullToRefresh.kt:456)");
                    }
                    b bVarT3 = SizeKt.t(bVar2, du9.t());
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = new Function1() { // from class: com.google.android.pt9
                            public final Object invoke(Object obj) {
                                return vt9.i((fz1) obj);
                            }
                        };
                        dVarF.L(objR);
                    }
                    b bVarD3 = c.d(bVarT3, (Function1) objR);
                    if ((i3 & 14) == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z11 = z4;
                    if ((i3 & 112) == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean z12 = z11 | z5 | ((((i3 & 7168) ^ 3072) <= 2048 && dVarF.B(f3)) || (i3 & 3072) == 2048) | ((((3670016 & i3) ^ 1572864) <= 1048576 && dVarF.B(f4)) || (i3 & 1572864) == 1048576);
                    if (((57344 & i3) ^ 24576) > 16384) {
                    }
                    z6 = z12 | z2;
                    objR2 = dVarF.R();
                    if (z6) {
                        final xkb xkbVar9 = xkbVar3;
                        final float f13 = f3;
                        final float f14 = f4;
                        objR2 = new ps4() { // from class: com.google.android.qt9
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                return vt9.j(eu9Var, z, f13, f14, xkbVar9, (j) obj, (dj7) obj2, (kx1) obj3);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        final xkb xkbVar10 = xkbVar3;
                        final float f15 = f3;
                        final float f16 = f4;
                        objR2 = new ps4() { // from class: com.google.android.qt9
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                return vt9.j(eu9Var, z, f15, f16, xkbVar10, (j) obj, (dj7) obj2, (kx1) obj3);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    b bVarC3 = BackgroundKt.c(zn6.a(bVarD3, (ps4) objR2), jI, xkbVar3);
                    int i14 = ((i3 >> 12) & 7168) | 48;
                    ej7 ej7VarI3 = androidx.compose.p001foundation.layout.j.i(tc.INSTANCE.e(), false);
                    iA = pp1.a(dVarF, 0);
                    gs1 gs1VarJ3 = dVarF.j();
                    b bVarE3 = ComposedModifierKt.e(dVarF, bVarC3);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    xkb xkbVar11 = xkbVar3;
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
                    dVarC = dud.c(dVarF);
                    dud.i(dVarC, ej7VarI3, companion4.d());
                    dud.i(dVarC, gs1VarJ3, companion4.f());
                    function2C = companion4.c();
                    if (dVarC.getInserting()) {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    } else {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    }
                    dud.i(dVarC, bVarE3, companion4.e());
                    ps4Var.invoke(BoxScopeInstance.a, dVarF, Integer.valueOf(((i14 >> 6) & 112) | 6));
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                    xkbVar2 = xkbVar11;
                } else {
                    dVarF.q();
                    xkbVar2 = xkbVar;
                }
                bVar3 = bVar2;
                f5 = f3;
                j2 = jI;
                f6 = f4;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.rt9
                        public final Object invoke(Object obj, Object obj2) {
                            return vt9.m(this.a, eu9Var, z, bVar3, f5, xkbVar2, j2, f6, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 100663296;
            z2 = true;
            if ((i3 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        f3 = IndicatorMaxDistance;
                    }
                    if ((i2 & 16) != 0) {
                        xkbVar3 = indicatorShape;
                        i3 = (-57345) & i3;
                    } else {
                        xkbVar3 = xkbVar;
                    }
                    if (i6 != 0) {
                        jI = ei1.INSTANCE.i();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        f4 = Elevation;
                    }
                } else {
                    if (i4 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        f3 = IndicatorMaxDistance;
                    }
                    if ((i2 & 16) != 0) {
                        xkbVar3 = indicatorShape;
                        i3 = (-57345) & i3;
                    } else {
                        xkbVar3 = xkbVar;
                    }
                    if (i6 != 0) {
                        jI = ei1.INSTANCE.i();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        f4 = Elevation;
                    }
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-1341144489, i3, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox (PullToRefresh.kt:456)");
                }
                b bVarT4 = SizeKt.t(bVar2, du9.t());
                objR = dVarF.R();
                companion = d.INSTANCE;
                if (objR == companion.a()) {
                    objR = new Function1() { // from class: com.google.android.pt9
                        public final Object invoke(Object obj) {
                            return vt9.i((fz1) obj);
                        }
                    };
                    dVarF.L(objR);
                }
                b bVarD4 = c.d(bVarT4, (Function1) objR);
                if ((i3 & 14) == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z13 = z4;
                if ((i3 & 112) == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z14 = z13 | z5 | ((((i3 & 7168) ^ 3072) <= 2048 && dVarF.B(f3)) || (i3 & 3072) == 2048) | ((((3670016 & i3) ^ 1572864) <= 1048576 && dVarF.B(f4)) || (i3 & 1572864) == 1048576);
                if (((57344 & i3) ^ 24576) > 16384) {
                }
                z6 = z14 | z2;
                objR2 = dVarF.R();
                if (z6) {
                    final xkb xkbVar12 = xkbVar3;
                    final float f17 = f3;
                    final float f18 = f4;
                    objR2 = new ps4() { // from class: com.google.android.qt9
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return vt9.j(eu9Var, z, f17, f18, xkbVar12, (j) obj, (dj7) obj2, (kx1) obj3);
                        }
                    };
                    dVarF.L(objR2);
                } else {
                    final xkb xkbVar13 = xkbVar3;
                    final float f19 = f3;
                    final float f110 = f4;
                    objR2 = new ps4() { // from class: com.google.android.qt9
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return vt9.j(eu9Var, z, f19, f110, xkbVar13, (j) obj, (dj7) obj2, (kx1) obj3);
                        }
                    };
                    dVarF.L(objR2);
                }
                b bVarC4 = BackgroundKt.c(zn6.a(bVarD4, (ps4) objR2), jI, xkbVar3);
                int i15 = ((i3 >> 12) & 7168) | 48;
                ej7 ej7VarI4 = androidx.compose.p001foundation.layout.j.i(tc.INSTANCE.e(), false);
                iA = pp1.a(dVarF, 0);
                gs1 gs1VarJ4 = dVarF.j();
                b bVarE4 = ComposedModifierKt.e(dVarF, bVarC4);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                xkb xkbVar14 = xkbVar3;
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
                dVarC = dud.c(dVarF);
                dud.i(dVarC, ej7VarI4, companion5.d());
                dud.i(dVarC, gs1VarJ4, companion5.f());
                function2C = companion5.c();
                if (dVarC.getInserting()) {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                } else {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                }
                dud.i(dVarC, bVarE4, companion5.e());
                ps4Var.invoke(BoxScopeInstance.a, dVarF, Integer.valueOf(((i15 >> 6) & 112) | 6));
                dVarF.m();
                if (e.k()) {
                    e.n();
                }
                xkbVar2 = xkbVar14;
            } else {
                dVarF.q();
                xkbVar2 = xkbVar;
            }
            bVar3 = bVar2;
            f5 = f3;
            j2 = jI;
            f6 = f4;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.rt9
                    public final Object invoke(Object obj, Object obj2) {
                        return vt9.m(this.a, eu9Var, z, bVar3, f5, xkbVar2, j2, f6, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                bVar2 = bVar;
                if (dVarF.x(bVar2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    f3 = f;
                    if (dVarF.B(f3)) {
                    }
                    i3 |= i11;
                } else {
                    f3 = f;
                }
                i3 |= i11;
            } else {
                f3 = f;
            }
            if ((i & 24576) != 0) {
                i3 |= ((i2 & 16) == 0 || !dVarF.x(xkbVar)) ? 8192 : 16384;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= 196608;
                jI = j;
            } else {
                jI = j;
                if ((i & 196608) == 0) {
                    if (dVarF.D(jI)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
            }
            if ((i & 1572864) == 0) {
                f4 = f2;
                if ((i2 & 64) == 0) {
                    i10 = 524288;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            } else {
                f4 = f2;
            }
            if ((i2 & 128) != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (dVarF.T(ps4Var)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i3 |= i8;
            }
            if ((i2 & 256) != 0) {
                if ((100663296 & i) == 0) {
                    if (dVarF.x(this)) {
                        i9 = 67108864;
                    } else {
                        i9 = 33554432;
                    }
                    i3 |= i9;
                }
                z2 = true;
                if ((i3 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            f3 = IndicatorMaxDistance;
                        }
                        if ((i2 & 16) != 0) {
                            xkbVar3 = indicatorShape;
                            i3 = (-57345) & i3;
                        } else {
                            xkbVar3 = xkbVar;
                        }
                        if (i6 != 0) {
                            jI = ei1.INSTANCE.i();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            f4 = Elevation;
                        }
                    } else {
                        if (i4 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            f3 = IndicatorMaxDistance;
                        }
                        if ((i2 & 16) != 0) {
                            xkbVar3 = indicatorShape;
                            i3 = (-57345) & i3;
                        } else {
                            xkbVar3 = xkbVar;
                        }
                        if (i6 != 0) {
                            jI = ei1.INSTANCE.i();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            f4 = Elevation;
                        }
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-1341144489, i3, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox (PullToRefresh.kt:456)");
                    }
                    b bVarT5 = SizeKt.t(bVar2, du9.t());
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = new Function1() { // from class: com.google.android.pt9
                            public final Object invoke(Object obj) {
                                return vt9.i((fz1) obj);
                            }
                        };
                        dVarF.L(objR);
                    }
                    b bVarD5 = c.d(bVarT5, (Function1) objR);
                    if ((i3 & 14) == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z15 = z4;
                    if ((i3 & 112) == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean z16 = z15 | z5 | ((((i3 & 7168) ^ 3072) <= 2048 && dVarF.B(f3)) || (i3 & 3072) == 2048) | ((((3670016 & i3) ^ 1572864) <= 1048576 && dVarF.B(f4)) || (i3 & 1572864) == 1048576);
                    if (((57344 & i3) ^ 24576) > 16384) {
                    }
                    z6 = z16 | z2;
                    objR2 = dVarF.R();
                    if (z6) {
                        final xkb xkbVar15 = xkbVar3;
                        final float f111 = f3;
                        final float f112 = f4;
                        objR2 = new ps4() { // from class: com.google.android.qt9
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                return vt9.j(eu9Var, z, f111, f112, xkbVar15, (j) obj, (dj7) obj2, (kx1) obj3);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        final xkb xkbVar16 = xkbVar3;
                        final float f113 = f3;
                        final float f114 = f4;
                        objR2 = new ps4() { // from class: com.google.android.qt9
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                return vt9.j(eu9Var, z, f113, f114, xkbVar16, (j) obj, (dj7) obj2, (kx1) obj3);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    b bVarC5 = BackgroundKt.c(zn6.a(bVarD5, (ps4) objR2), jI, xkbVar3);
                    int i16 = ((i3 >> 12) & 7168) | 48;
                    ej7 ej7VarI5 = androidx.compose.p001foundation.layout.j.i(tc.INSTANCE.e(), false);
                    iA = pp1.a(dVarF, 0);
                    gs1 gs1VarJ5 = dVarF.j();
                    b bVarE5 = ComposedModifierKt.e(dVarF, bVarC5);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    xkb xkbVar17 = xkbVar3;
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
                    dVarC = dud.c(dVarF);
                    dud.i(dVarC, ej7VarI5, companion6.d());
                    dud.i(dVarC, gs1VarJ5, companion6.f());
                    function2C = companion6.c();
                    if (dVarC.getInserting()) {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    } else {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    }
                    dud.i(dVarC, bVarE5, companion6.e());
                    ps4Var.invoke(BoxScopeInstance.a, dVarF, Integer.valueOf(((i16 >> 6) & 112) | 6));
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                    xkbVar2 = xkbVar17;
                } else {
                    dVarF.q();
                    xkbVar2 = xkbVar;
                }
                bVar3 = bVar2;
                f5 = f3;
                j2 = jI;
                f6 = f4;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.rt9
                        public final Object invoke(Object obj, Object obj2) {
                            return vt9.m(this.a, eu9Var, z, bVar3, f5, xkbVar2, j2, f6, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 100663296;
            z2 = true;
            if ((i3 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        f3 = IndicatorMaxDistance;
                    }
                    if ((i2 & 16) != 0) {
                        xkbVar3 = indicatorShape;
                        i3 = (-57345) & i3;
                    } else {
                        xkbVar3 = xkbVar;
                    }
                    if (i6 != 0) {
                        jI = ei1.INSTANCE.i();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        f4 = Elevation;
                    }
                } else {
                    if (i4 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        f3 = IndicatorMaxDistance;
                    }
                    if ((i2 & 16) != 0) {
                        xkbVar3 = indicatorShape;
                        i3 = (-57345) & i3;
                    } else {
                        xkbVar3 = xkbVar;
                    }
                    if (i6 != 0) {
                        jI = ei1.INSTANCE.i();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        f4 = Elevation;
                    }
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-1341144489, i3, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox (PullToRefresh.kt:456)");
                }
                b bVarT6 = SizeKt.t(bVar2, du9.t());
                objR = dVarF.R();
                companion = d.INSTANCE;
                if (objR == companion.a()) {
                    objR = new Function1() { // from class: com.google.android.pt9
                        public final Object invoke(Object obj) {
                            return vt9.i((fz1) obj);
                        }
                    };
                    dVarF.L(objR);
                }
                b bVarD6 = c.d(bVarT6, (Function1) objR);
                if ((i3 & 14) == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z17 = z4;
                if ((i3 & 112) == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z18 = z17 | z5 | ((((i3 & 7168) ^ 3072) <= 2048 && dVarF.B(f3)) || (i3 & 3072) == 2048) | ((((3670016 & i3) ^ 1572864) <= 1048576 && dVarF.B(f4)) || (i3 & 1572864) == 1048576);
                if (((57344 & i3) ^ 24576) > 16384) {
                }
                z6 = z18 | z2;
                objR2 = dVarF.R();
                if (z6) {
                    final xkb xkbVar18 = xkbVar3;
                    final float f115 = f3;
                    final float f116 = f4;
                    objR2 = new ps4() { // from class: com.google.android.qt9
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return vt9.j(eu9Var, z, f115, f116, xkbVar18, (j) obj, (dj7) obj2, (kx1) obj3);
                        }
                    };
                    dVarF.L(objR2);
                } else {
                    final xkb xkbVar19 = xkbVar3;
                    final float f117 = f3;
                    final float f118 = f4;
                    objR2 = new ps4() { // from class: com.google.android.qt9
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return vt9.j(eu9Var, z, f117, f118, xkbVar19, (j) obj, (dj7) obj2, (kx1) obj3);
                        }
                    };
                    dVarF.L(objR2);
                }
                b bVarC6 = BackgroundKt.c(zn6.a(bVarD6, (ps4) objR2), jI, xkbVar3);
                int i17 = ((i3 >> 12) & 7168) | 48;
                ej7 ej7VarI6 = androidx.compose.p001foundation.layout.j.i(tc.INSTANCE.e(), false);
                iA = pp1.a(dVarF, 0);
                gs1 gs1VarJ6 = dVarF.j();
                b bVarE6 = ComposedModifierKt.e(dVarF, bVarC6);
                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                xkb xkbVar110 = xkbVar3;
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
                dVarC = dud.c(dVarF);
                dud.i(dVarC, ej7VarI6, companion7.d());
                dud.i(dVarC, gs1VarJ6, companion7.f());
                function2C = companion7.c();
                if (dVarC.getInserting()) {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                } else {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                }
                dud.i(dVarC, bVarE6, companion7.e());
                ps4Var.invoke(BoxScopeInstance.a, dVarF, Integer.valueOf(((i17 >> 6) & 112) | 6));
                dVarF.m();
                if (e.k()) {
                    e.n();
                }
                xkbVar2 = xkbVar110;
            } else {
                dVarF.q();
                xkbVar2 = xkbVar;
            }
            bVar3 = bVar2;
            f5 = f3;
            j2 = jI;
            f6 = f4;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.rt9
                    public final Object invoke(Object obj, Object obj2) {
                        return vt9.m(this.a, eu9Var, z, bVar3, f5, xkbVar2, j2, f6, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        bVar2 = bVar;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                f3 = f;
                if (dVarF.B(f3)) {
                }
                i3 |= i11;
            } else {
                f3 = f;
            }
            i3 |= i11;
        } else {
            f3 = f;
        }
        if ((i & 24576) != 0) {
            i3 |= ((i2 & 16) == 0 || !dVarF.x(xkbVar)) ? 8192 : 16384;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= 196608;
            jI = j;
        } else {
            jI = j;
            if ((i & 196608) == 0) {
                if (dVarF.D(jI)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
        }
        if ((i & 1572864) == 0) {
            f4 = f2;
            if ((i2 & 64) == 0) {
                i10 = 524288;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        } else {
            f4 = f2;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (dVarF.T(ps4Var)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i3 |= i8;
        }
        if ((i2 & 256) != 0) {
            if ((100663296 & i) == 0) {
                if (dVarF.x(this)) {
                    i9 = 67108864;
                } else {
                    i9 = 33554432;
                }
                i3 |= i9;
            }
            z2 = true;
            if ((i3 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        f3 = IndicatorMaxDistance;
                    }
                    if ((i2 & 16) != 0) {
                        xkbVar3 = indicatorShape;
                        i3 = (-57345) & i3;
                    } else {
                        xkbVar3 = xkbVar;
                    }
                    if (i6 != 0) {
                        jI = ei1.INSTANCE.i();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        f4 = Elevation;
                    }
                } else {
                    if (i4 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        f3 = IndicatorMaxDistance;
                    }
                    if ((i2 & 16) != 0) {
                        xkbVar3 = indicatorShape;
                        i3 = (-57345) & i3;
                    } else {
                        xkbVar3 = xkbVar;
                    }
                    if (i6 != 0) {
                        jI = ei1.INSTANCE.i();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        f4 = Elevation;
                    }
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-1341144489, i3, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox (PullToRefresh.kt:456)");
                }
                b bVarT7 = SizeKt.t(bVar2, du9.t());
                objR = dVarF.R();
                companion = d.INSTANCE;
                if (objR == companion.a()) {
                    objR = new Function1() { // from class: com.google.android.pt9
                        public final Object invoke(Object obj) {
                            return vt9.i((fz1) obj);
                        }
                    };
                    dVarF.L(objR);
                }
                b bVarD7 = c.d(bVarT7, (Function1) objR);
                if ((i3 & 14) == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z19 = z4;
                if ((i3 & 112) == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z110 = z19 | z5 | ((((i3 & 7168) ^ 3072) <= 2048 && dVarF.B(f3)) || (i3 & 3072) == 2048) | ((((3670016 & i3) ^ 1572864) <= 1048576 && dVarF.B(f4)) || (i3 & 1572864) == 1048576);
                if (((57344 & i3) ^ 24576) > 16384) {
                }
                z6 = z110 | z2;
                objR2 = dVarF.R();
                if (z6) {
                    final xkb xkbVar111 = xkbVar3;
                    final float f119 = f3;
                    final float f1110 = f4;
                    objR2 = new ps4() { // from class: com.google.android.qt9
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return vt9.j(eu9Var, z, f119, f1110, xkbVar111, (j) obj, (dj7) obj2, (kx1) obj3);
                        }
                    };
                    dVarF.L(objR2);
                } else {
                    final xkb xkbVar112 = xkbVar3;
                    final float f1111 = f3;
                    final float f1112 = f4;
                    objR2 = new ps4() { // from class: com.google.android.qt9
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return vt9.j(eu9Var, z, f1111, f1112, xkbVar112, (j) obj, (dj7) obj2, (kx1) obj3);
                        }
                    };
                    dVarF.L(objR2);
                }
                b bVarC7 = BackgroundKt.c(zn6.a(bVarD7, (ps4) objR2), jI, xkbVar3);
                int i18 = ((i3 >> 12) & 7168) | 48;
                ej7 ej7VarI7 = androidx.compose.p001foundation.layout.j.i(tc.INSTANCE.e(), false);
                iA = pp1.a(dVarF, 0);
                gs1 gs1VarJ7 = dVarF.j();
                b bVarE7 = ComposedModifierKt.e(dVarF, bVarC7);
                ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                xkb xkbVar113 = xkbVar3;
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
                dVarC = dud.c(dVarF);
                dud.i(dVarC, ej7VarI7, companion8.d());
                dud.i(dVarC, gs1VarJ7, companion8.f());
                function2C = companion8.c();
                if (dVarC.getInserting()) {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                } else {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                }
                dud.i(dVarC, bVarE7, companion8.e());
                ps4Var.invoke(BoxScopeInstance.a, dVarF, Integer.valueOf(((i18 >> 6) & 112) | 6));
                dVarF.m();
                if (e.k()) {
                    e.n();
                }
                xkbVar2 = xkbVar113;
            } else {
                dVarF.q();
                xkbVar2 = xkbVar;
            }
            bVar3 = bVar2;
            f5 = f3;
            j2 = jI;
            f6 = f4;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.rt9
                    public final Object invoke(Object obj, Object obj2) {
                        return vt9.m(this.a, eu9Var, z, bVar3, f5, xkbVar2, j2, f6, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 100663296;
        z2 = true;
        if ((i3 & 38347923) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (dVarF.g(z3, i3 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    bVar2 = b.INSTANCE;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    f3 = IndicatorMaxDistance;
                }
                if ((i2 & 16) != 0) {
                    xkbVar3 = indicatorShape;
                    i3 = (-57345) & i3;
                } else {
                    xkbVar3 = xkbVar;
                }
                if (i6 != 0) {
                    jI = ei1.INSTANCE.i();
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    f4 = Elevation;
                }
            } else {
                if (i4 != 0) {
                    bVar2 = b.INSTANCE;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    f3 = IndicatorMaxDistance;
                }
                if ((i2 & 16) != 0) {
                    xkbVar3 = indicatorShape;
                    i3 = (-57345) & i3;
                } else {
                    xkbVar3 = xkbVar;
                }
                if (i6 != 0) {
                    jI = ei1.INSTANCE.i();
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    f4 = Elevation;
                }
            }
            dVarF.M();
            if (e.k()) {
                e.o(-1341144489, i3, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox (PullToRefresh.kt:456)");
            }
            b bVarT8 = SizeKt.t(bVar2, du9.t());
            objR = dVarF.R();
            companion = d.INSTANCE;
            if (objR == companion.a()) {
                objR = new Function1() { // from class: com.google.android.pt9
                    public final Object invoke(Object obj) {
                        return vt9.i((fz1) obj);
                    }
                };
                dVarF.L(objR);
            }
            b bVarD8 = c.d(bVarT8, (Function1) objR);
            if ((i3 & 14) == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z111 = z4;
            if ((i3 & 112) == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z112 = z111 | z5 | ((((i3 & 7168) ^ 3072) <= 2048 && dVarF.B(f3)) || (i3 & 3072) == 2048) | ((((3670016 & i3) ^ 1572864) <= 1048576 && dVarF.B(f4)) || (i3 & 1572864) == 1048576);
            if (((57344 & i3) ^ 24576) > 16384) {
            }
            z6 = z112 | z2;
            objR2 = dVarF.R();
            if (z6) {
                final xkb xkbVar114 = xkbVar3;
                final float f1113 = f3;
                final float f1114 = f4;
                objR2 = new ps4() { // from class: com.google.android.qt9
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return vt9.j(eu9Var, z, f1113, f1114, xkbVar114, (j) obj, (dj7) obj2, (kx1) obj3);
                    }
                };
                dVarF.L(objR2);
            } else {
                final xkb xkbVar115 = xkbVar3;
                final float f1115 = f3;
                final float f1116 = f4;
                objR2 = new ps4() { // from class: com.google.android.qt9
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return vt9.j(eu9Var, z, f1115, f1116, xkbVar115, (j) obj, (dj7) obj2, (kx1) obj3);
                    }
                };
                dVarF.L(objR2);
            }
            b bVarC8 = BackgroundKt.c(zn6.a(bVarD8, (ps4) objR2), jI, xkbVar3);
            int i19 = ((i3 >> 12) & 7168) | 48;
            ej7 ej7VarI8 = androidx.compose.p001foundation.layout.j.i(tc.INSTANCE.e(), false);
            iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ8 = dVarF.j();
            b bVarE8 = ComposedModifierKt.e(dVarF, bVarC8);
            ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
            xkb xkbVar116 = xkbVar3;
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
            dVarC = dud.c(dVarF);
            dud.i(dVarC, ej7VarI8, companion9.d());
            dud.i(dVarC, gs1VarJ8, companion9.f());
            function2C = companion9.c();
            if (dVarC.getInserting()) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            } else {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE8, companion9.e());
            ps4Var.invoke(BoxScopeInstance.a, dVarF, Integer.valueOf(((i19 >> 6) & 112) | 6));
            dVarF.m();
            if (e.k()) {
                e.n();
            }
            xkbVar2 = xkbVar116;
        } else {
            dVarF.q();
            xkbVar2 = xkbVar;
        }
        bVar3 = bVar2;
        f5 = f3;
        j2 = jI;
        f6 = f4;
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.rt9
                public final Object invoke(Object obj, Object obj2) {
                    return vt9.m(this.a, eu9Var, z, bVar3, f5, xkbVar2, j2, f6, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final long o(d dVar, int i) {
        if (e.k()) {
            e.o(-1441334156, i, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-indicatorColor> (PullToRefresh.kt:413)");
        }
        long onSurfaceVariant = kh7.a.a(dVar, 6).getOnSurfaceVariant();
        if (e.k()) {
            e.n();
        }
        return onSurfaceVariant;
    }

    public final long p(d dVar, int i) {
        if (e.k()) {
            e.o(-80510850, i, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-indicatorContainerColor> (PullToRefresh.kt:409)");
        }
        long surfaceContainerHigh = kh7.a.a(dVar, 6).getSurfaceContainerHigh();
        if (e.k()) {
            e.n();
        }
        return surfaceContainerHigh;
    }

    public final float q() {
        return PositionalThreshold;
    }
}
