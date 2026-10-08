package androidx.compose.p001foundation.layout;

import com.google.inputmethod.ff3;
import com.google.inputmethod.jz5;
import com.google.inputmethod.uc;
import com.google.inputmethod.uy7;
import com.google.inputmethod.xw5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Landroidx/compose/foundation/layout/a;", "Lcom/google/android/uy7;", "Landroidx/compose/foundation/layout/b;", "Lcom/google/android/uc;", "alignmentLine", "Lcom/google/android/ff3;", "before", "after", "Lkotlin/Function1;", "Lcom/google/android/jz5;", "", "inspectorInfo", "<init>", "(Lcom/google/android/uc;FFLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/foundation/layout/b;", "node", "e", "(Landroidx/compose/foundation/layout/b;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/android/uc;", "getAlignmentLine", "()Lcom/google/android/uc;", "F", "getBefore-D9Ej5fM", "()F", "f", "getAfter-D9Ej5fM", "g", "Lkotlin/jvm/functions/Function1;", "getInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a extends uy7<b> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final uc alignmentLine;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float before;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float after;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Function1<jz5, Unit> inspectorInfo;

    public /* synthetic */ a(uc ucVar, float f, float f2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(ucVar, f, f2, function1);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this.alignmentLine, this.before, this.after, null);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(b node) {
        node.n3(this.alignmentLine);
        node.o3(this.before);
        node.m3(this.after);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        a aVar = other instanceof a ? (a) other : null;
        return aVar != null && Intrinsics.e(this.alignmentLine, aVar.alignmentLine) && ff3.k(this.before, aVar.before) && ff3.k(this.after, aVar.after);
    }

    public int hashCode() {
        return (((this.alignmentLine.hashCode() * 31) + ff3.l(this.before)) * 31) + ff3.l(this.after);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private a(uc ucVar, float f, float f2, Function1<? super jz5, Unit> function1) {
        this.alignmentLine = ucVar;
        this.before = f;
        this.after = f2;
        this.inspectorInfo = function1;
        boolean z = true;
        boolean z2 = f >= 0.0f || Float.isNaN(f);
        if (f2 < 0.0f && !Float.isNaN(f2)) {
            z = false;
        }
        if (!z2 || !z) {
            xw5.a("Padding from alignment line must be a non-negative number");
        }
    }
}
