package com.google.inputmethod;

import androidx.compose.p001foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.p001foundation.lazy.layout.d;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0095\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b \u0010!J/\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(J=\u0010+\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0003¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020&2\u0006\u0010-\u001a\u00020\u0003¢\u0006\u0004\b.\u0010/J\u001d\u00102\u001a\u00020&2\u0006\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u0007¢\u0006\u0004\b2\u00103J\u001d\u00107\u001a\u00020&2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\u0007¢\u0006\u0004\b7\u00108R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bE\u0010:\u001a\u0004\bF\u0010<R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010BR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u000e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010:R\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010:R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010KR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010>\u001a\u0004\bO\u0010@R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010M\u001a\u0004\bE\u0010RR\u001a\u0010\u001a\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010:\u001a\u0004\bG\u0010<R\u001a\u0010\u001b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010:\u001a\u0004\bL\u0010<R\u0017\u0010U\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bS\u0010:\u001a\u0004\bT\u0010<R\u001a\u0010V\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010:\u001a\u0004\bP\u0010<R\u0016\u0010-\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010:R\u0016\u0010X\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010:R\u0016\u0010Y\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010:R\u001a\u0010[\u001a\u00020Z8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010M\u001a\u0004\b9\u0010RR$\u0010^\u001a\u00020\u00132\u0006\u0010\\\u001a\u00020\u00138\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b]\u0010M\u001a\u0004\bA\u0010RR$\u0010)\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b_\u0010:\u001a\u0004\bN\u0010<R$\u0010*\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b`\u0010:\u001a\u0004\ba\u0010<R\"\u0010d\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bb\u0010B\u001a\u0004\bJ\u0010D\"\u0004\bH\u0010cR\u0018\u0010f\u001a\u00020\u0003*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010eR\u0018\u0010U\u001a\u00020\u0003*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010gR\u0014\u0010h\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010<¨\u0006i"}, d2 = {"Lcom/google/android/kq6;", "Lcom/google/android/pp6;", "Lcom/google/android/yt6;", "", "index", "", "key", "", "isVertical", "crossAxisSize", "mainAxisSpacing", "reverseLayout", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "beforeContentPadding", "afterContentPadding", "", "Landroidx/compose/ui/layout/o;", "placeables", "Lcom/google/android/g16;", "visualOffset", "contentType", "Landroidx/compose/foundation/lazy/layout/d;", "animator", "Lcom/google/android/kx1;", "constraints", "lane", "span", "<init>", "(ILjava/lang/Object;ZIIZLandroidx/compose/ui/unit/LayoutDirection;IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/lazy/layout/d;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "m", "(I)Ljava/lang/Object;", "n", "(I)J", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "", "i", "(IIII)V", "row", "column", "t", "(IIIIII)V", "mainAxisLayoutSize", "u", "(I)V", "delta", "updateAnimations", "o", "(IZ)V", "Landroidx/compose/ui/layout/o$a;", "scope", "isLookingAhead", "s", "(Landroidx/compose/ui/layout/o$a;Z)V", "a", "I", "getIndex", "()I", "b", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "c", "Z", "h", "()Z", "d", "getCrossAxisSize", "e", "f", "Landroidx/compose/ui/unit/LayoutDirection;", "g", "Ljava/util/List;", "j", "J", "k", "getContentType", "l", "Landroidx/compose/foundation/lazy/layout/d;", "()J", "p", "q", "mainAxisSize", "mainAxisSizeWithSpacings", "r", "minMainAxisOffset", "maxMainAxisOffset", "Lcom/google/android/q16;", "size", "value", "v", "offset", "w", "x", "getColumn", "y", "(Z)V", "nonScrollableItem", "(J)I", "mainAxis", "(Landroidx/compose/ui/layout/o;)I", "placeablesCount", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class kq6 implements pp6, yt6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Object key;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int crossAxisSize;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean reverseLayout;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int beforeContentPadding;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int afterContentPadding;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final List<o> placeables;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final long visualOffset;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Object contentType;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final d<kq6> animator;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final long constraints;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int lane;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int span;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final int mainAxisSize;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final int mainAxisSizeWithSpacings;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private int mainAxisLayoutSize;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private int minMainAxisOffset;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private int maxMainAxisOffset;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final long size;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private long offset;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private int row;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private int column;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private boolean nonScrollableItem;

    public /* synthetic */ kq6(int i, Object obj, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection, int i4, int i5, List list, long j, Object obj2, d dVar, long j2, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, obj, z, i2, i3, z2, layoutDirection, i4, i5, list, j, obj2, dVar, j2, i6, i7);
    }

    private final int p(long j) {
        return getIsVertical() ? g16.l(j) : g16.k(j);
    }

    private final int r(o oVar) {
        return getIsVertical() ? oVar.getHeight() : oVar.getWidth();
    }

    @Override // com.google.inputmethod.pp6
    /* JADX INFO: renamed from: a, reason: from getter */
    public long getSize() {
        return this.size;
    }

    @Override // com.google.inputmethod.yt6
    public int b() {
        return this.placeables.size();
    }

    @Override // com.google.inputmethod.pp6
    /* JADX INFO: renamed from: c, reason: from getter */
    public long getOffset() {
        return this.offset;
    }

    @Override // com.google.inputmethod.yt6
    /* JADX INFO: renamed from: d, reason: from getter */
    public long getConstraints() {
        return this.constraints;
    }

    @Override // com.google.inputmethod.yt6
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getLane() {
        return this.lane;
    }

    @Override // com.google.inputmethod.yt6
    public void f(boolean z) {
        this.nonScrollableItem = z;
    }

    @Override // com.google.inputmethod.yt6
    /* JADX INFO: renamed from: g, reason: from getter */
    public boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    @Override // com.google.inputmethod.pp6
    public int getColumn() {
        return this.column;
    }

    @Override // com.google.inputmethod.pp6, com.google.inputmethod.yt6
    public int getIndex() {
        return this.index;
    }

    @Override // com.google.inputmethod.pp6, com.google.inputmethod.yt6
    public Object getKey() {
        return this.key;
    }

    @Override // com.google.inputmethod.yt6
    /* JADX INFO: renamed from: h, reason: from getter */
    public boolean getIsVertical() {
        return this.isVertical;
    }

    @Override // com.google.inputmethod.yt6
    public void i(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight) {
        t(mainAxisOffset, crossAxisOffset, layoutWidth, layoutHeight, -1, -1);
    }

    @Override // com.google.inputmethod.yt6
    /* JADX INFO: renamed from: j, reason: from getter */
    public int getSpan() {
        return this.span;
    }

    @Override // com.google.inputmethod.pp6
    /* JADX INFO: renamed from: k, reason: from getter */
    public int getRow() {
        return this.row;
    }

    @Override // com.google.inputmethod.yt6
    /* JADX INFO: renamed from: l, reason: from getter */
    public int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    @Override // com.google.inputmethod.yt6
    public Object m(int index) {
        return this.placeables.get(index).f();
    }

    @Override // com.google.inputmethod.yt6
    public long n(int index) {
        return getOffset();
    }

    public final void o(int delta, boolean updateAnimations) {
        if (getNonScrollableItem()) {
            return;
        }
        long offset = getOffset();
        int iK = getIsVertical() ? g16.k(offset) : g16.k(offset) + delta;
        boolean isVertical = getIsVertical();
        int iL = g16.l(offset);
        if (isVertical) {
            iL += delta;
        }
        this.offset = g16.f((((long) iK) << 32) | (((long) iL) & 4294967295L));
        if (updateAnimations) {
            int iB = b();
            for (int i = 0; i < iB; i++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimationE = this.animator.e(getKey(), i);
                if (lazyLayoutItemAnimationE != null) {
                    long rawOffset = lazyLayoutItemAnimationE.getRawOffset();
                    int iK2 = getIsVertical() ? g16.k(rawOffset) : Integer.valueOf(g16.k(rawOffset) + delta).intValue();
                    boolean isVertical2 = getIsVertical();
                    int iL2 = g16.l(rawOffset);
                    if (isVertical2) {
                        iL2 = Integer.valueOf(iL2 + delta).intValue();
                    }
                    lazyLayoutItemAnimationE.J(g16.f((((long) iL2) & 4294967295L) | (((long) iK2) << 32)));
                }
            }
        }
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final void s(o.a scope, boolean isLookingAhead) {
        GraphicsLayer layer;
        o.a aVar;
        int iK;
        int iL;
        int i = 0;
        if (!(this.mainAxisLayoutSize != Integer.MIN_VALUE)) {
            cx5.a("position() should be called first");
        }
        int iB = b();
        while (i < iB) {
            o oVar = this.placeables.get(i);
            int iR = this.minMainAxisOffset - r(oVar);
            int i2 = this.maxMainAxisOffset;
            long offset = getOffset();
            LazyLayoutItemAnimation lazyLayoutItemAnimationE = this.animator.e(getKey(), i);
            if (lazyLayoutItemAnimationE != null) {
                if (isLookingAhead) {
                    lazyLayoutItemAnimationE.F(offset);
                } else {
                    long jO = g16.o(!g16.j(lazyLayoutItemAnimationE.getLookaheadOffset(), LazyLayoutItemAnimation.INSTANCE.a()) ? lazyLayoutItemAnimationE.getLookaheadOffset() : offset, lazyLayoutItemAnimationE.r());
                    if ((p(offset) <= iR && p(jO) <= iR) || (p(offset) >= i2 && p(jO) >= i2)) {
                        lazyLayoutItemAnimationE.n();
                    }
                    offset = jO;
                }
                layer = lazyLayoutItemAnimationE.getLayer();
            } else {
                layer = null;
            }
            if (this.reverseLayout) {
                if (getIsVertical()) {
                    iK = g16.k(offset);
                } else {
                    iK = (this.mainAxisLayoutSize - g16.k(offset)) - r(oVar);
                }
                if (getIsVertical()) {
                    iL = (this.mainAxisLayoutSize - g16.l(offset)) - r(oVar);
                } else {
                    iL = g16.l(offset);
                }
                offset = g16.f((((long) iL) & 4294967295L) | (((long) iK) << 32));
            }
            long jO2 = g16.o(offset, this.visualOffset);
            if (!isLookingAhead && lazyLayoutItemAnimationE != null) {
                lazyLayoutItemAnimationE.E(jO2);
            }
            if (!getIsVertical()) {
                aVar = scope;
                GraphicsLayer graphicsLayer = layer;
                if (graphicsLayer != null) {
                    o.a.b0(aVar, oVar, jO2, graphicsLayer, 0.0f, 4, null);
                } else {
                    o.a.a0(aVar, oVar, jO2, 0.0f, null, 6, null);
                }
            } else if (layer != null) {
                aVar = scope;
                o.a.j0(aVar, oVar, jO2, layer, 0.0f, 4, null);
            } else {
                aVar = scope;
                o.a.h0(aVar, oVar, jO2, 0.0f, null, 6, null);
            }
            i++;
            scope = aVar;
        }
    }

    public final void t(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight, int row, int column) {
        long jF;
        this.mainAxisLayoutSize = getIsVertical() ? layoutHeight : layoutWidth;
        if (!getIsVertical()) {
            layoutWidth = layoutHeight;
        }
        if (getIsVertical() && this.layoutDirection == LayoutDirection.Rtl) {
            crossAxisOffset = (layoutWidth - crossAxisOffset) - this.crossAxisSize;
        }
        if (getIsVertical()) {
            jF = g16.f((((long) crossAxisOffset) << 32) | (4294967295L & ((long) mainAxisOffset)));
        } else {
            jF = g16.f((((long) crossAxisOffset) & 4294967295L) | (((long) mainAxisOffset) << 32));
        }
        this.offset = jF;
        this.row = row;
        this.column = column;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }

    public final void u(int mainAxisLayoutSize) {
        this.mainAxisLayoutSize = mainAxisLayoutSize;
        this.maxMainAxisOffset = mainAxisLayoutSize + this.afterContentPadding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private kq6(int i, Object obj, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection, int i4, int i5, List<? extends o> list, long j, Object obj2, d<kq6> dVar, long j2, int i6, int i7) {
        this.index = i;
        this.key = obj;
        this.isVertical = z;
        this.crossAxisSize = i2;
        this.reverseLayout = z2;
        this.layoutDirection = layoutDirection;
        this.beforeContentPadding = i4;
        this.afterContentPadding = i5;
        this.placeables = list;
        this.visualOffset = j;
        this.contentType = obj2;
        this.animator = dVar;
        this.constraints = j2;
        this.lane = i6;
        this.span = i7;
        this.mainAxisLayoutSize = t04.INVALID_ID;
        int size = list.size();
        int iMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            o oVar = (o) list.get(i8);
            iMax = Math.max(iMax, getIsVertical() ? oVar.getHeight() : oVar.getWidth());
        }
        this.mainAxisSize = iMax;
        this.mainAxisSizeWithSpacings = g.e(i3 + iMax, 0);
        this.size = getIsVertical() ? q16.c((((long) iMax) & 4294967295L) | (((long) this.crossAxisSize) << 32)) : q16.c((((long) this.crossAxisSize) & 4294967295L) | (((long) iMax) << 32));
        this.offset = g16.INSTANCE.b();
        this.row = -1;
        this.column = -1;
    }
}
