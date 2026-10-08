package com.google.inputmethod;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class l7e {

    static class a {
        public static AutofillId a(View view) {
            return view.getAutofillId();
        }
    }

    private static class b {
        static ContentCaptureSession a(View view) {
            return view.getContentCaptureSession();
        }
    }

    private static class c {
        static void a(View view, int i) {
            view.setImportantForContentCapture(i);
        }
    }

    public static oa0 a(View view) {
        return oa0.b(a.a(view));
    }

    public static az1 b(View view) {
        ContentCaptureSession contentCaptureSessionA;
        if (Build.VERSION.SDK_INT < 29 || (contentCaptureSessionA = b.a(view)) == null) {
            return null;
        }
        return zy1.f(contentCaptureSessionA, view);
    }

    public static void c(View view, int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.a(view, i);
        }
    }
}
