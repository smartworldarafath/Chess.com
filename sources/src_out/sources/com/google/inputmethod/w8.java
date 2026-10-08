package com.google.inputmethod;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class w8 {

    private static class a extends w8 {
        private final ActivityOptions a;

        a(ActivityOptions activityOptions) {
            this.a = activityOptions;
        }

        @Override // com.google.inputmethod.w8
        public Bundle b() {
            return this.a.toBundle();
        }
    }

    protected w8() {
    }

    public static w8 a(Activity activity, View view, String str) {
        return new a(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
    }

    public Bundle b() {
        throw null;
    }
}
