package androidx.compose.ui.text.font;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/font/s;", "", "<init>", "()V", "", "Landroidx/compose/ui/text/font/k;", "fontList", "Landroidx/compose/ui/text/font/x;", "fontWeight", "Landroidx/compose/ui/text/font/t;", "fontStyle", "a", "(Ljava/util/List;Landroidx/compose/ui/text/font/x;I)Ljava/util/List;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s {
    public final List<k> a(List<? extends k> fontList, FontWeight fontWeight, int fontStyle) {
        ArrayList arrayList = new ArrayList(fontList.size());
        int size = fontList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            k kVar = fontList.get(i2);
            k kVar2 = kVar;
            if (Intrinsics.e(kVar2.b(), fontWeight) && t.f(kVar2.c(), fontStyle)) {
                arrayList.add(kVar);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(fontList.size());
        int size2 = fontList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            k kVar3 = fontList.get(i3);
            if (t.f(kVar3.c(), fontStyle)) {
                arrayList2.add(kVar3);
            }
        }
        if (!arrayList2.isEmpty()) {
            fontList = arrayList2;
        }
        FontWeight.Companion companion = FontWeight.INSTANCE;
        FontWeight fontWeight2 = null;
        if (fontWeight.compareTo(companion.h()) < 0) {
            int size3 = fontList.size();
            FontWeight fontWeight3 = null;
            for (int i4 = 0; i4 < size3; i4++) {
                FontWeight fontWeightB = fontList.get(i4).b();
                if (fontWeightB.compareTo(fontWeight) >= 0) {
                    if (fontWeightB.compareTo(fontWeight) <= 0) {
                        fontWeight3 = fontWeightB;
                        fontWeight2 = fontWeight3;
                        break;
                    }
                    if (fontWeight3 == null || fontWeightB.compareTo(fontWeight3) < 0) {
                        fontWeight3 = fontWeightB;
                    }
                } else if (fontWeight2 == null || fontWeightB.compareTo(fontWeight2) > 0) {
                    fontWeight2 = fontWeightB;
                }
            }
            if (fontWeight2 != null) {
                fontWeight3 = fontWeight2;
            }
            ArrayList arrayList3 = new ArrayList(fontList.size());
            int size4 = fontList.size();
            while (i < size4) {
                k kVar4 = fontList.get(i);
                if (Intrinsics.e(kVar4.b(), fontWeight3)) {
                    arrayList3.add(kVar4);
                }
                i++;
            }
            return arrayList3;
        }
        if (fontWeight.compareTo(companion.i()) > 0) {
            int size5 = fontList.size();
            FontWeight fontWeight4 = null;
            for (int i5 = 0; i5 < size5; i5++) {
                FontWeight fontWeightB2 = fontList.get(i5).b();
                if (fontWeightB2.compareTo(fontWeight) >= 0) {
                    if (fontWeightB2.compareTo(fontWeight) <= 0) {
                        fontWeight4 = fontWeightB2;
                        fontWeight2 = fontWeight4;
                        break;
                    }
                    if (fontWeight4 == null || fontWeightB2.compareTo(fontWeight4) < 0) {
                        fontWeight4 = fontWeightB2;
                    }
                } else if (fontWeight2 == null || fontWeightB2.compareTo(fontWeight2) > 0) {
                    fontWeight2 = fontWeightB2;
                }
            }
            if (fontWeight4 == null) {
                fontWeight4 = fontWeight2;
            }
            ArrayList arrayList4 = new ArrayList(fontList.size());
            int size6 = fontList.size();
            while (i < size6) {
                k kVar5 = fontList.get(i);
                if (Intrinsics.e(kVar5.b(), fontWeight4)) {
                    arrayList4.add(kVar5);
                }
                i++;
            }
            return arrayList4;
        }
        FontWeight fontWeightI = companion.i();
        int size7 = fontList.size();
        FontWeight fontWeight5 = null;
        FontWeight fontWeight6 = null;
        for (int i6 = 0; i6 < size7; i6++) {
            FontWeight fontWeightB3 = fontList.get(i6).b();
            if (fontWeightI == null || fontWeightB3.compareTo(fontWeightI) <= 0) {
                if (fontWeightB3.compareTo(fontWeight) >= 0) {
                    if (fontWeightB3.compareTo(fontWeight) <= 0) {
                        fontWeight5 = fontWeightB3;
                        fontWeight6 = fontWeight5;
                        break;
                    }
                    if (fontWeight6 == null || fontWeightB3.compareTo(fontWeight6) < 0) {
                        fontWeight6 = fontWeightB3;
                    }
                } else if (fontWeight5 == null || fontWeightB3.compareTo(fontWeight5) > 0) {
                    fontWeight5 = fontWeightB3;
                }
            }
        }
        if (fontWeight6 != null) {
            fontWeight5 = fontWeight6;
        }
        ArrayList arrayList5 = new ArrayList(fontList.size());
        int size8 = fontList.size();
        for (int i7 = 0; i7 < size8; i7++) {
            k kVar6 = fontList.get(i7);
            if (Intrinsics.e(kVar6.b(), fontWeight5)) {
                arrayList5.add(kVar6);
            }
        }
        if (!arrayList5.isEmpty()) {
            return arrayList5;
        }
        FontWeight fontWeightI2 = FontWeight.INSTANCE.i();
        int size9 = fontList.size();
        FontWeight fontWeight7 = null;
        for (int i8 = 0; i8 < size9; i8++) {
            FontWeight fontWeightB4 = fontList.get(i8).b();
            if (fontWeightI2 == null || fontWeightB4.compareTo(fontWeightI2) >= 0) {
                if (fontWeightB4.compareTo(fontWeight) >= 0) {
                    if (fontWeightB4.compareTo(fontWeight) <= 0) {
                        fontWeight2 = fontWeightB4;
                        fontWeight7 = fontWeight2;
                        break;
                    }
                    if (fontWeight7 == null || fontWeightB4.compareTo(fontWeight7) < 0) {
                        fontWeight7 = fontWeightB4;
                    }
                } else if (fontWeight2 == null || fontWeightB4.compareTo(fontWeight2) > 0) {
                    fontWeight2 = fontWeightB4;
                }
            }
        }
        if (fontWeight7 != null) {
            fontWeight2 = fontWeight7;
        }
        ArrayList arrayList6 = new ArrayList(fontList.size());
        int size10 = fontList.size();
        while (i < size10) {
            k kVar7 = fontList.get(i);
            if (Intrinsics.e(kVar7.b(), fontWeight2)) {
                arrayList6.add(kVar7);
            }
            i++;
        }
        return arrayList6;
    }
}
