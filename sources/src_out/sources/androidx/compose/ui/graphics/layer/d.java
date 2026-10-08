package androidx.compose.ui.graphics.layer;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.cj;
import com.google.inputmethod.efc;
import com.google.inputmethod.ega;
import com.google.inputmethod.ei1;
import com.google.inputmethod.f43;
import com.google.inputmethod.ki1;
import com.google.inputmethod.q16;
import com.google.inputmethod.q51;
import com.google.inputmethod.r16;
import com.google.inputmethod.rn8;
import com.google.inputmethod.ug3;
import com.google.inputmethod.vg3;
import com.google.inputmethod.w41;
import com.google.inputmethod.wi;
import com.google.inputmethod.xi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u0081\u00012\u00020\u0001:\u0001;B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0012J\u000f\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u0012J'\u0010!\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J!\u0010&\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010%\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J;\u00101\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000e0.H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u000e2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u000eH\u0016¢\u0006\u0004\b:\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001c\u0010L\u001a\n I*\u0004\u0018\u00010H0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010S\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010W\u001a\u0004\u0018\u00010T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010Z\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010\\\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010AR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010^R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010>R\u0016\u0010b\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\"\u0010d\u001a\u00020\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bc\u0010a\u001a\u0004\bd\u0010\u0018\"\u0004\b>\u0010eR\u0016\u0010g\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010aR\u0016\u0010i\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010aR\u001a\u0010l\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bj\u0010>\u001a\u0004\bk\u0010@R*\u0010p\u001a\u00020m2\u0006\u0010n\u001a\u00020m8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010^\u001a\u0004\bJ\u0010o\"\u0004\bE\u0010\u0010R.\u0010v\u001a\u0004\u0018\u00010q2\b\u0010n\u001a\u0004\u0018\u00010q8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\b;\u0010t\"\u0004\bQ\u0010uR*\u0010\r\u001a\u00020\f2\u0006\u0010n\u001a\u00020\f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b1\u0010^\u001a\u0004\bw\u0010o\"\u0004\bx\u0010\u0010R*\u0010}\u001a\u00020y2\u0006\u0010n\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b5\u0010!\u001a\u0004\bz\u0010{\"\u0004\b=\u0010|R\u0016\u0010~\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010aR.\u0010\u0083\u0001\u001a\u00020\u007f2\u0006\u0010n\u001a\u00020\u007f8\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0004\b\u001e\u0010>\u001a\u0005\b\u0080\u0001\u0010@\"\u0006\b\u0081\u0001\u0010\u0082\u0001R.\u0010\u0087\u0001\u001a\u00020y2\u0006\u0010n\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010!\u001a\u0005\b\u0085\u0001\u0010{\"\u0005\b\u0086\u0001\u0010|R-\u0010\u008a\u0001\u001a\u00020y2\u0006\u0010n\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0004\b:\u0010!\u001a\u0005\b\u0088\u0001\u0010{\"\u0005\b\u0089\u0001\u0010|R-\u0010\u008d\u0001\u001a\u00020y2\u0006\u0010n\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0005\b\u008b\u0001\u0010!\u001a\u0004\b\u001e\u0010{\"\u0005\b\u008c\u0001\u0010|R-\u0010\u0090\u0001\u001a\u00020y2\u0006\u0010n\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0005\b\u008e\u0001\u0010!\u001a\u0004\b\u001d\u0010{\"\u0005\b\u008f\u0001\u0010|R,\u0010\u0091\u0001\u001a\u00020y2\u0006\u0010n\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\bw\u0010!\u001a\u0005\b\u0084\u0001\u0010{\"\u0004\bj\u0010|R1\u0010\u0095\u0001\u001a\u00030\u0092\u00012\u0007\u0010n\u001a\u00030\u0092\u00018\u0016@VX\u0096\u000e¢\u0006\u0016\n\u0005\b\u0093\u0001\u0010>\u001a\u0005\b\u0094\u0001\u0010@\"\u0006\b\u0093\u0001\u0010\u0082\u0001R.\u0010\u0096\u0001\u001a\u00030\u0092\u00012\u0007\u0010n\u001a\u00030\u0092\u00018\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\b!\u0010>\u001a\u0004\b_\u0010@\"\u0005\b^\u0010\u0082\u0001R-\u0010\u0098\u0001\u001a\u00020y2\u0006\u0010n\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0005\b\u0086\u0001\u0010!\u001a\u0005\b\u0097\u0001\u0010{\"\u0004\bc\u0010|R-\u0010\u0099\u0001\u001a\u00020y2\u0006\u0010n\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0005\b\u0094\u0001\u0010!\u001a\u0005\b\u008e\u0001\u0010{\"\u0004\bf\u0010|R+\u0010\u009a\u0001\u001a\u00020y2\u0006\u0010n\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b^\u0010!\u001a\u0004\bN\u0010{\"\u0004\br\u0010|R5\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009b\u00012\t\u0010n\u001a\u0005\u0018\u00010\u009b\u00018\u0016@VX\u0096\u000e¢\u0006\u0016\n\u0005\b>\u0010\u009c\u0001\u001a\u0005\bU\u0010\u009d\u0001\"\u0006\b\u008b\u0001\u0010\u009e\u0001R\u001c\u0010 \u0001\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\r\n\u0005\b\u0085\u0001\u0010a\u001a\u0004\bh\u0010\u0018R%\u0010¡\u0001\u001a\u00020y2\u0006\u0010n\u001a\u00020y8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b[\u0010{\"\u0004\b`\u0010|R&\u0010£\u0001\u001a\u00020\u00162\u0006\u0010n\u001a\u00020\u00168V@VX\u0096\u000e¢\u0006\r\u001a\u0005\b¢\u0001\u0010\u0018\"\u0004\b]\u0010e¨\u0006¤\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/d;", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "Lcom/google/android/ug3;", "layerContainer", "", "ownerId", "Lcom/google/android/q51;", "canvasHolder", "Landroidx/compose/ui/graphics/drawscope/a;", "canvasDrawScope", "<init>", "(Lcom/google/android/ug3;JLcom/google/android/q51;Landroidx/compose/ui/graphics/drawscope/a;)V", "Landroidx/compose/ui/graphics/layer/a;", "compositingStrategy", "", "d", "(I)V", "W", "()V", "Landroid/graphics/Paint;", "R", "()Landroid/graphics/Paint;", "", "T", "()Z", "U", "S", "V", "", "x", "y", "Lcom/google/android/q16;", "size", "F", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "outlineSize", "t", "(Landroid/graphics/Outline;J)V", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "block", "v", "(Lcom/google/android/f43;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "Lcom/google/android/w41;", "canvas", "w", "(Lcom/google/android/w41;)V", "Landroid/graphics/Matrix;", "n", "()Landroid/graphics/Matrix;", "A", "b", "Lcom/google/android/ug3;", "c", "J", "getOwnerId", "()J", "Lcom/google/android/q51;", "getCanvasHolder", "()Lcom/google/android/q51;", "Landroidx/compose/ui/graphics/layer/h;", "e", "Landroidx/compose/ui/graphics/layer/h;", "viewLayer", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "f", "Landroid/content/res/Resources;", "resources", "Landroid/graphics/Rect;", "g", "Landroid/graphics/Rect;", "clipRect", "h", "Landroid/graphics/Paint;", "layerPaint", "Landroid/graphics/Picture;", "i", "Landroid/graphics/Picture;", "picture", "j", "Landroidx/compose/ui/graphics/drawscope/a;", "pictureDrawScope", "k", "pictureCanvasHolder", "l", "I", "m", "o", "Z", "clipBoundsInvalidated", "p", "isInvalidated", "(Z)V", "q", "outlineIsProvided", "r", "clipToBounds", "s", "getLayerId", "layerId", "Landroidx/compose/ui/graphics/e;", "value", "()I", "blendMode", "Landroidx/compose/ui/graphics/h;", "u", "Landroidx/compose/ui/graphics/h;", "()Landroidx/compose/ui/graphics/h;", "(Landroidx/compose/ui/graphics/h;)V", "colorFilter", "D", "N", "", "a", "()F", "(F)V", "alpha", "shouldManuallySetCenterPivot", "Lcom/google/android/rn8;", "getPivotOffset-F1C5BW0", "L", "(J)V", "pivotOffset", "z", "K", "G", "scaleX", "P", "M", "scaleY", "B", "setTranslationX", "translationX", "C", "setTranslationY", "translationY", "shadowElevation", "Lcom/google/android/ei1;", "E", "H", "ambientShadowColor", "spotShadowColor", "O", "rotationX", "rotationY", "rotationZ", "Lcom/google/android/ega;", "Lcom/google/android/ega;", "()Lcom/google/android/ega;", "(Lcom/google/android/ega;)V", "renderEffect", "supportsSoftwareRendering", "cameraDistance", "Q", "clip", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements GraphicsLayerImpl {
    public static final int M = 8;
    private static final boolean N = !efc.a.a();
    private static final Canvas O = new a();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private float scaleY;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private float translationX;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private float translationY;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private float shadowElevation;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private long ambientShadowColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private long spotShadowColor;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private float rotationX;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private float rotationY;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private float rotationZ;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private ega renderEffect;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final boolean supportsSoftwareRendering;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ug3 layerContainer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long ownerId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final q51 canvasHolder;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final h viewLayer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Resources resources;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Rect clipRect;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private Paint layerPaint;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Picture picture;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.drawscope.a pictureDrawScope;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final q51 pictureCanvasHolder;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int x;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int y;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private long size;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean clipBoundsInvalidated;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean isInvalidated;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean outlineIsProvided;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private boolean clipToBounds;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final long layerId;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private int blendMode;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.h colorFilter;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private int compositingStrategy;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private boolean shouldManuallySetCenterPivot;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private long pivotOffset;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private float scaleX;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/graphics/layer/d$a", "Landroid/graphics/Canvas;", "", "isHardwareAccelerated", "()Z", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends Canvas {
        a() {
        }

        @Override // android.graphics.Canvas
        public boolean isHardwareAccelerated() {
            return true;
        }
    }

    public d(ug3 ug3Var, long j, q51 q51Var, androidx.compose.ui.graphics.drawscope.a aVar) {
        this.layerContainer = ug3Var;
        this.ownerId = j;
        this.canvasHolder = q51Var;
        h hVar = new h(ug3Var, q51Var, aVar);
        this.viewLayer = hVar;
        this.resources = ug3Var.getResources();
        this.clipRect = new Rect();
        boolean z = N;
        this.picture = z ? new Picture() : null;
        this.pictureDrawScope = z ? new androidx.compose.ui.graphics.drawscope.a() : null;
        this.pictureCanvasHolder = z ? new q51() : null;
        ug3Var.addView(hVar);
        hVar.setClipBounds(null);
        this.size = q16.INSTANCE.a();
        this.isInvalidated = true;
        this.layerId = View.generateViewId();
        this.blendMode = androidx.compose.ui.graphics.e.INSTANCE.B();
        this.compositingStrategy = androidx.compose.ui.graphics.layer.a.INSTANCE.a();
        this.alpha = 1.0f;
        this.pivotOffset = rn8.INSTANCE.c();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        ei1.Companion companion = ei1.INSTANCE;
        this.ambientShadowColor = companion.a();
        this.spotShadowColor = companion.a();
        this.supportsSoftwareRendering = z;
    }

    private final Paint R() {
        Paint paint = this.layerPaint;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.layerPaint = paint2;
        return paint2;
    }

    private final void S() {
        try {
            q51 q51Var = this.canvasHolder;
            Canvas canvas = O;
            Canvas internalCanvas = q51Var.getAndroidCanvas().getInternalCanvas();
            q51Var.getAndroidCanvas().d(canvas);
            wi androidCanvas = q51Var.getAndroidCanvas();
            ug3 ug3Var = this.layerContainer;
            h hVar = this.viewLayer;
            ug3Var.a(androidCanvas, hVar, hVar.getDrawingTime());
            q51Var.getAndroidCanvas().d(internalCanvas);
        } catch (ClassCastException unused) {
        }
    }

    private final boolean T() {
        return androidx.compose.ui.graphics.layer.a.e(getCompositingStrategy(), androidx.compose.ui.graphics.layer.a.INSTANCE.c()) || U();
    }

    private final boolean U() {
        return (androidx.compose.ui.graphics.e.E(getBlendMode(), androidx.compose.ui.graphics.e.INSTANCE.B()) && getColorFilter() == null) ? false : true;
    }

    private final void V() {
        Rect rect;
        if (this.clipBoundsInvalidated) {
            h hVar = this.viewLayer;
            if (!Q() || this.outlineIsProvided) {
                rect = null;
            } else {
                rect = this.clipRect;
                rect.left = 0;
                rect.top = 0;
                rect.right = this.viewLayer.getWidth();
                rect.bottom = this.viewLayer.getHeight();
            }
            hVar.setClipBounds(rect);
        }
    }

    private final void W() {
        if (T()) {
            d(androidx.compose.ui.graphics.layer.a.INSTANCE.c());
        } else {
            d(getCompositingStrategy());
        }
    }

    private final void d(int compositingStrategy) {
        h hVar = this.viewLayer;
        androidx.compose.ui.graphics.layer.a.Companion companion = androidx.compose.ui.graphics.layer.a.INSTANCE;
        boolean z = true;
        if (androidx.compose.ui.graphics.layer.a.e(compositingStrategy, companion.c())) {
            this.viewLayer.setLayerType(2, this.layerPaint);
        } else if (androidx.compose.ui.graphics.layer.a.e(compositingStrategy, companion.b())) {
            this.viewLayer.setLayerType(0, this.layerPaint);
            z = false;
        } else {
            this.viewLayer.setLayerType(0, this.layerPaint);
        }
        hVar.setCanUseCompositingLayer$ui_graphics(z);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void A() {
        this.layerContainer.removeViewInLayout(this.viewLayer);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void B(ega egaVar) {
        this.renderEffect = egaVar;
        if (Build.VERSION.SDK_INT >= 31) {
            j.a.a(this.viewLayer, egaVar);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: C, reason: from getter */
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: D, reason: from getter */
    public int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void E(long j) {
        this.ambientShadowColor = j;
        i.a.b(this.viewLayer, ki1.j(j));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void F(int x, int y, long size) {
        if (q16.f(this.size, size)) {
            int i = this.x;
            if (i != x) {
                this.viewLayer.offsetLeftAndRight(x - i);
            }
            int i2 = this.y;
            if (i2 != y) {
                this.viewLayer.offsetTopAndBottom(y - i2);
            }
        } else {
            if (Q()) {
                this.clipBoundsInvalidated = true;
            }
            int i3 = (int) (size >> 32);
            int i4 = (int) (4294967295L & size);
            this.viewLayer.layout(x, y, x + i3, y + i4);
            this.size = size;
            if (this.shouldManuallySetCenterPivot) {
                this.viewLayer.setPivotX(i3 / 2.0f);
                this.viewLayer.setPivotY(i4 / 2.0f);
            }
        }
        this.x = x;
        this.y = y;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void G(float f) {
        this.scaleX = f;
        this.viewLayer.setScaleX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: H, reason: from getter */
    public long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void I(long j) {
        this.spotShadowColor = j;
        i.a.c(this.viewLayer, ki1.j(j));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void J(boolean z) {
        this.isInvalidated = z;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: K, reason: from getter */
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void L(long j) {
        this.pivotOffset = j;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            i.a.a(this.viewLayer);
            return;
        }
        this.shouldManuallySetCenterPivot = false;
        this.viewLayer.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
        this.viewLayer.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void M(float f) {
        this.scaleY = f;
        this.viewLayer.setScaleY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void N(int i) {
        this.compositingStrategy = i;
        W();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: O, reason: from getter */
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: P, reason: from getter */
    public float getScaleY() {
        return this.scaleY;
    }

    public boolean Q() {
        return this.clipToBounds || this.viewLayer.getClipToOutline();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: a, reason: from getter */
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: b, reason: from getter */
    public androidx.compose.ui.graphics.h getColorFilter() {
        return this.colorFilter;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void c(float f) {
        this.alpha = f;
        this.viewLayer.setAlpha(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void e(int i) {
        this.blendMode = i;
        R().setXfermode(new PorterDuffXfermode(androidx.compose.ui.graphics.a.b(i)));
        W();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: f, reason: from getter */
    public int getBlendMode() {
        return this.blendMode;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: g, reason: from getter */
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void h(androidx.compose.ui.graphics.h hVar) {
        this.colorFilter = hVar;
        R().setColorFilter(hVar != null ? cj.d(hVar) : null);
        W();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: i, reason: from getter */
    public ega getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: k */
    public float getCameraDistance() {
        return this.viewLayer.getCameraDistance() / this.resources.getDisplayMetrics().densityDpi;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void l(boolean z) {
        boolean z2 = false;
        this.clipToBounds = z && !this.outlineIsProvided;
        this.clipBoundsInvalidated = true;
        h hVar = this.viewLayer;
        if (z && this.outlineIsProvided) {
            z2 = true;
        }
        hVar.setClipToOutline(z2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: m, reason: from getter */
    public long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public Matrix n() {
        return this.viewLayer.getMatrix();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void o(float f) {
        this.viewLayer.setCameraDistance(f * this.resources.getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void p(float f) {
        this.rotationX = f;
        this.viewLayer.setRotationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void q(float f) {
        this.rotationY = f;
        this.viewLayer.setRotationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: r, reason: from getter */
    public boolean getSupportsSoftwareRendering() {
        return this.supportsSoftwareRendering;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void s(float f) {
        this.shadowElevation = f;
        this.viewLayer.setElevation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationX(float f) {
        this.translationX = f;
        this.viewLayer.setTranslationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationY(float f) {
        this.translationY = f;
        this.viewLayer.setTranslationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void t(Outline outline, long outlineSize) {
        boolean zD = this.viewLayer.d(outline);
        if (Q() && outline != null) {
            this.viewLayer.setClipToOutline(true);
            if (this.clipToBounds) {
                this.clipToBounds = false;
                this.clipBoundsInvalidated = true;
            }
        }
        this.outlineIsProvided = outline != null;
        if (zD) {
            return;
        }
        this.viewLayer.invalidate();
        S();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void u(float f) {
        this.rotationZ = f;
        this.viewLayer.setRotation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void v(f43 density, LayoutDirection layoutDirection, GraphicsLayer layer, Function1<? super DrawScope, Unit> block) {
        if (this.viewLayer.getParent() == null) {
            this.layerContainer.addView(this.viewLayer);
        }
        this.viewLayer.c(density, layoutDirection, layer, block);
        if (this.viewLayer.isAttachedToWindow()) {
            this.viewLayer.setVisibility(4);
            this.viewLayer.setVisibility(0);
            S();
            Picture picture = this.picture;
            if (picture != null) {
                long j = this.size;
                Canvas canvasBeginRecording = picture.beginRecording((int) (j >> 32), (int) (j & 4294967295L));
                try {
                    q51 q51Var = this.pictureCanvasHolder;
                    if (q51Var != null) {
                        Canvas internalCanvas = q51Var.getAndroidCanvas().getInternalCanvas();
                        q51Var.getAndroidCanvas().d(canvasBeginRecording);
                        wi androidCanvas = q51Var.getAndroidCanvas();
                        androidx.compose.ui.graphics.drawscope.a aVar = this.pictureDrawScope;
                        if (aVar != null) {
                            long jE = r16.e(this.size);
                            f43 density2 = aVar.getDrawContext().getDensity();
                            LayoutDirection layoutDirection2 = aVar.getDrawContext().getLayoutDirection();
                            w41 w41VarB = aVar.getDrawContext().b();
                            long jD = aVar.getDrawContext().d();
                            GraphicsLayer graphicsLayer = aVar.getDrawContext().getGraphicsLayer();
                            vg3 drawContext = aVar.getDrawContext();
                            drawContext.e(density);
                            drawContext.a(layoutDirection);
                            drawContext.i(androidCanvas);
                            drawContext.c(jE);
                            drawContext.h(layer);
                            androidCanvas.v();
                            try {
                                block.invoke(aVar);
                                androidCanvas.o();
                                vg3 drawContext2 = aVar.getDrawContext();
                                drawContext2.e(density2);
                                drawContext2.a(layoutDirection2);
                                drawContext2.i(w41VarB);
                                drawContext2.c(jD);
                                drawContext2.h(graphicsLayer);
                            } catch (Throwable th) {
                                androidCanvas.o();
                                vg3 drawContext3 = aVar.getDrawContext();
                                drawContext3.e(density2);
                                drawContext3.a(layoutDirection2);
                                drawContext3.i(w41VarB);
                                drawContext3.c(jD);
                                drawContext3.h(graphicsLayer);
                                throw th;
                            }
                        }
                        q51Var.getAndroidCanvas().d(internalCanvas);
                        Unit unit = Unit.a;
                    }
                    picture.endRecording();
                } catch (Throwable th2) {
                    picture.endRecording();
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void w(w41 canvas) {
        V();
        Canvas canvasD = xi.d(canvas);
        if (canvasD.isHardwareAccelerated()) {
            ug3 ug3Var = this.layerContainer;
            h hVar = this.viewLayer;
            ug3Var.a(canvas, hVar, hVar.getDrawingTime());
        } else {
            Picture picture = this.picture;
            if (picture != null) {
                canvasD.drawPicture(picture);
            }
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: x, reason: from getter */
    public float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: y, reason: from getter */
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: z, reason: from getter */
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    public /* synthetic */ d(ug3 ug3Var, long j, q51 q51Var, androidx.compose.ui.graphics.drawscope.a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ug3Var, j, (i & 4) != 0 ? new q51() : q51Var, (i & 8) != 0 ? new androidx.compose.ui.graphics.drawscope.a() : aVar);
    }
}
