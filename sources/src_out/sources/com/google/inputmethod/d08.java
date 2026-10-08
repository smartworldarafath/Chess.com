package com.google.inputmethod;

import androidx.compose.p002material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"T", "Lcom/google/android/c08;", "Landroidx/compose/material3/tokens/MotionSchemeKeyTokens;", "value", "Lcom/google/android/xa4;", "a", "(Lcom/google/android/c08;Landroidx/compose/material3/tokens/MotionSchemeKeyTokens;)Lcom/google/android/xa4;", "b", "(Landroidx/compose/material3/tokens/MotionSchemeKeyTokens;Landroidx/compose/runtime/d;I)Lcom/google/android/xa4;", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class d08 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MotionSchemeKeyTokens.values().length];
            try {
                iArr[MotionSchemeKeyTokens.DefaultSpatial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MotionSchemeKeyTokens.FastSpatial.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MotionSchemeKeyTokens.SlowSpatial.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MotionSchemeKeyTokens.DefaultEffects.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MotionSchemeKeyTokens.FastEffects.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MotionSchemeKeyTokens.SlowEffects.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final <T> xa4<T> a(c08 c08Var, MotionSchemeKeyTokens motionSchemeKeyTokens) throws NoWhenBranchMatchedException {
        switch (a.$EnumSwitchMapping$0[motionSchemeKeyTokens.ordinal()]) {
            case 1:
                return c08Var.e();
            case 2:
                return c08Var.a();
            case 3:
                return c08Var.b();
            case 4:
                return c08Var.f();
            case 5:
                return c08Var.d();
            case 6:
                return c08Var.c();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final <T> xa4<T> b(MotionSchemeKeyTokens motionSchemeKeyTokens, d dVar, int i) {
        if (e.k()) {
            e.o(-19828261, i, -1, "androidx.compose.material3.value (MotionScheme.kt:288)");
        }
        xa4<T> xa4VarA = a(kh7.a.c(dVar, 6), motionSchemeKeyTokens);
        if (e.k()) {
            e.n();
        }
        return xa4VarA;
    }
}
