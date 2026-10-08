package androidx.compose.p001foundation.text.input.internal;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import androidx.compose.p001foundation.text.input.internal.c;
import androidx.compose.p001foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.a;
import androidx.compose.ui.text.x;
import com.google.android.sh7;
import com.google.inputmethod.TextFieldValue;
import com.google.inputmethod.TextLayoutResult;
import com.google.inputmethod.b07;
import com.google.inputmethod.cn3;
import com.google.inputmethod.dba;
import com.google.inputmethod.ey5;
import com.google.inputmethod.gba;
import com.google.inputmethod.k07;
import com.google.inputmethod.p7e;
import com.google.inputmethod.xb9;
import com.google.inputmethod.zh7;
import com.google.inputmethod.zn8;
import com.google.inputmethod.zx5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJU\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u000e2\u0006\u0010!\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J5\u0010/\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020$¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R(\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00060\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\"\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR$\u0010J\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\"\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0N0M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010S\u001a\u0004\bT\u0010UR$\u0010]\u001a\u0004\u0018\u00010W8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bT\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0014\u0010`\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010_¨\u0006a"}, d2 = {"Landroidx/compose/foundation/text/input/internal/c;", "Lcom/google/android/xb9;", "Landroid/view/View;", "view", "Lkotlin/Function1;", "Lcom/google/android/zh7;", "", "localToScreen", "Lcom/google/android/ey5;", "inputMethodManager", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;Lcom/google/android/ey5;)V", "p", "()V", "Lcom/google/android/cwc;", "value", "Landroidx/compose/foundation/text/input/internal/b$a;", "textInputNode", "Landroidx/compose/ui/text/input/b;", "imeOptions", "", "Lcom/google/android/cn3;", "onEditCommand", "Landroidx/compose/ui/text/input/a;", "onImeActionPerformed", "q", "(Lcom/google/android/cwc;Landroidx/compose/foundation/text/input/internal/b$a;Landroidx/compose/ui/text/input/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/inputmethod/EditorInfo;", "outAttributes", "Lcom/google/android/dba;", "k", "(Landroid/view/inputmethod/EditorInfo;)Lcom/google/android/dba;", "oldValue", "newValue", "r", "(Lcom/google/android/cwc;Lcom/google/android/cwc;)V", "Lcom/google/android/gba;", "rect", "m", "(Lcom/google/android/gba;)V", "textFieldValue", "Lcom/google/android/zn8;", "offsetMapping", "Lcom/google/android/vxc;", "textLayoutResult", "innerTextFieldBounds", "decorationBoxBounds", "s", "(Lcom/google/android/cwc;Lcom/google/android/zn8;Lcom/google/android/vxc;Lcom/google/android/gba;Lcom/google/android/gba;)V", "a", "Landroid/view/View;", "getView", "()Landroid/view/View;", "b", "Lcom/google/android/ey5;", "c", "Lkotlin/jvm/functions/Function1;", "d", "Lcom/google/android/k07;", "e", "Lcom/google/android/k07;", "legacyTextFieldState", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "f", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "textFieldSelectionManager", "Lcom/google/android/p7e;", "g", "Lcom/google/android/p7e;", "viewConfiguration", "h", "Lcom/google/android/cwc;", "getState", "()Lcom/google/android/cwc;", "state", "i", "Landroidx/compose/ui/text/input/b;", "", "Ljava/lang/ref/WeakReference;", "j", "Ljava/util/List;", "ics", "Landroid/view/inputmethod/BaseInputConnection;", "Lkotlin/Lazy;", "l", "()Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "getFocusedRect$foundation", "()Landroid/graphics/Rect;", "setFocusedRect$foundation", "(Landroid/graphics/Rect;)V", "focusedRect", "Lcom/google/android/b07;", "Lcom/google/android/b07;", "cursorAnchorInfoController", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements xb9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ey5 inputMethodManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private k07 legacyTextFieldState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private TextFieldSelectionManager textFieldSelectionManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private p7e viewConfiguration;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private Rect focusedRect;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final b07 cursorAnchorInfoController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Function1<? super List<? extends cn3>, Unit> onEditCommand = new Function1() { // from class: com.google.android.l07
        public final Object invoke(Object obj) {
            return c.n((List) obj);
        }
    };

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Function1<? super androidx.compose.ui.text.input.a, Unit> onImeActionPerformed = new Function1() { // from class: com.google.android.m07
        public final Object invoke(Object obj) {
            return c.o((a) obj);
        }
    };

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private TextFieldValue state = new TextFieldValue("", x.INSTANCE.a(), (x) null, 4, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private ImeOptions imeOptions = ImeOptions.INSTANCE.a();

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private List<WeakReference<dba>> ics = new ArrayList();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Lazy baseInputConnection = kotlin.c.a(LazyThreadSafetyMode.c, new Function0() { // from class: com.google.android.n07
        public final Object invoke() {
            return c.j(this.a);
        }
    });

    @Metadata(d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"androidx/compose/foundation/text/input/internal/c$a", "Lcom/google/android/zx5;", "", "Lcom/google/android/cn3;", "editCommands", "", "d", "(Ljava/util/List;)V", "Landroidx/compose/ui/text/input/a;", "imeAction", "c", "(I)V", "Landroid/view/KeyEvent;", "event", "a", "(Landroid/view/KeyEvent;)V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "b", "(ZZZZZZ)V", "Lcom/google/android/dba;", "inputConnection", "e", "(Lcom/google/android/dba;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements zx5 {
        a() {
        }

        @Override // com.google.inputmethod.zx5
        public void a(KeyEvent event) {
            c.this.l().sendKeyEvent(event);
        }

        @Override // com.google.inputmethod.zx5
        public void b(boolean immediate, boolean monitor, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
            c.this.cursorAnchorInfoController.b(immediate, monitor, includeInsertionMarker, includeCharacterBounds, includeEditorBounds, includeLineBounds);
        }

        @Override // com.google.inputmethod.zx5
        public void c(int imeAction) {
            c.this.onImeActionPerformed.invoke(androidx.compose.ui.text.input.a.j(imeAction));
        }

        @Override // com.google.inputmethod.zx5
        public void d(List<? extends cn3> editCommands) {
            c.this.onEditCommand.invoke(editCommands);
        }

        @Override // com.google.inputmethod.zx5
        public void e(dba inputConnection) {
            int size = c.this.ics.size();
            for (int i = 0; i < size; i++) {
                if (Intrinsics.e(((WeakReference) c.this.ics.get(i)).get(), inputConnection)) {
                    c.this.ics.remove(i);
                    return;
                }
            }
        }
    }

    public c(View view, Function1<? super zh7, Unit> function1, ey5 ey5Var) {
        this.view = view;
        this.inputMethodManager = ey5Var;
        this.cursorAnchorInfoController = new b07(function1, ey5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseInputConnection j(c cVar) {
        return new BaseInputConnection(cVar.view, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection l() {
        return (BaseInputConnection) this.baseInputConnection.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(List list) {
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(androidx.compose.ui.text.input.a aVar) {
        return Unit.a;
    }

    private final void p() {
        this.inputMethodManager.c();
    }

    @Override // com.google.inputmethod.xb9
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public dba a(EditorInfo outAttributes) {
        com.google.inputmethod.EditorInfo.c(outAttributes, this.state.m(), this.state.getSelection(), this.imeOptions, null, 8, null);
        LegacyPlatformTextInputServiceAdapter_androidKt.d(outAttributes);
        dba dbaVar = new dba(this.state, new a(), this.imeOptions.getAutoCorrect(), this.legacyTextFieldState, this.textFieldSelectionManager, this.viewConfiguration);
        this.ics.add(new WeakReference<>(dbaVar));
        return dbaVar;
    }

    public final void m(gba rect) {
        Rect rect2;
        this.focusedRect = new Rect(sh7.d(rect.getLeft()), sh7.d(rect.getTop()), sh7.d(rect.getRight()), sh7.d(rect.getBottom()));
        if (!this.ics.isEmpty() || (rect2 = this.focusedRect) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new Rect(rect2));
    }

    public final void q(TextFieldValue value, b.a textInputNode, ImeOptions imeOptions, Function1<? super List<? extends cn3>, Unit> onEditCommand, Function1<? super androidx.compose.ui.text.input.a, Unit> onImeActionPerformed) {
        this.state = value;
        this.imeOptions = imeOptions;
        this.onEditCommand = onEditCommand;
        this.onImeActionPerformed = onImeActionPerformed;
        this.legacyTextFieldState = textInputNode != null ? textInputNode.getLegacyTextFieldState() : null;
        this.textFieldSelectionManager = textInputNode != null ? textInputNode.getTextFieldSelectionManager() : null;
        this.viewConfiguration = textInputNode != null ? textInputNode.getViewConfiguration() : null;
    }

    public final void r(TextFieldValue oldValue, TextFieldValue newValue) {
        boolean z = (x.g(this.state.getSelection(), newValue.getSelection()) && Intrinsics.e(this.state.getComposition(), newValue.getComposition())) ? false : true;
        this.state = newValue;
        int size = this.ics.size();
        for (int i = 0; i < size; i++) {
            dba dbaVar = this.ics.get(i).get();
            if (dbaVar != null) {
                dbaVar.h(newValue);
            }
        }
        this.cursorAnchorInfoController.a();
        if (Intrinsics.e(oldValue, newValue)) {
            if (z) {
                ey5 ey5Var = this.inputMethodManager;
                int iL = x.l(newValue.getSelection());
                int iK = x.k(newValue.getSelection());
                x composition = this.state.getComposition();
                int iL2 = composition != null ? x.l(composition.getPackedValue()) : -1;
                x composition2 = this.state.getComposition();
                ey5Var.a(iL, iK, iL2, composition2 != null ? x.k(composition2.getPackedValue()) : -1);
                return;
            }
            return;
        }
        if (oldValue != null && (!Intrinsics.e(oldValue.m(), newValue.m()) || (x.g(oldValue.getSelection(), newValue.getSelection()) && !Intrinsics.e(oldValue.getComposition(), newValue.getComposition())))) {
            p();
            return;
        }
        int size2 = this.ics.size();
        for (int i2 = 0; i2 < size2; i2++) {
            dba dbaVar2 = this.ics.get(i2).get();
            if (dbaVar2 != null) {
                dbaVar2.i(this.state, this.inputMethodManager);
            }
        }
    }

    public final void s(TextFieldValue textFieldValue, zn8 offsetMapping, TextLayoutResult textLayoutResult, gba innerTextFieldBounds, gba decorationBoxBounds) {
        this.cursorAnchorInfoController.d(textFieldValue, offsetMapping, textLayoutResult, innerTextFieldBounds, decorationBoxBounds);
    }
}
