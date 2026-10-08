package com.google.inputmethod;

import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0011\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0010B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/google/android/g8c;", "", "Lcom/google/android/kn6;", "layoutCoordinates", "Lcom/google/android/vxc;", "textLayoutResult", "<init>", "(Lcom/google/android/kn6;Lcom/google/android/vxc;)V", "", "start", "end", "Landroidx/compose/ui/graphics/Path;", "e", "(II)Landroidx/compose/ui/graphics/Path;", "b", "(Lcom/google/android/kn6;Lcom/google/android/vxc;)Lcom/google/android/g8c;", "a", "Lcom/google/android/kn6;", "d", "()Lcom/google/android/kn6;", "Lcom/google/android/vxc;", "g", "()Lcom/google/android/vxc;", "", "f", "()Z", "shouldClip", "c", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class g8c {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int d = 8;
    private static final g8c e = new g8c(null, null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final kn6 layoutCoordinates;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextLayoutResult textLayoutResult;

    /* JADX INFO: renamed from: com.google.android.g8c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/android/g8c$a;", "", "<init>", "()V", "Lcom/google/android/g8c;", "Empty", "Lcom/google/android/g8c;", "a", "()Lcom/google/android/g8c;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g8c a() {
            return g8c.e;
        }

        private Companion() {
        }
    }

    public g8c(kn6 kn6Var, TextLayoutResult textLayoutResult) {
        this.layoutCoordinates = kn6Var;
        this.textLayoutResult = textLayoutResult;
    }

    public static /* synthetic */ g8c c(g8c g8cVar, kn6 kn6Var, TextLayoutResult textLayoutResult, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i & 1) != 0) {
            kn6Var = g8cVar.layoutCoordinates;
        }
        if ((i & 2) != 0) {
            textLayoutResult = g8cVar.textLayoutResult;
        }
        return g8cVar.b(kn6Var, textLayoutResult);
    }

    public final g8c b(kn6 layoutCoordinates, TextLayoutResult textLayoutResult) {
        return new g8c(layoutCoordinates, textLayoutResult);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final kn6 getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    public Path e(int start, int end) {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        if (textLayoutResult != null) {
            return textLayoutResult.z(start, end);
        }
        return null;
    }

    public boolean f() {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        return (textLayoutResult == null || uyc.g(textLayoutResult.getLayoutInput().getOverflow(), uyc.INSTANCE.e()) || !textLayoutResult.i()) ? false : true;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextLayoutResult getTextLayoutResult() {
        return this.textLayoutResult;
    }
}
