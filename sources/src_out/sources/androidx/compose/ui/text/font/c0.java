package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.fonts.FontVariationAxis;
import android.os.Build;
import androidx.compose.ui.text.font.c0;
import androidx.compose.ui.text.font.w;
import com.google.inputmethod.f43;
import com.google.inputmethod.m47;
import com.google.inputmethod.ok;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\u000e\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/font/w$d;", "Lcom/google/android/f43;", "density", "", "weightAdjustment", "", "f", "(Landroidx/compose/ui/text/font/w$d;Lcom/google/android/f43;I)Ljava/lang/String;", "", "Landroid/graphics/fonts/FontVariationAxis;", "d", "(Landroidx/compose/ui/text/font/w$d;Lcom/google/android/f43;I)[Landroid/graphics/fonts/FontVariationAxis;", "Landroid/content/Context;", "context", "c", "(Landroid/content/Context;)I", "e", "(Landroidx/compose/ui/text/font/w$d;Landroid/content/Context;)Ljava/lang/String;", "", "b", "(F)F", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c0 {
    private static final float b(float f) {
        return kotlin.ranges.g.n(f, 1.0f, 1000.0f);
    }

    public static final int c(Context context) {
        if (context == null || Build.VERSION.SDK_INT < 31 || context.getResources().getConfiguration().fontWeightAdjustment == Integer.MAX_VALUE) {
            return 0;
        }
        return context.getResources().getConfiguration().fontWeightAdjustment;
    }

    public static final FontVariationAxis[] d(w.d dVar, f43 f43Var, int i) {
        int size;
        FontVariationAxis fontVariationAxis;
        int i2 = 0;
        if (i == 0) {
            int size2 = dVar.b().size();
            FontVariationAxis[] fontVariationAxisArr = new FontVariationAxis[size2];
            while (i2 < size2) {
                fontVariationAxisArr[i2] = new FontVariationAxis(dVar.b().get(i2).getAxisName(), dVar.b().get(i2).b(f43Var));
                i2++;
            }
            return fontVariationAxisArr;
        }
        int size3 = dVar.b().size();
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                size = dVar.b().size() + 1;
                break;
            }
            if (Intrinsics.e(dVar.b().get(i3).getAxisName(), "wght")) {
                size = dVar.b().size();
                break;
            }
            i3++;
        }
        FontVariationAxis[] fontVariationAxisArr2 = new FontVariationAxis[size];
        while (i2 < size) {
            if (i2 == dVar.b().size()) {
                fontVariationAxis = new FontVariationAxis("wght", b(i + 400.0f));
            } else {
                fontVariationAxis = Intrinsics.e(dVar.b().get(i2).getAxisName(), "wght") ? new FontVariationAxis("wght", b(dVar.b().get(i2).b(f43Var) + i)) : new FontVariationAxis(dVar.b().get(i2).getAxisName(), dVar.b().get(i2).b(f43Var));
            }
            fontVariationAxisArr2[i2] = fontVariationAxis;
            i2++;
        }
        return fontVariationAxisArr2;
    }

    public static final String e(w.d dVar, Context context) {
        return f(dVar, ok.a(context), c(context));
    }

    public static final String f(w.d dVar, final f43 f43Var, int i) {
        boolean z;
        float fB;
        if (i == 0) {
            return m47.e(dVar.b(), null, null, null, 0, null, new Function1() { // from class: com.google.android.xa9
                public final Object invoke(Object obj) {
                    return c0.g(f43Var, (w.a) obj);
                }
            }, 31, null);
        }
        List<w.a> listB = dVar.b();
        int size = listB.size();
        int i2 = 0;
        String str = "";
        boolean z2 = false;
        while (i2 < size) {
            w.a aVar = listB.get(i2);
            if (Intrinsics.e(aVar.getAxisName(), "wght")) {
                fB = b(aVar.b(f43Var) + i);
                z = true;
            } else {
                z = z2;
                fB = aVar.b(f43Var);
            }
            if (i2 != 0) {
                str = str + ',';
            }
            str = str + '\'' + aVar.getAxisName() + "' " + fB;
            i2++;
            z2 = z;
        }
        if (z2) {
            return str;
        }
        float fB2 = b(i + 400.0f);
        if (!dVar.b().isEmpty()) {
            str = str + ',';
        }
        return str + "'wght' " + fB2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence g(f43 f43Var, w.a aVar) {
        return '\'' + aVar.getAxisName() + "' " + aVar.b(f43Var);
    }
}
