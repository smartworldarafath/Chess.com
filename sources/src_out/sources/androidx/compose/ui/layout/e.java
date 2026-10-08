package androidx.compose.ui.layout;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.p004runtime.p0;
import androidx.compose.p004runtime.s0;
import androidx.compose.p004runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.inputmethod.d1e;
import com.google.inputmethod.e16;
import com.google.inputmethod.e58;
import com.google.inputmethod.f1e;
import com.google.inputmethod.k58;
import com.google.inputmethod.k7e;
import com.google.inputmethod.kie;
import com.google.inputmethod.mwb;
import com.google.inputmethod.o58;
import com.google.inputmethod.q48;
import com.google.inputmethod.uy5;
import com.google.inputmethod.vp8;
import com.google.inputmethod.whe;
import com.google.inputmethod.yc3;
import com.google.inputmethod.zke;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010\u0017J\u001f\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b)\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010*\u001a\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010.R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00101R\u0018\u00104\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00103R#\u0010;\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\t058\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010A\u001a\u00020<8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R#\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0C0B8\u0006¢\u0006\f\n\u0004\b?\u0010E\u001a\u0004\b=\u0010FR\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020I0H8\u0006¢\u0006\f\n\u0004\b9\u0010J\u001a\u0004\b7\u0010K¨\u0006M"}, d2 = {"Landroidx/compose/ui/layout/e;", "Lcom/google/android/whe$b;", "Ljava/lang/Runnable;", "Lcom/google/android/vp8;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/compose/ui/platform/AndroidComposeView;", "composeView", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "Lcom/google/android/zke;", "insetsValue", "Lcom/google/android/whe;", "animation", "", "l", "(Lcom/google/android/zke;Lcom/google/android/whe;)V", "k", "(Lcom/google/android/zke;)V", "Lcom/google/android/kie;", "insets", "m", "(Lcom/google/android/kie;)V", "d", "(Lcom/google/android/whe;)V", "Lcom/google/android/whe$a;", "bounds", "f", "(Lcom/google/android/whe;Lcom/google/android/whe$a;)Lcom/google/android/whe$a;", "", "runningAnimations", "e", "(Lcom/google/android/kie;Ljava/util/List;)Lcom/google/android/kie;", "c", "Landroid/view/View;", "view", "a", "(Landroid/view/View;Lcom/google/android/kie;)Lcom/google/android/kie;", "run", "()V", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Landroidx/compose/ui/platform/AndroidComposeView;", "getComposeView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "", "Z", "prepared", "", "I", "runningAnimationMask", "Lcom/google/android/kie;", "savedInsets", "Landroidx/collection/e;", "", "g", "Landroidx/collection/e;", "j", "()Landroidx/collection/e;", "insetsValues", "Lcom/google/android/q48;", "h", "Lcom/google/android/q48;", "i", "()Lcom/google/android/q48;", "generation", "Lcom/google/android/e58;", "Lcom/google/android/o58;", "Landroid/graphics/Rect;", "Lcom/google/android/e58;", "()Lcom/google/android/e58;", "displayCutouts", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Landroidx/compose/ui/layout/p;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "displayCutoutRulers", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends whe.b implements Runnable, vp8, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AndroidComposeView composeView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean prepared;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int runningAnimationMask;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private kie savedInsets;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final androidx.collection.e<Object, zke> insetsValues;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final q48 generation;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final e58<o58<Rect>> displayCutouts;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final SnapshotStateList<p> displayCutoutRulers;

    public e(AndroidComposeView androidComposeView) {
        super(1);
        this.composeView = androidComposeView;
        k58 k58Var = new k58(9);
        x.Companion companion = x.INSTANCE;
        k58Var.x(companion.a(), new zke("caption bar"));
        k58Var.x(companion.b(), new zke("display cutout"));
        k58Var.x(companion.c(), new zke("ime"));
        k58Var.x(companion.d(), new zke("mandatory system gestures"));
        k58Var.x(companion.e(), new zke("navigation bars"));
        k58Var.x(companion.f(), new zke("status bars"));
        k58Var.x(companion.g(), new zke("system gestures"));
        k58Var.x(companion.h(), new zke("tappable element"));
        k58Var.x(companion.i(), new zke("waterfall"));
        this.insetsValues = k58Var;
        this.generation = mwb.a(0);
        this.displayCutouts = new e58<>(4);
        this.displayCutoutRulers = p0.f();
    }

    private final void k(zke insetsValue) {
        insetsValue.i(false);
        insetsValue.n(f1e.a());
        insetsValue.o(f1e.a());
    }

    private final void l(zke insetsValue, whe animation) {
        insetsValue.l(animation.c());
        insetsValue.h(animation.a());
        insetsValue.k(animation.b());
    }

    private final void m(kie insets) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long jA;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        char c4;
        Object[] objArr2;
        e16 e16Var = z.a;
        int[] iArr2 = e16Var.keys;
        Object[] objArr3 = e16Var.values;
        long[] jArr2 = e16Var.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            z2 = false;
            z3 = false;
            char c5 = 16;
            c = ' ';
            while (true) {
                long j = jArr2[i];
                c2 = '0';
                z = true;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8;
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j & 255) < 128) {
                            int i5 = (i << 3) + i4;
                            c4 = c5;
                            int i6 = iArr2[i5];
                            x xVar = (x) objArr3[i5];
                            uy5 uy5VarG = insets.g(i6);
                            long jA2 = d1e.a((((long) uy5VarG.a) << 48) | (((long) uy5VarG.b) << 32) | (((long) uy5VarG.c) << c4) | ((long) uy5VarG.d));
                            zke zkeVarE = this.insetsValues.e(xVar);
                            Intrinsics.g(zkeVarE);
                            zke zkeVar = zkeVarE;
                            if (!d1e.b(jA2, zkeVar.getCurrent())) {
                                zkeVar.j(jA2);
                                z2 = true;
                                if (!d1e.b(jA2, f1e.b())) {
                                    z3 = true;
                                }
                            }
                            if (i6 != kie.s.d()) {
                                uy5 uy5VarH = insets.h(i6);
                                objArr2 = objArr3;
                                long jA3 = d1e.a((((long) uy5VarH.b) << 32) | (((long) uy5VarH.a) << 48) | (((long) uy5VarH.c) << c4) | ((long) uy5VarH.d));
                                if (!d1e.b(zkeVar.getMaximum(), jA3)) {
                                    zkeVar.m(jA3);
                                    z2 = true;
                                    if (!d1e.b(jA3, f1e.b())) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            zkeVar.p(insets.u(i6));
                        } else {
                            c4 = c5;
                            objArr2 = objArr3;
                        }
                        j >>= i2;
                        i4++;
                        objArr3 = objArr2;
                        i2 = i2;
                        c5 = c4;
                        jArr2 = jArr2;
                        iArr2 = iArr2;
                    }
                    jArr = jArr2;
                    iArr = iArr2;
                    int i7 = i2;
                    c3 = c5;
                    objArr = objArr3;
                    if (i3 != i7) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    c3 = c5;
                }
                if (i == length) {
                    break;
                }
                i++;
                objArr3 = objArr;
                c5 = c3;
                jArr2 = jArr;
                iArr2 = iArr;
            }
        } else {
            c = ' ';
            c2 = '0';
            z = true;
            c3 = 16;
            z2 = false;
            z3 = false;
        }
        yc3 yc3VarF = insets.f();
        if (yc3VarF == null) {
            jA = f1e.b();
        } else {
            uy5 uy5VarG2 = yc3VarF.g();
            jA = d1e.a((((long) uy5VarG2.a) << c2) | (((long) uy5VarG2.b) << c) | (((long) uy5VarG2.c) << c3) | ((long) uy5VarG2.d));
        }
        zke zkeVarE2 = this.insetsValues.e(x.INSTANCE.i());
        Intrinsics.g(zkeVarE2);
        zke zkeVar2 = zkeVarE2;
        zkeVar2.p(!d1e.b(jA, f1e.b()));
        if (!d1e.b(zkeVar2.getCurrent(), jA)) {
            zkeVar2.j(jA);
            zkeVar2.m(jA);
            z2 = z;
            if (!d1e.b(jA, f1e.b())) {
                z3 = z2;
            }
        }
        if (yc3VarF != null) {
            List<Rect> listA = yc3VarF.a();
            if (listA.size() < this.displayCutouts.get_size()) {
                this.displayCutouts.C(listA.size(), this.displayCutouts.get_size());
                this.displayCutoutRulers.j(listA.size(), this.displayCutoutRulers.size());
                z2 = z;
            } else {
                int size = listA.size() - this.displayCutouts.get_size();
                int i8 = 0;
                while (i8 < size) {
                    e58<o58<Rect>> e58Var = this.displayCutouts;
                    e58Var.n(s0.e(listA.get(e58Var.get_size()), null, 2, null));
                    this.displayCutoutRulers.add(r.a("display cutout rect " + this.displayCutouts.get_size()));
                    i8++;
                    z2 = z;
                }
            }
            int size2 = listA.size();
            for (int i9 = 0; i9 < size2; i9++) {
                Rect rect = listA.get(i9);
                o58<Rect> o58VarD = this.displayCutouts.d(i9);
                if (!Intrinsics.e(o58VarD.getValue(), rect)) {
                    o58VarD.setValue(rect);
                    z2 = z;
                }
            }
            if (!listA.isEmpty()) {
                z3 = z;
            }
        } else if (this.displayCutouts.get_size() > 0) {
            this.displayCutouts.u();
            this.displayCutoutRulers.clear();
            z2 = z;
        }
        if ((z3 || this.generation.getIntValue() != 0) && z2) {
            q48 q48Var = this.generation;
            q48Var.f(q48Var.getIntValue() + 1);
            androidx.compose.p004runtime.snapshots.g.INSTANCE.m();
        }
    }

    @Override // com.google.inputmethod.vp8
    public kie a(View view, kie insets) {
        if (this.prepared) {
            this.savedInsets = insets;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return insets;
            }
        } else if (this.runningAnimationMask == 0) {
            m(insets);
        }
        return insets;
    }

    @Override // com.google.android.whe.b
    public void c(whe animation) {
        this.prepared = false;
        int iD = animation.d();
        this.runningAnimationMask &= ~iD;
        this.savedInsets = null;
        x xVar = (x) z.a.b(iD);
        if (xVar != null) {
            zke zkeVarE = this.insetsValues.e(xVar);
            Intrinsics.g(zkeVarE);
            zke zkeVar = zkeVarE;
            zkeVar.l(0.0f);
            zkeVar.h(1.0f);
            zkeVar.k(0L);
            zkeVar.l(0.0f);
            k(zkeVar);
            q48 q48Var = this.generation;
            q48Var.f(q48Var.getIntValue() + 1);
            androidx.compose.p004runtime.snapshots.g.INSTANCE.m();
        }
        super.c(animation);
    }

    @Override // com.google.android.whe.b
    public void d(whe animation) {
        this.prepared = true;
        super.d(animation);
    }

    @Override // com.google.android.whe.b
    public kie e(kie insets, List<whe> runningAnimations) {
        int size = runningAnimations.size();
        for (int i = 0; i < size; i++) {
            whe wheVar = runningAnimations.get(i);
            x xVar = (x) z.a.b(wheVar.d());
            if (xVar != null) {
                zke zkeVarE = this.insetsValues.e(xVar);
                Intrinsics.g(zkeVarE);
                zke zkeVar = zkeVarE;
                if (zkeVar.g()) {
                    l(zkeVar, wheVar);
                }
            }
        }
        m(insets);
        return insets;
    }

    @Override // com.google.android.whe.b
    public whe.a f(whe animation, whe.a bounds) {
        kie kieVar = this.savedInsets;
        this.prepared = false;
        this.savedInsets = null;
        if (animation.b() > 0 && kieVar != null) {
            int iD = animation.d();
            this.runningAnimationMask |= iD;
            x xVar = (x) z.a.b(iD);
            if (xVar != null) {
                zke zkeVarE = this.insetsValues.e(xVar);
                Intrinsics.g(zkeVarE);
                zke zkeVar = zkeVarE;
                uy5 uy5VarG = kieVar.g(iD);
                long jA = d1e.a(((long) uy5VarG.d) | (((long) uy5VarG.a) << 48) | (((long) uy5VarG.b) << 32) | (((long) uy5VarG.c) << 16));
                long current = zkeVar.getCurrent();
                if (!d1e.b(jA, current)) {
                    zkeVar.n(current);
                    zkeVar.o(jA);
                    zkeVar.i(true);
                    l(zkeVar, animation);
                    q48 q48Var = this.generation;
                    q48Var.f(q48Var.getIntValue() + 1);
                    androidx.compose.p004runtime.snapshots.g.INSTANCE.m();
                }
            }
        }
        return super.f(animation, bounds);
    }

    public final SnapshotStateList<p> g() {
        return this.displayCutoutRulers;
    }

    public final e58<o58<Rect>> h() {
        return this.displayCutouts;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final q48 getGeneration() {
        return this.generation;
    }

    public final androidx.collection.e<Object, zke> j() {
        return this.insetsValues;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        k7e.z0(view, this);
        k7e.G0(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        k7e.z0(view, null);
        k7e.G0(view, null);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prepared) {
            this.runningAnimationMask = 0;
            this.prepared = false;
            kie kieVar = this.savedInsets;
            if (kieVar != null) {
                m(kieVar);
                this.savedInsets = null;
            }
        }
    }
}
