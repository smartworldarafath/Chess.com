package androidx.compose.ui.graphics.vector;

import androidx.compose.p004runtime.s0;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.h;
import com.google.inputmethod.a3e;
import com.google.inputmethod.ml5;
import com.google.inputmethod.nl5;
import com.google.inputmethod.o58;
import com.google.inputmethod.q16;
import com.google.inputmethod.rg3;
import com.google.inputmethod.rn8;
import com.google.inputmethod.tsb;
import com.google.inputmethod.vg3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\u0006*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u0006*\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001e\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R(\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R/\u00106\u001a\u0004\u0018\u00010\f2\b\u0010/\u001a\u0004\u0018\u00010\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0018\u00108\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00107R+\u0010>\u001a\u0002092\u0006\u0010/\u001a\u0002098@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u00101\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010A\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010C\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010BR\u0016\u0010D\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010BR \u0010G\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010FR\u0014\u0010J\u001a\u00020H8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010I¨\u0006K"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorComponent;", "Landroidx/compose/ui/graphics/vector/a;", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "root", "<init>", "(Landroidx/compose/ui/graphics/vector/GroupComponent;)V", "", "h", "()V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "alpha", "Landroidx/compose/ui/graphics/h;", "colorFilter", "i", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FLandroidx/compose/ui/graphics/h;)V", "a", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "toString", "()Ljava/lang/String;", "b", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "l", "()Landroidx/compose/ui/graphics/vector/GroupComponent;", "c", "Ljava/lang/String;", "getName", "p", "(Ljava/lang/String;)V", "name", "", "d", "Z", "isDirty", "Lcom/google/android/rg3;", "e", "Lcom/google/android/rg3;", "cacheDrawScope", "Lkotlin/Function0;", "f", "Lkotlin/jvm/functions/Function0;", "getInvalidateCallback$ui", "()Lkotlin/jvm/functions/Function0;", "o", "(Lkotlin/jvm/functions/Function0;)V", "invalidateCallback", "<set-?>", "g", "Lcom/google/android/o58;", "k", "()Landroidx/compose/ui/graphics/h;", "n", "(Landroidx/compose/ui/graphics/h;)V", "intrinsicColorFilter", "Landroidx/compose/ui/graphics/h;", "tintFilter", "Lcom/google/android/tsb;", "m", "()J", "q", "(J)V", "viewportSize", "j", "J", "previousDrawSize", "F", "rootScaleX", "rootScaleY", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "drawVectorBlock", "Lcom/google/android/nl5;", "()I", "cacheBitmapConfig", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VectorComponent extends a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final GroupComponent root;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isDirty;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final rg3 cacheDrawScope;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Function0<Unit> invalidateCallback;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final o58 intrinsicColorFilter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private h tintFilter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final o58 viewportSize;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private long previousDrawSize;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private float rootScaleX;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private float rootScaleY;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Function1<DrawScope, Unit> drawVectorBlock;

    public VectorComponent(GroupComponent groupComponent) {
        super(null);
        this.root = groupComponent;
        groupComponent.d(new Function1<a, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComponent.1
            {
                super(1);
            }

            public final void a(a aVar) {
                VectorComponent.this.h();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a) obj);
                return Unit.a;
            }
        });
        this.name = "";
        this.isDirty = true;
        this.cacheDrawScope = new rg3();
        this.invalidateCallback = new Function0<Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$invalidateCallback$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m12invoke() {
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m12invoke();
                return Unit.a;
            }
        };
        this.intrinsicColorFilter = s0.e(null, null, 2, null);
        tsb.Companion companion = tsb.INSTANCE;
        this.viewportSize = s0.e(tsb.c(companion.b()), null, 2, null);
        this.previousDrawSize = companion.a();
        this.rootScaleX = 1.0f;
        this.rootScaleY = 1.0f;
        this.drawVectorBlock = new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$drawVectorBlock$1
            {
                super(1);
            }

            public final void a(DrawScope drawScope) {
                GroupComponent root = this.this$0.getRoot();
                VectorComponent vectorComponent = this.this$0;
                float f = vectorComponent.rootScaleX;
                float f2 = vectorComponent.rootScaleY;
                long jC = rn8.INSTANCE.c();
                vg3 drawContext = drawScope.getDrawContext();
                long jD = drawContext.d();
                drawContext.b().v();
                try {
                    drawContext.getTransform().g(f, f2, jC);
                    root.a(drawScope);
                } finally {
                    drawContext.b().o();
                    drawContext.c(jD);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((DrawScope) obj);
                return Unit.a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        this.isDirty = true;
        this.invalidateCallback.invoke();
    }

    @Override // androidx.compose.ui.graphics.vector.a
    public void a(DrawScope drawScope) {
        i(drawScope, 1.0f, null);
    }

    public final void i(DrawScope drawScope, float f, h hVar) {
        DrawScope drawScope2;
        int iA = (this.root.getIsTintable() && this.root.getTintColor() != 16 && a3e.g(k()) && a3e.g(hVar)) ? nl5.INSTANCE.a() : nl5.INSTANCE.b();
        if (!this.isDirty && tsb.h(this.previousDrawSize, drawScope.d()) && nl5.i(iA, j())) {
            drawScope2 = drawScope;
        } else {
            this.tintFilter = nl5.i(iA, nl5.INSTANCE.a()) ? h.Companion.c(h.INSTANCE, a3e.h(this.root.getTintColor()), 0, 2, null) : null;
            this.rootScaleX = Float.intBitsToFloat((int) (drawScope.d() >> 32)) / Float.intBitsToFloat((int) (m() >> 32));
            this.rootScaleY = Float.intBitsToFloat((int) (drawScope.d() & 4294967295L)) / Float.intBitsToFloat((int) (m() & 4294967295L));
            drawScope2 = drawScope;
            this.cacheDrawScope.b(iA, q16.c((((long) ((int) Math.ceil(Float.intBitsToFloat((int) (drawScope.d() & 4294967295L))))) & 4294967295L) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (drawScope.d() >> 32))))) << 32)), drawScope2, drawScope.getLayoutDirection(), this.drawVectorBlock);
            this.isDirty = false;
            this.previousDrawSize = drawScope2.d();
        }
        if (hVar == null) {
            hVar = k() != null ? k() : this.tintFilter;
        }
        this.cacheDrawScope.c(drawScope2, f, hVar);
    }

    public final int j() {
        ml5 mCachedImage = this.cacheDrawScope.getMCachedImage();
        return mCachedImage != null ? mCachedImage.b() : nl5.INSTANCE.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final h k() {
        return (h) this.intrinsicColorFilter.getValue();
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final GroupComponent getRoot() {
        return this.root;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long m() {
        return ((tsb) this.viewportSize.getValue()).getPackedValue();
    }

    public final void n(h hVar) {
        this.intrinsicColorFilter.setValue(hVar);
    }

    public final void o(Function0<Unit> function0) {
        this.invalidateCallback = function0;
    }

    public final void p(String str) {
        this.name = str;
    }

    public final void q(long j) {
        this.viewportSize.setValue(tsb.c(j));
    }

    public String toString() {
        return "Params: \tname: " + this.name + "\n\tviewportWidth: " + Float.intBitsToFloat((int) (m() >> 32)) + "\n\tviewportHeight: " + Float.intBitsToFloat((int) (m() & 4294967295L)) + "\n";
    }
}
