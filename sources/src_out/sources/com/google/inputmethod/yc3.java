package com.google.inputmethod;

import android.graphics.Insets;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.List;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class yc3 {
    private final DisplayCutout a;

    static class a {
        static List<Rect> a(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        static int b(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    static class b {
        static Insets a(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    static class c {
        static Path a(DisplayCutout displayCutout) {
            return displayCutout.getCutoutPath();
        }
    }

    private yc3(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    static yc3 h(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new yc3(displayCutout);
    }

    public List<Rect> a() {
        return a.a(this.a);
    }

    public Path b() {
        if (Build.VERSION.SDK_INT >= 31) {
            return c.a(this.a);
        }
        return null;
    }

    public int c() {
        return a.b(this.a);
    }

    public int d() {
        return a.c(this.a);
    }

    public int e() {
        return a.d(this.a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yc3.class != obj.getClass()) {
            return false;
        }
        return mm8.a(this.a, ((yc3) obj).a);
    }

    public int f() {
        return a.e(this.a);
    }

    public uy5 g() {
        return Build.VERSION.SDK_INT >= 30 ? uy5.f(b.a(this.a)) : uy5.e;
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
