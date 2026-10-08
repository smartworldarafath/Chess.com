package androidx.compose.ui.platform;

import android.os.Build;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.MutableRect;
import com.google.inputmethod.alb;
import com.google.inputmethod.atb;
import com.google.inputmethod.bi7;
import com.google.inputmethod.dw8;
import com.google.inputmethod.eqa;
import com.google.inputmethod.f43;
import com.google.inputmethod.i05;
import com.google.inputmethod.k05;
import com.google.inputmethod.k43;
import com.google.inputmethod.kne;
import com.google.inputmethod.q16;
import com.google.inputmethod.r16;
import com.google.inputmethod.rn8;
import com.google.inputmethod.tq4;
import com.google.inputmethod.u66;
import com.google.inputmethod.vg3;
import com.google.inputmethod.w41;
import com.google.inputmethod.zh7;
import com.google.inputmethod.zw5;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u000b0\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010$J!\u0010*\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000bH\u0016¢\u0006\u0004\b,\u0010\u0012J\u000f\u0010-\u001a\u00020\u000bH\u0016¢\u0006\u0004\b-\u0010\u0012J\u000f\u0010.\u001a\u00020\u000bH\u0016¢\u0006\u0004\b.\u0010\u0012J\u001f\u00101\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u001fH\u0016¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\u000b2\u0006\u00104\u001a\u0002032\u0006\u00100\u001a\u00020\u001fH\u0016¢\u0006\u0004\b5\u00106J9\u00107\u001a\u00020\u000b2\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u0014H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u0014H\u0016¢\u0006\u0004\b<\u0010;R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010=R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010>R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010?R,\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010@R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010AR\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010BR\u0016\u0010D\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010CR\u0014\u0010F\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010ER$\u0010K\u001a\u00020\u001f2\u0006\u0010H\u001a\u00020\u001f8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b#\u0010C\"\u0004\bI\u0010JR\u0016\u0010N\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010MR\u0016\u0010R\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u001a\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010WR\u0016\u0010Z\u001a\u00020Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010BR\u0018\u0010]\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010\\R\u0016\u0010_\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010CR\u0016\u0010a\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010CR\u0016\u0010b\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010CR\"\u0010g\u001a\u00020c8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010d\u001a\u0004\bT\u0010e\"\u0004\b^\u0010fR\"\u0010h\u001a\u00020\u001f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010C\u001a\u0004\bh\u0010i\"\u0004\b`\u0010JR\u0016\u0010k\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010CR \u0010p\u001a\u000e\u0012\u0004\u0012\u00020m\u0012\u0004\u0012\u00020\u000b0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010r\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010\u0016¨\u0006s"}, d2 = {"Landroidx/compose/ui/platform/GraphicsLayerOwnerLayer;", "Lcom/google/android/dw8;", "", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "graphicsLayer", "Lcom/google/android/i05;", "context", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Lkotlin/Function2;", "Lcom/google/android/w41;", "", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lcom/google/android/i05;Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "s", "()V", "u", "Lcom/google/android/zh7;", "o", "()[F", "n", "t", "Landroidx/compose/ui/graphics/s;", "scope", "g", "(Landroidx/compose/ui/graphics/s;)V", "Lcom/google/android/rn8;", "position", "", "f", "(J)Z", "Lcom/google/android/g16;", "j", "(J)V", "Lcom/google/android/q16;", "size", "d", "canvas", "parentLayer", "i", "(Lcom/google/android/w41;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "k", "invalidate", "destroy", "point", "inverse", "c", "(JZ)J", "Lcom/google/android/i58;", "rect", "e", "(Lcom/google/android/i58;Z)V", "b", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "matrix", "a", "([F)V", "h", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "Lcom/google/android/i05;", "Landroidx/compose/ui/platform/AndroidComposeView;", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function0;", "J", "Z", "isDestroyed", "[F", "matrixCache", "inverseMatrixCache", "value", "p", "(Z)V", "isDirty", "Lcom/google/android/f43;", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "l", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/drawscope/a;", "m", "Landroidx/compose/ui/graphics/drawscope/a;", "", "I", "mutatedFields", "Landroidx/compose/ui/graphics/t;", "transformOrigin", "Landroidx/compose/ui/graphics/n;", "Landroidx/compose/ui/graphics/n;", "outline", "q", "isMatrixDirty", "r", "isInverseMatrixDirty", "isIdentity", "", "F", "()F", "(F)V", "frameRate", "isFrameRateFromParent", "()Z", "v", "drawnWithEnabledZ", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "w", "Lkotlin/jvm/functions/Function1;", "recordLambda", "getUnderlyingMatrix-sQKQjiQ", "underlyingMatrix", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GraphicsLayerOwnerLayer implements dw8 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private GraphicsLayer graphicsLayer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final i05 context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Function2<? super w41, ? super GraphicsLayer, Unit> drawBlock;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Function0<Unit> invalidateParentLayer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long size;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean isDestroyed;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private float[] inverseMatrixCache;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean isDirty;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private int mutatedFields;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.n outline;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean isMatrixDirty;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private boolean isInverseMatrixDirty;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private float frameRate;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private boolean isFrameRateFromParent;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private boolean drawnWithEnabledZ;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final float[] matrixCache = zh7.c(null, 1, null);

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private f43 density = k43.b(1.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.drawscope.a scope = new androidx.compose.ui.graphics.drawscope.a();

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private long transformOrigin = androidx.compose.ui.graphics.t.INSTANCE.a();

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean isIdentity = true;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final Function1<DrawScope, Unit> recordLambda = new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.platform.GraphicsLayerOwnerLayer$recordLambda$1
        {
            super(1);
        }

        public final void a(DrawScope drawScope) {
            GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = this.this$0;
            w41 w41VarB = drawScope.getDrawContext().b();
            Function2 function2 = graphicsLayerOwnerLayer.drawBlock;
            if (function2 != null) {
                function2.invoke(w41VarB, drawScope.getDrawContext().getGraphicsLayer());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DrawScope) obj);
            return Unit.a;
        }
    };

    public GraphicsLayerOwnerLayer(GraphicsLayer graphicsLayer, i05 i05Var, AndroidComposeView androidComposeView, Function2<? super w41, ? super GraphicsLayer, Unit> function2, Function0<Unit> function0) {
        this.graphicsLayer = graphicsLayer;
        this.context = i05Var;
        this.ownerView = androidComposeView;
        this.drawBlock = function2;
        this.invalidateParentLayer = function0;
        long j = Integer.MAX_VALUE;
        this.size = q16.c((j & 4294967295L) | (j << 32));
    }

    private final float[] n() {
        float[] fArrC = this.inverseMatrixCache;
        if (fArrC == null) {
            fArrC = zh7.c(null, 1, null);
            this.inverseMatrixCache = fArrC;
        }
        if (!this.isInverseMatrixDirty) {
            if (Float.isNaN(fArrC[0])) {
                return null;
            }
            return fArrC;
        }
        this.isInverseMatrixDirty = false;
        float[] fArrO = o();
        if (this.isIdentity) {
            return fArrO;
        }
        if (u66.a(fArrO, fArrC)) {
            return fArrC;
        }
        fArrC[0] = Float.NaN;
        return null;
    }

    private final float[] o() {
        t();
        return this.matrixCache;
    }

    private final void p(boolean z) {
        if (z != this.isDirty) {
            this.isDirty = z;
            this.ownerView.a1(this, z);
        }
    }

    private final void s() {
        kne.a.a(this.ownerView);
    }

    private final void t() {
        if (this.isMatrixDirty) {
            GraphicsLayer graphicsLayer = this.graphicsLayer;
            long jB = (graphicsLayer.getPivotOffset() & 9223372034707292159L) == 9205357640488583168L ? atb.b(r16.e(this.size)) : graphicsLayer.getPivotOffset();
            zh7.k(this.matrixCache, Float.intBitsToFloat((int) (jB >> 32)), Float.intBitsToFloat((int) (jB & 4294967295L)), graphicsLayer.y(), graphicsLayer.z(), 0.0f, graphicsLayer.q(), graphicsLayer.r(), graphicsLayer.s(), graphicsLayer.t(), graphicsLayer.u(), 0.0f, 1040, null);
            this.isMatrixDirty = false;
            this.isIdentity = bi7.a(this.matrixCache);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void u() throws NoWhenBranchMatchedException {
        Function0<Unit> function0;
        androidx.compose.ui.graphics.n nVar = this.outline;
        if (nVar == null) {
            return;
        }
        k05.b(this.graphicsLayer, nVar);
        if (Build.VERSION.SDK_INT < 33) {
            if (((nVar instanceof androidx.compose.ui.graphics.n.a) || ((nVar instanceof androidx.compose.ui.graphics.n.c) && !eqa.g(((androidx.compose.ui.graphics.n.c) nVar).getRoundRect()))) && (function0 = this.invalidateParentLayer) != null) {
                function0.invoke();
            }
        }
    }

    @Override // com.google.inputmethod.dw8
    public void a(float[] matrix) {
        zh7.p(matrix, o());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // com.google.inputmethod.dw8
    public void b(Function2<? super w41, ? super GraphicsLayer, Unit> drawBlock, Function0<Unit> invalidateParentLayer) throws KotlinNothingValueException {
        i05 i05Var = this.context;
        if (i05Var == null) {
            zw5.d("currently reuse is only supported when we manage the layer lifecycle");
            throw new KotlinNothingValueException();
        }
        if (!this.graphicsLayer.getIsReleased()) {
            zw5.a("layer should have been released before reuse");
        }
        this.graphicsLayer = i05Var.b();
        this.isDestroyed = false;
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
        this.isMatrixDirty = false;
        this.isInverseMatrixDirty = false;
        this.isIdentity = true;
        zh7.i(this.matrixCache);
        float[] fArr = this.inverseMatrixCache;
        if (fArr != null) {
            zh7.i(fArr);
        }
        this.transformOrigin = androidx.compose.ui.graphics.t.INSTANCE.a();
        this.drawnWithEnabledZ = false;
        long j = Integer.MAX_VALUE;
        this.size = q16.c((j & 4294967295L) | (j << 32));
        this.outline = null;
        this.mutatedFields = 0;
    }

    @Override // com.google.inputmethod.dw8
    public long c(long point, boolean inverse) {
        float[] fArrO;
        if (inverse) {
            fArrO = n();
            if (fArrO == null) {
                return rn8.INSTANCE.a();
            }
        } else {
            fArrO = o();
        }
        return this.isIdentity ? point : zh7.g(fArrO, point);
    }

    @Override // com.google.inputmethod.dw8
    public void d(long size) {
        if (q16.f(size, this.size)) {
            return;
        }
        if (this.ownerView.R0()) {
            this.ownerView.K(tq4.INSTANCE.a());
        }
        this.size = size;
        invalidate();
    }

    @Override // com.google.inputmethod.dw8
    public void destroy() {
        q(0.0f);
        r(false);
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        p(false);
        i05 i05Var = this.context;
        if (i05Var != null) {
            i05Var.c(this.graphicsLayer);
            this.ownerView.g1(this);
        }
    }

    @Override // com.google.inputmethod.dw8
    public void e(MutableRect rect, boolean inverse) {
        float[] fArrN = inverse ? n() : o();
        if (this.isIdentity) {
            return;
        }
        if (fArrN == null) {
            rect.g(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            zh7.h(fArrN, rect);
        }
    }

    @Override // com.google.inputmethod.dw8
    public boolean f(long position) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (position >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (position & 4294967295L));
        if (this.graphicsLayer.getClip()) {
            return alb.c(this.graphicsLayer.o(), fIntBitsToFloat, fIntBitsToFloat2, null, null, 24, null);
        }
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.google.inputmethod.dw8
    public void g(androidx.compose.ui.graphics.s scope) throws NoWhenBranchMatchedException {
        int iB;
        Function0<Unit> function0;
        int mutatedFields = scope.getMutatedFields() | this.mutatedFields;
        this.layoutDirection = scope.getLayoutDirection();
        this.density = scope.getGraphicsDensity();
        int i = mutatedFields & 4096;
        if (i != 0) {
            this.transformOrigin = scope.getTransformOrigin();
        }
        if ((mutatedFields & 1) != 0) {
            this.graphicsLayer.a0(scope.getScaleX());
        }
        if ((mutatedFields & 2) != 0) {
            this.graphicsLayer.b0(scope.getScaleY());
        }
        if ((mutatedFields & 4) != 0) {
            this.graphicsLayer.K(scope.getAlpha());
        }
        if ((mutatedFields & 8) != 0) {
            this.graphicsLayer.g0(scope.getTranslationX());
        }
        if ((mutatedFields & 16) != 0) {
            this.graphicsLayer.h0(scope.getTranslationY());
        }
        if ((mutatedFields & 32) != 0) {
            this.graphicsLayer.c0(scope.getShadowElevation());
            if (scope.getShadowElevation() > 0.0f && !this.drawnWithEnabledZ && (function0 = this.invalidateParentLayer) != null) {
                function0.invoke();
            }
        }
        if ((mutatedFields & 64) != 0) {
            this.graphicsLayer.L(scope.getAmbientShadowColor());
        }
        if ((mutatedFields & 128) != 0) {
            this.graphicsLayer.e0(scope.getSpotShadowColor());
        }
        if ((mutatedFields & 1024) != 0) {
            this.graphicsLayer.Y(scope.getRotationZ());
        }
        if ((mutatedFields & 256) != 0) {
            this.graphicsLayer.W(scope.getRotationX());
        }
        if ((mutatedFields & 512) != 0) {
            this.graphicsLayer.X(scope.getRotationY());
        }
        if ((mutatedFields & 2048) != 0) {
            this.graphicsLayer.N(scope.getCameraDistance());
        }
        if (i != 0) {
            if (androidx.compose.ui.graphics.t.e(this.transformOrigin, androidx.compose.ui.graphics.t.INSTANCE.a())) {
                this.graphicsLayer.S(rn8.INSTANCE.b());
            } else {
                this.graphicsLayer.S(rn8.e((((long) Float.floatToRawIntBits(androidx.compose.ui.graphics.t.g(this.transformOrigin) * ((int) (this.size & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(androidx.compose.ui.graphics.t.f(this.transformOrigin) * ((int) (this.size >> 32)))) << 32)));
            }
        }
        if ((mutatedFields & 16384) != 0) {
            this.graphicsLayer.O(scope.getClip());
        }
        if ((131072 & mutatedFields) != 0) {
            this.graphicsLayer.V(scope.getRenderEffect());
        }
        if ((262144 & mutatedFields) != 0) {
            this.graphicsLayer.P(scope.getColorFilter());
        }
        if ((524288 & mutatedFields) != 0) {
            this.graphicsLayer.M(scope.getBlendMode());
        }
        if ((32768 & mutatedFields) != 0) {
            GraphicsLayer graphicsLayer = this.graphicsLayer;
            int compositingStrategy = scope.getCompositingStrategy();
            androidx.compose.ui.graphics.j.Companion companion = androidx.compose.ui.graphics.j.INSTANCE;
            if (androidx.compose.ui.graphics.j.e(compositingStrategy, companion.a())) {
                iB = androidx.compose.ui.graphics.layer.a.INSTANCE.a();
            } else if (androidx.compose.ui.graphics.j.e(compositingStrategy, companion.c())) {
                iB = androidx.compose.ui.graphics.layer.a.INSTANCE.c();
            } else {
                if (!androidx.compose.ui.graphics.j.e(compositingStrategy, companion.b())) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
                iB = androidx.compose.ui.graphics.layer.a.INSTANCE.b();
            }
            graphicsLayer.Q(iB);
        }
        boolean z = true;
        if ((mutatedFields & 7963) != 0) {
            this.isMatrixDirty = true;
            this.isInverseMatrixDirty = true;
        }
        if (Intrinsics.e(this.outline, scope.getOutline())) {
            z = false;
        } else {
            this.outline = scope.getOutline();
            u();
        }
        this.mutatedFields = scope.getMutatedFields();
        if (mutatedFields != 0 || z) {
            s();
            if (this.ownerView.R0()) {
                this.ownerView.K(getFrameRate());
            }
        }
    }

    @Override // com.google.inputmethod.dw8
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ, reason: not valid java name */
    public float[] mo52getUnderlyingMatrixsQKQjiQ() {
        return o();
    }

    @Override // com.google.inputmethod.dw8
    public void h(float[] matrix) {
        float[] fArrN = n();
        if (fArrN != null) {
            zh7.p(matrix, fArrN);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.google.inputmethod.dw8
    public void i(w41 canvas, GraphicsLayer parentLayer) throws NoWhenBranchMatchedException {
        k();
        this.drawnWithEnabledZ = this.graphicsLayer.v() > 0.0f;
        vg3 drawContext = this.scope.getDrawContext();
        drawContext.i(canvas);
        drawContext.h(parentLayer);
        k05.a(this.scope, this.graphicsLayer);
    }

    @Override // com.google.inputmethod.dw8
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        p(true);
    }

    @Override // com.google.inputmethod.dw8
    public void j(long position) {
        if (this.ownerView.R0()) {
            this.ownerView.K(tq4.INSTANCE.a());
        }
        this.graphicsLayer.f0(position);
        s();
    }

    @Override // com.google.inputmethod.dw8
    public void k() {
        if (this.ownerView.R0() && getFrameRate() != 0.0f) {
            this.ownerView.K(getFrameRate());
        }
        if (this.isDirty) {
            if (!androidx.compose.ui.graphics.t.e(this.transformOrigin, androidx.compose.ui.graphics.t.INSTANCE.a()) && !q16.f(this.graphicsLayer.getSize(), this.size)) {
                GraphicsLayer graphicsLayer = this.graphicsLayer;
                float f = androidx.compose.ui.graphics.t.f(this.transformOrigin) * ((int) (this.size >> 32));
                graphicsLayer.S(rn8.e((((long) Float.floatToRawIntBits(androidx.compose.ui.graphics.t.g(this.transformOrigin) * ((int) (this.size & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
            }
            this.graphicsLayer.F(this.density, this.layoutDirection, this.size, this.recordLambda);
            p(false);
        }
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public float getFrameRate() {
        return this.frameRate;
    }

    public void q(float f) {
        this.frameRate = f;
    }

    public void r(boolean z) {
        this.isFrameRateFromParent = z;
    }
}
