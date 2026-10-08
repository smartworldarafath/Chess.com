package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0015\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u00100\u001a\u0004\b,\u00101R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00102R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00103R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00104R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0017\u0010:\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010'\u001a\u0004\b*\u0010)R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R$\u0010\u001a\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u00028\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b@\u0010'\u001a\u0004\bA\u0010)R\u0016\u0010C\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010'R\u0018\u0010E\u001a\u00020\u0002*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010D¨\u0006F"}, d2 = {"Lcom/google/android/jj7;", "Lcom/google/android/yx8;", "", "index", "size", "", "Landroidx/compose/ui/layout/o;", "placeables", "Lcom/google/android/g16;", "visualOffset", "", "key", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Lcom/google/android/tc$b;", "horizontalAlignment", "Lcom/google/android/tc$c;", "verticalAlignment", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "reverseLayout", "<init>", "(IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/gestures/Orientation;Lcom/google/android/tc$b;Lcom/google/android/tc$c;Landroidx/compose/ui/unit/LayoutDirection;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "e", "(I)J", "offset", "layoutWidth", "layoutHeight", "", "h", "(III)V", "Landroidx/compose/ui/layout/o$a;", "scope", "g", "(Landroidx/compose/ui/layout/o$a;)V", "delta", "a", "(I)V", "I", "getIndex", "()I", "b", "f", "c", "Ljava/util/List;", "d", "J", "Ljava/lang/Object;", "()Ljava/lang/Object;", "Lcom/google/android/tc$b;", "Lcom/google/android/tc$c;", "Landroidx/compose/ui/unit/LayoutDirection;", "i", "Z", "j", "isVertical", "k", "crossAxisSize", "", "l", "[I", "placeableOffsets", "value", "m", "getOffset", "n", "mainAxisLayoutSize", "(Landroidx/compose/ui/layout/o;)I", "mainAxisSize", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class jj7 implements yx8 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<o> placeables;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long visualOffset;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Object key;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final tc.b horizontalAlignment;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final tc.c verticalAlignment;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean reverseLayout;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int crossAxisSize;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int[] placeableOffsets;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int offset;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private int mainAxisLayoutSize;

    public /* synthetic */ jj7(int i, int i2, List list, long j, Object obj, Orientation orientation, tc.b bVar, tc.c cVar, LayoutDirection layoutDirection, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, list, j, obj, orientation, bVar, cVar, layoutDirection, z);
    }

    private final int d(o oVar) {
        return this.isVertical ? oVar.getHeight() : oVar.getWidth();
    }

    private final long e(int index) {
        int[] iArr = this.placeableOffsets;
        int i = index * 2;
        return g16.f((((long) iArr[i]) << 32) | (((long) iArr[i + 1]) & 4294967295L));
    }

    public final void a(int delta) {
        this.offset = getOffset() + delta;
        int length = this.placeableOffsets.length;
        for (int i = 0; i < length; i++) {
            boolean z = this.isVertical;
            if ((z && i % 2 == 1) || (!z && i % 2 == 0)) {
                int[] iArr = this.placeableOffsets;
                iArr[i] = iArr[i] + delta;
            }
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public Object getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final void g(o.a scope) {
        o.a aVar;
        int iK;
        int iL;
        int i = 0;
        if (!(this.mainAxisLayoutSize != Integer.MIN_VALUE)) {
            cx5.a("position() should be called first");
        }
        int size = this.placeables.size();
        while (i < size) {
            o oVar = this.placeables.get(i);
            long jE = e(i);
            if (this.reverseLayout) {
                if (this.isVertical) {
                    iK = g16.k(jE);
                } else {
                    iK = (this.mainAxisLayoutSize - g16.k(jE)) - d(oVar);
                }
                if (this.isVertical) {
                    iL = (this.mainAxisLayoutSize - g16.l(jE)) - d(oVar);
                } else {
                    iL = g16.l(jE);
                }
                jE = g16.f((((long) iK) << 32) | (((long) iL) & 4294967295L));
            }
            long jO = g16.o(jE, this.visualOffset);
            if (this.isVertical) {
                aVar = scope;
                o.a.h0(aVar, oVar, jO, 0.0f, null, 6, null);
            } else {
                aVar = scope;
                o.a.a0(aVar, oVar, jO, 0.0f, null, 6, null);
            }
            i++;
            scope = aVar;
        }
    }

    @Override // com.google.inputmethod.yx8
    public int getIndex() {
        return this.index;
    }

    @Override // com.google.inputmethod.yx8
    public int getOffset() {
        return this.offset;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void h(int offset, int layoutWidth, int layoutHeight) throws KotlinNothingValueException {
        int width;
        this.offset = offset;
        this.mainAxisLayoutSize = this.isVertical ? layoutHeight : layoutWidth;
        List<o> list = this.placeables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            o oVar = list.get(i);
            int i2 = i * 2;
            if (this.isVertical) {
                int[] iArr = this.placeableOffsets;
                tc.b bVar = this.horizontalAlignment;
                if (bVar == null) {
                    cx5.b("null horizontalAlignment");
                    throw new KotlinNothingValueException();
                }
                iArr[i2] = bVar.a(oVar.getWidth(), layoutWidth, this.layoutDirection);
                this.placeableOffsets[i2 + 1] = offset;
                width = oVar.getHeight();
            } else {
                int[] iArr2 = this.placeableOffsets;
                iArr2[i2] = offset;
                int i3 = i2 + 1;
                tc.c cVar = this.verticalAlignment;
                if (cVar == null) {
                    cx5.b("null verticalAlignment");
                    throw new KotlinNothingValueException();
                }
                iArr2[i3] = cVar.a(oVar.getHeight(), layoutHeight);
                width = oVar.getWidth();
            }
            offset += width;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private jj7(int i, int i2, List<? extends o> list, long j, Object obj, Orientation orientation, tc.b bVar, tc.c cVar, LayoutDirection layoutDirection, boolean z) {
        this.index = i;
        this.size = i2;
        this.placeables = list;
        this.visualOffset = j;
        this.key = obj;
        this.horizontalAlignment = bVar;
        this.verticalAlignment = cVar;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = z;
        this.isVertical = orientation == Orientation.Vertical;
        int size = list.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            o oVar = (o) list.get(i3);
            iMax = Math.max(iMax, !this.isVertical ? oVar.getHeight() : oVar.getWidth());
        }
        this.crossAxisSize = iMax;
        this.placeableOffsets = new int[this.placeables.size() * 2];
        this.mainAxisLayoutSize = t04.INVALID_ID;
    }
}
