package androidx.compose.p001foundation.text;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.text.u;
import androidx.compose.p004runtime.p0;
import androidx.compose.ui.text.x;
import com.google.inputmethod.gba;
import com.google.inputmethod.k0b;
import com.google.inputmethod.k47;
import com.google.inputmethod.l48;
import com.google.inputmethod.mwb;
import com.google.inputmethod.o0b;
import com.google.inputmethod.o58;
import com.google.inputmethod.q48;
import com.google.inputmethod.tm9;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b&\b\u0001\u0018\u0000 #2\u00020\u0001:\u0001\u001bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R+\u0010!\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R+\u0010%\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R+\u0010,\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\"\u00106\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R+\u0010\t\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006<"}, d2 = {"Landroidx/compose/foundation/text/u;", "", "Landroidx/compose/foundation/gestures/Orientation;", "initialOrientation", "", "initial", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;F)V", "()V", "orientation", "Lcom/google/android/gba;", "cursorRect", "", "containerSize", "textFieldSize", "", "o", "(Landroidx/compose/foundation/gestures/Orientation;Lcom/google/android/gba;II)V", "cursorStart", "cursorEnd", "f", "(FFI)V", "Landroidx/compose/ui/text/x;", "selection", "i", "(J)I", "<set-?>", "a", "Lcom/google/android/l48;", "h", "()F", "l", "(F)V", "offset", "b", "g", "k", "maximum", "c", "Lcom/google/android/q48;", "getViewportSize", "()I", "n", "(I)V", "viewportSize", "d", "Lcom/google/android/gba;", "previousCursorRect", "e", "J", "getPreviousSelection-d9O1mEE", "()J", "m", "(J)V", "previousSelection", "Lcom/google/android/o58;", "j", "()Landroidx/compose/foundation/gestures/Orientation;", "setOrientation", "(Landroidx/compose/foundation/gestures/Orientation;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final k0b<u, Object> h = k47.b(new Function2() { // from class: com.google.android.uuc
        public final Object invoke(Object obj, Object obj2) {
            return u.c((o0b) obj, (u) obj2);
        }
    }, new Function1() { // from class: com.google.android.vuc
        public final Object invoke(Object obj) {
            return u.d((List) obj);
        }
    });

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final l48 offset;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final l48 maximum;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final q48 viewportSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private gba previousCursorRect;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long previousSelection;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final o58 orientation;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.u$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/u$a;", "", "<init>", "()V", "Lcom/google/android/k0b;", "Landroidx/compose/foundation/text/u;", "Saver", "Lcom/google/android/k0b;", "a", "()Lcom/google/android/k0b;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k0b<u, Object> a() {
            return u.h;
        }

        private Companion() {
        }
    }

    public u(Orientation orientation, float f) {
        this.offset = tm9.a(f);
        this.maximum = tm9.a(0.0f);
        this.viewportSize = mwb.a(0);
        this.previousCursorRect = gba.INSTANCE.a();
        this.previousSelection = x.INSTANCE.a();
        this.orientation = p0.i(orientation, p0.t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c(o0b o0bVar, u uVar) {
        return m.s(new Object[]{Float.valueOf(uVar.h()), Boolean.valueOf(uVar.j() == Orientation.Vertical)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u d(List list) {
        Object obj = list.get(1);
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Boolean");
        Orientation orientation = ((Boolean) obj).booleanValue() ? Orientation.Vertical : Orientation.Horizontal;
        Object obj2 = list.get(0);
        Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.Float");
        return new u(orientation, ((Float) obj2).floatValue());
    }

    private final void k(float f) {
        this.maximum.p(f);
    }

    private final void n(int i) {
        this.viewportSize.f(i);
    }

    public final void f(float cursorStart, float cursorEnd, int containerSize) {
        float f;
        float fH = h();
        float f2 = containerSize;
        float f3 = fH + f2;
        if (cursorEnd <= f3 && (cursorStart >= fH || cursorEnd - cursorStart <= f2)) {
            f = (cursorStart >= fH || cursorEnd - cursorStart > f2) ? 0.0f : cursorStart - fH;
        } else {
            f = cursorEnd - f3;
        }
        l(h() + f);
    }

    public final float g() {
        return this.maximum.b();
    }

    public final float h() {
        return this.offset.b();
    }

    public final int i(long selection) {
        if (x.n(selection) != x.n(this.previousSelection)) {
            return x.n(selection);
        }
        return x.i(selection) != x.i(this.previousSelection) ? x.i(selection) : x.l(selection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Orientation j() {
        return (Orientation) this.orientation.getValue();
    }

    public final void l(float f) {
        this.offset.p(f);
    }

    public final void m(long j) {
        this.previousSelection = j;
    }

    public final void o(Orientation orientation, gba cursorRect, int containerSize, int textFieldSize) {
        float f = textFieldSize - containerSize;
        k(f);
        if (cursorRect.getLeft() != this.previousCursorRect.getLeft() || cursorRect.getTop() != this.previousCursorRect.getTop()) {
            boolean z = orientation == Orientation.Vertical;
            f(z ? cursorRect.getTop() : cursorRect.getLeft(), z ? cursorRect.getBottom() : cursorRect.getRight(), containerSize);
            this.previousCursorRect = cursorRect;
        }
        l(g.n(h(), 0.0f, f));
        n(containerSize);
    }

    public /* synthetic */ u(Orientation orientation, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(orientation, (i & 2) != 0 ? 0.0f : f);
    }

    public u() {
        this(Orientation.Vertical, 0.0f, 2, null);
    }
}
