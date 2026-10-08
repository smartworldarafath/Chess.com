package androidx.compose.p001foundation.layout;

import com.google.inputmethod.ff3;
import com.google.inputmethod.jz5;
import com.google.inputmethod.uy7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Landroidx/compose/foundation/layout/v0;", "Lcom/google/android/uy7;", "Landroidx/compose/foundation/layout/x0;", "Lcom/google/android/ff3;", "minWidth", "minHeight", "maxWidth", "maxHeight", "", "enforceIncoming", "Lkotlin/Function1;", "Lcom/google/android/jz5;", "", "inspectorInfo", "<init>", "(FFFFZLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/foundation/layout/x0;", "node", "e", "(Landroidx/compose/foundation/layout/x0;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "F", "f", "g", "h", "Z", "i", "Lkotlin/jvm/functions/Function1;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class v0 extends uy7<x0> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float minWidth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float minHeight;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float maxWidth;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final float maxHeight;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean enforceIncoming;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Function1<jz5, Unit> inspectorInfo;

    public /* synthetic */ v0(float f, float f2, float f3, float f4, boolean z, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z, function1);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public x0 a() {
        return new x0(this.minWidth, this.minHeight, this.maxWidth, this.maxHeight, this.enforceIncoming, null);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(x0 node) {
        node.t3(this.minWidth);
        node.s3(this.minHeight);
        node.r3(this.maxWidth);
        node.q3(this.maxHeight);
        node.p3(this.enforceIncoming);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) other;
        return ff3.k(this.minWidth, v0Var.minWidth) && ff3.k(this.minHeight, v0Var.minHeight) && ff3.k(this.maxWidth, v0Var.maxWidth) && ff3.k(this.maxHeight, v0Var.maxHeight) && this.enforceIncoming == v0Var.enforceIncoming;
    }

    public int hashCode() {
        return (((((((ff3.l(this.minWidth) * 31) + ff3.l(this.minHeight)) * 31) + ff3.l(this.maxWidth)) * 31) + ff3.l(this.maxHeight)) * 31) + Boolean.hashCode(this.enforceIncoming);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private v0(float f, float f2, float f3, float f4, boolean z, Function1<? super jz5, Unit> function1) {
        this.minWidth = f;
        this.minHeight = f2;
        this.maxWidth = f3;
        this.maxHeight = f4;
        this.enforceIncoming = z;
        this.inspectorInfo = function1;
    }

    public /* synthetic */ v0(float f, float f2, float f3, float f4, boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ff3.INSTANCE.c() : f, (i & 2) != 0 ? ff3.INSTANCE.c() : f2, (i & 4) != 0 ? ff3.INSTANCE.c() : f3, (i & 8) != 0 ? ff3.INSTANCE.c() : f4, z, function1, null);
    }
}
