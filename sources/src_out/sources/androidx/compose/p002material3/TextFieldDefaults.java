package androidx.compose.p002material3;

import androidx.compose.p001foundation.interaction.FocusInteractionKt;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p002material3.TextFieldDefaults;
import androidx.compose.p002material3.p003internal.TextFieldImplKt;
import androidx.compose.p002material3.p003internal.TextFieldType;
import androidx.compose.p002material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.android.dt4;
import com.google.android.ps4;
import com.google.android.ws4;
import com.google.inputmethod.ColorScheme;
import com.google.inputmethod.IndicatorLineElement;
import com.google.inputmethod.SelectionColors;
import com.google.inputmethod.TransformedText;
import com.google.inputmethod.bj1;
import com.google.inputmethod.d08;
import com.google.inputmethod.do1;
import com.google.inputmethod.ei1;
import com.google.inputmethod.ff3;
import com.google.inputmethod.guc;
import com.google.inputmethod.j26;
import com.google.inputmethod.jzc;
import com.google.inputmethod.kh7;
import com.google.inputmethod.ko1;
import com.google.inputmethod.nce;
import com.google.inputmethod.nx8;
import com.google.inputmethod.osb;
import com.google.inputmethod.psc;
import com.google.inputmethod.q6c;
import com.google.inputmethod.ri1;
import com.google.inputmethod.rx8;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.t04;
import com.google.inputmethod.ulb;
import com.google.inputmethod.xkb;
import com.google.inputmethod.y94;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0019\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014JU\u0010\u0016\u001a\u00020\t*\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017Jû\u0001\u0010)\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020&2\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00120\u001aH\u0007¢\u0006\u0004\b)\u0010*J5\u0010/\u001a\u00020&2\b\b\u0002\u0010+\u001a\u00020\u000f2\b\b\u0002\u0010,\u001a\u00020\u000f2\b\b\u0002\u0010-\u001a\u00020\u000f2\b\b\u0002\u0010.\u001a\u00020\u000f¢\u0006\u0004\b/\u00100J5\u00101\u001a\u00020&2\b\b\u0002\u0010+\u001a\u00020\u000f2\b\b\u0002\u0010-\u001a\u00020\u000f2\b\b\u0002\u0010,\u001a\u00020\u000f2\b\b\u0002\u0010.\u001a\u00020\u000f¢\u0006\u0004\b1\u00100J7\u00102\u001a\u00020&2\b\b\u0002\u0010+\u001a\u00020\u000f2\b\b\u0002\u0010-\u001a\u00020\u000f2\b\b\u0002\u0010,\u001a\u00020\u000f2\b\b\u0002\u0010.\u001a\u00020\u000fH\u0000¢\u0006\u0004\b2\u00100J\u000f\u00103\u001a\u00020\u000bH\u0007¢\u0006\u0004\b3\u00104J¿\u0003\u0010b\u001a\u00020\u000b2\b\b\u0002\u00106\u001a\u0002052\b\b\u0002\u00107\u001a\u0002052\b\b\u0002\u00108\u001a\u0002052\b\b\u0002\u00109\u001a\u0002052\b\b\u0002\u0010:\u001a\u0002052\b\b\u0002\u0010;\u001a\u0002052\b\b\u0002\u0010<\u001a\u0002052\b\b\u0002\u0010=\u001a\u0002052\b\b\u0002\u0010>\u001a\u0002052\b\b\u0002\u0010?\u001a\u0002052\n\b\u0002\u0010A\u001a\u0004\u0018\u00010@2\b\b\u0002\u0010B\u001a\u0002052\b\b\u0002\u0010C\u001a\u0002052\b\b\u0002\u0010D\u001a\u0002052\b\b\u0002\u0010E\u001a\u0002052\b\b\u0002\u0010F\u001a\u0002052\b\b\u0002\u0010G\u001a\u0002052\b\b\u0002\u0010H\u001a\u0002052\b\b\u0002\u0010I\u001a\u0002052\b\b\u0002\u0010J\u001a\u0002052\b\b\u0002\u0010K\u001a\u0002052\b\b\u0002\u0010L\u001a\u0002052\b\b\u0002\u0010M\u001a\u0002052\b\b\u0002\u0010N\u001a\u0002052\b\b\u0002\u0010O\u001a\u0002052\b\b\u0002\u0010P\u001a\u0002052\b\b\u0002\u0010Q\u001a\u0002052\b\b\u0002\u0010R\u001a\u0002052\b\b\u0002\u0010S\u001a\u0002052\b\b\u0002\u0010T\u001a\u0002052\b\b\u0002\u0010U\u001a\u0002052\b\b\u0002\u0010V\u001a\u0002052\b\b\u0002\u0010W\u001a\u0002052\b\b\u0002\u0010X\u001a\u0002052\b\b\u0002\u0010Y\u001a\u0002052\b\b\u0002\u0010Z\u001a\u0002052\b\b\u0002\u0010[\u001a\u0002052\b\b\u0002\u0010\\\u001a\u0002052\b\b\u0002\u0010]\u001a\u0002052\b\b\u0002\u0010^\u001a\u0002052\b\b\u0002\u0010_\u001a\u0002052\b\b\u0002\u0010`\u001a\u0002052\b\b\u0002\u0010a\u001a\u000205H\u0007¢\u0006\u0004\bb\u0010cJ\u001b\u0010f\u001a\u00020\u000b*\u00020d2\u0006\u0010e\u001a\u00020@H\u0000¢\u0006\u0004\bf\u0010gR\u0017\u0010l\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u0017\u0010n\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010i\u001a\u0004\bm\u0010kR\u0017\u0010q\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bo\u0010i\u001a\u0004\bp\u0010kR\u0017\u0010s\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b)\u0010i\u001a\u0004\br\u0010kR \u0010w\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bt\u0010i\u0012\u0004\bv\u0010\u0003\u001a\u0004\bu\u0010kR \u0010z\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010i\u0012\u0004\by\u0010\u0003\u001a\u0004\bx\u0010kR\u0011\u0010\u000e\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b{\u0010|¨\u0006}"}, d2 = {"Landroidx/compose/material3/TextFieldDefaults;", "", "<init>", "()V", "", "enabled", "isError", "Lcom/google/android/j26;", "interactionSource", "Landroidx/compose/ui/b;", "modifier", "Lcom/google/android/psc;", "colors", "Lcom/google/android/xkb;", "shape", "Lcom/google/android/ff3;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "", "c", "(ZZLcom/google/android/j26;Landroidx/compose/ui/b;Lcom/google/android/psc;Lcom/google/android/xkb;FFLandroidx/compose/runtime/d;II)V", "textFieldShape", "s", "(Landroidx/compose/ui/b;ZZLcom/google/android/j26;Lcom/google/android/psc;Lcom/google/android/xkb;FF)Landroidx/compose/ui/b;", "", "value", "Lkotlin/Function0;", "innerTextField", "singleLine", "Lcom/google/android/nce;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "Lcom/google/android/rx8;", "contentPadding", "container", "e", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLcom/google/android/nce;Lcom/google/android/j26;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lcom/google/android/xkb;Lcom/google/android/psc;Lcom/google/android/rx8;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;III)V", "start", "end", "top", "bottom", "i", "(FFFF)Lcom/google/android/rx8;", "k", "t", "g", "(Landroidx/compose/runtime/d;I)Lcom/google/android/psc;", "Lcom/google/android/ei1;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Lcom/google/android/hzc;", "selectionColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "h", "(JJJJJJJJJJLcom/google/android/hzc;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/d;IIIIIII)Lcom/google/android/psc;", "Lcom/google/android/yi1;", "localTextSelectionColors", "m", "(Lcom/google/android/yi1;Lcom/google/android/hzc;)Lcom/google/android/psc;", "b", "F", "o", "()F", "MinHeight", "p", "MinWidth", "d", "r", "UnfocusedIndicatorThickness", "n", "FocusedIndicatorThickness", "f", "getUnfocusedBorderThickness-D9Ej5fM", "getUnfocusedBorderThickness-D9Ej5fM$annotations", "UnfocusedBorderThickness", "getFocusedBorderThickness-D9Ej5fM", "getFocusedBorderThickness-D9Ej5fM$annotations", "FocusedBorderThickness", "q", "(Landroidx/compose/runtime/d;I)Lcom/google/android/xkb;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextFieldDefaults {
    public static final TextFieldDefaults a = new TextFieldDefaults();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final float MinHeight = ff3.i(56);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final float MinWidth = ff3.i(280);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final float UnfocusedIndicatorThickness;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final float FocusedIndicatorThickness;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final float UnfocusedBorderThickness;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final float FocusedBorderThickness;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements Function2<d, Integer, Unit> {
        final /* synthetic */ boolean a;
        final /* synthetic */ boolean b;
        final /* synthetic */ j26 c;
        final /* synthetic */ psc d;
        final /* synthetic */ xkb e;

        a(boolean z, boolean z2, j26 j26Var, psc pscVar, xkb xkbVar) {
            this.a = z;
            this.b = z2;
            this.c = j26Var;
            this.d = pscVar;
            this.e = xkbVar;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final void a(d dVar, int i) throws NoWhenBranchMatchedException {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(417908150, i, -1, "androidx.compose.material3.TextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:390)");
            }
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.a;
            textFieldDefaults.c(this.a, this.b, this.c, androidx.compose.ui.b.INSTANCE, this.d, this.e, textFieldDefaults.n(), textFieldDefaults.r(), dVar, 114822144, 0);
            if (e.k()) {
                e.n();
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
            a((d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements ps4<guc, d, Integer, Unit> {
        final /* synthetic */ Function2<d, Integer, Unit> a;

        /* JADX WARN: Multi-variable type inference failed */
        b(Function2<? super d, ? super Integer, Unit> function2) {
            this.a = function2;
        }

        public final void a(guc gucVar, d dVar, int i) {
            if (!dVar.g((i & 17) != 16, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(1110058497, i, -1, "androidx.compose.material3.TextFieldDefaults.DecorationBox.<anonymous>.<anonymous> (TextFieldDefaults.kt:415)");
            }
            this.a.invoke(dVar, 0);
            if (e.k()) {
                e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((guc) obj, (d) obj2, ((Number) obj3).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c implements ri1, dt4 {
        private final /* synthetic */ Function0 a;

        c(Function0 function0) {
            this.a = function0;
        }

        @Override // com.google.inputmethod.ri1
        public final /* synthetic */ long a() {
            return ((ei1) this.a.invoke()).getValue();
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ri1) && (obj instanceof dt4)) {
                return Intrinsics.e(getFunctionDelegate(), ((dt4) obj).getFunctionDelegate());
            }
            return false;
        }

        public final ws4<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    static {
        float fI = ff3.i(1);
        UnfocusedIndicatorThickness = fI;
        float fI2 = ff3.i(2);
        FocusedIndicatorThickness = fI2;
        UnfocusedBorderThickness = fI;
        FocusedBorderThickness = fI2;
    }

    private TextFieldDefaults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit d(TextFieldDefaults textFieldDefaults, boolean z, boolean z2, j26 j26Var, androidx.compose.ui.b bVar, psc pscVar, xkb xkbVar, float f, float f2, int i, int i2, d dVar, int i3) throws NoWhenBranchMatchedException {
        textFieldDefaults.c(z, z2, j26Var, bVar, pscVar, xkbVar, f, f2, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit f(TextFieldDefaults textFieldDefaults, String str, Function2 function2, boolean z, boolean z2, nce nceVar, j26 j26Var, boolean z3, Function2 function3, Function2 function4, Function2 function5, Function2 function6, Function2 function7, Function2 function8, Function2 function9, xkb xkbVar, psc pscVar, rx8 rx8Var, Function2 function10, int i, int i2, int i3, d dVar, int i4) throws NoWhenBranchMatchedException {
        textFieldDefaults.e(str, function2, z, z2, nceVar, j26Var, z3, function3, function4, function5, function6, function7, function8, function9, xkbVar, pscVar, rx8Var, function10, dVar, saa.a(i | 1), saa.a(i2), i3);
        return Unit.a;
    }

    public static /* synthetic */ rx8 j(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.L();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.L();
        }
        if ((i & 4) != 0) {
            f3 = u1.i();
        }
        if ((i & 8) != 0) {
            f4 = u1.i();
        }
        return textFieldDefaults.i(f, f2, f3, f4);
    }

    public static /* synthetic */ rx8 l(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.L();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.L();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.L();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.L();
        }
        return textFieldDefaults.k(f, f2, f3, f4);
    }

    public static /* synthetic */ rx8 u(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.L();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.K();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.L();
        }
        if ((i & 8) != 0) {
            f4 = ff3.i(0);
        }
        return textFieldDefaults.t(f, f2, f3, f4);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:100:0x0106  */
    /* JADX WARN: Code duplicated, block: B:101:0x0108  */
    /* JADX WARN: Code duplicated, block: B:104:0x0111  */
    /* JADX WARN: Code duplicated, block: B:122:0x0150 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x0152  */
    /* JADX WARN: Code duplicated, block: B:126:0x0159  */
    /* JADX WARN: Code duplicated, block: B:127:0x0164  */
    /* JADX WARN: Code duplicated, block: B:130:0x016a  */
    /* JADX WARN: Code duplicated, block: B:131:0x0173  */
    /* JADX WARN: Code duplicated, block: B:134:0x0178  */
    /* JADX WARN: Code duplicated, block: B:135:0x017d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0182  */
    /* JADX WARN: Code duplicated, block: B:139:0x0190  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:145:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:147:0x0204  */
    /* JADX WARN: Code duplicated, block: B:150:0x0216  */
    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:95:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:96:0x00fa  */
    public final void c(final boolean z, final boolean z2, final j26 j26Var, androidx.compose.ui.b bVar, psc pscVar, xkb xkbVar, float f, float f2, d dVar, final int i, final int i2) throws NoWhenBranchMatchedException {
        int i3;
        androidx.compose.ui.b bVar2;
        xkb xkbVar2;
        float f3;
        float f4;
        int i4;
        boolean z3;
        final psc pscVar2;
        final androidx.compose.ui.b bVar3;
        d dVar2;
        final xkb xkbVar3;
        final float f5;
        final float f6;
        s6b s6bVarH;
        psc pscVarG;
        xkb xkbVarQ;
        float f7;
        psc pscVar3;
        androidx.compose.ui.b bVar4;
        float f8;
        int i5;
        float f9;
        d dVarF = dVar.F(-818661242);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.A(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= dVarF.A(z2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= dVarF.x(j26Var) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                bVar2 = bVar;
                i3 |= dVarF.x(bVar2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                i3 |= ((i2 & 16) == 0 || !dVarF.x(pscVar)) ? 8192 : 16384;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    xkbVar2 = xkbVar;
                    int i7 = dVarF.x(xkbVar2) ? 131072 : 65536;
                    i3 |= i7;
                } else {
                    xkbVar2 = xkbVar;
                }
                i3 |= i7;
            } else {
                xkbVar2 = xkbVar;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    f3 = f;
                    int i8 = dVarF.B(f3) ? 1048576 : 524288;
                    i3 |= i8;
                } else {
                    f3 = f;
                }
                i3 |= i8;
            } else {
                f3 = f;
            }
            if ((12582912 & i) == 0) {
                if ((i2 & 128) == 0) {
                    f4 = f2;
                    int i9 = dVarF.B(f4) ? 8388608 : 4194304;
                    i3 |= i9;
                } else {
                    f4 = f2;
                }
                i3 |= i9;
            } else {
                f4 = f2;
            }
            if ((i2 & 256) != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (dVarF.x(this)) {
                    i4 = 67108864;
                } else {
                    i4 = 33554432;
                }
                i3 |= i4;
            }
            if ((38347923 & i3) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0 || dVarF.t()) {
                    if (i6 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if ((i2 & 16) != 0) {
                        pscVarG = g(dVarF, (i3 >> 24) & 14);
                        i3 &= -57345;
                    } else {
                        pscVarG = pscVar;
                    }
                    if ((i2 & 32) != 0) {
                        xkbVarQ = a.q(dVarF, 6);
                        i3 &= -458753;
                    } else {
                        xkbVarQ = xkbVar2;
                    }
                    if ((i2 & 64) != 0) {
                        f7 = FocusedIndicatorThickness;
                        i3 &= -3670017;
                    } else {
                        f7 = f3;
                    }
                    if ((i2 & 128) != 0) {
                        int i10 = i3 & (-29360129);
                        pscVar3 = pscVarG;
                        bVar4 = bVar2;
                        f8 = f7;
                        i5 = i10;
                        f9 = UnfocusedIndicatorThickness;
                    } else {
                        int i11 = i3;
                        pscVar3 = pscVarG;
                        bVar4 = bVar2;
                        f8 = f7;
                        i5 = i11;
                        f9 = f4;
                    }
                } else {
                    dVarF.q();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        i3 &= -29360129;
                    }
                    bVar4 = bVar2;
                    xkbVarQ = xkbVar2;
                    f8 = f3;
                    f9 = f4;
                    i5 = i3;
                    pscVar3 = pscVar;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-818661242, i5, -1, "androidx.compose.material3.TextFieldDefaults.Container (TextFieldDefaults.kt:241)");
                }
                final q6c<ei1> q6cVarB = osb.b(pscVar3.b(z, z2, FocusInteractionKt.a(j26Var, dVarF, (i5 >> 6) & 14).getValue().booleanValue()), d08.b(MotionSchemeKeyTokens.FastEffects, dVarF, 6), null, null, dVarF, 0, 12);
                androidx.compose.ui.b bVarN = TextFieldImplKt.N(bVar4, new c(new PropertyReference0Impl(q6cVarB) { // from class: androidx.compose.material3.TextFieldDefaults$Container$1
                    public Object get() {
                        return ((q6c) ((CallableReference) this).receiver).getValue();
                    }
                }), xkbVarQ);
                androidx.compose.ui.b bVar5 = bVar4;
                psc pscVar4 = pscVar3;
                xkb xkbVar4 = xkbVarQ;
                float f10 = f8;
                float f11 = f9;
                j.b(s(bVarN, z, z2, j26Var, pscVar4, xkbVar4, f10, f11), dVarF, 0);
                if (e.k()) {
                    e.n();
                }
                dVar2 = dVarF;
                f6 = f11;
                f5 = f10;
                xkbVar3 = xkbVar4;
                pscVar2 = pscVar4;
                bVar3 = bVar5;
            } else {
                dVarF.q();
                pscVar2 = pscVar;
                bVar3 = bVar2;
                dVar2 = dVarF;
                xkbVar3 = xkbVar2;
                f5 = f3;
                f6 = f4;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.vsc
                    public final Object invoke(Object obj, Object obj2) {
                        return TextFieldDefaults.d(this.a, z, z2, j26Var, bVar3, pscVar2, xkbVar3, f5, f6, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 3072;
        bVar2 = bVar;
        if ((i & 24576) != 0) {
            i3 |= ((i2 & 16) == 0 || !dVarF.x(pscVar)) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                xkbVar2 = xkbVar;
                if (dVarF.x(xkbVar2)) {
                }
                i3 |= i7;
            } else {
                xkbVar2 = xkbVar;
            }
            i3 |= i7;
        } else {
            xkbVar2 = xkbVar;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                f3 = f;
                if (dVarF.B(f3)) {
                }
                i3 |= i8;
            } else {
                f3 = f;
            }
            i3 |= i8;
        } else {
            f3 = f;
        }
        if ((12582912 & i) == 0) {
            if ((i2 & 128) == 0) {
                f4 = f2;
                if (dVarF.B(f4)) {
                }
                i3 |= i9;
            } else {
                f4 = f2;
            }
            i3 |= i9;
        } else {
            f4 = f2;
        }
        if ((i2 & 256) != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (dVarF.x(this)) {
                i4 = 67108864;
            } else {
                i4 = 33554432;
            }
            i3 |= i4;
        }
        if ((38347923 & i3) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (dVarF.g(z3, i3 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    bVar2 = androidx.compose.ui.b.INSTANCE;
                }
                if ((i2 & 16) != 0) {
                    pscVarG = g(dVarF, (i3 >> 24) & 14);
                    i3 &= -57345;
                } else {
                    pscVarG = pscVar;
                }
                if ((i2 & 32) != 0) {
                    xkbVarQ = a.q(dVarF, 6);
                    i3 &= -458753;
                } else {
                    xkbVarQ = xkbVar2;
                }
                if ((i2 & 64) != 0) {
                    f7 = FocusedIndicatorThickness;
                    i3 &= -3670017;
                } else {
                    f7 = f3;
                }
                if ((i2 & 128) != 0) {
                    int i12 = i3 & (-29360129);
                    pscVar3 = pscVarG;
                    bVar4 = bVar2;
                    f8 = f7;
                    i5 = i12;
                    f9 = UnfocusedIndicatorThickness;
                } else {
                    int i13 = i3;
                    pscVar3 = pscVarG;
                    bVar4 = bVar2;
                    f8 = f7;
                    i5 = i13;
                    f9 = f4;
                }
            } else {
                if (i6 != 0) {
                    bVar2 = androidx.compose.ui.b.INSTANCE;
                }
                if ((i2 & 16) != 0) {
                    pscVarG = g(dVarF, (i3 >> 24) & 14);
                    i3 &= -57345;
                } else {
                    pscVarG = pscVar;
                }
                if ((i2 & 32) != 0) {
                    xkbVarQ = a.q(dVarF, 6);
                    i3 &= -458753;
                } else {
                    xkbVarQ = xkbVar2;
                }
                if ((i2 & 64) != 0) {
                    f7 = FocusedIndicatorThickness;
                    i3 &= -3670017;
                } else {
                    f7 = f3;
                }
                if ((i2 & 128) != 0) {
                    int i14 = i3 & (-29360129);
                    pscVar3 = pscVarG;
                    bVar4 = bVar2;
                    f8 = f7;
                    i5 = i14;
                    f9 = UnfocusedIndicatorThickness;
                } else {
                    int i15 = i3;
                    pscVar3 = pscVarG;
                    bVar4 = bVar2;
                    f8 = f7;
                    i5 = i15;
                    f9 = f4;
                }
            }
            dVarF.M();
            if (e.k()) {
                e.o(-818661242, i5, -1, "androidx.compose.material3.TextFieldDefaults.Container (TextFieldDefaults.kt:241)");
            }
            final Object q6cVarB2 = osb.b(pscVar3.b(z, z2, FocusInteractionKt.a(j26Var, dVarF, (i5 >> 6) & 14).getValue().booleanValue()), d08.b(MotionSchemeKeyTokens.FastEffects, dVarF, 6), null, null, dVarF, 0, 12);
            androidx.compose.ui.b bVarN2 = TextFieldImplKt.N(bVar4, new c(new PropertyReference0Impl(q6cVarB2) { // from class: androidx.compose.material3.TextFieldDefaults$Container$1
                public Object get() {
                    return ((q6c) ((CallableReference) this).receiver).getValue();
                }
            }), xkbVarQ);
            androidx.compose.ui.b bVar6 = bVar4;
            psc pscVar5 = pscVar3;
            xkb xkbVar5 = xkbVarQ;
            float f12 = f8;
            float f13 = f9;
            j.b(s(bVarN2, z, z2, j26Var, pscVar5, xkbVar5, f12, f13), dVarF, 0);
            if (e.k()) {
                e.n();
            }
            dVar2 = dVarF;
            f6 = f13;
            f5 = f12;
            xkbVar3 = xkbVar5;
            pscVar2 = pscVar5;
            bVar3 = bVar6;
        } else {
            dVarF.q();
            pscVar2 = pscVar;
            bVar3 = bVar2;
            dVar2 = dVarF;
            xkbVar3 = xkbVar2;
            f5 = f3;
            f6 = f4;
        }
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.vsc
                public final Object invoke(Object obj, Object obj2) {
                    return TextFieldDefaults.d(this.a, z, z2, j26Var, bVar3, pscVar2, xkbVar3, f5, f6, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:101:0x0123  */
    /* JADX WARN: Code duplicated, block: B:103:0x0127  */
    /* JADX WARN: Code duplicated, block: B:105:0x0131  */
    /* JADX WARN: Code duplicated, block: B:106:0x0134  */
    /* JADX WARN: Code duplicated, block: B:110:0x013c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0145  */
    /* JADX WARN: Code duplicated, block: B:113:0x0149  */
    /* JADX WARN: Code duplicated, block: B:115:0x0153  */
    /* JADX WARN: Code duplicated, block: B:116:0x0156  */
    /* JADX WARN: Code duplicated, block: B:118:0x015b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0165  */
    /* JADX WARN: Code duplicated, block: B:123:0x016c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0170  */
    /* JADX WARN: Code duplicated, block: B:127:0x017a  */
    /* JADX WARN: Code duplicated, block: B:128:0x017d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0182  */
    /* JADX WARN: Code duplicated, block: B:133:0x018d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0190  */
    /* JADX WARN: Code duplicated, block: B:136:0x0196  */
    /* JADX WARN: Code duplicated, block: B:138:0x019e  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:147:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:151:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:161:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:164:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:166:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:169:0x0202  */
    /* JADX WARN: Code duplicated, block: B:171:0x0207  */
    /* JADX WARN: Code duplicated, block: B:174:0x020f  */
    /* JADX WARN: Code duplicated, block: B:176:0x0215  */
    /* JADX WARN: Code duplicated, block: B:179:0x021e  */
    /* JADX WARN: Code duplicated, block: B:181:0x0223  */
    /* JADX WARN: Code duplicated, block: B:184:0x022b  */
    /* JADX WARN: Code duplicated, block: B:185:0x0230  */
    /* JADX WARN: Code duplicated, block: B:187:0x0236  */
    /* JADX WARN: Code duplicated, block: B:189:0x023c  */
    /* JADX WARN: Code duplicated, block: B:190:0x023f  */
    /* JADX WARN: Code duplicated, block: B:194:0x0249  */
    /* JADX WARN: Code duplicated, block: B:195:0x024c  */
    /* JADX WARN: Code duplicated, block: B:197:0x0250  */
    /* JADX WARN: Code duplicated, block: B:199:0x0256  */
    /* JADX WARN: Code duplicated, block: B:200:0x0259  */
    /* JADX WARN: Code duplicated, block: B:204:0x026b  */
    /* JADX WARN: Code duplicated, block: B:208:0x0279  */
    /* JADX WARN: Code duplicated, block: B:211:0x0282  */
    /* JADX WARN: Code duplicated, block: B:213:0x028a  */
    /* JADX WARN: Code duplicated, block: B:226:0x02cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:227:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:229:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:231:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:232:0x02da  */
    /* JADX WARN: Code duplicated, block: B:234:0x02de  */
    /* JADX WARN: Code duplicated, block: B:235:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:237:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:238:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:240:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:241:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:243:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:244:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:246:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:247:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:250:0x0302  */
    /* JADX WARN: Code duplicated, block: B:251:0x030e  */
    /* JADX WARN: Code duplicated, block: B:254:0x0317  */
    /* JADX WARN: Code duplicated, block: B:255:0x0327  */
    /* JADX WARN: Code duplicated, block: B:258:0x032f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:259:0x0331  */
    /* JADX WARN: Code duplicated, block: B:260:0x0350  */
    /* JADX WARN: Code duplicated, block: B:262:0x0374  */
    /* JADX WARN: Code duplicated, block: B:264:0x0378  */
    /* JADX WARN: Code duplicated, block: B:266:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:269:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:272:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:273:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:276:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:279:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:283:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:286:0x0431  */
    /* JADX WARN: Code duplicated, block: B:287:0x0441  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:290:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:292:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:295:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:297:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:90:0x0103  */
    /* JADX WARN: Code duplicated, block: B:92:0x0109  */
    /* JADX WARN: Code duplicated, block: B:94:0x010f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0112  */
    /* JADX WARN: Code duplicated, block: B:99:0x011c  */
    public final void e(final String str, final Function2<? super d, ? super Integer, Unit> function2, final boolean z, final boolean z2, final nce nceVar, final j26 j26Var, boolean z3, Function2<? super d, ? super Integer, Unit> function3, Function2<? super d, ? super Integer, Unit> function4, Function2<? super d, ? super Integer, Unit> function5, Function2<? super d, ? super Integer, Unit> function6, Function2<? super d, ? super Integer, Unit> function7, Function2<? super d, ? super Integer, Unit> function8, Function2<? super d, ? super Integer, Unit> function9, xkb xkbVar, psc pscVar, rx8 rx8Var, Function2<? super d, ? super Integer, Unit> function10, d dVar, final int i, final int i2, final int i3) throws NoWhenBranchMatchedException {
        int i4;
        Function2<? super d, ? super Integer, Unit> function11;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        int i7;
        int i8;
        j26 j26Var2;
        int i9;
        int i10;
        boolean z6;
        int i11;
        int i12;
        Function2<? super d, ? super Integer, Unit> function12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        boolean z7;
        d dVar2;
        final Function2<? super d, ? super Integer, Unit> function13;
        final Function2<? super d, ? super Integer, Unit> function14;
        final Function2<? super d, ? super Integer, Unit> function15;
        final Function2<? super d, ? super Integer, Unit> function16;
        final xkb xkbVar2;
        final psc pscVar2;
        final rx8 rx8Var2;
        final Function2<? super d, ? super Integer, Unit> function17;
        final Function2<? super d, ? super Integer, Unit> function18;
        final boolean z8;
        final Function2<? super d, ? super Integer, Unit> function19;
        final Function2<? super d, ? super Integer, Unit> function20;
        s6b s6bVarH;
        Function2<? super d, ? super Integer, Unit> function21;
        Function2<? super d, ? super Integer, Unit> function22;
        Function2<? super d, ? super Integer, Unit> function23;
        Function2<? super d, ? super Integer, Unit> function24;
        Function2<? super d, ? super Integer, Unit> function25;
        Function2<? super d, ? super Integer, Unit> function26;
        xkb xkbVarQ;
        psc pscVarG;
        rx8 rx8VarJ;
        Function2<? super d, ? super Integer, Unit> function27;
        Function2<? super d, ? super Integer, Unit> function2E;
        xkb xkbVar3;
        Function2<? super d, ? super Integer, Unit> function28;
        Function2<? super d, ? super Integer, Unit> function29;
        Function2<? super d, ? super Integer, Unit> function30;
        Function2<? super d, ? super Integer, Unit> function31;
        boolean z9;
        Function2<? super d, ? super Integer, Unit> function32;
        rx8 rx8Var3;
        boolean z10;
        boolean z11;
        Object objR;
        do1 do1Var;
        int i33;
        int i34;
        d dVarF = dVar.F(1806980801);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (dVarF.x(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) == 0) {
            if ((i & 48) == 0) {
                function11 = function2;
                i4 |= dVarF.T(function11) ? 32 : 16;
            }
            if ((i3 & 4) != 0) {
                if ((i & 384) == 0) {
                    z4 = z;
                    if (dVarF.A(z4)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i4 |= i5;
                }
                if ((i3 & 8) != 0) {
                    if ((i & 3072) == 0) {
                        z5 = z2;
                        if (dVarF.A(z5)) {
                            i6 = 2048;
                        } else {
                            i6 = 1024;
                        }
                        i4 |= i6;
                    }
                    i7 = 8192;
                    if ((i3 & 16) != 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        if (dVarF.x(nceVar)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i4 |= i8;
                    }
                    if ((i3 & 32) != 0) {
                        if ((196608 & i) == 0) {
                            j26Var2 = j26Var;
                            if (dVarF.x(j26Var2)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i4 |= i9;
                        }
                        i10 = i3 & 64;
                        if (i10 != 0) {
                            i4 |= 1572864;
                            z6 = z3;
                        } else {
                            z6 = z3;
                            if ((i & 1572864) == 0) {
                                if (dVarF.A(z6)) {
                                    i11 = 1048576;
                                } else {
                                    i11 = 524288;
                                }
                                i4 |= i11;
                            }
                        }
                        i12 = i3 & 128;
                        if (i12 != 0) {
                            i4 |= 12582912;
                            function12 = function3;
                        } else {
                            function12 = function3;
                            if ((i & 12582912) == 0) {
                                if (dVarF.T(function12)) {
                                    i13 = 8388608;
                                } else {
                                    i13 = 4194304;
                                }
                                i4 |= i13;
                            }
                        }
                        i14 = i3 & 256;
                        if (i14 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            if (dVarF.T(function4)) {
                                i15 = 67108864;
                            } else {
                                i15 = 33554432;
                            }
                            i4 |= i15;
                        }
                        i16 = i3 & 512;
                        if (i16 != 0) {
                            if ((i & 805306368) == 0) {
                                if (dVarF.T(function5)) {
                                    i17 = 536870912;
                                } else {
                                    i17 = 268435456;
                                }
                                i4 |= i17;
                            }
                            i18 = i3 & 1024;
                            if (i18 != 0) {
                                i19 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                if (dVarF.T(function6)) {
                                    i20 = 4;
                                } else {
                                    i20 = 2;
                                }
                                i19 = i2 | i20;
                            } else {
                                i19 = i2;
                            }
                            i21 = i3 & 2048;
                            if (i21 != 0) {
                                i19 |= 48;
                            } else if ((i2 & 48) != 0) {
                                if (dVarF.T(function7)) {
                                    i22 = 32;
                                } else {
                                    i22 = 16;
                                }
                                i19 |= i22;
                            }
                            i23 = i19;
                            i24 = i3 & 4096;
                            if (i24 != 0) {
                                i25 = i23 | 384;
                            } else if ((i2 & 384) == 0) {
                                if (dVarF.T(function8)) {
                                    i26 = 256;
                                } else {
                                    i26 = 128;
                                }
                                i25 = i23 | i26;
                            } else {
                                i25 = i23;
                            }
                            i27 = i3 & 8192;
                            if (i27 != 0) {
                                i29 = i25 | 3072;
                            } else {
                                i28 = i25;
                                if ((i2 & 3072) == 0) {
                                    i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                                } else {
                                    i29 = i28;
                                }
                            }
                            if ((i2 & 24576) != 0) {
                                if ((i3 & 16384) == 0 && dVarF.x(xkbVar)) {
                                    i7 = 16384;
                                }
                                i29 |= i7;
                            }
                            if ((i2 & 196608) != 0) {
                                if ((i3 & 32768) == 0 || !dVarF.x(pscVar)) {
                                    i34 = 65536;
                                } else {
                                    i34 = 131072;
                                }
                                i29 |= i34;
                            }
                            if ((i2 & 1572864) != 0) {
                                if ((i3 & 65536) == 0 || !dVarF.x(rx8Var)) {
                                    i33 = 524288;
                                } else {
                                    i33 = 1048576;
                                }
                                i29 |= i33;
                            }
                            i30 = i3 & 131072;
                            if (i30 != 0) {
                                i29 |= 12582912;
                            } else if ((i2 & 12582912) == 0) {
                                if (dVarF.T(function10)) {
                                    i31 = 8388608;
                                } else {
                                    i31 = 4194304;
                                }
                                i29 |= i31;
                            }
                            if ((i3 & 262144) != 0) {
                                i29 |= 100663296;
                            } else if ((i2 & 100663296) == 0) {
                                if (dVarF.x(this)) {
                                    i32 = 67108864;
                                } else {
                                    i32 = 33554432;
                                }
                                i29 |= i32;
                            }
                            if ((i4 & 306783379) == 306783378 || (i29 & 38347923) != 38347922) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (dVarF.g(z7, i4 & 1)) {
                                dVarF.U();
                                if ((i & 1) != 0 || dVarF.t()) {
                                    if (i10 != 0) {
                                        z6 = false;
                                    }
                                    if (i12 != 0) {
                                        function12 = null;
                                    }
                                    if (i14 != 0) {
                                        function21 = null;
                                    } else {
                                        function21 = function4;
                                    }
                                    if (i16 != 0) {
                                        function22 = null;
                                    } else {
                                        function22 = function5;
                                    }
                                    if (i18 != 0) {
                                        function23 = null;
                                    } else {
                                        function23 = function6;
                                    }
                                    if (i21 != 0) {
                                        function24 = null;
                                    } else {
                                        function24 = function7;
                                    }
                                    if (i24 != 0) {
                                        function25 = null;
                                    } else {
                                        function25 = function8;
                                    }
                                    if (i27 != 0) {
                                        function26 = null;
                                    } else {
                                        function26 = function9;
                                    }
                                    if ((i3 & 16384) != 0) {
                                        xkbVarQ = a.q(dVarF, 6);
                                        i29 &= -57345;
                                    } else {
                                        xkbVarQ = xkbVar;
                                    }
                                    if ((i3 & 32768) != 0) {
                                        pscVarG = g(dVarF, (i29 >> 24) & 14);
                                        i29 &= -458753;
                                    } else {
                                        pscVarG = pscVar;
                                    }
                                    if ((i3 & 65536) != 0) {
                                        if (function12 == null) {
                                            rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        } else {
                                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        }
                                        i29 &= -3670017;
                                    } else {
                                        rx8VarJ = rx8Var;
                                    }
                                    if (i30 != 0) {
                                        function27 = function26;
                                        function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                                    } else {
                                        function27 = function26;
                                        function2E = function10;
                                    }
                                    xkbVar3 = xkbVarQ;
                                    function28 = function22;
                                    function29 = function12;
                                    function30 = function23;
                                    function31 = function21;
                                    z9 = z6;
                                    function32 = function24;
                                    rx8Var3 = rx8VarJ;
                                } else {
                                    dVarF.q();
                                    if ((i3 & 16384) != 0) {
                                        i29 &= -57345;
                                    }
                                    if ((32768 & i3) != 0) {
                                        i29 &= -458753;
                                    }
                                    if ((i3 & 65536) != 0) {
                                        i29 &= -3670017;
                                    }
                                    function28 = function5;
                                    function30 = function6;
                                    function25 = function8;
                                    xkbVar3 = xkbVar;
                                    pscVarG = pscVar;
                                    rx8Var3 = rx8Var;
                                    function2E = function10;
                                    function29 = function12;
                                    z9 = z6;
                                    i29 = i29;
                                    function31 = function4;
                                    function32 = function7;
                                    function27 = function9;
                                }
                                dVarF.M();
                                if (e.k()) {
                                    e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                                }
                                if ((i4 & 14) == 4) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                xkb xkbVar4 = xkbVar3;
                                z11 = z10 | ((57344 & i4) == 16384);
                                objR = dVarF.R();
                                if (z11 || objR == d.INSTANCE.a()) {
                                    objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                                    dVarF.L(objR);
                                }
                                String text = ((TransformedText) objR).getText().getText();
                                TextFieldType textFieldType = TextFieldType.Filled;
                                v1.Attached attached = new v1.Attached(false, null, null, 7, null);
                                if (function29 == null) {
                                    dVarF.y(-1353131191);
                                    dVarF.u();
                                    do1Var = null;
                                } else {
                                    dVarF.y(-1353131190);
                                    do1 do1VarE = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                                    dVarF.u();
                                    do1Var = do1VarE;
                                }
                                int i35 = i4 >> 9;
                                int i36 = i29 << 21;
                                boolean z12 = z5;
                                do1 do1Var2 = do1Var;
                                dVar2 = dVarF;
                                TextFieldImplKt.l(textFieldType, text, function11, attached, do1Var2, function31, function28, function30, function32, function25, function27, z12, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i35) | (3670016 & i35) | (29360128 & i36) | (234881024 & i36) | (i36 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i35 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                                if (e.k()) {
                                    e.n();
                                }
                                function18 = function29;
                                function13 = function31;
                                function14 = function28;
                                function19 = function30;
                                function15 = function32;
                                function16 = function25;
                                function20 = function27;
                                z8 = z9;
                                rx8Var2 = rx8Var3;
                                pscVar2 = pscVarG;
                                function17 = function2E;
                                xkbVar2 = xkbVar4;
                            } else {
                                dVar2 = dVarF;
                                dVar2.q();
                                function13 = function4;
                                function14 = function5;
                                function15 = function7;
                                function16 = function8;
                                xkbVar2 = xkbVar;
                                pscVar2 = pscVar;
                                rx8Var2 = rx8Var;
                                function17 = function10;
                                function18 = function12;
                                z8 = z6;
                                function19 = function6;
                                function20 = function9;
                            }
                            s6bVarH = dVar2.H();
                            if (s6bVarH != null) {
                                s6bVarH.a(new Function2() { // from class: com.google.android.usc
                                    public final Object invoke(Object obj, Object obj2) {
                                        return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i4 |= 805306368;
                        i18 = i3 & 1024;
                        if (i18 != 0) {
                            i19 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (dVarF.T(function6)) {
                                i20 = 4;
                            } else {
                                i20 = 2;
                            }
                            i19 = i2 | i20;
                        } else {
                            i19 = i2;
                        }
                        i21 = i3 & 2048;
                        if (i21 != 0) {
                            i19 |= 48;
                        } else if ((i2 & 48) != 0) {
                            if (dVarF.T(function7)) {
                                i22 = 32;
                            } else {
                                i22 = 16;
                            }
                            i19 |= i22;
                        }
                        i23 = i19;
                        i24 = i3 & 4096;
                        if (i24 != 0) {
                            i25 = i23 | 384;
                        } else if ((i2 & 384) == 0) {
                            if (dVarF.T(function8)) {
                                i26 = 256;
                            } else {
                                i26 = 128;
                            }
                            i25 = i23 | i26;
                        } else {
                            i25 = i23;
                        }
                        i27 = i3 & 8192;
                        if (i27 != 0) {
                            i29 = i25 | 3072;
                        } else {
                            i28 = i25;
                            if ((i2 & 3072) == 0) {
                                i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                            } else {
                                i29 = i28;
                            }
                        }
                        if ((i2 & 24576) != 0) {
                            if ((i3 & 16384) == 0) {
                                i7 = 16384;
                            }
                            i29 |= i7;
                        }
                        if ((i2 & 196608) != 0) {
                            if ((i3 & 32768) == 0) {
                                i34 = 65536;
                            } else {
                                i34 = 65536;
                            }
                            i29 |= i34;
                        }
                        if ((i2 & 1572864) != 0) {
                            if ((i3 & 65536) == 0) {
                                i33 = 524288;
                            } else {
                                i33 = 524288;
                            }
                            i29 |= i33;
                        }
                        i30 = i3 & 131072;
                        if (i30 != 0) {
                            i29 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            if (dVarF.T(function10)) {
                                i31 = 8388608;
                            } else {
                                i31 = 4194304;
                            }
                            i29 |= i31;
                        }
                        if ((i3 & 262144) != 0) {
                            i29 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            if (dVarF.x(this)) {
                                i32 = 67108864;
                            } else {
                                i32 = 33554432;
                            }
                            i29 |= i32;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            z7 = true;
                        } else {
                            z7 = true;
                        }
                        if (dVarF.g(z7, i4 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i10 != 0) {
                                    z6 = false;
                                }
                                if (i12 != 0) {
                                    function12 = null;
                                }
                                if (i14 != 0) {
                                    function21 = null;
                                } else {
                                    function21 = function4;
                                }
                                if (i16 != 0) {
                                    function22 = null;
                                } else {
                                    function22 = function5;
                                }
                                if (i18 != 0) {
                                    function23 = null;
                                } else {
                                    function23 = function6;
                                }
                                if (i21 != 0) {
                                    function24 = null;
                                } else {
                                    function24 = function7;
                                }
                                if (i24 != 0) {
                                    function25 = null;
                                } else {
                                    function25 = function8;
                                }
                                if (i27 != 0) {
                                    function26 = null;
                                } else {
                                    function26 = function9;
                                }
                                if ((i3 & 16384) != 0) {
                                    xkbVarQ = a.q(dVarF, 6);
                                    i29 &= -57345;
                                } else {
                                    xkbVarQ = xkbVar;
                                }
                                if ((i3 & 32768) != 0) {
                                    pscVarG = g(dVarF, (i29 >> 24) & 14);
                                    i29 &= -458753;
                                } else {
                                    pscVarG = pscVar;
                                }
                                if ((i3 & 65536) != 0) {
                                    if (function12 == null) {
                                        rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    } else {
                                        rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    }
                                    i29 &= -3670017;
                                } else {
                                    rx8VarJ = rx8Var;
                                }
                                if (i30 != 0) {
                                    function27 = function26;
                                    function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                                } else {
                                    function27 = function26;
                                    function2E = function10;
                                }
                                xkbVar3 = xkbVarQ;
                                function28 = function22;
                                function29 = function12;
                                function30 = function23;
                                function31 = function21;
                                z9 = z6;
                                function32 = function24;
                                rx8Var3 = rx8VarJ;
                            } else {
                                if (i10 != 0) {
                                    z6 = false;
                                }
                                if (i12 != 0) {
                                    function12 = null;
                                }
                                if (i14 != 0) {
                                    function21 = null;
                                } else {
                                    function21 = function4;
                                }
                                if (i16 != 0) {
                                    function22 = null;
                                } else {
                                    function22 = function5;
                                }
                                if (i18 != 0) {
                                    function23 = null;
                                } else {
                                    function23 = function6;
                                }
                                if (i21 != 0) {
                                    function24 = null;
                                } else {
                                    function24 = function7;
                                }
                                if (i24 != 0) {
                                    function25 = null;
                                } else {
                                    function25 = function8;
                                }
                                if (i27 != 0) {
                                    function26 = null;
                                } else {
                                    function26 = function9;
                                }
                                if ((i3 & 16384) != 0) {
                                    xkbVarQ = a.q(dVarF, 6);
                                    i29 &= -57345;
                                } else {
                                    xkbVarQ = xkbVar;
                                }
                                if ((i3 & 32768) != 0) {
                                    pscVarG = g(dVarF, (i29 >> 24) & 14);
                                    i29 &= -458753;
                                } else {
                                    pscVarG = pscVar;
                                }
                                if ((i3 & 65536) != 0) {
                                    if (function12 == null) {
                                        rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    } else {
                                        rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    }
                                    i29 &= -3670017;
                                } else {
                                    rx8VarJ = rx8Var;
                                }
                                if (i30 != 0) {
                                    function27 = function26;
                                    function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                                } else {
                                    function27 = function26;
                                    function2E = function10;
                                }
                                xkbVar3 = xkbVarQ;
                                function28 = function22;
                                function29 = function12;
                                function30 = function23;
                                function31 = function21;
                                z9 = z6;
                                function32 = function24;
                                rx8Var3 = rx8VarJ;
                            }
                            dVarF.M();
                            if (e.k()) {
                                e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                            }
                            if ((i4 & 14) == 4) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            xkb xkbVar5 = xkbVar3;
                            z11 = z10 | ((57344 & i4) == 16384);
                            objR = dVarF.R();
                            if (z11) {
                                objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                                dVarF.L(objR);
                            } else {
                                objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                                dVarF.L(objR);
                            }
                            String text2 = ((TransformedText) objR).getText().getText();
                            TextFieldType textFieldType2 = TextFieldType.Filled;
                            v1.Attached attached2 = new v1.Attached(false, null, null, 7, null);
                            if (function29 == null) {
                                dVarF.y(-1353131191);
                                dVarF.u();
                                do1Var = null;
                            } else {
                                dVarF.y(-1353131190);
                                do1 do1VarE2 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                                dVarF.u();
                                do1Var = do1VarE2;
                            }
                            int i37 = i4 >> 9;
                            int i38 = i29 << 21;
                            boolean z13 = z5;
                            do1 do1Var3 = do1Var;
                            dVar2 = dVarF;
                            TextFieldImplKt.l(textFieldType2, text2, function11, attached2, do1Var3, function31, function28, function30, function32, function25, function27, z13, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i37) | (3670016 & i37) | (29360128 & i38) | (234881024 & i38) | (i38 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i37 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                            if (e.k()) {
                                e.n();
                            }
                            function18 = function29;
                            function13 = function31;
                            function14 = function28;
                            function19 = function30;
                            function15 = function32;
                            function16 = function25;
                            function20 = function27;
                            z8 = z9;
                            rx8Var2 = rx8Var3;
                            pscVar2 = pscVarG;
                            function17 = function2E;
                            xkbVar2 = xkbVar5;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            function13 = function4;
                            function14 = function5;
                            function15 = function7;
                            function16 = function8;
                            xkbVar2 = xkbVar;
                            pscVar2 = pscVar;
                            rx8Var2 = rx8Var;
                            function17 = function10;
                            function18 = function12;
                            z8 = z6;
                            function19 = function6;
                            function20 = function9;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.usc
                                public final Object invoke(Object obj, Object obj2) {
                                    return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i4 |= 196608;
                    j26Var2 = j26Var;
                    i10 = i3 & 64;
                    if (i10 != 0) {
                        i4 |= 1572864;
                        z6 = z3;
                    } else {
                        z6 = z3;
                        if ((i & 1572864) == 0) {
                            if (dVarF.A(z6)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i4 |= i11;
                        }
                    }
                    i12 = i3 & 128;
                    if (i12 != 0) {
                        i4 |= 12582912;
                        function12 = function3;
                    } else {
                        function12 = function3;
                        if ((i & 12582912) == 0) {
                            if (dVarF.T(function12)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i4 |= i13;
                        }
                    }
                    i14 = i3 & 256;
                    if (i14 != 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (dVarF.T(function4)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                        i4 |= i15;
                    }
                    i16 = i3 & 512;
                    if (i16 != 0) {
                        if ((i & 805306368) == 0) {
                            if (dVarF.T(function5)) {
                                i17 = 536870912;
                            } else {
                                i17 = 268435456;
                            }
                            i4 |= i17;
                        }
                        i18 = i3 & 1024;
                        if (i18 != 0) {
                            i19 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (dVarF.T(function6)) {
                                i20 = 4;
                            } else {
                                i20 = 2;
                            }
                            i19 = i2 | i20;
                        } else {
                            i19 = i2;
                        }
                        i21 = i3 & 2048;
                        if (i21 != 0) {
                            i19 |= 48;
                        } else if ((i2 & 48) != 0) {
                            if (dVarF.T(function7)) {
                                i22 = 32;
                            } else {
                                i22 = 16;
                            }
                            i19 |= i22;
                        }
                        i23 = i19;
                        i24 = i3 & 4096;
                        if (i24 != 0) {
                            i25 = i23 | 384;
                        } else if ((i2 & 384) == 0) {
                            if (dVarF.T(function8)) {
                                i26 = 256;
                            } else {
                                i26 = 128;
                            }
                            i25 = i23 | i26;
                        } else {
                            i25 = i23;
                        }
                        i27 = i3 & 8192;
                        if (i27 != 0) {
                            i29 = i25 | 3072;
                        } else {
                            i28 = i25;
                            if ((i2 & 3072) == 0) {
                                i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                            } else {
                                i29 = i28;
                            }
                        }
                        if ((i2 & 24576) != 0) {
                            if ((i3 & 16384) == 0) {
                                i7 = 16384;
                            }
                            i29 |= i7;
                        }
                        if ((i2 & 196608) != 0) {
                            if ((i3 & 32768) == 0) {
                                i34 = 65536;
                            } else {
                                i34 = 65536;
                            }
                            i29 |= i34;
                        }
                        if ((i2 & 1572864) != 0) {
                            if ((i3 & 65536) == 0) {
                                i33 = 524288;
                            } else {
                                i33 = 524288;
                            }
                            i29 |= i33;
                        }
                        i30 = i3 & 131072;
                        if (i30 != 0) {
                            i29 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            if (dVarF.T(function10)) {
                                i31 = 8388608;
                            } else {
                                i31 = 4194304;
                            }
                            i29 |= i31;
                        }
                        if ((i3 & 262144) != 0) {
                            i29 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            if (dVarF.x(this)) {
                                i32 = 67108864;
                            } else {
                                i32 = 33554432;
                            }
                            i29 |= i32;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            z7 = true;
                        } else {
                            z7 = true;
                        }
                        if (dVarF.g(z7, i4 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i10 != 0) {
                                    z6 = false;
                                }
                                if (i12 != 0) {
                                    function12 = null;
                                }
                                if (i14 != 0) {
                                    function21 = null;
                                } else {
                                    function21 = function4;
                                }
                                if (i16 != 0) {
                                    function22 = null;
                                } else {
                                    function22 = function5;
                                }
                                if (i18 != 0) {
                                    function23 = null;
                                } else {
                                    function23 = function6;
                                }
                                if (i21 != 0) {
                                    function24 = null;
                                } else {
                                    function24 = function7;
                                }
                                if (i24 != 0) {
                                    function25 = null;
                                } else {
                                    function25 = function8;
                                }
                                if (i27 != 0) {
                                    function26 = null;
                                } else {
                                    function26 = function9;
                                }
                                if ((i3 & 16384) != 0) {
                                    xkbVarQ = a.q(dVarF, 6);
                                    i29 &= -57345;
                                } else {
                                    xkbVarQ = xkbVar;
                                }
                                if ((i3 & 32768) != 0) {
                                    pscVarG = g(dVarF, (i29 >> 24) & 14);
                                    i29 &= -458753;
                                } else {
                                    pscVarG = pscVar;
                                }
                                if ((i3 & 65536) != 0) {
                                    if (function12 == null) {
                                        rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    } else {
                                        rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    }
                                    i29 &= -3670017;
                                } else {
                                    rx8VarJ = rx8Var;
                                }
                                if (i30 != 0) {
                                    function27 = function26;
                                    function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                                } else {
                                    function27 = function26;
                                    function2E = function10;
                                }
                                xkbVar3 = xkbVarQ;
                                function28 = function22;
                                function29 = function12;
                                function30 = function23;
                                function31 = function21;
                                z9 = z6;
                                function32 = function24;
                                rx8Var3 = rx8VarJ;
                            } else {
                                if (i10 != 0) {
                                    z6 = false;
                                }
                                if (i12 != 0) {
                                    function12 = null;
                                }
                                if (i14 != 0) {
                                    function21 = null;
                                } else {
                                    function21 = function4;
                                }
                                if (i16 != 0) {
                                    function22 = null;
                                } else {
                                    function22 = function5;
                                }
                                if (i18 != 0) {
                                    function23 = null;
                                } else {
                                    function23 = function6;
                                }
                                if (i21 != 0) {
                                    function24 = null;
                                } else {
                                    function24 = function7;
                                }
                                if (i24 != 0) {
                                    function25 = null;
                                } else {
                                    function25 = function8;
                                }
                                if (i27 != 0) {
                                    function26 = null;
                                } else {
                                    function26 = function9;
                                }
                                if ((i3 & 16384) != 0) {
                                    xkbVarQ = a.q(dVarF, 6);
                                    i29 &= -57345;
                                } else {
                                    xkbVarQ = xkbVar;
                                }
                                if ((i3 & 32768) != 0) {
                                    pscVarG = g(dVarF, (i29 >> 24) & 14);
                                    i29 &= -458753;
                                } else {
                                    pscVarG = pscVar;
                                }
                                if ((i3 & 65536) != 0) {
                                    if (function12 == null) {
                                        rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    } else {
                                        rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    }
                                    i29 &= -3670017;
                                } else {
                                    rx8VarJ = rx8Var;
                                }
                                if (i30 != 0) {
                                    function27 = function26;
                                    function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                                } else {
                                    function27 = function26;
                                    function2E = function10;
                                }
                                xkbVar3 = xkbVarQ;
                                function28 = function22;
                                function29 = function12;
                                function30 = function23;
                                function31 = function21;
                                z9 = z6;
                                function32 = function24;
                                rx8Var3 = rx8VarJ;
                            }
                            dVarF.M();
                            if (e.k()) {
                                e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                            }
                            if ((i4 & 14) == 4) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            xkb xkbVar6 = xkbVar3;
                            z11 = z10 | ((57344 & i4) == 16384);
                            objR = dVarF.R();
                            if (z11) {
                                objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                                dVarF.L(objR);
                            } else {
                                objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                                dVarF.L(objR);
                            }
                            String text3 = ((TransformedText) objR).getText().getText();
                            TextFieldType textFieldType3 = TextFieldType.Filled;
                            v1.Attached attached3 = new v1.Attached(false, null, null, 7, null);
                            if (function29 == null) {
                                dVarF.y(-1353131191);
                                dVarF.u();
                                do1Var = null;
                            } else {
                                dVarF.y(-1353131190);
                                do1 do1VarE3 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                                dVarF.u();
                                do1Var = do1VarE3;
                            }
                            int i39 = i4 >> 9;
                            int i310 = i29 << 21;
                            boolean z14 = z5;
                            do1 do1Var4 = do1Var;
                            dVar2 = dVarF;
                            TextFieldImplKt.l(textFieldType3, text3, function11, attached3, do1Var4, function31, function28, function30, function32, function25, function27, z14, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i39) | (3670016 & i39) | (29360128 & i310) | (234881024 & i310) | (i310 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i39 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                            if (e.k()) {
                                e.n();
                            }
                            function18 = function29;
                            function13 = function31;
                            function14 = function28;
                            function19 = function30;
                            function15 = function32;
                            function16 = function25;
                            function20 = function27;
                            z8 = z9;
                            rx8Var2 = rx8Var3;
                            pscVar2 = pscVarG;
                            function17 = function2E;
                            xkbVar2 = xkbVar6;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            function13 = function4;
                            function14 = function5;
                            function15 = function7;
                            function16 = function8;
                            xkbVar2 = xkbVar;
                            pscVar2 = pscVar;
                            rx8Var2 = rx8Var;
                            function17 = function10;
                            function18 = function12;
                            z8 = z6;
                            function19 = function6;
                            function20 = function9;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.usc
                                public final Object invoke(Object obj, Object obj2) {
                                    return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i4 |= 805306368;
                    i18 = i3 & 1024;
                    if (i18 != 0) {
                        i19 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (dVarF.T(function6)) {
                            i20 = 4;
                        } else {
                            i20 = 2;
                        }
                        i19 = i2 | i20;
                    } else {
                        i19 = i2;
                    }
                    i21 = i3 & 2048;
                    if (i21 != 0) {
                        i19 |= 48;
                    } else if ((i2 & 48) != 0) {
                        if (dVarF.T(function7)) {
                            i22 = 32;
                        } else {
                            i22 = 16;
                        }
                        i19 |= i22;
                    }
                    i23 = i19;
                    i24 = i3 & 4096;
                    if (i24 != 0) {
                        i25 = i23 | 384;
                    } else if ((i2 & 384) == 0) {
                        if (dVarF.T(function8)) {
                            i26 = 256;
                        } else {
                            i26 = 128;
                        }
                        i25 = i23 | i26;
                    } else {
                        i25 = i23;
                    }
                    i27 = i3 & 8192;
                    if (i27 != 0) {
                        i29 = i25 | 3072;
                    } else {
                        i28 = i25;
                        if ((i2 & 3072) == 0) {
                            i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                        } else {
                            i29 = i28;
                        }
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i7 = 16384;
                        }
                        i29 |= i7;
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32768) == 0) {
                            i34 = 65536;
                        } else {
                            i34 = 65536;
                        }
                        i29 |= i34;
                    }
                    if ((i2 & 1572864) != 0) {
                        if ((i3 & 65536) == 0) {
                            i33 = 524288;
                        } else {
                            i33 = 524288;
                        }
                        i29 |= i33;
                    }
                    i30 = i3 & 131072;
                    if (i30 != 0) {
                        i29 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (dVarF.T(function10)) {
                            i31 = 8388608;
                        } else {
                            i31 = 4194304;
                        }
                        i29 |= i31;
                    }
                    if ((i3 & 262144) != 0) {
                        i29 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (dVarF.x(this)) {
                            i32 = 67108864;
                        } else {
                            i32 = 33554432;
                        }
                        i29 |= i32;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (dVarF.g(z7, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z6 = false;
                            }
                            if (i12 != 0) {
                                function12 = null;
                            }
                            if (i14 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i16 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i18 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i21 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i24 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i27 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                xkbVarQ = a.q(dVarF, 6);
                                i29 &= -57345;
                            } else {
                                xkbVarQ = xkbVar;
                            }
                            if ((i3 & 32768) != 0) {
                                pscVarG = g(dVarF, (i29 >> 24) & 14);
                                i29 &= -458753;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 65536) != 0) {
                                if (function12 == null) {
                                    rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i29 &= -3670017;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i30 != 0) {
                                function27 = function26;
                                function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            xkbVar3 = xkbVarQ;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z9 = z6;
                            function32 = function24;
                            rx8Var3 = rx8VarJ;
                        } else {
                            if (i10 != 0) {
                                z6 = false;
                            }
                            if (i12 != 0) {
                                function12 = null;
                            }
                            if (i14 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i16 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i18 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i21 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i24 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i27 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                xkbVarQ = a.q(dVarF, 6);
                                i29 &= -57345;
                            } else {
                                xkbVarQ = xkbVar;
                            }
                            if ((i3 & 32768) != 0) {
                                pscVarG = g(dVarF, (i29 >> 24) & 14);
                                i29 &= -458753;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 65536) != 0) {
                                if (function12 == null) {
                                    rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i29 &= -3670017;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i30 != 0) {
                                function27 = function26;
                                function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            xkbVar3 = xkbVarQ;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z9 = z6;
                            function32 = function24;
                            rx8Var3 = rx8VarJ;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                        }
                        if ((i4 & 14) == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        xkb xkbVar7 = xkbVar3;
                        z11 = z10 | ((57344 & i4) == 16384);
                        objR = dVarF.R();
                        if (z11) {
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        } else {
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        }
                        String text4 = ((TransformedText) objR).getText().getText();
                        TextFieldType textFieldType4 = TextFieldType.Filled;
                        v1.Attached attached4 = new v1.Attached(false, null, null, 7, null);
                        if (function29 == null) {
                            dVarF.y(-1353131191);
                            dVarF.u();
                            do1Var = null;
                        } else {
                            dVarF.y(-1353131190);
                            do1 do1VarE4 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                            dVarF.u();
                            do1Var = do1VarE4;
                        }
                        int i311 = i4 >> 9;
                        int i312 = i29 << 21;
                        boolean z15 = z5;
                        do1 do1Var5 = do1Var;
                        dVar2 = dVarF;
                        TextFieldImplKt.l(textFieldType4, text4, function11, attached4, do1Var5, function31, function28, function30, function32, function25, function27, z15, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i311) | (3670016 & i311) | (29360128 & i312) | (234881024 & i312) | (i312 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i311 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                        if (e.k()) {
                            e.n();
                        }
                        function18 = function29;
                        function13 = function31;
                        function14 = function28;
                        function19 = function30;
                        function15 = function32;
                        function16 = function25;
                        function20 = function27;
                        z8 = z9;
                        rx8Var2 = rx8Var3;
                        pscVar2 = pscVarG;
                        function17 = function2E;
                        xkbVar2 = xkbVar7;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        function13 = function4;
                        function14 = function5;
                        function15 = function7;
                        function16 = function8;
                        xkbVar2 = xkbVar;
                        pscVar2 = pscVar;
                        rx8Var2 = rx8Var;
                        function17 = function10;
                        function18 = function12;
                        z8 = z6;
                        function19 = function6;
                        function20 = function9;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.usc
                            public final Object invoke(Object obj, Object obj2) {
                                return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 3072;
                z5 = z2;
                i7 = 8192;
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    if (dVarF.x(nceVar)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((i3 & 32) != 0) {
                    if ((196608 & i) == 0) {
                        j26Var2 = j26Var;
                        if (dVarF.x(j26Var2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i4 |= i9;
                    }
                    i10 = i3 & 64;
                    if (i10 != 0) {
                        i4 |= 1572864;
                        z6 = z3;
                    } else {
                        z6 = z3;
                        if ((i & 1572864) == 0) {
                            if (dVarF.A(z6)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i4 |= i11;
                        }
                    }
                    i12 = i3 & 128;
                    if (i12 != 0) {
                        i4 |= 12582912;
                        function12 = function3;
                    } else {
                        function12 = function3;
                        if ((i & 12582912) == 0) {
                            if (dVarF.T(function12)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i4 |= i13;
                        }
                    }
                    i14 = i3 & 256;
                    if (i14 != 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (dVarF.T(function4)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                        i4 |= i15;
                    }
                    i16 = i3 & 512;
                    if (i16 != 0) {
                        if ((i & 805306368) == 0) {
                            if (dVarF.T(function5)) {
                                i17 = 536870912;
                            } else {
                                i17 = 268435456;
                            }
                            i4 |= i17;
                        }
                        i18 = i3 & 1024;
                        if (i18 != 0) {
                            i19 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (dVarF.T(function6)) {
                                i20 = 4;
                            } else {
                                i20 = 2;
                            }
                            i19 = i2 | i20;
                        } else {
                            i19 = i2;
                        }
                        i21 = i3 & 2048;
                        if (i21 != 0) {
                            i19 |= 48;
                        } else if ((i2 & 48) != 0) {
                            if (dVarF.T(function7)) {
                                i22 = 32;
                            } else {
                                i22 = 16;
                            }
                            i19 |= i22;
                        }
                        i23 = i19;
                        i24 = i3 & 4096;
                        if (i24 != 0) {
                            i25 = i23 | 384;
                        } else if ((i2 & 384) == 0) {
                            if (dVarF.T(function8)) {
                                i26 = 256;
                            } else {
                                i26 = 128;
                            }
                            i25 = i23 | i26;
                        } else {
                            i25 = i23;
                        }
                        i27 = i3 & 8192;
                        if (i27 != 0) {
                            i29 = i25 | 3072;
                        } else {
                            i28 = i25;
                            if ((i2 & 3072) == 0) {
                                i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                            } else {
                                i29 = i28;
                            }
                        }
                        if ((i2 & 24576) != 0) {
                            if ((i3 & 16384) == 0) {
                                i7 = 16384;
                            }
                            i29 |= i7;
                        }
                        if ((i2 & 196608) != 0) {
                            if ((i3 & 32768) == 0) {
                                i34 = 65536;
                            } else {
                                i34 = 65536;
                            }
                            i29 |= i34;
                        }
                        if ((i2 & 1572864) != 0) {
                            if ((i3 & 65536) == 0) {
                                i33 = 524288;
                            } else {
                                i33 = 524288;
                            }
                            i29 |= i33;
                        }
                        i30 = i3 & 131072;
                        if (i30 != 0) {
                            i29 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            if (dVarF.T(function10)) {
                                i31 = 8388608;
                            } else {
                                i31 = 4194304;
                            }
                            i29 |= i31;
                        }
                        if ((i3 & 262144) != 0) {
                            i29 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            if (dVarF.x(this)) {
                                i32 = 67108864;
                            } else {
                                i32 = 33554432;
                            }
                            i29 |= i32;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            z7 = true;
                        } else {
                            z7 = true;
                        }
                        if (dVarF.g(z7, i4 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i10 != 0) {
                                    z6 = false;
                                }
                                if (i12 != 0) {
                                    function12 = null;
                                }
                                if (i14 != 0) {
                                    function21 = null;
                                } else {
                                    function21 = function4;
                                }
                                if (i16 != 0) {
                                    function22 = null;
                                } else {
                                    function22 = function5;
                                }
                                if (i18 != 0) {
                                    function23 = null;
                                } else {
                                    function23 = function6;
                                }
                                if (i21 != 0) {
                                    function24 = null;
                                } else {
                                    function24 = function7;
                                }
                                if (i24 != 0) {
                                    function25 = null;
                                } else {
                                    function25 = function8;
                                }
                                if (i27 != 0) {
                                    function26 = null;
                                } else {
                                    function26 = function9;
                                }
                                if ((i3 & 16384) != 0) {
                                    xkbVarQ = a.q(dVarF, 6);
                                    i29 &= -57345;
                                } else {
                                    xkbVarQ = xkbVar;
                                }
                                if ((i3 & 32768) != 0) {
                                    pscVarG = g(dVarF, (i29 >> 24) & 14);
                                    i29 &= -458753;
                                } else {
                                    pscVarG = pscVar;
                                }
                                if ((i3 & 65536) != 0) {
                                    if (function12 == null) {
                                        rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    } else {
                                        rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    }
                                    i29 &= -3670017;
                                } else {
                                    rx8VarJ = rx8Var;
                                }
                                if (i30 != 0) {
                                    function27 = function26;
                                    function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                                } else {
                                    function27 = function26;
                                    function2E = function10;
                                }
                                xkbVar3 = xkbVarQ;
                                function28 = function22;
                                function29 = function12;
                                function30 = function23;
                                function31 = function21;
                                z9 = z6;
                                function32 = function24;
                                rx8Var3 = rx8VarJ;
                            } else {
                                if (i10 != 0) {
                                    z6 = false;
                                }
                                if (i12 != 0) {
                                    function12 = null;
                                }
                                if (i14 != 0) {
                                    function21 = null;
                                } else {
                                    function21 = function4;
                                }
                                if (i16 != 0) {
                                    function22 = null;
                                } else {
                                    function22 = function5;
                                }
                                if (i18 != 0) {
                                    function23 = null;
                                } else {
                                    function23 = function6;
                                }
                                if (i21 != 0) {
                                    function24 = null;
                                } else {
                                    function24 = function7;
                                }
                                if (i24 != 0) {
                                    function25 = null;
                                } else {
                                    function25 = function8;
                                }
                                if (i27 != 0) {
                                    function26 = null;
                                } else {
                                    function26 = function9;
                                }
                                if ((i3 & 16384) != 0) {
                                    xkbVarQ = a.q(dVarF, 6);
                                    i29 &= -57345;
                                } else {
                                    xkbVarQ = xkbVar;
                                }
                                if ((i3 & 32768) != 0) {
                                    pscVarG = g(dVarF, (i29 >> 24) & 14);
                                    i29 &= -458753;
                                } else {
                                    pscVarG = pscVar;
                                }
                                if ((i3 & 65536) != 0) {
                                    if (function12 == null) {
                                        rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    } else {
                                        rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    }
                                    i29 &= -3670017;
                                } else {
                                    rx8VarJ = rx8Var;
                                }
                                if (i30 != 0) {
                                    function27 = function26;
                                    function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                                } else {
                                    function27 = function26;
                                    function2E = function10;
                                }
                                xkbVar3 = xkbVarQ;
                                function28 = function22;
                                function29 = function12;
                                function30 = function23;
                                function31 = function21;
                                z9 = z6;
                                function32 = function24;
                                rx8Var3 = rx8VarJ;
                            }
                            dVarF.M();
                            if (e.k()) {
                                e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                            }
                            if ((i4 & 14) == 4) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            xkb xkbVar8 = xkbVar3;
                            z11 = z10 | ((57344 & i4) == 16384);
                            objR = dVarF.R();
                            if (z11) {
                                objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                                dVarF.L(objR);
                            } else {
                                objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                                dVarF.L(objR);
                            }
                            String text5 = ((TransformedText) objR).getText().getText();
                            TextFieldType textFieldType5 = TextFieldType.Filled;
                            v1.Attached attached5 = new v1.Attached(false, null, null, 7, null);
                            if (function29 == null) {
                                dVarF.y(-1353131191);
                                dVarF.u();
                                do1Var = null;
                            } else {
                                dVarF.y(-1353131190);
                                do1 do1VarE5 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                                dVarF.u();
                                do1Var = do1VarE5;
                            }
                            int i313 = i4 >> 9;
                            int i314 = i29 << 21;
                            boolean z16 = z5;
                            do1 do1Var6 = do1Var;
                            dVar2 = dVarF;
                            TextFieldImplKt.l(textFieldType5, text5, function11, attached5, do1Var6, function31, function28, function30, function32, function25, function27, z16, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i313) | (3670016 & i313) | (29360128 & i314) | (234881024 & i314) | (i314 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i313 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                            if (e.k()) {
                                e.n();
                            }
                            function18 = function29;
                            function13 = function31;
                            function14 = function28;
                            function19 = function30;
                            function15 = function32;
                            function16 = function25;
                            function20 = function27;
                            z8 = z9;
                            rx8Var2 = rx8Var3;
                            pscVar2 = pscVarG;
                            function17 = function2E;
                            xkbVar2 = xkbVar8;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            function13 = function4;
                            function14 = function5;
                            function15 = function7;
                            function16 = function8;
                            xkbVar2 = xkbVar;
                            pscVar2 = pscVar;
                            rx8Var2 = rx8Var;
                            function17 = function10;
                            function18 = function12;
                            z8 = z6;
                            function19 = function6;
                            function20 = function9;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.usc
                                public final Object invoke(Object obj, Object obj2) {
                                    return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i4 |= 805306368;
                    i18 = i3 & 1024;
                    if (i18 != 0) {
                        i19 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (dVarF.T(function6)) {
                            i20 = 4;
                        } else {
                            i20 = 2;
                        }
                        i19 = i2 | i20;
                    } else {
                        i19 = i2;
                    }
                    i21 = i3 & 2048;
                    if (i21 != 0) {
                        i19 |= 48;
                    } else if ((i2 & 48) != 0) {
                        if (dVarF.T(function7)) {
                            i22 = 32;
                        } else {
                            i22 = 16;
                        }
                        i19 |= i22;
                    }
                    i23 = i19;
                    i24 = i3 & 4096;
                    if (i24 != 0) {
                        i25 = i23 | 384;
                    } else if ((i2 & 384) == 0) {
                        if (dVarF.T(function8)) {
                            i26 = 256;
                        } else {
                            i26 = 128;
                        }
                        i25 = i23 | i26;
                    } else {
                        i25 = i23;
                    }
                    i27 = i3 & 8192;
                    if (i27 != 0) {
                        i29 = i25 | 3072;
                    } else {
                        i28 = i25;
                        if ((i2 & 3072) == 0) {
                            i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                        } else {
                            i29 = i28;
                        }
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i7 = 16384;
                        }
                        i29 |= i7;
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32768) == 0) {
                            i34 = 65536;
                        } else {
                            i34 = 65536;
                        }
                        i29 |= i34;
                    }
                    if ((i2 & 1572864) != 0) {
                        if ((i3 & 65536) == 0) {
                            i33 = 524288;
                        } else {
                            i33 = 524288;
                        }
                        i29 |= i33;
                    }
                    i30 = i3 & 131072;
                    if (i30 != 0) {
                        i29 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (dVarF.T(function10)) {
                            i31 = 8388608;
                        } else {
                            i31 = 4194304;
                        }
                        i29 |= i31;
                    }
                    if ((i3 & 262144) != 0) {
                        i29 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (dVarF.x(this)) {
                            i32 = 67108864;
                        } else {
                            i32 = 33554432;
                        }
                        i29 |= i32;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (dVarF.g(z7, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z6 = false;
                            }
                            if (i12 != 0) {
                                function12 = null;
                            }
                            if (i14 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i16 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i18 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i21 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i24 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i27 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                xkbVarQ = a.q(dVarF, 6);
                                i29 &= -57345;
                            } else {
                                xkbVarQ = xkbVar;
                            }
                            if ((i3 & 32768) != 0) {
                                pscVarG = g(dVarF, (i29 >> 24) & 14);
                                i29 &= -458753;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 65536) != 0) {
                                if (function12 == null) {
                                    rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i29 &= -3670017;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i30 != 0) {
                                function27 = function26;
                                function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            xkbVar3 = xkbVarQ;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z9 = z6;
                            function32 = function24;
                            rx8Var3 = rx8VarJ;
                        } else {
                            if (i10 != 0) {
                                z6 = false;
                            }
                            if (i12 != 0) {
                                function12 = null;
                            }
                            if (i14 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i16 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i18 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i21 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i24 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i27 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                xkbVarQ = a.q(dVarF, 6);
                                i29 &= -57345;
                            } else {
                                xkbVarQ = xkbVar;
                            }
                            if ((i3 & 32768) != 0) {
                                pscVarG = g(dVarF, (i29 >> 24) & 14);
                                i29 &= -458753;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 65536) != 0) {
                                if (function12 == null) {
                                    rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i29 &= -3670017;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i30 != 0) {
                                function27 = function26;
                                function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            xkbVar3 = xkbVarQ;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z9 = z6;
                            function32 = function24;
                            rx8Var3 = rx8VarJ;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                        }
                        if ((i4 & 14) == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        xkb xkbVar9 = xkbVar3;
                        z11 = z10 | ((57344 & i4) == 16384);
                        objR = dVarF.R();
                        if (z11) {
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        } else {
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        }
                        String text6 = ((TransformedText) objR).getText().getText();
                        TextFieldType textFieldType6 = TextFieldType.Filled;
                        v1.Attached attached6 = new v1.Attached(false, null, null, 7, null);
                        if (function29 == null) {
                            dVarF.y(-1353131191);
                            dVarF.u();
                            do1Var = null;
                        } else {
                            dVarF.y(-1353131190);
                            do1 do1VarE6 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                            dVarF.u();
                            do1Var = do1VarE6;
                        }
                        int i315 = i4 >> 9;
                        int i316 = i29 << 21;
                        boolean z17 = z5;
                        do1 do1Var7 = do1Var;
                        dVar2 = dVarF;
                        TextFieldImplKt.l(textFieldType6, text6, function11, attached6, do1Var7, function31, function28, function30, function32, function25, function27, z17, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i315) | (3670016 & i315) | (29360128 & i316) | (234881024 & i316) | (i316 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i315 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                        if (e.k()) {
                            e.n();
                        }
                        function18 = function29;
                        function13 = function31;
                        function14 = function28;
                        function19 = function30;
                        function15 = function32;
                        function16 = function25;
                        function20 = function27;
                        z8 = z9;
                        rx8Var2 = rx8Var3;
                        pscVar2 = pscVarG;
                        function17 = function2E;
                        xkbVar2 = xkbVar9;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        function13 = function4;
                        function14 = function5;
                        function15 = function7;
                        function16 = function8;
                        xkbVar2 = xkbVar;
                        pscVar2 = pscVar;
                        rx8Var2 = rx8Var;
                        function17 = function10;
                        function18 = function12;
                        z8 = z6;
                        function19 = function6;
                        function20 = function9;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.usc
                            public final Object invoke(Object obj, Object obj2) {
                                return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 196608;
                j26Var2 = j26Var;
                i10 = i3 & 64;
                if (i10 != 0) {
                    i4 |= 1572864;
                    z6 = z3;
                } else {
                    z6 = z3;
                    if ((i & 1572864) == 0) {
                        if (dVarF.A(z6)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    }
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                    i4 |= 12582912;
                    function12 = function3;
                } else {
                    function12 = function3;
                    if ((i & 12582912) == 0) {
                        if (dVarF.T(function12)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i4 |= i13;
                    }
                }
                i14 = i3 & 256;
                if (i14 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (dVarF.T(function4)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i4 |= i15;
                }
                i16 = i3 & 512;
                if (i16 != 0) {
                    if ((i & 805306368) == 0) {
                        if (dVarF.T(function5)) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                        i4 |= i17;
                    }
                    i18 = i3 & 1024;
                    if (i18 != 0) {
                        i19 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (dVarF.T(function6)) {
                            i20 = 4;
                        } else {
                            i20 = 2;
                        }
                        i19 = i2 | i20;
                    } else {
                        i19 = i2;
                    }
                    i21 = i3 & 2048;
                    if (i21 != 0) {
                        i19 |= 48;
                    } else if ((i2 & 48) != 0) {
                        if (dVarF.T(function7)) {
                            i22 = 32;
                        } else {
                            i22 = 16;
                        }
                        i19 |= i22;
                    }
                    i23 = i19;
                    i24 = i3 & 4096;
                    if (i24 != 0) {
                        i25 = i23 | 384;
                    } else if ((i2 & 384) == 0) {
                        if (dVarF.T(function8)) {
                            i26 = 256;
                        } else {
                            i26 = 128;
                        }
                        i25 = i23 | i26;
                    } else {
                        i25 = i23;
                    }
                    i27 = i3 & 8192;
                    if (i27 != 0) {
                        i29 = i25 | 3072;
                    } else {
                        i28 = i25;
                        if ((i2 & 3072) == 0) {
                            i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                        } else {
                            i29 = i28;
                        }
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i7 = 16384;
                        }
                        i29 |= i7;
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32768) == 0) {
                            i34 = 65536;
                        } else {
                            i34 = 65536;
                        }
                        i29 |= i34;
                    }
                    if ((i2 & 1572864) != 0) {
                        if ((i3 & 65536) == 0) {
                            i33 = 524288;
                        } else {
                            i33 = 524288;
                        }
                        i29 |= i33;
                    }
                    i30 = i3 & 131072;
                    if (i30 != 0) {
                        i29 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (dVarF.T(function10)) {
                            i31 = 8388608;
                        } else {
                            i31 = 4194304;
                        }
                        i29 |= i31;
                    }
                    if ((i3 & 262144) != 0) {
                        i29 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (dVarF.x(this)) {
                            i32 = 67108864;
                        } else {
                            i32 = 33554432;
                        }
                        i29 |= i32;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (dVarF.g(z7, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z6 = false;
                            }
                            if (i12 != 0) {
                                function12 = null;
                            }
                            if (i14 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i16 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i18 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i21 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i24 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i27 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                xkbVarQ = a.q(dVarF, 6);
                                i29 &= -57345;
                            } else {
                                xkbVarQ = xkbVar;
                            }
                            if ((i3 & 32768) != 0) {
                                pscVarG = g(dVarF, (i29 >> 24) & 14);
                                i29 &= -458753;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 65536) != 0) {
                                if (function12 == null) {
                                    rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i29 &= -3670017;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i30 != 0) {
                                function27 = function26;
                                function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            xkbVar3 = xkbVarQ;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z9 = z6;
                            function32 = function24;
                            rx8Var3 = rx8VarJ;
                        } else {
                            if (i10 != 0) {
                                z6 = false;
                            }
                            if (i12 != 0) {
                                function12 = null;
                            }
                            if (i14 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i16 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i18 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i21 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i24 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i27 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                xkbVarQ = a.q(dVarF, 6);
                                i29 &= -57345;
                            } else {
                                xkbVarQ = xkbVar;
                            }
                            if ((i3 & 32768) != 0) {
                                pscVarG = g(dVarF, (i29 >> 24) & 14);
                                i29 &= -458753;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 65536) != 0) {
                                if (function12 == null) {
                                    rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i29 &= -3670017;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i30 != 0) {
                                function27 = function26;
                                function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            xkbVar3 = xkbVarQ;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z9 = z6;
                            function32 = function24;
                            rx8Var3 = rx8VarJ;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                        }
                        if ((i4 & 14) == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        xkb xkbVar10 = xkbVar3;
                        z11 = z10 | ((57344 & i4) == 16384);
                        objR = dVarF.R();
                        if (z11) {
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        } else {
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        }
                        String text7 = ((TransformedText) objR).getText().getText();
                        TextFieldType textFieldType7 = TextFieldType.Filled;
                        v1.Attached attached7 = new v1.Attached(false, null, null, 7, null);
                        if (function29 == null) {
                            dVarF.y(-1353131191);
                            dVarF.u();
                            do1Var = null;
                        } else {
                            dVarF.y(-1353131190);
                            do1 do1VarE7 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                            dVarF.u();
                            do1Var = do1VarE7;
                        }
                        int i317 = i4 >> 9;
                        int i318 = i29 << 21;
                        boolean z18 = z5;
                        do1 do1Var8 = do1Var;
                        dVar2 = dVarF;
                        TextFieldImplKt.l(textFieldType7, text7, function11, attached7, do1Var8, function31, function28, function30, function32, function25, function27, z18, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i317) | (3670016 & i317) | (29360128 & i318) | (234881024 & i318) | (i318 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i317 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                        if (e.k()) {
                            e.n();
                        }
                        function18 = function29;
                        function13 = function31;
                        function14 = function28;
                        function19 = function30;
                        function15 = function32;
                        function16 = function25;
                        function20 = function27;
                        z8 = z9;
                        rx8Var2 = rx8Var3;
                        pscVar2 = pscVarG;
                        function17 = function2E;
                        xkbVar2 = xkbVar10;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        function13 = function4;
                        function14 = function5;
                        function15 = function7;
                        function16 = function8;
                        xkbVar2 = xkbVar;
                        pscVar2 = pscVar;
                        rx8Var2 = rx8Var;
                        function17 = function10;
                        function18 = function12;
                        z8 = z6;
                        function19 = function6;
                        function20 = function9;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.usc
                            public final Object invoke(Object obj, Object obj2) {
                                return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 805306368;
                i18 = i3 & 1024;
                if (i18 != 0) {
                    i19 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (dVarF.T(function6)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                    i19 = i2 | i20;
                } else {
                    i19 = i2;
                }
                i21 = i3 & 2048;
                if (i21 != 0) {
                    i19 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (dVarF.T(function7)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i19 |= i22;
                }
                i23 = i19;
                i24 = i3 & 4096;
                if (i24 != 0) {
                    i25 = i23 | 384;
                } else if ((i2 & 384) == 0) {
                    if (dVarF.T(function8)) {
                        i26 = 256;
                    } else {
                        i26 = 128;
                    }
                    i25 = i23 | i26;
                } else {
                    i25 = i23;
                }
                i27 = i3 & 8192;
                if (i27 != 0) {
                    i29 = i25 | 3072;
                } else {
                    i28 = i25;
                    if ((i2 & 3072) == 0) {
                        i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                    } else {
                        i29 = i28;
                    }
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i7 = 16384;
                    }
                    i29 |= i7;
                }
                if ((i2 & 196608) != 0) {
                    if ((i3 & 32768) == 0) {
                        i34 = 65536;
                    } else {
                        i34 = 65536;
                    }
                    i29 |= i34;
                }
                if ((i2 & 1572864) != 0) {
                    if ((i3 & 65536) == 0) {
                        i33 = 524288;
                    } else {
                        i33 = 524288;
                    }
                    i29 |= i33;
                }
                i30 = i3 & 131072;
                if (i30 != 0) {
                    i29 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (dVarF.T(function10)) {
                        i31 = 8388608;
                    } else {
                        i31 = 4194304;
                    }
                    i29 |= i31;
                }
                if ((i3 & 262144) != 0) {
                    i29 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (dVarF.x(this)) {
                        i32 = 67108864;
                    } else {
                        i32 = 33554432;
                    }
                    i29 |= i32;
                }
                if ((i4 & 306783379) == 306783378) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (dVarF.g(z7, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z6 = false;
                        }
                        if (i12 != 0) {
                            function12 = null;
                        }
                        if (i14 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i16 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i18 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i21 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i24 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i27 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            xkbVarQ = a.q(dVarF, 6);
                            i29 &= -57345;
                        } else {
                            xkbVarQ = xkbVar;
                        }
                        if ((i3 & 32768) != 0) {
                            pscVarG = g(dVarF, (i29 >> 24) & 14);
                            i29 &= -458753;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 65536) != 0) {
                            if (function12 == null) {
                                rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i29 &= -3670017;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i30 != 0) {
                            function27 = function26;
                            function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        xkbVar3 = xkbVarQ;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z9 = z6;
                        function32 = function24;
                        rx8Var3 = rx8VarJ;
                    } else {
                        if (i10 != 0) {
                            z6 = false;
                        }
                        if (i12 != 0) {
                            function12 = null;
                        }
                        if (i14 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i16 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i18 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i21 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i24 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i27 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            xkbVarQ = a.q(dVarF, 6);
                            i29 &= -57345;
                        } else {
                            xkbVarQ = xkbVar;
                        }
                        if ((i3 & 32768) != 0) {
                            pscVarG = g(dVarF, (i29 >> 24) & 14);
                            i29 &= -458753;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 65536) != 0) {
                            if (function12 == null) {
                                rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i29 &= -3670017;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i30 != 0) {
                            function27 = function26;
                            function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        xkbVar3 = xkbVarQ;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z9 = z6;
                        function32 = function24;
                        rx8Var3 = rx8VarJ;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                    }
                    if ((i4 & 14) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    xkb xkbVar11 = xkbVar3;
                    z11 = z10 | ((57344 & i4) == 16384);
                    objR = dVarF.R();
                    if (z11) {
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    } else {
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    }
                    String text8 = ((TransformedText) objR).getText().getText();
                    TextFieldType textFieldType8 = TextFieldType.Filled;
                    v1.Attached attached8 = new v1.Attached(false, null, null, 7, null);
                    if (function29 == null) {
                        dVarF.y(-1353131191);
                        dVarF.u();
                        do1Var = null;
                    } else {
                        dVarF.y(-1353131190);
                        do1 do1VarE8 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                        dVarF.u();
                        do1Var = do1VarE8;
                    }
                    int i319 = i4 >> 9;
                    int i3110 = i29 << 21;
                    boolean z19 = z5;
                    do1 do1Var9 = do1Var;
                    dVar2 = dVarF;
                    TextFieldImplKt.l(textFieldType8, text8, function11, attached8, do1Var9, function31, function28, function30, function32, function25, function27, z19, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i319) | (3670016 & i319) | (29360128 & i3110) | (234881024 & i3110) | (i3110 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i319 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                    if (e.k()) {
                        e.n();
                    }
                    function18 = function29;
                    function13 = function31;
                    function14 = function28;
                    function19 = function30;
                    function15 = function32;
                    function16 = function25;
                    function20 = function27;
                    z8 = z9;
                    rx8Var2 = rx8Var3;
                    pscVar2 = pscVarG;
                    function17 = function2E;
                    xkbVar2 = xkbVar11;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    function13 = function4;
                    function14 = function5;
                    function15 = function7;
                    function16 = function8;
                    xkbVar2 = xkbVar;
                    pscVar2 = pscVar;
                    rx8Var2 = rx8Var;
                    function17 = function10;
                    function18 = function12;
                    z8 = z6;
                    function19 = function6;
                    function20 = function9;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.usc
                        public final Object invoke(Object obj, Object obj2) {
                            return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 384;
            z4 = z;
            if ((i3 & 8) != 0) {
                if ((i & 3072) == 0) {
                    z5 = z2;
                    if (dVarF.A(z5)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                i7 = 8192;
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    if (dVarF.x(nceVar)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((i3 & 32) != 0) {
                    if ((196608 & i) == 0) {
                        j26Var2 = j26Var;
                        if (dVarF.x(j26Var2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i4 |= i9;
                    }
                    i10 = i3 & 64;
                    if (i10 != 0) {
                        i4 |= 1572864;
                        z6 = z3;
                    } else {
                        z6 = z3;
                        if ((i & 1572864) == 0) {
                            if (dVarF.A(z6)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i4 |= i11;
                        }
                    }
                    i12 = i3 & 128;
                    if (i12 != 0) {
                        i4 |= 12582912;
                        function12 = function3;
                    } else {
                        function12 = function3;
                        if ((i & 12582912) == 0) {
                            if (dVarF.T(function12)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i4 |= i13;
                        }
                    }
                    i14 = i3 & 256;
                    if (i14 != 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (dVarF.T(function4)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                        i4 |= i15;
                    }
                    i16 = i3 & 512;
                    if (i16 != 0) {
                        if ((i & 805306368) == 0) {
                            if (dVarF.T(function5)) {
                                i17 = 536870912;
                            } else {
                                i17 = 268435456;
                            }
                            i4 |= i17;
                        }
                        i18 = i3 & 1024;
                        if (i18 != 0) {
                            i19 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (dVarF.T(function6)) {
                                i20 = 4;
                            } else {
                                i20 = 2;
                            }
                            i19 = i2 | i20;
                        } else {
                            i19 = i2;
                        }
                        i21 = i3 & 2048;
                        if (i21 != 0) {
                            i19 |= 48;
                        } else if ((i2 & 48) != 0) {
                            if (dVarF.T(function7)) {
                                i22 = 32;
                            } else {
                                i22 = 16;
                            }
                            i19 |= i22;
                        }
                        i23 = i19;
                        i24 = i3 & 4096;
                        if (i24 != 0) {
                            i25 = i23 | 384;
                        } else if ((i2 & 384) == 0) {
                            if (dVarF.T(function8)) {
                                i26 = 256;
                            } else {
                                i26 = 128;
                            }
                            i25 = i23 | i26;
                        } else {
                            i25 = i23;
                        }
                        i27 = i3 & 8192;
                        if (i27 != 0) {
                            i29 = i25 | 3072;
                        } else {
                            i28 = i25;
                            if ((i2 & 3072) == 0) {
                                i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                            } else {
                                i29 = i28;
                            }
                        }
                        if ((i2 & 24576) != 0) {
                            if ((i3 & 16384) == 0) {
                                i7 = 16384;
                            }
                            i29 |= i7;
                        }
                        if ((i2 & 196608) != 0) {
                            if ((i3 & 32768) == 0) {
                                i34 = 65536;
                            } else {
                                i34 = 65536;
                            }
                            i29 |= i34;
                        }
                        if ((i2 & 1572864) != 0) {
                            if ((i3 & 65536) == 0) {
                                i33 = 524288;
                            } else {
                                i33 = 524288;
                            }
                            i29 |= i33;
                        }
                        i30 = i3 & 131072;
                        if (i30 != 0) {
                            i29 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            if (dVarF.T(function10)) {
                                i31 = 8388608;
                            } else {
                                i31 = 4194304;
                            }
                            i29 |= i31;
                        }
                        if ((i3 & 262144) != 0) {
                            i29 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            if (dVarF.x(this)) {
                                i32 = 67108864;
                            } else {
                                i32 = 33554432;
                            }
                            i29 |= i32;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            z7 = true;
                        } else {
                            z7 = true;
                        }
                        if (dVarF.g(z7, i4 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i10 != 0) {
                                    z6 = false;
                                }
                                if (i12 != 0) {
                                    function12 = null;
                                }
                                if (i14 != 0) {
                                    function21 = null;
                                } else {
                                    function21 = function4;
                                }
                                if (i16 != 0) {
                                    function22 = null;
                                } else {
                                    function22 = function5;
                                }
                                if (i18 != 0) {
                                    function23 = null;
                                } else {
                                    function23 = function6;
                                }
                                if (i21 != 0) {
                                    function24 = null;
                                } else {
                                    function24 = function7;
                                }
                                if (i24 != 0) {
                                    function25 = null;
                                } else {
                                    function25 = function8;
                                }
                                if (i27 != 0) {
                                    function26 = null;
                                } else {
                                    function26 = function9;
                                }
                                if ((i3 & 16384) != 0) {
                                    xkbVarQ = a.q(dVarF, 6);
                                    i29 &= -57345;
                                } else {
                                    xkbVarQ = xkbVar;
                                }
                                if ((i3 & 32768) != 0) {
                                    pscVarG = g(dVarF, (i29 >> 24) & 14);
                                    i29 &= -458753;
                                } else {
                                    pscVarG = pscVar;
                                }
                                if ((i3 & 65536) != 0) {
                                    if (function12 == null) {
                                        rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    } else {
                                        rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    }
                                    i29 &= -3670017;
                                } else {
                                    rx8VarJ = rx8Var;
                                }
                                if (i30 != 0) {
                                    function27 = function26;
                                    function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                                } else {
                                    function27 = function26;
                                    function2E = function10;
                                }
                                xkbVar3 = xkbVarQ;
                                function28 = function22;
                                function29 = function12;
                                function30 = function23;
                                function31 = function21;
                                z9 = z6;
                                function32 = function24;
                                rx8Var3 = rx8VarJ;
                            } else {
                                if (i10 != 0) {
                                    z6 = false;
                                }
                                if (i12 != 0) {
                                    function12 = null;
                                }
                                if (i14 != 0) {
                                    function21 = null;
                                } else {
                                    function21 = function4;
                                }
                                if (i16 != 0) {
                                    function22 = null;
                                } else {
                                    function22 = function5;
                                }
                                if (i18 != 0) {
                                    function23 = null;
                                } else {
                                    function23 = function6;
                                }
                                if (i21 != 0) {
                                    function24 = null;
                                } else {
                                    function24 = function7;
                                }
                                if (i24 != 0) {
                                    function25 = null;
                                } else {
                                    function25 = function8;
                                }
                                if (i27 != 0) {
                                    function26 = null;
                                } else {
                                    function26 = function9;
                                }
                                if ((i3 & 16384) != 0) {
                                    xkbVarQ = a.q(dVarF, 6);
                                    i29 &= -57345;
                                } else {
                                    xkbVarQ = xkbVar;
                                }
                                if ((i3 & 32768) != 0) {
                                    pscVarG = g(dVarF, (i29 >> 24) & 14);
                                    i29 &= -458753;
                                } else {
                                    pscVarG = pscVar;
                                }
                                if ((i3 & 65536) != 0) {
                                    if (function12 == null) {
                                        rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    } else {
                                        rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    }
                                    i29 &= -3670017;
                                } else {
                                    rx8VarJ = rx8Var;
                                }
                                if (i30 != 0) {
                                    function27 = function26;
                                    function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                                } else {
                                    function27 = function26;
                                    function2E = function10;
                                }
                                xkbVar3 = xkbVarQ;
                                function28 = function22;
                                function29 = function12;
                                function30 = function23;
                                function31 = function21;
                                z9 = z6;
                                function32 = function24;
                                rx8Var3 = rx8VarJ;
                            }
                            dVarF.M();
                            if (e.k()) {
                                e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                            }
                            if ((i4 & 14) == 4) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            xkb xkbVar12 = xkbVar3;
                            z11 = z10 | ((57344 & i4) == 16384);
                            objR = dVarF.R();
                            if (z11) {
                                objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                                dVarF.L(objR);
                            } else {
                                objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                                dVarF.L(objR);
                            }
                            String text9 = ((TransformedText) objR).getText().getText();
                            TextFieldType textFieldType9 = TextFieldType.Filled;
                            v1.Attached attached9 = new v1.Attached(false, null, null, 7, null);
                            if (function29 == null) {
                                dVarF.y(-1353131191);
                                dVarF.u();
                                do1Var = null;
                            } else {
                                dVarF.y(-1353131190);
                                do1 do1VarE9 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                                dVarF.u();
                                do1Var = do1VarE9;
                            }
                            int i3111 = i4 >> 9;
                            int i3112 = i29 << 21;
                            boolean z110 = z5;
                            do1 do1Var10 = do1Var;
                            dVar2 = dVarF;
                            TextFieldImplKt.l(textFieldType9, text9, function11, attached9, do1Var10, function31, function28, function30, function32, function25, function27, z110, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i3111) | (3670016 & i3111) | (29360128 & i3112) | (234881024 & i3112) | (i3112 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i3111 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                            if (e.k()) {
                                e.n();
                            }
                            function18 = function29;
                            function13 = function31;
                            function14 = function28;
                            function19 = function30;
                            function15 = function32;
                            function16 = function25;
                            function20 = function27;
                            z8 = z9;
                            rx8Var2 = rx8Var3;
                            pscVar2 = pscVarG;
                            function17 = function2E;
                            xkbVar2 = xkbVar12;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            function13 = function4;
                            function14 = function5;
                            function15 = function7;
                            function16 = function8;
                            xkbVar2 = xkbVar;
                            pscVar2 = pscVar;
                            rx8Var2 = rx8Var;
                            function17 = function10;
                            function18 = function12;
                            z8 = z6;
                            function19 = function6;
                            function20 = function9;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.usc
                                public final Object invoke(Object obj, Object obj2) {
                                    return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i4 |= 805306368;
                    i18 = i3 & 1024;
                    if (i18 != 0) {
                        i19 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (dVarF.T(function6)) {
                            i20 = 4;
                        } else {
                            i20 = 2;
                        }
                        i19 = i2 | i20;
                    } else {
                        i19 = i2;
                    }
                    i21 = i3 & 2048;
                    if (i21 != 0) {
                        i19 |= 48;
                    } else if ((i2 & 48) != 0) {
                        if (dVarF.T(function7)) {
                            i22 = 32;
                        } else {
                            i22 = 16;
                        }
                        i19 |= i22;
                    }
                    i23 = i19;
                    i24 = i3 & 4096;
                    if (i24 != 0) {
                        i25 = i23 | 384;
                    } else if ((i2 & 384) == 0) {
                        if (dVarF.T(function8)) {
                            i26 = 256;
                        } else {
                            i26 = 128;
                        }
                        i25 = i23 | i26;
                    } else {
                        i25 = i23;
                    }
                    i27 = i3 & 8192;
                    if (i27 != 0) {
                        i29 = i25 | 3072;
                    } else {
                        i28 = i25;
                        if ((i2 & 3072) == 0) {
                            i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                        } else {
                            i29 = i28;
                        }
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i7 = 16384;
                        }
                        i29 |= i7;
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32768) == 0) {
                            i34 = 65536;
                        } else {
                            i34 = 65536;
                        }
                        i29 |= i34;
                    }
                    if ((i2 & 1572864) != 0) {
                        if ((i3 & 65536) == 0) {
                            i33 = 524288;
                        } else {
                            i33 = 524288;
                        }
                        i29 |= i33;
                    }
                    i30 = i3 & 131072;
                    if (i30 != 0) {
                        i29 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (dVarF.T(function10)) {
                            i31 = 8388608;
                        } else {
                            i31 = 4194304;
                        }
                        i29 |= i31;
                    }
                    if ((i3 & 262144) != 0) {
                        i29 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (dVarF.x(this)) {
                            i32 = 67108864;
                        } else {
                            i32 = 33554432;
                        }
                        i29 |= i32;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (dVarF.g(z7, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z6 = false;
                            }
                            if (i12 != 0) {
                                function12 = null;
                            }
                            if (i14 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i16 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i18 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i21 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i24 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i27 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                xkbVarQ = a.q(dVarF, 6);
                                i29 &= -57345;
                            } else {
                                xkbVarQ = xkbVar;
                            }
                            if ((i3 & 32768) != 0) {
                                pscVarG = g(dVarF, (i29 >> 24) & 14);
                                i29 &= -458753;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 65536) != 0) {
                                if (function12 == null) {
                                    rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i29 &= -3670017;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i30 != 0) {
                                function27 = function26;
                                function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            xkbVar3 = xkbVarQ;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z9 = z6;
                            function32 = function24;
                            rx8Var3 = rx8VarJ;
                        } else {
                            if (i10 != 0) {
                                z6 = false;
                            }
                            if (i12 != 0) {
                                function12 = null;
                            }
                            if (i14 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i16 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i18 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i21 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i24 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i27 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                xkbVarQ = a.q(dVarF, 6);
                                i29 &= -57345;
                            } else {
                                xkbVarQ = xkbVar;
                            }
                            if ((i3 & 32768) != 0) {
                                pscVarG = g(dVarF, (i29 >> 24) & 14);
                                i29 &= -458753;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 65536) != 0) {
                                if (function12 == null) {
                                    rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i29 &= -3670017;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i30 != 0) {
                                function27 = function26;
                                function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            xkbVar3 = xkbVarQ;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z9 = z6;
                            function32 = function24;
                            rx8Var3 = rx8VarJ;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                        }
                        if ((i4 & 14) == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        xkb xkbVar13 = xkbVar3;
                        z11 = z10 | ((57344 & i4) == 16384);
                        objR = dVarF.R();
                        if (z11) {
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        } else {
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        }
                        String text10 = ((TransformedText) objR).getText().getText();
                        TextFieldType textFieldType10 = TextFieldType.Filled;
                        v1.Attached attached10 = new v1.Attached(false, null, null, 7, null);
                        if (function29 == null) {
                            dVarF.y(-1353131191);
                            dVarF.u();
                            do1Var = null;
                        } else {
                            dVarF.y(-1353131190);
                            do1 do1VarE10 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                            dVarF.u();
                            do1Var = do1VarE10;
                        }
                        int i3113 = i4 >> 9;
                        int i3114 = i29 << 21;
                        boolean z111 = z5;
                        do1 do1Var11 = do1Var;
                        dVar2 = dVarF;
                        TextFieldImplKt.l(textFieldType10, text10, function11, attached10, do1Var11, function31, function28, function30, function32, function25, function27, z111, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i3113) | (3670016 & i3113) | (29360128 & i3114) | (234881024 & i3114) | (i3114 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i3113 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                        if (e.k()) {
                            e.n();
                        }
                        function18 = function29;
                        function13 = function31;
                        function14 = function28;
                        function19 = function30;
                        function15 = function32;
                        function16 = function25;
                        function20 = function27;
                        z8 = z9;
                        rx8Var2 = rx8Var3;
                        pscVar2 = pscVarG;
                        function17 = function2E;
                        xkbVar2 = xkbVar13;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        function13 = function4;
                        function14 = function5;
                        function15 = function7;
                        function16 = function8;
                        xkbVar2 = xkbVar;
                        pscVar2 = pscVar;
                        rx8Var2 = rx8Var;
                        function17 = function10;
                        function18 = function12;
                        z8 = z6;
                        function19 = function6;
                        function20 = function9;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.usc
                            public final Object invoke(Object obj, Object obj2) {
                                return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 196608;
                j26Var2 = j26Var;
                i10 = i3 & 64;
                if (i10 != 0) {
                    i4 |= 1572864;
                    z6 = z3;
                } else {
                    z6 = z3;
                    if ((i & 1572864) == 0) {
                        if (dVarF.A(z6)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    }
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                    i4 |= 12582912;
                    function12 = function3;
                } else {
                    function12 = function3;
                    if ((i & 12582912) == 0) {
                        if (dVarF.T(function12)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i4 |= i13;
                    }
                }
                i14 = i3 & 256;
                if (i14 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (dVarF.T(function4)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i4 |= i15;
                }
                i16 = i3 & 512;
                if (i16 != 0) {
                    if ((i & 805306368) == 0) {
                        if (dVarF.T(function5)) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                        i4 |= i17;
                    }
                    i18 = i3 & 1024;
                    if (i18 != 0) {
                        i19 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (dVarF.T(function6)) {
                            i20 = 4;
                        } else {
                            i20 = 2;
                        }
                        i19 = i2 | i20;
                    } else {
                        i19 = i2;
                    }
                    i21 = i3 & 2048;
                    if (i21 != 0) {
                        i19 |= 48;
                    } else if ((i2 & 48) != 0) {
                        if (dVarF.T(function7)) {
                            i22 = 32;
                        } else {
                            i22 = 16;
                        }
                        i19 |= i22;
                    }
                    i23 = i19;
                    i24 = i3 & 4096;
                    if (i24 != 0) {
                        i25 = i23 | 384;
                    } else if ((i2 & 384) == 0) {
                        if (dVarF.T(function8)) {
                            i26 = 256;
                        } else {
                            i26 = 128;
                        }
                        i25 = i23 | i26;
                    } else {
                        i25 = i23;
                    }
                    i27 = i3 & 8192;
                    if (i27 != 0) {
                        i29 = i25 | 3072;
                    } else {
                        i28 = i25;
                        if ((i2 & 3072) == 0) {
                            i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                        } else {
                            i29 = i28;
                        }
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i7 = 16384;
                        }
                        i29 |= i7;
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32768) == 0) {
                            i34 = 65536;
                        } else {
                            i34 = 65536;
                        }
                        i29 |= i34;
                    }
                    if ((i2 & 1572864) != 0) {
                        if ((i3 & 65536) == 0) {
                            i33 = 524288;
                        } else {
                            i33 = 524288;
                        }
                        i29 |= i33;
                    }
                    i30 = i3 & 131072;
                    if (i30 != 0) {
                        i29 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (dVarF.T(function10)) {
                            i31 = 8388608;
                        } else {
                            i31 = 4194304;
                        }
                        i29 |= i31;
                    }
                    if ((i3 & 262144) != 0) {
                        i29 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (dVarF.x(this)) {
                            i32 = 67108864;
                        } else {
                            i32 = 33554432;
                        }
                        i29 |= i32;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (dVarF.g(z7, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z6 = false;
                            }
                            if (i12 != 0) {
                                function12 = null;
                            }
                            if (i14 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i16 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i18 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i21 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i24 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i27 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                xkbVarQ = a.q(dVarF, 6);
                                i29 &= -57345;
                            } else {
                                xkbVarQ = xkbVar;
                            }
                            if ((i3 & 32768) != 0) {
                                pscVarG = g(dVarF, (i29 >> 24) & 14);
                                i29 &= -458753;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 65536) != 0) {
                                if (function12 == null) {
                                    rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i29 &= -3670017;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i30 != 0) {
                                function27 = function26;
                                function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            xkbVar3 = xkbVarQ;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z9 = z6;
                            function32 = function24;
                            rx8Var3 = rx8VarJ;
                        } else {
                            if (i10 != 0) {
                                z6 = false;
                            }
                            if (i12 != 0) {
                                function12 = null;
                            }
                            if (i14 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i16 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i18 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i21 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i24 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i27 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                xkbVarQ = a.q(dVarF, 6);
                                i29 &= -57345;
                            } else {
                                xkbVarQ = xkbVar;
                            }
                            if ((i3 & 32768) != 0) {
                                pscVarG = g(dVarF, (i29 >> 24) & 14);
                                i29 &= -458753;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 65536) != 0) {
                                if (function12 == null) {
                                    rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i29 &= -3670017;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i30 != 0) {
                                function27 = function26;
                                function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            xkbVar3 = xkbVarQ;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z9 = z6;
                            function32 = function24;
                            rx8Var3 = rx8VarJ;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                        }
                        if ((i4 & 14) == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        xkb xkbVar14 = xkbVar3;
                        z11 = z10 | ((57344 & i4) == 16384);
                        objR = dVarF.R();
                        if (z11) {
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        } else {
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        }
                        String text11 = ((TransformedText) objR).getText().getText();
                        TextFieldType textFieldType11 = TextFieldType.Filled;
                        v1.Attached attached11 = new v1.Attached(false, null, null, 7, null);
                        if (function29 == null) {
                            dVarF.y(-1353131191);
                            dVarF.u();
                            do1Var = null;
                        } else {
                            dVarF.y(-1353131190);
                            do1 do1VarE11 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                            dVarF.u();
                            do1Var = do1VarE11;
                        }
                        int i3115 = i4 >> 9;
                        int i3116 = i29 << 21;
                        boolean z112 = z5;
                        do1 do1Var12 = do1Var;
                        dVar2 = dVarF;
                        TextFieldImplKt.l(textFieldType11, text11, function11, attached11, do1Var12, function31, function28, function30, function32, function25, function27, z112, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i3115) | (3670016 & i3115) | (29360128 & i3116) | (234881024 & i3116) | (i3116 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i3115 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                        if (e.k()) {
                            e.n();
                        }
                        function18 = function29;
                        function13 = function31;
                        function14 = function28;
                        function19 = function30;
                        function15 = function32;
                        function16 = function25;
                        function20 = function27;
                        z8 = z9;
                        rx8Var2 = rx8Var3;
                        pscVar2 = pscVarG;
                        function17 = function2E;
                        xkbVar2 = xkbVar14;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        function13 = function4;
                        function14 = function5;
                        function15 = function7;
                        function16 = function8;
                        xkbVar2 = xkbVar;
                        pscVar2 = pscVar;
                        rx8Var2 = rx8Var;
                        function17 = function10;
                        function18 = function12;
                        z8 = z6;
                        function19 = function6;
                        function20 = function9;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.usc
                            public final Object invoke(Object obj, Object obj2) {
                                return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 805306368;
                i18 = i3 & 1024;
                if (i18 != 0) {
                    i19 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (dVarF.T(function6)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                    i19 = i2 | i20;
                } else {
                    i19 = i2;
                }
                i21 = i3 & 2048;
                if (i21 != 0) {
                    i19 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (dVarF.T(function7)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i19 |= i22;
                }
                i23 = i19;
                i24 = i3 & 4096;
                if (i24 != 0) {
                    i25 = i23 | 384;
                } else if ((i2 & 384) == 0) {
                    if (dVarF.T(function8)) {
                        i26 = 256;
                    } else {
                        i26 = 128;
                    }
                    i25 = i23 | i26;
                } else {
                    i25 = i23;
                }
                i27 = i3 & 8192;
                if (i27 != 0) {
                    i29 = i25 | 3072;
                } else {
                    i28 = i25;
                    if ((i2 & 3072) == 0) {
                        i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                    } else {
                        i29 = i28;
                    }
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i7 = 16384;
                    }
                    i29 |= i7;
                }
                if ((i2 & 196608) != 0) {
                    if ((i3 & 32768) == 0) {
                        i34 = 65536;
                    } else {
                        i34 = 65536;
                    }
                    i29 |= i34;
                }
                if ((i2 & 1572864) != 0) {
                    if ((i3 & 65536) == 0) {
                        i33 = 524288;
                    } else {
                        i33 = 524288;
                    }
                    i29 |= i33;
                }
                i30 = i3 & 131072;
                if (i30 != 0) {
                    i29 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (dVarF.T(function10)) {
                        i31 = 8388608;
                    } else {
                        i31 = 4194304;
                    }
                    i29 |= i31;
                }
                if ((i3 & 262144) != 0) {
                    i29 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (dVarF.x(this)) {
                        i32 = 67108864;
                    } else {
                        i32 = 33554432;
                    }
                    i29 |= i32;
                }
                if ((i4 & 306783379) == 306783378) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (dVarF.g(z7, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z6 = false;
                        }
                        if (i12 != 0) {
                            function12 = null;
                        }
                        if (i14 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i16 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i18 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i21 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i24 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i27 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            xkbVarQ = a.q(dVarF, 6);
                            i29 &= -57345;
                        } else {
                            xkbVarQ = xkbVar;
                        }
                        if ((i3 & 32768) != 0) {
                            pscVarG = g(dVarF, (i29 >> 24) & 14);
                            i29 &= -458753;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 65536) != 0) {
                            if (function12 == null) {
                                rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i29 &= -3670017;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i30 != 0) {
                            function27 = function26;
                            function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        xkbVar3 = xkbVarQ;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z9 = z6;
                        function32 = function24;
                        rx8Var3 = rx8VarJ;
                    } else {
                        if (i10 != 0) {
                            z6 = false;
                        }
                        if (i12 != 0) {
                            function12 = null;
                        }
                        if (i14 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i16 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i18 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i21 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i24 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i27 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            xkbVarQ = a.q(dVarF, 6);
                            i29 &= -57345;
                        } else {
                            xkbVarQ = xkbVar;
                        }
                        if ((i3 & 32768) != 0) {
                            pscVarG = g(dVarF, (i29 >> 24) & 14);
                            i29 &= -458753;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 65536) != 0) {
                            if (function12 == null) {
                                rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i29 &= -3670017;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i30 != 0) {
                            function27 = function26;
                            function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        xkbVar3 = xkbVarQ;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z9 = z6;
                        function32 = function24;
                        rx8Var3 = rx8VarJ;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                    }
                    if ((i4 & 14) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    xkb xkbVar15 = xkbVar3;
                    z11 = z10 | ((57344 & i4) == 16384);
                    objR = dVarF.R();
                    if (z11) {
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    } else {
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    }
                    String text12 = ((TransformedText) objR).getText().getText();
                    TextFieldType textFieldType12 = TextFieldType.Filled;
                    v1.Attached attached12 = new v1.Attached(false, null, null, 7, null);
                    if (function29 == null) {
                        dVarF.y(-1353131191);
                        dVarF.u();
                        do1Var = null;
                    } else {
                        dVarF.y(-1353131190);
                        do1 do1VarE12 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                        dVarF.u();
                        do1Var = do1VarE12;
                    }
                    int i3117 = i4 >> 9;
                    int i3118 = i29 << 21;
                    boolean z113 = z5;
                    do1 do1Var13 = do1Var;
                    dVar2 = dVarF;
                    TextFieldImplKt.l(textFieldType12, text12, function11, attached12, do1Var13, function31, function28, function30, function32, function25, function27, z113, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i3117) | (3670016 & i3117) | (29360128 & i3118) | (234881024 & i3118) | (i3118 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i3117 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                    if (e.k()) {
                        e.n();
                    }
                    function18 = function29;
                    function13 = function31;
                    function14 = function28;
                    function19 = function30;
                    function15 = function32;
                    function16 = function25;
                    function20 = function27;
                    z8 = z9;
                    rx8Var2 = rx8Var3;
                    pscVar2 = pscVarG;
                    function17 = function2E;
                    xkbVar2 = xkbVar15;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    function13 = function4;
                    function14 = function5;
                    function15 = function7;
                    function16 = function8;
                    xkbVar2 = xkbVar;
                    pscVar2 = pscVar;
                    rx8Var2 = rx8Var;
                    function17 = function10;
                    function18 = function12;
                    z8 = z6;
                    function19 = function6;
                    function20 = function9;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.usc
                        public final Object invoke(Object obj, Object obj2) {
                            return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 3072;
            z5 = z2;
            i7 = 8192;
            if ((i3 & 16) != 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                if (dVarF.x(nceVar)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i4 |= i8;
            }
            if ((i3 & 32) != 0) {
                if ((196608 & i) == 0) {
                    j26Var2 = j26Var;
                    if (dVarF.x(j26Var2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    i4 |= 1572864;
                    z6 = z3;
                } else {
                    z6 = z3;
                    if ((i & 1572864) == 0) {
                        if (dVarF.A(z6)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    }
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                    i4 |= 12582912;
                    function12 = function3;
                } else {
                    function12 = function3;
                    if ((i & 12582912) == 0) {
                        if (dVarF.T(function12)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i4 |= i13;
                    }
                }
                i14 = i3 & 256;
                if (i14 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (dVarF.T(function4)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i4 |= i15;
                }
                i16 = i3 & 512;
                if (i16 != 0) {
                    if ((i & 805306368) == 0) {
                        if (dVarF.T(function5)) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                        i4 |= i17;
                    }
                    i18 = i3 & 1024;
                    if (i18 != 0) {
                        i19 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (dVarF.T(function6)) {
                            i20 = 4;
                        } else {
                            i20 = 2;
                        }
                        i19 = i2 | i20;
                    } else {
                        i19 = i2;
                    }
                    i21 = i3 & 2048;
                    if (i21 != 0) {
                        i19 |= 48;
                    } else if ((i2 & 48) != 0) {
                        if (dVarF.T(function7)) {
                            i22 = 32;
                        } else {
                            i22 = 16;
                        }
                        i19 |= i22;
                    }
                    i23 = i19;
                    i24 = i3 & 4096;
                    if (i24 != 0) {
                        i25 = i23 | 384;
                    } else if ((i2 & 384) == 0) {
                        if (dVarF.T(function8)) {
                            i26 = 256;
                        } else {
                            i26 = 128;
                        }
                        i25 = i23 | i26;
                    } else {
                        i25 = i23;
                    }
                    i27 = i3 & 8192;
                    if (i27 != 0) {
                        i29 = i25 | 3072;
                    } else {
                        i28 = i25;
                        if ((i2 & 3072) == 0) {
                            i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                        } else {
                            i29 = i28;
                        }
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i7 = 16384;
                        }
                        i29 |= i7;
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32768) == 0) {
                            i34 = 65536;
                        } else {
                            i34 = 65536;
                        }
                        i29 |= i34;
                    }
                    if ((i2 & 1572864) != 0) {
                        if ((i3 & 65536) == 0) {
                            i33 = 524288;
                        } else {
                            i33 = 524288;
                        }
                        i29 |= i33;
                    }
                    i30 = i3 & 131072;
                    if (i30 != 0) {
                        i29 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (dVarF.T(function10)) {
                            i31 = 8388608;
                        } else {
                            i31 = 4194304;
                        }
                        i29 |= i31;
                    }
                    if ((i3 & 262144) != 0) {
                        i29 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (dVarF.x(this)) {
                            i32 = 67108864;
                        } else {
                            i32 = 33554432;
                        }
                        i29 |= i32;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (dVarF.g(z7, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z6 = false;
                            }
                            if (i12 != 0) {
                                function12 = null;
                            }
                            if (i14 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i16 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i18 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i21 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i24 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i27 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                xkbVarQ = a.q(dVarF, 6);
                                i29 &= -57345;
                            } else {
                                xkbVarQ = xkbVar;
                            }
                            if ((i3 & 32768) != 0) {
                                pscVarG = g(dVarF, (i29 >> 24) & 14);
                                i29 &= -458753;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 65536) != 0) {
                                if (function12 == null) {
                                    rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i29 &= -3670017;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i30 != 0) {
                                function27 = function26;
                                function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            xkbVar3 = xkbVarQ;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z9 = z6;
                            function32 = function24;
                            rx8Var3 = rx8VarJ;
                        } else {
                            if (i10 != 0) {
                                z6 = false;
                            }
                            if (i12 != 0) {
                                function12 = null;
                            }
                            if (i14 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i16 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i18 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i21 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i24 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i27 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                xkbVarQ = a.q(dVarF, 6);
                                i29 &= -57345;
                            } else {
                                xkbVarQ = xkbVar;
                            }
                            if ((i3 & 32768) != 0) {
                                pscVarG = g(dVarF, (i29 >> 24) & 14);
                                i29 &= -458753;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 65536) != 0) {
                                if (function12 == null) {
                                    rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i29 &= -3670017;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i30 != 0) {
                                function27 = function26;
                                function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            xkbVar3 = xkbVarQ;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z9 = z6;
                            function32 = function24;
                            rx8Var3 = rx8VarJ;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                        }
                        if ((i4 & 14) == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        xkb xkbVar16 = xkbVar3;
                        z11 = z10 | ((57344 & i4) == 16384);
                        objR = dVarF.R();
                        if (z11) {
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        } else {
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        }
                        String text13 = ((TransformedText) objR).getText().getText();
                        TextFieldType textFieldType13 = TextFieldType.Filled;
                        v1.Attached attached13 = new v1.Attached(false, null, null, 7, null);
                        if (function29 == null) {
                            dVarF.y(-1353131191);
                            dVarF.u();
                            do1Var = null;
                        } else {
                            dVarF.y(-1353131190);
                            do1 do1VarE13 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                            dVarF.u();
                            do1Var = do1VarE13;
                        }
                        int i3119 = i4 >> 9;
                        int i31110 = i29 << 21;
                        boolean z114 = z5;
                        do1 do1Var14 = do1Var;
                        dVar2 = dVarF;
                        TextFieldImplKt.l(textFieldType13, text13, function11, attached13, do1Var14, function31, function28, function30, function32, function25, function27, z114, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i3119) | (3670016 & i3119) | (29360128 & i31110) | (234881024 & i31110) | (i31110 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i3119 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                        if (e.k()) {
                            e.n();
                        }
                        function18 = function29;
                        function13 = function31;
                        function14 = function28;
                        function19 = function30;
                        function15 = function32;
                        function16 = function25;
                        function20 = function27;
                        z8 = z9;
                        rx8Var2 = rx8Var3;
                        pscVar2 = pscVarG;
                        function17 = function2E;
                        xkbVar2 = xkbVar16;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        function13 = function4;
                        function14 = function5;
                        function15 = function7;
                        function16 = function8;
                        xkbVar2 = xkbVar;
                        pscVar2 = pscVar;
                        rx8Var2 = rx8Var;
                        function17 = function10;
                        function18 = function12;
                        z8 = z6;
                        function19 = function6;
                        function20 = function9;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.usc
                            public final Object invoke(Object obj, Object obj2) {
                                return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 805306368;
                i18 = i3 & 1024;
                if (i18 != 0) {
                    i19 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (dVarF.T(function6)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                    i19 = i2 | i20;
                } else {
                    i19 = i2;
                }
                i21 = i3 & 2048;
                if (i21 != 0) {
                    i19 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (dVarF.T(function7)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i19 |= i22;
                }
                i23 = i19;
                i24 = i3 & 4096;
                if (i24 != 0) {
                    i25 = i23 | 384;
                } else if ((i2 & 384) == 0) {
                    if (dVarF.T(function8)) {
                        i26 = 256;
                    } else {
                        i26 = 128;
                    }
                    i25 = i23 | i26;
                } else {
                    i25 = i23;
                }
                i27 = i3 & 8192;
                if (i27 != 0) {
                    i29 = i25 | 3072;
                } else {
                    i28 = i25;
                    if ((i2 & 3072) == 0) {
                        i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                    } else {
                        i29 = i28;
                    }
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i7 = 16384;
                    }
                    i29 |= i7;
                }
                if ((i2 & 196608) != 0) {
                    if ((i3 & 32768) == 0) {
                        i34 = 65536;
                    } else {
                        i34 = 65536;
                    }
                    i29 |= i34;
                }
                if ((i2 & 1572864) != 0) {
                    if ((i3 & 65536) == 0) {
                        i33 = 524288;
                    } else {
                        i33 = 524288;
                    }
                    i29 |= i33;
                }
                i30 = i3 & 131072;
                if (i30 != 0) {
                    i29 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (dVarF.T(function10)) {
                        i31 = 8388608;
                    } else {
                        i31 = 4194304;
                    }
                    i29 |= i31;
                }
                if ((i3 & 262144) != 0) {
                    i29 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (dVarF.x(this)) {
                        i32 = 67108864;
                    } else {
                        i32 = 33554432;
                    }
                    i29 |= i32;
                }
                if ((i4 & 306783379) == 306783378) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (dVarF.g(z7, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z6 = false;
                        }
                        if (i12 != 0) {
                            function12 = null;
                        }
                        if (i14 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i16 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i18 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i21 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i24 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i27 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            xkbVarQ = a.q(dVarF, 6);
                            i29 &= -57345;
                        } else {
                            xkbVarQ = xkbVar;
                        }
                        if ((i3 & 32768) != 0) {
                            pscVarG = g(dVarF, (i29 >> 24) & 14);
                            i29 &= -458753;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 65536) != 0) {
                            if (function12 == null) {
                                rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i29 &= -3670017;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i30 != 0) {
                            function27 = function26;
                            function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        xkbVar3 = xkbVarQ;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z9 = z6;
                        function32 = function24;
                        rx8Var3 = rx8VarJ;
                    } else {
                        if (i10 != 0) {
                            z6 = false;
                        }
                        if (i12 != 0) {
                            function12 = null;
                        }
                        if (i14 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i16 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i18 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i21 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i24 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i27 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            xkbVarQ = a.q(dVarF, 6);
                            i29 &= -57345;
                        } else {
                            xkbVarQ = xkbVar;
                        }
                        if ((i3 & 32768) != 0) {
                            pscVarG = g(dVarF, (i29 >> 24) & 14);
                            i29 &= -458753;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 65536) != 0) {
                            if (function12 == null) {
                                rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i29 &= -3670017;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i30 != 0) {
                            function27 = function26;
                            function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        xkbVar3 = xkbVarQ;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z9 = z6;
                        function32 = function24;
                        rx8Var3 = rx8VarJ;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                    }
                    if ((i4 & 14) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    xkb xkbVar17 = xkbVar3;
                    z11 = z10 | ((57344 & i4) == 16384);
                    objR = dVarF.R();
                    if (z11) {
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    } else {
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    }
                    String text14 = ((TransformedText) objR).getText().getText();
                    TextFieldType textFieldType14 = TextFieldType.Filled;
                    v1.Attached attached14 = new v1.Attached(false, null, null, 7, null);
                    if (function29 == null) {
                        dVarF.y(-1353131191);
                        dVarF.u();
                        do1Var = null;
                    } else {
                        dVarF.y(-1353131190);
                        do1 do1VarE14 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                        dVarF.u();
                        do1Var = do1VarE14;
                    }
                    int i31111 = i4 >> 9;
                    int i31112 = i29 << 21;
                    boolean z115 = z5;
                    do1 do1Var15 = do1Var;
                    dVar2 = dVarF;
                    TextFieldImplKt.l(textFieldType14, text14, function11, attached14, do1Var15, function31, function28, function30, function32, function25, function27, z115, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i31111) | (3670016 & i31111) | (29360128 & i31112) | (234881024 & i31112) | (i31112 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i31111 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                    if (e.k()) {
                        e.n();
                    }
                    function18 = function29;
                    function13 = function31;
                    function14 = function28;
                    function19 = function30;
                    function15 = function32;
                    function16 = function25;
                    function20 = function27;
                    z8 = z9;
                    rx8Var2 = rx8Var3;
                    pscVar2 = pscVarG;
                    function17 = function2E;
                    xkbVar2 = xkbVar17;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    function13 = function4;
                    function14 = function5;
                    function15 = function7;
                    function16 = function8;
                    xkbVar2 = xkbVar;
                    pscVar2 = pscVar;
                    rx8Var2 = rx8Var;
                    function17 = function10;
                    function18 = function12;
                    z8 = z6;
                    function19 = function6;
                    function20 = function9;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.usc
                        public final Object invoke(Object obj, Object obj2) {
                            return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 196608;
            j26Var2 = j26Var;
            i10 = i3 & 64;
            if (i10 != 0) {
                i4 |= 1572864;
                z6 = z3;
            } else {
                z6 = z3;
                if ((i & 1572864) == 0) {
                    if (dVarF.A(z6)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
            }
            i12 = i3 & 128;
            if (i12 != 0) {
                i4 |= 12582912;
                function12 = function3;
            } else {
                function12 = function3;
                if ((i & 12582912) == 0) {
                    if (dVarF.T(function12)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i4 |= i13;
                }
            }
            i14 = i3 & 256;
            if (i14 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (dVarF.T(function4)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i4 |= i15;
            }
            i16 = i3 & 512;
            if (i16 != 0) {
                if ((i & 805306368) == 0) {
                    if (dVarF.T(function5)) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                    i4 |= i17;
                }
                i18 = i3 & 1024;
                if (i18 != 0) {
                    i19 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (dVarF.T(function6)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                    i19 = i2 | i20;
                } else {
                    i19 = i2;
                }
                i21 = i3 & 2048;
                if (i21 != 0) {
                    i19 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (dVarF.T(function7)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i19 |= i22;
                }
                i23 = i19;
                i24 = i3 & 4096;
                if (i24 != 0) {
                    i25 = i23 | 384;
                } else if ((i2 & 384) == 0) {
                    if (dVarF.T(function8)) {
                        i26 = 256;
                    } else {
                        i26 = 128;
                    }
                    i25 = i23 | i26;
                } else {
                    i25 = i23;
                }
                i27 = i3 & 8192;
                if (i27 != 0) {
                    i29 = i25 | 3072;
                } else {
                    i28 = i25;
                    if ((i2 & 3072) == 0) {
                        i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                    } else {
                        i29 = i28;
                    }
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i7 = 16384;
                    }
                    i29 |= i7;
                }
                if ((i2 & 196608) != 0) {
                    if ((i3 & 32768) == 0) {
                        i34 = 65536;
                    } else {
                        i34 = 65536;
                    }
                    i29 |= i34;
                }
                if ((i2 & 1572864) != 0) {
                    if ((i3 & 65536) == 0) {
                        i33 = 524288;
                    } else {
                        i33 = 524288;
                    }
                    i29 |= i33;
                }
                i30 = i3 & 131072;
                if (i30 != 0) {
                    i29 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (dVarF.T(function10)) {
                        i31 = 8388608;
                    } else {
                        i31 = 4194304;
                    }
                    i29 |= i31;
                }
                if ((i3 & 262144) != 0) {
                    i29 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (dVarF.x(this)) {
                        i32 = 67108864;
                    } else {
                        i32 = 33554432;
                    }
                    i29 |= i32;
                }
                if ((i4 & 306783379) == 306783378) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (dVarF.g(z7, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z6 = false;
                        }
                        if (i12 != 0) {
                            function12 = null;
                        }
                        if (i14 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i16 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i18 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i21 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i24 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i27 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            xkbVarQ = a.q(dVarF, 6);
                            i29 &= -57345;
                        } else {
                            xkbVarQ = xkbVar;
                        }
                        if ((i3 & 32768) != 0) {
                            pscVarG = g(dVarF, (i29 >> 24) & 14);
                            i29 &= -458753;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 65536) != 0) {
                            if (function12 == null) {
                                rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i29 &= -3670017;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i30 != 0) {
                            function27 = function26;
                            function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        xkbVar3 = xkbVarQ;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z9 = z6;
                        function32 = function24;
                        rx8Var3 = rx8VarJ;
                    } else {
                        if (i10 != 0) {
                            z6 = false;
                        }
                        if (i12 != 0) {
                            function12 = null;
                        }
                        if (i14 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i16 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i18 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i21 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i24 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i27 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            xkbVarQ = a.q(dVarF, 6);
                            i29 &= -57345;
                        } else {
                            xkbVarQ = xkbVar;
                        }
                        if ((i3 & 32768) != 0) {
                            pscVarG = g(dVarF, (i29 >> 24) & 14);
                            i29 &= -458753;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 65536) != 0) {
                            if (function12 == null) {
                                rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i29 &= -3670017;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i30 != 0) {
                            function27 = function26;
                            function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        xkbVar3 = xkbVarQ;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z9 = z6;
                        function32 = function24;
                        rx8Var3 = rx8VarJ;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                    }
                    if ((i4 & 14) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    xkb xkbVar18 = xkbVar3;
                    z11 = z10 | ((57344 & i4) == 16384);
                    objR = dVarF.R();
                    if (z11) {
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    } else {
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    }
                    String text15 = ((TransformedText) objR).getText().getText();
                    TextFieldType textFieldType15 = TextFieldType.Filled;
                    v1.Attached attached15 = new v1.Attached(false, null, null, 7, null);
                    if (function29 == null) {
                        dVarF.y(-1353131191);
                        dVarF.u();
                        do1Var = null;
                    } else {
                        dVarF.y(-1353131190);
                        do1 do1VarE15 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                        dVarF.u();
                        do1Var = do1VarE15;
                    }
                    int i31113 = i4 >> 9;
                    int i31114 = i29 << 21;
                    boolean z116 = z5;
                    do1 do1Var16 = do1Var;
                    dVar2 = dVarF;
                    TextFieldImplKt.l(textFieldType15, text15, function11, attached15, do1Var16, function31, function28, function30, function32, function25, function27, z116, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i31113) | (3670016 & i31113) | (29360128 & i31114) | (234881024 & i31114) | (i31114 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i31113 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                    if (e.k()) {
                        e.n();
                    }
                    function18 = function29;
                    function13 = function31;
                    function14 = function28;
                    function19 = function30;
                    function15 = function32;
                    function16 = function25;
                    function20 = function27;
                    z8 = z9;
                    rx8Var2 = rx8Var3;
                    pscVar2 = pscVarG;
                    function17 = function2E;
                    xkbVar2 = xkbVar18;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    function13 = function4;
                    function14 = function5;
                    function15 = function7;
                    function16 = function8;
                    xkbVar2 = xkbVar;
                    pscVar2 = pscVar;
                    rx8Var2 = rx8Var;
                    function17 = function10;
                    function18 = function12;
                    z8 = z6;
                    function19 = function6;
                    function20 = function9;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.usc
                        public final Object invoke(Object obj, Object obj2) {
                            return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 805306368;
            i18 = i3 & 1024;
            if (i18 != 0) {
                i19 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (dVarF.T(function6)) {
                    i20 = 4;
                } else {
                    i20 = 2;
                }
                i19 = i2 | i20;
            } else {
                i19 = i2;
            }
            i21 = i3 & 2048;
            if (i21 != 0) {
                i19 |= 48;
            } else if ((i2 & 48) != 0) {
                if (dVarF.T(function7)) {
                    i22 = 32;
                } else {
                    i22 = 16;
                }
                i19 |= i22;
            }
            i23 = i19;
            i24 = i3 & 4096;
            if (i24 != 0) {
                i25 = i23 | 384;
            } else if ((i2 & 384) == 0) {
                if (dVarF.T(function8)) {
                    i26 = 256;
                } else {
                    i26 = 128;
                }
                i25 = i23 | i26;
            } else {
                i25 = i23;
            }
            i27 = i3 & 8192;
            if (i27 != 0) {
                i29 = i25 | 3072;
            } else {
                i28 = i25;
                if ((i2 & 3072) == 0) {
                    i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                } else {
                    i29 = i28;
                }
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16384) == 0) {
                    i7 = 16384;
                }
                i29 |= i7;
            }
            if ((i2 & 196608) != 0) {
                if ((i3 & 32768) == 0) {
                    i34 = 65536;
                } else {
                    i34 = 65536;
                }
                i29 |= i34;
            }
            if ((i2 & 1572864) != 0) {
                if ((i3 & 65536) == 0) {
                    i33 = 524288;
                } else {
                    i33 = 524288;
                }
                i29 |= i33;
            }
            i30 = i3 & 131072;
            if (i30 != 0) {
                i29 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (dVarF.T(function10)) {
                    i31 = 8388608;
                } else {
                    i31 = 4194304;
                }
                i29 |= i31;
            }
            if ((i3 & 262144) != 0) {
                i29 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (dVarF.x(this)) {
                    i32 = 67108864;
                } else {
                    i32 = 33554432;
                }
                i29 |= i32;
            }
            if ((i4 & 306783379) == 306783378) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (dVarF.g(z7, i4 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        z6 = false;
                    }
                    if (i12 != 0) {
                        function12 = null;
                    }
                    if (i14 != 0) {
                        function21 = null;
                    } else {
                        function21 = function4;
                    }
                    if (i16 != 0) {
                        function22 = null;
                    } else {
                        function22 = function5;
                    }
                    if (i18 != 0) {
                        function23 = null;
                    } else {
                        function23 = function6;
                    }
                    if (i21 != 0) {
                        function24 = null;
                    } else {
                        function24 = function7;
                    }
                    if (i24 != 0) {
                        function25 = null;
                    } else {
                        function25 = function8;
                    }
                    if (i27 != 0) {
                        function26 = null;
                    } else {
                        function26 = function9;
                    }
                    if ((i3 & 16384) != 0) {
                        xkbVarQ = a.q(dVarF, 6);
                        i29 &= -57345;
                    } else {
                        xkbVarQ = xkbVar;
                    }
                    if ((i3 & 32768) != 0) {
                        pscVarG = g(dVarF, (i29 >> 24) & 14);
                        i29 &= -458753;
                    } else {
                        pscVarG = pscVar;
                    }
                    if ((i3 & 65536) != 0) {
                        if (function12 == null) {
                            rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i29 &= -3670017;
                    } else {
                        rx8VarJ = rx8Var;
                    }
                    if (i30 != 0) {
                        function27 = function26;
                        function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                    } else {
                        function27 = function26;
                        function2E = function10;
                    }
                    xkbVar3 = xkbVarQ;
                    function28 = function22;
                    function29 = function12;
                    function30 = function23;
                    function31 = function21;
                    z9 = z6;
                    function32 = function24;
                    rx8Var3 = rx8VarJ;
                } else {
                    if (i10 != 0) {
                        z6 = false;
                    }
                    if (i12 != 0) {
                        function12 = null;
                    }
                    if (i14 != 0) {
                        function21 = null;
                    } else {
                        function21 = function4;
                    }
                    if (i16 != 0) {
                        function22 = null;
                    } else {
                        function22 = function5;
                    }
                    if (i18 != 0) {
                        function23 = null;
                    } else {
                        function23 = function6;
                    }
                    if (i21 != 0) {
                        function24 = null;
                    } else {
                        function24 = function7;
                    }
                    if (i24 != 0) {
                        function25 = null;
                    } else {
                        function25 = function8;
                    }
                    if (i27 != 0) {
                        function26 = null;
                    } else {
                        function26 = function9;
                    }
                    if ((i3 & 16384) != 0) {
                        xkbVarQ = a.q(dVarF, 6);
                        i29 &= -57345;
                    } else {
                        xkbVarQ = xkbVar;
                    }
                    if ((i3 & 32768) != 0) {
                        pscVarG = g(dVarF, (i29 >> 24) & 14);
                        i29 &= -458753;
                    } else {
                        pscVarG = pscVar;
                    }
                    if ((i3 & 65536) != 0) {
                        if (function12 == null) {
                            rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i29 &= -3670017;
                    } else {
                        rx8VarJ = rx8Var;
                    }
                    if (i30 != 0) {
                        function27 = function26;
                        function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                    } else {
                        function27 = function26;
                        function2E = function10;
                    }
                    xkbVar3 = xkbVarQ;
                    function28 = function22;
                    function29 = function12;
                    function30 = function23;
                    function31 = function21;
                    z9 = z6;
                    function32 = function24;
                    rx8Var3 = rx8VarJ;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                }
                if ((i4 & 14) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xkb xkbVar19 = xkbVar3;
                z11 = z10 | ((57344 & i4) == 16384);
                objR = dVarF.R();
                if (z11) {
                    objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                    dVarF.L(objR);
                } else {
                    objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                    dVarF.L(objR);
                }
                String text16 = ((TransformedText) objR).getText().getText();
                TextFieldType textFieldType16 = TextFieldType.Filled;
                v1.Attached attached16 = new v1.Attached(false, null, null, 7, null);
                if (function29 == null) {
                    dVarF.y(-1353131191);
                    dVarF.u();
                    do1Var = null;
                } else {
                    dVarF.y(-1353131190);
                    do1 do1VarE16 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                    dVarF.u();
                    do1Var = do1VarE16;
                }
                int i31115 = i4 >> 9;
                int i31116 = i29 << 21;
                boolean z117 = z5;
                do1 do1Var17 = do1Var;
                dVar2 = dVarF;
                TextFieldImplKt.l(textFieldType16, text16, function11, attached16, do1Var17, function31, function28, function30, function32, function25, function27, z117, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i31115) | (3670016 & i31115) | (29360128 & i31116) | (234881024 & i31116) | (i31116 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i31115 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                if (e.k()) {
                    e.n();
                }
                function18 = function29;
                function13 = function31;
                function14 = function28;
                function19 = function30;
                function15 = function32;
                function16 = function25;
                function20 = function27;
                z8 = z9;
                rx8Var2 = rx8Var3;
                pscVar2 = pscVarG;
                function17 = function2E;
                xkbVar2 = xkbVar19;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                function13 = function4;
                function14 = function5;
                function15 = function7;
                function16 = function8;
                xkbVar2 = xkbVar;
                pscVar2 = pscVar;
                rx8Var2 = rx8Var;
                function17 = function10;
                function18 = function12;
                z8 = z6;
                function19 = function6;
                function20 = function9;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.usc
                    public final Object invoke(Object obj, Object obj2) {
                        return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 48;
        function11 = function2;
        if ((i3 & 4) != 0) {
            if ((i & 384) == 0) {
                z4 = z;
                if (dVarF.A(z4)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i4 |= i5;
            }
            if ((i3 & 8) != 0) {
                if ((i & 3072) == 0) {
                    z5 = z2;
                    if (dVarF.A(z5)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                i7 = 8192;
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    if (dVarF.x(nceVar)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((i3 & 32) != 0) {
                    if ((196608 & i) == 0) {
                        j26Var2 = j26Var;
                        if (dVarF.x(j26Var2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i4 |= i9;
                    }
                    i10 = i3 & 64;
                    if (i10 != 0) {
                        i4 |= 1572864;
                        z6 = z3;
                    } else {
                        z6 = z3;
                        if ((i & 1572864) == 0) {
                            if (dVarF.A(z6)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i4 |= i11;
                        }
                    }
                    i12 = i3 & 128;
                    if (i12 != 0) {
                        i4 |= 12582912;
                        function12 = function3;
                    } else {
                        function12 = function3;
                        if ((i & 12582912) == 0) {
                            if (dVarF.T(function12)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i4 |= i13;
                        }
                    }
                    i14 = i3 & 256;
                    if (i14 != 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (dVarF.T(function4)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                        i4 |= i15;
                    }
                    i16 = i3 & 512;
                    if (i16 != 0) {
                        if ((i & 805306368) == 0) {
                            if (dVarF.T(function5)) {
                                i17 = 536870912;
                            } else {
                                i17 = 268435456;
                            }
                            i4 |= i17;
                        }
                        i18 = i3 & 1024;
                        if (i18 != 0) {
                            i19 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (dVarF.T(function6)) {
                                i20 = 4;
                            } else {
                                i20 = 2;
                            }
                            i19 = i2 | i20;
                        } else {
                            i19 = i2;
                        }
                        i21 = i3 & 2048;
                        if (i21 != 0) {
                            i19 |= 48;
                        } else if ((i2 & 48) != 0) {
                            if (dVarF.T(function7)) {
                                i22 = 32;
                            } else {
                                i22 = 16;
                            }
                            i19 |= i22;
                        }
                        i23 = i19;
                        i24 = i3 & 4096;
                        if (i24 != 0) {
                            i25 = i23 | 384;
                        } else if ((i2 & 384) == 0) {
                            if (dVarF.T(function8)) {
                                i26 = 256;
                            } else {
                                i26 = 128;
                            }
                            i25 = i23 | i26;
                        } else {
                            i25 = i23;
                        }
                        i27 = i3 & 8192;
                        if (i27 != 0) {
                            i29 = i25 | 3072;
                        } else {
                            i28 = i25;
                            if ((i2 & 3072) == 0) {
                                i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                            } else {
                                i29 = i28;
                            }
                        }
                        if ((i2 & 24576) != 0) {
                            if ((i3 & 16384) == 0) {
                                i7 = 16384;
                            }
                            i29 |= i7;
                        }
                        if ((i2 & 196608) != 0) {
                            if ((i3 & 32768) == 0) {
                                i34 = 65536;
                            } else {
                                i34 = 65536;
                            }
                            i29 |= i34;
                        }
                        if ((i2 & 1572864) != 0) {
                            if ((i3 & 65536) == 0) {
                                i33 = 524288;
                            } else {
                                i33 = 524288;
                            }
                            i29 |= i33;
                        }
                        i30 = i3 & 131072;
                        if (i30 != 0) {
                            i29 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            if (dVarF.T(function10)) {
                                i31 = 8388608;
                            } else {
                                i31 = 4194304;
                            }
                            i29 |= i31;
                        }
                        if ((i3 & 262144) != 0) {
                            i29 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            if (dVarF.x(this)) {
                                i32 = 67108864;
                            } else {
                                i32 = 33554432;
                            }
                            i29 |= i32;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            z7 = true;
                        } else {
                            z7 = true;
                        }
                        if (dVarF.g(z7, i4 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i10 != 0) {
                                    z6 = false;
                                }
                                if (i12 != 0) {
                                    function12 = null;
                                }
                                if (i14 != 0) {
                                    function21 = null;
                                } else {
                                    function21 = function4;
                                }
                                if (i16 != 0) {
                                    function22 = null;
                                } else {
                                    function22 = function5;
                                }
                                if (i18 != 0) {
                                    function23 = null;
                                } else {
                                    function23 = function6;
                                }
                                if (i21 != 0) {
                                    function24 = null;
                                } else {
                                    function24 = function7;
                                }
                                if (i24 != 0) {
                                    function25 = null;
                                } else {
                                    function25 = function8;
                                }
                                if (i27 != 0) {
                                    function26 = null;
                                } else {
                                    function26 = function9;
                                }
                                if ((i3 & 16384) != 0) {
                                    xkbVarQ = a.q(dVarF, 6);
                                    i29 &= -57345;
                                } else {
                                    xkbVarQ = xkbVar;
                                }
                                if ((i3 & 32768) != 0) {
                                    pscVarG = g(dVarF, (i29 >> 24) & 14);
                                    i29 &= -458753;
                                } else {
                                    pscVarG = pscVar;
                                }
                                if ((i3 & 65536) != 0) {
                                    if (function12 == null) {
                                        rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    } else {
                                        rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    }
                                    i29 &= -3670017;
                                } else {
                                    rx8VarJ = rx8Var;
                                }
                                if (i30 != 0) {
                                    function27 = function26;
                                    function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                                } else {
                                    function27 = function26;
                                    function2E = function10;
                                }
                                xkbVar3 = xkbVarQ;
                                function28 = function22;
                                function29 = function12;
                                function30 = function23;
                                function31 = function21;
                                z9 = z6;
                                function32 = function24;
                                rx8Var3 = rx8VarJ;
                            } else {
                                if (i10 != 0) {
                                    z6 = false;
                                }
                                if (i12 != 0) {
                                    function12 = null;
                                }
                                if (i14 != 0) {
                                    function21 = null;
                                } else {
                                    function21 = function4;
                                }
                                if (i16 != 0) {
                                    function22 = null;
                                } else {
                                    function22 = function5;
                                }
                                if (i18 != 0) {
                                    function23 = null;
                                } else {
                                    function23 = function6;
                                }
                                if (i21 != 0) {
                                    function24 = null;
                                } else {
                                    function24 = function7;
                                }
                                if (i24 != 0) {
                                    function25 = null;
                                } else {
                                    function25 = function8;
                                }
                                if (i27 != 0) {
                                    function26 = null;
                                } else {
                                    function26 = function9;
                                }
                                if ((i3 & 16384) != 0) {
                                    xkbVarQ = a.q(dVarF, 6);
                                    i29 &= -57345;
                                } else {
                                    xkbVarQ = xkbVar;
                                }
                                if ((i3 & 32768) != 0) {
                                    pscVarG = g(dVarF, (i29 >> 24) & 14);
                                    i29 &= -458753;
                                } else {
                                    pscVarG = pscVar;
                                }
                                if ((i3 & 65536) != 0) {
                                    if (function12 == null) {
                                        rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    } else {
                                        rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    }
                                    i29 &= -3670017;
                                } else {
                                    rx8VarJ = rx8Var;
                                }
                                if (i30 != 0) {
                                    function27 = function26;
                                    function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                                } else {
                                    function27 = function26;
                                    function2E = function10;
                                }
                                xkbVar3 = xkbVarQ;
                                function28 = function22;
                                function29 = function12;
                                function30 = function23;
                                function31 = function21;
                                z9 = z6;
                                function32 = function24;
                                rx8Var3 = rx8VarJ;
                            }
                            dVarF.M();
                            if (e.k()) {
                                e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                            }
                            if ((i4 & 14) == 4) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            xkb xkbVar110 = xkbVar3;
                            z11 = z10 | ((57344 & i4) == 16384);
                            objR = dVarF.R();
                            if (z11) {
                                objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                                dVarF.L(objR);
                            } else {
                                objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                                dVarF.L(objR);
                            }
                            String text17 = ((TransformedText) objR).getText().getText();
                            TextFieldType textFieldType17 = TextFieldType.Filled;
                            v1.Attached attached17 = new v1.Attached(false, null, null, 7, null);
                            if (function29 == null) {
                                dVarF.y(-1353131191);
                                dVarF.u();
                                do1Var = null;
                            } else {
                                dVarF.y(-1353131190);
                                do1 do1VarE17 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                                dVarF.u();
                                do1Var = do1VarE17;
                            }
                            int i31117 = i4 >> 9;
                            int i31118 = i29 << 21;
                            boolean z118 = z5;
                            do1 do1Var18 = do1Var;
                            dVar2 = dVarF;
                            TextFieldImplKt.l(textFieldType17, text17, function11, attached17, do1Var18, function31, function28, function30, function32, function25, function27, z118, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i31117) | (3670016 & i31117) | (29360128 & i31118) | (234881024 & i31118) | (i31118 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i31117 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                            if (e.k()) {
                                e.n();
                            }
                            function18 = function29;
                            function13 = function31;
                            function14 = function28;
                            function19 = function30;
                            function15 = function32;
                            function16 = function25;
                            function20 = function27;
                            z8 = z9;
                            rx8Var2 = rx8Var3;
                            pscVar2 = pscVarG;
                            function17 = function2E;
                            xkbVar2 = xkbVar110;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            function13 = function4;
                            function14 = function5;
                            function15 = function7;
                            function16 = function8;
                            xkbVar2 = xkbVar;
                            pscVar2 = pscVar;
                            rx8Var2 = rx8Var;
                            function17 = function10;
                            function18 = function12;
                            z8 = z6;
                            function19 = function6;
                            function20 = function9;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.usc
                                public final Object invoke(Object obj, Object obj2) {
                                    return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i4 |= 805306368;
                    i18 = i3 & 1024;
                    if (i18 != 0) {
                        i19 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (dVarF.T(function6)) {
                            i20 = 4;
                        } else {
                            i20 = 2;
                        }
                        i19 = i2 | i20;
                    } else {
                        i19 = i2;
                    }
                    i21 = i3 & 2048;
                    if (i21 != 0) {
                        i19 |= 48;
                    } else if ((i2 & 48) != 0) {
                        if (dVarF.T(function7)) {
                            i22 = 32;
                        } else {
                            i22 = 16;
                        }
                        i19 |= i22;
                    }
                    i23 = i19;
                    i24 = i3 & 4096;
                    if (i24 != 0) {
                        i25 = i23 | 384;
                    } else if ((i2 & 384) == 0) {
                        if (dVarF.T(function8)) {
                            i26 = 256;
                        } else {
                            i26 = 128;
                        }
                        i25 = i23 | i26;
                    } else {
                        i25 = i23;
                    }
                    i27 = i3 & 8192;
                    if (i27 != 0) {
                        i29 = i25 | 3072;
                    } else {
                        i28 = i25;
                        if ((i2 & 3072) == 0) {
                            i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                        } else {
                            i29 = i28;
                        }
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i7 = 16384;
                        }
                        i29 |= i7;
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32768) == 0) {
                            i34 = 65536;
                        } else {
                            i34 = 65536;
                        }
                        i29 |= i34;
                    }
                    if ((i2 & 1572864) != 0) {
                        if ((i3 & 65536) == 0) {
                            i33 = 524288;
                        } else {
                            i33 = 524288;
                        }
                        i29 |= i33;
                    }
                    i30 = i3 & 131072;
                    if (i30 != 0) {
                        i29 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (dVarF.T(function10)) {
                            i31 = 8388608;
                        } else {
                            i31 = 4194304;
                        }
                        i29 |= i31;
                    }
                    if ((i3 & 262144) != 0) {
                        i29 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (dVarF.x(this)) {
                            i32 = 67108864;
                        } else {
                            i32 = 33554432;
                        }
                        i29 |= i32;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (dVarF.g(z7, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z6 = false;
                            }
                            if (i12 != 0) {
                                function12 = null;
                            }
                            if (i14 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i16 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i18 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i21 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i24 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i27 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                xkbVarQ = a.q(dVarF, 6);
                                i29 &= -57345;
                            } else {
                                xkbVarQ = xkbVar;
                            }
                            if ((i3 & 32768) != 0) {
                                pscVarG = g(dVarF, (i29 >> 24) & 14);
                                i29 &= -458753;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 65536) != 0) {
                                if (function12 == null) {
                                    rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i29 &= -3670017;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i30 != 0) {
                                function27 = function26;
                                function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            xkbVar3 = xkbVarQ;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z9 = z6;
                            function32 = function24;
                            rx8Var3 = rx8VarJ;
                        } else {
                            if (i10 != 0) {
                                z6 = false;
                            }
                            if (i12 != 0) {
                                function12 = null;
                            }
                            if (i14 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i16 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i18 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i21 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i24 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i27 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                xkbVarQ = a.q(dVarF, 6);
                                i29 &= -57345;
                            } else {
                                xkbVarQ = xkbVar;
                            }
                            if ((i3 & 32768) != 0) {
                                pscVarG = g(dVarF, (i29 >> 24) & 14);
                                i29 &= -458753;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 65536) != 0) {
                                if (function12 == null) {
                                    rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i29 &= -3670017;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i30 != 0) {
                                function27 = function26;
                                function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            xkbVar3 = xkbVarQ;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z9 = z6;
                            function32 = function24;
                            rx8Var3 = rx8VarJ;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                        }
                        if ((i4 & 14) == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        xkb xkbVar111 = xkbVar3;
                        z11 = z10 | ((57344 & i4) == 16384);
                        objR = dVarF.R();
                        if (z11) {
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        } else {
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        }
                        String text18 = ((TransformedText) objR).getText().getText();
                        TextFieldType textFieldType18 = TextFieldType.Filled;
                        v1.Attached attached18 = new v1.Attached(false, null, null, 7, null);
                        if (function29 == null) {
                            dVarF.y(-1353131191);
                            dVarF.u();
                            do1Var = null;
                        } else {
                            dVarF.y(-1353131190);
                            do1 do1VarE18 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                            dVarF.u();
                            do1Var = do1VarE18;
                        }
                        int i31119 = i4 >> 9;
                        int i311110 = i29 << 21;
                        boolean z119 = z5;
                        do1 do1Var19 = do1Var;
                        dVar2 = dVarF;
                        TextFieldImplKt.l(textFieldType18, text18, function11, attached18, do1Var19, function31, function28, function30, function32, function25, function27, z119, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i31119) | (3670016 & i31119) | (29360128 & i311110) | (234881024 & i311110) | (i311110 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i31119 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                        if (e.k()) {
                            e.n();
                        }
                        function18 = function29;
                        function13 = function31;
                        function14 = function28;
                        function19 = function30;
                        function15 = function32;
                        function16 = function25;
                        function20 = function27;
                        z8 = z9;
                        rx8Var2 = rx8Var3;
                        pscVar2 = pscVarG;
                        function17 = function2E;
                        xkbVar2 = xkbVar111;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        function13 = function4;
                        function14 = function5;
                        function15 = function7;
                        function16 = function8;
                        xkbVar2 = xkbVar;
                        pscVar2 = pscVar;
                        rx8Var2 = rx8Var;
                        function17 = function10;
                        function18 = function12;
                        z8 = z6;
                        function19 = function6;
                        function20 = function9;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.usc
                            public final Object invoke(Object obj, Object obj2) {
                                return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 196608;
                j26Var2 = j26Var;
                i10 = i3 & 64;
                if (i10 != 0) {
                    i4 |= 1572864;
                    z6 = z3;
                } else {
                    z6 = z3;
                    if ((i & 1572864) == 0) {
                        if (dVarF.A(z6)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    }
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                    i4 |= 12582912;
                    function12 = function3;
                } else {
                    function12 = function3;
                    if ((i & 12582912) == 0) {
                        if (dVarF.T(function12)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i4 |= i13;
                    }
                }
                i14 = i3 & 256;
                if (i14 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (dVarF.T(function4)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i4 |= i15;
                }
                i16 = i3 & 512;
                if (i16 != 0) {
                    if ((i & 805306368) == 0) {
                        if (dVarF.T(function5)) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                        i4 |= i17;
                    }
                    i18 = i3 & 1024;
                    if (i18 != 0) {
                        i19 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (dVarF.T(function6)) {
                            i20 = 4;
                        } else {
                            i20 = 2;
                        }
                        i19 = i2 | i20;
                    } else {
                        i19 = i2;
                    }
                    i21 = i3 & 2048;
                    if (i21 != 0) {
                        i19 |= 48;
                    } else if ((i2 & 48) != 0) {
                        if (dVarF.T(function7)) {
                            i22 = 32;
                        } else {
                            i22 = 16;
                        }
                        i19 |= i22;
                    }
                    i23 = i19;
                    i24 = i3 & 4096;
                    if (i24 != 0) {
                        i25 = i23 | 384;
                    } else if ((i2 & 384) == 0) {
                        if (dVarF.T(function8)) {
                            i26 = 256;
                        } else {
                            i26 = 128;
                        }
                        i25 = i23 | i26;
                    } else {
                        i25 = i23;
                    }
                    i27 = i3 & 8192;
                    if (i27 != 0) {
                        i29 = i25 | 3072;
                    } else {
                        i28 = i25;
                        if ((i2 & 3072) == 0) {
                            i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                        } else {
                            i29 = i28;
                        }
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i7 = 16384;
                        }
                        i29 |= i7;
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32768) == 0) {
                            i34 = 65536;
                        } else {
                            i34 = 65536;
                        }
                        i29 |= i34;
                    }
                    if ((i2 & 1572864) != 0) {
                        if ((i3 & 65536) == 0) {
                            i33 = 524288;
                        } else {
                            i33 = 524288;
                        }
                        i29 |= i33;
                    }
                    i30 = i3 & 131072;
                    if (i30 != 0) {
                        i29 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (dVarF.T(function10)) {
                            i31 = 8388608;
                        } else {
                            i31 = 4194304;
                        }
                        i29 |= i31;
                    }
                    if ((i3 & 262144) != 0) {
                        i29 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (dVarF.x(this)) {
                            i32 = 67108864;
                        } else {
                            i32 = 33554432;
                        }
                        i29 |= i32;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (dVarF.g(z7, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z6 = false;
                            }
                            if (i12 != 0) {
                                function12 = null;
                            }
                            if (i14 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i16 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i18 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i21 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i24 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i27 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                xkbVarQ = a.q(dVarF, 6);
                                i29 &= -57345;
                            } else {
                                xkbVarQ = xkbVar;
                            }
                            if ((i3 & 32768) != 0) {
                                pscVarG = g(dVarF, (i29 >> 24) & 14);
                                i29 &= -458753;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 65536) != 0) {
                                if (function12 == null) {
                                    rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i29 &= -3670017;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i30 != 0) {
                                function27 = function26;
                                function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            xkbVar3 = xkbVarQ;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z9 = z6;
                            function32 = function24;
                            rx8Var3 = rx8VarJ;
                        } else {
                            if (i10 != 0) {
                                z6 = false;
                            }
                            if (i12 != 0) {
                                function12 = null;
                            }
                            if (i14 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i16 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i18 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i21 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i24 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i27 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                xkbVarQ = a.q(dVarF, 6);
                                i29 &= -57345;
                            } else {
                                xkbVarQ = xkbVar;
                            }
                            if ((i3 & 32768) != 0) {
                                pscVarG = g(dVarF, (i29 >> 24) & 14);
                                i29 &= -458753;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 65536) != 0) {
                                if (function12 == null) {
                                    rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i29 &= -3670017;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i30 != 0) {
                                function27 = function26;
                                function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            xkbVar3 = xkbVarQ;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z9 = z6;
                            function32 = function24;
                            rx8Var3 = rx8VarJ;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                        }
                        if ((i4 & 14) == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        xkb xkbVar112 = xkbVar3;
                        z11 = z10 | ((57344 & i4) == 16384);
                        objR = dVarF.R();
                        if (z11) {
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        } else {
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        }
                        String text19 = ((TransformedText) objR).getText().getText();
                        TextFieldType textFieldType19 = TextFieldType.Filled;
                        v1.Attached attached19 = new v1.Attached(false, null, null, 7, null);
                        if (function29 == null) {
                            dVarF.y(-1353131191);
                            dVarF.u();
                            do1Var = null;
                        } else {
                            dVarF.y(-1353131190);
                            do1 do1VarE19 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                            dVarF.u();
                            do1Var = do1VarE19;
                        }
                        int i311111 = i4 >> 9;
                        int i311112 = i29 << 21;
                        boolean z1110 = z5;
                        do1 do1Var110 = do1Var;
                        dVar2 = dVarF;
                        TextFieldImplKt.l(textFieldType19, text19, function11, attached19, do1Var110, function31, function28, function30, function32, function25, function27, z1110, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i311111) | (3670016 & i311111) | (29360128 & i311112) | (234881024 & i311112) | (i311112 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i311111 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                        if (e.k()) {
                            e.n();
                        }
                        function18 = function29;
                        function13 = function31;
                        function14 = function28;
                        function19 = function30;
                        function15 = function32;
                        function16 = function25;
                        function20 = function27;
                        z8 = z9;
                        rx8Var2 = rx8Var3;
                        pscVar2 = pscVarG;
                        function17 = function2E;
                        xkbVar2 = xkbVar112;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        function13 = function4;
                        function14 = function5;
                        function15 = function7;
                        function16 = function8;
                        xkbVar2 = xkbVar;
                        pscVar2 = pscVar;
                        rx8Var2 = rx8Var;
                        function17 = function10;
                        function18 = function12;
                        z8 = z6;
                        function19 = function6;
                        function20 = function9;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.usc
                            public final Object invoke(Object obj, Object obj2) {
                                return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 805306368;
                i18 = i3 & 1024;
                if (i18 != 0) {
                    i19 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (dVarF.T(function6)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                    i19 = i2 | i20;
                } else {
                    i19 = i2;
                }
                i21 = i3 & 2048;
                if (i21 != 0) {
                    i19 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (dVarF.T(function7)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i19 |= i22;
                }
                i23 = i19;
                i24 = i3 & 4096;
                if (i24 != 0) {
                    i25 = i23 | 384;
                } else if ((i2 & 384) == 0) {
                    if (dVarF.T(function8)) {
                        i26 = 256;
                    } else {
                        i26 = 128;
                    }
                    i25 = i23 | i26;
                } else {
                    i25 = i23;
                }
                i27 = i3 & 8192;
                if (i27 != 0) {
                    i29 = i25 | 3072;
                } else {
                    i28 = i25;
                    if ((i2 & 3072) == 0) {
                        i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                    } else {
                        i29 = i28;
                    }
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i7 = 16384;
                    }
                    i29 |= i7;
                }
                if ((i2 & 196608) != 0) {
                    if ((i3 & 32768) == 0) {
                        i34 = 65536;
                    } else {
                        i34 = 65536;
                    }
                    i29 |= i34;
                }
                if ((i2 & 1572864) != 0) {
                    if ((i3 & 65536) == 0) {
                        i33 = 524288;
                    } else {
                        i33 = 524288;
                    }
                    i29 |= i33;
                }
                i30 = i3 & 131072;
                if (i30 != 0) {
                    i29 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (dVarF.T(function10)) {
                        i31 = 8388608;
                    } else {
                        i31 = 4194304;
                    }
                    i29 |= i31;
                }
                if ((i3 & 262144) != 0) {
                    i29 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (dVarF.x(this)) {
                        i32 = 67108864;
                    } else {
                        i32 = 33554432;
                    }
                    i29 |= i32;
                }
                if ((i4 & 306783379) == 306783378) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (dVarF.g(z7, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z6 = false;
                        }
                        if (i12 != 0) {
                            function12 = null;
                        }
                        if (i14 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i16 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i18 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i21 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i24 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i27 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            xkbVarQ = a.q(dVarF, 6);
                            i29 &= -57345;
                        } else {
                            xkbVarQ = xkbVar;
                        }
                        if ((i3 & 32768) != 0) {
                            pscVarG = g(dVarF, (i29 >> 24) & 14);
                            i29 &= -458753;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 65536) != 0) {
                            if (function12 == null) {
                                rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i29 &= -3670017;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i30 != 0) {
                            function27 = function26;
                            function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        xkbVar3 = xkbVarQ;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z9 = z6;
                        function32 = function24;
                        rx8Var3 = rx8VarJ;
                    } else {
                        if (i10 != 0) {
                            z6 = false;
                        }
                        if (i12 != 0) {
                            function12 = null;
                        }
                        if (i14 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i16 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i18 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i21 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i24 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i27 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            xkbVarQ = a.q(dVarF, 6);
                            i29 &= -57345;
                        } else {
                            xkbVarQ = xkbVar;
                        }
                        if ((i3 & 32768) != 0) {
                            pscVarG = g(dVarF, (i29 >> 24) & 14);
                            i29 &= -458753;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 65536) != 0) {
                            if (function12 == null) {
                                rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i29 &= -3670017;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i30 != 0) {
                            function27 = function26;
                            function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        xkbVar3 = xkbVarQ;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z9 = z6;
                        function32 = function24;
                        rx8Var3 = rx8VarJ;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                    }
                    if ((i4 & 14) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    xkb xkbVar113 = xkbVar3;
                    z11 = z10 | ((57344 & i4) == 16384);
                    objR = dVarF.R();
                    if (z11) {
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    } else {
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    }
                    String text110 = ((TransformedText) objR).getText().getText();
                    TextFieldType textFieldType110 = TextFieldType.Filled;
                    v1.Attached attached110 = new v1.Attached(false, null, null, 7, null);
                    if (function29 == null) {
                        dVarF.y(-1353131191);
                        dVarF.u();
                        do1Var = null;
                    } else {
                        dVarF.y(-1353131190);
                        do1 do1VarE110 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                        dVarF.u();
                        do1Var = do1VarE110;
                    }
                    int i311113 = i4 >> 9;
                    int i311114 = i29 << 21;
                    boolean z1111 = z5;
                    do1 do1Var111 = do1Var;
                    dVar2 = dVarF;
                    TextFieldImplKt.l(textFieldType110, text110, function11, attached110, do1Var111, function31, function28, function30, function32, function25, function27, z1111, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i311113) | (3670016 & i311113) | (29360128 & i311114) | (234881024 & i311114) | (i311114 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i311113 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                    if (e.k()) {
                        e.n();
                    }
                    function18 = function29;
                    function13 = function31;
                    function14 = function28;
                    function19 = function30;
                    function15 = function32;
                    function16 = function25;
                    function20 = function27;
                    z8 = z9;
                    rx8Var2 = rx8Var3;
                    pscVar2 = pscVarG;
                    function17 = function2E;
                    xkbVar2 = xkbVar113;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    function13 = function4;
                    function14 = function5;
                    function15 = function7;
                    function16 = function8;
                    xkbVar2 = xkbVar;
                    pscVar2 = pscVar;
                    rx8Var2 = rx8Var;
                    function17 = function10;
                    function18 = function12;
                    z8 = z6;
                    function19 = function6;
                    function20 = function9;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.usc
                        public final Object invoke(Object obj, Object obj2) {
                            return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 3072;
            z5 = z2;
            i7 = 8192;
            if ((i3 & 16) != 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                if (dVarF.x(nceVar)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i4 |= i8;
            }
            if ((i3 & 32) != 0) {
                if ((196608 & i) == 0) {
                    j26Var2 = j26Var;
                    if (dVarF.x(j26Var2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    i4 |= 1572864;
                    z6 = z3;
                } else {
                    z6 = z3;
                    if ((i & 1572864) == 0) {
                        if (dVarF.A(z6)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    }
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                    i4 |= 12582912;
                    function12 = function3;
                } else {
                    function12 = function3;
                    if ((i & 12582912) == 0) {
                        if (dVarF.T(function12)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i4 |= i13;
                    }
                }
                i14 = i3 & 256;
                if (i14 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (dVarF.T(function4)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i4 |= i15;
                }
                i16 = i3 & 512;
                if (i16 != 0) {
                    if ((i & 805306368) == 0) {
                        if (dVarF.T(function5)) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                        i4 |= i17;
                    }
                    i18 = i3 & 1024;
                    if (i18 != 0) {
                        i19 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (dVarF.T(function6)) {
                            i20 = 4;
                        } else {
                            i20 = 2;
                        }
                        i19 = i2 | i20;
                    } else {
                        i19 = i2;
                    }
                    i21 = i3 & 2048;
                    if (i21 != 0) {
                        i19 |= 48;
                    } else if ((i2 & 48) != 0) {
                        if (dVarF.T(function7)) {
                            i22 = 32;
                        } else {
                            i22 = 16;
                        }
                        i19 |= i22;
                    }
                    i23 = i19;
                    i24 = i3 & 4096;
                    if (i24 != 0) {
                        i25 = i23 | 384;
                    } else if ((i2 & 384) == 0) {
                        if (dVarF.T(function8)) {
                            i26 = 256;
                        } else {
                            i26 = 128;
                        }
                        i25 = i23 | i26;
                    } else {
                        i25 = i23;
                    }
                    i27 = i3 & 8192;
                    if (i27 != 0) {
                        i29 = i25 | 3072;
                    } else {
                        i28 = i25;
                        if ((i2 & 3072) == 0) {
                            i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                        } else {
                            i29 = i28;
                        }
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i7 = 16384;
                        }
                        i29 |= i7;
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32768) == 0) {
                            i34 = 65536;
                        } else {
                            i34 = 65536;
                        }
                        i29 |= i34;
                    }
                    if ((i2 & 1572864) != 0) {
                        if ((i3 & 65536) == 0) {
                            i33 = 524288;
                        } else {
                            i33 = 524288;
                        }
                        i29 |= i33;
                    }
                    i30 = i3 & 131072;
                    if (i30 != 0) {
                        i29 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (dVarF.T(function10)) {
                            i31 = 8388608;
                        } else {
                            i31 = 4194304;
                        }
                        i29 |= i31;
                    }
                    if ((i3 & 262144) != 0) {
                        i29 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (dVarF.x(this)) {
                            i32 = 67108864;
                        } else {
                            i32 = 33554432;
                        }
                        i29 |= i32;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (dVarF.g(z7, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z6 = false;
                            }
                            if (i12 != 0) {
                                function12 = null;
                            }
                            if (i14 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i16 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i18 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i21 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i24 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i27 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                xkbVarQ = a.q(dVarF, 6);
                                i29 &= -57345;
                            } else {
                                xkbVarQ = xkbVar;
                            }
                            if ((i3 & 32768) != 0) {
                                pscVarG = g(dVarF, (i29 >> 24) & 14);
                                i29 &= -458753;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 65536) != 0) {
                                if (function12 == null) {
                                    rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i29 &= -3670017;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i30 != 0) {
                                function27 = function26;
                                function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            xkbVar3 = xkbVarQ;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z9 = z6;
                            function32 = function24;
                            rx8Var3 = rx8VarJ;
                        } else {
                            if (i10 != 0) {
                                z6 = false;
                            }
                            if (i12 != 0) {
                                function12 = null;
                            }
                            if (i14 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i16 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i18 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i21 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i24 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i27 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                xkbVarQ = a.q(dVarF, 6);
                                i29 &= -57345;
                            } else {
                                xkbVarQ = xkbVar;
                            }
                            if ((i3 & 32768) != 0) {
                                pscVarG = g(dVarF, (i29 >> 24) & 14);
                                i29 &= -458753;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 65536) != 0) {
                                if (function12 == null) {
                                    rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i29 &= -3670017;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i30 != 0) {
                                function27 = function26;
                                function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            xkbVar3 = xkbVarQ;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z9 = z6;
                            function32 = function24;
                            rx8Var3 = rx8VarJ;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                        }
                        if ((i4 & 14) == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        xkb xkbVar114 = xkbVar3;
                        z11 = z10 | ((57344 & i4) == 16384);
                        objR = dVarF.R();
                        if (z11) {
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        } else {
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        }
                        String text111 = ((TransformedText) objR).getText().getText();
                        TextFieldType textFieldType111 = TextFieldType.Filled;
                        v1.Attached attached111 = new v1.Attached(false, null, null, 7, null);
                        if (function29 == null) {
                            dVarF.y(-1353131191);
                            dVarF.u();
                            do1Var = null;
                        } else {
                            dVarF.y(-1353131190);
                            do1 do1VarE111 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                            dVarF.u();
                            do1Var = do1VarE111;
                        }
                        int i311115 = i4 >> 9;
                        int i311116 = i29 << 21;
                        boolean z1112 = z5;
                        do1 do1Var112 = do1Var;
                        dVar2 = dVarF;
                        TextFieldImplKt.l(textFieldType111, text111, function11, attached111, do1Var112, function31, function28, function30, function32, function25, function27, z1112, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i311115) | (3670016 & i311115) | (29360128 & i311116) | (234881024 & i311116) | (i311116 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i311115 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                        if (e.k()) {
                            e.n();
                        }
                        function18 = function29;
                        function13 = function31;
                        function14 = function28;
                        function19 = function30;
                        function15 = function32;
                        function16 = function25;
                        function20 = function27;
                        z8 = z9;
                        rx8Var2 = rx8Var3;
                        pscVar2 = pscVarG;
                        function17 = function2E;
                        xkbVar2 = xkbVar114;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        function13 = function4;
                        function14 = function5;
                        function15 = function7;
                        function16 = function8;
                        xkbVar2 = xkbVar;
                        pscVar2 = pscVar;
                        rx8Var2 = rx8Var;
                        function17 = function10;
                        function18 = function12;
                        z8 = z6;
                        function19 = function6;
                        function20 = function9;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.usc
                            public final Object invoke(Object obj, Object obj2) {
                                return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 805306368;
                i18 = i3 & 1024;
                if (i18 != 0) {
                    i19 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (dVarF.T(function6)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                    i19 = i2 | i20;
                } else {
                    i19 = i2;
                }
                i21 = i3 & 2048;
                if (i21 != 0) {
                    i19 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (dVarF.T(function7)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i19 |= i22;
                }
                i23 = i19;
                i24 = i3 & 4096;
                if (i24 != 0) {
                    i25 = i23 | 384;
                } else if ((i2 & 384) == 0) {
                    if (dVarF.T(function8)) {
                        i26 = 256;
                    } else {
                        i26 = 128;
                    }
                    i25 = i23 | i26;
                } else {
                    i25 = i23;
                }
                i27 = i3 & 8192;
                if (i27 != 0) {
                    i29 = i25 | 3072;
                } else {
                    i28 = i25;
                    if ((i2 & 3072) == 0) {
                        i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                    } else {
                        i29 = i28;
                    }
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i7 = 16384;
                    }
                    i29 |= i7;
                }
                if ((i2 & 196608) != 0) {
                    if ((i3 & 32768) == 0) {
                        i34 = 65536;
                    } else {
                        i34 = 65536;
                    }
                    i29 |= i34;
                }
                if ((i2 & 1572864) != 0) {
                    if ((i3 & 65536) == 0) {
                        i33 = 524288;
                    } else {
                        i33 = 524288;
                    }
                    i29 |= i33;
                }
                i30 = i3 & 131072;
                if (i30 != 0) {
                    i29 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (dVarF.T(function10)) {
                        i31 = 8388608;
                    } else {
                        i31 = 4194304;
                    }
                    i29 |= i31;
                }
                if ((i3 & 262144) != 0) {
                    i29 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (dVarF.x(this)) {
                        i32 = 67108864;
                    } else {
                        i32 = 33554432;
                    }
                    i29 |= i32;
                }
                if ((i4 & 306783379) == 306783378) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (dVarF.g(z7, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z6 = false;
                        }
                        if (i12 != 0) {
                            function12 = null;
                        }
                        if (i14 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i16 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i18 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i21 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i24 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i27 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            xkbVarQ = a.q(dVarF, 6);
                            i29 &= -57345;
                        } else {
                            xkbVarQ = xkbVar;
                        }
                        if ((i3 & 32768) != 0) {
                            pscVarG = g(dVarF, (i29 >> 24) & 14);
                            i29 &= -458753;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 65536) != 0) {
                            if (function12 == null) {
                                rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i29 &= -3670017;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i30 != 0) {
                            function27 = function26;
                            function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        xkbVar3 = xkbVarQ;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z9 = z6;
                        function32 = function24;
                        rx8Var3 = rx8VarJ;
                    } else {
                        if (i10 != 0) {
                            z6 = false;
                        }
                        if (i12 != 0) {
                            function12 = null;
                        }
                        if (i14 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i16 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i18 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i21 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i24 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i27 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            xkbVarQ = a.q(dVarF, 6);
                            i29 &= -57345;
                        } else {
                            xkbVarQ = xkbVar;
                        }
                        if ((i3 & 32768) != 0) {
                            pscVarG = g(dVarF, (i29 >> 24) & 14);
                            i29 &= -458753;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 65536) != 0) {
                            if (function12 == null) {
                                rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i29 &= -3670017;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i30 != 0) {
                            function27 = function26;
                            function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        xkbVar3 = xkbVarQ;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z9 = z6;
                        function32 = function24;
                        rx8Var3 = rx8VarJ;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                    }
                    if ((i4 & 14) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    xkb xkbVar115 = xkbVar3;
                    z11 = z10 | ((57344 & i4) == 16384);
                    objR = dVarF.R();
                    if (z11) {
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    } else {
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    }
                    String text112 = ((TransformedText) objR).getText().getText();
                    TextFieldType textFieldType112 = TextFieldType.Filled;
                    v1.Attached attached112 = new v1.Attached(false, null, null, 7, null);
                    if (function29 == null) {
                        dVarF.y(-1353131191);
                        dVarF.u();
                        do1Var = null;
                    } else {
                        dVarF.y(-1353131190);
                        do1 do1VarE112 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                        dVarF.u();
                        do1Var = do1VarE112;
                    }
                    int i311117 = i4 >> 9;
                    int i311118 = i29 << 21;
                    boolean z1113 = z5;
                    do1 do1Var113 = do1Var;
                    dVar2 = dVarF;
                    TextFieldImplKt.l(textFieldType112, text112, function11, attached112, do1Var113, function31, function28, function30, function32, function25, function27, z1113, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i311117) | (3670016 & i311117) | (29360128 & i311118) | (234881024 & i311118) | (i311118 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i311117 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                    if (e.k()) {
                        e.n();
                    }
                    function18 = function29;
                    function13 = function31;
                    function14 = function28;
                    function19 = function30;
                    function15 = function32;
                    function16 = function25;
                    function20 = function27;
                    z8 = z9;
                    rx8Var2 = rx8Var3;
                    pscVar2 = pscVarG;
                    function17 = function2E;
                    xkbVar2 = xkbVar115;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    function13 = function4;
                    function14 = function5;
                    function15 = function7;
                    function16 = function8;
                    xkbVar2 = xkbVar;
                    pscVar2 = pscVar;
                    rx8Var2 = rx8Var;
                    function17 = function10;
                    function18 = function12;
                    z8 = z6;
                    function19 = function6;
                    function20 = function9;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.usc
                        public final Object invoke(Object obj, Object obj2) {
                            return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 196608;
            j26Var2 = j26Var;
            i10 = i3 & 64;
            if (i10 != 0) {
                i4 |= 1572864;
                z6 = z3;
            } else {
                z6 = z3;
                if ((i & 1572864) == 0) {
                    if (dVarF.A(z6)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
            }
            i12 = i3 & 128;
            if (i12 != 0) {
                i4 |= 12582912;
                function12 = function3;
            } else {
                function12 = function3;
                if ((i & 12582912) == 0) {
                    if (dVarF.T(function12)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i4 |= i13;
                }
            }
            i14 = i3 & 256;
            if (i14 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (dVarF.T(function4)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i4 |= i15;
            }
            i16 = i3 & 512;
            if (i16 != 0) {
                if ((i & 805306368) == 0) {
                    if (dVarF.T(function5)) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                    i4 |= i17;
                }
                i18 = i3 & 1024;
                if (i18 != 0) {
                    i19 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (dVarF.T(function6)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                    i19 = i2 | i20;
                } else {
                    i19 = i2;
                }
                i21 = i3 & 2048;
                if (i21 != 0) {
                    i19 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (dVarF.T(function7)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i19 |= i22;
                }
                i23 = i19;
                i24 = i3 & 4096;
                if (i24 != 0) {
                    i25 = i23 | 384;
                } else if ((i2 & 384) == 0) {
                    if (dVarF.T(function8)) {
                        i26 = 256;
                    } else {
                        i26 = 128;
                    }
                    i25 = i23 | i26;
                } else {
                    i25 = i23;
                }
                i27 = i3 & 8192;
                if (i27 != 0) {
                    i29 = i25 | 3072;
                } else {
                    i28 = i25;
                    if ((i2 & 3072) == 0) {
                        i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                    } else {
                        i29 = i28;
                    }
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i7 = 16384;
                    }
                    i29 |= i7;
                }
                if ((i2 & 196608) != 0) {
                    if ((i3 & 32768) == 0) {
                        i34 = 65536;
                    } else {
                        i34 = 65536;
                    }
                    i29 |= i34;
                }
                if ((i2 & 1572864) != 0) {
                    if ((i3 & 65536) == 0) {
                        i33 = 524288;
                    } else {
                        i33 = 524288;
                    }
                    i29 |= i33;
                }
                i30 = i3 & 131072;
                if (i30 != 0) {
                    i29 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (dVarF.T(function10)) {
                        i31 = 8388608;
                    } else {
                        i31 = 4194304;
                    }
                    i29 |= i31;
                }
                if ((i3 & 262144) != 0) {
                    i29 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (dVarF.x(this)) {
                        i32 = 67108864;
                    } else {
                        i32 = 33554432;
                    }
                    i29 |= i32;
                }
                if ((i4 & 306783379) == 306783378) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (dVarF.g(z7, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z6 = false;
                        }
                        if (i12 != 0) {
                            function12 = null;
                        }
                        if (i14 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i16 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i18 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i21 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i24 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i27 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            xkbVarQ = a.q(dVarF, 6);
                            i29 &= -57345;
                        } else {
                            xkbVarQ = xkbVar;
                        }
                        if ((i3 & 32768) != 0) {
                            pscVarG = g(dVarF, (i29 >> 24) & 14);
                            i29 &= -458753;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 65536) != 0) {
                            if (function12 == null) {
                                rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i29 &= -3670017;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i30 != 0) {
                            function27 = function26;
                            function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        xkbVar3 = xkbVarQ;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z9 = z6;
                        function32 = function24;
                        rx8Var3 = rx8VarJ;
                    } else {
                        if (i10 != 0) {
                            z6 = false;
                        }
                        if (i12 != 0) {
                            function12 = null;
                        }
                        if (i14 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i16 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i18 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i21 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i24 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i27 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            xkbVarQ = a.q(dVarF, 6);
                            i29 &= -57345;
                        } else {
                            xkbVarQ = xkbVar;
                        }
                        if ((i3 & 32768) != 0) {
                            pscVarG = g(dVarF, (i29 >> 24) & 14);
                            i29 &= -458753;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 65536) != 0) {
                            if (function12 == null) {
                                rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i29 &= -3670017;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i30 != 0) {
                            function27 = function26;
                            function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        xkbVar3 = xkbVarQ;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z9 = z6;
                        function32 = function24;
                        rx8Var3 = rx8VarJ;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                    }
                    if ((i4 & 14) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    xkb xkbVar116 = xkbVar3;
                    z11 = z10 | ((57344 & i4) == 16384);
                    objR = dVarF.R();
                    if (z11) {
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    } else {
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    }
                    String text113 = ((TransformedText) objR).getText().getText();
                    TextFieldType textFieldType113 = TextFieldType.Filled;
                    v1.Attached attached113 = new v1.Attached(false, null, null, 7, null);
                    if (function29 == null) {
                        dVarF.y(-1353131191);
                        dVarF.u();
                        do1Var = null;
                    } else {
                        dVarF.y(-1353131190);
                        do1 do1VarE113 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                        dVarF.u();
                        do1Var = do1VarE113;
                    }
                    int i311119 = i4 >> 9;
                    int i3111110 = i29 << 21;
                    boolean z1114 = z5;
                    do1 do1Var114 = do1Var;
                    dVar2 = dVarF;
                    TextFieldImplKt.l(textFieldType113, text113, function11, attached113, do1Var114, function31, function28, function30, function32, function25, function27, z1114, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i311119) | (3670016 & i311119) | (29360128 & i3111110) | (234881024 & i3111110) | (i3111110 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i311119 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                    if (e.k()) {
                        e.n();
                    }
                    function18 = function29;
                    function13 = function31;
                    function14 = function28;
                    function19 = function30;
                    function15 = function32;
                    function16 = function25;
                    function20 = function27;
                    z8 = z9;
                    rx8Var2 = rx8Var3;
                    pscVar2 = pscVarG;
                    function17 = function2E;
                    xkbVar2 = xkbVar116;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    function13 = function4;
                    function14 = function5;
                    function15 = function7;
                    function16 = function8;
                    xkbVar2 = xkbVar;
                    pscVar2 = pscVar;
                    rx8Var2 = rx8Var;
                    function17 = function10;
                    function18 = function12;
                    z8 = z6;
                    function19 = function6;
                    function20 = function9;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.usc
                        public final Object invoke(Object obj, Object obj2) {
                            return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 805306368;
            i18 = i3 & 1024;
            if (i18 != 0) {
                i19 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (dVarF.T(function6)) {
                    i20 = 4;
                } else {
                    i20 = 2;
                }
                i19 = i2 | i20;
            } else {
                i19 = i2;
            }
            i21 = i3 & 2048;
            if (i21 != 0) {
                i19 |= 48;
            } else if ((i2 & 48) != 0) {
                if (dVarF.T(function7)) {
                    i22 = 32;
                } else {
                    i22 = 16;
                }
                i19 |= i22;
            }
            i23 = i19;
            i24 = i3 & 4096;
            if (i24 != 0) {
                i25 = i23 | 384;
            } else if ((i2 & 384) == 0) {
                if (dVarF.T(function8)) {
                    i26 = 256;
                } else {
                    i26 = 128;
                }
                i25 = i23 | i26;
            } else {
                i25 = i23;
            }
            i27 = i3 & 8192;
            if (i27 != 0) {
                i29 = i25 | 3072;
            } else {
                i28 = i25;
                if ((i2 & 3072) == 0) {
                    i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                } else {
                    i29 = i28;
                }
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16384) == 0) {
                    i7 = 16384;
                }
                i29 |= i7;
            }
            if ((i2 & 196608) != 0) {
                if ((i3 & 32768) == 0) {
                    i34 = 65536;
                } else {
                    i34 = 65536;
                }
                i29 |= i34;
            }
            if ((i2 & 1572864) != 0) {
                if ((i3 & 65536) == 0) {
                    i33 = 524288;
                } else {
                    i33 = 524288;
                }
                i29 |= i33;
            }
            i30 = i3 & 131072;
            if (i30 != 0) {
                i29 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (dVarF.T(function10)) {
                    i31 = 8388608;
                } else {
                    i31 = 4194304;
                }
                i29 |= i31;
            }
            if ((i3 & 262144) != 0) {
                i29 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (dVarF.x(this)) {
                    i32 = 67108864;
                } else {
                    i32 = 33554432;
                }
                i29 |= i32;
            }
            if ((i4 & 306783379) == 306783378) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (dVarF.g(z7, i4 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        z6 = false;
                    }
                    if (i12 != 0) {
                        function12 = null;
                    }
                    if (i14 != 0) {
                        function21 = null;
                    } else {
                        function21 = function4;
                    }
                    if (i16 != 0) {
                        function22 = null;
                    } else {
                        function22 = function5;
                    }
                    if (i18 != 0) {
                        function23 = null;
                    } else {
                        function23 = function6;
                    }
                    if (i21 != 0) {
                        function24 = null;
                    } else {
                        function24 = function7;
                    }
                    if (i24 != 0) {
                        function25 = null;
                    } else {
                        function25 = function8;
                    }
                    if (i27 != 0) {
                        function26 = null;
                    } else {
                        function26 = function9;
                    }
                    if ((i3 & 16384) != 0) {
                        xkbVarQ = a.q(dVarF, 6);
                        i29 &= -57345;
                    } else {
                        xkbVarQ = xkbVar;
                    }
                    if ((i3 & 32768) != 0) {
                        pscVarG = g(dVarF, (i29 >> 24) & 14);
                        i29 &= -458753;
                    } else {
                        pscVarG = pscVar;
                    }
                    if ((i3 & 65536) != 0) {
                        if (function12 == null) {
                            rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i29 &= -3670017;
                    } else {
                        rx8VarJ = rx8Var;
                    }
                    if (i30 != 0) {
                        function27 = function26;
                        function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                    } else {
                        function27 = function26;
                        function2E = function10;
                    }
                    xkbVar3 = xkbVarQ;
                    function28 = function22;
                    function29 = function12;
                    function30 = function23;
                    function31 = function21;
                    z9 = z6;
                    function32 = function24;
                    rx8Var3 = rx8VarJ;
                } else {
                    if (i10 != 0) {
                        z6 = false;
                    }
                    if (i12 != 0) {
                        function12 = null;
                    }
                    if (i14 != 0) {
                        function21 = null;
                    } else {
                        function21 = function4;
                    }
                    if (i16 != 0) {
                        function22 = null;
                    } else {
                        function22 = function5;
                    }
                    if (i18 != 0) {
                        function23 = null;
                    } else {
                        function23 = function6;
                    }
                    if (i21 != 0) {
                        function24 = null;
                    } else {
                        function24 = function7;
                    }
                    if (i24 != 0) {
                        function25 = null;
                    } else {
                        function25 = function8;
                    }
                    if (i27 != 0) {
                        function26 = null;
                    } else {
                        function26 = function9;
                    }
                    if ((i3 & 16384) != 0) {
                        xkbVarQ = a.q(dVarF, 6);
                        i29 &= -57345;
                    } else {
                        xkbVarQ = xkbVar;
                    }
                    if ((i3 & 32768) != 0) {
                        pscVarG = g(dVarF, (i29 >> 24) & 14);
                        i29 &= -458753;
                    } else {
                        pscVarG = pscVar;
                    }
                    if ((i3 & 65536) != 0) {
                        if (function12 == null) {
                            rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i29 &= -3670017;
                    } else {
                        rx8VarJ = rx8Var;
                    }
                    if (i30 != 0) {
                        function27 = function26;
                        function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                    } else {
                        function27 = function26;
                        function2E = function10;
                    }
                    xkbVar3 = xkbVarQ;
                    function28 = function22;
                    function29 = function12;
                    function30 = function23;
                    function31 = function21;
                    z9 = z6;
                    function32 = function24;
                    rx8Var3 = rx8VarJ;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                }
                if ((i4 & 14) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xkb xkbVar117 = xkbVar3;
                z11 = z10 | ((57344 & i4) == 16384);
                objR = dVarF.R();
                if (z11) {
                    objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                    dVarF.L(objR);
                } else {
                    objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                    dVarF.L(objR);
                }
                String text114 = ((TransformedText) objR).getText().getText();
                TextFieldType textFieldType114 = TextFieldType.Filled;
                v1.Attached attached114 = new v1.Attached(false, null, null, 7, null);
                if (function29 == null) {
                    dVarF.y(-1353131191);
                    dVarF.u();
                    do1Var = null;
                } else {
                    dVarF.y(-1353131190);
                    do1 do1VarE114 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                    dVarF.u();
                    do1Var = do1VarE114;
                }
                int i3111111 = i4 >> 9;
                int i3111112 = i29 << 21;
                boolean z1115 = z5;
                do1 do1Var115 = do1Var;
                dVar2 = dVarF;
                TextFieldImplKt.l(textFieldType114, text114, function11, attached114, do1Var115, function31, function28, function30, function32, function25, function27, z1115, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i3111111) | (3670016 & i3111111) | (29360128 & i3111112) | (234881024 & i3111112) | (i3111112 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i3111111 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                if (e.k()) {
                    e.n();
                }
                function18 = function29;
                function13 = function31;
                function14 = function28;
                function19 = function30;
                function15 = function32;
                function16 = function25;
                function20 = function27;
                z8 = z9;
                rx8Var2 = rx8Var3;
                pscVar2 = pscVarG;
                function17 = function2E;
                xkbVar2 = xkbVar117;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                function13 = function4;
                function14 = function5;
                function15 = function7;
                function16 = function8;
                xkbVar2 = xkbVar;
                pscVar2 = pscVar;
                rx8Var2 = rx8Var;
                function17 = function10;
                function18 = function12;
                z8 = z6;
                function19 = function6;
                function20 = function9;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.usc
                    public final Object invoke(Object obj, Object obj2) {
                        return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 384;
        z4 = z;
        if ((i3 & 8) != 0) {
            if ((i & 3072) == 0) {
                z5 = z2;
                if (dVarF.A(z5)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            i7 = 8192;
            if ((i3 & 16) != 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                if (dVarF.x(nceVar)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i4 |= i8;
            }
            if ((i3 & 32) != 0) {
                if ((196608 & i) == 0) {
                    j26Var2 = j26Var;
                    if (dVarF.x(j26Var2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    i4 |= 1572864;
                    z6 = z3;
                } else {
                    z6 = z3;
                    if ((i & 1572864) == 0) {
                        if (dVarF.A(z6)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    }
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                    i4 |= 12582912;
                    function12 = function3;
                } else {
                    function12 = function3;
                    if ((i & 12582912) == 0) {
                        if (dVarF.T(function12)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i4 |= i13;
                    }
                }
                i14 = i3 & 256;
                if (i14 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (dVarF.T(function4)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i4 |= i15;
                }
                i16 = i3 & 512;
                if (i16 != 0) {
                    if ((i & 805306368) == 0) {
                        if (dVarF.T(function5)) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                        i4 |= i17;
                    }
                    i18 = i3 & 1024;
                    if (i18 != 0) {
                        i19 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (dVarF.T(function6)) {
                            i20 = 4;
                        } else {
                            i20 = 2;
                        }
                        i19 = i2 | i20;
                    } else {
                        i19 = i2;
                    }
                    i21 = i3 & 2048;
                    if (i21 != 0) {
                        i19 |= 48;
                    } else if ((i2 & 48) != 0) {
                        if (dVarF.T(function7)) {
                            i22 = 32;
                        } else {
                            i22 = 16;
                        }
                        i19 |= i22;
                    }
                    i23 = i19;
                    i24 = i3 & 4096;
                    if (i24 != 0) {
                        i25 = i23 | 384;
                    } else if ((i2 & 384) == 0) {
                        if (dVarF.T(function8)) {
                            i26 = 256;
                        } else {
                            i26 = 128;
                        }
                        i25 = i23 | i26;
                    } else {
                        i25 = i23;
                    }
                    i27 = i3 & 8192;
                    if (i27 != 0) {
                        i29 = i25 | 3072;
                    } else {
                        i28 = i25;
                        if ((i2 & 3072) == 0) {
                            i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                        } else {
                            i29 = i28;
                        }
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i7 = 16384;
                        }
                        i29 |= i7;
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32768) == 0) {
                            i34 = 65536;
                        } else {
                            i34 = 65536;
                        }
                        i29 |= i34;
                    }
                    if ((i2 & 1572864) != 0) {
                        if ((i3 & 65536) == 0) {
                            i33 = 524288;
                        } else {
                            i33 = 524288;
                        }
                        i29 |= i33;
                    }
                    i30 = i3 & 131072;
                    if (i30 != 0) {
                        i29 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (dVarF.T(function10)) {
                            i31 = 8388608;
                        } else {
                            i31 = 4194304;
                        }
                        i29 |= i31;
                    }
                    if ((i3 & 262144) != 0) {
                        i29 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (dVarF.x(this)) {
                            i32 = 67108864;
                        } else {
                            i32 = 33554432;
                        }
                        i29 |= i32;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (dVarF.g(z7, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z6 = false;
                            }
                            if (i12 != 0) {
                                function12 = null;
                            }
                            if (i14 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i16 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i18 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i21 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i24 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i27 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                xkbVarQ = a.q(dVarF, 6);
                                i29 &= -57345;
                            } else {
                                xkbVarQ = xkbVar;
                            }
                            if ((i3 & 32768) != 0) {
                                pscVarG = g(dVarF, (i29 >> 24) & 14);
                                i29 &= -458753;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 65536) != 0) {
                                if (function12 == null) {
                                    rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i29 &= -3670017;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i30 != 0) {
                                function27 = function26;
                                function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            xkbVar3 = xkbVarQ;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z9 = z6;
                            function32 = function24;
                            rx8Var3 = rx8VarJ;
                        } else {
                            if (i10 != 0) {
                                z6 = false;
                            }
                            if (i12 != 0) {
                                function12 = null;
                            }
                            if (i14 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i16 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i18 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i21 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i24 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i27 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                xkbVarQ = a.q(dVarF, 6);
                                i29 &= -57345;
                            } else {
                                xkbVarQ = xkbVar;
                            }
                            if ((i3 & 32768) != 0) {
                                pscVarG = g(dVarF, (i29 >> 24) & 14);
                                i29 &= -458753;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 65536) != 0) {
                                if (function12 == null) {
                                    rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i29 &= -3670017;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i30 != 0) {
                                function27 = function26;
                                function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            xkbVar3 = xkbVarQ;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z9 = z6;
                            function32 = function24;
                            rx8Var3 = rx8VarJ;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                        }
                        if ((i4 & 14) == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        xkb xkbVar118 = xkbVar3;
                        z11 = z10 | ((57344 & i4) == 16384);
                        objR = dVarF.R();
                        if (z11) {
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        } else {
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        }
                        String text115 = ((TransformedText) objR).getText().getText();
                        TextFieldType textFieldType115 = TextFieldType.Filled;
                        v1.Attached attached115 = new v1.Attached(false, null, null, 7, null);
                        if (function29 == null) {
                            dVarF.y(-1353131191);
                            dVarF.u();
                            do1Var = null;
                        } else {
                            dVarF.y(-1353131190);
                            do1 do1VarE115 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                            dVarF.u();
                            do1Var = do1VarE115;
                        }
                        int i3111113 = i4 >> 9;
                        int i3111114 = i29 << 21;
                        boolean z1116 = z5;
                        do1 do1Var116 = do1Var;
                        dVar2 = dVarF;
                        TextFieldImplKt.l(textFieldType115, text115, function11, attached115, do1Var116, function31, function28, function30, function32, function25, function27, z1116, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i3111113) | (3670016 & i3111113) | (29360128 & i3111114) | (234881024 & i3111114) | (i3111114 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i3111113 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                        if (e.k()) {
                            e.n();
                        }
                        function18 = function29;
                        function13 = function31;
                        function14 = function28;
                        function19 = function30;
                        function15 = function32;
                        function16 = function25;
                        function20 = function27;
                        z8 = z9;
                        rx8Var2 = rx8Var3;
                        pscVar2 = pscVarG;
                        function17 = function2E;
                        xkbVar2 = xkbVar118;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        function13 = function4;
                        function14 = function5;
                        function15 = function7;
                        function16 = function8;
                        xkbVar2 = xkbVar;
                        pscVar2 = pscVar;
                        rx8Var2 = rx8Var;
                        function17 = function10;
                        function18 = function12;
                        z8 = z6;
                        function19 = function6;
                        function20 = function9;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.usc
                            public final Object invoke(Object obj, Object obj2) {
                                return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 805306368;
                i18 = i3 & 1024;
                if (i18 != 0) {
                    i19 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (dVarF.T(function6)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                    i19 = i2 | i20;
                } else {
                    i19 = i2;
                }
                i21 = i3 & 2048;
                if (i21 != 0) {
                    i19 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (dVarF.T(function7)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i19 |= i22;
                }
                i23 = i19;
                i24 = i3 & 4096;
                if (i24 != 0) {
                    i25 = i23 | 384;
                } else if ((i2 & 384) == 0) {
                    if (dVarF.T(function8)) {
                        i26 = 256;
                    } else {
                        i26 = 128;
                    }
                    i25 = i23 | i26;
                } else {
                    i25 = i23;
                }
                i27 = i3 & 8192;
                if (i27 != 0) {
                    i29 = i25 | 3072;
                } else {
                    i28 = i25;
                    if ((i2 & 3072) == 0) {
                        i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                    } else {
                        i29 = i28;
                    }
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i7 = 16384;
                    }
                    i29 |= i7;
                }
                if ((i2 & 196608) != 0) {
                    if ((i3 & 32768) == 0) {
                        i34 = 65536;
                    } else {
                        i34 = 65536;
                    }
                    i29 |= i34;
                }
                if ((i2 & 1572864) != 0) {
                    if ((i3 & 65536) == 0) {
                        i33 = 524288;
                    } else {
                        i33 = 524288;
                    }
                    i29 |= i33;
                }
                i30 = i3 & 131072;
                if (i30 != 0) {
                    i29 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (dVarF.T(function10)) {
                        i31 = 8388608;
                    } else {
                        i31 = 4194304;
                    }
                    i29 |= i31;
                }
                if ((i3 & 262144) != 0) {
                    i29 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (dVarF.x(this)) {
                        i32 = 67108864;
                    } else {
                        i32 = 33554432;
                    }
                    i29 |= i32;
                }
                if ((i4 & 306783379) == 306783378) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (dVarF.g(z7, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z6 = false;
                        }
                        if (i12 != 0) {
                            function12 = null;
                        }
                        if (i14 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i16 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i18 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i21 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i24 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i27 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            xkbVarQ = a.q(dVarF, 6);
                            i29 &= -57345;
                        } else {
                            xkbVarQ = xkbVar;
                        }
                        if ((i3 & 32768) != 0) {
                            pscVarG = g(dVarF, (i29 >> 24) & 14);
                            i29 &= -458753;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 65536) != 0) {
                            if (function12 == null) {
                                rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i29 &= -3670017;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i30 != 0) {
                            function27 = function26;
                            function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        xkbVar3 = xkbVarQ;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z9 = z6;
                        function32 = function24;
                        rx8Var3 = rx8VarJ;
                    } else {
                        if (i10 != 0) {
                            z6 = false;
                        }
                        if (i12 != 0) {
                            function12 = null;
                        }
                        if (i14 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i16 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i18 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i21 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i24 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i27 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            xkbVarQ = a.q(dVarF, 6);
                            i29 &= -57345;
                        } else {
                            xkbVarQ = xkbVar;
                        }
                        if ((i3 & 32768) != 0) {
                            pscVarG = g(dVarF, (i29 >> 24) & 14);
                            i29 &= -458753;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 65536) != 0) {
                            if (function12 == null) {
                                rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i29 &= -3670017;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i30 != 0) {
                            function27 = function26;
                            function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        xkbVar3 = xkbVarQ;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z9 = z6;
                        function32 = function24;
                        rx8Var3 = rx8VarJ;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                    }
                    if ((i4 & 14) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    xkb xkbVar119 = xkbVar3;
                    z11 = z10 | ((57344 & i4) == 16384);
                    objR = dVarF.R();
                    if (z11) {
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    } else {
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    }
                    String text116 = ((TransformedText) objR).getText().getText();
                    TextFieldType textFieldType116 = TextFieldType.Filled;
                    v1.Attached attached116 = new v1.Attached(false, null, null, 7, null);
                    if (function29 == null) {
                        dVarF.y(-1353131191);
                        dVarF.u();
                        do1Var = null;
                    } else {
                        dVarF.y(-1353131190);
                        do1 do1VarE116 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                        dVarF.u();
                        do1Var = do1VarE116;
                    }
                    int i3111115 = i4 >> 9;
                    int i3111116 = i29 << 21;
                    boolean z1117 = z5;
                    do1 do1Var117 = do1Var;
                    dVar2 = dVarF;
                    TextFieldImplKt.l(textFieldType116, text116, function11, attached116, do1Var117, function31, function28, function30, function32, function25, function27, z1117, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i3111115) | (3670016 & i3111115) | (29360128 & i3111116) | (234881024 & i3111116) | (i3111116 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i3111115 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                    if (e.k()) {
                        e.n();
                    }
                    function18 = function29;
                    function13 = function31;
                    function14 = function28;
                    function19 = function30;
                    function15 = function32;
                    function16 = function25;
                    function20 = function27;
                    z8 = z9;
                    rx8Var2 = rx8Var3;
                    pscVar2 = pscVarG;
                    function17 = function2E;
                    xkbVar2 = xkbVar119;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    function13 = function4;
                    function14 = function5;
                    function15 = function7;
                    function16 = function8;
                    xkbVar2 = xkbVar;
                    pscVar2 = pscVar;
                    rx8Var2 = rx8Var;
                    function17 = function10;
                    function18 = function12;
                    z8 = z6;
                    function19 = function6;
                    function20 = function9;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.usc
                        public final Object invoke(Object obj, Object obj2) {
                            return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 196608;
            j26Var2 = j26Var;
            i10 = i3 & 64;
            if (i10 != 0) {
                i4 |= 1572864;
                z6 = z3;
            } else {
                z6 = z3;
                if ((i & 1572864) == 0) {
                    if (dVarF.A(z6)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
            }
            i12 = i3 & 128;
            if (i12 != 0) {
                i4 |= 12582912;
                function12 = function3;
            } else {
                function12 = function3;
                if ((i & 12582912) == 0) {
                    if (dVarF.T(function12)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i4 |= i13;
                }
            }
            i14 = i3 & 256;
            if (i14 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (dVarF.T(function4)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i4 |= i15;
            }
            i16 = i3 & 512;
            if (i16 != 0) {
                if ((i & 805306368) == 0) {
                    if (dVarF.T(function5)) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                    i4 |= i17;
                }
                i18 = i3 & 1024;
                if (i18 != 0) {
                    i19 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (dVarF.T(function6)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                    i19 = i2 | i20;
                } else {
                    i19 = i2;
                }
                i21 = i3 & 2048;
                if (i21 != 0) {
                    i19 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (dVarF.T(function7)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i19 |= i22;
                }
                i23 = i19;
                i24 = i3 & 4096;
                if (i24 != 0) {
                    i25 = i23 | 384;
                } else if ((i2 & 384) == 0) {
                    if (dVarF.T(function8)) {
                        i26 = 256;
                    } else {
                        i26 = 128;
                    }
                    i25 = i23 | i26;
                } else {
                    i25 = i23;
                }
                i27 = i3 & 8192;
                if (i27 != 0) {
                    i29 = i25 | 3072;
                } else {
                    i28 = i25;
                    if ((i2 & 3072) == 0) {
                        i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                    } else {
                        i29 = i28;
                    }
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i7 = 16384;
                    }
                    i29 |= i7;
                }
                if ((i2 & 196608) != 0) {
                    if ((i3 & 32768) == 0) {
                        i34 = 65536;
                    } else {
                        i34 = 65536;
                    }
                    i29 |= i34;
                }
                if ((i2 & 1572864) != 0) {
                    if ((i3 & 65536) == 0) {
                        i33 = 524288;
                    } else {
                        i33 = 524288;
                    }
                    i29 |= i33;
                }
                i30 = i3 & 131072;
                if (i30 != 0) {
                    i29 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (dVarF.T(function10)) {
                        i31 = 8388608;
                    } else {
                        i31 = 4194304;
                    }
                    i29 |= i31;
                }
                if ((i3 & 262144) != 0) {
                    i29 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (dVarF.x(this)) {
                        i32 = 67108864;
                    } else {
                        i32 = 33554432;
                    }
                    i29 |= i32;
                }
                if ((i4 & 306783379) == 306783378) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (dVarF.g(z7, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z6 = false;
                        }
                        if (i12 != 0) {
                            function12 = null;
                        }
                        if (i14 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i16 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i18 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i21 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i24 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i27 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            xkbVarQ = a.q(dVarF, 6);
                            i29 &= -57345;
                        } else {
                            xkbVarQ = xkbVar;
                        }
                        if ((i3 & 32768) != 0) {
                            pscVarG = g(dVarF, (i29 >> 24) & 14);
                            i29 &= -458753;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 65536) != 0) {
                            if (function12 == null) {
                                rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i29 &= -3670017;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i30 != 0) {
                            function27 = function26;
                            function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        xkbVar3 = xkbVarQ;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z9 = z6;
                        function32 = function24;
                        rx8Var3 = rx8VarJ;
                    } else {
                        if (i10 != 0) {
                            z6 = false;
                        }
                        if (i12 != 0) {
                            function12 = null;
                        }
                        if (i14 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i16 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i18 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i21 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i24 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i27 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            xkbVarQ = a.q(dVarF, 6);
                            i29 &= -57345;
                        } else {
                            xkbVarQ = xkbVar;
                        }
                        if ((i3 & 32768) != 0) {
                            pscVarG = g(dVarF, (i29 >> 24) & 14);
                            i29 &= -458753;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 65536) != 0) {
                            if (function12 == null) {
                                rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i29 &= -3670017;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i30 != 0) {
                            function27 = function26;
                            function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        xkbVar3 = xkbVarQ;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z9 = z6;
                        function32 = function24;
                        rx8Var3 = rx8VarJ;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                    }
                    if ((i4 & 14) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    xkb xkbVar1110 = xkbVar3;
                    z11 = z10 | ((57344 & i4) == 16384);
                    objR = dVarF.R();
                    if (z11) {
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    } else {
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    }
                    String text117 = ((TransformedText) objR).getText().getText();
                    TextFieldType textFieldType117 = TextFieldType.Filled;
                    v1.Attached attached117 = new v1.Attached(false, null, null, 7, null);
                    if (function29 == null) {
                        dVarF.y(-1353131191);
                        dVarF.u();
                        do1Var = null;
                    } else {
                        dVarF.y(-1353131190);
                        do1 do1VarE117 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                        dVarF.u();
                        do1Var = do1VarE117;
                    }
                    int i3111117 = i4 >> 9;
                    int i3111118 = i29 << 21;
                    boolean z1118 = z5;
                    do1 do1Var118 = do1Var;
                    dVar2 = dVarF;
                    TextFieldImplKt.l(textFieldType117, text117, function11, attached117, do1Var118, function31, function28, function30, function32, function25, function27, z1118, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i3111117) | (3670016 & i3111117) | (29360128 & i3111118) | (234881024 & i3111118) | (i3111118 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i3111117 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                    if (e.k()) {
                        e.n();
                    }
                    function18 = function29;
                    function13 = function31;
                    function14 = function28;
                    function19 = function30;
                    function15 = function32;
                    function16 = function25;
                    function20 = function27;
                    z8 = z9;
                    rx8Var2 = rx8Var3;
                    pscVar2 = pscVarG;
                    function17 = function2E;
                    xkbVar2 = xkbVar1110;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    function13 = function4;
                    function14 = function5;
                    function15 = function7;
                    function16 = function8;
                    xkbVar2 = xkbVar;
                    pscVar2 = pscVar;
                    rx8Var2 = rx8Var;
                    function17 = function10;
                    function18 = function12;
                    z8 = z6;
                    function19 = function6;
                    function20 = function9;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.usc
                        public final Object invoke(Object obj, Object obj2) {
                            return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 805306368;
            i18 = i3 & 1024;
            if (i18 != 0) {
                i19 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (dVarF.T(function6)) {
                    i20 = 4;
                } else {
                    i20 = 2;
                }
                i19 = i2 | i20;
            } else {
                i19 = i2;
            }
            i21 = i3 & 2048;
            if (i21 != 0) {
                i19 |= 48;
            } else if ((i2 & 48) != 0) {
                if (dVarF.T(function7)) {
                    i22 = 32;
                } else {
                    i22 = 16;
                }
                i19 |= i22;
            }
            i23 = i19;
            i24 = i3 & 4096;
            if (i24 != 0) {
                i25 = i23 | 384;
            } else if ((i2 & 384) == 0) {
                if (dVarF.T(function8)) {
                    i26 = 256;
                } else {
                    i26 = 128;
                }
                i25 = i23 | i26;
            } else {
                i25 = i23;
            }
            i27 = i3 & 8192;
            if (i27 != 0) {
                i29 = i25 | 3072;
            } else {
                i28 = i25;
                if ((i2 & 3072) == 0) {
                    i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                } else {
                    i29 = i28;
                }
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16384) == 0) {
                    i7 = 16384;
                }
                i29 |= i7;
            }
            if ((i2 & 196608) != 0) {
                if ((i3 & 32768) == 0) {
                    i34 = 65536;
                } else {
                    i34 = 65536;
                }
                i29 |= i34;
            }
            if ((i2 & 1572864) != 0) {
                if ((i3 & 65536) == 0) {
                    i33 = 524288;
                } else {
                    i33 = 524288;
                }
                i29 |= i33;
            }
            i30 = i3 & 131072;
            if (i30 != 0) {
                i29 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (dVarF.T(function10)) {
                    i31 = 8388608;
                } else {
                    i31 = 4194304;
                }
                i29 |= i31;
            }
            if ((i3 & 262144) != 0) {
                i29 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (dVarF.x(this)) {
                    i32 = 67108864;
                } else {
                    i32 = 33554432;
                }
                i29 |= i32;
            }
            if ((i4 & 306783379) == 306783378) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (dVarF.g(z7, i4 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        z6 = false;
                    }
                    if (i12 != 0) {
                        function12 = null;
                    }
                    if (i14 != 0) {
                        function21 = null;
                    } else {
                        function21 = function4;
                    }
                    if (i16 != 0) {
                        function22 = null;
                    } else {
                        function22 = function5;
                    }
                    if (i18 != 0) {
                        function23 = null;
                    } else {
                        function23 = function6;
                    }
                    if (i21 != 0) {
                        function24 = null;
                    } else {
                        function24 = function7;
                    }
                    if (i24 != 0) {
                        function25 = null;
                    } else {
                        function25 = function8;
                    }
                    if (i27 != 0) {
                        function26 = null;
                    } else {
                        function26 = function9;
                    }
                    if ((i3 & 16384) != 0) {
                        xkbVarQ = a.q(dVarF, 6);
                        i29 &= -57345;
                    } else {
                        xkbVarQ = xkbVar;
                    }
                    if ((i3 & 32768) != 0) {
                        pscVarG = g(dVarF, (i29 >> 24) & 14);
                        i29 &= -458753;
                    } else {
                        pscVarG = pscVar;
                    }
                    if ((i3 & 65536) != 0) {
                        if (function12 == null) {
                            rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i29 &= -3670017;
                    } else {
                        rx8VarJ = rx8Var;
                    }
                    if (i30 != 0) {
                        function27 = function26;
                        function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                    } else {
                        function27 = function26;
                        function2E = function10;
                    }
                    xkbVar3 = xkbVarQ;
                    function28 = function22;
                    function29 = function12;
                    function30 = function23;
                    function31 = function21;
                    z9 = z6;
                    function32 = function24;
                    rx8Var3 = rx8VarJ;
                } else {
                    if (i10 != 0) {
                        z6 = false;
                    }
                    if (i12 != 0) {
                        function12 = null;
                    }
                    if (i14 != 0) {
                        function21 = null;
                    } else {
                        function21 = function4;
                    }
                    if (i16 != 0) {
                        function22 = null;
                    } else {
                        function22 = function5;
                    }
                    if (i18 != 0) {
                        function23 = null;
                    } else {
                        function23 = function6;
                    }
                    if (i21 != 0) {
                        function24 = null;
                    } else {
                        function24 = function7;
                    }
                    if (i24 != 0) {
                        function25 = null;
                    } else {
                        function25 = function8;
                    }
                    if (i27 != 0) {
                        function26 = null;
                    } else {
                        function26 = function9;
                    }
                    if ((i3 & 16384) != 0) {
                        xkbVarQ = a.q(dVarF, 6);
                        i29 &= -57345;
                    } else {
                        xkbVarQ = xkbVar;
                    }
                    if ((i3 & 32768) != 0) {
                        pscVarG = g(dVarF, (i29 >> 24) & 14);
                        i29 &= -458753;
                    } else {
                        pscVarG = pscVar;
                    }
                    if ((i3 & 65536) != 0) {
                        if (function12 == null) {
                            rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i29 &= -3670017;
                    } else {
                        rx8VarJ = rx8Var;
                    }
                    if (i30 != 0) {
                        function27 = function26;
                        function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                    } else {
                        function27 = function26;
                        function2E = function10;
                    }
                    xkbVar3 = xkbVarQ;
                    function28 = function22;
                    function29 = function12;
                    function30 = function23;
                    function31 = function21;
                    z9 = z6;
                    function32 = function24;
                    rx8Var3 = rx8VarJ;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                }
                if ((i4 & 14) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xkb xkbVar1111 = xkbVar3;
                z11 = z10 | ((57344 & i4) == 16384);
                objR = dVarF.R();
                if (z11) {
                    objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                    dVarF.L(objR);
                } else {
                    objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                    dVarF.L(objR);
                }
                String text118 = ((TransformedText) objR).getText().getText();
                TextFieldType textFieldType118 = TextFieldType.Filled;
                v1.Attached attached118 = new v1.Attached(false, null, null, 7, null);
                if (function29 == null) {
                    dVarF.y(-1353131191);
                    dVarF.u();
                    do1Var = null;
                } else {
                    dVarF.y(-1353131190);
                    do1 do1VarE118 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                    dVarF.u();
                    do1Var = do1VarE118;
                }
                int i3111119 = i4 >> 9;
                int i31111110 = i29 << 21;
                boolean z1119 = z5;
                do1 do1Var119 = do1Var;
                dVar2 = dVarF;
                TextFieldImplKt.l(textFieldType118, text118, function11, attached118, do1Var119, function31, function28, function30, function32, function25, function27, z1119, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i3111119) | (3670016 & i3111119) | (29360128 & i31111110) | (234881024 & i31111110) | (i31111110 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i3111119 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                if (e.k()) {
                    e.n();
                }
                function18 = function29;
                function13 = function31;
                function14 = function28;
                function19 = function30;
                function15 = function32;
                function16 = function25;
                function20 = function27;
                z8 = z9;
                rx8Var2 = rx8Var3;
                pscVar2 = pscVarG;
                function17 = function2E;
                xkbVar2 = xkbVar1111;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                function13 = function4;
                function14 = function5;
                function15 = function7;
                function16 = function8;
                xkbVar2 = xkbVar;
                pscVar2 = pscVar;
                rx8Var2 = rx8Var;
                function17 = function10;
                function18 = function12;
                z8 = z6;
                function19 = function6;
                function20 = function9;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.usc
                    public final Object invoke(Object obj, Object obj2) {
                        return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 3072;
        z5 = z2;
        i7 = 8192;
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            if (dVarF.x(nceVar)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i4 |= i8;
        }
        if ((i3 & 32) != 0) {
            if ((196608 & i) == 0) {
                j26Var2 = j26Var;
                if (dVarF.x(j26Var2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i4 |= i9;
            }
            i10 = i3 & 64;
            if (i10 != 0) {
                i4 |= 1572864;
                z6 = z3;
            } else {
                z6 = z3;
                if ((i & 1572864) == 0) {
                    if (dVarF.A(z6)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
            }
            i12 = i3 & 128;
            if (i12 != 0) {
                i4 |= 12582912;
                function12 = function3;
            } else {
                function12 = function3;
                if ((i & 12582912) == 0) {
                    if (dVarF.T(function12)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i4 |= i13;
                }
            }
            i14 = i3 & 256;
            if (i14 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (dVarF.T(function4)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i4 |= i15;
            }
            i16 = i3 & 512;
            if (i16 != 0) {
                if ((i & 805306368) == 0) {
                    if (dVarF.T(function5)) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                    i4 |= i17;
                }
                i18 = i3 & 1024;
                if (i18 != 0) {
                    i19 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (dVarF.T(function6)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                    i19 = i2 | i20;
                } else {
                    i19 = i2;
                }
                i21 = i3 & 2048;
                if (i21 != 0) {
                    i19 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (dVarF.T(function7)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i19 |= i22;
                }
                i23 = i19;
                i24 = i3 & 4096;
                if (i24 != 0) {
                    i25 = i23 | 384;
                } else if ((i2 & 384) == 0) {
                    if (dVarF.T(function8)) {
                        i26 = 256;
                    } else {
                        i26 = 128;
                    }
                    i25 = i23 | i26;
                } else {
                    i25 = i23;
                }
                i27 = i3 & 8192;
                if (i27 != 0) {
                    i29 = i25 | 3072;
                } else {
                    i28 = i25;
                    if ((i2 & 3072) == 0) {
                        i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                    } else {
                        i29 = i28;
                    }
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i7 = 16384;
                    }
                    i29 |= i7;
                }
                if ((i2 & 196608) != 0) {
                    if ((i3 & 32768) == 0) {
                        i34 = 65536;
                    } else {
                        i34 = 65536;
                    }
                    i29 |= i34;
                }
                if ((i2 & 1572864) != 0) {
                    if ((i3 & 65536) == 0) {
                        i33 = 524288;
                    } else {
                        i33 = 524288;
                    }
                    i29 |= i33;
                }
                i30 = i3 & 131072;
                if (i30 != 0) {
                    i29 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (dVarF.T(function10)) {
                        i31 = 8388608;
                    } else {
                        i31 = 4194304;
                    }
                    i29 |= i31;
                }
                if ((i3 & 262144) != 0) {
                    i29 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (dVarF.x(this)) {
                        i32 = 67108864;
                    } else {
                        i32 = 33554432;
                    }
                    i29 |= i32;
                }
                if ((i4 & 306783379) == 306783378) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (dVarF.g(z7, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z6 = false;
                        }
                        if (i12 != 0) {
                            function12 = null;
                        }
                        if (i14 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i16 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i18 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i21 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i24 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i27 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            xkbVarQ = a.q(dVarF, 6);
                            i29 &= -57345;
                        } else {
                            xkbVarQ = xkbVar;
                        }
                        if ((i3 & 32768) != 0) {
                            pscVarG = g(dVarF, (i29 >> 24) & 14);
                            i29 &= -458753;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 65536) != 0) {
                            if (function12 == null) {
                                rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i29 &= -3670017;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i30 != 0) {
                            function27 = function26;
                            function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        xkbVar3 = xkbVarQ;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z9 = z6;
                        function32 = function24;
                        rx8Var3 = rx8VarJ;
                    } else {
                        if (i10 != 0) {
                            z6 = false;
                        }
                        if (i12 != 0) {
                            function12 = null;
                        }
                        if (i14 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i16 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i18 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i21 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i24 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i27 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            xkbVarQ = a.q(dVarF, 6);
                            i29 &= -57345;
                        } else {
                            xkbVarQ = xkbVar;
                        }
                        if ((i3 & 32768) != 0) {
                            pscVarG = g(dVarF, (i29 >> 24) & 14);
                            i29 &= -458753;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 65536) != 0) {
                            if (function12 == null) {
                                rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i29 &= -3670017;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i30 != 0) {
                            function27 = function26;
                            function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        xkbVar3 = xkbVarQ;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z9 = z6;
                        function32 = function24;
                        rx8Var3 = rx8VarJ;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                    }
                    if ((i4 & 14) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    xkb xkbVar1112 = xkbVar3;
                    z11 = z10 | ((57344 & i4) == 16384);
                    objR = dVarF.R();
                    if (z11) {
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    } else {
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    }
                    String text119 = ((TransformedText) objR).getText().getText();
                    TextFieldType textFieldType119 = TextFieldType.Filled;
                    v1.Attached attached119 = new v1.Attached(false, null, null, 7, null);
                    if (function29 == null) {
                        dVarF.y(-1353131191);
                        dVarF.u();
                        do1Var = null;
                    } else {
                        dVarF.y(-1353131190);
                        do1 do1VarE119 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                        dVarF.u();
                        do1Var = do1VarE119;
                    }
                    int i31111111 = i4 >> 9;
                    int i31111112 = i29 << 21;
                    boolean z11110 = z5;
                    do1 do1Var1110 = do1Var;
                    dVar2 = dVarF;
                    TextFieldImplKt.l(textFieldType119, text119, function11, attached119, do1Var1110, function31, function28, function30, function32, function25, function27, z11110, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i31111111) | (3670016 & i31111111) | (29360128 & i31111112) | (234881024 & i31111112) | (i31111112 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i31111111 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                    if (e.k()) {
                        e.n();
                    }
                    function18 = function29;
                    function13 = function31;
                    function14 = function28;
                    function19 = function30;
                    function15 = function32;
                    function16 = function25;
                    function20 = function27;
                    z8 = z9;
                    rx8Var2 = rx8Var3;
                    pscVar2 = pscVarG;
                    function17 = function2E;
                    xkbVar2 = xkbVar1112;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    function13 = function4;
                    function14 = function5;
                    function15 = function7;
                    function16 = function8;
                    xkbVar2 = xkbVar;
                    pscVar2 = pscVar;
                    rx8Var2 = rx8Var;
                    function17 = function10;
                    function18 = function12;
                    z8 = z6;
                    function19 = function6;
                    function20 = function9;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.usc
                        public final Object invoke(Object obj, Object obj2) {
                            return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 805306368;
            i18 = i3 & 1024;
            if (i18 != 0) {
                i19 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (dVarF.T(function6)) {
                    i20 = 4;
                } else {
                    i20 = 2;
                }
                i19 = i2 | i20;
            } else {
                i19 = i2;
            }
            i21 = i3 & 2048;
            if (i21 != 0) {
                i19 |= 48;
            } else if ((i2 & 48) != 0) {
                if (dVarF.T(function7)) {
                    i22 = 32;
                } else {
                    i22 = 16;
                }
                i19 |= i22;
            }
            i23 = i19;
            i24 = i3 & 4096;
            if (i24 != 0) {
                i25 = i23 | 384;
            } else if ((i2 & 384) == 0) {
                if (dVarF.T(function8)) {
                    i26 = 256;
                } else {
                    i26 = 128;
                }
                i25 = i23 | i26;
            } else {
                i25 = i23;
            }
            i27 = i3 & 8192;
            if (i27 != 0) {
                i29 = i25 | 3072;
            } else {
                i28 = i25;
                if ((i2 & 3072) == 0) {
                    i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                } else {
                    i29 = i28;
                }
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16384) == 0) {
                    i7 = 16384;
                }
                i29 |= i7;
            }
            if ((i2 & 196608) != 0) {
                if ((i3 & 32768) == 0) {
                    i34 = 65536;
                } else {
                    i34 = 65536;
                }
                i29 |= i34;
            }
            if ((i2 & 1572864) != 0) {
                if ((i3 & 65536) == 0) {
                    i33 = 524288;
                } else {
                    i33 = 524288;
                }
                i29 |= i33;
            }
            i30 = i3 & 131072;
            if (i30 != 0) {
                i29 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (dVarF.T(function10)) {
                    i31 = 8388608;
                } else {
                    i31 = 4194304;
                }
                i29 |= i31;
            }
            if ((i3 & 262144) != 0) {
                i29 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (dVarF.x(this)) {
                    i32 = 67108864;
                } else {
                    i32 = 33554432;
                }
                i29 |= i32;
            }
            if ((i4 & 306783379) == 306783378) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (dVarF.g(z7, i4 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        z6 = false;
                    }
                    if (i12 != 0) {
                        function12 = null;
                    }
                    if (i14 != 0) {
                        function21 = null;
                    } else {
                        function21 = function4;
                    }
                    if (i16 != 0) {
                        function22 = null;
                    } else {
                        function22 = function5;
                    }
                    if (i18 != 0) {
                        function23 = null;
                    } else {
                        function23 = function6;
                    }
                    if (i21 != 0) {
                        function24 = null;
                    } else {
                        function24 = function7;
                    }
                    if (i24 != 0) {
                        function25 = null;
                    } else {
                        function25 = function8;
                    }
                    if (i27 != 0) {
                        function26 = null;
                    } else {
                        function26 = function9;
                    }
                    if ((i3 & 16384) != 0) {
                        xkbVarQ = a.q(dVarF, 6);
                        i29 &= -57345;
                    } else {
                        xkbVarQ = xkbVar;
                    }
                    if ((i3 & 32768) != 0) {
                        pscVarG = g(dVarF, (i29 >> 24) & 14);
                        i29 &= -458753;
                    } else {
                        pscVarG = pscVar;
                    }
                    if ((i3 & 65536) != 0) {
                        if (function12 == null) {
                            rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i29 &= -3670017;
                    } else {
                        rx8VarJ = rx8Var;
                    }
                    if (i30 != 0) {
                        function27 = function26;
                        function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                    } else {
                        function27 = function26;
                        function2E = function10;
                    }
                    xkbVar3 = xkbVarQ;
                    function28 = function22;
                    function29 = function12;
                    function30 = function23;
                    function31 = function21;
                    z9 = z6;
                    function32 = function24;
                    rx8Var3 = rx8VarJ;
                } else {
                    if (i10 != 0) {
                        z6 = false;
                    }
                    if (i12 != 0) {
                        function12 = null;
                    }
                    if (i14 != 0) {
                        function21 = null;
                    } else {
                        function21 = function4;
                    }
                    if (i16 != 0) {
                        function22 = null;
                    } else {
                        function22 = function5;
                    }
                    if (i18 != 0) {
                        function23 = null;
                    } else {
                        function23 = function6;
                    }
                    if (i21 != 0) {
                        function24 = null;
                    } else {
                        function24 = function7;
                    }
                    if (i24 != 0) {
                        function25 = null;
                    } else {
                        function25 = function8;
                    }
                    if (i27 != 0) {
                        function26 = null;
                    } else {
                        function26 = function9;
                    }
                    if ((i3 & 16384) != 0) {
                        xkbVarQ = a.q(dVarF, 6);
                        i29 &= -57345;
                    } else {
                        xkbVarQ = xkbVar;
                    }
                    if ((i3 & 32768) != 0) {
                        pscVarG = g(dVarF, (i29 >> 24) & 14);
                        i29 &= -458753;
                    } else {
                        pscVarG = pscVar;
                    }
                    if ((i3 & 65536) != 0) {
                        if (function12 == null) {
                            rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i29 &= -3670017;
                    } else {
                        rx8VarJ = rx8Var;
                    }
                    if (i30 != 0) {
                        function27 = function26;
                        function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                    } else {
                        function27 = function26;
                        function2E = function10;
                    }
                    xkbVar3 = xkbVarQ;
                    function28 = function22;
                    function29 = function12;
                    function30 = function23;
                    function31 = function21;
                    z9 = z6;
                    function32 = function24;
                    rx8Var3 = rx8VarJ;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                }
                if ((i4 & 14) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xkb xkbVar1113 = xkbVar3;
                z11 = z10 | ((57344 & i4) == 16384);
                objR = dVarF.R();
                if (z11) {
                    objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                    dVarF.L(objR);
                } else {
                    objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                    dVarF.L(objR);
                }
                String text1110 = ((TransformedText) objR).getText().getText();
                TextFieldType textFieldType1110 = TextFieldType.Filled;
                v1.Attached attached1110 = new v1.Attached(false, null, null, 7, null);
                if (function29 == null) {
                    dVarF.y(-1353131191);
                    dVarF.u();
                    do1Var = null;
                } else {
                    dVarF.y(-1353131190);
                    do1 do1VarE1110 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                    dVarF.u();
                    do1Var = do1VarE1110;
                }
                int i31111113 = i4 >> 9;
                int i31111114 = i29 << 21;
                boolean z11111 = z5;
                do1 do1Var1111 = do1Var;
                dVar2 = dVarF;
                TextFieldImplKt.l(textFieldType1110, text1110, function11, attached1110, do1Var1111, function31, function28, function30, function32, function25, function27, z11111, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i31111113) | (3670016 & i31111113) | (29360128 & i31111114) | (234881024 & i31111114) | (i31111114 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i31111113 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                if (e.k()) {
                    e.n();
                }
                function18 = function29;
                function13 = function31;
                function14 = function28;
                function19 = function30;
                function15 = function32;
                function16 = function25;
                function20 = function27;
                z8 = z9;
                rx8Var2 = rx8Var3;
                pscVar2 = pscVarG;
                function17 = function2E;
                xkbVar2 = xkbVar1113;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                function13 = function4;
                function14 = function5;
                function15 = function7;
                function16 = function8;
                xkbVar2 = xkbVar;
                pscVar2 = pscVar;
                rx8Var2 = rx8Var;
                function17 = function10;
                function18 = function12;
                z8 = z6;
                function19 = function6;
                function20 = function9;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.usc
                    public final Object invoke(Object obj, Object obj2) {
                        return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 196608;
        j26Var2 = j26Var;
        i10 = i3 & 64;
        if (i10 != 0) {
            i4 |= 1572864;
            z6 = z3;
        } else {
            z6 = z3;
            if ((i & 1572864) == 0) {
                if (dVarF.A(z6)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i4 |= i11;
            }
        }
        i12 = i3 & 128;
        if (i12 != 0) {
            i4 |= 12582912;
            function12 = function3;
        } else {
            function12 = function3;
            if ((i & 12582912) == 0) {
                if (dVarF.T(function12)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i4 |= i13;
            }
        }
        i14 = i3 & 256;
        if (i14 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (dVarF.T(function4)) {
                i15 = 67108864;
            } else {
                i15 = 33554432;
            }
            i4 |= i15;
        }
        i16 = i3 & 512;
        if (i16 != 0) {
            if ((i & 805306368) == 0) {
                if (dVarF.T(function5)) {
                    i17 = 536870912;
                } else {
                    i17 = 268435456;
                }
                i4 |= i17;
            }
            i18 = i3 & 1024;
            if (i18 != 0) {
                i19 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (dVarF.T(function6)) {
                    i20 = 4;
                } else {
                    i20 = 2;
                }
                i19 = i2 | i20;
            } else {
                i19 = i2;
            }
            i21 = i3 & 2048;
            if (i21 != 0) {
                i19 |= 48;
            } else if ((i2 & 48) != 0) {
                if (dVarF.T(function7)) {
                    i22 = 32;
                } else {
                    i22 = 16;
                }
                i19 |= i22;
            }
            i23 = i19;
            i24 = i3 & 4096;
            if (i24 != 0) {
                i25 = i23 | 384;
            } else if ((i2 & 384) == 0) {
                if (dVarF.T(function8)) {
                    i26 = 256;
                } else {
                    i26 = 128;
                }
                i25 = i23 | i26;
            } else {
                i25 = i23;
            }
            i27 = i3 & 8192;
            if (i27 != 0) {
                i29 = i25 | 3072;
            } else {
                i28 = i25;
                if ((i2 & 3072) == 0) {
                    i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
                } else {
                    i29 = i28;
                }
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16384) == 0) {
                    i7 = 16384;
                }
                i29 |= i7;
            }
            if ((i2 & 196608) != 0) {
                if ((i3 & 32768) == 0) {
                    i34 = 65536;
                } else {
                    i34 = 65536;
                }
                i29 |= i34;
            }
            if ((i2 & 1572864) != 0) {
                if ((i3 & 65536) == 0) {
                    i33 = 524288;
                } else {
                    i33 = 524288;
                }
                i29 |= i33;
            }
            i30 = i3 & 131072;
            if (i30 != 0) {
                i29 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (dVarF.T(function10)) {
                    i31 = 8388608;
                } else {
                    i31 = 4194304;
                }
                i29 |= i31;
            }
            if ((i3 & 262144) != 0) {
                i29 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (dVarF.x(this)) {
                    i32 = 67108864;
                } else {
                    i32 = 33554432;
                }
                i29 |= i32;
            }
            if ((i4 & 306783379) == 306783378) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (dVarF.g(z7, i4 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        z6 = false;
                    }
                    if (i12 != 0) {
                        function12 = null;
                    }
                    if (i14 != 0) {
                        function21 = null;
                    } else {
                        function21 = function4;
                    }
                    if (i16 != 0) {
                        function22 = null;
                    } else {
                        function22 = function5;
                    }
                    if (i18 != 0) {
                        function23 = null;
                    } else {
                        function23 = function6;
                    }
                    if (i21 != 0) {
                        function24 = null;
                    } else {
                        function24 = function7;
                    }
                    if (i24 != 0) {
                        function25 = null;
                    } else {
                        function25 = function8;
                    }
                    if (i27 != 0) {
                        function26 = null;
                    } else {
                        function26 = function9;
                    }
                    if ((i3 & 16384) != 0) {
                        xkbVarQ = a.q(dVarF, 6);
                        i29 &= -57345;
                    } else {
                        xkbVarQ = xkbVar;
                    }
                    if ((i3 & 32768) != 0) {
                        pscVarG = g(dVarF, (i29 >> 24) & 14);
                        i29 &= -458753;
                    } else {
                        pscVarG = pscVar;
                    }
                    if ((i3 & 65536) != 0) {
                        if (function12 == null) {
                            rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i29 &= -3670017;
                    } else {
                        rx8VarJ = rx8Var;
                    }
                    if (i30 != 0) {
                        function27 = function26;
                        function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                    } else {
                        function27 = function26;
                        function2E = function10;
                    }
                    xkbVar3 = xkbVarQ;
                    function28 = function22;
                    function29 = function12;
                    function30 = function23;
                    function31 = function21;
                    z9 = z6;
                    function32 = function24;
                    rx8Var3 = rx8VarJ;
                } else {
                    if (i10 != 0) {
                        z6 = false;
                    }
                    if (i12 != 0) {
                        function12 = null;
                    }
                    if (i14 != 0) {
                        function21 = null;
                    } else {
                        function21 = function4;
                    }
                    if (i16 != 0) {
                        function22 = null;
                    } else {
                        function22 = function5;
                    }
                    if (i18 != 0) {
                        function23 = null;
                    } else {
                        function23 = function6;
                    }
                    if (i21 != 0) {
                        function24 = null;
                    } else {
                        function24 = function7;
                    }
                    if (i24 != 0) {
                        function25 = null;
                    } else {
                        function25 = function8;
                    }
                    if (i27 != 0) {
                        function26 = null;
                    } else {
                        function26 = function9;
                    }
                    if ((i3 & 16384) != 0) {
                        xkbVarQ = a.q(dVarF, 6);
                        i29 &= -57345;
                    } else {
                        xkbVarQ = xkbVar;
                    }
                    if ((i3 & 32768) != 0) {
                        pscVarG = g(dVarF, (i29 >> 24) & 14);
                        i29 &= -458753;
                    } else {
                        pscVarG = pscVar;
                    }
                    if ((i3 & 65536) != 0) {
                        if (function12 == null) {
                            rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i29 &= -3670017;
                    } else {
                        rx8VarJ = rx8Var;
                    }
                    if (i30 != 0) {
                        function27 = function26;
                        function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                    } else {
                        function27 = function26;
                        function2E = function10;
                    }
                    xkbVar3 = xkbVarQ;
                    function28 = function22;
                    function29 = function12;
                    function30 = function23;
                    function31 = function21;
                    z9 = z6;
                    function32 = function24;
                    rx8Var3 = rx8VarJ;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                }
                if ((i4 & 14) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xkb xkbVar1114 = xkbVar3;
                z11 = z10 | ((57344 & i4) == 16384);
                objR = dVarF.R();
                if (z11) {
                    objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                    dVarF.L(objR);
                } else {
                    objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                    dVarF.L(objR);
                }
                String text1111 = ((TransformedText) objR).getText().getText();
                TextFieldType textFieldType1111 = TextFieldType.Filled;
                v1.Attached attached1111 = new v1.Attached(false, null, null, 7, null);
                if (function29 == null) {
                    dVarF.y(-1353131191);
                    dVarF.u();
                    do1Var = null;
                } else {
                    dVarF.y(-1353131190);
                    do1 do1VarE1111 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                    dVarF.u();
                    do1Var = do1VarE1111;
                }
                int i31111115 = i4 >> 9;
                int i31111116 = i29 << 21;
                boolean z11112 = z5;
                do1 do1Var1112 = do1Var;
                dVar2 = dVarF;
                TextFieldImplKt.l(textFieldType1111, text1111, function11, attached1111, do1Var1112, function31, function28, function30, function32, function25, function27, z11112, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i31111115) | (3670016 & i31111115) | (29360128 & i31111116) | (234881024 & i31111116) | (i31111116 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i31111115 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
                if (e.k()) {
                    e.n();
                }
                function18 = function29;
                function13 = function31;
                function14 = function28;
                function19 = function30;
                function15 = function32;
                function16 = function25;
                function20 = function27;
                z8 = z9;
                rx8Var2 = rx8Var3;
                pscVar2 = pscVarG;
                function17 = function2E;
                xkbVar2 = xkbVar1114;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                function13 = function4;
                function14 = function5;
                function15 = function7;
                function16 = function8;
                xkbVar2 = xkbVar;
                pscVar2 = pscVar;
                rx8Var2 = rx8Var;
                function17 = function10;
                function18 = function12;
                z8 = z6;
                function19 = function6;
                function20 = function9;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.usc
                    public final Object invoke(Object obj, Object obj2) {
                        return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 805306368;
        i18 = i3 & 1024;
        if (i18 != 0) {
            i19 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (dVarF.T(function6)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i19 = i2 | i20;
        } else {
            i19 = i2;
        }
        i21 = i3 & 2048;
        if (i21 != 0) {
            i19 |= 48;
        } else if ((i2 & 48) != 0) {
            if (dVarF.T(function7)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i19 |= i22;
        }
        i23 = i19;
        i24 = i3 & 4096;
        if (i24 != 0) {
            i25 = i23 | 384;
        } else if ((i2 & 384) == 0) {
            if (dVarF.T(function8)) {
                i26 = 256;
            } else {
                i26 = 128;
            }
            i25 = i23 | i26;
        } else {
            i25 = i23;
        }
        i27 = i3 & 8192;
        if (i27 != 0) {
            i29 = i25 | 3072;
        } else {
            i28 = i25;
            if ((i2 & 3072) == 0) {
                i29 = i28 | (dVarF.T(function9) ? 2048 : 1024);
            } else {
                i29 = i28;
            }
        }
        if ((i2 & 24576) != 0) {
            if ((i3 & 16384) == 0) {
                i7 = 16384;
            }
            i29 |= i7;
        }
        if ((i2 & 196608) != 0) {
            if ((i3 & 32768) == 0) {
                i34 = 65536;
            } else {
                i34 = 65536;
            }
            i29 |= i34;
        }
        if ((i2 & 1572864) != 0) {
            if ((i3 & 65536) == 0) {
                i33 = 524288;
            } else {
                i33 = 524288;
            }
            i29 |= i33;
        }
        i30 = i3 & 131072;
        if (i30 != 0) {
            i29 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            if (dVarF.T(function10)) {
                i31 = 8388608;
            } else {
                i31 = 4194304;
            }
            i29 |= i31;
        }
        if ((i3 & 262144) != 0) {
            i29 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            if (dVarF.x(this)) {
                i32 = 67108864;
            } else {
                i32 = 33554432;
            }
            i29 |= i32;
        }
        if ((i4 & 306783379) == 306783378) {
            z7 = true;
        } else {
            z7 = true;
        }
        if (dVarF.g(z7, i4 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    z6 = false;
                }
                if (i12 != 0) {
                    function12 = null;
                }
                if (i14 != 0) {
                    function21 = null;
                } else {
                    function21 = function4;
                }
                if (i16 != 0) {
                    function22 = null;
                } else {
                    function22 = function5;
                }
                if (i18 != 0) {
                    function23 = null;
                } else {
                    function23 = function6;
                }
                if (i21 != 0) {
                    function24 = null;
                } else {
                    function24 = function7;
                }
                if (i24 != 0) {
                    function25 = null;
                } else {
                    function25 = function8;
                }
                if (i27 != 0) {
                    function26 = null;
                } else {
                    function26 = function9;
                }
                if ((i3 & 16384) != 0) {
                    xkbVarQ = a.q(dVarF, 6);
                    i29 &= -57345;
                } else {
                    xkbVarQ = xkbVar;
                }
                if ((i3 & 32768) != 0) {
                    pscVarG = g(dVarF, (i29 >> 24) & 14);
                    i29 &= -458753;
                } else {
                    pscVarG = pscVar;
                }
                if ((i3 & 65536) != 0) {
                    if (function12 == null) {
                        rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    } else {
                        rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    }
                    i29 &= -3670017;
                } else {
                    rx8VarJ = rx8Var;
                }
                if (i30 != 0) {
                    function27 = function26;
                    function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                } else {
                    function27 = function26;
                    function2E = function10;
                }
                xkbVar3 = xkbVarQ;
                function28 = function22;
                function29 = function12;
                function30 = function23;
                function31 = function21;
                z9 = z6;
                function32 = function24;
                rx8Var3 = rx8VarJ;
            } else {
                if (i10 != 0) {
                    z6 = false;
                }
                if (i12 != 0) {
                    function12 = null;
                }
                if (i14 != 0) {
                    function21 = null;
                } else {
                    function21 = function4;
                }
                if (i16 != 0) {
                    function22 = null;
                } else {
                    function22 = function5;
                }
                if (i18 != 0) {
                    function23 = null;
                } else {
                    function23 = function6;
                }
                if (i21 != 0) {
                    function24 = null;
                } else {
                    function24 = function7;
                }
                if (i24 != 0) {
                    function25 = null;
                } else {
                    function25 = function8;
                }
                if (i27 != 0) {
                    function26 = null;
                } else {
                    function26 = function9;
                }
                if ((i3 & 16384) != 0) {
                    xkbVarQ = a.q(dVarF, 6);
                    i29 &= -57345;
                } else {
                    xkbVarQ = xkbVar;
                }
                if ((i3 & 32768) != 0) {
                    pscVarG = g(dVarF, (i29 >> 24) & 14);
                    i29 &= -458753;
                } else {
                    pscVarG = pscVar;
                }
                if ((i3 & 65536) != 0) {
                    if (function12 == null) {
                        rx8VarJ = l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    } else {
                        rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    }
                    i29 &= -3670017;
                } else {
                    rx8VarJ = rx8Var;
                }
                if (i30 != 0) {
                    function27 = function26;
                    function2E = ko1.e(417908150, true, new a(z4, z6, j26Var2, pscVarG, xkbVarQ), dVarF, 54);
                } else {
                    function27 = function26;
                    function2E = function10;
                }
                xkbVar3 = xkbVarQ;
                function28 = function22;
                function29 = function12;
                function30 = function23;
                function31 = function21;
                z9 = z6;
                function32 = function24;
                rx8Var3 = rx8VarJ;
            }
            dVarF.M();
            if (e.k()) {
                e.o(1806980801, i4, i29, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
            }
            if ((i4 & 14) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            xkb xkbVar1115 = xkbVar3;
            z11 = z10 | ((57344 & i4) == 16384);
            objR = dVarF.R();
            if (z11) {
                objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                dVarF.L(objR);
            } else {
                objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                dVarF.L(objR);
            }
            String text1112 = ((TransformedText) objR).getText().getText();
            TextFieldType textFieldType1112 = TextFieldType.Filled;
            v1.Attached attached1112 = new v1.Attached(false, null, null, 7, null);
            if (function29 == null) {
                dVarF.y(-1353131191);
                dVarF.u();
                do1Var = null;
            } else {
                dVarF.y(-1353131190);
                do1 do1VarE1112 = ko1.e(1110058497, true, new b(function29), dVarF, 54);
                dVarF.u();
                do1Var = do1VarE1112;
            }
            int i31111117 = i4 >> 9;
            int i31111118 = i29 << 21;
            boolean z11113 = z5;
            do1 do1Var1113 = do1Var;
            dVar2 = dVarF;
            TextFieldImplKt.l(textFieldType1112, text1112, function11, attached1112, do1Var1113, function31, function28, function30, function32, function25, function27, z11113, z, z9, j26Var, rx8Var3, pscVarG, function2E, dVar2, ((i4 << 3) & 896) | 6 | (458752 & i31111117) | (3670016 & i31111117) | (29360128 & i31111118) | (234881024 & i31111118) | (i31111118 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i31111117 & 7168) | (57344 & (i4 >> 3)) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (29360128 & i29));
            if (e.k()) {
                e.n();
            }
            function18 = function29;
            function13 = function31;
            function14 = function28;
            function19 = function30;
            function15 = function32;
            function16 = function25;
            function20 = function27;
            z8 = z9;
            rx8Var2 = rx8Var3;
            pscVar2 = pscVarG;
            function17 = function2E;
            xkbVar2 = xkbVar1115;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            function13 = function4;
            function14 = function5;
            function15 = function7;
            function16 = function8;
            xkbVar2 = xkbVar;
            pscVar2 = pscVar;
            rx8Var2 = rx8Var;
            function17 = function10;
            function18 = function12;
            z8 = z6;
            function19 = function6;
            function20 = function9;
        }
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.usc
                public final Object invoke(Object obj, Object obj2) {
                    return TextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z8, function18, function13, function14, function19, function15, function16, function20, xkbVar2, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final psc g(d dVar, int i) {
        if (e.k()) {
            e.o(831731228, i, -1, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:478)");
        }
        psc pscVarM = m(kh7.a.a(dVar, 6), (SelectionColors) dVar.v(jzc.c()));
        if (e.k()) {
            e.n();
        }
        return pscVarM;
    }

    public final psc h(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, SelectionColors selectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, d dVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        long jI = (i6 & 1) != 0 ? ei1.INSTANCE.i() : j;
        long jI2 = (i6 & 2) != 0 ? ei1.INSTANCE.i() : j2;
        long jI3 = (i6 & 4) != 0 ? ei1.INSTANCE.i() : j3;
        long jI4 = (i6 & 8) != 0 ? ei1.INSTANCE.i() : j4;
        long jI5 = (i6 & 16) != 0 ? ei1.INSTANCE.i() : j5;
        long jI6 = (i6 & 32) != 0 ? ei1.INSTANCE.i() : j6;
        long jI7 = (i6 & 64) != 0 ? ei1.INSTANCE.i() : j7;
        long j43 = jI;
        long jI8 = (i6 & 128) != 0 ? ei1.INSTANCE.i() : j8;
        long jI9 = (i6 & 256) != 0 ? ei1.INSTANCE.i() : j9;
        long jI10 = (i6 & 512) != 0 ? ei1.INSTANCE.i() : j10;
        SelectionColors selectionColors2 = (i6 & 1024) != 0 ? null : selectionColors;
        long jI11 = (i6 & 2048) != 0 ? ei1.INSTANCE.i() : j11;
        long jI12 = (i6 & 4096) != 0 ? ei1.INSTANCE.i() : j12;
        long jI13 = (i6 & 8192) != 0 ? ei1.INSTANCE.i() : j13;
        long jI14 = (i6 & 16384) != 0 ? ei1.INSTANCE.i() : j14;
        long jI15 = (32768 & i6) != 0 ? ei1.INSTANCE.i() : j15;
        long jI16 = (65536 & i6) != 0 ? ei1.INSTANCE.i() : j16;
        long jI17 = (131072 & i6) != 0 ? ei1.INSTANCE.i() : j17;
        long jI18 = (262144 & i6) != 0 ? ei1.INSTANCE.i() : j18;
        long jI19 = (524288 & i6) != 0 ? ei1.INSTANCE.i() : j19;
        long jI20 = (1048576 & i6) != 0 ? ei1.INSTANCE.i() : j20;
        long jI21 = (2097152 & i6) != 0 ? ei1.INSTANCE.i() : j21;
        long jI22 = (4194304 & i6) != 0 ? ei1.INSTANCE.i() : j22;
        long jI23 = (8388608 & i6) != 0 ? ei1.INSTANCE.i() : j23;
        long jI24 = (16777216 & i6) != 0 ? ei1.INSTANCE.i() : j24;
        long jI25 = (33554432 & i6) != 0 ? ei1.INSTANCE.i() : j25;
        long jI26 = (67108864 & i6) != 0 ? ei1.INSTANCE.i() : j26;
        long jI27 = (134217728 & i6) != 0 ? ei1.INSTANCE.i() : j27;
        long jI28 = (268435456 & i6) != 0 ? ei1.INSTANCE.i() : j28;
        long jI29 = (536870912 & i6) != 0 ? ei1.INSTANCE.i() : j29;
        long jI30 = (i6 & 1073741824) != 0 ? ei1.INSTANCE.i() : j30;
        long jI31 = (i7 & 1) != 0 ? ei1.INSTANCE.i() : j31;
        long jI32 = (i7 & 2) != 0 ? ei1.INSTANCE.i() : j32;
        long jI33 = (i7 & 4) != 0 ? ei1.INSTANCE.i() : j33;
        long jI34 = (i7 & 8) != 0 ? ei1.INSTANCE.i() : j34;
        long jI35 = (i7 & 16) != 0 ? ei1.INSTANCE.i() : j35;
        long jI36 = (i7 & 32) != 0 ? ei1.INSTANCE.i() : j36;
        long jI37 = (i7 & 64) != 0 ? ei1.INSTANCE.i() : j37;
        long jI38 = (i7 & 128) != 0 ? ei1.INSTANCE.i() : j38;
        long jI39 = (i7 & 256) != 0 ? ei1.INSTANCE.i() : j39;
        long jI40 = (i7 & 512) != 0 ? ei1.INSTANCE.i() : j40;
        long jI41 = (i7 & 1024) != 0 ? ei1.INSTANCE.i() : j41;
        long jI42 = (i7 & 2048) != 0 ? ei1.INSTANCE.i() : j42;
        if (e.k()) {
            e.o(1513344955, i, i2, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:580)");
        }
        psc pscVarC = m(kh7.a.a(dVar, 6), (SelectionColors) dVar.v(jzc.c())).c(j43, jI2, jI3, jI4, jI5, jI6, jI7, jI8, jI9, jI10, selectionColors2, jI11, jI12, jI13, jI14, jI15, jI16, jI17, jI18, jI19, jI20, jI21, jI22, jI23, jI24, jI25, jI26, jI27, jI28, jI29, jI30, jI31, jI32, jI33, jI34, jI35, jI36, jI37, jI38, jI39, jI40, jI41, jI42);
        if (e.k()) {
            e.n();
        }
        return pscVarC;
    }

    public final rx8 i(float start, float end, float top, float bottom) {
        return nx8.h(start, top, end, bottom);
    }

    public final rx8 k(float start, float top, float end, float bottom) {
        return nx8.h(start, top, end, bottom);
    }

    public final psc m(ColorScheme yi1Var, SelectionColors selectionColors) {
        psc pscVarN = yi1Var.getDefaultTextFieldColorsCached();
        if (pscVarN != null) {
            if (!Intrinsics.e(pscVarN.getTextSelectionColors(), selectionColors)) {
                pscVarN = pscVarN.c(((-1025) & 1) != 0 ? pscVarN.focusedTextColor : 0L, ((-1025) & 2) != 0 ? pscVarN.unfocusedTextColor : 0L, ((-1025) & 4) != 0 ? pscVarN.disabledTextColor : 0L, ((-1025) & 8) != 0 ? pscVarN.errorTextColor : 0L, ((-1025) & 16) != 0 ? pscVarN.focusedContainerColor : 0L, ((-1025) & 32) != 0 ? pscVarN.unfocusedContainerColor : 0L, ((-1025) & 64) != 0 ? pscVarN.disabledContainerColor : 0L, ((-1025) & 128) != 0 ? pscVarN.errorContainerColor : 0L, ((-1025) & 256) != 0 ? pscVarN.cursorColor : 0L, ((-1025) & 512) != 0 ? pscVarN.errorCursorColor : 0L, ((-1025) & 1024) != 0 ? pscVarN.textSelectionColors : selectionColors, ((-1025) & 2048) != 0 ? pscVarN.focusedIndicatorColor : 0L, ((-1025) & 4096) != 0 ? pscVarN.unfocusedIndicatorColor : 0L, ((-1025) & 8192) != 0 ? pscVarN.disabledIndicatorColor : 0L, ((-1025) & 16384) != 0 ? pscVarN.errorIndicatorColor : 0L, ((-1025) & 32768) != 0 ? pscVarN.focusedLeadingIconColor : 0L, ((-1025) & 65536) != 0 ? pscVarN.unfocusedLeadingIconColor : 0L, ((-1025) & 131072) != 0 ? pscVarN.disabledLeadingIconColor : 0L, ((-1025) & 262144) != 0 ? pscVarN.errorLeadingIconColor : 0L, ((-1025) & 524288) != 0 ? pscVarN.focusedTrailingIconColor : 0L, ((-1025) & 1048576) != 0 ? pscVarN.unfocusedTrailingIconColor : 0L, ((-1025) & 2097152) != 0 ? pscVarN.disabledTrailingIconColor : 0L, ((-1025) & 4194304) != 0 ? pscVarN.errorTrailingIconColor : 0L, ((-1025) & 8388608) != 0 ? pscVarN.focusedLabelColor : 0L, ((-1025) & 16777216) != 0 ? pscVarN.unfocusedLabelColor : 0L, ((-1025) & 33554432) != 0 ? pscVarN.disabledLabelColor : 0L, ((-1025) & 67108864) != 0 ? pscVarN.errorLabelColor : 0L, ((-1025) & 134217728) != 0 ? pscVarN.focusedPlaceholderColor : 0L, ((-1025) & 268435456) != 0 ? pscVarN.unfocusedPlaceholderColor : 0L, ((-1025) & 536870912) != 0 ? pscVarN.disabledPlaceholderColor : 0L, ((-1025) & 1073741824) != 0 ? pscVarN.errorPlaceholderColor : 0L, ((-1025) & t04.INVALID_ID) != 0 ? pscVarN.focusedSupportingTextColor : 0L, (2047 & 1) != 0 ? pscVarN.unfocusedSupportingTextColor : 0L, (2047 & 2) != 0 ? pscVarN.disabledSupportingTextColor : 0L, (2047 & 4) != 0 ? pscVarN.errorSupportingTextColor : 0L, (2047 & 8) != 0 ? pscVarN.focusedPrefixColor : 0L, (2047 & 16) != 0 ? pscVarN.unfocusedPrefixColor : 0L, (2047 & 32) != 0 ? pscVarN.disabledPrefixColor : 0L, (2047 & 64) != 0 ? pscVarN.errorPrefixColor : 0L, (2047 & 128) != 0 ? pscVarN.focusedSuffixColor : 0L, (2047 & 256) != 0 ? pscVarN.unfocusedSuffixColor : 0L, (2047 & 512) != 0 ? pscVarN.disabledSuffixColor : 0L, (2047 & 1024) != 0 ? pscVarN.errorSuffixColor : 0L);
                yi1Var.x0(pscVarN);
            }
            if (pscVarN != null) {
                return pscVarN;
            }
        }
        y94 y94Var = y94.a;
        psc pscVar = new psc(bj1.j(yi1Var, y94Var.y()), bj1.j(yi1Var, y94Var.D()), ei1.p(bj1.j(yi1Var, y94Var.g()), y94Var.h(), 0.0f, 0.0f, 0.0f, 14, null), bj1.j(yi1Var, y94Var.s()), bj1.j(yi1Var, y94Var.c()), bj1.j(yi1Var, y94Var.c()), bj1.j(yi1Var, y94Var.c()), bj1.j(yi1Var, y94Var.c()), bj1.j(yi1Var, y94Var.b()), bj1.j(yi1Var, y94Var.r()), selectionColors, bj1.j(yi1Var, y94Var.x()), bj1.j(yi1Var, y94Var.a()), ei1.p(bj1.j(yi1Var, y94Var.e()), y94Var.f(), 0.0f, 0.0f, 0.0f, 14, null), bj1.j(yi1Var, y94Var.q()), bj1.j(yi1Var, y94Var.A()), bj1.j(yi1Var, y94Var.I()), ei1.p(bj1.j(yi1Var, y94Var.k()), y94Var.l(), 0.0f, 0.0f, 0.0f, 14, null), bj1.j(yi1Var, y94Var.u()), bj1.j(yi1Var, y94Var.C()), bj1.j(yi1Var, y94Var.K()), ei1.p(bj1.j(yi1Var, y94Var.o()), y94Var.p(), 0.0f, 0.0f, 0.0f, 14, null), bj1.j(yi1Var, y94Var.w()), bj1.j(yi1Var, y94Var.z()), bj1.j(yi1Var, y94Var.H()), ei1.p(bj1.j(yi1Var, y94Var.i()), y94Var.j(), 0.0f, 0.0f, 0.0f, 14, null), bj1.j(yi1Var, y94Var.t()), bj1.j(yi1Var, y94Var.E()), bj1.j(yi1Var, y94Var.E()), ei1.p(bj1.j(yi1Var, y94Var.g()), y94Var.h(), 0.0f, 0.0f, 0.0f, 14, null), bj1.j(yi1Var, y94Var.E()), bj1.j(yi1Var, y94Var.B()), bj1.j(yi1Var, y94Var.J()), ei1.p(bj1.j(yi1Var, y94Var.m()), y94Var.n(), 0.0f, 0.0f, 0.0f, 14, null), bj1.j(yi1Var, y94Var.v()), bj1.j(yi1Var, y94Var.F()), bj1.j(yi1Var, y94Var.F()), ei1.p(bj1.j(yi1Var, y94Var.F()), y94Var.h(), 0.0f, 0.0f, 0.0f, 14, null), bj1.j(yi1Var, y94Var.F()), bj1.j(yi1Var, y94Var.G()), bj1.j(yi1Var, y94Var.G()), ei1.p(bj1.j(yi1Var, y94Var.G()), y94Var.h(), 0.0f, 0.0f, 0.0f, 14, null), bj1.j(yi1Var, y94Var.G()), null);
        yi1Var.x0(pscVar);
        return pscVar;
    }

    public final float n() {
        return FocusedIndicatorThickness;
    }

    public final float o() {
        return MinHeight;
    }

    public final float p() {
        return MinWidth;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final xkb q(d dVar, int i) throws NoWhenBranchMatchedException {
        if (e.k()) {
            e.o(-1941327459, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-shape> (TextFieldDefaults.kt:68)");
        }
        xkb xkbVarI = ulb.i(y94.a.d(), dVar, 6);
        if (e.k()) {
            e.n();
        }
        return xkbVarI;
    }

    public final float r() {
        return UnfocusedIndicatorThickness;
    }

    public final androidx.compose.ui.b s(androidx.compose.ui.b bVar, boolean z, boolean z2, j26 j26Var, psc pscVar, xkb xkbVar, float f, float f2) {
        return bVar.then(new IndicatorLineElement(z, z2, j26Var, pscVar, xkbVar, f, f2, null));
    }

    public final rx8 t(float start, float top, float end, float bottom) {
        return nx8.h(start, top, end, bottom);
    }
}
