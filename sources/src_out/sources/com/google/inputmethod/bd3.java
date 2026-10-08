package com.google.inputmethod;

import java.util.Objects;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class bd3 {
    static final bd3 b = new bd3("", 0, 0, 1.0f, 0, 0, 0, 1.0f);
    private final a a;

    private interface a {
    }

    private static class b implements a {
        private final String a;
        private final float b;
        private final int c;
        private final int d;
        private final int e;
        private final int f;
        private final int g;
        private final float h;

        b(String str, int i, int i2, float f, int i3, int i4, int i5, float f2) {
            this.a = str;
            this.c = i;
            this.d = i2;
            this.b = f;
            this.e = i3;
            this.f = i4;
            this.g = i5;
            this.h = f2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Objects.equals(this.a, bVar.a) && this.c == bVar.c && this.d == bVar.d && this.b == bVar.b && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && this.h == bVar.h;
        }

        public int hashCode() {
            return Objects.hash(this.a, Integer.valueOf(this.c), Integer.valueOf(this.d), Float.valueOf(this.b), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Float.valueOf(this.h));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DisplayShapeCompat{ spec=");
            String str = this.a;
            sb.append(str != null ? Integer.valueOf(str.hashCode()) : "null");
            sb.append(" displayWidth=");
            sb.append(this.c);
            sb.append(" displayHeight=");
            sb.append(this.d);
            sb.append(" physicalPixelDisplaySizeRatio=");
            sb.append(this.b);
            sb.append(" rotation=");
            sb.append(this.e);
            sb.append(" offsetX=");
            sb.append(this.f);
            sb.append(" offsetY=");
            sb.append(this.g);
            sb.append(" scale=");
            sb.append(this.h);
            sb.append("}");
            return sb.toString();
        }
    }

    private bd3(String str, int i, int i2, float f, int i3, int i4, int i5, float f2) {
        this.a = new b(str, i, i2, f, i3, i4, i5, f2);
    }

    public static bd3 a(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        return new bd3(b(i, i2, z, i3, i4, i5, i6), i, i2, 1.0f, 0, 0, 0, 1.0f);
    }

    private static String b(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        if (z) {
            int i7 = i / 2;
            int i8 = i2 / 2;
            return "M0," + i8 + " A" + i7 + "," + i8 + " 0 1,1 " + i + "," + i8 + " A" + i7 + "," + i8 + " 0 1,1 0," + i8 + " Z";
        }
        StringBuilder sb = new StringBuilder();
        int iMin = Math.min(i / 2, i2 / 2);
        int iMin2 = Math.min(iMin, i3);
        int iMin3 = Math.min(iMin, i4);
        int iMin4 = Math.min(iMin, i5);
        int iMin5 = Math.min(iMin, i6);
        sb.append("M ");
        sb.append(iMin2);
        sb.append(",0");
        sb.append(" L ");
        sb.append(i - iMin3);
        sb.append(",0");
        if (iMin3 > 0) {
            sb.append(" A ");
            sb.append(iMin3);
            sb.append(",");
            sb.append(iMin3);
            sb.append(" 0 0,1 ");
            sb.append(i);
            sb.append(",");
            sb.append(iMin3);
        }
        sb.append(" L ");
        sb.append(i);
        sb.append(",");
        sb.append(i2 - iMin4);
        if (iMin4 > 0) {
            sb.append(" A ");
            sb.append(iMin4);
            sb.append(",");
            sb.append(iMin4);
            sb.append(" 0 0,1 ");
            sb.append(i - iMin4);
            sb.append(",");
            sb.append(i2);
        }
        sb.append(" L ");
        sb.append(iMin5);
        sb.append(",");
        sb.append(i2);
        if (iMin5 > 0) {
            sb.append(" A ");
            sb.append(iMin5);
            sb.append(",");
            sb.append(iMin5);
            sb.append(" 0 0,1 ");
            sb.append(0);
            sb.append(",");
            sb.append(i2 - iMin5);
        }
        if (iMin2 > 0) {
            sb.append(" L ");
            sb.append(0);
            sb.append(",");
            sb.append(iMin2);
            sb.append(" A ");
            sb.append(iMin2);
            sb.append(",");
            sb.append(iMin2);
            sb.append(" 0 0,1 ");
            sb.append(iMin2);
            sb.append(",");
            sb.append(0);
        }
        sb.append(" Z");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bd3) {
            return Objects.equals(this.a, ((bd3) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.a);
    }

    public String toString() {
        return this.a.toString();
    }
}
