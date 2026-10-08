package androidx.compose.ui.node;

import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.s;
import com.google.inputmethod.b08;
import com.google.inputmethod.dee;
import com.google.inputmethod.fj7;
import com.google.inputmethod.g16;
import com.google.inputmethod.gj7;
import com.google.inputmethod.h16;
import com.google.inputmethod.k58;
import com.google.inputmethod.kn6;
import com.google.inputmethod.ln6;
import com.google.inputmethod.mra;
import com.google.inputmethod.q16;
import com.google.inputmethod.q4e;
import com.google.inputmethod.t04;
import com.google.inputmethod.uc;
import com.google.inputmethod.wc;
import com.google.inputmethod.zw5;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\b!\u0018\u0000 \u0081\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0082\u0001\u0083\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001c\u001a\u00020\n2\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001a0\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0018\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0086\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\nH ¢\u0006\u0004\b(\u0010\u0005J\u0013\u0010*\u001a\u00020\n*\u00020)H\u0004¢\u0006\u0004\b*\u0010+J\u001d\u0010.\u001a\u00020,2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b0\u00101J]\u0010<\u001a\u00020;2\u0006\u00102\u001a\u00020$2\u0006\u00103\u001a\u00020$2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020$042\u0014\u00108\u001a\u0010\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\n\u0018\u0001062\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\n06H\u0016¢\u0006\u0004\b<\u0010=J\u0019\u0010?\u001a\u00020\n2\b\u0010>\u001a\u0004\u0018\u00010;H\u0000¢\u0006\u0004\b?\u0010@J\u001d\u0010B\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010A\u001a\u00020,¢\u0006\u0004\bB\u0010CR\u001c\u0010G\u001a\b\u0018\u00010DR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR$\u0010J\u001a\u0010\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\n\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010M\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\"\u0010S\u001a\u00020\u001e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010!R\"\u0010W\u001a\u00020\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bT\u0010O\u001a\u0004\bU\u0010Q\"\u0004\bV\u0010!R\"\u0010[\u001a\u00020\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010O\u001a\u0004\bY\u0010Q\"\u0004\bZ\u0010!R\u0017\u0010`\u001a\u0002098\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0018\u0010d\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR0\u0010h\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001a0\u0019\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010k\u001a\u00060DR\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010n\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0016\u0010q\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0016\u0010s\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\br\u0010pR\u0014\u0010u\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\bt\u0010QR\u0014\u0010\u0007\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0014\u0010{\u001a\u00020x8&X¦\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010~\u001a\u00020;8 X \u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0015\u0010\u0080\u0001\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010Q¨\u0006\u0084\u0001"}, d2 = {"Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/o;", "Lcom/google/android/gj7;", "Lcom/google/android/b08;", "<init>", "()V", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/layout/s;", "ruler", "", "g1", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/s;)V", "t1", "(Landroidx/compose/ui/layout/s;)Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/node/n;", "placeableResult", "Lcom/google/android/g16;", "positionOnScreen", "Lcom/google/android/q16;", "size", "n1", "(Landroidx/compose/ui/node/n;JJ)V", "p1", "(Landroidx/compose/ui/node/n;)V", "Landroidx/collection/d;", "Lcom/google/android/dee;", "layoutNodes", "Y1", "(Landroidx/collection/d;)V", "", "newMFR", "z", "(Z)V", "Lcom/google/android/uc;", "alignmentLine", "", "J", "(Lcom/google/android/uc;)I", "h1", "d2", "Landroidx/compose/ui/node/NodeCoordinator;", "M1", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "", "defaultValue", "v1", "(Landroidx/compose/ui/layout/s;F)F", "N1", "(Landroidx/compose/ui/layout/s;)V", "width", "height", "", "alignmentLines", "Lkotlin/Function1;", "Lcom/google/android/mra;", "rulers", "Landroidx/compose/ui/layout/o$a;", "placementBlock", "Lcom/google/android/fj7;", "B2", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/google/android/fj7;", "result", "r1", "(Lcom/google/android/fj7;)V", "value", "b2", "(Landroidx/compose/ui/layout/s;F)V", "Landroidx/compose/ui/node/LookaheadCapablePlaceable$b;", "f", "Landroidx/compose/ui/node/LookaheadCapablePlaceable$b;", "_rulerScope", "g", "Lkotlin/jvm/functions/Function1;", "rulersLambda", "h", "Landroidx/compose/ui/node/n;", "cachedRulerPlaceableResult", "i", "Z", "P1", "()Z", "e2", "isPlacedUnderMotionFrameOfReference", "j", "X1", "i2", "isShallowPlacing", "k", "U1", "g2", "isPlacingForAlignment", "l", "Landroidx/compose/ui/layout/o$a;", "C1", "()Landroidx/compose/ui/layout/o$a;", "placementScope", "Landroidx/compose/ui/node/p;", "m", "Landroidx/compose/ui/node/p;", "rulerValues", "Lcom/google/android/k58;", "n", "Lcom/google/android/k58;", "rulerReaders", "I1", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable$b;", "rulerScope", "F1", "()J", "position", "x1", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "child", "B1", "parent", "y1", "hasMeasureResult", "a1", "()Landroidx/compose/ui/node/LayoutNode;", "Lcom/google/android/kn6;", "v", "()Lcom/google/android/kn6;", "coordinates", "z1", "()Lcom/google/android/fj7;", "measureResult", "G1", "isLookingAhead", "o", "b", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class LookaheadCapablePlaceable extends androidx.compose.ui.layout.o implements gj7, b08 {
    private static final Function1<n, Unit> p = new Function1<n, Unit>() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1
        public final void a(n nVar) {
            if (nVar.z0()) {
                nVar.getPlaceable().p1(nVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((n) obj);
            return Unit.a;
        }
    };

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private b _rulerScope;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Function1<? super mra, Unit> rulersLambda;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private n cachedRulerPlaceableResult;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean isPlacedUnderMotionFrameOfReference;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean isShallowPlacing;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean isPlacingForAlignment;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final androidx.compose.ui.layout.o.a placementScope = PlaceableKt.a(this);

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private p rulerValues;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private k58<s, androidx.collection.d<dee<LayoutNode>>> rulerReaders;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0004¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u000b\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\"¨\u0006&"}, d2 = {"Landroidx/compose/ui/node/LookaheadCapablePlaceable$b;", "Lcom/google/android/mra;", "<init>", "(Landroidx/compose/ui/node/LookaheadCapablePlaceable;)V", "Landroidx/compose/ui/layout/s;", "", "value", "", "p0", "(Landroidx/compose/ui/layout/s;F)V", "", "a", "Z", "b", "()Z", "i", "(Z)V", "coordinatesAccessed", "Lcom/google/android/g16;", "J", "f", "()J", "j", "(J)V", "positionOnScreen", "Lcom/google/android/q16;", "c", "m", "size", "Lcom/google/android/kn6;", "v", "()Lcom/google/android/kn6;", "coordinates", "getDensity", "()F", "density", "w2", "fontScale", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class b implements mra {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private boolean coordinatesAccessed;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private long positionOnScreen = g16.INSTANCE.a();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private long size = q16.INSTANCE.a();

        public b() {
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getSize() {
            return this.size;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getCoordinatesAccessed() {
            return this.coordinatesAccessed;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final long getPositionOnScreen() {
            return this.positionOnScreen;
        }

        @Override // com.google.inputmethod.f43
        public float getDensity() {
            return LookaheadCapablePlaceable.this.getDensity();
        }

        public final void i(boolean z) {
            this.coordinatesAccessed = z;
        }

        public final void j(long j) {
            this.positionOnScreen = j;
        }

        public final void m(long j) {
            this.size = j;
        }

        @Override // com.google.inputmethod.mra
        public void p0(s sVar, float f) {
            LookaheadCapablePlaceable.this.b2(sVar, f);
        }

        @Override // com.google.inputmethod.mra
        public kn6 v() {
            this.coordinatesAccessed = true;
            kn6 kn6VarV = LookaheadCapablePlaceable.this.v();
            if (g16.j(this.positionOnScreen, g16.INSTANCE.a())) {
                this.positionOnScreen = h16.d(ln6.j(kn6VarV));
                this.size = kn6VarV.a();
            }
            LookaheadCapablePlaceable.this.getLayoutNode().getLayoutDelegate().H();
            return kn6VarV;
        }

        @Override // com.google.inputmethod.hm4
        /* JADX INFO: renamed from: w2 */
        public float getFontScale() {
            return LookaheadCapablePlaceable.this.getFontScale();
        }
    }

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"androidx/compose/ui/node/LookaheadCapablePlaceable$c", "Lcom/google/android/fj7;", "", "l", "()V", "", "getWidth", "()I", "width", "getHeight", "height", "", "Lcom/google/android/uc;", "j", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Lcom/google/android/mra;", "k", "()Lkotlin/jvm/functions/Function1;", "rulers", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements fj7 {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ Map<uc, Integer> c;
        final /* synthetic */ Function1<mra, Unit> d;
        final /* synthetic */ Function1<androidx.compose.ui.layout.o.a, Unit> e;
        final /* synthetic */ LookaheadCapablePlaceable f;

        /* JADX WARN: Multi-variable type inference failed */
        c(int i, int i2, Map<uc, Integer> map, Function1<? super mra, Unit> function1, Function1<? super androidx.compose.ui.layout.o.a, Unit> function2, LookaheadCapablePlaceable lookaheadCapablePlaceable) {
            this.a = i;
            this.b = i2;
            this.c = map;
            this.d = function1;
            this.e = function2;
            this.f = lookaheadCapablePlaceable;
        }

        @Override // com.google.inputmethod.fj7
        public int getHeight() {
            return this.b;
        }

        @Override // com.google.inputmethod.fj7
        public int getWidth() {
            return this.a;
        }

        @Override // com.google.inputmethod.fj7
        public Map<uc, Integer> j() {
            return this.c;
        }

        @Override // com.google.inputmethod.fj7
        public Function1<mra, Unit> k() {
            return this.d;
        }

        @Override // com.google.inputmethod.fj7
        public void l() {
            this.e.invoke(this.f.getPlacementScope());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b I1() {
        b bVar = this._rulerScope;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this._rulerScope = bVar2;
        return bVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void Y1(androidx.collection.d<dee<LayoutNode>> layoutNodes) {
        LayoutNode layoutNode;
        Object[] objArr = layoutNodes.elements;
        long[] jArr = layoutNodes.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (layoutNode = (LayoutNode) ((dee) objArr[(i << 3) + i3]).get()) != null) {
                        if (G1()) {
                            layoutNode.D1(false);
                        } else {
                            layoutNode.H1(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:49:0x0100  */
    /* JADX WARN: Code duplicated, block: B:89:0x009f A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private final void g1(LayoutNode layoutNode, s ruler) {
        char c2;
        long j;
        long j2;
        long j3;
        int i;
        int i2;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i3;
        char c3;
        long j5;
        int i4;
        int i5;
        int i6;
        boolean z;
        k58<s, androidx.collection.d<dee<LayoutNode>>> k58Var = this.rulerReaders;
        char c4 = 7;
        long j6 = -9187201950435737472L;
        int i7 = 8;
        if (k58Var != null) {
            Object[] objArr = k58Var.values;
            long[] jArr3 = k58Var.metadata;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i8 = 0;
                j2 = 128;
                while (true) {
                    long j7 = jArr3[i8];
                    j3 = 255;
                    if ((((~j7) << c4) & j7 & j6) != j6) {
                        int i9 = 8 - ((~(i8 - length)) >>> 31);
                        int i10 = 0;
                        while (i10 < i9) {
                            if ((j7 & 255) < 128) {
                                c3 = c4;
                                androidx.collection.d dVar = (androidx.collection.d) objArr[(i8 << 3) + i10];
                                j5 = j6;
                                Object[] objArr2 = dVar.elements;
                                long[] jArr4 = dVar.metadata;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i7;
                                    int i12 = 0;
                                    while (true) {
                                        int i13 = length2;
                                        long j8 = jArr4[i12];
                                        jArr2 = jArr3;
                                        j4 = j7;
                                        if ((((~j8) << c3) & j8 & j5) != j5) {
                                            int i14 = 8 - ((~(i12 - i13)) >>> 31);
                                            int i15 = 0;
                                            while (i15 < i14) {
                                                if ((j8 & 255) < 128) {
                                                    int i16 = (i12 << 3) + i15;
                                                    LayoutNode layoutNode2 = (LayoutNode) ((dee) objArr2[i16]).get();
                                                    i5 = i15;
                                                    if (layoutNode2 != null) {
                                                        boolean zB = layoutNode2.b();
                                                        i6 = i10;
                                                        z = zB;
                                                        if (!z) {
                                                            dVar.A(i16);
                                                        }
                                                    } else {
                                                        i6 = i10;
                                                    }
                                                    if (!z) {
                                                        dVar.A(i16);
                                                    }
                                                } else {
                                                    i5 = i15;
                                                    i6 = i10;
                                                }
                                                j8 >>= i11;
                                                i15 = i5 + 1;
                                                i10 = i6;
                                            }
                                            i3 = i10;
                                            if (i14 != i11) {
                                                break;
                                            }
                                        } else {
                                            i3 = i10;
                                        }
                                        length2 = i13;
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        j7 = j4;
                                        i10 = i3;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j7;
                                    i3 = i10;
                                }
                                i4 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j7;
                                i3 = i10;
                                c3 = c4;
                                j5 = j6;
                                i4 = i7;
                            }
                            i7 = i4;
                            j7 = j4 >> i4;
                            c4 = c3;
                            j6 = j5;
                            i10 = i3 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c2 = c4;
                        j = j6;
                        if (i9 != i7) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c2 = c4;
                        j = j6;
                    }
                    if (i8 == length) {
                        break;
                    }
                    i8++;
                    c4 = c2;
                    j6 = j;
                    jArr3 = jArr;
                    i7 = 8;
                }
            } else {
                c2 = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c2 = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        k58<s, androidx.collection.d<dee<LayoutNode>>> k58Var2 = this.rulerReaders;
        if (k58Var2 != null) {
            long[] jArr5 = k58Var2.metadata;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i17 = 0;
                while (true) {
                    long j9 = jArr5[i17];
                    if ((((~j9) << c2) & j9 & j) != j) {
                        int i18 = 8 - ((~(i17 - length3)) >>> 31);
                        for (int i19 = 0; i19 < i18; i19++) {
                            if ((j9 & j3) < j2) {
                                int i20 = (i17 << 3) + i19;
                                if (((androidx.collection.d) k58Var2.values[i20]).d()) {
                                    k58Var2.v(i20);
                                }
                            }
                            j9 >>= 8;
                        }
                        if (i18 != 8) {
                            break;
                        }
                    }
                    if (i17 == length3) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
        }
        k58<s, androidx.collection.d<dee<LayoutNode>>> k58Var3 = this.rulerReaders;
        if (k58Var3 == null) {
            i = 0;
            i2 = 1;
            k58Var3 = new k58<>(0, 1, null);
            this.rulerReaders = k58Var3;
        } else {
            i = 0;
            i2 = 1;
        }
        androidx.collection.d<dee<LayoutNode>> dVarE = k58Var3.e(ruler);
        if (dVarE == null) {
            dVarE = new androidx.collection.d<>(i, i2, null);
            k58Var3.x(ruler, dVarE);
        }
        dVarE.x(new dee<>(layoutNode));
    }

    private final void n1(final n placeableResult, final long positionOnScreen, final long size) {
        OwnerSnapshotObserver snapshotObserver;
        k58<s, androidx.collection.d<dee<LayoutNode>>> k58Var = this.rulerReaders;
        p pVar = this.rulerValues;
        if (pVar == null) {
            pVar = new p();
            this.rulerValues = pVar;
        }
        m owner = getLayoutNode().getOwner();
        if (owner != null && (snapshotObserver = owner.getSnapshotObserver()) != null) {
            snapshotObserver.observer.k(placeableResult, p, new Function0<Unit>() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$captureRulers$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m24invoke();
                    return Unit.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m24invoke() {
                    this.this$0.I1().i(false);
                    this.this$0.I1().j(positionOnScreen);
                    this.this$0.I1().m(size);
                    Function1<mra, Unit> function1K = placeableResult.getResult().k();
                    if (function1K != null) {
                        function1K.invoke(this.this$0.I1());
                    }
                }
            });
        }
        pVar.d(G1(), this, k58Var);
    }

    static /* synthetic */ void o1(LookaheadCapablePlaceable lookaheadCapablePlaceable, n nVar, long j, long j2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: captureRulers-OSxE8f4");
        }
        if ((i & 2) != 0) {
            j = g16.INSTANCE.a();
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = q16.INSTANCE.a();
        }
        lookaheadCapablePlaceable.n1(nVar, j3, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[LOOP:0: B:11:0x001e->B:21:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0058 A[EDGE_INSN: B:27:0x0058->B:22:0x0058 BREAK  A[LOOP:0: B:11:0x001e->B:21:0x0055], SYNTHETIC] */
    public final void p1(n placeableResult) {
        if (this.isPlacingForAlignment) {
            return;
        }
        Function1<mra, Unit> function1K = placeableResult.getResult().k();
        k58<s, androidx.collection.d<dee<LayoutNode>>> k58Var = this.rulerReaders;
        if (function1K != null) {
            o1(this, placeableResult, 0L, 0L, 6, null);
            this.rulersLambda = function1K;
            return;
        }
        if (k58Var != null) {
            Object[] objArr = k58Var.values;
            long[] jArr = k58Var.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Y1((androidx.collection.d) objArr[(i << 3) + i3]);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            k58Var.k();
        }
    }

    private final LookaheadCapablePlaceable t1(s ruler) {
        LookaheadCapablePlaceable lookaheadCapablePlaceableB1;
        LookaheadCapablePlaceable lookaheadCapablePlaceable = this;
        while (true) {
            p pVar = lookaheadCapablePlaceable.rulerValues;
            if ((pVar != null && pVar.b(ruler)) || (lookaheadCapablePlaceableB1 = lookaheadCapablePlaceable.B1()) == null) {
                return lookaheadCapablePlaceable;
            }
            lookaheadCapablePlaceable = lookaheadCapablePlaceableB1;
        }
    }

    public abstract LookaheadCapablePlaceable B1();

    @Override // androidx.compose.ui.layout.j
    public fj7 B2(int width, int height, Map<uc, Integer> alignmentLines, Function1<? super mra, Unit> rulers, Function1<? super androidx.compose.ui.layout.o.a, Unit> placementBlock) {
        if (!((width & (-16777216)) == 0 && ((-16777216) & height) == 0)) {
            zw5.c("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new c(width, height, alignmentLines, rulers, placementBlock, this);
    }

    /* JADX INFO: renamed from: C1, reason: from getter */
    public final androidx.compose.ui.layout.o.a getPlacementScope() {
        return this.placementScope;
    }

    /* JADX INFO: renamed from: F1 */
    public abstract long getPosition();

    @Override // com.google.inputmethod.h66
    public boolean G1() {
        return false;
    }

    @Override // com.google.inputmethod.ij7
    public final int J(uc alignmentLine) {
        int iH1;
        if (y1() && (iH1 = h1(alignmentLine)) != Integer.MIN_VALUE) {
            return iH1 + (alignmentLine instanceof q4e ? g16.k(getApparentToRealOffset()) : g16.l(getApparentToRealOffset()));
        }
        return t04.INVALID_ID;
    }

    protected final void M1(NodeCoordinator nodeCoordinator) {
        AlignmentLines alignmentLinesJ;
        NodeCoordinator wrapped = nodeCoordinator.getWrapped();
        if (!Intrinsics.e(wrapped != null ? wrapped.getLayoutNode() : null, nodeCoordinator.getLayoutNode())) {
            nodeCoordinator.X2().j().m();
            return;
        }
        wc wcVarA0 = nodeCoordinator.X2().a0();
        if (wcVarA0 == null || (alignmentLinesJ = wcVarA0.j()) == null) {
            return;
        }
        alignmentLinesJ.m();
    }

    public final void N1(s ruler) {
        k58<s, androidx.collection.d<dee<LayoutNode>>> k58Var = t1(ruler).rulerReaders;
        androidx.collection.d<dee<LayoutNode>> dVarU = k58Var != null ? k58Var.u(ruler) : null;
        if (dVarU != null) {
            Y1(dVarU);
        }
    }

    /* JADX INFO: renamed from: P1, reason: from getter */
    public boolean getIsPlacedUnderMotionFrameOfReference() {
        return this.isPlacedUnderMotionFrameOfReference;
    }

    /* JADX INFO: renamed from: U1, reason: from getter */
    public final boolean getIsPlacingForAlignment() {
        return this.isPlacingForAlignment;
    }

    /* JADX INFO: renamed from: X1, reason: from getter */
    public final boolean getIsShallowPlacing() {
        return this.isShallowPlacing;
    }

    @Override // com.google.inputmethod.gj7
    /* JADX INFO: renamed from: a1 */
    public abstract LayoutNode getLayoutNode();

    public final void b2(s ruler, float value) {
        p pVar = this.rulerValues;
        if (pVar == null) {
            pVar = new p();
            this.rulerValues = pVar;
        }
        pVar.e(ruler, value);
    }

    public abstract void d2();

    public void e2(boolean z) {
        this.isPlacedUnderMotionFrameOfReference = z;
    }

    public final void g2(boolean z) {
        this.isPlacingForAlignment = z;
    }

    public abstract int h1(uc alignmentLine);

    public final void i2(boolean z) {
        this.isShallowPlacing = z;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0119 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x011b A[LOOP:2: B:57:0x00ee->B:67:0x011b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x011e A[EDGE_INSN: B:80:0x011e->B:68:0x011e BREAK  A[LOOP:2: B:57:0x00ee->B:67:0x011b], SYNTHETIC] */
    public final void r1(fj7 result) {
        char c2;
        k58<s, androidx.collection.d<dee<LayoutNode>>> k58Var = this.rulerReaders;
        char c3 = 7;
        if (result == null) {
            if (k58Var != null) {
                Object[] objArr = k58Var.values;
                long[] jArr = k58Var.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((j & 255) < 128) {
                                    Y1((androidx.collection.d) objArr[(i << 3) + i3]);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            if (k58Var != null) {
                k58Var.k();
            }
            p pVar = this.rulerValues;
            if (pVar != null) {
                pVar.a();
                return;
            }
            return;
        }
        if (this.isPlacingForAlignment) {
            return;
        }
        Function1<mra, Unit> function1K = result.k();
        if (function1K != null) {
            boolean z = this.rulersLambda != function1K;
            long jA = g16.INSTANCE.a();
            long jA2 = q16.INSTANCE.a();
            if (!z && I1().getCoordinatesAccessed()) {
                kn6 kn6VarV = v();
                jA = h16.d(ln6.j(kn6VarV));
                jA2 = kn6VarV.a();
                z = (g16.j(jA, I1().getPositionOnScreen()) && q16.f(jA2, I1().getSize())) ? false : true;
            }
            long j2 = jA;
            long j3 = jA2;
            if (z) {
                n nVar = this.cachedRulerPlaceableResult;
                if (nVar != null) {
                    nVar.c(result);
                } else {
                    nVar = new n(result, this);
                    this.cachedRulerPlaceableResult = nVar;
                }
                n1(nVar, j2, j3);
                this.rulersLambda = result.k();
                return;
            }
            return;
        }
        if (k58Var != null) {
            Object[] objArr2 = k58Var.values;
            long[] jArr2 = k58Var.metadata;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i4 = 0;
                while (true) {
                    long j4 = jArr2[i4];
                    if ((((~j4) << c3) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length2)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j4 & 255) < 128) {
                                Y1((androidx.collection.d) objArr2[(i4 << 3) + i6]);
                            }
                            j4 >>= 8;
                            i6++;
                            c3 = c3;
                        }
                        c2 = c3;
                        if (i5 != 8) {
                            break;
                        }
                    } else {
                        c2 = c3;
                    }
                    if (i4 == length2) {
                        break;
                    }
                    i4++;
                    c3 = c2;
                }
            }
            k58Var.k();
        }
    }

    public abstract kn6 v();

    public final float v1(s ruler, float defaultValue) {
        if (this.isPlacingForAlignment) {
            return defaultValue;
        }
        LookaheadCapablePlaceable lookaheadCapablePlaceable = this;
        while (true) {
            p pVar = lookaheadCapablePlaceable.rulerValues;
            float fC = pVar != null ? pVar.c(ruler, Float.NaN) : Float.NaN;
            if (!Float.isNaN(fC)) {
                lookaheadCapablePlaceable.g1(getLayoutNode(), ruler);
                return ruler.a(fC, lookaheadCapablePlaceable.v(), v());
            }
            LookaheadCapablePlaceable lookaheadCapablePlaceableB1 = lookaheadCapablePlaceable.B1();
            if (lookaheadCapablePlaceableB1 == null) {
                lookaheadCapablePlaceable.g1(getLayoutNode(), ruler);
                return defaultValue;
            }
            lookaheadCapablePlaceable = lookaheadCapablePlaceableB1;
        }
    }

    public abstract LookaheadCapablePlaceable x1();

    public abstract boolean y1();

    @Override // com.google.inputmethod.b08
    public void z(boolean newMFR) {
        LookaheadCapablePlaceable lookaheadCapablePlaceableB1 = B1();
        LayoutNode layoutNode = lookaheadCapablePlaceableB1 != null ? lookaheadCapablePlaceableB1.getLayoutNode() : null;
        if (Intrinsics.e(layoutNode, getLayoutNode())) {
            e2(newMFR);
            return;
        }
        if ((layoutNode != null ? layoutNode.i0() : null) != LayoutNode.LayoutState.LayingOut) {
            if ((layoutNode != null ? layoutNode.i0() : null) != LayoutNode.LayoutState.LookaheadLayingOut) {
                return;
            }
        }
        e2(newMFR);
    }

    public abstract fj7 z1();
}
