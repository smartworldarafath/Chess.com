package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "a", "()Landroidx/compose/ui/graphics/Path;", "Landroid/graphics/Path;", "c", "(Landroid/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "", "message", "", "d", "(Ljava/lang/String;)V", "Landroidx/compose/ui/graphics/Path$Direction;", "Landroid/graphics/Path$Direction;", "e", "(Landroidx/compose/ui/graphics/Path$Direction;)Landroid/graphics/Path$Direction;", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Path.Direction.values().length];
            try {
                iArr[Path.Direction.CounterClockwise.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Path.Direction.Clockwise.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Path a() {
        android.graphics.Path path = null;
        return new c(path, 1, path);
    }

    public static final Path c(android.graphics.Path path) {
        return new c(path);
    }

    public static final void d(String str) {
        throw new IllegalStateException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final android.graphics.Path.Direction e(Path.Direction direction) throws NoWhenBranchMatchedException {
        int i = a.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == 1) {
            return android.graphics.Path.Direction.CCW;
        }
        if (i == 2) {
            return android.graphics.Path.Direction.CW;
        }
        throw new NoWhenBranchMatchedException();
    }
}
