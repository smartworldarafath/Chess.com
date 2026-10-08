package com.google.inputmethod;

import androidx.compose.ui.layout.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J?\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00182\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\"R\u0017\u0010&\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b$\u0010%R\u0011\u0010*\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010.\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/google/android/wv6;", "Lcom/google/android/bu6;", "Lcom/google/android/vv6;", "Lcom/google/android/kx1;", "constraints", "", "isVertical", "Lcom/google/android/hv6;", "itemProvider", "Lcom/google/android/wt6;", "measureScope", "<init>", "(JZLcom/google/android/hv6;Lcom/google/android/wt6;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "index", "lane", "span", "d", "(IIIJ)Lcom/google/android/vv6;", "e", "(IJ)Lcom/google/android/vv6;", "", "j", "(I)V", "", "key", "contentType", "", "Landroidx/compose/ui/layout/o;", "placeables", "c", "(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/List;J)Lcom/google/android/vv6;", "b", "Lcom/google/android/hv6;", "Lcom/google/android/wt6;", "J", "g", "()J", "childConstraints", "Lcom/google/android/ot6;", "i", "()Lcom/google/android/ot6;", "keyIndexMap", "Lcom/google/android/x06;", "h", "()Lcom/google/android/x06;", "headerIndexes", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class wv6 extends bu6<vv6> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final hv6 itemProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final wt6 measureScope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long childConstraints;

    public /* synthetic */ wv6(long j, boolean z, hv6 hv6Var, wt6 wt6Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, z, hv6Var, wt6Var);
    }

    public static /* synthetic */ vv6 f(wv6 wv6Var, int i, long j, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-0kLqBqw");
        }
        if ((i2 & 2) != 0) {
            j = wv6Var.childConstraints;
        }
        return wv6Var.e(i, j);
    }

    public abstract vv6 c(int index, Object key, Object contentType, List<? extends o> placeables, long constraints);

    @Override // com.google.inputmethod.bu6
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public vv6 a(int index, int lane, int span, long constraints) {
        return e(index, constraints);
    }

    public final vv6 e(int index, long constraints) {
        return c(index, this.itemProvider.d(index), this.itemProvider.f(index), b(this.measureScope, index, constraints), constraints);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getChildConstraints() {
        return this.childConstraints;
    }

    public final x06 h() {
        return this.itemProvider.e();
    }

    public final ot6 i() {
        return this.itemProvider.b();
    }

    public final void j(int index) {
        if (index < 0 || index >= this.itemProvider.a()) {
            return;
        }
        this.measureScope.C2(index);
    }

    private wv6(long j, boolean z, hv6 hv6Var, wt6 wt6Var) {
        this.itemProvider = hv6Var;
        this.measureScope = wt6Var;
        this.childConstraints = nx1.b(0, z ? kx1.l(j) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : kx1.k(j), 5, null);
    }
}
