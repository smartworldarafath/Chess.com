package com.google.inputmethod;

import androidx.compose.p001foundation.text.HandleState;
import androidx.compose.p001foundation.text.m;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.b;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.input.a;
import androidx.compose.ui.text.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJi\u0010!\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00106\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R$\u0010>\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R+\u0010E\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010\f\"\u0004\bC\u0010DR+\u0010L\u001a\u00020F2\u0006\u0010?\u001a\u00020F8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010A\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010NR\u001c\u0010S\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Q0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010AR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR+\u0010^\u001a\u00020Y2\u0006\u0010?\u001a\u00020Y8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bZ\u0010A\u001a\u0004\bG\u0010[\"\u0004\b\\\u0010]R+\u0010a\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010A\u001a\u0004\b_\u0010\f\"\u0004\b`\u0010DR+\u0010e\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bb\u0010A\u001a\u0004\bc\u0010\f\"\u0004\bd\u0010DR+\u0010i\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bf\u0010A\u001a\u0004\bg\u0010\f\"\u0004\bh\u0010DR+\u0010l\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010A\u001a\u0004\bj\u0010\f\"\u0004\bk\u0010DR$\u0010q\u001a\u00020\n2\u0006\u0010m\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010\fR+\u0010u\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\br\u0010A\u001a\u0004\bs\u0010\f\"\u0004\bt\u0010DR\u0014\u0010y\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR+\u0010{\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010A\u001a\u0004\b8\u0010\f\"\u0004\bz\u0010DR+\u0010~\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b|\u0010A\u001a\u0004\bZ\u0010\f\"\u0004\b}\u0010DR$\u0010\u0081\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R%\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0006¢\u0006\u000e\n\u0005\bj\u0010\u0080\u0001\u001a\u0005\bw\u0010\u0082\u0001R'\u0010\u0084\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0083\u0001\u0012\u0004\u0012\u00020\u00190\u00178\u0006¢\u0006\u000e\n\u0005\b_\u0010\u0080\u0001\u001a\u0005\bn\u0010\u0082\u0001R'\u0010\u0085\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0083\u0001\u0012\u0004\u0012\u00020\n0\u00178\u0006¢\u0006\u000e\n\u0005\bg\u0010\u0080\u0001\u001a\u0005\br\u0010\u0082\u0001R\u001b\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0006¢\u0006\u000e\n\u0005\bc\u0010\u0087\u0001\u001a\u0005\bR\u0010\u0088\u0001R&\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b%\u0010\u008a\u0001\u001a\u0005\b|\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R1\u0010\u0090\u0001\u001a\u00030\u008e\u00012\u0007\u0010?\u001a\u00030\u008e\u00018F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0004\bU\u0010A\u001a\u0005\b\u007f\u0010\u008b\u0001\"\u0006\b\u008f\u0001\u0010\u008d\u0001R1\u0010\u0091\u0001\u001a\u00030\u008e\u00012\u0007\u0010?\u001a\u00030\u008e\u00018F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0004\b\u000b\u0010A\u001a\u0005\b@\u0010\u008b\u0001\"\u0006\b\u008a\u0001\u0010\u008d\u0001R,\u0010\u0095\u0001\u001a\u0004\u0018\u00010M2\b\u0010m\u001a\u0004\u0018\u00010M8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bb\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R,\u0010\u0099\u0001\u001a\u0004\u0018\u00010Q2\b\u0010m\u001a\u0004\u0018\u00010Q8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bf\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001¨\u0006\u009a\u0001"}, d2 = {"Lcom/google/android/k07;", "", "Lcom/google/android/asc;", "textDelegate", "Lcom/google/android/qaa;", "recomposeScope", "Lcom/google/android/hyb;", "keyboardController", "<init>", "(Lcom/google/android/asc;Lcom/google/android/qaa;Lcom/google/android/hyb;)V", "", "B", "()Z", "Landroidx/compose/ui/text/b;", "untransformedText", "visualText", "Landroidx/compose/ui/text/y;", "textStyle", "softWrap", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/text/font/l$b;", "fontFamilyResolver", "Lkotlin/Function1;", "Lcom/google/android/cwc;", "", "onValueChange", "Landroidx/compose/foundation/text/m;", "keyboardActions", "Lcom/google/android/ok4;", "focusManager", "Lcom/google/android/ei1;", "selectionBackgroundColor", "X", "(Landroidx/compose/ui/text/b;Landroidx/compose/ui/text/b;Landroidx/compose/ui/text/y;ZLcom/google/android/f43;Landroidx/compose/ui/text/font/l$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/m;Lcom/google/android/ok4;J)V", "a", "Lcom/google/android/asc;", "z", "()Lcom/google/android/asc;", "setTextDelegate", "(Lcom/google/android/asc;)V", "b", "Lcom/google/android/qaa;", "getRecomposeScope", "()Lcom/google/android/qaa;", "c", "Lcom/google/android/hyb;", "l", "()Lcom/google/android/hyb;", "Lcom/google/android/fn3;", "d", "Lcom/google/android/fn3;", "s", "()Lcom/google/android/fn3;", "processor", "Lcom/google/android/hxc;", "e", "Lcom/google/android/hxc;", "j", "()Lcom/google/android/hxc;", "N", "(Lcom/google/android/hxc;)V", "inputSession", "<set-?>", "f", "Lcom/google/android/o58;", "h", "L", "(Z)V", "hasFocus", "Lcom/google/android/ff3;", "g", "o", "()F", "R", "(F)V", "minHeightForSingleLineField", "Lcom/google/android/kn6;", "Lcom/google/android/kn6;", "_layoutCoordinates", "Lcom/google/android/o58;", "Lcom/google/android/wxc;", "i", "layoutResultState", "Landroidx/compose/ui/text/b;", "A", "()Landroidx/compose/ui/text/b;", "setUntransformedText", "(Landroidx/compose/ui/text/b;)V", "Landroidx/compose/foundation/text/HandleState;", "k", "()Landroidx/compose/foundation/text/HandleState;", "K", "(Landroidx/compose/foundation/text/HandleState;)V", "handleState", "w", "U", "showFloatingToolbar", "m", "y", "W", "showSelectionHandleStart", "n", "x", "V", "showSelectionHandleEnd", "v", "T", "showCursorHandle", "value", "p", "Z", "D", "isLayoutResultStale", "q", "C", "M", "isInTouchMode", "Lcom/google/android/mj6;", "r", "Lcom/google/android/mj6;", "keyboardActionRunner", "I", "autofillHighlightOn", "t", "O", "justAutofilled", "u", "Lkotlin/jvm/functions/Function1;", "onValueChangeOriginal", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/text/input/a;", "onImeActionPerformed", "onImeActionPerformedWithResult", "Lcom/google/android/q09;", "Lcom/google/android/q09;", "()Lcom/google/android/q09;", "highlightPaint", "J", "()J", "setSelectionBackgroundColor-8_81llA", "(J)V", "Landroidx/compose/ui/text/x;", "S", "selectionPreviewHighlightRange", "deletionPreviewHighlightRange", "()Lcom/google/android/kn6;", "P", "(Lcom/google/android/kn6;)V", "layoutCoordinates", "()Lcom/google/android/wxc;", "Q", "(Lcom/google/android/wxc;)V", "layoutResult", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k07 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final o58 selectionPreviewHighlightRange;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final o58 deletionPreviewHighlightRange;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private asc textDelegate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final qaa recomposeScope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final hyb keyboardController;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final fn3 processor = new fn3();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private hxc inputSession;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final o58 hasFocus;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final o58 minHeightForSingleLineField;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private kn6 _layoutCoordinates;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final o58<wxc> layoutResultState;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private b untransformedText;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final o58 handleState;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final o58 showFloatingToolbar;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final o58 showSelectionHandleStart;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final o58 showSelectionHandleEnd;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final o58 showCursorHandle;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean isLayoutResultStale;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final o58 isInTouchMode;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final mj6 keyboardActionRunner;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final o58 autofillHighlightOn;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final o58 justAutofilled;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private Function1<? super TextFieldValue, Unit> onValueChangeOriginal;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final Function1<TextFieldValue, Unit> onValueChange;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final Function1<a, Unit> onImeActionPerformed;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final Function1<a, Boolean> onImeActionPerformedWithResult;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final q09 highlightPaint;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private long selectionBackgroundColor;

    public k07(asc ascVar, qaa qaaVar, hyb hybVar) {
        this.textDelegate = ascVar;
        this.recomposeScope = qaaVar;
        this.keyboardController = hybVar;
        Boolean bool = Boolean.FALSE;
        this.hasFocus = s0.e(bool, null, 2, null);
        this.minHeightForSingleLineField = s0.e(ff3.e(ff3.i(0)), null, 2, null);
        this.layoutResultState = s0.e(null, null, 2, null);
        this.handleState = s0.e(HandleState.None, null, 2, null);
        this.showFloatingToolbar = s0.e(bool, null, 2, null);
        this.showSelectionHandleStart = s0.e(bool, null, 2, null);
        this.showSelectionHandleEnd = s0.e(bool, null, 2, null);
        this.showCursorHandle = s0.e(bool, null, 2, null);
        this.isLayoutResultStale = true;
        this.isInTouchMode = s0.e(Boolean.TRUE, null, 2, null);
        this.keyboardActionRunner = new mj6(hybVar);
        this.autofillHighlightOn = s0.e(bool, null, 2, null);
        this.justAutofilled = s0.e(bool, null, 2, null);
        this.onValueChangeOriginal = new Function1() { // from class: com.google.android.g07
            public final Object invoke(Object obj) {
                return k07.H((TextFieldValue) obj);
            }
        };
        this.onValueChange = new Function1() { // from class: com.google.android.h07
            public final Object invoke(Object obj) {
                return k07.G(this.a, (TextFieldValue) obj);
            }
        };
        this.onImeActionPerformed = new Function1() { // from class: com.google.android.i07
            public final Object invoke(Object obj) {
                return k07.E(this.a, (a) obj);
            }
        };
        this.onImeActionPerformedWithResult = new Function1() { // from class: com.google.android.j07
            public final Object invoke(Object obj) {
                return Boolean.valueOf(k07.F(this.a, (a) obj));
            }
        };
        this.highlightPaint = dm.a();
        this.selectionBackgroundColor = ei1.INSTANCE.i();
        x.Companion companion = x.INSTANCE;
        this.selectionPreviewHighlightRange = s0.e(x.b(companion.a()), null, 2, null);
        this.deletionPreviewHighlightRange = s0.e(x.b(companion.a()), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(k07 k07Var, a aVar) {
        k07Var.keyboardActionRunner.d(aVar.getValue());
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean F(k07 k07Var, a aVar) {
        return k07Var.keyboardActionRunner.d(aVar.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(k07 k07Var, TextFieldValue textFieldValue) {
        String strM = textFieldValue.m();
        b bVar = k07Var.untransformedText;
        if (!Intrinsics.e(strM, bVar != null ? bVar.getText() : null)) {
            k07Var.K(HandleState.None);
            if (k07Var.k()) {
                k07Var.O(false);
            } else {
                k07Var.I(false);
            }
        }
        x.Companion companion = x.INSTANCE;
        k07Var.S(companion.a());
        k07Var.J(companion.a());
        k07Var.onValueChangeOriginal.invoke(textFieldValue);
        k07Var.recomposeScope.invalidate();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(TextFieldValue textFieldValue) {
        return Unit.a;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final b getUntransformedText() {
        return this.untransformedText;
    }

    public final boolean B() {
        return (x.h(u()) && x.h(f())) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean C() {
        return ((Boolean) this.isInTouchMode.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final boolean getIsLayoutResultStale() {
        return this.isLayoutResultStale;
    }

    public final void I(boolean z) {
        this.autofillHighlightOn.setValue(Boolean.valueOf(z));
    }

    public final void J(long j) {
        this.deletionPreviewHighlightRange.setValue(x.b(j));
    }

    public final void K(HandleState handleState) {
        this.handleState.setValue(handleState);
    }

    public final void L(boolean z) {
        this.hasFocus.setValue(Boolean.valueOf(z));
    }

    public final void M(boolean z) {
        this.isInTouchMode.setValue(Boolean.valueOf(z));
    }

    public final void N(hxc hxcVar) {
        this.inputSession = hxcVar;
    }

    public final void O(boolean z) {
        this.justAutofilled.setValue(Boolean.valueOf(z));
    }

    public final void P(kn6 kn6Var) {
        this._layoutCoordinates = kn6Var;
    }

    public final void Q(wxc wxcVar) {
        this.layoutResultState.setValue(wxcVar);
        this.isLayoutResultStale = false;
    }

    public final void R(float f) {
        this.minHeightForSingleLineField.setValue(ff3.e(f));
    }

    public final void S(long j) {
        this.selectionPreviewHighlightRange.setValue(x.b(j));
    }

    public final void T(boolean z) {
        this.showCursorHandle.setValue(Boolean.valueOf(z));
    }

    public final void U(boolean z) {
        this.showFloatingToolbar.setValue(Boolean.valueOf(z));
    }

    public final void V(boolean z) {
        this.showSelectionHandleEnd.setValue(Boolean.valueOf(z));
    }

    public final void W(boolean z) {
        this.showSelectionHandleStart.setValue(Boolean.valueOf(z));
    }

    public final void X(b untransformedText, b visualText, TextStyle textStyle, boolean softWrap, f43 density, l.b fontFamilyResolver, Function1<? super TextFieldValue, Unit> onValueChange, m keyboardActions, ok4 focusManager, long selectionBackgroundColor) {
        this.onValueChangeOriginal = onValueChange;
        this.selectionBackgroundColor = selectionBackgroundColor;
        mj6 mj6Var = this.keyboardActionRunner;
        mj6Var.f(keyboardActions);
        mj6Var.e(focusManager);
        this.untransformedText = untransformedText;
        asc ascVarC = csc.c(this.textDelegate, visualText, textStyle, density, fontFamilyResolver, softWrap, 0, 0, 0, kotlin.collections.m.p(), 448, null);
        if (this.textDelegate != ascVarC) {
            this.isLayoutResultStale = true;
        }
        this.textDelegate = ascVarC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e() {
        return ((Boolean) this.autofillHighlightOn.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long f() {
        return ((x) this.deletionPreviewHighlightRange.getValue()).getPackedValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final HandleState g() {
        return (HandleState) this.handleState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean h() {
        return ((Boolean) this.hasFocus.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final q09 getHighlightPaint() {
        return this.highlightPaint;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final hxc getInputSession() {
        return this.inputSession;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k() {
        return ((Boolean) this.justAutofilled.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final hyb getKeyboardController() {
        return this.keyboardController;
    }

    public final kn6 m() {
        kn6 kn6Var = this._layoutCoordinates;
        if (kn6Var == null || !kn6Var.b()) {
            return null;
        }
        return kn6Var;
    }

    public final wxc n() {
        return this.layoutResultState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float o() {
        return ((ff3) this.minHeightForSingleLineField.getValue()).getValue();
    }

    public final Function1<a, Unit> p() {
        return this.onImeActionPerformed;
    }

    public final Function1<a, Boolean> q() {
        return this.onImeActionPerformedWithResult;
    }

    public final Function1<TextFieldValue, Unit> r() {
        return this.onValueChange;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final fn3 getProcessor() {
        return this.processor;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final long getSelectionBackgroundColor() {
        return this.selectionBackgroundColor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long u() {
        return ((x) this.selectionPreviewHighlightRange.getValue()).getPackedValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean v() {
        return ((Boolean) this.showCursorHandle.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean w() {
        return ((Boolean) this.showFloatingToolbar.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean x() {
        return ((Boolean) this.showSelectionHandleEnd.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean y() {
        return ((Boolean) this.showSelectionHandleStart.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final asc getTextDelegate() {
        return this.textDelegate;
    }
}
