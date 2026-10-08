package androidx.compose.ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.compose.ui.text.x;
import com.google.android.r43;
import com.google.android.sh7;
import com.google.inputmethod.TextFieldValue;
import com.google.inputmethod.TextLayoutResult;
import com.google.inputmethod.ci7;
import com.google.inputmethod.cn3;
import com.google.inputmethod.dy5;
import com.google.inputmethod.gba;
import com.google.inputmethod.r58;
import com.google.inputmethod.yx5;
import com.google.inputmethod.zb9;
import com.google.inputmethod.zh7;
import com.google.inputmethod.zn8;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@r43
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001mB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010 JM\u0010+\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0018\u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&\u0012\u0004\u0012\u00020\u00100%2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00100%H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0010H\u0016¢\u0006\u0004\b-\u0010\u0014J\u000f\u0010.\u001a\u00020\u0010H\u0016¢\u0006\u0004\b.\u0010\u0014J\u000f\u0010/\u001a\u00020\u0010H\u0016¢\u0006\u0004\b/\u0010\u0014J\u000f\u00100\u001a\u00020\u0010H\u0016¢\u0006\u0004\b0\u0010\u0014J!\u00103\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u00010!2\u0006\u00102\u001a\u00020!H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u00102\u0006\u00106\u001a\u000205H\u0017¢\u0006\u0004\b7\u00108JK\u0010B\u001a\u00020\u00102\u0006\u00109\u001a\u00020!2\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00100%2\u0006\u0010@\u001a\u0002052\u0006\u0010A\u001a\u000205H\u0016¢\u0006\u0004\bB\u0010CR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010GR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010HR\u0016\u0010J\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010IR(\u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&\u0012\u0004\u0012\u00020\u00100%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010KR\"\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00100%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010KR$\u0010O\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b/\u0010L\u001a\u0004\bM\u0010NR\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010PR\"\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0R0Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u001b\u0010\\\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0018\u0010`\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u001a\u0010h\u001a\b\u0012\u0004\u0012\u00020\u000e0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010l\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010k¨\u0006n"}, d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "Lcom/google/android/zb9;", "Landroid/view/View;", "view", "Lcom/google/android/ci7;", "rootPositionCalculator", "Lcom/google/android/dy5;", "inputMethodManager", "Ljava/util/concurrent/Executor;", "inputCommandProcessorExecutor", "<init>", "(Landroid/view/View;Lcom/google/android/ci7;Lcom/google/android/dy5;Ljava/util/concurrent/Executor;)V", "positionCalculator", "(Landroid/view/View;Lcom/google/android/ci7;)V", "Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "command", "", "v", "(Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;)V", "s", "()V", "u", "", "visible", "x", "(Z)V", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "o", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "r", "()Z", "Lcom/google/android/cwc;", "value", "Landroidx/compose/ui/text/input/b;", "imeOptions", "Lkotlin/Function1;", "", "Lcom/google/android/cn3;", "onEditCommand", "Landroidx/compose/ui/text/input/a;", "onImeActionPerformed", "e", "(Lcom/google/android/cwc;Landroidx/compose/ui/text/input/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "b", "a", "g", "c", "oldValue", "newValue", "h", "(Lcom/google/android/cwc;Lcom/google/android/cwc;)V", "Lcom/google/android/gba;", "rect", "f", "(Lcom/google/android/gba;)V", "textFieldValue", "Lcom/google/android/zn8;", "offsetMapping", "Lcom/google/android/vxc;", "textLayoutResult", "Lcom/google/android/zh7;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "d", "(Lcom/google/android/cwc;Lcom/google/android/zn8;Lcom/google/android/vxc;Lkotlin/jvm/functions/Function1;Lcom/google/android/gba;Lcom/google/android/gba;)V", "Landroid/view/View;", "q", "()Landroid/view/View;", "Lcom/google/android/dy5;", "Ljava/util/concurrent/Executor;", "Z", "editorHasFocus", "Lkotlin/jvm/functions/Function1;", "Lcom/google/android/cwc;", "getState$ui", "()Lcom/google/android/cwc;", "state", "Landroidx/compose/ui/text/input/b;", "", "Ljava/lang/ref/WeakReference;", "Landroidx/compose/ui/text/input/e;", "i", "Ljava/util/List;", "ics", "Landroid/view/inputmethod/BaseInputConnection;", "j", "Lkotlin/Lazy;", "p", "()Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection", "Landroid/graphics/Rect;", "k", "Landroid/graphics/Rect;", "focusedRect", "Landroidx/compose/ui/text/input/CursorAnchorInfoController;", "l", "Landroidx/compose/ui/text/input/CursorAnchorInfoController;", "cursorAnchorInfoController", "Lcom/google/android/r58;", "m", "Lcom/google/android/r58;", "textInputCommandQueue", "Ljava/lang/Runnable;", "n", "Ljava/lang/Runnable;", "frameCallback", "TextInputCommand", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextInputServiceAndroid implements zb9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final dy5 inputMethodManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Executor inputCommandProcessorExecutor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean editorHasFocus;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Function1<? super List<? extends cn3>, Unit> onEditCommand;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Function1<? super androidx.compose.ui.text.input.a, Unit> onImeActionPerformed;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private TextFieldValue state;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private ImeOptions imeOptions;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private List<WeakReference<e>> ics;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Lazy baseInputConnection;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private Rect focusedRect;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final CursorAnchorInfoController cursorAnchorInfoController;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final r58<TextInputCommand> textInputCommandQueue;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private Runnable frameCallback;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private enum TextInputCommand {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard;

        private static final /* synthetic */ EnumEntries f = kotlin.enums.a.a(a());
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextInputCommand.values().length];
            try {
                iArr[TextInputCommand.StartInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextInputCommand.StopInput.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextInputCommand.ShowKeyboard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextInputCommand.HideKeyboard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"androidx/compose/ui/text/input/TextInputServiceAndroid$b", "Lcom/google/android/yx5;", "", "Lcom/google/android/cn3;", "editCommands", "", "d", "(Ljava/util/List;)V", "Landroidx/compose/ui/text/input/a;", "imeAction", "c", "(I)V", "Landroid/view/KeyEvent;", "event", "a", "(Landroid/view/KeyEvent;)V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "b", "(ZZZZZZ)V", "Landroidx/compose/ui/text/input/e;", "inputConnection", "e", "(Landroidx/compose/ui/text/input/e;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements yx5 {
        b() {
        }

        @Override // com.google.inputmethod.yx5
        public void a(KeyEvent event) {
            TextInputServiceAndroid.this.p().sendKeyEvent(event);
        }

        @Override // com.google.inputmethod.yx5
        public void b(boolean immediate, boolean monitor, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
            TextInputServiceAndroid.this.cursorAnchorInfoController.b(immediate, monitor, includeInsertionMarker, includeCharacterBounds, includeEditorBounds, includeLineBounds);
        }

        @Override // com.google.inputmethod.yx5
        public void c(int imeAction) {
            TextInputServiceAndroid.this.onImeActionPerformed.invoke(androidx.compose.ui.text.input.a.j(imeAction));
        }

        @Override // com.google.inputmethod.yx5
        public void d(List<? extends cn3> editCommands) {
            TextInputServiceAndroid.this.onEditCommand.invoke(editCommands);
        }

        @Override // com.google.inputmethod.yx5
        public void e(e inputConnection) {
            int size = TextInputServiceAndroid.this.ics.size();
            for (int i = 0; i < size; i++) {
                if (Intrinsics.e(((WeakReference) TextInputServiceAndroid.this.ics.get(i)).get(), inputConnection)) {
                    TextInputServiceAndroid.this.ics.remove(i);
                    return;
                }
            }
        }
    }

    public TextInputServiceAndroid(View view, ci7 ci7Var, dy5 dy5Var, Executor executor) {
        this.view = view;
        this.inputMethodManager = dy5Var;
        this.inputCommandProcessorExecutor = executor;
        this.onEditCommand = new Function1<List<? extends cn3>, Unit>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onEditCommand$1
            public final void a(List<? extends cn3> list) {
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((List) obj);
                return Unit.a;
            }
        };
        this.onImeActionPerformed = new Function1<androidx.compose.ui.text.input.a, Unit>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onImeActionPerformed$1
            public final void a(int i2) {
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((a) obj).getValue());
                return Unit.a;
            }
        };
        this.state = new TextFieldValue("", x.INSTANCE.a(), (x) null, 4, (DefaultConstructorMarker) null);
        this.imeOptions = ImeOptions.INSTANCE.a();
        this.ics = new ArrayList();
        this.baseInputConnection = kotlin.c.a(LazyThreadSafetyMode.c, new Function0<BaseInputConnection>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$baseInputConnection$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final BaseInputConnection invoke() {
                return new BaseInputConnection(this.this$0.getView(), false);
            }
        });
        this.cursorAnchorInfoController = new CursorAnchorInfoController(ci7Var, dy5Var);
        this.textInputCommandQueue = new r58<>(new TextInputCommand[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection p() {
        return (BaseInputConnection) this.baseInputConnection.getValue();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void s() throws NoWhenBranchMatchedException {
        View viewFindFocus;
        if (!this.view.isFocused() && (viewFindFocus = this.view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
            this.textInputCommandQueue.j();
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        r58<TextInputCommand> r58Var = this.textInputCommandQueue;
        TextInputCommand[] textInputCommandArr = r58Var.content;
        int size = r58Var.getSize();
        for (int i = 0; i < size; i++) {
            t(textInputCommandArr[i], objectRef, objectRef2);
        }
        this.textInputCommandQueue.j();
        if (Intrinsics.e(objectRef.element, Boolean.TRUE)) {
            u();
        }
        Boolean bool = (Boolean) objectRef2.element;
        if (bool != null) {
            x(bool.booleanValue());
        }
        if (Intrinsics.e(objectRef.element, Boolean.FALSE)) {
            u();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final void t(TextInputCommand textInputCommand, Ref.ObjectRef<Boolean> objectRef, Ref.ObjectRef<Boolean> objectRef2) throws NoWhenBranchMatchedException {
        int i = a.$EnumSwitchMapping$0[textInputCommand.ordinal()];
        if (i == 1) {
            Boolean bool = Boolean.TRUE;
            objectRef.element = bool;
            objectRef2.element = bool;
        } else if (i == 2) {
            Boolean bool2 = Boolean.FALSE;
            objectRef.element = bool2;
            objectRef2.element = bool2;
        } else {
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (Intrinsics.e(objectRef.element, Boolean.FALSE)) {
                return;
            }
            objectRef2.element = Boolean.valueOf(textInputCommand == TextInputCommand.ShowKeyboard);
        }
    }

    private final void u() {
        this.inputMethodManager.c();
    }

    private final void v(TextInputCommand command) {
        this.textInputCommandQueue.c(command);
        if (this.frameCallback == null) {
            Runnable runnable = new Runnable() { // from class: com.google.android.exc
                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                @Override // java.lang.Runnable
                public final void run() throws NoWhenBranchMatchedException {
                    TextInputServiceAndroid.w(this.a);
                }
            };
            this.inputCommandProcessorExecutor.execute(runnable);
            this.frameCallback = runnable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void w(TextInputServiceAndroid textInputServiceAndroid) throws NoWhenBranchMatchedException {
        textInputServiceAndroid.frameCallback = null;
        textInputServiceAndroid.s();
    }

    private final void x(boolean visible) {
        if (visible) {
            this.inputMethodManager.e();
        } else {
            this.inputMethodManager.d();
        }
    }

    @Override // com.google.inputmethod.zb9
    public void a() {
        this.editorHasFocus = false;
        this.onEditCommand = new Function1<List<? extends cn3>, Unit>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$1
            public final void a(List<? extends cn3> list) {
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((List) obj);
                return Unit.a;
            }
        };
        this.onImeActionPerformed = new Function1<androidx.compose.ui.text.input.a, Unit>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$2
            public final void a(int i2) {
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((a) obj).getValue());
                return Unit.a;
            }
        };
        this.focusedRect = null;
        v(TextInputCommand.StopInput);
    }

    @Override // com.google.inputmethod.zb9
    public void b() {
        v(TextInputCommand.StartInput);
    }

    @Override // com.google.inputmethod.zb9
    public void c() {
        v(TextInputCommand.HideKeyboard);
    }

    @Override // com.google.inputmethod.zb9
    public void d(TextFieldValue textFieldValue, zn8 offsetMapping, TextLayoutResult textLayoutResult, Function1<? super zh7, Unit> textFieldToRootTransform, gba innerTextFieldBounds, gba decorationBoxBounds) {
        this.cursorAnchorInfoController.d(textFieldValue, offsetMapping, textLayoutResult, textFieldToRootTransform, innerTextFieldBounds, decorationBoxBounds);
    }

    @Override // com.google.inputmethod.zb9
    public void e(TextFieldValue value, ImeOptions imeOptions, Function1<? super List<? extends cn3>, Unit> onEditCommand, Function1<? super androidx.compose.ui.text.input.a, Unit> onImeActionPerformed) {
        this.editorHasFocus = true;
        this.state = value;
        this.imeOptions = imeOptions;
        this.onEditCommand = onEditCommand;
        this.onImeActionPerformed = onImeActionPerformed;
        v(TextInputCommand.StartInput);
    }

    @Override // com.google.inputmethod.zb9
    @r43
    public void f(gba rect) {
        Rect rect2;
        this.focusedRect = new Rect(sh7.d(rect.getLeft()), sh7.d(rect.getTop()), sh7.d(rect.getRight()), sh7.d(rect.getBottom()));
        if (!this.ics.isEmpty() || (rect2 = this.focusedRect) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new Rect(rect2));
    }

    @Override // com.google.inputmethod.zb9
    public void g() {
        v(TextInputCommand.ShowKeyboard);
    }

    @Override // com.google.inputmethod.zb9
    public void h(TextFieldValue oldValue, TextFieldValue newValue) {
        boolean z = (x.g(this.state.getSelection(), newValue.getSelection()) && Intrinsics.e(this.state.getComposition(), newValue.getComposition())) ? false : true;
        this.state = newValue;
        int size = this.ics.size();
        for (int i = 0; i < size; i++) {
            e eVar = this.ics.get(i).get();
            if (eVar != null) {
                eVar.f(newValue);
            }
        }
        this.cursorAnchorInfoController.a();
        if (Intrinsics.e(oldValue, newValue)) {
            if (z) {
                dy5 dy5Var = this.inputMethodManager;
                int iL = x.l(newValue.getSelection());
                int iK = x.k(newValue.getSelection());
                x composition = this.state.getComposition();
                int iL2 = composition != null ? x.l(composition.getPackedValue()) : -1;
                x composition2 = this.state.getComposition();
                dy5Var.a(iL, iK, iL2, composition2 != null ? x.k(composition2.getPackedValue()) : -1);
                return;
            }
            return;
        }
        if (oldValue != null && (!Intrinsics.e(oldValue.m(), newValue.m()) || (x.g(oldValue.getSelection(), newValue.getSelection()) && !Intrinsics.e(oldValue.getComposition(), newValue.getComposition())))) {
            u();
            return;
        }
        int size2 = this.ics.size();
        for (int i2 = 0; i2 < size2; i2++) {
            e eVar2 = this.ics.get(i2).get();
            if (eVar2 != null) {
                eVar2.g(this.state, this.inputMethodManager);
            }
        }
    }

    public final InputConnection o(EditorInfo outAttrs) {
        if (!this.editorHasFocus) {
            return null;
        }
        f.h(outAttrs, this.imeOptions, this.state);
        f.i(outAttrs);
        e eVar = new e(this.state, new b(), this.imeOptions.getAutoCorrect());
        this.ics.add(new WeakReference<>(eVar));
        return eVar;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final View getView() {
        return this.view;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getEditorHasFocus() {
        return this.editorHasFocus;
    }

    public /* synthetic */ TextInputServiceAndroid(View view, ci7 ci7Var, dy5 dy5Var, Executor executor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, ci7Var, dy5Var, (i & 8) != 0 ? f.d(Choreographer.getInstance()) : executor);
    }

    public TextInputServiceAndroid(View view, ci7 ci7Var) {
        this(view, ci7Var, new InputMethodManagerImpl(view), null, 8, null);
    }
}
