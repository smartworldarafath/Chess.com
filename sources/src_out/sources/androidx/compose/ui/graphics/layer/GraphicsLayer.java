package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.n;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.aa2;
import com.google.inputmethod.cn6;
import com.google.inputmethod.dm;
import com.google.inputmethod.dn6;
import com.google.inputmethod.ega;
import com.google.inputmethod.ei1;
import com.google.inputmethod.en6;
import com.google.inputmethod.eqa;
import com.google.inputmethod.f43;
import com.google.inputmethod.g16;
import com.google.inputmethod.gba;
import com.google.inputmethod.gf1;
import com.google.inputmethod.l4b;
import com.google.inputmethod.pu8;
import com.google.inputmethod.q09;
import com.google.inputmethod.q16;
import com.google.inputmethod.r16;
import com.google.inputmethod.rn8;
import com.google.inputmethod.ta1;
import com.google.inputmethod.tsb;
import com.google.inputmethod.vg3;
import com.google.inputmethod.w41;
import com.google.inputmethod.wg3;
import com.google.inputmethod.xi;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u0099\u00012\u00020\u0001:\u0001AB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\n*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u000eJ\u000f\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u000eJ\u000f\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u000eJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010\u000eJ\u0019\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\nH\u0002¢\u0006\u0004\b'\u0010\u000eJ\u000f\u0010(\u001a\u00020\nH\u0002¢\u0006\u0004\b(\u0010\u000eJ9\u0010/\u001a\u00020\n2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0-¢\u0006\u0004\b/\u00100J!\u00104\u001a\u00020\n2\u0006\u00102\u001a\u0002012\b\u00103\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\nH\u0000¢\u0006\u0004\b6\u0010\u000eJ\u000f\u00107\u001a\u00020\nH\u0000¢\u0006\u0004\b7\u0010\u000eJ\u0015\u00108\u001a\u00020\n2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b8\u00109J+\u0010>\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020:2\b\b\u0002\u0010\t\u001a\u00020;2\b\b\u0002\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?J!\u0010@\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020:2\b\b\u0002\u0010\t\u001a\u00020;¢\u0006\u0004\b@\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\"\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010IR \u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010IR\u0018\u0010M\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010LR\u0016\u0010O\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010>R\u0016\u0010P\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010(R\u0016\u0010Q\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010(R\u0016\u0010S\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010/R\u0018\u0010W\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010Z\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010\\\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010YR\u0016\u0010^\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010>R\u0018\u0010b\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010f\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010i\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u00106R\u0014\u0010m\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR$\u0010r\u001a\u00020N2\u0006\u0010n\u001a\u00020N8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bo\u0010>\u001a\u0004\bp\u0010qR*\u0010\u0007\u001a\u00020\u00062\u0006\u0010n\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010(\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR*\u0010\t\u001a\u00020\b2\u0006\u0010n\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010(\u001a\u0004\by\u0010u\"\u0004\bz\u0010wR*\u0010}\u001a\u00020:2\u0006\u0010n\u001a\u00020:8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b{\u0010(\u001a\u0004\bd\u0010u\"\u0004\b|\u0010wR2\u0010\u0081\u0001\u001a\u00020N2\u0006\u0010n\u001a\u00020N8\u0006@FX\u0086\u000e¢\u0006\u0019\n\u0004\by\u0010>\u0012\u0005\b\u0080\u0001\u0010\u000e\u001a\u0004\bX\u0010q\"\u0004\b~\u0010\u007fR\u001a\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bt\u0010\u0082\u0001R*\u0010\u0088\u0001\u001a\u00030\u0084\u00012\u0007\u0010n\u001a\u00030\u0084\u00018F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b]\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R(\u0010\u008c\u0001\u001a\u00020<2\u0006\u0010n\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bR\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R*\u0010\u008f\u0001\u001a\u00030\u008d\u00012\u0007\u0010n\u001a\u00030\u008d\u00018F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bU\u0010\u0085\u0001\"\u0006\b\u008e\u0001\u0010\u0087\u0001R.\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0090\u00012\t\u0010n\u001a\u0005\u0018\u00010\u0090\u00018F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b[\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R(\u0010\u0096\u0001\u001a\u00020<2\u0006\u0010n\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bs\u0010\u0089\u0001\"\u0006\b\u0095\u0001\u0010\u008b\u0001R(\u0010\u0098\u0001\u001a\u00020<2\u0006\u0010n\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bx\u0010\u0089\u0001\"\u0006\b\u0097\u0001\u0010\u008b\u0001R)\u0010\u009b\u0001\u001a\u00020<2\u0006\u0010n\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0099\u0001\u0010\u0089\u0001\"\u0006\b\u009a\u0001\u0010\u008b\u0001R)\u0010\u009e\u0001\u001a\u00020<2\u0006\u0010n\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009c\u0001\u0010\u0089\u0001\"\u0006\b\u009d\u0001\u0010\u008b\u0001R(\u0010 \u0001\u001a\u00020<2\u0006\u0010n\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b{\u0010\u0089\u0001\"\u0006\b\u009f\u0001\u0010\u008b\u0001R(\u0010¢\u0001\u001a\u00020<2\u0006\u0010n\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bh\u0010\u0089\u0001\"\u0006\b¡\u0001\u0010\u008b\u0001R(\u0010¤\u0001\u001a\u00020<2\u0006\u0010n\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bk\u0010\u0089\u0001\"\u0006\b£\u0001\u0010\u008b\u0001R(\u0010¦\u0001\u001a\u00020<2\u0006\u0010n\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bo\u0010\u0089\u0001\"\u0006\b¥\u0001\u0010\u008b\u0001R)\u0010©\u0001\u001a\u00020<2\u0006\u0010n\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b§\u0001\u0010\u0089\u0001\"\u0006\b¨\u0001\u0010\u008b\u0001R/\u0010¯\u0001\u001a\u0005\u0018\u00010ª\u00012\t\u0010n\u001a\u0005\u0018\u00010ª\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R\u0013\u0010±\u0001\u001a\u00020T8F¢\u0006\u0007\u001a\u0005\b`\u0010°\u0001R)\u0010µ\u0001\u001a\u00030²\u00012\u0007\u0010n\u001a\u00030²\u00018F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b³\u0001\u0010u\"\u0005\b´\u0001\u0010wR)\u0010¸\u0001\u001a\u00030²\u00012\u0007\u0010n\u001a\u00030²\u00018F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¶\u0001\u0010u\"\u0005\b·\u0001\u0010w¨\u0006¹\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "impl", "<init>", "(Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;)V", "Lcom/google/android/g16;", "topLeft", "Lcom/google/android/q16;", "size", "", "T", "(JJ)V", "G", "()V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "i", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "graphicsLayer", "d", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroid/graphics/Canvas;", "androidCanvas", "i0", "(Landroid/graphics/Canvas;)V", "H", "D", "E", "Landroid/graphics/RectF;", "C", "()Landroid/graphics/RectF;", "e", "Landroidx/compose/ui/graphics/Path;", "path", "Landroid/graphics/Outline;", "j0", "(Landroidx/compose/ui/graphics/Path;)Landroid/graphics/Outline;", "B", "()Landroid/graphics/Outline;", "f", "J", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lkotlin/Function1;", "block", "F", "(Lcom/google/android/f43;Landroidx/compose/ui/unit/LayoutDirection;JLkotlin/jvm/functions/Function1;)V", "Lcom/google/android/w41;", "canvas", "parentLayer", "h", "(Lcom/google/android/w41;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "I", "g", "R", "(Landroidx/compose/ui/graphics/Path;)V", "Lcom/google/android/rn8;", "Lcom/google/android/tsb;", "", "cornerRadius", "Z", "(JJF)V", "U", "a", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "getImpl$ui_graphics", "()Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "b", "Lcom/google/android/f43;", "c", "Landroidx/compose/ui/unit/LayoutDirection;", "Lkotlin/jvm/functions/Function1;", "drawBlock", "clipDrawBlock", "Landroid/graphics/Outline;", "androidOutline", "", "outlineDirty", "roundRectOutlineTopLeft", "roundRectOutlineSize", "j", "roundRectCornerRadius", "Landroidx/compose/ui/graphics/n;", "k", "Landroidx/compose/ui/graphics/n;", "internalOutline", "l", "Landroidx/compose/ui/graphics/Path;", "outlinePath", "m", "roundRectClipPath", "n", "usePathForClip", "Landroidx/compose/ui/graphics/drawscope/a;", "o", "Landroidx/compose/ui/graphics/drawscope/a;", "softwareDrawScope", "Lcom/google/android/q09;", "p", "Lcom/google/android/q09;", "softwareLayerPaint", "", "q", "parentLayerUsages", "Lcom/google/android/ta1;", "r", "Lcom/google/android/ta1;", "childDependenciesTracker", "value", "s", "A", "()Z", "isReleased", "t", "x", "()J", "f0", "(J)V", "u", "w", "d0", "v", "S", "pivotOffset", "O", "(Z)V", "getClip$annotations", "clip", "Landroid/graphics/RectF;", "pathBounds", "Landroidx/compose/ui/graphics/layer/a;", "()I", "Q", "(I)V", "compositingStrategy", "()F", "K", "(F)V", "alpha", "Landroidx/compose/ui/graphics/e;", "M", "blendMode", "Landroidx/compose/ui/graphics/h;", "()Landroidx/compose/ui/graphics/h;", "P", "(Landroidx/compose/ui/graphics/h;)V", "colorFilter", "a0", "scaleX", "b0", "scaleY", "y", "g0", "translationX", "z", "h0", "translationY", "c0", "shadowElevation", "W", "rotationX", "X", "rotationY", "Y", "rotationZ", "getCameraDistance", "N", "cameraDistance", "Lcom/google/android/ega;", "getRenderEffect", "()Lcom/google/android/ega;", "V", "(Lcom/google/android/ega;)V", "renderEffect", "()Landroidx/compose/ui/graphics/n;", "outline", "Lcom/google/android/ei1;", "getAmbientShadowColor-0d7_KjU", "L", "ambientShadowColor", "getSpotShadowColor-0d7_KjU", "e0", "spotShadowColor", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GraphicsLayer {
    private static final boolean A;
    private static final cn6 B;
    public static final int z = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final GraphicsLayerImpl impl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Outline androidOutline;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long roundRectOutlineTopLeft;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private long roundRectOutlineSize;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private float roundRectCornerRadius;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private n internalOutline;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private Path outlinePath;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private Path roundRectClipPath;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean usePathForClip;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.drawscope.a softwareDrawScope;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private q09 softwareLayerPaint;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private int parentLayerUsages;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final ta1 childDependenciesTracker;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean isReleased;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private long topLeft;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private long size;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private long pivotOffset;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private boolean clip;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private RectF pathBounds;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private f43 density = wg3.a();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Function1<? super DrawScope, Unit> drawBlock = new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$drawBlock$1
        public final void a(DrawScope drawScope) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DrawScope) obj);
            return Unit.a;
        }
    };

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Function1<DrawScope, Unit> clipDrawBlock = new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$clipDrawBlock$1
        {
            super(1);
        }

        public final void a(DrawScope drawScope) {
            Path path = this.this$0.outlinePath;
            if (!this.this$0.usePathForClip || !this.this$0.getClip() || path == null) {
                this.this$0.i(drawScope);
                return;
            }
            GraphicsLayer graphicsLayer = this.this$0;
            int iB = gf1.INSTANCE.b();
            vg3 drawContext = drawScope.getDrawContext();
            long jD = drawContext.d();
            drawContext.b().v();
            try {
                drawContext.getTransform().e(path, iB);
                graphicsLayer.i(drawScope);
            } finally {
                drawContext.b().o();
                drawContext.c(jD);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DrawScope) obj);
            return Unit.a;
        }
    };

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean outlineDirty = true;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        boolean zE = Intrinsics.e(lowerCase, "robolectric");
        A = zE;
        B = zE ? dn6.a : en6.a;
    }

    public GraphicsLayer(GraphicsLayerImpl graphicsLayerImpl) {
        this.impl = graphicsLayerImpl;
        rn8.Companion companion = rn8.INSTANCE;
        this.roundRectOutlineTopLeft = companion.c();
        this.roundRectOutlineSize = tsb.INSTANCE.a();
        this.childDependenciesTracker = new ta1();
        graphicsLayerImpl.l(false);
        this.topLeft = g16.INSTANCE.b();
        this.size = q16.INSTANCE.a();
        this.pivotOffset = companion.b();
    }

    private final Outline B() {
        Outline outline = this.androidOutline;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.androidOutline = outline2;
        return outline2;
    }

    private final RectF C() {
        RectF rectF = this.pathBounds;
        if (rectF != null) {
            return rectF;
        }
        RectF rectF2 = new RectF();
        this.pathBounds = rectF2;
        return rectF2;
    }

    private final void D() {
        this.parentLayerUsages++;
    }

    private final void E() {
        this.parentLayerUsages--;
        f();
    }

    private final void G() {
        this.impl.v(this.density, this.layoutDirection, this, this.clipDrawBlock);
    }

    private final void H() {
        if (this.impl.j()) {
            return;
        }
        try {
            G();
        } catch (Throwable unused) {
        }
    }

    private final void J() {
        this.internalOutline = null;
        this.outlinePath = null;
        this.roundRectOutlineSize = tsb.INSTANCE.a();
        this.roundRectOutlineTopLeft = rn8.INSTANCE.c();
        this.roundRectCornerRadius = 0.0f;
        this.outlineDirty = true;
        this.usePathForClip = false;
    }

    private final void T(long topLeft, long size) {
        this.impl.F(g16.k(topLeft), g16.l(topLeft), size);
    }

    private final void d(GraphicsLayer graphicsLayer) {
        if (this.childDependenciesTracker.i(graphicsLayer)) {
            graphicsLayer.D();
        }
    }

    private final void d0(long j) {
        if (q16.f(this.size, j)) {
            return;
        }
        this.size = j;
        T(this.topLeft, j);
        if (this.roundRectOutlineSize == 9205357640488583168L) {
            this.outlineDirty = true;
            e();
        }
    }

    private final void e() {
        if (this.outlineDirty) {
            Outline outline = null;
            if (this.clip || v() > 0.0f) {
                Path path = this.outlinePath;
                if (path != null) {
                    RectF rectFC = C();
                    if (!(path instanceof androidx.compose.ui.graphics.c)) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((androidx.compose.ui.graphics.c) path).getInternalPath().computeBounds(rectFC, false);
                    Outline outlineJ0 = j0(path);
                    if (outlineJ0 != null) {
                        outlineJ0.setAlpha(j());
                        outline = outlineJ0;
                    }
                    this.impl.t(outline, q16.c((4294967295L & ((long) Math.round(rectFC.height()))) | (((long) Math.round(rectFC.width())) << 32)));
                    if (this.usePathForClip && this.clip) {
                        this.impl.l(false);
                        this.impl.A();
                    } else {
                        this.impl.l(this.clip);
                    }
                } else {
                    this.impl.l(this.clip);
                    tsb.INSTANCE.b();
                    Outline outlineB = B();
                    long jE = r16.e(this.size);
                    long j = this.roundRectOutlineTopLeft;
                    long j2 = this.roundRectOutlineSize;
                    long j3 = j2 == 9205357640488583168L ? jE : j2;
                    int i = (int) (j >> 32);
                    int i2 = (int) (j & 4294967295L);
                    outlineB.setRoundRect(Math.round(Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j3 >> 32))), Math.round(Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j3 & 4294967295L))), this.roundRectCornerRadius);
                    outlineB.setAlpha(j());
                    this.impl.t(outlineB, r16.c(j3));
                }
            } else {
                this.impl.l(false);
                this.impl.t(null, q16.INSTANCE.a());
            }
        }
        this.outlineDirty = false;
    }

    private final void f() {
        if (this.isReleased && this.parentLayerUsages == 0) {
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x008b A[LOOP:0: B:20:0x0054->B:30:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x008e A[EDGE_INSN: B:34:0x008e->B:31:0x008e BREAK  A[LOOP:0: B:20:0x0054->B:30:0x008b], SYNTHETIC] */
    public final void i(DrawScope drawScope) {
        ta1 ta1Var = this.childDependenciesTracker;
        ta1Var.oldDependency = ta1Var.dependency;
        androidx.collection.d dVar = ta1Var.dependenciesSet;
        if (dVar != null && dVar.e()) {
            androidx.collection.d dVarB = ta1Var.oldDependenciesSet;
            if (dVarB == null) {
                dVarB = l4b.b();
                ta1Var.oldDependenciesSet = dVarB;
            }
            dVarB.i(dVar);
            dVar.m();
        }
        ta1Var.trackingInProgress = true;
        this.drawBlock.invoke(drawScope);
        ta1Var.trackingInProgress = false;
        GraphicsLayer graphicsLayer = ta1Var.oldDependency;
        if (graphicsLayer != null) {
            graphicsLayer.E();
        }
        androidx.collection.d dVar2 = ta1Var.oldDependenciesSet;
        if (dVar2 == null || !dVar2.e()) {
            return;
        }
        Object[] objArr = dVar2.elements;
        long[] jArr = dVar2.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ((GraphicsLayer) objArr[(i << 3) + i3]).E();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        dVar2.m();
    }

    private final void i0(Canvas androidCanvas) {
        Canvas canvas;
        float fK = g16.k(this.topLeft);
        float fL = g16.l(this.topLeft);
        float fK2 = g16.k(this.topLeft) + ((int) (this.size >> 32));
        float fL2 = g16.l(this.topLeft) + ((int) (this.size & 4294967295L));
        float fJ = j();
        androidx.compose.ui.graphics.h hVarM = m();
        int iK = k();
        if (fJ < 1.0f || !androidx.compose.ui.graphics.e.E(iK, androidx.compose.ui.graphics.e.INSTANCE.B()) || hVarM != null || a.e(n(), a.INSTANCE.c())) {
            q09 q09VarA = this.softwareLayerPaint;
            if (q09VarA == null) {
                q09VarA = dm.a();
                this.softwareLayerPaint = q09VarA;
            }
            q09VarA.c(fJ);
            q09VarA.e(iK);
            q09VarA.h(hVarM);
            canvas = androidCanvas;
            canvas.saveLayer(fK, fL, fK2, fL2, dm.f(q09VarA));
        } else {
            androidCanvas.save();
            canvas = androidCanvas;
        }
        canvas.translate(fK, fL);
        canvas.concat(this.impl.n());
    }

    private final Outline j0(Path path) {
        Outline outline;
        int i = Build.VERSION.SDK_INT;
        if (i > 28 || path.q()) {
            Outline outlineB = B();
            if (i >= 30) {
                pu8.a.a(outlineB, path);
            } else {
                if (!(path instanceof androidx.compose.ui.graphics.c)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outlineB.setConvexPath(((androidx.compose.ui.graphics.c) path).getInternalPath());
            }
            this.usePathForClip = !outlineB.canClip();
            outline = outlineB;
        } else {
            Outline outline2 = this.androidOutline;
            if (outline2 != null) {
                outline2.setEmpty();
            }
            this.usePathForClip = true;
            this.impl.J(true);
            outline = null;
        }
        this.outlinePath = path;
        return outline;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final boolean getIsReleased() {
        return this.isReleased;
    }

    public final void F(f43 density, LayoutDirection layoutDirection, long size, Function1<? super DrawScope, Unit> block) {
        d0(size);
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = block;
        this.impl.J(true);
        G();
    }

    public final void I() {
        if (this.isReleased) {
            return;
        }
        this.isReleased = true;
        f();
    }

    public final void K(float f) {
        if (this.impl.getAlpha() == f) {
            return;
        }
        this.impl.c(f);
    }

    public final void L(long j) {
        if (ei1.r(j, this.impl.getAmbientShadowColor())) {
            return;
        }
        this.impl.E(j);
    }

    public final void M(int i) {
        if (androidx.compose.ui.graphics.e.E(this.impl.getBlendMode(), i)) {
            return;
        }
        this.impl.e(i);
    }

    public final void N(float f) {
        if (this.impl.getCameraDistance() == f) {
            return;
        }
        this.impl.o(f);
    }

    public final void O(boolean z2) {
        if (this.clip != z2) {
            this.clip = z2;
            this.outlineDirty = true;
            e();
        }
    }

    public final void P(androidx.compose.ui.graphics.h hVar) {
        if (Intrinsics.e(this.impl.getColorFilter(), hVar)) {
            return;
        }
        this.impl.h(hVar);
    }

    public final void Q(int i) {
        if (a.e(this.impl.getCompositingStrategy(), i)) {
            return;
        }
        this.impl.N(i);
    }

    public final void R(Path path) {
        J();
        this.outlinePath = path;
        e();
    }

    public final void S(long j) {
        if (rn8.j(this.pivotOffset, j)) {
            return;
        }
        this.pivotOffset = j;
        this.impl.L(j);
    }

    public final void U(long topLeft, long size) {
        Z(topLeft, size, 0.0f);
    }

    public final void V(ega egaVar) {
        if (Intrinsics.e(this.impl.getRenderEffect(), egaVar)) {
            return;
        }
        this.impl.B(egaVar);
    }

    public final void W(float f) {
        if (this.impl.getRotationX() == f) {
            return;
        }
        this.impl.p(f);
    }

    public final void X(float f) {
        if (this.impl.getRotationY() == f) {
            return;
        }
        this.impl.q(f);
    }

    public final void Y(float f) {
        if (this.impl.getRotationZ() == f) {
            return;
        }
        this.impl.u(f);
    }

    public final void Z(long topLeft, long size, float cornerRadius) {
        if (rn8.j(this.roundRectOutlineTopLeft, topLeft) && tsb.h(this.roundRectOutlineSize, size) && this.roundRectCornerRadius == cornerRadius && this.outlinePath == null) {
            return;
        }
        J();
        this.roundRectOutlineTopLeft = topLeft;
        this.roundRectOutlineSize = size;
        this.roundRectCornerRadius = cornerRadius;
        e();
    }

    public final void a0(float f) {
        if (this.impl.getScaleX() == f) {
            return;
        }
        this.impl.G(f);
    }

    public final void b0(float f) {
        if (this.impl.getScaleY() == f) {
            return;
        }
        this.impl.M(f);
    }

    public final void c0(float f) {
        if (this.impl.getShadowElevation() == f) {
            return;
        }
        this.impl.s(f);
        this.outlineDirty = true;
        e();
    }

    public final void e0(long j) {
        if (ei1.r(j, this.impl.getSpotShadowColor())) {
            return;
        }
        this.impl.I(j);
    }

    public final void f0(long j) {
        if (g16.j(this.topLeft, j)) {
            return;
        }
        this.topLeft = j;
        T(j, this.size);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0057 A[LOOP:0: B:10:0x0020->B:20:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x005a A[EDGE_INSN: B:25:0x005a->B:21:0x005a BREAK  A[LOOP:0: B:10:0x0020->B:20:0x0057], SYNTHETIC] */
    public final void g() {
        ta1 ta1Var = this.childDependenciesTracker;
        GraphicsLayer graphicsLayer = ta1Var.dependency;
        if (graphicsLayer != null) {
            graphicsLayer.E();
            ta1Var.dependency = null;
        }
        androidx.collection.d dVar = ta1Var.dependenciesSet;
        if (dVar != null) {
            Object[] objArr = dVar.elements;
            long[] jArr = dVar.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                ((GraphicsLayer) objArr[(i << 3) + i3]).E();
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            dVar.m();
        }
        this.impl.A();
    }

    public final void g0(float f) {
        if (this.impl.getTranslationX() == f) {
            return;
        }
        this.impl.setTranslationX(f);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void h(w41 canvas, GraphicsLayer parentLayer) throws NoWhenBranchMatchedException {
        if (this.isReleased) {
            return;
        }
        e();
        H();
        boolean z2 = v() > 0.0f;
        if (z2) {
            canvas.r();
        }
        Canvas canvasD = xi.d(canvas);
        boolean zIsHardwareAccelerated = canvasD.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            i0(canvasD);
        }
        boolean z3 = !zIsHardwareAccelerated && this.clip;
        if (z3) {
            canvas.v();
            n nVarO = o();
            if (nVarO instanceof n.b) {
                w41.n(canvas, ((n.b) nVarO).getRect(), 0, 2, null);
            } else if (nVarO instanceof n.c) {
                Path pathA = this.roundRectClipPath;
                if (pathA != null) {
                    pathA.rewind();
                } else {
                    pathA = androidx.compose.ui.graphics.d.a();
                    this.roundRectClipPath = pathA;
                }
                Path.p(pathA, ((n.c) nVarO).getRoundRect(), null, 2, null);
                w41.k(canvas, pathA, 0, 2, null);
            } else {
                if (!(nVarO instanceof n.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                w41.k(canvas, ((n.a) nVarO).getPath(), 0, 2, null);
            }
        }
        if (parentLayer != null) {
            parentLayer.d(this);
        }
        if (xi.d(canvas).isHardwareAccelerated() || this.impl.getSupportsSoftwareRendering()) {
            this.impl.w(canvas);
        } else {
            androidx.compose.ui.graphics.drawscope.a aVar = this.softwareDrawScope;
            if (aVar == null) {
                aVar = new androidx.compose.ui.graphics.drawscope.a();
                this.softwareDrawScope = aVar;
            }
            DrawScope drawScope = aVar;
            f43 f43Var = this.density;
            LayoutDirection layoutDirection = this.layoutDirection;
            long jE = r16.e(this.size);
            f43 density = drawScope.getDrawContext().getDensity();
            LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
            w41 w41VarB = drawScope.getDrawContext().b();
            long jD = drawScope.getDrawContext().d();
            GraphicsLayer graphicsLayer = drawScope.getDrawContext().getGraphicsLayer();
            vg3 drawContext = drawScope.getDrawContext();
            drawContext.e(f43Var);
            drawContext.a(layoutDirection);
            drawContext.i(canvas);
            drawContext.c(jE);
            drawContext.h(this);
            canvas.v();
            try {
                i(drawScope);
                canvas.o();
                vg3 drawContext2 = drawScope.getDrawContext();
                drawContext2.e(density);
                drawContext2.a(layoutDirection2);
                drawContext2.i(w41VarB);
                drawContext2.c(jD);
                drawContext2.h(graphicsLayer);
            } catch (Throwable th) {
                canvas.o();
                vg3 drawContext3 = drawScope.getDrawContext();
                drawContext3.e(density);
                drawContext3.a(layoutDirection2);
                drawContext3.i(w41VarB);
                drawContext3.c(jD);
                drawContext3.h(graphicsLayer);
                throw th;
            }
        }
        if (z3) {
            canvas.o();
        }
        if (z2) {
            canvas.j();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvasD.restore();
    }

    public final void h0(float f) {
        if (this.impl.getTranslationY() == f) {
            return;
        }
        this.impl.setTranslationY(f);
    }

    public final float j() {
        return this.impl.getAlpha();
    }

    public final int k() {
        return this.impl.getBlendMode();
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    public final androidx.compose.ui.graphics.h m() {
        return this.impl.getColorFilter();
    }

    public final int n() {
        return this.impl.getCompositingStrategy();
    }

    public final n o() {
        n bVar;
        n nVar = this.internalOutline;
        Path path = this.outlinePath;
        if (nVar != null) {
            return nVar;
        }
        if (path != null) {
            n.a aVar = new n.a(path);
            this.internalOutline = aVar;
            return aVar;
        }
        long jE = r16.e(this.size);
        long j = this.roundRectOutlineTopLeft;
        long j2 = this.roundRectOutlineSize;
        if (j2 != 9205357640488583168L) {
            jE = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jE >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = fIntBitsToFloat2 + Float.intBitsToFloat((int) (jE & 4294967295L));
        float f = this.roundRectCornerRadius;
        if (f > 0.0f) {
            bVar = new n.c(eqa.d(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, aa2.b((((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f))))));
        } else {
            bVar = new n.b(new gba(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.internalOutline = bVar;
        return bVar;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final long getPivotOffset() {
        return this.pivotOffset;
    }

    public final float q() {
        return this.impl.getRotationX();
    }

    public final float r() {
        return this.impl.getRotationY();
    }

    public final float s() {
        return this.impl.getRotationZ();
    }

    public final float t() {
        return this.impl.getScaleX();
    }

    public final float u() {
        return this.impl.getScaleY();
    }

    public final float v() {
        return this.impl.getShadowElevation();
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final long getTopLeft() {
        return this.topLeft;
    }

    public final float y() {
        return this.impl.getTranslationX();
    }

    public final float z() {
        return this.impl.getTranslationY();
    }
}
