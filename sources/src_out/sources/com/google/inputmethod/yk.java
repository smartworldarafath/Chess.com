package com.google.inputmethod;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerImpl;
import androidx.compose.ui.graphics.layer.c;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0002\u001a$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010/¨\u00061"}, d2 = {"Lcom/google/android/yk;", "Lcom/google/android/i05;", "Landroid/view/ViewGroup;", "ownerView", "<init>", "(Landroid/view/ViewGroup;)V", "", "g", "()V", "Landroid/content/Context;", "context", "j", "(Landroid/content/Context;)V", "k", "Lcom/google/android/ug3;", "i", "(Landroid/view/ViewGroup;)Lcom/google/android/ug3;", "Landroid/view/View;", "view", "", "h", "(Landroid/view/View;)J", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "b", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "c", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "a", "Landroid/view/ViewGroup;", "", "Ljava/lang/Object;", "lock", "Lcom/google/android/ug3;", "viewLayerContainer", "", "d", "Z", "componentCallbackRegistered", "Lcom/google/android/pkb;", "e", "Lcom/google/android/pkb;", "shadowCache", "Landroid/content/ComponentCallbacks2;", "f", "Landroid/content/ComponentCallbacks2;", "componentCallback", "()Lcom/google/android/pkb;", "shadowContext", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class yk implements i05 {
    private static boolean h = true;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ViewGroup ownerView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private ug3 viewLayerContainer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean componentCallbackRegistered;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private pkb shadowCache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final ComponentCallbacks2 componentCallback = new a();

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/google/android/yk$a", "Landroid/content/ComponentCallbacks2;", "Landroid/content/res/Configuration;", "newConfig", "", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "", "level", "onTrimMemory", "(I)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements ComponentCallbacks2 {
        a() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration newConfig) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int level) {
            if (level >= 40) {
                yk.this.g();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/google/android/yk$b", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
            yk.this.j(v.getContext());
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            yk.this.k(v.getContext());
            yk.this.g();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/android/yk$d;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "a", "(Landroid/view/View;)J", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class d {
        public static final d a = new d();

        private d() {
        }

        public static final long a(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public yk(ViewGroup viewGroup) {
        this.ownerView = viewGroup;
        if (viewGroup.isAttachedToWindow()) {
            j(viewGroup.getContext());
        }
        viewGroup.addOnAttachStateChangeListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        pkb pkbVar = this.shadowCache;
        if (pkbVar != null) {
            pkbVar.b();
        }
        this.shadowCache = null;
    }

    private final long h(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.a(view);
        }
        return -1L;
    }

    private final ug3 i(ViewGroup ownerView) {
        ug3 ug3Var = this.viewLayerContainer;
        if (ug3Var != null) {
            return ug3Var;
        }
        l8e l8eVar = new l8e(ownerView.getContext());
        ownerView.addView(l8eVar);
        this.viewLayerContainer = l8eVar;
        return l8eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(Context context) {
        if (this.componentCallbackRegistered) {
            return;
        }
        context.getApplicationContext().registerComponentCallbacks(this.componentCallback);
        this.componentCallbackRegistered = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(Context context) {
        if (this.componentCallbackRegistered) {
            context.getApplicationContext().unregisterComponentCallbacks(this.componentCallback);
            this.componentCallbackRegistered = false;
        }
    }

    @Override // com.google.inputmethod.i05
    public pkb a() {
        pkb pkbVar = this.shadowCache;
        if (pkbVar != null) {
            return pkbVar;
        }
        pkb pkbVarA = un.a();
        this.shadowCache = pkbVarA;
        return pkbVarA;
    }

    @Override // com.google.inputmethod.i05
    public GraphicsLayer b() {
        GraphicsLayerImpl dVar;
        GraphicsLayer graphicsLayer;
        synchronized (this.lock) {
            try {
                long jH = h(this.ownerView);
                if (Build.VERSION.SDK_INT >= 29) {
                    dVar = new c(jH, null, null, 6, null);
                } else if (h) {
                    try {
                        dVar = new androidx.compose.ui.graphics.layer.b(this.ownerView, jH, null, null, 12, null);
                    } catch (Throwable unused) {
                        h = false;
                        dVar = new androidx.compose.ui.graphics.layer.d(i(this.ownerView), jH, null, null, 12, null);
                    }
                } else {
                    dVar = new androidx.compose.ui.graphics.layer.d(i(this.ownerView), jH, null, null, 12, null);
                }
                graphicsLayer = new GraphicsLayer(dVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return graphicsLayer;
    }

    @Override // com.google.inputmethod.i05
    public void c(GraphicsLayer layer) {
        synchronized (this.lock) {
            layer.I();
            Unit unit = Unit.a;
        }
    }
}
