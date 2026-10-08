package androidx.compose.p002material3;

import androidx.compose.p000animation.ColorVectorConverterKt;
import androidx.compose.p000animation.core.Animatable;
import androidx.compose.p002material3.IndicatorLineNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.c;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.d;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.o;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ui4;
import com.google.inputmethod.ColorScheme;
import com.google.inputmethod.SelectionColors;
import com.google.inputmethod.Shapes;
import com.google.inputmethod.SolidColor;
import com.google.inputmethod.ah3;
import com.google.inputmethod.bj1;
import com.google.inputmethod.bs1;
import com.google.inputmethod.cs1;
import com.google.inputmethod.ei1;
import com.google.inputmethod.ff3;
import com.google.inputmethod.fz1;
import com.google.inputmethod.gba;
import com.google.inputmethod.i26;
import com.google.inputmethod.j26;
import com.google.inputmethod.jzc;
import com.google.inputmethod.k33;
import com.google.inputmethod.lk4;
import com.google.inputmethod.mk4;
import com.google.inputmethod.o01;
import com.google.inputmethod.psc;
import com.google.inputmethod.qr;
import com.google.inputmethod.tjd;
import com.google.inputmethod.tr;
import com.google.inputmethod.ulb;
import com.google.inputmethod.w2e;
import com.google.inputmethod.xkb;
import com.google.inputmethod.y94;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JI\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0016\u0010\"\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R$\u0010/\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R(\u00105\u001a\u0004\u0018\u00010\n2\b\u00100\u001a\u0004\u0018\u00010\n8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b1\u00102\"\u0004\b3\u00104R \u00108\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002060*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010.R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\t\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006E"}, d2 = {"Landroidx/compose/material3/IndicatorLineNode;", "Lcom/google/android/k33;", "Lcom/google/android/bs1;", "", "enabled", "isError", "Lcom/google/android/j26;", "interactionSource", "Lcom/google/android/psc;", "colors", "Lcom/google/android/xkb;", "textFieldShape", "Lcom/google/android/ff3;", "focusedIndicatorWidth", "unfocusedIndicatorWidth", "<init>", "(ZZLcom/google/android/j26;Lcom/google/android/psc;Lcom/google/android/xkb;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "L3", "(Lcom/google/android/q22;)Ljava/lang/Object;", "J3", "()V", "M3", "(ZZLcom/google/android/j26;Lcom/google/android/psc;Lcom/google/android/xkb;FF)V", "V2", "r", "Z", "s", "t", "Lcom/google/android/j26;", "u", "F", "v", "w", "focused", "Lkotlinx/coroutines/s;", "x", "Lkotlinx/coroutines/s;", "trackFocusStateJob", "y", "Lcom/google/android/psc;", "_colors", "Landroidx/compose/animation/core/Animatable;", "Lcom/google/android/ei1;", "Lcom/google/android/tr;", "z", "Landroidx/compose/animation/core/Animatable;", "colorAnimatable", "value", "A", "Lcom/google/android/xkb;", "K3", "(Lcom/google/android/xkb;)V", "_shape", "Lcom/google/android/qr;", "B", "widthAnimatable", "Lcom/google/android/o01;", "C", "Lcom/google/android/o01;", "drawWithCacheModifierNode", "H3", "()Lcom/google/android/psc;", "I3", "()Lcom/google/android/xkb;", "shape", "Q2", "()Z", "shouldAutoInvalidate", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IndicatorLineNode extends k33 implements bs1 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private xkb _shape;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final Animatable<ff3, qr> widthAnimatable;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final o01 drawWithCacheModifierNode;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private boolean enabled;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean isError;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private j26 interactionSource;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private float focusedIndicatorWidth;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private float unfocusedIndicatorWidth;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private boolean focused;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private s trackFocusStateJob;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private psc _colors;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private Animatable<ei1, tr> colorAnimatable;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a<T> implements ui4 {
        final /* synthetic */ List<lk4> a;
        final /* synthetic */ IndicatorLineNode b;

        a(List<lk4> list, IndicatorLineNode indicatorLineNode) {
            this.a = list;
            this.b = indicatorLineNode;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(i26 i26Var, q22<? super Unit> q22Var) {
            if (i26Var instanceof lk4) {
                this.a.add(i26Var);
            } else if (i26Var instanceof mk4) {
                this.a.remove(((mk4) i26Var).getFocus());
            }
            boolean z = !this.a.isEmpty();
            if (z != this.b.focused) {
                this.b.focused = z;
                this.b.J3();
            }
            return Unit.a;
        }
    }

    public /* synthetic */ IndicatorLineNode(boolean z, boolean z2, j26 j26Var, psc pscVar, xkb xkbVar, float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, j26Var, pscVar, xkbVar, f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final ah3 F3(final IndicatorLineNode indicatorLineNode, CacheDrawScope cacheDrawScope) throws NoWhenBranchMatchedException {
        float fX2 = cacheDrawScope.x2(indicatorLineNode.widthAnimatable.m().getValue());
        Path pathA = d.a();
        o.a(pathA, indicatorLineNode.I3().mo5createOutlinePq9zytI(cacheDrawScope.d(), cacheDrawScope.getLayoutDirection(), cacheDrawScope));
        Path pathA2 = d.a();
        Path.x(pathA2, new gba(0.0f, Float.intBitsToFloat((int) (cacheDrawScope.d() & 4294967295L)) - fX2, Float.intBitsToFloat((int) (cacheDrawScope.d() >> 32)), Float.intBitsToFloat((int) (cacheDrawScope.d() & 4294967295L))), null, 2, null);
        final Path pathK = pathA2.k(pathA);
        return cacheDrawScope.j(new Function1() { // from class: com.google.android.dv5
            public final Object invoke(Object obj) {
                return IndicatorLineNode.G3(pathK, indicatorLineNode, (fz1) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G3(Path path, IndicatorLineNode indicatorLineNode, fz1 fz1Var) {
        fz1Var.j1();
        Animatable<ei1, tr> animatable = indicatorLineNode.colorAnimatable;
        Intrinsics.g(animatable);
        DrawScope.E0(fz1Var, path, new SolidColor(animatable.m().getValue(), null), 0.0f, null, null, 0, 60, null);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final psc H3() {
        psc pscVar = this._colors;
        return pscVar == null ? TextFieldDefaults.a.m((ColorScheme) cs1.a(this, bj1.k()), (SelectionColors) cs1.a(this, jzc.c())) : pscVar;
    }

    private final xkb I3() {
        xkb xkbVar = this._shape;
        return xkbVar == null ? ulb.g((Shapes) cs1.a(this, ulb.h()), y94.a.d()) : xkbVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J3() {
        rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0182IndicatorLineNode$invalidateIndicator$1(this, null), 3, (Object) null);
        rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0183IndicatorLineNode$invalidateIndicator$2(this, null), 3, (Object) null);
    }

    private final void K3(xkb xkbVar) {
        if (Intrinsics.e(this._shape, xkbVar)) {
            return;
        }
        this._shape = xkbVar;
        this.drawWithCacheModifierNode.b2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object L3(q22<? super Unit> q22Var) {
        this.focused = false;
        Object objCollect = this.interactionSource.c().collect(new a(new ArrayList(), this), q22Var);
        return objCollect == kotlin.coroutines.intrinsics.a.g() ? objCollect : Unit.a;
    }

    public final void M3(boolean enabled, boolean isError, j26 interactionSource, psc colors, xkb textFieldShape, float focusedIndicatorWidth, float unfocusedIndicatorWidth) {
        boolean z;
        boolean z2 = true;
        if (this.enabled != enabled) {
            this.enabled = enabled;
            z = true;
        } else {
            z = false;
        }
        if (this.isError != isError) {
            this.isError = isError;
            z = true;
        }
        if (this.interactionSource != interactionSource) {
            this.interactionSource = interactionSource;
            s sVar = this.trackFocusStateJob;
            if (sVar != null) {
                s.a.a(sVar, (CancellationException) null, 1, (Object) null);
            }
            this.trackFocusStateJob = rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0185IndicatorLineNode$update$1(this, null), 3, (Object) null);
        }
        if (!Intrinsics.e(this._colors, colors)) {
            this._colors = colors;
            z = true;
        }
        if (!Intrinsics.e(this._shape, textFieldShape)) {
            K3(textFieldShape);
            z = true;
        }
        if (!ff3.k(this.focusedIndicatorWidth, focusedIndicatorWidth)) {
            this.focusedIndicatorWidth = focusedIndicatorWidth;
            z = true;
        }
        if (ff3.k(this.unfocusedIndicatorWidth, unfocusedIndicatorWidth)) {
            z2 = z;
        } else {
            this.unfocusedIndicatorWidth = unfocusedIndicatorWidth;
        }
        if (z2) {
            J3();
        }
    }

    @Override // androidx.compose.ui.b.c
    /* JADX INFO: renamed from: Q2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.b.c
    public void V2() {
        this.trackFocusStateJob = rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0184IndicatorLineNode$onAttach$1(this, null), 3, (Object) null);
        if (this.colorAnimatable == null) {
            long jN = H3().n(this.enabled, this.isError, this.focused);
            this.colorAnimatable = new Animatable<>(ei1.l(jN), (tjd) ColorVectorConverterKt.a(ei1.INSTANCE).invoke(ei1.u(jN)), null, null, 12, null);
        }
    }

    private IndicatorLineNode(boolean z, boolean z2, j26 j26Var, psc pscVar, xkb xkbVar, float f, float f2) {
        this.enabled = z;
        this.isError = z2;
        this.interactionSource = j26Var;
        this.focusedIndicatorWidth = f;
        this.unfocusedIndicatorWidth = f2;
        this._colors = pscVar;
        this._shape = xkbVar;
        this.widthAnimatable = new Animatable<>(ff3.e((this.focused && this.enabled) ? this.focusedIndicatorWidth : this.unfocusedIndicatorWidth), w2e.L(ff3.INSTANCE), null, null, 12, null);
        this.drawWithCacheModifierNode = (o01) m3(c.a(new Function1() { // from class: com.google.android.cv5
            public final Object invoke(Object obj) {
                return IndicatorLineNode.F3(this.a, (CacheDrawScope) obj);
            }
        }));
    }
}
