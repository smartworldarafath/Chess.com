package com.google.inputmethod;

import androidx.compose.p001foundation.BackgroundKt;
import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p001foundation.layout.c;
import androidx.compose.p001foundation.layout.t0;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalRuler;
import androidx.compose.ui.layout.VerticalRuler;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.ps4;
import com.google.android.qjd;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aA\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aE\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u000f\u001a\u00020\u0004*\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0016\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u0019\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015\"\u001a\u0010\u001c\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015\"\u001a\u0010\u001f\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015\"\u001a\u0010%\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u001a\u0010*\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lkotlin/Function1;", "Lcom/google/android/mt0;", "", "badge", "Landroidx/compose/ui/b;", "modifier", "content", "h", "(Lcom/google/android/ps4;Landroidx/compose/ui/b;Lcom/google/android/ps4;Landroidx/compose/runtime/d;II)V", "Lcom/google/android/ei1;", "containerColor", "contentColor", "Lcom/google/android/hra;", "f", "(Landroidx/compose/ui/b;JJLcom/google/android/ps4;Landroidx/compose/runtime/d;II)V", "j", "(Landroidx/compose/ui/b;)Landroidx/compose/ui/b;", "Lcom/google/android/ff3;", "a", "F", "getBadgeWithContentHorizontalPadding", "()F", "BadgeWithContentHorizontalPadding", "b", "q", "BadgeWithContentHorizontalOffset", "c", "r", "BadgeWithContentVerticalOffset", "d", "o", "BadgeOffset", "Landroidx/compose/ui/layout/HorizontalRuler;", "e", "Landroidx/compose/ui/layout/HorizontalRuler;", "p", "()Landroidx/compose/ui/layout/HorizontalRuler;", "BadgeTopRuler", "Landroidx/compose/ui/layout/VerticalRuler;", "Landroidx/compose/ui/layout/VerticalRuler;", "n", "()Landroidx/compose/ui/layout/VerticalRuler;", "BadgeEndRuler", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class fe0 {
    private static final float a = ff3.i(4);
    private static final float b = ff3.i(12);
    private static final float c = ff3.i(14);
    private static final float d = ff3.i(6);
    private static final HorizontalRuler e = new HorizontalRuler();
    private static final VerticalRuler f = new VerticalRuler();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements Function2<d, Integer, Unit> {
        final /* synthetic */ ps4<hra, d, Integer, Unit> a;
        final /* synthetic */ hra b;

        /* JADX WARN: Multi-variable type inference failed */
        a(ps4<? super hra, ? super d, ? super Integer, Unit> ps4Var, hra hraVar) {
            this.a = ps4Var;
            this.b = hraVar;
        }

        public final void a(d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(541712501, i, -1, "androidx.compose.material3.Badge.<anonymous>.<anonymous> (Badge.kt:184)");
            }
            this.a.invoke(this.b, dVar, 0);
            if (e.k()) {
                e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements ej7 {
        public static final b a = new b();

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(o oVar, j jVar, o oVar2, o.a aVar) {
            boolean z = oVar.getWidth() > jVar.O1(he0.a.f());
            float fQ = z ? fe0.q() : fe0.o();
            float fR = z ? fe0.r() : fe0.o();
            o.a.L(aVar, oVar2, 0, 0, 0.0f, 4, null);
            o.a.L(aVar, oVar, Math.min(oVar2.getWidth() - jVar.O1(fQ), ((int) aVar.j(fe0.n(), Float.POSITIVE_INFINITY)) - oVar.getWidth()), Math.max((-oVar.getHeight()) + jVar.O1(fR), (int) aVar.j(fe0.p(), Float.NEGATIVE_INFINITY)), 0.0f, 4, null);
            return Unit.a;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        @Override // com.google.inputmethod.ej7
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final fj7 mo0measure3p2s80s(final j jVar, List<? extends dj7> list, long j) throws KotlinNothingValueException {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                dj7 dj7Var = list.get(i);
                if (Intrinsics.e(pn6.a(dj7Var), "badge")) {
                    final o oVarR0 = dj7Var.r0(kx1.d(j, 0, 0, 0, 0, 11, null));
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        dj7 dj7Var2 = list.get(i2);
                        if (Intrinsics.e(pn6.a(dj7Var2), "anchor")) {
                            final o oVarR1 = dj7Var2.r0(j);
                            return jVar.h2(oVarR1.getWidth(), oVarR1.getHeight(), b0.n(new Pair[]{qjd.a(AlignmentLineKt.a(), Integer.valueOf(oVarR1.J(AlignmentLineKt.a()))), qjd.a(AlignmentLineKt.b(), Integer.valueOf(oVarR1.J(AlignmentLineKt.b())))}), new Function1() { // from class: com.google.android.ge0
                                public final Object invoke(Object obj) {
                                    return fe0.b.b(oVarR0, jVar, oVarR1, (o.a) obj);
                                }
                            });
                        }
                    }
                    m47.f("Collection contains no element matching the predicate.");
                    throw new KotlinNothingValueException();
                }
            }
            m47.f("Collection contains no element matching the predicate.");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:101:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:102:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:108:0x0201  */
    /* JADX WARN: Code duplicated, block: B:111:0x020d  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:85:0x011c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0126  */
    /* JADX WARN: Code duplicated, block: B:89:0x0157  */
    /* JADX WARN: Code duplicated, block: B:92:0x0163  */
    /* JADX WARN: Code duplicated, block: B:93:0x0167  */
    /* JADX WARN: Code duplicated, block: B:98:0x0194  */
    public static final void f(androidx.compose.ui.b bVar, long j, long j2, ps4<? super hra, ? super d, ? super Integer, Unit> ps4Var, d dVar, final int i, final int i2) throws NoWhenBranchMatchedException {
        androidx.compose.ui.b bVar2;
        int i3;
        long jA;
        long jG;
        ps4<? super hra, ? super d, ? super Integer, Unit> ps4Var2;
        boolean z;
        d dVar2;
        final androidx.compose.ui.b bVar3;
        final long j3;
        final long j4;
        final ps4<? super hra, ? super d, ? super Integer, Unit> ps4Var3;
        s6b s6bVarH;
        androidx.compose.ui.b bVar4;
        he0 he0Var;
        float f2;
        xkb xkbVarI;
        androidx.compose.ui.b bVarP;
        int iA;
        Function0<ComposeUiNode> function0B;
        d dVarC;
        Function2<ComposeUiNode, Integer, Unit> function2C;
        ira iraVar;
        d dVarF = dVar.F(1428256508);
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
        if ((i & 48) == 0) {
            jA = j;
            i3 |= ((i2 & 2) == 0 && dVarF.D(jA)) ? 32 : 16;
        } else {
            jA = j;
        }
        if ((i & 384) == 0) {
            jG = j2;
            i3 |= ((i2 & 4) == 0 && dVarF.D(jG)) ? 256 : 128;
        } else {
            jG = j2;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                ps4Var2 = ps4Var;
                i3 |= dVarF.T(ps4Var2) ? 2048 : 1024;
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
                        bVar4 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i2 & 2) != 0) {
                        jA = zd0.a.a(dVarF, 6);
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        jG = bj1.g(jA, dVarF, (i3 >> 3) & 14);
                        i3 &= -897;
                    }
                    if (i5 != 0) {
                        ps4Var2 = null;
                    }
                } else {
                    dVarF.q();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    bVar4 = bVar2;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(1428256508, i3, -1, "androidx.compose.material3.Badge (Badge.kt:155)");
                }
                he0Var = he0.a;
                if (ps4Var2 != null) {
                    f2 = he0Var.d();
                } else {
                    f2 = he0Var.f();
                }
                if (ps4Var2 != null) {
                    dVarF.y(-1051012910);
                    xkbVarI = ulb.i(he0.a.c(), dVarF, 6);
                    dVarF.u();
                } else {
                    dVarF.y(-1050955529);
                    xkbVarI = ulb.i(he0.a.e(), dVarF, 6);
                    dVarF.u();
                }
                androidx.compose.ui.b bVarC = BackgroundKt.c(SizeKt.a(bVar4, f2, f2), jA, xkbVarI);
                if (ps4Var2 != null) {
                    bVarP = nx8.p(androidx.compose.ui.b.INSTANCE, a, 0.0f, 2, null);
                } else {
                    bVarP = androidx.compose.ui.b.INSTANCE;
                }
                androidx.compose.ui.b bVarThen = bVarC.then(bVarP);
                ej7 ej7VarB = t0.b(c.a.e(), tc.INSTANCE.i(), dVarF, 54);
                iA = pp1.a(dVarF, 0);
                gs1 gs1VarJ = dVarF.j();
                androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, bVarThen);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                function0B = companion.b();
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
                dud.i(dVarC, ej7VarB, companion.d());
                dud.i(dVarC, gs1VarJ, companion.f());
                function2C = companion.c();
                if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                }
                dud.i(dVarC, bVarE, companion.e());
                iraVar = ira.a;
                if (ps4Var2 != null) {
                    dVarF.y(1345815094);
                    ns9.b(jG, xod.e(he0.a.b(), dVarF, 6), ko1.e(541712501, true, new a(ps4Var2, iraVar), dVarF, 54), dVarF, ((i3 >> 6) & 14) | 384);
                    dVar2 = dVarF;
                    dVar2.u();
                } else {
                    dVar2 = dVarF;
                    dVar2.y(1346141834);
                    dVar2.u();
                }
                dVar2.m();
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar4;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar3 = bVar2;
            }
            j3 = jA;
            j4 = jG;
            ps4Var3 = ps4Var2;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.ae0
                    public final Object invoke(Object obj, Object obj2) {
                        return fe0.g(bVar3, j3, j4, ps4Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 3072;
        ps4Var2 = ps4Var;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (dVarF.g(z, i3 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    bVar4 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if ((i2 & 2) != 0) {
                    jA = zd0.a.a(dVarF, 6);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    jG = bj1.g(jA, dVarF, (i3 >> 3) & 14);
                    i3 &= -897;
                }
                if (i5 != 0) {
                    ps4Var2 = null;
                }
            } else {
                if (i4 != 0) {
                    bVar4 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if ((i2 & 2) != 0) {
                    jA = zd0.a.a(dVarF, 6);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    jG = bj1.g(jA, dVarF, (i3 >> 3) & 14);
                    i3 &= -897;
                }
                if (i5 != 0) {
                    ps4Var2 = null;
                }
            }
            dVarF.M();
            if (e.k()) {
                e.o(1428256508, i3, -1, "androidx.compose.material3.Badge (Badge.kt:155)");
            }
            he0Var = he0.a;
            if (ps4Var2 != null) {
                f2 = he0Var.d();
            } else {
                f2 = he0Var.f();
            }
            if (ps4Var2 != null) {
                dVarF.y(-1051012910);
                xkbVarI = ulb.i(he0.a.c(), dVarF, 6);
                dVarF.u();
            } else {
                dVarF.y(-1050955529);
                xkbVarI = ulb.i(he0.a.e(), dVarF, 6);
                dVarF.u();
            }
            androidx.compose.ui.b bVarC2 = BackgroundKt.c(SizeKt.a(bVar4, f2, f2), jA, xkbVarI);
            if (ps4Var2 != null) {
                bVarP = nx8.p(androidx.compose.ui.b.INSTANCE, a, 0.0f, 2, null);
            } else {
                bVarP = androidx.compose.ui.b.INSTANCE;
            }
            androidx.compose.ui.b bVarThen2 = bVarC2.then(bVarP);
            ej7 ej7VarB2 = t0.b(c.a.e(), tc.INSTANCE.i(), dVarF, 54);
            iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ2 = dVarF.j();
            androidx.compose.ui.b bVarE2 = ComposedModifierKt.e(dVarF, bVarThen2);
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
            dVarC = dud.c(dVarF);
            dud.i(dVarC, ej7VarB2, companion2.d());
            dud.i(dVarC, gs1VarJ2, companion2.f());
            function2C = companion2.c();
            if (dVarC.getInserting()) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            } else {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE2, companion2.e());
            iraVar = ira.a;
            if (ps4Var2 != null) {
                dVarF.y(1345815094);
                ns9.b(jG, xod.e(he0.a.b(), dVarF, 6), ko1.e(541712501, true, new a(ps4Var2, iraVar), dVarF, 54), dVarF, ((i3 >> 6) & 14) | 384);
                dVar2 = dVarF;
                dVar2.u();
            } else {
                dVar2 = dVarF;
                dVar2.y(1346141834);
                dVar2.u();
            }
            dVar2.m();
            if (e.k()) {
                e.n();
            }
            bVar3 = bVar4;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            bVar3 = bVar2;
        }
        j3 = jA;
        j4 = jG;
        ps4Var3 = ps4Var2;
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.ae0
                public final Object invoke(Object obj, Object obj2) {
                    return fe0.g(bVar3, j3, j4, ps4Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit g(androidx.compose.ui.b bVar, long j, long j2, ps4 ps4Var, int i, int i2, d dVar, int i3) throws NoWhenBranchMatchedException {
        f(bVar, j, j2, ps4Var, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:63:0x0127  */
    /* JADX WARN: Code duplicated, block: B:66:0x0133  */
    /* JADX WARN: Code duplicated, block: B:67:0x0137  */
    /* JADX WARN: Code duplicated, block: B:72:0x0164  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:87:0x0221  */
    /* JADX WARN: Code duplicated, block: B:88:0x0225  */
    /* JADX WARN: Code duplicated, block: B:91:0x022f  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    public static final void h(final ps4<? super mt0, ? super d, ? super Integer, Unit> ps4Var, androidx.compose.ui.b bVar, final ps4<? super mt0, ? super d, ? super Integer, Unit> ps4Var2, d dVar, final int i, final int i2) {
        int i3;
        androidx.compose.ui.b bVar2;
        int i4;
        boolean z;
        androidx.compose.ui.b bVar3;
        s6b s6bVarH;
        Object objR;
        int iA;
        Function0<ComposeUiNode> function0B;
        d dVarC;
        Function2<ComposeUiNode, Integer, Unit> function2C;
        int iA2;
        Function0<ComposeUiNode> function0B2;
        d dVarC2;
        Function2<ComposeUiNode, Integer, Unit> function2C2;
        int iA3;
        Function0<ComposeUiNode> function0B3;
        d dVarC3;
        Function2<ComposeUiNode, Integer, Unit> function2C3;
        d dVarF = dVar.F(-1693825945);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.T(ps4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                bVar2 = bVar;
                i3 |= dVarF.x(bVar2) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                if (dVarF.T(ps4Var2)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i5 != 0) {
                    bVar3 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar3 = bVar2;
                }
                if (e.k()) {
                    e.o(-1693825945, i3, -1, "androidx.compose.material3.BadgedBox (Badge.kt:67)");
                }
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = b.a;
                    dVarF.L(objR);
                }
                ej7 ej7Var = (ej7) objR;
                iA = pp1.a(dVarF, 0);
                gs1 gs1VarJ = dVarF.j();
                androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, bVar3);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                function0B = companion.b();
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
                dud.i(dVarC, ej7Var, companion.d());
                dud.i(dVarC, gs1VarJ, companion.f());
                function2C = companion.c();
                if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                }
                dud.i(dVarC, bVarE, companion.e());
                androidx.compose.ui.b.Companion companion2 = androidx.compose.ui.b.INSTANCE;
                androidx.compose.ui.b bVarB = pn6.b(companion2, "anchor");
                tc.Companion companion3 = tc.INSTANCE;
                int i6 = ((i3 << 3) & 7168) | 54;
                ej7 ej7VarI = androidx.compose.p001foundation.layout.j.i(companion3.e(), false);
                iA2 = pp1.a(dVarF, 0);
                gs1 gs1VarJ2 = dVarF.j();
                androidx.compose.ui.b bVarE2 = ComposedModifierKt.e(dVarF, bVarB);
                function0B2 = companion.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B2);
                } else {
                    dVarF.k();
                }
                dVarC2 = dud.c(dVarF);
                dud.i(dVarC2, ej7VarI, companion.d());
                dud.i(dVarC2, gs1VarJ2, companion.f());
                function2C2 = companion.c();
                if (dVarC2.getInserting() || !Intrinsics.e(dVarC2.R(), Integer.valueOf(iA2))) {
                    dVarC2.L(Integer.valueOf(iA2));
                    dVarC2.e(Integer.valueOf(iA2), function2C2);
                }
                dud.i(dVarC2, bVarE2, companion.e());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                ps4Var2.invoke(boxScopeInstance, dVarF, Integer.valueOf(((i6 >> 6) & 112) | 6));
                dVarF.m();
                androidx.compose.ui.b bVarB2 = pn6.b(companion2, "badge");
                int i7 = ((i3 << 9) & 7168) | 6;
                ej7 ej7VarI2 = androidx.compose.p001foundation.layout.j.i(companion3.o(), false);
                iA3 = pp1.a(dVarF, 0);
                gs1 gs1VarJ3 = dVarF.j();
                androidx.compose.ui.b bVarE3 = ComposedModifierKt.e(dVarF, bVarB2);
                function0B3 = companion.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B3);
                } else {
                    dVarF.k();
                }
                dVarC3 = dud.c(dVarF);
                dud.i(dVarC3, ej7VarI2, companion.d());
                dud.i(dVarC3, gs1VarJ3, companion.f());
                function2C3 = companion.c();
                if (dVarC3.getInserting() || !Intrinsics.e(dVarC3.R(), Integer.valueOf(iA3))) {
                    dVarC3.L(Integer.valueOf(iA3));
                    dVarC3.e(Integer.valueOf(iA3), function2C3);
                }
                dud.i(dVarC3, bVarE3, companion.e());
                ps4Var.invoke(boxScopeInstance, dVarF, Integer.valueOf(((i7 >> 6) & 112) | 6));
                dVarF.m();
                dVarF.m();
                if (e.k()) {
                    e.n();
                }
            } else {
                dVarF.q();
                bVar3 = bVar2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                final androidx.compose.ui.b bVar4 = bVar3;
                s6bVarH.a(new Function2() { // from class: com.google.android.be0
                    public final Object invoke(Object obj, Object obj2) {
                        return fe0.i(ps4Var, bVar4, ps4Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 48;
        bVar2 = bVar;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (dVarF.T(ps4Var2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (dVarF.g(z, i3 & 1)) {
            if (i5 != 0) {
                bVar3 = androidx.compose.ui.b.INSTANCE;
            } else {
                bVar3 = bVar2;
            }
            if (e.k()) {
                e.o(-1693825945, i3, -1, "androidx.compose.material3.BadgedBox (Badge.kt:67)");
            }
            objR = dVarF.R();
            if (objR == d.INSTANCE.a()) {
                objR = b.a;
                dVarF.L(objR);
            }
            ej7 ej7Var2 = (ej7) objR;
            iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ4 = dVarF.j();
            androidx.compose.ui.b bVarE4 = ComposedModifierKt.e(dVarF, bVar3);
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
            dVarC = dud.c(dVarF);
            dud.i(dVarC, ej7Var2, companion4.d());
            dud.i(dVarC, gs1VarJ4, companion4.f());
            function2C = companion4.c();
            if (dVarC.getInserting()) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            } else {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE4, companion4.e());
            androidx.compose.ui.b.Companion companion5 = androidx.compose.ui.b.INSTANCE;
            androidx.compose.ui.b bVarB3 = pn6.b(companion5, "anchor");
            tc.Companion companion6 = tc.INSTANCE;
            int i8 = ((i3 << 3) & 7168) | 54;
            ej7 ej7VarI3 = androidx.compose.p001foundation.layout.j.i(companion6.e(), false);
            iA2 = pp1.a(dVarF, 0);
            gs1 gs1VarJ5 = dVarF.j();
            androidx.compose.ui.b bVarE5 = ComposedModifierKt.e(dVarF, bVarB3);
            function0B2 = companion4.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B2);
            } else {
                dVarF.k();
            }
            dVarC2 = dud.c(dVarF);
            dud.i(dVarC2, ej7VarI3, companion4.d());
            dud.i(dVarC2, gs1VarJ5, companion4.f());
            function2C2 = companion4.c();
            if (dVarC2.getInserting()) {
                dVarC2.L(Integer.valueOf(iA2));
                dVarC2.e(Integer.valueOf(iA2), function2C2);
            } else {
                dVarC2.L(Integer.valueOf(iA2));
                dVarC2.e(Integer.valueOf(iA2), function2C2);
            }
            dud.i(dVarC2, bVarE5, companion4.e());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.a;
            ps4Var2.invoke(boxScopeInstance2, dVarF, Integer.valueOf(((i8 >> 6) & 112) | 6));
            dVarF.m();
            androidx.compose.ui.b bVarB4 = pn6.b(companion5, "badge");
            int i9 = ((i3 << 9) & 7168) | 6;
            ej7 ej7VarI4 = androidx.compose.p001foundation.layout.j.i(companion6.o(), false);
            iA3 = pp1.a(dVarF, 0);
            gs1 gs1VarJ6 = dVarF.j();
            androidx.compose.ui.b bVarE6 = ComposedModifierKt.e(dVarF, bVarB4);
            function0B3 = companion4.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B3);
            } else {
                dVarF.k();
            }
            dVarC3 = dud.c(dVarF);
            dud.i(dVarC3, ej7VarI4, companion4.d());
            dud.i(dVarC3, gs1VarJ6, companion4.f());
            function2C3 = companion4.c();
            if (dVarC3.getInserting()) {
                dVarC3.L(Integer.valueOf(iA3));
                dVarC3.e(Integer.valueOf(iA3), function2C3);
            } else {
                dVarC3.L(Integer.valueOf(iA3));
                dVarC3.e(Integer.valueOf(iA3), function2C3);
            }
            dud.i(dVarC3, bVarE6, companion4.e());
            ps4Var.invoke(boxScopeInstance2, dVarF, Integer.valueOf(((i9 >> 6) & 112) | 6));
            dVarF.m();
            dVarF.m();
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
            bVar3 = bVar2;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            final androidx.compose.ui.b bVar5 = bVar3;
            s6bVarH.a(new Function2() { // from class: com.google.android.be0
                public final Object invoke(Object obj, Object obj2) {
                    return fe0.i(ps4Var, bVar5, ps4Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(ps4 ps4Var, androidx.compose.ui.b bVar, ps4 ps4Var2, int i, int i2, d dVar, int i3) {
        h(ps4Var, bVar, ps4Var2, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    public static final androidx.compose.ui.b j(androidx.compose.ui.b bVar) {
        return zn6.a(bVar, new ps4() { // from class: com.google.android.ce0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return fe0.k((j) obj, (dj7) obj2, (kx1) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fj7 k(j jVar, dj7 dj7Var, kx1 kx1Var) {
        final o oVarR0 = dj7Var.r0(kx1Var.getValue());
        return j.m1(jVar, oVarR0.getWidth(), oVarR0.getHeight(), null, new Function1() { // from class: com.google.android.de0
            public final Object invoke(Object obj) {
                return fe0.l((mra) obj);
            }
        }, new Function1() { // from class: com.google.android.ee0
            public final Object invoke(Object obj) {
                return fe0.m(oVarR0, (o.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(mra mraVar) {
        mraVar.p0(f, (int) (mraVar.v().a() >> 32));
        mraVar.p0(e, 0.0f);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(o oVar, o.a aVar) {
        o.a.z(aVar, oVar, 0, 0, 0.0f, 4, null);
        return Unit.a;
    }

    public static final VerticalRuler n() {
        return f;
    }

    public static final float o() {
        return d;
    }

    public static final HorizontalRuler p() {
        return e;
    }

    public static final float q() {
        return b;
    }

    public static final float r() {
        return c;
    }
}
