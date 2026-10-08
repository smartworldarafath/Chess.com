package androidx.compose.ui.layout;

import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.fj7;
import com.google.inputmethod.h66;
import com.google.inputmethod.mra;
import com.google.inputmethod.uc;
import com.google.inputmethod.zw5;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J]\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00100\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0097\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u001c\u001a\u00020\u0018*\u00020\u001bH\u0097\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0014\u0010\u001e\u001a\u00020\b*\u00020\u0017H\u0097\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0014\u0010 \u001a\u00020\b*\u00020\u001bH\u0097\u0001¢\u0006\u0004\b \u0010!J\u0014\u0010\"\u001a\u00020\u0017*\u00020\bH\u0097\u0001¢\u0006\u0004\b\"\u0010#J\u0014\u0010$\u001a\u00020\u0017*\u00020\u0018H\u0097\u0001¢\u0006\u0004\b$\u0010\u001aJ\u0014\u0010%\u001a\u00020\u0017*\u00020\u001bH\u0097\u0001¢\u0006\u0004\b%\u0010\u001dJ\u0014\u0010&\u001a\u00020\u001b*\u00020\bH\u0097\u0001¢\u0006\u0004\b&\u0010'J\u0014\u0010(\u001a\u00020\u001b*\u00020\u0018H\u0097\u0001¢\u0006\u0004\b(\u0010)J\u0014\u0010*\u001a\u00020\u001b*\u00020\u0017H\u0097\u0001¢\u0006\u0004\b*\u0010)J\u0014\u0010-\u001a\u00020,*\u00020+H\u0097\u0001¢\u0006\u0004\b-\u0010.J\u0014\u0010/\u001a\u00020+*\u00020,H\u0097\u0001¢\u0006\u0004\b/\u0010.R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00107\u001a\u0002048VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010:\u001a\u00020\u00188\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u00188\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b;\u00109¨\u0006="}, d2 = {"Landroidx/compose/ui/layout/f;", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/h66;", "intrinsicMeasureScope", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "<init>", "(Lcom/google/android/h66;Landroidx/compose/ui/unit/LayoutDirection;)V", "", "width", "height", "", "Lcom/google/android/uc;", "alignmentLines", "Lkotlin/Function1;", "Lcom/google/android/mra;", "", "rulers", "Landroidx/compose/ui/layout/o$a;", "placementBlock", "Lcom/google/android/fj7;", "B2", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/google/android/fj7;", "Lcom/google/android/ff3;", "", "x2", "(F)F", "Lcom/google/android/b0d;", "T1", "(J)F", "O1", "(F)I", "A2", "(J)I", "O0", "(I)F", "P0", "U", "X", "(I)J", "Y", "(F)J", "s1", "Lcom/google/android/jf3;", "Lcom/google/android/tsb;", "b1", "(J)J", "S", "b", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "", "G1", "()Z", "isLookingAhead", "getDensity", "()F", "density", "w2", "fontScale", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements j, h66 {
    private final /* synthetic */ h66 a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final LayoutDirection layoutDirection;

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"androidx/compose/ui/layout/f$a", "Lcom/google/android/fj7;", "", "l", "()V", "", "getWidth", "()I", "width", "getHeight", "height", "", "Lcom/google/android/uc;", "j", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Lcom/google/android/mra;", "k", "()Lkotlin/jvm/functions/Function1;", "rulers", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements fj7 {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ Map<uc, Integer> c;
        final /* synthetic */ Function1<mra, Unit> d;

        /* JADX WARN: Multi-variable type inference failed */
        a(int i, int i2, Map<uc, Integer> map, Function1<? super mra, Unit> function1) {
            this.a = i;
            this.b = i2;
            this.c = map;
            this.d = function1;
        }

        @Override // com.google.inputmethod.fj7
        public int getHeight() {
            return this.b;
        }

        @Override // com.google.inputmethod.fj7
        public int getWidth() {
            return this.a;
        }

        @Override // com.google.inputmethod.fj7
        public Map<uc, Integer> j() {
            return this.c;
        }

        @Override // com.google.inputmethod.fj7
        public Function1<mra, Unit> k() {
            return this.d;
        }

        @Override // com.google.inputmethod.fj7
        public void l() {
        }
    }

    public f(h66 h66Var, LayoutDirection layoutDirection) {
        this.a = h66Var;
        this.layoutDirection = layoutDirection;
    }

    @Override // com.google.inputmethod.f43
    public int A2(long j) {
        return this.a.A2(j);
    }

    @Override // androidx.compose.ui.layout.j
    public fj7 B2(int width, int height, Map<uc, Integer> alignmentLines, Function1<? super mra, Unit> rulers, Function1<? super o.a, Unit> placementBlock) {
        boolean z = false;
        if (width < 0) {
            width = 0;
        }
        if (height < 0) {
            height = 0;
        }
        if ((width & (-16777216)) == 0 && ((-16777216) & height) == 0) {
            z = true;
        }
        if (!z) {
            zw5.c("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(width, height, alignmentLines, rulers);
    }

    @Override // com.google.inputmethod.h66
    public boolean G1() {
        return this.a.G1();
    }

    @Override // com.google.inputmethod.f43
    public float O0(int i) {
        return this.a.O0(i);
    }

    @Override // com.google.inputmethod.f43
    public int O1(float f) {
        return this.a.O1(f);
    }

    @Override // com.google.inputmethod.f43
    public float P0(float f) {
        return this.a.P0(f);
    }

    @Override // com.google.inputmethod.f43
    public long S(long j) {
        return this.a.S(j);
    }

    @Override // com.google.inputmethod.f43
    public float T1(long j) {
        return this.a.T1(j);
    }

    @Override // com.google.inputmethod.hm4
    public float U(long j) {
        return this.a.U(j);
    }

    @Override // com.google.inputmethod.f43
    public long X(int i) {
        return this.a.X(i);
    }

    @Override // com.google.inputmethod.f43
    public long Y(float f) {
        return this.a.Y(f);
    }

    @Override // com.google.inputmethod.f43
    public long b1(long j) {
        return this.a.b1(j);
    }

    @Override // com.google.inputmethod.f43
    public float getDensity() {
        return this.a.getDensity();
    }

    @Override // com.google.inputmethod.h66
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // com.google.inputmethod.hm4
    public long s1(float f) {
        return this.a.s1(f);
    }

    @Override // com.google.inputmethod.hm4
    /* JADX INFO: renamed from: w2 */
    public float getFontScale() {
        return this.a.getFontScale();
    }

    @Override // com.google.inputmethod.f43
    public float x2(float f) {
        return this.a.x2(f);
    }
}
