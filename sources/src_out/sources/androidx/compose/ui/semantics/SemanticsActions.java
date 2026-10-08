package androidx.compose.ui.semantics;

import com.google.android.ps4;
import com.google.android.q22;
import com.google.android.ws4;
import com.google.inputmethod.AccessibilityAction;
import com.google.inputmethod.CustomAccessibilityAction;
import com.google.inputmethod.TextLayoutResult;
import com.google.inputmethod.rn8;
import com.google.inputmethod.t94;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R5\u0010\u000e\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR)\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR)\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\rR5\u0010\u001a\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u00160\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR9\u0010\u001f\u001a$\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00160\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\rR/\u0010#\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u000b\u001a\u0004\b\"\u0010\rR8\u0010(\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u000b\u0012\u0004\b'\u0010\u0003\u001a\u0004\b&\u0010\rR/\u0010+\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b*\u0010\rR/\u0010.\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\u000b\u001a\u0004\b-\u0010\rR;\u00101\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0/0\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u000b\u001a\u0004\b0\u0010\rR/\u00103\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b2\u0010\rR/\u00105\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\u000b\u001a\u0004\b4\u0010\rR/\u00108\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b6\u0010\u000b\u001a\u0004\b7\u0010\rR)\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b9\u0010\rR/\u0010<\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b;\u0010\u000b\u001a\u0004\b,\u0010\rR)\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b=\u0010\u000b\u001a\u0004\b6\u0010\rR2\u0010B\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u0010\u000b\u0012\u0004\bA\u0010\u0003\u001a\u0004\b@\u0010\rR)\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bC\u0010\u000b\u001a\u0004\b\u0010\u0010\rR)\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bE\u0010\u000b\u001a\u0004\b\u0018\u0010\rR)\u0010H\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bG\u0010\u000b\u001a\u0004\bE\u0010\rR)\u0010I\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b!\u0010\rR)\u0010J\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\n\u0010\rR)\u0010K\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b\u001d\u0010\rR)\u0010L\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b-\u0010\u000b\u001a\u0004\bG\u0010\rR#\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0M0\u00048\u0006¢\u0006\f\n\u0004\b0\u0010\u000b\u001a\u0004\b\u0013\u0010\rR)\u0010P\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b2\u0010\u000b\u001a\u0004\bC\u0010\rR)\u0010Q\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b4\u0010\u000b\u001a\u0004\b=\u0010\rR)\u0010R\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\u000b\u001a\u0004\b;\u0010\rR)\u0010T\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bS\u0010\u000b\u001a\u0004\b?\u0010\rR5\u0010V\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0007\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\bU\u0010\u000b\u001a\u0004\b%\u0010\r¨\u0006W"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsActions;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lcom/google/android/y5;", "Lkotlin/Function1;", "", "Lcom/google/android/vxc;", "", "b", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "i", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "GetTextLayoutResult", "Lkotlin/Function0;", "c", "l", "OnClick", "d", "o", "OnLongClick", "Lkotlin/Function2;", "", "e", "v", "ScrollBy", "Lcom/google/android/rn8;", "Lcom/google/android/q22;", "f", "w", "ScrollByOffset", "", "g", "x", "ScrollToIndex", "Landroidx/compose/ui/text/b;", "h", "k", "getOnAutofillText$annotations", "OnAutofillText", "Lcom/google/android/t94;", "m", "OnFillData", "j", "y", "SetProgress", "Lkotlin/Function3;", "z", "SetSelection", "A", "SetText", "B", "SetTextSubstitution", "n", "C", "ShowTextSubstitution", "a", "ClearTextSubstitution", "p", "InsertTextAtCursor", "q", "OnImeAction", "r", "getPerformImeAction", "getPerformImeAction$annotations", "PerformImeAction", "s", "CopyText", "t", "CutText", "u", "PasteText", "Expand", "Collapse", "Dismiss", "RequestFocus", "", "Lcom/google/android/gi2;", "CustomActions", "PageUp", "PageLeft", "PageDown", "D", "PageRight", "E", "GetScrollViewportLength", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SemanticsActions {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PageUp;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PageLeft;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PageDown;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PageRight;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<List<Float>, Boolean>>> GetScrollViewportLength;
    public static final int F;
    public static final SemanticsActions a = new SemanticsActions();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<List<TextLayoutResult>, Boolean>>> GetTextLayoutResult;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> OnClick;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> OnLongClick;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function2<Float, Float, Boolean>>> ScrollBy;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<Function2<rn8, q22<? super rn8>, Object>> ScrollByOffset;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<Integer, Boolean>>> ScrollToIndex;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<androidx.compose.ui.text.b, Boolean>>> OnAutofillText;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<t94, Boolean>>> OnFillData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<Float, Boolean>>> SetProgress;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<ps4<Integer, Integer, Boolean, Boolean>>> SetSelection;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<androidx.compose.ui.text.b, Boolean>>> SetText;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<androidx.compose.ui.text.b, Boolean>>> SetTextSubstitution;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<Boolean, Boolean>>> ShowTextSubstitution;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> ClearTextSubstitution;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<androidx.compose.ui.text.b, Boolean>>> InsertTextAtCursor;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> OnImeAction;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PerformImeAction;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> CopyText;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> CutText;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PasteText;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> Expand;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> Collapse;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> Dismiss;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> RequestFocus;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<List<CustomAccessibilityAction>> CustomActions;

    static {
        SemanticsPropertiesKt$ActionPropertyKey$1 semanticsPropertiesKt$ActionPropertyKey$1 = new Function2<AccessibilityAction<ws4<? extends Boolean>>, AccessibilityAction<ws4<? extends Boolean>>, AccessibilityAction<ws4<? extends Boolean>>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AccessibilityAction<ws4<? extends Boolean>> invoke(AccessibilityAction<ws4<? extends Boolean>> accessibilityAction, AccessibilityAction<ws4<? extends Boolean>> accessibilityAction2) {
                String label;
                ws4 ws4VarA;
                if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                    label = accessibilityAction2.getLabel();
                }
                if (accessibilityAction == null || (ws4VarA = accessibilityAction.a()) == null) {
                    ws4VarA = accessibilityAction2.a();
                }
                return new AccessibilityAction<>(label, ws4VarA);
            }
        };
        GetTextLayoutResult = new SemanticsPropertyKey<>("GetTextLayoutResult", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        OnClick = new SemanticsPropertyKey<>("OnClick", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        OnLongClick = new SemanticsPropertyKey<>("OnLongClick", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        ScrollBy = new SemanticsPropertyKey<>("ScrollBy", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        ScrollByOffset = new SemanticsPropertyKey<>("ScrollByOffset", (Function2) null, 2, (DefaultConstructorMarker) null);
        ScrollToIndex = new SemanticsPropertyKey<>("ScrollToIndex", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        OnAutofillText = new SemanticsPropertyKey<>("OnAutofillText", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        OnFillData = new SemanticsPropertyKey<>("OnFillData", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        SetProgress = new SemanticsPropertyKey<>("SetProgress", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        SetSelection = new SemanticsPropertyKey<>("SetSelection", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        SetText = new SemanticsPropertyKey<>("SetText", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        SetTextSubstitution = new SemanticsPropertyKey<>("SetTextSubstitution", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        ShowTextSubstitution = new SemanticsPropertyKey<>("ShowTextSubstitution", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        ClearTextSubstitution = new SemanticsPropertyKey<>("ClearTextSubstitution", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        InsertTextAtCursor = new SemanticsPropertyKey<>("InsertTextAtCursor", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        OnImeAction = new SemanticsPropertyKey<>("PerformImeAction", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        PerformImeAction = new SemanticsPropertyKey<>("PerformImeAction", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        CopyText = new SemanticsPropertyKey<>("CopyText", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        CutText = new SemanticsPropertyKey<>("CutText", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        PasteText = new SemanticsPropertyKey<>("PasteText", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        Expand = new SemanticsPropertyKey<>("Expand", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        Collapse = new SemanticsPropertyKey<>("Collapse", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        Dismiss = new SemanticsPropertyKey<>("Dismiss", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        RequestFocus = new SemanticsPropertyKey<>("RequestFocus", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        CustomActions = new SemanticsPropertyKey<>("CustomActions", true, new Function2<List<? extends CustomAccessibilityAction>, List<? extends CustomAccessibilityAction>, List<? extends CustomAccessibilityAction>>() { // from class: androidx.compose.ui.semantics.SemanticsActions$CustomActions$1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<CustomAccessibilityAction> invoke(List<CustomAccessibilityAction> list, List<CustomAccessibilityAction> list2) {
                if (list == null) {
                    list = m.p();
                }
                return m.a1(list, list2);
            }
        }, null, 8, null);
        PageUp = new SemanticsPropertyKey<>("PageUp", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        PageLeft = new SemanticsPropertyKey<>("PageLeft", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        PageDown = new SemanticsPropertyKey<>("PageDown", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        PageRight = new SemanticsPropertyKey<>("PageRight", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        GetScrollViewportLength = new SemanticsPropertyKey<>("GetScrollViewportLength", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        F = 8;
    }

    private SemanticsActions() {
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<androidx.compose.ui.text.b, Boolean>>> A() {
        return SetText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<androidx.compose.ui.text.b, Boolean>>> B() {
        return SetTextSubstitution;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<Boolean, Boolean>>> C() {
        return ShowTextSubstitution;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> a() {
        return ClearTextSubstitution;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> b() {
        return Collapse;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> c() {
        return CopyText;
    }

    public final SemanticsPropertyKey<List<CustomAccessibilityAction>> d() {
        return CustomActions;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> e() {
        return CutText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> f() {
        return Dismiss;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> g() {
        return Expand;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<List<Float>, Boolean>>> h() {
        return GetScrollViewportLength;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<List<TextLayoutResult>, Boolean>>> i() {
        return GetTextLayoutResult;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<androidx.compose.ui.text.b, Boolean>>> j() {
        return InsertTextAtCursor;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<androidx.compose.ui.text.b, Boolean>>> k() {
        return OnAutofillText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> l() {
        return OnClick;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<t94, Boolean>>> m() {
        return OnFillData;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> n() {
        return OnImeAction;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> o() {
        return OnLongClick;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> p() {
        return PageDown;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> q() {
        return PageLeft;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> r() {
        return PageRight;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> s() {
        return PageUp;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> t() {
        return PasteText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> u() {
        return RequestFocus;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function2<Float, Float, Boolean>>> v() {
        return ScrollBy;
    }

    public final SemanticsPropertyKey<Function2<rn8, q22<? super rn8>, Object>> w() {
        return ScrollByOffset;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<Integer, Boolean>>> x() {
        return ScrollToIndex;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<Float, Boolean>>> y() {
        return SetProgress;
    }

    public final SemanticsPropertyKey<AccessibilityAction<ps4<Integer, Integer, Boolean, Boolean>>> z() {
        return SetSelection;
    }
}
