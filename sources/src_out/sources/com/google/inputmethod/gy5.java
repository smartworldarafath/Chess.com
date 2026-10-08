package com.google.inputmethod;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010$¨\u0006&"}, d2 = {"Lcom/google/android/gy5;", "Lcom/google/android/ey5;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "", "b", "()Z", "", "c", "()V", "", "token", "Landroid/view/inputmethod/ExtractedText;", "extractedText", "updateExtractedText", "(ILandroid/view/inputmethod/ExtractedText;)V", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", "a", "(IIII)V", "Landroid/view/inputmethod/CursorAnchorInfo;", "cursorAnchorInfo", "updateCursorAnchorInfo", "(Landroid/view/inputmethod/CursorAnchorInfo;)V", "d", "Landroid/view/View;", "Landroid/view/inputmethod/InputMethodManager;", "Lkotlin/Lazy;", "f", "()Landroid/view/inputmethod/InputMethodManager;", "imm", "Lcom/google/android/jyb;", "Lcom/google/android/jyb;", "softwareKeyboardControllerCompat", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class gy5 implements ey5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy imm = c.a(LazyThreadSafetyMode.c, new Function0() { // from class: com.google.android.fy5
        public final Object invoke() {
            return gy5.g(this.a);
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final jyb softwareKeyboardControllerCompat;

    public gy5(View view) {
        this.view = view;
        this.softwareKeyboardControllerCompat = new jyb(view);
    }

    private final InputMethodManager f() {
        return (InputMethodManager) this.imm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputMethodManager g(gy5 gy5Var) {
        Object systemService = gy5Var.view.getContext().getSystemService("input_method");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }

    @Override // com.google.inputmethod.ey5
    public void a(int selectionStart, int selectionEnd, int compositionStart, int compositionEnd) {
        f().updateSelection(this.view, selectionStart, selectionEnd, compositionStart, compositionEnd);
    }

    @Override // com.google.inputmethod.ey5
    public boolean b() {
        return f().isActive(this.view);
    }

    @Override // com.google.inputmethod.ey5
    public void c() {
        f().restartInput(this.view);
    }

    @Override // com.google.inputmethod.ey5
    public void d() {
        if (Build.VERSION.SDK_INT >= 34) {
            wt.a.a(f(), this.view);
        }
    }

    @Override // com.google.inputmethod.ey5
    public void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo) {
        f().updateCursorAnchorInfo(this.view, cursorAnchorInfo);
    }

    @Override // com.google.inputmethod.ey5
    public void updateExtractedText(int token, ExtractedText extractedText) {
        f().updateExtractedText(this.view, token, extractedText);
    }
}
