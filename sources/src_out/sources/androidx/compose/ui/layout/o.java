package androidx.compose.ui.layout;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.b08;
import com.google.inputmethod.f43;
import com.google.inputmethod.g16;
import com.google.inputmethod.ij7;
import com.google.inputmethod.kn6;
import com.google.inputmethod.kx1;
import com.google.inputmethod.q16;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b'\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J5\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nH$¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R*\u0010$\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u001d8\u0004@DX\u0084\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010)\u001a\u00020%2\u0006\u0010\u0014\u001a\u00020%8\u0004@DX\u0084\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!\"\u0004\b(\u0010#R$\u0010,\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010!R\u0014\u0010.\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0018R\u0014\u00100\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0018¨\u00061"}, d2 = {"Landroidx/compose/ui/layout/o;", "Lcom/google/android/ij7;", "<init>", "()V", "", "S0", "Lcom/google/android/g16;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/m;", "layerBlock", "X0", "(JFLkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "W0", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "", "value", "a", "I", "N0", "()I", "width", "b", "D0", "height", "Lcom/google/android/q16;", "c", "J", "H0", "()J", "Y0", "(J)V", "measuredSize", "Lcom/google/android/kx1;", "d", "K0", "Z0", "measurementConstraints", "e", "B0", "apparentToRealOffset", "J0", "measuredWidth", "G0", "measuredHeight", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class o implements ij7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int width;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int height;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long measuredSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long measurementConstraints = PlaceableKt.b;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long apparentToRealOffset = g16.INSTANCE.b();

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\t*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0015\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0017\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0016J#\u0010\u0018\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0011J9\u0010\u001c\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\t2\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00050\u0019¢\u0006\u0004\b\u001c\u0010\u001dJA\u0010\u001e\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u000f\u001a\u00020\t2\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00050\u0019¢\u0006\u0004\b\u001e\u0010\u001fJA\u0010 \u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u000f\u001a\u00020\t2\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00050\u0019¢\u0006\u0004\b \u0010\u001fJ9\u0010!\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\t2\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00050\u0019¢\u0006\u0004\b!\u0010\u001dJ+\u0010$\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b$\u0010%J+\u0010&\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b&\u0010%J!\u0010(\u001a\u00020\u00052\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0019¢\u0006\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010&R\u0014\u0010/\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010.R\u0014\u00104\u001a\u00020\u00128$X¤\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058$X¤\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0016\u0010<\u001a\u0004\u0018\u0001098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Landroidx/compose/ui/layout/o$a;", "Lcom/google/android/f43;", "<init>", "()V", "Landroidx/compose/ui/layout/o;", "", "t", "(Landroidx/compose/ui/layout/o;)V", "Landroidx/compose/ui/layout/s;", "", "defaultValue", "j", "(Landroidx/compose/ui/layout/s;F)F", "Lcom/google/android/g16;", "position", "zIndex", "N", "(Landroidx/compose/ui/layout/o;JF)V", "", "x", "y", "J", "(Landroidx/compose/ui/layout/o;IIF)V", "w", "D", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/m;", "layerBlock", "W", "(Landroidx/compose/ui/layout/o;JFLkotlin/jvm/functions/Function1;)V", "R", "(Landroidx/compose/ui/layout/o;IIFLkotlin/jvm/functions/Function1;)V", "c0", "e0", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "f0", "(Landroidx/compose/ui/layout/o;JLandroidx/compose/ui/graphics/layer/GraphicsLayer;F)V", "Z", "block", "k0", "(Lkotlin/jvm/functions/Function1;)V", "", "a", "motionFrameOfReferencePlacement", "getDensity", "()F", "density", "w2", "fontScale", "r", "()I", "parentWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "m", "()Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "Lcom/google/android/kn6;", "v", "()Lcom/google/android/kn6;", "coordinates", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a implements f43 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private boolean motionFrameOfReferencePlacement;

        public static /* synthetic */ void F(a aVar, o oVar, long j, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            aVar.D(oVar, j, f);
        }

        public static /* synthetic */ void L(a aVar, o oVar, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            aVar.J(oVar, i, i2, f);
        }

        public static /* synthetic */ void Q(a aVar, o oVar, long j, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            aVar.N(oVar, j, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void T(a aVar, o oVar, int i, int i2, float f, Function1 function1, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i3 & 8) != 0) {
                function1 = PlaceableKt.a;
            }
            aVar.R(oVar, i, i2, f2, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void a0(a aVar, o oVar, long j, float f, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i & 4) != 0) {
                function1 = PlaceableKt.a;
            }
            aVar.W(oVar, j, f2, function1);
        }

        public static /* synthetic */ void b0(a aVar, o oVar, long j, GraphicsLayer graphicsLayer, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i & 4) != 0) {
                f = 0.0f;
            }
            aVar.Z(oVar, j, graphicsLayer, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void d0(a aVar, o oVar, int i, int i2, float f, Function1 function1, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i3 & 8) != 0) {
                function1 = PlaceableKt.a;
            }
            aVar.c0(oVar, i, i2, f2, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void h0(a aVar, o oVar, long j, float f, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i & 4) != 0) {
                function1 = PlaceableKt.a;
            }
            aVar.e0(oVar, j, f2, function1);
        }

        public static /* synthetic */ void j0(a aVar, o oVar, long j, GraphicsLayer graphicsLayer, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i & 4) != 0) {
                f = 0.0f;
            }
            aVar.f0(oVar, j, graphicsLayer, f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final void t(o oVar) {
            if (oVar instanceof b08) {
                ((b08) oVar).z(this.motionFrameOfReferencePlacement);
            }
        }

        public static /* synthetic */ void z(a aVar, o oVar, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            aVar.w(oVar, i, i2, f);
        }

        public final void D(o oVar, long j, float f) {
            t(oVar);
            oVar.X0(g16.o(j, oVar.apparentToRealOffset), f, null);
        }

        public final void J(o oVar, int i, int i2, float f) {
            long jF = g16.f((((long) i) << 32) | (((long) i2) & 4294967295L));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                t(oVar);
                oVar.X0(g16.o(jF, oVar.apparentToRealOffset), f, null);
            } else {
                long jF2 = g16.f((((long) ((getParentWidth() - oVar.getWidth()) - g16.k(jF))) << 32) | (((long) g16.l(jF)) & 4294967295L));
                t(oVar);
                oVar.X0(g16.o(jF2, oVar.apparentToRealOffset), f, null);
            }
        }

        public final void N(o oVar, long j, float f) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                t(oVar);
                oVar.X0(g16.o(j, oVar.apparentToRealOffset), f, null);
                return;
            }
            int iR = (getParentWidth() - oVar.getWidth()) - g16.k(j);
            long jF = g16.f((((long) g16.l(j)) & 4294967295L) | (((long) iR) << 32));
            t(oVar);
            oVar.X0(g16.o(jF, oVar.apparentToRealOffset), f, null);
        }

        public final void R(o oVar, int i, int i2, float f, Function1<? super androidx.compose.ui.graphics.m, Unit> function1) {
            long jF = g16.f((((long) i) << 32) | (((long) i2) & 4294967295L));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                t(oVar);
                oVar.X0(g16.o(jF, oVar.apparentToRealOffset), f, function1);
            } else {
                long jF2 = g16.f((((long) ((getParentWidth() - oVar.getWidth()) - g16.k(jF))) << 32) | (((long) g16.l(jF)) & 4294967295L));
                t(oVar);
                oVar.X0(g16.o(jF2, oVar.apparentToRealOffset), f, function1);
            }
        }

        public final void W(o oVar, long j, float f, Function1<? super androidx.compose.ui.graphics.m, Unit> function1) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                t(oVar);
                oVar.X0(g16.o(j, oVar.apparentToRealOffset), f, function1);
                return;
            }
            int iR = (getParentWidth() - oVar.getWidth()) - g16.k(j);
            long jF = g16.f((((long) g16.l(j)) & 4294967295L) | (((long) iR) << 32));
            t(oVar);
            oVar.X0(g16.o(jF, oVar.apparentToRealOffset), f, function1);
        }

        public final void Z(o oVar, long j, GraphicsLayer graphicsLayer, float f) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                t(oVar);
                oVar.W0(g16.o(j, oVar.apparentToRealOffset), f, graphicsLayer);
                return;
            }
            int iR = (getParentWidth() - oVar.getWidth()) - g16.k(j);
            long jF = g16.f((((long) g16.l(j)) & 4294967295L) | (((long) iR) << 32));
            t(oVar);
            oVar.W0(g16.o(jF, oVar.apparentToRealOffset), f, graphicsLayer);
        }

        public final void c0(o oVar, int i, int i2, float f, Function1<? super androidx.compose.ui.graphics.m, Unit> function1) {
            long jF = g16.f((((long) i2) & 4294967295L) | (((long) i) << 32));
            t(oVar);
            oVar.X0(g16.o(jF, oVar.apparentToRealOffset), f, function1);
        }

        public final void e0(o oVar, long j, float f, Function1<? super androidx.compose.ui.graphics.m, Unit> function1) {
            t(oVar);
            oVar.X0(g16.o(j, oVar.apparentToRealOffset), f, function1);
        }

        public final void f0(o oVar, long j, GraphicsLayer graphicsLayer, float f) {
            t(oVar);
            oVar.W0(g16.o(j, oVar.apparentToRealOffset), f, graphicsLayer);
        }

        @Override // com.google.inputmethod.f43
        public float getDensity() {
            return 1.0f;
        }

        public float j(s sVar, float f) {
            return f;
        }

        public final void k0(Function1<? super a, Unit> block) {
            this.motionFrameOfReferencePlacement = true;
            block.invoke(this);
            this.motionFrameOfReferencePlacement = false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: m */
        public abstract LayoutDirection getParentLayoutDirection();

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: r */
        public abstract int getParentWidth();

        public kn6 v() {
            return null;
        }

        public final void w(o oVar, int i, int i2, float f) {
            long jF = g16.f((((long) i2) & 4294967295L) | (((long) i) << 32));
            t(oVar);
            oVar.X0(g16.o(jF, oVar.apparentToRealOffset), f, null);
        }

        @Override // com.google.inputmethod.hm4
        /* JADX INFO: renamed from: w2 */
        public float getFontScale() {
            return 1.0f;
        }
    }

    public o() {
        long j = 0;
        this.measuredSize = q16.c((j & 4294967295L) | (j << 32));
    }

    private final void S0() {
        this.width = kotlin.ranges.g.o((int) (this.measuredSize >> 32), kx1.n(this.measurementConstraints), kx1.l(this.measurementConstraints));
        int iO = kotlin.ranges.g.o((int) (this.measuredSize & 4294967295L), kx1.m(this.measurementConstraints), kx1.k(this.measurementConstraints));
        this.height = iO;
        int i = this.width;
        long j = this.measuredSize;
        this.apparentToRealOffset = g16.f((((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iO - ((int) (j & 4294967295L))) / 2))));
    }

    /* JADX INFO: renamed from: B0, reason: from getter */
    protected final long getApparentToRealOffset() {
        return this.apparentToRealOffset;
    }

    /* JADX INFO: renamed from: D0, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    public int G0() {
        return (int) (this.measuredSize & 4294967295L);
    }

    /* JADX INFO: renamed from: H0, reason: from getter */
    protected final long getMeasuredSize() {
        return this.measuredSize;
    }

    public int J0() {
        return (int) (this.measuredSize >> 32);
    }

    /* JADX INFO: renamed from: K0, reason: from getter */
    protected final long getMeasurementConstraints() {
        return this.measurementConstraints;
    }

    /* JADX INFO: renamed from: N0, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void W0(long position, float zIndex, GraphicsLayer layer) {
        X0(position, zIndex, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void X0(long position, float zIndex, Function1<? super androidx.compose.ui.graphics.m, Unit> layerBlock);

    protected final void Y0(long j) {
        if (q16.f(this.measuredSize, j)) {
            return;
        }
        this.measuredSize = j;
        S0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void Z0(long j) {
        if (kx1.f(this.measurementConstraints, j)) {
            return;
        }
        this.measurementConstraints = j;
        S0();
    }
}
