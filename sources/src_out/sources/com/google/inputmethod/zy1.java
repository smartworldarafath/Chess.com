package com.google.inputmethod;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.Objects;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class zy1 implements az1 {
    private final Object a;
    private final View b;

    private static class a {
        static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newAutofillId(autofillId, j);
        }

        static ViewStructure b(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j);
        }

        static void c(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        static void d(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
            contentCaptureSession.notifyViewDisappeared(autofillId);
        }

        public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    private zy1(ContentCaptureSession contentCaptureSession, View view) {
        this.a = contentCaptureSession;
        this.b = view;
    }

    public static zy1 f(ContentCaptureSession contentCaptureSession, View view) {
        return new zy1(contentCaptureSession, view);
    }

    @Override // com.google.inputmethod.az1
    public AutofillId a(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionA = yy1.a(this.a);
        oa0 oa0VarA = l7e.a(this.b);
        Objects.requireNonNull(oa0VarA);
        return a.a(contentCaptureSessionA, oa0VarA.a(), j);
    }

    @Override // com.google.inputmethod.az1
    public void b(AutofillId autofillId, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.e(yy1.a(this.a), autofillId, charSequence);
        }
    }

    @Override // com.google.inputmethod.az1
    public rae c(AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return rae.i(a.b(yy1.a(this.a), autofillId, j));
        }
        return null;
    }

    @Override // com.google.inputmethod.az1
    public void d(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.d(yy1.a(this.a), autofillId);
        }
    }

    @Override // com.google.inputmethod.az1
    public void e(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.c(yy1.a(this.a), viewStructure);
        }
    }

    @Override // com.google.inputmethod.az1
    public void flush() {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSessionA = yy1.a(this.a);
            oa0 oa0VarA = l7e.a(this.b);
            Objects.requireNonNull(oa0VarA);
            a.f(contentCaptureSessionA, oa0VarA.a(), new long[]{Long.MIN_VALUE});
        }
    }
}
