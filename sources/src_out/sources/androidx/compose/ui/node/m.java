package androidx.compose.ui.node;

import android.view.View;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.platform.a0;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.q22;
import com.google.inputmethod.LocaleList;
import com.google.inputmethod.bc9;
import com.google.inputmethod.c65;
import com.google.inputmethod.dw8;
import com.google.inputmethod.dxc;
import com.google.inputmethod.e6;
import com.google.inputmethod.f43;
import com.google.inputmethod.ga0;
import com.google.inputmethod.hfb;
import com.google.inputmethod.hyb;
import com.google.inputmethod.i05;
import com.google.inputmethod.iu8;
import com.google.inputmethod.jf1;
import com.google.inputmethod.jy5;
import com.google.inputmethod.kf1;
import com.google.inputmethod.mf3;
import com.google.inputmethod.p7e;
import com.google.inputmethod.pma;
import com.google.inputmethod.qa0;
import com.google.inputmethod.qe9;
import com.google.inputmethod.ug9;
import com.google.inputmethod.w41;
import com.google.inputmethod.yzc;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000ü\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u0000 Õ\u00012\u00020\u0001:\u0003\u001bÖ\u0001J5\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H&¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\u000eJ\u0019\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u0004H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH&¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b!\u0010\"JE\u0010+\u001a\u00020*2\u001a\u0010&\u001a\u0016\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\b0#2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010%H&¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\bH&¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b/\u0010\u000eJ\u0017\u00100\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b0\u0010\u000eJ\u001f\u00103\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b5\u00104J\u001b\u00109\u001a\u00020\b2\n\u00108\u001a\u000606j\u0002`7H'¢\u0006\u0004\b9\u0010:J\u001d\u0010<\u001a\u00020\b2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\b0'H&¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\bH&¢\u0006\u0004\b>\u0010.J\u0017\u0010@\u001a\u00020\b2\u0006\u0010;\u001a\u00020?H&¢\u0006\u0004\b@\u0010AJ4\u0010G\u001a\u00020D2\"\u0010F\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020B\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0C\u0012\u0006\u0012\u0004\u0018\u00010E0#H¦@¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020\b2\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u00020\b2\u0006\u0010M\u001a\u00020\u0013H\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\bH\u0016¢\u0006\u0004\bP\u0010.R\u0014\u0010S\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8&X¦\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8&X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8&X¦\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8&X¦\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0014\u0010g\u001a\u00020d8&X¦\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8&X¦\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020l8&X¦\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020p8&X¦\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0014\u0010w\u001a\u00020t8&X¦\u0004¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0016\u0010{\u001a\u0004\u0018\u00010x8&X¦\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0016\u0010\u007f\u001a\u0004\u0018\u00010|8&X¦\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u0088\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008c\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0090\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0094\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u0098\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009c\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0018\u0010£\u0001\u001a\u00030 \u00018&X¦\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R\u001f\u0010¨\u0001\u001a\u00030¤\u00018&X§\u0004¢\u0006\u000f\u0012\u0005\b§\u0001\u0010.\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010¬\u0001\u001a\u00030©\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001R\u0018\u0010°\u0001\u001a\u00030\u00ad\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b®\u0001\u0010¯\u0001R\u0018\u0010´\u0001\u001a\u00030±\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b²\u0001\u0010³\u0001R \u0010¸\u0001\u001a\u00020\u00048&@'X¦\u000e¢\u0006\u000f\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0005\b·\u0001\u0010\u001cR\u0018\u0010¼\u0001\u001a\u00030¹\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010»\u0001R\u0018\u0010À\u0001\u001a\u00030½\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b¾\u0001\u0010¿\u0001R\u0018\u0010Ä\u0001\u001a\u00030Á\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u0018\u0010È\u0001\u001a\u00030Å\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÆ\u0001\u0010Ç\u0001R\u0018\u0010Ì\u0001\u001a\u00030É\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÊ\u0001\u0010Ë\u0001R\u0018\u0010Ð\u0001\u001a\u00030Í\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÎ\u0001\u0010Ï\u0001R\u001a\u0010Ô\u0001\u001a\u0005\u0018\u00010Ñ\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÒ\u0001\u0010Ó\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006×\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/m;", "Lcom/google/android/ug9;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "affectsLookahead", "forceRequest", "scheduleMeasureAndLayout", "", "u", "(Landroidx/compose/ui/node/LayoutNode;ZZZ)V", "z", "(Landroidx/compose/ui/node/LayoutNode;ZZ)V", "f", "(Landroidx/compose/ui/node/LayoutNode;)V", "node", "J", "H", "L", "Lcom/google/android/rn8;", "localPosition", "C", "(J)J", "positionInWindow", "t", "o", "sendPointerUpdate", "a", "(Z)V", "Lcom/google/android/kx1;", "constraints", "s", "(Landroidx/compose/ui/node/LayoutNode;J)V", "F", "(Landroidx/compose/ui/node/LayoutNode;Z)V", "Lkotlin/Function2;", "Lcom/google/android/w41;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "explicitLayer", "Lcom/google/android/dw8;", "r", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)Lcom/google/android/dw8;", "N", "()V", "E", "P", "", "oldSemanticsId", "D", "(Landroidx/compose/ui/node/LayoutNode;I)V", "g", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "view", "j", "(Landroid/view/View;)V", "listener", "M", "(Lkotlin/jvm/functions/Function0;)V", "v", "Landroidx/compose/ui/node/m$b;", "p", "(Landroidx/compose/ui/node/m$b;)V", "Lcom/google/android/bc9;", "Lcom/google/android/q22;", "", "", "session", "x", "(Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "", "frameRate", "K", "(F)V", "delta", "G", "(J)V", "k", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getSharedDrawScope", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "sharedDrawScope", "Lcom/google/android/c65;", "getHapticFeedBack", "()Lcom/google/android/c65;", "hapticFeedBack", "Lcom/google/android/jy5;", "getInputModeManager", "()Lcom/google/android/jy5;", "inputModeManager", "Lcom/google/android/kf1;", "getClipboardManager", "()Lcom/google/android/kf1;", "clipboardManager", "Lcom/google/android/jf1;", "getClipboard", "()Lcom/google/android/jf1;", "clipboard", "Lcom/google/android/e6;", "getAccessibilityManager", "()Lcom/google/android/e6;", "accessibilityManager", "Lcom/google/android/i05;", "getGraphicsContext", "()Lcom/google/android/i05;", "graphicsContext", "Lcom/google/android/yzc;", "getTextToolbar", "()Lcom/google/android/yzc;", "textToolbar", "Lcom/google/android/qa0;", "getAutofillTree", "()Lcom/google/android/qa0;", "autofillTree", "Lcom/google/android/ga0;", "getAutofill", "()Lcom/google/android/ga0;", "autofill", "Landroidx/compose/ui/autofill/b;", "getAutofillManager", "()Landroidx/compose/ui/autofill/b;", "autofillManager", "Lcom/google/android/f43;", "getDensity", "()Lcom/google/android/f43;", "density", "Lcom/google/android/dxc;", "getTextInputService", "()Lcom/google/android/dxc;", "textInputService", "Lcom/google/android/hyb;", "getSoftwareKeyboardController", "()Lcom/google/android/hyb;", "softwareKeyboardController", "Lcom/google/android/qe9;", "getPointerIconService", "()Lcom/google/android/qe9;", "pointerIconService", "Lcom/google/android/hfb;", "getSemanticsOwner", "()Lcom/google/android/hfb;", "semanticsOwner", "Landroidx/compose/ui/focus/FocusOwner;", "getFocusOwner", "()Landroidx/compose/ui/focus/FocusOwner;", "focusOwner", "Landroidx/compose/ui/platform/a0;", "getWindowInfo", "()Landroidx/compose/ui/platform/a0;", "windowInfo", "Lcom/google/android/pma;", "getRetainedValuesStore", "()Lcom/google/android/pma;", "retainedValuesStore", "Landroidx/compose/ui/spatial/RectManager;", "getRectManager", "()Landroidx/compose/ui/spatial/RectManager;", "rectManager", "Landroidx/compose/ui/text/font/k$b;", "getFontLoader", "()Landroidx/compose/ui/text/font/k$b;", "getFontLoader$annotations", "fontLoader", "Landroidx/compose/ui/text/font/l$b;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/l$b;", "fontFamilyResolver", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lcom/google/android/g77;", "getLocaleList", "()Lcom/google/android/g77;", "localeList", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "showLayoutBounds", "Lcom/google/android/p7e;", "getViewConfiguration", "()Lcom/google/android/p7e;", "viewConfiguration", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "getModifierLocalManager", "()Landroidx/compose/ui/modifier/ModifierLocalManager;", "modifierLocalManager", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroidx/compose/ui/layout/o$a;", "getPlacementScope", "()Landroidx/compose/ui/layout/o$a;", "placementScope", "Lcom/google/android/mf3;", "getDragAndDropManager", "()Lcom/google/android/mf3;", "dragAndDropManager", "Lcom/google/android/iu8;", "getOutOfFrameExecutor", "()Lcom/google/android/iu8;", "outOfFrameExecutor", "t1", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface m extends ug9 {

    /* JADX INFO: renamed from: t1, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: androidx.compose.ui.node.m$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/node/m$a;", "", "<init>", "()V", "", "b", "Z", "a", "()Z", "setEnableExtraAssertions", "(Z)V", "enableExtraAssertions", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static boolean enableExtraAssertions;

        private Companion() {
        }

        public final boolean a() {
            return enableExtraAssertions;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/m$b;", "", "", "q", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        void q();
    }

    static /* synthetic */ void B(m mVar, LayoutNode layoutNode, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        mVar.z(layoutNode, z, z2);
    }

    static /* synthetic */ dw8 I(m mVar, Function2 function2, Function0 function0, GraphicsLayer graphicsLayer, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLayer");
        }
        if ((i & 4) != 0) {
            graphicsLayer = null;
        }
        return mVar.r(function2, function0, graphicsLayer);
    }

    static /* synthetic */ void Q(m mVar, LayoutNode layoutNode, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = true;
        }
        mVar.u(layoutNode, z, z2, z3);
    }

    static /* synthetic */ void e(m mVar, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        mVar.a(z);
    }

    static /* synthetic */ void l(m mVar, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        mVar.F(layoutNode, z);
    }

    long C(long localPosition);

    default void D(LayoutNode layoutNode, int oldSemanticsId) {
    }

    void E(LayoutNode layoutNode);

    void F(LayoutNode layoutNode, boolean affectsLookahead);

    default void G(long delta) {
    }

    void H(LayoutNode node);

    void J(LayoutNode node);

    default void K(float frameRate) {
    }

    void L(LayoutNode node);

    void M(Function0<Unit> listener);

    void N();

    void P(LayoutNode layoutNode);

    void a(boolean sendPointerUpdate);

    void f(LayoutNode layoutNode);

    default void g(LayoutNode layoutNode, int oldSemanticsId) {
    }

    e6 getAccessibilityManager();

    ga0 getAutofill();

    androidx.compose.ui.autofill.b getAutofillManager();

    qa0 getAutofillTree();

    jf1 getClipboard();

    kf1 getClipboardManager();

    CoroutineContext getCoroutineContext();

    f43 getDensity();

    mf3 getDragAndDropManager();

    FocusOwner getFocusOwner();

    androidx.compose.ui.text.font.l.b getFontFamilyResolver();

    androidx.compose.ui.text.font.k.b getFontLoader();

    i05 getGraphicsContext();

    c65 getHapticFeedBack();

    jy5 getInputModeManager();

    LayoutDirection getLayoutDirection();

    LocaleList getLocaleList();

    ModifierLocalManager getModifierLocalManager();

    default iu8 getOutOfFrameExecutor() {
        return null;
    }

    default androidx.compose.ui.layout.o.a getPlacementScope() {
        return PlaceableKt.b(this);
    }

    qe9 getPointerIconService();

    RectManager getRectManager();

    pma getRetainedValuesStore();

    LayoutNode getRoot();

    hfb getSemanticsOwner();

    LayoutNodeDrawScope getSharedDrawScope();

    boolean getShowLayoutBounds();

    OwnerSnapshotObserver getSnapshotObserver();

    hyb getSoftwareKeyboardController();

    dxc getTextInputService();

    yzc getTextToolbar();

    p7e getViewConfiguration();

    a0 getWindowInfo();

    void j(View view);

    default void k() {
    }

    void o(LayoutNode node);

    void p(b listener);

    dw8 r(Function2<? super w41, ? super GraphicsLayer, Unit> drawBlock, Function0<Unit> invalidateParentLayer, GraphicsLayer explicitLayer);

    void s(LayoutNode layoutNode, long constraints);

    void setShowLayoutBounds(boolean z);

    long t(long positionInWindow);

    void u(LayoutNode layoutNode, boolean affectsLookahead, boolean forceRequest, boolean scheduleMeasureAndLayout);

    void v();

    Object x(Function2<? super bc9, ? super q22<?>, ? extends Object> function2, q22<?> q22Var);

    void z(LayoutNode layoutNode, boolean affectsLookahead, boolean forceRequest);
}
