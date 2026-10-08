package com.google.inputmethod;

import androidx.compose.p001foundation.text.CoreTextFieldKt;
import androidx.compose.p001foundation.text.r;
import androidx.compose.p001foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.autofill.c;
import androidx.compose.ui.focus.f;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.text.b;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.a;
import androidx.compose.ui.text.input.d;
import androidx.compose.ui.text.x;
import com.google.android.ps4;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b;\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001d\u001a\u00020\u0019*\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ]\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010\u0016R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00103\u001a\u0004\b9\u00105\"\u0004\b:\u00107R\"\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00103\u001a\u0004\b\f\u00105\"\u0004\b<\u00107R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u00105¨\u0006W"}, d2 = {"Lcom/google/android/x92;", "Lcom/google/android/k33;", "Lcom/google/android/bfb;", "Lcom/google/android/jed;", "transformedText", "Lcom/google/android/cwc;", "value", "Lcom/google/android/k07;", "state", "", "readOnly", "enabled", "isPassword", "Lcom/google/android/zn8;", "offsetMapping", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "Landroidx/compose/ui/text/input/b;", "imeOptions", "Landroidx/compose/ui/focus/f;", "focusRequester", "<init>", "(Lcom/google/android/jed;Lcom/google/android/cwc;Lcom/google/android/k07;ZZZLcom/google/android/zn8;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/b;Landroidx/compose/ui/focus/f;)V", "", "text", "", "R3", "(Lcom/google/android/k07;Ljava/lang/String;ZZ)V", "Lcom/google/android/nfb;", "H0", "(Lcom/google/android/nfb;)V", "S3", "r", "Lcom/google/android/jed;", "getTransformedText", "()Lcom/google/android/jed;", "setTransformedText", "(Lcom/google/android/jed;)V", "s", "Lcom/google/android/cwc;", "getValue", "()Lcom/google/android/cwc;", "setValue", "(Lcom/google/android/cwc;)V", "t", "Lcom/google/android/k07;", "getState", "()Lcom/google/android/k07;", "setState", "(Lcom/google/android/k07;)V", "u", "Z", "getReadOnly", "()Z", "setReadOnly", "(Z)V", "v", "getEnabled", "setEnabled", "w", "setPassword", "x", "Lcom/google/android/zn8;", "getOffsetMapping", "()Lcom/google/android/zn8;", "setOffsetMapping", "(Lcom/google/android/zn8;)V", "y", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "setManager", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "z", "Landroidx/compose/ui/text/input/b;", "getImeOptions", "()Landroidx/compose/ui/text/input/b;", "setImeOptions", "(Landroidx/compose/ui/text/input/b;)V", "A", "Landroidx/compose/ui/focus/f;", "getFocusRequester", "()Landroidx/compose/ui/focus/f;", "setFocusRequester", "(Landroidx/compose/ui/focus/f;)V", "h1", "shouldMergeDescendantSemantics", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x92 extends k33 implements bfb {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private f focusRequester;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private TransformedText transformedText;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private TextFieldValue value;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private k07 state;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private boolean readOnly;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private boolean enabled;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private boolean isPassword;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private zn8 offsetMapping;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private TextFieldSelectionManager manager;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private ImeOptions imeOptions;

    public x92(TransformedText transformedText, TextFieldValue textFieldValue, k07 k07Var, boolean z, boolean z2, boolean z3, zn8 zn8Var, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, f fVar) {
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
        textFieldSelectionManager.O0(new Function0() { // from class: com.google.android.o92
            public final Object invoke() {
                return x92.F3(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F3(x92 x92Var) {
        y23.k(x92Var);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean G3(x92 x92Var, t94 t94Var) {
        x92Var.state.O(true);
        x92Var.state.I(true);
        k07 k07Var = x92Var.state;
        CharSequence charSequenceA = t94Var.a();
        Intrinsics.h(charSequenceA, "null cannot be cast to non-null type kotlin.String");
        x92Var.R3(k07Var, (String) charSequenceA, x92Var.readOnly, x92Var.enabled);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean H3(x92 x92Var) {
        x92Var.manager.I();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean I3(x92 x92Var) {
        x92Var.manager.w0();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean J3(x92 x92Var, List list) {
        if (x92Var.state.n() == null) {
            return false;
        }
        wxc wxcVarN = x92Var.state.n();
        Intrinsics.g(wxcVarN);
        list.add(wxcVarN.getValue());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean K3(x92 x92Var, b bVar) {
        x92Var.R3(x92Var.state, bVar.getText(), x92Var.readOnly, x92Var.enabled);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean L3(x92 x92Var, nfb nfbVar, b bVar) {
        if (x92Var.readOnly || !x92Var.enabled) {
            return false;
        }
        hxc inputSession = x92Var.state.getInputSession();
        if (inputSession != null) {
            r.INSTANCE.j(m.s(new cn3[]{new wa4(), new CommitTextCommand(bVar, 1)}), x92Var.state.getProcessor(), x92Var.state.r(), inputSession);
        } else {
            x92Var.state.r().invoke(new TextFieldValue(h.Z0(x92Var.value.m(), x.n(x92Var.value.getSelection()), x.i(x92Var.value.getSelection()), bVar).toString(), zyc.a(x.n(x92Var.value.getSelection()) + bVar.length()), (x) null, 4, (DefaultConstructorMarker) null));
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean M3(x92 x92Var, int i, int i2, boolean z) {
        if (!z) {
            i = x92Var.offsetMapping.a(i);
        }
        if (!z) {
            i2 = x92Var.offsetMapping.a(i2);
        }
        if (!x92Var.enabled) {
            return false;
        }
        if (i == x.n(x92Var.value.getSelection()) && i2 == x.i(x92Var.value.getSelection())) {
            return false;
        }
        if (Math.min(i, i2) < 0 || Math.max(i, i2) > x92Var.value.getText().length()) {
            x92Var.manager.O();
            return false;
        }
        if (z || i == i2) {
            x92Var.manager.O();
        } else {
            TextFieldSelectionManager.N(x92Var.manager, false, 1, null);
        }
        x92Var.state.r().invoke(new TextFieldValue(x92Var.value.getText(), zyc.b(i, i2), (x) null, 4, (DefaultConstructorMarker) null));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean N3(x92 x92Var) {
        x92Var.state.p().invoke(a.j(x92Var.imeOptions.getImeAction()));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean O3(x92 x92Var) {
        CoreTextFieldKt.h0(x92Var.state, x92Var.focusRequester, !x92Var.readOnly);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean P3(x92 x92Var) {
        TextFieldSelectionManager.N(x92Var.manager, false, 1, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Q3(x92 x92Var) {
        TextFieldSelectionManager.D(x92Var.manager, false, 1, null);
        return true;
    }

    private final void R3(k07 state, String text, boolean readOnly, boolean enabled) {
        if (readOnly || !enabled) {
            return;
        }
        hxc inputSession = state.getInputSession();
        if (inputSession != null) {
            r.INSTANCE.j(m.s(new cn3[]{new w33(), new CommitTextCommand(text, 1)}), state.getProcessor(), state.r(), inputSession);
        } else {
            state.r().invoke(new TextFieldValue(text, zyc.a(text.length()), (x) null, 4, (DefaultConstructorMarker) null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T3(x92 x92Var) {
        y23.k(x92Var);
        return Unit.a;
    }

    @Override // com.google.inputmethod.bfb
    public void H0(final nfb nfbVar) {
        SemanticsPropertiesKt.j0(nfbVar, this.value.getText());
        SemanticsPropertiesKt.f0(nfbVar, this.transformedText.getText());
        SemanticsPropertiesKt.A0(nfbVar, this.value.getSelection());
        SemanticsPropertiesKt.a0(nfbVar, c.INSTANCE.a());
        t94 t94VarB = u94.b(t94.INSTANCE, this.value.getText());
        if (t94VarB != null) {
            SemanticsPropertiesKt.g0(nfbVar, t94VarB);
        }
        SemanticsPropertiesKt.z(nfbVar, null, new Function1() { // from class: com.google.android.p92
            public final Object invoke(Object obj) {
                return Boolean.valueOf(x92.G3(this.a, (t94) obj));
            }
        }, 1, null);
        int keyboardType = this.imeOptions.getKeyboardType();
        d.Companion companion = d.INSTANCE;
        if (d.n(keyboardType, companion.c())) {
            SemanticsPropertiesKt.c0(nfbVar, androidx.compose.ui.autofill.d.INSTANCE.a());
        } else if (d.n(keyboardType, companion.f()) || d.n(keyboardType, companion.e())) {
            SemanticsPropertiesKt.c0(nfbVar, androidx.compose.ui.autofill.d.INSTANCE.b());
        } else if (d.n(keyboardType, companion.g())) {
            SemanticsPropertiesKt.c0(nfbVar, androidx.compose.ui.autofill.d.INSTANCE.c());
        }
        if (!this.enabled) {
            SemanticsPropertiesKt.i(nfbVar);
        }
        if (this.isPassword) {
            SemanticsPropertiesKt.M(nfbVar);
        }
        boolean z = this.enabled && !this.readOnly;
        SemanticsPropertiesKt.e0(nfbVar, z);
        SemanticsPropertiesKt.q(nfbVar, null, new Function1() { // from class: com.google.android.r92
            public final Object invoke(Object obj) {
                return Boolean.valueOf(x92.J3(this.a, (List) obj));
            }
        }, 1, null);
        if (z) {
            SemanticsPropertiesKt.z0(nfbVar, null, new Function1() { // from class: com.google.android.s92
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(x92.K3(this.a, (b) obj));
                }
            }, 1, null);
            SemanticsPropertiesKt.v(nfbVar, null, new Function1() { // from class: com.google.android.t92
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(x92.L3(this.a, nfbVar, (b) obj));
                }
            }, 1, null);
        }
        SemanticsPropertiesKt.s0(nfbVar, null, new ps4() { // from class: com.google.android.u92
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return Boolean.valueOf(x92.M3(this.a, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue()));
            }
        }, 1, null);
        SemanticsPropertiesKt.B(nfbVar, this.imeOptions.getImeAction(), null, new Function0() { // from class: com.google.android.v92
            public final Object invoke() {
                return Boolean.valueOf(x92.N3(this.a));
            }
        }, 2, null);
        SemanticsPropertiesKt.x(nfbVar, null, new Function0() { // from class: com.google.android.w92
            public final Object invoke() {
                return Boolean.valueOf(x92.O3(this.a));
            }
        }, 1, null);
        SemanticsPropertiesKt.D(nfbVar, null, new Function0() { // from class: com.google.android.l92
            public final Object invoke() {
                return Boolean.valueOf(x92.P3(this.a));
            }
        }, 1, null);
        if (!x.h(this.value.getSelection()) && !this.isPassword) {
            SemanticsPropertiesKt.e(nfbVar, null, new Function0() { // from class: com.google.android.m92
                public final Object invoke() {
                    return Boolean.valueOf(x92.Q3(this.a));
                }
            }, 1, null);
            if (this.enabled && !this.readOnly) {
                SemanticsPropertiesKt.g(nfbVar, null, new Function0() { // from class: com.google.android.n92
                    public final Object invoke() {
                        return Boolean.valueOf(x92.H3(this.a));
                    }
                }, 1, null);
            }
        }
        if (!this.enabled || this.readOnly) {
            return;
        }
        SemanticsPropertiesKt.O(nfbVar, null, new Function0() { // from class: com.google.android.q92
            public final Object invoke() {
                return Boolean.valueOf(x92.I3(this.a));
            }
        }, 1, null);
    }

    public final void S3(TransformedText transformedText, TextFieldValue value, k07 state, boolean readOnly, boolean enabled, boolean isPassword, zn8 offsetMapping, TextFieldSelectionManager manager, ImeOptions imeOptions, f focusRequester) {
        boolean z = this.enabled;
        boolean z2 = false;
        boolean z3 = z && !this.readOnly;
        boolean z4 = this.isPassword;
        ImeOptions imeOptions2 = this.imeOptions;
        TextFieldSelectionManager textFieldSelectionManager = this.manager;
        if (enabled && !readOnly) {
            z2 = true;
        }
        this.transformedText = transformedText;
        this.value = value;
        this.state = state;
        this.readOnly = readOnly;
        this.enabled = enabled;
        this.offsetMapping = offsetMapping;
        this.manager = manager;
        this.imeOptions = imeOptions;
        this.focusRequester = focusRequester;
        if (enabled != z || z2 != z3 || !Intrinsics.e(imeOptions, imeOptions2) || isPassword != z4 || !x.h(value.getSelection())) {
            cfb.d(this);
        }
        if (Intrinsics.e(manager, textFieldSelectionManager)) {
            return;
        }
        manager.O0(new Function0() { // from class: com.google.android.k92
            public final Object invoke() {
                return x92.T3(this.a);
            }
        });
    }

    @Override // com.google.inputmethod.bfb
    /* JADX INFO: renamed from: h1 */
    public boolean getMergeDescendants() {
        return true;
    }
}
