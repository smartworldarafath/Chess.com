package com.google.inputmethod;

import android.graphics.Point;
import android.view.RoundedCorner;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class jqa {
    private final int a;
    private final int b;
    private final Point c;

    public jqa(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = new Point(i3, i4);
    }

    private String a(int i) {
        if (i == 0) {
            return "TopLeft";
        }
        if (i == 1) {
            return "TopRight";
        }
        if (i != 2) {
            return i != 3 ? "Invalid" : "BottomLeft";
        }
        return "BottomRight";
    }

    private static int c(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i == 3) {
                    return 3;
                }
                throw new IllegalArgumentException("Invalid position: " + i);
            }
        }
        return i2;
    }

    static jqa d(RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            return new jqa(c(roundedCorner.getPosition()), roundedCorner.getRadius(), roundedCorner.getCenter());
        }
        return null;
    }

    public int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jqa) {
            jqa jqaVar = (jqa) obj;
            if (this.a == jqaVar.a && this.b == jqaVar.b && this.c.equals(jqaVar.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "RoundedCornerCompat{position=" + a(this.a) + ", radius=" + this.b + ", center=" + this.c + '}';
    }

    private jqa(int i, int i2, Point point) {
        this(i, i2, point.x, point.y);
    }
}
