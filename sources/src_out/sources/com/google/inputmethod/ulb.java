package com.google.inputmethod;

import androidx.compose.p002material3.tokens.ShapeKeyTokens;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.graphics.r;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001d\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u001d\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\u0004\u001a\u001d\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u0004\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\" \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0018\u0010\r\u001a\u00020\u000e*\u00020\f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/google/android/z92;", "Lcom/google/android/ea2;", "bottomSize", "l", "(Lcom/google/android/z92;Lcom/google/android/ea2;)Lcom/google/android/z92;", "topSize", "c", "endSize", "j", "startSize", "e", "Lcom/google/android/slb;", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "value", "Lcom/google/android/xkb;", "g", "(Lcom/google/android/slb;Landroidx/compose/material3/tokens/ShapeKeyTokens;)Lcom/google/android/xkb;", "Lcom/google/android/ks9;", "a", "Lcom/google/android/ks9;", "h", "()Lcom/google/android/ks9;", "LocalShapes", "i", "(Landroidx/compose/material3/tokens/ShapeKeyTokens;Landroidx/compose/runtime/d;I)Lcom/google/android/xkb;", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ulb {
    private static final ks9<Shapes> a = fs1.j(new Function0() { // from class: com.google.android.tlb
        public final Object invoke() {
            return ulb.b();
        }
    });

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShapeKeyTokens.values().length];
            try {
                iArr[ShapeKeyTokens.CornerExtraLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShapeKeyTokens.CornerExtraLargeIncreased.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShapeKeyTokens.CornerExtraExtraLarge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShapeKeyTokens.CornerExtraLargeTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ShapeKeyTokens.CornerExtraSmall.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ShapeKeyTokens.CornerExtraSmallTop.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ShapeKeyTokens.CornerFull.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ShapeKeyTokens.CornerLarge.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ShapeKeyTokens.CornerLargeIncreased.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ShapeKeyTokens.CornerLargeEnd.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ShapeKeyTokens.CornerLargeTop.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ShapeKeyTokens.CornerMedium.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ShapeKeyTokens.CornerNone.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ShapeKeyTokens.CornerSmall.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ShapeKeyTokens.CornerLargeStart.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shapes b() {
        return new Shapes(null, null, null, null, null, 31, null);
    }

    public static final z92 c(z92 z92Var, ea2 ea2Var) {
        return z92.b(z92Var, ea2Var, ea2Var, null, null, 12, null);
    }

    public static /* synthetic */ z92 d(z92 z92Var, ea2 ea2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ea2Var = elb.a.a();
        }
        return c(z92Var, ea2Var);
    }

    public static final z92 e(z92 z92Var, ea2 ea2Var) {
        return z92.b(z92Var, ea2Var, null, null, ea2Var, 6, null);
    }

    public static /* synthetic */ z92 f(z92 z92Var, ea2 ea2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ea2Var = elb.a.a();
        }
        return e(z92Var, ea2Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final xkb g(Shapes shapes, ShapeKeyTokens shapeKeyTokens) throws NoWhenBranchMatchedException {
        switch (a.$EnumSwitchMapping$0[shapeKeyTokens.ordinal()]) {
            case 1:
                return shapes.getExtraLarge();
            case 2:
                return shapes.getExtralargeIncreased();
            case 3:
                return shapes.getExtraExtraLarge();
            case 4:
                return m(shapes.getExtraLarge(), null, 1, null);
            case 5:
                return shapes.getExtraSmall();
            case 6:
                return m(shapes.getExtraSmall(), null, 1, null);
            case 7:
                return lqa.g();
            case 8:
                return shapes.getLarge();
            case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                return shapes.getLargeIncreased();
            case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                return f(shapes.getLarge(), null, 1, null);
            case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return m(shapes.getLarge(), null, 1, null);
            case 12:
                return shapes.getMedium();
            case 13:
                return r.a();
            case 14:
                return shapes.getSmall();
            case 15:
                return k(shapes.getLarge(), null, 1, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final ks9<Shapes> h() {
        return a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final xkb i(ShapeKeyTokens shapeKeyTokens, d dVar, int i) throws NoWhenBranchMatchedException {
        if (e.k()) {
            e.o(1629172543, i, -1, "androidx.compose.material3.<get-value> (Shapes.kt:358)");
        }
        xkb xkbVarG = g(kh7.a.d(dVar, 6), shapeKeyTokens);
        if (e.k()) {
            e.n();
        }
        return xkbVarG;
    }

    public static final z92 j(z92 z92Var, ea2 ea2Var) {
        return z92.b(z92Var, null, ea2Var, ea2Var, null, 9, null);
    }

    public static /* synthetic */ z92 k(z92 z92Var, ea2 ea2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ea2Var = elb.a.a();
        }
        return j(z92Var, ea2Var);
    }

    public static final z92 l(z92 z92Var, ea2 ea2Var) {
        return z92.b(z92Var, null, null, ea2Var, ea2Var, 3, null);
    }

    public static /* synthetic */ z92 m(z92 z92Var, ea2 ea2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ea2Var = elb.a.a();
        }
        return l(z92Var, ea2Var);
    }
}
