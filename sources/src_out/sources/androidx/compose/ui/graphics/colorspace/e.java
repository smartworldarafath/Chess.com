package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.colorspace.e;
import com.google.inputmethod.TransferParameters;
import com.google.inputmethod.WhitePoint;
import com.google.inputmethod.gl5;
import com.google.inputmethod.we3;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\tR\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u001e\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u001a\u0010#\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u001a\u0010&\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010/\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+R\u0017\u00102\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u0010+R\u0017\u00105\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b4\u0010+R\u0017\u00108\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b6\u0010)\u001a\u0004\b7\u0010+R\u0017\u0010;\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b9\u0010)\u001a\u0004\b:\u0010+R\u0017\u0010>\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b<\u0010)\u001a\u0004\b=\u0010+R\u0017\u0010?\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b:\u0010)\u001a\u0004\b\u0007\u0010+R\u0017\u0010B\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b@\u0010)\u001a\u0004\bA\u0010+R\u0017\u0010E\u001a\u00020'8\u0006¢\u0006\f\n\u0004\bC\u0010)\u001a\u0004\bD\u0010+R\u0017\u0010F\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b7\u0010)\u001a\u0004\b<\u0010+R\u0017\u0010I\u001a\u00020'8\u0006¢\u0006\f\n\u0004\bG\u0010)\u001a\u0004\bH\u0010+R\u0017\u0010K\u001a\u00020'8\u0006¢\u0006\f\n\u0004\bJ\u0010)\u001a\u0004\b6\u0010+R\u0017\u0010M\u001a\u00020'8\u0006¢\u0006\f\n\u0004\bL\u0010)\u001a\u0004\b9\u0010+R\u0017\u0010Q\u001a\u00020N8\u0006¢\u0006\f\n\u0004\b=\u0010O\u001a\u0004\bJ\u0010PR\u0017\u0010R\u001a\u00020N8\u0006¢\u0006\f\n\u0004\b\u0007\u0010O\u001a\u0004\bG\u0010PR\u001a\u0010T\u001a\u00020'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010)\u001a\u0004\bS\u0010+R\u0017\u0010U\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\b@\u0010+R\u0017\u0010V\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\bC\u0010+R\u0017\u0010X\u001a\u00020N8\u0006¢\u0006\f\n\u0004\bA\u0010O\u001a\u0004\bW\u0010PR \u0010\\\u001a\b\u0012\u0004\u0012\u00020N0Y8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010Z\u001a\u0004\bL\u0010[¨\u0006]"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/e;", "", "<init>", "()V", "Lcom/google/android/sdd;", "params", "", "x", "K", "(Lcom/google/android/sdd;D)D", "J", "M", "pq", "L", "", "b", "[F", "H", "()[F", "SrgbPrimaries", "c", "C", "Ntsc1953Primaries", "d", "getBt2020Primaries$ui_graphics", "Bt2020Primaries", "e", "Lcom/google/android/sdd;", "getSrgbTransferParameters$ui_graphics", "()Lcom/google/android/sdd;", "SrgbTransferParameters", "f", "NoneTransferParameters", "g", "getBt2020HlgTransferParameters$ui_graphics", "Bt2020HlgTransferParameters", "h", "getBt2020PqTransferParameters$ui_graphics", "Bt2020PqTransferParameters", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "i", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "G", "()Landroidx/compose/ui/graphics/colorspace/Rgb;", "Srgb", "j", "A", "LinearSrgb", "k", "y", "ExtendedSrgb", "l", "z", "LinearExtendedSrgb", "m", "s", "Bt709", "n", "p", "Bt2020", "o", "w", "DciP3", "DisplayP3", "q", "B", "Ntsc1953", "r", "F", "SmpteC", "AdobeRgb", "t", "E", "ProPhotoRgb", "u", "Aces", "v", "Acescg", "Landroidx/compose/ui/graphics/colorspace/c;", "Landroidx/compose/ui/graphics/colorspace/c;", "()Landroidx/compose/ui/graphics/colorspace/c;", "CieXyz", "CieLab", "I", "Unspecified", "Bt2020Hlg", "Bt2020Pq", "D", "Oklab", "", "[Landroidx/compose/ui/graphics/colorspace/c;", "()[Landroidx/compose/ui/graphics/colorspace/c;", "ColorSpacesArray", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private static final Rgb Bt2020Pq;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private static final c Oklab;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private static final c[] ColorSpacesArray;
    public static final int D;
    public static final e a = new e();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final float[] SrgbPrimaries;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final float[] Ntsc1953Primaries;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final float[] Bt2020Primaries;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final TransferParameters SrgbTransferParameters;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final TransferParameters NoneTransferParameters;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final TransferParameters Bt2020HlgTransferParameters;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final TransferParameters Bt2020PqTransferParameters;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final Rgb Srgb;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final Rgb LinearSrgb;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static final Rgb ExtendedSrgb;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static final Rgb LinearExtendedSrgb;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private static final Rgb Bt709;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private static final Rgb Bt2020;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private static final Rgb DciP3;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private static final Rgb DisplayP3;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private static final Rgb Ntsc1953;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private static final Rgb SmpteC;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private static final Rgb AdobeRgb;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private static final Rgb ProPhotoRgb;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private static final Rgb Aces;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private static final Rgb Acescg;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private static final c CieXyz;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private static final c CieLab;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private static final Rgb Unspecified;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private static final Rgb Bt2020Hlg;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        SrgbPrimaries = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        Ntsc1953Primaries = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        Bt2020Primaries = fArr3;
        TransferParameters transferParameters = new TransferParameters(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        SrgbTransferParameters = transferParameters;
        TransferParameters transferParameters2 = new TransferParameters(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        NoneTransferParameters = transferParameters2;
        TransferParameters transferParameters3 = new TransferParameters(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        Bt2020HlgTransferParameters = transferParameters3;
        TransferParameters transferParameters4 = new TransferParameters(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        Bt2020PqTransferParameters = transferParameters4;
        gl5 gl5Var = gl5.a;
        Rgb rgb = new Rgb("sRGB IEC61966-2.1", fArr, gl5Var.e(), transferParameters, 0);
        Srgb = rgb;
        Rgb rgb2 = new Rgb("sRGB IEC61966-2.1 (Linear)", fArr, gl5Var.e(), 1.0d, 0.0f, 1.0f, 1);
        LinearSrgb = rgb2;
        Rgb rgb3 = new Rgb("scRGB-nl IEC 61966-2-2:2003", fArr, gl5Var.e(), null, new we3() { // from class: com.google.android.kj1
            @Override // com.google.inputmethod.we3
            public final double a(double d) {
                return e.k(d);
            }
        }, new we3() { // from class: com.google.android.lj1
            @Override // com.google.inputmethod.we3
            public final double a(double d) {
                return e.l(d);
            }
        }, -0.799f, 2.399f, transferParameters, 2);
        ExtendedSrgb = rgb3;
        Rgb rgb4 = new Rgb("scRGB IEC 61966-2-2:2003", fArr, gl5Var.e(), 1.0d, -0.5f, 7.499f, 3);
        LinearExtendedSrgb = rgb4;
        Rgb rgb5 = new Rgb("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, gl5Var.e(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        Bt709 = rgb5;
        Rgb rgb6 = new Rgb("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, gl5Var.e(), new TransferParameters(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        Bt2020 = rgb6;
        Rgb rgb7 = new Rgb("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new WhitePoint(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        DciP3 = rgb7;
        Rgb rgb8 = new Rgb("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, gl5Var.e(), transferParameters, 7);
        DisplayP3 = rgb8;
        Rgb rgb9 = new Rgb("NTSC (1953)", fArr2, gl5Var.a(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        Ntsc1953 = rgb9;
        Rgb rgb10 = new Rgb("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, gl5Var.e(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        SmpteC = rgb10;
        Rgb rgb11 = new Rgb("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, gl5Var.e(), 2.2d, 0.0f, 1.0f, 10);
        AdobeRgb = rgb11;
        Rgb rgb12 = new Rgb("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, gl5Var.b(), new TransferParameters(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        ProPhotoRgb = rgb12;
        Rgb rgb13 = new Rgb("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, gl5Var.d(), 1.0d, -65504.0f, 65504.0f, 12);
        Aces = rgb13;
        Rgb rgb14 = new Rgb("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, gl5Var.d(), 1.0d, -65504.0f, 65504.0f, 13);
        Acescg = rgb14;
        k kVar = new k("Generic XYZ", 14);
        CieXyz = kVar;
        h hVar = new h("Generic L*a*b*", 15);
        CieLab = hVar;
        Rgb rgb15 = new Rgb("None", fArr, gl5Var.e(), transferParameters2, 16);
        Unspecified = rgb15;
        Rgb rgb16 = new Rgb("Hybrid Log Gamma encoding", fArr3, gl5Var.e(), null, new we3() { // from class: com.google.android.mj1
            @Override // com.google.inputmethod.we3
            public final double a(double d) {
                return e.g(d);
            }
        }, new we3() { // from class: com.google.android.nj1
            @Override // com.google.inputmethod.we3
            public final double a(double d) {
                return e.h(d);
            }
        }, 0.0f, 1.0f, transferParameters3, 17);
        Bt2020Hlg = rgb16;
        Rgb rgb17 = new Rgb("Perceptual Quantizer encoding", fArr3, gl5Var.e(), null, new we3() { // from class: com.google.android.oj1
            @Override // com.google.inputmethod.we3
            public final double a(double d) {
                return e.i(d);
            }
        }, new we3() { // from class: com.google.android.pj1
            @Override // com.google.inputmethod.we3
            public final double a(double d) {
                return e.j(d);
            }
        }, 0.0f, 1.0f, transferParameters4, 18);
        Bt2020Pq = rgb17;
        i iVar = new i("Oklab", 19);
        Oklab = iVar;
        ColorSpacesArray = new c[]{rgb, rgb2, rgb3, rgb4, rgb5, rgb6, rgb7, rgb8, rgb9, rgb10, rgb11, rgb12, rgb13, rgb14, kVar, hVar, rgb15, rgb16, rgb17, iVar};
        D = 8;
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double g(double d) {
        return a.K(Bt2020HlgTransferParameters, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double h(double d) {
        return a.J(Bt2020HlgTransferParameters, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double i(double d) {
        return a.M(Bt2020PqTransferParameters, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double j(double d) {
        return a.L(Bt2020PqTransferParameters, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double k(double d) {
        return d.a(d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double l(double d) {
        return d.b(d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    public final Rgb A() {
        return LinearSrgb;
    }

    public final Rgb B() {
        return Ntsc1953;
    }

    public final float[] C() {
        return Ntsc1953Primaries;
    }

    public final c D() {
        return Oklab;
    }

    public final Rgb E() {
        return ProPhotoRgb;
    }

    public final Rgb F() {
        return SmpteC;
    }

    public final Rgb G() {
        return Srgb;
    }

    public final float[] H() {
        return SrgbPrimaries;
    }

    public final Rgb I() {
        return Unspecified;
    }

    public final double J(TransferParameters params, double x) {
        double d = x < 0.0d ? -1.0d : 1.0d;
        double d2 = x * d;
        double a2 = params.getA();
        double b = params.getB();
        double c = params.getC();
        double d3 = params.getD();
        double e = params.getE();
        double d4 = a2 * d2;
        return (params.getF() + 1.0d) * d * (d4 <= 1.0d ? Math.pow(d4, b) : Math.exp((d2 - e) * c) + d3);
    }

    public final double K(TransferParameters params, double x) {
        double d = x < 0.0d ? -1.0d : 1.0d;
        double a2 = 1.0d / params.getA();
        double b = 1.0d / params.getB();
        double c = 1.0d / params.getC();
        double d2 = params.getD();
        double e = params.getE();
        double f = (x * d) / (params.getF() + 1.0d);
        return d * (f <= 1.0d ? a2 * Math.pow(f, b) : (c * Math.log(f - d2)) + e);
    }

    public final double L(TransferParameters pq, double x) {
        double d = x < 0.0d ? -1.0d : 1.0d;
        double d2 = x * d;
        return d * Math.pow(kotlin.ranges.g.c(pq.getA() + (pq.getB() * Math.pow(d2, pq.getC())), 0.0d) / (pq.getD() + (pq.getE() * Math.pow(d2, pq.getC()))), pq.getF());
    }

    public final double M(TransferParameters params, double x) {
        double d = x < 0.0d ? -1.0d : 1.0d;
        double d2 = x * d;
        double d3 = -params.getA();
        double d4 = params.getD();
        double f = 1.0d / params.getF();
        return d * Math.pow(Math.max(d3 + (d4 * Math.pow(d2, f)), 0.0d) / (params.getB() + ((-params.getE()) * Math.pow(d2, f))), 1.0d / params.getC());
    }

    public final Rgb m() {
        return Aces;
    }

    public final Rgb n() {
        return Acescg;
    }

    public final Rgb o() {
        return AdobeRgb;
    }

    public final Rgb p() {
        return Bt2020;
    }

    public final Rgb q() {
        return Bt2020Hlg;
    }

    public final Rgb r() {
        return Bt2020Pq;
    }

    public final Rgb s() {
        return Bt709;
    }

    public final c t() {
        return CieLab;
    }

    public final c u() {
        return CieXyz;
    }

    public final c[] v() {
        return ColorSpacesArray;
    }

    public final Rgb w() {
        return DciP3;
    }

    public final Rgb x() {
        return DisplayP3;
    }

    public final Rgb y() {
        return ExtendedSrgb;
    }

    public final Rgb z() {
        return LinearExtendedSrgb;
    }
}
