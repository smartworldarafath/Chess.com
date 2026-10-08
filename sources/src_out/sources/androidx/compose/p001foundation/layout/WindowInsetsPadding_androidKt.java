package androidx.compose.p001foundation.layout;

import androidx.compose.p001foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p001foundation.layout.h1;
import androidx.compose.ui.b;
import androidx.compose.ui.platform.InspectableValueKt;
import com.google.inputmethod.e1e;
import com.google.inputmethod.jz5;
import com.google.inputmethod.tp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0003\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0002\u001a\u0011\u0010\u0005\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0002\u001a\u0011\u0010\u0006\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0002\u001a;\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0007H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\" \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\" \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011\" \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011\" \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011\" \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011\" \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011\" \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011\" \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0011\" \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0011\" \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0011\" \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0011\" \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0011¨\u0006)"}, d2 = {"Landroidx/compose/ui/b;", "v", "(Landroidx/compose/ui/b;)Landroidx/compose/ui/b;", "A", "y", "p", "s", "Lkotlin/Function1;", "Lcom/google/android/jz5;", "", "inspectorInfo", "Landroidx/compose/foundation/layout/h1;", "Landroidx/compose/foundation/layout/g1;", "insetsCalculation", "D", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/b;", "a", "Lkotlin/jvm/functions/Function1;", "safeDrawingLambda", "b", "safeGesturesLambda", "c", "safeContentLambda", "d", "systemBarsLambda", "e", "displayCutoutLambda", "f", "statusBarsLambda", "g", "imeLambda", "h", "navigationBarsLambda", "i", "captionBarLambda", "j", "waterfallLambda", "k", "systemGesturesLambda", "l", "mandatorySystemGesturesLambda", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class WindowInsetsPadding_androidKt {
    private static final Function1<h1, g1> a = new Function1() { // from class: com.google.android.sje
        public final Object invoke(Object obj) {
            return WindowInsetsPadding_androidKt.u((h1) obj);
        }
    };
    private static final Function1<h1, g1> b = new Function1() { // from class: com.google.android.xje
        public final Object invoke(Object obj) {
            return WindowInsetsPadding_androidKt.w((h1) obj);
        }
    };
    private static final Function1<h1, g1> c = new Function1() { // from class: com.google.android.yje
        public final Object invoke(Object obj) {
            return WindowInsetsPadding_androidKt.t((h1) obj);
        }
    };
    private static final Function1<h1, g1> d = new Function1() { // from class: com.google.android.zje
        public final Object invoke(Object obj) {
            return WindowInsetsPadding_androidKt.z((h1) obj);
        }
    };
    private static final Function1<h1, g1> e = new Function1() { // from class: com.google.android.ake
        public final Object invoke(Object obj) {
            return WindowInsetsPadding_androidKt.n((h1) obj);
        }
    };
    private static final Function1<h1, g1> f = new Function1() { // from class: com.google.android.bke
        public final Object invoke(Object obj) {
            return WindowInsetsPadding_androidKt.x((h1) obj);
        }
    };
    private static final Function1<h1, g1> g = new Function1() { // from class: com.google.android.cke
        public final Object invoke(Object obj) {
            return WindowInsetsPadding_androidKt.o((h1) obj);
        }
    };
    private static final Function1<h1, g1> h = new Function1() { // from class: com.google.android.dke
        public final Object invoke(Object obj) {
            return WindowInsetsPadding_androidKt.r((h1) obj);
        }
    };
    private static final Function1<h1, g1> i = new Function1() { // from class: com.google.android.tje
        public final Object invoke(Object obj) {
            return WindowInsetsPadding_androidKt.m((h1) obj);
        }
    };
    private static final Function1<h1, g1> j = new Function1() { // from class: com.google.android.uje
        public final Object invoke(Object obj) {
            return WindowInsetsPadding_androidKt.C((h1) obj);
        }
    };
    private static final Function1<h1, g1> k = new Function1() { // from class: com.google.android.vje
        public final Object invoke(Object obj) {
            return WindowInsetsPadding_androidKt.B((h1) obj);
        }
    };
    private static final Function1<h1, g1> l = new Function1() { // from class: com.google.android.wje
        public final Object invoke(Object obj) {
            return WindowInsetsPadding_androidKt.q((h1) obj);
        }
    };

    public static final b A(b bVar) {
        return D(bVar, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$systemBarsPadding$$inlined$debugInspectorInfo$1
            public final void a(jz5 jz5Var) {
                jz5Var.b("systemBarsPadding");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a(), d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tp B(h1 h1Var) {
        return h1Var.getSystemGestures();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e1e C(h1 h1Var) {
        return h1Var.getWaterfall();
    }

    private static final b D(b bVar, Function1<? super jz5, Unit> function1, Function1<? super h1, ? extends g1> function2) {
        return bVar.then(new y0(function1, function2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tp m(h1 h1Var) {
        return h1Var.getCaptionBar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tp n(h1 h1Var) {
        return h1Var.getDisplayCutout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tp o(h1 h1Var) {
        return h1Var.getIme();
    }

    public static final b p(b bVar) {
        return D(bVar, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$imePadding$$inlined$debugInspectorInfo$1
            public final void a(jz5 jz5Var) {
                jz5Var.b("imePadding");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a(), g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tp q(h1 h1Var) {
        return h1Var.getMandatorySystemGestures();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tp r(h1 h1Var) {
        return h1Var.getNavigationBars();
    }

    public static final b s(b bVar) {
        return D(bVar, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$debugInspectorInfo$1
            public final void a(jz5 jz5Var) {
                jz5Var.b("navigationBarsPadding");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a(), h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g1 t(h1 h1Var) {
        return h1Var.getSafeContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g1 u(h1 h1Var) {
        return h1Var.getSafeDrawing();
    }

    public static final b v(b bVar) {
        return D(bVar, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeDrawingPadding$$inlined$debugInspectorInfo$1
            public final void a(jz5 jz5Var) {
                jz5Var.b("safeDrawingPadding");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a(), a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g1 w(h1 h1Var) {
        return h1Var.getSafeGestures();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tp x(h1 h1Var) {
        return h1Var.getStatusBars();
    }

    public static final b y(b bVar) {
        return D(bVar, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$debugInspectorInfo$1
            public final void a(jz5 jz5Var) {
                jz5Var.b("statusBarsPadding");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a(), f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tp z(h1 h1Var) {
        return h1Var.getSystemBars();
    }
}
