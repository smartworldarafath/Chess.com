package androidx.compose.ui.node;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.eo6;
import com.google.inputmethod.f39;
import com.google.inputmethod.f43;
import com.google.inputmethod.fz1;
import com.google.inputmethod.k33;
import com.google.inputmethod.ml5;
import com.google.inputmethod.ni8;
import com.google.inputmethod.qu0;
import com.google.inputmethod.r16;
import com.google.inputmethod.r58;
import com.google.inputmethod.vg3;
import com.google.inputmethod.w41;
import com.google.inputmethod.y23;
import com.google.inputmethod.yg3;
import com.google.inputmethod.zw5;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000f\u001a\u00020\u0007*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u0007*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ9\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ^\u00100\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010)2\b\b\u0001\u0010+\u001a\u00020%2\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b0\u00101J^\u00104\u001a\u00020\u00072\u0006\u00103\u001a\u0002022\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010)2\b\b\u0001\u0010+\u001a\u00020%2\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b4\u00105JL\u00109\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0006\u00106\u001a\u00020\"2\u0006\u0010\f\u001a\u00020\u00172\b\b\u0001\u0010+\u001a\u00020%2\u0006\u00108\u001a\u0002072\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b9\u0010:JL\u0010;\u001a\u00020\u00072\u0006\u00103\u001a\u0002022\u0006\u00106\u001a\u00020\"2\u0006\u0010\f\u001a\u00020\u00172\b\b\u0001\u0010+\u001a\u00020%2\u0006\u00108\u001a\u0002072\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b;\u0010<JD\u0010?\u001a\u00020\u00072\u0006\u0010>\u001a\u00020=2\u0006\u00106\u001a\u00020\"2\b\b\u0001\u0010+\u001a\u00020%2\u0006\u00108\u001a\u0002072\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b?\u0010@Jd\u0010H\u001a\u00020\u00072\u0006\u0010>\u001a\u00020=2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020A2\u0006\u0010E\u001a\u00020\u000b2\b\b\u0001\u0010+\u001a\u00020%2\u0006\u00108\u001a\u0002072\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.2\u0006\u0010G\u001a\u00020FH\u0096\u0001¢\u0006\u0004\bH\u0010IJT\u0010L\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0006\u00106\u001a\u00020\"2\u0006\u0010\f\u001a\u00020\u00172\u0006\u0010K\u001a\u00020J2\b\b\u0001\u0010+\u001a\u00020%2\u0006\u00108\u001a\u0002072\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.H\u0096\u0001¢\u0006\u0004\bL\u0010MJT\u0010N\u001a\u00020\u00072\u0006\u00103\u001a\u0002022\u0006\u00106\u001a\u00020\"2\u0006\u0010\f\u001a\u00020\u00172\u0006\u0010K\u001a\u00020J2\u0006\u00108\u001a\u0002072\b\b\u0001\u0010+\u001a\u00020%2\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.H\u0096\u0001¢\u0006\u0004\bN\u0010OJL\u0010R\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0006\u0010P\u001a\u00020%2\u0006\u0010Q\u001a\u00020\"2\b\b\u0001\u0010+\u001a\u00020%2\u0006\u00108\u001a\u0002072\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.H\u0096\u0001¢\u0006\u0004\bR\u0010SJL\u0010T\u001a\u00020\u00072\u0006\u00103\u001a\u0002022\u0006\u0010P\u001a\u00020%2\u0006\u0010Q\u001a\u00020\"2\b\b\u0001\u0010+\u001a\u00020%2\u0006\u00108\u001a\u0002072\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.H\u0096\u0001¢\u0006\u0004\bT\u0010UJL\u0010V\u001a\u00020\u00072\u0006\u00103\u001a\u0002022\u0006\u00106\u001a\u00020\"2\u0006\u0010\f\u001a\u00020\u00172\b\b\u0001\u0010+\u001a\u00020%2\u0006\u00108\u001a\u0002072\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.H\u0096\u0001¢\u0006\u0004\bV\u0010<Jd\u0010[\u001a\u00020\u00072\u0006\u00103\u001a\u0002022\u0006\u0010W\u001a\u00020%2\u0006\u0010X\u001a\u00020%2\u0006\u0010Z\u001a\u00020Y2\u0006\u00106\u001a\u00020\"2\u0006\u0010\f\u001a\u00020\u00172\b\b\u0001\u0010+\u001a\u00020%2\u0006\u00108\u001a\u0002072\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b[\u0010\\JD\u0010_\u001a\u00020\u00072\u0006\u0010^\u001a\u00020]2\u0006\u00103\u001a\u0002022\b\b\u0001\u0010+\u001a\u00020%2\u0006\u00108\u001a\u0002072\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b_\u0010`JD\u0010a\u001a\u00020\u00072\u0006\u0010^\u001a\u00020]2\u0006\u0010!\u001a\u00020 2\b\b\u0001\u0010+\u001a\u00020%2\u0006\u00108\u001a\u0002072\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.H\u0096\u0001¢\u0006\u0004\ba\u0010bJ\u0014\u0010d\u001a\u00020%*\u00020cH\u0097\u0001¢\u0006\u0004\bd\u0010eJ\u0014\u0010g\u001a\u00020%*\u00020fH\u0097\u0001¢\u0006\u0004\bg\u0010hJ\u0014\u0010j\u001a\u00020i*\u00020cH\u0097\u0001¢\u0006\u0004\bj\u0010kJ\u0014\u0010l\u001a\u00020i*\u00020fH\u0097\u0001¢\u0006\u0004\bl\u0010mJ\u0014\u0010n\u001a\u00020c*\u00020iH\u0097\u0001¢\u0006\u0004\bn\u0010oJ\u0014\u0010p\u001a\u00020c*\u00020%H\u0097\u0001¢\u0006\u0004\bp\u0010eJ\u0014\u0010q\u001a\u00020c*\u00020fH\u0097\u0001¢\u0006\u0004\bq\u0010hJ\u0014\u0010r\u001a\u00020f*\u00020iH\u0097\u0001¢\u0006\u0004\br\u0010sJ\u0014\u0010t\u001a\u00020f*\u00020%H\u0097\u0001¢\u0006\u0004\bt\u0010uJ\u0014\u0010v\u001a\u00020f*\u00020cH\u0097\u0001¢\u0006\u0004\bv\u0010uJ\u0014\u0010x\u001a\u00020\u0017*\u00020wH\u0097\u0001¢\u0006\u0004\bx\u0010yJ\u0014\u0010z\u001a\u00020w*\u00020\u0017H\u0097\u0001¢\u0006\u0004\bz\u0010yR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0081\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0016\u0010Q\u001a\u00020\"8VX\u0096\u0005¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0016\u0010\f\u001a\u00020\u00178VX\u0096\u0005¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0086\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u0088\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0017\u0010\u008e\u0001\u001a\u00020%8\u0016X\u0097\u0005¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0017\u0010\u0090\u0001\u001a\u00020%8\u0016X\u0097\u0005¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u008d\u0001¨\u0006\u0091\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lcom/google/android/fz1;", "Landroidx/compose/ui/graphics/drawscope/a;", "canvasDrawScope", "<init>", "(Landroidx/compose/ui/graphics/drawscope/a;)V", "", "j1", "()V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "Lcom/google/android/q16;", "size", "Lkotlin/Function1;", "block", "Q0", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;JLkotlin/jvm/functions/Function1;)V", "Lcom/google/android/yg3;", "Lcom/google/android/w41;", "canvas", "layer", "m", "(Lcom/google/android/yg3;Lcom/google/android/w41;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Lcom/google/android/tsb;", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Landroidx/compose/ui/b$c;", "drawNode", "i", "(Lcom/google/android/w41;JLandroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/b$c;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "j", "(Lcom/google/android/w41;JLandroidx/compose/ui/node/NodeCoordinator;Lcom/google/android/yg3;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Lcom/google/android/qu0;", "brush", "Lcom/google/android/rn8;", "start", "end", "", "strokeWidth", "Lcom/google/android/wbc;", "cap", "Lcom/google/android/f39;", "pathEffect", "alpha", "Landroidx/compose/ui/graphics/h;", "colorFilter", "Landroidx/compose/ui/graphics/e;", "blendMode", "u1", "(Lcom/google/android/qu0;JJFILcom/google/android/f39;FLandroidx/compose/ui/graphics/h;I)V", "Lcom/google/android/ei1;", "color", "A0", "(JJJFILcom/google/android/f39;FLandroidx/compose/ui/graphics/h;I)V", "topLeft", "Landroidx/compose/ui/graphics/drawscope/b;", "style", "l1", "(Lcom/google/android/qu0;JJFLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;I)V", "k2", "(JJJFLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;I)V", "Lcom/google/android/ml5;", "image", "W1", "(Lcom/google/android/ml5;JFLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;I)V", "Lcom/google/android/g16;", "srcOffset", "srcSize", "dstOffset", "dstSize", "Lcom/google/android/ca4;", "filterQuality", "L1", "(Lcom/google/android/ml5;JJJJFLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;II)V", "Lcom/google/android/aa2;", "cornerRadius", "j2", "(Lcom/google/android/qu0;JJJFLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;I)V", "S1", "(JJJJLandroidx/compose/ui/graphics/drawscope/b;FLandroidx/compose/ui/graphics/h;I)V", "radius", "center", "A1", "(Lcom/google/android/qu0;FJFLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;I)V", "F0", "(JFJFLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;I)V", "I0", "startAngle", "sweepAngle", "", "useCenter", "L0", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;I)V", "Landroidx/compose/ui/graphics/Path;", "path", "C0", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;I)V", "D1", "(Landroidx/compose/ui/graphics/Path;Lcom/google/android/qu0;FLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;I)V", "Lcom/google/android/ff3;", "x2", "(F)F", "Lcom/google/android/b0d;", "T1", "(J)F", "", "O1", "(F)I", "A2", "(J)I", "O0", "(I)F", "P0", "U", "X", "(I)J", "Y", "(F)J", "s1", "Lcom/google/android/jf3;", "b1", "(J)J", "S", "a", "Landroidx/compose/ui/graphics/drawscope/a;", "getCanvasDrawScope", "()Landroidx/compose/ui/graphics/drawscope/a;", "b", "Lcom/google/android/yg3;", "Lcom/google/android/vg3;", "V0", "()Lcom/google/android/vg3;", "drawContext", "A", "()J", "d", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getDensity", "()F", "density", "w2", "fontScale", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LayoutNodeDrawScope implements DrawScope, fz1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.drawscope.a canvasDrawScope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private yg3 drawNode;

    public LayoutNodeDrawScope(androidx.compose.ui.graphics.drawscope.a aVar) {
        this.canvasDrawScope = aVar;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public long A() {
        return this.canvasDrawScope.A();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public void A0(long color, long start, long end, float strokeWidth, int cap, f39 pathEffect, float alpha, androidx.compose.ui.graphics.h colorFilter, int blendMode) {
        this.canvasDrawScope.A0(color, start, end, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public void A1(qu0 brush, float radius, long center, float alpha, androidx.compose.ui.graphics.drawscope.b style, androidx.compose.ui.graphics.h colorFilter, int blendMode) {
        this.canvasDrawScope.A1(brush, radius, center, alpha, style, colorFilter, blendMode);
    }

    @Override // com.google.inputmethod.f43
    public int A2(long j) {
        return this.canvasDrawScope.A2(j);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public void C0(Path path, long color, float alpha, androidx.compose.ui.graphics.drawscope.b style, androidx.compose.ui.graphics.h colorFilter, int blendMode) {
        this.canvasDrawScope.C0(path, color, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public void D1(Path path, qu0 brush, float alpha, androidx.compose.ui.graphics.drawscope.b style, androidx.compose.ui.graphics.h colorFilter, int blendMode) {
        this.canvasDrawScope.D1(path, brush, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public void F0(long color, float radius, long center, float alpha, androidx.compose.ui.graphics.drawscope.b style, androidx.compose.ui.graphics.h colorFilter, int blendMode) {
        this.canvasDrawScope.F0(color, radius, center, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public void I0(long color, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.b style, androidx.compose.ui.graphics.h colorFilter, int blendMode) {
        this.canvasDrawScope.I0(color, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public void L0(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.b style, androidx.compose.ui.graphics.h colorFilter, int blendMode) {
        this.canvasDrawScope.L0(color, startAngle, sweepAngle, useCenter, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public void L1(ml5 image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, androidx.compose.ui.graphics.drawscope.b style, androidx.compose.ui.graphics.h colorFilter, int blendMode, int filterQuality) {
        this.canvasDrawScope.L1(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, filterQuality);
    }

    @Override // com.google.inputmethod.f43
    public float O0(int i) {
        return this.canvasDrawScope.O0(i);
    }

    @Override // com.google.inputmethod.f43
    public int O1(float f) {
        return this.canvasDrawScope.O1(f);
    }

    @Override // com.google.inputmethod.f43
    public float P0(float f) {
        return this.canvasDrawScope.P0(f);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public void Q0(GraphicsLayer graphicsLayer, long j, final Function1<? super DrawScope, Unit> function1) {
        final yg3 yg3Var = this.drawNode;
        graphicsLayer.F(this, getLayoutDirection(), j, new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.node.LayoutNodeDrawScope$record$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.yg3] */
            /* JADX WARN: Type inference failed for: r2v1 */
            /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.yg3] */
            /* JADX WARN: Type inference failed for: r2v3 */
            /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.vg3] */
            /* JADX WARN: Type inference failed for: r2v5 */
            public final void a(DrawScope drawScope) throws Throwable {
                ?? drawContext = this.this$0.drawNode;
                this.this$0.drawNode = yg3Var;
                try {
                    LayoutNodeDrawScope layoutNodeDrawScope = this.this$0;
                    f43 density = drawScope.getDrawContext().getDensity();
                    LayoutDirection layoutDirection = drawScope.getDrawContext().getLayoutDirection();
                    w41 w41VarB = drawScope.getDrawContext().b();
                    long jD = drawScope.getDrawContext().d();
                    GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
                    Function1<DrawScope, Unit> function2 = function1;
                    f43 density2 = layoutNodeDrawScope.getDrawContext().getDensity();
                    LayoutDirection layoutDirection2 = layoutNodeDrawScope.getDrawContext().getLayoutDirection();
                    w41 w41VarB2 = layoutNodeDrawScope.getDrawContext().b();
                    long jD2 = layoutNodeDrawScope.getDrawContext().d();
                    GraphicsLayer graphicsLayer3 = layoutNodeDrawScope.getDrawContext().getGraphicsLayer();
                    try {
                        drawContext = layoutNodeDrawScope.getDrawContext();
                        drawContext.e(density);
                        drawContext.a(layoutDirection);
                        drawContext.i(w41VarB);
                        drawContext.c(jD);
                        drawContext.h(graphicsLayer2);
                        w41VarB.v();
                        try {
                            function2.invoke(layoutNodeDrawScope);
                            w41VarB.o();
                            vg3 drawContext2 = layoutNodeDrawScope.getDrawContext();
                            drawContext2.e(density2);
                            drawContext2.a(layoutDirection2);
                            drawContext2.i(w41VarB2);
                            drawContext2.c(jD2);
                            drawContext2.h(graphicsLayer3);
                            this.this$0.drawNode = drawContext;
                        } catch (Throwable th) {
                            drawContext = drawContext;
                            w41VarB.o();
                            vg3 drawContext3 = layoutNodeDrawScope.getDrawContext();
                            drawContext3.e(density2);
                            drawContext3.a(layoutDirection2);
                            drawContext3.i(w41VarB2);
                            drawContext3.c(jD2);
                            drawContext3.h(graphicsLayer3);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        drawContext = drawContext;
                        this.this$0.drawNode = drawContext;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    this.this$0.drawNode = drawContext;
                    throw th;
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                a((DrawScope) obj);
                return Unit.a;
            }
        });
    }

    @Override // com.google.inputmethod.f43
    public long S(long j) {
        return this.canvasDrawScope.S(j);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public void S1(long color, long topLeft, long size, long cornerRadius, androidx.compose.ui.graphics.drawscope.b style, float alpha, androidx.compose.ui.graphics.h colorFilter, int blendMode) {
        this.canvasDrawScope.S1(color, topLeft, size, cornerRadius, style, alpha, colorFilter, blendMode);
    }

    @Override // com.google.inputmethod.f43
    public float T1(long j) {
        return this.canvasDrawScope.T1(j);
    }

    @Override // com.google.inputmethod.hm4
    public float U(long j) {
        return this.canvasDrawScope.U(j);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: V0 */
    public vg3 getDrawContext() {
        return this.canvasDrawScope.getDrawContext();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public void W1(ml5 image, long topLeft, float alpha, androidx.compose.ui.graphics.drawscope.b style, androidx.compose.ui.graphics.h colorFilter, int blendMode) {
        this.canvasDrawScope.W1(image, topLeft, alpha, style, colorFilter, blendMode);
    }

    @Override // com.google.inputmethod.f43
    public long X(int i) {
        return this.canvasDrawScope.X(i);
    }

    @Override // com.google.inputmethod.f43
    public long Y(float f) {
        return this.canvasDrawScope.Y(f);
    }

    @Override // com.google.inputmethod.f43
    public long b1(long j) {
        return this.canvasDrawScope.b1(j);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public long d() {
        return this.canvasDrawScope.d();
    }

    @Override // com.google.inputmethod.f43
    public float getDensity() {
        return this.canvasDrawScope.getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public LayoutDirection getLayoutDirection() {
        return this.canvasDrawScope.getLayoutDirection();
    }

    public final void i(w41 canvas, long size, NodeCoordinator coordinator, androidx.compose.ui.b.c drawNode, GraphicsLayer layer) {
        int iA = ni8.a(4);
        androidx.compose.ui.b.c cVarJ = drawNode;
        r58 r58Var = null;
        while (cVarJ != null) {
            if (cVarJ instanceof yg3) {
                j(canvas, size, coordinator, (yg3) cVarJ, layer);
            } else if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                int i = 0;
                for (androidx.compose.ui.b.c delegate = ((k33) cVarJ).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & iA) != 0) {
                        i++;
                        if (i == 1) {
                            cVarJ = delegate;
                        } else {
                            if (r58Var == null) {
                                r58Var = new r58(new androidx.compose.ui.b.c[16], 0);
                            }
                            if (cVarJ != null) {
                                r58Var.c(cVarJ);
                                cVarJ = null;
                            }
                            r58Var.c(delegate);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            cVarJ = y23.j(r58Var);
        }
    }

    public final void j(w41 canvas, long size, NodeCoordinator coordinator, yg3 drawNode, GraphicsLayer layer) {
        yg3 yg3Var = this.drawNode;
        this.drawNode = drawNode;
        androidx.compose.ui.graphics.drawscope.a aVar = this.canvasDrawScope;
        LayoutDirection layoutDirection = coordinator.getLayoutDirection();
        f43 density = aVar.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = aVar.getDrawContext().getLayoutDirection();
        w41 w41VarB = aVar.getDrawContext().b();
        long jD = aVar.getDrawContext().d();
        GraphicsLayer graphicsLayer = aVar.getDrawContext().getGraphicsLayer();
        vg3 drawContext = aVar.getDrawContext();
        drawContext.e(coordinator);
        drawContext.a(layoutDirection);
        drawContext.i(canvas);
        drawContext.c(size);
        drawContext.h(layer);
        canvas.v();
        try {
            drawNode.j(this);
            canvas.o();
            vg3 drawContext2 = aVar.getDrawContext();
            drawContext2.e(density);
            drawContext2.a(layoutDirection2);
            drawContext2.i(w41VarB);
            drawContext2.c(jD);
            drawContext2.h(graphicsLayer);
            this.drawNode = yg3Var;
        } catch (Throwable th) {
            canvas.o();
            vg3 drawContext3 = aVar.getDrawContext();
            drawContext3.e(density);
            drawContext3.a(layoutDirection2);
            drawContext3.i(w41VarB);
            drawContext3.c(jD);
            drawContext3.h(graphicsLayer);
            throw th;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    @Override // com.google.inputmethod.fz1
    public void j1() throws KotlinNothingValueException {
        w41 w41VarB = getDrawContext().b();
        yg3 yg3Var = this.drawNode;
        if (yg3Var == null) {
            zw5.d("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
            throw new KotlinNothingValueException();
        }
        androidx.compose.ui.b.c cVarB = eo6.b(yg3Var);
        if (cVarB == 0) {
            NodeCoordinator nodeCoordinatorL = y23.l(yg3Var, ni8.a(4));
            if (nodeCoordinatorL.j3() == yg3Var.getNode()) {
                nodeCoordinatorL = nodeCoordinatorL.getWrapped();
                Intrinsics.g(nodeCoordinatorL);
            }
            nodeCoordinatorL.J3(w41VarB, getDrawContext().getGraphicsLayer());
            return;
        }
        int iA = ni8.a(4);
        r58 r58Var = null;
        while (cVarB != 0) {
            if (cVarB instanceof yg3) {
                m((yg3) cVarB, w41VarB, getDrawContext().getGraphicsLayer());
            } else if ((cVarB.getKindSet() & iA) != 0 && (cVarB instanceof k33)) {
                androidx.compose.ui.b.c delegate = ((k33) cVarB).getDelegate();
                int i = 0;
                cVarB = cVarB;
                while (delegate != null) {
                    if ((delegate.getKindSet() & iA) != 0) {
                        i++;
                        if (i == 1) {
                            cVarB = delegate;
                        } else {
                            if (r58Var == null) {
                                r58Var = new r58(new androidx.compose.ui.b.c[16], 0);
                            }
                            if (cVarB != 0) {
                                r58Var.c(cVarB);
                                cVarB = 0;
                            }
                            r58Var.c(delegate);
                        }
                    }
                    delegate = delegate.getChild();
                    cVarB = cVarB;
                }
                if (i == 1) {
                }
            }
            cVarB = y23.j(r58Var);
        }
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public void j2(qu0 brush, long topLeft, long size, long cornerRadius, float alpha, androidx.compose.ui.graphics.drawscope.b style, androidx.compose.ui.graphics.h colorFilter, int blendMode) {
        this.canvasDrawScope.j2(brush, topLeft, size, cornerRadius, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public void k2(long color, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.b style, androidx.compose.ui.graphics.h colorFilter, int blendMode) {
        this.canvasDrawScope.k2(color, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public void l1(qu0 brush, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.b style, androidx.compose.ui.graphics.h colorFilter, int blendMode) {
        this.canvasDrawScope.l1(brush, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    public final void m(yg3 yg3Var, w41 w41Var, GraphicsLayer graphicsLayer) {
        NodeCoordinator nodeCoordinatorL = y23.l(yg3Var, ni8.a(4));
        nodeCoordinatorL.getLayoutNode().n0().j(w41Var, r16.e(nodeCoordinatorL.a()), nodeCoordinatorL, yg3Var, graphicsLayer);
    }

    @Override // com.google.inputmethod.hm4
    public long s1(float f) {
        return this.canvasDrawScope.s1(f);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public void u1(qu0 brush, long start, long end, float strokeWidth, int cap, f39 pathEffect, float alpha, androidx.compose.ui.graphics.h colorFilter, int blendMode) {
        this.canvasDrawScope.u1(brush, start, end, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // com.google.inputmethod.hm4
    /* JADX INFO: renamed from: w2 */
    public float getFontScale() {
        return this.canvasDrawScope.getFontScale();
    }

    @Override // com.google.inputmethod.f43
    public float x2(float f) {
        return this.canvasDrawScope.x2(f);
    }

    public /* synthetic */ LayoutNodeDrawScope(androidx.compose.ui.graphics.drawscope.a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new androidx.compose.ui.graphics.drawscope.a() : aVar);
    }
}
