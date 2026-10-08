package com.google.inputmethod;

import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/google/android/ya9;", "Lcom/google/android/c65;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lcom/google/android/e65;", "hapticFeedbackType", "", "a", "(I)V", "Landroid/view/View;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ya9 implements c65 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final View view;

    public ya9(View view) {
        this.view = view;
    }

    @Override // com.google.inputmethod.c65
    public void a(int hapticFeedbackType) {
        int i;
        e65.Companion companion = e65.INSTANCE;
        if (e65.d(hapticFeedbackType, companion.a())) {
            i = 16;
        } else if (e65.d(hapticFeedbackType, companion.b())) {
            i = 6;
        } else if (e65.d(hapticFeedbackType, companion.c())) {
            i = 13;
        } else if (e65.d(hapticFeedbackType, companion.d())) {
            i = 23;
        } else if (e65.d(hapticFeedbackType, companion.e())) {
            i = 3;
        } else if (e65.d(hapticFeedbackType, companion.f())) {
            i = 0;
        } else if (e65.d(hapticFeedbackType, companion.g())) {
            i = 17;
        } else if (e65.d(hapticFeedbackType, companion.h())) {
            i = 27;
        } else if (e65.d(hapticFeedbackType, companion.i())) {
            i = 26;
        } else if (e65.d(hapticFeedbackType, companion.j())) {
            i = 9;
        } else if (e65.d(hapticFeedbackType, companion.k())) {
            i = 22;
        } else if (e65.d(hapticFeedbackType, companion.l())) {
            i = 21;
        } else {
            i = e65.d(hapticFeedbackType, companion.m()) ? 1 : -1;
        }
        k7e.a0(this.view, i);
    }
}
