package com.google.inputmethod;

import androidx.compose.p001foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.p001foundation.lazy.layout.d;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002Bu\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b!\u0010\"J/\u0010'\u001a\u00020 2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(J-\u0010.\u001a\u00020 2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\n¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b0\u00101J\u001d\u00104\u001a\u00020 2\u0006\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020\n¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\r\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010:\u001a\u0004\bG\u0010<R\u001a\u0010\u000e\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010:\u001a\u0004\bI\u0010<R\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010:R\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010:R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010>\u001a\u0004\bK\u0010@R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010LR\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010M\u001a\u0004\bC\u0010NR\"\u0010S\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010D\u001a\u0004\bP\u0010F\"\u0004\bQ\u0010RR\u0017\u0010U\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010:\u001a\u0004\bT\u0010<R\u001a\u0010V\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010:\u001a\u0004\bO\u0010<R\u0017\u0010Y\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bW\u0010:\u001a\u0004\bX\u0010<R\u0016\u0010\u001f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010:R\u0016\u0010[\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010:R\u0016\u0010\\\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010:R\"\u0010]\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b.\u0010D\u001a\u0004\bJ\u0010F\"\u0004\bH\u0010RR\u001a\u0010_\u001a\u00020^8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010M\u001a\u0004\b9\u0010NR$\u0010a\u001a\u00020\u001a2\u0006\u0010`\u001a\u00020\u001a8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bQ\u0010M\u001a\u0004\bA\u0010NR\u0018\u0010\u001d\u001a\u00020\u0003*\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010bR\u0014\u0010c\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010<R\u0011\u0010#\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bZ\u0010<¨\u0006d"}, d2 = {"Lcom/google/android/vy6;", "Lcom/google/android/by6;", "Lcom/google/android/yt6;", "", "index", "", "key", "", "Landroidx/compose/ui/layout/o;", "placeables", "", "isVertical", "spacing", "lane", "span", "beforeContentPadding", "afterContentPadding", "contentType", "Landroidx/compose/foundation/lazy/layout/d;", "animator", "Lcom/google/android/kx1;", "constraints", "<init>", "(ILjava/lang/Object;Ljava/util/List;ZIIIIILjava/lang/Object;Landroidx/compose/foundation/lazy/layout/d;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "m", "(I)Ljava/lang/Object;", "Lcom/google/android/g16;", "n", "(I)J", "mainAxis", "crossAxis", "mainAxisLayoutSize", "", "t", "(III)V", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "i", "(IIII)V", "Landroidx/compose/ui/layout/o$a;", "scope", "reverseLayout", "contentOffset", "isLookingAhead", "s", "(Landroidx/compose/ui/layout/o$a;ZJZ)V", "v", "(I)V", "delta", "updateAnimations", "k", "(IZ)V", "", "toString", "()Ljava/lang/String;", "a", "I", "getIndex", "()I", "b", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "c", "Ljava/util/List;", "d", "Z", "h", "()Z", "e", "f", "j", "g", "getContentType", "Landroidx/compose/foundation/lazy/layout/d;", "J", "()J", "l", "r", "u", "(Z)V", "isVisible", "q", "mainAxisSize", "mainAxisSizeWithSpacings", "o", "getCrossAxisSize", "crossAxisSize", "p", "minMainAxisOffset", "maxMainAxisOffset", "nonScrollableItem", "Lcom/google/android/q16;", "size", "value", "offset", "(J)I", "placeablesCount", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class vy6 implements by6, yt6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Object key;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<o> placeables;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int lane;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int span;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int beforeContentPadding;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int afterContentPadding;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Object contentType;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final d<vy6> animator;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final long constraints;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean isVisible;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int mainAxisSize;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int mainAxisSizeWithSpacings;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int crossAxisSize;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private int mainAxisLayoutSize;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private int minMainAxisOffset;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private int maxMainAxisOffset;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean nonScrollableItem;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final long size;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private long offset;

    public /* synthetic */ vy6(int i, Object obj, List list, boolean z, int i2, int i3, int i4, int i5, int i6, Object obj2, d dVar, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, obj, list, z, i2, i3, i4, i5, i6, obj2, dVar, j);
    }

    private final int o(long j) {
        return getIsVertical() ? g16.l(j) : g16.k(j);
    }

    @Override // com.google.inputmethod.by6
    /* JADX INFO: renamed from: a, reason: from getter */
    public long getSize() {
        return this.size;
    }

    @Override // com.google.inputmethod.yt6
    public int b() {
        return this.placeables.size();
    }

    @Override // com.google.inputmethod.by6
    /* JADX INFO: renamed from: c, reason: from getter */
    public long getOffset() {
        return this.offset;
    }

    @Override // com.google.inputmethod.yt6
    /* JADX INFO: renamed from: d, reason: from getter */
    public long getConstraints() {
        return this.constraints;
    }

    @Override // com.google.inputmethod.by6, com.google.inputmethod.yt6
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

    @Override // com.google.inputmethod.by6, com.google.inputmethod.yt6
    public int getIndex() {
        return this.index;
    }

    @Override // com.google.inputmethod.yt6
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
        if (getIsVertical()) {
            layoutWidth = layoutHeight;
        }
        t(mainAxisOffset, crossAxisOffset, layoutWidth);
    }

    @Override // com.google.inputmethod.yt6
    /* JADX INFO: renamed from: j, reason: from getter */
    public int getSpan() {
        return this.span;
    }

    public final void k(int delta, boolean updateAnimations) {
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

    public final int p() {
        return !getIsVertical() ? g16.k(getOffset()) : g16.l(getOffset());
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public final void s(o.a scope, boolean reverseLayout, long contentOffset, boolean isLookingAhead) {
        GraphicsLayer layer;
        if (!(this.mainAxisLayoutSize != Integer.MIN_VALUE)) {
            cx5.a("position() should be called first");
        }
        List<o> list = this.placeables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            o oVar = list.get(i);
            int height = this.minMainAxisOffset - (getIsVertical() ? oVar.getHeight() : oVar.getWidth());
            int i2 = this.maxMainAxisOffset;
            long offset = getOffset();
            LazyLayoutItemAnimation lazyLayoutItemAnimationE = this.animator.e(getKey(), i);
            if (lazyLayoutItemAnimationE != null) {
                if (isLookingAhead) {
                    lazyLayoutItemAnimationE.F(offset);
                } else {
                    long jO = g16.o(!g16.j(lazyLayoutItemAnimationE.getLookaheadOffset(), LazyLayoutItemAnimation.INSTANCE.a()) ? lazyLayoutItemAnimationE.getLookaheadOffset() : offset, lazyLayoutItemAnimationE.r());
                    if ((o(offset) <= height && o(jO) <= height) || (o(offset) >= i2 && o(jO) >= i2)) {
                        lazyLayoutItemAnimationE.n();
                    }
                    offset = jO;
                }
                layer = lazyLayoutItemAnimationE.getLayer();
            } else {
                layer = null;
            }
            if (reverseLayout) {
                int iK = getIsVertical() ? g16.k(offset) : (this.mainAxisLayoutSize - g16.k(offset)) - (getIsVertical() ? oVar.getHeight() : oVar.getWidth());
                offset = g16.f((((long) (getIsVertical() ? (this.mainAxisLayoutSize - g16.l(offset)) - (getIsVertical() ? oVar.getHeight() : oVar.getWidth()) : g16.l(offset))) & 4294967295L) | (((long) iK) << 32));
            }
            long jO2 = g16.o(offset, contentOffset);
            if (!isLookingAhead && lazyLayoutItemAnimationE != null) {
                lazyLayoutItemAnimationE.E(jO2);
            }
            if (layer != null) {
                o.a.b0(scope, oVar, jO2, layer, 0.0f, 4, null);
            } else {
                o.a.a0(scope, oVar, jO2, 0.0f, null, 6, null);
            }
        }
    }

    public final void t(int mainAxis, int crossAxis, int mainAxisLayoutSize) {
        long jF;
        this.mainAxisLayoutSize = mainAxisLayoutSize;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = mainAxisLayoutSize + this.afterContentPadding;
        if (getIsVertical()) {
            jF = g16.f((((long) crossAxis) << 32) | (4294967295L & ((long) mainAxis)));
        } else {
            jF = g16.f((((long) crossAxis) & 4294967295L) | (((long) mainAxis) << 32));
        }
        this.offset = jF;
    }

    public String toString() {
        return super.toString();
    }

    public final void u(boolean z) {
        this.isVisible = z;
    }

    public final void v(int mainAxisLayoutSize) {
        this.mainAxisLayoutSize = mainAxisLayoutSize;
        this.maxMainAxisOffset = mainAxisLayoutSize + this.afterContentPadding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private vy6(int i, Object obj, List<? extends o> list, boolean z, int i2, int i3, int i4, int i5, int i6, Object obj2, d<vy6> dVar, long j) {
        int height;
        this.index = i;
        this.key = obj;
        this.placeables = list;
        this.isVertical = z;
        this.lane = i3;
        this.span = i4;
        this.beforeContentPadding = i5;
        this.afterContentPadding = i6;
        this.contentType = obj2;
        this.animator = dVar;
        this.constraints = j;
        int i7 = 1;
        this.isVisible = true;
        int i8 = 0;
        if (!list.isEmpty()) {
            o oVar = (o) list.get(0);
            height = getIsVertical() ? oVar.getHeight() : oVar.getWidth();
            int iR = m.r(list);
            if (1 <= iR) {
                int i9 = 1;
                while (true) {
                    o oVar2 = (o) list.get(i9);
                    int height2 = getIsVertical() ? oVar2.getHeight() : oVar2.getWidth();
                    height = height2 > height ? height2 : height;
                    if (i9 == iR) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
        } else {
            height = 0;
        }
        this.mainAxisSize = height;
        this.mainAxisSizeWithSpacings = g.e(height + i2, 0);
        List<o> list2 = this.placeables;
        if (!list2.isEmpty()) {
            o oVar3 = list2.get(0);
            int width = getIsVertical() ? oVar3.getWidth() : oVar3.getHeight();
            int iR2 = m.r(list2);
            if (1 <= iR2) {
                while (true) {
                    o oVar4 = list2.get(i7);
                    int width2 = getIsVertical() ? oVar4.getWidth() : oVar4.getHeight();
                    width = width2 > width ? width2 : width;
                    if (i7 == iR2) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            i8 = width;
        }
        this.crossAxisSize = i8;
        this.mainAxisLayoutSize = t04.INVALID_ID;
        this.size = getIsVertical() ? q16.c((((long) this.mainAxisSize) & 4294967295L) | (((long) i8) << 32)) : q16.c((((long) i8) & 4294967295L) | (((long) this.mainAxisSize) << 32));
        this.offset = g16.INSTANCE.b();
    }
}
