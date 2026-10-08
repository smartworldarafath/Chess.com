package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.colorspace.Rgb;
import com.google.inputmethod.TransferParameters;
import com.google.inputmethod.WhitePoint;
import com.google.inputmethod.gl5;
import com.google.inputmethod.ki1;
import com.google.inputmethod.we3;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 a2\u00020\u0001:\u0001.B]\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B1\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0016BA\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0019B!\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0000\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"J'\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0010¢\u0006\u0004\b'\u0010(J'\u0010)\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0010¢\u0006\u0004\b)\u0010*J7\u00100\u001a\u00020/2\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0001H\u0010¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u0010\"J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103H\u0096\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0011H\u0016¢\u0006\u0004\b8\u00109R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010=R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010=R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010D\u001a\u0004\bG\u0010FR\u001a\u0010J\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bH\u0010D\u001a\u0004\bI\u0010FR\u001a\u0010M\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010K\u001a\u0004\b=\u0010LR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170N8\u0006¢\u0006\f\n\u0004\b)\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010S\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010K\u001a\u0004\bR\u0010LR\u001a\u0010V\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u0010K\u001a\u0004\bU\u0010LR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170N8\u0006¢\u0006\f\n\u0004\bW\u0010O\u001a\u0004\b-\u0010QR\u001a\u0010Z\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010K\u001a\u0004\bY\u0010LR\u001a\u0010]\u001a\u0002058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u001a\u0010`\u001a\u0002058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010\\\u001a\u0004\bC\u0010^¨\u0006b"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb;", "Landroidx/compose/ui/graphics/colorspace/c;", "", "name", "", "primaries", "Lcom/google/android/dhe;", "whitePoint", "transform", "Lcom/google/android/we3;", "oetf", "eotf", "", "min", "max", "Lcom/google/android/sdd;", "transferParameters", "", "id", "<init>", "(Ljava/lang/String;[FLcom/google/android/dhe;[FLcom/google/android/we3;Lcom/google/android/we3;FFLcom/google/android/sdd;I)V", "function", "(Ljava/lang/String;[FLcom/google/android/dhe;Lcom/google/android/sdd;I)V", "", "gamma", "(Ljava/lang/String;[FLcom/google/android/dhe;DFFI)V", "colorSpace", "(Landroidx/compose/ui/graphics/colorspace/Rgb;[FLcom/google/android/dhe;)V", "component", "f", "(I)F", "e", "v", "l", "([F)[F", "v0", "v1", "v2", "", "j", "(FFF)J", "m", "(FFF)F", "x", "y", "z", "a", "Lcom/google/android/ei1;", "n", "(FFFFLandroidx/compose/ui/graphics/colorspace/c;)J", "b", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lcom/google/android/dhe;", "J", "()Lcom/google/android/dhe;", "F", "g", "h", "Lcom/google/android/sdd;", "H", "()Lcom/google/android/sdd;", "i", "[F", "G", "()[F", "I", "k", "C", "inverseTransform", "Lcom/google/android/we3;", "()Lcom/google/android/we3;", "oetfOrig", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "D", "()Lkotlin/jvm/functions/Function1;", "E", "oetfFunc", "o", "B", "eotfOrig", "p", "q", "A", "eotfFunc", "r", "Z", "isWideGamut", "()Z", "s", "isSrgb", "t", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Rgb extends c {

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int u = 8;
    private static final we3 v = new we3() { // from class: com.google.android.wna
        @Override // com.google.inputmethod.we3
        public final double a(double d) {
            return Rgb.t(d);
        }
    };

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final WhitePoint whitePoint;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float min;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final float max;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TransferParameters transferParameters;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final float[] primaries;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final float[] transform;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final float[] inverseTransform;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final we3 oetfOrig;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Function1<Double, Double> oetf;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final we3 oetfFunc;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final we3 eotfOrig;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final Function1<Double, Double> eotf;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final we3 eotfFunc;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final boolean isWideGamut;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final boolean isSrgb;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.Rgb$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb$a;", "", "<init>", "()V", "", "primaries", "Lcom/google/android/dhe;", "whitePoint", "Lcom/google/android/we3;", "OETF", "EOTF", "", "min", "max", "", "id", "", "C", "([FLcom/google/android/dhe;Lcom/google/android/we3;Lcom/google/android/we3;FFI)Z", "", "point", "a", "b", "p", "(DLcom/google/android/we3;Lcom/google/android/we3;)Z", "D", "([FFF)Z", "o", "([F)F", "p1", "p2", "r", "([F[F)Z", "E", "([F)[F", "q", "([FLcom/google/android/dhe;)[F", "Lcom/google/android/sdd;", "function", "x", "(Lcom/google/android/sdd;)Lcom/google/android/we3;", "s", "DoubleIdentity", "Lcom/google/android/we3;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double A(TransferParameters transferParameters, double d) {
            return d.o(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double B(TransferParameters transferParameters, double d) {
            return d.p(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean C(float[] primaries, WhitePoint whitePoint, we3 OETF, we3 EOTF, float min, float max, int id) {
            if (id == 0) {
                return true;
            }
            e eVar = e.a;
            if (!d.g(primaries, eVar.H()) || !d.f(whitePoint, gl5.a.e()) || min != 0.0f || max != 1.0f) {
                return false;
            }
            Rgb rgbG = eVar.G();
            for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                if (!p(d, OETF, rgbG.getOetfOrig()) || !p(d, EOTF, rgbG.getEotfOrig())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean D(float[] primaries, float min, float max) {
            float fO = o(primaries);
            e eVar = e.a;
            if (fO / o(eVar.C()) <= 0.9f || !r(primaries, eVar.H())) {
                return min < 0.0f && max > 1.0f;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] E(float[] primaries) {
            float[] fArr = new float[6];
            if (primaries.length != 9) {
                kotlin.collections.f.p(primaries, fArr, 0, 0, 6, 6, (Object) null);
                return fArr;
            }
            float f = primaries[0];
            float f2 = primaries[1];
            float f3 = f + f2 + primaries[2];
            fArr[0] = f / f3;
            fArr[1] = f2 / f3;
            float f4 = primaries[3];
            float f5 = primaries[4];
            float f6 = f4 + f5 + primaries[5];
            fArr[2] = f4 / f6;
            fArr[3] = f5 / f6;
            float f7 = primaries[6];
            float f8 = primaries[7];
            float f9 = f7 + f8 + primaries[8];
            fArr[4] = f7 / f9;
            fArr[5] = f8 / f9;
            return fArr;
        }

        private final float o(float[] primaries) {
            if (primaries.length < 6) {
                return 0.0f;
            }
            float f = primaries[0];
            float f2 = primaries[1];
            float f3 = primaries[2];
            float f4 = primaries[3];
            float f5 = primaries[4];
            float f6 = primaries[5];
            float f7 = ((((((f * f4) + (f2 * f5)) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            return f7 < 0.0f ? -f7 : f7;
        }

        private final boolean p(double point, we3 a, we3 b) {
            return Math.abs(a.a(point) - b.a(point)) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] q(float[] primaries, WhitePoint whitePoint) {
            float f = primaries[0];
            float f2 = primaries[1];
            float f3 = primaries[2];
            float f4 = primaries[3];
            float f5 = primaries[4];
            float f6 = primaries[5];
            float x = whitePoint.getX();
            float y = whitePoint.getY();
            float f7 = 1;
            float f8 = (f7 - f) / f2;
            float f9 = (f7 - f3) / f4;
            float f10 = (f7 - f5) / f6;
            float f11 = (f7 - x) / y;
            float f12 = f / f2;
            float f13 = (f3 / f4) - f12;
            float f14 = (x / y) - f12;
            float f15 = f9 - f8;
            float f16 = (f5 / f6) - f12;
            float f17 = (((f11 - f8) * f13) - (f14 * f15)) / (((f10 - f8) * f13) - (f15 * f16));
            float f18 = (f14 - (f16 * f17)) / f13;
            float f19 = (1.0f - f18) - f17;
            float f20 = f19 / f2;
            float f21 = f18 / f4;
            float f22 = f17 / f6;
            return new float[]{f20 * f, f19, f20 * ((1.0f - f) - f2), f21 * f3, f18, f21 * ((1.0f - f3) - f4), f22 * f5, f17, f22 * ((1.0f - f5) - f6)};
        }

        private final boolean r(float[] p1, float[] p2) {
            float f = p1[0];
            float f2 = p2[0];
            float f3 = p1[1];
            float f4 = p2[1];
            float f5 = p1[2];
            float f6 = p2[2];
            float f7 = p1[3];
            float f8 = p2[3];
            float f9 = p1[4];
            float f10 = p2[4];
            float f11 = p1[5];
            float f12 = p2[5];
            float[] fArr = {f - f2, f3 - f4, f5 - f6, f7 - f8, f9 - f10, f11 - f12};
            float f13 = fArr[0];
            float f14 = fArr[1];
            if (((f4 - f12) * f13) - ((f2 - f10) * f14) >= 0.0f && ((f2 - f6) * f14) - ((f4 - f8) * f13) >= 0.0f) {
                float f15 = fArr[2];
                float f16 = fArr[3];
                if (((f8 - f4) * f15) - ((f6 - f2) * f16) >= 0.0f && ((f6 - f10) * f16) - ((f8 - f12) * f15) >= 0.0f) {
                    float f17 = fArr[4];
                    float f18 = fArr[5];
                    if (((f12 - f8) * f17) - ((f10 - f6) * f18) >= 0.0f && ((f10 - f2) * f18) - ((f12 - f4) * f17) >= 0.0f) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final we3 s(final TransferParameters function) {
            if (function.h()) {
                return new we3() { // from class: com.google.android.zna
                    @Override // com.google.inputmethod.we3
                    public final double a(double d) {
                        return Rgb.Companion.t(function, d);
                    }
                };
            }
            if (function.i()) {
                return new we3() { // from class: com.google.android.aoa
                    @Override // com.google.inputmethod.we3
                    public final double a(double d) {
                        return Rgb.Companion.u(function, d);
                    }
                };
            }
            return (function.getE() == 0.0d && function.getF() == 0.0d) ? new we3() { // from class: com.google.android.boa
                @Override // com.google.inputmethod.we3
                public final double a(double d) {
                    return Rgb.Companion.v(function, d);
                }
            } : new we3() { // from class: com.google.android.coa
                @Override // com.google.inputmethod.we3
                public final double a(double d) {
                    return Rgb.Companion.w(function, d);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double t(TransferParameters transferParameters, double d) {
            return e.a.J(transferParameters, d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double u(TransferParameters transferParameters, double d) {
            return e.a.L(transferParameters, d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double v(TransferParameters transferParameters, double d) {
            return d.q(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double w(TransferParameters transferParameters, double d) {
            return d.r(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final we3 x(final TransferParameters function) {
            if (function.h()) {
                return new we3() { // from class: com.google.android.doa
                    @Override // com.google.inputmethod.we3
                    public final double a(double d) {
                        return Rgb.Companion.y(function, d);
                    }
                };
            }
            if (function.i()) {
                return new we3() { // from class: com.google.android.eoa
                    @Override // com.google.inputmethod.we3
                    public final double a(double d) {
                        return Rgb.Companion.z(function, d);
                    }
                };
            }
            return (function.getE() == 0.0d && function.getF() == 0.0d) ? new we3() { // from class: com.google.android.foa
                @Override // com.google.inputmethod.we3
                public final double a(double d) {
                    return Rgb.Companion.A(function, d);
                }
            } : new we3() { // from class: com.google.android.goa
                @Override // com.google.inputmethod.we3
                public final double a(double d) {
                    return Rgb.Companion.B(function, d);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double y(TransferParameters transferParameters, double d) {
            return e.a.K(transferParameters, d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double z(TransferParameters transferParameters, double d) {
            return e.a.M(transferParameters, d);
        }

        private Companion() {
        }
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, float[] fArr2, we3 we3Var, we3 we3Var2, float f, float f2, TransferParameters transferParameters, int i) {
        super(str, b.INSTANCE.b(), i, null);
        this.whitePoint = whitePoint;
        this.min = f;
        this.max = f2;
        this.transferParameters = transferParameters;
        this.oetfOrig = we3Var;
        this.oetf = new Function1<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            {
                super(1);
            }

            public final Double a(double d) {
                return Double.valueOf(kotlin.ranges.g.m(this.this$0.getOetfOrig().a(d), this.this$0.min, this.this$0.max));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).doubleValue());
            }
        };
        this.oetfFunc = new we3() { // from class: com.google.android.una
            @Override // com.google.inputmethod.we3
            public final double a(double d) {
                return Rgb.K(this.a, d);
            }
        };
        this.eotfOrig = we3Var2;
        this.eotf = new Function1<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            {
                super(1);
            }

            public final Double a(double d) {
                return Double.valueOf(this.this$0.getEotfOrig().a(kotlin.ranges.g.m(d, this.this$0.min, this.this$0.max)));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).doubleValue());
            }
        };
        this.eotfFunc = new we3() { // from class: com.google.android.vna
            @Override // com.google.inputmethod.we3
            public final double a(double d) {
                return Rgb.y(this.a, d);
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f >= f2) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
        Companion companion = INSTANCE;
        float[] fArrE = companion.E(fArr);
        this.primaries = fArrE;
        if (fArr2 == null) {
            this.transform = companion.q(fArrE, whitePoint);
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.transform = fArr2;
        }
        this.inverseTransform = d.k(this.transform);
        this.isWideGamut = companion.D(fArrE, f, f2);
        this.isSrgb = companion.C(fArrE, whitePoint, we3Var, we3Var2, f, f2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double K(Rgb rgb, double d) {
        return kotlin.ranges.g.m(rgb.oetfOrig.a(d), rgb.min, rgb.max);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double t(double d) {
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double u(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, 1.0d / d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double v(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double y(Rgb rgb, double d) {
        return rgb.eotfOrig.a(kotlin.ranges.g.m(d, rgb.min, rgb.max));
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final we3 getEotfFunc() {
        return this.eotfFunc;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final we3 getEotfOrig() {
        return this.eotfOrig;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final float[] getInverseTransform() {
        return this.inverseTransform;
    }

    public final Function1<Double, Double> D() {
        return this.oetf;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final we3 getOetfFunc() {
        return this.oetfFunc;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final we3 getOetfOrig() {
        return this.oetfOrig;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final float[] getPrimaries() {
        return this.primaries;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final float[] getTransform() {
        return this.transform;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float[] b(float[] v2) {
        d.n(this.inverseTransform, v2);
        if (v2.length < 3) {
            return v2;
        }
        v2[0] = (float) this.oetfFunc.a(v2[0]);
        v2[1] = (float) this.oetfFunc.a(v2[1]);
        v2[2] = (float) this.oetfFunc.a(v2[2]);
        return v2;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float e(int component) {
        return this.max;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || Rgb.class != other.getClass() || !super.equals(other)) {
            return false;
        }
        Rgb rgb = (Rgb) other;
        if (Float.compare(rgb.min, this.min) != 0 || Float.compare(rgb.max, this.max) != 0 || !Intrinsics.e(this.whitePoint, rgb.whitePoint) || !Arrays.equals(this.primaries, rgb.primaries)) {
            return false;
        }
        TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            return Intrinsics.e(transferParameters, rgb.transferParameters);
        }
        if (rgb.transferParameters == null) {
            return true;
        }
        if (Intrinsics.e(this.oetfOrig, rgb.oetfOrig)) {
            return Intrinsics.e(this.eotfOrig, rgb.eotfOrig);
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float f(int component) {
        return this.min;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 31) + this.whitePoint.hashCode()) * 31) + Arrays.hashCode(this.primaries)) * 31;
        float f = this.min;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.max;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        TransferParameters transferParameters = this.transferParameters;
        int iHashCode2 = iFloatToIntBits2 + (transferParameters != null ? transferParameters.hashCode() : 0);
        return this.transferParameters == null ? (((iHashCode2 * 31) + this.oetfOrig.hashCode()) * 31) + this.eotfOrig.hashCode() : iHashCode2;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    /* JADX INFO: renamed from: i, reason: from getter */
    public boolean getIsSrgb() {
        return this.isSrgb;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public long j(float v0, float v1, float v2) {
        float fA = (float) this.eotfFunc.a(v0);
        float fA2 = (float) this.eotfFunc.a(v1);
        float fA3 = (float) this.eotfFunc.a(v2);
        float[] fArr = this.transform;
        if (fArr.length < 9) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits(((fArr[0] * fA) + (fArr[3] * fA2)) + (fArr[6] * fA3))) << 32) | (((long) Float.floatToRawIntBits((fArr[1] * fA) + (fArr[4] * fA2) + (fArr[7] * fA3))) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float[] l(float[] v2) {
        if (v2.length < 3) {
            return v2;
        }
        v2[0] = (float) this.eotfFunc.a(v2[0]);
        v2[1] = (float) this.eotfFunc.a(v2[1]);
        v2[2] = (float) this.eotfFunc.a(v2[2]);
        return d.n(this.transform, v2);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float m(float v0, float v1, float v2) {
        float fA = (float) this.eotfFunc.a(v0);
        float fA2 = (float) this.eotfFunc.a(v1);
        float fA3 = (float) this.eotfFunc.a(v2);
        float[] fArr = this.transform;
        return (fArr[2] * fA) + (fArr[5] * fA2) + (fArr[8] * fA3);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public long n(float x, float y, float z, float a, c colorSpace) {
        float[] fArr = this.inverseTransform;
        return ki1.a((float) this.oetfFunc.a((fArr[0] * x) + (fArr[3] * y) + (fArr[6] * z)), (float) this.oetfFunc.a((fArr[1] * x) + (fArr[4] * y) + (fArr[7] * z)), (float) this.oetfFunc.a((fArr[2] * x) + (fArr[5] * y) + (fArr[8] * z)), a, colorSpace);
    }

    public final Function1<Double, Double> z() {
        return this.eotf;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, TransferParameters transferParameters, int i) {
        Companion companion = INSTANCE;
        this(str, fArr, whitePoint, null, companion.x(transferParameters), companion.s(transferParameters), 0.0f, 1.0f, transferParameters, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, final double d, float f, float f2, int i) {
        we3 we3Var;
        we3 we3Var2;
        if (d == 1.0d) {
            we3Var = v;
        } else {
            we3Var = new we3() { // from class: com.google.android.xna
                @Override // com.google.inputmethod.we3
                public final double a(double d2) {
                    return Rgb.u(d, d2);
                }
            };
        }
        we3 we3Var3 = we3Var;
        if (d == 1.0d) {
            we3Var2 = v;
        } else {
            we3Var2 = new we3() { // from class: com.google.android.yna
                @Override // com.google.inputmethod.we3
                public final double a(double d2) {
                    return Rgb.v(d, d2);
                }
            };
        }
        this(str, fArr, whitePoint, null, we3Var3, we3Var2, f, f2, new TransferParameters(d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i);
    }

    public Rgb(Rgb rgb, float[] fArr, WhitePoint whitePoint) {
        this(rgb.getName(), rgb.primaries, whitePoint, fArr, rgb.oetfOrig, rgb.eotfOrig, rgb.min, rgb.max, rgb.transferParameters, -1);
    }
}
