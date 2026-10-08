package com.google.inputmethod;

import android.graphics.PointF;
import androidx.compose.ui.text.g;
import androidx.compose.ui.text.x;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\b\u001a\u0013\u0010\n\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\b\u001a\u0013\u0010\u000b\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010\u0017\u001a\u00020\u0000*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001b\u001a\u00020\u0000*\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001b\u0010\u001e\u001a\u00020\u0000*\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a#\u0010#\u001a\u00020\u0005*\u00020\u00102\u0006\u0010 \u001a\u00020\r2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$\u001a\u001b\u0010&\u001a\u00020\u0006*\u00020%2\u0006\u0010\u001d\u001a\u00020\u0005H\u0002¢\u0006\u0004\b&\u0010'\u001a7\u0010+\u001a\u00020\u0000*\u0004\u0018\u00010(2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b+\u0010,\u001a/\u0010-\u001a\u00020\u0005*\u00020(2\u0006\u0010 \u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b-\u0010.\u001a9\u00101\u001a\u00020\u0000*\u0004\u0018\u00010%2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b1\u00102\u001a%\u00104\u001a\u00020\u0005*\u00020(2\u0006\u00103\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b4\u00105\u001a#\u00109\u001a\u0002072\u0012\u00108\u001a\n\u0012\u0006\b\u0001\u0012\u00020706\"\u000207H\u0002¢\u0006\u0004\b9\u0010:\u001a\u001f\u0010=\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u0000H\u0002¢\u0006\u0004\b=\u0010>¨\u0006?"}, d2 = {"Landroidx/compose/ui/text/x;", "", "text", "j", "(JLjava/lang/CharSequence;)J", "", "", "u", "(I)Z", "w", "x", "v", "Landroid/graphics/PointF;", "Lcom/google/android/rn8;", "z", "(Landroid/graphics/PointF;)J", "Lcom/google/android/k07;", "Lcom/google/android/gba;", "rectInScreen", "Lcom/google/android/jwc;", "granularity", "Lcom/google/android/nwc;", "inclusionStrategy", "r", "(Lcom/google/android/k07;Lcom/google/android/gba;ILcom/google/android/nwc;)J", "startRectInScreen", "endRectInScreen", "s", "(Lcom/google/android/k07;Lcom/google/android/gba;Lcom/google/android/gba;ILcom/google/android/nwc;)J", "offset", "y", "(Ljava/lang/CharSequence;I)J", "pointInScreen", "Lcom/google/android/p7e;", "viewConfiguration", "n", "(Lcom/google/android/k07;JLcom/google/android/p7e;)I", "Lcom/google/android/vxc;", "t", "(Lcom/google/android/vxc;I)Z", "Landroidx/compose/ui/text/g;", "Lcom/google/android/kn6;", "layoutCoordinates", "q", "(Landroidx/compose/ui/text/g;Lcom/google/android/gba;Lcom/google/android/kn6;ILcom/google/android/nwc;)J", "o", "(Landroidx/compose/ui/text/g;JLcom/google/android/kn6;Lcom/google/android/p7e;)I", "startPointInScreen", "endPointerInScreen", "p", "(Lcom/google/android/vxc;JJLcom/google/android/kn6;Lcom/google/android/p7e;)J", "localPoint", "m", "(Landroidx/compose/ui/text/g;JLcom/google/android/p7e;)I", "", "Lcom/google/android/cn3;", "editCommands", "k", "([Lcom/google/android/cn3;)Lcom/google/android/cn3;", "a", "b", "l", "(JJ)J", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b65 {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/google/android/b65$a", "Lcom/google/android/cn3;", "Lcom/google/android/gn3;", "buffer", "", "a", "(Lcom/google/android/gn3;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements cn3 {
        final /* synthetic */ cn3[] a;

        a(cn3[] cn3VarArr) {
            this.a = cn3VarArr;
        }

        @Override // com.google.inputmethod.cn3
        public void a(gn3 buffer) {
            for (cn3 cn3Var : this.a) {
                cn3Var.a(buffer);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(long j, CharSequence charSequence) {
        int iN = x.n(j);
        int i = x.i(j);
        int iCodePointBefore = iN > 0 ? Character.codePointBefore(charSequence, iN) : 10;
        int iCodePointAt = i < charSequence.length() ? Character.codePointAt(charSequence, i) : 10;
        if (x(iCodePointBefore) && (w(iCodePointAt) || v(iCodePointAt))) {
            do {
                iN -= Character.charCount(iCodePointBefore);
                if (iN == 0) {
                    break;
                }
                iCodePointBefore = Character.codePointBefore(charSequence, iN);
            } while (x(iCodePointBefore));
            return zyc.b(iN, i);
        }
        if (!x(iCodePointAt)) {
            return j;
        }
        if (!w(iCodePointBefore) && !v(iCodePointBefore)) {
            return j;
        }
        do {
            i += Character.charCount(iCodePointAt);
            if (i == charSequence.length()) {
                break;
            }
            iCodePointAt = Character.codePointAt(charSequence, i);
        } while (x(iCodePointAt));
        return zyc.b(iN, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cn3 k(cn3... cn3VarArr) {
        return new a(cn3VarArr);
    }

    private static final long l(long j, long j2) {
        return zyc.b(Math.min(x.n(j), x.n(j)), Math.max(x.i(j2), x.i(j2)));
    }

    private static final int m(g gVar, long j, p7e p7eVar) {
        float fD = p7eVar != null ? p7eVar.d() : 0.0f;
        int i = (int) (4294967295L & j);
        int iT = gVar.t(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) >= gVar.y(iT) - fD && Float.intBitsToFloat(i) <= gVar.o(iT) + fD) {
            int i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) >= (-fD) && Float.intBitsToFloat(i2) <= gVar.getWidth() + fD) {
                return iT;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n(k07 k07Var, long j, p7e p7eVar) {
        TextLayoutResult value;
        g multiParagraph;
        wxc wxcVarN = k07Var.n();
        if (wxcVarN == null || (value = wxcVarN.getValue()) == null || (multiParagraph = value.getMultiParagraph()) == null) {
            return -1;
        }
        return o(multiParagraph, j, k07Var.m(), p7eVar);
    }

    private static final int o(g gVar, long j, kn6 kn6Var, p7e p7eVar) {
        long jI;
        int iM;
        if (kn6Var == null || (iM = m(gVar, (jI = kn6Var.i(j)), p7eVar)) == -1) {
            return -1;
        }
        return gVar.A(rn8.g(jI, 0.0f, (gVar.y(iM) + gVar.o(iM)) / 2.0f, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long p(TextLayoutResult textLayoutResult, long j, long j2, kn6 kn6Var, p7e p7eVar) {
        if (textLayoutResult == null || kn6Var == null) {
            return x.INSTANCE.a();
        }
        long jI = kn6Var.i(j);
        long jI2 = kn6Var.i(j2);
        int iM = m(textLayoutResult.getMultiParagraph(), jI, p7eVar);
        int iM2 = m(textLayoutResult.getMultiParagraph(), jI2, p7eVar);
        if (iM != -1) {
            if (iM2 != -1) {
                iM = Math.min(iM, iM2);
            }
            iM2 = iM;
        } else if (iM2 == -1) {
            return x.INSTANCE.a();
        }
        float fV = (textLayoutResult.v(iM2) + textLayoutResult.m(iM2)) / 2;
        int i = (int) (jI >> 32);
        int i2 = (int) (jI2 >> 32);
        return textLayoutResult.getMultiParagraph().G(new gba(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), fV - 0.1f, Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), fV + 0.1f), jwc.INSTANCE.a(), nwc.INSTANCE.g());
    }

    private static final long q(g gVar, gba gbaVar, kn6 kn6Var, int i, nwc nwcVar) {
        return (gVar == null || kn6Var == null) ? x.INSTANCE.a() : gVar.G(gbaVar.u(kn6Var.i(rn8.INSTANCE.c())), i, nwcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long r(k07 k07Var, gba gbaVar, int i, nwc nwcVar) {
        TextLayoutResult value;
        wxc wxcVarN = k07Var.n();
        return q((wxcVarN == null || (value = wxcVarN.getValue()) == null) ? null : value.getMultiParagraph(), gbaVar, k07Var.m(), i, nwcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long s(k07 k07Var, gba gbaVar, gba gbaVar2, int i, nwc nwcVar) {
        long jR = r(k07Var, gbaVar, i, nwcVar);
        if (x.h(jR)) {
            return x.INSTANCE.a();
        }
        long jR2 = r(k07Var, gbaVar2, i, nwcVar);
        return x.h(jR2) ? x.INSTANCE.a() : l(jR, jR2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(TextLayoutResult textLayoutResult, int i) {
        int iQ = textLayoutResult.q(i);
        if (i == textLayoutResult.u(iQ) || i == TextLayoutResult.p(textLayoutResult, iQ, false, 2, null)) {
            return textLayoutResult.y(i) != textLayoutResult.c(i);
        }
        return textLayoutResult.c(i) != textLayoutResult.c(i - 1);
    }

    private static final boolean u(int i) {
        int type = Character.getType(i);
        return type == 14 || type == 13 || i == 10;
    }

    private static final boolean v(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    private static final boolean w(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    private static final boolean x(int i) {
        return w(i) && !u(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long y(CharSequence charSequence, int i) {
        int iCharCount = i;
        while (iCharCount > 0) {
            int iC = lh1.c(charSequence, iCharCount);
            if (!w(iC)) {
                break;
            }
            iCharCount -= Character.charCount(iC);
        }
        while (i < charSequence.length()) {
            int iB = lh1.b(charSequence, i);
            if (!w(iB)) {
                break;
            }
            i += lh1.a(iB);
        }
        return zyc.b(iCharCount, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long z(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return rn8.e((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
    }
}
