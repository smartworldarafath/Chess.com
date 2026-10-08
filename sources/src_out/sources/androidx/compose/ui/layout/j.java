package androidx.compose.ui.layout;

import androidx.compose.ui.node.LookaheadCapablePlaceable;
import com.google.inputmethod.fj7;
import com.google.inputmethod.h66;
import com.google.inputmethod.mra;
import com.google.inputmethod.uc;
import com.google.inputmethod.zw5;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.b0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001JI\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJa\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00052\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/j;", "Lcom/google/android/h66;", "", "width", "height", "", "Lcom/google/android/uc;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/o$a;", "", "placementBlock", "Lcom/google/android/fj7;", "h2", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Lcom/google/android/fj7;", "Lcom/google/android/mra;", "rulers", "B2", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/google/android/fj7;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface j extends h66 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
    }

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"androidx/compose/ui/layout/j$b", "Lcom/google/android/fj7;", "", "l", "()V", "", "a", "I", "getWidth", "()I", "width", "b", "getHeight", "height", "", "Lcom/google/android/uc;", "c", "Ljava/util/Map;", "j", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Lcom/google/android/mra;", "d", "Lkotlin/jvm/functions/Function1;", "k", "()Lkotlin/jvm/functions/Function1;", "rulers", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements fj7 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int width;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int height;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Map<uc, Integer> alignmentLines;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Function1<mra, Unit> rulers;
        final /* synthetic */ int e;
        final /* synthetic */ j f;
        final /* synthetic */ Function1<o.a, Unit> g;

        /* JADX WARN: Multi-variable type inference failed */
        b(int i, int i2, Map<uc, Integer> map, Function1<? super mra, Unit> function1, j jVar, Function1<? super o.a, Unit> function2) {
            this.e = i;
            this.f = jVar;
            this.g = function2;
            this.width = i;
            this.height = i2;
            this.alignmentLines = map;
            this.rulers = function1;
        }

        @Override // com.google.inputmethod.fj7
        /* JADX INFO: renamed from: getHeight, reason: from getter */
        public int getB() {
            return this.height;
        }

        @Override // com.google.inputmethod.fj7
        /* JADX INFO: renamed from: getWidth, reason: from getter */
        public int getA() {
            return this.width;
        }

        @Override // com.google.inputmethod.fj7
        public Map<uc, Integer> j() {
            return this.alignmentLines;
        }

        @Override // com.google.inputmethod.fj7
        public Function1<mra, Unit> k() {
            return this.rulers;
        }

        @Override // com.google.inputmethod.fj7
        public void l() {
            j jVar = this.f;
            if (jVar instanceof LookaheadCapablePlaceable) {
                this.g.invoke(((LookaheadCapablePlaceable) jVar).getPlacementScope());
            } else {
                this.g.invoke(new v(this.e, this.f.getLayoutDirection(), this.f.getDensity(), this.f.getFontScale()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ fj7 Q1(j jVar, int i, int i2, Map map, Function1 function1, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i3 & 4) != 0) {
            map = b0.j();
        }
        return jVar.h2(i, i2, map, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ fj7 m1(j jVar, int i, int i2, Map map, Function1 function1, Function1 function2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i3 & 4) != 0) {
            map = b0.j();
        }
        Map map2 = map;
        if ((i3 & 8) != 0) {
            function1 = null;
        }
        return jVar.B2(i, i2, map2, function1, function2);
    }

    default fj7 B2(int width, int height, Map<uc, Integer> alignmentLines, Function1<? super mra, Unit> rulers, Function1<? super o.a, Unit> placementBlock) {
        if (!((width & (-16777216)) == 0 && ((-16777216) & height) == 0)) {
            zw5.c("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new b(width, height, alignmentLines, rulers, this, placementBlock);
    }

    default fj7 h2(int width, int height, Map<uc, Integer> alignmentLines, Function1<? super o.a, Unit> placementBlock) {
        return B2(width, height, alignmentLines, null, placementBlock);
    }
}
