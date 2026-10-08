package androidx.p008glance.text;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.p008glance.GlanceNodeKt$GlanceNode$$inlined$ComposeNode$1;
import androidx.p008glance.g;
import com.google.inputmethod.EmittableText;
import com.google.inputmethod.TextStyle;
import com.google.inputmethod.dud;
import com.google.inputmethod.dz;
import com.google.inputmethod.pp1;
import com.google.inputmethod.s6b;
import com.google.inputmethod.zrc;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "text", "Landroidx/glance/g;", "modifier", "Lcom/google/android/uzc;", "style", "", "maxLines", "", "a", "(Ljava/lang/String;Landroidx/glance/g;Lcom/google/android/uzc;ILandroidx/compose/runtime/d;II)V", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextKt {
    public static final void a(final String str, g gVar, TextStyle textStyle, int i, d dVar, final int i2, final int i3) {
        int i4;
        d dVarF = dVar.F(-192911377);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (dVarF.x(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= dVarF.x(gVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ((i3 & 4) == 0 && dVarF.x(textStyle)) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= dVarF.C(i) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && dVarF.c()) {
            dVarF.q();
        } else {
            dVarF.U();
            if ((i2 & 1) == 0 || dVarF.t()) {
                if (i5 != 0) {
                    gVar = g.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    textStyle = zrc.a.b();
                    i4 &= -897;
                }
                if (i6 != 0) {
                    i = Integer.MAX_VALUE;
                }
            } else {
                dVarF.q();
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
            }
            dVarF.M();
            if (e.k()) {
                e.o(-192911377, i4, -1, "androidx.glance.text.Text (Text.kt:43)");
            }
            TextKt$Text$1 textKt$Text$1 = TextKt$Text$1.a;
            dVarF.Q(-1115894518);
            dVarF.Q(1886828752);
            if (!(dVarF.G() instanceof dz)) {
                pp1.d();
            }
            dVarF.J();
            if (dVarF.E()) {
                dVarF.W(new GlanceNodeKt$GlanceNode$$inlined$ComposeNode$1(textKt$Text$1));
            } else {
                dVarF.k();
            }
            d dVarC = dud.c(dVarF);
            dud.i(dVarC, str, new Function2<EmittableText, String, Unit>() { // from class: androidx.glance.text.TextKt$Text$2$1
                public final void a(EmittableText emittableText, String str2) {
                    emittableText.h(str2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((EmittableText) obj, (String) obj2);
                    return Unit.a;
                }
            });
            dud.i(dVarC, gVar, new Function2<EmittableText, g, Unit>() { // from class: androidx.glance.text.TextKt$Text$2$2
                public final void a(EmittableText emittableText, g gVar2) {
                    emittableText.b(gVar2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((EmittableText) obj, (g) obj2);
                    return Unit.a;
                }
            });
            dud.i(dVarC, textStyle, new Function2<EmittableText, TextStyle, Unit>() { // from class: androidx.glance.text.TextKt$Text$2$3
                public final void a(EmittableText emittableText, TextStyle textStyle2) {
                    emittableText.g(textStyle2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((EmittableText) obj, (TextStyle) obj2);
                    return Unit.a;
                }
            });
            TextKt$Text$2$4 textKt$Text$2$4 = new Function2<EmittableText, Integer, Unit>() { // from class: androidx.glance.text.TextKt$Text$2$4
                public final void a(EmittableText emittableText, int i7) {
                    emittableText.f(i7);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((EmittableText) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }
            };
            if (dVarC.E() || !Intrinsics.e(dVarC.R(), Integer.valueOf(i))) {
                dVarC.L(Integer.valueOf(i));
                dVarC.e(Integer.valueOf(i), textKt$Text$2$4);
            }
            dVarF.m();
            dVarF.a0();
            dVarF.a0();
            if (e.k()) {
                e.n();
            }
        }
        final g gVar2 = gVar;
        final TextStyle textStyle2 = textStyle;
        final int i7 = i;
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.glance.text.TextKt$Text$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(d dVar2, int i8) {
                    TextKt.a(str, gVar2, textStyle2, i7, dVar2, i2 | 1, i3);
                }
            });
        }
    }
}
