package com.google.inputmethod;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/google/android/ma9;", "Lcom/google/android/la9;", "Landroid/view/autofill/AutofillManager;", "platformAndroidManager", "<init>", "(Landroid/view/autofill/AutofillManager;)V", "Landroid/view/View;", "view", "", "semanticsId", "Landroid/graphics/Rect;", "bounds", "", "b", "(Landroid/view/View;ILandroid/graphics/Rect;)V", "c", "(Landroid/view/View;I)V", "Landroid/view/autofill/AutofillValue;", "autofillValue", "a", "(Landroid/view/View;ILandroid/view/autofill/AutofillValue;)V", "", "isVisible", "e", "(Landroid/view/View;IZ)V", "commit", "()V", "d", "Landroid/view/autofill/AutofillManager;", "getPlatformAndroidManager", "()Landroid/view/autofill/AutofillManager;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ma9 implements la9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AutofillManager platformAndroidManager;

    public ma9(AutofillManager autofillManager) {
        this.platformAndroidManager = autofillManager;
    }

    @Override // com.google.inputmethod.la9
    public void a(View view, int semanticsId, AutofillValue autofillValue) {
        this.platformAndroidManager.notifyValueChanged(view, semanticsId, autofillValue);
    }

    @Override // com.google.inputmethod.la9
    public void b(View view, int semanticsId, Rect bounds) {
        this.platformAndroidManager.notifyViewEntered(view, semanticsId, bounds);
    }

    @Override // com.google.inputmethod.la9
    public void c(View view, int semanticsId) {
        this.platformAndroidManager.notifyViewExited(view, semanticsId);
    }

    @Override // com.google.inputmethod.la9
    public void commit() {
        this.platformAndroidManager.commit();
    }

    @Override // com.google.inputmethod.la9
    public void d(View view, int semanticsId, Rect bounds) {
        this.platformAndroidManager.requestAutofill(view, semanticsId, bounds);
    }

    @Override // com.google.inputmethod.la9
    public void e(View view, int semanticsId, boolean isVisible) {
        ia0.a.a(view, this.platformAndroidManager, semanticsId, isVisible);
    }
}
