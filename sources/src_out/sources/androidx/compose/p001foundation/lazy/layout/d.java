package androidx.compose.p001foundation.lazy.layout;

import androidx.compose.ui.b;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import com.google.android.ta2;
import com.google.android.zk1;
import com.google.inputmethod.bu6;
import com.google.inputmethod.et6;
import com.google.inputmethod.fz1;
import com.google.inputmethod.g16;
import com.google.inputmethod.i05;
import com.google.inputmethod.k05;
import com.google.inputmethod.k4b;
import com.google.inputmethod.k58;
import com.google.inputmethod.kx1;
import com.google.inputmethod.l4b;
import com.google.inputmethod.ot6;
import com.google.inputmethod.q16;
import com.google.inputmethod.ts6;
import com.google.inputmethod.uy7;
import com.google.inputmethod.yg3;
import com.google.inputmethod.yt6;
import com.google.inputmethod.zg3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0003947B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0005J3\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0012\b\u0002\u0010\u000f\u001a\f0\u000eR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\f*\u00020\u00162\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0089\u0001\u0010,\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0007¢\u0006\u0004\b.\u0010\u0005J\u001f\u00101\u001a\u0004\u0018\u0001002\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\f¢\u0006\u0004\b1\u00102R*\u00106\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u000e\u0012\f0\u000eR\b\u0012\u0004\u0012\u00028\u00000\u0000038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00030<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010@R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010@R\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010@R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u0002000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010@R\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0017\u0010Q\u001a\u00020N8\u0006¢\u0006\f\n\u0004\b\u0010\u0010O\u001a\u0004\bK\u0010PR\u0018\u0010S\u001a\u00020\u0012*\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010RR\u0018\u0010\r\u001a\u00020\f*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010TR\u0018\u0010U\u001a\u00020\f*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010TR\u0011\u0010X\u001a\u00020V8F¢\u0006\u0006\u001a\u0004\bH\u0010W¨\u0006Y"}, d2 = {"Landroidx/compose/foundation/lazy/layout/d;", "Lcom/google/android/yt6;", "T", "", "<init>", "()V", "key", "", "o", "(Ljava/lang/Object;)V", "n", "item", "", "mainAxisOffset", "Landroidx/compose/foundation/lazy/layout/d$c;", "itemInfo", "k", "(Lcom/google/android/yt6;ILandroidx/compose/foundation/lazy/layout/d$c;)V", "", "isMovingAway", "q", "(Lcom/google/android/yt6;Z)V", "", "s", "([ILcom/google/android/yt6;)I", "consumedScroll", "layoutWidth", "layoutHeight", "", "positionedItems", "Lcom/google/android/ot6;", "keyIndexMap", "Lcom/google/android/bu6;", "itemProvider", "isVertical", "isLookingAhead", "laneCount", "hasLookaheadOccurred", "layoutMinOffset", "layoutMaxOffset", "Lcom/google/android/ta2;", "coroutineScope", "Lcom/google/android/i05;", "graphicsContext", "m", "(IIILjava/util/List;Lcom/google/android/ot6;Lcom/google/android/bu6;ZZIZIILcom/google/android/ta2;Lcom/google/android/i05;)V", "p", "placeableIndex", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "e", "(Ljava/lang/Object;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "Lcom/google/android/k58;", "a", "Lcom/google/android/k58;", "keyToItemInfoMap", "b", "Lcom/google/android/ot6;", "c", "I", "firstVisibleIndex", "Landroidx/collection/d;", "d", "Landroidx/collection/d;", "movingAwayKeys", "Ljava/util/List;", "movingInFromStartBound", "f", "movingInFromEndBound", "g", "movingAwayToStartBound", "h", "movingAwayToEndBound", "i", "disappearingItems", "Lcom/google/android/yg3;", "j", "Lcom/google/android/yg3;", "displayingNode", "Landroidx/compose/ui/b;", "Landroidx/compose/ui/b;", "()Landroidx/compose/ui/b;", "modifier", "(Lcom/google/android/yt6;)Z", "hasAnimations", "(Lcom/google/android/yt6;)I", "crossAxisOffset", "Lcom/google/android/q16;", "()J", "minSizeToFitDisappearingItems", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d<T extends yt6> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private ot6 keyIndexMap;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int firstVisibleIndex;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private yg3 displayingNode;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final k58<Object, d<T>.c> keyToItemInfoMap = k4b.c();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final androidx.collection.d<Object> movingAwayKeys = l4b.b();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<T> movingInFromStartBound = new ArrayList();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<T> movingInFromEndBound = new ArrayList();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<T> movingAwayToStartBound = new ArrayList();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final List<T> movingAwayToEndBound = new ArrayList();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final List<LazyLayoutItemAnimation> disappearingItems = new ArrayList();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final b modifier = new DisplayingDisappearingItemsElement(this);

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/lazy/layout/d$a;", "Lcom/google/android/uy7;", "Landroidx/compose/foundation/lazy/layout/d$b;", "Landroidx/compose/foundation/lazy/layout/d;", "animator", "<init>", "(Landroidx/compose/foundation/lazy/layout/d;)V", "d", "()Landroidx/compose/foundation/lazy/layout/d$b;", "node", "", "e", "(Landroidx/compose/foundation/lazy/layout/d$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/foundation/lazy/layout/d;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class DisplayingDisappearingItemsElement extends uy7<DisplayingDisappearingItemsNode> {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        private final d<?> animator;

        public DisplayingDisappearingItemsElement(d<?> dVar) {
            this.animator = dVar;
        }

        @Override // com.google.inputmethod.uy7
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public DisplayingDisappearingItemsNode a() {
            return new DisplayingDisappearingItemsNode(this.animator);
        }

        @Override // com.google.inputmethod.uy7
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(DisplayingDisappearingItemsNode node) {
            node.m3(this.animator);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisplayingDisappearingItemsElement) && Intrinsics.e(this.animator, ((DisplayingDisappearingItemsElement) other).animator);
        }

        public int hashCode() {
            return this.animator.hashCode();
        }

        public String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.animator + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.d$b, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u000e\u001a\u00020\b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u000e\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/lazy/layout/d$b;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/yg3;", "Landroidx/compose/foundation/lazy/layout/d;", "animator", "<init>", "(Landroidx/compose/foundation/lazy/layout/d;)V", "Lcom/google/android/fz1;", "", "j", "(Lcom/google/android/fz1;)V", "V2", "()V", "W2", "m3", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "p", "Landroidx/compose/foundation/lazy/layout/d;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class DisplayingDisappearingItemsNode extends b.c implements yg3 {

        /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
        private d<?> animator;

        public DisplayingDisappearingItemsNode(d<?> dVar) {
            this.animator = dVar;
        }

        @Override // androidx.compose.ui.b.c
        public void V2() {
            ((d) this.animator).displayingNode = this;
        }

        @Override // androidx.compose.ui.b.c
        public void W2() {
            this.animator.p();
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisplayingDisappearingItemsNode) && Intrinsics.e(this.animator, ((DisplayingDisappearingItemsNode) other).animator);
        }

        public int hashCode() {
            return this.animator.hashCode();
        }

        @Override // com.google.inputmethod.yg3
        public void j(fz1 fz1Var) {
            List list = ((d) this.animator).disappearingItems;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation = (LazyLayoutItemAnimation) list.get(i);
                GraphicsLayer layer = lazyLayoutItemAnimation.getLayer();
                if (layer != null) {
                    float fK = g16.k(lazyLayoutItemAnimation.getFinalOffset());
                    float fL = g16.l(lazyLayoutItemAnimation.getFinalOffset());
                    float fK2 = fK - g16.k(layer.getTopLeft());
                    float fL2 = fL - g16.l(layer.getTopLeft());
                    fz1Var.getDrawContext().getTransform().c(fK2, fL2);
                    try {
                        k05.a(fz1Var, layer);
                        fz1Var.getDrawContext().getTransform().c(-fK2, -fL2);
                    } catch (Throwable th) {
                        fz1Var.getDrawContext().getTransform().c(-fK2, -fL2);
                        throw th;
                    }
                }
            }
            fz1Var.j1();
        }

        public final void m3(d<?> animator) {
            if (Intrinsics.e(this.animator, animator) || !getNode().getIsAttached()) {
                return;
            }
            this.animator.p();
            ((d) animator).displayingNode = this;
            this.animator = animator;
        }

        public String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.animator + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR4\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010&\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001f\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\"\u0010)\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b'\u0010!\"\u0004\b(\u0010#R$\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010!R$\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b*\u0010!R\u0014\u0010/\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Landroidx/compose/foundation/lazy/layout/d$c;", "", "<init>", "(Landroidx/compose/foundation/lazy/layout/d;)V", "positionedItem", "Lcom/google/android/ta2;", "coroutineScope", "Lcom/google/android/i05;", "graphicsContext", "", "layoutMinOffset", "layoutMaxOffset", "crossAxisOffset", "", "l", "(Lcom/google/android/yt6;Lcom/google/android/ta2;Lcom/google/android/i05;III)V", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "value", "a", "[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "b", "()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "animations", "Lcom/google/android/kx1;", "Lcom/google/android/kx1;", "c", "()Lcom/google/android/kx1;", "setConstraints-_Sx5XlM", "(Lcom/google/android/kx1;)V", "constraints", "I", "d", "()I", "setCrossAxisOffset", "(I)V", "e", "j", "lane", "h", "k", "span", "f", "g", "", "i", "()Z", "isRunningPlacement", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class c {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private kx1 constraints;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private int crossAxisOffset;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private int lane;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private int layoutMinOffset;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private int layoutMaxOffset;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private LazyLayoutItemAnimation[] animations = et6.a;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private int span = 1;

        public c() {
        }

        private final boolean i() {
            for (LazyLayoutItemAnimation lazyLayoutItemAnimation : this.animations) {
                if (lazyLayoutItemAnimation != null && lazyLayoutItemAnimation.getIsRunningMovingAwayAnimation()) {
                    return true;
                }
            }
            return false;
        }

        public static /* synthetic */ void m(c cVar, yt6 yt6Var, ta2 ta2Var, i05 i05Var, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 32) != 0) {
                i3 = d.this.f(yt6Var);
            }
            cVar.l(yt6Var, ta2Var, i05Var, i, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(d dVar) {
            yg3 yg3Var = dVar.displayingNode;
            if (yg3Var != null) {
                zg3.a(yg3Var);
            }
            return Unit.a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LazyLayoutItemAnimation[] getAnimations() {
            return this.animations;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final kx1 getConstraints() {
            return this.constraints;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getCrossAxisOffset() {
            return this.crossAxisOffset;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getLane() {
            return this.lane;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getLayoutMaxOffset() {
            return this.layoutMaxOffset;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getLayoutMinOffset() {
            return this.layoutMinOffset;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getSpan() {
            return this.span;
        }

        public final void j(int i) {
            this.lane = i;
        }

        public final void k(int i) {
            this.span = i;
        }

        public final void l(T positionedItem, ta2 coroutineScope, i05 graphicsContext, int layoutMinOffset, int layoutMaxOffset, int crossAxisOffset) {
            if (!i()) {
                this.layoutMinOffset = layoutMinOffset;
                this.layoutMaxOffset = layoutMaxOffset;
            }
            int length = this.animations.length;
            for (int iB = positionedItem.b(); iB < length; iB++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation = this.animations[iB];
                if (lazyLayoutItemAnimation != null) {
                    lazyLayoutItemAnimation.y();
                }
            }
            if (this.animations.length != positionedItem.b()) {
                Object[] objArrCopyOf = Arrays.copyOf(this.animations, positionedItem.b());
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                this.animations = (LazyLayoutItemAnimation[]) objArrCopyOf;
            }
            this.constraints = kx1.a(positionedItem.getConstraints());
            this.crossAxisOffset = crossAxisOffset;
            this.lane = positionedItem.getLane();
            this.span = positionedItem.getSpan();
            int iB2 = positionedItem.b();
            final d<T> dVar = d.this;
            for (int i = 0; i < iB2; i++) {
                ts6 ts6VarC = et6.c(positionedItem.m(i));
                if (ts6VarC == null) {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation2 = this.animations[i];
                    if (lazyLayoutItemAnimation2 != null) {
                        lazyLayoutItemAnimation2.y();
                    }
                    this.animations[i] = null;
                } else {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation3 = this.animations[i];
                    if (lazyLayoutItemAnimation3 == null) {
                        lazyLayoutItemAnimation3 = new LazyLayoutItemAnimation(coroutineScope, graphicsContext, new Function0() { // from class: androidx.compose.foundation.lazy.layout.e
                            public final Object invoke() {
                                return d.c.n(dVar);
                            }
                        });
                        this.animations[i] = lazyLayoutItemAnimation3;
                    }
                    lazyLayoutItemAnimation3.C(ts6VarC.m3());
                    lazyLayoutItemAnimation3.I(ts6VarC.o3());
                    lazyLayoutItemAnimation3.D(ts6VarC.n3());
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.d$d, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C0021d<T> implements Comparator {
        final /* synthetic */ ot6 a;

        public C0021d(ot6 ot6Var) {
            this.a = ot6Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return zk1.e(Integer.valueOf(this.a.c(((yt6) t).getKey())), Integer.valueOf(this.a.c(((yt6) t2).getKey())));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class e<T> implements Comparator {
        final /* synthetic */ ot6 a;

        public e(ot6 ot6Var) {
            this.a = ot6Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return zk1.e(Integer.valueOf(this.a.c(((yt6) t).getKey())), Integer.valueOf(this.a.c(((yt6) t2).getKey())));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class f<T> implements Comparator {
        final /* synthetic */ ot6 a;

        public f(ot6 ot6Var) {
            this.a = ot6Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return zk1.e(Integer.valueOf(this.a.c(((yt6) t2).getKey())), Integer.valueOf(this.a.c(((yt6) t).getKey())));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class g<T> implements Comparator {
        final /* synthetic */ ot6 a;

        public g(ot6 ot6Var) {
            this.a = ot6Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return zk1.e(Integer.valueOf(this.a.c(((yt6) t2).getKey())), Integer.valueOf(this.a.c(((yt6) t).getKey())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int f(yt6 yt6Var) {
        long jN = yt6Var.n(0);
        return !yt6Var.getIsVertical() ? g16.l(jN) : g16.k(jN);
    }

    private final boolean g(T t) {
        int iB = t.b();
        for (int i = 0; i < iB; i++) {
            if (et6.c(t.m(i)) != null) {
                return true;
            }
        }
        return false;
    }

    private final int h(yt6 yt6Var) {
        long jN = yt6Var.n(0);
        return yt6Var.getIsVertical() ? g16.l(jN) : g16.k(jN);
    }

    private final void k(T item, int mainAxisOffset, d<T>.c itemInfo) {
        int i = 0;
        long jN = item.n(0);
        long jH = item.getIsVertical() ? g16.h(jN, 0, mainAxisOffset, 1, null) : g16.h(jN, mainAxisOffset, 0, 2, null);
        LazyLayoutItemAnimation[] animations = itemInfo.getAnimations();
        int length = animations.length;
        int i2 = 0;
        while (i < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = animations[i];
            int i3 = i2 + 1;
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.J(g16.o(jH, g16.n(item.n(i2), jN)));
            }
            i++;
            i2 = i3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void l(d dVar, yt6 yt6Var, int i, c cVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            d<T>.c cVarE = dVar.keyToItemInfoMap.e(yt6Var.getKey());
            Intrinsics.g(cVarE);
            cVar = cVarE;
        }
        dVar.k(yt6Var, i, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x005b A[LOOP:0: B:7:0x0015->B:22:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x005e A[EDGE_INSN: B:26:0x005e->B:23:0x005e BREAK  A[LOOP:0: B:7:0x0015->B:22:0x005b], SYNTHETIC] */
    private final void n() {
        if (this.keyToItemInfoMap.i()) {
            k58<Object, d<T>.c> k58Var = this.keyToItemInfoMap;
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
                                for (LazyLayoutItemAnimation lazyLayoutItemAnimation : ((c) objArr[(i << 3) + i3]).getAnimations()) {
                                    if (lazyLayoutItemAnimation != null) {
                                        lazyLayoutItemAnimation.y();
                                    }
                                }
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
            this.keyToItemInfoMap.k();
        }
    }

    private final void o(Object key) {
        LazyLayoutItemAnimation[] animations;
        d<T>.c cVarU = this.keyToItemInfoMap.u(key);
        if (cVarU == null || (animations = cVarU.getAnimations()) == null) {
            return;
        }
        for (LazyLayoutItemAnimation lazyLayoutItemAnimation : animations) {
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.y();
            }
        }
    }

    private final void q(T item, boolean isMovingAway) {
        d<T>.c cVarE = this.keyToItemInfoMap.e(item.getKey());
        Intrinsics.g(cVarE);
        LazyLayoutItemAnimation[] animations = cVarE.getAnimations();
        int length = animations.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = animations[i];
            int i3 = i2 + 1;
            if (lazyLayoutItemAnimation != null) {
                long jN = item.n(i2);
                long rawOffset = lazyLayoutItemAnimation.getRawOffset();
                if (!g16.j(rawOffset, LazyLayoutItemAnimation.INSTANCE.a()) && !g16.j(rawOffset, jN)) {
                    lazyLayoutItemAnimation.m(g16.n(jN, rawOffset), isMovingAway);
                }
                lazyLayoutItemAnimation.J(jN);
            }
            i++;
            i2 = i3;
        }
    }

    static /* synthetic */ void r(d dVar, yt6 yt6Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        dVar.q(yt6Var, z);
    }

    private final int s(int[] iArr, T t) {
        int iE = t.getLane();
        int iJ = t.getSpan() + iE;
        int iMax = 0;
        while (iE < iJ) {
            int iL = iArr[iE] + t.getMainAxisSizeWithSpacings();
            iArr[iE] = iL;
            iMax = Math.max(iMax, iL);
            iE++;
        }
        return iMax;
    }

    public final LazyLayoutItemAnimation e(Object key, int placeableIndex) {
        LazyLayoutItemAnimation[] animations;
        d<T>.c cVarE = this.keyToItemInfoMap.e(key);
        if (cVarE == null || (animations = cVarE.getAnimations()) == null) {
            return null;
        }
        return animations[placeableIndex];
    }

    public final long i() {
        long jA = q16.INSTANCE.a();
        List<LazyLayoutItemAnimation> list = this.disappearingItems;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = list.get(i);
            GraphicsLayer layer = lazyLayoutItemAnimation.getLayer();
            if (layer != null) {
                int iMax = Math.max((int) (jA >> 32), g16.k(lazyLayoutItemAnimation.getRawOffset()) + ((int) (layer.getSize() >> 32)));
                jA = q16.c((((long) Math.max((int) (jA & 4294967295L), g16.l(lazyLayoutItemAnimation.getRawOffset()) + ((int) (layer.getSize() & 4294967295L)))) & 4294967295L) | (((long) iMax) << 32));
            }
        }
        return jA;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final b getModifier() {
        return this.modifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25, types: [androidx.compose.foundation.lazy.layout.d$c] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r33v1, types: [androidx.compose.foundation.lazy.layout.d$c] */
    /* JADX WARN: Type inference failed for: r44v0, types: [java.util.Collection, java.util.List, java.util.List<T extends com.google.android.yt6>] */
    public final void m(int consumedScroll, int layoutWidth, int layoutHeight, List<T> positionedItems, ot6 keyIndexMap, bu6<T> itemProvider, boolean isVertical, boolean isLookingAhead, int laneCount, boolean hasLookaheadOccurred, int layoutMinOffset, int layoutMaxOffset, ta2 coroutineScope, i05 graphicsContext) {
        int i;
        Object[] objArr;
        long[] jArr;
        int i2;
        Object[] objArr2;
        long[] jArr2;
        ?? r2;
        LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr;
        int i3;
        int i4;
        int i5;
        int i6;
        long[] jArr3;
        int i7 = laneCount;
        ot6 ot6Var = this.keyIndexMap;
        this.keyIndexMap = keyIndexMap;
        int size = positionedItems.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                if (!this.keyToItemInfoMap.h()) {
                    break;
                }
                n();
                return;
            } else if (g((yt6) positionedItems.get(i8))) {
                break;
            } else {
                i8++;
            }
        }
        int i9 = this.firstVisibleIndex;
        yt6 yt6Var = (yt6) m.B0((List) positionedItems);
        this.firstVisibleIndex = yt6Var != null ? yt6Var.getIndex() : 0;
        long jF = isVertical ? g16.f((((long) consumedScroll) & 4294967295L) | (((long) 0) << 32)) : g16.f((((long) consumedScroll) << 32) | (((long) 0) & 4294967295L));
        boolean z = isLookingAhead || !hasLookaheadOccurred;
        k58<Object, d<T>.c> k58Var = this.keyToItemInfoMap;
        Object[] objArr3 = k58Var.keys;
        long[] jArr4 = k58Var.metadata;
        int length = jArr4.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr4[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j & 255) < 128) {
                            this.movingAwayKeys.h(objArr3[(i10 << 3) + i12]);
                        }
                        j >>= 8;
                        i12++;
                        jArr4 = jArr4;
                    }
                    jArr3 = jArr4;
                    if (i11 != 8) {
                        break;
                    }
                } else {
                    jArr3 = jArr4;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                jArr4 = jArr3;
            }
        }
        int i13 = 0;
        for (int size2 = positionedItems.size(); i13 < size2; size2 = size2) {
            yt6 yt6Var2 = (yt6) positionedItems.get(i13);
            this.movingAwayKeys.y(yt6Var2.getKey());
            if (g(yt6Var2)) {
                d<T>.c cVarE = this.keyToItemInfoMap.e(yt6Var2.getKey());
                int iC = ot6Var != null ? ot6Var.c(yt6Var2.getKey()) : -1;
                boolean z2 = iC == -1 && ot6Var != null;
                if (cVarE == null) {
                    d<T>.c cVar = new c();
                    c.m(cVar, yt6Var2, coroutineScope, graphicsContext, layoutMinOffset, layoutMaxOffset, 0, 32, null);
                    this.keyToItemInfoMap.x(yt6Var2.getKey(), cVar);
                    if (yt6Var2.getIndex() == iC || iC == -1) {
                        long jN = yt6Var2.n(0);
                        k(yt6Var2, yt6Var2.getIsVertical() ? g16.l(jN) : g16.k(jN), cVar);
                        if (z2) {
                            LazyLayoutItemAnimation[] animations = cVar.getAnimations();
                            for (LazyLayoutItemAnimation lazyLayoutItemAnimation : animations) {
                                if (lazyLayoutItemAnimation != null) {
                                    lazyLayoutItemAnimation.k();
                                    Unit unit = Unit.a;
                                }
                            }
                        }
                        Unit unit2 = Unit.a;
                    } else if (iC < i9) {
                        this.movingInFromStartBound.add((T) yt6Var2);
                    } else {
                        this.movingInFromEndBound.add((T) yt6Var2);
                    }
                    i3 = i9;
                    i4 = i13;
                } else {
                    if (z) {
                        c.m(cVarE, yt6Var2, coroutineScope, graphicsContext, layoutMinOffset, layoutMaxOffset, 0, 32, null);
                        LazyLayoutItemAnimation[] animations2 = cVarE.getAnimations();
                        int length2 = animations2.length;
                        int i14 = 0;
                        while (i14 < length2) {
                            LazyLayoutItemAnimation lazyLayoutItemAnimation2 = animations2[i14];
                            LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr2 = animations2;
                            int i15 = i9;
                            if (lazyLayoutItemAnimation2 != null) {
                                i5 = i13;
                                i6 = length2;
                                if (!g16.j(lazyLayoutItemAnimation2.getRawOffset(), LazyLayoutItemAnimation.INSTANCE.a())) {
                                    lazyLayoutItemAnimation2.J(g16.o(lazyLayoutItemAnimation2.getRawOffset(), jF));
                                }
                            } else {
                                i5 = i13;
                                i6 = length2;
                            }
                            i14++;
                            animations2 = lazyLayoutItemAnimationArr2;
                            i9 = i15;
                            i13 = i5;
                            length2 = i6;
                        }
                        i3 = i9;
                        i4 = i13;
                        if (z2) {
                            for (LazyLayoutItemAnimation lazyLayoutItemAnimation3 : cVarE.getAnimations()) {
                                if (lazyLayoutItemAnimation3 != null) {
                                    if (lazyLayoutItemAnimation3.v()) {
                                        this.disappearingItems.remove(lazyLayoutItemAnimation3);
                                        yg3 yg3Var = this.displayingNode;
                                        if (yg3Var != null) {
                                            zg3.a(yg3Var);
                                            Unit unit3 = Unit.a;
                                        }
                                    }
                                    lazyLayoutItemAnimation3.k();
                                }
                            }
                        }
                        r(this, yt6Var2, false, 2, null);
                    } else {
                        i3 = i9;
                        i4 = i13;
                    }
                    Unit unit4 = Unit.a;
                }
            } else {
                i3 = i9;
                i4 = i13;
                o(yt6Var2.getKey());
                Unit unit5 = Unit.a;
            }
            i13 = i4 + 1;
            i9 = i3;
        }
        int i16 = 2;
        int[] iArr = new int[i7];
        if (!z || ot6Var == null) {
            i = 2;
        } else {
            if (this.movingInFromStartBound.isEmpty()) {
                i = 2;
            } else {
                List<T> list = this.movingInFromStartBound;
                if (list.size() > 1) {
                    m.F(list, new f(ot6Var));
                }
                List<T> list2 = this.movingInFromStartBound;
                int size3 = list2.size();
                int i17 = 0;
                while (i17 < size3) {
                    T t = list2.get(i17);
                    int i18 = i16;
                    l(this, t, layoutMinOffset - s(iArr, t), null, 4, null);
                    r(this, t, false, i18, null);
                    i17++;
                    i16 = i18;
                }
                i = i16;
                kotlin.collections.f.E(iArr, 0, 0, 0, 6, (Object) null);
            }
            if (!this.movingInFromEndBound.isEmpty()) {
                List<T> list3 = this.movingInFromEndBound;
                if (list3.size() > 1) {
                    m.F(list3, new C0021d(ot6Var));
                }
                List<T> list4 = this.movingInFromEndBound;
                int size4 = list4.size();
                for (int i19 = 0; i19 < size4; i19++) {
                    T t2 = list4.get(i19);
                    l(this, t2, (layoutMaxOffset + s(iArr, t2)) - t2.getMainAxisSizeWithSpacings(), null, 4, null);
                    r(this, t2, false, i, null);
                }
                kotlin.collections.f.E(iArr, 0, 0, 0, 6, (Object) null);
            }
        }
        androidx.collection.d<Object> dVar = this.movingAwayKeys;
        Object[] objArr4 = dVar.elements;
        long[] jArr5 = dVar.metadata;
        int length3 = jArr5.length - i;
        if (length3 >= 0) {
            int i20 = 0;
            while (true) {
                long j2 = jArr5[i20];
                long[] jArr6 = jArr5;
                Object[] objArr5 = objArr4;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i21 = 8 - ((~(i20 - length3)) >>> 31);
                    int i22 = 0;
                    while (i22 < i21) {
                        if ((j2 & 255) < 128) {
                            Object obj = objArr5[(i20 << 3) + i22];
                            i2 = i22;
                            d<T>.c cVarE2 = this.keyToItemInfoMap.e(obj);
                            if (cVarE2 != 0) {
                                objArr2 = objArr5;
                                int iC2 = keyIndexMap.c(obj);
                                jArr2 = jArr6;
                                cVarE2.k(Math.min(i7, cVarE2.getSpan()));
                                cVarE2.j(Math.min(i7 - cVarE2.getSpan(), cVarE2.getLane()));
                                if (iC2 == -1) {
                                    LazyLayoutItemAnimation[] animations3 = cVarE2.getAnimations();
                                    int length4 = animations3.length;
                                    int i23 = 0;
                                    boolean z3 = false;
                                    int i24 = 0;
                                    while (i23 < length4) {
                                        ?? r33 = r2;
                                        LazyLayoutItemAnimation lazyLayoutItemAnimation4 = animations3[i23];
                                        int i25 = i24 + 1;
                                        if (lazyLayoutItemAnimation4 == null) {
                                            r2 = cVarE2;
                                            lazyLayoutItemAnimationArr = animations3;
                                        } else if (lazyLayoutItemAnimation4.v()) {
                                            r2 = cVarE2;
                                            Unit unit6 = Unit.a;
                                            lazyLayoutItemAnimationArr = animations3;
                                            z3 = true;
                                        } else {
                                            if (lazyLayoutItemAnimation4.u()) {
                                                lazyLayoutItemAnimation4.y();
                                                r33.getAnimations()[i24] = null;
                                                lazyLayoutItemAnimationArr = animations3;
                                                this.disappearingItems.remove(lazyLayoutItemAnimation4);
                                                yg3 yg3Var2 = this.displayingNode;
                                                if (yg3Var2 != null) {
                                                    r2 = cVarE2;
                                                    zg3.a(yg3Var2);
                                                    Unit unit7 = Unit.a;
                                                }
                                            } else {
                                                lazyLayoutItemAnimationArr = animations3;
                                                if (lazyLayoutItemAnimation4.getLayer() != null) {
                                                    r2 = cVarE2;
                                                    lazyLayoutItemAnimation4.l();
                                                }
                                                r2 = cVarE2;
                                                if (lazyLayoutItemAnimation4.v()) {
                                                    this.disappearingItems.add(lazyLayoutItemAnimation4);
                                                    yg3 yg3Var3 = this.displayingNode;
                                                    if (yg3Var3 != null) {
                                                        zg3.a(yg3Var3);
                                                        Unit unit8 = Unit.a;
                                                    }
                                                    z3 = true;
                                                } else {
                                                    lazyLayoutItemAnimation4.y();
                                                    r33.getAnimations()[i24] = null;
                                                }
                                                Unit unit9 = Unit.a;
                                            }
                                            i23++;
                                            i24 = i25;
                                            animations3 = lazyLayoutItemAnimationArr;
                                            r2 = r33;
                                        }
                                        r2 = cVarE2;
                                        i23++;
                                        i24 = i25;
                                        animations3 = lazyLayoutItemAnimationArr;
                                        r2 = r33;
                                    }
                                    r2 = cVarE2;
                                    if (!z3) {
                                        o(obj);
                                    }
                                    Unit unit10 = Unit.a;
                                } else {
                                    kx1 constraints = cVarE2.getConstraints();
                                    Intrinsics.g(constraints);
                                    yt6 yt6VarA = itemProvider.a(iC2, cVarE2.getLane(), cVarE2.getSpan(), constraints.getValue());
                                    yt6VarA.f(true);
                                    LazyLayoutItemAnimation[] animations4 = cVarE2.getAnimations();
                                    int length5 = animations4.length;
                                    int i26 = 0;
                                    while (true) {
                                        if (i26 < length5) {
                                            LazyLayoutItemAnimation lazyLayoutItemAnimation5 = animations4[i26];
                                            int i27 = i26;
                                            if (lazyLayoutItemAnimation5 != null && lazyLayoutItemAnimation5.w()) {
                                            }
                                            i26 = i27 + 1;
                                            length5 = length5;
                                        } else if (ot6Var != null && iC2 == ot6Var.c(obj)) {
                                            o(obj);
                                            Unit unit11 = Unit.a;
                                        }
                                        cVarE2.l(yt6VarA, coroutineScope, graphicsContext, layoutMinOffset, layoutMaxOffset, cVarE2.getCrossAxisOffset());
                                        if (iC2 < this.firstVisibleIndex) {
                                            this.movingAwayToStartBound.add((T) yt6VarA);
                                        } else {
                                            this.movingAwayToEndBound.add((T) yt6VarA);
                                        }
                                    }
                                }
                            }
                            j2 >>= 8;
                            i7 = laneCount;
                            i22 = i2 + 1;
                            jArr6 = jArr2;
                            objArr5 = objArr2;
                        } else {
                            i2 = i22;
                        }
                        objArr2 = objArr5;
                        jArr2 = jArr6;
                        j2 >>= 8;
                        i7 = laneCount;
                        i22 = i2 + 1;
                        jArr6 = jArr2;
                        objArr5 = objArr2;
                    }
                    objArr = objArr5;
                    jArr = jArr6;
                    if (i21 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr5;
                    jArr = jArr6;
                }
                if (i20 == length3) {
                    break;
                }
                i20++;
                objArr4 = objArr;
                i7 = laneCount;
                jArr5 = jArr;
            }
        }
        if (!this.movingAwayToStartBound.isEmpty()) {
            List<T> list5 = this.movingAwayToStartBound;
            if (list5.size() > 1) {
                m.F(list5, new g(keyIndexMap));
            }
            List<T> list6 = this.movingAwayToStartBound;
            int size5 = list6.size();
            for (int i28 = 0; i28 < size5; i28++) {
                T t3 = list6.get(i28);
                d<T>.c cVarE3 = this.keyToItemInfoMap.e(t3.getKey());
                Intrinsics.g(cVarE3);
                d<T>.c cVar2 = cVarE3;
                t3.i((isLookingAhead ? h((yt6) m.z0((List) positionedItems)) : cVar2.getLayoutMinOffset()) - s(iArr, t3), cVar2.getCrossAxisOffset(), layoutWidth, layoutHeight);
                if (z) {
                    q(t3, true);
                }
            }
            kotlin.collections.f.E(iArr, 0, 0, 0, 6, (Object) null);
        }
        if (!this.movingAwayToEndBound.isEmpty()) {
            List<T> list7 = this.movingAwayToEndBound;
            if (list7.size() > 1) {
                m.F(list7, new e(keyIndexMap));
            }
            List<T> list8 = this.movingAwayToEndBound;
            int size6 = list8.size();
            for (int i29 = 0; i29 < size6; i29++) {
                T t4 = list8.get(i29);
                d<T>.c cVarE4 = this.keyToItemInfoMap.e(t4.getKey());
                Intrinsics.g(cVarE4);
                d<T>.c cVar3 = cVarE4;
                t4.i((cVar3.getLayoutMaxOffset() - t4.getMainAxisSizeWithSpacings()) + s(iArr, t4), cVar3.getCrossAxisOffset(), layoutWidth, layoutHeight);
                if (z) {
                    q(t4, true);
                }
            }
        }
        List<T> list9 = this.movingAwayToStartBound;
        m.g0(list9);
        Unit unit12 = Unit.a;
        positionedItems.addAll(0, list9);
        positionedItems.addAll(this.movingAwayToEndBound);
        this.movingInFromStartBound.clear();
        this.movingInFromEndBound.clear();
        this.movingAwayToStartBound.clear();
        this.movingAwayToEndBound.clear();
        this.movingAwayKeys.m();
    }

    public final void p() {
        n();
        this.keyIndexMap = null;
        this.firstVisibleIndex = -1;
    }
}
