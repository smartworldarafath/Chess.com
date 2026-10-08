package androidx.compose.p001foundation.text;

import androidx.compose.p001foundation.MutatePriority;
import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.gestures.ScrollableKt;
import androidx.compose.p001foundation.gestures.u;
import androidx.compose.p001foundation.text.TextFieldScrollKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.inputmethod.TextFieldValue;
import com.google.inputmethod.TextLayoutResult;
import com.google.inputmethod.TransformedText;
import com.google.inputmethod.f43;
import com.google.inputmethod.ff1;
import com.google.inputmethod.gba;
import com.google.inputmethod.hab;
import com.google.inputmethod.jz5;
import com.google.inputmethod.nce;
import com.google.inputmethod.o0e;
import com.google.inputmethod.p9b;
import com.google.inputmethod.q6c;
import com.google.inputmethod.r48;
import com.google.inputmethod.ssc;
import com.google.inputmethod.wxc;
import com.google.inputmethod.zv8;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a=\u0010\u001e\u001a\u00020\u001d*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Landroidx/compose/ui/b;", "Landroidx/compose/foundation/text/u;", "scrollerPosition", "Lcom/google/android/r48;", "interactionSource", "", "enabled", "Lcom/google/android/zv8;", "overscrollEffect", "f", "(Landroidx/compose/ui/b;Landroidx/compose/foundation/text/u;Lcom/google/android/r48;ZLcom/google/android/zv8;)Landroidx/compose/ui/b;", "Lcom/google/android/cwc;", "textFieldValue", "Lcom/google/android/nce;", "visualTransformation", "Lkotlin/Function0;", "Lcom/google/android/wxc;", "textLayoutResultProvider", "d", "(Landroidx/compose/ui/b;Landroidx/compose/foundation/text/u;Lcom/google/android/cwc;Lcom/google/android/nce;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/b;", "Lcom/google/android/f43;", "", "cursorOffset", "Lcom/google/android/jed;", "transformedText", "Lcom/google/android/vxc;", "textLayoutResult", "rtl", "textFieldWidth", "Lcom/google/android/gba;", "e", "(Lcom/google/android/f43;ILcom/google/android/jed;Lcom/google/android/vxc;ZI)Lcom/google/android/gba;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TextFieldScrollKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J<\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0096A¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00108\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0019"}, d2 = {"androidx/compose/foundation/text/TextFieldScrollKt$b", "Lcom/google/android/hab;", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Lcom/google/android/p9b;", "Lcom/google/android/q22;", "", "", "block", "a", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "", "delta", "d", "(F)F", "", "b", "Lcom/google/android/q6c;", "c", "()Z", "canScrollForward", "f", "canScrollBackward", "isScrollInProgress", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements hab {
        private final /* synthetic */ hab a;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final q6c canScrollForward;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final q6c canScrollBackward;

        b(hab habVar, final u uVar) {
            this.a = habVar;
            this.canScrollForward = p0.e(new Function0() { // from class: com.google.android.ruc
                public final Object invoke() {
                    return Boolean.valueOf(TextFieldScrollKt.b.j(uVar));
                }
            });
            this.canScrollBackward = p0.e(new Function0() { // from class: com.google.android.suc
                public final Object invoke() {
                    return Boolean.valueOf(TextFieldScrollKt.b.i(uVar));
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean i(u uVar) {
            return uVar.h() > 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean j(u uVar) {
            return uVar.h() < uVar.g();
        }

        @Override // com.google.inputmethod.hab
        public Object a(MutatePriority mutatePriority, Function2<? super p9b, ? super q22<? super Unit>, ? extends Object> function2, q22<? super Unit> q22Var) {
            return this.a.a(mutatePriority, function2, q22Var);
        }

        @Override // com.google.inputmethod.hab
        public boolean b() {
            return this.a.b();
        }

        @Override // com.google.inputmethod.hab
        public boolean c() {
            return ((Boolean) this.canScrollForward.getValue()).booleanValue();
        }

        @Override // com.google.inputmethod.hab
        public float d(float delta) {
            return this.a.d(delta);
        }

        @Override // com.google.inputmethod.hab
        public boolean f() {
            return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final androidx.compose.ui.b d(androidx.compose.ui.b bVar, u uVar, TextFieldValue textFieldValue, nce nceVar, Function0<wxc> function0) throws NoWhenBranchMatchedException {
        androidx.compose.ui.b xVar;
        Orientation orientationJ = uVar.j();
        int i = uVar.i(textFieldValue.getSelection());
        uVar.m(textFieldValue.getSelection());
        TransformedText transformedTextC = o0e.c(nceVar, textFieldValue.getText());
        int i2 = a.$EnumSwitchMapping$0[orientationJ.ordinal()];
        if (i2 == 1) {
            xVar = new x(uVar, i, transformedTextC, function0);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            xVar = new l(uVar, i, transformedTextC, function0);
        }
        return ff1.b(bVar).then(xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gba e(f43 f43Var, int i, TransformedText transformedText, TextLayoutResult textLayoutResult, boolean z, int i2) {
        gba gbaVarA;
        if (textLayoutResult == null || (gbaVarA = textLayoutResult.e(transformedText.getOffsetMapping().b(i))) == null) {
            gbaVarA = gba.INSTANCE.a();
        }
        gba gbaVar = gbaVarA;
        int iO1 = f43Var.O1(ssc.a());
        return gba.d(gbaVar, z ? (i2 - gbaVar.getLeft()) - iO1 : gbaVar.getLeft(), 0.0f, z ? i2 - gbaVar.getLeft() : iO1 + gbaVar.getLeft(), 0.0f, 10, null);
    }

    public static final androidx.compose.ui.b f(androidx.compose.ui.b bVar, final u uVar, final r48 r48Var, final boolean z, final zv8 zv8Var) {
        return ComposedModifierKt.b(bVar, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("textFieldScrollable");
                jz5Var.getProperties().c("scrollerPosition", uVar);
                jz5Var.getProperties().c("interactionSource", r48Var);
                jz5Var.getProperties().c("enabled", Boolean.valueOf(z));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a(), new ps4() { // from class: com.google.android.puc
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return TextFieldScrollKt.g(uVar, z, zv8Var, r48Var, (b) obj, (d) obj2, ((Integer) obj3).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.b g(final u uVar, boolean z, zv8 zv8Var, r48 r48Var, androidx.compose.ui.b bVar, d dVar, int i) {
        dVar.y(-2137546592);
        if (e.k()) {
            e.o(-2137546592, i, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:76)");
        }
        boolean z2 = uVar.j() == Orientation.Vertical || !(dVar.v(CompositionLocalsKt.m()) == LayoutDirection.Rtl);
        boolean zX = dVar.x(uVar);
        Object objR = dVar.R();
        if (zX || objR == d.INSTANCE.a()) {
            objR = new Function1() { // from class: com.google.android.quc
                public final Object invoke(Object obj) {
                    return Float.valueOf(TextFieldScrollKt.h(uVar, ((Float) obj).floatValue()));
                }
            };
            dVar.L(objR);
        }
        hab habVarC = u.c((Function1) objR, dVar, 0);
        boolean zX2 = dVar.x(habVarC) | dVar.x(uVar);
        Object objR2 = dVar.R();
        if (zX2 || objR2 == d.INSTANCE.a()) {
            objR2 = new b(habVarC, uVar);
            dVar.L(objR2);
        }
        androidx.compose.ui.b bVarL = ScrollableKt.l(androidx.compose.ui.b.INSTANCE, (b) objR2, uVar.j(), zv8Var, z && uVar.g() != 0.0f, z2, null, r48Var, null, 160, null);
        if (e.k()) {
            e.n();
        }
        dVar.u();
        return bVarL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h(u uVar, float f) {
        float fH = uVar.h() + f;
        if (fH > uVar.g()) {
            f = uVar.g() - uVar.h();
        } else if (fH < 0.0f) {
            f = -uVar.h();
        }
        uVar.l(uVar.h() + f);
        return f;
    }
}
