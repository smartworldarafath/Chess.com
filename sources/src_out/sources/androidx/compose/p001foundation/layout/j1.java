package androidx.compose.p001foundation.layout;

import androidx.compose.p001foundation.layout.j1;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.g16;
import com.google.inputmethod.q16;
import com.google.inputmethod.tc;
import com.google.inputmethod.uy7;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR&\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Landroidx/compose/foundation/layout/j1;", "Lcom/google/android/uy7;", "Landroidx/compose/foundation/layout/l1;", "Landroidx/compose/foundation/layout/Direction;", "direction", "", "unbounded", "Lkotlin/Function2;", "Lcom/google/android/q16;", "Landroidx/compose/ui/unit/LayoutDirection;", "Lcom/google/android/g16;", "alignmentCallback", "", "align", "", "inspectorName", "<init>", "(Landroidx/compose/foundation/layout/Direction;ZLkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/String;)V", "d", "()Landroidx/compose/foundation/layout/l1;", "node", "", "e", "(Landroidx/compose/foundation/layout/l1;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/foundation/layout/Direction;", "Z", "f", "Lkotlin/jvm/functions/Function2;", "g", "Ljava/lang/Object;", "h", "Ljava/lang/String;", "i", "a", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j1 extends uy7<l1> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Direction direction;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean unbounded;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Function2<q16, LayoutDirection, g16> alignmentCallback;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Object align;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String inspectorName;

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.j1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/layout/j1$a;", "", "<init>", "()V", "Lcom/google/android/tc$b;", "align", "", "unbounded", "Landroidx/compose/foundation/layout/j1;", "h", "(Lcom/google/android/tc$b;Z)Landroidx/compose/foundation/layout/j1;", "Lcom/google/android/tc$c;", "d", "(Lcom/google/android/tc$c;Z)Landroidx/compose/foundation/layout/j1;", "Lcom/google/android/tc;", "f", "(Lcom/google/android/tc;Z)Landroidx/compose/foundation/layout/j1;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g16 e(tc.c cVar, q16 q16Var, LayoutDirection layoutDirection) {
            return g16.c(g16.f((((long) 0) << 32) | (4294967295L & ((long) cVar.a(0, (int) (q16Var.getPackedValue() & 4294967295L))))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g16 g(tc tcVar, q16 q16Var, LayoutDirection layoutDirection) {
            return g16.c(tcVar.a(q16.INSTANCE.a(), q16Var.getPackedValue(), layoutDirection));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g16 i(tc.b bVar, q16 q16Var, LayoutDirection layoutDirection) {
            return g16.c(g16.f((((long) bVar.a(0, (int) (q16Var.getPackedValue() >> 32), layoutDirection)) << 32) | (((long) 0) & 4294967295L)));
        }

        public final j1 d(final tc.c align, boolean unbounded) {
            return new j1(Direction.Vertical, unbounded, new Function2() { // from class: com.google.android.yme
                public final Object invoke(Object obj, Object obj2) {
                    return j1.Companion.e(align, (q16) obj, (LayoutDirection) obj2);
                }
            }, align, "wrapContentHeight");
        }

        public final j1 f(final tc align, boolean unbounded) {
            return new j1(Direction.Both, unbounded, new Function2() { // from class: com.google.android.zme
                public final Object invoke(Object obj, Object obj2) {
                    return j1.Companion.g(align, (q16) obj, (LayoutDirection) obj2);
                }
            }, align, "wrapContentSize");
        }

        public final j1 h(final tc.b align, boolean unbounded) {
            return new j1(Direction.Horizontal, unbounded, new Function2() { // from class: com.google.android.xme
                public final Object invoke(Object obj, Object obj2) {
                    return j1.Companion.i(align, (q16) obj, (LayoutDirection) obj2);
                }
            }, align, "wrapContentWidth");
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j1(Direction direction, boolean z, Function2<? super q16, ? super LayoutDirection, g16> function2, Object obj, String str) {
        this.direction = direction;
        this.unbounded = z;
        this.alignmentCallback = function2;
        this.align = obj;
        this.inspectorName = str;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public l1 a() {
        return new l1(this.direction, this.unbounded, this.alignmentCallback);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(l1 node) {
        node.p3(this.direction);
        node.q3(this.unbounded);
        node.o3(this.alignmentCallback);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || j1.class != other.getClass()) {
            return false;
        }
        j1 j1Var = (j1) other;
        return this.direction == j1Var.direction && this.unbounded == j1Var.unbounded && Intrinsics.e(this.align, j1Var.align);
    }

    public int hashCode() {
        return (((this.direction.hashCode() * 31) + Boolean.hashCode(this.unbounded)) * 31) + this.align.hashCode();
    }
}
