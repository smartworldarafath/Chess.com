package com.google.inputmethod;

import androidx.compose.p001foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.p001foundation.lazy.layout.d;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u0015\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0091\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 J/\u0010&\u001a\u00020%2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003H\u0016¢\u0006\u0004\b&\u0010'J%\u0010(\u001a\u00020%2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020%2\u0006\u0010*\u001a\u00020\u0003¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b-\u0010.J\u001d\u00101\u001a\u00020%2\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\b¢\u0006\u0004\b1\u00102J\u001d\u00106\u001a\u00020%2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\b¢\u0006\u0004\b6\u00107R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010>R\u0014\u0010\u0011\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00108R\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00108R\u0014\u0010\u0013\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u00108R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010L\u001a\u0004\bO\u0010NR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010PR\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010J\u001a\u0004\bA\u0010RR$\u0010U\u001a\u00020\u00032\u0006\u0010S\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b6\u00108\u001a\u0004\bT\u0010:R\u001a\u0010W\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u00108\u001a\u0004\bV\u0010:R\u001a\u0010X\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\b+\u00108\u001a\u0004\bC\u0010:R\u001a\u0010Z\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\bY\u00108\u001a\u0004\bH\u0010:R\u001a\u0010\\\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u00108\u001a\u0004\bK\u0010:R\u0017\u0010^\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b]\u00108\u001a\u0004\b=\u0010:R\"\u0010a\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b_\u0010>\u001a\u0004\bG\u0010@\"\u0004\bE\u0010`R\u0016\u0010*\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u00108R\u0016\u0010d\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u00108R\u0016\u0010f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u00108R\u0014\u0010j\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010l\u001a\u00020\u0003*\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010kR\u0018\u0010n\u001a\u00020\u0003*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010mR\u0014\u0010o\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010:¨\u0006p"}, d2 = {"Lcom/google/android/vv6;", "Lcom/google/android/gv6;", "Lcom/google/android/yt6;", "", "index", "", "Landroidx/compose/ui/layout/o;", "placeables", "", "isVertical", "Lcom/google/android/tc$b;", "horizontalAlignment", "Lcom/google/android/tc$c;", "verticalAlignment", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "reverseLayout", "beforeContentPadding", "afterContentPadding", "spacing", "Lcom/google/android/g16;", "visualOffset", "", "key", "contentType", "Landroidx/compose/foundation/lazy/layout/d;", "animator", "Lcom/google/android/kx1;", "constraints", "<init>", "(ILjava/util/List;ZLcom/google/android/tc$b;Lcom/google/android/tc$c;Landroidx/compose/ui/unit/LayoutDirection;ZIIIJLjava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/layout/d;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "m", "(I)Ljava/lang/Object;", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "", "i", "(IIII)V", "q", "(III)V", "mainAxisLayoutSize", "r", "(I)V", "n", "(I)J", "delta", "updateAnimations", "a", "(IZ)V", "Landroidx/compose/ui/layout/o$a;", "scope", "isLookingAhead", "p", "(Landroidx/compose/ui/layout/o$a;Z)V", "I", "getIndex", "()I", "b", "Ljava/util/List;", "c", "Z", "h", "()Z", "d", "Lcom/google/android/tc$b;", "e", "Lcom/google/android/tc$c;", "f", "Landroidx/compose/ui/unit/LayoutDirection;", "g", "j", "k", "J", "l", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "getContentType", "Landroidx/compose/foundation/lazy/layout/d;", "o", "()J", "value", "getOffset", "offset", "getSize", "size", "lane", "s", "span", "t", "mainAxisSizeWithSpacings", "u", "crossAxisSize", "v", "(Z)V", "nonScrollableItem", "w", "x", "minMainAxisOffset", "y", "maxMainAxisOffset", "", "z", "[I", "placeableOffsets", "(J)I", "mainAxis", "(Landroidx/compose/ui/layout/o;)I", "mainAxisSize", "placeablesCount", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class vv6 implements gv6, yt6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<o> placeables;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final tc.b horizontalAlignment;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final tc.c verticalAlignment;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean reverseLayout;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int beforeContentPadding;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int afterContentPadding;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int spacing;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final long visualOffset;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final Object key;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Object contentType;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final d<vv6> animator;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final long constraints;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private int offset;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final int lane;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final int span;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final int mainAxisSizeWithSpacings;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final int crossAxisSize;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private boolean nonScrollableItem;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private int mainAxisLayoutSize;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private int minMainAxisOffset;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private int maxMainAxisOffset;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final int[] placeableOffsets;

    public /* synthetic */ vv6(int i, List list, boolean z, tc.b bVar, tc.c cVar, LayoutDirection layoutDirection, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, d dVar, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, z, bVar, cVar, layoutDirection, z2, i2, i3, i4, j, obj, obj2, dVar, j2);
    }

    private final int k(long j) {
        return getIsVertical() ? g16.l(j) : g16.k(j);
    }

    private final int o(o oVar) {
        return getIsVertical() ? oVar.getHeight() : oVar.getWidth();
    }

    public final void a(int delta, boolean updateAnimations) {
        int iIntValue;
        int iL;
        if (getNonScrollableItem()) {
            return;
        }
        this.offset = getOffset() + delta;
        int length = this.placeableOffsets.length;
        for (int i = 0; i < length; i++) {
            int i2 = i & 1;
            if ((getIsVertical() && i2 != 0) || (!getIsVertical() && i2 == 0)) {
                int[] iArr = this.placeableOffsets;
                iArr[i] = iArr[i] + delta;
            }
        }
        if (updateAnimations) {
            int iB = b();
            for (int i3 = 0; i3 < iB; i3++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimationE = this.animator.e(getKey(), i3);
                if (lazyLayoutItemAnimationE != null) {
                    long rawOffset = lazyLayoutItemAnimationE.getRawOffset();
                    if (getIsVertical()) {
                        iIntValue = g16.k(rawOffset);
                        iL = Integer.valueOf(g16.l(rawOffset) + delta).intValue();
                    } else {
                        iIntValue = Integer.valueOf(g16.k(rawOffset) + delta).intValue();
                        iL = g16.l(rawOffset);
                    }
                    lazyLayoutItemAnimationE.J(g16.f((((long) iIntValue) << 32) | (4294967295L & ((long) iL))));
                }
            }
        }
    }

    @Override // com.google.inputmethod.yt6
    public int b() {
        return this.placeables.size();
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCrossAxisSize() {
        return this.crossAxisSize;
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

    @Override // com.google.inputmethod.gv6, com.google.inputmethod.yt6
    public int getIndex() {
        return this.index;
    }

    @Override // com.google.inputmethod.gv6, com.google.inputmethod.yt6
    public Object getKey() {
        return this.key;
    }

    @Override // com.google.inputmethod.gv6
    public int getOffset() {
        return this.offset;
    }

    @Override // com.google.inputmethod.gv6
    public int getSize() {
        return this.size;
    }

    @Override // com.google.inputmethod.yt6
    /* JADX INFO: renamed from: h, reason: from getter */
    public boolean getIsVertical() {
        return this.isVertical;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // com.google.inputmethod.yt6
    public void i(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight) throws KotlinNothingValueException {
        q(mainAxisOffset, layoutWidth, layoutHeight);
    }

    @Override // com.google.inputmethod.yt6
    /* JADX INFO: renamed from: j, reason: from getter */
    public int getSpan() {
        return this.span;
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
        if (index == 0 && b() == 0) {
            if (getIsVertical()) {
                return g16.f((4294967295L & ((long) getOffset())) | (((long) 0) << 32));
            }
            return g16.f((4294967295L & ((long) 0)) | (((long) getOffset()) << 32));
        }
        int[] iArr = this.placeableOffsets;
        int i = index * 2;
        int i2 = iArr[i];
        return g16.f((4294967295L & ((long) iArr[i + 1])) | (((long) i2) << 32));
    }

    public final void p(o.a scope, boolean isLookingAhead) {
        GraphicsLayer layer;
        o.a aVar;
        long jK;
        int i = 0;
        if (!(this.mainAxisLayoutSize != Integer.MIN_VALUE)) {
            cx5.a("position() should be called first");
        }
        int iB = b();
        while (i < iB) {
            o oVar = this.placeables.get(i);
            int iO = this.minMainAxisOffset - o(oVar);
            int i2 = this.maxMainAxisOffset;
            long jN = n(i);
            LazyLayoutItemAnimation lazyLayoutItemAnimationE = this.animator.e(getKey(), i);
            if (lazyLayoutItemAnimationE != null) {
                if (isLookingAhead) {
                    lazyLayoutItemAnimationE.F(jN);
                } else {
                    if (!g16.j(lazyLayoutItemAnimationE.getLookaheadOffset(), LazyLayoutItemAnimation.INSTANCE.a())) {
                        jN = lazyLayoutItemAnimationE.getLookaheadOffset();
                    }
                    long jO = g16.o(jN, lazyLayoutItemAnimationE.r());
                    if ((k(jN) <= iO && k(jO) <= iO) || (k(jN) >= i2 && k(jO) >= i2)) {
                        lazyLayoutItemAnimationE.n();
                    }
                    jN = jO;
                }
                layer = lazyLayoutItemAnimationE.getLayer();
            } else {
                layer = null;
            }
            if (this.reverseLayout) {
                if (getIsVertical()) {
                    jK = (((long) ((this.mainAxisLayoutSize - g16.l(jN)) - o(oVar))) & 4294967295L) | (((long) g16.k(jN)) << 32);
                } else {
                    jK = (((long) ((this.mainAxisLayoutSize - g16.k(jN)) - o(oVar))) << 32) | (4294967295L & ((long) g16.l(jN)));
                }
                jN = g16.f(jK);
            }
            long jO2 = g16.o(jN, this.visualOffset);
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void q(int mainAxisOffset, int layoutWidth, int layoutHeight) throws KotlinNothingValueException {
        int width;
        this.offset = mainAxisOffset;
        this.mainAxisLayoutSize = getIsVertical() ? layoutHeight : layoutWidth;
        List<o> list = this.placeables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            o oVar = list.get(i);
            int i2 = i * 2;
            if (getIsVertical()) {
                int[] iArr = this.placeableOffsets;
                tc.b bVar = this.horizontalAlignment;
                if (bVar == null) {
                    cx5.b("null horizontalAlignment when isVertical == true");
                    throw new KotlinNothingValueException();
                }
                iArr[i2] = bVar.a(oVar.getWidth(), layoutWidth, this.layoutDirection);
                this.placeableOffsets[i2 + 1] = mainAxisOffset;
                width = oVar.getHeight();
            } else {
                int[] iArr2 = this.placeableOffsets;
                iArr2[i2] = mainAxisOffset;
                int i3 = i2 + 1;
                tc.c cVar = this.verticalAlignment;
                if (cVar == null) {
                    cx5.b("null verticalAlignment when isVertical == false");
                    throw new KotlinNothingValueException();
                }
                iArr2[i3] = cVar.a(oVar.getHeight(), layoutHeight);
                width = oVar.getWidth();
            }
            mainAxisOffset += width;
        }
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }

    public final void r(int mainAxisLayoutSize) {
        this.mainAxisLayoutSize = mainAxisLayoutSize;
        this.maxMainAxisOffset = mainAxisLayoutSize + this.afterContentPadding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private vv6(int i, List<? extends o> list, boolean z, tc.b bVar, tc.c cVar, LayoutDirection layoutDirection, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, d<vv6> dVar, long j2) {
        this.index = i;
        this.placeables = list;
        this.isVertical = z;
        this.horizontalAlignment = bVar;
        this.verticalAlignment = cVar;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = z2;
        this.beforeContentPadding = i2;
        this.afterContentPadding = i3;
        this.spacing = i4;
        this.visualOffset = j;
        this.key = obj;
        this.contentType = obj2;
        this.animator = dVar;
        this.constraints = j2;
        this.span = 1;
        this.mainAxisLayoutSize = t04.INVALID_ID;
        int size = list.size();
        int height = 0;
        int iMax = 0;
        for (int i5 = 0; i5 < size; i5++) {
            o oVar = (o) list.get(i5);
            height += getIsVertical() ? oVar.getHeight() : oVar.getWidth();
            iMax = Math.max(iMax, !getIsVertical() ? oVar.getHeight() : oVar.getWidth());
        }
        this.size = height;
        this.mainAxisSizeWithSpacings = g.e(getSize() + this.spacing, 0);
        this.crossAxisSize = iMax;
        this.placeableOffsets = new int[this.placeables.size() * 2];
    }
}
