package androidx.compose.ui.platform;

import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.LocaleList;
import com.google.inputmethod.as1;
import com.google.inputmethod.c65;
import com.google.inputmethod.cvd;
import com.google.inputmethod.dxc;
import com.google.inputmethod.e6;
import com.google.inputmethod.e77;
import com.google.inputmethod.f43;
import com.google.inputmethod.fs1;
import com.google.inputmethod.ga0;
import com.google.inputmethod.hyb;
import com.google.inputmethod.i05;
import com.google.inputmethod.jf1;
import com.google.inputmethod.jy5;
import com.google.inputmethod.kf1;
import com.google.inputmethod.ks9;
import com.google.inputmethod.ok4;
import com.google.inputmethod.os9;
import com.google.inputmethod.p7e;
import com.google.inputmethod.qa0;
import com.google.inputmethod.qe9;
import com.google.inputmethod.s67;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.yzc;
import com.google.inputmethod.zr1;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a-\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\r\"\u001f\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"(\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0012\"&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u0012\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u0012\"\u001f\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010\u0012\"&\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u0010\u0012\u0004\b$\u0010\u0018\u001a\u0004\b#\u0010\u0012\"\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\u000e8\u0006¢\u0006\f\n\u0004\b'\u0010\u0010\u001a\u0004\b\u001f\u0010\u0012\"\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020)0\u000e8\u0006¢\u0006\f\n\u0004\b*\u0010\u0010\u001a\u0004\b+\u0010\u0012\"\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020-0\u000e8\u0006¢\u0006\f\n\u0004\b.\u0010\u0010\u001a\u0004\b*\u0010\u0012\"\u001d\u00102\u001a\b\u0012\u0004\u0012\u0002000\u000e8\u0006¢\u0006\f\n\u0004\b1\u0010\u0010\u001a\u0004\b.\u0010\u0012\"&\u00106\u001a\b\u0012\u0004\u0012\u0002030\u000e8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010\u0010\u0012\u0004\b5\u0010\u0018\u001a\u0004\b4\u0010\u0012\"\u001d\u00109\u001a\b\u0012\u0004\u0012\u0002070\u000e8\u0006¢\u0006\f\n\u0004\b8\u0010\u0010\u001a\u0004\b1\u0010\u0012\"\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020:0\u000e8\u0006¢\u0006\f\n\u0004\b;\u0010\u0010\u001a\u0004\b8\u0010\u0012\"\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020=0\u000e8\u0006¢\u0006\f\n\u0004\b>\u0010\u0010\u001a\u0004\b;\u0010\u0012\"\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020@0\u000e8\u0006¢\u0006\f\n\u0004\bA\u0010\u0010\u001a\u0004\b>\u0010\u0012\"\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020C0\u000e8\u0007¢\u0006\f\n\u0004\bD\u0010\u0010\u001a\u0004\bE\u0010\u0012\"\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020H0G8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"(\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010N0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bO\u0010\u0010\u0012\u0004\bQ\u0010\u0018\u001a\u0004\bP\u0010\u0012\"\u001f\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010S0\u000e8\u0006¢\u0006\f\n\u0004\bT\u0010\u0010\u001a\u0004\bT\u0010\u0012\"\u001d\u0010X\u001a\b\u0012\u0004\u0012\u00020V0\u000e8\u0006¢\u0006\f\n\u0004\bW\u0010\u0010\u001a\u0004\bW\u0010\u0012\"\u001d\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\bY\u0010\u0010\u001a\u0004\bY\u0010\u0012\"\u001d\u0010]\u001a\b\u0012\u0004\u0012\u00020[0\u000e8\u0006¢\u0006\f\n\u0004\b\\\u0010\u0010\u001a\u0004\b\\\u0010\u0012\"\u001d\u0010`\u001a\b\u0012\u0004\u0012\u00020^0\u000e8\u0006¢\u0006\f\n\u0004\b_\u0010\u0010\u001a\u0004\b_\u0010\u0012\"\"\u0010b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010a0\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\bD\u0010\u0012\" \u0010e\u001a\b\u0012\u0004\u0012\u00020c0\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bd\u0010\u0010\u001a\u0004\bI\u0010\u0012\"\u001d\u0010g\u001a\b\u0012\u0004\u0012\u00020c0\u000e8\u0006¢\u0006\f\n\u0004\bf\u0010\u0010\u001a\u0004\b'\u0010\u0012\"\u0017\u0010h\u001a\b\u0012\u0004\u0012\u00020C0G8F¢\u0006\u0006\u001a\u0004\bA\u0010L\"\u0017\u0010i\u001a\b\u0012\u0004\u0012\u00020c0G8F¢\u0006\u0006\u001a\u0004\bO\u0010L¨\u0006j"}, d2 = {"Landroidx/compose/ui/node/m;", "owner", "Lcom/google/android/cvd;", "uriHandler", "Lkotlin/Function0;", "", "content", "a", "(Landroidx/compose/ui/node/m;Lcom/google/android/cvd;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "", "name", "", "w", "(Ljava/lang/String;)Ljava/lang/Void;", "Lcom/google/android/ks9;", "Lcom/google/android/e6;", "Lcom/google/android/ks9;", "c", "()Lcom/google/android/ks9;", "LocalAccessibilityManager", "Lcom/google/android/ga0;", "b", "getLocalAutofill", "getLocalAutofill$annotations", "()V", "LocalAutofill", "Lcom/google/android/qa0;", "getLocalAutofillTree", "getLocalAutofillTree$annotations", "LocalAutofillTree", "Landroidx/compose/ui/autofill/b;", "d", "getLocalAutofillManager", "LocalAutofillManager", "Lcom/google/android/kf1;", "e", "getLocalClipboardManager$annotations", "LocalClipboardManager", "Lcom/google/android/jf1;", "f", "LocalClipboard", "Lcom/google/android/i05;", "g", "j", "LocalGraphicsContext", "Lcom/google/android/f43;", "h", "LocalDensity", "Lcom/google/android/ok4;", "i", "LocalFocusManager", "Landroidx/compose/ui/text/font/k$b;", "getLocalFontLoader", "getLocalFontLoader$annotations", "LocalFontLoader", "Landroidx/compose/ui/text/font/l$b;", "k", "LocalFontFamilyResolver", "Lcom/google/android/c65;", "l", "LocalHapticFeedback", "Lcom/google/android/jy5;", "m", "LocalInputModeManager", "Landroidx/compose/ui/unit/LayoutDirection;", "n", "LocalLayoutDirection", "Lcom/google/android/g77;", "o", "getLocalProvidableLocaleList", "LocalProvidableLocaleList", "Lcom/google/android/zr1;", "Lcom/google/android/e77;", "p", "Lcom/google/android/zr1;", "getLocalLocale", "()Lcom/google/android/zr1;", "LocalLocale", "Lcom/google/android/dxc;", "q", "getLocalTextInputService", "getLocalTextInputService$annotations", "LocalTextInputService", "Lcom/google/android/hyb;", "r", "LocalSoftwareKeyboardController", "Lcom/google/android/yzc;", "s", "LocalTextToolbar", "t", "LocalUriHandler", "Lcom/google/android/p7e;", "u", "LocalViewConfiguration", "Landroidx/compose/ui/platform/a0;", "v", "LocalWindowInfo", "Lcom/google/android/qe9;", "LocalPointerIconService", "", "x", "LocalProvidableScrollCaptureInProgress", "y", "LocalCursorBlinkEnabled", "LocalLocaleList", "LocalScrollCaptureInProgress", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CompositionLocalsKt {
    private static final ks9<e6> a = fs1.j(new Function0<e6>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAccessibilityManager$1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e6 invoke() {
            return null;
        }
    });
    private static final ks9<ga0> b = fs1.j(new Function0<ga0>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofill$1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ga0 invoke() {
            return null;
        }
    });
    private static final ks9<qa0> c = fs1.j(new Function0<qa0>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofillTree$1
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final qa0 invoke() throws KotlinNothingValueException {
            CompositionLocalsKt.w("LocalAutofillTree");
            throw new KotlinNothingValueException();
        }
    });
    private static final ks9<androidx.compose.ui.autofill.b> d = fs1.j(new Function0<androidx.compose.ui.autofill.b>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofillManager$1
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.autofill.b invoke() throws KotlinNothingValueException {
            CompositionLocalsKt.w("LocalAutofillManager");
            throw new KotlinNothingValueException();
        }
    });
    private static final ks9<kf1> e = fs1.j(new Function0<kf1>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalClipboardManager$1
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kf1 invoke() throws KotlinNothingValueException {
            CompositionLocalsKt.w("LocalClipboardManager");
            throw new KotlinNothingValueException();
        }
    });
    private static final ks9<jf1> f = fs1.j(new Function0<jf1>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalClipboard$1
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final jf1 invoke() throws KotlinNothingValueException {
            CompositionLocalsKt.w("LocalClipboard");
            throw new KotlinNothingValueException();
        }
    });
    private static final ks9<i05> g = fs1.j(new Function0<i05>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalGraphicsContext$1
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i05 invoke() throws KotlinNothingValueException {
            CompositionLocalsKt.w("LocalGraphicsContext");
            throw new KotlinNothingValueException();
        }
    });
    private static final ks9<f43> h = fs1.j(new Function0<f43>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalDensity$1
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f43 invoke() throws KotlinNothingValueException {
            CompositionLocalsKt.w("LocalDensity");
            throw new KotlinNothingValueException();
        }
    });
    private static final ks9<ok4> i = fs1.j(new Function0<ok4>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFocusManager$1
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ok4 invoke() throws KotlinNothingValueException {
            CompositionLocalsKt.w("LocalFocusManager");
            throw new KotlinNothingValueException();
        }
    });
    private static final ks9<androidx.compose.ui.text.font.k.b> j = fs1.j(new Function0<androidx.compose.ui.text.font.k.b>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFontLoader$1
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.text.font.k.b invoke() throws KotlinNothingValueException {
            CompositionLocalsKt.w("LocalFontLoader");
            throw new KotlinNothingValueException();
        }
    });
    private static final ks9<androidx.compose.ui.text.font.l.b> k = fs1.j(new Function0<androidx.compose.ui.text.font.l.b>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFontFamilyResolver$1
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.text.font.l.b invoke() throws KotlinNothingValueException {
            CompositionLocalsKt.w("LocalFontFamilyResolver");
            throw new KotlinNothingValueException();
        }
    });
    private static final ks9<c65> l = fs1.j(new Function0<c65>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalHapticFeedback$1
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c65 invoke() throws KotlinNothingValueException {
            CompositionLocalsKt.w("LocalHapticFeedback");
            throw new KotlinNothingValueException();
        }
    });
    private static final ks9<jy5> m = fs1.j(new Function0<jy5>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalInputModeManager$1
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final jy5 invoke() throws KotlinNothingValueException {
            CompositionLocalsKt.w("LocalInputManager");
            throw new KotlinNothingValueException();
        }
    });
    private static final ks9<LayoutDirection> n = fs1.j(new Function0<LayoutDirection>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalLayoutDirection$1
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LayoutDirection invoke() throws KotlinNothingValueException {
            CompositionLocalsKt.w("LocalLayoutDirection");
            throw new KotlinNothingValueException();
        }
    });
    private static final ks9<LocaleList> o = fs1.j(new Function0<LocaleList>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalProvidableLocaleList$1
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LocaleList invoke() throws KotlinNothingValueException {
            CompositionLocalsKt.w("LocalProvidableLocaleList");
            throw new KotlinNothingValueException();
        }
    });
    private static final zr1<e77> p = fs1.i(new Function1<as1, e77>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalLocale$1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e77 invoke(as1 as1Var) {
            return (e77) kotlin.collections.m.y0((Iterable) as1Var.L(CompositionLocalsKt.n()));
        }
    });
    private static final ks9<dxc> q = fs1.j(new Function0<dxc>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalTextInputService$1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final dxc invoke() {
            return null;
        }
    });
    private static final ks9<hyb> r = fs1.j(new Function0<hyb>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalSoftwareKeyboardController$1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final hyb invoke() {
            return null;
        }
    });
    private static final ks9<yzc> s = fs1.j(new Function0<yzc>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalTextToolbar$1
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final yzc invoke() throws KotlinNothingValueException {
            CompositionLocalsKt.w("LocalTextToolbar");
            throw new KotlinNothingValueException();
        }
    });
    private static final ks9<cvd> t = fs1.j(new Function0<cvd>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalUriHandler$1
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final cvd invoke() throws KotlinNothingValueException {
            CompositionLocalsKt.w("LocalUriHandler");
            throw new KotlinNothingValueException();
        }
    });
    private static final ks9<p7e> u = fs1.j(new Function0<p7e>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalViewConfiguration$1
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p7e invoke() throws KotlinNothingValueException {
            CompositionLocalsKt.w("LocalViewConfiguration");
            throw new KotlinNothingValueException();
        }
    });
    private static final ks9<a0> v = fs1.j(new Function0<a0>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalWindowInfo$1
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a0 invoke() throws KotlinNothingValueException {
            CompositionLocalsKt.w("LocalWindowInfo");
            throw new KotlinNothingValueException();
        }
    });
    private static final ks9<qe9> w = fs1.j(new Function0<qe9>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalPointerIconService$1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final qe9 invoke() {
            return null;
        }
    });
    private static final ks9<Boolean> x = fs1.h(null, new Function0<Boolean>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalProvidableScrollCaptureInProgress$1
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Boolean m50invoke() {
            return Boolean.FALSE;
        }
    }, 1, null);
    private static final ks9<Boolean> y = fs1.j(new Function0<Boolean>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalCursorBlinkEnabled$1
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Boolean m49invoke() {
            return Boolean.TRUE;
        }
    });

    public static final void a(final androidx.compose.ui.node.m mVar, final cvd cvdVar, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, androidx.compose.p004runtime.d dVar, final int i2) {
        int i3;
        androidx.compose.p004runtime.d dVarF = dVar.F(1925803616);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? dVarF.x(mVar) : dVarF.T(mVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? dVarF.x(cvdVar) : dVarF.T(cvdVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dVarF.T(function2) ? 256 : 128;
        }
        if (dVarF.g((i3 & 147) != 146, i3 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(1925803616, i3, -1, "androidx.compose.ui.platform.ProvideCommonCompositionLocals (CompositionLocals.kt:235)");
            }
            fs1.d(new os9[]{a.d(mVar.getAccessibilityManager()), b.d(mVar.getAutofill()), d.d(mVar.getAutofillManager()), c.d(mVar.getAutofillTree()), e.d(mVar.getClipboardManager()), f.d(mVar.getClipboard()), h.d(mVar.getDensity()), i.d(mVar.getFocusOwner()), j.e(mVar.getFontLoader()), k.e(mVar.getFontFamilyResolver()), l.d(mVar.getHapticFeedBack()), m.d(mVar.getInputModeManager()), n.d(mVar.getLayoutDirection()), q.d(mVar.getTextInputService()), r.d(mVar.getSoftwareKeyboardController()), s.d(mVar.getTextToolbar()), t.d(cvdVar), u.d(mVar.getViewConfiguration()), v.d(mVar.getWindowInfo()), w.d(mVar.getPointerIconService()), g.d(mVar.getGraphicsContext()), s67.c().d(mVar.getRetainedValuesStore()), o.d(mVar.getLocaleList())}, function2, dVarF, ((i3 >> 3) & 112) | os9.i);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$ProvideCommonCompositionLocals$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(androidx.compose.p004runtime.d dVar2, int i4) {
                    CompositionLocalsKt.a(mVar, cvdVar, function2, dVar2, saa.a(i2 | 1));
                }
            });
        }
    }

    public static final ks9<e6> c() {
        return a;
    }

    public static final ks9<jf1> d() {
        return f;
    }

    public static final ks9<kf1> e() {
        return e;
    }

    public static final ks9<Boolean> f() {
        return y;
    }

    public static final ks9<f43> g() {
        return h;
    }

    public static final ks9<ok4> h() {
        return i;
    }

    public static final ks9<androidx.compose.ui.text.font.l.b> i() {
        return k;
    }

    public static final ks9<i05> j() {
        return g;
    }

    public static final ks9<c65> k() {
        return l;
    }

    public static final ks9<jy5> l() {
        return m;
    }

    public static final ks9<LayoutDirection> m() {
        return n;
    }

    public static final zr1<LocaleList> n() {
        return o;
    }

    public static final ks9<qe9> o() {
        return w;
    }

    public static final ks9<Boolean> p() {
        return x;
    }

    public static final zr1<Boolean> q() {
        return x;
    }

    public static final ks9<hyb> r() {
        return r;
    }

    public static final ks9<yzc> s() {
        return s;
    }

    public static final ks9<cvd> t() {
        return t;
    }

    public static final ks9<p7e> u() {
        return u;
    }

    public static final ks9<a0> v() {
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void w(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
