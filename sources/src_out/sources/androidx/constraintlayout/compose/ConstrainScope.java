package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.State;
import com.google.inputmethod.ece;
import com.google.inputmethod.ff3;
import com.google.inputmethod.ma3;
import com.google.inputmethod.n6c;
import com.google.inputmethod.nf5;
import com.google.inputmethod.r4e;
import com.google.inputmethod.ug0;
import com.google.inputmethod.ww1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b.\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJU\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0003\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015JU\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0003\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0097\u0001\u0010!\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0003\u0010\u001f\u001a\u00020\u00122\b\b\u0003\u0010 \u001a\u00020\u0012ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#2\b\b\u0003\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#2\b\b\u0003\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b)\u0010(J\u0015\u0010+\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\n¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010/R,\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000701008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u00102\u001a\u0004\b3\u00104R\u0017\u00109\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b'\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u000b\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010@\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b%\u0010<\u001a\u0004\b?\u0010>R\u0017\u0010\u0017\u001a\u00020A8\u0006¢\u0006\f\n\u0004\b)\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\f\u001a\u00020:8\u0006¢\u0006\f\n\u0004\bE\u0010<\u001a\u0004\bF\u0010>R\u0017\u0010I\u001a\u00020:8\u0006¢\u0006\f\n\u0004\bG\u0010<\u001a\u0004\bH\u0010>R\u0017\u0010\u0018\u001a\u00020A8\u0006¢\u0006\f\n\u0004\bF\u0010B\u001a\u0004\bG\u0010DR\u0017\u0010N\u001a\u00020J8\u0006¢\u0006\f\n\u0004\b.\u0010K\u001a\u0004\bL\u0010MR*\u0010V\u001a\u00020O2\u0006\u0010P\u001a\u00020O8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR*\u0010Y\u001a\u00020O2\u0006\u0010P\u001a\u00020O8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010Q\u001a\u0004\bW\u0010S\"\u0004\bX\u0010UR*\u0010`\u001a\u00020Z2\u0006\u0010P\u001a\u00020Z8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R*\u0010f\u001a\u00020\u00122\u0006\u0010P\u001a\u00020\u00128\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR*\u0010i\u001a\u00020\u00122\u0006\u0010P\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010a\u001a\u0004\bg\u0010c\"\u0004\bh\u0010eR*\u0010m\u001a\u00020\u00122\u0006\u0010P\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010a\u001a\u0004\bk\u0010c\"\u0004\bl\u0010eR3\u0010q\u001a\u00020\r2\u0006\u0010P\u001a\u00020\r8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bn\u0010a\u001a\u0004\bo\u0010c\"\u0004\bp\u0010eR3\u0010t\u001a\u00020\r2\u0006\u0010P\u001a\u00020\r8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b!\u0010a\u001a\u0004\br\u0010c\"\u0004\bs\u0010eR3\u0010x\u001a\u00020\r2\u0006\u0010P\u001a\u00020\r8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bu\u0010a\u001a\u0004\bv\u0010c\"\u0004\bw\u0010eR*\u0010{\u001a\u00020\u00122\u0006\u0010P\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010a\u001a\u0004\by\u0010c\"\u0004\bz\u0010eR*\u0010\u007f\u001a\u00020\u00122\u0006\u0010P\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b|\u0010a\u001a\u0004\b}\u0010c\"\u0004\b~\u0010eR.\u0010\u0083\u0001\u001a\u00020\u00122\u0006\u0010P\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010a\u001a\u0005\b\u0081\u0001\u0010c\"\u0005\b\u0082\u0001\u0010eR.\u0010\u0087\u0001\u001a\u00020\u00122\u0006\u0010P\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010a\u001a\u0005\b\u0085\u0001\u0010c\"\u0005\b\u0086\u0001\u0010e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0088\u0001"}, d2 = {"Landroidx/constraintlayout/compose/ConstrainScope;", "", "id", "<init>", "(Ljava/lang/Object;)V", "Lcom/google/android/n6c;", "state", "", "a", "(Lcom/google/android/n6c;)V", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$c;", "start", "end", "Lcom/google/android/ff3;", "startMargin", "endMargin", "startGoneMargin", "endGoneMargin", "", "bias", "o", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$c;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$c;FFFFF)V", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$b;", "top", "bottom", "topMargin", "bottomMargin", "topGoneMargin", "bottomGoneMargin", "n", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$b;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$b;FFFFF)V", "horizontalBias", "verticalBias", "r", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$c;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$b;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$c;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$b;FFFFFFFFFF)V", "Lcom/google/android/ww1;", "other", "e", "(Lcom/google/android/ww1;)V", "c", "(Lcom/google/android/ww1;F)V", "f", "anchor", "b", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$c;)V", "Ljava/lang/Object;", "j", "()Ljava/lang/Object;", "", "Lkotlin/Function1;", "Ljava/util/List;", "getTasks$compose_release", "()Ljava/util/List;", "tasks", "Lcom/google/android/ww1;", "k", "()Lcom/google/android/ww1;", "parent", "Lcom/google/android/r4e;", "d", "Lcom/google/android/r4e;", "l", "()Lcom/google/android/r4e;", "getAbsoluteLeft", "absoluteLeft", "Lcom/google/android/nf5;", "Lcom/google/android/nf5;", "m", "()Lcom/google/android/nf5;", "g", "i", "h", "getAbsoluteRight", "absoluteRight", "Lcom/google/android/ug0;", "Lcom/google/android/ug0;", "getBaseline", "()Lcom/google/android/ug0;", "baseline", "Landroidx/constraintlayout/compose/Dimension;", "value", "Landroidx/constraintlayout/compose/Dimension;", "getWidth", "()Landroidx/constraintlayout/compose/Dimension;", "t", "(Landroidx/constraintlayout/compose/Dimension;)V", "width", "getHeight", "setHeight", "height", "Lcom/google/android/ece;", "Lcom/google/android/ece;", "getVisibility", "()Lcom/google/android/ece;", "setVisibility", "(Lcom/google/android/ece;)V", "visibility", "F", "getAlpha", "()F", "setAlpha", "(F)V", "alpha", "getScaleX", "setScaleX", "scaleX", "p", "getScaleY", "setScaleY", "scaleY", "q", "getTranslationX-D9Ej5fM", "setTranslationX-0680j_4", "translationX", "getTranslationY-D9Ej5fM", "setTranslationY-0680j_4", "translationY", "s", "getTranslationZ-D9Ej5fM", "setTranslationZ-0680j_4", "translationZ", "getPivotX", "setPivotX", "pivotX", "u", "getPivotY", "setPivotY", "pivotY", "v", "getHorizontalChainWeight", "setHorizontalChainWeight", "horizontalChainWeight", "w", "getVerticalChainWeight", "setVerticalChainWeight", "verticalChainWeight", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ConstrainScope {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<Function1<n6c, Unit>> tasks;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ww1 parent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final r4e start;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final r4e absoluteLeft;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final nf5 top;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final r4e end;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final r4e absoluteRight;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final nf5 bottom;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final ug0 baseline;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private Dimension width;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private Dimension height;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private ece visibility;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private float scaleX;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private float scaleY;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private float translationX;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private float translationY;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private float translationZ;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private float pivotX;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private float pivotY;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private float horizontalChainWeight;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private float verticalChainWeight;

    public ConstrainScope(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "id");
        this.id = obj;
        ArrayList arrayList = new ArrayList();
        this.tasks = arrayList;
        Integer num = State.j;
        Intrinsics.checkNotNullExpressionValue(num, "PARENT");
        this.parent = new ww1(num);
        this.start = new e(obj, -2, arrayList);
        this.absoluteLeft = new e(obj, 0, arrayList);
        this.top = new b(obj, 0, arrayList);
        this.end = new e(obj, -1, arrayList);
        this.absoluteRight = new e(obj, 1, arrayList);
        this.bottom = new b(obj, 1, arrayList);
        this.baseline = new a(obj, arrayList);
        Dimension.Companion companion = Dimension.INSTANCE;
        this.width = companion.b();
        this.height = companion.b();
        this.visibility = ece.INSTANCE.a();
        this.alpha = 1.0f;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        float f = 0;
        this.translationX = ff3.i(f);
        this.translationY = ff3.i(f);
        this.translationZ = ff3.i(f);
        this.pivotX = 0.5f;
        this.pivotY = 0.5f;
        this.horizontalChainWeight = Float.NaN;
        this.verticalChainWeight = Float.NaN;
    }

    public static /* synthetic */ void d(ConstrainScope constrainScope, ww1 ww1Var, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.5f;
        }
        constrainScope.c(ww1Var, f);
    }

    public static /* synthetic */ void g(ConstrainScope constrainScope, ww1 ww1Var, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.5f;
        }
        constrainScope.f(ww1Var, f);
    }

    public static /* synthetic */ void p(ConstrainScope constrainScope, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor2, float f, float f2, float f3, float f4, float f5, int i, Object obj) {
        if ((i & 4) != 0) {
            f = ff3.i(0);
        }
        float f6 = f;
        if ((i & 8) != 0) {
            f2 = ff3.i(0);
        }
        float f7 = f2;
        if ((i & 16) != 0) {
            f3 = ff3.i(0);
        }
        constrainScope.n(horizontalAnchor, horizontalAnchor2, f6, f7, f3, (i & 32) != 0 ? ff3.i(0) : f4, (i & 64) != 0 ? 0.5f : f5);
    }

    public static /* synthetic */ void q(ConstrainScope constrainScope, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, float f, float f2, float f3, float f4, float f5, int i, Object obj) {
        if ((i & 4) != 0) {
            f = ff3.i(0);
        }
        float f6 = f;
        if ((i & 8) != 0) {
            f2 = ff3.i(0);
        }
        float f7 = f2;
        if ((i & 16) != 0) {
            f3 = ff3.i(0);
        }
        constrainScope.o(verticalAnchor, verticalAnchor2, f6, f7, f3, (i & 32) != 0 ? ff3.i(0) : f4, (i & 64) != 0 ? 0.5f : f5);
    }

    public static /* synthetic */ void s(ConstrainScope constrainScope, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, int i, Object obj) {
        constrainScope.r(verticalAnchor, horizontalAnchor, verticalAnchor2, horizontalAnchor2, (i & 16) != 0 ? ff3.i(0) : f, (i & 32) != 0 ? ff3.i(0) : f2, (i & 64) != 0 ? ff3.i(0) : f3, (i & 128) != 0 ? ff3.i(0) : f4, (i & 256) != 0 ? ff3.i(0) : f5, (i & 512) != 0 ? ff3.i(0) : f6, (i & 1024) != 0 ? ff3.i(0) : f7, (i & 2048) != 0 ? ff3.i(0) : f8, (i & 4096) != 0 ? 0.5f : f9, (i & 8192) != 0 ? 0.5f : f10);
    }

    public final void a(n6c state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Iterator<T> it = this.tasks.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(state);
        }
    }

    public final void b(ConstraintLayoutBaseScope.VerticalAnchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        q(this, anchor, anchor, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, null);
    }

    public final void c(ww1 other, float bias) {
        Intrinsics.checkNotNullParameter(other, "other");
        q(this, other.getStart(), other.getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, bias, 60, null);
    }

    public final void e(ww1 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        s(this, other.getStart(), other.getTop(), other.getEnd(), other.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 16368, null);
    }

    public final void f(ww1 other, float bias) {
        Intrinsics.checkNotNullParameter(other, "other");
        p(this, other.getTop(), other.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, bias, 60, null);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final nf5 getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final r4e getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Object getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final ww1 getParent() {
        return this.parent;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final r4e getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final nf5 getTop() {
        return this.top;
    }

    public final void n(ConstraintLayoutBaseScope.HorizontalAnchor top, ConstraintLayoutBaseScope.HorizontalAnchor bottom, float topMargin, float bottomMargin, float topGoneMargin, float bottomGoneMargin, final float bias) {
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        this.top.a(top, topMargin, topGoneMargin);
        this.bottom.a(bottom, bottomMargin, bottomGoneMargin);
        this.tasks.add(new Function1<n6c, Unit>() { // from class: androidx.constraintlayout.compose.ConstrainScope$linkTo$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(n6c n6cVar) {
                Intrinsics.checkNotNullParameter(n6cVar, "state");
                n6cVar.c(this.this$0.getId()).Y(bias);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((n6c) obj);
                return Unit.a;
            }
        });
    }

    public final void o(ConstraintLayoutBaseScope.VerticalAnchor start, ConstraintLayoutBaseScope.VerticalAnchor end, float startMargin, float endMargin, float startGoneMargin, float endGoneMargin, final float bias) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        this.start.a(start, startMargin, startGoneMargin);
        this.end.a(end, endMargin, endGoneMargin);
        this.tasks.add(new Function1<n6c, Unit>() { // from class: androidx.constraintlayout.compose.ConstrainScope$linkTo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(n6c n6cVar) {
                Intrinsics.checkNotNullParameter(n6cVar, "state");
                n6cVar.c(this.getId()).y(n6cVar.r() == LayoutDirection.Rtl ? 1 - bias : bias);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((n6c) obj);
                return Unit.a;
            }
        });
    }

    public final void r(ConstraintLayoutBaseScope.VerticalAnchor start, ConstraintLayoutBaseScope.HorizontalAnchor top, ConstraintLayoutBaseScope.VerticalAnchor end, ConstraintLayoutBaseScope.HorizontalAnchor bottom, float startMargin, float topMargin, float endMargin, float bottomMargin, float startGoneMargin, float topGoneMargin, float endGoneMargin, float bottomGoneMargin, float horizontalBias, float verticalBias) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        o(start, end, startMargin, endMargin, startGoneMargin, endGoneMargin, horizontalBias);
        n(top, bottom, topMargin, bottomMargin, topGoneMargin, bottomGoneMargin, verticalBias);
    }

    public final void t(final Dimension dimension) {
        Intrinsics.checkNotNullParameter(dimension, "value");
        this.width = dimension;
        this.tasks.add(new Function1<n6c, Unit>() { // from class: androidx.constraintlayout.compose.ConstrainScope$width$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(n6c n6cVar) {
                Intrinsics.checkNotNullParameter(n6cVar, "state");
                n6cVar.c(this.this$0.getId()).Z(((ma3) dimension).e(n6cVar));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((n6c) obj);
                return Unit.a;
            }
        });
    }
}
