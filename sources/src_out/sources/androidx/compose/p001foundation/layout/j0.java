package androidx.compose.p001foundation.layout;

import android.os.Build;
import android.view.View;
import com.google.inputmethod.kie;
import com.google.inputmethod.vp8;
import com.google.inputmethod.whe;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\rJ\u001f\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010#\u001a\u0004\b$\u0010%R\"\u0010,\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010/\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R$\u00105\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00066"}, d2 = {"Landroidx/compose/foundation/layout/j0;", "Lcom/google/android/whe$b;", "Ljava/lang/Runnable;", "Lcom/google/android/vp8;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/compose/foundation/layout/h1;", "composeInsets", "<init>", "(Landroidx/compose/foundation/layout/h1;)V", "Lcom/google/android/whe;", "animation", "", "d", "(Lcom/google/android/whe;)V", "Lcom/google/android/whe$a;", "bounds", "f", "(Lcom/google/android/whe;Lcom/google/android/whe$a;)Lcom/google/android/whe$a;", "Lcom/google/android/kie;", "insets", "", "runningAnimations", "e", "(Lcom/google/android/kie;Ljava/util/List;)Lcom/google/android/kie;", "c", "Landroid/view/View;", "view", "a", "(Landroid/view/View;Lcom/google/android/kie;)Lcom/google/android/kie;", "run", "()V", "onViewAttachedToWindow", "(Landroid/view/View;)V", "v", "onViewDetachedFromWindow", "Landroidx/compose/foundation/layout/h1;", "getComposeInsets", "()Landroidx/compose/foundation/layout/h1;", "", "Z", "getPrepared", "()Z", "setPrepared", "(Z)V", "prepared", "getRunningAnimation", "setRunningAnimation", "runningAnimation", "Lcom/google/android/kie;", "getSavedInsets", "()Lcom/google/android/kie;", "setSavedInsets", "(Lcom/google/android/kie;)V", "savedInsets", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class j0 extends whe.b implements Runnable, vp8, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final h1 composeInsets;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean prepared;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean runningAnimation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private kie savedInsets;

    public j0(h1 h1Var) {
        super(!h1Var.getConsumes() ? 1 : 0);
        this.composeInsets = h1Var;
    }

    @Override // com.google.inputmethod.vp8
    public kie a(View view, kie insets) {
        this.savedInsets = insets;
        this.composeInsets.y(insets);
        if (this.prepared) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.runningAnimation) {
            this.composeInsets.x(insets);
            h1.w(this.composeInsets, insets, 0, 2, null);
        }
        return this.composeInsets.getConsumes() ? kie.b : insets;
    }

    @Override // com.google.android.whe.b
    public void c(whe animation) {
        this.prepared = false;
        this.runningAnimation = false;
        kie kieVar = this.savedInsets;
        if (animation.b() > 0 && kieVar != null) {
            this.composeInsets.x(kieVar);
            this.composeInsets.y(kieVar);
            h1.w(this.composeInsets, kieVar, 0, 2, null);
        }
        this.savedInsets = null;
        super.c(animation);
    }

    @Override // com.google.android.whe.b
    public void d(whe animation) {
        this.prepared = true;
        this.runningAnimation = true;
        super.d(animation);
    }

    @Override // com.google.android.whe.b
    public kie e(kie insets, List<whe> runningAnimations) {
        h1.w(this.composeInsets, insets, 0, 2, null);
        return this.composeInsets.getConsumes() ? kie.b : insets;
    }

    @Override // com.google.android.whe.b
    public whe.a f(whe animation, whe.a bounds) {
        this.prepared = false;
        return super.f(animation, bounds);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prepared) {
            this.prepared = false;
            this.runningAnimation = false;
            kie kieVar = this.savedInsets;
            if (kieVar != null) {
                this.composeInsets.x(kieVar);
                h1.w(this.composeInsets, kieVar, 0, 2, null);
                this.savedInsets = null;
            }
        }
    }
}
