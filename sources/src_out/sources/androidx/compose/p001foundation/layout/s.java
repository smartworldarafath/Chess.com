package androidx.compose.p001foundation.layout;

import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.tc;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \f2\u00020\u0001:\u0003\f\u0011\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H ¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0002\u0014\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/layout/s;", "", "<init>", "()V", "", "size", "itemCrossAxisSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/layout/o;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(IILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/layout/o;I)I", "b", "(Landroidx/compose/ui/layout/o;)Ljava/lang/Integer;", "", "c", "()Z", "isRelative", "Landroidx/compose/foundation/layout/s$b;", "Landroidx/compose/foundation/layout/s$c;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class s {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.s$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/layout/s$a;", "", "<init>", "()V", "Lcom/google/android/tc$c;", "vertical", "Landroidx/compose/foundation/layout/s;", "b", "(Lcom/google/android/tc$c;)Landroidx/compose/foundation/layout/s;", "Lcom/google/android/tc$b;", "horizontal", "a", "(Lcom/google/android/tc$b;)Landroidx/compose/foundation/layout/s;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s a(tc.b horizontal) {
            return new HorizontalCrossAxisAlignment(horizontal);
        }

        public final s b(tc.c vertical) {
            return new VerticalCrossAxisAlignment(vertical);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.s$b, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/layout/s$b;", "Landroidx/compose/foundation/layout/s;", "Lcom/google/android/tc$b;", "horizontal", "<init>", "(Lcom/google/android/tc$b;)V", "", "size", "itemCrossAxisSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/layout/o;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(IILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/layout/o;I)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/google/android/tc$b;", "getHorizontal", "()Lcom/google/android/tc$b;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class HorizontalCrossAxisAlignment extends s {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final tc.b horizontal;

        public HorizontalCrossAxisAlignment(tc.b bVar) {
            super(null);
            this.horizontal = bVar;
        }

        @Override // androidx.compose.p001foundation.layout.s
        public int a(int size, int itemCrossAxisSize, LayoutDirection layoutDirection, o placeable, int beforeCrossAxisAlignmentLine) {
            return this.horizontal.a(itemCrossAxisSize, size, layoutDirection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HorizontalCrossAxisAlignment) && Intrinsics.e(this.horizontal, ((HorizontalCrossAxisAlignment) other).horizontal);
        }

        public int hashCode() {
            return this.horizontal.hashCode();
        }

        public String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.horizontal + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.s$c, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/layout/s$c;", "Landroidx/compose/foundation/layout/s;", "Lcom/google/android/tc$c;", "vertical", "<init>", "(Lcom/google/android/tc$c;)V", "", "size", "itemCrossAxisSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/layout/o;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(IILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/layout/o;I)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/google/android/tc$c;", "getVertical", "()Lcom/google/android/tc$c;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class VerticalCrossAxisAlignment extends s {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final tc.c vertical;

        public VerticalCrossAxisAlignment(tc.c cVar) {
            super(null);
            this.vertical = cVar;
        }

        @Override // androidx.compose.p001foundation.layout.s
        public int a(int size, int itemCrossAxisSize, LayoutDirection layoutDirection, o placeable, int beforeCrossAxisAlignmentLine) {
            return this.vertical.a(itemCrossAxisSize, size);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VerticalCrossAxisAlignment) && Intrinsics.e(this.vertical, ((VerticalCrossAxisAlignment) other).vertical);
        }

        public int hashCode() {
            return this.vertical.hashCode();
        }

        public String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.vertical + ')';
        }
    }

    public /* synthetic */ s(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int a(int size, int itemCrossAxisSize, LayoutDirection layoutDirection, o placeable, int beforeCrossAxisAlignmentLine);

    public Integer b(o placeable) {
        return null;
    }

    public boolean c() {
        return false;
    }

    private s() {
    }
}
