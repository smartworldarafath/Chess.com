package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import com.google.inputmethod.MutableRect;
import com.google.inputmethod.an6;
import com.google.inputmethod.dm;
import com.google.inputmethod.dw8;
import com.google.inputmethod.g16;
import com.google.inputmethod.ki1;
import com.google.inputmethod.nu8;
import com.google.inputmethod.q09;
import com.google.inputmethod.q51;
import com.google.inputmethod.tg3;
import com.google.inputmethod.w41;
import com.google.inputmethod.wi;
import com.google.inputmethod.zh7;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u0089\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002.&J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J!\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010 J7\u0010'\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\"H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010 J\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010 J\u000f\u0010+\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010 J\u001f\u0010.\u001a\u00020\f2\u0006\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u0002002\u0006\u0010-\u001a\u00020\tH\u0016¢\u0006\u0004\b2\u00103J9\u0010&\u001a\u00020\u00062\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u0006042\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000606H\u0016¢\u0006\u0004\b&\u00108J\u0017\u0010;\u001a\u00020\u00062\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00062\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b=\u0010<J\u000f\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0006H\u0002¢\u0006\u0004\bA\u0010 J\u000f\u0010B\u001a\u00020\u0006H\u0002¢\u0006\u0004\bB\u0010 R\u0017\u0010G\u001a\u00020C8\u0006¢\u0006\f\n\u0004\b;\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010L\u001a\u00020H8\u0006¢\u0006\f\n\u0004\b&\u0010I\u001a\u0004\bJ\u0010KR,\u00105\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u0006\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010MR\u001e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010NR\u0014\u0010Q\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010PR\u0016\u0010S\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010RR\u0018\u0010V\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010UR*\u0010[\u001a\u00020\t2\u0006\u0010W\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010R\u001a\u0004\bX\u0010\u000b\"\u0004\bY\u0010ZR\u0018\u0010]\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\\R\u0016\u0010^\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010RR\u0014\u0010a\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010`R\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00010b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010cR\"\u0010l\u001a\u00020e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010n\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bm\u0010R\u001a\u0004\bn\u0010\u000b\"\u0004\bo\u0010ZR\u0016\u0010s\u001a\u00020p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010u\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010RR\u001a\u0010z\u001a\u00020v8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bw\u0010r\u001a\u0004\bx\u0010yR\u0016\u0010|\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010{R\u0014\u0010\u007f\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0016\u0010\u0081\u0001\u001a\u00020v8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010yR'\u0010\u0084\u0001\u001a\u00020e2\u0006\u0010W\u001a\u00020e8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0082\u0001\u0010i\"\u0005\b\u0083\u0001\u0010kR\u001a\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0085\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u008a\u0001"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer;", "Landroid/view/View;", "Lcom/google/android/dw8;", "", "Landroidx/compose/ui/graphics/s;", "scope", "", "g", "(Landroidx/compose/ui/graphics/s;)V", "", "hasOverlappingRendering", "()Z", "Lcom/google/android/rn8;", "position", "f", "(J)Z", "Lcom/google/android/q16;", "size", "d", "(J)V", "Lcom/google/android/g16;", "j", "Lcom/google/android/w41;", "canvas", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "parentLayer", "i", "(Lcom/google/android/w41;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroid/graphics/Canvas;", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "invalidate", "()V", "changed", "", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "destroy", "k", "forceLayout", "point", "inverse", "c", "(JZ)J", "Lcom/google/android/i58;", "rect", "e", "(Lcom/google/android/i58;Z)V", "Lkotlin/Function2;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "Lcom/google/android/zh7;", "matrix", "a", "([F)V", "h", "Lcom/google/android/q09;", "v", "()Lcom/google/android/q09;", "x", "w", "Landroidx/compose/ui/platform/AndroidComposeView;", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Lcom/google/android/tg3;", "Lcom/google/android/tg3;", "getContainer", "()Lcom/google/android/tg3;", "container", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function0;", "Lcom/google/android/nu8;", "Lcom/google/android/nu8;", "outlineResolver", "Z", "clipToBounds", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "clipBoundsCache", "value", "u", "setInvalidated", "(Z)V", "isInvalidated", "Lcom/google/android/q09;", "layerPaint", "drawnWithZ", "Lcom/google/android/q51;", "Lcom/google/android/q51;", "canvasHolder", "Lcom/google/android/an6;", "Lcom/google/android/an6;", "matrixCache", "", "m", "F", "getFrameRate", "()F", "setFrameRate", "(F)V", "frameRate", "n", "isFrameRateFromParent", "setFrameRateFromParent", "Landroidx/compose/ui/graphics/t;", "o", "J", "mTransformOrigin", "p", "mHasOverlappingRendering", "", "q", "getLayerId", "()J", "layerId", "I", "mutatedFields", "getUnderlyingMatrix-sQKQjiQ", "()[F", "underlyingMatrix", "getOwnerViewId", "ownerViewId", "getCameraDistancePx", "setCameraDistancePx", "cameraDistancePx", "Landroidx/compose/ui/graphics/Path;", "getManualClipPath", "()Landroidx/compose/ui/graphics/Path;", "manualClipPath", "s", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ViewLayer extends View implements dw8 {

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int t = 8;
    private static final Function2<View, Matrix, Unit> u = new Function2<View, Matrix, Unit>() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$getMatrix$1
        public final void a(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((View) obj, (Matrix) obj2);
            return Unit.a;
        }
    };
    private static final ViewOutlineProvider v = new a();
    private static Method w;
    private static Field x;
    private static boolean y;
    private static boolean z;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final tg3 container;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Function2<? super w41, ? super GraphicsLayer, Unit> drawBlock;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Function0<Unit> invalidateParentLayer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final nu8 outlineResolver;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean clipToBounds;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Rect clipBoundsCache;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isInvalidated;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private q09 layerPaint;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean drawnWithZ;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final q51 canvasHolder;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final an6<View> matrixCache;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private float frameRate;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean isFrameRateFromParent;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private long mTransformOrigin;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean mHasOverlappingRendering;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final long layerId;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private int mutatedFields;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/ViewLayer$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Intrinsics.h(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            Outline outlineB = ((ViewLayer) view).outlineResolver.b();
            Intrinsics.g(outlineB);
            outline.set(outlineB);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.ViewLayer$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR*\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e\"\u0004\b\u0011\u0010\u0012R&\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$b;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "d", "(Landroid/view/View;)V", "", "value", "hasRetrievedMethod", "Z", "a", "()Z", "shouldUseDispatchDraw", "b", "c", "(Z)V", "Lkotlin/Function2;", "Landroid/graphics/Matrix;", "getMatrix", "Lkotlin/jvm/functions/Function2;", "Ljava/lang/reflect/Method;", "updateDisplayListIfDirtyMethod", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Field;", "recreateDisplayList", "Ljava/lang/reflect/Field;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return ViewLayer.y;
        }

        public final boolean b() {
            return ViewLayer.z;
        }

        public final void c(boolean z) {
            ViewLayer.z = z;
        }

        public final void d(View view) {
            try {
                if (!a()) {
                    ViewLayer.y = true;
                    ViewLayer.w = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    ViewLayer.x = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    Method method = ViewLayer.w;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ViewLayer.x;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ViewLayer.x;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = ViewLayer.w;
                if (method2 != null) {
                    method2.invoke(view, null);
                }
            } catch (Throwable unused) {
                c(true);
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$c;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "a", "(Landroid/view/View;)J", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class c {
        public static final c a = new c();

        private c() {
        }

        public static final long a(View view) {
            return view.getUniqueDrawingId();
        }
    }

    private final Path getManualClipPath() {
        if (!getClipToOutline() || this.outlineResolver.e()) {
            return null;
        }
        return this.outlineResolver.d();
    }

    private final void setInvalidated(boolean z2) {
        if (z2 != this.isInvalidated) {
            this.isInvalidated = z2;
            this.ownerView.a1(this, z2);
        }
    }

    private final q09 v() {
        q09 q09Var = this.layerPaint;
        if (q09Var != null) {
            return q09Var;
        }
        q09 q09VarA = dm.a();
        this.layerPaint = q09VarA;
        return q09VarA;
    }

    private final void w() {
        Rect rect;
        if (this.clipToBounds) {
            Rect rect2 = this.clipBoundsCache;
            if (rect2 == null) {
                this.clipBoundsCache = new Rect(0, 0, getWidth(), getHeight());
            } else {
                Intrinsics.g(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.clipBoundsCache;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void x() {
        setOutlineProvider(this.outlineResolver.b() != null ? v : null);
    }

    @Override // com.google.inputmethod.dw8
    public void a(float[] matrix) {
        zh7.p(matrix, this.matrixCache.b(this));
    }

    @Override // com.google.inputmethod.dw8
    public void b(Function2<? super w41, ? super GraphicsLayer, Unit> drawBlock, Function0<Unit> invalidateParentLayer) {
        this.container.addView(this);
        this.matrixCache.h();
        this.clipToBounds = false;
        this.drawnWithZ = false;
        this.mTransformOrigin = androidx.compose.ui.graphics.t.INSTANCE.a();
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
        setInvalidated(false);
    }

    @Override // com.google.inputmethod.dw8
    public long c(long point, boolean inverse) {
        return inverse ? this.matrixCache.g(this, point) : this.matrixCache.e(this, point);
    }

    @Override // com.google.inputmethod.dw8
    public void d(long size) {
        int i = (int) (size >> 32);
        int i2 = (int) (size & 4294967295L);
        if (i == getWidth() && i2 == getHeight()) {
            return;
        }
        setPivotX(androidx.compose.ui.graphics.t.f(this.mTransformOrigin) * i);
        setPivotY(androidx.compose.ui.graphics.t.g(this.mTransformOrigin) * i2);
        x();
        layout(getLeft(), getTop(), getLeft() + i, getTop() + i2);
        w();
        this.matrixCache.c();
    }

    @Override // com.google.inputmethod.dw8
    public void destroy() {
        setInvalidated(false);
        this.ownerView.j1();
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.ownerView.g1(this);
        this.container.removeViewInLayout(this);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        boolean z2;
        q51 q51Var = this.canvasHolder;
        Canvas internalCanvas = q51Var.getAndroidCanvas().getInternalCanvas();
        q51Var.getAndroidCanvas().d(canvas);
        wi androidCanvas = q51Var.getAndroidCanvas();
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z2 = false;
        } else {
            androidCanvas.v();
            this.outlineResolver.a(androidCanvas);
            z2 = true;
        }
        Function2<? super w41, ? super GraphicsLayer, Unit> function2 = this.drawBlock;
        if (function2 != null) {
            function2.invoke(androidCanvas, (Object) null);
        }
        if (z2) {
            androidCanvas.o();
        }
        q51Var.getAndroidCanvas().d(internalCanvas);
        setInvalidated(false);
    }

    @Override // com.google.inputmethod.dw8
    public void e(MutableRect rect, boolean inverse) {
        if (inverse) {
            this.matrixCache.f(this, rect);
        } else {
            this.matrixCache.d(this, rect);
        }
    }

    @Override // com.google.inputmethod.dw8
    public boolean f(long position) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (position >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & position));
        if (this.clipToBounds) {
            return 0.0f <= fIntBitsToFloat && fIntBitsToFloat < ((float) getWidth()) && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.outlineResolver.f(position);
        }
        return true;
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // com.google.inputmethod.dw8
    public void g(androidx.compose.ui.graphics.s scope) {
        Function0<Unit> function0;
        int mutatedFields = scope.getMutatedFields() | this.mutatedFields;
        if ((mutatedFields & 4096) != 0) {
            long transformOrigin = scope.getTransformOrigin();
            this.mTransformOrigin = transformOrigin;
            setPivotX(androidx.compose.ui.graphics.t.f(transformOrigin) * getWidth());
            setPivotY(androidx.compose.ui.graphics.t.g(this.mTransformOrigin) * getHeight());
        }
        if ((mutatedFields & 1) != 0) {
            setScaleX(scope.getScaleX());
        }
        if ((mutatedFields & 2) != 0) {
            setScaleY(scope.getScaleY());
        }
        if ((mutatedFields & 4) != 0) {
            setAlpha(scope.getAlpha());
        }
        if ((mutatedFields & 8) != 0) {
            setTranslationX(scope.getTranslationX());
        }
        if ((mutatedFields & 16) != 0) {
            setTranslationY(scope.getTranslationY());
        }
        if ((mutatedFields & 32) != 0) {
            setElevation(scope.getShadowElevation());
        }
        if ((mutatedFields & 1024) != 0) {
            setRotation(scope.getRotationZ());
        }
        if ((mutatedFields & 256) != 0) {
            setRotationX(scope.getRotationX());
        }
        if ((mutatedFields & 512) != 0) {
            setRotationY(scope.getRotationY());
        }
        if ((mutatedFields & 2048) != 0) {
            setCameraDistancePx(scope.getCameraDistance());
        }
        boolean z2 = false;
        boolean z3 = getManualClipPath() != null;
        boolean z4 = scope.getClip() && scope.getShape() != androidx.compose.ui.graphics.r.a();
        if ((mutatedFields & 24576) != 0) {
            this.clipToBounds = scope.getClip() && scope.getShape() == androidx.compose.ui.graphics.r.a();
            w();
            setClipToOutline(z4);
        }
        boolean zG = this.outlineResolver.g(scope.getOutline(), scope.getAlpha(), z4, scope.getShadowElevation(), scope.getSize());
        if (this.outlineResolver.c()) {
            x();
        }
        boolean z5 = getManualClipPath() != null;
        if (z3 != z5 || (z5 && zG)) {
            invalidate();
        }
        if (!this.drawnWithZ && getElevation() > 0.0f && (function0 = this.invalidateParentLayer) != null) {
            function0.invoke();
        }
        if ((mutatedFields & 7963) != 0) {
            this.matrixCache.c();
        }
        int i = Build.VERSION.SDK_INT;
        if ((mutatedFields & 64) != 0) {
            x.a.a(this, ki1.j(scope.getAmbientShadowColor()));
        }
        if ((mutatedFields & 128) != 0) {
            x.a.b(this, ki1.j(scope.getSpotShadowColor()));
        }
        if (i >= 31 && (131072 & mutatedFields) != 0) {
            y.a.a(this, scope.getRenderEffect());
        }
        boolean z6 = ((262144 & mutatedFields) == 0 && (524288 & mutatedFields) == 0) ? false : true;
        if ((mutatedFields & 32768) != 0 || z6) {
            int iC = z6 ? androidx.compose.ui.graphics.j.INSTANCE.c() : scope.getCompositingStrategy();
            androidx.compose.ui.graphics.j.Companion companion = androidx.compose.ui.graphics.j.INSTANCE;
            Paint paintF = null;
            if (androidx.compose.ui.graphics.j.e(iC, companion.c())) {
                if (z6) {
                    q09 q09VarV = v();
                    q09VarV.h(scope.getColorFilter());
                    q09VarV.e(scope.getBlendMode());
                    paintF = dm.f(q09VarV);
                }
                setLayerType(2, paintF);
            } else {
                if (androidx.compose.ui.graphics.j.e(iC, companion.b())) {
                    setLayerType(0, null);
                } else {
                    setLayerType(0, null);
                }
                this.mHasOverlappingRendering = z2;
            }
            z2 = true;
            this.mHasOverlappingRendering = z2;
        }
        this.mutatedFields = scope.getMutatedFields();
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final tg3 getContainer() {
        return this.container;
    }

    public float getFrameRate() {
        return this.frameRate;
    }

    public long getLayerId() {
        return this.layerId;
    }

    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return c.a(this.ownerView);
        }
        return -1L;
    }

    @Override // com.google.inputmethod.dw8
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo52getUnderlyingMatrixsQKQjiQ() {
        return this.matrixCache.b(this);
    }

    @Override // com.google.inputmethod.dw8
    public void h(float[] matrix) {
        float[] fArrA = this.matrixCache.a(this);
        if (fArrA != null) {
            zh7.p(matrix, fArrA);
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mHasOverlappingRendering;
    }

    @Override // com.google.inputmethod.dw8
    public void i(w41 canvas, GraphicsLayer parentLayer) {
        boolean z2 = getElevation() > 0.0f;
        this.drawnWithZ = z2;
        if (z2) {
            canvas.r();
        }
        this.container.a(canvas, this, getDrawingTime());
        if (this.drawnWithZ) {
            canvas.j();
        }
    }

    @Override // android.view.View, com.google.inputmethod.dw8
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.ownerView.invalidate();
    }

    @Override // com.google.inputmethod.dw8
    public void j(long position) {
        int iK = g16.k(position);
        if (iK != getLeft()) {
            offsetLeftAndRight(iK - getLeft());
            this.matrixCache.c();
        }
        int iL = g16.l(position);
        if (iL != getTop()) {
            offsetTopAndBottom(iL - getTop());
            this.matrixCache.c();
        }
    }

    @Override // com.google.inputmethod.dw8
    public void k() {
        if (!this.isInvalidated || z) {
            return;
        }
        INSTANCE.d(this);
        setInvalidated(false);
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int l, int t2, int r, int b) {
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }

    public void setFrameRate(float f) {
        this.frameRate = f;
    }

    public void setFrameRateFromParent(boolean z2) {
        this.isFrameRateFromParent = z2;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getIsInvalidated() {
        return this.isInvalidated;
    }
}
