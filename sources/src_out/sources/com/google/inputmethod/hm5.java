package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.draw.i;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.h;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a_\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aU\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aU\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/google/android/ml5;", "bitmap", "", "contentDescription", "Landroidx/compose/ui/b;", "modifier", "Lcom/google/android/tc;", "alignment", "Lcom/google/android/d02;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/h;", "colorFilter", "Lcom/google/android/ca4;", "filterQuality", "", "g", "(Lcom/google/android/ml5;Ljava/lang/String;Landroidx/compose/ui/b;Lcom/google/android/tc;Lcom/google/android/d02;FLandroidx/compose/ui/graphics/h;ILandroidx/compose/runtime/d;II)V", "Lcom/google/android/pp5;", "imageVector", "d", "(Lcom/google/android/pp5;Ljava/lang/String;Landroidx/compose/ui/b;Lcom/google/android/tc;Lcom/google/android/d02;FLandroidx/compose/ui/graphics/h;Landroidx/compose/runtime/d;II)V", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "c", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/b;Lcom/google/android/tc;Lcom/google/android/d02;FLandroidx/compose/ui/graphics/h;Landroidx/compose/runtime/d;II)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class hm5 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements ej7 {
        public static final a a = new a();

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(o.a aVar) {
            return Unit.a;
        }

        @Override // com.google.inputmethod.ej7
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, long j) {
            return j.Q1(jVar, kx1.n(j), kx1.m(j), null, new Function1() { // from class: com.google.android.gm5
                public final Object invoke(Object obj) {
                    return hm5.a.b((o.a) obj);
                }
            }, 4, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0114  */
    /* JADX WARN: Code duplicated, block: B:102:0x0122  */
    /* JADX WARN: Code duplicated, block: B:103:0x0124  */
    /* JADX WARN: Code duplicated, block: B:106:0x012b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0133  */
    /* JADX WARN: Code duplicated, block: B:110:0x0146  */
    /* JADX WARN: Code duplicated, block: B:113:0x0175  */
    /* JADX WARN: Code duplicated, block: B:116:0x0198  */
    /* JADX WARN: Code duplicated, block: B:119:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:120:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:123:0x01df  */
    /* JADX WARN: Code duplicated, block: B:125:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:128:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:35:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0072  */
    /* JADX WARN: Code duplicated, block: B:46:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x0096  */
    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00be  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00da  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:94:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:95:0x0101  */
    /* JADX WARN: Code duplicated, block: B:98:0x0109  */
    public static final void c(final Painter painter, final String str, b bVar, tc tcVar, d02 d02Var, float f, h hVar, d dVar, final int i, final int i2) {
        int i3;
        b bVar2;
        int i4;
        int i5;
        int i6;
        d02 d02Var2;
        int i7;
        int i8;
        float f2;
        int i9;
        int i10;
        int i11;
        boolean z;
        final tc tcVar2;
        final h hVar2;
        final b bVar3;
        final d02 d02Var3;
        final float f3;
        s6b s6bVarH;
        b bVar4;
        tc tcVarE;
        d02 d02VarE;
        float f4;
        h hVar3;
        int i12;
        b bVarD;
        Object objR;
        Function0<ComposeUiNode> function0B;
        boolean z2;
        Object objR2;
        d dVarF = dVar.F(1142754848);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? dVarF.x(painter) : dVarF.T(painter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= dVarF.x(str) ? 32 : 16;
        }
        int i13 = i2 & 4;
        if (i13 == 0) {
            if ((i & 384) == 0) {
                bVar2 = bVar;
                i3 |= dVarF.x(bVar2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    if (dVarF.x(tcVar)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        d02Var2 = d02Var;
                        if (dVarF.x(d02Var2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            f2 = f;
                            if (dVarF.B(f2)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 64;
                        if (i10 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            if (dVarF.x(hVar)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                        if ((i3 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (dVarF.g(z, i3 & 1)) {
                            if (i13 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i4 != 0) {
                                tcVarE = tc.INSTANCE.e();
                            } else {
                                tcVarE = tcVar;
                            }
                            if (i6 != 0) {
                                d02VarE = d02.INSTANCE.e();
                            } else {
                                d02VarE = d02Var2;
                            }
                            if (i8 != 0) {
                                f4 = 1.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i10 != 0) {
                                hVar3 = null;
                            } else {
                                hVar3 = hVar;
                            }
                            if (e.k()) {
                                e.o(1142754848, i3, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                            }
                            if (str != null) {
                                dVarF.y(1899222916);
                                b.Companion companion = b.INSTANCE;
                                if ((i3 & 112) == 32) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objR2 = dVarF.R();
                                if (z2 || objR2 == d.INSTANCE.a()) {
                                    objR2 = new Function1() { // from class: com.google.android.em5
                                        public final Object invoke(Object obj) {
                                            return hm5.e(str, (nfb) obj);
                                        }
                                    };
                                    dVarF.L(objR2);
                                }
                                i12 = 0;
                                bVarD = afb.d(companion, false, (Function1) objR2, 1, null);
                                dVarF.u();
                            } else {
                                i12 = 0;
                                dVarF.y(1899381698);
                                dVarF.u();
                                bVarD = b.INSTANCE;
                            }
                            int i14 = i12;
                            b bVar5 = bVar4;
                            b bVarB = i.b(ff1.b(bVar4.then(bVarD)), painter, false, tcVarE, d02VarE, f4, hVar3, 2, null);
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = a.a;
                                dVarF.L(objR);
                            }
                            ej7 ej7Var = (ej7) objR;
                            int iHashCode = Long.hashCode(pp1.b(dVarF, i14));
                            b bVarE = ComposedModifierKt.e(dVarF, bVarB);
                            gs1 gs1VarJ = dVarF.j();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
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
                            d dVarC = dud.c(dVarF);
                            dud.i(dVarC, ej7Var, companion2.d());
                            dud.i(dVarC, gs1VarJ, companion2.f());
                            dud.g(dVarC, companion2.a());
                            dud.i(dVarC, bVarE, companion2.e());
                            dud.i(dVarC, Integer.valueOf(iHashCode), companion2.c());
                            dVarF.m();
                            if (e.k()) {
                                e.n();
                            }
                            hVar2 = hVar3;
                            f3 = f4;
                            d02Var3 = d02VarE;
                            tcVar2 = tcVarE;
                            bVar3 = bVar5;
                        } else {
                            dVarF.q();
                            tcVar2 = tcVar;
                            hVar2 = hVar;
                            bVar3 = bVar2;
                            d02Var3 = d02Var2;
                            f3 = f2;
                        }
                        s6bVarH = dVarF.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.fm5
                                public final Object invoke(Object obj, Object obj2) {
                                    return hm5.f(painter, str, bVar3, tcVar2, d02Var3, f3, hVar2, i, i2, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i3 |= 196608;
                    f2 = f;
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (dVarF.x(hVar)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i13 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            tcVarE = tc.INSTANCE.e();
                        } else {
                            tcVarE = tcVar;
                        }
                        if (i6 != 0) {
                            d02VarE = d02.INSTANCE.e();
                        } else {
                            d02VarE = d02Var2;
                        }
                        if (i8 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i10 != 0) {
                            hVar3 = null;
                        } else {
                            hVar3 = hVar;
                        }
                        if (e.k()) {
                            e.o(1142754848, i3, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                        }
                        if (str != null) {
                            dVarF.y(1899222916);
                            b.Companion companion3 = b.INSTANCE;
                            if ((i3 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objR2 = dVarF.R();
                            if (z2) {
                                objR2 = new Function1() { // from class: com.google.android.em5
                                    public final Object invoke(Object obj) {
                                        return hm5.e(str, (nfb) obj);
                                    }
                                };
                                dVarF.L(objR2);
                            } else {
                                objR2 = new Function1() { // from class: com.google.android.em5
                                    public final Object invoke(Object obj) {
                                        return hm5.e(str, (nfb) obj);
                                    }
                                };
                                dVarF.L(objR2);
                            }
                            i12 = 0;
                            bVarD = afb.d(companion3, false, (Function1) objR2, 1, null);
                            dVarF.u();
                        } else {
                            i12 = 0;
                            dVarF.y(1899381698);
                            dVarF.u();
                            bVarD = b.INSTANCE;
                        }
                        int i15 = i12;
                        b bVar6 = bVar4;
                        b bVarB2 = i.b(ff1.b(bVar4.then(bVarD)), painter, false, tcVarE, d02VarE, f4, hVar3, 2, null);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = a.a;
                            dVarF.L(objR);
                        }
                        ej7 ej7Var2 = (ej7) objR;
                        int iHashCode2 = Long.hashCode(pp1.b(dVarF, i15));
                        b bVarE2 = ComposedModifierKt.e(dVarF, bVarB2);
                        gs1 gs1VarJ2 = dVarF.j();
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
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
                        d dVarC2 = dud.c(dVarF);
                        dud.i(dVarC2, ej7Var2, companion4.d());
                        dud.i(dVarC2, gs1VarJ2, companion4.f());
                        dud.g(dVarC2, companion4.a());
                        dud.i(dVarC2, bVarE2, companion4.e());
                        dud.i(dVarC2, Integer.valueOf(iHashCode2), companion4.c());
                        dVarF.m();
                        if (e.k()) {
                            e.n();
                        }
                        hVar2 = hVar3;
                        f3 = f4;
                        d02Var3 = d02VarE;
                        tcVar2 = tcVarE;
                        bVar3 = bVar6;
                    } else {
                        dVarF.q();
                        tcVar2 = tcVar;
                        hVar2 = hVar;
                        bVar3 = bVar2;
                        d02Var3 = d02Var2;
                        f3 = f2;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.fm5
                            public final Object invoke(Object obj, Object obj2) {
                                return hm5.f(painter, str, bVar3, tcVar2, d02Var3, f3, hVar2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 24576;
                d02Var2 = d02Var;
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        f2 = f;
                        if (dVarF.B(f2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (dVarF.x(hVar)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i13 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            tcVarE = tc.INSTANCE.e();
                        } else {
                            tcVarE = tcVar;
                        }
                        if (i6 != 0) {
                            d02VarE = d02.INSTANCE.e();
                        } else {
                            d02VarE = d02Var2;
                        }
                        if (i8 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i10 != 0) {
                            hVar3 = null;
                        } else {
                            hVar3 = hVar;
                        }
                        if (e.k()) {
                            e.o(1142754848, i3, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                        }
                        if (str != null) {
                            dVarF.y(1899222916);
                            b.Companion companion5 = b.INSTANCE;
                            if ((i3 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objR2 = dVarF.R();
                            if (z2) {
                                objR2 = new Function1() { // from class: com.google.android.em5
                                    public final Object invoke(Object obj) {
                                        return hm5.e(str, (nfb) obj);
                                    }
                                };
                                dVarF.L(objR2);
                            } else {
                                objR2 = new Function1() { // from class: com.google.android.em5
                                    public final Object invoke(Object obj) {
                                        return hm5.e(str, (nfb) obj);
                                    }
                                };
                                dVarF.L(objR2);
                            }
                            i12 = 0;
                            bVarD = afb.d(companion5, false, (Function1) objR2, 1, null);
                            dVarF.u();
                        } else {
                            i12 = 0;
                            dVarF.y(1899381698);
                            dVarF.u();
                            bVarD = b.INSTANCE;
                        }
                        int i16 = i12;
                        b bVar7 = bVar4;
                        b bVarB3 = i.b(ff1.b(bVar4.then(bVarD)), painter, false, tcVarE, d02VarE, f4, hVar3, 2, null);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = a.a;
                            dVarF.L(objR);
                        }
                        ej7 ej7Var3 = (ej7) objR;
                        int iHashCode3 = Long.hashCode(pp1.b(dVarF, i16));
                        b bVarE3 = ComposedModifierKt.e(dVarF, bVarB3);
                        gs1 gs1VarJ3 = dVarF.j();
                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
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
                        d dVarC3 = dud.c(dVarF);
                        dud.i(dVarC3, ej7Var3, companion6.d());
                        dud.i(dVarC3, gs1VarJ3, companion6.f());
                        dud.g(dVarC3, companion6.a());
                        dud.i(dVarC3, bVarE3, companion6.e());
                        dud.i(dVarC3, Integer.valueOf(iHashCode3), companion6.c());
                        dVarF.m();
                        if (e.k()) {
                            e.n();
                        }
                        hVar2 = hVar3;
                        f3 = f4;
                        d02Var3 = d02VarE;
                        tcVar2 = tcVarE;
                        bVar3 = bVar7;
                    } else {
                        dVarF.q();
                        tcVar2 = tcVar;
                        hVar2 = hVar;
                        bVar3 = bVar2;
                        d02Var3 = d02Var2;
                        f3 = f2;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.fm5
                            public final Object invoke(Object obj, Object obj2) {
                                return hm5.f(painter, str, bVar3, tcVar2, d02Var3, f3, hVar2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 196608;
                f2 = f;
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (dVarF.x(hVar)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i13 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        tcVarE = tc.INSTANCE.e();
                    } else {
                        tcVarE = tcVar;
                    }
                    if (i6 != 0) {
                        d02VarE = d02.INSTANCE.e();
                    } else {
                        d02VarE = d02Var2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i10 != 0) {
                        hVar3 = null;
                    } else {
                        hVar3 = hVar;
                    }
                    if (e.k()) {
                        e.o(1142754848, i3, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                    }
                    if (str != null) {
                        dVarF.y(1899222916);
                        b.Companion companion7 = b.INSTANCE;
                        if ((i3 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objR2 = dVarF.R();
                        if (z2) {
                            objR2 = new Function1() { // from class: com.google.android.em5
                                public final Object invoke(Object obj) {
                                    return hm5.e(str, (nfb) obj);
                                }
                            };
                            dVarF.L(objR2);
                        } else {
                            objR2 = new Function1() { // from class: com.google.android.em5
                                public final Object invoke(Object obj) {
                                    return hm5.e(str, (nfb) obj);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        i12 = 0;
                        bVarD = afb.d(companion7, false, (Function1) objR2, 1, null);
                        dVarF.u();
                    } else {
                        i12 = 0;
                        dVarF.y(1899381698);
                        dVarF.u();
                        bVarD = b.INSTANCE;
                    }
                    int i17 = i12;
                    b bVar8 = bVar4;
                    b bVarB4 = i.b(ff1.b(bVar4.then(bVarD)), painter, false, tcVarE, d02VarE, f4, hVar3, 2, null);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = a.a;
                        dVarF.L(objR);
                    }
                    ej7 ej7Var4 = (ej7) objR;
                    int iHashCode4 = Long.hashCode(pp1.b(dVarF, i17));
                    b bVarE4 = ComposedModifierKt.e(dVarF, bVarB4);
                    gs1 gs1VarJ4 = dVarF.j();
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
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
                    d dVarC4 = dud.c(dVarF);
                    dud.i(dVarC4, ej7Var4, companion8.d());
                    dud.i(dVarC4, gs1VarJ4, companion8.f());
                    dud.g(dVarC4, companion8.a());
                    dud.i(dVarC4, bVarE4, companion8.e());
                    dud.i(dVarC4, Integer.valueOf(iHashCode4), companion8.c());
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                    hVar2 = hVar3;
                    f3 = f4;
                    d02Var3 = d02VarE;
                    tcVar2 = tcVarE;
                    bVar3 = bVar8;
                } else {
                    dVarF.q();
                    tcVar2 = tcVar;
                    hVar2 = hVar;
                    bVar3 = bVar2;
                    d02Var3 = d02Var2;
                    f3 = f2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.fm5
                        public final Object invoke(Object obj, Object obj2) {
                            return hm5.f(painter, str, bVar3, tcVar2, d02Var3, f3, hVar2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 3072;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    d02Var2 = d02Var;
                    if (dVarF.x(d02Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        f2 = f;
                        if (dVarF.B(f2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (dVarF.x(hVar)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i13 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            tcVarE = tc.INSTANCE.e();
                        } else {
                            tcVarE = tcVar;
                        }
                        if (i6 != 0) {
                            d02VarE = d02.INSTANCE.e();
                        } else {
                            d02VarE = d02Var2;
                        }
                        if (i8 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i10 != 0) {
                            hVar3 = null;
                        } else {
                            hVar3 = hVar;
                        }
                        if (e.k()) {
                            e.o(1142754848, i3, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                        }
                        if (str != null) {
                            dVarF.y(1899222916);
                            b.Companion companion9 = b.INSTANCE;
                            if ((i3 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objR2 = dVarF.R();
                            if (z2) {
                                objR2 = new Function1() { // from class: com.google.android.em5
                                    public final Object invoke(Object obj) {
                                        return hm5.e(str, (nfb) obj);
                                    }
                                };
                                dVarF.L(objR2);
                            } else {
                                objR2 = new Function1() { // from class: com.google.android.em5
                                    public final Object invoke(Object obj) {
                                        return hm5.e(str, (nfb) obj);
                                    }
                                };
                                dVarF.L(objR2);
                            }
                            i12 = 0;
                            bVarD = afb.d(companion9, false, (Function1) objR2, 1, null);
                            dVarF.u();
                        } else {
                            i12 = 0;
                            dVarF.y(1899381698);
                            dVarF.u();
                            bVarD = b.INSTANCE;
                        }
                        int i18 = i12;
                        b bVar9 = bVar4;
                        b bVarB5 = i.b(ff1.b(bVar4.then(bVarD)), painter, false, tcVarE, d02VarE, f4, hVar3, 2, null);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = a.a;
                            dVarF.L(objR);
                        }
                        ej7 ej7Var5 = (ej7) objR;
                        int iHashCode5 = Long.hashCode(pp1.b(dVarF, i18));
                        b bVarE5 = ComposedModifierKt.e(dVarF, bVarB5);
                        gs1 gs1VarJ5 = dVarF.j();
                        ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                        function0B = companion10.b();
                        if (dVarF.G() == null) {
                            pp1.d();
                        }
                        dVarF.o();
                        if (dVarF.getInserting()) {
                            dVarF.W(function0B);
                        } else {
                            dVarF.k();
                        }
                        d dVarC5 = dud.c(dVarF);
                        dud.i(dVarC5, ej7Var5, companion10.d());
                        dud.i(dVarC5, gs1VarJ5, companion10.f());
                        dud.g(dVarC5, companion10.a());
                        dud.i(dVarC5, bVarE5, companion10.e());
                        dud.i(dVarC5, Integer.valueOf(iHashCode5), companion10.c());
                        dVarF.m();
                        if (e.k()) {
                            e.n();
                        }
                        hVar2 = hVar3;
                        f3 = f4;
                        d02Var3 = d02VarE;
                        tcVar2 = tcVarE;
                        bVar3 = bVar9;
                    } else {
                        dVarF.q();
                        tcVar2 = tcVar;
                        hVar2 = hVar;
                        bVar3 = bVar2;
                        d02Var3 = d02Var2;
                        f3 = f2;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.fm5
                            public final Object invoke(Object obj, Object obj2) {
                                return hm5.f(painter, str, bVar3, tcVar2, d02Var3, f3, hVar2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 196608;
                f2 = f;
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (dVarF.x(hVar)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i13 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        tcVarE = tc.INSTANCE.e();
                    } else {
                        tcVarE = tcVar;
                    }
                    if (i6 != 0) {
                        d02VarE = d02.INSTANCE.e();
                    } else {
                        d02VarE = d02Var2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i10 != 0) {
                        hVar3 = null;
                    } else {
                        hVar3 = hVar;
                    }
                    if (e.k()) {
                        e.o(1142754848, i3, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                    }
                    if (str != null) {
                        dVarF.y(1899222916);
                        b.Companion companion11 = b.INSTANCE;
                        if ((i3 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objR2 = dVarF.R();
                        if (z2) {
                            objR2 = new Function1() { // from class: com.google.android.em5
                                public final Object invoke(Object obj) {
                                    return hm5.e(str, (nfb) obj);
                                }
                            };
                            dVarF.L(objR2);
                        } else {
                            objR2 = new Function1() { // from class: com.google.android.em5
                                public final Object invoke(Object obj) {
                                    return hm5.e(str, (nfb) obj);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        i12 = 0;
                        bVarD = afb.d(companion11, false, (Function1) objR2, 1, null);
                        dVarF.u();
                    } else {
                        i12 = 0;
                        dVarF.y(1899381698);
                        dVarF.u();
                        bVarD = b.INSTANCE;
                    }
                    int i19 = i12;
                    b bVar10 = bVar4;
                    b bVarB6 = i.b(ff1.b(bVar4.then(bVarD)), painter, false, tcVarE, d02VarE, f4, hVar3, 2, null);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = a.a;
                        dVarF.L(objR);
                    }
                    ej7 ej7Var6 = (ej7) objR;
                    int iHashCode6 = Long.hashCode(pp1.b(dVarF, i19));
                    b bVarE6 = ComposedModifierKt.e(dVarF, bVarB6);
                    gs1 gs1VarJ6 = dVarF.j();
                    ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                    function0B = companion12.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B);
                    } else {
                        dVarF.k();
                    }
                    d dVarC6 = dud.c(dVarF);
                    dud.i(dVarC6, ej7Var6, companion12.d());
                    dud.i(dVarC6, gs1VarJ6, companion12.f());
                    dud.g(dVarC6, companion12.a());
                    dud.i(dVarC6, bVarE6, companion12.e());
                    dud.i(dVarC6, Integer.valueOf(iHashCode6), companion12.c());
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                    hVar2 = hVar3;
                    f3 = f4;
                    d02Var3 = d02VarE;
                    tcVar2 = tcVarE;
                    bVar3 = bVar10;
                } else {
                    dVarF.q();
                    tcVar2 = tcVar;
                    hVar2 = hVar;
                    bVar3 = bVar2;
                    d02Var3 = d02Var2;
                    f3 = f2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.fm5
                        public final Object invoke(Object obj, Object obj2) {
                            return hm5.f(painter, str, bVar3, tcVar2, d02Var3, f3, hVar2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            d02Var2 = d02Var;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (dVarF.B(f2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (dVarF.x(hVar)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i13 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        tcVarE = tc.INSTANCE.e();
                    } else {
                        tcVarE = tcVar;
                    }
                    if (i6 != 0) {
                        d02VarE = d02.INSTANCE.e();
                    } else {
                        d02VarE = d02Var2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i10 != 0) {
                        hVar3 = null;
                    } else {
                        hVar3 = hVar;
                    }
                    if (e.k()) {
                        e.o(1142754848, i3, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                    }
                    if (str != null) {
                        dVarF.y(1899222916);
                        b.Companion companion13 = b.INSTANCE;
                        if ((i3 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objR2 = dVarF.R();
                        if (z2) {
                            objR2 = new Function1() { // from class: com.google.android.em5
                                public final Object invoke(Object obj) {
                                    return hm5.e(str, (nfb) obj);
                                }
                            };
                            dVarF.L(objR2);
                        } else {
                            objR2 = new Function1() { // from class: com.google.android.em5
                                public final Object invoke(Object obj) {
                                    return hm5.e(str, (nfb) obj);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        i12 = 0;
                        bVarD = afb.d(companion13, false, (Function1) objR2, 1, null);
                        dVarF.u();
                    } else {
                        i12 = 0;
                        dVarF.y(1899381698);
                        dVarF.u();
                        bVarD = b.INSTANCE;
                    }
                    int i110 = i12;
                    b bVar11 = bVar4;
                    b bVarB7 = i.b(ff1.b(bVar4.then(bVarD)), painter, false, tcVarE, d02VarE, f4, hVar3, 2, null);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = a.a;
                        dVarF.L(objR);
                    }
                    ej7 ej7Var7 = (ej7) objR;
                    int iHashCode7 = Long.hashCode(pp1.b(dVarF, i110));
                    b bVarE7 = ComposedModifierKt.e(dVarF, bVarB7);
                    gs1 gs1VarJ7 = dVarF.j();
                    ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                    function0B = companion14.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B);
                    } else {
                        dVarF.k();
                    }
                    d dVarC7 = dud.c(dVarF);
                    dud.i(dVarC7, ej7Var7, companion14.d());
                    dud.i(dVarC7, gs1VarJ7, companion14.f());
                    dud.g(dVarC7, companion14.a());
                    dud.i(dVarC7, bVarE7, companion14.e());
                    dud.i(dVarC7, Integer.valueOf(iHashCode7), companion14.c());
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                    hVar2 = hVar3;
                    f3 = f4;
                    d02Var3 = d02VarE;
                    tcVar2 = tcVarE;
                    bVar3 = bVar11;
                } else {
                    dVarF.q();
                    tcVar2 = tcVar;
                    hVar2 = hVar;
                    bVar3 = bVar2;
                    d02Var3 = d02Var2;
                    f3 = f2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.fm5
                        public final Object invoke(Object obj, Object obj2) {
                            return hm5.f(painter, str, bVar3, tcVar2, d02Var3, f3, hVar2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 196608;
            f2 = f;
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (dVarF.x(hVar)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i13 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    tcVarE = tc.INSTANCE.e();
                } else {
                    tcVarE = tcVar;
                }
                if (i6 != 0) {
                    d02VarE = d02.INSTANCE.e();
                } else {
                    d02VarE = d02Var2;
                }
                if (i8 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (i10 != 0) {
                    hVar3 = null;
                } else {
                    hVar3 = hVar;
                }
                if (e.k()) {
                    e.o(1142754848, i3, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                }
                if (str != null) {
                    dVarF.y(1899222916);
                    b.Companion companion15 = b.INSTANCE;
                    if ((i3 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objR2 = dVarF.R();
                    if (z2) {
                        objR2 = new Function1() { // from class: com.google.android.em5
                            public final Object invoke(Object obj) {
                                return hm5.e(str, (nfb) obj);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        objR2 = new Function1() { // from class: com.google.android.em5
                            public final Object invoke(Object obj) {
                                return hm5.e(str, (nfb) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    i12 = 0;
                    bVarD = afb.d(companion15, false, (Function1) objR2, 1, null);
                    dVarF.u();
                } else {
                    i12 = 0;
                    dVarF.y(1899381698);
                    dVarF.u();
                    bVarD = b.INSTANCE;
                }
                int i111 = i12;
                b bVar12 = bVar4;
                b bVarB8 = i.b(ff1.b(bVar4.then(bVarD)), painter, false, tcVarE, d02VarE, f4, hVar3, 2, null);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = a.a;
                    dVarF.L(objR);
                }
                ej7 ej7Var8 = (ej7) objR;
                int iHashCode8 = Long.hashCode(pp1.b(dVarF, i111));
                b bVarE8 = ComposedModifierKt.e(dVarF, bVarB8);
                gs1 gs1VarJ8 = dVarF.j();
                ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
                function0B = companion16.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                d dVarC8 = dud.c(dVarF);
                dud.i(dVarC8, ej7Var8, companion16.d());
                dud.i(dVarC8, gs1VarJ8, companion16.f());
                dud.g(dVarC8, companion16.a());
                dud.i(dVarC8, bVarE8, companion16.e());
                dud.i(dVarC8, Integer.valueOf(iHashCode8), companion16.c());
                dVarF.m();
                if (e.k()) {
                    e.n();
                }
                hVar2 = hVar3;
                f3 = f4;
                d02Var3 = d02VarE;
                tcVar2 = tcVarE;
                bVar3 = bVar12;
            } else {
                dVarF.q();
                tcVar2 = tcVar;
                hVar2 = hVar;
                bVar3 = bVar2;
                d02Var3 = d02Var2;
                f3 = f2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.fm5
                    public final Object invoke(Object obj, Object obj2) {
                        return hm5.f(painter, str, bVar3, tcVar2, d02Var3, f3, hVar2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        bVar2 = bVar;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                if (dVarF.x(tcVar)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    d02Var2 = d02Var;
                    if (dVarF.x(d02Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        f2 = f;
                        if (dVarF.B(f2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (dVarF.x(hVar)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i13 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            tcVarE = tc.INSTANCE.e();
                        } else {
                            tcVarE = tcVar;
                        }
                        if (i6 != 0) {
                            d02VarE = d02.INSTANCE.e();
                        } else {
                            d02VarE = d02Var2;
                        }
                        if (i8 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i10 != 0) {
                            hVar3 = null;
                        } else {
                            hVar3 = hVar;
                        }
                        if (e.k()) {
                            e.o(1142754848, i3, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                        }
                        if (str != null) {
                            dVarF.y(1899222916);
                            b.Companion companion17 = b.INSTANCE;
                            if ((i3 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objR2 = dVarF.R();
                            if (z2) {
                                objR2 = new Function1() { // from class: com.google.android.em5
                                    public final Object invoke(Object obj) {
                                        return hm5.e(str, (nfb) obj);
                                    }
                                };
                                dVarF.L(objR2);
                            } else {
                                objR2 = new Function1() { // from class: com.google.android.em5
                                    public final Object invoke(Object obj) {
                                        return hm5.e(str, (nfb) obj);
                                    }
                                };
                                dVarF.L(objR2);
                            }
                            i12 = 0;
                            bVarD = afb.d(companion17, false, (Function1) objR2, 1, null);
                            dVarF.u();
                        } else {
                            i12 = 0;
                            dVarF.y(1899381698);
                            dVarF.u();
                            bVarD = b.INSTANCE;
                        }
                        int i112 = i12;
                        b bVar13 = bVar4;
                        b bVarB9 = i.b(ff1.b(bVar4.then(bVarD)), painter, false, tcVarE, d02VarE, f4, hVar3, 2, null);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = a.a;
                            dVarF.L(objR);
                        }
                        ej7 ej7Var9 = (ej7) objR;
                        int iHashCode9 = Long.hashCode(pp1.b(dVarF, i112));
                        b bVarE9 = ComposedModifierKt.e(dVarF, bVarB9);
                        gs1 gs1VarJ9 = dVarF.j();
                        ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
                        function0B = companion18.b();
                        if (dVarF.G() == null) {
                            pp1.d();
                        }
                        dVarF.o();
                        if (dVarF.getInserting()) {
                            dVarF.W(function0B);
                        } else {
                            dVarF.k();
                        }
                        d dVarC9 = dud.c(dVarF);
                        dud.i(dVarC9, ej7Var9, companion18.d());
                        dud.i(dVarC9, gs1VarJ9, companion18.f());
                        dud.g(dVarC9, companion18.a());
                        dud.i(dVarC9, bVarE9, companion18.e());
                        dud.i(dVarC9, Integer.valueOf(iHashCode9), companion18.c());
                        dVarF.m();
                        if (e.k()) {
                            e.n();
                        }
                        hVar2 = hVar3;
                        f3 = f4;
                        d02Var3 = d02VarE;
                        tcVar2 = tcVarE;
                        bVar3 = bVar13;
                    } else {
                        dVarF.q();
                        tcVar2 = tcVar;
                        hVar2 = hVar;
                        bVar3 = bVar2;
                        d02Var3 = d02Var2;
                        f3 = f2;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.fm5
                            public final Object invoke(Object obj, Object obj2) {
                                return hm5.f(painter, str, bVar3, tcVar2, d02Var3, f3, hVar2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 196608;
                f2 = f;
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (dVarF.x(hVar)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i13 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        tcVarE = tc.INSTANCE.e();
                    } else {
                        tcVarE = tcVar;
                    }
                    if (i6 != 0) {
                        d02VarE = d02.INSTANCE.e();
                    } else {
                        d02VarE = d02Var2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i10 != 0) {
                        hVar3 = null;
                    } else {
                        hVar3 = hVar;
                    }
                    if (e.k()) {
                        e.o(1142754848, i3, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                    }
                    if (str != null) {
                        dVarF.y(1899222916);
                        b.Companion companion19 = b.INSTANCE;
                        if ((i3 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objR2 = dVarF.R();
                        if (z2) {
                            objR2 = new Function1() { // from class: com.google.android.em5
                                public final Object invoke(Object obj) {
                                    return hm5.e(str, (nfb) obj);
                                }
                            };
                            dVarF.L(objR2);
                        } else {
                            objR2 = new Function1() { // from class: com.google.android.em5
                                public final Object invoke(Object obj) {
                                    return hm5.e(str, (nfb) obj);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        i12 = 0;
                        bVarD = afb.d(companion19, false, (Function1) objR2, 1, null);
                        dVarF.u();
                    } else {
                        i12 = 0;
                        dVarF.y(1899381698);
                        dVarF.u();
                        bVarD = b.INSTANCE;
                    }
                    int i113 = i12;
                    b bVar14 = bVar4;
                    b bVarB10 = i.b(ff1.b(bVar4.then(bVarD)), painter, false, tcVarE, d02VarE, f4, hVar3, 2, null);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = a.a;
                        dVarF.L(objR);
                    }
                    ej7 ej7Var10 = (ej7) objR;
                    int iHashCode10 = Long.hashCode(pp1.b(dVarF, i113));
                    b bVarE10 = ComposedModifierKt.e(dVarF, bVarB10);
                    gs1 gs1VarJ10 = dVarF.j();
                    ComposeUiNode.Companion companion110 = ComposeUiNode.INSTANCE;
                    function0B = companion110.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B);
                    } else {
                        dVarF.k();
                    }
                    d dVarC10 = dud.c(dVarF);
                    dud.i(dVarC10, ej7Var10, companion110.d());
                    dud.i(dVarC10, gs1VarJ10, companion110.f());
                    dud.g(dVarC10, companion110.a());
                    dud.i(dVarC10, bVarE10, companion110.e());
                    dud.i(dVarC10, Integer.valueOf(iHashCode10), companion110.c());
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                    hVar2 = hVar3;
                    f3 = f4;
                    d02Var3 = d02VarE;
                    tcVar2 = tcVarE;
                    bVar3 = bVar14;
                } else {
                    dVarF.q();
                    tcVar2 = tcVar;
                    hVar2 = hVar;
                    bVar3 = bVar2;
                    d02Var3 = d02Var2;
                    f3 = f2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.fm5
                        public final Object invoke(Object obj, Object obj2) {
                            return hm5.f(painter, str, bVar3, tcVar2, d02Var3, f3, hVar2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            d02Var2 = d02Var;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (dVarF.B(f2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (dVarF.x(hVar)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i13 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        tcVarE = tc.INSTANCE.e();
                    } else {
                        tcVarE = tcVar;
                    }
                    if (i6 != 0) {
                        d02VarE = d02.INSTANCE.e();
                    } else {
                        d02VarE = d02Var2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i10 != 0) {
                        hVar3 = null;
                    } else {
                        hVar3 = hVar;
                    }
                    if (e.k()) {
                        e.o(1142754848, i3, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                    }
                    if (str != null) {
                        dVarF.y(1899222916);
                        b.Companion companion111 = b.INSTANCE;
                        if ((i3 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objR2 = dVarF.R();
                        if (z2) {
                            objR2 = new Function1() { // from class: com.google.android.em5
                                public final Object invoke(Object obj) {
                                    return hm5.e(str, (nfb) obj);
                                }
                            };
                            dVarF.L(objR2);
                        } else {
                            objR2 = new Function1() { // from class: com.google.android.em5
                                public final Object invoke(Object obj) {
                                    return hm5.e(str, (nfb) obj);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        i12 = 0;
                        bVarD = afb.d(companion111, false, (Function1) objR2, 1, null);
                        dVarF.u();
                    } else {
                        i12 = 0;
                        dVarF.y(1899381698);
                        dVarF.u();
                        bVarD = b.INSTANCE;
                    }
                    int i114 = i12;
                    b bVar15 = bVar4;
                    b bVarB11 = i.b(ff1.b(bVar4.then(bVarD)), painter, false, tcVarE, d02VarE, f4, hVar3, 2, null);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = a.a;
                        dVarF.L(objR);
                    }
                    ej7 ej7Var11 = (ej7) objR;
                    int iHashCode11 = Long.hashCode(pp1.b(dVarF, i114));
                    b bVarE11 = ComposedModifierKt.e(dVarF, bVarB11);
                    gs1 gs1VarJ11 = dVarF.j();
                    ComposeUiNode.Companion companion112 = ComposeUiNode.INSTANCE;
                    function0B = companion112.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B);
                    } else {
                        dVarF.k();
                    }
                    d dVarC11 = dud.c(dVarF);
                    dud.i(dVarC11, ej7Var11, companion112.d());
                    dud.i(dVarC11, gs1VarJ11, companion112.f());
                    dud.g(dVarC11, companion112.a());
                    dud.i(dVarC11, bVarE11, companion112.e());
                    dud.i(dVarC11, Integer.valueOf(iHashCode11), companion112.c());
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                    hVar2 = hVar3;
                    f3 = f4;
                    d02Var3 = d02VarE;
                    tcVar2 = tcVarE;
                    bVar3 = bVar15;
                } else {
                    dVarF.q();
                    tcVar2 = tcVar;
                    hVar2 = hVar;
                    bVar3 = bVar2;
                    d02Var3 = d02Var2;
                    f3 = f2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.fm5
                        public final Object invoke(Object obj, Object obj2) {
                            return hm5.f(painter, str, bVar3, tcVar2, d02Var3, f3, hVar2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 196608;
            f2 = f;
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (dVarF.x(hVar)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i13 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    tcVarE = tc.INSTANCE.e();
                } else {
                    tcVarE = tcVar;
                }
                if (i6 != 0) {
                    d02VarE = d02.INSTANCE.e();
                } else {
                    d02VarE = d02Var2;
                }
                if (i8 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (i10 != 0) {
                    hVar3 = null;
                } else {
                    hVar3 = hVar;
                }
                if (e.k()) {
                    e.o(1142754848, i3, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                }
                if (str != null) {
                    dVarF.y(1899222916);
                    b.Companion companion113 = b.INSTANCE;
                    if ((i3 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objR2 = dVarF.R();
                    if (z2) {
                        objR2 = new Function1() { // from class: com.google.android.em5
                            public final Object invoke(Object obj) {
                                return hm5.e(str, (nfb) obj);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        objR2 = new Function1() { // from class: com.google.android.em5
                            public final Object invoke(Object obj) {
                                return hm5.e(str, (nfb) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    i12 = 0;
                    bVarD = afb.d(companion113, false, (Function1) objR2, 1, null);
                    dVarF.u();
                } else {
                    i12 = 0;
                    dVarF.y(1899381698);
                    dVarF.u();
                    bVarD = b.INSTANCE;
                }
                int i115 = i12;
                b bVar16 = bVar4;
                b bVarB12 = i.b(ff1.b(bVar4.then(bVarD)), painter, false, tcVarE, d02VarE, f4, hVar3, 2, null);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = a.a;
                    dVarF.L(objR);
                }
                ej7 ej7Var12 = (ej7) objR;
                int iHashCode12 = Long.hashCode(pp1.b(dVarF, i115));
                b bVarE12 = ComposedModifierKt.e(dVarF, bVarB12);
                gs1 gs1VarJ12 = dVarF.j();
                ComposeUiNode.Companion companion114 = ComposeUiNode.INSTANCE;
                function0B = companion114.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                d dVarC12 = dud.c(dVarF);
                dud.i(dVarC12, ej7Var12, companion114.d());
                dud.i(dVarC12, gs1VarJ12, companion114.f());
                dud.g(dVarC12, companion114.a());
                dud.i(dVarC12, bVarE12, companion114.e());
                dud.i(dVarC12, Integer.valueOf(iHashCode12), companion114.c());
                dVarF.m();
                if (e.k()) {
                    e.n();
                }
                hVar2 = hVar3;
                f3 = f4;
                d02Var3 = d02VarE;
                tcVar2 = tcVarE;
                bVar3 = bVar16;
            } else {
                dVarF.q();
                tcVar2 = tcVar;
                hVar2 = hVar;
                bVar3 = bVar2;
                d02Var3 = d02Var2;
                f3 = f2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.fm5
                    public final Object invoke(Object obj, Object obj2) {
                        return hm5.f(painter, str, bVar3, tcVar2, d02Var3, f3, hVar2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 3072;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                d02Var2 = d02Var;
                if (dVarF.x(d02Var2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (dVarF.B(f2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (dVarF.x(hVar)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i13 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        tcVarE = tc.INSTANCE.e();
                    } else {
                        tcVarE = tcVar;
                    }
                    if (i6 != 0) {
                        d02VarE = d02.INSTANCE.e();
                    } else {
                        d02VarE = d02Var2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i10 != 0) {
                        hVar3 = null;
                    } else {
                        hVar3 = hVar;
                    }
                    if (e.k()) {
                        e.o(1142754848, i3, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                    }
                    if (str != null) {
                        dVarF.y(1899222916);
                        b.Companion companion115 = b.INSTANCE;
                        if ((i3 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objR2 = dVarF.R();
                        if (z2) {
                            objR2 = new Function1() { // from class: com.google.android.em5
                                public final Object invoke(Object obj) {
                                    return hm5.e(str, (nfb) obj);
                                }
                            };
                            dVarF.L(objR2);
                        } else {
                            objR2 = new Function1() { // from class: com.google.android.em5
                                public final Object invoke(Object obj) {
                                    return hm5.e(str, (nfb) obj);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        i12 = 0;
                        bVarD = afb.d(companion115, false, (Function1) objR2, 1, null);
                        dVarF.u();
                    } else {
                        i12 = 0;
                        dVarF.y(1899381698);
                        dVarF.u();
                        bVarD = b.INSTANCE;
                    }
                    int i116 = i12;
                    b bVar17 = bVar4;
                    b bVarB13 = i.b(ff1.b(bVar4.then(bVarD)), painter, false, tcVarE, d02VarE, f4, hVar3, 2, null);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = a.a;
                        dVarF.L(objR);
                    }
                    ej7 ej7Var13 = (ej7) objR;
                    int iHashCode13 = Long.hashCode(pp1.b(dVarF, i116));
                    b bVarE13 = ComposedModifierKt.e(dVarF, bVarB13);
                    gs1 gs1VarJ13 = dVarF.j();
                    ComposeUiNode.Companion companion116 = ComposeUiNode.INSTANCE;
                    function0B = companion116.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B);
                    } else {
                        dVarF.k();
                    }
                    d dVarC13 = dud.c(dVarF);
                    dud.i(dVarC13, ej7Var13, companion116.d());
                    dud.i(dVarC13, gs1VarJ13, companion116.f());
                    dud.g(dVarC13, companion116.a());
                    dud.i(dVarC13, bVarE13, companion116.e());
                    dud.i(dVarC13, Integer.valueOf(iHashCode13), companion116.c());
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                    hVar2 = hVar3;
                    f3 = f4;
                    d02Var3 = d02VarE;
                    tcVar2 = tcVarE;
                    bVar3 = bVar17;
                } else {
                    dVarF.q();
                    tcVar2 = tcVar;
                    hVar2 = hVar;
                    bVar3 = bVar2;
                    d02Var3 = d02Var2;
                    f3 = f2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.fm5
                        public final Object invoke(Object obj, Object obj2) {
                            return hm5.f(painter, str, bVar3, tcVar2, d02Var3, f3, hVar2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 196608;
            f2 = f;
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (dVarF.x(hVar)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i13 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    tcVarE = tc.INSTANCE.e();
                } else {
                    tcVarE = tcVar;
                }
                if (i6 != 0) {
                    d02VarE = d02.INSTANCE.e();
                } else {
                    d02VarE = d02Var2;
                }
                if (i8 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (i10 != 0) {
                    hVar3 = null;
                } else {
                    hVar3 = hVar;
                }
                if (e.k()) {
                    e.o(1142754848, i3, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                }
                if (str != null) {
                    dVarF.y(1899222916);
                    b.Companion companion117 = b.INSTANCE;
                    if ((i3 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objR2 = dVarF.R();
                    if (z2) {
                        objR2 = new Function1() { // from class: com.google.android.em5
                            public final Object invoke(Object obj) {
                                return hm5.e(str, (nfb) obj);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        objR2 = new Function1() { // from class: com.google.android.em5
                            public final Object invoke(Object obj) {
                                return hm5.e(str, (nfb) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    i12 = 0;
                    bVarD = afb.d(companion117, false, (Function1) objR2, 1, null);
                    dVarF.u();
                } else {
                    i12 = 0;
                    dVarF.y(1899381698);
                    dVarF.u();
                    bVarD = b.INSTANCE;
                }
                int i117 = i12;
                b bVar18 = bVar4;
                b bVarB14 = i.b(ff1.b(bVar4.then(bVarD)), painter, false, tcVarE, d02VarE, f4, hVar3, 2, null);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = a.a;
                    dVarF.L(objR);
                }
                ej7 ej7Var14 = (ej7) objR;
                int iHashCode14 = Long.hashCode(pp1.b(dVarF, i117));
                b bVarE14 = ComposedModifierKt.e(dVarF, bVarB14);
                gs1 gs1VarJ14 = dVarF.j();
                ComposeUiNode.Companion companion118 = ComposeUiNode.INSTANCE;
                function0B = companion118.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                d dVarC14 = dud.c(dVarF);
                dud.i(dVarC14, ej7Var14, companion118.d());
                dud.i(dVarC14, gs1VarJ14, companion118.f());
                dud.g(dVarC14, companion118.a());
                dud.i(dVarC14, bVarE14, companion118.e());
                dud.i(dVarC14, Integer.valueOf(iHashCode14), companion118.c());
                dVarF.m();
                if (e.k()) {
                    e.n();
                }
                hVar2 = hVar3;
                f3 = f4;
                d02Var3 = d02VarE;
                tcVar2 = tcVarE;
                bVar3 = bVar18;
            } else {
                dVarF.q();
                tcVar2 = tcVar;
                hVar2 = hVar;
                bVar3 = bVar2;
                d02Var3 = d02Var2;
                f3 = f2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.fm5
                    public final Object invoke(Object obj, Object obj2) {
                        return hm5.f(painter, str, bVar3, tcVar2, d02Var3, f3, hVar2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 24576;
        d02Var2 = d02Var;
        i8 = i2 & 32;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                f2 = f;
                if (dVarF.B(f2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (dVarF.x(hVar)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i13 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    tcVarE = tc.INSTANCE.e();
                } else {
                    tcVarE = tcVar;
                }
                if (i6 != 0) {
                    d02VarE = d02.INSTANCE.e();
                } else {
                    d02VarE = d02Var2;
                }
                if (i8 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (i10 != 0) {
                    hVar3 = null;
                } else {
                    hVar3 = hVar;
                }
                if (e.k()) {
                    e.o(1142754848, i3, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                }
                if (str != null) {
                    dVarF.y(1899222916);
                    b.Companion companion119 = b.INSTANCE;
                    if ((i3 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objR2 = dVarF.R();
                    if (z2) {
                        objR2 = new Function1() { // from class: com.google.android.em5
                            public final Object invoke(Object obj) {
                                return hm5.e(str, (nfb) obj);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        objR2 = new Function1() { // from class: com.google.android.em5
                            public final Object invoke(Object obj) {
                                return hm5.e(str, (nfb) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    i12 = 0;
                    bVarD = afb.d(companion119, false, (Function1) objR2, 1, null);
                    dVarF.u();
                } else {
                    i12 = 0;
                    dVarF.y(1899381698);
                    dVarF.u();
                    bVarD = b.INSTANCE;
                }
                int i118 = i12;
                b bVar19 = bVar4;
                b bVarB15 = i.b(ff1.b(bVar4.then(bVarD)), painter, false, tcVarE, d02VarE, f4, hVar3, 2, null);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = a.a;
                    dVarF.L(objR);
                }
                ej7 ej7Var15 = (ej7) objR;
                int iHashCode15 = Long.hashCode(pp1.b(dVarF, i118));
                b bVarE15 = ComposedModifierKt.e(dVarF, bVarB15);
                gs1 gs1VarJ15 = dVarF.j();
                ComposeUiNode.Companion companion1110 = ComposeUiNode.INSTANCE;
                function0B = companion1110.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                d dVarC15 = dud.c(dVarF);
                dud.i(dVarC15, ej7Var15, companion1110.d());
                dud.i(dVarC15, gs1VarJ15, companion1110.f());
                dud.g(dVarC15, companion1110.a());
                dud.i(dVarC15, bVarE15, companion1110.e());
                dud.i(dVarC15, Integer.valueOf(iHashCode15), companion1110.c());
                dVarF.m();
                if (e.k()) {
                    e.n();
                }
                hVar2 = hVar3;
                f3 = f4;
                d02Var3 = d02VarE;
                tcVar2 = tcVarE;
                bVar3 = bVar19;
            } else {
                dVarF.q();
                tcVar2 = tcVar;
                hVar2 = hVar;
                bVar3 = bVar2;
                d02Var3 = d02Var2;
                f3 = f2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.fm5
                    public final Object invoke(Object obj, Object obj2) {
                        return hm5.f(painter, str, bVar3, tcVar2, d02Var3, f3, hVar2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 196608;
        f2 = f;
        i10 = i2 & 64;
        if (i10 != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (dVarF.x(hVar)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i3 |= i11;
        }
        if ((i3 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (dVarF.g(z, i3 & 1)) {
            if (i13 != 0) {
                bVar4 = b.INSTANCE;
            } else {
                bVar4 = bVar2;
            }
            if (i4 != 0) {
                tcVarE = tc.INSTANCE.e();
            } else {
                tcVarE = tcVar;
            }
            if (i6 != 0) {
                d02VarE = d02.INSTANCE.e();
            } else {
                d02VarE = d02Var2;
            }
            if (i8 != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            if (i10 != 0) {
                hVar3 = null;
            } else {
                hVar3 = hVar;
            }
            if (e.k()) {
                e.o(1142754848, i3, -1, "androidx.compose.foundation.Image (Image.kt:247)");
            }
            if (str != null) {
                dVarF.y(1899222916);
                b.Companion companion1111 = b.INSTANCE;
                if ((i3 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objR2 = dVarF.R();
                if (z2) {
                    objR2 = new Function1() { // from class: com.google.android.em5
                        public final Object invoke(Object obj) {
                            return hm5.e(str, (nfb) obj);
                        }
                    };
                    dVarF.L(objR2);
                } else {
                    objR2 = new Function1() { // from class: com.google.android.em5
                        public final Object invoke(Object obj) {
                            return hm5.e(str, (nfb) obj);
                        }
                    };
                    dVarF.L(objR2);
                }
                i12 = 0;
                bVarD = afb.d(companion1111, false, (Function1) objR2, 1, null);
                dVarF.u();
            } else {
                i12 = 0;
                dVarF.y(1899381698);
                dVarF.u();
                bVarD = b.INSTANCE;
            }
            int i119 = i12;
            b bVar110 = bVar4;
            b bVarB16 = i.b(ff1.b(bVar4.then(bVarD)), painter, false, tcVarE, d02VarE, f4, hVar3, 2, null);
            objR = dVarF.R();
            if (objR == d.INSTANCE.a()) {
                objR = a.a;
                dVarF.L(objR);
            }
            ej7 ej7Var16 = (ej7) objR;
            int iHashCode16 = Long.hashCode(pp1.b(dVarF, i119));
            b bVarE16 = ComposedModifierKt.e(dVarF, bVarB16);
            gs1 gs1VarJ16 = dVarF.j();
            ComposeUiNode.Companion companion1112 = ComposeUiNode.INSTANCE;
            function0B = companion1112.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            d dVarC16 = dud.c(dVarF);
            dud.i(dVarC16, ej7Var16, companion1112.d());
            dud.i(dVarC16, gs1VarJ16, companion1112.f());
            dud.g(dVarC16, companion1112.a());
            dud.i(dVarC16, bVarE16, companion1112.e());
            dud.i(dVarC16, Integer.valueOf(iHashCode16), companion1112.c());
            dVarF.m();
            if (e.k()) {
                e.n();
            }
            hVar2 = hVar3;
            f3 = f4;
            d02Var3 = d02VarE;
            tcVar2 = tcVarE;
            bVar3 = bVar110;
        } else {
            dVarF.q();
            tcVar2 = tcVar;
            hVar2 = hVar;
            bVar3 = bVar2;
            d02Var3 = d02Var2;
            f3 = f2;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.fm5
                public final Object invoke(Object obj, Object obj2) {
                    return hm5.f(painter, str, bVar3, tcVar2, d02Var3, f3, hVar2, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void d(pp5 pp5Var, String str, b bVar, tc tcVar, d02 d02Var, float f, h hVar, d dVar, int i, int i2) {
        if ((i2 & 4) != 0) {
            bVar = b.INSTANCE;
        }
        b bVar2 = bVar;
        if ((i2 & 8) != 0) {
            tcVar = tc.INSTANCE.e();
        }
        tc tcVar2 = tcVar;
        d02 d02VarE = (i2 & 16) != 0 ? d02.INSTANCE.e() : d02Var;
        float f2 = (i2 & 32) != 0 ? 1.0f : f;
        h hVar2 = (i2 & 64) != 0 ? null : hVar;
        if (e.k()) {
            e.o(1595907091, i, -1, "androidx.compose.foundation.Image (Image.kt:202)");
        }
        c(c3e.g(pp5Var, dVar, i & 14), str, bVar2, tcVar2, d02VarE, f2, hVar2, dVar, VectorPainter.n | (i & 112) | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (3670016 & i), 0);
        if (e.k()) {
            e.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(String str, nfb nfbVar) {
        SemanticsPropertiesKt.b0(nfbVar, str);
        SemanticsPropertiesKt.p0(nfbVar, hpa.INSTANCE.e());
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Painter painter, String str, b bVar, tc tcVar, d02 d02Var, float f, h hVar, int i, int i2, d dVar, int i3) {
        c(painter, str, bVar, tcVar, d02Var, f, hVar, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    public static final void g(ml5 ml5Var, String str, b bVar, tc tcVar, d02 d02Var, float f, h hVar, int i, d dVar, int i2, int i3) {
        b bVar2 = (i3 & 4) != 0 ? b.INSTANCE : bVar;
        tc tcVarE = (i3 & 8) != 0 ? tc.INSTANCE.e() : tcVar;
        d02 d02VarE = (i3 & 16) != 0 ? d02.INSTANCE.e() : d02Var;
        float f2 = (i3 & 32) != 0 ? 1.0f : f;
        h hVar2 = (i3 & 64) != 0 ? null : hVar;
        int iB = (i3 & 128) != 0 ? DrawScope.INSTANCE.b() : i;
        if (e.k()) {
            e.o(-1396260732, i2, -1, "androidx.compose.foundation.Image (Image.kt:156)");
        }
        boolean zX = dVar.x(ml5Var);
        Object objR = dVar.R();
        if (zX || objR == d.INSTANCE.a()) {
            objR = fo0.b(ml5Var, 0L, 0L, iB, 6, null);
            dVar.L(objR);
        }
        c((BitmapPainter) objR, str, bVar2, tcVarE, d02VarE, f2, hVar2, dVar, BitmapPainter.o | (i2 & 112) | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (i2 & 3670016), 0);
        if (e.k()) {
            e.n();
        }
    }
}
