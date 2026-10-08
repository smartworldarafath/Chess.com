package androidx.compose.ui.graphics;

import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.atb;
import com.google.inputmethod.f43;
import com.google.inputmethod.xkb;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0007\" \u0010\u0006\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/google/android/xkb;", "a", "Lcom/google/android/xkb;", "()Lcom/google/android/xkb;", "getRectangleShape$annotations", "()V", "RectangleShape", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r {
    private static final xkb a = new a();

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/compose/ui/graphics/r$a", "Lcom/google/android/xkb;", "Lcom/google/android/tsb;", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/graphics/n$b;", "a", "(JLandroidx/compose/ui/unit/LayoutDirection;Lcom/google/android/f43;)Landroidx/compose/ui/graphics/n$b;", "", "toString", "()Ljava/lang/String;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements xkb {
        a() {
        }

        @Override // com.google.inputmethod.xkb
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public n.b mo5createOutlinePq9zytI(long size, LayoutDirection layoutDirection, f43 density) {
            return new n.b(atb.c(size));
        }

        public String toString() {
            return "RectangleShape";
        }
    }

    public static final xkb a() {
        return a;
    }
}
