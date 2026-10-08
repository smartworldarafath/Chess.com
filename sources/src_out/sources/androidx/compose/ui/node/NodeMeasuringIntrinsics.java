package androidx.compose.ui.node;

import com.google.inputmethod.dj7;
import com.google.inputmethod.f66;
import com.google.inputmethod.fj7;
import com.google.inputmethod.fz;
import com.google.inputmethod.gz;
import com.google.inputmethod.h66;
import com.google.inputmethod.kx1;
import com.google.inputmethod.nx1;
import com.google.inputmethod.q16;
import com.google.inputmethod.t04;
import com.google.inputmethod.uc;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001:\u0006\u0016\u0011\u0017\u0010\u0018\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\rJ/\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0010\u0010\rJ/\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0011\u0010\rJ/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\u0014J/\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0015\u0010\u0014J/\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0016\u0010\u0014J/\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0017\u0010\u0014¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics;", "", "<init>", "()V", "Landroidx/compose/ui/node/NodeMeasuringIntrinsics$a;", "measureBlock", "Lcom/google/android/fz;", "intrinsicMeasureScope", "Lcom/google/android/f66;", "intrinsicMeasurable", "", "h", "g", "(Landroidx/compose/ui/node/NodeMeasuringIntrinsics$a;Lcom/google/android/fz;Lcom/google/android/f66;I)I", "w", "e", "c", "a", "Landroidx/compose/ui/node/NodeMeasuringIntrinsics$d;", "Lcom/google/android/h66;", "(Landroidx/compose/ui/node/NodeMeasuringIntrinsics$d;Lcom/google/android/h66;Lcom/google/android/f66;I)I", "f", "d", "b", "IntrinsicMinMax", "IntrinsicWidthHeight", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NodeMeasuringIntrinsics {
    public static final NodeMeasuringIntrinsics a = new NodeMeasuringIntrinsics();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicMinMax;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private enum IntrinsicMinMax {
        Min,
        Max;

        private static final /* synthetic */ EnumEntries d = kotlin.enums.a.a(a());
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicWidthHeight;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private enum IntrinsicWidthHeight {
        Width,
        Height;

        private static final /* synthetic */ EnumEntries d = kotlin.enums.a.a(a());
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J#\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics$a;", "", "Lcom/google/android/gz;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "a", "(Lcom/google/android/gz;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        fj7 a(gz gzVar, dj7 dj7Var, long j);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010&\u001a\u0004\u0018\u00010#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics$b;", "Lcom/google/android/dj7;", "Lcom/google/android/f66;", "measurable", "Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicMinMax;", "minMax", "Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicWidthHeight;", "widthHeight", "<init>", "(Lcom/google/android/f66;Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicMinMax;Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicWidthHeight;)V", "Lcom/google/android/kx1;", "constraints", "Landroidx/compose/ui/layout/o;", "r0", "(J)Landroidx/compose/ui/layout/o;", "", "height", "o0", "(I)I", "q0", "width", "d0", "W", "a", "Lcom/google/android/f66;", "getMeasurable", "()Lcom/google/android/f66;", "b", "Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicMinMax;", "getMinMax", "()Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicMinMax;", "c", "Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicWidthHeight;", "getWidthHeight", "()Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicWidthHeight;", "", "f", "()Ljava/lang/Object;", "parentData", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b implements dj7 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final f66 measurable;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final IntrinsicMinMax minMax;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final IntrinsicWidthHeight widthHeight;

        public b(f66 f66Var, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
            this.measurable = f66Var;
            this.minMax = intrinsicMinMax;
            this.widthHeight = intrinsicWidthHeight;
        }

        @Override // com.google.inputmethod.f66
        public int W(int width) {
            return this.measurable.W(width);
        }

        @Override // com.google.inputmethod.f66
        public int d0(int width) {
            return this.measurable.d0(width);
        }

        @Override // com.google.inputmethod.f66
        public Object f() {
            return this.measurable.f();
        }

        @Override // com.google.inputmethod.f66
        public int o0(int height) {
            return this.measurable.o0(height);
        }

        @Override // com.google.inputmethod.f66
        public int q0(int height) {
            return this.measurable.q0(height);
        }

        @Override // com.google.inputmethod.dj7
        public androidx.compose.ui.layout.o r0(long constraints) {
            if (this.widthHeight == IntrinsicWidthHeight.Width) {
                return new c(this.minMax == IntrinsicMinMax.Max ? this.measurable.q0(kx1.k(constraints)) : this.measurable.o0(kx1.k(constraints)), kx1.g(constraints) ? kx1.k(constraints) : 32767);
            }
            return new c(kx1.h(constraints) ? kx1.l(constraints) : 32767, this.minMax == IntrinsicMinMax.Max ? this.measurable.W(kx1.l(constraints)) : this.measurable.d0(kx1.l(constraints)));
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0013\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics$c;", "Landroidx/compose/ui/layout/o;", "", "width", "height", "<init>", "(II)V", "Lcom/google/android/uc;", "alignmentLine", "J", "(Lcom/google/android/uc;)I", "Lcom/google/android/g16;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/m;", "", "layerBlock", "X0", "(JFLkotlin/jvm/functions/Function1;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class c extends androidx.compose.ui.layout.o {
        public c(int i, int i2) {
            Y0(q16.c((((long) i2) & 4294967295L) | (((long) i) << 32)));
        }

        @Override // com.google.inputmethod.ij7
        public int J(uc alignmentLine) {
            return t04.INVALID_ID;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.o
        public void X0(long position, float zIndex, Function1<? super androidx.compose.ui.graphics.m, Unit> layerBlock) {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J#\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics$d;", "", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface d {
        fj7 b(androidx.compose.ui.layout.j jVar, dj7 dj7Var, long j);
    }

    private NodeMeasuringIntrinsics() {
    }

    public final int a(a measureBlock, fz intrinsicMeasureScope, f66 intrinsicMeasurable, int w) {
        return measureBlock.a(new androidx.compose.ui.layout.a(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Height), nx1.b(0, w, 0, 0, 13, null)).getB();
    }

    public final int b(d measureBlock, h66 intrinsicMeasureScope, f66 intrinsicMeasurable, int w) {
        return measureBlock.b(new androidx.compose.ui.layout.f(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Height), nx1.b(0, w, 0, 0, 13, null)).getB();
    }

    public final int c(a measureBlock, fz intrinsicMeasureScope, f66 intrinsicMeasurable, int h) {
        return measureBlock.a(new androidx.compose.ui.layout.a(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Width), nx1.b(0, 0, 0, h, 7, null)).getA();
    }

    public final int d(d measureBlock, h66 intrinsicMeasureScope, f66 intrinsicMeasurable, int h) {
        return measureBlock.b(new androidx.compose.ui.layout.f(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Width), nx1.b(0, 0, 0, h, 7, null)).getA();
    }

    public final int e(a measureBlock, fz intrinsicMeasureScope, f66 intrinsicMeasurable, int w) {
        return measureBlock.a(new androidx.compose.ui.layout.a(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Height), nx1.b(0, w, 0, 0, 13, null)).getB();
    }

    public final int f(d measureBlock, h66 intrinsicMeasureScope, f66 intrinsicMeasurable, int w) {
        return measureBlock.b(new androidx.compose.ui.layout.f(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Height), nx1.b(0, w, 0, 0, 13, null)).getB();
    }

    public final int g(a measureBlock, fz intrinsicMeasureScope, f66 intrinsicMeasurable, int h) {
        return measureBlock.a(new androidx.compose.ui.layout.a(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Width), nx1.b(0, 0, 0, h, 7, null)).getA();
    }

    public final int h(d measureBlock, h66 intrinsicMeasureScope, f66 intrinsicMeasurable, int h) {
        return measureBlock.b(new androidx.compose.ui.layout.f(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Width), nx1.b(0, 0, 0, h, 7, null)).getA();
    }
}
