package androidx.compose.p002material3;

import androidx.compose.p001foundation.interaction.FocusInteractionKt;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p002material3.OutlinedTextFieldDefaults;
import androidx.compose.p002material3.p003internal.TextFieldImplKt;
import androidx.compose.p002material3.p003internal.TextFieldType;
import androidx.compose.p002material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.android.ps4;
import com.google.inputmethod.BorderStroke;
import com.google.inputmethod.ColorScheme;
import com.google.inputmethod.SelectionColors;
import com.google.inputmethod.TransformedText;
import com.google.inputmethod.bj1;
import com.google.inputmethod.d08;
import com.google.inputmethod.do1;
import com.google.inputmethod.ei1;
import com.google.inputmethod.ff3;
import com.google.inputmethod.gr0;
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
import com.google.inputmethod.rx8;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.t04;
import com.google.inputmethod.ulb;
import com.google.inputmethod.xkb;
import com.google.inputmethod.yu8;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014Jñ\u0001\u0010&\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020#2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00120\u0017H\u0007¢\u0006\u0004\b&\u0010'J5\u0010,\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020\u000f2\b\b\u0002\u0010)\u001a\u00020\u000f2\b\b\u0002\u0010*\u001a\u00020\u000f2\b\b\u0002\u0010+\u001a\u00020\u000f¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000bH\u0007¢\u0006\u0004\b.\u0010/J¿\u0003\u0010]\u001a\u00020\u000b2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00102\u001a\u0002002\b\b\u0002\u00103\u001a\u0002002\b\b\u0002\u00104\u001a\u0002002\b\b\u0002\u00105\u001a\u0002002\b\b\u0002\u00106\u001a\u0002002\b\b\u0002\u00107\u001a\u0002002\b\b\u0002\u00108\u001a\u0002002\b\b\u0002\u00109\u001a\u0002002\b\b\u0002\u0010:\u001a\u0002002\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;2\b\b\u0002\u0010=\u001a\u0002002\b\b\u0002\u0010>\u001a\u0002002\b\b\u0002\u0010?\u001a\u0002002\b\b\u0002\u0010@\u001a\u0002002\b\b\u0002\u0010A\u001a\u0002002\b\b\u0002\u0010B\u001a\u0002002\b\b\u0002\u0010C\u001a\u0002002\b\b\u0002\u0010D\u001a\u0002002\b\b\u0002\u0010E\u001a\u0002002\b\b\u0002\u0010F\u001a\u0002002\b\b\u0002\u0010G\u001a\u0002002\b\b\u0002\u0010H\u001a\u0002002\b\b\u0002\u0010I\u001a\u0002002\b\b\u0002\u0010J\u001a\u0002002\b\b\u0002\u0010K\u001a\u0002002\b\b\u0002\u0010L\u001a\u0002002\b\b\u0002\u0010M\u001a\u0002002\b\b\u0002\u0010N\u001a\u0002002\b\b\u0002\u0010O\u001a\u0002002\b\b\u0002\u0010P\u001a\u0002002\b\b\u0002\u0010Q\u001a\u0002002\b\b\u0002\u0010R\u001a\u0002002\b\b\u0002\u0010S\u001a\u0002002\b\b\u0002\u0010T\u001a\u0002002\b\b\u0002\u0010U\u001a\u0002002\b\b\u0002\u0010V\u001a\u0002002\b\b\u0002\u0010W\u001a\u0002002\b\b\u0002\u0010X\u001a\u0002002\b\b\u0002\u0010Y\u001a\u0002002\b\b\u0002\u0010Z\u001a\u0002002\b\b\u0002\u0010[\u001a\u0002002\b\b\u0002\u0010\\\u001a\u000200H\u0007¢\u0006\u0004\b]\u0010^R\u0017\u0010c\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0017\u0010e\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010`\u001a\u0004\bd\u0010bR\u0017\u0010h\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bf\u0010`\u001a\u0004\bg\u0010bR\u0017\u0010j\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b&\u0010`\u001a\u0004\bi\u0010bR\u0011\u0010\u000e\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0018\u0010p\u001a\u00020\u000b*\u00020m8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bn\u0010o¨\u0006q"}, d2 = {"Landroidx/compose/material3/OutlinedTextFieldDefaults;", "", "<init>", "()V", "", "enabled", "isError", "Lcom/google/android/j26;", "interactionSource", "Landroidx/compose/ui/b;", "modifier", "Lcom/google/android/psc;", "colors", "Lcom/google/android/xkb;", "shape", "Lcom/google/android/ff3;", "focusedBorderThickness", "unfocusedBorderThickness", "", "c", "(ZZLcom/google/android/j26;Landroidx/compose/ui/b;Lcom/google/android/psc;Lcom/google/android/xkb;FFLandroidx/compose/runtime/d;II)V", "", "value", "Lkotlin/Function0;", "innerTextField", "singleLine", "Lcom/google/android/nce;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "Lcom/google/android/rx8;", "contentPadding", "container", "e", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLcom/google/android/nce;Lcom/google/android/j26;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lcom/google/android/psc;Lcom/google/android/rx8;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;III)V", "start", "top", "end", "bottom", "i", "(FFFF)Lcom/google/android/rx8;", "g", "(Landroidx/compose/runtime/d;I)Lcom/google/android/psc;", "Lcom/google/android/ei1;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Lcom/google/android/hzc;", "selectionColors", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "h", "(JJJJJJJJJJLcom/google/android/hzc;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/d;IIIIIII)Lcom/google/android/psc;", "b", "F", "m", "()F", "MinHeight", "n", "MinWidth", "d", "p", "UnfocusedBorderThickness", "l", "FocusedBorderThickness", "o", "(Landroidx/compose/runtime/d;I)Lcom/google/android/xkb;", "Lcom/google/android/yi1;", "k", "(Lcom/google/android/yi1;Landroidx/compose/runtime/d;I)Lcom/google/android/psc;", "defaultOutlinedTextFieldColors", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OutlinedTextFieldDefaults {
    public static final OutlinedTextFieldDefaults a = new OutlinedTextFieldDefaults();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final float MinHeight = ff3.i(56);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final float MinWidth = ff3.i(280);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final float UnfocusedBorderThickness = ff3.i(1);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final float FocusedBorderThickness = ff3.i(2);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements Function2<d, Integer, Unit> {
        final /* synthetic */ boolean a;
        final /* synthetic */ boolean b;
        final /* synthetic */ j26 c;
        final /* synthetic */ psc d;

        a(boolean z, boolean z2, j26 j26Var, psc pscVar) {
            this.a = z;
            this.b = z2;
            this.c = j26Var;
            this.d = pscVar;
        }

        public final void a(d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(-896270173, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1157)");
            }
            OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.a;
            outlinedTextFieldDefaults.c(this.a, this.b, this.c, androidx.compose.ui.b.INSTANCE, this.d, outlinedTextFieldDefaults.o(dVar, 6), outlinedTextFieldDefaults.l(), outlinedTextFieldDefaults.p(), dVar, 114822144, 0);
            if (e.k()) {
                e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
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
                e.o(-1459717586, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous>.<anonymous> (TextFieldDefaults.kt:1182)");
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

    private OutlinedTextFieldDefaults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(OutlinedTextFieldDefaults outlinedTextFieldDefaults, boolean z, boolean z2, j26 j26Var, androidx.compose.ui.b bVar, psc pscVar, xkb xkbVar, float f, float f2, int i, int i2, d dVar, int i3) {
        outlinedTextFieldDefaults.c(z, z2, j26Var, bVar, pscVar, xkbVar, f, f2, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(OutlinedTextFieldDefaults outlinedTextFieldDefaults, String str, Function2 function2, boolean z, boolean z2, nce nceVar, j26 j26Var, boolean z3, Function2 function3, Function2 function4, Function2 function5, Function2 function6, Function2 function7, Function2 function8, Function2 function9, psc pscVar, rx8 rx8Var, Function2 function10, int i, int i2, int i3, d dVar, int i4) {
        outlinedTextFieldDefaults.e(str, function2, z, z2, nceVar, j26Var, z3, function3, function4, function5, function6, function7, function8, function9, pscVar, rx8Var, function10, dVar, saa.a(i | 1), saa.a(i2), i3);
        return Unit.a;
    }

    public static /* synthetic */ rx8 j(OutlinedTextFieldDefaults outlinedTextFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
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
        return outlinedTextFieldDefaults.i(f, f2, f3, f4);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0106  */
    /* JADX WARN: Code duplicated, block: B:101:0x0108  */
    /* JADX WARN: Code duplicated, block: B:104:0x0111  */
    /* JADX WARN: Code duplicated, block: B:123:0x014e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x0150  */
    /* JADX WARN: Code duplicated, block: B:125:0x0153  */
    /* JADX WARN: Code duplicated, block: B:128:0x0158  */
    /* JADX WARN: Code duplicated, block: B:129:0x0163  */
    /* JADX WARN: Code duplicated, block: B:132:0x0168  */
    /* JADX WARN: Code duplicated, block: B:133:0x0171  */
    /* JADX WARN: Code duplicated, block: B:136:0x0176  */
    /* JADX WARN: Code duplicated, block: B:137:0x017b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0180  */
    /* JADX WARN: Code duplicated, block: B:141:0x018b  */
    /* JADX WARN: Code duplicated, block: B:144:0x019a  */
    /* JADX WARN: Code duplicated, block: B:147:0x0209  */
    /* JADX WARN: Code duplicated, block: B:149:0x0212  */
    /* JADX WARN: Code duplicated, block: B:152:0x0221  */
    /* JADX WARN: Code duplicated, block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
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
    public final void c(final boolean z, final boolean z2, final j26 j26Var, androidx.compose.ui.b bVar, psc pscVar, xkb xkbVar, float f, float f2, d dVar, final int i, final int i2) {
        int i3;
        androidx.compose.ui.b bVar2;
        psc pscVar2;
        xkb xkbVar2;
        float f3;
        float f4;
        int i4;
        boolean z3;
        d dVar2;
        final androidx.compose.ui.b bVar3;
        final psc pscVar3;
        final xkb xkbVar3;
        final float f5;
        final float f6;
        s6b s6bVarH;
        androidx.compose.ui.b bVar4;
        psc pscVarG;
        xkb xkbVarO;
        float f7;
        androidx.compose.ui.b bVar5;
        int i5;
        psc pscVar4;
        xkb xkbVar4;
        float f8;
        float f9;
        d dVarF = dVar.F(1035477640);
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
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    pscVar2 = pscVar;
                    int i7 = dVarF.x(pscVar2) ? 16384 : 8192;
                    i3 |= i7;
                } else {
                    pscVar2 = pscVar;
                }
                i3 |= i7;
            } else {
                pscVar2 = pscVar;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    xkbVar2 = xkbVar;
                    int i8 = dVarF.x(xkbVar2) ? 131072 : 65536;
                    i3 |= i8;
                } else {
                    xkbVar2 = xkbVar;
                }
                i3 |= i8;
            } else {
                xkbVar2 = xkbVar;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    f3 = f;
                    int i9 = dVarF.B(f3) ? 1048576 : 524288;
                    i3 |= i9;
                } else {
                    f3 = f;
                }
                i3 |= i9;
            } else {
                f3 = f;
            }
            if ((12582912 & i) == 0) {
                if ((i2 & 128) == 0) {
                    f4 = f2;
                    int i10 = dVarF.B(f4) ? 8388608 : 4194304;
                    i3 |= i10;
                } else {
                    f4 = f2;
                }
                i3 |= i10;
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
                        bVar4 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i2 & 16) != 0) {
                        pscVarG = g(dVarF, (i3 >> 24) & 14);
                        i3 &= -57345;
                    } else {
                        pscVarG = pscVar2;
                    }
                    if ((i2 & 32) != 0) {
                        xkbVarO = a.o(dVarF, 6);
                        i3 &= -458753;
                    } else {
                        xkbVarO = xkbVar2;
                    }
                    if ((i2 & 64) != 0) {
                        f7 = FocusedBorderThickness;
                        i3 &= -3670017;
                    } else {
                        f7 = f3;
                    }
                    if ((i2 & 128) != 0) {
                        xkbVar4 = xkbVarO;
                        f9 = UnfocusedBorderThickness;
                        bVar5 = bVar4;
                        i5 = i3 & (-29360129);
                        pscVar4 = pscVarG;
                        f8 = f7;
                    } else {
                        bVar5 = bVar4;
                        i5 = i3;
                        pscVar4 = pscVarG;
                        xkbVar4 = xkbVarO;
                        f8 = f7;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(1035477640, i5, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.Container (TextFieldDefaults.kt:1054)");
                    }
                    int i11 = i5 >> 6;
                    boolean zBooleanValue = FocusInteractionKt.a(j26Var, dVarF, i11 & 14).getValue().booleanValue();
                    q6c<BorderStroke> q6cVarY = TextFieldImplKt.y(z, z2, zBooleanValue, pscVar4, f8, f9, dVarF, (i11 & 458752) | ((i5 >> 3) & 7168) | (i5 & 126) | (57344 & i11));
                    androidx.compose.ui.b bVar6 = bVar5;
                    xkb xkbVar5 = xkbVar4;
                    final q6c<ei1> q6cVarB = osb.b(pscVar4.b(z, z2, zBooleanValue), d08.b(MotionSchemeKeyTokens.FastEffects, dVarF, 6), null, null, dVarF, 0, 12);
                    dVar2 = dVarF;
                    j.b(TextFieldImplKt.N(gr0.g(bVar6, q6cVarY.getValue(), xkbVar5), new TextFieldDefaults.c(new PropertyReference0Impl(q6cVarB) { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$Container$1
                        public Object get() {
                            return ((q6c) ((CallableReference) this).receiver).getValue();
                        }
                    }), xkbVar5), dVar2, 0);
                    if (e.k()) {
                        e.n();
                    }
                    f5 = f8;
                    f6 = f9;
                    xkbVar3 = xkbVar5;
                    pscVar3 = pscVar4;
                    bVar3 = bVar6;
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
                    i5 = i3;
                    pscVar4 = pscVar2;
                    f8 = f3;
                    xkbVar4 = xkbVar2;
                    bVar5 = bVar2;
                }
                f9 = f4;
                dVarF.M();
                if (e.k()) {
                    e.o(1035477640, i5, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.Container (TextFieldDefaults.kt:1054)");
                }
                int i12 = i5 >> 6;
                boolean zBooleanValue2 = FocusInteractionKt.a(j26Var, dVarF, i12 & 14).getValue().booleanValue();
                q6c<BorderStroke> q6cVarY2 = TextFieldImplKt.y(z, z2, zBooleanValue2, pscVar4, f8, f9, dVarF, (i12 & 458752) | ((i5 >> 3) & 7168) | (i5 & 126) | (57344 & i12));
                androidx.compose.ui.b bVar7 = bVar5;
                xkb xkbVar6 = xkbVar4;
                final Object q6cVarB2 = osb.b(pscVar4.b(z, z2, zBooleanValue2), d08.b(MotionSchemeKeyTokens.FastEffects, dVarF, 6), null, null, dVarF, 0, 12);
                dVar2 = dVarF;
                j.b(TextFieldImplKt.N(gr0.g(bVar7, q6cVarY2.getValue(), xkbVar6), new TextFieldDefaults.c(new PropertyReference0Impl(q6cVarB2) { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$Container$1
                    public Object get() {
                        return ((q6c) ((CallableReference) this).receiver).getValue();
                    }
                }), xkbVar6), dVar2, 0);
                if (e.k()) {
                    e.n();
                }
                f5 = f8;
                f6 = f9;
                xkbVar3 = xkbVar6;
                pscVar3 = pscVar4;
                bVar3 = bVar7;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar3 = bVar2;
                pscVar3 = pscVar2;
                xkbVar3 = xkbVar2;
                f5 = f3;
                f6 = f4;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.ru8
                    public final Object invoke(Object obj, Object obj2) {
                        return OutlinedTextFieldDefaults.d(this.a, z, z2, j26Var, bVar3, pscVar3, xkbVar3, f5, f6, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 3072;
        bVar2 = bVar;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                pscVar2 = pscVar;
                if (dVarF.x(pscVar2)) {
                }
                i3 |= i7;
            } else {
                pscVar2 = pscVar;
            }
            i3 |= i7;
        } else {
            pscVar2 = pscVar;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                xkbVar2 = xkbVar;
                if (dVarF.x(xkbVar2)) {
                }
                i3 |= i8;
            } else {
                xkbVar2 = xkbVar;
            }
            i3 |= i8;
        } else {
            xkbVar2 = xkbVar;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                f3 = f;
                if (dVarF.B(f3)) {
                }
                i3 |= i9;
            } else {
                f3 = f;
            }
            i3 |= i9;
        } else {
            f3 = f;
        }
        if ((12582912 & i) == 0) {
            if ((i2 & 128) == 0) {
                f4 = f2;
                if (dVarF.B(f4)) {
                }
                i3 |= i10;
            } else {
                f4 = f2;
            }
            i3 |= i10;
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
                    bVar4 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if ((i2 & 16) != 0) {
                    pscVarG = g(dVarF, (i3 >> 24) & 14);
                    i3 &= -57345;
                } else {
                    pscVarG = pscVar2;
                }
                if ((i2 & 32) != 0) {
                    xkbVarO = a.o(dVarF, 6);
                    i3 &= -458753;
                } else {
                    xkbVarO = xkbVar2;
                }
                if ((i2 & 64) != 0) {
                    f7 = FocusedBorderThickness;
                    i3 &= -3670017;
                } else {
                    f7 = f3;
                }
                if ((i2 & 128) != 0) {
                    xkbVar4 = xkbVarO;
                    f9 = UnfocusedBorderThickness;
                    bVar5 = bVar4;
                    i5 = i3 & (-29360129);
                    pscVar4 = pscVarG;
                    f8 = f7;
                } else {
                    bVar5 = bVar4;
                    i5 = i3;
                    pscVar4 = pscVarG;
                    xkbVar4 = xkbVarO;
                    f8 = f7;
                    f9 = f4;
                }
            } else {
                if (i6 != 0) {
                    bVar4 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if ((i2 & 16) != 0) {
                    pscVarG = g(dVarF, (i3 >> 24) & 14);
                    i3 &= -57345;
                } else {
                    pscVarG = pscVar2;
                }
                if ((i2 & 32) != 0) {
                    xkbVarO = a.o(dVarF, 6);
                    i3 &= -458753;
                } else {
                    xkbVarO = xkbVar2;
                }
                if ((i2 & 64) != 0) {
                    f7 = FocusedBorderThickness;
                    i3 &= -3670017;
                } else {
                    f7 = f3;
                }
                if ((i2 & 128) != 0) {
                    xkbVar4 = xkbVarO;
                    f9 = UnfocusedBorderThickness;
                    bVar5 = bVar4;
                    i5 = i3 & (-29360129);
                    pscVar4 = pscVarG;
                    f8 = f7;
                } else {
                    bVar5 = bVar4;
                    i5 = i3;
                    pscVar4 = pscVarG;
                    xkbVar4 = xkbVarO;
                    f8 = f7;
                    f9 = f4;
                }
            }
            dVarF.M();
            if (e.k()) {
                e.o(1035477640, i5, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.Container (TextFieldDefaults.kt:1054)");
            }
            int i13 = i5 >> 6;
            boolean zBooleanValue3 = FocusInteractionKt.a(j26Var, dVarF, i13 & 14).getValue().booleanValue();
            q6c<BorderStroke> q6cVarY3 = TextFieldImplKt.y(z, z2, zBooleanValue3, pscVar4, f8, f9, dVarF, (i13 & 458752) | ((i5 >> 3) & 7168) | (i5 & 126) | (57344 & i13));
            androidx.compose.ui.b bVar8 = bVar5;
            xkb xkbVar7 = xkbVar4;
            final Object q6cVarB3 = osb.b(pscVar4.b(z, z2, zBooleanValue3), d08.b(MotionSchemeKeyTokens.FastEffects, dVarF, 6), null, null, dVarF, 0, 12);
            dVar2 = dVarF;
            j.b(TextFieldImplKt.N(gr0.g(bVar8, q6cVarY3.getValue(), xkbVar7), new TextFieldDefaults.c(new PropertyReference0Impl(q6cVarB3) { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$Container$1
                public Object get() {
                    return ((q6c) ((CallableReference) this).receiver).getValue();
                }
            }), xkbVar7), dVar2, 0);
            if (e.k()) {
                e.n();
            }
            f5 = f8;
            f6 = f9;
            xkbVar3 = xkbVar7;
            pscVar3 = pscVar4;
            bVar3 = bVar8;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            bVar3 = bVar2;
            pscVar3 = pscVar2;
            xkbVar3 = xkbVar2;
            f5 = f3;
            f6 = f4;
        }
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.ru8
                public final Object invoke(Object obj, Object obj2) {
                    return OutlinedTextFieldDefaults.d(this.a, z, z2, j26Var, bVar3, pscVar3, xkbVar3, f5, f6, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0125  */
    /* JADX WARN: Code duplicated, block: B:102:0x0129  */
    /* JADX WARN: Code duplicated, block: B:104:0x0133  */
    /* JADX WARN: Code duplicated, block: B:105:0x0136  */
    /* JADX WARN: Code duplicated, block: B:109:0x013e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0147  */
    /* JADX WARN: Code duplicated, block: B:112:0x014b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0155  */
    /* JADX WARN: Code duplicated, block: B:115:0x0158  */
    /* JADX WARN: Code duplicated, block: B:117:0x015d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0167  */
    /* JADX WARN: Code duplicated, block: B:122:0x016e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0172  */
    /* JADX WARN: Code duplicated, block: B:126:0x017c  */
    /* JADX WARN: Code duplicated, block: B:127:0x017f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0184  */
    /* JADX WARN: Code duplicated, block: B:132:0x018d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0190  */
    /* JADX WARN: Code duplicated, block: B:135:0x0196  */
    /* JADX WARN: Code duplicated, block: B:137:0x019e  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01af  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:146:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:152:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:157:0x01db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:162:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:164:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:167:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:169:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:172:0x0205  */
    /* JADX WARN: Code duplicated, block: B:173:0x020a  */
    /* JADX WARN: Code duplicated, block: B:175:0x0210  */
    /* JADX WARN: Code duplicated, block: B:177:0x0216  */
    /* JADX WARN: Code duplicated, block: B:178:0x0219  */
    /* JADX WARN: Code duplicated, block: B:182:0x0221  */
    /* JADX WARN: Code duplicated, block: B:183:0x0224  */
    /* JADX WARN: Code duplicated, block: B:185:0x0228  */
    /* JADX WARN: Code duplicated, block: B:187:0x022e  */
    /* JADX WARN: Code duplicated, block: B:188:0x0231  */
    /* JADX WARN: Code duplicated, block: B:192:0x0243  */
    /* JADX WARN: Code duplicated, block: B:196:0x0251  */
    /* JADX WARN: Code duplicated, block: B:199:0x025a  */
    /* JADX WARN: Code duplicated, block: B:201:0x0261  */
    /* JADX WARN: Code duplicated, block: B:211:0x029c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:212:0x029e  */
    /* JADX WARN: Code duplicated, block: B:213:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:215:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:217:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:218:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:220:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:221:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:223:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:224:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:226:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:227:0x02be  */
    /* JADX WARN: Code duplicated, block: B:229:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:230:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:232:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:233:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:236:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:237:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:240:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:241:0x030d  */
    /* JADX WARN: Code duplicated, block: B:243:0x0311  */
    /* JADX WARN: Code duplicated, block: B:244:0x033f  */
    /* JADX WARN: Code duplicated, block: B:247:0x0368  */
    /* JADX WARN: Code duplicated, block: B:250:0x0375  */
    /* JADX WARN: Code duplicated, block: B:251:0x0378  */
    /* JADX WARN: Code duplicated, block: B:254:0x0384  */
    /* JADX WARN: Code duplicated, block: B:257:0x038e  */
    /* JADX WARN: Code duplicated, block: B:261:0x039b  */
    /* JADX WARN: Code duplicated, block: B:264:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:265:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:268:0x0464  */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:270:0x0478  */
    /* JADX WARN: Code duplicated, block: B:273:0x0498  */
    /* JADX WARN: Code duplicated, block: B:275:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00de  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x0103  */
    /* JADX WARN: Code duplicated, block: B:91:0x0107  */
    /* JADX WARN: Code duplicated, block: B:93:0x0111  */
    /* JADX WARN: Code duplicated, block: B:94:0x0114  */
    /* JADX WARN: Code duplicated, block: B:98:0x011e  */
    public final void e(final String str, final Function2<? super d, ? super Integer, Unit> function2, final boolean z, final boolean z2, final nce nceVar, final j26 j26Var, boolean z3, Function2<? super d, ? super Integer, Unit> function3, Function2<? super d, ? super Integer, Unit> function4, Function2<? super d, ? super Integer, Unit> function5, Function2<? super d, ? super Integer, Unit> function6, Function2<? super d, ? super Integer, Unit> function7, Function2<? super d, ? super Integer, Unit> function8, Function2<? super d, ? super Integer, Unit> function9, psc pscVar, rx8 rx8Var, Function2<? super d, ? super Integer, Unit> function10, d dVar, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z4;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Function2<? super d, ? super Integer, Unit> function11;
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
        boolean z5;
        d dVar2;
        final boolean z6;
        final Function2<? super d, ? super Integer, Unit> function12;
        final Function2<? super d, ? super Integer, Unit> function13;
        final Function2<? super d, ? super Integer, Unit> function14;
        final Function2<? super d, ? super Integer, Unit> function15;
        final Function2<? super d, ? super Integer, Unit> function16;
        final psc pscVar2;
        final rx8 rx8Var2;
        final Function2<? super d, ? super Integer, Unit> function17;
        final Function2<? super d, ? super Integer, Unit> function18;
        final Function2<? super d, ? super Integer, Unit> function19;
        s6b s6bVarH;
        boolean z7;
        Function2<? super d, ? super Integer, Unit> function20;
        Function2<? super d, ? super Integer, Unit> function21;
        Function2<? super d, ? super Integer, Unit> function22;
        Function2<? super d, ? super Integer, Unit> function23;
        Function2<? super d, ? super Integer, Unit> function24;
        Function2<? super d, ? super Integer, Unit> function25;
        psc pscVarG;
        rx8 rx8VarJ;
        rx8 rx8Var3;
        Function2<? super d, ? super Integer, Unit> function26;
        Function2<? super d, ? super Integer, Unit> function27;
        Function2<? super d, ? super Integer, Unit> function28;
        int i31;
        Function2<? super d, ? super Integer, Unit> function29;
        Function2<? super d, ? super Integer, Unit> function30;
        Function2<? super d, ? super Integer, Unit> function31;
        boolean z8;
        psc pscVar3;
        boolean z9;
        Function2<? super d, ? super Integer, Unit> function32;
        boolean z10;
        boolean z11;
        Object objR;
        Object obj;
        do1 do1VarE;
        int i32;
        d dVarF = dVar.F(-1732281618);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (dVarF.x(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) == 0) {
            if ((i & 48) == 0) {
                i4 |= dVarF.T(function2) ? 32 : 16;
            }
            if ((i3 & 4) != 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                if (dVarF.A(z)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i4 |= i5;
            }
            if ((i3 & 8) != 0) {
                if ((i & 3072) == 0) {
                    z4 = z2;
                    if (dVarF.A(z4)) {
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
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (dVarF.x(j26Var)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (dVarF.A(z3)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                    i4 |= 12582912;
                    function11 = function3;
                } else {
                    function11 = function3;
                    if ((i & 12582912) == 0) {
                        if (dVarF.T(function11)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i4 |= i13;
                    }
                }
                i14 = i3 & 256;
                if (i14 != 0) {
                    if ((i & 100663296) == 0) {
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
                            i25 = i23 | (dVarF.T(function8) ? 256 : 128);
                        } else {
                            i25 = i23;
                        }
                        i26 = i3 & 8192;
                        if (i26 != 0) {
                            i27 = i25;
                            if ((i2 & 3072) == 0) {
                                i27 |= dVarF.T(function9) ? 2048 : 1024;
                            }
                            if ((i2 & 24576) != 0) {
                                if ((i3 & 16384) == 0 && dVarF.x(pscVar)) {
                                    i7 = 16384;
                                }
                                i27 |= i7;
                            }
                            if ((i2 & 196608) != 0) {
                                if ((i3 & 32768) == 0 || !dVarF.x(rx8Var)) {
                                    i32 = 65536;
                                } else {
                                    i32 = 131072;
                                }
                                i27 |= i32;
                            }
                            i28 = i3 & 65536;
                            if (i28 != 0) {
                                i27 |= 1572864;
                            } else if ((i2 & 1572864) == 0) {
                                if (dVarF.T(function10)) {
                                    i29 = 1048576;
                                } else {
                                    i29 = 524288;
                                }
                                i27 |= i29;
                            }
                            if ((i3 & 131072) != 0) {
                                i27 |= 12582912;
                            } else if ((i2 & 12582912) == 0) {
                                if (dVarF.x(this)) {
                                    i30 = 8388608;
                                } else {
                                    i30 = 4194304;
                                }
                                i27 |= i30;
                            }
                            if ((i4 & 306783379) == 306783378 || (i27 & 4793491) != 4793490) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (dVarF.g(z5, i4 & 1)) {
                                dVarF.U();
                                if ((i & 1) != 0 || dVarF.t()) {
                                    if (i10 != 0) {
                                        z7 = false;
                                    } else {
                                        z7 = z3;
                                    }
                                    if (i12 != 0) {
                                        function11 = null;
                                    }
                                    if (i14 != 0) {
                                        function20 = null;
                                    } else {
                                        function20 = function4;
                                    }
                                    if (i16 != 0) {
                                        function21 = null;
                                    } else {
                                        function21 = function5;
                                    }
                                    if (i18 != 0) {
                                        function22 = null;
                                    } else {
                                        function22 = function6;
                                    }
                                    if (i21 != 0) {
                                        function23 = null;
                                    } else {
                                        function23 = function7;
                                    }
                                    if (i24 != 0) {
                                        function24 = null;
                                    } else {
                                        function24 = function8;
                                    }
                                    if (i26 != 0) {
                                        function25 = null;
                                    } else {
                                        function25 = function9;
                                    }
                                    if ((i3 & 16384) != 0) {
                                        pscVarG = g(dVarF, (i27 >> 21) & 14);
                                        i27 &= -57345;
                                    } else {
                                        pscVarG = pscVar;
                                    }
                                    if ((i3 & 32768) != 0) {
                                        rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        i27 &= -458753;
                                    } else {
                                        rx8VarJ = rx8Var;
                                    }
                                    if (i28 != 0) {
                                        rx8 rx8Var4 = rx8VarJ;
                                        boolean z12 = z7;
                                        psc pscVar4 = pscVarG;
                                        do1 do1VarE2 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                        rx8Var3 = rx8Var4;
                                        function27 = function21;
                                        function28 = function24;
                                        function29 = function25;
                                        function31 = function23;
                                        z8 = z12;
                                        function32 = do1VarE2;
                                        function26 = function11;
                                        function30 = function22;
                                        z9 = true;
                                        i31 = i27;
                                        pscVar3 = pscVar4;
                                    } else {
                                        boolean z13 = z7;
                                        psc pscVar5 = pscVarG;
                                        rx8Var3 = rx8VarJ;
                                        function26 = function11;
                                        function27 = function21;
                                        function28 = function24;
                                        i31 = i27;
                                        function29 = function25;
                                        function30 = function22;
                                        function31 = function23;
                                        z8 = z13;
                                        pscVar3 = pscVar5;
                                        z9 = true;
                                        function32 = function10;
                                    }
                                } else {
                                    dVarF.q();
                                    if ((i3 & 16384) != 0) {
                                        i27 &= -57345;
                                    }
                                    if ((32768 & i3) != 0) {
                                        i27 &= -458753;
                                    }
                                    z8 = z3;
                                    function20 = function4;
                                    function27 = function5;
                                    function31 = function7;
                                    function28 = function8;
                                    function29 = function9;
                                    rx8Var3 = rx8Var;
                                    function32 = function10;
                                    function26 = function11;
                                    i31 = i27;
                                    z9 = true;
                                    function30 = function6;
                                    pscVar3 = pscVar;
                                }
                                dVarF.M();
                                Function2<? super d, ? super Integer, Unit> function33 = function28;
                                if (e.k()) {
                                    e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                                }
                                if ((i4 & 14) == 4) {
                                    z10 = z9;
                                } else {
                                    z10 = r19;
                                }
                                z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                                objR = dVarF.R();
                                if (!z11 || objR == d.INSTANCE.a()) {
                                    obj = null;
                                    objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                                    dVarF.L(objR);
                                } else {
                                    obj = null;
                                }
                                String text = ((TransformedText) objR).getText().getText();
                                TextFieldType textFieldType = TextFieldType.Outlined;
                                v1.Attached attached = new v1.Attached(false, null, null, 7, null);
                                if (function26 == null) {
                                    dVarF.y(1927058812);
                                    dVarF.u();
                                    do1VarE = null;
                                } else {
                                    dVarF.y(1927058813);
                                    do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                                    dVarF.u();
                                }
                                int i33 = i4 >> 9;
                                int i34 = i31 << 21;
                                int i35 = ((i4 << 3) & 896) | 6 | (458752 & i33) | (3670016 & i33) | (i34 & 29360128) | (i34 & 234881024) | (i34 & 1879048192);
                                int i36 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i33 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                                dVar2 = dVarF;
                                Function2<? super d, ? super Integer, Unit> function34 = function20;
                                TextFieldImplKt.l(textFieldType, text, function2, attached, do1VarE, function34, function27, function30, function31, function33, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i35, i36);
                                if (e.k()) {
                                    e.n();
                                }
                                function15 = function33;
                                function16 = function29;
                                rx8Var2 = rx8Var3;
                                function17 = function32;
                                function13 = function30;
                                function14 = function31;
                                function19 = function34;
                                function12 = function27;
                                z6 = z8;
                                pscVar2 = pscVar3;
                                function18 = function26;
                            } else {
                                dVar2 = dVarF;
                                dVar2.q();
                                z6 = z3;
                                function12 = function5;
                                function13 = function6;
                                function14 = function7;
                                function15 = function8;
                                function16 = function9;
                                pscVar2 = pscVar;
                                rx8Var2 = rx8Var;
                                function17 = function10;
                                function18 = function11;
                                function19 = function4;
                            }
                            s6bVarH = dVar2.H();
                            if (s6bVarH != null) {
                                s6bVarH.a(new Function2() { // from class: com.google.android.su8
                                    public final Object invoke(Object obj2, Object obj3) {
                                        return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
                                    }
                                });
                            }
                        }
                        i27 = i25 | 3072;
                        if ((i2 & 24576) != 0) {
                            if ((i3 & 16384) == 0) {
                                i7 = 16384;
                            }
                            i27 |= i7;
                        }
                        if ((i2 & 196608) != 0) {
                            if ((i3 & 32768) == 0) {
                                i32 = 65536;
                            } else {
                                i32 = 65536;
                            }
                            i27 |= i32;
                        }
                        i28 = i3 & 65536;
                        if (i28 != 0) {
                            i27 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            if (dVarF.T(function10)) {
                                i29 = 1048576;
                            } else {
                                i29 = 524288;
                            }
                            i27 |= i29;
                        }
                        if ((i3 & 131072) != 0) {
                            i27 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            if (dVarF.x(this)) {
                                i30 = 8388608;
                            } else {
                                i30 = 4194304;
                            }
                            i27 |= i30;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        if (dVarF.g(z5, i4 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i10 != 0) {
                                    z7 = false;
                                } else {
                                    z7 = z3;
                                }
                                if (i12 != 0) {
                                    function11 = null;
                                }
                                if (i14 != 0) {
                                    function20 = null;
                                } else {
                                    function20 = function4;
                                }
                                if (i16 != 0) {
                                    function21 = null;
                                } else {
                                    function21 = function5;
                                }
                                if (i18 != 0) {
                                    function22 = null;
                                } else {
                                    function22 = function6;
                                }
                                if (i21 != 0) {
                                    function23 = null;
                                } else {
                                    function23 = function7;
                                }
                                if (i24 != 0) {
                                    function24 = null;
                                } else {
                                    function24 = function8;
                                }
                                if (i26 != 0) {
                                    function25 = null;
                                } else {
                                    function25 = function9;
                                }
                                if ((i3 & 16384) != 0) {
                                    pscVarG = g(dVarF, (i27 >> 21) & 14);
                                    i27 &= -57345;
                                } else {
                                    pscVarG = pscVar;
                                }
                                if ((i3 & 32768) != 0) {
                                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i27 &= -458753;
                                } else {
                                    rx8VarJ = rx8Var;
                                }
                                if (i28 != 0) {
                                    rx8 rx8Var5 = rx8VarJ;
                                    boolean z14 = z7;
                                    psc pscVar6 = pscVarG;
                                    do1 do1VarE3 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                    rx8Var3 = rx8Var5;
                                    function27 = function21;
                                    function28 = function24;
                                    function29 = function25;
                                    function31 = function23;
                                    z8 = z14;
                                    function32 = do1VarE3;
                                    function26 = function11;
                                    function30 = function22;
                                    z9 = true;
                                    i31 = i27;
                                    pscVar3 = pscVar6;
                                } else {
                                    boolean z15 = z7;
                                    psc pscVar7 = pscVarG;
                                    rx8Var3 = rx8VarJ;
                                    function26 = function11;
                                    function27 = function21;
                                    function28 = function24;
                                    i31 = i27;
                                    function29 = function25;
                                    function30 = function22;
                                    function31 = function23;
                                    z8 = z15;
                                    pscVar3 = pscVar7;
                                    z9 = true;
                                    function32 = function10;
                                }
                            } else {
                                if (i10 != 0) {
                                    z7 = false;
                                } else {
                                    z7 = z3;
                                }
                                if (i12 != 0) {
                                    function11 = null;
                                }
                                if (i14 != 0) {
                                    function20 = null;
                                } else {
                                    function20 = function4;
                                }
                                if (i16 != 0) {
                                    function21 = null;
                                } else {
                                    function21 = function5;
                                }
                                if (i18 != 0) {
                                    function22 = null;
                                } else {
                                    function22 = function6;
                                }
                                if (i21 != 0) {
                                    function23 = null;
                                } else {
                                    function23 = function7;
                                }
                                if (i24 != 0) {
                                    function24 = null;
                                } else {
                                    function24 = function8;
                                }
                                if (i26 != 0) {
                                    function25 = null;
                                } else {
                                    function25 = function9;
                                }
                                if ((i3 & 16384) != 0) {
                                    pscVarG = g(dVarF, (i27 >> 21) & 14);
                                    i27 &= -57345;
                                } else {
                                    pscVarG = pscVar;
                                }
                                if ((i3 & 32768) != 0) {
                                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i27 &= -458753;
                                } else {
                                    rx8VarJ = rx8Var;
                                }
                                if (i28 != 0) {
                                    rx8 rx8Var6 = rx8VarJ;
                                    boolean z16 = z7;
                                    psc pscVar8 = pscVarG;
                                    do1 do1VarE4 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                    rx8Var3 = rx8Var6;
                                    function27 = function21;
                                    function28 = function24;
                                    function29 = function25;
                                    function31 = function23;
                                    z8 = z16;
                                    function32 = do1VarE4;
                                    function26 = function11;
                                    function30 = function22;
                                    z9 = true;
                                    i31 = i27;
                                    pscVar3 = pscVar8;
                                } else {
                                    boolean z17 = z7;
                                    psc pscVar9 = pscVarG;
                                    rx8Var3 = rx8VarJ;
                                    function26 = function11;
                                    function27 = function21;
                                    function28 = function24;
                                    i31 = i27;
                                    function29 = function25;
                                    function30 = function22;
                                    function31 = function23;
                                    z8 = z17;
                                    pscVar3 = pscVar9;
                                    z9 = true;
                                    function32 = function10;
                                }
                            }
                            dVarF.M();
                            Function2<? super d, ? super Integer, Unit> function35 = function28;
                            if (e.k()) {
                                e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                            }
                            if ((i4 & 14) == 4) {
                                z10 = z9;
                            } else {
                                z10 = r19;
                            }
                            z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                            objR = dVarF.R();
                            if (z11) {
                                obj = null;
                                objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                                dVarF.L(objR);
                            } else {
                                obj = null;
                                objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                                dVarF.L(objR);
                            }
                            String text2 = ((TransformedText) objR).getText().getText();
                            TextFieldType textFieldType2 = TextFieldType.Outlined;
                            v1.Attached attached2 = new v1.Attached(false, null, null, 7, null);
                            if (function26 == null) {
                                dVarF.y(1927058812);
                                dVarF.u();
                                do1VarE = null;
                            } else {
                                dVarF.y(1927058813);
                                do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                                dVarF.u();
                            }
                            int i37 = i4 >> 9;
                            int i38 = i31 << 21;
                            int i39 = ((i4 << 3) & 896) | 6 | (458752 & i37) | (3670016 & i37) | (i38 & 29360128) | (i38 & 234881024) | (i38 & 1879048192);
                            int i310 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i37 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                            dVar2 = dVarF;
                            Function2<? super d, ? super Integer, Unit> function36 = function20;
                            TextFieldImplKt.l(textFieldType2, text2, function2, attached2, do1VarE, function36, function27, function30, function31, function35, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i39, i310);
                            if (e.k()) {
                                e.n();
                            }
                            function15 = function35;
                            function16 = function29;
                            rx8Var2 = rx8Var3;
                            function17 = function32;
                            function13 = function30;
                            function14 = function31;
                            function19 = function36;
                            function12 = function27;
                            z6 = z8;
                            pscVar2 = pscVar3;
                            function18 = function26;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            z6 = z3;
                            function12 = function5;
                            function13 = function6;
                            function14 = function7;
                            function15 = function8;
                            function16 = function9;
                            pscVar2 = pscVar;
                            rx8Var2 = rx8Var;
                            function17 = function10;
                            function18 = function11;
                            function19 = function4;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.su8
                                public final Object invoke(Object obj2, Object obj3) {
                                    return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
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
                        i25 = i23 | (dVarF.T(function8) ? 256 : 128);
                    } else {
                        i25 = i23;
                    }
                    i26 = i3 & 8192;
                    if (i26 != 0) {
                        i27 = i25;
                        if ((i2 & 3072) == 0) {
                            i27 |= dVarF.T(function9) ? 2048 : 1024;
                        }
                        if ((i2 & 24576) != 0) {
                            if ((i3 & 16384) == 0) {
                                i7 = 16384;
                            }
                            i27 |= i7;
                        }
                        if ((i2 & 196608) != 0) {
                            if ((i3 & 32768) == 0) {
                                i32 = 65536;
                            } else {
                                i32 = 65536;
                            }
                            i27 |= i32;
                        }
                        i28 = i3 & 65536;
                        if (i28 != 0) {
                            i27 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            if (dVarF.T(function10)) {
                                i29 = 1048576;
                            } else {
                                i29 = 524288;
                            }
                            i27 |= i29;
                        }
                        if ((i3 & 131072) != 0) {
                            i27 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            if (dVarF.x(this)) {
                                i30 = 8388608;
                            } else {
                                i30 = 4194304;
                            }
                            i27 |= i30;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        if (dVarF.g(z5, i4 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i10 != 0) {
                                    z7 = false;
                                } else {
                                    z7 = z3;
                                }
                                if (i12 != 0) {
                                    function11 = null;
                                }
                                if (i14 != 0) {
                                    function20 = null;
                                } else {
                                    function20 = function4;
                                }
                                if (i16 != 0) {
                                    function21 = null;
                                } else {
                                    function21 = function5;
                                }
                                if (i18 != 0) {
                                    function22 = null;
                                } else {
                                    function22 = function6;
                                }
                                if (i21 != 0) {
                                    function23 = null;
                                } else {
                                    function23 = function7;
                                }
                                if (i24 != 0) {
                                    function24 = null;
                                } else {
                                    function24 = function8;
                                }
                                if (i26 != 0) {
                                    function25 = null;
                                } else {
                                    function25 = function9;
                                }
                                if ((i3 & 16384) != 0) {
                                    pscVarG = g(dVarF, (i27 >> 21) & 14);
                                    i27 &= -57345;
                                } else {
                                    pscVarG = pscVar;
                                }
                                if ((i3 & 32768) != 0) {
                                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i27 &= -458753;
                                } else {
                                    rx8VarJ = rx8Var;
                                }
                                if (i28 != 0) {
                                    rx8 rx8Var7 = rx8VarJ;
                                    boolean z18 = z7;
                                    psc pscVar10 = pscVarG;
                                    do1 do1VarE5 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                    rx8Var3 = rx8Var7;
                                    function27 = function21;
                                    function28 = function24;
                                    function29 = function25;
                                    function31 = function23;
                                    z8 = z18;
                                    function32 = do1VarE5;
                                    function26 = function11;
                                    function30 = function22;
                                    z9 = true;
                                    i31 = i27;
                                    pscVar3 = pscVar10;
                                } else {
                                    boolean z19 = z7;
                                    psc pscVar11 = pscVarG;
                                    rx8Var3 = rx8VarJ;
                                    function26 = function11;
                                    function27 = function21;
                                    function28 = function24;
                                    i31 = i27;
                                    function29 = function25;
                                    function30 = function22;
                                    function31 = function23;
                                    z8 = z19;
                                    pscVar3 = pscVar11;
                                    z9 = true;
                                    function32 = function10;
                                }
                            } else {
                                if (i10 != 0) {
                                    z7 = false;
                                } else {
                                    z7 = z3;
                                }
                                if (i12 != 0) {
                                    function11 = null;
                                }
                                if (i14 != 0) {
                                    function20 = null;
                                } else {
                                    function20 = function4;
                                }
                                if (i16 != 0) {
                                    function21 = null;
                                } else {
                                    function21 = function5;
                                }
                                if (i18 != 0) {
                                    function22 = null;
                                } else {
                                    function22 = function6;
                                }
                                if (i21 != 0) {
                                    function23 = null;
                                } else {
                                    function23 = function7;
                                }
                                if (i24 != 0) {
                                    function24 = null;
                                } else {
                                    function24 = function8;
                                }
                                if (i26 != 0) {
                                    function25 = null;
                                } else {
                                    function25 = function9;
                                }
                                if ((i3 & 16384) != 0) {
                                    pscVarG = g(dVarF, (i27 >> 21) & 14);
                                    i27 &= -57345;
                                } else {
                                    pscVarG = pscVar;
                                }
                                if ((i3 & 32768) != 0) {
                                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i27 &= -458753;
                                } else {
                                    rx8VarJ = rx8Var;
                                }
                                if (i28 != 0) {
                                    rx8 rx8Var8 = rx8VarJ;
                                    boolean z110 = z7;
                                    psc pscVar12 = pscVarG;
                                    do1 do1VarE6 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                    rx8Var3 = rx8Var8;
                                    function27 = function21;
                                    function28 = function24;
                                    function29 = function25;
                                    function31 = function23;
                                    z8 = z110;
                                    function32 = do1VarE6;
                                    function26 = function11;
                                    function30 = function22;
                                    z9 = true;
                                    i31 = i27;
                                    pscVar3 = pscVar12;
                                } else {
                                    boolean z111 = z7;
                                    psc pscVar13 = pscVarG;
                                    rx8Var3 = rx8VarJ;
                                    function26 = function11;
                                    function27 = function21;
                                    function28 = function24;
                                    i31 = i27;
                                    function29 = function25;
                                    function30 = function22;
                                    function31 = function23;
                                    z8 = z111;
                                    pscVar3 = pscVar13;
                                    z9 = true;
                                    function32 = function10;
                                }
                            }
                            dVarF.M();
                            Function2<? super d, ? super Integer, Unit> function37 = function28;
                            if (e.k()) {
                                e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                            }
                            if ((i4 & 14) == 4) {
                                z10 = z9;
                            } else {
                                z10 = r19;
                            }
                            z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                            objR = dVarF.R();
                            if (z11) {
                                obj = null;
                                objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                                dVarF.L(objR);
                            } else {
                                obj = null;
                                objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                                dVarF.L(objR);
                            }
                            String text3 = ((TransformedText) objR).getText().getText();
                            TextFieldType textFieldType3 = TextFieldType.Outlined;
                            v1.Attached attached3 = new v1.Attached(false, null, null, 7, null);
                            if (function26 == null) {
                                dVarF.y(1927058812);
                                dVarF.u();
                                do1VarE = null;
                            } else {
                                dVarF.y(1927058813);
                                do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                                dVarF.u();
                            }
                            int i311 = i4 >> 9;
                            int i312 = i31 << 21;
                            int i313 = ((i4 << 3) & 896) | 6 | (458752 & i311) | (3670016 & i311) | (i312 & 29360128) | (i312 & 234881024) | (i312 & 1879048192);
                            int i314 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i311 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                            dVar2 = dVarF;
                            Function2<? super d, ? super Integer, Unit> function38 = function20;
                            TextFieldImplKt.l(textFieldType3, text3, function2, attached3, do1VarE, function38, function27, function30, function31, function37, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i313, i314);
                            if (e.k()) {
                                e.n();
                            }
                            function15 = function37;
                            function16 = function29;
                            rx8Var2 = rx8Var3;
                            function17 = function32;
                            function13 = function30;
                            function14 = function31;
                            function19 = function38;
                            function12 = function27;
                            z6 = z8;
                            pscVar2 = pscVar3;
                            function18 = function26;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            z6 = z3;
                            function12 = function5;
                            function13 = function6;
                            function14 = function7;
                            function15 = function8;
                            function16 = function9;
                            pscVar2 = pscVar;
                            rx8Var2 = rx8Var;
                            function17 = function10;
                            function18 = function11;
                            function19 = function4;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.su8
                                public final Object invoke(Object obj2, Object obj3) {
                                    return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
                                }
                            });
                        }
                    }
                    i27 = i25 | 3072;
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i7 = 16384;
                        }
                        i27 |= i7;
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32768) == 0) {
                            i32 = 65536;
                        } else {
                            i32 = 65536;
                        }
                        i27 |= i32;
                    }
                    i28 = i3 & 65536;
                    if (i28 != 0) {
                        i27 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (dVarF.T(function10)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i27 |= i29;
                    }
                    if ((i3 & 131072) != 0) {
                        i27 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (dVarF.x(this)) {
                            i30 = 8388608;
                        } else {
                            i30 = 4194304;
                        }
                        i27 |= i30;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    if (dVarF.g(z5, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z7 = false;
                            } else {
                                z7 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            }
                            if (i14 != 0) {
                                function20 = null;
                            } else {
                                function20 = function4;
                            }
                            if (i16 != 0) {
                                function21 = null;
                            } else {
                                function21 = function5;
                            }
                            if (i18 != 0) {
                                function22 = null;
                            } else {
                                function22 = function6;
                            }
                            if (i21 != 0) {
                                function23 = null;
                            } else {
                                function23 = function7;
                            }
                            if (i24 != 0) {
                                function24 = null;
                            } else {
                                function24 = function8;
                            }
                            if (i26 != 0) {
                                function25 = null;
                            } else {
                                function25 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                pscVarG = g(dVarF, (i27 >> 21) & 14);
                                i27 &= -57345;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 32768) != 0) {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i27 &= -458753;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i28 != 0) {
                                rx8 rx8Var9 = rx8VarJ;
                                boolean z112 = z7;
                                psc pscVar14 = pscVarG;
                                do1 do1VarE7 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                rx8Var3 = rx8Var9;
                                function27 = function21;
                                function28 = function24;
                                function29 = function25;
                                function31 = function23;
                                z8 = z112;
                                function32 = do1VarE7;
                                function26 = function11;
                                function30 = function22;
                                z9 = true;
                                i31 = i27;
                                pscVar3 = pscVar14;
                            } else {
                                boolean z113 = z7;
                                psc pscVar15 = pscVarG;
                                rx8Var3 = rx8VarJ;
                                function26 = function11;
                                function27 = function21;
                                function28 = function24;
                                i31 = i27;
                                function29 = function25;
                                function30 = function22;
                                function31 = function23;
                                z8 = z113;
                                pscVar3 = pscVar15;
                                z9 = true;
                                function32 = function10;
                            }
                        } else {
                            if (i10 != 0) {
                                z7 = false;
                            } else {
                                z7 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            }
                            if (i14 != 0) {
                                function20 = null;
                            } else {
                                function20 = function4;
                            }
                            if (i16 != 0) {
                                function21 = null;
                            } else {
                                function21 = function5;
                            }
                            if (i18 != 0) {
                                function22 = null;
                            } else {
                                function22 = function6;
                            }
                            if (i21 != 0) {
                                function23 = null;
                            } else {
                                function23 = function7;
                            }
                            if (i24 != 0) {
                                function24 = null;
                            } else {
                                function24 = function8;
                            }
                            if (i26 != 0) {
                                function25 = null;
                            } else {
                                function25 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                pscVarG = g(dVarF, (i27 >> 21) & 14);
                                i27 &= -57345;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 32768) != 0) {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i27 &= -458753;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i28 != 0) {
                                rx8 rx8Var10 = rx8VarJ;
                                boolean z114 = z7;
                                psc pscVar16 = pscVarG;
                                do1 do1VarE8 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                rx8Var3 = rx8Var10;
                                function27 = function21;
                                function28 = function24;
                                function29 = function25;
                                function31 = function23;
                                z8 = z114;
                                function32 = do1VarE8;
                                function26 = function11;
                                function30 = function22;
                                z9 = true;
                                i31 = i27;
                                pscVar3 = pscVar16;
                            } else {
                                boolean z115 = z7;
                                psc pscVar17 = pscVarG;
                                rx8Var3 = rx8VarJ;
                                function26 = function11;
                                function27 = function21;
                                function28 = function24;
                                i31 = i27;
                                function29 = function25;
                                function30 = function22;
                                function31 = function23;
                                z8 = z115;
                                pscVar3 = pscVar17;
                                z9 = true;
                                function32 = function10;
                            }
                        }
                        dVarF.M();
                        Function2<? super d, ? super Integer, Unit> function39 = function28;
                        if (e.k()) {
                            e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                        }
                        if ((i4 & 14) == 4) {
                            z10 = z9;
                        } else {
                            z10 = r19;
                        }
                        z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                        objR = dVarF.R();
                        if (z11) {
                            obj = null;
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        } else {
                            obj = null;
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        }
                        String text4 = ((TransformedText) objR).getText().getText();
                        TextFieldType textFieldType4 = TextFieldType.Outlined;
                        v1.Attached attached4 = new v1.Attached(false, null, null, 7, null);
                        if (function26 == null) {
                            dVarF.y(1927058812);
                            dVarF.u();
                            do1VarE = null;
                        } else {
                            dVarF.y(1927058813);
                            do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                            dVarF.u();
                        }
                        int i315 = i4 >> 9;
                        int i316 = i31 << 21;
                        int i317 = ((i4 << 3) & 896) | 6 | (458752 & i315) | (3670016 & i315) | (i316 & 29360128) | (i316 & 234881024) | (i316 & 1879048192);
                        int i318 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i315 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                        dVar2 = dVarF;
                        Function2<? super d, ? super Integer, Unit> function310 = function20;
                        TextFieldImplKt.l(textFieldType4, text4, function2, attached4, do1VarE, function310, function27, function30, function31, function39, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i317, i318);
                        if (e.k()) {
                            e.n();
                        }
                        function15 = function39;
                        function16 = function29;
                        rx8Var2 = rx8Var3;
                        function17 = function32;
                        function13 = function30;
                        function14 = function31;
                        function19 = function310;
                        function12 = function27;
                        z6 = z8;
                        pscVar2 = pscVar3;
                        function18 = function26;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        z6 = z3;
                        function12 = function5;
                        function13 = function6;
                        function14 = function7;
                        function15 = function8;
                        function16 = function9;
                        pscVar2 = pscVar;
                        rx8Var2 = rx8Var;
                        function17 = function10;
                        function18 = function11;
                        function19 = function4;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.su8
                            public final Object invoke(Object obj2, Object obj3) {
                                return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i4 |= 100663296;
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
                        i25 = i23 | (dVarF.T(function8) ? 256 : 128);
                    } else {
                        i25 = i23;
                    }
                    i26 = i3 & 8192;
                    if (i26 != 0) {
                        i27 = i25;
                        if ((i2 & 3072) == 0) {
                            i27 |= dVarF.T(function9) ? 2048 : 1024;
                        }
                        if ((i2 & 24576) != 0) {
                            if ((i3 & 16384) == 0) {
                                i7 = 16384;
                            }
                            i27 |= i7;
                        }
                        if ((i2 & 196608) != 0) {
                            if ((i3 & 32768) == 0) {
                                i32 = 65536;
                            } else {
                                i32 = 65536;
                            }
                            i27 |= i32;
                        }
                        i28 = i3 & 65536;
                        if (i28 != 0) {
                            i27 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            if (dVarF.T(function10)) {
                                i29 = 1048576;
                            } else {
                                i29 = 524288;
                            }
                            i27 |= i29;
                        }
                        if ((i3 & 131072) != 0) {
                            i27 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            if (dVarF.x(this)) {
                                i30 = 8388608;
                            } else {
                                i30 = 4194304;
                            }
                            i27 |= i30;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        if (dVarF.g(z5, i4 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i10 != 0) {
                                    z7 = false;
                                } else {
                                    z7 = z3;
                                }
                                if (i12 != 0) {
                                    function11 = null;
                                }
                                if (i14 != 0) {
                                    function20 = null;
                                } else {
                                    function20 = function4;
                                }
                                if (i16 != 0) {
                                    function21 = null;
                                } else {
                                    function21 = function5;
                                }
                                if (i18 != 0) {
                                    function22 = null;
                                } else {
                                    function22 = function6;
                                }
                                if (i21 != 0) {
                                    function23 = null;
                                } else {
                                    function23 = function7;
                                }
                                if (i24 != 0) {
                                    function24 = null;
                                } else {
                                    function24 = function8;
                                }
                                if (i26 != 0) {
                                    function25 = null;
                                } else {
                                    function25 = function9;
                                }
                                if ((i3 & 16384) != 0) {
                                    pscVarG = g(dVarF, (i27 >> 21) & 14);
                                    i27 &= -57345;
                                } else {
                                    pscVarG = pscVar;
                                }
                                if ((i3 & 32768) != 0) {
                                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i27 &= -458753;
                                } else {
                                    rx8VarJ = rx8Var;
                                }
                                if (i28 != 0) {
                                    rx8 rx8Var11 = rx8VarJ;
                                    boolean z116 = z7;
                                    psc pscVar18 = pscVarG;
                                    do1 do1VarE9 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                    rx8Var3 = rx8Var11;
                                    function27 = function21;
                                    function28 = function24;
                                    function29 = function25;
                                    function31 = function23;
                                    z8 = z116;
                                    function32 = do1VarE9;
                                    function26 = function11;
                                    function30 = function22;
                                    z9 = true;
                                    i31 = i27;
                                    pscVar3 = pscVar18;
                                } else {
                                    boolean z117 = z7;
                                    psc pscVar19 = pscVarG;
                                    rx8Var3 = rx8VarJ;
                                    function26 = function11;
                                    function27 = function21;
                                    function28 = function24;
                                    i31 = i27;
                                    function29 = function25;
                                    function30 = function22;
                                    function31 = function23;
                                    z8 = z117;
                                    pscVar3 = pscVar19;
                                    z9 = true;
                                    function32 = function10;
                                }
                            } else {
                                if (i10 != 0) {
                                    z7 = false;
                                } else {
                                    z7 = z3;
                                }
                                if (i12 != 0) {
                                    function11 = null;
                                }
                                if (i14 != 0) {
                                    function20 = null;
                                } else {
                                    function20 = function4;
                                }
                                if (i16 != 0) {
                                    function21 = null;
                                } else {
                                    function21 = function5;
                                }
                                if (i18 != 0) {
                                    function22 = null;
                                } else {
                                    function22 = function6;
                                }
                                if (i21 != 0) {
                                    function23 = null;
                                } else {
                                    function23 = function7;
                                }
                                if (i24 != 0) {
                                    function24 = null;
                                } else {
                                    function24 = function8;
                                }
                                if (i26 != 0) {
                                    function25 = null;
                                } else {
                                    function25 = function9;
                                }
                                if ((i3 & 16384) != 0) {
                                    pscVarG = g(dVarF, (i27 >> 21) & 14);
                                    i27 &= -57345;
                                } else {
                                    pscVarG = pscVar;
                                }
                                if ((i3 & 32768) != 0) {
                                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i27 &= -458753;
                                } else {
                                    rx8VarJ = rx8Var;
                                }
                                if (i28 != 0) {
                                    rx8 rx8Var12 = rx8VarJ;
                                    boolean z118 = z7;
                                    psc pscVar110 = pscVarG;
                                    do1 do1VarE10 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                    rx8Var3 = rx8Var12;
                                    function27 = function21;
                                    function28 = function24;
                                    function29 = function25;
                                    function31 = function23;
                                    z8 = z118;
                                    function32 = do1VarE10;
                                    function26 = function11;
                                    function30 = function22;
                                    z9 = true;
                                    i31 = i27;
                                    pscVar3 = pscVar110;
                                } else {
                                    boolean z119 = z7;
                                    psc pscVar111 = pscVarG;
                                    rx8Var3 = rx8VarJ;
                                    function26 = function11;
                                    function27 = function21;
                                    function28 = function24;
                                    i31 = i27;
                                    function29 = function25;
                                    function30 = function22;
                                    function31 = function23;
                                    z8 = z119;
                                    pscVar3 = pscVar111;
                                    z9 = true;
                                    function32 = function10;
                                }
                            }
                            dVarF.M();
                            Function2<? super d, ? super Integer, Unit> function311 = function28;
                            if (e.k()) {
                                e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                            }
                            if ((i4 & 14) == 4) {
                                z10 = z9;
                            } else {
                                z10 = r19;
                            }
                            z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                            objR = dVarF.R();
                            if (z11) {
                                obj = null;
                                objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                                dVarF.L(objR);
                            } else {
                                obj = null;
                                objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                                dVarF.L(objR);
                            }
                            String text5 = ((TransformedText) objR).getText().getText();
                            TextFieldType textFieldType5 = TextFieldType.Outlined;
                            v1.Attached attached5 = new v1.Attached(false, null, null, 7, null);
                            if (function26 == null) {
                                dVarF.y(1927058812);
                                dVarF.u();
                                do1VarE = null;
                            } else {
                                dVarF.y(1927058813);
                                do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                                dVarF.u();
                            }
                            int i319 = i4 >> 9;
                            int i3110 = i31 << 21;
                            int i3111 = ((i4 << 3) & 896) | 6 | (458752 & i319) | (3670016 & i319) | (i3110 & 29360128) | (i3110 & 234881024) | (i3110 & 1879048192);
                            int i3112 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i319 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                            dVar2 = dVarF;
                            Function2<? super d, ? super Integer, Unit> function312 = function20;
                            TextFieldImplKt.l(textFieldType5, text5, function2, attached5, do1VarE, function312, function27, function30, function31, function311, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i3111, i3112);
                            if (e.k()) {
                                e.n();
                            }
                            function15 = function311;
                            function16 = function29;
                            rx8Var2 = rx8Var3;
                            function17 = function32;
                            function13 = function30;
                            function14 = function31;
                            function19 = function312;
                            function12 = function27;
                            z6 = z8;
                            pscVar2 = pscVar3;
                            function18 = function26;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            z6 = z3;
                            function12 = function5;
                            function13 = function6;
                            function14 = function7;
                            function15 = function8;
                            function16 = function9;
                            pscVar2 = pscVar;
                            rx8Var2 = rx8Var;
                            function17 = function10;
                            function18 = function11;
                            function19 = function4;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.su8
                                public final Object invoke(Object obj2, Object obj3) {
                                    return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
                                }
                            });
                        }
                    }
                    i27 = i25 | 3072;
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i7 = 16384;
                        }
                        i27 |= i7;
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32768) == 0) {
                            i32 = 65536;
                        } else {
                            i32 = 65536;
                        }
                        i27 |= i32;
                    }
                    i28 = i3 & 65536;
                    if (i28 != 0) {
                        i27 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (dVarF.T(function10)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i27 |= i29;
                    }
                    if ((i3 & 131072) != 0) {
                        i27 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (dVarF.x(this)) {
                            i30 = 8388608;
                        } else {
                            i30 = 4194304;
                        }
                        i27 |= i30;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    if (dVarF.g(z5, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z7 = false;
                            } else {
                                z7 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            }
                            if (i14 != 0) {
                                function20 = null;
                            } else {
                                function20 = function4;
                            }
                            if (i16 != 0) {
                                function21 = null;
                            } else {
                                function21 = function5;
                            }
                            if (i18 != 0) {
                                function22 = null;
                            } else {
                                function22 = function6;
                            }
                            if (i21 != 0) {
                                function23 = null;
                            } else {
                                function23 = function7;
                            }
                            if (i24 != 0) {
                                function24 = null;
                            } else {
                                function24 = function8;
                            }
                            if (i26 != 0) {
                                function25 = null;
                            } else {
                                function25 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                pscVarG = g(dVarF, (i27 >> 21) & 14);
                                i27 &= -57345;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 32768) != 0) {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i27 &= -458753;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i28 != 0) {
                                rx8 rx8Var13 = rx8VarJ;
                                boolean z1110 = z7;
                                psc pscVar112 = pscVarG;
                                do1 do1VarE11 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                rx8Var3 = rx8Var13;
                                function27 = function21;
                                function28 = function24;
                                function29 = function25;
                                function31 = function23;
                                z8 = z1110;
                                function32 = do1VarE11;
                                function26 = function11;
                                function30 = function22;
                                z9 = true;
                                i31 = i27;
                                pscVar3 = pscVar112;
                            } else {
                                boolean z1111 = z7;
                                psc pscVar113 = pscVarG;
                                rx8Var3 = rx8VarJ;
                                function26 = function11;
                                function27 = function21;
                                function28 = function24;
                                i31 = i27;
                                function29 = function25;
                                function30 = function22;
                                function31 = function23;
                                z8 = z1111;
                                pscVar3 = pscVar113;
                                z9 = true;
                                function32 = function10;
                            }
                        } else {
                            if (i10 != 0) {
                                z7 = false;
                            } else {
                                z7 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            }
                            if (i14 != 0) {
                                function20 = null;
                            } else {
                                function20 = function4;
                            }
                            if (i16 != 0) {
                                function21 = null;
                            } else {
                                function21 = function5;
                            }
                            if (i18 != 0) {
                                function22 = null;
                            } else {
                                function22 = function6;
                            }
                            if (i21 != 0) {
                                function23 = null;
                            } else {
                                function23 = function7;
                            }
                            if (i24 != 0) {
                                function24 = null;
                            } else {
                                function24 = function8;
                            }
                            if (i26 != 0) {
                                function25 = null;
                            } else {
                                function25 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                pscVarG = g(dVarF, (i27 >> 21) & 14);
                                i27 &= -57345;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 32768) != 0) {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i27 &= -458753;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i28 != 0) {
                                rx8 rx8Var14 = rx8VarJ;
                                boolean z1112 = z7;
                                psc pscVar114 = pscVarG;
                                do1 do1VarE12 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                rx8Var3 = rx8Var14;
                                function27 = function21;
                                function28 = function24;
                                function29 = function25;
                                function31 = function23;
                                z8 = z1112;
                                function32 = do1VarE12;
                                function26 = function11;
                                function30 = function22;
                                z9 = true;
                                i31 = i27;
                                pscVar3 = pscVar114;
                            } else {
                                boolean z1113 = z7;
                                psc pscVar115 = pscVarG;
                                rx8Var3 = rx8VarJ;
                                function26 = function11;
                                function27 = function21;
                                function28 = function24;
                                i31 = i27;
                                function29 = function25;
                                function30 = function22;
                                function31 = function23;
                                z8 = z1113;
                                pscVar3 = pscVar115;
                                z9 = true;
                                function32 = function10;
                            }
                        }
                        dVarF.M();
                        Function2<? super d, ? super Integer, Unit> function313 = function28;
                        if (e.k()) {
                            e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                        }
                        if ((i4 & 14) == 4) {
                            z10 = z9;
                        } else {
                            z10 = r19;
                        }
                        z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                        objR = dVarF.R();
                        if (z11) {
                            obj = null;
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        } else {
                            obj = null;
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        }
                        String text6 = ((TransformedText) objR).getText().getText();
                        TextFieldType textFieldType6 = TextFieldType.Outlined;
                        v1.Attached attached6 = new v1.Attached(false, null, null, 7, null);
                        if (function26 == null) {
                            dVarF.y(1927058812);
                            dVarF.u();
                            do1VarE = null;
                        } else {
                            dVarF.y(1927058813);
                            do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                            dVarF.u();
                        }
                        int i3113 = i4 >> 9;
                        int i3114 = i31 << 21;
                        int i3115 = ((i4 << 3) & 896) | 6 | (458752 & i3113) | (3670016 & i3113) | (i3114 & 29360128) | (i3114 & 234881024) | (i3114 & 1879048192);
                        int i3116 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i3113 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                        dVar2 = dVarF;
                        Function2<? super d, ? super Integer, Unit> function314 = function20;
                        TextFieldImplKt.l(textFieldType6, text6, function2, attached6, do1VarE, function314, function27, function30, function31, function313, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i3115, i3116);
                        if (e.k()) {
                            e.n();
                        }
                        function15 = function313;
                        function16 = function29;
                        rx8Var2 = rx8Var3;
                        function17 = function32;
                        function13 = function30;
                        function14 = function31;
                        function19 = function314;
                        function12 = function27;
                        z6 = z8;
                        pscVar2 = pscVar3;
                        function18 = function26;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        z6 = z3;
                        function12 = function5;
                        function13 = function6;
                        function14 = function7;
                        function15 = function8;
                        function16 = function9;
                        pscVar2 = pscVar;
                        rx8Var2 = rx8Var;
                        function17 = function10;
                        function18 = function11;
                        function19 = function4;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.su8
                            public final Object invoke(Object obj2, Object obj3) {
                                return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
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
                    i25 = i23 | (dVarF.T(function8) ? 256 : 128);
                } else {
                    i25 = i23;
                }
                i26 = i3 & 8192;
                if (i26 != 0) {
                    i27 = i25;
                    if ((i2 & 3072) == 0) {
                        i27 |= dVarF.T(function9) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i7 = 16384;
                        }
                        i27 |= i7;
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32768) == 0) {
                            i32 = 65536;
                        } else {
                            i32 = 65536;
                        }
                        i27 |= i32;
                    }
                    i28 = i3 & 65536;
                    if (i28 != 0) {
                        i27 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (dVarF.T(function10)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i27 |= i29;
                    }
                    if ((i3 & 131072) != 0) {
                        i27 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (dVarF.x(this)) {
                            i30 = 8388608;
                        } else {
                            i30 = 4194304;
                        }
                        i27 |= i30;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    if (dVarF.g(z5, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z7 = false;
                            } else {
                                z7 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            }
                            if (i14 != 0) {
                                function20 = null;
                            } else {
                                function20 = function4;
                            }
                            if (i16 != 0) {
                                function21 = null;
                            } else {
                                function21 = function5;
                            }
                            if (i18 != 0) {
                                function22 = null;
                            } else {
                                function22 = function6;
                            }
                            if (i21 != 0) {
                                function23 = null;
                            } else {
                                function23 = function7;
                            }
                            if (i24 != 0) {
                                function24 = null;
                            } else {
                                function24 = function8;
                            }
                            if (i26 != 0) {
                                function25 = null;
                            } else {
                                function25 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                pscVarG = g(dVarF, (i27 >> 21) & 14);
                                i27 &= -57345;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 32768) != 0) {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i27 &= -458753;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i28 != 0) {
                                rx8 rx8Var15 = rx8VarJ;
                                boolean z1114 = z7;
                                psc pscVar116 = pscVarG;
                                do1 do1VarE13 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                rx8Var3 = rx8Var15;
                                function27 = function21;
                                function28 = function24;
                                function29 = function25;
                                function31 = function23;
                                z8 = z1114;
                                function32 = do1VarE13;
                                function26 = function11;
                                function30 = function22;
                                z9 = true;
                                i31 = i27;
                                pscVar3 = pscVar116;
                            } else {
                                boolean z1115 = z7;
                                psc pscVar117 = pscVarG;
                                rx8Var3 = rx8VarJ;
                                function26 = function11;
                                function27 = function21;
                                function28 = function24;
                                i31 = i27;
                                function29 = function25;
                                function30 = function22;
                                function31 = function23;
                                z8 = z1115;
                                pscVar3 = pscVar117;
                                z9 = true;
                                function32 = function10;
                            }
                        } else {
                            if (i10 != 0) {
                                z7 = false;
                            } else {
                                z7 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            }
                            if (i14 != 0) {
                                function20 = null;
                            } else {
                                function20 = function4;
                            }
                            if (i16 != 0) {
                                function21 = null;
                            } else {
                                function21 = function5;
                            }
                            if (i18 != 0) {
                                function22 = null;
                            } else {
                                function22 = function6;
                            }
                            if (i21 != 0) {
                                function23 = null;
                            } else {
                                function23 = function7;
                            }
                            if (i24 != 0) {
                                function24 = null;
                            } else {
                                function24 = function8;
                            }
                            if (i26 != 0) {
                                function25 = null;
                            } else {
                                function25 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                pscVarG = g(dVarF, (i27 >> 21) & 14);
                                i27 &= -57345;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 32768) != 0) {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i27 &= -458753;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i28 != 0) {
                                rx8 rx8Var16 = rx8VarJ;
                                boolean z1116 = z7;
                                psc pscVar118 = pscVarG;
                                do1 do1VarE14 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                rx8Var3 = rx8Var16;
                                function27 = function21;
                                function28 = function24;
                                function29 = function25;
                                function31 = function23;
                                z8 = z1116;
                                function32 = do1VarE14;
                                function26 = function11;
                                function30 = function22;
                                z9 = true;
                                i31 = i27;
                                pscVar3 = pscVar118;
                            } else {
                                boolean z1117 = z7;
                                psc pscVar119 = pscVarG;
                                rx8Var3 = rx8VarJ;
                                function26 = function11;
                                function27 = function21;
                                function28 = function24;
                                i31 = i27;
                                function29 = function25;
                                function30 = function22;
                                function31 = function23;
                                z8 = z1117;
                                pscVar3 = pscVar119;
                                z9 = true;
                                function32 = function10;
                            }
                        }
                        dVarF.M();
                        Function2<? super d, ? super Integer, Unit> function315 = function28;
                        if (e.k()) {
                            e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                        }
                        if ((i4 & 14) == 4) {
                            z10 = z9;
                        } else {
                            z10 = r19;
                        }
                        z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                        objR = dVarF.R();
                        if (z11) {
                            obj = null;
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        } else {
                            obj = null;
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        }
                        String text7 = ((TransformedText) objR).getText().getText();
                        TextFieldType textFieldType7 = TextFieldType.Outlined;
                        v1.Attached attached7 = new v1.Attached(false, null, null, 7, null);
                        if (function26 == null) {
                            dVarF.y(1927058812);
                            dVarF.u();
                            do1VarE = null;
                        } else {
                            dVarF.y(1927058813);
                            do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                            dVarF.u();
                        }
                        int i3117 = i4 >> 9;
                        int i3118 = i31 << 21;
                        int i3119 = ((i4 << 3) & 896) | 6 | (458752 & i3117) | (3670016 & i3117) | (i3118 & 29360128) | (i3118 & 234881024) | (i3118 & 1879048192);
                        int i31110 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i3117 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                        dVar2 = dVarF;
                        Function2<? super d, ? super Integer, Unit> function316 = function20;
                        TextFieldImplKt.l(textFieldType7, text7, function2, attached7, do1VarE, function316, function27, function30, function31, function315, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i3119, i31110);
                        if (e.k()) {
                            e.n();
                        }
                        function15 = function315;
                        function16 = function29;
                        rx8Var2 = rx8Var3;
                        function17 = function32;
                        function13 = function30;
                        function14 = function31;
                        function19 = function316;
                        function12 = function27;
                        z6 = z8;
                        pscVar2 = pscVar3;
                        function18 = function26;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        z6 = z3;
                        function12 = function5;
                        function13 = function6;
                        function14 = function7;
                        function15 = function8;
                        function16 = function9;
                        pscVar2 = pscVar;
                        rx8Var2 = rx8Var;
                        function17 = function10;
                        function18 = function11;
                        function19 = function4;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.su8
                            public final Object invoke(Object obj2, Object obj3) {
                                return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i27 = i25 | 3072;
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i7 = 16384;
                    }
                    i27 |= i7;
                }
                if ((i2 & 196608) != 0) {
                    if ((i3 & 32768) == 0) {
                        i32 = 65536;
                    } else {
                        i32 = 65536;
                    }
                    i27 |= i32;
                }
                i28 = i3 & 65536;
                if (i28 != 0) {
                    i27 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (dVarF.T(function10)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i27 |= i29;
                }
                if ((i3 & 131072) != 0) {
                    i27 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (dVarF.x(this)) {
                        i30 = 8388608;
                    } else {
                        i30 = 4194304;
                    }
                    i27 |= i30;
                }
                if ((i4 & 306783379) == 306783378) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (dVarF.g(z5, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z7 = false;
                        } else {
                            z7 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        }
                        if (i14 != 0) {
                            function20 = null;
                        } else {
                            function20 = function4;
                        }
                        if (i16 != 0) {
                            function21 = null;
                        } else {
                            function21 = function5;
                        }
                        if (i18 != 0) {
                            function22 = null;
                        } else {
                            function22 = function6;
                        }
                        if (i21 != 0) {
                            function23 = null;
                        } else {
                            function23 = function7;
                        }
                        if (i24 != 0) {
                            function24 = null;
                        } else {
                            function24 = function8;
                        }
                        if (i26 != 0) {
                            function25 = null;
                        } else {
                            function25 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            pscVarG = g(dVarF, (i27 >> 21) & 14);
                            i27 &= -57345;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 32768) != 0) {
                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i27 &= -458753;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i28 != 0) {
                            rx8 rx8Var17 = rx8VarJ;
                            boolean z1118 = z7;
                            psc pscVar1110 = pscVarG;
                            do1 do1VarE15 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                            rx8Var3 = rx8Var17;
                            function27 = function21;
                            function28 = function24;
                            function29 = function25;
                            function31 = function23;
                            z8 = z1118;
                            function32 = do1VarE15;
                            function26 = function11;
                            function30 = function22;
                            z9 = true;
                            i31 = i27;
                            pscVar3 = pscVar1110;
                        } else {
                            boolean z1119 = z7;
                            psc pscVar1111 = pscVarG;
                            rx8Var3 = rx8VarJ;
                            function26 = function11;
                            function27 = function21;
                            function28 = function24;
                            i31 = i27;
                            function29 = function25;
                            function30 = function22;
                            function31 = function23;
                            z8 = z1119;
                            pscVar3 = pscVar1111;
                            z9 = true;
                            function32 = function10;
                        }
                    } else {
                        if (i10 != 0) {
                            z7 = false;
                        } else {
                            z7 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        }
                        if (i14 != 0) {
                            function20 = null;
                        } else {
                            function20 = function4;
                        }
                        if (i16 != 0) {
                            function21 = null;
                        } else {
                            function21 = function5;
                        }
                        if (i18 != 0) {
                            function22 = null;
                        } else {
                            function22 = function6;
                        }
                        if (i21 != 0) {
                            function23 = null;
                        } else {
                            function23 = function7;
                        }
                        if (i24 != 0) {
                            function24 = null;
                        } else {
                            function24 = function8;
                        }
                        if (i26 != 0) {
                            function25 = null;
                        } else {
                            function25 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            pscVarG = g(dVarF, (i27 >> 21) & 14);
                            i27 &= -57345;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 32768) != 0) {
                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i27 &= -458753;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i28 != 0) {
                            rx8 rx8Var18 = rx8VarJ;
                            boolean z11110 = z7;
                            psc pscVar1112 = pscVarG;
                            do1 do1VarE16 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                            rx8Var3 = rx8Var18;
                            function27 = function21;
                            function28 = function24;
                            function29 = function25;
                            function31 = function23;
                            z8 = z11110;
                            function32 = do1VarE16;
                            function26 = function11;
                            function30 = function22;
                            z9 = true;
                            i31 = i27;
                            pscVar3 = pscVar1112;
                        } else {
                            boolean z11111 = z7;
                            psc pscVar1113 = pscVarG;
                            rx8Var3 = rx8VarJ;
                            function26 = function11;
                            function27 = function21;
                            function28 = function24;
                            i31 = i27;
                            function29 = function25;
                            function30 = function22;
                            function31 = function23;
                            z8 = z11111;
                            pscVar3 = pscVar1113;
                            z9 = true;
                            function32 = function10;
                        }
                    }
                    dVarF.M();
                    Function2<? super d, ? super Integer, Unit> function317 = function28;
                    if (e.k()) {
                        e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                    }
                    if ((i4 & 14) == 4) {
                        z10 = z9;
                    } else {
                        z10 = r19;
                    }
                    z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                    objR = dVarF.R();
                    if (z11) {
                        obj = null;
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    } else {
                        obj = null;
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    }
                    String text8 = ((TransformedText) objR).getText().getText();
                    TextFieldType textFieldType8 = TextFieldType.Outlined;
                    v1.Attached attached8 = new v1.Attached(false, null, null, 7, null);
                    if (function26 == null) {
                        dVarF.y(1927058812);
                        dVarF.u();
                        do1VarE = null;
                    } else {
                        dVarF.y(1927058813);
                        do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                        dVarF.u();
                    }
                    int i31111 = i4 >> 9;
                    int i31112 = i31 << 21;
                    int i31113 = ((i4 << 3) & 896) | 6 | (458752 & i31111) | (3670016 & i31111) | (i31112 & 29360128) | (i31112 & 234881024) | (i31112 & 1879048192);
                    int i31114 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i31111 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                    dVar2 = dVarF;
                    Function2<? super d, ? super Integer, Unit> function318 = function20;
                    TextFieldImplKt.l(textFieldType8, text8, function2, attached8, do1VarE, function318, function27, function30, function31, function317, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i31113, i31114);
                    if (e.k()) {
                        e.n();
                    }
                    function15 = function317;
                    function16 = function29;
                    rx8Var2 = rx8Var3;
                    function17 = function32;
                    function13 = function30;
                    function14 = function31;
                    function19 = function318;
                    function12 = function27;
                    z6 = z8;
                    pscVar2 = pscVar3;
                    function18 = function26;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    z6 = z3;
                    function12 = function5;
                    function13 = function6;
                    function14 = function7;
                    function15 = function8;
                    function16 = function9;
                    pscVar2 = pscVar;
                    rx8Var2 = rx8Var;
                    function17 = function10;
                    function18 = function11;
                    function19 = function4;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.su8
                        public final Object invoke(Object obj2, Object obj3) {
                            return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i4 |= 3072;
            z4 = z2;
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
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                if (dVarF.x(j26Var)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i4 |= i9;
            }
            i10 = i3 & 64;
            if (i10 != 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (dVarF.A(z3)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i4 |= i11;
            }
            i12 = i3 & 128;
            if (i12 != 0) {
                i4 |= 12582912;
                function11 = function3;
            } else {
                function11 = function3;
                if ((i & 12582912) == 0) {
                    if (dVarF.T(function11)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i4 |= i13;
                }
            }
            i14 = i3 & 256;
            if (i14 != 0) {
                if ((i & 100663296) == 0) {
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
                        i25 = i23 | (dVarF.T(function8) ? 256 : 128);
                    } else {
                        i25 = i23;
                    }
                    i26 = i3 & 8192;
                    if (i26 != 0) {
                        i27 = i25;
                        if ((i2 & 3072) == 0) {
                            i27 |= dVarF.T(function9) ? 2048 : 1024;
                        }
                        if ((i2 & 24576) != 0) {
                            if ((i3 & 16384) == 0) {
                                i7 = 16384;
                            }
                            i27 |= i7;
                        }
                        if ((i2 & 196608) != 0) {
                            if ((i3 & 32768) == 0) {
                                i32 = 65536;
                            } else {
                                i32 = 65536;
                            }
                            i27 |= i32;
                        }
                        i28 = i3 & 65536;
                        if (i28 != 0) {
                            i27 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            if (dVarF.T(function10)) {
                                i29 = 1048576;
                            } else {
                                i29 = 524288;
                            }
                            i27 |= i29;
                        }
                        if ((i3 & 131072) != 0) {
                            i27 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            if (dVarF.x(this)) {
                                i30 = 8388608;
                            } else {
                                i30 = 4194304;
                            }
                            i27 |= i30;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        if (dVarF.g(z5, i4 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i10 != 0) {
                                    z7 = false;
                                } else {
                                    z7 = z3;
                                }
                                if (i12 != 0) {
                                    function11 = null;
                                }
                                if (i14 != 0) {
                                    function20 = null;
                                } else {
                                    function20 = function4;
                                }
                                if (i16 != 0) {
                                    function21 = null;
                                } else {
                                    function21 = function5;
                                }
                                if (i18 != 0) {
                                    function22 = null;
                                } else {
                                    function22 = function6;
                                }
                                if (i21 != 0) {
                                    function23 = null;
                                } else {
                                    function23 = function7;
                                }
                                if (i24 != 0) {
                                    function24 = null;
                                } else {
                                    function24 = function8;
                                }
                                if (i26 != 0) {
                                    function25 = null;
                                } else {
                                    function25 = function9;
                                }
                                if ((i3 & 16384) != 0) {
                                    pscVarG = g(dVarF, (i27 >> 21) & 14);
                                    i27 &= -57345;
                                } else {
                                    pscVarG = pscVar;
                                }
                                if ((i3 & 32768) != 0) {
                                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i27 &= -458753;
                                } else {
                                    rx8VarJ = rx8Var;
                                }
                                if (i28 != 0) {
                                    rx8 rx8Var19 = rx8VarJ;
                                    boolean z11112 = z7;
                                    psc pscVar1114 = pscVarG;
                                    do1 do1VarE17 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                    rx8Var3 = rx8Var19;
                                    function27 = function21;
                                    function28 = function24;
                                    function29 = function25;
                                    function31 = function23;
                                    z8 = z11112;
                                    function32 = do1VarE17;
                                    function26 = function11;
                                    function30 = function22;
                                    z9 = true;
                                    i31 = i27;
                                    pscVar3 = pscVar1114;
                                } else {
                                    boolean z11113 = z7;
                                    psc pscVar1115 = pscVarG;
                                    rx8Var3 = rx8VarJ;
                                    function26 = function11;
                                    function27 = function21;
                                    function28 = function24;
                                    i31 = i27;
                                    function29 = function25;
                                    function30 = function22;
                                    function31 = function23;
                                    z8 = z11113;
                                    pscVar3 = pscVar1115;
                                    z9 = true;
                                    function32 = function10;
                                }
                            } else {
                                if (i10 != 0) {
                                    z7 = false;
                                } else {
                                    z7 = z3;
                                }
                                if (i12 != 0) {
                                    function11 = null;
                                }
                                if (i14 != 0) {
                                    function20 = null;
                                } else {
                                    function20 = function4;
                                }
                                if (i16 != 0) {
                                    function21 = null;
                                } else {
                                    function21 = function5;
                                }
                                if (i18 != 0) {
                                    function22 = null;
                                } else {
                                    function22 = function6;
                                }
                                if (i21 != 0) {
                                    function23 = null;
                                } else {
                                    function23 = function7;
                                }
                                if (i24 != 0) {
                                    function24 = null;
                                } else {
                                    function24 = function8;
                                }
                                if (i26 != 0) {
                                    function25 = null;
                                } else {
                                    function25 = function9;
                                }
                                if ((i3 & 16384) != 0) {
                                    pscVarG = g(dVarF, (i27 >> 21) & 14);
                                    i27 &= -57345;
                                } else {
                                    pscVarG = pscVar;
                                }
                                if ((i3 & 32768) != 0) {
                                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i27 &= -458753;
                                } else {
                                    rx8VarJ = rx8Var;
                                }
                                if (i28 != 0) {
                                    rx8 rx8Var110 = rx8VarJ;
                                    boolean z11114 = z7;
                                    psc pscVar1116 = pscVarG;
                                    do1 do1VarE18 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                    rx8Var3 = rx8Var110;
                                    function27 = function21;
                                    function28 = function24;
                                    function29 = function25;
                                    function31 = function23;
                                    z8 = z11114;
                                    function32 = do1VarE18;
                                    function26 = function11;
                                    function30 = function22;
                                    z9 = true;
                                    i31 = i27;
                                    pscVar3 = pscVar1116;
                                } else {
                                    boolean z11115 = z7;
                                    psc pscVar1117 = pscVarG;
                                    rx8Var3 = rx8VarJ;
                                    function26 = function11;
                                    function27 = function21;
                                    function28 = function24;
                                    i31 = i27;
                                    function29 = function25;
                                    function30 = function22;
                                    function31 = function23;
                                    z8 = z11115;
                                    pscVar3 = pscVar1117;
                                    z9 = true;
                                    function32 = function10;
                                }
                            }
                            dVarF.M();
                            Function2<? super d, ? super Integer, Unit> function319 = function28;
                            if (e.k()) {
                                e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                            }
                            if ((i4 & 14) == 4) {
                                z10 = z9;
                            } else {
                                z10 = r19;
                            }
                            z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                            objR = dVarF.R();
                            if (z11) {
                                obj = null;
                                objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                                dVarF.L(objR);
                            } else {
                                obj = null;
                                objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                                dVarF.L(objR);
                            }
                            String text9 = ((TransformedText) objR).getText().getText();
                            TextFieldType textFieldType9 = TextFieldType.Outlined;
                            v1.Attached attached9 = new v1.Attached(false, null, null, 7, null);
                            if (function26 == null) {
                                dVarF.y(1927058812);
                                dVarF.u();
                                do1VarE = null;
                            } else {
                                dVarF.y(1927058813);
                                do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                                dVarF.u();
                            }
                            int i31115 = i4 >> 9;
                            int i31116 = i31 << 21;
                            int i31117 = ((i4 << 3) & 896) | 6 | (458752 & i31115) | (3670016 & i31115) | (i31116 & 29360128) | (i31116 & 234881024) | (i31116 & 1879048192);
                            int i31118 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i31115 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                            dVar2 = dVarF;
                            Function2<? super d, ? super Integer, Unit> function3110 = function20;
                            TextFieldImplKt.l(textFieldType9, text9, function2, attached9, do1VarE, function3110, function27, function30, function31, function319, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i31117, i31118);
                            if (e.k()) {
                                e.n();
                            }
                            function15 = function319;
                            function16 = function29;
                            rx8Var2 = rx8Var3;
                            function17 = function32;
                            function13 = function30;
                            function14 = function31;
                            function19 = function3110;
                            function12 = function27;
                            z6 = z8;
                            pscVar2 = pscVar3;
                            function18 = function26;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            z6 = z3;
                            function12 = function5;
                            function13 = function6;
                            function14 = function7;
                            function15 = function8;
                            function16 = function9;
                            pscVar2 = pscVar;
                            rx8Var2 = rx8Var;
                            function17 = function10;
                            function18 = function11;
                            function19 = function4;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.su8
                                public final Object invoke(Object obj2, Object obj3) {
                                    return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
                                }
                            });
                        }
                    }
                    i27 = i25 | 3072;
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i7 = 16384;
                        }
                        i27 |= i7;
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32768) == 0) {
                            i32 = 65536;
                        } else {
                            i32 = 65536;
                        }
                        i27 |= i32;
                    }
                    i28 = i3 & 65536;
                    if (i28 != 0) {
                        i27 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (dVarF.T(function10)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i27 |= i29;
                    }
                    if ((i3 & 131072) != 0) {
                        i27 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (dVarF.x(this)) {
                            i30 = 8388608;
                        } else {
                            i30 = 4194304;
                        }
                        i27 |= i30;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    if (dVarF.g(z5, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z7 = false;
                            } else {
                                z7 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            }
                            if (i14 != 0) {
                                function20 = null;
                            } else {
                                function20 = function4;
                            }
                            if (i16 != 0) {
                                function21 = null;
                            } else {
                                function21 = function5;
                            }
                            if (i18 != 0) {
                                function22 = null;
                            } else {
                                function22 = function6;
                            }
                            if (i21 != 0) {
                                function23 = null;
                            } else {
                                function23 = function7;
                            }
                            if (i24 != 0) {
                                function24 = null;
                            } else {
                                function24 = function8;
                            }
                            if (i26 != 0) {
                                function25 = null;
                            } else {
                                function25 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                pscVarG = g(dVarF, (i27 >> 21) & 14);
                                i27 &= -57345;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 32768) != 0) {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i27 &= -458753;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i28 != 0) {
                                rx8 rx8Var111 = rx8VarJ;
                                boolean z11116 = z7;
                                psc pscVar1118 = pscVarG;
                                do1 do1VarE19 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                rx8Var3 = rx8Var111;
                                function27 = function21;
                                function28 = function24;
                                function29 = function25;
                                function31 = function23;
                                z8 = z11116;
                                function32 = do1VarE19;
                                function26 = function11;
                                function30 = function22;
                                z9 = true;
                                i31 = i27;
                                pscVar3 = pscVar1118;
                            } else {
                                boolean z11117 = z7;
                                psc pscVar1119 = pscVarG;
                                rx8Var3 = rx8VarJ;
                                function26 = function11;
                                function27 = function21;
                                function28 = function24;
                                i31 = i27;
                                function29 = function25;
                                function30 = function22;
                                function31 = function23;
                                z8 = z11117;
                                pscVar3 = pscVar1119;
                                z9 = true;
                                function32 = function10;
                            }
                        } else {
                            if (i10 != 0) {
                                z7 = false;
                            } else {
                                z7 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            }
                            if (i14 != 0) {
                                function20 = null;
                            } else {
                                function20 = function4;
                            }
                            if (i16 != 0) {
                                function21 = null;
                            } else {
                                function21 = function5;
                            }
                            if (i18 != 0) {
                                function22 = null;
                            } else {
                                function22 = function6;
                            }
                            if (i21 != 0) {
                                function23 = null;
                            } else {
                                function23 = function7;
                            }
                            if (i24 != 0) {
                                function24 = null;
                            } else {
                                function24 = function8;
                            }
                            if (i26 != 0) {
                                function25 = null;
                            } else {
                                function25 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                pscVarG = g(dVarF, (i27 >> 21) & 14);
                                i27 &= -57345;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 32768) != 0) {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i27 &= -458753;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i28 != 0) {
                                rx8 rx8Var112 = rx8VarJ;
                                boolean z11118 = z7;
                                psc pscVar11110 = pscVarG;
                                do1 do1VarE110 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                rx8Var3 = rx8Var112;
                                function27 = function21;
                                function28 = function24;
                                function29 = function25;
                                function31 = function23;
                                z8 = z11118;
                                function32 = do1VarE110;
                                function26 = function11;
                                function30 = function22;
                                z9 = true;
                                i31 = i27;
                                pscVar3 = pscVar11110;
                            } else {
                                boolean z11119 = z7;
                                psc pscVar11111 = pscVarG;
                                rx8Var3 = rx8VarJ;
                                function26 = function11;
                                function27 = function21;
                                function28 = function24;
                                i31 = i27;
                                function29 = function25;
                                function30 = function22;
                                function31 = function23;
                                z8 = z11119;
                                pscVar3 = pscVar11111;
                                z9 = true;
                                function32 = function10;
                            }
                        }
                        dVarF.M();
                        Function2<? super d, ? super Integer, Unit> function3111 = function28;
                        if (e.k()) {
                            e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                        }
                        if ((i4 & 14) == 4) {
                            z10 = z9;
                        } else {
                            z10 = r19;
                        }
                        z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                        objR = dVarF.R();
                        if (z11) {
                            obj = null;
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        } else {
                            obj = null;
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        }
                        String text10 = ((TransformedText) objR).getText().getText();
                        TextFieldType textFieldType10 = TextFieldType.Outlined;
                        v1.Attached attached10 = new v1.Attached(false, null, null, 7, null);
                        if (function26 == null) {
                            dVarF.y(1927058812);
                            dVarF.u();
                            do1VarE = null;
                        } else {
                            dVarF.y(1927058813);
                            do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                            dVarF.u();
                        }
                        int i31119 = i4 >> 9;
                        int i311110 = i31 << 21;
                        int i311111 = ((i4 << 3) & 896) | 6 | (458752 & i31119) | (3670016 & i31119) | (i311110 & 29360128) | (i311110 & 234881024) | (i311110 & 1879048192);
                        int i311112 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i31119 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                        dVar2 = dVarF;
                        Function2<? super d, ? super Integer, Unit> function3112 = function20;
                        TextFieldImplKt.l(textFieldType10, text10, function2, attached10, do1VarE, function3112, function27, function30, function31, function3111, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i311111, i311112);
                        if (e.k()) {
                            e.n();
                        }
                        function15 = function3111;
                        function16 = function29;
                        rx8Var2 = rx8Var3;
                        function17 = function32;
                        function13 = function30;
                        function14 = function31;
                        function19 = function3112;
                        function12 = function27;
                        z6 = z8;
                        pscVar2 = pscVar3;
                        function18 = function26;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        z6 = z3;
                        function12 = function5;
                        function13 = function6;
                        function14 = function7;
                        function15 = function8;
                        function16 = function9;
                        pscVar2 = pscVar;
                        rx8Var2 = rx8Var;
                        function17 = function10;
                        function18 = function11;
                        function19 = function4;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.su8
                            public final Object invoke(Object obj2, Object obj3) {
                                return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
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
                    i25 = i23 | (dVarF.T(function8) ? 256 : 128);
                } else {
                    i25 = i23;
                }
                i26 = i3 & 8192;
                if (i26 != 0) {
                    i27 = i25;
                    if ((i2 & 3072) == 0) {
                        i27 |= dVarF.T(function9) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i7 = 16384;
                        }
                        i27 |= i7;
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32768) == 0) {
                            i32 = 65536;
                        } else {
                            i32 = 65536;
                        }
                        i27 |= i32;
                    }
                    i28 = i3 & 65536;
                    if (i28 != 0) {
                        i27 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (dVarF.T(function10)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i27 |= i29;
                    }
                    if ((i3 & 131072) != 0) {
                        i27 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (dVarF.x(this)) {
                            i30 = 8388608;
                        } else {
                            i30 = 4194304;
                        }
                        i27 |= i30;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    if (dVarF.g(z5, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z7 = false;
                            } else {
                                z7 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            }
                            if (i14 != 0) {
                                function20 = null;
                            } else {
                                function20 = function4;
                            }
                            if (i16 != 0) {
                                function21 = null;
                            } else {
                                function21 = function5;
                            }
                            if (i18 != 0) {
                                function22 = null;
                            } else {
                                function22 = function6;
                            }
                            if (i21 != 0) {
                                function23 = null;
                            } else {
                                function23 = function7;
                            }
                            if (i24 != 0) {
                                function24 = null;
                            } else {
                                function24 = function8;
                            }
                            if (i26 != 0) {
                                function25 = null;
                            } else {
                                function25 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                pscVarG = g(dVarF, (i27 >> 21) & 14);
                                i27 &= -57345;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 32768) != 0) {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i27 &= -458753;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i28 != 0) {
                                rx8 rx8Var113 = rx8VarJ;
                                boolean z111110 = z7;
                                psc pscVar11112 = pscVarG;
                                do1 do1VarE111 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                rx8Var3 = rx8Var113;
                                function27 = function21;
                                function28 = function24;
                                function29 = function25;
                                function31 = function23;
                                z8 = z111110;
                                function32 = do1VarE111;
                                function26 = function11;
                                function30 = function22;
                                z9 = true;
                                i31 = i27;
                                pscVar3 = pscVar11112;
                            } else {
                                boolean z111111 = z7;
                                psc pscVar11113 = pscVarG;
                                rx8Var3 = rx8VarJ;
                                function26 = function11;
                                function27 = function21;
                                function28 = function24;
                                i31 = i27;
                                function29 = function25;
                                function30 = function22;
                                function31 = function23;
                                z8 = z111111;
                                pscVar3 = pscVar11113;
                                z9 = true;
                                function32 = function10;
                            }
                        } else {
                            if (i10 != 0) {
                                z7 = false;
                            } else {
                                z7 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            }
                            if (i14 != 0) {
                                function20 = null;
                            } else {
                                function20 = function4;
                            }
                            if (i16 != 0) {
                                function21 = null;
                            } else {
                                function21 = function5;
                            }
                            if (i18 != 0) {
                                function22 = null;
                            } else {
                                function22 = function6;
                            }
                            if (i21 != 0) {
                                function23 = null;
                            } else {
                                function23 = function7;
                            }
                            if (i24 != 0) {
                                function24 = null;
                            } else {
                                function24 = function8;
                            }
                            if (i26 != 0) {
                                function25 = null;
                            } else {
                                function25 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                pscVarG = g(dVarF, (i27 >> 21) & 14);
                                i27 &= -57345;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 32768) != 0) {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i27 &= -458753;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i28 != 0) {
                                rx8 rx8Var114 = rx8VarJ;
                                boolean z111112 = z7;
                                psc pscVar11114 = pscVarG;
                                do1 do1VarE112 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                rx8Var3 = rx8Var114;
                                function27 = function21;
                                function28 = function24;
                                function29 = function25;
                                function31 = function23;
                                z8 = z111112;
                                function32 = do1VarE112;
                                function26 = function11;
                                function30 = function22;
                                z9 = true;
                                i31 = i27;
                                pscVar3 = pscVar11114;
                            } else {
                                boolean z111113 = z7;
                                psc pscVar11115 = pscVarG;
                                rx8Var3 = rx8VarJ;
                                function26 = function11;
                                function27 = function21;
                                function28 = function24;
                                i31 = i27;
                                function29 = function25;
                                function30 = function22;
                                function31 = function23;
                                z8 = z111113;
                                pscVar3 = pscVar11115;
                                z9 = true;
                                function32 = function10;
                            }
                        }
                        dVarF.M();
                        Function2<? super d, ? super Integer, Unit> function3113 = function28;
                        if (e.k()) {
                            e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                        }
                        if ((i4 & 14) == 4) {
                            z10 = z9;
                        } else {
                            z10 = r19;
                        }
                        z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                        objR = dVarF.R();
                        if (z11) {
                            obj = null;
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        } else {
                            obj = null;
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        }
                        String text11 = ((TransformedText) objR).getText().getText();
                        TextFieldType textFieldType11 = TextFieldType.Outlined;
                        v1.Attached attached11 = new v1.Attached(false, null, null, 7, null);
                        if (function26 == null) {
                            dVarF.y(1927058812);
                            dVarF.u();
                            do1VarE = null;
                        } else {
                            dVarF.y(1927058813);
                            do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                            dVarF.u();
                        }
                        int i311113 = i4 >> 9;
                        int i311114 = i31 << 21;
                        int i311115 = ((i4 << 3) & 896) | 6 | (458752 & i311113) | (3670016 & i311113) | (i311114 & 29360128) | (i311114 & 234881024) | (i311114 & 1879048192);
                        int i311116 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i311113 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                        dVar2 = dVarF;
                        Function2<? super d, ? super Integer, Unit> function3114 = function20;
                        TextFieldImplKt.l(textFieldType11, text11, function2, attached11, do1VarE, function3114, function27, function30, function31, function3113, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i311115, i311116);
                        if (e.k()) {
                            e.n();
                        }
                        function15 = function3113;
                        function16 = function29;
                        rx8Var2 = rx8Var3;
                        function17 = function32;
                        function13 = function30;
                        function14 = function31;
                        function19 = function3114;
                        function12 = function27;
                        z6 = z8;
                        pscVar2 = pscVar3;
                        function18 = function26;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        z6 = z3;
                        function12 = function5;
                        function13 = function6;
                        function14 = function7;
                        function15 = function8;
                        function16 = function9;
                        pscVar2 = pscVar;
                        rx8Var2 = rx8Var;
                        function17 = function10;
                        function18 = function11;
                        function19 = function4;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.su8
                            public final Object invoke(Object obj2, Object obj3) {
                                return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i27 = i25 | 3072;
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i7 = 16384;
                    }
                    i27 |= i7;
                }
                if ((i2 & 196608) != 0) {
                    if ((i3 & 32768) == 0) {
                        i32 = 65536;
                    } else {
                        i32 = 65536;
                    }
                    i27 |= i32;
                }
                i28 = i3 & 65536;
                if (i28 != 0) {
                    i27 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (dVarF.T(function10)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i27 |= i29;
                }
                if ((i3 & 131072) != 0) {
                    i27 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (dVarF.x(this)) {
                        i30 = 8388608;
                    } else {
                        i30 = 4194304;
                    }
                    i27 |= i30;
                }
                if ((i4 & 306783379) == 306783378) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (dVarF.g(z5, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z7 = false;
                        } else {
                            z7 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        }
                        if (i14 != 0) {
                            function20 = null;
                        } else {
                            function20 = function4;
                        }
                        if (i16 != 0) {
                            function21 = null;
                        } else {
                            function21 = function5;
                        }
                        if (i18 != 0) {
                            function22 = null;
                        } else {
                            function22 = function6;
                        }
                        if (i21 != 0) {
                            function23 = null;
                        } else {
                            function23 = function7;
                        }
                        if (i24 != 0) {
                            function24 = null;
                        } else {
                            function24 = function8;
                        }
                        if (i26 != 0) {
                            function25 = null;
                        } else {
                            function25 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            pscVarG = g(dVarF, (i27 >> 21) & 14);
                            i27 &= -57345;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 32768) != 0) {
                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i27 &= -458753;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i28 != 0) {
                            rx8 rx8Var115 = rx8VarJ;
                            boolean z111114 = z7;
                            psc pscVar11116 = pscVarG;
                            do1 do1VarE113 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                            rx8Var3 = rx8Var115;
                            function27 = function21;
                            function28 = function24;
                            function29 = function25;
                            function31 = function23;
                            z8 = z111114;
                            function32 = do1VarE113;
                            function26 = function11;
                            function30 = function22;
                            z9 = true;
                            i31 = i27;
                            pscVar3 = pscVar11116;
                        } else {
                            boolean z111115 = z7;
                            psc pscVar11117 = pscVarG;
                            rx8Var3 = rx8VarJ;
                            function26 = function11;
                            function27 = function21;
                            function28 = function24;
                            i31 = i27;
                            function29 = function25;
                            function30 = function22;
                            function31 = function23;
                            z8 = z111115;
                            pscVar3 = pscVar11117;
                            z9 = true;
                            function32 = function10;
                        }
                    } else {
                        if (i10 != 0) {
                            z7 = false;
                        } else {
                            z7 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        }
                        if (i14 != 0) {
                            function20 = null;
                        } else {
                            function20 = function4;
                        }
                        if (i16 != 0) {
                            function21 = null;
                        } else {
                            function21 = function5;
                        }
                        if (i18 != 0) {
                            function22 = null;
                        } else {
                            function22 = function6;
                        }
                        if (i21 != 0) {
                            function23 = null;
                        } else {
                            function23 = function7;
                        }
                        if (i24 != 0) {
                            function24 = null;
                        } else {
                            function24 = function8;
                        }
                        if (i26 != 0) {
                            function25 = null;
                        } else {
                            function25 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            pscVarG = g(dVarF, (i27 >> 21) & 14);
                            i27 &= -57345;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 32768) != 0) {
                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i27 &= -458753;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i28 != 0) {
                            rx8 rx8Var116 = rx8VarJ;
                            boolean z111116 = z7;
                            psc pscVar11118 = pscVarG;
                            do1 do1VarE114 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                            rx8Var3 = rx8Var116;
                            function27 = function21;
                            function28 = function24;
                            function29 = function25;
                            function31 = function23;
                            z8 = z111116;
                            function32 = do1VarE114;
                            function26 = function11;
                            function30 = function22;
                            z9 = true;
                            i31 = i27;
                            pscVar3 = pscVar11118;
                        } else {
                            boolean z111117 = z7;
                            psc pscVar11119 = pscVarG;
                            rx8Var3 = rx8VarJ;
                            function26 = function11;
                            function27 = function21;
                            function28 = function24;
                            i31 = i27;
                            function29 = function25;
                            function30 = function22;
                            function31 = function23;
                            z8 = z111117;
                            pscVar3 = pscVar11119;
                            z9 = true;
                            function32 = function10;
                        }
                    }
                    dVarF.M();
                    Function2<? super d, ? super Integer, Unit> function3115 = function28;
                    if (e.k()) {
                        e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                    }
                    if ((i4 & 14) == 4) {
                        z10 = z9;
                    } else {
                        z10 = r19;
                    }
                    z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                    objR = dVarF.R();
                    if (z11) {
                        obj = null;
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    } else {
                        obj = null;
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    }
                    String text12 = ((TransformedText) objR).getText().getText();
                    TextFieldType textFieldType12 = TextFieldType.Outlined;
                    v1.Attached attached12 = new v1.Attached(false, null, null, 7, null);
                    if (function26 == null) {
                        dVarF.y(1927058812);
                        dVarF.u();
                        do1VarE = null;
                    } else {
                        dVarF.y(1927058813);
                        do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                        dVarF.u();
                    }
                    int i311117 = i4 >> 9;
                    int i311118 = i31 << 21;
                    int i311119 = ((i4 << 3) & 896) | 6 | (458752 & i311117) | (3670016 & i311117) | (i311118 & 29360128) | (i311118 & 234881024) | (i311118 & 1879048192);
                    int i3111110 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i311117 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                    dVar2 = dVarF;
                    Function2<? super d, ? super Integer, Unit> function3116 = function20;
                    TextFieldImplKt.l(textFieldType12, text12, function2, attached12, do1VarE, function3116, function27, function30, function31, function3115, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i311119, i3111110);
                    if (e.k()) {
                        e.n();
                    }
                    function15 = function3115;
                    function16 = function29;
                    rx8Var2 = rx8Var3;
                    function17 = function32;
                    function13 = function30;
                    function14 = function31;
                    function19 = function3116;
                    function12 = function27;
                    z6 = z8;
                    pscVar2 = pscVar3;
                    function18 = function26;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    z6 = z3;
                    function12 = function5;
                    function13 = function6;
                    function14 = function7;
                    function15 = function8;
                    function16 = function9;
                    pscVar2 = pscVar;
                    rx8Var2 = rx8Var;
                    function17 = function10;
                    function18 = function11;
                    function19 = function4;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.su8
                        public final Object invoke(Object obj2, Object obj3) {
                            return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i4 |= 100663296;
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
                    i25 = i23 | (dVarF.T(function8) ? 256 : 128);
                } else {
                    i25 = i23;
                }
                i26 = i3 & 8192;
                if (i26 != 0) {
                    i27 = i25;
                    if ((i2 & 3072) == 0) {
                        i27 |= dVarF.T(function9) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i7 = 16384;
                        }
                        i27 |= i7;
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32768) == 0) {
                            i32 = 65536;
                        } else {
                            i32 = 65536;
                        }
                        i27 |= i32;
                    }
                    i28 = i3 & 65536;
                    if (i28 != 0) {
                        i27 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (dVarF.T(function10)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i27 |= i29;
                    }
                    if ((i3 & 131072) != 0) {
                        i27 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (dVarF.x(this)) {
                            i30 = 8388608;
                        } else {
                            i30 = 4194304;
                        }
                        i27 |= i30;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    if (dVarF.g(z5, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z7 = false;
                            } else {
                                z7 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            }
                            if (i14 != 0) {
                                function20 = null;
                            } else {
                                function20 = function4;
                            }
                            if (i16 != 0) {
                                function21 = null;
                            } else {
                                function21 = function5;
                            }
                            if (i18 != 0) {
                                function22 = null;
                            } else {
                                function22 = function6;
                            }
                            if (i21 != 0) {
                                function23 = null;
                            } else {
                                function23 = function7;
                            }
                            if (i24 != 0) {
                                function24 = null;
                            } else {
                                function24 = function8;
                            }
                            if (i26 != 0) {
                                function25 = null;
                            } else {
                                function25 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                pscVarG = g(dVarF, (i27 >> 21) & 14);
                                i27 &= -57345;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 32768) != 0) {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i27 &= -458753;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i28 != 0) {
                                rx8 rx8Var117 = rx8VarJ;
                                boolean z111118 = z7;
                                psc pscVar111110 = pscVarG;
                                do1 do1VarE115 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                rx8Var3 = rx8Var117;
                                function27 = function21;
                                function28 = function24;
                                function29 = function25;
                                function31 = function23;
                                z8 = z111118;
                                function32 = do1VarE115;
                                function26 = function11;
                                function30 = function22;
                                z9 = true;
                                i31 = i27;
                                pscVar3 = pscVar111110;
                            } else {
                                boolean z111119 = z7;
                                psc pscVar111111 = pscVarG;
                                rx8Var3 = rx8VarJ;
                                function26 = function11;
                                function27 = function21;
                                function28 = function24;
                                i31 = i27;
                                function29 = function25;
                                function30 = function22;
                                function31 = function23;
                                z8 = z111119;
                                pscVar3 = pscVar111111;
                                z9 = true;
                                function32 = function10;
                            }
                        } else {
                            if (i10 != 0) {
                                z7 = false;
                            } else {
                                z7 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            }
                            if (i14 != 0) {
                                function20 = null;
                            } else {
                                function20 = function4;
                            }
                            if (i16 != 0) {
                                function21 = null;
                            } else {
                                function21 = function5;
                            }
                            if (i18 != 0) {
                                function22 = null;
                            } else {
                                function22 = function6;
                            }
                            if (i21 != 0) {
                                function23 = null;
                            } else {
                                function23 = function7;
                            }
                            if (i24 != 0) {
                                function24 = null;
                            } else {
                                function24 = function8;
                            }
                            if (i26 != 0) {
                                function25 = null;
                            } else {
                                function25 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                pscVarG = g(dVarF, (i27 >> 21) & 14);
                                i27 &= -57345;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 32768) != 0) {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i27 &= -458753;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i28 != 0) {
                                rx8 rx8Var118 = rx8VarJ;
                                boolean z1111110 = z7;
                                psc pscVar111112 = pscVarG;
                                do1 do1VarE116 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                rx8Var3 = rx8Var118;
                                function27 = function21;
                                function28 = function24;
                                function29 = function25;
                                function31 = function23;
                                z8 = z1111110;
                                function32 = do1VarE116;
                                function26 = function11;
                                function30 = function22;
                                z9 = true;
                                i31 = i27;
                                pscVar3 = pscVar111112;
                            } else {
                                boolean z1111111 = z7;
                                psc pscVar111113 = pscVarG;
                                rx8Var3 = rx8VarJ;
                                function26 = function11;
                                function27 = function21;
                                function28 = function24;
                                i31 = i27;
                                function29 = function25;
                                function30 = function22;
                                function31 = function23;
                                z8 = z1111111;
                                pscVar3 = pscVar111113;
                                z9 = true;
                                function32 = function10;
                            }
                        }
                        dVarF.M();
                        Function2<? super d, ? super Integer, Unit> function3117 = function28;
                        if (e.k()) {
                            e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                        }
                        if ((i4 & 14) == 4) {
                            z10 = z9;
                        } else {
                            z10 = r19;
                        }
                        z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                        objR = dVarF.R();
                        if (z11) {
                            obj = null;
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        } else {
                            obj = null;
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        }
                        String text13 = ((TransformedText) objR).getText().getText();
                        TextFieldType textFieldType13 = TextFieldType.Outlined;
                        v1.Attached attached13 = new v1.Attached(false, null, null, 7, null);
                        if (function26 == null) {
                            dVarF.y(1927058812);
                            dVarF.u();
                            do1VarE = null;
                        } else {
                            dVarF.y(1927058813);
                            do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                            dVarF.u();
                        }
                        int i3111111 = i4 >> 9;
                        int i3111112 = i31 << 21;
                        int i3111113 = ((i4 << 3) & 896) | 6 | (458752 & i3111111) | (3670016 & i3111111) | (i3111112 & 29360128) | (i3111112 & 234881024) | (i3111112 & 1879048192);
                        int i3111114 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i3111111 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                        dVar2 = dVarF;
                        Function2<? super d, ? super Integer, Unit> function3118 = function20;
                        TextFieldImplKt.l(textFieldType13, text13, function2, attached13, do1VarE, function3118, function27, function30, function31, function3117, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i3111113, i3111114);
                        if (e.k()) {
                            e.n();
                        }
                        function15 = function3117;
                        function16 = function29;
                        rx8Var2 = rx8Var3;
                        function17 = function32;
                        function13 = function30;
                        function14 = function31;
                        function19 = function3118;
                        function12 = function27;
                        z6 = z8;
                        pscVar2 = pscVar3;
                        function18 = function26;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        z6 = z3;
                        function12 = function5;
                        function13 = function6;
                        function14 = function7;
                        function15 = function8;
                        function16 = function9;
                        pscVar2 = pscVar;
                        rx8Var2 = rx8Var;
                        function17 = function10;
                        function18 = function11;
                        function19 = function4;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.su8
                            public final Object invoke(Object obj2, Object obj3) {
                                return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i27 = i25 | 3072;
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i7 = 16384;
                    }
                    i27 |= i7;
                }
                if ((i2 & 196608) != 0) {
                    if ((i3 & 32768) == 0) {
                        i32 = 65536;
                    } else {
                        i32 = 65536;
                    }
                    i27 |= i32;
                }
                i28 = i3 & 65536;
                if (i28 != 0) {
                    i27 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (dVarF.T(function10)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i27 |= i29;
                }
                if ((i3 & 131072) != 0) {
                    i27 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (dVarF.x(this)) {
                        i30 = 8388608;
                    } else {
                        i30 = 4194304;
                    }
                    i27 |= i30;
                }
                if ((i4 & 306783379) == 306783378) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (dVarF.g(z5, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z7 = false;
                        } else {
                            z7 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        }
                        if (i14 != 0) {
                            function20 = null;
                        } else {
                            function20 = function4;
                        }
                        if (i16 != 0) {
                            function21 = null;
                        } else {
                            function21 = function5;
                        }
                        if (i18 != 0) {
                            function22 = null;
                        } else {
                            function22 = function6;
                        }
                        if (i21 != 0) {
                            function23 = null;
                        } else {
                            function23 = function7;
                        }
                        if (i24 != 0) {
                            function24 = null;
                        } else {
                            function24 = function8;
                        }
                        if (i26 != 0) {
                            function25 = null;
                        } else {
                            function25 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            pscVarG = g(dVarF, (i27 >> 21) & 14);
                            i27 &= -57345;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 32768) != 0) {
                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i27 &= -458753;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i28 != 0) {
                            rx8 rx8Var119 = rx8VarJ;
                            boolean z1111112 = z7;
                            psc pscVar111114 = pscVarG;
                            do1 do1VarE117 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                            rx8Var3 = rx8Var119;
                            function27 = function21;
                            function28 = function24;
                            function29 = function25;
                            function31 = function23;
                            z8 = z1111112;
                            function32 = do1VarE117;
                            function26 = function11;
                            function30 = function22;
                            z9 = true;
                            i31 = i27;
                            pscVar3 = pscVar111114;
                        } else {
                            boolean z1111113 = z7;
                            psc pscVar111115 = pscVarG;
                            rx8Var3 = rx8VarJ;
                            function26 = function11;
                            function27 = function21;
                            function28 = function24;
                            i31 = i27;
                            function29 = function25;
                            function30 = function22;
                            function31 = function23;
                            z8 = z1111113;
                            pscVar3 = pscVar111115;
                            z9 = true;
                            function32 = function10;
                        }
                    } else {
                        if (i10 != 0) {
                            z7 = false;
                        } else {
                            z7 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        }
                        if (i14 != 0) {
                            function20 = null;
                        } else {
                            function20 = function4;
                        }
                        if (i16 != 0) {
                            function21 = null;
                        } else {
                            function21 = function5;
                        }
                        if (i18 != 0) {
                            function22 = null;
                        } else {
                            function22 = function6;
                        }
                        if (i21 != 0) {
                            function23 = null;
                        } else {
                            function23 = function7;
                        }
                        if (i24 != 0) {
                            function24 = null;
                        } else {
                            function24 = function8;
                        }
                        if (i26 != 0) {
                            function25 = null;
                        } else {
                            function25 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            pscVarG = g(dVarF, (i27 >> 21) & 14);
                            i27 &= -57345;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 32768) != 0) {
                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i27 &= -458753;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i28 != 0) {
                            rx8 rx8Var1110 = rx8VarJ;
                            boolean z1111114 = z7;
                            psc pscVar111116 = pscVarG;
                            do1 do1VarE118 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                            rx8Var3 = rx8Var1110;
                            function27 = function21;
                            function28 = function24;
                            function29 = function25;
                            function31 = function23;
                            z8 = z1111114;
                            function32 = do1VarE118;
                            function26 = function11;
                            function30 = function22;
                            z9 = true;
                            i31 = i27;
                            pscVar3 = pscVar111116;
                        } else {
                            boolean z1111115 = z7;
                            psc pscVar111117 = pscVarG;
                            rx8Var3 = rx8VarJ;
                            function26 = function11;
                            function27 = function21;
                            function28 = function24;
                            i31 = i27;
                            function29 = function25;
                            function30 = function22;
                            function31 = function23;
                            z8 = z1111115;
                            pscVar3 = pscVar111117;
                            z9 = true;
                            function32 = function10;
                        }
                    }
                    dVarF.M();
                    Function2<? super d, ? super Integer, Unit> function3119 = function28;
                    if (e.k()) {
                        e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                    }
                    if ((i4 & 14) == 4) {
                        z10 = z9;
                    } else {
                        z10 = r19;
                    }
                    z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                    objR = dVarF.R();
                    if (z11) {
                        obj = null;
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    } else {
                        obj = null;
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    }
                    String text14 = ((TransformedText) objR).getText().getText();
                    TextFieldType textFieldType14 = TextFieldType.Outlined;
                    v1.Attached attached14 = new v1.Attached(false, null, null, 7, null);
                    if (function26 == null) {
                        dVarF.y(1927058812);
                        dVarF.u();
                        do1VarE = null;
                    } else {
                        dVarF.y(1927058813);
                        do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                        dVarF.u();
                    }
                    int i3111115 = i4 >> 9;
                    int i3111116 = i31 << 21;
                    int i3111117 = ((i4 << 3) & 896) | 6 | (458752 & i3111115) | (3670016 & i3111115) | (i3111116 & 29360128) | (i3111116 & 234881024) | (i3111116 & 1879048192);
                    int i3111118 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i3111115 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                    dVar2 = dVarF;
                    Function2<? super d, ? super Integer, Unit> function31110 = function20;
                    TextFieldImplKt.l(textFieldType14, text14, function2, attached14, do1VarE, function31110, function27, function30, function31, function3119, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i3111117, i3111118);
                    if (e.k()) {
                        e.n();
                    }
                    function15 = function3119;
                    function16 = function29;
                    rx8Var2 = rx8Var3;
                    function17 = function32;
                    function13 = function30;
                    function14 = function31;
                    function19 = function31110;
                    function12 = function27;
                    z6 = z8;
                    pscVar2 = pscVar3;
                    function18 = function26;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    z6 = z3;
                    function12 = function5;
                    function13 = function6;
                    function14 = function7;
                    function15 = function8;
                    function16 = function9;
                    pscVar2 = pscVar;
                    rx8Var2 = rx8Var;
                    function17 = function10;
                    function18 = function11;
                    function19 = function4;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.su8
                        public final Object invoke(Object obj2, Object obj3) {
                            return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
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
                i25 = i23 | (dVarF.T(function8) ? 256 : 128);
            } else {
                i25 = i23;
            }
            i26 = i3 & 8192;
            if (i26 != 0) {
                i27 = i25;
                if ((i2 & 3072) == 0) {
                    i27 |= dVarF.T(function9) ? 2048 : 1024;
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i7 = 16384;
                    }
                    i27 |= i7;
                }
                if ((i2 & 196608) != 0) {
                    if ((i3 & 32768) == 0) {
                        i32 = 65536;
                    } else {
                        i32 = 65536;
                    }
                    i27 |= i32;
                }
                i28 = i3 & 65536;
                if (i28 != 0) {
                    i27 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (dVarF.T(function10)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i27 |= i29;
                }
                if ((i3 & 131072) != 0) {
                    i27 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (dVarF.x(this)) {
                        i30 = 8388608;
                    } else {
                        i30 = 4194304;
                    }
                    i27 |= i30;
                }
                if ((i4 & 306783379) == 306783378) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (dVarF.g(z5, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z7 = false;
                        } else {
                            z7 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        }
                        if (i14 != 0) {
                            function20 = null;
                        } else {
                            function20 = function4;
                        }
                        if (i16 != 0) {
                            function21 = null;
                        } else {
                            function21 = function5;
                        }
                        if (i18 != 0) {
                            function22 = null;
                        } else {
                            function22 = function6;
                        }
                        if (i21 != 0) {
                            function23 = null;
                        } else {
                            function23 = function7;
                        }
                        if (i24 != 0) {
                            function24 = null;
                        } else {
                            function24 = function8;
                        }
                        if (i26 != 0) {
                            function25 = null;
                        } else {
                            function25 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            pscVarG = g(dVarF, (i27 >> 21) & 14);
                            i27 &= -57345;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 32768) != 0) {
                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i27 &= -458753;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i28 != 0) {
                            rx8 rx8Var1111 = rx8VarJ;
                            boolean z1111116 = z7;
                            psc pscVar111118 = pscVarG;
                            do1 do1VarE119 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                            rx8Var3 = rx8Var1111;
                            function27 = function21;
                            function28 = function24;
                            function29 = function25;
                            function31 = function23;
                            z8 = z1111116;
                            function32 = do1VarE119;
                            function26 = function11;
                            function30 = function22;
                            z9 = true;
                            i31 = i27;
                            pscVar3 = pscVar111118;
                        } else {
                            boolean z1111117 = z7;
                            psc pscVar111119 = pscVarG;
                            rx8Var3 = rx8VarJ;
                            function26 = function11;
                            function27 = function21;
                            function28 = function24;
                            i31 = i27;
                            function29 = function25;
                            function30 = function22;
                            function31 = function23;
                            z8 = z1111117;
                            pscVar3 = pscVar111119;
                            z9 = true;
                            function32 = function10;
                        }
                    } else {
                        if (i10 != 0) {
                            z7 = false;
                        } else {
                            z7 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        }
                        if (i14 != 0) {
                            function20 = null;
                        } else {
                            function20 = function4;
                        }
                        if (i16 != 0) {
                            function21 = null;
                        } else {
                            function21 = function5;
                        }
                        if (i18 != 0) {
                            function22 = null;
                        } else {
                            function22 = function6;
                        }
                        if (i21 != 0) {
                            function23 = null;
                        } else {
                            function23 = function7;
                        }
                        if (i24 != 0) {
                            function24 = null;
                        } else {
                            function24 = function8;
                        }
                        if (i26 != 0) {
                            function25 = null;
                        } else {
                            function25 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            pscVarG = g(dVarF, (i27 >> 21) & 14);
                            i27 &= -57345;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 32768) != 0) {
                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i27 &= -458753;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i28 != 0) {
                            rx8 rx8Var1112 = rx8VarJ;
                            boolean z1111118 = z7;
                            psc pscVar1111110 = pscVarG;
                            do1 do1VarE1110 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                            rx8Var3 = rx8Var1112;
                            function27 = function21;
                            function28 = function24;
                            function29 = function25;
                            function31 = function23;
                            z8 = z1111118;
                            function32 = do1VarE1110;
                            function26 = function11;
                            function30 = function22;
                            z9 = true;
                            i31 = i27;
                            pscVar3 = pscVar1111110;
                        } else {
                            boolean z1111119 = z7;
                            psc pscVar1111111 = pscVarG;
                            rx8Var3 = rx8VarJ;
                            function26 = function11;
                            function27 = function21;
                            function28 = function24;
                            i31 = i27;
                            function29 = function25;
                            function30 = function22;
                            function31 = function23;
                            z8 = z1111119;
                            pscVar3 = pscVar1111111;
                            z9 = true;
                            function32 = function10;
                        }
                    }
                    dVarF.M();
                    Function2<? super d, ? super Integer, Unit> function31111 = function28;
                    if (e.k()) {
                        e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                    }
                    if ((i4 & 14) == 4) {
                        z10 = z9;
                    } else {
                        z10 = r19;
                    }
                    z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                    objR = dVarF.R();
                    if (z11) {
                        obj = null;
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    } else {
                        obj = null;
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    }
                    String text15 = ((TransformedText) objR).getText().getText();
                    TextFieldType textFieldType15 = TextFieldType.Outlined;
                    v1.Attached attached15 = new v1.Attached(false, null, null, 7, null);
                    if (function26 == null) {
                        dVarF.y(1927058812);
                        dVarF.u();
                        do1VarE = null;
                    } else {
                        dVarF.y(1927058813);
                        do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                        dVarF.u();
                    }
                    int i3111119 = i4 >> 9;
                    int i31111110 = i31 << 21;
                    int i31111111 = ((i4 << 3) & 896) | 6 | (458752 & i3111119) | (3670016 & i3111119) | (i31111110 & 29360128) | (i31111110 & 234881024) | (i31111110 & 1879048192);
                    int i31111112 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i3111119 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                    dVar2 = dVarF;
                    Function2<? super d, ? super Integer, Unit> function31112 = function20;
                    TextFieldImplKt.l(textFieldType15, text15, function2, attached15, do1VarE, function31112, function27, function30, function31, function31111, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i31111111, i31111112);
                    if (e.k()) {
                        e.n();
                    }
                    function15 = function31111;
                    function16 = function29;
                    rx8Var2 = rx8Var3;
                    function17 = function32;
                    function13 = function30;
                    function14 = function31;
                    function19 = function31112;
                    function12 = function27;
                    z6 = z8;
                    pscVar2 = pscVar3;
                    function18 = function26;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    z6 = z3;
                    function12 = function5;
                    function13 = function6;
                    function14 = function7;
                    function15 = function8;
                    function16 = function9;
                    pscVar2 = pscVar;
                    rx8Var2 = rx8Var;
                    function17 = function10;
                    function18 = function11;
                    function19 = function4;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.su8
                        public final Object invoke(Object obj2, Object obj3) {
                            return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i27 = i25 | 3072;
            if ((i2 & 24576) != 0) {
                if ((i3 & 16384) == 0) {
                    i7 = 16384;
                }
                i27 |= i7;
            }
            if ((i2 & 196608) != 0) {
                if ((i3 & 32768) == 0) {
                    i32 = 65536;
                } else {
                    i32 = 65536;
                }
                i27 |= i32;
            }
            i28 = i3 & 65536;
            if (i28 != 0) {
                i27 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (dVarF.T(function10)) {
                    i29 = 1048576;
                } else {
                    i29 = 524288;
                }
                i27 |= i29;
            }
            if ((i3 & 131072) != 0) {
                i27 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (dVarF.x(this)) {
                    i30 = 8388608;
                } else {
                    i30 = 4194304;
                }
                i27 |= i30;
            }
            if ((i4 & 306783379) == 306783378) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (dVarF.g(z5, i4 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        z7 = false;
                    } else {
                        z7 = z3;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    }
                    if (i14 != 0) {
                        function20 = null;
                    } else {
                        function20 = function4;
                    }
                    if (i16 != 0) {
                        function21 = null;
                    } else {
                        function21 = function5;
                    }
                    if (i18 != 0) {
                        function22 = null;
                    } else {
                        function22 = function6;
                    }
                    if (i21 != 0) {
                        function23 = null;
                    } else {
                        function23 = function7;
                    }
                    if (i24 != 0) {
                        function24 = null;
                    } else {
                        function24 = function8;
                    }
                    if (i26 != 0) {
                        function25 = null;
                    } else {
                        function25 = function9;
                    }
                    if ((i3 & 16384) != 0) {
                        pscVarG = g(dVarF, (i27 >> 21) & 14);
                        i27 &= -57345;
                    } else {
                        pscVarG = pscVar;
                    }
                    if ((i3 & 32768) != 0) {
                        rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i27 &= -458753;
                    } else {
                        rx8VarJ = rx8Var;
                    }
                    if (i28 != 0) {
                        rx8 rx8Var1113 = rx8VarJ;
                        boolean z11111110 = z7;
                        psc pscVar1111112 = pscVarG;
                        do1 do1VarE1111 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                        rx8Var3 = rx8Var1113;
                        function27 = function21;
                        function28 = function24;
                        function29 = function25;
                        function31 = function23;
                        z8 = z11111110;
                        function32 = do1VarE1111;
                        function26 = function11;
                        function30 = function22;
                        z9 = true;
                        i31 = i27;
                        pscVar3 = pscVar1111112;
                    } else {
                        boolean z11111111 = z7;
                        psc pscVar1111113 = pscVarG;
                        rx8Var3 = rx8VarJ;
                        function26 = function11;
                        function27 = function21;
                        function28 = function24;
                        i31 = i27;
                        function29 = function25;
                        function30 = function22;
                        function31 = function23;
                        z8 = z11111111;
                        pscVar3 = pscVar1111113;
                        z9 = true;
                        function32 = function10;
                    }
                } else {
                    if (i10 != 0) {
                        z7 = false;
                    } else {
                        z7 = z3;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    }
                    if (i14 != 0) {
                        function20 = null;
                    } else {
                        function20 = function4;
                    }
                    if (i16 != 0) {
                        function21 = null;
                    } else {
                        function21 = function5;
                    }
                    if (i18 != 0) {
                        function22 = null;
                    } else {
                        function22 = function6;
                    }
                    if (i21 != 0) {
                        function23 = null;
                    } else {
                        function23 = function7;
                    }
                    if (i24 != 0) {
                        function24 = null;
                    } else {
                        function24 = function8;
                    }
                    if (i26 != 0) {
                        function25 = null;
                    } else {
                        function25 = function9;
                    }
                    if ((i3 & 16384) != 0) {
                        pscVarG = g(dVarF, (i27 >> 21) & 14);
                        i27 &= -57345;
                    } else {
                        pscVarG = pscVar;
                    }
                    if ((i3 & 32768) != 0) {
                        rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i27 &= -458753;
                    } else {
                        rx8VarJ = rx8Var;
                    }
                    if (i28 != 0) {
                        rx8 rx8Var1114 = rx8VarJ;
                        boolean z11111112 = z7;
                        psc pscVar1111114 = pscVarG;
                        do1 do1VarE1112 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                        rx8Var3 = rx8Var1114;
                        function27 = function21;
                        function28 = function24;
                        function29 = function25;
                        function31 = function23;
                        z8 = z11111112;
                        function32 = do1VarE1112;
                        function26 = function11;
                        function30 = function22;
                        z9 = true;
                        i31 = i27;
                        pscVar3 = pscVar1111114;
                    } else {
                        boolean z11111113 = z7;
                        psc pscVar1111115 = pscVarG;
                        rx8Var3 = rx8VarJ;
                        function26 = function11;
                        function27 = function21;
                        function28 = function24;
                        i31 = i27;
                        function29 = function25;
                        function30 = function22;
                        function31 = function23;
                        z8 = z11111113;
                        pscVar3 = pscVar1111115;
                        z9 = true;
                        function32 = function10;
                    }
                }
                dVarF.M();
                Function2<? super d, ? super Integer, Unit> function31113 = function28;
                if (e.k()) {
                    e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                }
                if ((i4 & 14) == 4) {
                    z10 = z9;
                } else {
                    z10 = r19;
                }
                z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                objR = dVarF.R();
                if (z11) {
                    obj = null;
                    objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                    dVarF.L(objR);
                } else {
                    obj = null;
                    objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                    dVarF.L(objR);
                }
                String text16 = ((TransformedText) objR).getText().getText();
                TextFieldType textFieldType16 = TextFieldType.Outlined;
                v1.Attached attached16 = new v1.Attached(false, null, null, 7, null);
                if (function26 == null) {
                    dVarF.y(1927058812);
                    dVarF.u();
                    do1VarE = null;
                } else {
                    dVarF.y(1927058813);
                    do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                    dVarF.u();
                }
                int i31111113 = i4 >> 9;
                int i31111114 = i31 << 21;
                int i31111115 = ((i4 << 3) & 896) | 6 | (458752 & i31111113) | (3670016 & i31111113) | (i31111114 & 29360128) | (i31111114 & 234881024) | (i31111114 & 1879048192);
                int i31111116 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i31111113 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                dVar2 = dVarF;
                Function2<? super d, ? super Integer, Unit> function31114 = function20;
                TextFieldImplKt.l(textFieldType16, text16, function2, attached16, do1VarE, function31114, function27, function30, function31, function31113, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i31111115, i31111116);
                if (e.k()) {
                    e.n();
                }
                function15 = function31113;
                function16 = function29;
                rx8Var2 = rx8Var3;
                function17 = function32;
                function13 = function30;
                function14 = function31;
                function19 = function31114;
                function12 = function27;
                z6 = z8;
                pscVar2 = pscVar3;
                function18 = function26;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                z6 = z3;
                function12 = function5;
                function13 = function6;
                function14 = function7;
                function15 = function8;
                function16 = function9;
                pscVar2 = pscVar;
                rx8Var2 = rx8Var;
                function17 = function10;
                function18 = function11;
                function19 = function4;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.su8
                    public final Object invoke(Object obj2, Object obj3) {
                        return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i4 |= 48;
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            if (dVarF.A(z)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i4 |= i5;
        }
        if ((i3 & 8) != 0) {
            if ((i & 3072) == 0) {
                z4 = z2;
                if (dVarF.A(z4)) {
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
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                if (dVarF.x(j26Var)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i4 |= i9;
            }
            i10 = i3 & 64;
            if (i10 != 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (dVarF.A(z3)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i4 |= i11;
            }
            i12 = i3 & 128;
            if (i12 != 0) {
                i4 |= 12582912;
                function11 = function3;
            } else {
                function11 = function3;
                if ((i & 12582912) == 0) {
                    if (dVarF.T(function11)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i4 |= i13;
                }
            }
            i14 = i3 & 256;
            if (i14 != 0) {
                if ((i & 100663296) == 0) {
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
                        i25 = i23 | (dVarF.T(function8) ? 256 : 128);
                    } else {
                        i25 = i23;
                    }
                    i26 = i3 & 8192;
                    if (i26 != 0) {
                        i27 = i25;
                        if ((i2 & 3072) == 0) {
                            i27 |= dVarF.T(function9) ? 2048 : 1024;
                        }
                        if ((i2 & 24576) != 0) {
                            if ((i3 & 16384) == 0) {
                                i7 = 16384;
                            }
                            i27 |= i7;
                        }
                        if ((i2 & 196608) != 0) {
                            if ((i3 & 32768) == 0) {
                                i32 = 65536;
                            } else {
                                i32 = 65536;
                            }
                            i27 |= i32;
                        }
                        i28 = i3 & 65536;
                        if (i28 != 0) {
                            i27 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            if (dVarF.T(function10)) {
                                i29 = 1048576;
                            } else {
                                i29 = 524288;
                            }
                            i27 |= i29;
                        }
                        if ((i3 & 131072) != 0) {
                            i27 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            if (dVarF.x(this)) {
                                i30 = 8388608;
                            } else {
                                i30 = 4194304;
                            }
                            i27 |= i30;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        if (dVarF.g(z5, i4 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i10 != 0) {
                                    z7 = false;
                                } else {
                                    z7 = z3;
                                }
                                if (i12 != 0) {
                                    function11 = null;
                                }
                                if (i14 != 0) {
                                    function20 = null;
                                } else {
                                    function20 = function4;
                                }
                                if (i16 != 0) {
                                    function21 = null;
                                } else {
                                    function21 = function5;
                                }
                                if (i18 != 0) {
                                    function22 = null;
                                } else {
                                    function22 = function6;
                                }
                                if (i21 != 0) {
                                    function23 = null;
                                } else {
                                    function23 = function7;
                                }
                                if (i24 != 0) {
                                    function24 = null;
                                } else {
                                    function24 = function8;
                                }
                                if (i26 != 0) {
                                    function25 = null;
                                } else {
                                    function25 = function9;
                                }
                                if ((i3 & 16384) != 0) {
                                    pscVarG = g(dVarF, (i27 >> 21) & 14);
                                    i27 &= -57345;
                                } else {
                                    pscVarG = pscVar;
                                }
                                if ((i3 & 32768) != 0) {
                                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i27 &= -458753;
                                } else {
                                    rx8VarJ = rx8Var;
                                }
                                if (i28 != 0) {
                                    rx8 rx8Var1115 = rx8VarJ;
                                    boolean z11111114 = z7;
                                    psc pscVar1111116 = pscVarG;
                                    do1 do1VarE1113 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                    rx8Var3 = rx8Var1115;
                                    function27 = function21;
                                    function28 = function24;
                                    function29 = function25;
                                    function31 = function23;
                                    z8 = z11111114;
                                    function32 = do1VarE1113;
                                    function26 = function11;
                                    function30 = function22;
                                    z9 = true;
                                    i31 = i27;
                                    pscVar3 = pscVar1111116;
                                } else {
                                    boolean z11111115 = z7;
                                    psc pscVar1111117 = pscVarG;
                                    rx8Var3 = rx8VarJ;
                                    function26 = function11;
                                    function27 = function21;
                                    function28 = function24;
                                    i31 = i27;
                                    function29 = function25;
                                    function30 = function22;
                                    function31 = function23;
                                    z8 = z11111115;
                                    pscVar3 = pscVar1111117;
                                    z9 = true;
                                    function32 = function10;
                                }
                            } else {
                                if (i10 != 0) {
                                    z7 = false;
                                } else {
                                    z7 = z3;
                                }
                                if (i12 != 0) {
                                    function11 = null;
                                }
                                if (i14 != 0) {
                                    function20 = null;
                                } else {
                                    function20 = function4;
                                }
                                if (i16 != 0) {
                                    function21 = null;
                                } else {
                                    function21 = function5;
                                }
                                if (i18 != 0) {
                                    function22 = null;
                                } else {
                                    function22 = function6;
                                }
                                if (i21 != 0) {
                                    function23 = null;
                                } else {
                                    function23 = function7;
                                }
                                if (i24 != 0) {
                                    function24 = null;
                                } else {
                                    function24 = function8;
                                }
                                if (i26 != 0) {
                                    function25 = null;
                                } else {
                                    function25 = function9;
                                }
                                if ((i3 & 16384) != 0) {
                                    pscVarG = g(dVarF, (i27 >> 21) & 14);
                                    i27 &= -57345;
                                } else {
                                    pscVarG = pscVar;
                                }
                                if ((i3 & 32768) != 0) {
                                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i27 &= -458753;
                                } else {
                                    rx8VarJ = rx8Var;
                                }
                                if (i28 != 0) {
                                    rx8 rx8Var1116 = rx8VarJ;
                                    boolean z11111116 = z7;
                                    psc pscVar1111118 = pscVarG;
                                    do1 do1VarE1114 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                    rx8Var3 = rx8Var1116;
                                    function27 = function21;
                                    function28 = function24;
                                    function29 = function25;
                                    function31 = function23;
                                    z8 = z11111116;
                                    function32 = do1VarE1114;
                                    function26 = function11;
                                    function30 = function22;
                                    z9 = true;
                                    i31 = i27;
                                    pscVar3 = pscVar1111118;
                                } else {
                                    boolean z11111117 = z7;
                                    psc pscVar1111119 = pscVarG;
                                    rx8Var3 = rx8VarJ;
                                    function26 = function11;
                                    function27 = function21;
                                    function28 = function24;
                                    i31 = i27;
                                    function29 = function25;
                                    function30 = function22;
                                    function31 = function23;
                                    z8 = z11111117;
                                    pscVar3 = pscVar1111119;
                                    z9 = true;
                                    function32 = function10;
                                }
                            }
                            dVarF.M();
                            Function2<? super d, ? super Integer, Unit> function31115 = function28;
                            if (e.k()) {
                                e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                            }
                            if ((i4 & 14) == 4) {
                                z10 = z9;
                            } else {
                                z10 = r19;
                            }
                            z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                            objR = dVarF.R();
                            if (z11) {
                                obj = null;
                                objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                                dVarF.L(objR);
                            } else {
                                obj = null;
                                objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                                dVarF.L(objR);
                            }
                            String text17 = ((TransformedText) objR).getText().getText();
                            TextFieldType textFieldType17 = TextFieldType.Outlined;
                            v1.Attached attached17 = new v1.Attached(false, null, null, 7, null);
                            if (function26 == null) {
                                dVarF.y(1927058812);
                                dVarF.u();
                                do1VarE = null;
                            } else {
                                dVarF.y(1927058813);
                                do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                                dVarF.u();
                            }
                            int i31111117 = i4 >> 9;
                            int i31111118 = i31 << 21;
                            int i31111119 = ((i4 << 3) & 896) | 6 | (458752 & i31111117) | (3670016 & i31111117) | (i31111118 & 29360128) | (i31111118 & 234881024) | (i31111118 & 1879048192);
                            int i311111110 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i31111117 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                            dVar2 = dVarF;
                            Function2<? super d, ? super Integer, Unit> function31116 = function20;
                            TextFieldImplKt.l(textFieldType17, text17, function2, attached17, do1VarE, function31116, function27, function30, function31, function31115, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i31111119, i311111110);
                            if (e.k()) {
                                e.n();
                            }
                            function15 = function31115;
                            function16 = function29;
                            rx8Var2 = rx8Var3;
                            function17 = function32;
                            function13 = function30;
                            function14 = function31;
                            function19 = function31116;
                            function12 = function27;
                            z6 = z8;
                            pscVar2 = pscVar3;
                            function18 = function26;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            z6 = z3;
                            function12 = function5;
                            function13 = function6;
                            function14 = function7;
                            function15 = function8;
                            function16 = function9;
                            pscVar2 = pscVar;
                            rx8Var2 = rx8Var;
                            function17 = function10;
                            function18 = function11;
                            function19 = function4;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.su8
                                public final Object invoke(Object obj2, Object obj3) {
                                    return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
                                }
                            });
                        }
                    }
                    i27 = i25 | 3072;
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i7 = 16384;
                        }
                        i27 |= i7;
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32768) == 0) {
                            i32 = 65536;
                        } else {
                            i32 = 65536;
                        }
                        i27 |= i32;
                    }
                    i28 = i3 & 65536;
                    if (i28 != 0) {
                        i27 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (dVarF.T(function10)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i27 |= i29;
                    }
                    if ((i3 & 131072) != 0) {
                        i27 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (dVarF.x(this)) {
                            i30 = 8388608;
                        } else {
                            i30 = 4194304;
                        }
                        i27 |= i30;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    if (dVarF.g(z5, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z7 = false;
                            } else {
                                z7 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            }
                            if (i14 != 0) {
                                function20 = null;
                            } else {
                                function20 = function4;
                            }
                            if (i16 != 0) {
                                function21 = null;
                            } else {
                                function21 = function5;
                            }
                            if (i18 != 0) {
                                function22 = null;
                            } else {
                                function22 = function6;
                            }
                            if (i21 != 0) {
                                function23 = null;
                            } else {
                                function23 = function7;
                            }
                            if (i24 != 0) {
                                function24 = null;
                            } else {
                                function24 = function8;
                            }
                            if (i26 != 0) {
                                function25 = null;
                            } else {
                                function25 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                pscVarG = g(dVarF, (i27 >> 21) & 14);
                                i27 &= -57345;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 32768) != 0) {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i27 &= -458753;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i28 != 0) {
                                rx8 rx8Var1117 = rx8VarJ;
                                boolean z11111118 = z7;
                                psc pscVar11111110 = pscVarG;
                                do1 do1VarE1115 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                rx8Var3 = rx8Var1117;
                                function27 = function21;
                                function28 = function24;
                                function29 = function25;
                                function31 = function23;
                                z8 = z11111118;
                                function32 = do1VarE1115;
                                function26 = function11;
                                function30 = function22;
                                z9 = true;
                                i31 = i27;
                                pscVar3 = pscVar11111110;
                            } else {
                                boolean z11111119 = z7;
                                psc pscVar11111111 = pscVarG;
                                rx8Var3 = rx8VarJ;
                                function26 = function11;
                                function27 = function21;
                                function28 = function24;
                                i31 = i27;
                                function29 = function25;
                                function30 = function22;
                                function31 = function23;
                                z8 = z11111119;
                                pscVar3 = pscVar11111111;
                                z9 = true;
                                function32 = function10;
                            }
                        } else {
                            if (i10 != 0) {
                                z7 = false;
                            } else {
                                z7 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            }
                            if (i14 != 0) {
                                function20 = null;
                            } else {
                                function20 = function4;
                            }
                            if (i16 != 0) {
                                function21 = null;
                            } else {
                                function21 = function5;
                            }
                            if (i18 != 0) {
                                function22 = null;
                            } else {
                                function22 = function6;
                            }
                            if (i21 != 0) {
                                function23 = null;
                            } else {
                                function23 = function7;
                            }
                            if (i24 != 0) {
                                function24 = null;
                            } else {
                                function24 = function8;
                            }
                            if (i26 != 0) {
                                function25 = null;
                            } else {
                                function25 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                pscVarG = g(dVarF, (i27 >> 21) & 14);
                                i27 &= -57345;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 32768) != 0) {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i27 &= -458753;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i28 != 0) {
                                rx8 rx8Var1118 = rx8VarJ;
                                boolean z111111110 = z7;
                                psc pscVar11111112 = pscVarG;
                                do1 do1VarE1116 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                rx8Var3 = rx8Var1118;
                                function27 = function21;
                                function28 = function24;
                                function29 = function25;
                                function31 = function23;
                                z8 = z111111110;
                                function32 = do1VarE1116;
                                function26 = function11;
                                function30 = function22;
                                z9 = true;
                                i31 = i27;
                                pscVar3 = pscVar11111112;
                            } else {
                                boolean z111111111 = z7;
                                psc pscVar11111113 = pscVarG;
                                rx8Var3 = rx8VarJ;
                                function26 = function11;
                                function27 = function21;
                                function28 = function24;
                                i31 = i27;
                                function29 = function25;
                                function30 = function22;
                                function31 = function23;
                                z8 = z111111111;
                                pscVar3 = pscVar11111113;
                                z9 = true;
                                function32 = function10;
                            }
                        }
                        dVarF.M();
                        Function2<? super d, ? super Integer, Unit> function31117 = function28;
                        if (e.k()) {
                            e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                        }
                        if ((i4 & 14) == 4) {
                            z10 = z9;
                        } else {
                            z10 = r19;
                        }
                        z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                        objR = dVarF.R();
                        if (z11) {
                            obj = null;
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        } else {
                            obj = null;
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        }
                        String text18 = ((TransformedText) objR).getText().getText();
                        TextFieldType textFieldType18 = TextFieldType.Outlined;
                        v1.Attached attached18 = new v1.Attached(false, null, null, 7, null);
                        if (function26 == null) {
                            dVarF.y(1927058812);
                            dVarF.u();
                            do1VarE = null;
                        } else {
                            dVarF.y(1927058813);
                            do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                            dVarF.u();
                        }
                        int i311111111 = i4 >> 9;
                        int i311111112 = i31 << 21;
                        int i311111113 = ((i4 << 3) & 896) | 6 | (458752 & i311111111) | (3670016 & i311111111) | (i311111112 & 29360128) | (i311111112 & 234881024) | (i311111112 & 1879048192);
                        int i311111114 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i311111111 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                        dVar2 = dVarF;
                        Function2<? super d, ? super Integer, Unit> function31118 = function20;
                        TextFieldImplKt.l(textFieldType18, text18, function2, attached18, do1VarE, function31118, function27, function30, function31, function31117, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i311111113, i311111114);
                        if (e.k()) {
                            e.n();
                        }
                        function15 = function31117;
                        function16 = function29;
                        rx8Var2 = rx8Var3;
                        function17 = function32;
                        function13 = function30;
                        function14 = function31;
                        function19 = function31118;
                        function12 = function27;
                        z6 = z8;
                        pscVar2 = pscVar3;
                        function18 = function26;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        z6 = z3;
                        function12 = function5;
                        function13 = function6;
                        function14 = function7;
                        function15 = function8;
                        function16 = function9;
                        pscVar2 = pscVar;
                        rx8Var2 = rx8Var;
                        function17 = function10;
                        function18 = function11;
                        function19 = function4;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.su8
                            public final Object invoke(Object obj2, Object obj3) {
                                return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
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
                    i25 = i23 | (dVarF.T(function8) ? 256 : 128);
                } else {
                    i25 = i23;
                }
                i26 = i3 & 8192;
                if (i26 != 0) {
                    i27 = i25;
                    if ((i2 & 3072) == 0) {
                        i27 |= dVarF.T(function9) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i7 = 16384;
                        }
                        i27 |= i7;
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32768) == 0) {
                            i32 = 65536;
                        } else {
                            i32 = 65536;
                        }
                        i27 |= i32;
                    }
                    i28 = i3 & 65536;
                    if (i28 != 0) {
                        i27 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (dVarF.T(function10)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i27 |= i29;
                    }
                    if ((i3 & 131072) != 0) {
                        i27 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (dVarF.x(this)) {
                            i30 = 8388608;
                        } else {
                            i30 = 4194304;
                        }
                        i27 |= i30;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    if (dVarF.g(z5, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z7 = false;
                            } else {
                                z7 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            }
                            if (i14 != 0) {
                                function20 = null;
                            } else {
                                function20 = function4;
                            }
                            if (i16 != 0) {
                                function21 = null;
                            } else {
                                function21 = function5;
                            }
                            if (i18 != 0) {
                                function22 = null;
                            } else {
                                function22 = function6;
                            }
                            if (i21 != 0) {
                                function23 = null;
                            } else {
                                function23 = function7;
                            }
                            if (i24 != 0) {
                                function24 = null;
                            } else {
                                function24 = function8;
                            }
                            if (i26 != 0) {
                                function25 = null;
                            } else {
                                function25 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                pscVarG = g(dVarF, (i27 >> 21) & 14);
                                i27 &= -57345;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 32768) != 0) {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i27 &= -458753;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i28 != 0) {
                                rx8 rx8Var1119 = rx8VarJ;
                                boolean z111111112 = z7;
                                psc pscVar11111114 = pscVarG;
                                do1 do1VarE1117 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                rx8Var3 = rx8Var1119;
                                function27 = function21;
                                function28 = function24;
                                function29 = function25;
                                function31 = function23;
                                z8 = z111111112;
                                function32 = do1VarE1117;
                                function26 = function11;
                                function30 = function22;
                                z9 = true;
                                i31 = i27;
                                pscVar3 = pscVar11111114;
                            } else {
                                boolean z111111113 = z7;
                                psc pscVar11111115 = pscVarG;
                                rx8Var3 = rx8VarJ;
                                function26 = function11;
                                function27 = function21;
                                function28 = function24;
                                i31 = i27;
                                function29 = function25;
                                function30 = function22;
                                function31 = function23;
                                z8 = z111111113;
                                pscVar3 = pscVar11111115;
                                z9 = true;
                                function32 = function10;
                            }
                        } else {
                            if (i10 != 0) {
                                z7 = false;
                            } else {
                                z7 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            }
                            if (i14 != 0) {
                                function20 = null;
                            } else {
                                function20 = function4;
                            }
                            if (i16 != 0) {
                                function21 = null;
                            } else {
                                function21 = function5;
                            }
                            if (i18 != 0) {
                                function22 = null;
                            } else {
                                function22 = function6;
                            }
                            if (i21 != 0) {
                                function23 = null;
                            } else {
                                function23 = function7;
                            }
                            if (i24 != 0) {
                                function24 = null;
                            } else {
                                function24 = function8;
                            }
                            if (i26 != 0) {
                                function25 = null;
                            } else {
                                function25 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                pscVarG = g(dVarF, (i27 >> 21) & 14);
                                i27 &= -57345;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 32768) != 0) {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i27 &= -458753;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i28 != 0) {
                                rx8 rx8Var11110 = rx8VarJ;
                                boolean z111111114 = z7;
                                psc pscVar11111116 = pscVarG;
                                do1 do1VarE1118 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                rx8Var3 = rx8Var11110;
                                function27 = function21;
                                function28 = function24;
                                function29 = function25;
                                function31 = function23;
                                z8 = z111111114;
                                function32 = do1VarE1118;
                                function26 = function11;
                                function30 = function22;
                                z9 = true;
                                i31 = i27;
                                pscVar3 = pscVar11111116;
                            } else {
                                boolean z111111115 = z7;
                                psc pscVar11111117 = pscVarG;
                                rx8Var3 = rx8VarJ;
                                function26 = function11;
                                function27 = function21;
                                function28 = function24;
                                i31 = i27;
                                function29 = function25;
                                function30 = function22;
                                function31 = function23;
                                z8 = z111111115;
                                pscVar3 = pscVar11111117;
                                z9 = true;
                                function32 = function10;
                            }
                        }
                        dVarF.M();
                        Function2<? super d, ? super Integer, Unit> function31119 = function28;
                        if (e.k()) {
                            e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                        }
                        if ((i4 & 14) == 4) {
                            z10 = z9;
                        } else {
                            z10 = r19;
                        }
                        z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                        objR = dVarF.R();
                        if (z11) {
                            obj = null;
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        } else {
                            obj = null;
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        }
                        String text19 = ((TransformedText) objR).getText().getText();
                        TextFieldType textFieldType19 = TextFieldType.Outlined;
                        v1.Attached attached19 = new v1.Attached(false, null, null, 7, null);
                        if (function26 == null) {
                            dVarF.y(1927058812);
                            dVarF.u();
                            do1VarE = null;
                        } else {
                            dVarF.y(1927058813);
                            do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                            dVarF.u();
                        }
                        int i311111115 = i4 >> 9;
                        int i311111116 = i31 << 21;
                        int i311111117 = ((i4 << 3) & 896) | 6 | (458752 & i311111115) | (3670016 & i311111115) | (i311111116 & 29360128) | (i311111116 & 234881024) | (i311111116 & 1879048192);
                        int i311111118 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i311111115 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                        dVar2 = dVarF;
                        Function2<? super d, ? super Integer, Unit> function311110 = function20;
                        TextFieldImplKt.l(textFieldType19, text19, function2, attached19, do1VarE, function311110, function27, function30, function31, function31119, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i311111117, i311111118);
                        if (e.k()) {
                            e.n();
                        }
                        function15 = function31119;
                        function16 = function29;
                        rx8Var2 = rx8Var3;
                        function17 = function32;
                        function13 = function30;
                        function14 = function31;
                        function19 = function311110;
                        function12 = function27;
                        z6 = z8;
                        pscVar2 = pscVar3;
                        function18 = function26;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        z6 = z3;
                        function12 = function5;
                        function13 = function6;
                        function14 = function7;
                        function15 = function8;
                        function16 = function9;
                        pscVar2 = pscVar;
                        rx8Var2 = rx8Var;
                        function17 = function10;
                        function18 = function11;
                        function19 = function4;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.su8
                            public final Object invoke(Object obj2, Object obj3) {
                                return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i27 = i25 | 3072;
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i7 = 16384;
                    }
                    i27 |= i7;
                }
                if ((i2 & 196608) != 0) {
                    if ((i3 & 32768) == 0) {
                        i32 = 65536;
                    } else {
                        i32 = 65536;
                    }
                    i27 |= i32;
                }
                i28 = i3 & 65536;
                if (i28 != 0) {
                    i27 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (dVarF.T(function10)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i27 |= i29;
                }
                if ((i3 & 131072) != 0) {
                    i27 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (dVarF.x(this)) {
                        i30 = 8388608;
                    } else {
                        i30 = 4194304;
                    }
                    i27 |= i30;
                }
                if ((i4 & 306783379) == 306783378) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (dVarF.g(z5, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z7 = false;
                        } else {
                            z7 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        }
                        if (i14 != 0) {
                            function20 = null;
                        } else {
                            function20 = function4;
                        }
                        if (i16 != 0) {
                            function21 = null;
                        } else {
                            function21 = function5;
                        }
                        if (i18 != 0) {
                            function22 = null;
                        } else {
                            function22 = function6;
                        }
                        if (i21 != 0) {
                            function23 = null;
                        } else {
                            function23 = function7;
                        }
                        if (i24 != 0) {
                            function24 = null;
                        } else {
                            function24 = function8;
                        }
                        if (i26 != 0) {
                            function25 = null;
                        } else {
                            function25 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            pscVarG = g(dVarF, (i27 >> 21) & 14);
                            i27 &= -57345;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 32768) != 0) {
                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i27 &= -458753;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i28 != 0) {
                            rx8 rx8Var11111 = rx8VarJ;
                            boolean z111111116 = z7;
                            psc pscVar11111118 = pscVarG;
                            do1 do1VarE1119 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                            rx8Var3 = rx8Var11111;
                            function27 = function21;
                            function28 = function24;
                            function29 = function25;
                            function31 = function23;
                            z8 = z111111116;
                            function32 = do1VarE1119;
                            function26 = function11;
                            function30 = function22;
                            z9 = true;
                            i31 = i27;
                            pscVar3 = pscVar11111118;
                        } else {
                            boolean z111111117 = z7;
                            psc pscVar11111119 = pscVarG;
                            rx8Var3 = rx8VarJ;
                            function26 = function11;
                            function27 = function21;
                            function28 = function24;
                            i31 = i27;
                            function29 = function25;
                            function30 = function22;
                            function31 = function23;
                            z8 = z111111117;
                            pscVar3 = pscVar11111119;
                            z9 = true;
                            function32 = function10;
                        }
                    } else {
                        if (i10 != 0) {
                            z7 = false;
                        } else {
                            z7 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        }
                        if (i14 != 0) {
                            function20 = null;
                        } else {
                            function20 = function4;
                        }
                        if (i16 != 0) {
                            function21 = null;
                        } else {
                            function21 = function5;
                        }
                        if (i18 != 0) {
                            function22 = null;
                        } else {
                            function22 = function6;
                        }
                        if (i21 != 0) {
                            function23 = null;
                        } else {
                            function23 = function7;
                        }
                        if (i24 != 0) {
                            function24 = null;
                        } else {
                            function24 = function8;
                        }
                        if (i26 != 0) {
                            function25 = null;
                        } else {
                            function25 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            pscVarG = g(dVarF, (i27 >> 21) & 14);
                            i27 &= -57345;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 32768) != 0) {
                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i27 &= -458753;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i28 != 0) {
                            rx8 rx8Var11112 = rx8VarJ;
                            boolean z111111118 = z7;
                            psc pscVar111111110 = pscVarG;
                            do1 do1VarE11110 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                            rx8Var3 = rx8Var11112;
                            function27 = function21;
                            function28 = function24;
                            function29 = function25;
                            function31 = function23;
                            z8 = z111111118;
                            function32 = do1VarE11110;
                            function26 = function11;
                            function30 = function22;
                            z9 = true;
                            i31 = i27;
                            pscVar3 = pscVar111111110;
                        } else {
                            boolean z111111119 = z7;
                            psc pscVar111111111 = pscVarG;
                            rx8Var3 = rx8VarJ;
                            function26 = function11;
                            function27 = function21;
                            function28 = function24;
                            i31 = i27;
                            function29 = function25;
                            function30 = function22;
                            function31 = function23;
                            z8 = z111111119;
                            pscVar3 = pscVar111111111;
                            z9 = true;
                            function32 = function10;
                        }
                    }
                    dVarF.M();
                    Function2<? super d, ? super Integer, Unit> function311111 = function28;
                    if (e.k()) {
                        e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                    }
                    if ((i4 & 14) == 4) {
                        z10 = z9;
                    } else {
                        z10 = r19;
                    }
                    z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                    objR = dVarF.R();
                    if (z11) {
                        obj = null;
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    } else {
                        obj = null;
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    }
                    String text110 = ((TransformedText) objR).getText().getText();
                    TextFieldType textFieldType110 = TextFieldType.Outlined;
                    v1.Attached attached110 = new v1.Attached(false, null, null, 7, null);
                    if (function26 == null) {
                        dVarF.y(1927058812);
                        dVarF.u();
                        do1VarE = null;
                    } else {
                        dVarF.y(1927058813);
                        do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                        dVarF.u();
                    }
                    int i311111119 = i4 >> 9;
                    int i3111111110 = i31 << 21;
                    int i3111111111 = ((i4 << 3) & 896) | 6 | (458752 & i311111119) | (3670016 & i311111119) | (i3111111110 & 29360128) | (i3111111110 & 234881024) | (i3111111110 & 1879048192);
                    int i3111111112 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i311111119 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                    dVar2 = dVarF;
                    Function2<? super d, ? super Integer, Unit> function311112 = function20;
                    TextFieldImplKt.l(textFieldType110, text110, function2, attached110, do1VarE, function311112, function27, function30, function31, function311111, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i3111111111, i3111111112);
                    if (e.k()) {
                        e.n();
                    }
                    function15 = function311111;
                    function16 = function29;
                    rx8Var2 = rx8Var3;
                    function17 = function32;
                    function13 = function30;
                    function14 = function31;
                    function19 = function311112;
                    function12 = function27;
                    z6 = z8;
                    pscVar2 = pscVar3;
                    function18 = function26;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    z6 = z3;
                    function12 = function5;
                    function13 = function6;
                    function14 = function7;
                    function15 = function8;
                    function16 = function9;
                    pscVar2 = pscVar;
                    rx8Var2 = rx8Var;
                    function17 = function10;
                    function18 = function11;
                    function19 = function4;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.su8
                        public final Object invoke(Object obj2, Object obj3) {
                            return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i4 |= 100663296;
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
                    i25 = i23 | (dVarF.T(function8) ? 256 : 128);
                } else {
                    i25 = i23;
                }
                i26 = i3 & 8192;
                if (i26 != 0) {
                    i27 = i25;
                    if ((i2 & 3072) == 0) {
                        i27 |= dVarF.T(function9) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i7 = 16384;
                        }
                        i27 |= i7;
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32768) == 0) {
                            i32 = 65536;
                        } else {
                            i32 = 65536;
                        }
                        i27 |= i32;
                    }
                    i28 = i3 & 65536;
                    if (i28 != 0) {
                        i27 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (dVarF.T(function10)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i27 |= i29;
                    }
                    if ((i3 & 131072) != 0) {
                        i27 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (dVarF.x(this)) {
                            i30 = 8388608;
                        } else {
                            i30 = 4194304;
                        }
                        i27 |= i30;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    if (dVarF.g(z5, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z7 = false;
                            } else {
                                z7 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            }
                            if (i14 != 0) {
                                function20 = null;
                            } else {
                                function20 = function4;
                            }
                            if (i16 != 0) {
                                function21 = null;
                            } else {
                                function21 = function5;
                            }
                            if (i18 != 0) {
                                function22 = null;
                            } else {
                                function22 = function6;
                            }
                            if (i21 != 0) {
                                function23 = null;
                            } else {
                                function23 = function7;
                            }
                            if (i24 != 0) {
                                function24 = null;
                            } else {
                                function24 = function8;
                            }
                            if (i26 != 0) {
                                function25 = null;
                            } else {
                                function25 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                pscVarG = g(dVarF, (i27 >> 21) & 14);
                                i27 &= -57345;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 32768) != 0) {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i27 &= -458753;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i28 != 0) {
                                rx8 rx8Var11113 = rx8VarJ;
                                boolean z1111111110 = z7;
                                psc pscVar111111112 = pscVarG;
                                do1 do1VarE11111 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                rx8Var3 = rx8Var11113;
                                function27 = function21;
                                function28 = function24;
                                function29 = function25;
                                function31 = function23;
                                z8 = z1111111110;
                                function32 = do1VarE11111;
                                function26 = function11;
                                function30 = function22;
                                z9 = true;
                                i31 = i27;
                                pscVar3 = pscVar111111112;
                            } else {
                                boolean z1111111111 = z7;
                                psc pscVar111111113 = pscVarG;
                                rx8Var3 = rx8VarJ;
                                function26 = function11;
                                function27 = function21;
                                function28 = function24;
                                i31 = i27;
                                function29 = function25;
                                function30 = function22;
                                function31 = function23;
                                z8 = z1111111111;
                                pscVar3 = pscVar111111113;
                                z9 = true;
                                function32 = function10;
                            }
                        } else {
                            if (i10 != 0) {
                                z7 = false;
                            } else {
                                z7 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            }
                            if (i14 != 0) {
                                function20 = null;
                            } else {
                                function20 = function4;
                            }
                            if (i16 != 0) {
                                function21 = null;
                            } else {
                                function21 = function5;
                            }
                            if (i18 != 0) {
                                function22 = null;
                            } else {
                                function22 = function6;
                            }
                            if (i21 != 0) {
                                function23 = null;
                            } else {
                                function23 = function7;
                            }
                            if (i24 != 0) {
                                function24 = null;
                            } else {
                                function24 = function8;
                            }
                            if (i26 != 0) {
                                function25 = null;
                            } else {
                                function25 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                pscVarG = g(dVarF, (i27 >> 21) & 14);
                                i27 &= -57345;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 32768) != 0) {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i27 &= -458753;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i28 != 0) {
                                rx8 rx8Var11114 = rx8VarJ;
                                boolean z1111111112 = z7;
                                psc pscVar111111114 = pscVarG;
                                do1 do1VarE11112 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                rx8Var3 = rx8Var11114;
                                function27 = function21;
                                function28 = function24;
                                function29 = function25;
                                function31 = function23;
                                z8 = z1111111112;
                                function32 = do1VarE11112;
                                function26 = function11;
                                function30 = function22;
                                z9 = true;
                                i31 = i27;
                                pscVar3 = pscVar111111114;
                            } else {
                                boolean z1111111113 = z7;
                                psc pscVar111111115 = pscVarG;
                                rx8Var3 = rx8VarJ;
                                function26 = function11;
                                function27 = function21;
                                function28 = function24;
                                i31 = i27;
                                function29 = function25;
                                function30 = function22;
                                function31 = function23;
                                z8 = z1111111113;
                                pscVar3 = pscVar111111115;
                                z9 = true;
                                function32 = function10;
                            }
                        }
                        dVarF.M();
                        Function2<? super d, ? super Integer, Unit> function311113 = function28;
                        if (e.k()) {
                            e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                        }
                        if ((i4 & 14) == 4) {
                            z10 = z9;
                        } else {
                            z10 = r19;
                        }
                        z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                        objR = dVarF.R();
                        if (z11) {
                            obj = null;
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        } else {
                            obj = null;
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        }
                        String text111 = ((TransformedText) objR).getText().getText();
                        TextFieldType textFieldType111 = TextFieldType.Outlined;
                        v1.Attached attached111 = new v1.Attached(false, null, null, 7, null);
                        if (function26 == null) {
                            dVarF.y(1927058812);
                            dVarF.u();
                            do1VarE = null;
                        } else {
                            dVarF.y(1927058813);
                            do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                            dVarF.u();
                        }
                        int i3111111113 = i4 >> 9;
                        int i3111111114 = i31 << 21;
                        int i3111111115 = ((i4 << 3) & 896) | 6 | (458752 & i3111111113) | (3670016 & i3111111113) | (i3111111114 & 29360128) | (i3111111114 & 234881024) | (i3111111114 & 1879048192);
                        int i3111111116 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i3111111113 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                        dVar2 = dVarF;
                        Function2<? super d, ? super Integer, Unit> function311114 = function20;
                        TextFieldImplKt.l(textFieldType111, text111, function2, attached111, do1VarE, function311114, function27, function30, function31, function311113, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i3111111115, i3111111116);
                        if (e.k()) {
                            e.n();
                        }
                        function15 = function311113;
                        function16 = function29;
                        rx8Var2 = rx8Var3;
                        function17 = function32;
                        function13 = function30;
                        function14 = function31;
                        function19 = function311114;
                        function12 = function27;
                        z6 = z8;
                        pscVar2 = pscVar3;
                        function18 = function26;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        z6 = z3;
                        function12 = function5;
                        function13 = function6;
                        function14 = function7;
                        function15 = function8;
                        function16 = function9;
                        pscVar2 = pscVar;
                        rx8Var2 = rx8Var;
                        function17 = function10;
                        function18 = function11;
                        function19 = function4;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.su8
                            public final Object invoke(Object obj2, Object obj3) {
                                return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i27 = i25 | 3072;
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i7 = 16384;
                    }
                    i27 |= i7;
                }
                if ((i2 & 196608) != 0) {
                    if ((i3 & 32768) == 0) {
                        i32 = 65536;
                    } else {
                        i32 = 65536;
                    }
                    i27 |= i32;
                }
                i28 = i3 & 65536;
                if (i28 != 0) {
                    i27 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (dVarF.T(function10)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i27 |= i29;
                }
                if ((i3 & 131072) != 0) {
                    i27 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (dVarF.x(this)) {
                        i30 = 8388608;
                    } else {
                        i30 = 4194304;
                    }
                    i27 |= i30;
                }
                if ((i4 & 306783379) == 306783378) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (dVarF.g(z5, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z7 = false;
                        } else {
                            z7 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        }
                        if (i14 != 0) {
                            function20 = null;
                        } else {
                            function20 = function4;
                        }
                        if (i16 != 0) {
                            function21 = null;
                        } else {
                            function21 = function5;
                        }
                        if (i18 != 0) {
                            function22 = null;
                        } else {
                            function22 = function6;
                        }
                        if (i21 != 0) {
                            function23 = null;
                        } else {
                            function23 = function7;
                        }
                        if (i24 != 0) {
                            function24 = null;
                        } else {
                            function24 = function8;
                        }
                        if (i26 != 0) {
                            function25 = null;
                        } else {
                            function25 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            pscVarG = g(dVarF, (i27 >> 21) & 14);
                            i27 &= -57345;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 32768) != 0) {
                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i27 &= -458753;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i28 != 0) {
                            rx8 rx8Var11115 = rx8VarJ;
                            boolean z1111111114 = z7;
                            psc pscVar111111116 = pscVarG;
                            do1 do1VarE11113 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                            rx8Var3 = rx8Var11115;
                            function27 = function21;
                            function28 = function24;
                            function29 = function25;
                            function31 = function23;
                            z8 = z1111111114;
                            function32 = do1VarE11113;
                            function26 = function11;
                            function30 = function22;
                            z9 = true;
                            i31 = i27;
                            pscVar3 = pscVar111111116;
                        } else {
                            boolean z1111111115 = z7;
                            psc pscVar111111117 = pscVarG;
                            rx8Var3 = rx8VarJ;
                            function26 = function11;
                            function27 = function21;
                            function28 = function24;
                            i31 = i27;
                            function29 = function25;
                            function30 = function22;
                            function31 = function23;
                            z8 = z1111111115;
                            pscVar3 = pscVar111111117;
                            z9 = true;
                            function32 = function10;
                        }
                    } else {
                        if (i10 != 0) {
                            z7 = false;
                        } else {
                            z7 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        }
                        if (i14 != 0) {
                            function20 = null;
                        } else {
                            function20 = function4;
                        }
                        if (i16 != 0) {
                            function21 = null;
                        } else {
                            function21 = function5;
                        }
                        if (i18 != 0) {
                            function22 = null;
                        } else {
                            function22 = function6;
                        }
                        if (i21 != 0) {
                            function23 = null;
                        } else {
                            function23 = function7;
                        }
                        if (i24 != 0) {
                            function24 = null;
                        } else {
                            function24 = function8;
                        }
                        if (i26 != 0) {
                            function25 = null;
                        } else {
                            function25 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            pscVarG = g(dVarF, (i27 >> 21) & 14);
                            i27 &= -57345;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 32768) != 0) {
                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i27 &= -458753;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i28 != 0) {
                            rx8 rx8Var11116 = rx8VarJ;
                            boolean z1111111116 = z7;
                            psc pscVar111111118 = pscVarG;
                            do1 do1VarE11114 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                            rx8Var3 = rx8Var11116;
                            function27 = function21;
                            function28 = function24;
                            function29 = function25;
                            function31 = function23;
                            z8 = z1111111116;
                            function32 = do1VarE11114;
                            function26 = function11;
                            function30 = function22;
                            z9 = true;
                            i31 = i27;
                            pscVar3 = pscVar111111118;
                        } else {
                            boolean z1111111117 = z7;
                            psc pscVar111111119 = pscVarG;
                            rx8Var3 = rx8VarJ;
                            function26 = function11;
                            function27 = function21;
                            function28 = function24;
                            i31 = i27;
                            function29 = function25;
                            function30 = function22;
                            function31 = function23;
                            z8 = z1111111117;
                            pscVar3 = pscVar111111119;
                            z9 = true;
                            function32 = function10;
                        }
                    }
                    dVarF.M();
                    Function2<? super d, ? super Integer, Unit> function311115 = function28;
                    if (e.k()) {
                        e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                    }
                    if ((i4 & 14) == 4) {
                        z10 = z9;
                    } else {
                        z10 = r19;
                    }
                    z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                    objR = dVarF.R();
                    if (z11) {
                        obj = null;
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    } else {
                        obj = null;
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    }
                    String text112 = ((TransformedText) objR).getText().getText();
                    TextFieldType textFieldType112 = TextFieldType.Outlined;
                    v1.Attached attached112 = new v1.Attached(false, null, null, 7, null);
                    if (function26 == null) {
                        dVarF.y(1927058812);
                        dVarF.u();
                        do1VarE = null;
                    } else {
                        dVarF.y(1927058813);
                        do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                        dVarF.u();
                    }
                    int i3111111117 = i4 >> 9;
                    int i3111111118 = i31 << 21;
                    int i3111111119 = ((i4 << 3) & 896) | 6 | (458752 & i3111111117) | (3670016 & i3111111117) | (i3111111118 & 29360128) | (i3111111118 & 234881024) | (i3111111118 & 1879048192);
                    int i31111111110 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i3111111117 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                    dVar2 = dVarF;
                    Function2<? super d, ? super Integer, Unit> function311116 = function20;
                    TextFieldImplKt.l(textFieldType112, text112, function2, attached112, do1VarE, function311116, function27, function30, function31, function311115, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i3111111119, i31111111110);
                    if (e.k()) {
                        e.n();
                    }
                    function15 = function311115;
                    function16 = function29;
                    rx8Var2 = rx8Var3;
                    function17 = function32;
                    function13 = function30;
                    function14 = function31;
                    function19 = function311116;
                    function12 = function27;
                    z6 = z8;
                    pscVar2 = pscVar3;
                    function18 = function26;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    z6 = z3;
                    function12 = function5;
                    function13 = function6;
                    function14 = function7;
                    function15 = function8;
                    function16 = function9;
                    pscVar2 = pscVar;
                    rx8Var2 = rx8Var;
                    function17 = function10;
                    function18 = function11;
                    function19 = function4;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.su8
                        public final Object invoke(Object obj2, Object obj3) {
                            return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
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
                i25 = i23 | (dVarF.T(function8) ? 256 : 128);
            } else {
                i25 = i23;
            }
            i26 = i3 & 8192;
            if (i26 != 0) {
                i27 = i25;
                if ((i2 & 3072) == 0) {
                    i27 |= dVarF.T(function9) ? 2048 : 1024;
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i7 = 16384;
                    }
                    i27 |= i7;
                }
                if ((i2 & 196608) != 0) {
                    if ((i3 & 32768) == 0) {
                        i32 = 65536;
                    } else {
                        i32 = 65536;
                    }
                    i27 |= i32;
                }
                i28 = i3 & 65536;
                if (i28 != 0) {
                    i27 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (dVarF.T(function10)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i27 |= i29;
                }
                if ((i3 & 131072) != 0) {
                    i27 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (dVarF.x(this)) {
                        i30 = 8388608;
                    } else {
                        i30 = 4194304;
                    }
                    i27 |= i30;
                }
                if ((i4 & 306783379) == 306783378) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (dVarF.g(z5, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z7 = false;
                        } else {
                            z7 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        }
                        if (i14 != 0) {
                            function20 = null;
                        } else {
                            function20 = function4;
                        }
                        if (i16 != 0) {
                            function21 = null;
                        } else {
                            function21 = function5;
                        }
                        if (i18 != 0) {
                            function22 = null;
                        } else {
                            function22 = function6;
                        }
                        if (i21 != 0) {
                            function23 = null;
                        } else {
                            function23 = function7;
                        }
                        if (i24 != 0) {
                            function24 = null;
                        } else {
                            function24 = function8;
                        }
                        if (i26 != 0) {
                            function25 = null;
                        } else {
                            function25 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            pscVarG = g(dVarF, (i27 >> 21) & 14);
                            i27 &= -57345;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 32768) != 0) {
                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i27 &= -458753;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i28 != 0) {
                            rx8 rx8Var11117 = rx8VarJ;
                            boolean z1111111118 = z7;
                            psc pscVar1111111110 = pscVarG;
                            do1 do1VarE11115 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                            rx8Var3 = rx8Var11117;
                            function27 = function21;
                            function28 = function24;
                            function29 = function25;
                            function31 = function23;
                            z8 = z1111111118;
                            function32 = do1VarE11115;
                            function26 = function11;
                            function30 = function22;
                            z9 = true;
                            i31 = i27;
                            pscVar3 = pscVar1111111110;
                        } else {
                            boolean z1111111119 = z7;
                            psc pscVar1111111111 = pscVarG;
                            rx8Var3 = rx8VarJ;
                            function26 = function11;
                            function27 = function21;
                            function28 = function24;
                            i31 = i27;
                            function29 = function25;
                            function30 = function22;
                            function31 = function23;
                            z8 = z1111111119;
                            pscVar3 = pscVar1111111111;
                            z9 = true;
                            function32 = function10;
                        }
                    } else {
                        if (i10 != 0) {
                            z7 = false;
                        } else {
                            z7 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        }
                        if (i14 != 0) {
                            function20 = null;
                        } else {
                            function20 = function4;
                        }
                        if (i16 != 0) {
                            function21 = null;
                        } else {
                            function21 = function5;
                        }
                        if (i18 != 0) {
                            function22 = null;
                        } else {
                            function22 = function6;
                        }
                        if (i21 != 0) {
                            function23 = null;
                        } else {
                            function23 = function7;
                        }
                        if (i24 != 0) {
                            function24 = null;
                        } else {
                            function24 = function8;
                        }
                        if (i26 != 0) {
                            function25 = null;
                        } else {
                            function25 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            pscVarG = g(dVarF, (i27 >> 21) & 14);
                            i27 &= -57345;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 32768) != 0) {
                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i27 &= -458753;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i28 != 0) {
                            rx8 rx8Var11118 = rx8VarJ;
                            boolean z11111111110 = z7;
                            psc pscVar1111111112 = pscVarG;
                            do1 do1VarE11116 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                            rx8Var3 = rx8Var11118;
                            function27 = function21;
                            function28 = function24;
                            function29 = function25;
                            function31 = function23;
                            z8 = z11111111110;
                            function32 = do1VarE11116;
                            function26 = function11;
                            function30 = function22;
                            z9 = true;
                            i31 = i27;
                            pscVar3 = pscVar1111111112;
                        } else {
                            boolean z11111111111 = z7;
                            psc pscVar1111111113 = pscVarG;
                            rx8Var3 = rx8VarJ;
                            function26 = function11;
                            function27 = function21;
                            function28 = function24;
                            i31 = i27;
                            function29 = function25;
                            function30 = function22;
                            function31 = function23;
                            z8 = z11111111111;
                            pscVar3 = pscVar1111111113;
                            z9 = true;
                            function32 = function10;
                        }
                    }
                    dVarF.M();
                    Function2<? super d, ? super Integer, Unit> function311117 = function28;
                    if (e.k()) {
                        e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                    }
                    if ((i4 & 14) == 4) {
                        z10 = z9;
                    } else {
                        z10 = r19;
                    }
                    z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                    objR = dVarF.R();
                    if (z11) {
                        obj = null;
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    } else {
                        obj = null;
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    }
                    String text113 = ((TransformedText) objR).getText().getText();
                    TextFieldType textFieldType113 = TextFieldType.Outlined;
                    v1.Attached attached113 = new v1.Attached(false, null, null, 7, null);
                    if (function26 == null) {
                        dVarF.y(1927058812);
                        dVarF.u();
                        do1VarE = null;
                    } else {
                        dVarF.y(1927058813);
                        do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                        dVarF.u();
                    }
                    int i31111111111 = i4 >> 9;
                    int i31111111112 = i31 << 21;
                    int i31111111113 = ((i4 << 3) & 896) | 6 | (458752 & i31111111111) | (3670016 & i31111111111) | (i31111111112 & 29360128) | (i31111111112 & 234881024) | (i31111111112 & 1879048192);
                    int i31111111114 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i31111111111 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                    dVar2 = dVarF;
                    Function2<? super d, ? super Integer, Unit> function311118 = function20;
                    TextFieldImplKt.l(textFieldType113, text113, function2, attached113, do1VarE, function311118, function27, function30, function31, function311117, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i31111111113, i31111111114);
                    if (e.k()) {
                        e.n();
                    }
                    function15 = function311117;
                    function16 = function29;
                    rx8Var2 = rx8Var3;
                    function17 = function32;
                    function13 = function30;
                    function14 = function31;
                    function19 = function311118;
                    function12 = function27;
                    z6 = z8;
                    pscVar2 = pscVar3;
                    function18 = function26;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    z6 = z3;
                    function12 = function5;
                    function13 = function6;
                    function14 = function7;
                    function15 = function8;
                    function16 = function9;
                    pscVar2 = pscVar;
                    rx8Var2 = rx8Var;
                    function17 = function10;
                    function18 = function11;
                    function19 = function4;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.su8
                        public final Object invoke(Object obj2, Object obj3) {
                            return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i27 = i25 | 3072;
            if ((i2 & 24576) != 0) {
                if ((i3 & 16384) == 0) {
                    i7 = 16384;
                }
                i27 |= i7;
            }
            if ((i2 & 196608) != 0) {
                if ((i3 & 32768) == 0) {
                    i32 = 65536;
                } else {
                    i32 = 65536;
                }
                i27 |= i32;
            }
            i28 = i3 & 65536;
            if (i28 != 0) {
                i27 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (dVarF.T(function10)) {
                    i29 = 1048576;
                } else {
                    i29 = 524288;
                }
                i27 |= i29;
            }
            if ((i3 & 131072) != 0) {
                i27 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (dVarF.x(this)) {
                    i30 = 8388608;
                } else {
                    i30 = 4194304;
                }
                i27 |= i30;
            }
            if ((i4 & 306783379) == 306783378) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (dVarF.g(z5, i4 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        z7 = false;
                    } else {
                        z7 = z3;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    }
                    if (i14 != 0) {
                        function20 = null;
                    } else {
                        function20 = function4;
                    }
                    if (i16 != 0) {
                        function21 = null;
                    } else {
                        function21 = function5;
                    }
                    if (i18 != 0) {
                        function22 = null;
                    } else {
                        function22 = function6;
                    }
                    if (i21 != 0) {
                        function23 = null;
                    } else {
                        function23 = function7;
                    }
                    if (i24 != 0) {
                        function24 = null;
                    } else {
                        function24 = function8;
                    }
                    if (i26 != 0) {
                        function25 = null;
                    } else {
                        function25 = function9;
                    }
                    if ((i3 & 16384) != 0) {
                        pscVarG = g(dVarF, (i27 >> 21) & 14);
                        i27 &= -57345;
                    } else {
                        pscVarG = pscVar;
                    }
                    if ((i3 & 32768) != 0) {
                        rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i27 &= -458753;
                    } else {
                        rx8VarJ = rx8Var;
                    }
                    if (i28 != 0) {
                        rx8 rx8Var11119 = rx8VarJ;
                        boolean z11111111112 = z7;
                        psc pscVar1111111114 = pscVarG;
                        do1 do1VarE11117 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                        rx8Var3 = rx8Var11119;
                        function27 = function21;
                        function28 = function24;
                        function29 = function25;
                        function31 = function23;
                        z8 = z11111111112;
                        function32 = do1VarE11117;
                        function26 = function11;
                        function30 = function22;
                        z9 = true;
                        i31 = i27;
                        pscVar3 = pscVar1111111114;
                    } else {
                        boolean z11111111113 = z7;
                        psc pscVar1111111115 = pscVarG;
                        rx8Var3 = rx8VarJ;
                        function26 = function11;
                        function27 = function21;
                        function28 = function24;
                        i31 = i27;
                        function29 = function25;
                        function30 = function22;
                        function31 = function23;
                        z8 = z11111111113;
                        pscVar3 = pscVar1111111115;
                        z9 = true;
                        function32 = function10;
                    }
                } else {
                    if (i10 != 0) {
                        z7 = false;
                    } else {
                        z7 = z3;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    }
                    if (i14 != 0) {
                        function20 = null;
                    } else {
                        function20 = function4;
                    }
                    if (i16 != 0) {
                        function21 = null;
                    } else {
                        function21 = function5;
                    }
                    if (i18 != 0) {
                        function22 = null;
                    } else {
                        function22 = function6;
                    }
                    if (i21 != 0) {
                        function23 = null;
                    } else {
                        function23 = function7;
                    }
                    if (i24 != 0) {
                        function24 = null;
                    } else {
                        function24 = function8;
                    }
                    if (i26 != 0) {
                        function25 = null;
                    } else {
                        function25 = function9;
                    }
                    if ((i3 & 16384) != 0) {
                        pscVarG = g(dVarF, (i27 >> 21) & 14);
                        i27 &= -57345;
                    } else {
                        pscVarG = pscVar;
                    }
                    if ((i3 & 32768) != 0) {
                        rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i27 &= -458753;
                    } else {
                        rx8VarJ = rx8Var;
                    }
                    if (i28 != 0) {
                        rx8 rx8Var111110 = rx8VarJ;
                        boolean z11111111114 = z7;
                        psc pscVar1111111116 = pscVarG;
                        do1 do1VarE11118 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                        rx8Var3 = rx8Var111110;
                        function27 = function21;
                        function28 = function24;
                        function29 = function25;
                        function31 = function23;
                        z8 = z11111111114;
                        function32 = do1VarE11118;
                        function26 = function11;
                        function30 = function22;
                        z9 = true;
                        i31 = i27;
                        pscVar3 = pscVar1111111116;
                    } else {
                        boolean z11111111115 = z7;
                        psc pscVar1111111117 = pscVarG;
                        rx8Var3 = rx8VarJ;
                        function26 = function11;
                        function27 = function21;
                        function28 = function24;
                        i31 = i27;
                        function29 = function25;
                        function30 = function22;
                        function31 = function23;
                        z8 = z11111111115;
                        pscVar3 = pscVar1111111117;
                        z9 = true;
                        function32 = function10;
                    }
                }
                dVarF.M();
                Function2<? super d, ? super Integer, Unit> function311119 = function28;
                if (e.k()) {
                    e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                }
                if ((i4 & 14) == 4) {
                    z10 = z9;
                } else {
                    z10 = r19;
                }
                z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                objR = dVarF.R();
                if (z11) {
                    obj = null;
                    objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                    dVarF.L(objR);
                } else {
                    obj = null;
                    objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                    dVarF.L(objR);
                }
                String text114 = ((TransformedText) objR).getText().getText();
                TextFieldType textFieldType114 = TextFieldType.Outlined;
                v1.Attached attached114 = new v1.Attached(false, null, null, 7, null);
                if (function26 == null) {
                    dVarF.y(1927058812);
                    dVarF.u();
                    do1VarE = null;
                } else {
                    dVarF.y(1927058813);
                    do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                    dVarF.u();
                }
                int i31111111115 = i4 >> 9;
                int i31111111116 = i31 << 21;
                int i31111111117 = ((i4 << 3) & 896) | 6 | (458752 & i31111111115) | (3670016 & i31111111115) | (i31111111116 & 29360128) | (i31111111116 & 234881024) | (i31111111116 & 1879048192);
                int i31111111118 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i31111111115 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                dVar2 = dVarF;
                Function2<? super d, ? super Integer, Unit> function3111110 = function20;
                TextFieldImplKt.l(textFieldType114, text114, function2, attached114, do1VarE, function3111110, function27, function30, function31, function311119, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i31111111117, i31111111118);
                if (e.k()) {
                    e.n();
                }
                function15 = function311119;
                function16 = function29;
                rx8Var2 = rx8Var3;
                function17 = function32;
                function13 = function30;
                function14 = function31;
                function19 = function3111110;
                function12 = function27;
                z6 = z8;
                pscVar2 = pscVar3;
                function18 = function26;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                z6 = z3;
                function12 = function5;
                function13 = function6;
                function14 = function7;
                function15 = function8;
                function16 = function9;
                pscVar2 = pscVar;
                rx8Var2 = rx8Var;
                function17 = function10;
                function18 = function11;
                function19 = function4;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.su8
                    public final Object invoke(Object obj2, Object obj3) {
                        return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i4 |= 3072;
        z4 = z2;
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
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            if (dVarF.x(j26Var)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i4 |= i9;
        }
        i10 = i3 & 64;
        if (i10 != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (dVarF.A(z3)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i4 |= i11;
        }
        i12 = i3 & 128;
        if (i12 != 0) {
            i4 |= 12582912;
            function11 = function3;
        } else {
            function11 = function3;
            if ((i & 12582912) == 0) {
                if (dVarF.T(function11)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i4 |= i13;
            }
        }
        i14 = i3 & 256;
        if (i14 != 0) {
            if ((i & 100663296) == 0) {
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
                    i25 = i23 | (dVarF.T(function8) ? 256 : 128);
                } else {
                    i25 = i23;
                }
                i26 = i3 & 8192;
                if (i26 != 0) {
                    i27 = i25;
                    if ((i2 & 3072) == 0) {
                        i27 |= dVarF.T(function9) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i7 = 16384;
                        }
                        i27 |= i7;
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32768) == 0) {
                            i32 = 65536;
                        } else {
                            i32 = 65536;
                        }
                        i27 |= i32;
                    }
                    i28 = i3 & 65536;
                    if (i28 != 0) {
                        i27 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (dVarF.T(function10)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i27 |= i29;
                    }
                    if ((i3 & 131072) != 0) {
                        i27 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (dVarF.x(this)) {
                            i30 = 8388608;
                        } else {
                            i30 = 4194304;
                        }
                        i27 |= i30;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    if (dVarF.g(z5, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z7 = false;
                            } else {
                                z7 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            }
                            if (i14 != 0) {
                                function20 = null;
                            } else {
                                function20 = function4;
                            }
                            if (i16 != 0) {
                                function21 = null;
                            } else {
                                function21 = function5;
                            }
                            if (i18 != 0) {
                                function22 = null;
                            } else {
                                function22 = function6;
                            }
                            if (i21 != 0) {
                                function23 = null;
                            } else {
                                function23 = function7;
                            }
                            if (i24 != 0) {
                                function24 = null;
                            } else {
                                function24 = function8;
                            }
                            if (i26 != 0) {
                                function25 = null;
                            } else {
                                function25 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                pscVarG = g(dVarF, (i27 >> 21) & 14);
                                i27 &= -57345;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 32768) != 0) {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i27 &= -458753;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i28 != 0) {
                                rx8 rx8Var111111 = rx8VarJ;
                                boolean z11111111116 = z7;
                                psc pscVar1111111118 = pscVarG;
                                do1 do1VarE11119 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                rx8Var3 = rx8Var111111;
                                function27 = function21;
                                function28 = function24;
                                function29 = function25;
                                function31 = function23;
                                z8 = z11111111116;
                                function32 = do1VarE11119;
                                function26 = function11;
                                function30 = function22;
                                z9 = true;
                                i31 = i27;
                                pscVar3 = pscVar1111111118;
                            } else {
                                boolean z11111111117 = z7;
                                psc pscVar1111111119 = pscVarG;
                                rx8Var3 = rx8VarJ;
                                function26 = function11;
                                function27 = function21;
                                function28 = function24;
                                i31 = i27;
                                function29 = function25;
                                function30 = function22;
                                function31 = function23;
                                z8 = z11111111117;
                                pscVar3 = pscVar1111111119;
                                z9 = true;
                                function32 = function10;
                            }
                        } else {
                            if (i10 != 0) {
                                z7 = false;
                            } else {
                                z7 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            }
                            if (i14 != 0) {
                                function20 = null;
                            } else {
                                function20 = function4;
                            }
                            if (i16 != 0) {
                                function21 = null;
                            } else {
                                function21 = function5;
                            }
                            if (i18 != 0) {
                                function22 = null;
                            } else {
                                function22 = function6;
                            }
                            if (i21 != 0) {
                                function23 = null;
                            } else {
                                function23 = function7;
                            }
                            if (i24 != 0) {
                                function24 = null;
                            } else {
                                function24 = function8;
                            }
                            if (i26 != 0) {
                                function25 = null;
                            } else {
                                function25 = function9;
                            }
                            if ((i3 & 16384) != 0) {
                                pscVarG = g(dVarF, (i27 >> 21) & 14);
                                i27 &= -57345;
                            } else {
                                pscVarG = pscVar;
                            }
                            if ((i3 & 32768) != 0) {
                                rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i27 &= -458753;
                            } else {
                                rx8VarJ = rx8Var;
                            }
                            if (i28 != 0) {
                                rx8 rx8Var111112 = rx8VarJ;
                                boolean z11111111118 = z7;
                                psc pscVar11111111110 = pscVarG;
                                do1 do1VarE111110 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                                rx8Var3 = rx8Var111112;
                                function27 = function21;
                                function28 = function24;
                                function29 = function25;
                                function31 = function23;
                                z8 = z11111111118;
                                function32 = do1VarE111110;
                                function26 = function11;
                                function30 = function22;
                                z9 = true;
                                i31 = i27;
                                pscVar3 = pscVar11111111110;
                            } else {
                                boolean z11111111119 = z7;
                                psc pscVar11111111111 = pscVarG;
                                rx8Var3 = rx8VarJ;
                                function26 = function11;
                                function27 = function21;
                                function28 = function24;
                                i31 = i27;
                                function29 = function25;
                                function30 = function22;
                                function31 = function23;
                                z8 = z11111111119;
                                pscVar3 = pscVar11111111111;
                                z9 = true;
                                function32 = function10;
                            }
                        }
                        dVarF.M();
                        Function2<? super d, ? super Integer, Unit> function3111111 = function28;
                        if (e.k()) {
                            e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                        }
                        if ((i4 & 14) == 4) {
                            z10 = z9;
                        } else {
                            z10 = r19;
                        }
                        z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                        objR = dVarF.R();
                        if (z11) {
                            obj = null;
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        } else {
                            obj = null;
                            objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                            dVarF.L(objR);
                        }
                        String text115 = ((TransformedText) objR).getText().getText();
                        TextFieldType textFieldType115 = TextFieldType.Outlined;
                        v1.Attached attached115 = new v1.Attached(false, null, null, 7, null);
                        if (function26 == null) {
                            dVarF.y(1927058812);
                            dVarF.u();
                            do1VarE = null;
                        } else {
                            dVarF.y(1927058813);
                            do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                            dVarF.u();
                        }
                        int i31111111119 = i4 >> 9;
                        int i311111111110 = i31 << 21;
                        int i311111111111 = ((i4 << 3) & 896) | 6 | (458752 & i31111111119) | (3670016 & i31111111119) | (i311111111110 & 29360128) | (i311111111110 & 234881024) | (i311111111110 & 1879048192);
                        int i311111111112 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i31111111119 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                        dVar2 = dVarF;
                        Function2<? super d, ? super Integer, Unit> function3111112 = function20;
                        TextFieldImplKt.l(textFieldType115, text115, function2, attached115, do1VarE, function3111112, function27, function30, function31, function3111111, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i311111111111, i311111111112);
                        if (e.k()) {
                            e.n();
                        }
                        function15 = function3111111;
                        function16 = function29;
                        rx8Var2 = rx8Var3;
                        function17 = function32;
                        function13 = function30;
                        function14 = function31;
                        function19 = function3111112;
                        function12 = function27;
                        z6 = z8;
                        pscVar2 = pscVar3;
                        function18 = function26;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        z6 = z3;
                        function12 = function5;
                        function13 = function6;
                        function14 = function7;
                        function15 = function8;
                        function16 = function9;
                        pscVar2 = pscVar;
                        rx8Var2 = rx8Var;
                        function17 = function10;
                        function18 = function11;
                        function19 = function4;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.su8
                            public final Object invoke(Object obj2, Object obj3) {
                                return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i27 = i25 | 3072;
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i7 = 16384;
                    }
                    i27 |= i7;
                }
                if ((i2 & 196608) != 0) {
                    if ((i3 & 32768) == 0) {
                        i32 = 65536;
                    } else {
                        i32 = 65536;
                    }
                    i27 |= i32;
                }
                i28 = i3 & 65536;
                if (i28 != 0) {
                    i27 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (dVarF.T(function10)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i27 |= i29;
                }
                if ((i3 & 131072) != 0) {
                    i27 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (dVarF.x(this)) {
                        i30 = 8388608;
                    } else {
                        i30 = 4194304;
                    }
                    i27 |= i30;
                }
                if ((i4 & 306783379) == 306783378) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (dVarF.g(z5, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z7 = false;
                        } else {
                            z7 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        }
                        if (i14 != 0) {
                            function20 = null;
                        } else {
                            function20 = function4;
                        }
                        if (i16 != 0) {
                            function21 = null;
                        } else {
                            function21 = function5;
                        }
                        if (i18 != 0) {
                            function22 = null;
                        } else {
                            function22 = function6;
                        }
                        if (i21 != 0) {
                            function23 = null;
                        } else {
                            function23 = function7;
                        }
                        if (i24 != 0) {
                            function24 = null;
                        } else {
                            function24 = function8;
                        }
                        if (i26 != 0) {
                            function25 = null;
                        } else {
                            function25 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            pscVarG = g(dVarF, (i27 >> 21) & 14);
                            i27 &= -57345;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 32768) != 0) {
                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i27 &= -458753;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i28 != 0) {
                            rx8 rx8Var111113 = rx8VarJ;
                            boolean z111111111110 = z7;
                            psc pscVar11111111112 = pscVarG;
                            do1 do1VarE111111 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                            rx8Var3 = rx8Var111113;
                            function27 = function21;
                            function28 = function24;
                            function29 = function25;
                            function31 = function23;
                            z8 = z111111111110;
                            function32 = do1VarE111111;
                            function26 = function11;
                            function30 = function22;
                            z9 = true;
                            i31 = i27;
                            pscVar3 = pscVar11111111112;
                        } else {
                            boolean z111111111111 = z7;
                            psc pscVar11111111113 = pscVarG;
                            rx8Var3 = rx8VarJ;
                            function26 = function11;
                            function27 = function21;
                            function28 = function24;
                            i31 = i27;
                            function29 = function25;
                            function30 = function22;
                            function31 = function23;
                            z8 = z111111111111;
                            pscVar3 = pscVar11111111113;
                            z9 = true;
                            function32 = function10;
                        }
                    } else {
                        if (i10 != 0) {
                            z7 = false;
                        } else {
                            z7 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        }
                        if (i14 != 0) {
                            function20 = null;
                        } else {
                            function20 = function4;
                        }
                        if (i16 != 0) {
                            function21 = null;
                        } else {
                            function21 = function5;
                        }
                        if (i18 != 0) {
                            function22 = null;
                        } else {
                            function22 = function6;
                        }
                        if (i21 != 0) {
                            function23 = null;
                        } else {
                            function23 = function7;
                        }
                        if (i24 != 0) {
                            function24 = null;
                        } else {
                            function24 = function8;
                        }
                        if (i26 != 0) {
                            function25 = null;
                        } else {
                            function25 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            pscVarG = g(dVarF, (i27 >> 21) & 14);
                            i27 &= -57345;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 32768) != 0) {
                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i27 &= -458753;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i28 != 0) {
                            rx8 rx8Var111114 = rx8VarJ;
                            boolean z111111111112 = z7;
                            psc pscVar11111111114 = pscVarG;
                            do1 do1VarE111112 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                            rx8Var3 = rx8Var111114;
                            function27 = function21;
                            function28 = function24;
                            function29 = function25;
                            function31 = function23;
                            z8 = z111111111112;
                            function32 = do1VarE111112;
                            function26 = function11;
                            function30 = function22;
                            z9 = true;
                            i31 = i27;
                            pscVar3 = pscVar11111111114;
                        } else {
                            boolean z111111111113 = z7;
                            psc pscVar11111111115 = pscVarG;
                            rx8Var3 = rx8VarJ;
                            function26 = function11;
                            function27 = function21;
                            function28 = function24;
                            i31 = i27;
                            function29 = function25;
                            function30 = function22;
                            function31 = function23;
                            z8 = z111111111113;
                            pscVar3 = pscVar11111111115;
                            z9 = true;
                            function32 = function10;
                        }
                    }
                    dVarF.M();
                    Function2<? super d, ? super Integer, Unit> function3111113 = function28;
                    if (e.k()) {
                        e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                    }
                    if ((i4 & 14) == 4) {
                        z10 = z9;
                    } else {
                        z10 = r19;
                    }
                    z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                    objR = dVarF.R();
                    if (z11) {
                        obj = null;
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    } else {
                        obj = null;
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    }
                    String text116 = ((TransformedText) objR).getText().getText();
                    TextFieldType textFieldType116 = TextFieldType.Outlined;
                    v1.Attached attached116 = new v1.Attached(false, null, null, 7, null);
                    if (function26 == null) {
                        dVarF.y(1927058812);
                        dVarF.u();
                        do1VarE = null;
                    } else {
                        dVarF.y(1927058813);
                        do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                        dVarF.u();
                    }
                    int i311111111113 = i4 >> 9;
                    int i311111111114 = i31 << 21;
                    int i311111111115 = ((i4 << 3) & 896) | 6 | (458752 & i311111111113) | (3670016 & i311111111113) | (i311111111114 & 29360128) | (i311111111114 & 234881024) | (i311111111114 & 1879048192);
                    int i311111111116 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i311111111113 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                    dVar2 = dVarF;
                    Function2<? super d, ? super Integer, Unit> function3111114 = function20;
                    TextFieldImplKt.l(textFieldType116, text116, function2, attached116, do1VarE, function3111114, function27, function30, function31, function3111113, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i311111111115, i311111111116);
                    if (e.k()) {
                        e.n();
                    }
                    function15 = function3111113;
                    function16 = function29;
                    rx8Var2 = rx8Var3;
                    function17 = function32;
                    function13 = function30;
                    function14 = function31;
                    function19 = function3111114;
                    function12 = function27;
                    z6 = z8;
                    pscVar2 = pscVar3;
                    function18 = function26;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    z6 = z3;
                    function12 = function5;
                    function13 = function6;
                    function14 = function7;
                    function15 = function8;
                    function16 = function9;
                    pscVar2 = pscVar;
                    rx8Var2 = rx8Var;
                    function17 = function10;
                    function18 = function11;
                    function19 = function4;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.su8
                        public final Object invoke(Object obj2, Object obj3) {
                            return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
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
                i25 = i23 | (dVarF.T(function8) ? 256 : 128);
            } else {
                i25 = i23;
            }
            i26 = i3 & 8192;
            if (i26 != 0) {
                i27 = i25;
                if ((i2 & 3072) == 0) {
                    i27 |= dVarF.T(function9) ? 2048 : 1024;
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i7 = 16384;
                    }
                    i27 |= i7;
                }
                if ((i2 & 196608) != 0) {
                    if ((i3 & 32768) == 0) {
                        i32 = 65536;
                    } else {
                        i32 = 65536;
                    }
                    i27 |= i32;
                }
                i28 = i3 & 65536;
                if (i28 != 0) {
                    i27 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (dVarF.T(function10)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i27 |= i29;
                }
                if ((i3 & 131072) != 0) {
                    i27 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (dVarF.x(this)) {
                        i30 = 8388608;
                    } else {
                        i30 = 4194304;
                    }
                    i27 |= i30;
                }
                if ((i4 & 306783379) == 306783378) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (dVarF.g(z5, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z7 = false;
                        } else {
                            z7 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        }
                        if (i14 != 0) {
                            function20 = null;
                        } else {
                            function20 = function4;
                        }
                        if (i16 != 0) {
                            function21 = null;
                        } else {
                            function21 = function5;
                        }
                        if (i18 != 0) {
                            function22 = null;
                        } else {
                            function22 = function6;
                        }
                        if (i21 != 0) {
                            function23 = null;
                        } else {
                            function23 = function7;
                        }
                        if (i24 != 0) {
                            function24 = null;
                        } else {
                            function24 = function8;
                        }
                        if (i26 != 0) {
                            function25 = null;
                        } else {
                            function25 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            pscVarG = g(dVarF, (i27 >> 21) & 14);
                            i27 &= -57345;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 32768) != 0) {
                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i27 &= -458753;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i28 != 0) {
                            rx8 rx8Var111115 = rx8VarJ;
                            boolean z111111111114 = z7;
                            psc pscVar11111111116 = pscVarG;
                            do1 do1VarE111113 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                            rx8Var3 = rx8Var111115;
                            function27 = function21;
                            function28 = function24;
                            function29 = function25;
                            function31 = function23;
                            z8 = z111111111114;
                            function32 = do1VarE111113;
                            function26 = function11;
                            function30 = function22;
                            z9 = true;
                            i31 = i27;
                            pscVar3 = pscVar11111111116;
                        } else {
                            boolean z111111111115 = z7;
                            psc pscVar11111111117 = pscVarG;
                            rx8Var3 = rx8VarJ;
                            function26 = function11;
                            function27 = function21;
                            function28 = function24;
                            i31 = i27;
                            function29 = function25;
                            function30 = function22;
                            function31 = function23;
                            z8 = z111111111115;
                            pscVar3 = pscVar11111111117;
                            z9 = true;
                            function32 = function10;
                        }
                    } else {
                        if (i10 != 0) {
                            z7 = false;
                        } else {
                            z7 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        }
                        if (i14 != 0) {
                            function20 = null;
                        } else {
                            function20 = function4;
                        }
                        if (i16 != 0) {
                            function21 = null;
                        } else {
                            function21 = function5;
                        }
                        if (i18 != 0) {
                            function22 = null;
                        } else {
                            function22 = function6;
                        }
                        if (i21 != 0) {
                            function23 = null;
                        } else {
                            function23 = function7;
                        }
                        if (i24 != 0) {
                            function24 = null;
                        } else {
                            function24 = function8;
                        }
                        if (i26 != 0) {
                            function25 = null;
                        } else {
                            function25 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            pscVarG = g(dVarF, (i27 >> 21) & 14);
                            i27 &= -57345;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 32768) != 0) {
                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i27 &= -458753;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i28 != 0) {
                            rx8 rx8Var111116 = rx8VarJ;
                            boolean z111111111116 = z7;
                            psc pscVar11111111118 = pscVarG;
                            do1 do1VarE111114 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                            rx8Var3 = rx8Var111116;
                            function27 = function21;
                            function28 = function24;
                            function29 = function25;
                            function31 = function23;
                            z8 = z111111111116;
                            function32 = do1VarE111114;
                            function26 = function11;
                            function30 = function22;
                            z9 = true;
                            i31 = i27;
                            pscVar3 = pscVar11111111118;
                        } else {
                            boolean z111111111117 = z7;
                            psc pscVar11111111119 = pscVarG;
                            rx8Var3 = rx8VarJ;
                            function26 = function11;
                            function27 = function21;
                            function28 = function24;
                            i31 = i27;
                            function29 = function25;
                            function30 = function22;
                            function31 = function23;
                            z8 = z111111111117;
                            pscVar3 = pscVar11111111119;
                            z9 = true;
                            function32 = function10;
                        }
                    }
                    dVarF.M();
                    Function2<? super d, ? super Integer, Unit> function3111115 = function28;
                    if (e.k()) {
                        e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                    }
                    if ((i4 & 14) == 4) {
                        z10 = z9;
                    } else {
                        z10 = r19;
                    }
                    z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                    objR = dVarF.R();
                    if (z11) {
                        obj = null;
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    } else {
                        obj = null;
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    }
                    String text117 = ((TransformedText) objR).getText().getText();
                    TextFieldType textFieldType117 = TextFieldType.Outlined;
                    v1.Attached attached117 = new v1.Attached(false, null, null, 7, null);
                    if (function26 == null) {
                        dVarF.y(1927058812);
                        dVarF.u();
                        do1VarE = null;
                    } else {
                        dVarF.y(1927058813);
                        do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                        dVarF.u();
                    }
                    int i311111111117 = i4 >> 9;
                    int i311111111118 = i31 << 21;
                    int i311111111119 = ((i4 << 3) & 896) | 6 | (458752 & i311111111117) | (3670016 & i311111111117) | (i311111111118 & 29360128) | (i311111111118 & 234881024) | (i311111111118 & 1879048192);
                    int i3111111111110 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i311111111117 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                    dVar2 = dVarF;
                    Function2<? super d, ? super Integer, Unit> function3111116 = function20;
                    TextFieldImplKt.l(textFieldType117, text117, function2, attached117, do1VarE, function3111116, function27, function30, function31, function3111115, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i311111111119, i3111111111110);
                    if (e.k()) {
                        e.n();
                    }
                    function15 = function3111115;
                    function16 = function29;
                    rx8Var2 = rx8Var3;
                    function17 = function32;
                    function13 = function30;
                    function14 = function31;
                    function19 = function3111116;
                    function12 = function27;
                    z6 = z8;
                    pscVar2 = pscVar3;
                    function18 = function26;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    z6 = z3;
                    function12 = function5;
                    function13 = function6;
                    function14 = function7;
                    function15 = function8;
                    function16 = function9;
                    pscVar2 = pscVar;
                    rx8Var2 = rx8Var;
                    function17 = function10;
                    function18 = function11;
                    function19 = function4;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.su8
                        public final Object invoke(Object obj2, Object obj3) {
                            return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i27 = i25 | 3072;
            if ((i2 & 24576) != 0) {
                if ((i3 & 16384) == 0) {
                    i7 = 16384;
                }
                i27 |= i7;
            }
            if ((i2 & 196608) != 0) {
                if ((i3 & 32768) == 0) {
                    i32 = 65536;
                } else {
                    i32 = 65536;
                }
                i27 |= i32;
            }
            i28 = i3 & 65536;
            if (i28 != 0) {
                i27 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (dVarF.T(function10)) {
                    i29 = 1048576;
                } else {
                    i29 = 524288;
                }
                i27 |= i29;
            }
            if ((i3 & 131072) != 0) {
                i27 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (dVarF.x(this)) {
                    i30 = 8388608;
                } else {
                    i30 = 4194304;
                }
                i27 |= i30;
            }
            if ((i4 & 306783379) == 306783378) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (dVarF.g(z5, i4 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        z7 = false;
                    } else {
                        z7 = z3;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    }
                    if (i14 != 0) {
                        function20 = null;
                    } else {
                        function20 = function4;
                    }
                    if (i16 != 0) {
                        function21 = null;
                    } else {
                        function21 = function5;
                    }
                    if (i18 != 0) {
                        function22 = null;
                    } else {
                        function22 = function6;
                    }
                    if (i21 != 0) {
                        function23 = null;
                    } else {
                        function23 = function7;
                    }
                    if (i24 != 0) {
                        function24 = null;
                    } else {
                        function24 = function8;
                    }
                    if (i26 != 0) {
                        function25 = null;
                    } else {
                        function25 = function9;
                    }
                    if ((i3 & 16384) != 0) {
                        pscVarG = g(dVarF, (i27 >> 21) & 14);
                        i27 &= -57345;
                    } else {
                        pscVarG = pscVar;
                    }
                    if ((i3 & 32768) != 0) {
                        rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i27 &= -458753;
                    } else {
                        rx8VarJ = rx8Var;
                    }
                    if (i28 != 0) {
                        rx8 rx8Var111117 = rx8VarJ;
                        boolean z111111111118 = z7;
                        psc pscVar111111111110 = pscVarG;
                        do1 do1VarE111115 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                        rx8Var3 = rx8Var111117;
                        function27 = function21;
                        function28 = function24;
                        function29 = function25;
                        function31 = function23;
                        z8 = z111111111118;
                        function32 = do1VarE111115;
                        function26 = function11;
                        function30 = function22;
                        z9 = true;
                        i31 = i27;
                        pscVar3 = pscVar111111111110;
                    } else {
                        boolean z111111111119 = z7;
                        psc pscVar111111111111 = pscVarG;
                        rx8Var3 = rx8VarJ;
                        function26 = function11;
                        function27 = function21;
                        function28 = function24;
                        i31 = i27;
                        function29 = function25;
                        function30 = function22;
                        function31 = function23;
                        z8 = z111111111119;
                        pscVar3 = pscVar111111111111;
                        z9 = true;
                        function32 = function10;
                    }
                } else {
                    if (i10 != 0) {
                        z7 = false;
                    } else {
                        z7 = z3;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    }
                    if (i14 != 0) {
                        function20 = null;
                    } else {
                        function20 = function4;
                    }
                    if (i16 != 0) {
                        function21 = null;
                    } else {
                        function21 = function5;
                    }
                    if (i18 != 0) {
                        function22 = null;
                    } else {
                        function22 = function6;
                    }
                    if (i21 != 0) {
                        function23 = null;
                    } else {
                        function23 = function7;
                    }
                    if (i24 != 0) {
                        function24 = null;
                    } else {
                        function24 = function8;
                    }
                    if (i26 != 0) {
                        function25 = null;
                    } else {
                        function25 = function9;
                    }
                    if ((i3 & 16384) != 0) {
                        pscVarG = g(dVarF, (i27 >> 21) & 14);
                        i27 &= -57345;
                    } else {
                        pscVarG = pscVar;
                    }
                    if ((i3 & 32768) != 0) {
                        rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i27 &= -458753;
                    } else {
                        rx8VarJ = rx8Var;
                    }
                    if (i28 != 0) {
                        rx8 rx8Var111118 = rx8VarJ;
                        boolean z1111111111110 = z7;
                        psc pscVar111111111112 = pscVarG;
                        do1 do1VarE111116 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                        rx8Var3 = rx8Var111118;
                        function27 = function21;
                        function28 = function24;
                        function29 = function25;
                        function31 = function23;
                        z8 = z1111111111110;
                        function32 = do1VarE111116;
                        function26 = function11;
                        function30 = function22;
                        z9 = true;
                        i31 = i27;
                        pscVar3 = pscVar111111111112;
                    } else {
                        boolean z1111111111111 = z7;
                        psc pscVar111111111113 = pscVarG;
                        rx8Var3 = rx8VarJ;
                        function26 = function11;
                        function27 = function21;
                        function28 = function24;
                        i31 = i27;
                        function29 = function25;
                        function30 = function22;
                        function31 = function23;
                        z8 = z1111111111111;
                        pscVar3 = pscVar111111111113;
                        z9 = true;
                        function32 = function10;
                    }
                }
                dVarF.M();
                Function2<? super d, ? super Integer, Unit> function3111117 = function28;
                if (e.k()) {
                    e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                }
                if ((i4 & 14) == 4) {
                    z10 = z9;
                } else {
                    z10 = r19;
                }
                z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                objR = dVarF.R();
                if (z11) {
                    obj = null;
                    objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                    dVarF.L(objR);
                } else {
                    obj = null;
                    objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                    dVarF.L(objR);
                }
                String text118 = ((TransformedText) objR).getText().getText();
                TextFieldType textFieldType118 = TextFieldType.Outlined;
                v1.Attached attached118 = new v1.Attached(false, null, null, 7, null);
                if (function26 == null) {
                    dVarF.y(1927058812);
                    dVarF.u();
                    do1VarE = null;
                } else {
                    dVarF.y(1927058813);
                    do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                    dVarF.u();
                }
                int i3111111111111 = i4 >> 9;
                int i3111111111112 = i31 << 21;
                int i3111111111113 = ((i4 << 3) & 896) | 6 | (458752 & i3111111111111) | (3670016 & i3111111111111) | (i3111111111112 & 29360128) | (i3111111111112 & 234881024) | (i3111111111112 & 1879048192);
                int i3111111111114 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i3111111111111 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                dVar2 = dVarF;
                Function2<? super d, ? super Integer, Unit> function3111118 = function20;
                TextFieldImplKt.l(textFieldType118, text118, function2, attached118, do1VarE, function3111118, function27, function30, function31, function3111117, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i3111111111113, i3111111111114);
                if (e.k()) {
                    e.n();
                }
                function15 = function3111117;
                function16 = function29;
                rx8Var2 = rx8Var3;
                function17 = function32;
                function13 = function30;
                function14 = function31;
                function19 = function3111118;
                function12 = function27;
                z6 = z8;
                pscVar2 = pscVar3;
                function18 = function26;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                z6 = z3;
                function12 = function5;
                function13 = function6;
                function14 = function7;
                function15 = function8;
                function16 = function9;
                pscVar2 = pscVar;
                rx8Var2 = rx8Var;
                function17 = function10;
                function18 = function11;
                function19 = function4;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.su8
                    public final Object invoke(Object obj2, Object obj3) {
                        return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i4 |= 100663296;
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
                i25 = i23 | (dVarF.T(function8) ? 256 : 128);
            } else {
                i25 = i23;
            }
            i26 = i3 & 8192;
            if (i26 != 0) {
                i27 = i25;
                if ((i2 & 3072) == 0) {
                    i27 |= dVarF.T(function9) ? 2048 : 1024;
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i7 = 16384;
                    }
                    i27 |= i7;
                }
                if ((i2 & 196608) != 0) {
                    if ((i3 & 32768) == 0) {
                        i32 = 65536;
                    } else {
                        i32 = 65536;
                    }
                    i27 |= i32;
                }
                i28 = i3 & 65536;
                if (i28 != 0) {
                    i27 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (dVarF.T(function10)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i27 |= i29;
                }
                if ((i3 & 131072) != 0) {
                    i27 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (dVarF.x(this)) {
                        i30 = 8388608;
                    } else {
                        i30 = 4194304;
                    }
                    i27 |= i30;
                }
                if ((i4 & 306783379) == 306783378) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (dVarF.g(z5, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z7 = false;
                        } else {
                            z7 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        }
                        if (i14 != 0) {
                            function20 = null;
                        } else {
                            function20 = function4;
                        }
                        if (i16 != 0) {
                            function21 = null;
                        } else {
                            function21 = function5;
                        }
                        if (i18 != 0) {
                            function22 = null;
                        } else {
                            function22 = function6;
                        }
                        if (i21 != 0) {
                            function23 = null;
                        } else {
                            function23 = function7;
                        }
                        if (i24 != 0) {
                            function24 = null;
                        } else {
                            function24 = function8;
                        }
                        if (i26 != 0) {
                            function25 = null;
                        } else {
                            function25 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            pscVarG = g(dVarF, (i27 >> 21) & 14);
                            i27 &= -57345;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 32768) != 0) {
                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i27 &= -458753;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i28 != 0) {
                            rx8 rx8Var111119 = rx8VarJ;
                            boolean z1111111111112 = z7;
                            psc pscVar111111111114 = pscVarG;
                            do1 do1VarE111117 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                            rx8Var3 = rx8Var111119;
                            function27 = function21;
                            function28 = function24;
                            function29 = function25;
                            function31 = function23;
                            z8 = z1111111111112;
                            function32 = do1VarE111117;
                            function26 = function11;
                            function30 = function22;
                            z9 = true;
                            i31 = i27;
                            pscVar3 = pscVar111111111114;
                        } else {
                            boolean z1111111111113 = z7;
                            psc pscVar111111111115 = pscVarG;
                            rx8Var3 = rx8VarJ;
                            function26 = function11;
                            function27 = function21;
                            function28 = function24;
                            i31 = i27;
                            function29 = function25;
                            function30 = function22;
                            function31 = function23;
                            z8 = z1111111111113;
                            pscVar3 = pscVar111111111115;
                            z9 = true;
                            function32 = function10;
                        }
                    } else {
                        if (i10 != 0) {
                            z7 = false;
                        } else {
                            z7 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        }
                        if (i14 != 0) {
                            function20 = null;
                        } else {
                            function20 = function4;
                        }
                        if (i16 != 0) {
                            function21 = null;
                        } else {
                            function21 = function5;
                        }
                        if (i18 != 0) {
                            function22 = null;
                        } else {
                            function22 = function6;
                        }
                        if (i21 != 0) {
                            function23 = null;
                        } else {
                            function23 = function7;
                        }
                        if (i24 != 0) {
                            function24 = null;
                        } else {
                            function24 = function8;
                        }
                        if (i26 != 0) {
                            function25 = null;
                        } else {
                            function25 = function9;
                        }
                        if ((i3 & 16384) != 0) {
                            pscVarG = g(dVarF, (i27 >> 21) & 14);
                            i27 &= -57345;
                        } else {
                            pscVarG = pscVar;
                        }
                        if ((i3 & 32768) != 0) {
                            rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i27 &= -458753;
                        } else {
                            rx8VarJ = rx8Var;
                        }
                        if (i28 != 0) {
                            rx8 rx8Var1111110 = rx8VarJ;
                            boolean z1111111111114 = z7;
                            psc pscVar111111111116 = pscVarG;
                            do1 do1VarE111118 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                            rx8Var3 = rx8Var1111110;
                            function27 = function21;
                            function28 = function24;
                            function29 = function25;
                            function31 = function23;
                            z8 = z1111111111114;
                            function32 = do1VarE111118;
                            function26 = function11;
                            function30 = function22;
                            z9 = true;
                            i31 = i27;
                            pscVar3 = pscVar111111111116;
                        } else {
                            boolean z1111111111115 = z7;
                            psc pscVar111111111117 = pscVarG;
                            rx8Var3 = rx8VarJ;
                            function26 = function11;
                            function27 = function21;
                            function28 = function24;
                            i31 = i27;
                            function29 = function25;
                            function30 = function22;
                            function31 = function23;
                            z8 = z1111111111115;
                            pscVar3 = pscVar111111111117;
                            z9 = true;
                            function32 = function10;
                        }
                    }
                    dVarF.M();
                    Function2<? super d, ? super Integer, Unit> function3111119 = function28;
                    if (e.k()) {
                        e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                    }
                    if ((i4 & 14) == 4) {
                        z10 = z9;
                    } else {
                        z10 = r19;
                    }
                    z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                    objR = dVarF.R();
                    if (z11) {
                        obj = null;
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    } else {
                        obj = null;
                        objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                        dVarF.L(objR);
                    }
                    String text119 = ((TransformedText) objR).getText().getText();
                    TextFieldType textFieldType119 = TextFieldType.Outlined;
                    v1.Attached attached119 = new v1.Attached(false, null, null, 7, null);
                    if (function26 == null) {
                        dVarF.y(1927058812);
                        dVarF.u();
                        do1VarE = null;
                    } else {
                        dVarF.y(1927058813);
                        do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                        dVarF.u();
                    }
                    int i3111111111115 = i4 >> 9;
                    int i3111111111116 = i31 << 21;
                    int i3111111111117 = ((i4 << 3) & 896) | 6 | (458752 & i3111111111115) | (3670016 & i3111111111115) | (i3111111111116 & 29360128) | (i3111111111116 & 234881024) | (i3111111111116 & 1879048192);
                    int i3111111111118 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i3111111111115 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                    dVar2 = dVarF;
                    Function2<? super d, ? super Integer, Unit> function31111110 = function20;
                    TextFieldImplKt.l(textFieldType119, text119, function2, attached119, do1VarE, function31111110, function27, function30, function31, function3111119, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i3111111111117, i3111111111118);
                    if (e.k()) {
                        e.n();
                    }
                    function15 = function3111119;
                    function16 = function29;
                    rx8Var2 = rx8Var3;
                    function17 = function32;
                    function13 = function30;
                    function14 = function31;
                    function19 = function31111110;
                    function12 = function27;
                    z6 = z8;
                    pscVar2 = pscVar3;
                    function18 = function26;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    z6 = z3;
                    function12 = function5;
                    function13 = function6;
                    function14 = function7;
                    function15 = function8;
                    function16 = function9;
                    pscVar2 = pscVar;
                    rx8Var2 = rx8Var;
                    function17 = function10;
                    function18 = function11;
                    function19 = function4;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.su8
                        public final Object invoke(Object obj2, Object obj3) {
                            return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i27 = i25 | 3072;
            if ((i2 & 24576) != 0) {
                if ((i3 & 16384) == 0) {
                    i7 = 16384;
                }
                i27 |= i7;
            }
            if ((i2 & 196608) != 0) {
                if ((i3 & 32768) == 0) {
                    i32 = 65536;
                } else {
                    i32 = 65536;
                }
                i27 |= i32;
            }
            i28 = i3 & 65536;
            if (i28 != 0) {
                i27 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (dVarF.T(function10)) {
                    i29 = 1048576;
                } else {
                    i29 = 524288;
                }
                i27 |= i29;
            }
            if ((i3 & 131072) != 0) {
                i27 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (dVarF.x(this)) {
                    i30 = 8388608;
                } else {
                    i30 = 4194304;
                }
                i27 |= i30;
            }
            if ((i4 & 306783379) == 306783378) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (dVarF.g(z5, i4 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        z7 = false;
                    } else {
                        z7 = z3;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    }
                    if (i14 != 0) {
                        function20 = null;
                    } else {
                        function20 = function4;
                    }
                    if (i16 != 0) {
                        function21 = null;
                    } else {
                        function21 = function5;
                    }
                    if (i18 != 0) {
                        function22 = null;
                    } else {
                        function22 = function6;
                    }
                    if (i21 != 0) {
                        function23 = null;
                    } else {
                        function23 = function7;
                    }
                    if (i24 != 0) {
                        function24 = null;
                    } else {
                        function24 = function8;
                    }
                    if (i26 != 0) {
                        function25 = null;
                    } else {
                        function25 = function9;
                    }
                    if ((i3 & 16384) != 0) {
                        pscVarG = g(dVarF, (i27 >> 21) & 14);
                        i27 &= -57345;
                    } else {
                        pscVarG = pscVar;
                    }
                    if ((i3 & 32768) != 0) {
                        rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i27 &= -458753;
                    } else {
                        rx8VarJ = rx8Var;
                    }
                    if (i28 != 0) {
                        rx8 rx8Var1111111 = rx8VarJ;
                        boolean z1111111111116 = z7;
                        psc pscVar111111111118 = pscVarG;
                        do1 do1VarE111119 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                        rx8Var3 = rx8Var1111111;
                        function27 = function21;
                        function28 = function24;
                        function29 = function25;
                        function31 = function23;
                        z8 = z1111111111116;
                        function32 = do1VarE111119;
                        function26 = function11;
                        function30 = function22;
                        z9 = true;
                        i31 = i27;
                        pscVar3 = pscVar111111111118;
                    } else {
                        boolean z1111111111117 = z7;
                        psc pscVar111111111119 = pscVarG;
                        rx8Var3 = rx8VarJ;
                        function26 = function11;
                        function27 = function21;
                        function28 = function24;
                        i31 = i27;
                        function29 = function25;
                        function30 = function22;
                        function31 = function23;
                        z8 = z1111111111117;
                        pscVar3 = pscVar111111111119;
                        z9 = true;
                        function32 = function10;
                    }
                } else {
                    if (i10 != 0) {
                        z7 = false;
                    } else {
                        z7 = z3;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    }
                    if (i14 != 0) {
                        function20 = null;
                    } else {
                        function20 = function4;
                    }
                    if (i16 != 0) {
                        function21 = null;
                    } else {
                        function21 = function5;
                    }
                    if (i18 != 0) {
                        function22 = null;
                    } else {
                        function22 = function6;
                    }
                    if (i21 != 0) {
                        function23 = null;
                    } else {
                        function23 = function7;
                    }
                    if (i24 != 0) {
                        function24 = null;
                    } else {
                        function24 = function8;
                    }
                    if (i26 != 0) {
                        function25 = null;
                    } else {
                        function25 = function9;
                    }
                    if ((i3 & 16384) != 0) {
                        pscVarG = g(dVarF, (i27 >> 21) & 14);
                        i27 &= -57345;
                    } else {
                        pscVarG = pscVar;
                    }
                    if ((i3 & 32768) != 0) {
                        rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i27 &= -458753;
                    } else {
                        rx8VarJ = rx8Var;
                    }
                    if (i28 != 0) {
                        rx8 rx8Var1111112 = rx8VarJ;
                        boolean z1111111111118 = z7;
                        psc pscVar1111111111110 = pscVarG;
                        do1 do1VarE1111110 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                        rx8Var3 = rx8Var1111112;
                        function27 = function21;
                        function28 = function24;
                        function29 = function25;
                        function31 = function23;
                        z8 = z1111111111118;
                        function32 = do1VarE1111110;
                        function26 = function11;
                        function30 = function22;
                        z9 = true;
                        i31 = i27;
                        pscVar3 = pscVar1111111111110;
                    } else {
                        boolean z1111111111119 = z7;
                        psc pscVar1111111111111 = pscVarG;
                        rx8Var3 = rx8VarJ;
                        function26 = function11;
                        function27 = function21;
                        function28 = function24;
                        i31 = i27;
                        function29 = function25;
                        function30 = function22;
                        function31 = function23;
                        z8 = z1111111111119;
                        pscVar3 = pscVar1111111111111;
                        z9 = true;
                        function32 = function10;
                    }
                }
                dVarF.M();
                Function2<? super d, ? super Integer, Unit> function31111111 = function28;
                if (e.k()) {
                    e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                }
                if ((i4 & 14) == 4) {
                    z10 = z9;
                } else {
                    z10 = r19;
                }
                z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                objR = dVarF.R();
                if (z11) {
                    obj = null;
                    objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                    dVarF.L(objR);
                } else {
                    obj = null;
                    objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                    dVarF.L(objR);
                }
                String text1110 = ((TransformedText) objR).getText().getText();
                TextFieldType textFieldType1110 = TextFieldType.Outlined;
                v1.Attached attached1110 = new v1.Attached(false, null, null, 7, null);
                if (function26 == null) {
                    dVarF.y(1927058812);
                    dVarF.u();
                    do1VarE = null;
                } else {
                    dVarF.y(1927058813);
                    do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                    dVarF.u();
                }
                int i3111111111119 = i4 >> 9;
                int i31111111111110 = i31 << 21;
                int i31111111111111 = ((i4 << 3) & 896) | 6 | (458752 & i3111111111119) | (3670016 & i3111111111119) | (i31111111111110 & 29360128) | (i31111111111110 & 234881024) | (i31111111111110 & 1879048192);
                int i31111111111112 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i3111111111119 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                dVar2 = dVarF;
                Function2<? super d, ? super Integer, Unit> function31111112 = function20;
                TextFieldImplKt.l(textFieldType1110, text1110, function2, attached1110, do1VarE, function31111112, function27, function30, function31, function31111111, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i31111111111111, i31111111111112);
                if (e.k()) {
                    e.n();
                }
                function15 = function31111111;
                function16 = function29;
                rx8Var2 = rx8Var3;
                function17 = function32;
                function13 = function30;
                function14 = function31;
                function19 = function31111112;
                function12 = function27;
                z6 = z8;
                pscVar2 = pscVar3;
                function18 = function26;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                z6 = z3;
                function12 = function5;
                function13 = function6;
                function14 = function7;
                function15 = function8;
                function16 = function9;
                pscVar2 = pscVar;
                rx8Var2 = rx8Var;
                function17 = function10;
                function18 = function11;
                function19 = function4;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.su8
                    public final Object invoke(Object obj2, Object obj3) {
                        return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
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
            i25 = i23 | (dVarF.T(function8) ? 256 : 128);
        } else {
            i25 = i23;
        }
        i26 = i3 & 8192;
        if (i26 != 0) {
            i27 = i25;
            if ((i2 & 3072) == 0) {
                i27 |= dVarF.T(function9) ? 2048 : 1024;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16384) == 0) {
                    i7 = 16384;
                }
                i27 |= i7;
            }
            if ((i2 & 196608) != 0) {
                if ((i3 & 32768) == 0) {
                    i32 = 65536;
                } else {
                    i32 = 65536;
                }
                i27 |= i32;
            }
            i28 = i3 & 65536;
            if (i28 != 0) {
                i27 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (dVarF.T(function10)) {
                    i29 = 1048576;
                } else {
                    i29 = 524288;
                }
                i27 |= i29;
            }
            if ((i3 & 131072) != 0) {
                i27 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (dVarF.x(this)) {
                    i30 = 8388608;
                } else {
                    i30 = 4194304;
                }
                i27 |= i30;
            }
            if ((i4 & 306783379) == 306783378) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (dVarF.g(z5, i4 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        z7 = false;
                    } else {
                        z7 = z3;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    }
                    if (i14 != 0) {
                        function20 = null;
                    } else {
                        function20 = function4;
                    }
                    if (i16 != 0) {
                        function21 = null;
                    } else {
                        function21 = function5;
                    }
                    if (i18 != 0) {
                        function22 = null;
                    } else {
                        function22 = function6;
                    }
                    if (i21 != 0) {
                        function23 = null;
                    } else {
                        function23 = function7;
                    }
                    if (i24 != 0) {
                        function24 = null;
                    } else {
                        function24 = function8;
                    }
                    if (i26 != 0) {
                        function25 = null;
                    } else {
                        function25 = function9;
                    }
                    if ((i3 & 16384) != 0) {
                        pscVarG = g(dVarF, (i27 >> 21) & 14);
                        i27 &= -57345;
                    } else {
                        pscVarG = pscVar;
                    }
                    if ((i3 & 32768) != 0) {
                        rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i27 &= -458753;
                    } else {
                        rx8VarJ = rx8Var;
                    }
                    if (i28 != 0) {
                        rx8 rx8Var1111113 = rx8VarJ;
                        boolean z11111111111110 = z7;
                        psc pscVar1111111111112 = pscVarG;
                        do1 do1VarE1111111 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                        rx8Var3 = rx8Var1111113;
                        function27 = function21;
                        function28 = function24;
                        function29 = function25;
                        function31 = function23;
                        z8 = z11111111111110;
                        function32 = do1VarE1111111;
                        function26 = function11;
                        function30 = function22;
                        z9 = true;
                        i31 = i27;
                        pscVar3 = pscVar1111111111112;
                    } else {
                        boolean z11111111111111 = z7;
                        psc pscVar1111111111113 = pscVarG;
                        rx8Var3 = rx8VarJ;
                        function26 = function11;
                        function27 = function21;
                        function28 = function24;
                        i31 = i27;
                        function29 = function25;
                        function30 = function22;
                        function31 = function23;
                        z8 = z11111111111111;
                        pscVar3 = pscVar1111111111113;
                        z9 = true;
                        function32 = function10;
                    }
                } else {
                    if (i10 != 0) {
                        z7 = false;
                    } else {
                        z7 = z3;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    }
                    if (i14 != 0) {
                        function20 = null;
                    } else {
                        function20 = function4;
                    }
                    if (i16 != 0) {
                        function21 = null;
                    } else {
                        function21 = function5;
                    }
                    if (i18 != 0) {
                        function22 = null;
                    } else {
                        function22 = function6;
                    }
                    if (i21 != 0) {
                        function23 = null;
                    } else {
                        function23 = function7;
                    }
                    if (i24 != 0) {
                        function24 = null;
                    } else {
                        function24 = function8;
                    }
                    if (i26 != 0) {
                        function25 = null;
                    } else {
                        function25 = function9;
                    }
                    if ((i3 & 16384) != 0) {
                        pscVarG = g(dVarF, (i27 >> 21) & 14);
                        i27 &= -57345;
                    } else {
                        pscVarG = pscVar;
                    }
                    if ((i3 & 32768) != 0) {
                        rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i27 &= -458753;
                    } else {
                        rx8VarJ = rx8Var;
                    }
                    if (i28 != 0) {
                        rx8 rx8Var1111114 = rx8VarJ;
                        boolean z11111111111112 = z7;
                        psc pscVar1111111111114 = pscVarG;
                        do1 do1VarE1111112 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                        rx8Var3 = rx8Var1111114;
                        function27 = function21;
                        function28 = function24;
                        function29 = function25;
                        function31 = function23;
                        z8 = z11111111111112;
                        function32 = do1VarE1111112;
                        function26 = function11;
                        function30 = function22;
                        z9 = true;
                        i31 = i27;
                        pscVar3 = pscVar1111111111114;
                    } else {
                        boolean z11111111111113 = z7;
                        psc pscVar1111111111115 = pscVarG;
                        rx8Var3 = rx8VarJ;
                        function26 = function11;
                        function27 = function21;
                        function28 = function24;
                        i31 = i27;
                        function29 = function25;
                        function30 = function22;
                        function31 = function23;
                        z8 = z11111111111113;
                        pscVar3 = pscVar1111111111115;
                        z9 = true;
                        function32 = function10;
                    }
                }
                dVarF.M();
                Function2<? super d, ? super Integer, Unit> function31111113 = function28;
                if (e.k()) {
                    e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                }
                if ((i4 & 14) == 4) {
                    z10 = z9;
                } else {
                    z10 = r19;
                }
                z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
                objR = dVarF.R();
                if (z11) {
                    obj = null;
                    objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                    dVarF.L(objR);
                } else {
                    obj = null;
                    objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                    dVarF.L(objR);
                }
                String text1111 = ((TransformedText) objR).getText().getText();
                TextFieldType textFieldType1111 = TextFieldType.Outlined;
                v1.Attached attached1111 = new v1.Attached(false, null, null, 7, null);
                if (function26 == null) {
                    dVarF.y(1927058812);
                    dVarF.u();
                    do1VarE = null;
                } else {
                    dVarF.y(1927058813);
                    do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                    dVarF.u();
                }
                int i31111111111113 = i4 >> 9;
                int i31111111111114 = i31 << 21;
                int i31111111111115 = ((i4 << 3) & 896) | 6 | (458752 & i31111111111113) | (3670016 & i31111111111113) | (i31111111111114 & 29360128) | (i31111111111114 & 234881024) | (i31111111111114 & 1879048192);
                int i31111111111116 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i31111111111113 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
                dVar2 = dVarF;
                Function2<? super d, ? super Integer, Unit> function31111114 = function20;
                TextFieldImplKt.l(textFieldType1111, text1111, function2, attached1111, do1VarE, function31111114, function27, function30, function31, function31111113, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i31111111111115, i31111111111116);
                if (e.k()) {
                    e.n();
                }
                function15 = function31111113;
                function16 = function29;
                rx8Var2 = rx8Var3;
                function17 = function32;
                function13 = function30;
                function14 = function31;
                function19 = function31111114;
                function12 = function27;
                z6 = z8;
                pscVar2 = pscVar3;
                function18 = function26;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                z6 = z3;
                function12 = function5;
                function13 = function6;
                function14 = function7;
                function15 = function8;
                function16 = function9;
                pscVar2 = pscVar;
                rx8Var2 = rx8Var;
                function17 = function10;
                function18 = function11;
                function19 = function4;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.su8
                    public final Object invoke(Object obj2, Object obj3) {
                        return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i27 = i25 | 3072;
        if ((i2 & 24576) != 0) {
            if ((i3 & 16384) == 0) {
                i7 = 16384;
            }
            i27 |= i7;
        }
        if ((i2 & 196608) != 0) {
            if ((i3 & 32768) == 0) {
                i32 = 65536;
            } else {
                i32 = 65536;
            }
            i27 |= i32;
        }
        i28 = i3 & 65536;
        if (i28 != 0) {
            i27 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            if (dVarF.T(function10)) {
                i29 = 1048576;
            } else {
                i29 = 524288;
            }
            i27 |= i29;
        }
        if ((i3 & 131072) != 0) {
            i27 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            if (dVarF.x(this)) {
                i30 = 8388608;
            } else {
                i30 = 4194304;
            }
            i27 |= i30;
        }
        if ((i4 & 306783379) == 306783378) {
            z5 = true;
        } else {
            z5 = true;
        }
        if (dVarF.g(z5, i4 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    z7 = false;
                } else {
                    z7 = z3;
                }
                if (i12 != 0) {
                    function11 = null;
                }
                if (i14 != 0) {
                    function20 = null;
                } else {
                    function20 = function4;
                }
                if (i16 != 0) {
                    function21 = null;
                } else {
                    function21 = function5;
                }
                if (i18 != 0) {
                    function22 = null;
                } else {
                    function22 = function6;
                }
                if (i21 != 0) {
                    function23 = null;
                } else {
                    function23 = function7;
                }
                if (i24 != 0) {
                    function24 = null;
                } else {
                    function24 = function8;
                }
                if (i26 != 0) {
                    function25 = null;
                } else {
                    function25 = function9;
                }
                if ((i3 & 16384) != 0) {
                    pscVarG = g(dVarF, (i27 >> 21) & 14);
                    i27 &= -57345;
                } else {
                    pscVarG = pscVar;
                }
                if ((i3 & 32768) != 0) {
                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    i27 &= -458753;
                } else {
                    rx8VarJ = rx8Var;
                }
                if (i28 != 0) {
                    rx8 rx8Var1111115 = rx8VarJ;
                    boolean z11111111111114 = z7;
                    psc pscVar1111111111116 = pscVarG;
                    do1 do1VarE1111113 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                    rx8Var3 = rx8Var1111115;
                    function27 = function21;
                    function28 = function24;
                    function29 = function25;
                    function31 = function23;
                    z8 = z11111111111114;
                    function32 = do1VarE1111113;
                    function26 = function11;
                    function30 = function22;
                    z9 = true;
                    i31 = i27;
                    pscVar3 = pscVar1111111111116;
                } else {
                    boolean z11111111111115 = z7;
                    psc pscVar1111111111117 = pscVarG;
                    rx8Var3 = rx8VarJ;
                    function26 = function11;
                    function27 = function21;
                    function28 = function24;
                    i31 = i27;
                    function29 = function25;
                    function30 = function22;
                    function31 = function23;
                    z8 = z11111111111115;
                    pscVar3 = pscVar1111111111117;
                    z9 = true;
                    function32 = function10;
                }
            } else {
                if (i10 != 0) {
                    z7 = false;
                } else {
                    z7 = z3;
                }
                if (i12 != 0) {
                    function11 = null;
                }
                if (i14 != 0) {
                    function20 = null;
                } else {
                    function20 = function4;
                }
                if (i16 != 0) {
                    function21 = null;
                } else {
                    function21 = function5;
                }
                if (i18 != 0) {
                    function22 = null;
                } else {
                    function22 = function6;
                }
                if (i21 != 0) {
                    function23 = null;
                } else {
                    function23 = function7;
                }
                if (i24 != 0) {
                    function24 = null;
                } else {
                    function24 = function8;
                }
                if (i26 != 0) {
                    function25 = null;
                } else {
                    function25 = function9;
                }
                if ((i3 & 16384) != 0) {
                    pscVarG = g(dVarF, (i27 >> 21) & 14);
                    i27 &= -57345;
                } else {
                    pscVarG = pscVar;
                }
                if ((i3 & 32768) != 0) {
                    rx8VarJ = j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    i27 &= -458753;
                } else {
                    rx8VarJ = rx8Var;
                }
                if (i28 != 0) {
                    rx8 rx8Var1111116 = rx8VarJ;
                    boolean z11111111111116 = z7;
                    psc pscVar1111111111118 = pscVarG;
                    do1 do1VarE1111114 = ko1.e(-896270173, true, new a(z, z7, j26Var, pscVarG), dVarF, 54);
                    rx8Var3 = rx8Var1111116;
                    function27 = function21;
                    function28 = function24;
                    function29 = function25;
                    function31 = function23;
                    z8 = z11111111111116;
                    function32 = do1VarE1111114;
                    function26 = function11;
                    function30 = function22;
                    z9 = true;
                    i31 = i27;
                    pscVar3 = pscVar1111111111118;
                } else {
                    boolean z11111111111117 = z7;
                    psc pscVar1111111111119 = pscVarG;
                    rx8Var3 = rx8VarJ;
                    function26 = function11;
                    function27 = function21;
                    function28 = function24;
                    i31 = i27;
                    function29 = function25;
                    function30 = function22;
                    function31 = function23;
                    z8 = z11111111111117;
                    pscVar3 = pscVar1111111111119;
                    z9 = true;
                    function32 = function10;
                }
            }
            dVarF.M();
            Function2<? super d, ? super Integer, Unit> function31111115 = function28;
            if (e.k()) {
                e.o(-1732281618, i4, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
            }
            if ((i4 & 14) == 4) {
                z10 = z9;
            } else {
                z10 = r19;
            }
            z11 = z10 | ((57344 & i4) == 16384 ? z9 : false);
            objR = dVarF.R();
            if (z11) {
                obj = null;
                objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                dVarF.L(objR);
            } else {
                obj = null;
                objR = nceVar.a(new androidx.compose.ui.text.b(str, null, 2, null));
                dVarF.L(objR);
            }
            String text1112 = ((TransformedText) objR).getText().getText();
            TextFieldType textFieldType1112 = TextFieldType.Outlined;
            v1.Attached attached1112 = new v1.Attached(false, null, null, 7, null);
            if (function26 == null) {
                dVarF.y(1927058812);
                dVarF.u();
                do1VarE = null;
            } else {
                dVarF.y(1927058813);
                do1VarE = ko1.e(-1459717586, z9, new b(function26), dVarF, 54);
                dVarF.u();
            }
            int i31111111111117 = i4 >> 9;
            int i31111111111118 = i31 << 21;
            int i31111111111119 = ((i4 << 3) & 896) | 6 | (458752 & i31111111111117) | (3670016 & i31111111111117) | (i31111111111118 & 29360128) | (i31111111111118 & 234881024) | (i31111111111118 & 1879048192);
            int i311111111111110 = (i4 & 896) | ((i31 >> 9) & 14) | ((i4 >> 6) & 112) | (i31111111111117 & 7168) | ((i4 >> 3) & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128);
            dVar2 = dVarF;
            Function2<? super d, ? super Integer, Unit> function31111116 = function20;
            TextFieldImplKt.l(textFieldType1112, text1112, function2, attached1112, do1VarE, function31111116, function27, function30, function31, function31111115, function29, z4, z, z8, j26Var, rx8Var3, pscVar3, function32, dVar2, i31111111111119, i311111111111110);
            if (e.k()) {
                e.n();
            }
            function15 = function31111115;
            function16 = function29;
            rx8Var2 = rx8Var3;
            function17 = function32;
            function13 = function30;
            function14 = function31;
            function19 = function31111116;
            function12 = function27;
            z6 = z8;
            pscVar2 = pscVar3;
            function18 = function26;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            z6 = z3;
            function12 = function5;
            function13 = function6;
            function14 = function7;
            function15 = function8;
            function16 = function9;
            pscVar2 = pscVar;
            rx8Var2 = rx8Var;
            function17 = function10;
            function18 = function11;
            function19 = function4;
        }
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.su8
                public final Object invoke(Object obj2, Object obj3) {
                    return OutlinedTextFieldDefaults.f(this.a, str, function2, z, z2, nceVar, j26Var, z6, function18, function19, function12, function13, function14, function15, function16, pscVar2, rx8Var2, function17, i, i2, i3, (d) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public final psc g(d dVar, int i) {
        if (e.k()) {
            e.o(-471651810, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1215)");
        }
        psc pscVarK = k(kh7.a.a(dVar, 6), dVar, (i << 3) & 112);
        if (e.k()) {
            e.n();
        }
        return pscVarK;
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
            e.o(1767617725, i, i2, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1317)");
        }
        psc pscVarC = k(kh7.a.a(dVar, 6), dVar, (i5 >> 6) & 112).c(j43, jI2, jI3, jI4, jI5, jI6, jI7, jI8, jI9, jI10, selectionColors2, jI11, jI12, jI13, jI14, jI15, jI16, jI17, jI18, jI19, jI20, jI21, jI22, jI23, jI24, jI25, jI26, jI27, jI28, jI29, jI30, jI31, jI32, jI33, jI34, jI35, jI36, jI37, jI38, jI39, jI40, jI41, jI42);
        if (e.k()) {
            e.n();
        }
        return pscVarC;
    }

    public final rx8 i(float start, float top, float end, float bottom) {
        return nx8.h(start, top, end, bottom);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final psc k(ColorScheme colorScheme, d dVar, int i) throws NoWhenBranchMatchedException {
        psc pscVar;
        if (e.k()) {
            e.o(-292363577, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-defaultOutlinedTextFieldColors> (TextFieldDefaults.kt:1365)");
        }
        psc defaultOutlinedTextFieldColorsCached = colorScheme.getDefaultOutlinedTextFieldColorsCached();
        if (defaultOutlinedTextFieldColorsCached == null) {
            dVar.y(390452338);
            dVar.u();
            pscVar = null;
        } else {
            dVar.y(390452339);
            SelectionColors selectionColors = (SelectionColors) dVar.v(jzc.c());
            if (!Intrinsics.e(defaultOutlinedTextFieldColorsCached.getTextSelectionColors(), selectionColors)) {
                defaultOutlinedTextFieldColorsCached = defaultOutlinedTextFieldColorsCached.c(((-1025) & 1) != 0 ? defaultOutlinedTextFieldColorsCached.focusedTextColor : 0L, ((-1025) & 2) != 0 ? defaultOutlinedTextFieldColorsCached.unfocusedTextColor : 0L, ((-1025) & 4) != 0 ? defaultOutlinedTextFieldColorsCached.disabledTextColor : 0L, ((-1025) & 8) != 0 ? defaultOutlinedTextFieldColorsCached.errorTextColor : 0L, ((-1025) & 16) != 0 ? defaultOutlinedTextFieldColorsCached.focusedContainerColor : 0L, ((-1025) & 32) != 0 ? defaultOutlinedTextFieldColorsCached.unfocusedContainerColor : 0L, ((-1025) & 64) != 0 ? defaultOutlinedTextFieldColorsCached.disabledContainerColor : 0L, ((-1025) & 128) != 0 ? defaultOutlinedTextFieldColorsCached.errorContainerColor : 0L, ((-1025) & 256) != 0 ? defaultOutlinedTextFieldColorsCached.cursorColor : 0L, ((-1025) & 512) != 0 ? defaultOutlinedTextFieldColorsCached.errorCursorColor : 0L, ((-1025) & 1024) != 0 ? defaultOutlinedTextFieldColorsCached.textSelectionColors : selectionColors, ((-1025) & 2048) != 0 ? defaultOutlinedTextFieldColorsCached.focusedIndicatorColor : 0L, ((-1025) & 4096) != 0 ? defaultOutlinedTextFieldColorsCached.unfocusedIndicatorColor : 0L, ((-1025) & 8192) != 0 ? defaultOutlinedTextFieldColorsCached.disabledIndicatorColor : 0L, ((-1025) & 16384) != 0 ? defaultOutlinedTextFieldColorsCached.errorIndicatorColor : 0L, ((-1025) & 32768) != 0 ? defaultOutlinedTextFieldColorsCached.focusedLeadingIconColor : 0L, ((-1025) & 65536) != 0 ? defaultOutlinedTextFieldColorsCached.unfocusedLeadingIconColor : 0L, ((-1025) & 131072) != 0 ? defaultOutlinedTextFieldColorsCached.disabledLeadingIconColor : 0L, ((-1025) & 262144) != 0 ? defaultOutlinedTextFieldColorsCached.errorLeadingIconColor : 0L, ((-1025) & 524288) != 0 ? defaultOutlinedTextFieldColorsCached.focusedTrailingIconColor : 0L, ((-1025) & 1048576) != 0 ? defaultOutlinedTextFieldColorsCached.unfocusedTrailingIconColor : 0L, ((-1025) & 2097152) != 0 ? defaultOutlinedTextFieldColorsCached.disabledTrailingIconColor : 0L, ((-1025) & 4194304) != 0 ? defaultOutlinedTextFieldColorsCached.errorTrailingIconColor : 0L, ((-1025) & 8388608) != 0 ? defaultOutlinedTextFieldColorsCached.focusedLabelColor : 0L, ((-1025) & 16777216) != 0 ? defaultOutlinedTextFieldColorsCached.unfocusedLabelColor : 0L, ((-1025) & 33554432) != 0 ? defaultOutlinedTextFieldColorsCached.disabledLabelColor : 0L, ((-1025) & 67108864) != 0 ? defaultOutlinedTextFieldColorsCached.errorLabelColor : 0L, ((-1025) & 134217728) != 0 ? defaultOutlinedTextFieldColorsCached.focusedPlaceholderColor : 0L, ((-1025) & 268435456) != 0 ? defaultOutlinedTextFieldColorsCached.unfocusedPlaceholderColor : 0L, ((-1025) & 536870912) != 0 ? defaultOutlinedTextFieldColorsCached.disabledPlaceholderColor : 0L, ((-1025) & 1073741824) != 0 ? defaultOutlinedTextFieldColorsCached.errorPlaceholderColor : 0L, ((-1025) & t04.INVALID_ID) != 0 ? defaultOutlinedTextFieldColorsCached.focusedSupportingTextColor : 0L, (2047 & 1) != 0 ? defaultOutlinedTextFieldColorsCached.unfocusedSupportingTextColor : 0L, (2047 & 2) != 0 ? defaultOutlinedTextFieldColorsCached.disabledSupportingTextColor : 0L, (2047 & 4) != 0 ? defaultOutlinedTextFieldColorsCached.errorSupportingTextColor : 0L, (2047 & 8) != 0 ? defaultOutlinedTextFieldColorsCached.focusedPrefixColor : 0L, (2047 & 16) != 0 ? defaultOutlinedTextFieldColorsCached.unfocusedPrefixColor : 0L, (2047 & 32) != 0 ? defaultOutlinedTextFieldColorsCached.disabledPrefixColor : 0L, (2047 & 64) != 0 ? defaultOutlinedTextFieldColorsCached.errorPrefixColor : 0L, (2047 & 128) != 0 ? defaultOutlinedTextFieldColorsCached.focusedSuffixColor : 0L, (2047 & 256) != 0 ? defaultOutlinedTextFieldColorsCached.unfocusedSuffixColor : 0L, (2047 & 512) != 0 ? defaultOutlinedTextFieldColorsCached.disabledSuffixColor : 0L, (2047 & 1024) != 0 ? defaultOutlinedTextFieldColorsCached.errorSuffixColor : 0L);
                colorScheme.t0(defaultOutlinedTextFieldColorsCached);
            }
            dVar.u();
            pscVar = defaultOutlinedTextFieldColorsCached;
        }
        if (pscVar == null) {
            dVar.y(-1788321191);
            yu8 yu8Var = yu8.a;
            long j = bj1.j(colorScheme, yu8Var.p());
            long j2 = bj1.j(colorScheme, yu8Var.v());
            long jP = ei1.p(bj1.j(colorScheme, yu8Var.c()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            long j3 = bj1.j(colorScheme, yu8Var.j());
            ei1.Companion companion = ei1.INSTANCE;
            psc pscVar2 = new psc(j, j2, jP, j3, companion.h(), companion.h(), companion.h(), companion.h(), bj1.j(colorScheme, yu8Var.a()), bj1.j(colorScheme, yu8Var.i()), (SelectionColors) dVar.v(jzc.c()), bj1.j(colorScheme, yu8Var.s()), bj1.j(colorScheme, yu8Var.B()), ei1.p(bj1.j(colorScheme, yu8Var.f()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), bj1.j(colorScheme, yu8Var.m()), bj1.j(colorScheme, yu8Var.r()), bj1.j(colorScheme, yu8Var.A()), ei1.p(bj1.j(colorScheme, yu8Var.e()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), bj1.j(colorScheme, yu8Var.l()), bj1.j(colorScheme, yu8Var.u()), bj1.j(colorScheme, yu8Var.D()), ei1.p(bj1.j(colorScheme, yu8Var.h()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), bj1.j(colorScheme, yu8Var.o()), bj1.j(colorScheme, yu8Var.q()), bj1.j(colorScheme, yu8Var.z()), ei1.p(bj1.j(colorScheme, yu8Var.d()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), bj1.j(colorScheme, yu8Var.k()), bj1.j(colorScheme, yu8Var.w()), bj1.j(colorScheme, yu8Var.w()), ei1.p(bj1.j(colorScheme, yu8Var.c()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), bj1.j(colorScheme, yu8Var.w()), bj1.j(colorScheme, yu8Var.t()), bj1.j(colorScheme, yu8Var.C()), ei1.p(bj1.j(colorScheme, yu8Var.g()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), bj1.j(colorScheme, yu8Var.n()), bj1.j(colorScheme, yu8Var.x()), bj1.j(colorScheme, yu8Var.x()), ei1.p(bj1.j(colorScheme, yu8Var.x()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), bj1.j(colorScheme, yu8Var.x()), bj1.j(colorScheme, yu8Var.y()), bj1.j(colorScheme, yu8Var.y()), ei1.p(bj1.j(colorScheme, yu8Var.y()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), bj1.j(colorScheme, yu8Var.y()), null);
            colorScheme.t0(pscVar2);
            dVar.u();
            pscVar = pscVar2;
        } else {
            dVar.y(-1788515437);
            dVar.u();
        }
        if (e.k()) {
            e.n();
        }
        return pscVar;
    }

    public final float l() {
        return FocusedBorderThickness;
    }

    public final float m() {
        return MinHeight;
    }

    public final float n() {
        return MinWidth;
    }

    public final xkb o(d dVar, int i) {
        if (e.k()) {
            e.o(-1066756961, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-shape> (TextFieldDefaults.kt:887)");
        }
        xkb xkbVarI = ulb.i(yu8.a.b(), dVar, 6);
        if (e.k()) {
            e.n();
        }
        return xkbVarI;
    }

    public final float p() {
        return UnfocusedBorderThickness;
    }
}
