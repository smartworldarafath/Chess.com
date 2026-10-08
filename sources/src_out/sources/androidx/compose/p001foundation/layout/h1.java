package androidx.compose.p001foundation.layout;

import android.view.View;
import android.view.WindowInsets;
import androidx.compose.p001foundation.layout.h1;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.s0;
import androidx.compose.p004runtime.snapshots.g;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.inputmethod.e1e;
import com.google.inputmethod.jd3;
import com.google.inputmethod.k7e;
import com.google.inputmethod.kd3;
import com.google.inputmethod.kie;
import com.google.inputmethod.o58;
import com.google.inputmethod.rje;
import com.google.inputmethod.tp;
import com.google.inputmethod.uy5;
import com.google.inputmethod.vn3;
import com.google.inputmethod.xy9;
import com.google.inputmethod.yc3;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0015B\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001b\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010 \u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\"\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b!\u0010\u0018R\u0017\u0010$\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b#\u0010\u0018R\u0017\u0010'\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0018R\u0017\u0010*\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0018R\u0017\u0010,\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b+\u0010\u0018R\u0017\u00101\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b/\u00100R/\u0010:\u001a\u0004\u0018\u0001022\b\u00103\u001a\u0004\u0018\u0001028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0017\u0010@\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010B\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b>\u0010=\u001a\u0004\bA\u0010?R\u0017\u0010C\u001a\u00020;8\u0006¢\u0006\f\n\u0004\bA\u0010=\u001a\u0004\b<\u0010?R\u0017\u0010E\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b#\u0010.\u001a\u0004\bD\u00100R\u0017\u0010F\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b&\u0010.\u001a\u0004\b4\u00100R\u0017\u0010I\u001a\u00020-8\u0006¢\u0006\f\n\u0004\bG\u0010.\u001a\u0004\bH\u00100R\u0017\u0010J\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b)\u0010.\u001a\u0004\bG\u00100R\u0017\u0010L\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\bK\u00100R\u0017\u0010M\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b(\u00100R\u0017\u0010N\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b8\u0010.\u001a\u0004\b%\u00100R\u001d\u0010T\u001a\u00020O8\u0006¢\u0006\u0012\n\u0004\b\u000f\u0010P\u0012\u0004\bR\u0010S\u001a\u0004\b\u001e\u0010QR\u0016\u0010W\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010Z\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010Y¨\u0006["}, d2 = {"Landroidx/compose/foundation/layout/h1;", "", "Lcom/google/android/kie;", "insets", "Landroid/view/View;", "view", "<init>", "(Lcom/google/android/kie;Landroid/view/View;)V", "", "t", "(Landroid/view/View;)V", "b", "windowInsets", "", "types", "v", "(Lcom/google/android/kie;I)V", "x", "(Lcom/google/android/kie;)V", "y", "Lcom/google/android/tp;", "a", "Lcom/google/android/tp;", "c", "()Lcom/google/android/tp;", "captionBar", "e", "displayCutout", "f", "ime", "d", "i", "mandatorySystemGestures", "j", "navigationBars", "o", "statusBars", "g", "p", "systemBars", "h", "r", "systemGestures", "getTappableElement", "tappableElement", "Lcom/google/android/e1e;", "Lcom/google/android/e1e;", "s", "()Lcom/google/android/e1e;", "waterfall", "Landroidx/compose/ui/graphics/Path;", "<set-?>", "k", "Lcom/google/android/o58;", "getCutoutPath", "()Landroidx/compose/ui/graphics/Path;", "u", "(Landroidx/compose/ui/graphics/Path;)V", "cutoutPath", "Landroidx/compose/foundation/layout/g1;", "l", "Landroidx/compose/foundation/layout/g1;", "m", "()Landroidx/compose/foundation/layout/g1;", "safeDrawing", "n", "safeGestures", "safeContent", "getCaptionBarIgnoringVisibility", "captionBarIgnoringVisibility", "navigationBarsIgnoringVisibility", "q", "getStatusBarsIgnoringVisibility", "statusBarsIgnoringVisibility", "systemBarsIgnoringVisibility", "getTappableElementIgnoringVisibility", "tappableElementIgnoringVisibility", "imeAnimationTarget", "imeAnimationSource", "", "Z", "()Z", "getConsumes$annotations", "()V", "consumes", "w", "I", "accessCount", "Landroidx/compose/foundation/layout/j0;", "Landroidx/compose/foundation/layout/j0;", "insetsListener", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h1 {
    private static boolean B;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final tp captionBar;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final tp displayCutout;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final tp ime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final tp mandatorySystemGestures;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final tp navigationBars;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final tp statusBars;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final tp systemBars;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final tp systemGestures;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final tp tappableElement;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final e1e waterfall;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final o58 cutoutPath;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final g1 safeDrawing;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final g1 safeGestures;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final g1 safeContent;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final e1e captionBarIgnoringVisibility;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final e1e navigationBarsIgnoringVisibility;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final e1e statusBarsIgnoringVisibility;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final e1e systemBarsIgnoringVisibility;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final e1e tappableElementIgnoringVisibility;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final e1e imeAnimationTarget;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final e1e imeAnimationSource;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final boolean consumes;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private int accessCount;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final j0 insetsListener;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int z = 8;
    private static final WeakHashMap<View, h1> A = new WeakHashMap<>();

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.h1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/h1$a;", "", "<init>", "()V", "Lcom/google/android/kie;", "windowInsets", "", "type", "", "name", "Lcom/google/android/tp;", "g", "(Lcom/google/android/kie;ILjava/lang/String;)Lcom/google/android/tp;", "Lcom/google/android/e1e;", "h", "(Lcom/google/android/kie;ILjava/lang/String;)Lcom/google/android/e1e;", "Landroidx/compose/foundation/layout/h1;", "d", "(Landroidx/compose/runtime/d;I)Landroidx/compose/foundation/layout/h1;", "Landroid/view/View;", "view", "f", "(Landroid/view/View;)Landroidx/compose/foundation/layout/h1;", "Ljava/util/WeakHashMap;", "viewMap", "Ljava/util/WeakHashMap;", "", "testInsets", "Z", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: androidx.compose.foundation.layout.h1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/foundation/layout/h1$a$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C0020a implements jd3 {
            final /* synthetic */ h1 a;
            final /* synthetic */ View b;

            public C0020a(h1 h1Var, View view) {
                this.a = h1Var;
                this.b = view;
            }

            @Override // com.google.inputmethod.jd3
            public void dispose() {
                this.a.b(this.b);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jd3 e(h1 h1Var, View view, kd3 kd3Var) {
            h1Var.t(view);
            return new C0020a(h1Var, view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final tp g(kie windowInsets, int type, String name) {
            tp tpVar = new tp(type, name);
            if (windowInsets != null) {
                tpVar.i(windowInsets, type);
            }
            return tpVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final e1e h(kie windowInsets, int type, String name) {
            uy5 uy5VarH;
            if (windowInsets == null || (uy5VarH = windowInsets.h(type)) == null) {
                uy5VarH = uy5.e;
            }
            return i1.a(uy5VarH, name);
        }

        public final h1 d(d dVar, int i) {
            if (e.k()) {
                e.o(-1366542614, i, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:574)");
            }
            final View view = (View) dVar.v(AndroidCompositionLocals_androidKt.g());
            final h1 h1VarF = f(view);
            boolean zT = dVar.T(h1VarF) | dVar.T(view);
            Object objR = dVar.R();
            if (zT || objR == d.INSTANCE.a()) {
                objR = new Function1() { // from class: com.google.android.qje
                    public final Object invoke(Object obj) {
                        return h1.Companion.e(h1VarF, view, (kd3) obj);
                    }
                };
                dVar.L(objR);
            }
            vn3.c(h1VarF, (Function1) objR, dVar, 0);
            if (e.k()) {
                e.n();
            }
            return h1VarF;
        }

        public final h1 f(View view) {
            h1 h1Var;
            synchronized (h1.A) {
                try {
                    WeakHashMap weakHashMap = h1.A;
                    Object h1Var2 = weakHashMap.get(view);
                    if (h1Var2 == null) {
                        kie kieVar = null;
                        h1Var2 = new h1(kieVar, view, kieVar);
                        weakHashMap.put(view, h1Var2);
                    }
                    h1Var = (h1) h1Var2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return h1Var;
        }

        private Companion() {
        }
    }

    public /* synthetic */ h1(kie kieVar, View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(kieVar, view);
    }

    private final void u(Path path) {
        this.cutoutPath.setValue(path);
    }

    public static /* synthetic */ void w(h1 h1Var, kie kieVar, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        h1Var.v(kieVar, i);
    }

    public final void b(View view) {
        int i = this.accessCount - 1;
        this.accessCount = i;
        if (i == 0) {
            k7e.z0(view, null);
            k7e.G0(view, null);
            view.removeOnAttachStateChangeListener(this.insetsListener);
        }
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final tp getCaptionBar() {
        return this.captionBar;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getConsumes() {
        return this.consumes;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final tp getDisplayCutout() {
        return this.displayCutout;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final tp getIme() {
        return this.ime;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final e1e getImeAnimationSource() {
        return this.imeAnimationSource;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final e1e getImeAnimationTarget() {
        return this.imeAnimationTarget;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final tp getMandatorySystemGestures() {
        return this.mandatorySystemGestures;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final tp getNavigationBars() {
        return this.navigationBars;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final e1e getNavigationBarsIgnoringVisibility() {
        return this.navigationBarsIgnoringVisibility;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final g1 getSafeContent() {
        return this.safeContent;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final g1 getSafeDrawing() {
        return this.safeDrawing;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final g1 getSafeGestures() {
        return this.safeGestures;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final tp getStatusBars() {
        return this.statusBars;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final tp getSystemBars() {
        return this.systemBars;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final e1e getSystemBarsIgnoringVisibility() {
        return this.systemBarsIgnoringVisibility;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final tp getSystemGestures() {
        return this.systemGestures;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final e1e getWaterfall() {
        return this.waterfall;
    }

    public final void t(View view) {
        if (this.accessCount == 0) {
            k7e.z0(view, this.insetsListener);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.insetsListener);
            k7e.G0(view, this.insetsListener);
        }
        this.accessCount++;
    }

    public final void v(kie windowInsets, int types) {
        uy5 uy5VarG;
        android.graphics.Path pathB;
        if (B) {
            WindowInsets windowInsetsE = windowInsets.E();
            Intrinsics.g(windowInsetsE);
            windowInsets = kie.F(windowInsetsE);
        }
        this.captionBar.i(windowInsets, types);
        this.ime.i(windowInsets, types);
        this.displayCutout.i(windowInsets, types);
        this.navigationBars.i(windowInsets, types);
        this.statusBars.i(windowInsets, types);
        this.systemBars.i(windowInsets, types);
        this.systemGestures.i(windowInsets, types);
        this.tappableElement.i(windowInsets, types);
        this.mandatorySystemGestures.i(windowInsets, types);
        if (types == 0) {
            this.captionBarIgnoringVisibility.f(i1.m(windowInsets.h(kie.s.b())));
            this.navigationBarsIgnoringVisibility.f(i1.m(windowInsets.h(kie.s.g())));
            this.statusBarsIgnoringVisibility.f(i1.m(windowInsets.h(kie.s.h())));
            this.systemBarsIgnoringVisibility.f(i1.m(windowInsets.h(kie.s.i())));
            this.tappableElementIgnoringVisibility.f(i1.m(windowInsets.h(kie.s.k())));
            yc3 yc3VarF = windowInsets.f();
            e1e e1eVar = this.waterfall;
            if (yc3VarF == null || (uy5VarG = yc3VarF.g()) == null) {
                uy5VarG = uy5.e;
            }
            e1eVar.f(i1.m(uy5VarG));
            u((yc3VarF == null || (pathB = yc3VarF.b()) == null) ? null : androidx.compose.ui.graphics.d.c(pathB));
        }
        g.INSTANCE.m();
    }

    public final void x(kie windowInsets) {
        this.imeAnimationSource.f(i1.m(windowInsets.g(kie.s.d())));
    }

    public final void y(kie windowInsets) {
        this.imeAnimationTarget.f(i1.m(windowInsets.g(kie.s.d())));
    }

    private h1(kie kieVar, View view) {
        yc3 yc3VarF;
        android.graphics.Path pathB;
        yc3 yc3VarF2;
        uy5 uy5VarG;
        Companion companion = INSTANCE;
        tp tpVarG = companion.g(kieVar, kie.s.b(), "captionBar");
        this.captionBar = tpVarG;
        tp tpVarG2 = companion.g(kieVar, kie.s.c(), "displayCutout");
        this.displayCutout = tpVarG2;
        tp tpVarG3 = companion.g(kieVar, kie.s.d(), "ime");
        this.ime = tpVarG3;
        tp tpVarG4 = companion.g(kieVar, kie.s.f(), "mandatorySystemGestures");
        this.mandatorySystemGestures = tpVarG4;
        tp tpVarG5 = companion.g(kieVar, kie.s.g(), "navigationBars");
        this.navigationBars = tpVarG5;
        tp tpVarG6 = companion.g(kieVar, kie.s.h(), "statusBars");
        this.statusBars = tpVarG6;
        tp tpVarG7 = companion.g(kieVar, kie.s.i(), "systemBars");
        this.systemBars = tpVarG7;
        tp tpVarG8 = companion.g(kieVar, kie.s.j(), "systemGestures");
        this.systemGestures = tpVarG8;
        tp tpVarG9 = companion.g(kieVar, kie.s.k(), "tappableElement");
        this.tappableElement = tpVarG9;
        e1e e1eVarA = i1.a((kieVar == null || (yc3VarF2 = kieVar.f()) == null || (uy5VarG = yc3VarF2.g()) == null) ? uy5.e : uy5VarG, "waterfall");
        this.waterfall = e1eVarA;
        this.cutoutPath = s0.e((kieVar == null || (yc3VarF = kieVar.f()) == null || (pathB = yc3VarF.b()) == null) ? null : androidx.compose.ui.graphics.d.c(pathB), null, 2, null);
        g1 g1VarL = rje.l(rje.l(tpVarG7, tpVarG3), tpVarG2);
        this.safeDrawing = g1VarL;
        g1 g1VarL2 = rje.l(rje.l(rje.l(tpVarG9, tpVarG4), tpVarG8), e1eVarA);
        this.safeGestures = g1VarL2;
        this.safeContent = rje.l(g1VarL, g1VarL2);
        this.captionBarIgnoringVisibility = companion.h(kieVar, kie.s.b(), "captionBarIgnoringVisibility");
        this.navigationBarsIgnoringVisibility = companion.h(kieVar, kie.s.g(), "navigationBarsIgnoringVisibility");
        this.statusBarsIgnoringVisibility = companion.h(kieVar, kie.s.h(), "statusBarsIgnoringVisibility");
        this.systemBarsIgnoringVisibility = companion.h(kieVar, kie.s.i(), "systemBarsIgnoringVisibility");
        this.tappableElementIgnoringVisibility = companion.h(kieVar, kie.s.k(), "tappableElementIgnoringVisibility");
        uy5 uy5Var = uy5.e;
        this.imeAnimationTarget = i1.a(uy5Var, "imeAnimationTarget");
        this.imeAnimationSource = i1.a(uy5Var, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(xy9.K) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.consumes = bool != null ? bool.booleanValue() : false;
        this.insetsListener = new j0(this);
        kie kieVarF = k7e.F(view);
        if (kieVarF != null) {
            tpVarG.h(kieVarF.u(kie.s.b()));
            tpVarG2.h(kieVarF.u(kie.s.c()));
            tpVarG3.h(kieVarF.u(kie.s.d()));
            tpVarG4.h(kieVarF.u(kie.s.f()));
            tpVarG5.h(kieVarF.u(kie.s.g()));
            tpVarG6.h(kieVarF.u(kie.s.h()));
            tpVarG7.h(kieVarF.u(kie.s.i()));
            tpVarG8.h(kieVarF.u(kie.s.j()));
            tpVarG9.h(kieVarF.u(kie.s.k()));
        }
    }
}
