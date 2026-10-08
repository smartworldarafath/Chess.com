package androidx.compose.ui.window;

import android.R;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.compose.p004runtime.p0;
import androidx.compose.p004runtime.s0;
import androidx.compose.p004runtime.snapshots.j;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.ibe;
import com.google.inputmethod.f43;
import com.google.inputmethod.fbe;
import com.google.inputmethod.ff3;
import com.google.inputmethod.g16;
import com.google.inputmethod.jbe;
import com.google.inputmethod.k16;
import com.google.inputmethod.kae;
import com.google.inputmethod.kn6;
import com.google.inputmethod.l16;
import com.google.inputmethod.ln6;
import com.google.inputmethod.o58;
import com.google.inputmethod.og9;
import com.google.inputmethod.q16;
import com.google.inputmethod.q6c;
import com.google.inputmethod.rg9;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.sg9;
import com.google.inputmethod.t04;
import com.google.inputmethod.xy9;
import com.google.inputmethod.xz9;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0001\u0018\u0000 ¤\u00012\u00020\u00012\u00020\u0002:\u0001TBY\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0004¢\u0006\u0004\b'\u0010\u0019J#\u0010+\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0004H\u0017¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0004H\u0014¢\u0006\u0004\b/\u0010\u0019J\u000f\u00100\u001a\u00020\u0004H\u0014¢\u0006\u0004\b0\u0010\u0019J\u001f\u00106\u001a\u00020\u00042\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u000201H\u0010¢\u0006\u0004\b4\u00105J7\u0010>\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00122\u0006\u00108\u001a\u0002012\u0006\u00109\u001a\u0002012\u0006\u0010:\u001a\u0002012\u0006\u0010;\u001a\u000201H\u0010¢\u0006\u0004\b<\u0010=J\u0017\u0010A\u001a\u00020\u00122\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ5\u0010C\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\bC\u0010DJ\u0015\u0010G\u001a\u00020\u00042\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020\u0004¢\u0006\u0004\bI\u0010\u0019J\u000f\u0010J\u001a\u00020\u0004H\u0001¢\u0006\u0004\bJ\u0010\u0019J\r\u0010K\u001a\u00020\u0004¢\u0006\u0004\bK\u0010\u0019J\r\u0010L\u001a\u00020\u0004¢\u0006\u0004\bL\u0010\u0019J\u0019\u0010N\u001a\u00020\u00122\b\u0010@\u001a\u0004\u0018\u00010MH\u0016¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u000201H\u0016¢\u0006\u0004\bP\u0010QR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\\R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010]R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010^R\u0014\u0010a\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010`R \u0010e\u001a\u00020!8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bI\u0010b\u0012\u0004\bd\u0010\u0019\u001a\u0004\bc\u0010#R\"\u0010k\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010p\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010 R/\u0010x\u001a\u0004\u0018\u00010q2\b\u0010r\u001a\u0004\u0018\u00010q8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR/\u0010F\u001a\u0004\u0018\u00010E2\b\u0010r\u001a\u0004\u0018\u00010E8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010s\u001a\u0004\by\u0010z\"\u0004\b{\u0010HR\u0018\u0010}\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010|R\u001d\u0010\u0081\u0001\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\r\n\u0004\bG\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0017\u0010\u0084\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010\u0083\u0001R\u0017\u0010\u0087\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bK\u0010\u0086\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008a\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001c\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R<\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0005\b\u0096\u0001\u0010s\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R)\u0010\u009e\u0001\u001a\u00020\u00122\u0007\u0010\u009b\u0001\u001a\u00020\u00128\u0014@RX\u0094\u000e¢\u0006\u000f\n\u0005\b\u009c\u0001\u0010]\u001a\u0006\b\u009d\u0001\u0010\u0080\u0001R\u0018\u0010 \u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u008a\u0001R\u0017\u0010£\u0001\u001a\u00020\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001¨\u0006¥\u0001"}, d2 = {"Landroidx/compose/ui/window/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Lcom/google/android/kae;", "Lkotlin/Function0;", "", "onDismissRequest", "Lcom/google/android/sg9;", "properties", "", "testTag", "Landroid/view/View;", "composeView", "Lcom/google/android/f43;", "density", "Lcom/google/android/rg9;", "initialPositionProvider", "Ljava/util/UUID;", "popupId", "", "isNested", "Lcom/google/android/og9;", "popupLayoutHelper", "<init>", "(Lkotlin/jvm/functions/Function0;Lcom/google/android/sg9;Ljava/lang/String;Landroid/view/View;Lcom/google/android/f43;Lcom/google/android/rg9;Ljava/util/UUID;ZLcom/google/android/og9;)V", "f", "()V", "g", "o", "(Lcom/google/android/sg9;)V", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "k", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroid/view/WindowManager$LayoutParams;", "d", "()Landroid/view/WindowManager$LayoutParams;", "Lcom/google/android/k16;", "getDisplayBounds", "()Lcom/google/android/k16;", "j", "Landroidx/compose/runtime/f;", "parent", "content", "i", "(Landroidx/compose/runtime/f;Lkotlin/jvm/functions/Function2;)V", "Content", "(Landroidx/compose/runtime/d;I)V", "onAttachedToWindow", "onDetachedFromWindow", "", "widthMeasureSpec", "heightMeasureSpec", "internalOnMeasure$ui", "(II)V", "internalOnMeasure", "changed", "left", "top", "right", "bottom", "internalOnLayout$ui", "(ZIIII)V", "internalOnLayout", "Landroid/view/KeyEvent;", "event", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "l", "(Lkotlin/jvm/functions/Function0;Lcom/google/android/sg9;Ljava/lang/String;Landroidx/compose/ui/unit/LayoutDirection;)V", "Lcom/google/android/kn6;", "parentLayoutCoordinates", "n", "(Lcom/google/android/kn6;)V", "h", "m", "p", "e", "Landroid/view/MotionEvent;", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "setLayoutDirection", "(I)V", "a", "Lkotlin/jvm/functions/Function0;", "b", "Lcom/google/android/sg9;", "c", "Ljava/lang/String;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "Landroid/view/View;", "Z", "Lcom/google/android/og9;", "Landroid/view/WindowManager;", "Landroid/view/WindowManager;", "windowManager", "Landroid/view/WindowManager$LayoutParams;", "getParams$ui", "getParams$ui$annotations", "params", "Lcom/google/android/rg9;", "getPositionProvider", "()Lcom/google/android/rg9;", "setPositionProvider", "(Lcom/google/android/rg9;)V", "positionProvider", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setParentLayoutDirection", "parentLayoutDirection", "Lcom/google/android/q16;", "<set-?>", "Lcom/google/android/o58;", "getPopupContentSize-bOM6tXw", "()Lcom/google/android/q16;", "setPopupContentSize-fhxjrPA", "(Lcom/google/android/q16;)V", "popupContentSize", "getParentLayoutCoordinates", "()Lcom/google/android/kn6;", "setParentLayoutCoordinates", "Lcom/google/android/k16;", "parentBounds", "Lcom/google/android/q6c;", "getCanCalculatePosition", "()Z", "canCalculatePosition", "Lcom/google/android/ff3;", "F", "maxSupportedElevation", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "previousWindowVisibleFrame", "", "q", "[I", "parentLocationOnScreen", "r", "parentLocationInWindow", "Landroidx/compose/runtime/snapshots/j;", "s", "Landroidx/compose/runtime/snapshots/j;", "snapshotStateObserver", "", "t", "Ljava/lang/Object;", "backCallback", "u", "getContent", "()Lkotlin/jvm/functions/Function2;", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "value", "v", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "w", "locationOnScreen", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "x", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PopupLayout extends AbstractComposeView implements kae {
    private static final b x = new b(null);
    public static final int y = 8;
    private static final Function1<PopupLayout, Unit> z = new Function1<PopupLayout, Unit>() { // from class: androidx.compose.ui.window.PopupLayout$Companion$onCommitAffectingPopupPosition$1
        public final void a(PopupLayout popupLayout) {
            if (popupLayout.isAttachedToWindow()) {
                popupLayout.p();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((PopupLayout) obj);
            return Unit.a;
        }
    };

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Function0<Unit> onDismissRequest;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private sg9 properties;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String testTag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final View composeView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isNested;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final og9 popupLayoutHelper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final WindowManager windowManager;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final WindowManager.LayoutParams params;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private rg9 positionProvider;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private LayoutDirection parentLayoutDirection;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final o58 popupContentSize;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final o58 parentLayoutCoordinates;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private k16 parentBounds;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final q6c canCalculatePosition;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final float maxSupportedElevation;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final Rect previousWindowVisibleFrame;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final int[] parentLocationOnScreen;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final int[] parentLocationInWindow;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final j snapshotStateObserver;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private Object backCallback;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final o58 content;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private boolean shouldCreateCompositionOnAttachedToWindow;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final int[] locationOnScreen;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/window/PopupLayout$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "result", "", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline result) {
            result.setRect(0, 0, view.getWidth(), view.getHeight());
            result.setAlpha(0.0f);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/window/PopupLayout$b;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/window/PopupLayout;", "", "onCommitAffectingPopupPosition", "Lkotlin/jvm/functions/Function1;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PopupLayout(Function0 function0, sg9 sg9Var, String str, View view, f43 f43Var, rg9 rg9Var, UUID uuid, boolean z2, og9 og9Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        og9 hVar;
        if ((i & 256) != 0) {
            int i2 = Build.VERSION.SDK_INT;
            hVar = i2 >= 30 ? new h() : i2 >= 29 ? new g() : new i();
        } else {
            hVar = og9Var;
        }
        this(function0, sg9Var, str, view, f43Var, rg9Var, uuid, z2, hVar);
    }

    private final WindowManager.LayoutParams d() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = AndroidPopup_androidKt.h(this.properties, AndroidPopup_androidKt.j(this.composeView));
        layoutParams.type = this.properties.getWindowType();
        IBinder windowToken = this.properties.getWindowToken();
        if (windowToken == null) {
            windowToken = this.composeView.getApplicationWindowToken();
        }
        layoutParams.token = windowToken;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.composeView.getContext().getResources().getString(xz9.c));
        return layoutParams;
    }

    private final void f() {
        if (!this.properties.getDismissOnBackPress() || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.backCallback == null) {
            this.backCallback = e.b(this.onDismissRequest);
        }
        e.d(this, this.backCallback);
    }

    private final void g() {
        if (Build.VERSION.SDK_INT >= 33) {
            e.e(this, this.backCallback);
        }
        this.backCallback = null;
    }

    private final Function2<androidx.compose.p004runtime.d, Integer, Unit> getContent() {
        return (Function2) this.content.getValue();
    }

    private final k16 getDisplayBounds() {
        Rect rect = this.previousWindowVisibleFrame;
        if (this.properties.a()) {
            this.popupLayoutHelper.d(this.composeView, rect);
        } else {
            this.popupLayoutHelper.c(this.composeView, rect);
        }
        return AndroidPopup_androidKt.k(rect);
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kn6 getParentLayoutCoordinates() {
        return (kn6) this.parentLayoutCoordinates.getValue();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void k(LayoutDirection layoutDirection) throws NoWhenBranchMatchedException {
        int i = c.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i2);
    }

    private final void o(sg9 properties) {
        if (Intrinsics.e(this.properties, properties)) {
            return;
        }
        if (properties.getUsePlatformDefaultWidth() && !this.properties.getUsePlatformDefaultWidth()) {
            WindowManager.LayoutParams layoutParams = this.params;
            layoutParams.width = -2;
            layoutParams.height = -2;
        }
        this.properties = properties;
        this.params.flags = AndroidPopup_androidKt.h(properties, AndroidPopup_androidKt.j(this.composeView));
        this.popupLayoutHelper.a(this.windowManager, this, this.params);
    }

    private final void setContent(Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2) {
        this.content.setValue(function2);
    }

    private final void setParentLayoutCoordinates(kn6 kn6Var) {
        this.parentLayoutCoordinates.setValue(kn6Var);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(androidx.compose.p004runtime.d dVar, final int i) {
        int i2;
        androidx.compose.p004runtime.d dVarF = dVar.F(-857613600);
        if ((i & 6) == 0) {
            i2 = (dVarF.T(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (dVarF.g((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-857613600, i2, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:715)");
            }
            getContent().invoke(dVarF, 0);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.window.PopupLayout.Content.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(androidx.compose.p004runtime.d dVar2, int i3) {
                    PopupLayout.this.Content(dVar2, saa.a(i | 1));
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        if (!this.properties.getDismissOnBackPress()) {
            return super.dispatchKeyEvent(event);
        }
        if (event.getKeyCode() == 4 || event.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(event);
            }
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(event, this);
                return true;
            }
            if (event.getAction() == 1 && keyDispatcherState.isTracking(event) && !event.isCanceled()) {
                Function0<Unit> function0 = this.onDismissRequest;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    public final void e() {
        fbe.b(this, null);
        this.windowManager.removeViewImmediate(this);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.canCalculatePosition.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: getParams$ui, reason: from getter */
    public final WindowManager.LayoutParams getParams() {
        return this.params;
    }

    public final LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final q16 m77getPopupContentSizebOM6tXw() {
        return (q16) this.popupContentSize.getValue();
    }

    public final rg9 getPositionProvider() {
        return this.positionProvider;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // com.google.inputmethod.kae
    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.testTag;
    }

    @Override // com.google.inputmethod.kae
    public /* bridge */ /* synthetic */ View getViewRoot() {
        return super.getViewRoot();
    }

    public final void h() {
        if (isAttachedToWindow()) {
            int[] iArr = this.locationOnScreen;
            int i = iArr[0];
            int i2 = iArr[1];
            this.composeView.getLocationOnScreen(iArr);
            int[] iArr2 = this.locationOnScreen;
            if (i == iArr2[0] && i2 == iArr2[1]) {
                return;
            }
            m();
        }
    }

    public final void i(androidx.compose.p004runtime.f parent, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> content) {
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnLayout$ui(boolean changed, int left, int top, int right, int bottom) {
        View childAt;
        super.internalOnLayout$ui(changed, left, top, right, bottom);
        if (this.properties.getUsePlatformDefaultWidth() || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.params.width = childAt.getMeasuredWidth();
        this.params.height = childAt.getMeasuredHeight();
        this.popupLayoutHelper.a(this.windowManager, this, this.params);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnMeasure$ui(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.properties.getUsePlatformDefaultWidth()) {
            super.internalOnMeasure$ui(widthMeasureSpec, heightMeasureSpec);
        } else {
            k16 displayBounds = getDisplayBounds();
            super.internalOnMeasure$ui(View.MeasureSpec.makeMeasureSpec(displayBounds.r(), t04.INVALID_ID), View.MeasureSpec.makeMeasureSpec(displayBounds.j(), t04.INVALID_ID));
        }
    }

    public final void j() {
        this.windowManager.addView(this, this.params);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void l(Function0<Unit> onDismissRequest, sg9 properties, String testTag, LayoutDirection layoutDirection) throws NoWhenBranchMatchedException {
        this.onDismissRequest = onDismissRequest;
        this.testTag = testTag;
        o(properties);
        k(layoutDirection);
    }

    public final void m() {
        kn6 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.b()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jA = parentLayoutCoordinates.a();
            long j = this.isNested ? ln6.j(parentLayoutCoordinates) : ln6.i(parentLayoutCoordinates);
            k16 k16VarB = l16.b(g16.f((((long) Math.round(Float.intBitsToFloat((int) (j >> 32)))) << 32) | (4294967295L & ((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))))), jA);
            if (Intrinsics.e(k16VarB, this.parentBounds)) {
                return;
            }
            this.parentBounds = k16VarB;
            p();
        }
    }

    public final void n(kn6 parentLayoutCoordinates) {
        setParentLayoutCoordinates(parentLayoutCoordinates);
        m();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.snapshotStateObserver.q();
        f();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.snapshotStateObserver.r();
        this.snapshotStateObserver.f();
        g();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (!this.properties.getDismissOnClickOutside()) {
            return super.onTouchEvent(event);
        }
        if (event != null && event.getAction() == 0 && (event.getX() < 0.0f || event.getX() >= getWidth() || event.getY() < 0.0f || event.getY() >= getHeight())) {
            Function0<Unit> function0 = this.onDismissRequest;
            if (function0 != null) {
                function0.invoke();
            }
            return true;
        }
        if (event == null || event.getAction() != 4) {
            return super.onTouchEvent(event);
        }
        Function0<Unit> function1 = this.onDismissRequest;
        if (function1 != null) {
            function1.invoke();
        }
        return true;
    }

    public final void p() {
        q16 q16VarM77getPopupContentSizebOM6tXw;
        final k16 k16Var = this.parentBounds;
        if (k16Var == null || (q16VarM77getPopupContentSizebOM6tXw = m77getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        final long packedValue = q16VarM77getPopupContentSizebOM6tXw.getPackedValue();
        k16 displayBounds = getDisplayBounds();
        final long jC = q16.c((((long) displayBounds.r()) << 32) | (((long) displayBounds.j()) & 4294967295L));
        final Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = g16.INSTANCE.b();
        this.snapshotStateObserver.k(this, z, new Function0<Unit>() { // from class: androidx.compose.ui.window.PopupLayout$updatePosition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m80invoke();
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m80invoke() {
                longRef.element = this.getPositionProvider().a(k16Var, jC, this.getParentLayoutDirection(), packedValue);
            }
        });
        this.params.x = g16.k(longRef.element);
        this.params.y = g16.l(longRef.element);
        if (this.properties.getExcludeFromSystemGesture()) {
            this.popupLayoutHelper.b(this, (int) (jC >> 32), (int) (jC & 4294967295L));
        }
        this.popupLayoutHelper.a(this.windowManager, this, this.params);
    }

    @Override // android.view.View
    public void setLayoutDirection(int layoutDirection) {
    }

    public final void setParentLayoutDirection(LayoutDirection layoutDirection) {
        this.parentLayoutDirection = layoutDirection;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m78setPopupContentSizefhxjrPA(q16 q16Var) {
        this.popupContentSize.setValue(q16Var);
    }

    public final void setPositionProvider(rg9 rg9Var) {
        this.positionProvider = rg9Var;
    }

    public final void setTestTag(String str) {
        this.testTag = str;
    }

    public PopupLayout(Function0<Unit> function0, sg9 sg9Var, String str, View view, f43 f43Var, rg9 rg9Var, UUID uuid, boolean z2, og9 og9Var) {
        super(view.getContext(), null, 0, 6, null);
        this.onDismissRequest = function0;
        this.properties = sg9Var;
        this.testTag = str;
        this.composeView = view;
        this.isNested = z2;
        this.popupLayoutHelper = og9Var;
        Object systemService = view.getContext().getSystemService("window");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) systemService;
        this.params = d();
        this.positionProvider = rg9Var;
        this.parentLayoutDirection = LayoutDirection.Ltr;
        this.popupContentSize = s0.e(null, null, 2, null);
        this.parentLayoutCoordinates = s0.e(null, null, 2, null);
        this.canCalculatePosition = p0.e(new Function0<Boolean>() { // from class: androidx.compose.ui.window.PopupLayout$canCalculatePosition$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Boolean m79invoke() {
                kn6 parentLayoutCoordinates = this.this$0.getParentLayoutCoordinates();
                if (parentLayoutCoordinates == null || !parentLayoutCoordinates.b()) {
                    parentLayoutCoordinates = null;
                }
                return Boolean.valueOf((parentLayoutCoordinates == null || this.this$0.m77getPopupContentSizebOM6tXw() == null) ? false : true);
            }
        });
        float fI = ff3.i(8);
        this.maxSupportedElevation = fI;
        this.previousWindowVisibleFrame = new Rect();
        this.parentLocationOnScreen = new int[2];
        this.parentLocationInWindow = new int[2];
        this.snapshotStateObserver = new j(new PopupLayout$snapshotStateObserver$1(this));
        setId(R.id.content);
        fbe.b(this, fbe.a(view));
        jbe.b(this, jbe.a(view));
        ibe.b(this, ibe.a(view));
        setTag(xy9.J, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(f43Var.x2(fI));
        setOutlineProvider(new a());
        this.content = s0.e(ComposableSingletons$AndroidPopup_androidKt.a.a(), null, 2, null);
        this.locationOnScreen = new int[2];
    }
}
