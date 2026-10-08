package com.google.inputmethod;

import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p002material3.FloatingActionButtonElevation;
import androidx.compose.p002material3.tokens.TypographyKeyTokens;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b$\u001ai\u0010\u000f\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0081\u0001\u0010\u0016\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u001a\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001c\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019\"\u0014\u0010\u001e\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019\"\u0014\u0010\u001f\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019\"\u0014\u0010 \u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019\"\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\"\u0014\u0010&\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019\"\u0014\u0010(\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019\"\u0014\u0010*\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019\"\u0014\u0010,\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019\"\u0014\u0010.\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019\"\u0014\u00100\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010#\"\u0014\u00102\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0019\"\u0014\u00104\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0019\"\u0014\u00106\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0019\"\u0014\u00108\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\u0019\"\u0014\u0010:\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0019\"\u0014\u0010<\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010#\"\u0014\u0010>\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010\u0019\"\u0014\u0010@\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0019\"\u0014\u0010B\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010\u0019\"\u0014\u0010D\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010\u0019¨\u0006E"}, d2 = {"Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/b;", "modifier", "Lcom/google/android/xkb;", "shape", "Lcom/google/android/ei1;", "containerColor", "contentColor", "Landroidx/compose/material3/FloatingActionButtonElevation;", "elevation", "Lcom/google/android/r48;", "interactionSource", "content", "d", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/b;Lcom/google/android/xkb;JJLandroidx/compose/material3/FloatingActionButtonElevation;Lcom/google/android/r48;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;II)V", "Landroidx/compose/ui/text/y;", "textStyle", "Lcom/google/android/ff3;", "minWidth", "minHeight", "e", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/text/y;FFLandroidx/compose/ui/b;Lcom/google/android/xkb;JJLandroidx/compose/material3/FloatingActionButtonElevation;Lcom/google/android/r48;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;III)V", "a", "F", "SmallExtendedFabMinimumWidth", "b", "SmallExtendedFabMinimumHeight", "c", "SmallExtendedFabPaddingStart", "SmallExtendedFabPaddingEnd", "SmallExtendedFabIconPadding", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "f", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "SmallExtendedFabTextStyle", "g", "MediumExtendedFabMinimumWidth", "h", "MediumExtendedFabMinimumHeight", "i", "MediumExtendedFabPaddingStart", "j", "MediumExtendedFabPaddingEnd", "k", "MediumExtendedFabIconPadding", "l", "MediumExtendedFabTextStyle", "m", "LargeExtendedFabMinimumWidth", "n", "LargeExtendedFabMinimumHeight", "o", "LargeExtendedFabPaddingStart", "p", "LargeExtendedFabPaddingEnd", "q", "LargeExtendedFabIconPadding", "r", "LargeExtendedFabTextStyle", "s", "ExtendedFabStartIconPadding", "t", "ExtendedFabEndIconPadding", "u", "ExtendedFabTextPadding", "v", "ExtendedFabMinimumWidth", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class vh4 {
    private static final float a;
    private static final float b;
    private static final float c;
    private static final float d;
    private static final float e;
    private static final TypographyKeyTokens f;
    private static final float g;
    private static final float h;
    private static final float i;
    private static final float j;
    private static final float k;
    private static final TypographyKeyTokens l;
    private static final float m;
    private static final float n;
    private static final float o;
    private static final float p;
    private static final float q;
    private static final TypographyKeyTokens r;
    private static final float s;
    private static final float t;
    private static final float u;
    private static final float v;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements Function2<d, Integer, Unit> {
        final /* synthetic */ long a;
        final /* synthetic */ TextStyle b;
        final /* synthetic */ float c;
        final /* synthetic */ float d;
        final /* synthetic */ Function2<d, Integer, Unit> e;

        /* JADX INFO: renamed from: com.google.android.vh4$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class C0126a implements Function2<d, Integer, Unit> {
            final /* synthetic */ float a;
            final /* synthetic */ float b;
            final /* synthetic */ Function2<d, Integer, Unit> c;

            /* JADX WARN: Multi-variable type inference failed */
            C0126a(float f, float f2, Function2<? super d, ? super Integer, Unit> function2) {
                this.a = f;
                this.b = f2;
                this.c = function2;
            }

            public final void a(d dVar, int i) {
                if (!dVar.g((i & 3) != 2, i & 1)) {
                    dVar.q();
                    return;
                }
                if (e.k()) {
                    e.o(-1767363041, i, -1, "androidx.compose.material3.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:159)");
                }
                b bVarA = SizeKt.a(b.INSTANCE, this.a, this.b);
                tc tcVarE = tc.INSTANCE.e();
                Function2<d, Integer, Unit> function2 = this.c;
                ej7 ej7VarI = j.i(tcVarE, false);
                int iA = pp1.a(dVar, 0);
                gs1 gs1VarJ = dVar.j();
                b bVarE = ComposedModifierKt.e(dVar, bVarA);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> function0B = companion.b();
                if (dVar.G() == null) {
                    pp1.d();
                }
                dVar.o();
                if (dVar.getInserting()) {
                    dVar.W(function0B);
                } else {
                    dVar.k();
                }
                d dVarC = dud.c(dVar);
                dud.i(dVarC, ej7VarI, companion.d());
                dud.i(dVarC, gs1VarJ, companion.f());
                Function2<ComposeUiNode, Integer, Unit> function2C = companion.c();
                if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                }
                dud.i(dVarC, bVarE, companion.e());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                function2.invoke(dVar, 0);
                dVar.m();
                if (e.k()) {
                    e.n();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((d) obj, ((Number) obj2).intValue());
                return Unit.a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(long j, TextStyle textStyle, float f, float f2, Function2<? super d, ? super Integer, Unit> function2) {
            this.a = j;
            this.b = textStyle;
            this.c = f;
            this.d = f2;
            this.e = function2;
        }

        public final void a(d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(-1779603465, i, -1, "androidx.compose.material3.FloatingActionButton.<anonymous> (FloatingActionButton.kt:158)");
            }
            ns9.b(this.a, this.b, ko1.e(-1767363041, true, new C0126a(this.c, this.d, this.e), dVar, 54), dVar, 384);
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
        r14 r14Var = r14.a;
        a = r14Var.a();
        b = r14Var.a();
        c = r14Var.c();
        d = r14Var.d();
        e = r14Var.b();
        f = TypographyKeyTokens.TitleMedium;
        p14 p14Var = p14.a;
        g = p14Var.a();
        h = p14Var.a();
        i = p14Var.b();
        j = p14Var.c();
        float f2 = 12;
        k = ff3.i(f2);
        l = TypographyKeyTokens.TitleLarge;
        o14 o14Var = o14.a;
        m = o14Var.a();
        n = o14Var.a();
        o = o14Var.b();
        p = o14Var.c();
        float f3 = 16;
        q = ff3.i(f3);
        r = TypographyKeyTokens.HeadlineSmall;
        s = ff3.i(f3);
        t = ff3.i(f2);
        u = ff3.i(20);
        v = ff3.i(80);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:112:0x013c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x013e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0141  */
    /* JADX WARN: Code duplicated, block: B:117:0x0146  */
    /* JADX WARN: Code duplicated, block: B:118:0x0151  */
    /* JADX WARN: Code duplicated, block: B:121:0x0157  */
    /* JADX WARN: Code duplicated, block: B:122:0x0160  */
    /* JADX WARN: Code duplicated, block: B:125:0x0165  */
    /* JADX WARN: Code duplicated, block: B:128:0x0176  */
    /* JADX WARN: Code duplicated, block: B:129:0x0192  */
    /* JADX WARN: Code duplicated, block: B:131:0x019b  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:139:0x0209  */
    /* JADX WARN: Code duplicated, block: B:141:0x021b  */
    /* JADX WARN: Code duplicated, block: B:144:0x022f  */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00df  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:96:0x010b  */
    public static final void d(final Function0<Unit> function0, b bVar, xkb xkbVar, long j2, long j3, FloatingActionButtonElevation floatingActionButtonElevation, r48 r48Var, final Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i2, final int i3) throws NoWhenBranchMatchedException {
        Function0<Unit> function1;
        int i4;
        b bVar2;
        xkb xkbVar2;
        long j4;
        long j5;
        FloatingActionButtonElevation floatingActionButtonElevationA;
        int i5;
        r48 r48Var2;
        int i6;
        int i7;
        boolean z;
        final b bVar3;
        final xkb xkbVar3;
        final FloatingActionButtonElevation floatingActionButtonElevation2;
        final long j6;
        final long j7;
        final r48 r48Var3;
        s6b s6bVarH;
        b bVar4;
        xkb xkbVarC;
        long jB;
        int i8;
        int i9;
        r48 r48Var4;
        xkb xkbVar4;
        long j8;
        long j9;
        int i10;
        int i11;
        d dVarF = dVar.F(748201188);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i2 & 6) == 0) {
                i4 = (dVarF.T(function1) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
        }
        int i12 = i3 & 2;
        if (i12 == 0) {
            if ((i2 & 48) == 0) {
                bVar2 = bVar;
                i4 |= dVarF.x(bVar2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                if ((i3 & 4) == 0) {
                    xkbVar2 = xkbVar;
                    int i13 = dVarF.x(xkbVar2) ? 256 : 128;
                    i4 |= i13;
                } else {
                    xkbVar2 = xkbVar;
                }
                i4 |= i13;
            } else {
                xkbVar2 = xkbVar;
            }
            if ((i2 & 3072) == 0) {
                j4 = j2;
                if ((i3 & 8) == 0 || !dVarF.D(j4)) {
                    i11 = 1024;
                } else {
                    i11 = 2048;
                }
                i4 |= i11;
            } else {
                j4 = j2;
            }
            if ((i2 & 24576) == 0) {
                j5 = j3;
                if ((i3 & 16) == 0 || !dVarF.D(j5)) {
                    i10 = 8192;
                } else {
                    i10 = 16384;
                }
                i4 |= i10;
            } else {
                j5 = j3;
            }
            if ((196608 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    floatingActionButtonElevationA = floatingActionButtonElevation;
                    int i14 = dVarF.x(floatingActionButtonElevationA) ? 131072 : 65536;
                    i4 |= i14;
                } else {
                    floatingActionButtonElevationA = floatingActionButtonElevation;
                }
                i4 |= i14;
            } else {
                floatingActionButtonElevationA = floatingActionButtonElevation;
            }
            i5 = i3 & 64;
            if (i5 != 0) {
                if ((1572864 & i2) == 0) {
                    r48Var2 = r48Var;
                    if (dVarF.x(r48Var2)) {
                        i6 = 1048576;
                    } else {
                        i6 = 524288;
                    }
                    i4 |= i6;
                }
                if ((i3 & 128) != 0) {
                    if ((i2 & 12582912) == 0) {
                        if (dVarF.T(function2)) {
                            i7 = 8388608;
                        } else {
                            i7 = 4194304;
                        }
                        i4 |= i7;
                    }
                    if ((i4 & 4793491) != 4793490) {
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
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                xkbVarC = rh4.a.c(dVarF, 6);
                            } else {
                                xkbVarC = xkbVar2;
                            }
                            if ((i3 & 8) != 0) {
                                jB = rh4.a.b(dVarF, 6);
                                i4 &= -7169;
                            } else {
                                jB = j4;
                            }
                            if ((i3 & 16) != 0) {
                                long jG = bj1.g(jB, dVarF, (i4 >> 9) & 14);
                                i4 &= -57345;
                                j5 = jG;
                            }
                            i8 = i4;
                            if ((i3 & 32) != 0) {
                                i9 = 6;
                                floatingActionButtonElevationA = rh4.a.a(0.0f, 0.0f, 0.0f, 0.0f, dVarF, 24576, 15);
                                i4 = i8 & (-458753);
                            } else {
                                i9 = 6;
                                i4 = i8;
                            }
                            if (i5 != 0) {
                                r48Var4 = null;
                            } else {
                                r48Var4 = r48Var2;
                            }
                            xkbVar4 = xkbVarC;
                            j8 = jB;
                            j9 = j5;
                        } else {
                            dVarF.q();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            i9 = 6;
                            bVar4 = bVar2;
                            xkbVar4 = xkbVar2;
                            floatingActionButtonElevationA = floatingActionButtonElevationA;
                            j8 = j4;
                            j9 = j5;
                            r48Var4 = r48Var2;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(748201188, i4, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:118)");
                        }
                        TextStyle textStyleE = xod.e(q14.a.a(), dVarF, i9);
                        a44 a44Var = a44.a;
                        int i15 = i4 << 9;
                        e(function1, textStyleE, a44Var.c(), a44Var.a(), bVar4, xkbVar4, j8, j9, floatingActionButtonElevationA, r48Var4, function2, dVarF, (i4 & 14) | 3456 | (57344 & i15) | (458752 & i15) | (3670016 & i15) | (29360128 & i15) | (234881024 & i15) | (i15 & 1879048192), (i4 >> 21) & 14, 0);
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar4;
                        xkbVar3 = xkbVar4;
                        j6 = j8;
                        j7 = j9;
                        floatingActionButtonElevation2 = floatingActionButtonElevationA;
                        r48Var3 = r48Var4;
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                        xkbVar3 = xkbVar2;
                        floatingActionButtonElevation2 = floatingActionButtonElevationA;
                        j6 = j4;
                        j7 = j5;
                        r48Var3 = r48Var2;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.sh4
                            public final Object invoke(Object obj, Object obj2) {
                                return vh4.f(function0, bVar3, xkbVar3, j6, j7, floatingActionButtonElevation2, r48Var3, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 12582912;
                if ((i4 & 4793491) != 4793490) {
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
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            xkbVarC = rh4.a.c(dVarF, 6);
                        } else {
                            xkbVarC = xkbVar2;
                        }
                        if ((i3 & 8) != 0) {
                            jB = rh4.a.b(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            jB = j4;
                        }
                        if ((i3 & 16) != 0) {
                            long jG2 = bj1.g(jB, dVarF, (i4 >> 9) & 14);
                            i4 &= -57345;
                            j5 = jG2;
                        }
                        i8 = i4;
                        if ((i3 & 32) != 0) {
                            i9 = 6;
                            floatingActionButtonElevationA = rh4.a.a(0.0f, 0.0f, 0.0f, 0.0f, dVarF, 24576, 15);
                            i4 = i8 & (-458753);
                        } else {
                            i9 = 6;
                            i4 = i8;
                        }
                        if (i5 != 0) {
                            r48Var4 = null;
                        } else {
                            r48Var4 = r48Var2;
                        }
                        xkbVar4 = xkbVarC;
                        j8 = jB;
                        j9 = j5;
                    } else {
                        if (i12 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            xkbVarC = rh4.a.c(dVarF, 6);
                        } else {
                            xkbVarC = xkbVar2;
                        }
                        if ((i3 & 8) != 0) {
                            jB = rh4.a.b(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            jB = j4;
                        }
                        if ((i3 & 16) != 0) {
                            long jG3 = bj1.g(jB, dVarF, (i4 >> 9) & 14);
                            i4 &= -57345;
                            j5 = jG3;
                        }
                        i8 = i4;
                        if ((i3 & 32) != 0) {
                            i9 = 6;
                            floatingActionButtonElevationA = rh4.a.a(0.0f, 0.0f, 0.0f, 0.0f, dVarF, 24576, 15);
                            i4 = i8 & (-458753);
                        } else {
                            i9 = 6;
                            i4 = i8;
                        }
                        if (i5 != 0) {
                            r48Var4 = null;
                        } else {
                            r48Var4 = r48Var2;
                        }
                        xkbVar4 = xkbVarC;
                        j8 = jB;
                        j9 = j5;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(748201188, i4, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:118)");
                    }
                    TextStyle textStyleE2 = xod.e(q14.a.a(), dVarF, i9);
                    a44 a44Var2 = a44.a;
                    int i16 = i4 << 9;
                    e(function1, textStyleE2, a44Var2.c(), a44Var2.a(), bVar4, xkbVar4, j8, j9, floatingActionButtonElevationA, r48Var4, function2, dVarF, (i4 & 14) | 3456 | (57344 & i16) | (458752 & i16) | (3670016 & i16) | (29360128 & i16) | (234881024 & i16) | (i16 & 1879048192), (i4 >> 21) & 14, 0);
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar4;
                    xkbVar3 = xkbVar4;
                    j6 = j8;
                    j7 = j9;
                    floatingActionButtonElevation2 = floatingActionButtonElevationA;
                    r48Var3 = r48Var4;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    xkbVar3 = xkbVar2;
                    floatingActionButtonElevation2 = floatingActionButtonElevationA;
                    j6 = j4;
                    j7 = j5;
                    r48Var3 = r48Var2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.sh4
                        public final Object invoke(Object obj, Object obj2) {
                            return vh4.f(function0, bVar3, xkbVar3, j6, j7, floatingActionButtonElevation2, r48Var3, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 1572864;
            r48Var2 = r48Var;
            if ((i3 & 128) != 0) {
                if ((i2 & 12582912) == 0) {
                    if (dVarF.T(function2)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i4 |= i7;
                }
                if ((i4 & 4793491) != 4793490) {
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
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            xkbVarC = rh4.a.c(dVarF, 6);
                        } else {
                            xkbVarC = xkbVar2;
                        }
                        if ((i3 & 8) != 0) {
                            jB = rh4.a.b(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            jB = j4;
                        }
                        if ((i3 & 16) != 0) {
                            long jG4 = bj1.g(jB, dVarF, (i4 >> 9) & 14);
                            i4 &= -57345;
                            j5 = jG4;
                        }
                        i8 = i4;
                        if ((i3 & 32) != 0) {
                            i9 = 6;
                            floatingActionButtonElevationA = rh4.a.a(0.0f, 0.0f, 0.0f, 0.0f, dVarF, 24576, 15);
                            i4 = i8 & (-458753);
                        } else {
                            i9 = 6;
                            i4 = i8;
                        }
                        if (i5 != 0) {
                            r48Var4 = null;
                        } else {
                            r48Var4 = r48Var2;
                        }
                        xkbVar4 = xkbVarC;
                        j8 = jB;
                        j9 = j5;
                    } else {
                        if (i12 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            xkbVarC = rh4.a.c(dVarF, 6);
                        } else {
                            xkbVarC = xkbVar2;
                        }
                        if ((i3 & 8) != 0) {
                            jB = rh4.a.b(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            jB = j4;
                        }
                        if ((i3 & 16) != 0) {
                            long jG5 = bj1.g(jB, dVarF, (i4 >> 9) & 14);
                            i4 &= -57345;
                            j5 = jG5;
                        }
                        i8 = i4;
                        if ((i3 & 32) != 0) {
                            i9 = 6;
                            floatingActionButtonElevationA = rh4.a.a(0.0f, 0.0f, 0.0f, 0.0f, dVarF, 24576, 15);
                            i4 = i8 & (-458753);
                        } else {
                            i9 = 6;
                            i4 = i8;
                        }
                        if (i5 != 0) {
                            r48Var4 = null;
                        } else {
                            r48Var4 = r48Var2;
                        }
                        xkbVar4 = xkbVarC;
                        j8 = jB;
                        j9 = j5;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(748201188, i4, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:118)");
                    }
                    TextStyle textStyleE3 = xod.e(q14.a.a(), dVarF, i9);
                    a44 a44Var3 = a44.a;
                    int i17 = i4 << 9;
                    e(function1, textStyleE3, a44Var3.c(), a44Var3.a(), bVar4, xkbVar4, j8, j9, floatingActionButtonElevationA, r48Var4, function2, dVarF, (i4 & 14) | 3456 | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (29360128 & i17) | (234881024 & i17) | (i17 & 1879048192), (i4 >> 21) & 14, 0);
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar4;
                    xkbVar3 = xkbVar4;
                    j6 = j8;
                    j7 = j9;
                    floatingActionButtonElevation2 = floatingActionButtonElevationA;
                    r48Var3 = r48Var4;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    xkbVar3 = xkbVar2;
                    floatingActionButtonElevation2 = floatingActionButtonElevationA;
                    j6 = j4;
                    j7 = j5;
                    r48Var3 = r48Var2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.sh4
                        public final Object invoke(Object obj, Object obj2) {
                            return vh4.f(function0, bVar3, xkbVar3, j6, j7, floatingActionButtonElevation2, r48Var3, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 12582912;
            if ((i4 & 4793491) != 4793490) {
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
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        xkbVarC = rh4.a.c(dVarF, 6);
                    } else {
                        xkbVarC = xkbVar2;
                    }
                    if ((i3 & 8) != 0) {
                        jB = rh4.a.b(dVarF, 6);
                        i4 &= -7169;
                    } else {
                        jB = j4;
                    }
                    if ((i3 & 16) != 0) {
                        long jG6 = bj1.g(jB, dVarF, (i4 >> 9) & 14);
                        i4 &= -57345;
                        j5 = jG6;
                    }
                    i8 = i4;
                    if ((i3 & 32) != 0) {
                        i9 = 6;
                        floatingActionButtonElevationA = rh4.a.a(0.0f, 0.0f, 0.0f, 0.0f, dVarF, 24576, 15);
                        i4 = i8 & (-458753);
                    } else {
                        i9 = 6;
                        i4 = i8;
                    }
                    if (i5 != 0) {
                        r48Var4 = null;
                    } else {
                        r48Var4 = r48Var2;
                    }
                    xkbVar4 = xkbVarC;
                    j8 = jB;
                    j9 = j5;
                } else {
                    if (i12 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        xkbVarC = rh4.a.c(dVarF, 6);
                    } else {
                        xkbVarC = xkbVar2;
                    }
                    if ((i3 & 8) != 0) {
                        jB = rh4.a.b(dVarF, 6);
                        i4 &= -7169;
                    } else {
                        jB = j4;
                    }
                    if ((i3 & 16) != 0) {
                        long jG7 = bj1.g(jB, dVarF, (i4 >> 9) & 14);
                        i4 &= -57345;
                        j5 = jG7;
                    }
                    i8 = i4;
                    if ((i3 & 32) != 0) {
                        i9 = 6;
                        floatingActionButtonElevationA = rh4.a.a(0.0f, 0.0f, 0.0f, 0.0f, dVarF, 24576, 15);
                        i4 = i8 & (-458753);
                    } else {
                        i9 = 6;
                        i4 = i8;
                    }
                    if (i5 != 0) {
                        r48Var4 = null;
                    } else {
                        r48Var4 = r48Var2;
                    }
                    xkbVar4 = xkbVarC;
                    j8 = jB;
                    j9 = j5;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(748201188, i4, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:118)");
                }
                TextStyle textStyleE4 = xod.e(q14.a.a(), dVarF, i9);
                a44 a44Var4 = a44.a;
                int i18 = i4 << 9;
                e(function1, textStyleE4, a44Var4.c(), a44Var4.a(), bVar4, xkbVar4, j8, j9, floatingActionButtonElevationA, r48Var4, function2, dVarF, (i4 & 14) | 3456 | (57344 & i18) | (458752 & i18) | (3670016 & i18) | (29360128 & i18) | (234881024 & i18) | (i18 & 1879048192), (i4 >> 21) & 14, 0);
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar4;
                xkbVar3 = xkbVar4;
                j6 = j8;
                j7 = j9;
                floatingActionButtonElevation2 = floatingActionButtonElevationA;
                r48Var3 = r48Var4;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                xkbVar3 = xkbVar2;
                floatingActionButtonElevation2 = floatingActionButtonElevationA;
                j6 = j4;
                j7 = j5;
                r48Var3 = r48Var2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.sh4
                    public final Object invoke(Object obj, Object obj2) {
                        return vh4.f(function0, bVar3, xkbVar3, j6, j7, floatingActionButtonElevation2, r48Var3, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 48;
        bVar2 = bVar;
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                xkbVar2 = xkbVar;
                if (dVarF.x(xkbVar2)) {
                }
                i4 |= i13;
            } else {
                xkbVar2 = xkbVar;
            }
            i4 |= i13;
        } else {
            xkbVar2 = xkbVar;
        }
        if ((i2 & 3072) == 0) {
            j4 = j2;
            if ((i3 & 8) == 0) {
                i11 = 1024;
            } else {
                i11 = 1024;
            }
            i4 |= i11;
        } else {
            j4 = j2;
        }
        if ((i2 & 24576) == 0) {
            j5 = j3;
            if ((i3 & 16) == 0) {
                i10 = 8192;
            } else {
                i10 = 8192;
            }
            i4 |= i10;
        } else {
            j5 = j3;
        }
        if ((196608 & i2) == 0) {
            if ((i3 & 32) == 0) {
                floatingActionButtonElevationA = floatingActionButtonElevation;
                if (dVarF.x(floatingActionButtonElevationA)) {
                }
                i4 |= i14;
            } else {
                floatingActionButtonElevationA = floatingActionButtonElevation;
            }
            i4 |= i14;
        } else {
            floatingActionButtonElevationA = floatingActionButtonElevation;
        }
        i5 = i3 & 64;
        if (i5 != 0) {
            if ((1572864 & i2) == 0) {
                r48Var2 = r48Var;
                if (dVarF.x(r48Var2)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i4 |= i6;
            }
            if ((i3 & 128) != 0) {
                if ((i2 & 12582912) == 0) {
                    if (dVarF.T(function2)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i4 |= i7;
                }
                if ((i4 & 4793491) != 4793490) {
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
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            xkbVarC = rh4.a.c(dVarF, 6);
                        } else {
                            xkbVarC = xkbVar2;
                        }
                        if ((i3 & 8) != 0) {
                            jB = rh4.a.b(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            jB = j4;
                        }
                        if ((i3 & 16) != 0) {
                            long jG8 = bj1.g(jB, dVarF, (i4 >> 9) & 14);
                            i4 &= -57345;
                            j5 = jG8;
                        }
                        i8 = i4;
                        if ((i3 & 32) != 0) {
                            i9 = 6;
                            floatingActionButtonElevationA = rh4.a.a(0.0f, 0.0f, 0.0f, 0.0f, dVarF, 24576, 15);
                            i4 = i8 & (-458753);
                        } else {
                            i9 = 6;
                            i4 = i8;
                        }
                        if (i5 != 0) {
                            r48Var4 = null;
                        } else {
                            r48Var4 = r48Var2;
                        }
                        xkbVar4 = xkbVarC;
                        j8 = jB;
                        j9 = j5;
                    } else {
                        if (i12 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            xkbVarC = rh4.a.c(dVarF, 6);
                        } else {
                            xkbVarC = xkbVar2;
                        }
                        if ((i3 & 8) != 0) {
                            jB = rh4.a.b(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            jB = j4;
                        }
                        if ((i3 & 16) != 0) {
                            long jG9 = bj1.g(jB, dVarF, (i4 >> 9) & 14);
                            i4 &= -57345;
                            j5 = jG9;
                        }
                        i8 = i4;
                        if ((i3 & 32) != 0) {
                            i9 = 6;
                            floatingActionButtonElevationA = rh4.a.a(0.0f, 0.0f, 0.0f, 0.0f, dVarF, 24576, 15);
                            i4 = i8 & (-458753);
                        } else {
                            i9 = 6;
                            i4 = i8;
                        }
                        if (i5 != 0) {
                            r48Var4 = null;
                        } else {
                            r48Var4 = r48Var2;
                        }
                        xkbVar4 = xkbVarC;
                        j8 = jB;
                        j9 = j5;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(748201188, i4, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:118)");
                    }
                    TextStyle textStyleE5 = xod.e(q14.a.a(), dVarF, i9);
                    a44 a44Var5 = a44.a;
                    int i19 = i4 << 9;
                    e(function1, textStyleE5, a44Var5.c(), a44Var5.a(), bVar4, xkbVar4, j8, j9, floatingActionButtonElevationA, r48Var4, function2, dVarF, (i4 & 14) | 3456 | (57344 & i19) | (458752 & i19) | (3670016 & i19) | (29360128 & i19) | (234881024 & i19) | (i19 & 1879048192), (i4 >> 21) & 14, 0);
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar4;
                    xkbVar3 = xkbVar4;
                    j6 = j8;
                    j7 = j9;
                    floatingActionButtonElevation2 = floatingActionButtonElevationA;
                    r48Var3 = r48Var4;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    xkbVar3 = xkbVar2;
                    floatingActionButtonElevation2 = floatingActionButtonElevationA;
                    j6 = j4;
                    j7 = j5;
                    r48Var3 = r48Var2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.sh4
                        public final Object invoke(Object obj, Object obj2) {
                            return vh4.f(function0, bVar3, xkbVar3, j6, j7, floatingActionButtonElevation2, r48Var3, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 12582912;
            if ((i4 & 4793491) != 4793490) {
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
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        xkbVarC = rh4.a.c(dVarF, 6);
                    } else {
                        xkbVarC = xkbVar2;
                    }
                    if ((i3 & 8) != 0) {
                        jB = rh4.a.b(dVarF, 6);
                        i4 &= -7169;
                    } else {
                        jB = j4;
                    }
                    if ((i3 & 16) != 0) {
                        long jG10 = bj1.g(jB, dVarF, (i4 >> 9) & 14);
                        i4 &= -57345;
                        j5 = jG10;
                    }
                    i8 = i4;
                    if ((i3 & 32) != 0) {
                        i9 = 6;
                        floatingActionButtonElevationA = rh4.a.a(0.0f, 0.0f, 0.0f, 0.0f, dVarF, 24576, 15);
                        i4 = i8 & (-458753);
                    } else {
                        i9 = 6;
                        i4 = i8;
                    }
                    if (i5 != 0) {
                        r48Var4 = null;
                    } else {
                        r48Var4 = r48Var2;
                    }
                    xkbVar4 = xkbVarC;
                    j8 = jB;
                    j9 = j5;
                } else {
                    if (i12 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        xkbVarC = rh4.a.c(dVarF, 6);
                    } else {
                        xkbVarC = xkbVar2;
                    }
                    if ((i3 & 8) != 0) {
                        jB = rh4.a.b(dVarF, 6);
                        i4 &= -7169;
                    } else {
                        jB = j4;
                    }
                    if ((i3 & 16) != 0) {
                        long jG11 = bj1.g(jB, dVarF, (i4 >> 9) & 14);
                        i4 &= -57345;
                        j5 = jG11;
                    }
                    i8 = i4;
                    if ((i3 & 32) != 0) {
                        i9 = 6;
                        floatingActionButtonElevationA = rh4.a.a(0.0f, 0.0f, 0.0f, 0.0f, dVarF, 24576, 15);
                        i4 = i8 & (-458753);
                    } else {
                        i9 = 6;
                        i4 = i8;
                    }
                    if (i5 != 0) {
                        r48Var4 = null;
                    } else {
                        r48Var4 = r48Var2;
                    }
                    xkbVar4 = xkbVarC;
                    j8 = jB;
                    j9 = j5;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(748201188, i4, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:118)");
                }
                TextStyle textStyleE6 = xod.e(q14.a.a(), dVarF, i9);
                a44 a44Var6 = a44.a;
                int i110 = i4 << 9;
                e(function1, textStyleE6, a44Var6.c(), a44Var6.a(), bVar4, xkbVar4, j8, j9, floatingActionButtonElevationA, r48Var4, function2, dVarF, (i4 & 14) | 3456 | (57344 & i110) | (458752 & i110) | (3670016 & i110) | (29360128 & i110) | (234881024 & i110) | (i110 & 1879048192), (i4 >> 21) & 14, 0);
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar4;
                xkbVar3 = xkbVar4;
                j6 = j8;
                j7 = j9;
                floatingActionButtonElevation2 = floatingActionButtonElevationA;
                r48Var3 = r48Var4;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                xkbVar3 = xkbVar2;
                floatingActionButtonElevation2 = floatingActionButtonElevationA;
                j6 = j4;
                j7 = j5;
                r48Var3 = r48Var2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.sh4
                    public final Object invoke(Object obj, Object obj2) {
                        return vh4.f(function0, bVar3, xkbVar3, j6, j7, floatingActionButtonElevation2, r48Var3, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 1572864;
        r48Var2 = r48Var;
        if ((i3 & 128) != 0) {
            if ((i2 & 12582912) == 0) {
                if (dVarF.T(function2)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i4 |= i7;
            }
            if ((i4 & 4793491) != 4793490) {
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
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        xkbVarC = rh4.a.c(dVarF, 6);
                    } else {
                        xkbVarC = xkbVar2;
                    }
                    if ((i3 & 8) != 0) {
                        jB = rh4.a.b(dVarF, 6);
                        i4 &= -7169;
                    } else {
                        jB = j4;
                    }
                    if ((i3 & 16) != 0) {
                        long jG12 = bj1.g(jB, dVarF, (i4 >> 9) & 14);
                        i4 &= -57345;
                        j5 = jG12;
                    }
                    i8 = i4;
                    if ((i3 & 32) != 0) {
                        i9 = 6;
                        floatingActionButtonElevationA = rh4.a.a(0.0f, 0.0f, 0.0f, 0.0f, dVarF, 24576, 15);
                        i4 = i8 & (-458753);
                    } else {
                        i9 = 6;
                        i4 = i8;
                    }
                    if (i5 != 0) {
                        r48Var4 = null;
                    } else {
                        r48Var4 = r48Var2;
                    }
                    xkbVar4 = xkbVarC;
                    j8 = jB;
                    j9 = j5;
                } else {
                    if (i12 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        xkbVarC = rh4.a.c(dVarF, 6);
                    } else {
                        xkbVarC = xkbVar2;
                    }
                    if ((i3 & 8) != 0) {
                        jB = rh4.a.b(dVarF, 6);
                        i4 &= -7169;
                    } else {
                        jB = j4;
                    }
                    if ((i3 & 16) != 0) {
                        long jG13 = bj1.g(jB, dVarF, (i4 >> 9) & 14);
                        i4 &= -57345;
                        j5 = jG13;
                    }
                    i8 = i4;
                    if ((i3 & 32) != 0) {
                        i9 = 6;
                        floatingActionButtonElevationA = rh4.a.a(0.0f, 0.0f, 0.0f, 0.0f, dVarF, 24576, 15);
                        i4 = i8 & (-458753);
                    } else {
                        i9 = 6;
                        i4 = i8;
                    }
                    if (i5 != 0) {
                        r48Var4 = null;
                    } else {
                        r48Var4 = r48Var2;
                    }
                    xkbVar4 = xkbVarC;
                    j8 = jB;
                    j9 = j5;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(748201188, i4, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:118)");
                }
                TextStyle textStyleE7 = xod.e(q14.a.a(), dVarF, i9);
                a44 a44Var7 = a44.a;
                int i111 = i4 << 9;
                e(function1, textStyleE7, a44Var7.c(), a44Var7.a(), bVar4, xkbVar4, j8, j9, floatingActionButtonElevationA, r48Var4, function2, dVarF, (i4 & 14) | 3456 | (57344 & i111) | (458752 & i111) | (3670016 & i111) | (29360128 & i111) | (234881024 & i111) | (i111 & 1879048192), (i4 >> 21) & 14, 0);
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar4;
                xkbVar3 = xkbVar4;
                j6 = j8;
                j7 = j9;
                floatingActionButtonElevation2 = floatingActionButtonElevationA;
                r48Var3 = r48Var4;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                xkbVar3 = xkbVar2;
                floatingActionButtonElevation2 = floatingActionButtonElevationA;
                j6 = j4;
                j7 = j5;
                r48Var3 = r48Var2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.sh4
                    public final Object invoke(Object obj, Object obj2) {
                        return vh4.f(function0, bVar3, xkbVar3, j6, j7, floatingActionButtonElevation2, r48Var3, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 12582912;
        if ((i4 & 4793491) != 4793490) {
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
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                    xkbVarC = rh4.a.c(dVarF, 6);
                } else {
                    xkbVarC = xkbVar2;
                }
                if ((i3 & 8) != 0) {
                    jB = rh4.a.b(dVarF, 6);
                    i4 &= -7169;
                } else {
                    jB = j4;
                }
                if ((i3 & 16) != 0) {
                    long jG14 = bj1.g(jB, dVarF, (i4 >> 9) & 14);
                    i4 &= -57345;
                    j5 = jG14;
                }
                i8 = i4;
                if ((i3 & 32) != 0) {
                    i9 = 6;
                    floatingActionButtonElevationA = rh4.a.a(0.0f, 0.0f, 0.0f, 0.0f, dVarF, 24576, 15);
                    i4 = i8 & (-458753);
                } else {
                    i9 = 6;
                    i4 = i8;
                }
                if (i5 != 0) {
                    r48Var4 = null;
                } else {
                    r48Var4 = r48Var2;
                }
                xkbVar4 = xkbVarC;
                j8 = jB;
                j9 = j5;
            } else {
                if (i12 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                    xkbVarC = rh4.a.c(dVarF, 6);
                } else {
                    xkbVarC = xkbVar2;
                }
                if ((i3 & 8) != 0) {
                    jB = rh4.a.b(dVarF, 6);
                    i4 &= -7169;
                } else {
                    jB = j4;
                }
                if ((i3 & 16) != 0) {
                    long jG15 = bj1.g(jB, dVarF, (i4 >> 9) & 14);
                    i4 &= -57345;
                    j5 = jG15;
                }
                i8 = i4;
                if ((i3 & 32) != 0) {
                    i9 = 6;
                    floatingActionButtonElevationA = rh4.a.a(0.0f, 0.0f, 0.0f, 0.0f, dVarF, 24576, 15);
                    i4 = i8 & (-458753);
                } else {
                    i9 = 6;
                    i4 = i8;
                }
                if (i5 != 0) {
                    r48Var4 = null;
                } else {
                    r48Var4 = r48Var2;
                }
                xkbVar4 = xkbVarC;
                j8 = jB;
                j9 = j5;
            }
            dVarF.M();
            if (e.k()) {
                e.o(748201188, i4, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:118)");
            }
            TextStyle textStyleE8 = xod.e(q14.a.a(), dVarF, i9);
            a44 a44Var8 = a44.a;
            int i112 = i4 << 9;
            e(function1, textStyleE8, a44Var8.c(), a44Var8.a(), bVar4, xkbVar4, j8, j9, floatingActionButtonElevationA, r48Var4, function2, dVarF, (i4 & 14) | 3456 | (57344 & i112) | (458752 & i112) | (3670016 & i112) | (29360128 & i112) | (234881024 & i112) | (i112 & 1879048192), (i4 >> 21) & 14, 0);
            if (e.k()) {
                e.n();
            }
            bVar3 = bVar4;
            xkbVar3 = xkbVar4;
            j6 = j8;
            j7 = j9;
            floatingActionButtonElevation2 = floatingActionButtonElevationA;
            r48Var3 = r48Var4;
        } else {
            dVarF.q();
            bVar3 = bVar2;
            xkbVar3 = xkbVar2;
            floatingActionButtonElevation2 = floatingActionButtonElevationA;
            j6 = j4;
            j7 = j5;
            r48Var3 = r48Var2;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.sh4
                public final Object invoke(Object obj, Object obj2) {
                    return vh4.f(function0, bVar3, xkbVar3, j6, j7, floatingActionButtonElevation2, r48Var3, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:100:0x0117  */
    /* JADX WARN: Code duplicated, block: B:102:0x011b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0125  */
    /* JADX WARN: Code duplicated, block: B:105:0x0128  */
    /* JADX WARN: Code duplicated, block: B:109:0x0130  */
    /* JADX WARN: Code duplicated, block: B:110:0x0136  */
    /* JADX WARN: Code duplicated, block: B:112:0x013a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0142  */
    /* JADX WARN: Code duplicated, block: B:115:0x0145  */
    /* JADX WARN: Code duplicated, block: B:117:0x014c  */
    /* JADX WARN: Code duplicated, block: B:120:0x015c  */
    /* JADX WARN: Code duplicated, block: B:124:0x0164  */
    /* JADX WARN: Code duplicated, block: B:127:0x016d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0181  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:147:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:150:0x01be  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:154:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:155:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:158:0x01de  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:162:0x0209  */
    /* JADX WARN: Code duplicated, block: B:164:0x0219  */
    /* JADX WARN: Code duplicated, block: B:166:0x0223  */
    /* JADX WARN: Code duplicated, block: B:169:0x0231  */
    /* JADX WARN: Code duplicated, block: B:171:0x023b  */
    /* JADX WARN: Code duplicated, block: B:173:0x024d  */
    /* JADX WARN: Code duplicated, block: B:175:0x025a  */
    /* JADX WARN: Code duplicated, block: B:178:0x0270  */
    /* JADX WARN: Code duplicated, block: B:181:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:183:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:186:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:95:0x0108  */
    /* JADX WARN: Code duplicated, block: B:98:0x0110  */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    private static final void e(final Function0<Unit> function0, final TextStyle textStyle, final float f2, final float f3, b bVar, xkb xkbVar, long j2, long j3, FloatingActionButtonElevation floatingActionButtonElevation, r48 r48Var, final Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i2, final int i3, final int i4) throws NoWhenBranchMatchedException {
        Function0<Unit> function1;
        int i5;
        float f4;
        float f5;
        b bVar2;
        xkb xkbVar2;
        int i6;
        long jG;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        final FloatingActionButtonElevation floatingActionButtonElevation2;
        final r48 r48Var2;
        final b bVar3;
        final xkb xkbVar3;
        final long j4;
        final long j5;
        s6b s6bVarH;
        xkb xkbVarC;
        long jB;
        int i12;
        boolean z2;
        boolean z3;
        FloatingActionButtonElevation floatingActionButtonElevationA;
        r48 r48Var3;
        xkb xkbVar4;
        long j6;
        long j7;
        ?? r10;
        r48 r48Var4;
        Object objR;
        Object objR2;
        int i13;
        int i14;
        d dVarF = dVar.F(121669932);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i2 & 6) == 0) {
                i5 = (dVarF.T(function1) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= dVarF.x(textStyle) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
            f4 = f2;
        } else {
            f4 = f2;
            if ((i2 & 384) == 0) {
                i5 |= dVarF.B(f4) ? 256 : 128;
            }
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
            f5 = f3;
        } else {
            f5 = f3;
            if ((i2 & 3072) == 0) {
                i5 |= dVarF.B(f5) ? 2048 : 1024;
            }
        }
        int i15 = i4 & 16;
        if (i15 == 0) {
            if ((i2 & 24576) == 0) {
                bVar2 = bVar;
                i5 |= dVarF.x(bVar2) ? 16384 : 8192;
            }
            if ((196608 & i2) == 0) {
                if ((i4 & 32) == 0) {
                    xkbVar2 = xkbVar;
                    int i16 = dVarF.x(xkbVar2) ? 131072 : 65536;
                    i5 |= i16;
                } else {
                    xkbVar2 = xkbVar;
                }
                i5 |= i16;
            } else {
                xkbVar2 = xkbVar;
            }
            if ((1572864 & i2) == 0) {
                int i17 = i5;
                if ((i4 & 64) == 0 || !dVarF.D(j2)) {
                    i14 = 524288;
                } else {
                    i14 = 1048576;
                }
                i6 = i17 | i14;
            } else {
                i6 = i5;
            }
            if ((i2 & 12582912) == 0) {
                jG = j3;
                if ((i4 & 128) == 0 || !dVarF.D(jG)) {
                    i13 = 4194304;
                } else {
                    i13 = 8388608;
                }
                i6 |= i13;
            } else {
                jG = j3;
            }
            if ((i2 & 100663296) != 0) {
                i6 |= ((i4 & 256) == 0 || !dVarF.x(floatingActionButtonElevation)) ? 33554432 : 67108864;
            }
            i7 = i4 & 512;
            if (i7 != 0) {
                if ((i2 & 805306368) == 0) {
                    if (dVarF.x(r48Var)) {
                        i8 = 536870912;
                    } else {
                        i8 = 268435456;
                    }
                    i6 |= i8;
                }
                if ((i4 & 1024) != 0) {
                    i9 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    if (dVarF.T(function2)) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    i9 = i3 | i10;
                } else {
                    i9 = i3;
                }
                i11 = i9;
                if ((i6 & 306783379) == 306783378 || (i11 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i6 & 1)) {
                    dVarF.U();
                    char c2 = 6;
                    if ((i2 & 1) != 0 || dVarF.t()) {
                        if (i15 != 0) {
                            bVar2 = b.INSTANCE;
                        } else {
                            bVar2 = bVar2;
                        }
                        if ((i4 & 32) != 0) {
                            i6 &= -458753;
                            xkbVarC = rh4.a.c(dVarF, 6);
                        } else {
                            xkbVarC = xkbVar2;
                        }
                        if ((i4 & 64) != 0) {
                            jB = rh4.a.b(dVarF, 6);
                            i6 &= -3670017;
                        } else {
                            jB = j2;
                        }
                        if ((i4 & 128) != 0) {
                            jG = bj1.g(jB, dVarF, (i6 >> 18) & 14);
                            i6 &= -29360129;
                        }
                        i12 = i6;
                        if ((i4 & 256) != 0) {
                            z2 = false;
                            z3 = true;
                            floatingActionButtonElevationA = rh4.a.a(0.0f, 0.0f, 0.0f, 0.0f, dVarF, 24576, 15);
                            i6 = i12 & (-234881025);
                        } else {
                            z2 = false;
                            z3 = true;
                            floatingActionButtonElevationA = floatingActionButtonElevation;
                            i6 = i12;
                        }
                        if (i7 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        xkbVar4 = xkbVarC;
                        j6 = jB;
                        j7 = jG;
                        r10 = z3;
                    } else {
                        dVarF.q();
                        if ((i4 & 32) != 0) {
                            i6 &= -458753;
                        }
                        if ((i4 & 64) != 0) {
                            i6 &= -3670017;
                        }
                        if ((i4 & 128) != 0) {
                            i6 &= -29360129;
                        }
                        if ((i4 & 256) != 0) {
                            i6 &= -234881025;
                        }
                        j6 = j2;
                        floatingActionButtonElevationA = floatingActionButtonElevation;
                        i11 = i11;
                        c2 = 6;
                        xkbVar4 = xkbVar2;
                        j7 = jG;
                        z2 = false;
                        r10 = 1;
                        r48Var3 = r48Var;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(121669932, i6, i11, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:145)");
                    }
                    if (r48Var3 == null) {
                        dVarF.y(-282833393);
                        objR2 = dVarF.R();
                        if (objR2 == d.INSTANCE.a()) {
                            objR2 = k26.a();
                            dVarF.L(objR2);
                        }
                        r48Var4 = (r48) objR2;
                        dVarF.u();
                    } else {
                        dVarF.y(960707016);
                        dVarF.u();
                        r48Var4 = r48Var3;
                    }
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1() { // from class: com.google.android.th4
                            public final Object invoke(Object obj) {
                                return vh4.g((nfb) obj);
                            }
                        };
                        dVarF.L(objR);
                    }
                    int i18 = i6 >> 6;
                    afc.e(function1, afb.d(bVar2, z2, (Function1) objR, r10, null), false, xkbVar4, j6, j7, floatingActionButtonElevationA.getDefaultElevation(), floatingActionButtonElevationA.f(r48Var4, dVarF, (i6 >> 21) & 112).getValue().getValue(), null, r48Var4, ko1.e(-1779603465, r10, new a(j7, textStyle, f4, f5, function2), dVarF, 54), dVarF, (i6 & 14) | (i18 & 7168) | (57344 & i18) | (i18 & 458752), 6, 260);
                    if (e.k()) {
                        e.n();
                    }
                    floatingActionButtonElevation2 = floatingActionButtonElevationA;
                    r48Var2 = r48Var3;
                    bVar3 = bVar2;
                    xkbVar3 = xkbVar4;
                    j5 = j6;
                    j4 = j7;
                } else {
                    dVarF.q();
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                    r48Var2 = r48Var;
                    bVar3 = bVar2;
                    xkbVar3 = xkbVar2;
                    j4 = jG;
                    j5 = j2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.uh4
                        public final Object invoke(Object obj, Object obj2) {
                            return vh4.h(function0, textStyle, f2, f3, bVar3, xkbVar3, j5, j4, floatingActionButtonElevation2, r48Var2, function2, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i6 |= 805306368;
            if ((i4 & 1024) != 0) {
                i9 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                if (dVarF.T(function2)) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                i9 = i3 | i10;
            } else {
                i9 = i3;
            }
            i11 = i9;
            if ((i6 & 306783379) == 306783378) {
                z = true;
            } else {
                z = true;
            }
            if (dVarF.g(z, i6 & 1)) {
                dVarF.U();
                char c3 = 6;
                if ((i2 & 1) != 0) {
                    if (i15 != 0) {
                        bVar2 = b.INSTANCE;
                    } else {
                        bVar2 = bVar2;
                    }
                    if ((i4 & 32) != 0) {
                        i6 &= -458753;
                        xkbVarC = rh4.a.c(dVarF, 6);
                    } else {
                        xkbVarC = xkbVar2;
                    }
                    if ((i4 & 64) != 0) {
                        jB = rh4.a.b(dVarF, 6);
                        i6 &= -3670017;
                    } else {
                        jB = j2;
                    }
                    if ((i4 & 128) != 0) {
                        jG = bj1.g(jB, dVarF, (i6 >> 18) & 14);
                        i6 &= -29360129;
                    }
                    i12 = i6;
                    if ((i4 & 256) != 0) {
                        z2 = false;
                        z3 = true;
                        floatingActionButtonElevationA = rh4.a.a(0.0f, 0.0f, 0.0f, 0.0f, dVarF, 24576, 15);
                        i6 = i12 & (-234881025);
                    } else {
                        z2 = false;
                        z3 = true;
                        floatingActionButtonElevationA = floatingActionButtonElevation;
                        i6 = i12;
                    }
                    if (i7 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    xkbVar4 = xkbVarC;
                    j6 = jB;
                    j7 = jG;
                    r10 = z3;
                } else {
                    if (i15 != 0) {
                        bVar2 = b.INSTANCE;
                    } else {
                        bVar2 = bVar2;
                    }
                    if ((i4 & 32) != 0) {
                        i6 &= -458753;
                        xkbVarC = rh4.a.c(dVarF, 6);
                    } else {
                        xkbVarC = xkbVar2;
                    }
                    if ((i4 & 64) != 0) {
                        jB = rh4.a.b(dVarF, 6);
                        i6 &= -3670017;
                    } else {
                        jB = j2;
                    }
                    if ((i4 & 128) != 0) {
                        jG = bj1.g(jB, dVarF, (i6 >> 18) & 14);
                        i6 &= -29360129;
                    }
                    i12 = i6;
                    if ((i4 & 256) != 0) {
                        z2 = false;
                        z3 = true;
                        floatingActionButtonElevationA = rh4.a.a(0.0f, 0.0f, 0.0f, 0.0f, dVarF, 24576, 15);
                        i6 = i12 & (-234881025);
                    } else {
                        z2 = false;
                        z3 = true;
                        floatingActionButtonElevationA = floatingActionButtonElevation;
                        i6 = i12;
                    }
                    if (i7 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    xkbVar4 = xkbVarC;
                    j6 = jB;
                    j7 = jG;
                    r10 = z3;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(121669932, i6, i11, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:145)");
                }
                if (r48Var3 == null) {
                    dVarF.y(-282833393);
                    objR2 = dVarF.R();
                    if (objR2 == d.INSTANCE.a()) {
                        objR2 = k26.a();
                        dVarF.L(objR2);
                    }
                    r48Var4 = (r48) objR2;
                    dVarF.u();
                } else {
                    dVarF.y(960707016);
                    dVarF.u();
                    r48Var4 = r48Var3;
                }
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = new Function1() { // from class: com.google.android.th4
                        public final Object invoke(Object obj) {
                            return vh4.g((nfb) obj);
                        }
                    };
                    dVarF.L(objR);
                }
                int i19 = i6 >> 6;
                afc.e(function1, afb.d(bVar2, z2, (Function1) objR, r10, null), false, xkbVar4, j6, j7, floatingActionButtonElevationA.getDefaultElevation(), floatingActionButtonElevationA.f(r48Var4, dVarF, (i6 >> 21) & 112).getValue().getValue(), null, r48Var4, ko1.e(-1779603465, r10, new a(j7, textStyle, f4, f5, function2), dVarF, 54), dVarF, (i6 & 14) | (i19 & 7168) | (57344 & i19) | (i19 & 458752), 6, 260);
                if (e.k()) {
                    e.n();
                }
                floatingActionButtonElevation2 = floatingActionButtonElevationA;
                r48Var2 = r48Var3;
                bVar3 = bVar2;
                xkbVar3 = xkbVar4;
                j5 = j6;
                j4 = j7;
            } else {
                dVarF.q();
                floatingActionButtonElevation2 = floatingActionButtonElevation;
                r48Var2 = r48Var;
                bVar3 = bVar2;
                xkbVar3 = xkbVar2;
                j4 = jG;
                j5 = j2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.uh4
                    public final Object invoke(Object obj, Object obj2) {
                        return vh4.h(function0, textStyle, f2, f3, bVar3, xkbVar3, j5, j4, floatingActionButtonElevation2, r48Var2, function2, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i5 |= 24576;
        bVar2 = bVar;
        if ((196608 & i2) == 0) {
            if ((i4 & 32) == 0) {
                xkbVar2 = xkbVar;
                if (dVarF.x(xkbVar2)) {
                }
                i5 |= i16;
            } else {
                xkbVar2 = xkbVar;
            }
            i5 |= i16;
        } else {
            xkbVar2 = xkbVar;
        }
        if ((1572864 & i2) == 0) {
            int i110 = i5;
            if ((i4 & 64) == 0) {
                i14 = 524288;
            } else {
                i14 = 524288;
            }
            i6 = i110 | i14;
        } else {
            i6 = i5;
        }
        if ((i2 & 12582912) == 0) {
            jG = j3;
            if ((i4 & 128) == 0) {
                i13 = 4194304;
            } else {
                i13 = 4194304;
            }
            i6 |= i13;
        } else {
            jG = j3;
        }
        if ((i2 & 100663296) != 0) {
            i6 |= ((i4 & 256) == 0 || !dVarF.x(floatingActionButtonElevation)) ? 33554432 : 67108864;
        }
        i7 = i4 & 512;
        if (i7 != 0) {
            if ((i2 & 805306368) == 0) {
                if (dVarF.x(r48Var)) {
                    i8 = 536870912;
                } else {
                    i8 = 268435456;
                }
                i6 |= i8;
            }
            if ((i4 & 1024) != 0) {
                i9 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                if (dVarF.T(function2)) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                i9 = i3 | i10;
            } else {
                i9 = i3;
            }
            i11 = i9;
            if ((i6 & 306783379) == 306783378) {
                z = true;
            } else {
                z = true;
            }
            if (dVarF.g(z, i6 & 1)) {
                dVarF.U();
                char c4 = 6;
                if ((i2 & 1) != 0) {
                    if (i15 != 0) {
                        bVar2 = b.INSTANCE;
                    } else {
                        bVar2 = bVar2;
                    }
                    if ((i4 & 32) != 0) {
                        i6 &= -458753;
                        xkbVarC = rh4.a.c(dVarF, 6);
                    } else {
                        xkbVarC = xkbVar2;
                    }
                    if ((i4 & 64) != 0) {
                        jB = rh4.a.b(dVarF, 6);
                        i6 &= -3670017;
                    } else {
                        jB = j2;
                    }
                    if ((i4 & 128) != 0) {
                        jG = bj1.g(jB, dVarF, (i6 >> 18) & 14);
                        i6 &= -29360129;
                    }
                    i12 = i6;
                    if ((i4 & 256) != 0) {
                        z2 = false;
                        z3 = true;
                        floatingActionButtonElevationA = rh4.a.a(0.0f, 0.0f, 0.0f, 0.0f, dVarF, 24576, 15);
                        i6 = i12 & (-234881025);
                    } else {
                        z2 = false;
                        z3 = true;
                        floatingActionButtonElevationA = floatingActionButtonElevation;
                        i6 = i12;
                    }
                    if (i7 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    xkbVar4 = xkbVarC;
                    j6 = jB;
                    j7 = jG;
                    r10 = z3;
                } else {
                    if (i15 != 0) {
                        bVar2 = b.INSTANCE;
                    } else {
                        bVar2 = bVar2;
                    }
                    if ((i4 & 32) != 0) {
                        i6 &= -458753;
                        xkbVarC = rh4.a.c(dVarF, 6);
                    } else {
                        xkbVarC = xkbVar2;
                    }
                    if ((i4 & 64) != 0) {
                        jB = rh4.a.b(dVarF, 6);
                        i6 &= -3670017;
                    } else {
                        jB = j2;
                    }
                    if ((i4 & 128) != 0) {
                        jG = bj1.g(jB, dVarF, (i6 >> 18) & 14);
                        i6 &= -29360129;
                    }
                    i12 = i6;
                    if ((i4 & 256) != 0) {
                        z2 = false;
                        z3 = true;
                        floatingActionButtonElevationA = rh4.a.a(0.0f, 0.0f, 0.0f, 0.0f, dVarF, 24576, 15);
                        i6 = i12 & (-234881025);
                    } else {
                        z2 = false;
                        z3 = true;
                        floatingActionButtonElevationA = floatingActionButtonElevation;
                        i6 = i12;
                    }
                    if (i7 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    xkbVar4 = xkbVarC;
                    j6 = jB;
                    j7 = jG;
                    r10 = z3;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(121669932, i6, i11, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:145)");
                }
                if (r48Var3 == null) {
                    dVarF.y(-282833393);
                    objR2 = dVarF.R();
                    if (objR2 == d.INSTANCE.a()) {
                        objR2 = k26.a();
                        dVarF.L(objR2);
                    }
                    r48Var4 = (r48) objR2;
                    dVarF.u();
                } else {
                    dVarF.y(960707016);
                    dVarF.u();
                    r48Var4 = r48Var3;
                }
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = new Function1() { // from class: com.google.android.th4
                        public final Object invoke(Object obj) {
                            return vh4.g((nfb) obj);
                        }
                    };
                    dVarF.L(objR);
                }
                int i111 = i6 >> 6;
                afc.e(function1, afb.d(bVar2, z2, (Function1) objR, r10, null), false, xkbVar4, j6, j7, floatingActionButtonElevationA.getDefaultElevation(), floatingActionButtonElevationA.f(r48Var4, dVarF, (i6 >> 21) & 112).getValue().getValue(), null, r48Var4, ko1.e(-1779603465, r10, new a(j7, textStyle, f4, f5, function2), dVarF, 54), dVarF, (i6 & 14) | (i111 & 7168) | (57344 & i111) | (i111 & 458752), 6, 260);
                if (e.k()) {
                    e.n();
                }
                floatingActionButtonElevation2 = floatingActionButtonElevationA;
                r48Var2 = r48Var3;
                bVar3 = bVar2;
                xkbVar3 = xkbVar4;
                j5 = j6;
                j4 = j7;
            } else {
                dVarF.q();
                floatingActionButtonElevation2 = floatingActionButtonElevation;
                r48Var2 = r48Var;
                bVar3 = bVar2;
                xkbVar3 = xkbVar2;
                j4 = jG;
                j5 = j2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.uh4
                    public final Object invoke(Object obj, Object obj2) {
                        return vh4.h(function0, textStyle, f2, f3, bVar3, xkbVar3, j5, j4, floatingActionButtonElevation2, r48Var2, function2, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i6 |= 805306368;
        if ((i4 & 1024) != 0) {
            i9 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            if (dVarF.T(function2)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i9 = i3 | i10;
        } else {
            i9 = i3;
        }
        i11 = i9;
        if ((i6 & 306783379) == 306783378) {
            z = true;
        } else {
            z = true;
        }
        if (dVarF.g(z, i6 & 1)) {
            dVarF.U();
            char c5 = 6;
            if ((i2 & 1) != 0) {
                if (i15 != 0) {
                    bVar2 = b.INSTANCE;
                } else {
                    bVar2 = bVar2;
                }
                if ((i4 & 32) != 0) {
                    i6 &= -458753;
                    xkbVarC = rh4.a.c(dVarF, 6);
                } else {
                    xkbVarC = xkbVar2;
                }
                if ((i4 & 64) != 0) {
                    jB = rh4.a.b(dVarF, 6);
                    i6 &= -3670017;
                } else {
                    jB = j2;
                }
                if ((i4 & 128) != 0) {
                    jG = bj1.g(jB, dVarF, (i6 >> 18) & 14);
                    i6 &= -29360129;
                }
                i12 = i6;
                if ((i4 & 256) != 0) {
                    z2 = false;
                    z3 = true;
                    floatingActionButtonElevationA = rh4.a.a(0.0f, 0.0f, 0.0f, 0.0f, dVarF, 24576, 15);
                    i6 = i12 & (-234881025);
                } else {
                    z2 = false;
                    z3 = true;
                    floatingActionButtonElevationA = floatingActionButtonElevation;
                    i6 = i12;
                }
                if (i7 != 0) {
                    r48Var3 = null;
                } else {
                    r48Var3 = r48Var;
                }
                xkbVar4 = xkbVarC;
                j6 = jB;
                j7 = jG;
                r10 = z3;
            } else {
                if (i15 != 0) {
                    bVar2 = b.INSTANCE;
                } else {
                    bVar2 = bVar2;
                }
                if ((i4 & 32) != 0) {
                    i6 &= -458753;
                    xkbVarC = rh4.a.c(dVarF, 6);
                } else {
                    xkbVarC = xkbVar2;
                }
                if ((i4 & 64) != 0) {
                    jB = rh4.a.b(dVarF, 6);
                    i6 &= -3670017;
                } else {
                    jB = j2;
                }
                if ((i4 & 128) != 0) {
                    jG = bj1.g(jB, dVarF, (i6 >> 18) & 14);
                    i6 &= -29360129;
                }
                i12 = i6;
                if ((i4 & 256) != 0) {
                    z2 = false;
                    z3 = true;
                    floatingActionButtonElevationA = rh4.a.a(0.0f, 0.0f, 0.0f, 0.0f, dVarF, 24576, 15);
                    i6 = i12 & (-234881025);
                } else {
                    z2 = false;
                    z3 = true;
                    floatingActionButtonElevationA = floatingActionButtonElevation;
                    i6 = i12;
                }
                if (i7 != 0) {
                    r48Var3 = null;
                } else {
                    r48Var3 = r48Var;
                }
                xkbVar4 = xkbVarC;
                j6 = jB;
                j7 = jG;
                r10 = z3;
            }
            dVarF.M();
            if (e.k()) {
                e.o(121669932, i6, i11, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:145)");
            }
            if (r48Var3 == null) {
                dVarF.y(-282833393);
                objR2 = dVarF.R();
                if (objR2 == d.INSTANCE.a()) {
                    objR2 = k26.a();
                    dVarF.L(objR2);
                }
                r48Var4 = (r48) objR2;
                dVarF.u();
            } else {
                dVarF.y(960707016);
                dVarF.u();
                r48Var4 = r48Var3;
            }
            objR = dVarF.R();
            if (objR == d.INSTANCE.a()) {
                objR = new Function1() { // from class: com.google.android.th4
                    public final Object invoke(Object obj) {
                        return vh4.g((nfb) obj);
                    }
                };
                dVarF.L(objR);
            }
            int i112 = i6 >> 6;
            afc.e(function1, afb.d(bVar2, z2, (Function1) objR, r10, null), false, xkbVar4, j6, j7, floatingActionButtonElevationA.getDefaultElevation(), floatingActionButtonElevationA.f(r48Var4, dVarF, (i6 >> 21) & 112).getValue().getValue(), null, r48Var4, ko1.e(-1779603465, r10, new a(j7, textStyle, f4, f5, function2), dVarF, 54), dVarF, (i6 & 14) | (i112 & 7168) | (57344 & i112) | (i112 & 458752), 6, 260);
            if (e.k()) {
                e.n();
            }
            floatingActionButtonElevation2 = floatingActionButtonElevationA;
            r48Var2 = r48Var3;
            bVar3 = bVar2;
            xkbVar3 = xkbVar4;
            j5 = j6;
            j4 = j7;
        } else {
            dVarF.q();
            floatingActionButtonElevation2 = floatingActionButtonElevation;
            r48Var2 = r48Var;
            bVar3 = bVar2;
            xkbVar3 = xkbVar2;
            j4 = jG;
            j5 = j2;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.uh4
                public final Object invoke(Object obj, Object obj2) {
                    return vh4.h(function0, textStyle, f2, f3, bVar3, xkbVar3, j5, j4, floatingActionButtonElevation2, r48Var2, function2, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit f(Function0 function0, b bVar, xkb xkbVar, long j2, long j3, FloatingActionButtonElevation floatingActionButtonElevation, r48 r48Var, Function2 function2, int i2, int i3, d dVar, int i4) throws NoWhenBranchMatchedException {
        d(function0, bVar, xkbVar, j2, j3, floatingActionButtonElevation, r48Var, function2, dVar, saa.a(i2 | 1), i3);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(nfb nfbVar) {
        SemanticsPropertiesKt.p0(nfbVar, hpa.INSTANCE.a());
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit h(Function0 function0, TextStyle textStyle, float f2, float f3, b bVar, xkb xkbVar, long j2, long j3, FloatingActionButtonElevation floatingActionButtonElevation, r48 r48Var, Function2 function2, int i2, int i3, int i4, d dVar, int i5) throws NoWhenBranchMatchedException {
        e(function0, textStyle, f2, f3, bVar, xkbVar, j2, j3, floatingActionButtonElevation, r48Var, function2, dVar, saa.a(i2 | 1), saa.a(i3), i4);
        return Unit.a;
    }
}
