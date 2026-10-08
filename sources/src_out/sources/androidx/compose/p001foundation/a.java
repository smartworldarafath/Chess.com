package androidx.compose.p001foundation;

import com.google.inputmethod.cfb;
import com.google.inputmethod.ei1;
import com.google.inputmethod.jz5;
import com.google.inputmethod.qu0;
import com.google.inputmethod.uy7;
import com.google.inputmethod.xkb;
import com.google.inputmethod.zg3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Landroidx/compose/foundation/a;", "Lcom/google/android/uy7;", "Landroidx/compose/foundation/c;", "Lcom/google/android/ei1;", "color", "Lcom/google/android/qu0;", "brush", "", "alpha", "Lcom/google/android/xkb;", "shape", "Lkotlin/Function1;", "Lcom/google/android/jz5;", "", "inspectorInfo", "<init>", "(JLcom/google/android/qu0;FLcom/google/android/xkb;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/foundation/c;", "node", "e", "(Landroidx/compose/foundation/c;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "Lcom/google/android/qu0;", "f", "F", "g", "Lcom/google/android/xkb;", "h", "Lkotlin/jvm/functions/Function1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a extends uy7<c> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long color;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final qu0 brush;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float alpha;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final xkb shape;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Function1<jz5, Unit> inspectorInfo;

    public /* synthetic */ a(long j, qu0 qu0Var, float f, xkb xkbVar, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, qu0Var, f, xkbVar, function1);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public c a() {
        return new c(this.color, this.brush, this.alpha, this.shape, null);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(c node) {
        node.n(this.color);
        node.Z1(this.brush);
        node.c(this.alpha);
        if (!Intrinsics.e(node.getShape(), this.shape)) {
            node.R0(this.shape);
            cfb.d(node);
        }
        zg3.a(node);
    }

    public boolean equals(Object other) {
        a aVar = other instanceof a ? (a) other : null;
        return aVar != null && ei1.r(this.color, aVar.color) && Intrinsics.e(this.brush, aVar.brush) && this.alpha == aVar.alpha && Intrinsics.e(this.shape, aVar.shape);
    }

    public int hashCode() {
        int iX = ei1.x(this.color) * 31;
        qu0 qu0Var = this.brush;
        return ((((iX + (qu0Var != null ? qu0Var.hashCode() : 0)) * 31) + Float.hashCode(this.alpha)) * 31) + this.shape.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private a(long j, qu0 qu0Var, float f, xkb xkbVar, Function1<? super jz5, Unit> function1) {
        this.color = j;
        this.brush = qu0Var;
        this.alpha = f;
        this.shape = xkbVar;
        this.inspectorInfo = function1;
    }

    public /* synthetic */ a(long j, qu0 qu0Var, float f, xkb xkbVar, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ei1.INSTANCE.i() : j, (i & 2) != 0 ? null : qu0Var, f, xkbVar, function1, null);
    }
}
