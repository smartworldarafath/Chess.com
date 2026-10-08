package com.google.inputmethod;

import androidx.compose.p002material3.tokens.TypographyKeyTokens;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\" \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/google/android/vod;", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "value", "Landroidx/compose/ui/text/y;", "c", "(Lcom/google/android/vod;Landroidx/compose/material3/tokens/TypographyKeyTokens;)Landroidx/compose/ui/text/y;", "Lcom/google/android/ks9;", "a", "Lcom/google/android/ks9;", "d", "()Lcom/google/android/ks9;", "LocalTypography", "e", "(Landroidx/compose/material3/tokens/TypographyKeyTokens;Landroidx/compose/runtime/d;I)Landroidx/compose/ui/text/y;", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class xod {
    private static final ks9<Typography> a = fs1.j(new Function0() { // from class: com.google.android.wod
        public final Object invoke() {
            return xod.b();
        }
    });

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TypographyKeyTokens.values().length];
            try {
                iArr[TypographyKeyTokens.DisplayLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TypographyKeyTokens.DisplayMedium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TypographyKeyTokens.DisplaySmall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TypographyKeyTokens.HeadlineLarge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TypographyKeyTokens.HeadlineMedium.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TypographyKeyTokens.HeadlineSmall.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TypographyKeyTokens.TitleLarge.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TypographyKeyTokens.TitleMedium.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TypographyKeyTokens.TitleSmall.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TypographyKeyTokens.BodyLarge.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TypographyKeyTokens.BodyMedium.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[TypographyKeyTokens.BodySmall.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[TypographyKeyTokens.LabelLarge.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[TypographyKeyTokens.LabelMedium.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[TypographyKeyTokens.LabelSmall.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[TypographyKeyTokens.DisplayLargeEmphasized.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[TypographyKeyTokens.DisplayMediumEmphasized.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[TypographyKeyTokens.DisplaySmallEmphasized.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[TypographyKeyTokens.HeadlineLargeEmphasized.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[TypographyKeyTokens.HeadlineMediumEmphasized.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[TypographyKeyTokens.HeadlineSmallEmphasized.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[TypographyKeyTokens.TitleLargeEmphasized.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[TypographyKeyTokens.TitleMediumEmphasized.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[TypographyKeyTokens.TitleSmallEmphasized.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[TypographyKeyTokens.BodyLargeEmphasized.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[TypographyKeyTokens.BodyMediumEmphasized.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[TypographyKeyTokens.BodySmallEmphasized.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[TypographyKeyTokens.LabelLargeEmphasized.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[TypographyKeyTokens.LabelMediumEmphasized.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[TypographyKeyTokens.LabelSmallEmphasized.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typography b() {
        return new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final TextStyle c(Typography typography, TypographyKeyTokens typographyKeyTokens) throws NoWhenBranchMatchedException {
        switch (a.$EnumSwitchMapping$0[typographyKeyTokens.ordinal()]) {
            case 1:
                return typography.getDisplayLarge();
            case 2:
                return typography.getDisplayMedium();
            case 3:
                return typography.getDisplaySmall();
            case 4:
                return typography.getHeadlineLarge();
            case 5:
                return typography.getHeadlineMedium();
            case 6:
                return typography.getHeadlineSmall();
            case 7:
                return typography.getTitleLarge();
            case 8:
                return typography.getTitleMedium();
            case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                return typography.getTitleSmall();
            case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                return typography.getBodyLarge();
            case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return typography.getBodyMedium();
            case 12:
                return typography.getBodySmall();
            case 13:
                return typography.getLabelLarge();
            case 14:
                return typography.getLabelMedium();
            case 15:
                return typography.getLabelSmall();
            case 16:
                return typography.getDisplayLargeEmphasized();
            case 17:
                return typography.getDisplayMediumEmphasized();
            case 18:
                return typography.getDisplaySmallEmphasized();
            case 19:
                return typography.getHeadlineLargeEmphasized();
            case 20:
                return typography.getHeadlineMediumEmphasized();
            case 21:
                return typography.getHeadlineSmallEmphasized();
            case 22:
                return typography.getTitleLargeEmphasized();
            case 23:
                return typography.getTitleMediumEmphasized();
            case 24:
                return typography.getTitleSmallEmphasized();
            case 25:
                return typography.getBodyLargeEmphasized();
            case 26:
                return typography.getBodyMediumEmphasized();
            case 27:
                return typography.getBodySmallEmphasized();
            case 28:
                return typography.getLabelLargeEmphasized();
            case 29:
                return typography.getLabelMediumEmphasized();
            case 30:
                return typography.getLabelSmallEmphasized();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final ks9<Typography> d() {
        return a;
    }

    public static final TextStyle e(TypographyKeyTokens typographyKeyTokens, d dVar, int i) {
        if (e.k()) {
            e.o(-1049072145, i, -1, "androidx.compose.material3.<get-value> (Typography.kt:524)");
        }
        TextStyle textStyleC = c(kh7.a.e(dVar, 6), typographyKeyTokens);
        if (e.k()) {
            e.n();
        }
        return textStyleC;
    }
}
