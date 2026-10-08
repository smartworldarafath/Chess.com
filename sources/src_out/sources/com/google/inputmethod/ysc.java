package com.google.inputmethod;

import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.l;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.text.h;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a;\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u001a\u0010\u001a\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/text/y;", "style", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/text/font/l$b;", "fontFamilyResolver", "", "text", "", "maxLines", "Lcom/google/android/q16;", "a", "(Landroidx/compose/ui/text/y;Lcom/google/android/f43;Landroidx/compose/ui/text/font/l$b;Ljava/lang/String;I)J", "Lcom/google/android/vxc;", "layoutResult", "Lcom/google/android/kn6;", "layoutCoordinates", "focusOffset", "Lkotlin/Function0;", "sizeForDefaultText", "Lcom/google/android/gba;", "c", "(Lcom/google/android/vxc;Lcom/google/android/kn6;ILkotlin/jvm/functions/Function0;)Lcom/google/android/gba;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "EmptyTextReplacement", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ysc {
    private static final String a = h.P("H", 10);

    public static final long a(TextStyle textStyle, f43 f43Var, l.b bVar, String str, int i) {
        b19 b19VarA = androidx.compose.ui.text.l.a(str, textStyle, nx1.b(0, 0, 0, 0, 15, null), f43Var, bVar, (64 & 32) != 0 ? m.p() : m.p(), (64 & 64) != 0 ? m.p() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : i, (64 & 256) != 0 ? uyc.INSTANCE.a() : uyc.INSTANCE.a());
        return q16.c((((long) csc.a(b19VarA.a())) << 32) | (((long) csc.a(b19VarA.getHeight())) & 4294967295L));
    }

    public static /* synthetic */ long b(TextStyle textStyle, f43 f43Var, l.b bVar, String str, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str = a;
        }
        if ((i2 & 16) != 0) {
            i = 1;
        }
        return a(textStyle, f43Var, bVar, str, i);
    }

    public static final gba c(TextLayoutResult textLayoutResult, kn6 kn6Var, int i, Function0<q16> function0) {
        gba gbaVarD;
        if (i < textLayoutResult.getLayoutInput().getText().length()) {
            gbaVarD = textLayoutResult.d(i);
        } else {
            gbaVarD = i != 0 ? textLayoutResult.d(i - 1) : new gba(0.0f, 0.0f, 1.0f, (int) (((q16) function0.invoke()).getPackedValue() & 4294967295L));
        }
        long jN = kn6Var.N(rn8.e((((long) Float.floatToRawIntBits(gbaVarD.getTop())) & 4294967295L) | (((long) Float.floatToRawIntBits(gbaVarD.getLeft())) << 32)));
        return kba.c(rn8.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jN >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jN & 4294967295L)))) & 4294967295L)), tsb.d((((long) Float.floatToRawIntBits(gbaVarD.getBottom() - gbaVarD.getTop())) & 4294967295L) | (((long) Float.floatToRawIntBits(gbaVarD.getRight() - gbaVarD.getLeft())) << 32)));
    }

    public static final String d() {
        return a;
    }
}
