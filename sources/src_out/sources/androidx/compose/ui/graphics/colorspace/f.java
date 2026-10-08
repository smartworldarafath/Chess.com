package androidx.compose.ui.graphics.colorspace;

import com.google.inputmethod.WhitePoint;
import com.google.inputmethod.ei1;
import com.google.inputmethod.gl5;
import com.google.inputmethod.ki1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0017\u0018\u0000  2\u00020\u0001:\u0002\u0016\u0011B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/f;", "", "Landroidx/compose/ui/graphics/colorspace/c;", "source", "destination", "transformSource", "transformDestination", "Landroidx/compose/ui/graphics/colorspace/j;", "renderIntent", "", "transform", "<init>", "(Landroidx/compose/ui/graphics/colorspace/c;Landroidx/compose/ui/graphics/colorspace/c;Landroidx/compose/ui/graphics/colorspace/c;Landroidx/compose/ui/graphics/colorspace/c;I[FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "intent", "(Landroidx/compose/ui/graphics/colorspace/c;Landroidx/compose/ui/graphics/colorspace/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/ei1;", "color", "a", "(J)J", "Landroidx/compose/ui/graphics/colorspace/c;", "getSource", "()Landroidx/compose/ui/graphics/colorspace/c;", "b", "getDestination", "c", "d", "e", "I", "getRenderIntent-uksYyKA", "()I", "f", "[F", "g", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class f {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int h = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final c source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final c destination;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final c transformSource;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final c transformDestination;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int renderIntent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float[] transform;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/f$a;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/colorspace/c;", "source", "destination", "Landroidx/compose/ui/graphics/colorspace/j;", "intent", "", "b", "(Landroidx/compose/ui/graphics/colorspace/c;Landroidx/compose/ui/graphics/colorspace/c;I)[F", "Landroidx/compose/ui/graphics/colorspace/f;", "c", "(Landroidx/compose/ui/graphics/colorspace/c;)Landroidx/compose/ui/graphics/colorspace/f;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.f$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/compose/ui/graphics/colorspace/f$a$a", "Landroidx/compose/ui/graphics/colorspace/f;", "Lcom/google/android/ei1;", "color", "a", "(J)J", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C0054a extends f {
            C0054a(c cVar, int i) {
                super(cVar, cVar, i, null);
            }

            @Override // androidx.compose.ui.graphics.colorspace.f
            public long a(long color) {
                return color;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] b(c source, c destination, int intent) {
            if (!j.e(intent, j.INSTANCE.a())) {
                return null;
            }
            long model = source.getModel();
            androidx.compose.ui.graphics.colorspace.b.Companion companion = androidx.compose.ui.graphics.colorspace.b.INSTANCE;
            boolean zE = androidx.compose.ui.graphics.colorspace.b.e(model, companion.b());
            boolean zE2 = androidx.compose.ui.graphics.colorspace.b.e(destination.getModel(), companion.b());
            if (zE && zE2) {
                return null;
            }
            if (!zE && !zE2) {
                return null;
            }
            if (!zE) {
                source = destination;
            }
            Intrinsics.h(source, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Rgb rgb = (Rgb) source;
            float[] fArrC = zE ? rgb.getWhitePoint().c() : gl5.a.c();
            float[] fArrC2 = zE2 ? rgb.getWhitePoint().c() : gl5.a.c();
            return new float[]{fArrC[0] / fArrC2[0], fArrC[1] / fArrC2[1], fArrC[2] / fArrC2[2]};
        }

        public final f c(c source) {
            return new C0054a(source, j.INSTANCE.c());
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/f$b;", "Landroidx/compose/ui/graphics/colorspace/f;", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "mSource", "mDestination", "Landroidx/compose/ui/graphics/colorspace/j;", "intent", "<init>", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "source", "destination", "", "b", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;I)[F", "Lcom/google/android/ei1;", "color", "a", "(J)J", "i", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "j", "k", "[F", "mTransform", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends f {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final Rgb mSource;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final Rgb mDestination;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final float[] mTransform;

        public /* synthetic */ b(Rgb rgb, Rgb rgb2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(rgb, rgb2, i);
        }

        private final float[] b(Rgb source, Rgb destination, int intent) {
            if (d.f(source.getWhitePoint(), destination.getWhitePoint())) {
                return d.l(destination.getInverseTransform(), source.getTransform());
            }
            float[] transform = source.getTransform();
            float[] inverseTransform = destination.getInverseTransform();
            float[] fArrC = source.getWhitePoint().c();
            float[] fArrC2 = destination.getWhitePoint().c();
            WhitePoint whitePoint = source.getWhitePoint();
            gl5 gl5Var = gl5.a;
            if (!d.f(whitePoint, gl5Var.b())) {
                transform = d.l(d.e(a.INSTANCE.a().getTransform(), fArrC, gl5Var.f()), source.getTransform());
            }
            if (!d.f(destination.getWhitePoint(), gl5Var.b())) {
                inverseTransform = d.k(d.l(d.e(a.INSTANCE.a().getTransform(), fArrC2, gl5Var.f()), destination.getTransform()));
            }
            if (j.e(intent, j.INSTANCE.a())) {
                transform = d.m(new float[]{fArrC[0] / fArrC2[0], fArrC[1] / fArrC2[1], fArrC[2] / fArrC2[2]}, transform);
            }
            return d.l(inverseTransform, transform);
        }

        @Override // androidx.compose.ui.graphics.colorspace.f
        public long a(long color) {
            float fW = ei1.w(color);
            float fV = ei1.v(color);
            float fT = ei1.t(color);
            float fS = ei1.s(color);
            float fA = (float) this.mSource.getEotfFunc().a(fW);
            float fA2 = (float) this.mSource.getEotfFunc().a(fV);
            float fA3 = (float) this.mSource.getEotfFunc().a(fT);
            float[] fArr = this.mTransform;
            return ki1.a((float) this.mDestination.getOetfFunc().a((fArr[0] * fA) + (fArr[3] * fA2) + (fArr[6] * fA3)), (float) this.mDestination.getOetfFunc().a((fArr[1] * fA) + (fArr[4] * fA2) + (fArr[7] * fA3)), (float) this.mDestination.getOetfFunc().a((fArr[2] * fA) + (fArr[5] * fA2) + (fArr[8] * fA3)), fS, this.mDestination);
        }

        private b(Rgb rgb, Rgb rgb2, int i) {
            super(rgb, rgb2, rgb, rgb2, i, null, null);
            this.mSource = rgb;
            this.mDestination = rgb2;
            this.mTransform = b(rgb, rgb2, i);
        }
    }

    public /* synthetic */ f(c cVar, c cVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, cVar2, i);
    }

    public long a(long color) {
        float fW = ei1.w(color);
        float fV = ei1.v(color);
        float fT = ei1.t(color);
        float fS = ei1.s(color);
        long j = this.transformSource.j(fW, fV, fT);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fM = this.transformSource.m(fW, fV, fT);
        float[] fArr = this.transform;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fM *= fArr[2];
        }
        float f = fIntBitsToFloat;
        return this.transformDestination.n(f, fIntBitsToFloat2, fM, fS, this.destination);
    }

    public /* synthetic */ f(c cVar, c cVar2, c cVar3, c cVar4, int i, float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, cVar2, cVar3, cVar4, i, fArr);
    }

    private f(c cVar, c cVar2, c cVar3, c cVar4, int i, float[] fArr) {
        this.source = cVar;
        this.destination = cVar2;
        this.transformSource = cVar3;
        this.transformDestination = cVar4;
        this.renderIntent = i;
        this.transform = fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private f(c cVar, c cVar2, int i) {
        long model = cVar.getModel();
        androidx.compose.ui.graphics.colorspace.b.Companion companion = androidx.compose.ui.graphics.colorspace.b.INSTANCE;
        this(cVar, cVar2, androidx.compose.ui.graphics.colorspace.b.e(model, companion.b()) ? d.d(cVar, gl5.a.b(), null, 2, null) : cVar, androidx.compose.ui.graphics.colorspace.b.e(cVar2.getModel(), companion.b()) ? d.d(cVar2, gl5.a.b(), null, 2, null) : cVar2, i, INSTANCE.b(cVar, cVar2, i), null);
    }
}
