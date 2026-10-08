package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import androidx.compose.p004runtime.p0;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.MediaQueryKt;
import androidx.compose.ui.adaptive.MediaQuery_androidKt;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import com.google.android.e0b;
import com.google.android.r43;
import com.google.android.u67;
import com.google.inputmethod.aj;
import com.google.inputmethod.c65;
import com.google.inputmethod.cla;
import com.google.inputmethod.ebe;
import com.google.inputmethod.fs1;
import com.google.inputmethod.fsd;
import com.google.inputmethod.h67;
import com.google.inputmethod.iz5;
import com.google.inputmethod.jd3;
import com.google.inputmethod.kd3;
import com.google.inputmethod.ko1;
import com.google.inputmethod.lh;
import com.google.inputmethod.mp;
import com.google.inputmethod.mq1;
import com.google.inputmethod.n17;
import com.google.inputmethod.o58;
import com.google.inputmethod.od3;
import com.google.inputmethod.ok;
import com.google.inputmethod.os9;
import com.google.inputmethod.q16;
import com.google.inputmethod.q51;
import com.google.inputmethod.qp5;
import com.google.inputmethod.rr1;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.tya;
import com.google.inputmethod.u9e;
import com.google.inputmethod.vn3;
import com.google.inputmethod.wf5;
import com.google.inputmethod.xk;
import com.google.inputmethod.xo;
import com.google.inputmethod.xy9;
import com.google.inputmethod.ya9;
import com.google.inputmethod.zi;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0002\u0089\u0001\b\u0007\u0018\u00002\u00020\u0001BG\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B;\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\"\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120 H\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u0010:\u001a\u0002058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010@\u001a\u00020;8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010AR \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180C8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010L\u001a\u00020H8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\b-\u0010KR\u001a\u0010R\u001a\u00020M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010V\u001a\u00020S8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u0010T\u001a\u0004\b<\u0010UR\u001a\u0010Z\u001a\u00020W8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010X\u001a\u0004\b6\u0010YR \u0010_\u001a\u00020[8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b>\u0010\\\u0012\u0004\b^\u0010\u0014\u001a\u0004\bI\u0010]R \u0010a\u001a\b\u0012\u0004\u0012\u00020`0C8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u0010E\u001a\u0004\bD\u0010GR\u001a\u0010f\u001a\u00020b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\bN\u0010eR\u001a\u0010l\u001a\u00020g8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u001a\u0010p\u001a\u00020m8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bP\u0010n\u001a\u0004\bc\u0010oR\u001a\u0010u\u001a\u00020q8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010r\u001a\u0004\bs\u0010tR\u001a\u0010y\u001a\u00020v8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bj\u0010w\u001a\u0004\b1\u0010xR$\u0010\u007f\u001a\u00020z2\u0006\u0010{\u001a\u00020z8\u0001@BX\u0080\u000e¢\u0006\f\n\u0004\b3\u0010|\u001a\u0004\b}\u0010~R(\u0010\u0085\u0001\u001a\u00030\u0080\u00018\u0001@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bs\u0010\u0081\u0001\u001a\u0005\bh\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001d\u0010\u0088\u0001\u001a\t\u0012\u0005\u0012\u00030\u0086\u00010 8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010\u0087\u0001R\u0017\u0010\u008b\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001a\u0010\u008a\u0001¨\u0006\u008c\u0001"}, d2 = {"Landroidx/compose/ui/platform/ComposeViewContext;", "", "composeViewContext", "Landroid/view/View;", "view", "Landroidx/compose/runtime/f;", "compositionContext", "Lcom/google/android/n17;", "lifecycleOwner", "Lcom/google/android/e0b;", "savedStateRegistryOwner", "Lcom/google/android/u9e;", "viewModelStoreOwner", "", "matchesContext", "<init>", "(Landroidx/compose/ui/platform/ComposeViewContext;Landroid/view/View;Landroidx/compose/runtime/f;Lcom/google/android/n17;Lcom/google/android/e0b;Lcom/google/android/u9e;Z)V", "(Landroid/view/View;Landroidx/compose/runtime/f;Lcom/google/android/n17;Lcom/google/android/e0b;Lcom/google/android/u9e;)V", "", "y", "()V", "z", "w", "c", "Landroid/content/res/Configuration;", "configuration", "x", "(Landroid/content/res/Configuration;)V", "b", "(Landroid/view/View;Landroidx/compose/runtime/f;Lcom/google/android/n17;Lcom/google/android/e0b;Lcom/google/android/u9e;)Landroidx/compose/ui/platform/ComposeViewContext;", "Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "Lkotlin/Function0;", "content", "a", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "Landroid/view/View;", "s", "()Landroid/view/View;", "Landroidx/compose/runtime/f;", "h", "()Landroidx/compose/runtime/f;", "Lcom/google/android/n17;", "m", "()Lcom/google/android/n17;", "d", "Lcom/google/android/e0b;", "o", "()Lcom/google/android/e0b;", "e", "Lcom/google/android/u9e;", "u", "()Lcom/google/android/u9e;", "Lcom/google/android/qp5;", "f", "Lcom/google/android/qp5;", "l", "()Lcom/google/android/qp5;", "imageVectorCache", "Lcom/google/android/cla;", "g", "Lcom/google/android/cla;", "n", "()Lcom/google/android/cla;", "resourceIdCache", "Landroid/content/res/Configuration;", "currentConfiguration", "Lcom/google/android/o58;", "i", "Lcom/google/android/o58;", "getConfiguration$ui", "()Lcom/google/android/o58;", "Lcom/google/android/lh;", "j", "Lcom/google/android/lh;", "()Lcom/google/android/lh;", "accessibilityManager", "Lcom/google/android/xo;", "k", "Lcom/google/android/xo;", "r", "()Lcom/google/android/xo;", "uriHandler", "Lcom/google/android/aj;", "Lcom/google/android/aj;", "()Lcom/google/android/aj;", "clipboardManager", "Lcom/google/android/zi;", "Lcom/google/android/zi;", "()Lcom/google/android/zi;", "clipboard", "Landroidx/compose/ui/text/font/k$b;", "Landroidx/compose/ui/text/font/k$b;", "()Landroidx/compose/ui/text/font/k$b;", "getFontLoader$ui$annotations", "fontLoader", "Landroidx/compose/ui/text/font/l$b;", "fontFamilyResolver", "Lcom/google/android/c65;", "p", "Lcom/google/android/c65;", "()Lcom/google/android/c65;", "hapticFeedback", "Lcom/google/android/mp;", "q", "Lcom/google/android/mp;", "t", "()Lcom/google/android/mp;", "viewConfiguration", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "sharedDrawScope", "Landroidx/compose/ui/platform/v;", "Landroidx/compose/ui/platform/v;", "v", "()Landroidx/compose/ui/platform/v;", "windowInfo", "Lcom/google/android/q51;", "Lcom/google/android/q51;", "()Lcom/google/android/q51;", "canvasHolder", "", "value", "I", "getViewCount$ui", "()I", "viewCount", "Lcom/google/android/q16;", "J", "()J", "setTestWindowSize-ozmzZPI$ui", "(J)V", "testWindowSize", "Landroidx/compose/ui/platform/t;", "Lkotlin/jvm/functions/Function0;", "calculateWindowSizeLambda", "androidx/compose/ui/platform/ComposeViewContext$a", "Landroidx/compose/ui/platform/ComposeViewContext$a;", "callback", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ComposeViewContext {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final androidx.compose.p004runtime.f compositionContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final n17 lifecycleOwner;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final e0b savedStateRegistryOwner;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final u9e viewModelStoreOwner;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final qp5 imageVectorCache;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final cla resourceIdCache;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Configuration currentConfiguration;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final o58<Configuration> configuration;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final lh accessibilityManager;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final xo uriHandler;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final aj clipboardManager;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final zi clipboard;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final androidx.compose.ui.text.font.k.b fontLoader;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final o58<androidx.compose.ui.text.font.l.b> fontFamilyResolver;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final c65 hapticFeedback;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final mp viewConfiguration;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final LayoutNodeDrawScope sharedDrawScope;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final v windowInfo;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final q51 canvasHolder;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private int viewCount;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private long testWindowSize;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final Function0<t> calculateWindowSizeLambda;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final a callback;

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"androidx/compose/ui/platform/ComposeViewContext$a", "Landroid/content/ComponentCallbacks2;", "Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;", "Landroid/content/res/Configuration;", "configuration", "", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "", "level", "onTrimMemory", "(I)V", "", "hasFocus", "onWindowFocusChanged", "(Z)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
        a() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            ComposeViewContext.this.x(configuration);
        }

        @Override // android.content.ComponentCallbacks
        @r43
        public void onLowMemory() {
            ComposeViewContext.this.getImageVectorCache().a();
            ComposeViewContext.this.getResourceIdCache().a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int level) {
            ComposeViewContext.this.getImageVectorCache().a();
            ComposeViewContext.this.getResourceIdCache().a();
        }

        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public void onWindowFocusChanged(boolean hasFocus) {
            ComposeViewContext.this.getWindowInfo().f(hasFocus);
        }
    }

    private ComposeViewContext(ComposeViewContext composeViewContext, View view, androidx.compose.p004runtime.f fVar, n17 n17Var, e0b e0bVar, u9e u9eVar, boolean z) {
        qp5 qp5Var;
        Configuration configuration;
        o58<Configuration> o58VarE;
        lh lhVar;
        xo xoVar;
        aj ajVar;
        zi ziVar;
        androidx.compose.ui.text.font.k.b xkVar;
        o58<androidx.compose.ui.text.font.l.b> o58VarI;
        mp mpVar;
        q51 q51Var;
        LayoutNodeDrawScope layoutNodeDrawScope;
        cla claVar;
        this.view = view;
        this.compositionContext = fVar;
        this.lifecycleOwner = n17Var;
        this.savedStateRegistryOwner = e0bVar;
        this.viewModelStoreOwner = u9eVar;
        if (z) {
            Intrinsics.g(composeViewContext);
            qp5Var = composeViewContext.imageVectorCache;
        } else {
            qp5Var = new qp5();
        }
        this.imageVectorCache = qp5Var;
        this.resourceIdCache = (composeViewContext == null || (claVar = composeViewContext.resourceIdCache) == null) ? new cla() : claVar;
        if (z) {
            Intrinsics.g(composeViewContext);
            configuration = composeViewContext.currentConfiguration;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.currentConfiguration = configuration;
        androidx.compose.ui.graphics.drawscope.a aVar = null;
        if (z) {
            Intrinsics.g(composeViewContext);
            o58VarE = composeViewContext.configuration;
        } else {
            o58VarE = s0.e(new Configuration(configuration), null, 2, null);
        }
        this.configuration = o58VarE;
        if (z) {
            Intrinsics.g(composeViewContext);
            lhVar = composeViewContext.accessibilityManager;
        } else {
            lhVar = new lh(view.getContext());
        }
        this.accessibilityManager = lhVar;
        if (z) {
            Intrinsics.g(composeViewContext);
            xoVar = composeViewContext.uriHandler;
        } else {
            xoVar = new xo(view.getContext());
        }
        this.uriHandler = xoVar;
        if (z) {
            Intrinsics.g(composeViewContext);
            ajVar = composeViewContext.clipboardManager;
        } else {
            ajVar = new aj(view.getContext());
        }
        this.clipboardManager = ajVar;
        if (z) {
            Intrinsics.g(composeViewContext);
            ziVar = composeViewContext.clipboard;
        } else {
            ziVar = new zi(ajVar);
        }
        this.clipboard = ziVar;
        if (z) {
            Intrinsics.g(composeViewContext);
            xkVar = composeViewContext.fontLoader;
        } else {
            xkVar = new xk(view.getContext());
        }
        this.fontLoader = xkVar;
        if (z) {
            Intrinsics.g(composeViewContext);
            o58VarI = composeViewContext.fontFamilyResolver;
        } else {
            o58VarI = p0.i(androidx.compose.ui.text.font.n.a(view.getContext()), p0.q());
        }
        this.fontFamilyResolver = o58VarI;
        this.hapticFeedback = view == (composeViewContext != null ? composeViewContext.view : null) ? composeViewContext.hapticFeedback : new ya9(view);
        if (z) {
            Intrinsics.g(composeViewContext);
            mpVar = composeViewContext.viewConfiguration;
        } else {
            mpVar = new mp(ViewConfiguration.get(view.getContext()));
        }
        this.viewConfiguration = mpVar;
        this.sharedDrawScope = (composeViewContext == null || (layoutNodeDrawScope = composeViewContext.sharedDrawScope) == null) ? new LayoutNodeDrawScope(aVar, 1, aVar) : layoutNodeDrawScope;
        this.windowInfo = new v();
        this.canvasHolder = (composeViewContext == null || (q51Var = composeViewContext.canvasHolder) == null) ? new q51() : q51Var;
        this.testWindowSize = q16.INSTANCE.a();
        this.calculateWindowSizeLambda = new Function0<t>() { // from class: androidx.compose.ui.platform.ComposeViewContext$calculateWindowSizeLambda$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final t invoke() {
                return q16.f(this.this$0.getTestWindowSize(), q16.INSTANCE.a()) ? l.a(this.this$0.getView()) : t.INSTANCE.b(this.this$0.getTestWindowSize(), ok.a(this.this$0.getView().getContext()));
            }
        };
        this.callback = new a();
    }

    private final void y() {
        this.view.getContext().registerComponentCallbacks(this.callback);
        x(this.view.getResources().getConfiguration());
        this.windowInfo.f(this.view.hasWindowFocus());
        this.windowInfo.e(this.calculateWindowSizeLambda);
        v vVar = this.windowInfo;
        Function0<t> function0 = this.calculateWindowSizeLambda;
        o58 o58Var = vVar._containerSize;
        if (o58Var != null) {
            o58Var.setValue(function0.invoke());
        }
        this.view.getViewTreeObserver().addOnWindowFocusChangeListener(this.callback);
    }

    private final void z() {
        this.view.getContext().unregisterComponentCallbacks(this.callback);
        this.windowInfo.e(null);
        this.view.getViewTreeObserver().removeOnWindowFocusChangeListener(this.callback);
    }

    public final void a(final AndroidComposeView androidComposeView, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, androidx.compose.p004runtime.d dVar, final int i) {
        int i2;
        androidx.compose.p004runtime.d dVarF = dVar.F(123858079);
        if ((i & 6) == 0) {
            i2 = (dVarF.T(androidComposeView) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.T(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dVarF.T(this) ? 256 : 128;
        }
        if (dVarF.g((i2 & 147) != 146, i2 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(123858079, i2, -1, "androidx.compose.ui.platform.ComposeViewContext.ProvideCompositionLocals (ComposeViewContext.android.kt:403)");
            }
            Object tag = androidComposeView.getTag(xy9.M);
            Set<rr1> set = null;
            Set<rr1> set2 = kotlin.jvm.internal.a.q(tag) ? (Set) tag : null;
            if (set2 == null) {
                Object parent = androidComposeView.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(xy9.M) : null;
                if (kotlin.jvm.internal.a.q(tag2)) {
                    set = (Set) tag2;
                }
            } else {
                set = set2;
            }
            if (set != null) {
                set.add(dVarF.S());
                dVarF.N();
            }
            Object objR = dVarF.R();
            androidx.compose.p004runtime.d.Companion companion = androidx.compose.p004runtime.d.INSTANCE;
            if (objR == companion.a()) {
                objR = DisposableSaveableStateRegistry_androidKt.b(androidComposeView, this.savedStateRegistryOwner);
                dVarF.L(objR);
            }
            final od3 od3Var = (od3) objR;
            Unit unit = Unit.a;
            boolean zT = dVarF.T(od3Var);
            Object objR2 = dVarF.R();
            if (zT || objR2 == companion.a()) {
                objR2 = new Function1<kd3, jd3>() { // from class: androidx.compose.ui.platform.ComposeViewContext$ProvideCompositionLocals$1$1

                    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/ComposeViewContext$ProvideCompositionLocals$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                    public static final class a implements jd3 {
                        final /* synthetic */ od3 a;

                        public a(od3 od3Var) {
                            this.a = od3Var;
                        }

                        @Override // com.google.inputmethod.jd3
                        public void dispose() {
                            this.a.d();
                        }
                    }

                    {
                        super(1);
                    }

                    public final jd3 invoke(kd3 kd3Var) {
                        return new a(od3Var);
                    }
                };
                dVarF.L(objR2);
            }
            vn3.c(unit, (Function1) objR2, dVarF, 6);
            boolean zBooleanValue = ((Boolean) dVarF.v(CompositionLocalsKt.q())).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui();
            boolean zX = dVarF.x(androidComposeView.getView());
            Object objR3 = dVarF.R();
            if (zX || objR3 == companion.a()) {
                objR3 = new ebe(androidComposeView.getView());
                dVarF.L(objR3);
            }
            fs1.d(new os9[]{h67.c().d(this.lifecycleOwner), u67.c().d(this.savedStateRegistryOwner), AndroidCompositionLocals_androidKt.d().d(this.imageVectorCache), AndroidCompositionLocals_androidKt.e().d(this.resourceIdCache), AndroidCompositionLocals_androidKt.c().d(androidComposeView.getContext()), iz5.c().d(set), AndroidCompositionLocals_androidKt.b().d(androidComposeView.getConfiguration()), tya.g().d(od3Var), AndroidCompositionLocals_androidKt.g().d(androidComposeView.getView()), CompositionLocalsKt.p().d(Boolean.valueOf(zBooleanValue)), CompositionLocalsKt.u().d(androidComposeView.getViewConfiguration()), wf5.c().d((ebe) objR3)}, ko1.e(1317454175, true, new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.platform.ComposeViewContext$ProvideCompositionLocals$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(androidx.compose.p004runtime.d dVar2, int i3) {
                    if (!dVar2.g((i3 & 3) != 2, i3 & 1)) {
                        dVar2.q();
                        return;
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(1317454175, i3, -1, "androidx.compose.ui.platform.ComposeViewContext.ProvideCompositionLocals.<anonymous> (ComposeViewContext.android.kt:436)");
                    }
                    if (mq1.isMediaQueryIntegrationEnabled) {
                        dVar2.y(866239106);
                        os9<fsd> os9VarD = MediaQueryKt.a().d(MediaQuery_androidKt.k(androidComposeView.getContext(), androidComposeView.getView(), androidComposeView.getWindowInfo(), dVar2, 0));
                        final AndroidComposeView androidComposeView2 = androidComposeView;
                        final ComposeViewContext composeViewContext = this;
                        final Function2<androidx.compose.p004runtime.d, Integer, Unit> function3 = function2;
                        fs1.c(os9VarD, ko1.e(-1423844166, true, new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.platform.ComposeViewContext$ProvideCompositionLocals$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(androidx.compose.p004runtime.d dVar3, int i4) {
                                if (!dVar3.g((i4 & 3) != 2, i4 & 1)) {
                                    dVar3.q();
                                    return;
                                }
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.o(-1423844166, i4, -1, "androidx.compose.ui.platform.ComposeViewContext.ProvideCompositionLocals.<anonymous>.<anonymous> (ComposeViewContext.android.kt:439)");
                                }
                                CompositionLocalsKt.a(androidComposeView2, composeViewContext.getUriHandler(), function3, dVar3, 0);
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.n();
                                }
                            }
                        }, dVar2, 54), dVar2, os9.i | 48);
                        dVar2.u();
                    } else {
                        dVar2.y(866651995);
                        CompositionLocalsKt.a(androidComposeView, this.getUriHandler(), function2, dVar2, 0);
                        dVar2.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                }
            }, dVarF, 54), dVarF, os9.i | 48);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.platform.ComposeViewContext$ProvideCompositionLocals$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(androidx.compose.p004runtime.d dVar2, int i3) {
                    this.$tmp4_rcvr.a(androidComposeView, function2, dVar2, saa.a(i | 1));
                }
            });
        }
    }

    public final ComposeViewContext b(View view, androidx.compose.p004runtime.f compositionContext, n17 lifecycleOwner, e0b savedStateRegistryOwner, u9e viewModelStoreOwner) {
        return new ComposeViewContext(this, view, compositionContext, lifecycleOwner, savedStateRegistryOwner, viewModelStoreOwner, false, 64, null);
    }

    public final void c() {
        int i = this.viewCount - 1;
        this.viewCount = i;
        if (i < 0) {
            this.viewCount = 0;
        }
        if (this.viewCount == 0) {
            z();
        }
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final lh getAccessibilityManager() {
        return this.accessibilityManager;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final q51 getCanvasHolder() {
        return this.canvasHolder;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final zi getClipboard() {
        return this.clipboard;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final aj getClipboardManager() {
        return this.clipboardManager;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final androidx.compose.p004runtime.f getCompositionContext() {
        return this.compositionContext;
    }

    public final o58<androidx.compose.ui.text.font.l.b> i() {
        return this.fontFamilyResolver;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final androidx.compose.ui.text.font.k.b getFontLoader() {
        return this.fontLoader;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final c65 getHapticFeedback() {
        return this.hapticFeedback;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final qp5 getImageVectorCache() {
        return this.imageVectorCache;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final n17 getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final cla getResourceIdCache() {
        return this.resourceIdCache;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final e0b getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final LayoutNodeDrawScope getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final long getTestWindowSize() {
        return this.testWindowSize;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final xo getUriHandler() {
        return this.uriHandler;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final View getView() {
        return this.view;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final mp getViewConfiguration() {
        return this.viewConfiguration;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final u9e getViewModelStoreOwner() {
        return this.viewModelStoreOwner;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final v getWindowInfo() {
        return this.windowInfo;
    }

    public final void w() {
        int i = this.viewCount + 1;
        this.viewCount = i;
        if (i == 1) {
            y();
        }
    }

    public final void x(Configuration configuration) {
        int iUpdateFrom = this.currentConfiguration.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            this.imageVectorCache.c(iUpdateFrom);
            this.configuration.setValue(new Configuration(configuration));
            this.resourceIdCache.a();
            if ((268435456 & iUpdateFrom) != 0) {
                this.fontFamilyResolver.setValue(androidx.compose.ui.text.font.n.a(this.view.getContext()));
            }
            if (((-1342235264) & iUpdateFrom) != 0) {
                v vVar = this.windowInfo;
                Function0<t> function0 = this.calculateWindowSizeLambda;
                o58 o58Var = vVar._containerSize;
                if (o58Var != null) {
                    o58Var.setValue(function0.invoke());
                }
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* synthetic */ ComposeViewContext(ComposeViewContext composeViewContext, View view, androidx.compose.p004runtime.f fVar, n17 n17Var, e0b e0bVar, u9e u9eVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        View view2;
        if ((i & 64) != 0) {
            z = Intrinsics.e((composeViewContext == null || (view2 = composeViewContext.view) == null) ? null : view2.getContext(), view.getContext());
        }
        this(composeViewContext, view, fVar, n17Var, e0bVar, u9eVar, z);
    }

    public ComposeViewContext(View view, androidx.compose.p004runtime.f fVar, n17 n17Var, e0b e0bVar, u9e u9eVar) {
        this(s.c(view), view, fVar, n17Var, e0bVar, u9eVar, false, 64, null);
    }
}
