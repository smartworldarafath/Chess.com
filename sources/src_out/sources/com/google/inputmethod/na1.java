package com.google.inputmethod;

import androidx.compose.p000animation.core.Transition;
import androidx.compose.p000animation.core.TransitionKt;
import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p002material3.InteractiveComponentSizeKt;
import androidx.compose.p002material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.state.ToggleableState;
import com.google.android.ps4;
import com.google.android.yg4;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001aW\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aa\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a?\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010!\u001a\u00020\u0003*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0012H\u0002¢\u0006\u0004\b!\u0010\"\u001a;\u0010(\u001a\u00020\u0003*\u00020\u001a2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)\"\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,\"\u0014\u0010/\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,\"\u0014\u00101\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010,¨\u00062"}, d2 = {"", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Landroidx/compose/ui/b;", "modifier", "enabled", "Lcom/google/android/ga1;", "colors", "Lcom/google/android/r48;", "interactionSource", "f", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/b;ZLcom/google/android/ga1;Lcom/google/android/r48;Landroidx/compose/runtime/d;II)V", "Landroidx/compose/ui/state/ToggleableState;", "state", "Lkotlin/Function0;", "onClick", "Landroidx/compose/ui/graphics/drawscope/d;", "checkmarkStroke", "outlineStroke", "l", "(Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/graphics/drawscope/d;Landroidx/compose/ui/graphics/drawscope/d;Landroidx/compose/ui/b;ZLcom/google/android/ga1;Lcom/google/android/r48;Landroidx/compose/runtime/d;II)V", "value", "i", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/ui/b;Lcom/google/android/ga1;Landroidx/compose/ui/graphics/drawscope/d;Landroidx/compose/ui/graphics/drawscope/d;Landroidx/compose/runtime/d;I)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lcom/google/android/ei1;", "boxColor", "borderColor", "", "radius", "stroke", "n", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJFLandroidx/compose/ui/graphics/drawscope/d;)V", "checkColor", "checkFraction", "crossCenterGravitation", "Lcom/google/android/da1;", "drawingCache", "o", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFLandroidx/compose/ui/graphics/drawscope/d;Lcom/google/android/da1;)V", "Lcom/google/android/ff3;", "a", "F", "CheckboxDefaultPadding", "b", "CheckboxSize", "c", "RadiusSize", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class na1 {
    private static final float a;
    private static final float b = ff3.i(20);
    private static final float c;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements ps4<Transition.b<ToggleableState>, d, Integer, xa4<Float>> {
        final /* synthetic */ xa4<Float> a;

        a(xa4<Float> xa4Var) {
            this.a = xa4Var;
        }

        public final xa4<Float> a(Transition.b<ToggleableState> bVar, d dVar, int i) {
            xa4<Float> xa4VarG;
            dVar.y(630790831);
            if (e.k()) {
                e.o(630790831, i, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:425)");
            }
            ToggleableState toggleableStateG = bVar.g();
            ToggleableState toggleableState = ToggleableState.Off;
            if (toggleableStateG == toggleableState) {
                xa4VarG = lr.h(0, 1, null);
            } else {
                xa4VarG = bVar.d() == toggleableState ? lr.g(100) : this.a;
            }
            if (e.k()) {
                e.n();
            }
            dVar.u();
            return xa4VarG;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((Transition.b) obj, (d) obj2, ((Number) obj3).intValue());
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements ps4<Transition.b<ToggleableState>, d, Integer, xa4<Float>> {
        final /* synthetic */ xa4<Float> a;

        b(xa4<Float> xa4Var) {
            this.a = xa4Var;
        }

        public final xa4<Float> a(Transition.b<ToggleableState> bVar, d dVar, int i) {
            dVar.y(1780794470);
            if (e.k()) {
                e.o(1780794470, i, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:407)");
            }
            ToggleableState toggleableStateG = bVar.g();
            ToggleableState toggleableState = ToggleableState.Off;
            xa4<Float> xa4VarG = (toggleableStateG != toggleableState && bVar.d() == toggleableState) ? lr.g(100) : this.a;
            if (e.k()) {
                e.n();
            }
            dVar.u();
            return xa4VarG;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((Transition.b) obj, (d) obj2, ((Number) obj3).intValue());
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float f = 2;
        a = ff3.i(f);
        c = ff3.i(f);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:100:0x013e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0145  */
    /* JADX WARN: Code duplicated, block: B:106:0x014f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0157  */
    /* JADX WARN: Code duplicated, block: B:110:0x0167  */
    /* JADX WARN: Code duplicated, block: B:113:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:115:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:81:0x00df A[PHI: r4 r9 r11 r12
  0x00df: PHI (r4v25 int) = (r4v20 int), (r4v17 int), (r4v26 int) binds: [B:90:0x00fb, B:79:0x00db, B:80:0x00dd] A[DONT_GENERATE, DONT_INLINE]
  0x00df: PHI (r9v19 androidx.compose.ui.b) = (r9v4 androidx.compose.ui.b), (r9v2 androidx.compose.ui.b), (r9v2 androidx.compose.ui.b) binds: [B:90:0x00fb, B:79:0x00db, B:80:0x00dd] A[DONT_GENERATE, DONT_INLINE]
  0x00df: PHI (r11v6 boolean) = (r11v3 boolean), (r11v2 boolean), (r11v2 boolean) binds: [B:90:0x00fb, B:79:0x00db, B:80:0x00dd] A[DONT_GENERATE, DONT_INLINE]
  0x00df: PHI (r12v10 com.google.android.ga1) = (r12v7 com.google.android.ga1), (r12v6 com.google.android.ga1), (r12v6 com.google.android.ga1) binds: [B:90:0x00fb, B:79:0x00db, B:80:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:94:0x010b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0131  */
    /* JADX WARN: Code duplicated, block: B:99:0x013b  */
    public static final void f(final boolean z, final Function1<? super Boolean, Unit> function1, androidx.compose.ui.b bVar, boolean z2, ga1 ga1Var, r48 r48Var, d dVar, final int i, final int i2) throws Throwable {
        int i3;
        androidx.compose.ui.b bVar2;
        int i4;
        boolean z3;
        int i5;
        ga1 ga1VarA;
        int i6;
        r48 r48Var2;
        int i7;
        boolean z4;
        d dVar2;
        final androidx.compose.ui.b bVar3;
        final boolean z5;
        final ga1 ga1Var2;
        final r48 r48Var3;
        s6b s6bVarH;
        boolean z6;
        ga1 ga1Var3;
        r48 r48Var4;
        Function0 function0;
        boolean z7;
        boolean z8;
        Object objR;
        d dVarF = dVar.F(-1406741137);
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
            i3 |= dVarF.T(function1) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 == 0) {
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
                        ga1VarA = ga1Var;
                        int i9 = dVarF.x(ga1VarA) ? 16384 : 8192;
                        i3 |= i9;
                    } else {
                        ga1VarA = ga1Var;
                    }
                    i3 |= i9;
                } else {
                    ga1VarA = ga1Var;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        r48Var2 = r48Var;
                        if (dVarF.x(r48Var2)) {
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
                            if (i8 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                ga1VarA = ha1.a.a(dVarF, 6);
                            }
                            if (i6 != 0) {
                                z6 = z3;
                                ga1Var3 = ga1VarA;
                                r48Var4 = null;
                            }
                            androidx.compose.ui.b bVar4 = bVar2;
                            dVarF.M();
                            if (e.k()) {
                                e.o(-1406741137, i3, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:97)");
                            }
                            float fFloor = (float) Math.floor(((f43) dVarF.v(CompositionLocalsKt.g())).x2(ha1.a.c()));
                            ToggleableState toggleableStateA = i9d.a(z);
                            if (function1 != null) {
                                dVarF.y(2066152950);
                                if ((i3 & 112) == 32) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                z8 = z7 | ((i3 & 14) == 4);
                                objR = dVarF.R();
                                if (z8 || objR == d.INSTANCE.a()) {
                                    objR = new Function0() { // from class: com.google.android.ia1
                                        public final Object invoke() {
                                            return na1.g(function1, z);
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                dVarF.u();
                                function0 = (Function0) objR;
                            } else {
                                dVarF.y(2066218639);
                                dVarF.u();
                                function0 = null;
                            }
                            dVar2 = dVarF;
                            l(toggleableStateA, function0, new Stroke(fFloor, 0.0f, wbc.INSTANCE.c(), 0, null, 26, null), new Stroke(fFloor, 0.0f, 0, 0, null, 30, null), bVar4, z6, ga1Var3, r48Var4, dVar2, (i3 << 6) & 33546240, 0);
                            if (e.k()) {
                                e.n();
                            }
                            bVar3 = bVar4;
                            z5 = z6;
                            ga1Var2 = ga1Var3;
                            r48Var3 = r48Var4;
                        } else {
                            dVarF.q();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                        }
                        z6 = z3;
                        r48Var4 = r48Var2;
                        ga1Var3 = ga1VarA;
                        androidx.compose.ui.b bVar5 = bVar2;
                        dVarF.M();
                        if (e.k()) {
                            e.o(-1406741137, i3, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:97)");
                        }
                        float fFloor2 = (float) Math.floor(((f43) dVarF.v(CompositionLocalsKt.g())).x2(ha1.a.c()));
                        ToggleableState toggleableStateA2 = i9d.a(z);
                        if (function1 != null) {
                            dVarF.y(2066152950);
                            if ((i3 & 112) == 32) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            z8 = z7 | ((i3 & 14) == 4);
                            objR = dVarF.R();
                            if (z8) {
                                objR = new Function0() { // from class: com.google.android.ia1
                                    public final Object invoke() {
                                        return na1.g(function1, z);
                                    }
                                };
                                dVarF.L(objR);
                            } else {
                                objR = new Function0() { // from class: com.google.android.ia1
                                    public final Object invoke() {
                                        return na1.g(function1, z);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            dVarF.u();
                            function0 = (Function0) objR;
                        } else {
                            dVarF.y(2066218639);
                            dVarF.u();
                            function0 = null;
                        }
                        dVar2 = dVarF;
                        l(toggleableStateA2, function0, new Stroke(fFloor2, 0.0f, wbc.INSTANCE.c(), 0, null, 26, null), new Stroke(fFloor2, 0.0f, 0, 0, null, 30, null), bVar5, z6, ga1Var3, r48Var4, dVar2, (i3 << 6) & 33546240, 0);
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar5;
                        z5 = z6;
                        ga1Var2 = ga1Var3;
                        r48Var3 = r48Var4;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar3 = bVar2;
                        z5 = z3;
                        ga1Var2 = ga1VarA;
                        r48Var3 = r48Var2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.ja1
                            public final Object invoke(Object obj, Object obj2) {
                                return na1.h(z, function1, bVar3, z5, ga1Var2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 196608;
                r48Var2 = r48Var;
                if ((74899 & i3) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dVarF.g(z4, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            ga1VarA = ha1.a.a(dVarF, 6);
                        }
                        if (i6 != 0) {
                            z6 = z3;
                            ga1Var3 = ga1VarA;
                            r48Var4 = null;
                        } else {
                            z6 = z3;
                            r48Var4 = r48Var2;
                            ga1Var3 = ga1VarA;
                        }
                    } else {
                        if (i8 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            ga1VarA = ha1.a.a(dVarF, 6);
                        }
                        if (i6 != 0) {
                            z6 = z3;
                            ga1Var3 = ga1VarA;
                            r48Var4 = null;
                        } else {
                            z6 = z3;
                            r48Var4 = r48Var2;
                            ga1Var3 = ga1VarA;
                        }
                    }
                    androidx.compose.ui.b bVar6 = bVar2;
                    dVarF.M();
                    if (e.k()) {
                        e.o(-1406741137, i3, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:97)");
                    }
                    float fFloor3 = (float) Math.floor(((f43) dVarF.v(CompositionLocalsKt.g())).x2(ha1.a.c()));
                    ToggleableState toggleableStateA3 = i9d.a(z);
                    if (function1 != null) {
                        dVarF.y(2066152950);
                        if ((i3 & 112) == 32) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        z8 = z7 | ((i3 & 14) == 4);
                        objR = dVarF.R();
                        if (z8) {
                            objR = new Function0() { // from class: com.google.android.ia1
                                public final Object invoke() {
                                    return na1.g(function1, z);
                                }
                            };
                            dVarF.L(objR);
                        } else {
                            objR = new Function0() { // from class: com.google.android.ia1
                                public final Object invoke() {
                                    return na1.g(function1, z);
                                }
                            };
                            dVarF.L(objR);
                        }
                        dVarF.u();
                        function0 = (Function0) objR;
                    } else {
                        dVarF.y(2066218639);
                        dVarF.u();
                        function0 = null;
                    }
                    dVar2 = dVarF;
                    l(toggleableStateA3, function0, new Stroke(fFloor3, 0.0f, wbc.INSTANCE.c(), 0, null, 26, null), new Stroke(fFloor3, 0.0f, 0, 0, null, 30, null), bVar6, z6, ga1Var3, r48Var4, dVar2, (i3 << 6) & 33546240, 0);
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar6;
                    z5 = z6;
                    ga1Var2 = ga1Var3;
                    r48Var3 = r48Var4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar3 = bVar2;
                    z5 = z3;
                    ga1Var2 = ga1VarA;
                    r48Var3 = r48Var2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.ja1
                        public final Object invoke(Object obj, Object obj2) {
                            return na1.h(z, function1, bVar3, z5, ga1Var2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 3072;
            z3 = z2;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    ga1VarA = ga1Var;
                    if (dVarF.x(ga1VarA)) {
                    }
                    i3 |= i9;
                } else {
                    ga1VarA = ga1Var;
                }
                i3 |= i9;
            } else {
                ga1VarA = ga1Var;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    r48Var2 = r48Var;
                    if (dVarF.x(r48Var2)) {
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
                        if (i8 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            ga1VarA = ha1.a.a(dVarF, 6);
                        }
                        if (i6 != 0) {
                            z6 = z3;
                            ga1Var3 = ga1VarA;
                            r48Var4 = null;
                        } else {
                            z6 = z3;
                            r48Var4 = r48Var2;
                            ga1Var3 = ga1VarA;
                        }
                    } else {
                        if (i8 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            ga1VarA = ha1.a.a(dVarF, 6);
                        }
                        if (i6 != 0) {
                            z6 = z3;
                            ga1Var3 = ga1VarA;
                            r48Var4 = null;
                        } else {
                            z6 = z3;
                            r48Var4 = r48Var2;
                            ga1Var3 = ga1VarA;
                        }
                    }
                    androidx.compose.ui.b bVar7 = bVar2;
                    dVarF.M();
                    if (e.k()) {
                        e.o(-1406741137, i3, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:97)");
                    }
                    float fFloor4 = (float) Math.floor(((f43) dVarF.v(CompositionLocalsKt.g())).x2(ha1.a.c()));
                    ToggleableState toggleableStateA4 = i9d.a(z);
                    if (function1 != null) {
                        dVarF.y(2066152950);
                        if ((i3 & 112) == 32) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        z8 = z7 | ((i3 & 14) == 4);
                        objR = dVarF.R();
                        if (z8) {
                            objR = new Function0() { // from class: com.google.android.ia1
                                public final Object invoke() {
                                    return na1.g(function1, z);
                                }
                            };
                            dVarF.L(objR);
                        } else {
                            objR = new Function0() { // from class: com.google.android.ia1
                                public final Object invoke() {
                                    return na1.g(function1, z);
                                }
                            };
                            dVarF.L(objR);
                        }
                        dVarF.u();
                        function0 = (Function0) objR;
                    } else {
                        dVarF.y(2066218639);
                        dVarF.u();
                        function0 = null;
                    }
                    dVar2 = dVarF;
                    l(toggleableStateA4, function0, new Stroke(fFloor4, 0.0f, wbc.INSTANCE.c(), 0, null, 26, null), new Stroke(fFloor4, 0.0f, 0, 0, null, 30, null), bVar7, z6, ga1Var3, r48Var4, dVar2, (i3 << 6) & 33546240, 0);
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar7;
                    z5 = z6;
                    ga1Var2 = ga1Var3;
                    r48Var3 = r48Var4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar3 = bVar2;
                    z5 = z3;
                    ga1Var2 = ga1VarA;
                    r48Var3 = r48Var2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.ja1
                        public final Object invoke(Object obj, Object obj2) {
                            return na1.h(z, function1, bVar3, z5, ga1Var2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 196608;
            r48Var2 = r48Var;
            if ((74899 & i3) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dVarF.g(z4, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        ga1VarA = ha1.a.a(dVarF, 6);
                    }
                    if (i6 != 0) {
                        z6 = z3;
                        ga1Var3 = ga1VarA;
                        r48Var4 = null;
                    } else {
                        z6 = z3;
                        r48Var4 = r48Var2;
                        ga1Var3 = ga1VarA;
                    }
                } else {
                    if (i8 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        ga1VarA = ha1.a.a(dVarF, 6);
                    }
                    if (i6 != 0) {
                        z6 = z3;
                        ga1Var3 = ga1VarA;
                        r48Var4 = null;
                    } else {
                        z6 = z3;
                        r48Var4 = r48Var2;
                        ga1Var3 = ga1VarA;
                    }
                }
                androidx.compose.ui.b bVar8 = bVar2;
                dVarF.M();
                if (e.k()) {
                    e.o(-1406741137, i3, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:97)");
                }
                float fFloor5 = (float) Math.floor(((f43) dVarF.v(CompositionLocalsKt.g())).x2(ha1.a.c()));
                ToggleableState toggleableStateA5 = i9d.a(z);
                if (function1 != null) {
                    dVarF.y(2066152950);
                    if ((i3 & 112) == 32) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z7 | ((i3 & 14) == 4);
                    objR = dVarF.R();
                    if (z8) {
                        objR = new Function0() { // from class: com.google.android.ia1
                            public final Object invoke() {
                                return na1.g(function1, z);
                            }
                        };
                        dVarF.L(objR);
                    } else {
                        objR = new Function0() { // from class: com.google.android.ia1
                            public final Object invoke() {
                                return na1.g(function1, z);
                            }
                        };
                        dVarF.L(objR);
                    }
                    dVarF.u();
                    function0 = (Function0) objR;
                } else {
                    dVarF.y(2066218639);
                    dVarF.u();
                    function0 = null;
                }
                dVar2 = dVarF;
                l(toggleableStateA5, function0, new Stroke(fFloor5, 0.0f, wbc.INSTANCE.c(), 0, null, 26, null), new Stroke(fFloor5, 0.0f, 0, 0, null, 30, null), bVar8, z6, ga1Var3, r48Var4, dVar2, (i3 << 6) & 33546240, 0);
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar8;
                z5 = z6;
                ga1Var2 = ga1Var3;
                r48Var3 = r48Var4;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar3 = bVar2;
                z5 = z3;
                ga1Var2 = ga1VarA;
                r48Var3 = r48Var2;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.ja1
                    public final Object invoke(Object obj, Object obj2) {
                        return na1.h(z, function1, bVar3, z5, ga1Var2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
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
                    ga1VarA = ga1Var;
                    if (dVarF.x(ga1VarA)) {
                    }
                    i3 |= i9;
                } else {
                    ga1VarA = ga1Var;
                }
                i3 |= i9;
            } else {
                ga1VarA = ga1Var;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    r48Var2 = r48Var;
                    if (dVarF.x(r48Var2)) {
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
                        if (i8 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            ga1VarA = ha1.a.a(dVarF, 6);
                        }
                        if (i6 != 0) {
                            z6 = z3;
                            ga1Var3 = ga1VarA;
                            r48Var4 = null;
                        } else {
                            z6 = z3;
                            r48Var4 = r48Var2;
                            ga1Var3 = ga1VarA;
                        }
                    } else {
                        if (i8 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            ga1VarA = ha1.a.a(dVarF, 6);
                        }
                        if (i6 != 0) {
                            z6 = z3;
                            ga1Var3 = ga1VarA;
                            r48Var4 = null;
                        } else {
                            z6 = z3;
                            r48Var4 = r48Var2;
                            ga1Var3 = ga1VarA;
                        }
                    }
                    androidx.compose.ui.b bVar9 = bVar2;
                    dVarF.M();
                    if (e.k()) {
                        e.o(-1406741137, i3, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:97)");
                    }
                    float fFloor6 = (float) Math.floor(((f43) dVarF.v(CompositionLocalsKt.g())).x2(ha1.a.c()));
                    ToggleableState toggleableStateA6 = i9d.a(z);
                    if (function1 != null) {
                        dVarF.y(2066152950);
                        if ((i3 & 112) == 32) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        z8 = z7 | ((i3 & 14) == 4);
                        objR = dVarF.R();
                        if (z8) {
                            objR = new Function0() { // from class: com.google.android.ia1
                                public final Object invoke() {
                                    return na1.g(function1, z);
                                }
                            };
                            dVarF.L(objR);
                        } else {
                            objR = new Function0() { // from class: com.google.android.ia1
                                public final Object invoke() {
                                    return na1.g(function1, z);
                                }
                            };
                            dVarF.L(objR);
                        }
                        dVarF.u();
                        function0 = (Function0) objR;
                    } else {
                        dVarF.y(2066218639);
                        dVarF.u();
                        function0 = null;
                    }
                    dVar2 = dVarF;
                    l(toggleableStateA6, function0, new Stroke(fFloor6, 0.0f, wbc.INSTANCE.c(), 0, null, 26, null), new Stroke(fFloor6, 0.0f, 0, 0, null, 30, null), bVar9, z6, ga1Var3, r48Var4, dVar2, (i3 << 6) & 33546240, 0);
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar9;
                    z5 = z6;
                    ga1Var2 = ga1Var3;
                    r48Var3 = r48Var4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar3 = bVar2;
                    z5 = z3;
                    ga1Var2 = ga1VarA;
                    r48Var3 = r48Var2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.ja1
                        public final Object invoke(Object obj, Object obj2) {
                            return na1.h(z, function1, bVar3, z5, ga1Var2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 196608;
            r48Var2 = r48Var;
            if ((74899 & i3) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dVarF.g(z4, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        ga1VarA = ha1.a.a(dVarF, 6);
                    }
                    if (i6 != 0) {
                        z6 = z3;
                        ga1Var3 = ga1VarA;
                        r48Var4 = null;
                    } else {
                        z6 = z3;
                        r48Var4 = r48Var2;
                        ga1Var3 = ga1VarA;
                    }
                } else {
                    if (i8 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        ga1VarA = ha1.a.a(dVarF, 6);
                    }
                    if (i6 != 0) {
                        z6 = z3;
                        ga1Var3 = ga1VarA;
                        r48Var4 = null;
                    } else {
                        z6 = z3;
                        r48Var4 = r48Var2;
                        ga1Var3 = ga1VarA;
                    }
                }
                androidx.compose.ui.b bVar10 = bVar2;
                dVarF.M();
                if (e.k()) {
                    e.o(-1406741137, i3, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:97)");
                }
                float fFloor7 = (float) Math.floor(((f43) dVarF.v(CompositionLocalsKt.g())).x2(ha1.a.c()));
                ToggleableState toggleableStateA7 = i9d.a(z);
                if (function1 != null) {
                    dVarF.y(2066152950);
                    if ((i3 & 112) == 32) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z7 | ((i3 & 14) == 4);
                    objR = dVarF.R();
                    if (z8) {
                        objR = new Function0() { // from class: com.google.android.ia1
                            public final Object invoke() {
                                return na1.g(function1, z);
                            }
                        };
                        dVarF.L(objR);
                    } else {
                        objR = new Function0() { // from class: com.google.android.ia1
                            public final Object invoke() {
                                return na1.g(function1, z);
                            }
                        };
                        dVarF.L(objR);
                    }
                    dVarF.u();
                    function0 = (Function0) objR;
                } else {
                    dVarF.y(2066218639);
                    dVarF.u();
                    function0 = null;
                }
                dVar2 = dVarF;
                l(toggleableStateA7, function0, new Stroke(fFloor7, 0.0f, wbc.INSTANCE.c(), 0, null, 26, null), new Stroke(fFloor7, 0.0f, 0, 0, null, 30, null), bVar10, z6, ga1Var3, r48Var4, dVar2, (i3 << 6) & 33546240, 0);
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar10;
                z5 = z6;
                ga1Var2 = ga1Var3;
                r48Var3 = r48Var4;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar3 = bVar2;
                z5 = z3;
                ga1Var2 = ga1VarA;
                r48Var3 = r48Var2;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.ja1
                    public final Object invoke(Object obj, Object obj2) {
                        return na1.h(z, function1, bVar3, z5, ga1Var2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 3072;
        z3 = z2;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                ga1VarA = ga1Var;
                if (dVarF.x(ga1VarA)) {
                }
                i3 |= i9;
            } else {
                ga1VarA = ga1Var;
            }
            i3 |= i9;
        } else {
            ga1VarA = ga1Var;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                r48Var2 = r48Var;
                if (dVarF.x(r48Var2)) {
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
                    if (i8 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        ga1VarA = ha1.a.a(dVarF, 6);
                    }
                    if (i6 != 0) {
                        z6 = z3;
                        ga1Var3 = ga1VarA;
                        r48Var4 = null;
                    } else {
                        z6 = z3;
                        r48Var4 = r48Var2;
                        ga1Var3 = ga1VarA;
                    }
                } else {
                    if (i8 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        ga1VarA = ha1.a.a(dVarF, 6);
                    }
                    if (i6 != 0) {
                        z6 = z3;
                        ga1Var3 = ga1VarA;
                        r48Var4 = null;
                    } else {
                        z6 = z3;
                        r48Var4 = r48Var2;
                        ga1Var3 = ga1VarA;
                    }
                }
                androidx.compose.ui.b bVar11 = bVar2;
                dVarF.M();
                if (e.k()) {
                    e.o(-1406741137, i3, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:97)");
                }
                float fFloor8 = (float) Math.floor(((f43) dVarF.v(CompositionLocalsKt.g())).x2(ha1.a.c()));
                ToggleableState toggleableStateA8 = i9d.a(z);
                if (function1 != null) {
                    dVarF.y(2066152950);
                    if ((i3 & 112) == 32) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z7 | ((i3 & 14) == 4);
                    objR = dVarF.R();
                    if (z8) {
                        objR = new Function0() { // from class: com.google.android.ia1
                            public final Object invoke() {
                                return na1.g(function1, z);
                            }
                        };
                        dVarF.L(objR);
                    } else {
                        objR = new Function0() { // from class: com.google.android.ia1
                            public final Object invoke() {
                                return na1.g(function1, z);
                            }
                        };
                        dVarF.L(objR);
                    }
                    dVarF.u();
                    function0 = (Function0) objR;
                } else {
                    dVarF.y(2066218639);
                    dVarF.u();
                    function0 = null;
                }
                dVar2 = dVarF;
                l(toggleableStateA8, function0, new Stroke(fFloor8, 0.0f, wbc.INSTANCE.c(), 0, null, 26, null), new Stroke(fFloor8, 0.0f, 0, 0, null, 30, null), bVar11, z6, ga1Var3, r48Var4, dVar2, (i3 << 6) & 33546240, 0);
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar11;
                z5 = z6;
                ga1Var2 = ga1Var3;
                r48Var3 = r48Var4;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar3 = bVar2;
                z5 = z3;
                ga1Var2 = ga1VarA;
                r48Var3 = r48Var2;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.ja1
                    public final Object invoke(Object obj, Object obj2) {
                        return na1.h(z, function1, bVar3, z5, ga1Var2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 196608;
        r48Var2 = r48Var;
        if ((74899 & i3) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (dVarF.g(z4, i3 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    bVar2 = androidx.compose.ui.b.INSTANCE;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    ga1VarA = ha1.a.a(dVarF, 6);
                }
                if (i6 != 0) {
                    z6 = z3;
                    ga1Var3 = ga1VarA;
                    r48Var4 = null;
                } else {
                    z6 = z3;
                    r48Var4 = r48Var2;
                    ga1Var3 = ga1VarA;
                }
            } else {
                if (i8 != 0) {
                    bVar2 = androidx.compose.ui.b.INSTANCE;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    ga1VarA = ha1.a.a(dVarF, 6);
                }
                if (i6 != 0) {
                    z6 = z3;
                    ga1Var3 = ga1VarA;
                    r48Var4 = null;
                } else {
                    z6 = z3;
                    r48Var4 = r48Var2;
                    ga1Var3 = ga1VarA;
                }
            }
            androidx.compose.ui.b bVar12 = bVar2;
            dVarF.M();
            if (e.k()) {
                e.o(-1406741137, i3, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:97)");
            }
            float fFloor9 = (float) Math.floor(((f43) dVarF.v(CompositionLocalsKt.g())).x2(ha1.a.c()));
            ToggleableState toggleableStateA9 = i9d.a(z);
            if (function1 != null) {
                dVarF.y(2066152950);
                if ((i3 & 112) == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z7 | ((i3 & 14) == 4);
                objR = dVarF.R();
                if (z8) {
                    objR = new Function0() { // from class: com.google.android.ia1
                        public final Object invoke() {
                            return na1.g(function1, z);
                        }
                    };
                    dVarF.L(objR);
                } else {
                    objR = new Function0() { // from class: com.google.android.ia1
                        public final Object invoke() {
                            return na1.g(function1, z);
                        }
                    };
                    dVarF.L(objR);
                }
                dVarF.u();
                function0 = (Function0) objR;
            } else {
                dVarF.y(2066218639);
                dVarF.u();
                function0 = null;
            }
            dVar2 = dVarF;
            l(toggleableStateA9, function0, new Stroke(fFloor9, 0.0f, wbc.INSTANCE.c(), 0, null, 26, null), new Stroke(fFloor9, 0.0f, 0, 0, null, 30, null), bVar12, z6, ga1Var3, r48Var4, dVar2, (i3 << 6) & 33546240, 0);
            if (e.k()) {
                e.n();
            }
            bVar3 = bVar12;
            z5 = z6;
            ga1Var2 = ga1Var3;
            r48Var3 = r48Var4;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            bVar3 = bVar2;
            z5 = z3;
            ga1Var2 = ga1VarA;
            r48Var3 = r48Var2;
        }
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.ja1
                public final Object invoke(Object obj, Object obj2) {
                    return na1.h(z, function1, bVar3, z5, ga1Var2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(Function1 function1, boolean z) {
        function1.invoke(Boolean.valueOf(!z));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(boolean z, Function1 function1, androidx.compose.ui.b bVar, boolean z2, ga1 ga1Var, r48 r48Var, int i, int i2, d dVar, int i3) throws Throwable {
        f(z, function1, bVar, z2, ga1Var, r48Var, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final void i(final boolean z, final ToggleableState toggleableState, final androidx.compose.ui.b bVar, final ga1 ga1Var, final Stroke stroke, final Stroke stroke2, d dVar, final int i) throws Throwable {
        int i2;
        d dVar2;
        float f;
        float f2;
        float f3;
        d dVarF = dVar.F(-891330208);
        if ((i & 6) == 0) {
            i2 = (dVarF.A(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.C(toggleableState.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dVarF.x(bVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= dVarF.x(ga1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dVarF.T(stroke) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dVarF.T(stroke2) ? 131072 : 65536;
        }
        if (dVarF.g((74899 & i2) != 74898, i2 & 1)) {
            if (e.k()) {
                e.o(-891330208, i2, -1, "androidx.compose.material3.CheckboxImpl (Checkbox.kt:401)");
            }
            int i3 = i2 >> 3;
            int i4 = i3 & 14;
            Transition transitionY = TransitionKt.y(toggleableState, null, dVarF, i4, 2);
            xa4 xa4VarB = d08.b(MotionSchemeKeyTokens.DefaultSpatial, dVarF, 6);
            b bVar2 = new b(xa4VarB);
            yg4 yg4Var = yg4.a;
            tjd<Float, qr> tjdVarN = w2e.N(yg4Var);
            ToggleableState toggleableState2 = (ToggleableState) transitionY.p();
            dVarF.y(-768316570);
            int i5 = i2;
            if (e.k()) {
                e.o(-768316570, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:415)");
            }
            int[] iArr = c.$EnumSwitchMapping$0;
            int i6 = iArr[toggleableState2.ordinal()];
            float f4 = 0.0f;
            if (i6 == 1) {
                f = 1.0f;
            } else if (i6 != 2) {
                if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            if (e.k()) {
                e.n();
            }
            dVarF.u();
            Float fValueOf = Float.valueOf(f);
            ToggleableState toggleableState3 = (ToggleableState) transitionY.w();
            dVarF.y(-768316570);
            if (e.k()) {
                e.o(-768316570, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:415)");
            }
            int i7 = iArr[toggleableState3.ordinal()];
            if (i7 == 1) {
                f2 = 1.0f;
            } else if (i7 != 2) {
                if (i7 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            if (e.k()) {
                e.n();
            }
            dVarF.u();
            final q6c q6cVarR = TransitionKt.r(transitionY, fValueOf, Float.valueOf(f2), (xa4) bVar2.invoke(transitionY.u(), dVarF, 0), tjdVarN, "FloatAnimation", dVarF, 0);
            a aVar = new a(xa4VarB);
            tjd<Float, qr> tjdVarN2 = w2e.N(yg4Var);
            ToggleableState toggleableState4 = (ToggleableState) transitionY.p();
            dVarF.y(1840054703);
            if (e.k()) {
                e.o(1840054703, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:433)");
            }
            int i8 = iArr[toggleableState4.ordinal()];
            if (i8 == 1 || i8 == 2) {
                f3 = 0.0f;
            } else {
                if (i8 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f3 = 1.0f;
            }
            if (e.k()) {
                e.n();
            }
            dVarF.u();
            Float fValueOf2 = Float.valueOf(f3);
            ToggleableState toggleableState5 = (ToggleableState) transitionY.w();
            dVarF.y(1840054703);
            if (e.k()) {
                e.o(1840054703, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:433)");
            }
            int i9 = iArr[toggleableState5.ordinal()];
            if (i9 != 1 && i9 != 2) {
                if (i9 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f4 = 1.0f;
            }
            if (e.k()) {
                e.n();
            }
            dVarF.u();
            final q6c q6cVarR2 = TransitionKt.r(transitionY, fValueOf2, Float.valueOf(f4), (xa4) aVar.invoke(transitionY.u(), dVarF, 0), tjdVarN2, "FloatAnimation", dVarF, 0);
            dVar2 = dVarF;
            Object objR = dVar2.R();
            d.Companion companion = d.INSTANCE;
            if (objR == companion.a()) {
                Object da1Var = new da1(null, null, null, 7, null);
                dVar2.L(da1Var);
                objR = da1Var;
            }
            final da1 da1Var2 = (da1) objR;
            final q6c<ei1> q6cVarC = ga1Var.c(toggleableState, dVar2, i4 | ((i5 >> 6) & 112));
            int i10 = (i5 & 126) | (i3 & 896);
            final q6c<ei1> q6cVarB = ga1Var.b(z, toggleableState, dVar2, i10);
            final q6c<ei1> q6cVarA = ga1Var.a(z, toggleableState, dVar2, i10);
            androidx.compose.ui.b bVarM = SizeKt.m(SizeKt.E(bVar, tc.INSTANCE.e(), false, 2, null), b);
            boolean zX = dVar2.x(q6cVarB) | dVar2.x(q6cVarA) | dVar2.T(stroke2) | dVar2.x(q6cVarC) | dVar2.x(q6cVarR) | dVar2.x(q6cVarR2) | dVar2.T(stroke);
            Object objR2 = dVar2.R();
            if (zX || objR2 == companion.a()) {
                Object obj = new Function1() { // from class: com.google.android.la1
                    public final Object invoke(Object obj2) {
                        return na1.j(q6cVarB, q6cVarA, stroke2, q6cVarC, q6cVarR, q6cVarR2, stroke, da1Var2, (DrawScope) obj2);
                    }
                };
                dVar2.L(obj);
                objR2 = obj;
            }
            v51.b(bVarM, (Function1) objR2, dVar2, 0);
            if (e.k()) {
                e.n();
            }
        } else {
            dVar2 = dVarF;
            dVar2.q();
        }
        s6b s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.ma1
                public final Object invoke(Object obj2, Object obj3) {
                    return na1.k(z, toggleableState, bVar, ga1Var, stroke, stroke2, i, (d) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(q6c q6cVar, q6c q6cVar2, Stroke stroke, q6c q6cVar3, q6c q6cVar4, q6c q6cVar5, Stroke stroke2, da1 da1Var, DrawScope drawScope) {
        n(drawScope, ((ei1) q6cVar.getValue()).getValue(), ((ei1) q6cVar2.getValue()).getValue(), drawScope.x2(c), stroke);
        o(drawScope, ((ei1) q6cVar3.getValue()).getValue(), ((Number) q6cVar4.getValue()).floatValue(), ((Number) q6cVar5.getValue()).floatValue(), stroke2, da1Var);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(boolean z, ToggleableState toggleableState, androidx.compose.ui.b bVar, ga1 ga1Var, Stroke stroke, Stroke stroke2, int i, d dVar, int i2) throws Throwable {
        i(z, toggleableState, bVar, ga1Var, stroke, stroke2, dVar, saa.a(i | 1));
        return Unit.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:102:0x011c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x011e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0121  */
    /* JADX WARN: Code duplicated, block: B:106:0x0124  */
    /* JADX WARN: Code duplicated, block: B:109:0x012a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0134  */
    /* JADX WARN: Code duplicated, block: B:113:0x0139  */
    /* JADX WARN: Code duplicated, block: B:116:0x0146  */
    /* JADX WARN: Code duplicated, block: B:118:0x0151  */
    /* JADX WARN: Code duplicated, block: B:119:0x0180  */
    /* JADX WARN: Code duplicated, block: B:121:0x0185  */
    /* JADX WARN: Code duplicated, block: B:122:0x018c  */
    /* JADX WARN: Code duplicated, block: B:125:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:131:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00de  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:95:0x0108  */
    public static final void l(final ToggleableState toggleableState, final Function0<Unit> function0, final Stroke stroke, final Stroke stroke2, androidx.compose.ui.b bVar, boolean z, ga1 ga1Var, r48 r48Var, d dVar, final int i, final int i2) throws Throwable {
        int i3;
        Stroke stroke3;
        androidx.compose.ui.b bVar2;
        int i4;
        boolean z2;
        int i5;
        ga1 ga1VarA;
        int i6;
        r48 r48Var2;
        int i7;
        boolean z3;
        final androidx.compose.ui.b bVar3;
        final boolean z4;
        final ga1 ga1Var2;
        final r48 r48Var3;
        s6b s6bVarH;
        androidx.compose.ui.b bVar4;
        androidx.compose.ui.b bVar5;
        androidx.compose.ui.b bVarD;
        androidx.compose.ui.b bVarH;
        d dVarF = dVar.F(-406243761);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.C(toggleableState.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= dVarF.T(function0) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= dVarF.T(stroke) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            stroke3 = stroke2;
        } else {
            stroke3 = stroke2;
            if ((i & 3072) == 0) {
                i3 |= dVarF.T(stroke3) ? 2048 : 1024;
            }
        }
        int i8 = i2 & 16;
        if (i8 == 0) {
            if ((i & 24576) == 0) {
                bVar2 = bVar;
                i3 |= dVarF.x(bVar2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (dVarF.A(z2)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        ga1VarA = ga1Var;
                        int i9 = dVarF.x(ga1VarA) ? 1048576 : 524288;
                        i3 |= i9;
                    } else {
                        ga1VarA = ga1Var;
                    }
                    i3 |= i9;
                } else {
                    ga1VarA = ga1Var;
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    if ((12582912 & i) == 0) {
                        r48Var2 = r48Var;
                        if (dVarF.x(r48Var2)) {
                            i7 = 8388608;
                        } else {
                            i7 = 4194304;
                        }
                        i3 |= i7;
                    }
                    if ((i3 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i3 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0 || dVarF.t()) {
                            if (i8 != 0) {
                                bVar4 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                ga1VarA = ha1.a.a(dVarF, 6);
                            }
                            if (i6 != 0) {
                                r48Var2 = null;
                            } else {
                                r48Var2 = r48Var2;
                            }
                            bVar5 = bVar4;
                        } else {
                            dVarF.q();
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            i3 = i3;
                            z2 = z2;
                            r48Var2 = r48Var2;
                            bVar5 = bVar2;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(-406243761, i3, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:275)");
                        }
                        if (function0 != null) {
                            boolean z5 = z2;
                            bVarD = c9d.d(androidx.compose.ui.b.INSTANCE, toggleableState, r48Var2, xoa.e(false, ff3.i(oa1.a.d() / 2), 0L, 4, null), z5, hpa.j(hpa.INSTANCE.c()), function0);
                            z2 = z5;
                        } else {
                            bVarD = androidx.compose.ui.b.INSTANCE;
                        }
                        if (function0 != null) {
                            bVarH = InteractiveComponentSizeKt.h(androidx.compose.ui.b.INSTANCE);
                        } else {
                            bVarH = androidx.compose.ui.b.INSTANCE;
                        }
                        androidx.compose.ui.b bVarN = nx8.n(bVar5.then(bVarH).then(bVarD), a);
                        int i10 = i3 << 6;
                        ga1 ga1Var3 = ga1VarA;
                        i(z2, toggleableState, bVarN, ga1Var3, stroke, stroke3, dVarF, ((i3 >> 15) & 14) | ((i3 << 3) & 112) | ((i3 >> 9) & 7168) | (57344 & i10) | (i10 & 458752));
                        if (e.k()) {
                            e.n();
                        }
                        z4 = z2;
                        bVar3 = bVar5;
                        ga1Var2 = ga1Var3;
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                        z4 = z2;
                        ga1Var2 = ga1VarA;
                    }
                    r48Var3 = r48Var2;
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.ka1
                            public final Object invoke(Object obj, Object obj2) {
                                return na1.m(toggleableState, function0, stroke, stroke2, bVar3, z4, ga1Var2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 12582912;
                r48Var2 = r48Var;
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            bVar4 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            ga1VarA = ha1.a.a(dVarF, 6);
                        }
                        if (i6 != 0) {
                            r48Var2 = null;
                        } else {
                            r48Var2 = r48Var2;
                        }
                        bVar5 = bVar4;
                    } else {
                        if (i8 != 0) {
                            bVar4 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            ga1VarA = ha1.a.a(dVarF, 6);
                        }
                        if (i6 != 0) {
                            r48Var2 = null;
                        } else {
                            r48Var2 = r48Var2;
                        }
                        bVar5 = bVar4;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-406243761, i3, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:275)");
                    }
                    if (function0 != null) {
                        boolean z6 = z2;
                        bVarD = c9d.d(androidx.compose.ui.b.INSTANCE, toggleableState, r48Var2, xoa.e(false, ff3.i(oa1.a.d() / 2), 0L, 4, null), z6, hpa.j(hpa.INSTANCE.c()), function0);
                        z2 = z6;
                    } else {
                        bVarD = androidx.compose.ui.b.INSTANCE;
                    }
                    if (function0 != null) {
                        bVarH = InteractiveComponentSizeKt.h(androidx.compose.ui.b.INSTANCE);
                    } else {
                        bVarH = androidx.compose.ui.b.INSTANCE;
                    }
                    androidx.compose.ui.b bVarN2 = nx8.n(bVar5.then(bVarH).then(bVarD), a);
                    int i11 = i3 << 6;
                    ga1 ga1Var4 = ga1VarA;
                    i(z2, toggleableState, bVarN2, ga1Var4, stroke, stroke3, dVarF, ((i3 >> 15) & 14) | ((i3 << 3) & 112) | ((i3 >> 9) & 7168) | (57344 & i11) | (i11 & 458752));
                    if (e.k()) {
                        e.n();
                    }
                    z4 = z2;
                    bVar3 = bVar5;
                    ga1Var2 = ga1Var4;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    z4 = z2;
                    ga1Var2 = ga1VarA;
                }
                r48Var3 = r48Var2;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.ka1
                        public final Object invoke(Object obj, Object obj2) {
                            return na1.m(toggleableState, function0, stroke, stroke2, bVar3, z4, ga1Var2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 196608;
            z2 = z;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    ga1VarA = ga1Var;
                    if (dVarF.x(ga1VarA)) {
                    }
                    i3 |= i9;
                } else {
                    ga1VarA = ga1Var;
                }
                i3 |= i9;
            } else {
                ga1VarA = ga1Var;
            }
            i6 = i2 & 128;
            if (i6 != 0) {
                if ((12582912 & i) == 0) {
                    r48Var2 = r48Var;
                    if (dVarF.x(r48Var2)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i3 |= i7;
                }
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            bVar4 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            ga1VarA = ha1.a.a(dVarF, 6);
                        }
                        if (i6 != 0) {
                            r48Var2 = null;
                        } else {
                            r48Var2 = r48Var2;
                        }
                        bVar5 = bVar4;
                    } else {
                        if (i8 != 0) {
                            bVar4 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            ga1VarA = ha1.a.a(dVarF, 6);
                        }
                        if (i6 != 0) {
                            r48Var2 = null;
                        } else {
                            r48Var2 = r48Var2;
                        }
                        bVar5 = bVar4;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-406243761, i3, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:275)");
                    }
                    if (function0 != null) {
                        boolean z7 = z2;
                        bVarD = c9d.d(androidx.compose.ui.b.INSTANCE, toggleableState, r48Var2, xoa.e(false, ff3.i(oa1.a.d() / 2), 0L, 4, null), z7, hpa.j(hpa.INSTANCE.c()), function0);
                        z2 = z7;
                    } else {
                        bVarD = androidx.compose.ui.b.INSTANCE;
                    }
                    if (function0 != null) {
                        bVarH = InteractiveComponentSizeKt.h(androidx.compose.ui.b.INSTANCE);
                    } else {
                        bVarH = androidx.compose.ui.b.INSTANCE;
                    }
                    androidx.compose.ui.b bVarN3 = nx8.n(bVar5.then(bVarH).then(bVarD), a);
                    int i12 = i3 << 6;
                    ga1 ga1Var5 = ga1VarA;
                    i(z2, toggleableState, bVarN3, ga1Var5, stroke, stroke3, dVarF, ((i3 >> 15) & 14) | ((i3 << 3) & 112) | ((i3 >> 9) & 7168) | (57344 & i12) | (i12 & 458752));
                    if (e.k()) {
                        e.n();
                    }
                    z4 = z2;
                    bVar3 = bVar5;
                    ga1Var2 = ga1Var5;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    z4 = z2;
                    ga1Var2 = ga1VarA;
                }
                r48Var3 = r48Var2;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.ka1
                        public final Object invoke(Object obj, Object obj2) {
                            return na1.m(toggleableState, function0, stroke, stroke2, bVar3, z4, ga1Var2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 12582912;
            r48Var2 = r48Var;
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        bVar4 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        ga1VarA = ha1.a.a(dVarF, 6);
                    }
                    if (i6 != 0) {
                        r48Var2 = null;
                    } else {
                        r48Var2 = r48Var2;
                    }
                    bVar5 = bVar4;
                } else {
                    if (i8 != 0) {
                        bVar4 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        ga1VarA = ha1.a.a(dVarF, 6);
                    }
                    if (i6 != 0) {
                        r48Var2 = null;
                    } else {
                        r48Var2 = r48Var2;
                    }
                    bVar5 = bVar4;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-406243761, i3, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:275)");
                }
                if (function0 != null) {
                    boolean z8 = z2;
                    bVarD = c9d.d(androidx.compose.ui.b.INSTANCE, toggleableState, r48Var2, xoa.e(false, ff3.i(oa1.a.d() / 2), 0L, 4, null), z8, hpa.j(hpa.INSTANCE.c()), function0);
                    z2 = z8;
                } else {
                    bVarD = androidx.compose.ui.b.INSTANCE;
                }
                if (function0 != null) {
                    bVarH = InteractiveComponentSizeKt.h(androidx.compose.ui.b.INSTANCE);
                } else {
                    bVarH = androidx.compose.ui.b.INSTANCE;
                }
                androidx.compose.ui.b bVarN4 = nx8.n(bVar5.then(bVarH).then(bVarD), a);
                int i13 = i3 << 6;
                ga1 ga1Var6 = ga1VarA;
                i(z2, toggleableState, bVarN4, ga1Var6, stroke, stroke3, dVarF, ((i3 >> 15) & 14) | ((i3 << 3) & 112) | ((i3 >> 9) & 7168) | (57344 & i13) | (i13 & 458752));
                if (e.k()) {
                    e.n();
                }
                z4 = z2;
                bVar3 = bVar5;
                ga1Var2 = ga1Var6;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                z4 = z2;
                ga1Var2 = ga1VarA;
            }
            r48Var3 = r48Var2;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.ka1
                    public final Object invoke(Object obj, Object obj2) {
                        return na1.m(toggleableState, function0, stroke, stroke2, bVar3, z4, ga1Var2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 24576;
        bVar2 = bVar;
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                z2 = z;
                if (dVarF.A(z2)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    ga1VarA = ga1Var;
                    if (dVarF.x(ga1VarA)) {
                    }
                    i3 |= i9;
                } else {
                    ga1VarA = ga1Var;
                }
                i3 |= i9;
            } else {
                ga1VarA = ga1Var;
            }
            i6 = i2 & 128;
            if (i6 != 0) {
                if ((12582912 & i) == 0) {
                    r48Var2 = r48Var;
                    if (dVarF.x(r48Var2)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i3 |= i7;
                }
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            bVar4 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            ga1VarA = ha1.a.a(dVarF, 6);
                        }
                        if (i6 != 0) {
                            r48Var2 = null;
                        } else {
                            r48Var2 = r48Var2;
                        }
                        bVar5 = bVar4;
                    } else {
                        if (i8 != 0) {
                            bVar4 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            ga1VarA = ha1.a.a(dVarF, 6);
                        }
                        if (i6 != 0) {
                            r48Var2 = null;
                        } else {
                            r48Var2 = r48Var2;
                        }
                        bVar5 = bVar4;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-406243761, i3, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:275)");
                    }
                    if (function0 != null) {
                        boolean z9 = z2;
                        bVarD = c9d.d(androidx.compose.ui.b.INSTANCE, toggleableState, r48Var2, xoa.e(false, ff3.i(oa1.a.d() / 2), 0L, 4, null), z9, hpa.j(hpa.INSTANCE.c()), function0);
                        z2 = z9;
                    } else {
                        bVarD = androidx.compose.ui.b.INSTANCE;
                    }
                    if (function0 != null) {
                        bVarH = InteractiveComponentSizeKt.h(androidx.compose.ui.b.INSTANCE);
                    } else {
                        bVarH = androidx.compose.ui.b.INSTANCE;
                    }
                    androidx.compose.ui.b bVarN5 = nx8.n(bVar5.then(bVarH).then(bVarD), a);
                    int i14 = i3 << 6;
                    ga1 ga1Var7 = ga1VarA;
                    i(z2, toggleableState, bVarN5, ga1Var7, stroke, stroke3, dVarF, ((i3 >> 15) & 14) | ((i3 << 3) & 112) | ((i3 >> 9) & 7168) | (57344 & i14) | (i14 & 458752));
                    if (e.k()) {
                        e.n();
                    }
                    z4 = z2;
                    bVar3 = bVar5;
                    ga1Var2 = ga1Var7;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    z4 = z2;
                    ga1Var2 = ga1VarA;
                }
                r48Var3 = r48Var2;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.ka1
                        public final Object invoke(Object obj, Object obj2) {
                            return na1.m(toggleableState, function0, stroke, stroke2, bVar3, z4, ga1Var2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 12582912;
            r48Var2 = r48Var;
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        bVar4 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        ga1VarA = ha1.a.a(dVarF, 6);
                    }
                    if (i6 != 0) {
                        r48Var2 = null;
                    } else {
                        r48Var2 = r48Var2;
                    }
                    bVar5 = bVar4;
                } else {
                    if (i8 != 0) {
                        bVar4 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        ga1VarA = ha1.a.a(dVarF, 6);
                    }
                    if (i6 != 0) {
                        r48Var2 = null;
                    } else {
                        r48Var2 = r48Var2;
                    }
                    bVar5 = bVar4;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-406243761, i3, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:275)");
                }
                if (function0 != null) {
                    boolean z10 = z2;
                    bVarD = c9d.d(androidx.compose.ui.b.INSTANCE, toggleableState, r48Var2, xoa.e(false, ff3.i(oa1.a.d() / 2), 0L, 4, null), z10, hpa.j(hpa.INSTANCE.c()), function0);
                    z2 = z10;
                } else {
                    bVarD = androidx.compose.ui.b.INSTANCE;
                }
                if (function0 != null) {
                    bVarH = InteractiveComponentSizeKt.h(androidx.compose.ui.b.INSTANCE);
                } else {
                    bVarH = androidx.compose.ui.b.INSTANCE;
                }
                androidx.compose.ui.b bVarN6 = nx8.n(bVar5.then(bVarH).then(bVarD), a);
                int i15 = i3 << 6;
                ga1 ga1Var8 = ga1VarA;
                i(z2, toggleableState, bVarN6, ga1Var8, stroke, stroke3, dVarF, ((i3 >> 15) & 14) | ((i3 << 3) & 112) | ((i3 >> 9) & 7168) | (57344 & i15) | (i15 & 458752));
                if (e.k()) {
                    e.n();
                }
                z4 = z2;
                bVar3 = bVar5;
                ga1Var2 = ga1Var8;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                z4 = z2;
                ga1Var2 = ga1VarA;
            }
            r48Var3 = r48Var2;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.ka1
                    public final Object invoke(Object obj, Object obj2) {
                        return na1.m(toggleableState, function0, stroke, stroke2, bVar3, z4, ga1Var2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 196608;
        z2 = z;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                ga1VarA = ga1Var;
                if (dVarF.x(ga1VarA)) {
                }
                i3 |= i9;
            } else {
                ga1VarA = ga1Var;
            }
            i3 |= i9;
        } else {
            ga1VarA = ga1Var;
        }
        i6 = i2 & 128;
        if (i6 != 0) {
            if ((12582912 & i) == 0) {
                r48Var2 = r48Var;
                if (dVarF.x(r48Var2)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i3 |= i7;
            }
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        bVar4 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        ga1VarA = ha1.a.a(dVarF, 6);
                    }
                    if (i6 != 0) {
                        r48Var2 = null;
                    } else {
                        r48Var2 = r48Var2;
                    }
                    bVar5 = bVar4;
                } else {
                    if (i8 != 0) {
                        bVar4 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        ga1VarA = ha1.a.a(dVarF, 6);
                    }
                    if (i6 != 0) {
                        r48Var2 = null;
                    } else {
                        r48Var2 = r48Var2;
                    }
                    bVar5 = bVar4;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-406243761, i3, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:275)");
                }
                if (function0 != null) {
                    boolean z11 = z2;
                    bVarD = c9d.d(androidx.compose.ui.b.INSTANCE, toggleableState, r48Var2, xoa.e(false, ff3.i(oa1.a.d() / 2), 0L, 4, null), z11, hpa.j(hpa.INSTANCE.c()), function0);
                    z2 = z11;
                } else {
                    bVarD = androidx.compose.ui.b.INSTANCE;
                }
                if (function0 != null) {
                    bVarH = InteractiveComponentSizeKt.h(androidx.compose.ui.b.INSTANCE);
                } else {
                    bVarH = androidx.compose.ui.b.INSTANCE;
                }
                androidx.compose.ui.b bVarN7 = nx8.n(bVar5.then(bVarH).then(bVarD), a);
                int i16 = i3 << 6;
                ga1 ga1Var9 = ga1VarA;
                i(z2, toggleableState, bVarN7, ga1Var9, stroke, stroke3, dVarF, ((i3 >> 15) & 14) | ((i3 << 3) & 112) | ((i3 >> 9) & 7168) | (57344 & i16) | (i16 & 458752));
                if (e.k()) {
                    e.n();
                }
                z4 = z2;
                bVar3 = bVar5;
                ga1Var2 = ga1Var9;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                z4 = z2;
                ga1Var2 = ga1VarA;
            }
            r48Var3 = r48Var2;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.ka1
                    public final Object invoke(Object obj, Object obj2) {
                        return na1.m(toggleableState, function0, stroke, stroke2, bVar3, z4, ga1Var2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 12582912;
        r48Var2 = r48Var;
        if ((i3 & 4793491) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (dVarF.g(z3, i3 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    bVar4 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    ga1VarA = ha1.a.a(dVarF, 6);
                }
                if (i6 != 0) {
                    r48Var2 = null;
                } else {
                    r48Var2 = r48Var2;
                }
                bVar5 = bVar4;
            } else {
                if (i8 != 0) {
                    bVar4 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    ga1VarA = ha1.a.a(dVarF, 6);
                }
                if (i6 != 0) {
                    r48Var2 = null;
                } else {
                    r48Var2 = r48Var2;
                }
                bVar5 = bVar4;
            }
            dVarF.M();
            if (e.k()) {
                e.o(-406243761, i3, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:275)");
            }
            if (function0 != null) {
                boolean z12 = z2;
                bVarD = c9d.d(androidx.compose.ui.b.INSTANCE, toggleableState, r48Var2, xoa.e(false, ff3.i(oa1.a.d() / 2), 0L, 4, null), z12, hpa.j(hpa.INSTANCE.c()), function0);
                z2 = z12;
            } else {
                bVarD = androidx.compose.ui.b.INSTANCE;
            }
            if (function0 != null) {
                bVarH = InteractiveComponentSizeKt.h(androidx.compose.ui.b.INSTANCE);
            } else {
                bVarH = androidx.compose.ui.b.INSTANCE;
            }
            androidx.compose.ui.b bVarN8 = nx8.n(bVar5.then(bVarH).then(bVarD), a);
            int i17 = i3 << 6;
            ga1 ga1Var10 = ga1VarA;
            i(z2, toggleableState, bVarN8, ga1Var10, stroke, stroke3, dVarF, ((i3 >> 15) & 14) | ((i3 << 3) & 112) | ((i3 >> 9) & 7168) | (57344 & i17) | (i17 & 458752));
            if (e.k()) {
                e.n();
            }
            z4 = z2;
            bVar3 = bVar5;
            ga1Var2 = ga1Var10;
        } else {
            dVarF.q();
            bVar3 = bVar2;
            z4 = z2;
            ga1Var2 = ga1VarA;
        }
        r48Var3 = r48Var2;
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.ka1
                public final Object invoke(Object obj, Object obj2) {
                    return na1.m(toggleableState, function0, stroke, stroke2, bVar3, z4, ga1Var2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(ToggleableState toggleableState, Function0 function0, Stroke stroke, Stroke stroke2, androidx.compose.ui.b bVar, boolean z, ga1 ga1Var, r48 r48Var, int i, int i2, d dVar, int i3) throws Throwable {
        l(toggleableState, function0, stroke, stroke2, bVar, z, ga1Var, r48Var, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    private static final void n(DrawScope drawScope, long j, long j2, float f, Stroke stroke) {
        float width = stroke.getWidth() / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.d() >> 32));
        if (ei1.r(j, j2)) {
            DrawScope.G2(drawScope, j, 0L, tsb.d((((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), aa2.b((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L)), androidx.compose.ui.graphics.drawscope.c.b, 0.0f, null, 0, 226, null);
            return;
        }
        long jE = rn8.e((((long) Float.floatToRawIntBits(stroke.getWidth())) << 32) | (((long) Float.floatToRawIntBits(stroke.getWidth())) & 4294967295L));
        float f2 = 2;
        long jD = tsb.d((((long) Float.floatToRawIntBits(fIntBitsToFloat - (stroke.getWidth() * f2))) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat - (stroke.getWidth() * f2))) & 4294967295L));
        float fMax = Math.max(0.0f, f - stroke.getWidth());
        DrawScope.G2(drawScope, j, jE, jD, aa2.b((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L)), androidx.compose.ui.graphics.drawscope.c.b, 0.0f, null, 0, 224, null);
        long jE2 = rn8.e((((long) Float.floatToRawIntBits(width)) << 32) | (((long) Float.floatToRawIntBits(width)) & 4294967295L));
        float width2 = fIntBitsToFloat - stroke.getWidth();
        float f3 = f - width;
        DrawScope.G2(drawScope, j2, jE2, tsb.d((((long) Float.floatToRawIntBits(fIntBitsToFloat - stroke.getWidth())) & 4294967295L) | (Float.floatToRawIntBits(width2) << 32)), aa2.b((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L)), stroke, 0.0f, null, 0, 224, null);
    }

    private static final void o(DrawScope drawScope, long j, float f, float f2, Stroke stroke, da1 da1Var) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.d() >> 32));
        float fB = rh7.b(0.4f, 0.5f, f2);
        float fB2 = rh7.b(0.7f, 0.5f, f2);
        float fB3 = rh7.b(0.5f, 0.5f, f2);
        float fB4 = rh7.b(0.3f, 0.5f, f2);
        da1Var.getCheckPath().rewind();
        da1Var.getCheckPath().b(0.2f * fIntBitsToFloat, fB3 * fIntBitsToFloat);
        da1Var.getCheckPath().c(fB * fIntBitsToFloat, fB2 * fIntBitsToFloat);
        da1Var.getCheckPath().c(0.8f * fIntBitsToFloat, fIntBitsToFloat * fB4);
        da1Var.getPathMeasure().b(da1Var.getCheckPath(), false);
        da1Var.getPathToDraw().rewind();
        da1Var.getPathMeasure().a(0.0f, da1Var.getPathMeasure().getLength() * f, da1Var.getPathToDraw(), true);
        DrawScope.g0(drawScope, da1Var.getPathToDraw(), j, 0.0f, stroke, null, 0, 52, null);
    }
}
