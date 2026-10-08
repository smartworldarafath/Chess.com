package androidx.compose.p001foundation.text;

import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p001foundation.text.HeightInLinesModifierKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.t;
import androidx.compose.ui.text.font.u;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.ps4;
import com.google.inputmethod.cx5;
import com.google.inputmethod.f43;
import com.google.inputmethod.ff3;
import com.google.inputmethod.jz5;
import com.google.inputmethod.q6c;
import com.google.inputmethod.up1;
import com.google.inputmethod.vzc;
import com.google.inputmethod.ysc;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a/\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/b;", "Landroidx/compose/ui/text/y;", "textStyle", "", "minLines", "maxLines", "b", "(Landroidx/compose/ui/b;Landroidx/compose/ui/text/y;II)Landroidx/compose/ui/b;", "c", "", "f", "(II)V", "", "typeface", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class HeightInLinesModifierKt {
    public static final b b(b bVar, TextStyle textStyle, int i, int i2) {
        f(i, i2);
        if (i == 1 && i2 == Integer.MAX_VALUE) {
            return bVar;
        }
        return up1.isBasicTextFieldMinSizeOptimizationEnabled ? bVar.then(new f(textStyle, i, i2)) : c(bVar, textStyle, i, i2);
    }

    public static final b c(b bVar, final TextStyle textStyle, final int i, final int i2) {
        return ComposedModifierKt.b(bVar, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.text.HeightInLinesModifierKt$legacyHeightInLines$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("heightInLines");
                jz5Var.getProperties().c("minLines", Integer.valueOf(i));
                jz5Var.getProperties().c("maxLines", Integer.valueOf(i2));
                jz5Var.getProperties().c("textStyle", textStyle);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a(), new ps4() { // from class: com.google.android.va5
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HeightInLinesModifierKt.d(textStyle, i, i2, (b) obj, (d) obj2, ((Integer) obj3).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b d(TextStyle textStyle, int i, int i2, b bVar, d dVar, int i3) {
        dVar.y(595899793);
        if (e.k()) {
            e.o(595899793, i3, -1, "androidx.compose.foundation.text.legacyHeightInLines.<anonymous> (HeightInLinesModifier.kt:297)");
        }
        f43 f43Var = (f43) dVar.v(CompositionLocalsKt.g());
        l.b bVar2 = (l.b) dVar.v(CompositionLocalsKt.i());
        LayoutDirection layoutDirection = (LayoutDirection) dVar.v(CompositionLocalsKt.m());
        boolean zX = dVar.x(textStyle) | dVar.C(layoutDirection.ordinal());
        Object objR = dVar.R();
        if (zX || objR == d.INSTANCE.a()) {
            objR = vzc.d(textStyle, layoutDirection);
            dVar.L(objR);
        }
        TextStyle textStyle2 = (TextStyle) objR;
        boolean zX2 = dVar.x(bVar2) | dVar.x(textStyle2);
        Object objR2 = dVar.R();
        if (zX2 || objR2 == d.INSTANCE.a()) {
            l lVarJ = textStyle2.j();
            FontWeight fontWeightO = textStyle2.o();
            if (fontWeightO == null) {
                fontWeightO = FontWeight.INSTANCE.f();
            }
            t tVarM = textStyle2.m();
            int value = tVarM != null ? tVarM.getValue() : t.INSTANCE.b();
            u uVarN = textStyle2.n();
            objR2 = bVar2.a(lVarJ, fontWeightO, value, uVarN != null ? uVarN.getValue() : u.INSTANCE.a());
            dVar.L(objR2);
        }
        q6c q6cVar = (q6c) objR2;
        boolean zX3 = dVar.x(e(q6cVar)) | dVar.x(f43Var) | dVar.x(bVar2) | dVar.x(textStyle) | dVar.C(layoutDirection.ordinal());
        Object objR3 = dVar.R();
        if (zX3 || objR3 == d.INSTANCE.a()) {
            objR3 = Integer.valueOf((int) (ysc.a(textStyle2, f43Var, bVar2, ysc.d(), 1) & 4294967295L));
            dVar.L(objR3);
        }
        int iIntValue = ((Number) objR3).intValue();
        boolean zX4 = dVar.x(textStyle) | dVar.x(f43Var) | dVar.x(bVar2) | dVar.C(layoutDirection.ordinal()) | dVar.x(e(q6cVar));
        Object objR4 = dVar.R();
        if (zX4 || objR4 == d.INSTANCE.a()) {
            objR4 = Integer.valueOf((int) (ysc.a(textStyle2, f43Var, bVar2, ysc.d() + '\n' + ysc.d(), 2) & 4294967295L));
            dVar.L(objR4);
        }
        int iIntValue2 = ((Number) objR4).intValue() - iIntValue;
        Integer numValueOf = i == 1 ? null : Integer.valueOf(((i - 1) * iIntValue2) + iIntValue);
        Integer numValueOf2 = i2 != Integer.MAX_VALUE ? Integer.valueOf(iIntValue + (iIntValue2 * (i2 - 1))) : null;
        b bVarJ = SizeKt.j(b.INSTANCE, numValueOf != null ? f43Var.O0(numValueOf.intValue()) : ff3.INSTANCE.c(), numValueOf2 != null ? f43Var.O0(numValueOf2.intValue()) : ff3.INSTANCE.c());
        if (e.k()) {
            e.n();
        }
        dVar.u();
        return bVarJ;
    }

    private static final Object e(q6c<? extends Object> q6cVar) {
        return q6cVar.getValue();
    }

    public static final void f(int i, int i2) {
        if (!(i > 0 && i2 > 0)) {
            cx5.a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        cx5.a("minLines " + i + " must be less than or equal to maxLines " + i2);
    }
}
