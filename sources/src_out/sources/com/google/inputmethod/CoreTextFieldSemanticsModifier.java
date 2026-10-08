package com.google.inputmethod;

import androidx.compose.p001foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.focus.f;
import androidx.compose.ui.text.input.ImeOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.j92, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b%\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b\f\u00104R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006H"}, d2 = {"Lcom/google/android/j92;", "Lcom/google/android/uy7;", "Lcom/google/android/x92;", "Lcom/google/android/jed;", "transformedText", "Lcom/google/android/cwc;", "value", "Lcom/google/android/k07;", "state", "", "readOnly", "enabled", "isPassword", "Lcom/google/android/zn8;", "offsetMapping", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "Landroidx/compose/ui/text/input/b;", "imeOptions", "Landroidx/compose/ui/focus/f;", "focusRequester", "<init>", "(Lcom/google/android/jed;Lcom/google/android/cwc;Lcom/google/android/k07;ZZZLcom/google/android/zn8;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/b;Landroidx/compose/ui/focus/f;)V", "d", "()Lcom/google/android/x92;", "node", "", "e", "(Lcom/google/android/x92;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/android/jed;", "getTransformedText", "()Lcom/google/android/jed;", "Lcom/google/android/cwc;", "getValue", "()Lcom/google/android/cwc;", "f", "Lcom/google/android/k07;", "getState", "()Lcom/google/android/k07;", "g", "Z", "getReadOnly", "()Z", "h", "getEnabled", "i", "j", "Lcom/google/android/zn8;", "getOffsetMapping", "()Lcom/google/android/zn8;", "k", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "l", "Landroidx/compose/ui/text/input/b;", "getImeOptions", "()Landroidx/compose/ui/text/input/b;", "m", "Landroidx/compose/ui/focus/f;", "getFocusRequester", "()Landroidx/compose/ui/focus/f;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CoreTextFieldSemanticsModifier extends uy7<x92> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final TransformedText transformedText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final TextFieldValue value;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final k07 state;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final boolean readOnly;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final boolean enabled;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private final boolean isPassword;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    private final zn8 offsetMapping;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    private final TextFieldSelectionManager manager;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    private final ImeOptions imeOptions;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    private final f focusRequester;

    public CoreTextFieldSemanticsModifier(TransformedText transformedText, TextFieldValue textFieldValue, k07 k07Var, boolean z, boolean z2, boolean z3, zn8 zn8Var, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, f fVar) {
        this.transformedText = transformedText;
        this.value = textFieldValue;
        this.state = k07Var;
        this.readOnly = z;
        this.enabled = z2;
        this.isPassword = z3;
        this.offsetMapping = zn8Var;
        this.manager = textFieldSelectionManager;
        this.imeOptions = imeOptions;
        this.focusRequester = fVar;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public x92 a() {
        return new x92(this.transformedText, this.value, this.state, this.readOnly, this.enabled, this.isPassword, this.offsetMapping, this.manager, this.imeOptions, this.focusRequester);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(x92 node) {
        node.S3(this.transformedText, this.value, this.state, this.readOnly, this.enabled, this.isPassword, this.offsetMapping, this.manager, this.imeOptions, this.focusRequester);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoreTextFieldSemanticsModifier)) {
            return false;
        }
        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = (CoreTextFieldSemanticsModifier) other;
        return Intrinsics.e(this.transformedText, coreTextFieldSemanticsModifier.transformedText) && Intrinsics.e(this.value, coreTextFieldSemanticsModifier.value) && Intrinsics.e(this.state, coreTextFieldSemanticsModifier.state) && this.readOnly == coreTextFieldSemanticsModifier.readOnly && this.enabled == coreTextFieldSemanticsModifier.enabled && this.isPassword == coreTextFieldSemanticsModifier.isPassword && Intrinsics.e(this.offsetMapping, coreTextFieldSemanticsModifier.offsetMapping) && Intrinsics.e(this.manager, coreTextFieldSemanticsModifier.manager) && Intrinsics.e(this.imeOptions, coreTextFieldSemanticsModifier.imeOptions) && Intrinsics.e(this.focusRequester, coreTextFieldSemanticsModifier.focusRequester);
    }

    public int hashCode() {
        return (((((((((((((((((this.transformedText.hashCode() * 31) + this.value.hashCode()) * 31) + this.state.hashCode()) * 31) + Boolean.hashCode(this.readOnly)) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.isPassword)) * 31) + this.offsetMapping.hashCode()) * 31) + this.manager.hashCode()) * 31) + this.imeOptions.hashCode()) * 31) + this.focusRequester.hashCode();
    }

    public String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.transformedText + ", value=" + this.value + ", state=" + this.state + ", readOnly=" + this.readOnly + ", enabled=" + this.enabled + ", isPassword=" + this.isPassword + ", offsetMapping=" + this.offsetMapping + ", manager=" + this.manager + ", imeOptions=" + this.imeOptions + ", focusRequester=" + this.focusRequester + ')';
    }
}
