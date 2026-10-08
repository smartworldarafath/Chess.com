package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.d;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.google.inputmethod.SolidColor;
import com.google.inputmethod.a3e;
import com.google.inputmethod.eh3;
import com.google.inputmethod.ei1;
import com.google.inputmethod.qu0;
import com.google.inputmethod.u39;
import com.google.inputmethod.vg3;
import com.google.inputmethod.z39;
import com.google.inputmethod.zh7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u001d\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u001d\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0006*\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010,\u001a\u00020&2\u0006\u0010'\u001a\u00020&8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R$\u00101\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R6\u00109\u001a\b\u0012\u0004\u0012\u000203022\f\u0010'\u001a\b\u0012\u0004\u0012\u000203028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010$\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0016\u0010:\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010)R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R0\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010?8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010@\u001a\u0004\b\u001f\u0010A\"\u0004\b(\u0010BR \u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010@R*\u0010I\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010E\u001a\u0004\bF\u0010\u001d\"\u0004\bG\u0010HR*\u0010P\u001a\u00020J2\u0006\u0010'\u001a\u00020J8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR*\u0010S\u001a\u00020J2\u0006\u0010'\u001a\u00020J8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010K\u001a\u0004\bQ\u0010M\"\u0004\bR\u0010OR*\u0010V\u001a\u00020J2\u0006\u0010'\u001a\u00020J8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010K\u001a\u0004\bT\u0010M\"\u0004\bU\u0010OR*\u0010Y\u001a\u00020J2\u0006\u0010'\u001a\u00020J8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010K\u001a\u0004\bW\u0010M\"\u0004\bX\u0010OR*\u0010\\\u001a\u00020J2\u0006\u0010'\u001a\u00020J8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010K\u001a\u0004\bZ\u0010M\"\u0004\b[\u0010OR*\u0010_\u001a\u00020J2\u0006\u0010'\u001a\u00020J8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010K\u001a\u0004\b]\u0010M\"\u0004\b^\u0010OR*\u0010b\u001a\u00020J2\u0006\u0010'\u001a\u00020J8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010K\u001a\u0004\b`\u0010M\"\u0004\ba\u0010OR\u0016\u0010c\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010)R\u0014\u0010d\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010+R\u0011\u0010f\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b4\u0010e¨\u0006g"}, d2 = {"Landroidx/compose/ui/graphics/vector/GroupComponent;", "Landroidx/compose/ui/graphics/vector/a;", "<init>", "()V", "Lcom/google/android/qu0;", "brush", "", "l", "(Lcom/google/android/qu0;)V", "Lcom/google/android/ei1;", "color", "m", "(J)V", "node", "n", "(Landroidx/compose/ui/graphics/vector/a;)V", "k", "x", "y", "", "index", "instance", "i", "(ILandroidx/compose/ui/graphics/vector/a;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "a", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "toString", "()Ljava/lang/String;", "Lcom/google/android/zh7;", "b", "[F", "groupMatrix", "", "c", "Ljava/util/List;", "children", "", "value", "d", "Z", "j", "()Z", "isTintable", "e", "J", "g", "()J", "tintColor", "", "Lcom/google/android/u39;", "f", "getClipPathData", "()Ljava/util/List;", "o", "(Ljava/util/List;)V", "clipPathData", "isClipPathDirty", "Landroidx/compose/ui/graphics/Path;", "h", "Landroidx/compose/ui/graphics/Path;", "clipPath", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "(Lkotlin/jvm/functions/Function1;)V", "invalidateListener", "wrappedListener", "Ljava/lang/String;", "getName", "p", "(Ljava/lang/String;)V", "name", "", "F", "getRotation", "()F", "s", "(F)V", "rotation", "getPivotX", "q", "pivotX", "getPivotY", "r", "pivotY", "getScaleX", "t", "scaleX", "getScaleY", "u", "scaleY", "getTranslationX", "v", "translationX", "getTranslationY", "w", "translationY", "isMatrixDirty", "willClipPath", "()I", "numChildren", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GroupComponent extends a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float[] groupMatrix;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<a> children;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isTintable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long tintColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private List<? extends u39> clipPathData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean isClipPathDirty;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private Path clipPath;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private Function1<? super a, Unit> invalidateListener;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Function1<a, Unit> wrappedListener;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private String name;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private float rotation;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private float pivotX;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private float pivotY;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private float scaleX;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private float scaleY;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private float translationX;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private float translationY;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean isMatrixDirty;

    public GroupComponent() {
        super(null);
        this.children = new ArrayList();
        this.isTintable = true;
        this.tintColor = ei1.INSTANCE.i();
        this.clipPathData = a3e.e();
        this.isClipPathDirty = true;
        this.wrappedListener = new Function1<a, Unit>() { // from class: androidx.compose.ui.graphics.vector.GroupComponent$wrappedListener$1
            {
                super(1);
            }

            public final void a(a aVar) {
                this.this$0.n(aVar);
                Function1<a, Unit> function1B = this.this$0.b();
                if (function1B != null) {
                    function1B.invoke(aVar);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a) obj);
                return Unit.a;
            }
        };
        this.name = "";
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.isMatrixDirty = true;
    }

    private final boolean h() {
        return !this.clipPathData.isEmpty();
    }

    private final void k() {
        this.isTintable = false;
        this.tintColor = ei1.INSTANCE.i();
    }

    private final void l(qu0 brush) {
        if (this.isTintable && brush != null) {
            if (brush instanceof SolidColor) {
                m(((SolidColor) brush).getValue());
            } else {
                k();
            }
        }
    }

    private final void m(long color) {
        if (this.isTintable && color != 16) {
            long j = this.tintColor;
            if (j == 16) {
                this.tintColor = color;
            } else {
                if (a3e.f(j, color)) {
                    return;
                }
                k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(a node) {
        if (node instanceof PathComponent) {
            PathComponent pathComponent = (PathComponent) node;
            l(pathComponent.getFill());
            l(pathComponent.getStroke());
        } else if (node instanceof GroupComponent) {
            GroupComponent groupComponent = (GroupComponent) node;
            if (groupComponent.isTintable && this.isTintable) {
                m(groupComponent.tintColor);
            } else {
                k();
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void x() throws NoWhenBranchMatchedException {
        if (h()) {
            Path pathA = this.clipPath;
            if (pathA == null) {
                pathA = d.a();
                this.clipPath = pathA;
            }
            z39.c(this.clipPathData, pathA);
        }
    }

    private final void y() {
        float[] fArrC = this.groupMatrix;
        if (fArrC == null) {
            fArrC = zh7.c(null, 1, null);
            this.groupMatrix = fArrC;
        } else {
            zh7.i(fArrC);
        }
        float[] fArr = fArrC;
        zh7.s(fArr, this.pivotX + this.translationX, this.pivotY + this.translationY, 0.0f, 4, null);
        zh7.m(fArr, this.rotation);
        zh7.n(fArr, this.scaleX, this.scaleY, 1.0f);
        zh7.s(fArr, -this.pivotX, -this.pivotY, 0.0f, 4, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.ui.graphics.vector.a
    public void a(DrawScope drawScope) throws NoWhenBranchMatchedException {
        if (this.isMatrixDirty) {
            y();
            this.isMatrixDirty = false;
        }
        if (this.isClipPathDirty) {
            x();
            this.isClipPathDirty = false;
        }
        vg3 drawContext = drawScope.getDrawContext();
        long jD = drawContext.d();
        drawContext.b().v();
        try {
            eh3 transform = drawContext.getTransform();
            float[] fArr = this.groupMatrix;
            if (fArr != null) {
                transform.a(zh7.a(fArr).getValues());
            }
            Path path = this.clipPath;
            if (h() && path != null) {
                eh3.i(transform, path, 0, 2, null);
            }
            List<a> list = this.children;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).a(drawScope);
            }
        } finally {
            drawContext.b().o();
            drawContext.c(jD);
        }
    }

    @Override // androidx.compose.ui.graphics.vector.a
    public Function1<a, Unit> b() {
        return this.invalidateListener;
    }

    @Override // androidx.compose.ui.graphics.vector.a
    public void d(Function1<? super a, Unit> function1) {
        this.invalidateListener = function1;
    }

    public final int f() {
        return this.children.size();
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getTintColor() {
        return this.tintColor;
    }

    public final void i(int index, a instance) {
        if (index < f()) {
            this.children.set(index, instance);
        } else {
            this.children.add(instance);
        }
        n(instance);
        instance.d(this.wrappedListener);
        c();
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsTintable() {
        return this.isTintable;
    }

    public final void o(List<? extends u39> list) {
        this.clipPathData = list;
        this.isClipPathDirty = true;
        c();
    }

    public final void p(String str) {
        this.name = str;
        c();
    }

    public final void q(float f) {
        this.pivotX = f;
        this.isMatrixDirty = true;
        c();
    }

    public final void r(float f) {
        this.pivotY = f;
        this.isMatrixDirty = true;
        c();
    }

    public final void s(float f) {
        this.rotation = f;
        this.isMatrixDirty = true;
        c();
    }

    public final void t(float f) {
        this.scaleX = f;
        this.isMatrixDirty = true;
        c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VGroup: ");
        sb.append(this.name);
        List<a> list = this.children;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a aVar = list.get(i);
            sb.append("\t");
            sb.append(aVar.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public final void u(float f) {
        this.scaleY = f;
        this.isMatrixDirty = true;
        c();
    }

    public final void v(float f) {
        this.translationX = f;
        this.isMatrixDirty = true;
        c();
    }

    public final void w(float f) {
        this.translationY = f;
        this.isMatrixDirty = true;
        c();
    }
}
