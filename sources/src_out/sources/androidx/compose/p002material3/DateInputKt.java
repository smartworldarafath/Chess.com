package androidx.compose.p002material3;

import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p001foundation.text.KeyboardOptions;
import androidx.compose.p002material3.DateInputKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.focus.f;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.text.x;
import com.google.inputmethod.CalendarDate;
import com.google.inputmethod.DateInputFormat;
import com.google.inputmethod.LocaleList;
import com.google.inputmethod.TextFieldValue;
import com.google.inputmethod.ab9;
import com.google.inputmethod.afb;
import com.google.inputmethod.bo2;
import com.google.inputmethod.d21;
import com.google.inputmethod.ddb;
import com.google.inputmethod.dfa;
import com.google.inputmethod.ff3;
import com.google.inputmethod.k0b;
import com.google.inputmethod.ko1;
import com.google.inputmethod.nfb;
import com.google.inputmethod.nx8;
import com.google.inputmethod.o58;
import com.google.inputmethod.qxc;
import com.google.inputmethod.rbc;
import com.google.inputmethod.rx8;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.vbc;
import com.google.inputmethod.vn2;
import com.google.inputmethod.vn3;
import com.google.inputmethod.wz9;
import com.google.inputmethod.zk4;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.h;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aa\u0010\u0011\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0095\u0001\u0010\"\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00162\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\n\u0010!\u001a\u00060\u001fj\u0002` 2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0004\b\"\u0010#\"\u001a\u0010)\u001a\u00020$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u00060²\u0006\u000e\u0010/\u001a\u00020.8\n@\nX\u008a\u008e\u0002"}, d2 = {"", "selectedDateMillis", "Lkotlin/Function1;", "", "onDateSelectionChange", "Lcom/google/android/d21;", "calendarModel", "Lkotlin/ranges/IntRange;", "yearRange", "Lcom/google/android/bo2;", "dateFormatter", "Lcom/google/android/ddb;", "selectableDates", "Lcom/google/android/vn2;", "colors", "Landroidx/compose/ui/focus/f;", "focusRequester", "g", "(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lcom/google/android/d21;Lkotlin/ranges/IntRange;Lcom/google/android/bo2;Lcom/google/android/ddb;Lcom/google/android/vn2;Landroidx/compose/ui/focus/f;Landroidx/compose/runtime/d;I)V", "Landroidx/compose/ui/b;", "modifier", "initialDateMillis", "Lkotlin/Function0;", "label", "placeholder", "Landroidx/compose/material3/m0;", "inputIdentifier", "Landroidx/compose/material3/g;", "dateInputValidator", "Lcom/google/android/on2;", "dateInputFormat", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "i", "(Landroidx/compose/ui/b;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lcom/google/android/d21;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILandroidx/compose/material3/g;Lcom/google/android/on2;Ljava/util/Locale;Lcom/google/android/vn2;Landroidx/compose/ui/focus/f;Landroidx/compose/runtime/d;II)V", "Lcom/google/android/rx8;", "a", "Lcom/google/android/rx8;", "getInputTextFieldPadding", "()Lcom/google/android/rx8;", "InputTextFieldPadding", "Lcom/google/android/ff3;", "b", "F", "InputTextNonErroneousBottomPadding", "Lcom/google/android/cwc;", "text", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DateInputKt {
    private static final rx8 a;
    private static final float b = ff3.i(16);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements Function2<d, Integer, Unit> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(String str, String str2, nfb nfbVar) {
            SemanticsPropertiesKt.b0(nfbVar, str + ", " + str2);
            return Unit.a;
        }

        public final void b(d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(-752164549, i, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:93)");
            }
            String str = this.a;
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            boolean zX = dVar.x(str) | dVar.x(this.b);
            final String str2 = this.a;
            final String str3 = this.b;
            Object objR = dVar.R();
            if (zX || objR == d.INSTANCE.a()) {
                objR = new Function1() { // from class: androidx.compose.material3.e
                    public final Object invoke(Object obj) {
                        return DateInputKt.a.c(str2, str3, (nfb) obj);
                    }
                };
                dVar.L(objR);
            }
            qxc.j(str, afb.d(companion, false, (Function1) objR, 1, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, dVar, 0, 0, 262140);
            if (e.k()) {
                e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements Function2<d, Integer, Unit> {
        final /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(nfb nfbVar) {
            return Unit.a;
        }

        public final void b(d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(-1179434278, i, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:98)");
            }
            String str = this.a;
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            Object objR = dVar.R();
            if (objR == d.INSTANCE.a()) {
                objR = new Function1() { // from class: androidx.compose.material3.f
                    public final Object invoke(Object obj) {
                        return DateInputKt.b.c((nfb) obj);
                    }
                };
                dVar.L(objR);
            }
            qxc.j(str, afb.a(companion, (Function1) objR), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, dVar, 0, 0, 262140);
            if (e.k()) {
                e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c implements Function2<d, Integer, Unit> {
        final /* synthetic */ o58<String> a;

        c(o58<String> o58Var) {
            this.a = o58Var;
        }

        public final void a(d dVar, int i) {
            d dVar2 = dVar;
            if (!dVar2.g((i & 3) != 2, i & 1)) {
                dVar2.q();
                return;
            }
            if (e.k()) {
                e.o(-357881838, i, -1, "androidx.compose.material3.DateInputTextField.<anonymous> (DateInput.kt:215)");
            }
            if (h.C0(this.a.getValue())) {
                dVar2.y(-1548950640);
            } else {
                dVar2.y(-327061465);
                qxc.j(this.a.getValue(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, dVar, 0, 0, 262142);
                dVar2 = dVar;
            }
            dVar2.u();
            if (e.k()) {
                e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    static {
        float f = 24;
        a = nx8.i(ff3.i(f), ff3.i(10), ff3.i(f), 0.0f, 8, null);
    }

    public static final void g(final Long l, final Function1<? super Long, Unit> function1, final d21 d21Var, final IntRange intRange, final bo2 bo2Var, final ddb ddbVar, final vn2 vn2Var, final f fVar, d dVar, final int i) {
        int i2;
        IntRange intRange2;
        ddb ddbVar2;
        d dVar2;
        int i3;
        DateInputFormat dateInputFormat;
        int i4;
        d dVarF = dVar.F(-432341251);
        if ((i & 6) == 0) {
            i2 = (dVarF.x(l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.T(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dVarF.T(d21Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            intRange2 = intRange;
            i2 |= dVarF.T(intRange2) ? 2048 : 1024;
        } else {
            intRange2 = intRange;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? dVarF.x(bo2Var) : dVarF.T(bo2Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            ddbVar2 = ddbVar;
            i2 |= dVarF.x(ddbVar2) ? 131072 : 65536;
        } else {
            ddbVar2 = ddbVar;
        }
        if ((1572864 & i) == 0) {
            i2 |= dVarF.x(vn2Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= dVarF.x(fVar) ? 8388608 : 4194304;
        }
        if (dVarF.g((4793491 & i2) != 4793490, i2 & 1)) {
            if (e.k()) {
                e.o(-432341251, i2, -1, "androidx.compose.material3.DateInputContent (DateInput.kt:67)");
            }
            boolean zX = dVarF.x(d21Var.getLocale());
            Object objR = dVarF.R();
            if (zX || objR == d.INSTANCE.a()) {
                objR = d21Var.c(d21Var.getLocale());
                dVarF.L(objR);
            }
            DateInputFormat dateInputFormat2 = (DateInputFormat) objR;
            rbc.Companion companion = rbc.INSTANCE;
            String strB = vbc.b(rbc.a(wz9.h), dVarF, 0);
            String strB2 = vbc.b(rbc.a(wz9.j), dVarF, 0);
            String strB3 = vbc.b(rbc.a(wz9.i), dVarF, 0);
            boolean zX2 = dVarF.x(dateInputFormat2) | ((i2 & 57344) == 16384 || ((i2 & 32768) != 0 && dVarF.x(bo2Var)));
            Object objR2 = dVarF.R();
            if (zX2 || objR2 == d.INSTANCE.a()) {
                i3 = i2;
                dateInputFormat = dateInputFormat2;
                i4 = 0;
                g gVar = new g(intRange2, ddbVar2, dateInputFormat, bo2Var, strB, strB2, strB3, "");
                dVarF.L(gVar);
                objR2 = gVar;
            } else {
                i3 = i2;
                dateInputFormat = dateInputFormat2;
                i4 = 0;
            }
            g gVar2 = (g) objR2;
            String upperCase = dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            String strB4 = vbc.b(rbc.a(wz9.k), dVarF, i4);
            androidx.compose.ui.b bVarL = nx8.l(SizeKt.h(androidx.compose.ui.b.INSTANCE, 0.0f, 1, null), a);
            int iB = m0.INSTANCE.b();
            gVar2.a(l);
            int i5 = i3 << 3;
            dVar2 = dVarF;
            DateInputFormat dateInputFormat3 = dateInputFormat;
            i(bVarL, l, function1, d21Var, ko1.e(-752164549, true, new a(strB4, upperCase), dVarF, 54), ko1.e(-1179434278, true, new b(upperCase), dVarF, 54), iB, gVar2, dateInputFormat3, d21Var.getLocale(), vn2Var, fVar, dVar2, (i5 & 7168) | (i5 & 112) | 1794054 | (i5 & 896), (i3 >> 18) & 126);
            if (e.k()) {
                e.n();
            }
        } else {
            dVar2 = dVarF;
            dVar2.q();
        }
        s6b s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.pn2
                public final Object invoke(Object obj, Object obj2) {
                    return DateInputKt.h(l, function1, d21Var, intRange, bo2Var, ddbVar, vn2Var, fVar, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Long l, Function1 function1, d21 d21Var, IntRange intRange, bo2 bo2Var, ddb ddbVar, vn2 vn2Var, f fVar, int i, d dVar, int i2) {
        g(l, function1, d21Var, intRange, bo2Var, ddbVar, vn2Var, fVar, dVar, saa.a(i | 1));
        return Unit.a;
    }

    public static final void i(final androidx.compose.ui.b bVar, Long l, final Function1<? super Long, Unit> function1, final d21 d21Var, final Function2<? super d, ? super Integer, Unit> function2, final Function2<? super d, ? super Integer, Unit> function3, final int i, final g gVar, final DateInputFormat dateInputFormat, final Locale locale, final vn2 vn2Var, final f fVar, d dVar, final int i2, final int i3) {
        int i4;
        int i5;
        Long l2;
        d dVar2;
        o58 o58Var;
        float fI;
        Object obj;
        final DateInputFormat dateInputFormat2;
        Object c0174DateInputKt$DateInputTextField$5$1;
        final d21 d21Var2 = d21Var;
        final Locale locale2 = locale;
        d dVarF = dVar.F(1456309913);
        if ((i2 & 6) == 0) {
            i4 = (dVarF.x(bVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= dVarF.x(l) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= dVarF.T(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= dVarF.T(d21Var2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= dVarF.T(function2) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= dVarF.T(function3) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= dVarF.C(i) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= dVarF.x(gVar) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= dVarF.x(dateInputFormat) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= dVarF.T(locale2) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (dVarF.x(vn2Var) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= dVarF.x(fVar) ? 32 : 16;
        }
        int i6 = i5;
        if (dVarF.g(((i4 & 306783379) == 306783378 && (i6 & 19) == 18) ? false : true, i4 & 1)) {
            if (e.k()) {
                e.o(1456309913, i4, i6, "androidx.compose.material3.DateInputTextField (DateInput.kt:128)");
            }
            Object[] objArr = new Object[0];
            k0b<TextFieldValue, Object> k0bVarA = TextFieldValue.INSTANCE.a();
            Object objR = dVarF.R();
            d.Companion companion = d.INSTANCE;
            int i7 = i4;
            if (objR == companion.a()) {
                objR = new Function0() { // from class: com.google.android.qn2
                    public final Object invoke() {
                        return DateInputKt.m();
                    }
                };
                dVarF.L(objR);
            }
            final o58 o58VarI = dfa.i(objArr, k0bVarA, (Function0) objR, dVarF, 384);
            Object[] objArr2 = {n(o58VarI)};
            int i8 = i7 & 29360128;
            int i9 = i7 & 234881024;
            int i10 = i7 & 3670016;
            boolean zX = dVarF.x(o58VarI) | (i8 == 8388608) | dVarF.T(d21Var2) | (i9 == 67108864) | dVarF.T(locale2) | (i10 == 1048576);
            Object objR2 = dVarF.R();
            if (zX || objR2 == companion.a()) {
                objR2 = new Function0() { // from class: com.google.android.rn2
                    public final Object invoke() {
                        return DateInputKt.p(gVar, d21Var2, dateInputFormat, locale2, i, o58VarI);
                    }
                };
                o58Var = o58VarI;
                dVarF.L(objR2);
            } else {
                o58Var = o58VarI;
            }
            final o58 o58Var2 = (o58) dfa.l(objArr2, (Function0) objR2, dVarF, 0);
            if (h.C0((CharSequence) o58Var2.getValue())) {
                fI = b;
            } else {
                rx8 rx8VarU = TextFieldDefaults.u(TextFieldDefaults.a, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                fI = ff3.i(b - ff3.i(rx8VarU.getBottom() + rx8VarU.getTop()));
            }
            float f = fI;
            TextFieldValue textFieldValueN = n(o58Var);
            boolean zX2 = (i10 == 1048576) | (i9 == 67108864) | dVarF.x(o58Var) | dVarF.x(o58Var2) | ((i7 & 896) == 256) | dVarF.T(d21Var2) | dVarF.T(locale2) | (i8 == 8388608);
            Object objR3 = dVarF.R();
            if (zX2 || objR3 == companion.a()) {
                dateInputFormat2 = dateInputFormat;
                final o58 o58Var3 = o58Var;
                obj = new Function1() { // from class: com.google.android.sn2
                    public final Object invoke(Object obj2) {
                        return DateInputKt.j(dateInputFormat2, o58Var2, function1, d21Var2, locale2, gVar, i, o58Var3, (TextFieldValue) obj2);
                    }
                };
                d21Var2 = d21Var2;
                locale2 = locale2;
                o58Var = o58Var3;
                dVarF.L(obj);
            } else {
                obj = objR3;
                dateInputFormat2 = dateInputFormat;
            }
            Function1 function4 = (Function1) obj;
            androidx.compose.ui.b bVarR = nx8.r(bVar, 0.0f, 0.0f, 0.0f, f, 7, null);
            boolean zX3 = dVarF.x(o58Var2);
            Object objR4 = dVarF.R();
            if (zX3 || objR4 == companion.a()) {
                objR4 = new Function1() { // from class: com.google.android.tn2
                    public final Object invoke(Object obj2) {
                        return DateInputKt.k(o58Var2, (nfb) obj2);
                    }
                };
                dVarF.L(objR4);
            }
            d1.f(textFieldValueN, function4, afb.d(bVarR, false, (Function1) objR4, 1, null).then(fVar != null ? zk4.a(androidx.compose.ui.b.INSTANCE, fVar) : androidx.compose.ui.b.INSTANCE), false, false, null, function2, function3, null, null, null, null, ko1.e(-357881838, true, new c(o58Var2), dVarF, 54), !h.C0((CharSequence) o58Var2.getValue()), new b0(dateInputFormat2), new KeyboardOptions(0, Boolean.FALSE, androidx.compose.ui.text.input.d.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.b(), (ab9) null, (Boolean) null, (LocaleList) null, 113, (DefaultConstructorMarker) null), null, true, 0, 0, null, null, vn2Var.getDateTextFieldColors(), dVarF, (i7 << 6) & 33030144, 12779904, 0, 4001592);
            dVar2 = dVarF;
            Unit unit = Unit.a;
            boolean z = (i6 & 112) == 32;
            Object objR5 = dVar2.R();
            if (z || objR5 == companion.a()) {
                objR5 = new C0173DateInputKt$DateInputTextField$4$1(fVar, null);
                dVar2.L(objR5);
            }
            vn3.g(unit, (Function2) objR5, dVar2, 6);
            boolean zT = ((i7 & 112) == 32) | dVar2.T(d21Var2) | (i9 == 67108864) | dVar2.T(locale2) | dVar2.x(o58Var);
            Object objR6 = dVar2.R();
            if (zT || objR6 == companion.a()) {
                l2 = l;
                c0174DateInputKt$DateInputTextField$5$1 = new C0174DateInputKt$DateInputTextField$5$1(l2, d21Var2, dateInputFormat2, locale, o58Var, null);
                dVar2.L(c0174DateInputKt$DateInputTextField$5$1);
            } else {
                c0174DateInputKt$DateInputTextField$5$1 = objR6;
                l2 = l;
            }
            vn3.g(l2, (Function2) c0174DateInputKt$DateInputTextField$5$1, dVar2, (i7 >> 3) & 14);
            if (e.k()) {
                e.n();
            }
        } else {
            l2 = l;
            dVar2 = dVarF;
            dVar2.q();
        }
        s6b s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            final Long l3 = l2;
            s6bVarH.a(new Function2() { // from class: com.google.android.un2
                public final Object invoke(Object obj2, Object obj3) {
                    return DateInputKt.l(bVar, l3, function1, d21Var, function2, function3, i, gVar, dateInputFormat, locale, vn2Var, fVar, i2, i3, (d) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(DateInputFormat dateInputFormat, o58 o58Var, Function1 function1, d21 d21Var, Locale locale, g gVar, int i, o58 o58Var2, TextFieldValue textFieldValue) {
        if (textFieldValue.m().length() <= dateInputFormat.getPatternWithoutDelimiters().length()) {
            String strM = textFieldValue.m();
            for (int i2 = 0; i2 < strM.length(); i2++) {
                if (Character.isDigit(strM.charAt(i2))) {
                }
            }
            o(o58Var2, textFieldValue);
            String string = h.H1(textFieldValue.m()).toString();
            Long lValueOf = null;
            if (string.length() != 0 && string.length() >= dateInputFormat.getPatternWithoutDelimiters().length()) {
                CalendarDate calendarDateL = d21Var.l(string, dateInputFormat.getPatternWithoutDelimiters(), locale);
                o58Var.setValue(gVar.b(calendarDateL, i, locale));
                if (((CharSequence) o58Var.getValue()).length() == 0 && calendarDateL != null) {
                    lValueOf = Long.valueOf(calendarDateL.getUtcTimeMillis());
                }
                function1.invoke(lValueOf);
            } else {
                o58Var.setValue("");
                function1.invoke((Object) null);
            }
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(o58 o58Var, nfb nfbVar) {
        if (!h.C0((CharSequence) o58Var.getValue())) {
            SemanticsPropertiesKt.l(nfbVar, (String) o58Var.getValue());
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(androidx.compose.ui.b bVar, Long l, Function1 function1, d21 d21Var, Function2 function2, Function2 function3, int i, g gVar, DateInputFormat dateInputFormat, Locale locale, vn2 vn2Var, f fVar, int i2, int i3, d dVar, int i4) {
        i(bVar, l, function1, d21Var, function2, function3, i, gVar, dateInputFormat, locale, vn2Var, fVar, dVar, saa.a(i2 | 1), saa.a(i3));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o58 m() {
        return s0.e(new TextFieldValue((String) null, 0L, (x) null, 7, (DefaultConstructorMarker) null), null, 2, null);
    }

    private static final TextFieldValue n(o58<TextFieldValue> o58Var) {
        return o58Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(o58<TextFieldValue> o58Var, TextFieldValue textFieldValue) {
        o58Var.setValue(textFieldValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o58 p(g gVar, d21 d21Var, DateInputFormat dateInputFormat, Locale locale, int i, o58 o58Var) {
        return s0.e(n(o58Var).m().length() > 0 ? gVar.b(d21Var.l(n(o58Var).m(), dateInputFormat.getPatternWithoutDelimiters(), locale), i, locale) : "", null, 2, null);
    }
}
