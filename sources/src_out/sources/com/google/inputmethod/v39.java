package com.google.inputmethod;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\u001a;\u0010\n\u001a\u00020\t*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\r\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u000f\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"", "Ljava/util/ArrayList;", "Lcom/google/android/u39;", "Lkotlin/collections/ArrayList;", "nodes", "", "args", "", "count", "", "a", "(CLjava/util/ArrayList;[FI)V", "", "b", "(Ljava/util/List;[FI)V", "c", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v39 {
    public static final void a(char c, ArrayList<u39> arrayList, float[] fArr, int i) {
        int i2 = 0;
        switch (c) {
            case 'A':
                int i3 = i - 7;
                for (int i4 = 0; i4 <= i3; i4 += 7) {
                    arrayList.add(new u39.ArcTo(fArr[i4], fArr[i4 + 1], fArr[i4 + 2], Float.compare(fArr[i4 + 3], 0.0f) != 0, Float.compare(fArr[i4 + 4], 0.0f) != 0, fArr[i4 + 5], fArr[i4 + 6]));
                }
                return;
            case 'C':
                int i5 = i - 6;
                while (i2 <= i5) {
                    arrayList.add(new u39.CurveTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3], fArr[i2 + 4], fArr[i2 + 5]));
                    i2 += 6;
                }
                return;
            case 'H':
                int i6 = i - 1;
                while (i2 <= i6) {
                    arrayList.add(new u39.HorizontalTo(fArr[i2]));
                    i2++;
                }
                return;
            case 'L':
                int i7 = i - 2;
                while (i2 <= i7) {
                    arrayList.add(new u39.LineTo(fArr[i2], fArr[i2 + 1]));
                    i2 += 2;
                }
                return;
            case 'M':
                b(arrayList, fArr, i);
                return;
            case 'Q':
                int i8 = i - 4;
                while (i2 <= i8) {
                    arrayList.add(new u39.QuadTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                    i2 += 4;
                }
                return;
            case 'S':
                int i9 = i - 4;
                while (i2 <= i9) {
                    arrayList.add(new u39.ReflectiveCurveTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                    i2 += 4;
                }
                return;
            case 'T':
                int i10 = i - 2;
                while (i2 <= i10) {
                    arrayList.add(new u39.ReflectiveQuadTo(fArr[i2], fArr[i2 + 1]));
                    i2 += 2;
                }
                return;
            case 'V':
                int i11 = i - 1;
                while (i2 <= i11) {
                    arrayList.add(new u39.VerticalTo(fArr[i2]));
                    i2++;
                }
                return;
            case 'Z':
            case 'z':
                arrayList.add(u39.b.c);
                return;
            case 'a':
                int i12 = i - 7;
                for (int i13 = 0; i13 <= i12; i13 += 7) {
                    arrayList.add(new u39.RelativeArcTo(fArr[i13], fArr[i13 + 1], fArr[i13 + 2], Float.compare(fArr[i13 + 3], 0.0f) != 0, Float.compare(fArr[i13 + 4], 0.0f) != 0, fArr[i13 + 5], fArr[i13 + 6]));
                }
                return;
            case 'c':
                int i14 = i - 6;
                while (i2 <= i14) {
                    arrayList.add(new u39.RelativeCurveTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3], fArr[i2 + 4], fArr[i2 + 5]));
                    i2 += 6;
                }
                return;
            case 'h':
                int i15 = i - 1;
                while (i2 <= i15) {
                    arrayList.add(new u39.RelativeHorizontalTo(fArr[i2]));
                    i2++;
                }
                return;
            case 'l':
                int i16 = i - 2;
                while (i2 <= i16) {
                    arrayList.add(new u39.RelativeLineTo(fArr[i2], fArr[i2 + 1]));
                    i2 += 2;
                }
                return;
            case 'm':
                c(arrayList, fArr, i);
                return;
            case 'q':
                int i17 = i - 4;
                while (i2 <= i17) {
                    arrayList.add(new u39.RelativeQuadTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                    i2 += 4;
                }
                return;
            case 's':
                int i18 = i - 4;
                while (i2 <= i18) {
                    arrayList.add(new u39.RelativeReflectiveCurveTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                    i2 += 4;
                }
                return;
            case 't':
                int i19 = i - 2;
                while (i2 <= i19) {
                    arrayList.add(new u39.RelativeReflectiveQuadTo(fArr[i2], fArr[i2 + 1]));
                    i2 += 2;
                }
                return;
            case 'v':
                int i20 = i - 1;
                while (i2 <= i20) {
                    arrayList.add(new u39.RelativeVerticalTo(fArr[i2]));
                    i2++;
                }
                return;
            default:
                throw new IllegalArgumentException("Unknown command for: " + c);
        }
    }

    private static final void b(List<u39> list, float[] fArr, int i) {
        int i2 = i - 2;
        if (i2 >= 0) {
            list.add(new u39.MoveTo(fArr[0], fArr[1]));
            for (int i3 = 2; i3 <= i2; i3 += 2) {
                list.add(new u39.LineTo(fArr[i3], fArr[i3 + 1]));
            }
        }
    }

    private static final void c(List<u39> list, float[] fArr, int i) {
        int i2 = i - 2;
        if (i2 >= 0) {
            list.add(new u39.RelativeMoveTo(fArr[0], fArr[1]));
            for (int i3 = 2; i3 <= i2; i3 += 2) {
                list.add(new u39.RelativeLineTo(fArr[i3], fArr[i3 + 1]));
            }
        }
    }
}
