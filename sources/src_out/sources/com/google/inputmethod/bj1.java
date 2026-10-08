package com.google.inputmethod;

import androidx.compose.p002material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u001aí\u0003\u00102\u001a\u0002012\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u00002\b\b\u0002\u0010%\u001a\u00020\u00002\b\b\u0002\u0010&\u001a\u00020\u00002\b\b\u0002\u0010'\u001a\u00020\u00002\b\b\u0002\u0010(\u001a\u00020\u00002\b\b\u0002\u0010)\u001a\u00020\u00002\b\b\u0002\u0010*\u001a\u00020\u00002\b\b\u0002\u0010+\u001a\u00020\u00002\b\b\u0002\u0010,\u001a\u00020\u00002\b\b\u0002\u0010-\u001a\u00020\u00002\b\b\u0002\u0010.\u001a\u00020\u00002\b\b\u0002\u0010/\u001a\u00020\u00002\b\b\u0002\u00100\u001a\u00020\u0000¢\u0006\u0004\b2\u00103\u001aí\u0003\u00104\u001a\u0002012\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u00002\b\b\u0002\u0010%\u001a\u00020\u00002\b\b\u0002\u0010&\u001a\u00020\u00002\b\b\u0002\u0010'\u001a\u00020\u00002\b\b\u0002\u0010(\u001a\u00020\u00002\b\b\u0002\u0010)\u001a\u00020\u00002\b\b\u0002\u0010*\u001a\u00020\u00002\b\b\u0002\u0010+\u001a\u00020\u00002\b\b\u0002\u0010,\u001a\u00020\u00002\b\b\u0002\u0010-\u001a\u00020\u00002\b\b\u0002\u0010.\u001a\u00020\u00002\b\b\u0002\u0010/\u001a\u00020\u00002\b\b\u0002\u00100\u001a\u00020\u0000¢\u0006\u0004\b4\u00103\u001a\u001b\u00106\u001a\u00020\u0000*\u0002012\u0006\u00105\u001a\u00020\u0000H\u0007¢\u0006\u0004\b6\u00107\u001a\u0017\u00108\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0000H\u0007¢\u0006\u0004\b8\u00109\u001a\u001b\u0010<\u001a\u00020\u0000*\u0002012\u0006\u0010;\u001a\u00020:H\u0007¢\u0006\u0004\b<\u0010=\u001a\u001b\u0010@\u001a\u00020\u0000*\u0002012\u0006\u0010?\u001a\u00020>H\u0001¢\u0006\u0004\b@\u0010A\u001a#\u0010B\u001a\u00020\u0000*\u0002012\u0006\u00105\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\bB\u0010C\" \u0010I\u001a\b\u0012\u0004\u0012\u0002010D8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020J0D8\u0006¢\u0006\f\n\u0004\bK\u0010F\u001a\u0004\bL\u0010H\"\u0018\u0010?\u001a\u00020\u0000*\u00020>8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006P"}, d2 = {"Lcom/google/android/ei1;", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "surfaceBright", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "surfaceDim", "primaryFixed", "primaryFixedDim", "onPrimaryFixed", "onPrimaryFixedVariant", "secondaryFixed", "secondaryFixedDim", "onSecondaryFixed", "onSecondaryFixedVariant", "tertiaryFixed", "tertiaryFixedDim", "onTertiaryFixed", "onTertiaryFixedVariant", "Lcom/google/android/yi1;", "m", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Lcom/google/android/yi1;", "h", "backgroundColor", "f", "(Lcom/google/android/yi1;J)J", "g", "(JLandroidx/compose/runtime/d;I)J", "Lcom/google/android/ff3;", "elevation", "o", "(Lcom/google/android/yi1;F)J", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "value", "j", "(Lcom/google/android/yi1;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J", "e", "(Lcom/google/android/yi1;JFLandroidx/compose/runtime/d;I)J", "Lcom/google/android/ks9;", "a", "Lcom/google/android/ks9;", "k", "()Lcom/google/android/ks9;", "LocalColorScheme", "", "b", "getLocalTonalElevationEnabled", "LocalTonalElevationEnabled", "l", "(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/d;I)J", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class bj1 {
    private static final ks9<ColorScheme> a = fs1.j(new Function0() { // from class: com.google.android.zi1
        public final Object invoke() {
            return bj1.c();
        }
    });
    private static final ks9<Boolean> b = fs1.j(new Function0() { // from class: com.google.android.aj1
        public final Object invoke() {
            return Boolean.valueOf(bj1.d());
        }
    });

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ColorSchemeKeyTokens.values().length];
            try {
                iArr[ColorSchemeKeyTokens.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ColorSchemeKeyTokens.ErrorContainer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseOnSurface.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InversePrimary.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseSurface.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnBackground.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnErrorContainer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimary.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimaryContainer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondary.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondaryContainer.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurface.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurfaceVariant.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceTint.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiary.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiaryContainer.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Outline.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OutlineVariant.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Primary.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ColorSchemeKeyTokens.PrimaryContainer.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Scrim.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Secondary.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SecondaryContainer.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Surface.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceVariant.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceBright.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainer.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerHigh.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerHighest.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerLow.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerLowest.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceDim.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Tertiary.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[ColorSchemeKeyTokens.TertiaryContainer.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[ColorSchemeKeyTokens.PrimaryFixed.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[ColorSchemeKeyTokens.PrimaryFixedDim.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimaryFixed.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimaryFixedVariant.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SecondaryFixed.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SecondaryFixedDim.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondaryFixed.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondaryFixedVariant.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[ColorSchemeKeyTokens.TertiaryFixed.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[ColorSchemeKeyTokens.TertiaryFixedDim.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiaryFixed.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiaryFixedVariant.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ColorScheme c() {
        return n(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d() {
        return true;
    }

    public static final long e(ColorScheme yi1Var, long j, float f, d dVar, int i) {
        if (e.k()) {
            e.o(-1610977682, i, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:1539)");
        }
        boolean zBooleanValue = ((Boolean) dVar.v(b)).booleanValue();
        if (ei1.r(j, yi1Var.getSurface()) && zBooleanValue) {
            j = o(yi1Var, f);
        }
        if (e.k()) {
            e.n();
        }
        return j;
    }

    public static final long f(ColorScheme yi1Var, long j) {
        if (ei1.r(j, yi1Var.getPrimary())) {
            return yi1Var.getOnPrimary();
        }
        if (ei1.r(j, yi1Var.getSecondary())) {
            return yi1Var.getOnSecondary();
        }
        if (ei1.r(j, yi1Var.getTertiary())) {
            return yi1Var.getOnTertiary();
        }
        if (ei1.r(j, yi1Var.getBackground())) {
            return yi1Var.getOnBackground();
        }
        if (ei1.r(j, yi1Var.getError())) {
            return yi1Var.getOnError();
        }
        if (ei1.r(j, yi1Var.getPrimaryContainer())) {
            return yi1Var.getOnPrimaryFixed();
        }
        if (ei1.r(j, yi1Var.getSecondaryContainer())) {
            return yi1Var.getOnSecondaryContainer();
        }
        if (ei1.r(j, yi1Var.getTertiaryContainer())) {
            return yi1Var.getOnTertiaryContainer();
        }
        if (ei1.r(j, yi1Var.getErrorContainer())) {
            return yi1Var.getOnErrorContainer();
        }
        if (ei1.r(j, yi1Var.getInverseSurface())) {
            return yi1Var.getInverseOnSurface();
        }
        if (ei1.r(j, yi1Var.getSurface())) {
            return yi1Var.getOnSurface();
        }
        if (ei1.r(j, yi1Var.getSurfaceVariant())) {
            return yi1Var.getOnSurfaceVariant();
        }
        if (!ei1.r(j, yi1Var.getSurfaceBright()) && !ei1.r(j, yi1Var.getSurfaceContainer()) && !ei1.r(j, yi1Var.getSurfaceContainerHigh()) && !ei1.r(j, yi1Var.getSurfaceContainerHighest()) && !ei1.r(j, yi1Var.getSurfaceContainerLow()) && !ei1.r(j, yi1Var.getSurfaceContainerLowest()) && !ei1.r(j, yi1Var.getSurfaceDim())) {
            if (!ei1.r(j, yi1Var.getPrimaryFixed()) && !ei1.r(j, yi1Var.getPrimaryFixedDim())) {
                if (!ei1.r(j, yi1Var.getSecondaryFixed()) && !ei1.r(j, yi1Var.getSecondaryFixedDim())) {
                    if (!ei1.r(j, yi1Var.getTertiaryFixed()) && !ei1.r(j, yi1Var.getTertiaryFixedDim())) {
                        return ei1.INSTANCE.i();
                    }
                    return yi1Var.getOnTertiaryFixed();
                }
                return yi1Var.getOnSecondaryFixed();
            }
            return yi1Var.getOnPrimaryFixed();
        }
        return yi1Var.getOnSurface();
    }

    public static final long g(long j, d dVar, int i) {
        if (e.k()) {
            e.o(509589638, i, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:1112)");
        }
        dVar.y(89374938);
        long jF = f(kh7.a.a(dVar, 6), j);
        if (jF == 16) {
            jF = ((ei1) dVar.v(cz1.a())).getValue();
        }
        dVar.u();
        if (e.k()) {
            e.n();
        }
        return jF;
    }

    public static final ColorScheme h(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48) {
        return new ColorScheme(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j36, j31, j32, j33, j34, j35, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, null);
    }

    public static /* synthetic */ ColorScheme i(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, int i, int i2, Object obj) {
        long jZ = (i & 1) != 0 ? fi1.a.z() : j;
        long j49 = (i & 2) != 0 ? fi1.a.j() : j2;
        long jA = (i & 4) != 0 ? fi1.a.A() : j3;
        long jK = (i & 8) != 0 ? fi1.a.k() : j4;
        long jE = (i & 16) != 0 ? fi1.a.e() : j5;
        long jE2 = (i & 32) != 0 ? fi1.a.E() : j6;
        long jN = (i & 64) != 0 ? fi1.a.n() : j7;
        long j50 = jZ;
        long jF = (i & 128) != 0 ? fi1.a.F() : j8;
        long jO = (i & 256) != 0 ? fi1.a.o() : j9;
        long jR = (i & 512) != 0 ? fi1.a.R() : j10;
        long jT = (i & 1024) != 0 ? fi1.a.t() : j11;
        long jS = (i & 2048) != 0 ? fi1.a.S() : j12;
        long jU = (i & 4096) != 0 ? fi1.a.u() : j13;
        long jA2 = (i & 8192) != 0 ? fi1.a.a() : j14;
        long jG = (i & 16384) != 0 ? fi1.a.g() : j15;
        long jI = (i & 32768) != 0 ? fi1.a.I() : j16;
        long jR2 = (i & 65536) != 0 ? fi1.a.r() : j17;
        long jQ = (i & 131072) != 0 ? fi1.a.Q() : j18;
        long jS2 = (i & 262144) != 0 ? fi1.a.s() : j19;
        long j51 = (i & 524288) != 0 ? j50 : j20;
        long jF2 = (i & 1048576) != 0 ? fi1.a.f() : j21;
        long jD = (i & 2097152) != 0 ? fi1.a.d() : j22;
        long jB = (i & 4194304) != 0 ? fi1.a.b() : j23;
        long jH = (i & 8388608) != 0 ? fi1.a.h() : j24;
        long jC = (i & 16777216) != 0 ? fi1.a.c() : j25;
        long jI2 = (i & 33554432) != 0 ? fi1.a.i() : j26;
        long jX = (i & 67108864) != 0 ? fi1.a.x() : j27;
        long jY = (i & 134217728) != 0 ? fi1.a.y() : j28;
        long jD2 = (i & 268435456) != 0 ? fi1.a.D() : j29;
        long J = (i & 536870912) != 0 ? fi1.a.J() : j30;
        long jK2 = (i & 1073741824) != 0 ? fi1.a.K() : j31;
        long jL = (i & t04.INVALID_ID) != 0 ? fi1.a.L() : j32;
        long jM = (i2 & 1) != 0 ? fi1.a.M() : j33;
        long jN2 = (i2 & 2) != 0 ? fi1.a.N() : j34;
        long jO2 = (i2 & 4) != 0 ? fi1.a.O() : j35;
        long jP = (i2 & 8) != 0 ? fi1.a.P() : j36;
        long jB2 = (i2 & 16) != 0 ? fi1.a.B() : j37;
        long jC2 = (i2 & 32) != 0 ? fi1.a.C() : j38;
        long jL2 = (i2 & 64) != 0 ? fi1.a.l() : j39;
        long jM2 = (i2 & 128) != 0 ? fi1.a.m() : j40;
        long jG2 = (i2 & 256) != 0 ? fi1.a.G() : j41;
        long jH2 = (i2 & 512) != 0 ? fi1.a.H() : j42;
        long jP2 = (i2 & 1024) != 0 ? fi1.a.p() : j43;
        long jQ2 = (i2 & 2048) != 0 ? fi1.a.q() : j44;
        long jT2 = (i2 & 4096) != 0 ? fi1.a.T() : j45;
        long jU2 = (i2 & 8192) != 0 ? fi1.a.U() : j46;
        long jV = (i2 & 16384) != 0 ? fi1.a.v() : j47;
        if ((i2 & 32768) != 0) {
            j48 = fi1.a.w();
        }
        return h(j50, j49, jA, jK, jE, jE2, jN, jF, jO, jR, jT, jS, jU, jA2, jG, jI, jR2, jQ, jS2, j51, jF2, jD, jB, jH, jC, jI2, jX, jY, jD2, J, jK2, jL, jM, jN2, jO2, jP, jB2, jC2, jL2, jM2, jG2, jH2, jP2, jQ2, jT2, jU2, jV, j48);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final long j(ColorScheme yi1Var, ColorSchemeKeyTokens colorSchemeKeyTokens) throws NoWhenBranchMatchedException {
        switch (a.$EnumSwitchMapping$0[colorSchemeKeyTokens.ordinal()]) {
            case 1:
                return yi1Var.getBackground();
            case 2:
                return yi1Var.getError();
            case 3:
                return yi1Var.getErrorContainer();
            case 4:
                return yi1Var.getInverseOnSurface();
            case 5:
                return yi1Var.getInversePrimary();
            case 6:
                return yi1Var.getInverseSurface();
            case 7:
                return yi1Var.getOnBackground();
            case 8:
                return yi1Var.getOnError();
            case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                return yi1Var.getOnErrorContainer();
            case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                return yi1Var.getOnPrimary();
            case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return yi1Var.getOnPrimaryFixed();
            case 12:
                return yi1Var.getOnSecondary();
            case 13:
                return yi1Var.getOnSecondaryContainer();
            case 14:
                return yi1Var.getOnSurface();
            case 15:
                return yi1Var.getOnSurfaceVariant();
            case 16:
                return yi1Var.getSurfaceTint();
            case 17:
                return yi1Var.getOnTertiary();
            case 18:
                return yi1Var.getOnTertiaryContainer();
            case 19:
                return yi1Var.getOutline();
            case 20:
                return yi1Var.getOutlineVariant();
            case 21:
                return yi1Var.getPrimary();
            case 22:
                return yi1Var.getPrimaryContainer();
            case 23:
                return yi1Var.getScrim();
            case 24:
                return yi1Var.getSecondary();
            case 25:
                return yi1Var.getSecondaryContainer();
            case 26:
                return yi1Var.getSurface();
            case 27:
                return yi1Var.getSurfaceVariant();
            case 28:
                return yi1Var.getSurfaceBright();
            case 29:
                return yi1Var.getSurfaceContainer();
            case 30:
                return yi1Var.getSurfaceContainerHigh();
            case 31:
                return yi1Var.getSurfaceContainerHighest();
            case 32:
                return yi1Var.getSurfaceContainerLow();
            case 33:
                return yi1Var.getSurfaceContainerLowest();
            case 34:
                return yi1Var.getSurfaceDim();
            case 35:
                return yi1Var.getTertiary();
            case 36:
                return yi1Var.getTertiaryContainer();
            case 37:
                return yi1Var.getPrimaryFixed();
            case 38:
                return yi1Var.getPrimaryFixedDim();
            case 39:
                return yi1Var.getOnPrimaryFixed();
            case 40:
                return yi1Var.getOnPrimaryFixedVariant();
            case 41:
                return yi1Var.getSecondaryFixed();
            case 42:
                return yi1Var.getSecondaryFixedDim();
            case 43:
                return yi1Var.getOnSecondaryFixed();
            case 44:
                return yi1Var.getOnSecondaryFixedVariant();
            case 45:
                return yi1Var.getTertiaryFixed();
            case 46:
                return yi1Var.getTertiaryFixedDim();
            case 47:
                return yi1Var.getOnTertiaryFixed();
            case 48:
                return yi1Var.getOnTertiaryFixedVariant();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final ks9<ColorScheme> k() {
        return a;
    }

    public static final long l(ColorSchemeKeyTokens colorSchemeKeyTokens, d dVar, int i) {
        if (e.k()) {
            e.o(-810780884, i, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:1524)");
        }
        long j = j(kh7.a.a(dVar, 6), colorSchemeKeyTokens);
        if (e.k()) {
            e.n();
        }
        return j;
    }

    public static final ColorScheme m(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48) {
        return new ColorScheme(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j36, j31, j32, j33, j34, j35, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, null);
    }

    public static /* synthetic */ ColorScheme n(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, int i, int i2, Object obj) {
        long jZ = (i & 1) != 0 ? li1.a.z() : j;
        long j49 = (i & 2) != 0 ? li1.a.j() : j2;
        long jA = (i & 4) != 0 ? li1.a.A() : j3;
        long jK = (i & 8) != 0 ? li1.a.k() : j4;
        long jE = (i & 16) != 0 ? li1.a.e() : j5;
        long jE2 = (i & 32) != 0 ? li1.a.E() : j6;
        long jN = (i & 64) != 0 ? li1.a.n() : j7;
        long j50 = jZ;
        long jF = (i & 128) != 0 ? li1.a.F() : j8;
        long jO = (i & 256) != 0 ? li1.a.o() : j9;
        long jR = (i & 512) != 0 ? li1.a.R() : j10;
        long jT = (i & 1024) != 0 ? li1.a.t() : j11;
        long jS = (i & 2048) != 0 ? li1.a.S() : j12;
        long jU = (i & 4096) != 0 ? li1.a.u() : j13;
        long jA2 = (i & 8192) != 0 ? li1.a.a() : j14;
        long jG = (i & 16384) != 0 ? li1.a.g() : j15;
        long jI = (i & 32768) != 0 ? li1.a.I() : j16;
        long jR2 = (i & 65536) != 0 ? li1.a.r() : j17;
        long jQ = (i & 131072) != 0 ? li1.a.Q() : j18;
        long jS2 = (i & 262144) != 0 ? li1.a.s() : j19;
        long j51 = (i & 524288) != 0 ? j50 : j20;
        long jF2 = (i & 1048576) != 0 ? li1.a.f() : j21;
        long jD = (i & 2097152) != 0 ? li1.a.d() : j22;
        long jB = (i & 4194304) != 0 ? li1.a.b() : j23;
        long jH = (i & 8388608) != 0 ? li1.a.h() : j24;
        long jC = (i & 16777216) != 0 ? li1.a.c() : j25;
        long jI2 = (i & 33554432) != 0 ? li1.a.i() : j26;
        long jX = (i & 67108864) != 0 ? li1.a.x() : j27;
        long jY = (i & 134217728) != 0 ? li1.a.y() : j28;
        long jD2 = (i & 268435456) != 0 ? li1.a.D() : j29;
        long J = (i & 536870912) != 0 ? li1.a.J() : j30;
        long jK2 = (i & 1073741824) != 0 ? li1.a.K() : j31;
        long jL = (i & t04.INVALID_ID) != 0 ? li1.a.L() : j32;
        long jM = (i2 & 1) != 0 ? li1.a.M() : j33;
        long jN2 = (i2 & 2) != 0 ? li1.a.N() : j34;
        long jO2 = (i2 & 4) != 0 ? li1.a.O() : j35;
        long jP = (i2 & 8) != 0 ? li1.a.P() : j36;
        long jB2 = (i2 & 16) != 0 ? li1.a.B() : j37;
        long jC2 = (i2 & 32) != 0 ? li1.a.C() : j38;
        long jL2 = (i2 & 64) != 0 ? li1.a.l() : j39;
        long jM2 = (i2 & 128) != 0 ? li1.a.m() : j40;
        long jG2 = (i2 & 256) != 0 ? li1.a.G() : j41;
        long jH2 = (i2 & 512) != 0 ? li1.a.H() : j42;
        long jP2 = (i2 & 1024) != 0 ? li1.a.p() : j43;
        long jQ2 = (i2 & 2048) != 0 ? li1.a.q() : j44;
        long jT2 = (i2 & 4096) != 0 ? li1.a.T() : j45;
        long jU2 = (i2 & 8192) != 0 ? li1.a.U() : j46;
        long jV = (i2 & 16384) != 0 ? li1.a.v() : j47;
        if ((i2 & 32768) != 0) {
            j48 = li1.a.w();
        }
        return m(j50, j49, jA, jK, jE, jE2, jN, jF, jO, jR, jT, jS, jU, jA2, jG, jI, jR2, jQ, jS2, j51, jF2, jD, jB, jH, jC, jI2, jX, jY, jD2, J, jK2, jL, jM, jN2, jO2, jP, jB2, jC2, jL2, jM2, jG2, jH2, jP2, jQ2, jT2, jU2, jV, j48);
    }

    public static final long o(ColorScheme yi1Var, float f) {
        if (ff3.k(f, ff3.i(0))) {
            return yi1Var.getSurface();
        }
        return ki1.g(ei1.p(yi1Var.getSurfaceTint(), ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), yi1Var.getSurface());
    }
}
