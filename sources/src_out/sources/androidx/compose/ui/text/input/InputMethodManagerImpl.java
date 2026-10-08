package androidx.compose.ui.text.input;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import com.google.android.r43;
import com.google.inputmethod.dy5;
import com.google.inputmethod.jyb;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@r43
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%¨\u0006'"}, d2 = {"Landroidx/compose/ui/text/input/InputMethodManagerImpl;", "Lcom/google/android/dy5;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "", "b", "()Z", "", "c", "()V", "e", "d", "", "token", "Landroid/view/inputmethod/ExtractedText;", "extractedText", "updateExtractedText", "(ILandroid/view/inputmethod/ExtractedText;)V", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", "a", "(IIII)V", "Landroid/view/inputmethod/CursorAnchorInfo;", "cursorAnchorInfo", "updateCursorAnchorInfo", "(Landroid/view/inputmethod/CursorAnchorInfo;)V", "Landroid/view/View;", "Landroid/view/inputmethod/InputMethodManager;", "Lkotlin/Lazy;", "g", "()Landroid/view/inputmethod/InputMethodManager;", "imm", "Lcom/google/android/jyb;", "Lcom/google/android/jyb;", "softwareKeyboardControllerCompat", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InputMethodManagerImpl implements dy5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy imm = kotlin.c.a(LazyThreadSafetyMode.c, new Function0<InputMethodManager>() { // from class: androidx.compose.ui.text.input.InputMethodManagerImpl$imm$2
        {
            super(0);
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InputMethodManager invoke() {
            Object systemService = this.this$0.view.getContext().getSystemService("input_method");
            Intrinsics.h(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final jyb softwareKeyboardControllerCompat;

    public InputMethodManagerImpl(View view) {
        this.view = view;
        this.softwareKeyboardControllerCompat = new jyb(view);
    }

    private final InputMethodManager g() {
        return (InputMethodManager) this.imm.getValue();
    }

    @Override // com.google.inputmethod.dy5
    public void a(int selectionStart, int selectionEnd, int compositionStart, int compositionEnd) {
        g().updateSelection(this.view, selectionStart, selectionEnd, compositionStart, compositionEnd);
    }

    @Override // com.google.inputmethod.dy5
    public boolean b() {
        return g().isActive(this.view);
    }

    @Override // com.google.inputmethod.dy5
    public void c() {
        g().restartInput(this.view);
    }

    @Override // com.google.inputmethod.dy5
    public void d() {
        this.softwareKeyboardControllerCompat.a();
    }

    @Override // com.google.inputmethod.dy5
    public void e() {
        this.softwareKeyboardControllerCompat.b();
    }

    @Override // com.google.inputmethod.dy5
    public void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo) {
        g().updateCursorAnchorInfo(this.view, cursorAnchorInfo);
    }

    @Override // com.google.inputmethod.dy5
    public void updateExtractedText(int token, ExtractedText extractedText) {
        g().updateExtractedText(this.view, token, extractedText);
    }
}
