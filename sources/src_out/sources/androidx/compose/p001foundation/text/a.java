package androidx.compose.p001foundation.text;

import androidx.compose.p001foundation.text.a;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.b;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.x;
import com.google.android.ps4;
import com.google.inputmethod.SolidColor;
import com.google.inputmethod.TextFieldValue;
import com.google.inputmethod.TextLayoutResult;
import com.google.inputmethod.ei1;
import com.google.inputmethod.ff3;
import com.google.inputmethod.hf3;
import com.google.inputmethod.nce;
import com.google.inputmethod.o58;
import com.google.inputmethod.qo1;
import com.google.inputmethod.qu0;
import com.google.inputmethod.r48;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.tsc;
import com.google.inputmethod.vn3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a×\u0001\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\u001a\b\u0002\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001c\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a×\u0001\u0010!\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020 2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\u001a\b\u0002\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001c\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b!\u0010\"\"\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%\"\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u00061²\u0006\f\u0010+\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010-\u001a\u00020,8\nX\u008a\u0084\u0002²\u0006\f\u0010.\u001a\u00020,8\nX\u008a\u0084\u0002²\u0006\u000e\u0010/\u001a\u00020 8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00100\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/b;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/y;", "textStyle", "Landroidx/compose/foundation/text/n;", "keyboardOptions", "Landroidx/compose/foundation/text/m;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Lcom/google/android/nce;", "visualTransformation", "Lcom/google/android/vxc;", "onTextLayout", "Lcom/google/android/r48;", "interactionSource", "Lcom/google/android/qu0;", "cursorBrush", "Lkotlin/Function0;", "decorationBox", "i", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/b;ZZLandroidx/compose/ui/text/y;Landroidx/compose/foundation/text/n;Landroidx/compose/foundation/text/m;ZIILcom/google/android/nce;Lkotlin/jvm/functions/Function1;Lcom/google/android/r48;Lcom/google/android/qu0;Lcom/google/android/ps4;Landroidx/compose/runtime/d;III)V", "Lcom/google/android/cwc;", "h", "(Lcom/google/android/cwc;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/b;ZZLandroidx/compose/ui/text/y;Landroidx/compose/foundation/text/n;Landroidx/compose/foundation/text/m;ZIILcom/google/android/nce;Lkotlin/jvm/functions/Function1;Lcom/google/android/r48;Lcom/google/android/qu0;Lcom/google/android/ps4;Landroidx/compose/runtime/d;III)V", "Lcom/google/android/tsc;", "a", "Lcom/google/android/tsc;", "DefaultTextFieldDecorator", "Lcom/google/android/jf3;", "b", "J", "MinTouchTargetSizeForHandles", "cursorHandleVisible", "", "startHandleState", "endHandleState", "textFieldValueState", "lastTextValue", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {
    private static final tsc a = C0026a.a;
    private static final long b;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "it", "<anonymous>", "(Lkotlin/jvm/functions/Function0;)V"}, k = 3, mv = {2, 1, 0})
    static final class C0026a implements tsc {
        public static final C0026a a = new C0026a();

        C0026a() {
        }
    }

    static {
        float f = 40;
        b = hf3.a(ff3.i(f), ff3.i(f));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0127  */
    /* JADX WARN: Code duplicated, block: B:103:0x012d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0136  */
    /* JADX WARN: Code duplicated, block: B:106:0x013a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0144  */
    /* JADX WARN: Code duplicated, block: B:109:0x0147  */
    /* JADX WARN: Code duplicated, block: B:111:0x014c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0156  */
    /* JADX WARN: Code duplicated, block: B:116:0x015d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0161  */
    /* JADX WARN: Code duplicated, block: B:120:0x016b  */
    /* JADX WARN: Code duplicated, block: B:121:0x016e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0173  */
    /* JADX WARN: Code duplicated, block: B:126:0x017e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0181  */
    /* JADX WARN: Code duplicated, block: B:129:0x0187  */
    /* JADX WARN: Code duplicated, block: B:131:0x018f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0192  */
    /* JADX WARN: Code duplicated, block: B:134:0x0199  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:144:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:149:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:153:0x01da  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:159:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:161:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:163:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:167:0x020b  */
    /* JADX WARN: Code duplicated, block: B:171:0x0218  */
    /* JADX WARN: Code duplicated, block: B:174:0x0222  */
    /* JADX WARN: Code duplicated, block: B:176:0x0229  */
    /* JADX WARN: Code duplicated, block: B:183:0x0254 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x0256  */
    /* JADX WARN: Code duplicated, block: B:186:0x025b  */
    /* JADX WARN: Code duplicated, block: B:188:0x025f  */
    /* JADX WARN: Code duplicated, block: B:190:0x0263  */
    /* JADX WARN: Code duplicated, block: B:192:0x026c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0275  */
    /* JADX WARN: Code duplicated, block: B:195:0x027c  */
    /* JADX WARN: Code duplicated, block: B:197:0x027f  */
    /* JADX WARN: Code duplicated, block: B:198:0x0282  */
    /* JADX WARN: Code duplicated, block: B:201:0x0288 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:202:0x028a  */
    /* JADX WARN: Code duplicated, block: B:203:0x028d  */
    /* JADX WARN: Code duplicated, block: B:205:0x0295  */
    /* JADX WARN: Code duplicated, block: B:207:0x0299  */
    /* JADX WARN: Code duplicated, block: B:208:0x029c  */
    /* JADX WARN: Code duplicated, block: B:210:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:211:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:214:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:216:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:218:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:220:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:221:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:224:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:225:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:227:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:229:0x030b  */
    /* JADX WARN: Code duplicated, block: B:232:0x032b  */
    /* JADX WARN: Code duplicated, block: B:234:0x033a  */
    /* JADX WARN: Code duplicated, block: B:237:0x0346  */
    /* JADX WARN: Code duplicated, block: B:238:0x0349  */
    /* JADX WARN: Code duplicated, block: B:241:0x034f  */
    /* JADX WARN: Code duplicated, block: B:242:0x0352  */
    /* JADX WARN: Code duplicated, block: B:245:0x035d  */
    /* JADX WARN: Code duplicated, block: B:246:0x0360  */
    /* JADX WARN: Code duplicated, block: B:249:0x036a  */
    /* JADX WARN: Code duplicated, block: B:252:0x0374  */
    /* JADX WARN: Code duplicated, block: B:254:0x037c  */
    /* JADX WARN: Code duplicated, block: B:257:0x03df  */
    /* JADX WARN: Code duplicated, block: B:259:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:262:0x0417  */
    /* JADX WARN: Code duplicated, block: B:264:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:87:0x0104  */
    /* JADX WARN: Code duplicated, block: B:88:0x0107  */
    /* JADX WARN: Code duplicated, block: B:92:0x0111  */
    /* JADX WARN: Code duplicated, block: B:94:0x0115  */
    /* JADX WARN: Code duplicated, block: B:97:0x0120 A[ADDED_TO_REGION] */
    public static final void h(final TextFieldValue textFieldValue, final Function1<? super TextFieldValue, Unit> function1, b bVar, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, m mVar, boolean z3, int i, int i2, nce nceVar, Function1<? super TextLayoutResult, Unit> function2, r48 r48Var, qu0 qu0Var, ps4<? super Function2<? super d, ? super Integer, Unit>, ? super d, ? super Integer, Unit> ps4Var, d dVar, final int i3, final int i4, final int i5) {
        int i6;
        b bVar2;
        int i7;
        boolean z4;
        int i8;
        int i9;
        boolean z5;
        int i10;
        int i11;
        TextStyle textStyleA;
        int i12;
        int i13;
        KeyboardOptions keyboardOptionsA;
        int i14;
        int i15;
        m mVar2;
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
        int i33;
        int i34;
        boolean z6;
        d dVar2;
        final int i35;
        final nce nceVar2;
        final ps4<? super Function2<? super d, ? super Integer, Unit>, ? super d, ? super Integer, Unit> ps4Var2;
        final boolean z7;
        final m mVar3;
        final boolean z8;
        final TextStyle textStyle2;
        final KeyboardOptions keyboardOptions2;
        final b bVar3;
        final boolean z9;
        final int i36;
        final Function1<? super TextLayoutResult, Unit> function3;
        final r48 r48Var2;
        final qu0 qu0Var2;
        s6b s6bVarH;
        m mVarA;
        boolean z10;
        int i37;
        int i38;
        nce nceVarC;
        m mVar4;
        Function1<? super TextLayoutResult, Unit> function4;
        r48 r48Var3;
        qu0 solidColor;
        boolean z11;
        ps4<? super Function2<? super d, ? super Integer, Unit>, ? super d, ? super Integer, Unit> ps4VarE;
        boolean z12;
        Function1<? super TextLayoutResult, Unit> function5;
        Object objR;
        int i39;
        int i40;
        boolean z13;
        boolean z14;
        Object objR2;
        d dVarF = dVar.F(-971111025);
        if ((i3 & 6) == 0) {
            i6 = (dVarF.x(textFieldValue) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= dVarF.T(function1) ? 32 : 16;
        }
        int i41 = i5 & 4;
        if (i41 == 0) {
            if ((i3 & 384) == 0) {
                bVar2 = bVar;
                i6 |= dVarF.x(bVar2) ? 256 : 128;
            }
            i7 = i5 & 8;
            if (i7 != 0) {
                if ((i3 & 3072) == 0) {
                    z4 = z;
                    if (dVarF.A(z4)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i6 |= i8;
                }
                i9 = i5 & 16;
                if (i9 != 0) {
                    if ((i3 & 24576) == 0) {
                        z5 = z2;
                        if (dVarF.A(z5)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i6 |= i10;
                    }
                    i11 = i5 & 32;
                    if (i11 != 0) {
                        i6 |= 196608;
                        textStyleA = textStyle;
                    } else {
                        textStyleA = textStyle;
                        if ((i3 & 196608) == 0) {
                            if (dVarF.x(textStyleA)) {
                                i12 = 131072;
                            } else {
                                i12 = 65536;
                            }
                            i6 |= i12;
                        }
                    }
                    i13 = i5 & 64;
                    if (i13 != 0) {
                        i6 |= 1572864;
                        keyboardOptionsA = keyboardOptions;
                    } else {
                        keyboardOptionsA = keyboardOptions;
                        if ((i3 & 1572864) == 0) {
                            if (dVarF.x(keyboardOptionsA)) {
                                i14 = 1048576;
                            } else {
                                i14 = 524288;
                            }
                            i6 |= i14;
                        }
                    }
                    i15 = i5 & 128;
                    if (i15 != 0) {
                        i6 |= 12582912;
                        mVar2 = mVar;
                    } else {
                        mVar2 = mVar;
                        if ((i3 & 12582912) == 0) {
                            if (dVarF.x(mVar2)) {
                                i16 = 8388608;
                            } else {
                                i16 = 4194304;
                            }
                            i6 |= i16;
                        }
                    }
                    i17 = i5 & 256;
                    if (i17 != 0) {
                        i6 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        if (dVarF.A(z3)) {
                            i18 = 67108864;
                        } else {
                            i18 = 33554432;
                        }
                        i6 |= i18;
                    }
                    if ((i3 & 805306368) != 0) {
                        i6 |= ((i5 & 512) == 0 || !dVarF.C(i)) ? 268435456 : 536870912;
                    }
                    i19 = i5 & 1024;
                    if (i19 != 0) {
                        i20 = i4 | 6;
                    } else if ((i4 & 6) == 0) {
                        if (dVarF.C(i2)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i4 | i21;
                    } else {
                        i20 = i4;
                    }
                    i22 = i5 & 2048;
                    if (i22 != 0) {
                        i20 |= 48;
                    } else if ((i4 & 48) != 0) {
                        if (dVarF.x(nceVar)) {
                            i23 = 32;
                        } else {
                            i23 = 16;
                        }
                        i20 |= i23;
                    }
                    i24 = i20;
                    i25 = i5 & 4096;
                    if (i25 != 0) {
                        i26 = i24 | 384;
                    } else if ((i4 & 384) == 0) {
                        if (dVarF.T(function2)) {
                            i27 = 256;
                        } else {
                            i27 = 128;
                        }
                        i26 = i24 | i27;
                    } else {
                        i26 = i24;
                    }
                    i28 = i5 & 8192;
                    if (i28 != 0) {
                        i30 = i26 | 3072;
                    } else {
                        i29 = i26;
                        if ((i4 & 3072) == 0) {
                            i30 = i29 | (dVarF.x(r48Var) ? 2048 : 1024);
                        } else {
                            i30 = i29;
                        }
                    }
                    i31 = i5 & 16384;
                    if (i31 != 0) {
                        i32 = i30;
                        if ((i4 & 24576) == 0) {
                            i32 |= dVarF.x(qu0Var) ? 16384 : 8192;
                        }
                        i33 = i5 & 32768;
                        if (i33 != 0) {
                            i32 |= 196608;
                        } else if ((i4 & 196608) == 0) {
                            i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
                        }
                        i34 = i32;
                        if ((i6 & 306783379) == 306783378 || (74899 & i34) != 74898) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (dVarF.g(z6, i6 & 1)) {
                            dVarF.U();
                            if ((i3 & 1) != 0 || dVarF.t()) {
                                if (i41 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i7 != 0) {
                                    z4 = true;
                                }
                                if (i9 != 0) {
                                    z5 = false;
                                }
                                if (i11 != 0) {
                                    textStyleA = TextStyle.INSTANCE.a();
                                }
                                if (i13 != 0) {
                                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                                }
                                if (i15 != 0) {
                                    mVarA = m.INSTANCE.a();
                                } else {
                                    mVarA = mVar2;
                                }
                                if (i17 != 0) {
                                    z10 = false;
                                } else {
                                    z10 = z3;
                                }
                                if ((i5 & 512) != 0) {
                                    if (z10) {
                                        i37 = 1;
                                    } else {
                                        i37 = Integer.MAX_VALUE;
                                    }
                                    i6 &= -1879048193;
                                } else {
                                    i37 = i;
                                }
                                if (i19 != 0) {
                                    i38 = 1;
                                } else {
                                    i38 = i2;
                                }
                                if (i22 != 0) {
                                    nceVarC = nce.INSTANCE.c();
                                } else {
                                    nceVarC = nceVar;
                                }
                                mVar4 = mVarA;
                                if (i25 != 0) {
                                    objR = dVarF.R();
                                    if (objR == d.INSTANCE.a()) {
                                        objR = new Function1() { // from class: com.google.android.qh0
                                            public final Object invoke(Object obj) {
                                                return a.r((TextLayoutResult) obj);
                                            }
                                        };
                                        dVarF.L(objR);
                                    }
                                    function4 = (Function1) objR;
                                } else {
                                    function4 = function2;
                                }
                                if (i28 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                Function1<? super TextLayoutResult, Unit> function6 = function4;
                                if (i31 != 0) {
                                    solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                                } else {
                                    solidColor = qu0Var;
                                }
                                if (i33 != 0) {
                                    boolean z15 = z5;
                                    ps4VarE = qo1.a.e();
                                    z11 = z15;
                                } else {
                                    z11 = z5;
                                    ps4VarE = ps4Var;
                                }
                                z12 = z4;
                                function5 = function6;
                            } else {
                                dVarF.q();
                                if ((i5 & 512) != 0) {
                                    i6 &= -1879048193;
                                }
                                z10 = z3;
                                i37 = i;
                                i38 = i2;
                                solidColor = qu0Var;
                                i6 = i6;
                                mVar4 = mVar2;
                                textStyleA = textStyleA;
                                keyboardOptionsA = keyboardOptionsA;
                                nceVarC = nceVar;
                                r48Var3 = r48Var;
                                z12 = z4;
                                z11 = z5;
                                function5 = function2;
                                ps4VarE = ps4Var;
                            }
                            dVarF.M();
                            nce nceVar3 = nceVarC;
                            if (e.k()) {
                                e.o(-971111025, i6, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:933)");
                            }
                            b bVar4 = bVar2;
                            ps4<? super Function2<? super d, ? super Integer, Unit>, ? super d, ? super Integer, Unit> ps4Var3 = ps4VarE;
                            ImeOptions imeOptionsI = keyboardOptionsA.i(z10);
                            boolean z16 = !z10;
                            qu0 qu0Var3 = solidColor;
                            if (z10) {
                                i39 = 1;
                            } else {
                                i39 = i38;
                            }
                            r48 r48Var4 = r48Var3;
                            if (z10) {
                                i40 = 1;
                            } else {
                                i40 = i37;
                            }
                            KeyboardOptions keyboardOptions3 = keyboardOptionsA;
                            if ((i6 & 14) == 4) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = z13 | ((i6 & 112) == 32);
                            objR2 = dVarF.R();
                            if (z14 || objR2 == d.INSTANCE.a()) {
                                objR2 = new Function1() { // from class: com.google.android.rh0
                                    public final Object invoke(Object obj) {
                                        return a.s(textFieldValue, function1, (TextFieldValue) obj);
                                    }
                                };
                                dVarF.L(objR2);
                            }
                            int i42 = i34 << 9;
                            int i43 = ((i6 >> 6) & 7168) | (i6 & 910) | (i42 & 57344) | (i42 & 458752) | (i42 & 3670016) | (i42 & 29360128);
                            int i44 = (i6 & 7168) | ((i6 >> 15) & 896) | (57344 & i6) | (i34 & 458752);
                            dVar2 = dVarF;
                            TextStyle textStyle3 = textStyleA;
                            boolean z17 = z10;
                            Function1<? super TextLayoutResult, Unit> function7 = function5;
                            CoreTextFieldKt.w(textFieldValue, (Function1) objR2, bVar4, textStyle3, nceVar3, function7, r48Var4, qu0Var3, z16, i40, i39, imeOptionsI, mVar4, z12, z11, ps4Var3, null, dVar2, i43, i44, 65536);
                            if (e.k()) {
                                e.n();
                            }
                            mVar3 = mVar4;
                            ps4Var2 = ps4Var3;
                            i35 = i37;
                            i36 = i38;
                            z9 = z17;
                            nceVar2 = nceVar3;
                            qu0Var2 = qu0Var3;
                            z7 = z12;
                            keyboardOptions2 = keyboardOptions3;
                            function3 = function7;
                            z8 = z11;
                            r48Var2 = r48Var4;
                            textStyle2 = textStyle3;
                            bVar3 = bVar4;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            i35 = i;
                            nceVar2 = nceVar;
                            ps4Var2 = ps4Var;
                            z7 = z4;
                            mVar3 = mVar2;
                            z8 = z5;
                            textStyle2 = textStyleA;
                            keyboardOptions2 = keyboardOptionsA;
                            bVar3 = bVar2;
                            z9 = z3;
                            i36 = i2;
                            function3 = function2;
                            r48Var2 = r48Var;
                            qu0Var2 = qu0Var;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.sh0
                                public final Object invoke(Object obj, Object obj2) {
                                    return a.t(textFieldValue, function1, bVar3, z7, z8, textStyle2, keyboardOptions2, mVar3, z9, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i32 = i30 | 24576;
                    i33 = i5 & 32768;
                    if (i33 != 0) {
                        i32 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
                    }
                    i34 = i32;
                    if ((i6 & 306783379) == 306783378) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (dVarF.g(z6, i6 & 1)) {
                        dVarF.U();
                        if ((i3 & 1) != 0) {
                            if (i41 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i7 != 0) {
                                z4 = true;
                            }
                            if (i9 != 0) {
                                z5 = false;
                            }
                            if (i11 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i13 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i15 != 0) {
                                mVarA = m.INSTANCE.a();
                            } else {
                                mVarA = mVar2;
                            }
                            if (i17 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if ((i5 & 512) != 0) {
                                if (z10) {
                                    i37 = 1;
                                } else {
                                    i37 = Integer.MAX_VALUE;
                                }
                                i6 &= -1879048193;
                            } else {
                                i37 = i;
                            }
                            if (i19 != 0) {
                                i38 = 1;
                            } else {
                                i38 = i2;
                            }
                            if (i22 != 0) {
                                nceVarC = nce.INSTANCE.c();
                            } else {
                                nceVarC = nceVar;
                            }
                            mVar4 = mVarA;
                            if (i25 != 0) {
                                objR = dVarF.R();
                                if (objR == d.INSTANCE.a()) {
                                    objR = new Function1() { // from class: com.google.android.qh0
                                        public final Object invoke(Object obj) {
                                            return a.r((TextLayoutResult) obj);
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function4 = (Function1) objR;
                            } else {
                                function4 = function2;
                            }
                            if (i28 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            Function1<? super TextLayoutResult, Unit> function8 = function4;
                            if (i31 != 0) {
                                solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                            } else {
                                solidColor = qu0Var;
                            }
                            if (i33 != 0) {
                                boolean z18 = z5;
                                ps4VarE = qo1.a.e();
                                z11 = z18;
                            } else {
                                z11 = z5;
                                ps4VarE = ps4Var;
                            }
                            z12 = z4;
                            function5 = function8;
                        } else {
                            if (i41 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i7 != 0) {
                                z4 = true;
                            }
                            if (i9 != 0) {
                                z5 = false;
                            }
                            if (i11 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i13 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i15 != 0) {
                                mVarA = m.INSTANCE.a();
                            } else {
                                mVarA = mVar2;
                            }
                            if (i17 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if ((i5 & 512) != 0) {
                                if (z10) {
                                    i37 = 1;
                                } else {
                                    i37 = Integer.MAX_VALUE;
                                }
                                i6 &= -1879048193;
                            } else {
                                i37 = i;
                            }
                            if (i19 != 0) {
                                i38 = 1;
                            } else {
                                i38 = i2;
                            }
                            if (i22 != 0) {
                                nceVarC = nce.INSTANCE.c();
                            } else {
                                nceVarC = nceVar;
                            }
                            mVar4 = mVarA;
                            if (i25 != 0) {
                                objR = dVarF.R();
                                if (objR == d.INSTANCE.a()) {
                                    objR = new Function1() { // from class: com.google.android.qh0
                                        public final Object invoke(Object obj) {
                                            return a.r((TextLayoutResult) obj);
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function4 = (Function1) objR;
                            } else {
                                function4 = function2;
                            }
                            if (i28 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            Function1<? super TextLayoutResult, Unit> function9 = function4;
                            if (i31 != 0) {
                                solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                            } else {
                                solidColor = qu0Var;
                            }
                            if (i33 != 0) {
                                boolean z19 = z5;
                                ps4VarE = qo1.a.e();
                                z11 = z19;
                            } else {
                                z11 = z5;
                                ps4VarE = ps4Var;
                            }
                            z12 = z4;
                            function5 = function9;
                        }
                        dVarF.M();
                        nce nceVar4 = nceVarC;
                        if (e.k()) {
                            e.o(-971111025, i6, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:933)");
                        }
                        b bVar5 = bVar2;
                        ps4<? super Function2<? super d, ? super Integer, Unit>, ? super d, ? super Integer, Unit> ps4Var4 = ps4VarE;
                        ImeOptions imeOptionsI2 = keyboardOptionsA.i(z10);
                        boolean z110 = !z10;
                        qu0 qu0Var4 = solidColor;
                        if (z10) {
                            i39 = 1;
                        } else {
                            i39 = i38;
                        }
                        r48 r48Var5 = r48Var3;
                        if (z10) {
                            i40 = 1;
                        } else {
                            i40 = i37;
                        }
                        KeyboardOptions keyboardOptions4 = keyboardOptionsA;
                        if ((i6 & 14) == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = z13 | ((i6 & 112) == 32);
                        objR2 = dVarF.R();
                        if (z14) {
                            objR2 = new Function1() { // from class: com.google.android.rh0
                                public final Object invoke(Object obj) {
                                    return a.s(textFieldValue, function1, (TextFieldValue) obj);
                                }
                            };
                            dVarF.L(objR2);
                        } else {
                            objR2 = new Function1() { // from class: com.google.android.rh0
                                public final Object invoke(Object obj) {
                                    return a.s(textFieldValue, function1, (TextFieldValue) obj);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        int i45 = i34 << 9;
                        int i46 = ((i6 >> 6) & 7168) | (i6 & 910) | (i45 & 57344) | (i45 & 458752) | (i45 & 3670016) | (i45 & 29360128);
                        int i47 = (i6 & 7168) | ((i6 >> 15) & 896) | (57344 & i6) | (i34 & 458752);
                        dVar2 = dVarF;
                        TextStyle textStyle4 = textStyleA;
                        boolean z111 = z10;
                        Function1<? super TextLayoutResult, Unit> function10 = function5;
                        CoreTextFieldKt.w(textFieldValue, (Function1) objR2, bVar5, textStyle4, nceVar4, function10, r48Var5, qu0Var4, z110, i40, i39, imeOptionsI2, mVar4, z12, z11, ps4Var4, null, dVar2, i46, i47, 65536);
                        if (e.k()) {
                            e.n();
                        }
                        mVar3 = mVar4;
                        ps4Var2 = ps4Var4;
                        i35 = i37;
                        i36 = i38;
                        z9 = z111;
                        nceVar2 = nceVar4;
                        qu0Var2 = qu0Var4;
                        z7 = z12;
                        keyboardOptions2 = keyboardOptions4;
                        function3 = function10;
                        z8 = z11;
                        r48Var2 = r48Var5;
                        textStyle2 = textStyle4;
                        bVar3 = bVar5;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        i35 = i;
                        nceVar2 = nceVar;
                        ps4Var2 = ps4Var;
                        z7 = z4;
                        mVar3 = mVar2;
                        z8 = z5;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        bVar3 = bVar2;
                        z9 = z3;
                        i36 = i2;
                        function3 = function2;
                        r48Var2 = r48Var;
                        qu0Var2 = qu0Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.sh0
                            public final Object invoke(Object obj, Object obj2) {
                                return a.t(textFieldValue, function1, bVar3, z7, z8, textStyle2, keyboardOptions2, mVar3, z9, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i6 |= 24576;
                z5 = z2;
                i11 = i5 & 32;
                if (i11 != 0) {
                    i6 |= 196608;
                    textStyleA = textStyle;
                } else {
                    textStyleA = textStyle;
                    if ((i3 & 196608) == 0) {
                        if (dVarF.x(textStyleA)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i6 |= i12;
                    }
                }
                i13 = i5 & 64;
                if (i13 != 0) {
                    i6 |= 1572864;
                    keyboardOptionsA = keyboardOptions;
                } else {
                    keyboardOptionsA = keyboardOptions;
                    if ((i3 & 1572864) == 0) {
                        if (dVarF.x(keyboardOptionsA)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i6 |= i14;
                    }
                }
                i15 = i5 & 128;
                if (i15 != 0) {
                    i6 |= 12582912;
                    mVar2 = mVar;
                } else {
                    mVar2 = mVar;
                    if ((i3 & 12582912) == 0) {
                        if (dVarF.x(mVar2)) {
                            i16 = 8388608;
                        } else {
                            i16 = 4194304;
                        }
                        i6 |= i16;
                    }
                }
                i17 = i5 & 256;
                if (i17 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 100663296) == 0) {
                    if (dVarF.A(z3)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i6 |= i18;
                }
                if ((i3 & 805306368) != 0) {
                    i6 |= ((i5 & 512) == 0 || !dVarF.C(i)) ? 268435456 : 536870912;
                }
                i19 = i5 & 1024;
                if (i19 != 0) {
                    i20 = i4 | 6;
                } else if ((i4 & 6) == 0) {
                    if (dVarF.C(i2)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i4 | i21;
                } else {
                    i20 = i4;
                }
                i22 = i5 & 2048;
                if (i22 != 0) {
                    i20 |= 48;
                } else if ((i4 & 48) != 0) {
                    if (dVarF.x(nceVar)) {
                        i23 = 32;
                    } else {
                        i23 = 16;
                    }
                    i20 |= i23;
                }
                i24 = i20;
                i25 = i5 & 4096;
                if (i25 != 0) {
                    i26 = i24 | 384;
                } else if ((i4 & 384) == 0) {
                    if (dVarF.T(function2)) {
                        i27 = 256;
                    } else {
                        i27 = 128;
                    }
                    i26 = i24 | i27;
                } else {
                    i26 = i24;
                }
                i28 = i5 & 8192;
                if (i28 != 0) {
                    i30 = i26 | 3072;
                } else {
                    i29 = i26;
                    if ((i4 & 3072) == 0) {
                        i30 = i29 | (dVarF.x(r48Var) ? 2048 : 1024);
                    } else {
                        i30 = i29;
                    }
                }
                i31 = i5 & 16384;
                if (i31 != 0) {
                    i32 = i30;
                    if ((i4 & 24576) == 0) {
                        i32 |= dVarF.x(qu0Var) ? 16384 : 8192;
                    }
                    i33 = i5 & 32768;
                    if (i33 != 0) {
                        i32 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
                    }
                    i34 = i32;
                    if ((i6 & 306783379) == 306783378) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (dVarF.g(z6, i6 & 1)) {
                        dVarF.U();
                        if ((i3 & 1) != 0) {
                            if (i41 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i7 != 0) {
                                z4 = true;
                            }
                            if (i9 != 0) {
                                z5 = false;
                            }
                            if (i11 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i13 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i15 != 0) {
                                mVarA = m.INSTANCE.a();
                            } else {
                                mVarA = mVar2;
                            }
                            if (i17 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if ((i5 & 512) != 0) {
                                if (z10) {
                                    i37 = 1;
                                } else {
                                    i37 = Integer.MAX_VALUE;
                                }
                                i6 &= -1879048193;
                            } else {
                                i37 = i;
                            }
                            if (i19 != 0) {
                                i38 = 1;
                            } else {
                                i38 = i2;
                            }
                            if (i22 != 0) {
                                nceVarC = nce.INSTANCE.c();
                            } else {
                                nceVarC = nceVar;
                            }
                            mVar4 = mVarA;
                            if (i25 != 0) {
                                objR = dVarF.R();
                                if (objR == d.INSTANCE.a()) {
                                    objR = new Function1() { // from class: com.google.android.qh0
                                        public final Object invoke(Object obj) {
                                            return a.r((TextLayoutResult) obj);
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function4 = (Function1) objR;
                            } else {
                                function4 = function2;
                            }
                            if (i28 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            Function1<? super TextLayoutResult, Unit> function11 = function4;
                            if (i31 != 0) {
                                solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                            } else {
                                solidColor = qu0Var;
                            }
                            if (i33 != 0) {
                                boolean z112 = z5;
                                ps4VarE = qo1.a.e();
                                z11 = z112;
                            } else {
                                z11 = z5;
                                ps4VarE = ps4Var;
                            }
                            z12 = z4;
                            function5 = function11;
                        } else {
                            if (i41 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i7 != 0) {
                                z4 = true;
                            }
                            if (i9 != 0) {
                                z5 = false;
                            }
                            if (i11 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i13 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i15 != 0) {
                                mVarA = m.INSTANCE.a();
                            } else {
                                mVarA = mVar2;
                            }
                            if (i17 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if ((i5 & 512) != 0) {
                                if (z10) {
                                    i37 = 1;
                                } else {
                                    i37 = Integer.MAX_VALUE;
                                }
                                i6 &= -1879048193;
                            } else {
                                i37 = i;
                            }
                            if (i19 != 0) {
                                i38 = 1;
                            } else {
                                i38 = i2;
                            }
                            if (i22 != 0) {
                                nceVarC = nce.INSTANCE.c();
                            } else {
                                nceVarC = nceVar;
                            }
                            mVar4 = mVarA;
                            if (i25 != 0) {
                                objR = dVarF.R();
                                if (objR == d.INSTANCE.a()) {
                                    objR = new Function1() { // from class: com.google.android.qh0
                                        public final Object invoke(Object obj) {
                                            return a.r((TextLayoutResult) obj);
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function4 = (Function1) objR;
                            } else {
                                function4 = function2;
                            }
                            if (i28 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            Function1<? super TextLayoutResult, Unit> function12 = function4;
                            if (i31 != 0) {
                                solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                            } else {
                                solidColor = qu0Var;
                            }
                            if (i33 != 0) {
                                boolean z113 = z5;
                                ps4VarE = qo1.a.e();
                                z11 = z113;
                            } else {
                                z11 = z5;
                                ps4VarE = ps4Var;
                            }
                            z12 = z4;
                            function5 = function12;
                        }
                        dVarF.M();
                        nce nceVar5 = nceVarC;
                        if (e.k()) {
                            e.o(-971111025, i6, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:933)");
                        }
                        b bVar6 = bVar2;
                        ps4<? super Function2<? super d, ? super Integer, Unit>, ? super d, ? super Integer, Unit> ps4Var5 = ps4VarE;
                        ImeOptions imeOptionsI3 = keyboardOptionsA.i(z10);
                        boolean z114 = !z10;
                        qu0 qu0Var5 = solidColor;
                        if (z10) {
                            i39 = 1;
                        } else {
                            i39 = i38;
                        }
                        r48 r48Var6 = r48Var3;
                        if (z10) {
                            i40 = 1;
                        } else {
                            i40 = i37;
                        }
                        KeyboardOptions keyboardOptions5 = keyboardOptionsA;
                        if ((i6 & 14) == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = z13 | ((i6 & 112) == 32);
                        objR2 = dVarF.R();
                        if (z14) {
                            objR2 = new Function1() { // from class: com.google.android.rh0
                                public final Object invoke(Object obj) {
                                    return a.s(textFieldValue, function1, (TextFieldValue) obj);
                                }
                            };
                            dVarF.L(objR2);
                        } else {
                            objR2 = new Function1() { // from class: com.google.android.rh0
                                public final Object invoke(Object obj) {
                                    return a.s(textFieldValue, function1, (TextFieldValue) obj);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        int i48 = i34 << 9;
                        int i49 = ((i6 >> 6) & 7168) | (i6 & 910) | (i48 & 57344) | (i48 & 458752) | (i48 & 3670016) | (i48 & 29360128);
                        int i410 = (i6 & 7168) | ((i6 >> 15) & 896) | (57344 & i6) | (i34 & 458752);
                        dVar2 = dVarF;
                        TextStyle textStyle5 = textStyleA;
                        boolean z115 = z10;
                        Function1<? super TextLayoutResult, Unit> function13 = function5;
                        CoreTextFieldKt.w(textFieldValue, (Function1) objR2, bVar6, textStyle5, nceVar5, function13, r48Var6, qu0Var5, z114, i40, i39, imeOptionsI3, mVar4, z12, z11, ps4Var5, null, dVar2, i49, i410, 65536);
                        if (e.k()) {
                            e.n();
                        }
                        mVar3 = mVar4;
                        ps4Var2 = ps4Var5;
                        i35 = i37;
                        i36 = i38;
                        z9 = z115;
                        nceVar2 = nceVar5;
                        qu0Var2 = qu0Var5;
                        z7 = z12;
                        keyboardOptions2 = keyboardOptions5;
                        function3 = function13;
                        z8 = z11;
                        r48Var2 = r48Var6;
                        textStyle2 = textStyle5;
                        bVar3 = bVar6;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        i35 = i;
                        nceVar2 = nceVar;
                        ps4Var2 = ps4Var;
                        z7 = z4;
                        mVar3 = mVar2;
                        z8 = z5;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        bVar3 = bVar2;
                        z9 = z3;
                        i36 = i2;
                        function3 = function2;
                        r48Var2 = r48Var;
                        qu0Var2 = qu0Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.sh0
                            public final Object invoke(Object obj, Object obj2) {
                                return a.t(textFieldValue, function1, bVar3, z7, z8, textStyle2, keyboardOptions2, mVar3, z9, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i32 = i30 | 24576;
                i33 = i5 & 32768;
                if (i33 != 0) {
                    i32 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
                }
                i34 = i32;
                if ((i6 & 306783379) == 306783378) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (dVarF.g(z6, i6 & 1)) {
                    dVarF.U();
                    if ((i3 & 1) != 0) {
                        if (i41 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i13 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i15 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i37 = 1;
                            } else {
                                i37 = Integer.MAX_VALUE;
                            }
                            i6 &= -1879048193;
                        } else {
                            i37 = i;
                        }
                        if (i19 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i2;
                        }
                        if (i22 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        } else {
                            nceVarC = nceVar;
                        }
                        mVar4 = mVarA;
                        if (i25 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.qh0
                                    public final Object invoke(Object obj) {
                                        return a.r((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        } else {
                            function4 = function2;
                        }
                        if (i28 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        Function1<? super TextLayoutResult, Unit> function14 = function4;
                        if (i31 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                        } else {
                            solidColor = qu0Var;
                        }
                        if (i33 != 0) {
                            boolean z116 = z5;
                            ps4VarE = qo1.a.e();
                            z11 = z116;
                        } else {
                            z11 = z5;
                            ps4VarE = ps4Var;
                        }
                        z12 = z4;
                        function5 = function14;
                    } else {
                        if (i41 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i13 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i15 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i37 = 1;
                            } else {
                                i37 = Integer.MAX_VALUE;
                            }
                            i6 &= -1879048193;
                        } else {
                            i37 = i;
                        }
                        if (i19 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i2;
                        }
                        if (i22 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        } else {
                            nceVarC = nceVar;
                        }
                        mVar4 = mVarA;
                        if (i25 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.qh0
                                    public final Object invoke(Object obj) {
                                        return a.r((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        } else {
                            function4 = function2;
                        }
                        if (i28 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        Function1<? super TextLayoutResult, Unit> function15 = function4;
                        if (i31 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                        } else {
                            solidColor = qu0Var;
                        }
                        if (i33 != 0) {
                            boolean z117 = z5;
                            ps4VarE = qo1.a.e();
                            z11 = z117;
                        } else {
                            z11 = z5;
                            ps4VarE = ps4Var;
                        }
                        z12 = z4;
                        function5 = function15;
                    }
                    dVarF.M();
                    nce nceVar6 = nceVarC;
                    if (e.k()) {
                        e.o(-971111025, i6, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:933)");
                    }
                    b bVar7 = bVar2;
                    ps4<? super Function2<? super d, ? super Integer, Unit>, ? super d, ? super Integer, Unit> ps4Var6 = ps4VarE;
                    ImeOptions imeOptionsI4 = keyboardOptionsA.i(z10);
                    boolean z118 = !z10;
                    qu0 qu0Var6 = solidColor;
                    if (z10) {
                        i39 = 1;
                    } else {
                        i39 = i38;
                    }
                    r48 r48Var7 = r48Var3;
                    if (z10) {
                        i40 = 1;
                    } else {
                        i40 = i37;
                    }
                    KeyboardOptions keyboardOptions6 = keyboardOptionsA;
                    if ((i6 & 14) == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z13 | ((i6 & 112) == 32);
                    objR2 = dVarF.R();
                    if (z14) {
                        objR2 = new Function1() { // from class: com.google.android.rh0
                            public final Object invoke(Object obj) {
                                return a.s(textFieldValue, function1, (TextFieldValue) obj);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        objR2 = new Function1() { // from class: com.google.android.rh0
                            public final Object invoke(Object obj) {
                                return a.s(textFieldValue, function1, (TextFieldValue) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    int i411 = i34 << 9;
                    int i412 = ((i6 >> 6) & 7168) | (i6 & 910) | (i411 & 57344) | (i411 & 458752) | (i411 & 3670016) | (i411 & 29360128);
                    int i413 = (i6 & 7168) | ((i6 >> 15) & 896) | (57344 & i6) | (i34 & 458752);
                    dVar2 = dVarF;
                    TextStyle textStyle6 = textStyleA;
                    boolean z119 = z10;
                    Function1<? super TextLayoutResult, Unit> function16 = function5;
                    CoreTextFieldKt.w(textFieldValue, (Function1) objR2, bVar7, textStyle6, nceVar6, function16, r48Var7, qu0Var6, z118, i40, i39, imeOptionsI4, mVar4, z12, z11, ps4Var6, null, dVar2, i412, i413, 65536);
                    if (e.k()) {
                        e.n();
                    }
                    mVar3 = mVar4;
                    ps4Var2 = ps4Var6;
                    i35 = i37;
                    i36 = i38;
                    z9 = z119;
                    nceVar2 = nceVar6;
                    qu0Var2 = qu0Var6;
                    z7 = z12;
                    keyboardOptions2 = keyboardOptions6;
                    function3 = function16;
                    z8 = z11;
                    r48Var2 = r48Var7;
                    textStyle2 = textStyle6;
                    bVar3 = bVar7;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    i35 = i;
                    nceVar2 = nceVar;
                    ps4Var2 = ps4Var;
                    z7 = z4;
                    mVar3 = mVar2;
                    z8 = z5;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    bVar3 = bVar2;
                    z9 = z3;
                    i36 = i2;
                    function3 = function2;
                    r48Var2 = r48Var;
                    qu0Var2 = qu0Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.sh0
                        public final Object invoke(Object obj, Object obj2) {
                            return a.t(textFieldValue, function1, bVar3, z7, z8, textStyle2, keyboardOptions2, mVar3, z9, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i6 |= 3072;
            z4 = z;
            i9 = i5 & 16;
            if (i9 != 0) {
                if ((i3 & 24576) == 0) {
                    z5 = z2;
                    if (dVarF.A(z5)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i6 |= i10;
                }
                i11 = i5 & 32;
                if (i11 != 0) {
                    i6 |= 196608;
                    textStyleA = textStyle;
                } else {
                    textStyleA = textStyle;
                    if ((i3 & 196608) == 0) {
                        if (dVarF.x(textStyleA)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i6 |= i12;
                    }
                }
                i13 = i5 & 64;
                if (i13 != 0) {
                    i6 |= 1572864;
                    keyboardOptionsA = keyboardOptions;
                } else {
                    keyboardOptionsA = keyboardOptions;
                    if ((i3 & 1572864) == 0) {
                        if (dVarF.x(keyboardOptionsA)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i6 |= i14;
                    }
                }
                i15 = i5 & 128;
                if (i15 != 0) {
                    i6 |= 12582912;
                    mVar2 = mVar;
                } else {
                    mVar2 = mVar;
                    if ((i3 & 12582912) == 0) {
                        if (dVarF.x(mVar2)) {
                            i16 = 8388608;
                        } else {
                            i16 = 4194304;
                        }
                        i6 |= i16;
                    }
                }
                i17 = i5 & 256;
                if (i17 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 100663296) == 0) {
                    if (dVarF.A(z3)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i6 |= i18;
                }
                if ((i3 & 805306368) != 0) {
                    i6 |= ((i5 & 512) == 0 || !dVarF.C(i)) ? 268435456 : 536870912;
                }
                i19 = i5 & 1024;
                if (i19 != 0) {
                    i20 = i4 | 6;
                } else if ((i4 & 6) == 0) {
                    if (dVarF.C(i2)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i4 | i21;
                } else {
                    i20 = i4;
                }
                i22 = i5 & 2048;
                if (i22 != 0) {
                    i20 |= 48;
                } else if ((i4 & 48) != 0) {
                    if (dVarF.x(nceVar)) {
                        i23 = 32;
                    } else {
                        i23 = 16;
                    }
                    i20 |= i23;
                }
                i24 = i20;
                i25 = i5 & 4096;
                if (i25 != 0) {
                    i26 = i24 | 384;
                } else if ((i4 & 384) == 0) {
                    if (dVarF.T(function2)) {
                        i27 = 256;
                    } else {
                        i27 = 128;
                    }
                    i26 = i24 | i27;
                } else {
                    i26 = i24;
                }
                i28 = i5 & 8192;
                if (i28 != 0) {
                    i30 = i26 | 3072;
                } else {
                    i29 = i26;
                    if ((i4 & 3072) == 0) {
                        i30 = i29 | (dVarF.x(r48Var) ? 2048 : 1024);
                    } else {
                        i30 = i29;
                    }
                }
                i31 = i5 & 16384;
                if (i31 != 0) {
                    i32 = i30;
                    if ((i4 & 24576) == 0) {
                        i32 |= dVarF.x(qu0Var) ? 16384 : 8192;
                    }
                    i33 = i5 & 32768;
                    if (i33 != 0) {
                        i32 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
                    }
                    i34 = i32;
                    if ((i6 & 306783379) == 306783378) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (dVarF.g(z6, i6 & 1)) {
                        dVarF.U();
                        if ((i3 & 1) != 0) {
                            if (i41 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i7 != 0) {
                                z4 = true;
                            }
                            if (i9 != 0) {
                                z5 = false;
                            }
                            if (i11 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i13 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i15 != 0) {
                                mVarA = m.INSTANCE.a();
                            } else {
                                mVarA = mVar2;
                            }
                            if (i17 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if ((i5 & 512) != 0) {
                                if (z10) {
                                    i37 = 1;
                                } else {
                                    i37 = Integer.MAX_VALUE;
                                }
                                i6 &= -1879048193;
                            } else {
                                i37 = i;
                            }
                            if (i19 != 0) {
                                i38 = 1;
                            } else {
                                i38 = i2;
                            }
                            if (i22 != 0) {
                                nceVarC = nce.INSTANCE.c();
                            } else {
                                nceVarC = nceVar;
                            }
                            mVar4 = mVarA;
                            if (i25 != 0) {
                                objR = dVarF.R();
                                if (objR == d.INSTANCE.a()) {
                                    objR = new Function1() { // from class: com.google.android.qh0
                                        public final Object invoke(Object obj) {
                                            return a.r((TextLayoutResult) obj);
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function4 = (Function1) objR;
                            } else {
                                function4 = function2;
                            }
                            if (i28 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            Function1<? super TextLayoutResult, Unit> function17 = function4;
                            if (i31 != 0) {
                                solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                            } else {
                                solidColor = qu0Var;
                            }
                            if (i33 != 0) {
                                boolean z1110 = z5;
                                ps4VarE = qo1.a.e();
                                z11 = z1110;
                            } else {
                                z11 = z5;
                                ps4VarE = ps4Var;
                            }
                            z12 = z4;
                            function5 = function17;
                        } else {
                            if (i41 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i7 != 0) {
                                z4 = true;
                            }
                            if (i9 != 0) {
                                z5 = false;
                            }
                            if (i11 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i13 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i15 != 0) {
                                mVarA = m.INSTANCE.a();
                            } else {
                                mVarA = mVar2;
                            }
                            if (i17 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if ((i5 & 512) != 0) {
                                if (z10) {
                                    i37 = 1;
                                } else {
                                    i37 = Integer.MAX_VALUE;
                                }
                                i6 &= -1879048193;
                            } else {
                                i37 = i;
                            }
                            if (i19 != 0) {
                                i38 = 1;
                            } else {
                                i38 = i2;
                            }
                            if (i22 != 0) {
                                nceVarC = nce.INSTANCE.c();
                            } else {
                                nceVarC = nceVar;
                            }
                            mVar4 = mVarA;
                            if (i25 != 0) {
                                objR = dVarF.R();
                                if (objR == d.INSTANCE.a()) {
                                    objR = new Function1() { // from class: com.google.android.qh0
                                        public final Object invoke(Object obj) {
                                            return a.r((TextLayoutResult) obj);
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function4 = (Function1) objR;
                            } else {
                                function4 = function2;
                            }
                            if (i28 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            Function1<? super TextLayoutResult, Unit> function18 = function4;
                            if (i31 != 0) {
                                solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                            } else {
                                solidColor = qu0Var;
                            }
                            if (i33 != 0) {
                                boolean z1111 = z5;
                                ps4VarE = qo1.a.e();
                                z11 = z1111;
                            } else {
                                z11 = z5;
                                ps4VarE = ps4Var;
                            }
                            z12 = z4;
                            function5 = function18;
                        }
                        dVarF.M();
                        nce nceVar7 = nceVarC;
                        if (e.k()) {
                            e.o(-971111025, i6, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:933)");
                        }
                        b bVar8 = bVar2;
                        ps4<? super Function2<? super d, ? super Integer, Unit>, ? super d, ? super Integer, Unit> ps4Var7 = ps4VarE;
                        ImeOptions imeOptionsI5 = keyboardOptionsA.i(z10);
                        boolean z1112 = !z10;
                        qu0 qu0Var7 = solidColor;
                        if (z10) {
                            i39 = 1;
                        } else {
                            i39 = i38;
                        }
                        r48 r48Var8 = r48Var3;
                        if (z10) {
                            i40 = 1;
                        } else {
                            i40 = i37;
                        }
                        KeyboardOptions keyboardOptions7 = keyboardOptionsA;
                        if ((i6 & 14) == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = z13 | ((i6 & 112) == 32);
                        objR2 = dVarF.R();
                        if (z14) {
                            objR2 = new Function1() { // from class: com.google.android.rh0
                                public final Object invoke(Object obj) {
                                    return a.s(textFieldValue, function1, (TextFieldValue) obj);
                                }
                            };
                            dVarF.L(objR2);
                        } else {
                            objR2 = new Function1() { // from class: com.google.android.rh0
                                public final Object invoke(Object obj) {
                                    return a.s(textFieldValue, function1, (TextFieldValue) obj);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        int i414 = i34 << 9;
                        int i415 = ((i6 >> 6) & 7168) | (i6 & 910) | (i414 & 57344) | (i414 & 458752) | (i414 & 3670016) | (i414 & 29360128);
                        int i416 = (i6 & 7168) | ((i6 >> 15) & 896) | (57344 & i6) | (i34 & 458752);
                        dVar2 = dVarF;
                        TextStyle textStyle7 = textStyleA;
                        boolean z1113 = z10;
                        Function1<? super TextLayoutResult, Unit> function19 = function5;
                        CoreTextFieldKt.w(textFieldValue, (Function1) objR2, bVar8, textStyle7, nceVar7, function19, r48Var8, qu0Var7, z1112, i40, i39, imeOptionsI5, mVar4, z12, z11, ps4Var7, null, dVar2, i415, i416, 65536);
                        if (e.k()) {
                            e.n();
                        }
                        mVar3 = mVar4;
                        ps4Var2 = ps4Var7;
                        i35 = i37;
                        i36 = i38;
                        z9 = z1113;
                        nceVar2 = nceVar7;
                        qu0Var2 = qu0Var7;
                        z7 = z12;
                        keyboardOptions2 = keyboardOptions7;
                        function3 = function19;
                        z8 = z11;
                        r48Var2 = r48Var8;
                        textStyle2 = textStyle7;
                        bVar3 = bVar8;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        i35 = i;
                        nceVar2 = nceVar;
                        ps4Var2 = ps4Var;
                        z7 = z4;
                        mVar3 = mVar2;
                        z8 = z5;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        bVar3 = bVar2;
                        z9 = z3;
                        i36 = i2;
                        function3 = function2;
                        r48Var2 = r48Var;
                        qu0Var2 = qu0Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.sh0
                            public final Object invoke(Object obj, Object obj2) {
                                return a.t(textFieldValue, function1, bVar3, z7, z8, textStyle2, keyboardOptions2, mVar3, z9, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i32 = i30 | 24576;
                i33 = i5 & 32768;
                if (i33 != 0) {
                    i32 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
                }
                i34 = i32;
                if ((i6 & 306783379) == 306783378) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (dVarF.g(z6, i6 & 1)) {
                    dVarF.U();
                    if ((i3 & 1) != 0) {
                        if (i41 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i13 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i15 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i37 = 1;
                            } else {
                                i37 = Integer.MAX_VALUE;
                            }
                            i6 &= -1879048193;
                        } else {
                            i37 = i;
                        }
                        if (i19 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i2;
                        }
                        if (i22 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        } else {
                            nceVarC = nceVar;
                        }
                        mVar4 = mVarA;
                        if (i25 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.qh0
                                    public final Object invoke(Object obj) {
                                        return a.r((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        } else {
                            function4 = function2;
                        }
                        if (i28 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        Function1<? super TextLayoutResult, Unit> function110 = function4;
                        if (i31 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                        } else {
                            solidColor = qu0Var;
                        }
                        if (i33 != 0) {
                            boolean z1114 = z5;
                            ps4VarE = qo1.a.e();
                            z11 = z1114;
                        } else {
                            z11 = z5;
                            ps4VarE = ps4Var;
                        }
                        z12 = z4;
                        function5 = function110;
                    } else {
                        if (i41 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i13 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i15 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i37 = 1;
                            } else {
                                i37 = Integer.MAX_VALUE;
                            }
                            i6 &= -1879048193;
                        } else {
                            i37 = i;
                        }
                        if (i19 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i2;
                        }
                        if (i22 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        } else {
                            nceVarC = nceVar;
                        }
                        mVar4 = mVarA;
                        if (i25 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.qh0
                                    public final Object invoke(Object obj) {
                                        return a.r((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        } else {
                            function4 = function2;
                        }
                        if (i28 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        Function1<? super TextLayoutResult, Unit> function111 = function4;
                        if (i31 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                        } else {
                            solidColor = qu0Var;
                        }
                        if (i33 != 0) {
                            boolean z1115 = z5;
                            ps4VarE = qo1.a.e();
                            z11 = z1115;
                        } else {
                            z11 = z5;
                            ps4VarE = ps4Var;
                        }
                        z12 = z4;
                        function5 = function111;
                    }
                    dVarF.M();
                    nce nceVar8 = nceVarC;
                    if (e.k()) {
                        e.o(-971111025, i6, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:933)");
                    }
                    b bVar9 = bVar2;
                    ps4<? super Function2<? super d, ? super Integer, Unit>, ? super d, ? super Integer, Unit> ps4Var8 = ps4VarE;
                    ImeOptions imeOptionsI6 = keyboardOptionsA.i(z10);
                    boolean z1116 = !z10;
                    qu0 qu0Var8 = solidColor;
                    if (z10) {
                        i39 = 1;
                    } else {
                        i39 = i38;
                    }
                    r48 r48Var9 = r48Var3;
                    if (z10) {
                        i40 = 1;
                    } else {
                        i40 = i37;
                    }
                    KeyboardOptions keyboardOptions8 = keyboardOptionsA;
                    if ((i6 & 14) == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z13 | ((i6 & 112) == 32);
                    objR2 = dVarF.R();
                    if (z14) {
                        objR2 = new Function1() { // from class: com.google.android.rh0
                            public final Object invoke(Object obj) {
                                return a.s(textFieldValue, function1, (TextFieldValue) obj);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        objR2 = new Function1() { // from class: com.google.android.rh0
                            public final Object invoke(Object obj) {
                                return a.s(textFieldValue, function1, (TextFieldValue) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    int i417 = i34 << 9;
                    int i418 = ((i6 >> 6) & 7168) | (i6 & 910) | (i417 & 57344) | (i417 & 458752) | (i417 & 3670016) | (i417 & 29360128);
                    int i419 = (i6 & 7168) | ((i6 >> 15) & 896) | (57344 & i6) | (i34 & 458752);
                    dVar2 = dVarF;
                    TextStyle textStyle8 = textStyleA;
                    boolean z1117 = z10;
                    Function1<? super TextLayoutResult, Unit> function112 = function5;
                    CoreTextFieldKt.w(textFieldValue, (Function1) objR2, bVar9, textStyle8, nceVar8, function112, r48Var9, qu0Var8, z1116, i40, i39, imeOptionsI6, mVar4, z12, z11, ps4Var8, null, dVar2, i418, i419, 65536);
                    if (e.k()) {
                        e.n();
                    }
                    mVar3 = mVar4;
                    ps4Var2 = ps4Var8;
                    i35 = i37;
                    i36 = i38;
                    z9 = z1117;
                    nceVar2 = nceVar8;
                    qu0Var2 = qu0Var8;
                    z7 = z12;
                    keyboardOptions2 = keyboardOptions8;
                    function3 = function112;
                    z8 = z11;
                    r48Var2 = r48Var9;
                    textStyle2 = textStyle8;
                    bVar3 = bVar9;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    i35 = i;
                    nceVar2 = nceVar;
                    ps4Var2 = ps4Var;
                    z7 = z4;
                    mVar3 = mVar2;
                    z8 = z5;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    bVar3 = bVar2;
                    z9 = z3;
                    i36 = i2;
                    function3 = function2;
                    r48Var2 = r48Var;
                    qu0Var2 = qu0Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.sh0
                        public final Object invoke(Object obj, Object obj2) {
                            return a.t(textFieldValue, function1, bVar3, z7, z8, textStyle2, keyboardOptions2, mVar3, z9, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i6 |= 24576;
            z5 = z2;
            i11 = i5 & 32;
            if (i11 != 0) {
                i6 |= 196608;
                textStyleA = textStyle;
            } else {
                textStyleA = textStyle;
                if ((i3 & 196608) == 0) {
                    if (dVarF.x(textStyleA)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i6 |= i12;
                }
            }
            i13 = i5 & 64;
            if (i13 != 0) {
                i6 |= 1572864;
                keyboardOptionsA = keyboardOptions;
            } else {
                keyboardOptionsA = keyboardOptions;
                if ((i3 & 1572864) == 0) {
                    if (dVarF.x(keyboardOptionsA)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i6 |= i14;
                }
            }
            i15 = i5 & 128;
            if (i15 != 0) {
                i6 |= 12582912;
                mVar2 = mVar;
            } else {
                mVar2 = mVar;
                if ((i3 & 12582912) == 0) {
                    if (dVarF.x(mVar2)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i6 |= i16;
                }
            }
            i17 = i5 & 256;
            if (i17 != 0) {
                i6 |= 100663296;
            } else if ((i3 & 100663296) == 0) {
                if (dVarF.A(z3)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i6 |= i18;
            }
            if ((i3 & 805306368) != 0) {
                i6 |= ((i5 & 512) == 0 || !dVarF.C(i)) ? 268435456 : 536870912;
            }
            i19 = i5 & 1024;
            if (i19 != 0) {
                i20 = i4 | 6;
            } else if ((i4 & 6) == 0) {
                if (dVarF.C(i2)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i20 = i4 | i21;
            } else {
                i20 = i4;
            }
            i22 = i5 & 2048;
            if (i22 != 0) {
                i20 |= 48;
            } else if ((i4 & 48) != 0) {
                if (dVarF.x(nceVar)) {
                    i23 = 32;
                } else {
                    i23 = 16;
                }
                i20 |= i23;
            }
            i24 = i20;
            i25 = i5 & 4096;
            if (i25 != 0) {
                i26 = i24 | 384;
            } else if ((i4 & 384) == 0) {
                if (dVarF.T(function2)) {
                    i27 = 256;
                } else {
                    i27 = 128;
                }
                i26 = i24 | i27;
            } else {
                i26 = i24;
            }
            i28 = i5 & 8192;
            if (i28 != 0) {
                i30 = i26 | 3072;
            } else {
                i29 = i26;
                if ((i4 & 3072) == 0) {
                    i30 = i29 | (dVarF.x(r48Var) ? 2048 : 1024);
                } else {
                    i30 = i29;
                }
            }
            i31 = i5 & 16384;
            if (i31 != 0) {
                i32 = i30;
                if ((i4 & 24576) == 0) {
                    i32 |= dVarF.x(qu0Var) ? 16384 : 8192;
                }
                i33 = i5 & 32768;
                if (i33 != 0) {
                    i32 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
                }
                i34 = i32;
                if ((i6 & 306783379) == 306783378) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (dVarF.g(z6, i6 & 1)) {
                    dVarF.U();
                    if ((i3 & 1) != 0) {
                        if (i41 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i13 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i15 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i37 = 1;
                            } else {
                                i37 = Integer.MAX_VALUE;
                            }
                            i6 &= -1879048193;
                        } else {
                            i37 = i;
                        }
                        if (i19 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i2;
                        }
                        if (i22 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        } else {
                            nceVarC = nceVar;
                        }
                        mVar4 = mVarA;
                        if (i25 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.qh0
                                    public final Object invoke(Object obj) {
                                        return a.r((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        } else {
                            function4 = function2;
                        }
                        if (i28 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        Function1<? super TextLayoutResult, Unit> function113 = function4;
                        if (i31 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                        } else {
                            solidColor = qu0Var;
                        }
                        if (i33 != 0) {
                            boolean z1118 = z5;
                            ps4VarE = qo1.a.e();
                            z11 = z1118;
                        } else {
                            z11 = z5;
                            ps4VarE = ps4Var;
                        }
                        z12 = z4;
                        function5 = function113;
                    } else {
                        if (i41 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i13 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i15 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i37 = 1;
                            } else {
                                i37 = Integer.MAX_VALUE;
                            }
                            i6 &= -1879048193;
                        } else {
                            i37 = i;
                        }
                        if (i19 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i2;
                        }
                        if (i22 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        } else {
                            nceVarC = nceVar;
                        }
                        mVar4 = mVarA;
                        if (i25 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.qh0
                                    public final Object invoke(Object obj) {
                                        return a.r((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        } else {
                            function4 = function2;
                        }
                        if (i28 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        Function1<? super TextLayoutResult, Unit> function114 = function4;
                        if (i31 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                        } else {
                            solidColor = qu0Var;
                        }
                        if (i33 != 0) {
                            boolean z1119 = z5;
                            ps4VarE = qo1.a.e();
                            z11 = z1119;
                        } else {
                            z11 = z5;
                            ps4VarE = ps4Var;
                        }
                        z12 = z4;
                        function5 = function114;
                    }
                    dVarF.M();
                    nce nceVar9 = nceVarC;
                    if (e.k()) {
                        e.o(-971111025, i6, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:933)");
                    }
                    b bVar10 = bVar2;
                    ps4<? super Function2<? super d, ? super Integer, Unit>, ? super d, ? super Integer, Unit> ps4Var9 = ps4VarE;
                    ImeOptions imeOptionsI7 = keyboardOptionsA.i(z10);
                    boolean z11110 = !z10;
                    qu0 qu0Var9 = solidColor;
                    if (z10) {
                        i39 = 1;
                    } else {
                        i39 = i38;
                    }
                    r48 r48Var10 = r48Var3;
                    if (z10) {
                        i40 = 1;
                    } else {
                        i40 = i37;
                    }
                    KeyboardOptions keyboardOptions9 = keyboardOptionsA;
                    if ((i6 & 14) == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z13 | ((i6 & 112) == 32);
                    objR2 = dVarF.R();
                    if (z14) {
                        objR2 = new Function1() { // from class: com.google.android.rh0
                            public final Object invoke(Object obj) {
                                return a.s(textFieldValue, function1, (TextFieldValue) obj);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        objR2 = new Function1() { // from class: com.google.android.rh0
                            public final Object invoke(Object obj) {
                                return a.s(textFieldValue, function1, (TextFieldValue) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    int i4110 = i34 << 9;
                    int i4111 = ((i6 >> 6) & 7168) | (i6 & 910) | (i4110 & 57344) | (i4110 & 458752) | (i4110 & 3670016) | (i4110 & 29360128);
                    int i4112 = (i6 & 7168) | ((i6 >> 15) & 896) | (57344 & i6) | (i34 & 458752);
                    dVar2 = dVarF;
                    TextStyle textStyle9 = textStyleA;
                    boolean z11111 = z10;
                    Function1<? super TextLayoutResult, Unit> function115 = function5;
                    CoreTextFieldKt.w(textFieldValue, (Function1) objR2, bVar10, textStyle9, nceVar9, function115, r48Var10, qu0Var9, z11110, i40, i39, imeOptionsI7, mVar4, z12, z11, ps4Var9, null, dVar2, i4111, i4112, 65536);
                    if (e.k()) {
                        e.n();
                    }
                    mVar3 = mVar4;
                    ps4Var2 = ps4Var9;
                    i35 = i37;
                    i36 = i38;
                    z9 = z11111;
                    nceVar2 = nceVar9;
                    qu0Var2 = qu0Var9;
                    z7 = z12;
                    keyboardOptions2 = keyboardOptions9;
                    function3 = function115;
                    z8 = z11;
                    r48Var2 = r48Var10;
                    textStyle2 = textStyle9;
                    bVar3 = bVar10;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    i35 = i;
                    nceVar2 = nceVar;
                    ps4Var2 = ps4Var;
                    z7 = z4;
                    mVar3 = mVar2;
                    z8 = z5;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    bVar3 = bVar2;
                    z9 = z3;
                    i36 = i2;
                    function3 = function2;
                    r48Var2 = r48Var;
                    qu0Var2 = qu0Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.sh0
                        public final Object invoke(Object obj, Object obj2) {
                            return a.t(textFieldValue, function1, bVar3, z7, z8, textStyle2, keyboardOptions2, mVar3, z9, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i32 = i30 | 24576;
            i33 = i5 & 32768;
            if (i33 != 0) {
                i32 |= 196608;
            } else if ((i4 & 196608) == 0) {
                i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
            }
            i34 = i32;
            if ((i6 & 306783379) == 306783378) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (dVarF.g(z6, i6 & 1)) {
                dVarF.U();
                if ((i3 & 1) != 0) {
                    if (i41 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i9 != 0) {
                        z5 = false;
                    }
                    if (i11 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i13 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i15 != 0) {
                        mVarA = m.INSTANCE.a();
                    } else {
                        mVarA = mVar2;
                    }
                    if (i17 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 512) != 0) {
                        if (z10) {
                            i37 = 1;
                        } else {
                            i37 = Integer.MAX_VALUE;
                        }
                        i6 &= -1879048193;
                    } else {
                        i37 = i;
                    }
                    if (i19 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i2;
                    }
                    if (i22 != 0) {
                        nceVarC = nce.INSTANCE.c();
                    } else {
                        nceVarC = nceVar;
                    }
                    mVar4 = mVarA;
                    if (i25 != 0) {
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1() { // from class: com.google.android.qh0
                                public final Object invoke(Object obj) {
                                    return a.r((TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR);
                        }
                        function4 = (Function1) objR;
                    } else {
                        function4 = function2;
                    }
                    if (i28 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    Function1<? super TextLayoutResult, Unit> function116 = function4;
                    if (i31 != 0) {
                        solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                    } else {
                        solidColor = qu0Var;
                    }
                    if (i33 != 0) {
                        boolean z11112 = z5;
                        ps4VarE = qo1.a.e();
                        z11 = z11112;
                    } else {
                        z11 = z5;
                        ps4VarE = ps4Var;
                    }
                    z12 = z4;
                    function5 = function116;
                } else {
                    if (i41 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i9 != 0) {
                        z5 = false;
                    }
                    if (i11 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i13 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i15 != 0) {
                        mVarA = m.INSTANCE.a();
                    } else {
                        mVarA = mVar2;
                    }
                    if (i17 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 512) != 0) {
                        if (z10) {
                            i37 = 1;
                        } else {
                            i37 = Integer.MAX_VALUE;
                        }
                        i6 &= -1879048193;
                    } else {
                        i37 = i;
                    }
                    if (i19 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i2;
                    }
                    if (i22 != 0) {
                        nceVarC = nce.INSTANCE.c();
                    } else {
                        nceVarC = nceVar;
                    }
                    mVar4 = mVarA;
                    if (i25 != 0) {
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1() { // from class: com.google.android.qh0
                                public final Object invoke(Object obj) {
                                    return a.r((TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR);
                        }
                        function4 = (Function1) objR;
                    } else {
                        function4 = function2;
                    }
                    if (i28 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    Function1<? super TextLayoutResult, Unit> function117 = function4;
                    if (i31 != 0) {
                        solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                    } else {
                        solidColor = qu0Var;
                    }
                    if (i33 != 0) {
                        boolean z11113 = z5;
                        ps4VarE = qo1.a.e();
                        z11 = z11113;
                    } else {
                        z11 = z5;
                        ps4VarE = ps4Var;
                    }
                    z12 = z4;
                    function5 = function117;
                }
                dVarF.M();
                nce nceVar10 = nceVarC;
                if (e.k()) {
                    e.o(-971111025, i6, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:933)");
                }
                b bVar11 = bVar2;
                ps4<? super Function2<? super d, ? super Integer, Unit>, ? super d, ? super Integer, Unit> ps4Var10 = ps4VarE;
                ImeOptions imeOptionsI8 = keyboardOptionsA.i(z10);
                boolean z11114 = !z10;
                qu0 qu0Var10 = solidColor;
                if (z10) {
                    i39 = 1;
                } else {
                    i39 = i38;
                }
                r48 r48Var11 = r48Var3;
                if (z10) {
                    i40 = 1;
                } else {
                    i40 = i37;
                }
                KeyboardOptions keyboardOptions10 = keyboardOptionsA;
                if ((i6 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | ((i6 & 112) == 32);
                objR2 = dVarF.R();
                if (z14) {
                    objR2 = new Function1() { // from class: com.google.android.rh0
                        public final Object invoke(Object obj) {
                            return a.s(textFieldValue, function1, (TextFieldValue) obj);
                        }
                    };
                    dVarF.L(objR2);
                } else {
                    objR2 = new Function1() { // from class: com.google.android.rh0
                        public final Object invoke(Object obj) {
                            return a.s(textFieldValue, function1, (TextFieldValue) obj);
                        }
                    };
                    dVarF.L(objR2);
                }
                int i4113 = i34 << 9;
                int i4114 = ((i6 >> 6) & 7168) | (i6 & 910) | (i4113 & 57344) | (i4113 & 458752) | (i4113 & 3670016) | (i4113 & 29360128);
                int i4115 = (i6 & 7168) | ((i6 >> 15) & 896) | (57344 & i6) | (i34 & 458752);
                dVar2 = dVarF;
                TextStyle textStyle10 = textStyleA;
                boolean z11115 = z10;
                Function1<? super TextLayoutResult, Unit> function118 = function5;
                CoreTextFieldKt.w(textFieldValue, (Function1) objR2, bVar11, textStyle10, nceVar10, function118, r48Var11, qu0Var10, z11114, i40, i39, imeOptionsI8, mVar4, z12, z11, ps4Var10, null, dVar2, i4114, i4115, 65536);
                if (e.k()) {
                    e.n();
                }
                mVar3 = mVar4;
                ps4Var2 = ps4Var10;
                i35 = i37;
                i36 = i38;
                z9 = z11115;
                nceVar2 = nceVar10;
                qu0Var2 = qu0Var10;
                z7 = z12;
                keyboardOptions2 = keyboardOptions10;
                function3 = function118;
                z8 = z11;
                r48Var2 = r48Var11;
                textStyle2 = textStyle10;
                bVar3 = bVar11;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                i35 = i;
                nceVar2 = nceVar;
                ps4Var2 = ps4Var;
                z7 = z4;
                mVar3 = mVar2;
                z8 = z5;
                textStyle2 = textStyleA;
                keyboardOptions2 = keyboardOptionsA;
                bVar3 = bVar2;
                z9 = z3;
                i36 = i2;
                function3 = function2;
                r48Var2 = r48Var;
                qu0Var2 = qu0Var;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.sh0
                    public final Object invoke(Object obj, Object obj2) {
                        return a.t(textFieldValue, function1, bVar3, z7, z8, textStyle2, keyboardOptions2, mVar3, z9, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i6 |= 384;
        bVar2 = bVar;
        i7 = i5 & 8;
        if (i7 != 0) {
            if ((i3 & 3072) == 0) {
                z4 = z;
                if (dVarF.A(z4)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i6 |= i8;
            }
            i9 = i5 & 16;
            if (i9 != 0) {
                if ((i3 & 24576) == 0) {
                    z5 = z2;
                    if (dVarF.A(z5)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i6 |= i10;
                }
                i11 = i5 & 32;
                if (i11 != 0) {
                    i6 |= 196608;
                    textStyleA = textStyle;
                } else {
                    textStyleA = textStyle;
                    if ((i3 & 196608) == 0) {
                        if (dVarF.x(textStyleA)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i6 |= i12;
                    }
                }
                i13 = i5 & 64;
                if (i13 != 0) {
                    i6 |= 1572864;
                    keyboardOptionsA = keyboardOptions;
                } else {
                    keyboardOptionsA = keyboardOptions;
                    if ((i3 & 1572864) == 0) {
                        if (dVarF.x(keyboardOptionsA)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i6 |= i14;
                    }
                }
                i15 = i5 & 128;
                if (i15 != 0) {
                    i6 |= 12582912;
                    mVar2 = mVar;
                } else {
                    mVar2 = mVar;
                    if ((i3 & 12582912) == 0) {
                        if (dVarF.x(mVar2)) {
                            i16 = 8388608;
                        } else {
                            i16 = 4194304;
                        }
                        i6 |= i16;
                    }
                }
                i17 = i5 & 256;
                if (i17 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 100663296) == 0) {
                    if (dVarF.A(z3)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i6 |= i18;
                }
                if ((i3 & 805306368) != 0) {
                    i6 |= ((i5 & 512) == 0 || !dVarF.C(i)) ? 268435456 : 536870912;
                }
                i19 = i5 & 1024;
                if (i19 != 0) {
                    i20 = i4 | 6;
                } else if ((i4 & 6) == 0) {
                    if (dVarF.C(i2)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i4 | i21;
                } else {
                    i20 = i4;
                }
                i22 = i5 & 2048;
                if (i22 != 0) {
                    i20 |= 48;
                } else if ((i4 & 48) != 0) {
                    if (dVarF.x(nceVar)) {
                        i23 = 32;
                    } else {
                        i23 = 16;
                    }
                    i20 |= i23;
                }
                i24 = i20;
                i25 = i5 & 4096;
                if (i25 != 0) {
                    i26 = i24 | 384;
                } else if ((i4 & 384) == 0) {
                    if (dVarF.T(function2)) {
                        i27 = 256;
                    } else {
                        i27 = 128;
                    }
                    i26 = i24 | i27;
                } else {
                    i26 = i24;
                }
                i28 = i5 & 8192;
                if (i28 != 0) {
                    i30 = i26 | 3072;
                } else {
                    i29 = i26;
                    if ((i4 & 3072) == 0) {
                        i30 = i29 | (dVarF.x(r48Var) ? 2048 : 1024);
                    } else {
                        i30 = i29;
                    }
                }
                i31 = i5 & 16384;
                if (i31 != 0) {
                    i32 = i30;
                    if ((i4 & 24576) == 0) {
                        i32 |= dVarF.x(qu0Var) ? 16384 : 8192;
                    }
                    i33 = i5 & 32768;
                    if (i33 != 0) {
                        i32 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
                    }
                    i34 = i32;
                    if ((i6 & 306783379) == 306783378) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (dVarF.g(z6, i6 & 1)) {
                        dVarF.U();
                        if ((i3 & 1) != 0) {
                            if (i41 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i7 != 0) {
                                z4 = true;
                            }
                            if (i9 != 0) {
                                z5 = false;
                            }
                            if (i11 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i13 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i15 != 0) {
                                mVarA = m.INSTANCE.a();
                            } else {
                                mVarA = mVar2;
                            }
                            if (i17 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if ((i5 & 512) != 0) {
                                if (z10) {
                                    i37 = 1;
                                } else {
                                    i37 = Integer.MAX_VALUE;
                                }
                                i6 &= -1879048193;
                            } else {
                                i37 = i;
                            }
                            if (i19 != 0) {
                                i38 = 1;
                            } else {
                                i38 = i2;
                            }
                            if (i22 != 0) {
                                nceVarC = nce.INSTANCE.c();
                            } else {
                                nceVarC = nceVar;
                            }
                            mVar4 = mVarA;
                            if (i25 != 0) {
                                objR = dVarF.R();
                                if (objR == d.INSTANCE.a()) {
                                    objR = new Function1() { // from class: com.google.android.qh0
                                        public final Object invoke(Object obj) {
                                            return a.r((TextLayoutResult) obj);
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function4 = (Function1) objR;
                            } else {
                                function4 = function2;
                            }
                            if (i28 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            Function1<? super TextLayoutResult, Unit> function119 = function4;
                            if (i31 != 0) {
                                solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                            } else {
                                solidColor = qu0Var;
                            }
                            if (i33 != 0) {
                                boolean z11116 = z5;
                                ps4VarE = qo1.a.e();
                                z11 = z11116;
                            } else {
                                z11 = z5;
                                ps4VarE = ps4Var;
                            }
                            z12 = z4;
                            function5 = function119;
                        } else {
                            if (i41 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i7 != 0) {
                                z4 = true;
                            }
                            if (i9 != 0) {
                                z5 = false;
                            }
                            if (i11 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i13 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i15 != 0) {
                                mVarA = m.INSTANCE.a();
                            } else {
                                mVarA = mVar2;
                            }
                            if (i17 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if ((i5 & 512) != 0) {
                                if (z10) {
                                    i37 = 1;
                                } else {
                                    i37 = Integer.MAX_VALUE;
                                }
                                i6 &= -1879048193;
                            } else {
                                i37 = i;
                            }
                            if (i19 != 0) {
                                i38 = 1;
                            } else {
                                i38 = i2;
                            }
                            if (i22 != 0) {
                                nceVarC = nce.INSTANCE.c();
                            } else {
                                nceVarC = nceVar;
                            }
                            mVar4 = mVarA;
                            if (i25 != 0) {
                                objR = dVarF.R();
                                if (objR == d.INSTANCE.a()) {
                                    objR = new Function1() { // from class: com.google.android.qh0
                                        public final Object invoke(Object obj) {
                                            return a.r((TextLayoutResult) obj);
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function4 = (Function1) objR;
                            } else {
                                function4 = function2;
                            }
                            if (i28 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            Function1<? super TextLayoutResult, Unit> function1110 = function4;
                            if (i31 != 0) {
                                solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                            } else {
                                solidColor = qu0Var;
                            }
                            if (i33 != 0) {
                                boolean z11117 = z5;
                                ps4VarE = qo1.a.e();
                                z11 = z11117;
                            } else {
                                z11 = z5;
                                ps4VarE = ps4Var;
                            }
                            z12 = z4;
                            function5 = function1110;
                        }
                        dVarF.M();
                        nce nceVar11 = nceVarC;
                        if (e.k()) {
                            e.o(-971111025, i6, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:933)");
                        }
                        b bVar12 = bVar2;
                        ps4<? super Function2<? super d, ? super Integer, Unit>, ? super d, ? super Integer, Unit> ps4Var11 = ps4VarE;
                        ImeOptions imeOptionsI9 = keyboardOptionsA.i(z10);
                        boolean z11118 = !z10;
                        qu0 qu0Var11 = solidColor;
                        if (z10) {
                            i39 = 1;
                        } else {
                            i39 = i38;
                        }
                        r48 r48Var12 = r48Var3;
                        if (z10) {
                            i40 = 1;
                        } else {
                            i40 = i37;
                        }
                        KeyboardOptions keyboardOptions11 = keyboardOptionsA;
                        if ((i6 & 14) == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = z13 | ((i6 & 112) == 32);
                        objR2 = dVarF.R();
                        if (z14) {
                            objR2 = new Function1() { // from class: com.google.android.rh0
                                public final Object invoke(Object obj) {
                                    return a.s(textFieldValue, function1, (TextFieldValue) obj);
                                }
                            };
                            dVarF.L(objR2);
                        } else {
                            objR2 = new Function1() { // from class: com.google.android.rh0
                                public final Object invoke(Object obj) {
                                    return a.s(textFieldValue, function1, (TextFieldValue) obj);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        int i4116 = i34 << 9;
                        int i4117 = ((i6 >> 6) & 7168) | (i6 & 910) | (i4116 & 57344) | (i4116 & 458752) | (i4116 & 3670016) | (i4116 & 29360128);
                        int i4118 = (i6 & 7168) | ((i6 >> 15) & 896) | (57344 & i6) | (i34 & 458752);
                        dVar2 = dVarF;
                        TextStyle textStyle11 = textStyleA;
                        boolean z11119 = z10;
                        Function1<? super TextLayoutResult, Unit> function1111 = function5;
                        CoreTextFieldKt.w(textFieldValue, (Function1) objR2, bVar12, textStyle11, nceVar11, function1111, r48Var12, qu0Var11, z11118, i40, i39, imeOptionsI9, mVar4, z12, z11, ps4Var11, null, dVar2, i4117, i4118, 65536);
                        if (e.k()) {
                            e.n();
                        }
                        mVar3 = mVar4;
                        ps4Var2 = ps4Var11;
                        i35 = i37;
                        i36 = i38;
                        z9 = z11119;
                        nceVar2 = nceVar11;
                        qu0Var2 = qu0Var11;
                        z7 = z12;
                        keyboardOptions2 = keyboardOptions11;
                        function3 = function1111;
                        z8 = z11;
                        r48Var2 = r48Var12;
                        textStyle2 = textStyle11;
                        bVar3 = bVar12;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        i35 = i;
                        nceVar2 = nceVar;
                        ps4Var2 = ps4Var;
                        z7 = z4;
                        mVar3 = mVar2;
                        z8 = z5;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        bVar3 = bVar2;
                        z9 = z3;
                        i36 = i2;
                        function3 = function2;
                        r48Var2 = r48Var;
                        qu0Var2 = qu0Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.sh0
                            public final Object invoke(Object obj, Object obj2) {
                                return a.t(textFieldValue, function1, bVar3, z7, z8, textStyle2, keyboardOptions2, mVar3, z9, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i32 = i30 | 24576;
                i33 = i5 & 32768;
                if (i33 != 0) {
                    i32 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
                }
                i34 = i32;
                if ((i6 & 306783379) == 306783378) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (dVarF.g(z6, i6 & 1)) {
                    dVarF.U();
                    if ((i3 & 1) != 0) {
                        if (i41 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i13 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i15 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i37 = 1;
                            } else {
                                i37 = Integer.MAX_VALUE;
                            }
                            i6 &= -1879048193;
                        } else {
                            i37 = i;
                        }
                        if (i19 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i2;
                        }
                        if (i22 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        } else {
                            nceVarC = nceVar;
                        }
                        mVar4 = mVarA;
                        if (i25 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.qh0
                                    public final Object invoke(Object obj) {
                                        return a.r((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        } else {
                            function4 = function2;
                        }
                        if (i28 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        Function1<? super TextLayoutResult, Unit> function1112 = function4;
                        if (i31 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                        } else {
                            solidColor = qu0Var;
                        }
                        if (i33 != 0) {
                            boolean z111110 = z5;
                            ps4VarE = qo1.a.e();
                            z11 = z111110;
                        } else {
                            z11 = z5;
                            ps4VarE = ps4Var;
                        }
                        z12 = z4;
                        function5 = function1112;
                    } else {
                        if (i41 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i13 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i15 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i37 = 1;
                            } else {
                                i37 = Integer.MAX_VALUE;
                            }
                            i6 &= -1879048193;
                        } else {
                            i37 = i;
                        }
                        if (i19 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i2;
                        }
                        if (i22 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        } else {
                            nceVarC = nceVar;
                        }
                        mVar4 = mVarA;
                        if (i25 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.qh0
                                    public final Object invoke(Object obj) {
                                        return a.r((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        } else {
                            function4 = function2;
                        }
                        if (i28 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        Function1<? super TextLayoutResult, Unit> function1113 = function4;
                        if (i31 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                        } else {
                            solidColor = qu0Var;
                        }
                        if (i33 != 0) {
                            boolean z111111 = z5;
                            ps4VarE = qo1.a.e();
                            z11 = z111111;
                        } else {
                            z11 = z5;
                            ps4VarE = ps4Var;
                        }
                        z12 = z4;
                        function5 = function1113;
                    }
                    dVarF.M();
                    nce nceVar12 = nceVarC;
                    if (e.k()) {
                        e.o(-971111025, i6, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:933)");
                    }
                    b bVar13 = bVar2;
                    ps4<? super Function2<? super d, ? super Integer, Unit>, ? super d, ? super Integer, Unit> ps4Var12 = ps4VarE;
                    ImeOptions imeOptionsI10 = keyboardOptionsA.i(z10);
                    boolean z111112 = !z10;
                    qu0 qu0Var12 = solidColor;
                    if (z10) {
                        i39 = 1;
                    } else {
                        i39 = i38;
                    }
                    r48 r48Var13 = r48Var3;
                    if (z10) {
                        i40 = 1;
                    } else {
                        i40 = i37;
                    }
                    KeyboardOptions keyboardOptions12 = keyboardOptionsA;
                    if ((i6 & 14) == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z13 | ((i6 & 112) == 32);
                    objR2 = dVarF.R();
                    if (z14) {
                        objR2 = new Function1() { // from class: com.google.android.rh0
                            public final Object invoke(Object obj) {
                                return a.s(textFieldValue, function1, (TextFieldValue) obj);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        objR2 = new Function1() { // from class: com.google.android.rh0
                            public final Object invoke(Object obj) {
                                return a.s(textFieldValue, function1, (TextFieldValue) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    int i4119 = i34 << 9;
                    int i41110 = ((i6 >> 6) & 7168) | (i6 & 910) | (i4119 & 57344) | (i4119 & 458752) | (i4119 & 3670016) | (i4119 & 29360128);
                    int i41111 = (i6 & 7168) | ((i6 >> 15) & 896) | (57344 & i6) | (i34 & 458752);
                    dVar2 = dVarF;
                    TextStyle textStyle12 = textStyleA;
                    boolean z111113 = z10;
                    Function1<? super TextLayoutResult, Unit> function1114 = function5;
                    CoreTextFieldKt.w(textFieldValue, (Function1) objR2, bVar13, textStyle12, nceVar12, function1114, r48Var13, qu0Var12, z111112, i40, i39, imeOptionsI10, mVar4, z12, z11, ps4Var12, null, dVar2, i41110, i41111, 65536);
                    if (e.k()) {
                        e.n();
                    }
                    mVar3 = mVar4;
                    ps4Var2 = ps4Var12;
                    i35 = i37;
                    i36 = i38;
                    z9 = z111113;
                    nceVar2 = nceVar12;
                    qu0Var2 = qu0Var12;
                    z7 = z12;
                    keyboardOptions2 = keyboardOptions12;
                    function3 = function1114;
                    z8 = z11;
                    r48Var2 = r48Var13;
                    textStyle2 = textStyle12;
                    bVar3 = bVar13;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    i35 = i;
                    nceVar2 = nceVar;
                    ps4Var2 = ps4Var;
                    z7 = z4;
                    mVar3 = mVar2;
                    z8 = z5;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    bVar3 = bVar2;
                    z9 = z3;
                    i36 = i2;
                    function3 = function2;
                    r48Var2 = r48Var;
                    qu0Var2 = qu0Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.sh0
                        public final Object invoke(Object obj, Object obj2) {
                            return a.t(textFieldValue, function1, bVar3, z7, z8, textStyle2, keyboardOptions2, mVar3, z9, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i6 |= 24576;
            z5 = z2;
            i11 = i5 & 32;
            if (i11 != 0) {
                i6 |= 196608;
                textStyleA = textStyle;
            } else {
                textStyleA = textStyle;
                if ((i3 & 196608) == 0) {
                    if (dVarF.x(textStyleA)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i6 |= i12;
                }
            }
            i13 = i5 & 64;
            if (i13 != 0) {
                i6 |= 1572864;
                keyboardOptionsA = keyboardOptions;
            } else {
                keyboardOptionsA = keyboardOptions;
                if ((i3 & 1572864) == 0) {
                    if (dVarF.x(keyboardOptionsA)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i6 |= i14;
                }
            }
            i15 = i5 & 128;
            if (i15 != 0) {
                i6 |= 12582912;
                mVar2 = mVar;
            } else {
                mVar2 = mVar;
                if ((i3 & 12582912) == 0) {
                    if (dVarF.x(mVar2)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i6 |= i16;
                }
            }
            i17 = i5 & 256;
            if (i17 != 0) {
                i6 |= 100663296;
            } else if ((i3 & 100663296) == 0) {
                if (dVarF.A(z3)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i6 |= i18;
            }
            if ((i3 & 805306368) != 0) {
                i6 |= ((i5 & 512) == 0 || !dVarF.C(i)) ? 268435456 : 536870912;
            }
            i19 = i5 & 1024;
            if (i19 != 0) {
                i20 = i4 | 6;
            } else if ((i4 & 6) == 0) {
                if (dVarF.C(i2)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i20 = i4 | i21;
            } else {
                i20 = i4;
            }
            i22 = i5 & 2048;
            if (i22 != 0) {
                i20 |= 48;
            } else if ((i4 & 48) != 0) {
                if (dVarF.x(nceVar)) {
                    i23 = 32;
                } else {
                    i23 = 16;
                }
                i20 |= i23;
            }
            i24 = i20;
            i25 = i5 & 4096;
            if (i25 != 0) {
                i26 = i24 | 384;
            } else if ((i4 & 384) == 0) {
                if (dVarF.T(function2)) {
                    i27 = 256;
                } else {
                    i27 = 128;
                }
                i26 = i24 | i27;
            } else {
                i26 = i24;
            }
            i28 = i5 & 8192;
            if (i28 != 0) {
                i30 = i26 | 3072;
            } else {
                i29 = i26;
                if ((i4 & 3072) == 0) {
                    i30 = i29 | (dVarF.x(r48Var) ? 2048 : 1024);
                } else {
                    i30 = i29;
                }
            }
            i31 = i5 & 16384;
            if (i31 != 0) {
                i32 = i30;
                if ((i4 & 24576) == 0) {
                    i32 |= dVarF.x(qu0Var) ? 16384 : 8192;
                }
                i33 = i5 & 32768;
                if (i33 != 0) {
                    i32 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
                }
                i34 = i32;
                if ((i6 & 306783379) == 306783378) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (dVarF.g(z6, i6 & 1)) {
                    dVarF.U();
                    if ((i3 & 1) != 0) {
                        if (i41 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i13 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i15 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i37 = 1;
                            } else {
                                i37 = Integer.MAX_VALUE;
                            }
                            i6 &= -1879048193;
                        } else {
                            i37 = i;
                        }
                        if (i19 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i2;
                        }
                        if (i22 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        } else {
                            nceVarC = nceVar;
                        }
                        mVar4 = mVarA;
                        if (i25 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.qh0
                                    public final Object invoke(Object obj) {
                                        return a.r((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        } else {
                            function4 = function2;
                        }
                        if (i28 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        Function1<? super TextLayoutResult, Unit> function1115 = function4;
                        if (i31 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                        } else {
                            solidColor = qu0Var;
                        }
                        if (i33 != 0) {
                            boolean z111114 = z5;
                            ps4VarE = qo1.a.e();
                            z11 = z111114;
                        } else {
                            z11 = z5;
                            ps4VarE = ps4Var;
                        }
                        z12 = z4;
                        function5 = function1115;
                    } else {
                        if (i41 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i13 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i15 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i37 = 1;
                            } else {
                                i37 = Integer.MAX_VALUE;
                            }
                            i6 &= -1879048193;
                        } else {
                            i37 = i;
                        }
                        if (i19 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i2;
                        }
                        if (i22 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        } else {
                            nceVarC = nceVar;
                        }
                        mVar4 = mVarA;
                        if (i25 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.qh0
                                    public final Object invoke(Object obj) {
                                        return a.r((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        } else {
                            function4 = function2;
                        }
                        if (i28 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        Function1<? super TextLayoutResult, Unit> function1116 = function4;
                        if (i31 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                        } else {
                            solidColor = qu0Var;
                        }
                        if (i33 != 0) {
                            boolean z111115 = z5;
                            ps4VarE = qo1.a.e();
                            z11 = z111115;
                        } else {
                            z11 = z5;
                            ps4VarE = ps4Var;
                        }
                        z12 = z4;
                        function5 = function1116;
                    }
                    dVarF.M();
                    nce nceVar13 = nceVarC;
                    if (e.k()) {
                        e.o(-971111025, i6, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:933)");
                    }
                    b bVar14 = bVar2;
                    ps4<? super Function2<? super d, ? super Integer, Unit>, ? super d, ? super Integer, Unit> ps4Var13 = ps4VarE;
                    ImeOptions imeOptionsI11 = keyboardOptionsA.i(z10);
                    boolean z111116 = !z10;
                    qu0 qu0Var13 = solidColor;
                    if (z10) {
                        i39 = 1;
                    } else {
                        i39 = i38;
                    }
                    r48 r48Var14 = r48Var3;
                    if (z10) {
                        i40 = 1;
                    } else {
                        i40 = i37;
                    }
                    KeyboardOptions keyboardOptions13 = keyboardOptionsA;
                    if ((i6 & 14) == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z13 | ((i6 & 112) == 32);
                    objR2 = dVarF.R();
                    if (z14) {
                        objR2 = new Function1() { // from class: com.google.android.rh0
                            public final Object invoke(Object obj) {
                                return a.s(textFieldValue, function1, (TextFieldValue) obj);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        objR2 = new Function1() { // from class: com.google.android.rh0
                            public final Object invoke(Object obj) {
                                return a.s(textFieldValue, function1, (TextFieldValue) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    int i41112 = i34 << 9;
                    int i41113 = ((i6 >> 6) & 7168) | (i6 & 910) | (i41112 & 57344) | (i41112 & 458752) | (i41112 & 3670016) | (i41112 & 29360128);
                    int i41114 = (i6 & 7168) | ((i6 >> 15) & 896) | (57344 & i6) | (i34 & 458752);
                    dVar2 = dVarF;
                    TextStyle textStyle13 = textStyleA;
                    boolean z111117 = z10;
                    Function1<? super TextLayoutResult, Unit> function1117 = function5;
                    CoreTextFieldKt.w(textFieldValue, (Function1) objR2, bVar14, textStyle13, nceVar13, function1117, r48Var14, qu0Var13, z111116, i40, i39, imeOptionsI11, mVar4, z12, z11, ps4Var13, null, dVar2, i41113, i41114, 65536);
                    if (e.k()) {
                        e.n();
                    }
                    mVar3 = mVar4;
                    ps4Var2 = ps4Var13;
                    i35 = i37;
                    i36 = i38;
                    z9 = z111117;
                    nceVar2 = nceVar13;
                    qu0Var2 = qu0Var13;
                    z7 = z12;
                    keyboardOptions2 = keyboardOptions13;
                    function3 = function1117;
                    z8 = z11;
                    r48Var2 = r48Var14;
                    textStyle2 = textStyle13;
                    bVar3 = bVar14;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    i35 = i;
                    nceVar2 = nceVar;
                    ps4Var2 = ps4Var;
                    z7 = z4;
                    mVar3 = mVar2;
                    z8 = z5;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    bVar3 = bVar2;
                    z9 = z3;
                    i36 = i2;
                    function3 = function2;
                    r48Var2 = r48Var;
                    qu0Var2 = qu0Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.sh0
                        public final Object invoke(Object obj, Object obj2) {
                            return a.t(textFieldValue, function1, bVar3, z7, z8, textStyle2, keyboardOptions2, mVar3, z9, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i32 = i30 | 24576;
            i33 = i5 & 32768;
            if (i33 != 0) {
                i32 |= 196608;
            } else if ((i4 & 196608) == 0) {
                i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
            }
            i34 = i32;
            if ((i6 & 306783379) == 306783378) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (dVarF.g(z6, i6 & 1)) {
                dVarF.U();
                if ((i3 & 1) != 0) {
                    if (i41 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i9 != 0) {
                        z5 = false;
                    }
                    if (i11 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i13 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i15 != 0) {
                        mVarA = m.INSTANCE.a();
                    } else {
                        mVarA = mVar2;
                    }
                    if (i17 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 512) != 0) {
                        if (z10) {
                            i37 = 1;
                        } else {
                            i37 = Integer.MAX_VALUE;
                        }
                        i6 &= -1879048193;
                    } else {
                        i37 = i;
                    }
                    if (i19 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i2;
                    }
                    if (i22 != 0) {
                        nceVarC = nce.INSTANCE.c();
                    } else {
                        nceVarC = nceVar;
                    }
                    mVar4 = mVarA;
                    if (i25 != 0) {
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1() { // from class: com.google.android.qh0
                                public final Object invoke(Object obj) {
                                    return a.r((TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR);
                        }
                        function4 = (Function1) objR;
                    } else {
                        function4 = function2;
                    }
                    if (i28 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    Function1<? super TextLayoutResult, Unit> function1118 = function4;
                    if (i31 != 0) {
                        solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                    } else {
                        solidColor = qu0Var;
                    }
                    if (i33 != 0) {
                        boolean z111118 = z5;
                        ps4VarE = qo1.a.e();
                        z11 = z111118;
                    } else {
                        z11 = z5;
                        ps4VarE = ps4Var;
                    }
                    z12 = z4;
                    function5 = function1118;
                } else {
                    if (i41 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i9 != 0) {
                        z5 = false;
                    }
                    if (i11 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i13 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i15 != 0) {
                        mVarA = m.INSTANCE.a();
                    } else {
                        mVarA = mVar2;
                    }
                    if (i17 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 512) != 0) {
                        if (z10) {
                            i37 = 1;
                        } else {
                            i37 = Integer.MAX_VALUE;
                        }
                        i6 &= -1879048193;
                    } else {
                        i37 = i;
                    }
                    if (i19 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i2;
                    }
                    if (i22 != 0) {
                        nceVarC = nce.INSTANCE.c();
                    } else {
                        nceVarC = nceVar;
                    }
                    mVar4 = mVarA;
                    if (i25 != 0) {
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1() { // from class: com.google.android.qh0
                                public final Object invoke(Object obj) {
                                    return a.r((TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR);
                        }
                        function4 = (Function1) objR;
                    } else {
                        function4 = function2;
                    }
                    if (i28 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    Function1<? super TextLayoutResult, Unit> function1119 = function4;
                    if (i31 != 0) {
                        solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                    } else {
                        solidColor = qu0Var;
                    }
                    if (i33 != 0) {
                        boolean z111119 = z5;
                        ps4VarE = qo1.a.e();
                        z11 = z111119;
                    } else {
                        z11 = z5;
                        ps4VarE = ps4Var;
                    }
                    z12 = z4;
                    function5 = function1119;
                }
                dVarF.M();
                nce nceVar14 = nceVarC;
                if (e.k()) {
                    e.o(-971111025, i6, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:933)");
                }
                b bVar15 = bVar2;
                ps4<? super Function2<? super d, ? super Integer, Unit>, ? super d, ? super Integer, Unit> ps4Var14 = ps4VarE;
                ImeOptions imeOptionsI12 = keyboardOptionsA.i(z10);
                boolean z1111110 = !z10;
                qu0 qu0Var14 = solidColor;
                if (z10) {
                    i39 = 1;
                } else {
                    i39 = i38;
                }
                r48 r48Var15 = r48Var3;
                if (z10) {
                    i40 = 1;
                } else {
                    i40 = i37;
                }
                KeyboardOptions keyboardOptions14 = keyboardOptionsA;
                if ((i6 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | ((i6 & 112) == 32);
                objR2 = dVarF.R();
                if (z14) {
                    objR2 = new Function1() { // from class: com.google.android.rh0
                        public final Object invoke(Object obj) {
                            return a.s(textFieldValue, function1, (TextFieldValue) obj);
                        }
                    };
                    dVarF.L(objR2);
                } else {
                    objR2 = new Function1() { // from class: com.google.android.rh0
                        public final Object invoke(Object obj) {
                            return a.s(textFieldValue, function1, (TextFieldValue) obj);
                        }
                    };
                    dVarF.L(objR2);
                }
                int i41115 = i34 << 9;
                int i41116 = ((i6 >> 6) & 7168) | (i6 & 910) | (i41115 & 57344) | (i41115 & 458752) | (i41115 & 3670016) | (i41115 & 29360128);
                int i41117 = (i6 & 7168) | ((i6 >> 15) & 896) | (57344 & i6) | (i34 & 458752);
                dVar2 = dVarF;
                TextStyle textStyle14 = textStyleA;
                boolean z1111111 = z10;
                Function1<? super TextLayoutResult, Unit> function11110 = function5;
                CoreTextFieldKt.w(textFieldValue, (Function1) objR2, bVar15, textStyle14, nceVar14, function11110, r48Var15, qu0Var14, z1111110, i40, i39, imeOptionsI12, mVar4, z12, z11, ps4Var14, null, dVar2, i41116, i41117, 65536);
                if (e.k()) {
                    e.n();
                }
                mVar3 = mVar4;
                ps4Var2 = ps4Var14;
                i35 = i37;
                i36 = i38;
                z9 = z1111111;
                nceVar2 = nceVar14;
                qu0Var2 = qu0Var14;
                z7 = z12;
                keyboardOptions2 = keyboardOptions14;
                function3 = function11110;
                z8 = z11;
                r48Var2 = r48Var15;
                textStyle2 = textStyle14;
                bVar3 = bVar15;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                i35 = i;
                nceVar2 = nceVar;
                ps4Var2 = ps4Var;
                z7 = z4;
                mVar3 = mVar2;
                z8 = z5;
                textStyle2 = textStyleA;
                keyboardOptions2 = keyboardOptionsA;
                bVar3 = bVar2;
                z9 = z3;
                i36 = i2;
                function3 = function2;
                r48Var2 = r48Var;
                qu0Var2 = qu0Var;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.sh0
                    public final Object invoke(Object obj, Object obj2) {
                        return a.t(textFieldValue, function1, bVar3, z7, z8, textStyle2, keyboardOptions2, mVar3, z9, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i6 |= 3072;
        z4 = z;
        i9 = i5 & 16;
        if (i9 != 0) {
            if ((i3 & 24576) == 0) {
                z5 = z2;
                if (dVarF.A(z5)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i6 |= i10;
            }
            i11 = i5 & 32;
            if (i11 != 0) {
                i6 |= 196608;
                textStyleA = textStyle;
            } else {
                textStyleA = textStyle;
                if ((i3 & 196608) == 0) {
                    if (dVarF.x(textStyleA)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i6 |= i12;
                }
            }
            i13 = i5 & 64;
            if (i13 != 0) {
                i6 |= 1572864;
                keyboardOptionsA = keyboardOptions;
            } else {
                keyboardOptionsA = keyboardOptions;
                if ((i3 & 1572864) == 0) {
                    if (dVarF.x(keyboardOptionsA)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i6 |= i14;
                }
            }
            i15 = i5 & 128;
            if (i15 != 0) {
                i6 |= 12582912;
                mVar2 = mVar;
            } else {
                mVar2 = mVar;
                if ((i3 & 12582912) == 0) {
                    if (dVarF.x(mVar2)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i6 |= i16;
                }
            }
            i17 = i5 & 256;
            if (i17 != 0) {
                i6 |= 100663296;
            } else if ((i3 & 100663296) == 0) {
                if (dVarF.A(z3)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i6 |= i18;
            }
            if ((i3 & 805306368) != 0) {
                i6 |= ((i5 & 512) == 0 || !dVarF.C(i)) ? 268435456 : 536870912;
            }
            i19 = i5 & 1024;
            if (i19 != 0) {
                i20 = i4 | 6;
            } else if ((i4 & 6) == 0) {
                if (dVarF.C(i2)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i20 = i4 | i21;
            } else {
                i20 = i4;
            }
            i22 = i5 & 2048;
            if (i22 != 0) {
                i20 |= 48;
            } else if ((i4 & 48) != 0) {
                if (dVarF.x(nceVar)) {
                    i23 = 32;
                } else {
                    i23 = 16;
                }
                i20 |= i23;
            }
            i24 = i20;
            i25 = i5 & 4096;
            if (i25 != 0) {
                i26 = i24 | 384;
            } else if ((i4 & 384) == 0) {
                if (dVarF.T(function2)) {
                    i27 = 256;
                } else {
                    i27 = 128;
                }
                i26 = i24 | i27;
            } else {
                i26 = i24;
            }
            i28 = i5 & 8192;
            if (i28 != 0) {
                i30 = i26 | 3072;
            } else {
                i29 = i26;
                if ((i4 & 3072) == 0) {
                    i30 = i29 | (dVarF.x(r48Var) ? 2048 : 1024);
                } else {
                    i30 = i29;
                }
            }
            i31 = i5 & 16384;
            if (i31 != 0) {
                i32 = i30;
                if ((i4 & 24576) == 0) {
                    i32 |= dVarF.x(qu0Var) ? 16384 : 8192;
                }
                i33 = i5 & 32768;
                if (i33 != 0) {
                    i32 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
                }
                i34 = i32;
                if ((i6 & 306783379) == 306783378) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (dVarF.g(z6, i6 & 1)) {
                    dVarF.U();
                    if ((i3 & 1) != 0) {
                        if (i41 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i13 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i15 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i37 = 1;
                            } else {
                                i37 = Integer.MAX_VALUE;
                            }
                            i6 &= -1879048193;
                        } else {
                            i37 = i;
                        }
                        if (i19 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i2;
                        }
                        if (i22 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        } else {
                            nceVarC = nceVar;
                        }
                        mVar4 = mVarA;
                        if (i25 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.qh0
                                    public final Object invoke(Object obj) {
                                        return a.r((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        } else {
                            function4 = function2;
                        }
                        if (i28 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        Function1<? super TextLayoutResult, Unit> function11111 = function4;
                        if (i31 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                        } else {
                            solidColor = qu0Var;
                        }
                        if (i33 != 0) {
                            boolean z1111112 = z5;
                            ps4VarE = qo1.a.e();
                            z11 = z1111112;
                        } else {
                            z11 = z5;
                            ps4VarE = ps4Var;
                        }
                        z12 = z4;
                        function5 = function11111;
                    } else {
                        if (i41 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i13 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i15 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i37 = 1;
                            } else {
                                i37 = Integer.MAX_VALUE;
                            }
                            i6 &= -1879048193;
                        } else {
                            i37 = i;
                        }
                        if (i19 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i2;
                        }
                        if (i22 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        } else {
                            nceVarC = nceVar;
                        }
                        mVar4 = mVarA;
                        if (i25 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.qh0
                                    public final Object invoke(Object obj) {
                                        return a.r((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        } else {
                            function4 = function2;
                        }
                        if (i28 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        Function1<? super TextLayoutResult, Unit> function11112 = function4;
                        if (i31 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                        } else {
                            solidColor = qu0Var;
                        }
                        if (i33 != 0) {
                            boolean z1111113 = z5;
                            ps4VarE = qo1.a.e();
                            z11 = z1111113;
                        } else {
                            z11 = z5;
                            ps4VarE = ps4Var;
                        }
                        z12 = z4;
                        function5 = function11112;
                    }
                    dVarF.M();
                    nce nceVar15 = nceVarC;
                    if (e.k()) {
                        e.o(-971111025, i6, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:933)");
                    }
                    b bVar16 = bVar2;
                    ps4<? super Function2<? super d, ? super Integer, Unit>, ? super d, ? super Integer, Unit> ps4Var15 = ps4VarE;
                    ImeOptions imeOptionsI13 = keyboardOptionsA.i(z10);
                    boolean z1111114 = !z10;
                    qu0 qu0Var15 = solidColor;
                    if (z10) {
                        i39 = 1;
                    } else {
                        i39 = i38;
                    }
                    r48 r48Var16 = r48Var3;
                    if (z10) {
                        i40 = 1;
                    } else {
                        i40 = i37;
                    }
                    KeyboardOptions keyboardOptions15 = keyboardOptionsA;
                    if ((i6 & 14) == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z13 | ((i6 & 112) == 32);
                    objR2 = dVarF.R();
                    if (z14) {
                        objR2 = new Function1() { // from class: com.google.android.rh0
                            public final Object invoke(Object obj) {
                                return a.s(textFieldValue, function1, (TextFieldValue) obj);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        objR2 = new Function1() { // from class: com.google.android.rh0
                            public final Object invoke(Object obj) {
                                return a.s(textFieldValue, function1, (TextFieldValue) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    int i41118 = i34 << 9;
                    int i41119 = ((i6 >> 6) & 7168) | (i6 & 910) | (i41118 & 57344) | (i41118 & 458752) | (i41118 & 3670016) | (i41118 & 29360128);
                    int i411110 = (i6 & 7168) | ((i6 >> 15) & 896) | (57344 & i6) | (i34 & 458752);
                    dVar2 = dVarF;
                    TextStyle textStyle15 = textStyleA;
                    boolean z1111115 = z10;
                    Function1<? super TextLayoutResult, Unit> function11113 = function5;
                    CoreTextFieldKt.w(textFieldValue, (Function1) objR2, bVar16, textStyle15, nceVar15, function11113, r48Var16, qu0Var15, z1111114, i40, i39, imeOptionsI13, mVar4, z12, z11, ps4Var15, null, dVar2, i41119, i411110, 65536);
                    if (e.k()) {
                        e.n();
                    }
                    mVar3 = mVar4;
                    ps4Var2 = ps4Var15;
                    i35 = i37;
                    i36 = i38;
                    z9 = z1111115;
                    nceVar2 = nceVar15;
                    qu0Var2 = qu0Var15;
                    z7 = z12;
                    keyboardOptions2 = keyboardOptions15;
                    function3 = function11113;
                    z8 = z11;
                    r48Var2 = r48Var16;
                    textStyle2 = textStyle15;
                    bVar3 = bVar16;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    i35 = i;
                    nceVar2 = nceVar;
                    ps4Var2 = ps4Var;
                    z7 = z4;
                    mVar3 = mVar2;
                    z8 = z5;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    bVar3 = bVar2;
                    z9 = z3;
                    i36 = i2;
                    function3 = function2;
                    r48Var2 = r48Var;
                    qu0Var2 = qu0Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.sh0
                        public final Object invoke(Object obj, Object obj2) {
                            return a.t(textFieldValue, function1, bVar3, z7, z8, textStyle2, keyboardOptions2, mVar3, z9, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i32 = i30 | 24576;
            i33 = i5 & 32768;
            if (i33 != 0) {
                i32 |= 196608;
            } else if ((i4 & 196608) == 0) {
                i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
            }
            i34 = i32;
            if ((i6 & 306783379) == 306783378) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (dVarF.g(z6, i6 & 1)) {
                dVarF.U();
                if ((i3 & 1) != 0) {
                    if (i41 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i9 != 0) {
                        z5 = false;
                    }
                    if (i11 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i13 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i15 != 0) {
                        mVarA = m.INSTANCE.a();
                    } else {
                        mVarA = mVar2;
                    }
                    if (i17 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 512) != 0) {
                        if (z10) {
                            i37 = 1;
                        } else {
                            i37 = Integer.MAX_VALUE;
                        }
                        i6 &= -1879048193;
                    } else {
                        i37 = i;
                    }
                    if (i19 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i2;
                    }
                    if (i22 != 0) {
                        nceVarC = nce.INSTANCE.c();
                    } else {
                        nceVarC = nceVar;
                    }
                    mVar4 = mVarA;
                    if (i25 != 0) {
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1() { // from class: com.google.android.qh0
                                public final Object invoke(Object obj) {
                                    return a.r((TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR);
                        }
                        function4 = (Function1) objR;
                    } else {
                        function4 = function2;
                    }
                    if (i28 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    Function1<? super TextLayoutResult, Unit> function11114 = function4;
                    if (i31 != 0) {
                        solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                    } else {
                        solidColor = qu0Var;
                    }
                    if (i33 != 0) {
                        boolean z1111116 = z5;
                        ps4VarE = qo1.a.e();
                        z11 = z1111116;
                    } else {
                        z11 = z5;
                        ps4VarE = ps4Var;
                    }
                    z12 = z4;
                    function5 = function11114;
                } else {
                    if (i41 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i9 != 0) {
                        z5 = false;
                    }
                    if (i11 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i13 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i15 != 0) {
                        mVarA = m.INSTANCE.a();
                    } else {
                        mVarA = mVar2;
                    }
                    if (i17 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 512) != 0) {
                        if (z10) {
                            i37 = 1;
                        } else {
                            i37 = Integer.MAX_VALUE;
                        }
                        i6 &= -1879048193;
                    } else {
                        i37 = i;
                    }
                    if (i19 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i2;
                    }
                    if (i22 != 0) {
                        nceVarC = nce.INSTANCE.c();
                    } else {
                        nceVarC = nceVar;
                    }
                    mVar4 = mVarA;
                    if (i25 != 0) {
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1() { // from class: com.google.android.qh0
                                public final Object invoke(Object obj) {
                                    return a.r((TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR);
                        }
                        function4 = (Function1) objR;
                    } else {
                        function4 = function2;
                    }
                    if (i28 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    Function1<? super TextLayoutResult, Unit> function11115 = function4;
                    if (i31 != 0) {
                        solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                    } else {
                        solidColor = qu0Var;
                    }
                    if (i33 != 0) {
                        boolean z1111117 = z5;
                        ps4VarE = qo1.a.e();
                        z11 = z1111117;
                    } else {
                        z11 = z5;
                        ps4VarE = ps4Var;
                    }
                    z12 = z4;
                    function5 = function11115;
                }
                dVarF.M();
                nce nceVar16 = nceVarC;
                if (e.k()) {
                    e.o(-971111025, i6, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:933)");
                }
                b bVar17 = bVar2;
                ps4<? super Function2<? super d, ? super Integer, Unit>, ? super d, ? super Integer, Unit> ps4Var16 = ps4VarE;
                ImeOptions imeOptionsI14 = keyboardOptionsA.i(z10);
                boolean z1111118 = !z10;
                qu0 qu0Var16 = solidColor;
                if (z10) {
                    i39 = 1;
                } else {
                    i39 = i38;
                }
                r48 r48Var17 = r48Var3;
                if (z10) {
                    i40 = 1;
                } else {
                    i40 = i37;
                }
                KeyboardOptions keyboardOptions16 = keyboardOptionsA;
                if ((i6 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | ((i6 & 112) == 32);
                objR2 = dVarF.R();
                if (z14) {
                    objR2 = new Function1() { // from class: com.google.android.rh0
                        public final Object invoke(Object obj) {
                            return a.s(textFieldValue, function1, (TextFieldValue) obj);
                        }
                    };
                    dVarF.L(objR2);
                } else {
                    objR2 = new Function1() { // from class: com.google.android.rh0
                        public final Object invoke(Object obj) {
                            return a.s(textFieldValue, function1, (TextFieldValue) obj);
                        }
                    };
                    dVarF.L(objR2);
                }
                int i411111 = i34 << 9;
                int i411112 = ((i6 >> 6) & 7168) | (i6 & 910) | (i411111 & 57344) | (i411111 & 458752) | (i411111 & 3670016) | (i411111 & 29360128);
                int i411113 = (i6 & 7168) | ((i6 >> 15) & 896) | (57344 & i6) | (i34 & 458752);
                dVar2 = dVarF;
                TextStyle textStyle16 = textStyleA;
                boolean z1111119 = z10;
                Function1<? super TextLayoutResult, Unit> function11116 = function5;
                CoreTextFieldKt.w(textFieldValue, (Function1) objR2, bVar17, textStyle16, nceVar16, function11116, r48Var17, qu0Var16, z1111118, i40, i39, imeOptionsI14, mVar4, z12, z11, ps4Var16, null, dVar2, i411112, i411113, 65536);
                if (e.k()) {
                    e.n();
                }
                mVar3 = mVar4;
                ps4Var2 = ps4Var16;
                i35 = i37;
                i36 = i38;
                z9 = z1111119;
                nceVar2 = nceVar16;
                qu0Var2 = qu0Var16;
                z7 = z12;
                keyboardOptions2 = keyboardOptions16;
                function3 = function11116;
                z8 = z11;
                r48Var2 = r48Var17;
                textStyle2 = textStyle16;
                bVar3 = bVar17;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                i35 = i;
                nceVar2 = nceVar;
                ps4Var2 = ps4Var;
                z7 = z4;
                mVar3 = mVar2;
                z8 = z5;
                textStyle2 = textStyleA;
                keyboardOptions2 = keyboardOptionsA;
                bVar3 = bVar2;
                z9 = z3;
                i36 = i2;
                function3 = function2;
                r48Var2 = r48Var;
                qu0Var2 = qu0Var;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.sh0
                    public final Object invoke(Object obj, Object obj2) {
                        return a.t(textFieldValue, function1, bVar3, z7, z8, textStyle2, keyboardOptions2, mVar3, z9, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i6 |= 24576;
        z5 = z2;
        i11 = i5 & 32;
        if (i11 != 0) {
            i6 |= 196608;
            textStyleA = textStyle;
        } else {
            textStyleA = textStyle;
            if ((i3 & 196608) == 0) {
                if (dVarF.x(textStyleA)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i6 |= i12;
            }
        }
        i13 = i5 & 64;
        if (i13 != 0) {
            i6 |= 1572864;
            keyboardOptionsA = keyboardOptions;
        } else {
            keyboardOptionsA = keyboardOptions;
            if ((i3 & 1572864) == 0) {
                if (dVarF.x(keyboardOptionsA)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i6 |= i14;
            }
        }
        i15 = i5 & 128;
        if (i15 != 0) {
            i6 |= 12582912;
            mVar2 = mVar;
        } else {
            mVar2 = mVar;
            if ((i3 & 12582912) == 0) {
                if (dVarF.x(mVar2)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i6 |= i16;
            }
        }
        i17 = i5 & 256;
        if (i17 != 0) {
            i6 |= 100663296;
        } else if ((i3 & 100663296) == 0) {
            if (dVarF.A(z3)) {
                i18 = 67108864;
            } else {
                i18 = 33554432;
            }
            i6 |= i18;
        }
        if ((i3 & 805306368) != 0) {
            i6 |= ((i5 & 512) == 0 || !dVarF.C(i)) ? 268435456 : 536870912;
        }
        i19 = i5 & 1024;
        if (i19 != 0) {
            i20 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            if (dVarF.C(i2)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i20 = i4 | i21;
        } else {
            i20 = i4;
        }
        i22 = i5 & 2048;
        if (i22 != 0) {
            i20 |= 48;
        } else if ((i4 & 48) != 0) {
            if (dVarF.x(nceVar)) {
                i23 = 32;
            } else {
                i23 = 16;
            }
            i20 |= i23;
        }
        i24 = i20;
        i25 = i5 & 4096;
        if (i25 != 0) {
            i26 = i24 | 384;
        } else if ((i4 & 384) == 0) {
            if (dVarF.T(function2)) {
                i27 = 256;
            } else {
                i27 = 128;
            }
            i26 = i24 | i27;
        } else {
            i26 = i24;
        }
        i28 = i5 & 8192;
        if (i28 != 0) {
            i30 = i26 | 3072;
        } else {
            i29 = i26;
            if ((i4 & 3072) == 0) {
                i30 = i29 | (dVarF.x(r48Var) ? 2048 : 1024);
            } else {
                i30 = i29;
            }
        }
        i31 = i5 & 16384;
        if (i31 != 0) {
            i32 = i30;
            if ((i4 & 24576) == 0) {
                i32 |= dVarF.x(qu0Var) ? 16384 : 8192;
            }
            i33 = i5 & 32768;
            if (i33 != 0) {
                i32 |= 196608;
            } else if ((i4 & 196608) == 0) {
                i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
            }
            i34 = i32;
            if ((i6 & 306783379) == 306783378) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (dVarF.g(z6, i6 & 1)) {
                dVarF.U();
                if ((i3 & 1) != 0) {
                    if (i41 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i9 != 0) {
                        z5 = false;
                    }
                    if (i11 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i13 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i15 != 0) {
                        mVarA = m.INSTANCE.a();
                    } else {
                        mVarA = mVar2;
                    }
                    if (i17 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 512) != 0) {
                        if (z10) {
                            i37 = 1;
                        } else {
                            i37 = Integer.MAX_VALUE;
                        }
                        i6 &= -1879048193;
                    } else {
                        i37 = i;
                    }
                    if (i19 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i2;
                    }
                    if (i22 != 0) {
                        nceVarC = nce.INSTANCE.c();
                    } else {
                        nceVarC = nceVar;
                    }
                    mVar4 = mVarA;
                    if (i25 != 0) {
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1() { // from class: com.google.android.qh0
                                public final Object invoke(Object obj) {
                                    return a.r((TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR);
                        }
                        function4 = (Function1) objR;
                    } else {
                        function4 = function2;
                    }
                    if (i28 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    Function1<? super TextLayoutResult, Unit> function11117 = function4;
                    if (i31 != 0) {
                        solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                    } else {
                        solidColor = qu0Var;
                    }
                    if (i33 != 0) {
                        boolean z11111110 = z5;
                        ps4VarE = qo1.a.e();
                        z11 = z11111110;
                    } else {
                        z11 = z5;
                        ps4VarE = ps4Var;
                    }
                    z12 = z4;
                    function5 = function11117;
                } else {
                    if (i41 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i9 != 0) {
                        z5 = false;
                    }
                    if (i11 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i13 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i15 != 0) {
                        mVarA = m.INSTANCE.a();
                    } else {
                        mVarA = mVar2;
                    }
                    if (i17 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 512) != 0) {
                        if (z10) {
                            i37 = 1;
                        } else {
                            i37 = Integer.MAX_VALUE;
                        }
                        i6 &= -1879048193;
                    } else {
                        i37 = i;
                    }
                    if (i19 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i2;
                    }
                    if (i22 != 0) {
                        nceVarC = nce.INSTANCE.c();
                    } else {
                        nceVarC = nceVar;
                    }
                    mVar4 = mVarA;
                    if (i25 != 0) {
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1() { // from class: com.google.android.qh0
                                public final Object invoke(Object obj) {
                                    return a.r((TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR);
                        }
                        function4 = (Function1) objR;
                    } else {
                        function4 = function2;
                    }
                    if (i28 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    Function1<? super TextLayoutResult, Unit> function11118 = function4;
                    if (i31 != 0) {
                        solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                    } else {
                        solidColor = qu0Var;
                    }
                    if (i33 != 0) {
                        boolean z11111111 = z5;
                        ps4VarE = qo1.a.e();
                        z11 = z11111111;
                    } else {
                        z11 = z5;
                        ps4VarE = ps4Var;
                    }
                    z12 = z4;
                    function5 = function11118;
                }
                dVarF.M();
                nce nceVar17 = nceVarC;
                if (e.k()) {
                    e.o(-971111025, i6, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:933)");
                }
                b bVar18 = bVar2;
                ps4<? super Function2<? super d, ? super Integer, Unit>, ? super d, ? super Integer, Unit> ps4Var17 = ps4VarE;
                ImeOptions imeOptionsI15 = keyboardOptionsA.i(z10);
                boolean z11111112 = !z10;
                qu0 qu0Var17 = solidColor;
                if (z10) {
                    i39 = 1;
                } else {
                    i39 = i38;
                }
                r48 r48Var18 = r48Var3;
                if (z10) {
                    i40 = 1;
                } else {
                    i40 = i37;
                }
                KeyboardOptions keyboardOptions17 = keyboardOptionsA;
                if ((i6 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | ((i6 & 112) == 32);
                objR2 = dVarF.R();
                if (z14) {
                    objR2 = new Function1() { // from class: com.google.android.rh0
                        public final Object invoke(Object obj) {
                            return a.s(textFieldValue, function1, (TextFieldValue) obj);
                        }
                    };
                    dVarF.L(objR2);
                } else {
                    objR2 = new Function1() { // from class: com.google.android.rh0
                        public final Object invoke(Object obj) {
                            return a.s(textFieldValue, function1, (TextFieldValue) obj);
                        }
                    };
                    dVarF.L(objR2);
                }
                int i411114 = i34 << 9;
                int i411115 = ((i6 >> 6) & 7168) | (i6 & 910) | (i411114 & 57344) | (i411114 & 458752) | (i411114 & 3670016) | (i411114 & 29360128);
                int i411116 = (i6 & 7168) | ((i6 >> 15) & 896) | (57344 & i6) | (i34 & 458752);
                dVar2 = dVarF;
                TextStyle textStyle17 = textStyleA;
                boolean z11111113 = z10;
                Function1<? super TextLayoutResult, Unit> function11119 = function5;
                CoreTextFieldKt.w(textFieldValue, (Function1) objR2, bVar18, textStyle17, nceVar17, function11119, r48Var18, qu0Var17, z11111112, i40, i39, imeOptionsI15, mVar4, z12, z11, ps4Var17, null, dVar2, i411115, i411116, 65536);
                if (e.k()) {
                    e.n();
                }
                mVar3 = mVar4;
                ps4Var2 = ps4Var17;
                i35 = i37;
                i36 = i38;
                z9 = z11111113;
                nceVar2 = nceVar17;
                qu0Var2 = qu0Var17;
                z7 = z12;
                keyboardOptions2 = keyboardOptions17;
                function3 = function11119;
                z8 = z11;
                r48Var2 = r48Var18;
                textStyle2 = textStyle17;
                bVar3 = bVar18;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                i35 = i;
                nceVar2 = nceVar;
                ps4Var2 = ps4Var;
                z7 = z4;
                mVar3 = mVar2;
                z8 = z5;
                textStyle2 = textStyleA;
                keyboardOptions2 = keyboardOptionsA;
                bVar3 = bVar2;
                z9 = z3;
                i36 = i2;
                function3 = function2;
                r48Var2 = r48Var;
                qu0Var2 = qu0Var;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.sh0
                    public final Object invoke(Object obj, Object obj2) {
                        return a.t(textFieldValue, function1, bVar3, z7, z8, textStyle2, keyboardOptions2, mVar3, z9, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i32 = i30 | 24576;
        i33 = i5 & 32768;
        if (i33 != 0) {
            i32 |= 196608;
        } else if ((i4 & 196608) == 0) {
            i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
        }
        i34 = i32;
        if ((i6 & 306783379) == 306783378) {
            z6 = true;
        } else {
            z6 = true;
        }
        if (dVarF.g(z6, i6 & 1)) {
            dVarF.U();
            if ((i3 & 1) != 0) {
                if (i41 != 0) {
                    bVar2 = b.INSTANCE;
                }
                if (i7 != 0) {
                    z4 = true;
                }
                if (i9 != 0) {
                    z5 = false;
                }
                if (i11 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                }
                if (i13 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                }
                if (i15 != 0) {
                    mVarA = m.INSTANCE.a();
                } else {
                    mVarA = mVar2;
                }
                if (i17 != 0) {
                    z10 = false;
                } else {
                    z10 = z3;
                }
                if ((i5 & 512) != 0) {
                    if (z10) {
                        i37 = 1;
                    } else {
                        i37 = Integer.MAX_VALUE;
                    }
                    i6 &= -1879048193;
                } else {
                    i37 = i;
                }
                if (i19 != 0) {
                    i38 = 1;
                } else {
                    i38 = i2;
                }
                if (i22 != 0) {
                    nceVarC = nce.INSTANCE.c();
                } else {
                    nceVarC = nceVar;
                }
                mVar4 = mVarA;
                if (i25 != 0) {
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1() { // from class: com.google.android.qh0
                            public final Object invoke(Object obj) {
                                return a.r((TextLayoutResult) obj);
                            }
                        };
                        dVarF.L(objR);
                    }
                    function4 = (Function1) objR;
                } else {
                    function4 = function2;
                }
                if (i28 != 0) {
                    r48Var3 = null;
                } else {
                    r48Var3 = r48Var;
                }
                Function1<? super TextLayoutResult, Unit> function111110 = function4;
                if (i31 != 0) {
                    solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                } else {
                    solidColor = qu0Var;
                }
                if (i33 != 0) {
                    boolean z11111114 = z5;
                    ps4VarE = qo1.a.e();
                    z11 = z11111114;
                } else {
                    z11 = z5;
                    ps4VarE = ps4Var;
                }
                z12 = z4;
                function5 = function111110;
            } else {
                if (i41 != 0) {
                    bVar2 = b.INSTANCE;
                }
                if (i7 != 0) {
                    z4 = true;
                }
                if (i9 != 0) {
                    z5 = false;
                }
                if (i11 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                }
                if (i13 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                }
                if (i15 != 0) {
                    mVarA = m.INSTANCE.a();
                } else {
                    mVarA = mVar2;
                }
                if (i17 != 0) {
                    z10 = false;
                } else {
                    z10 = z3;
                }
                if ((i5 & 512) != 0) {
                    if (z10) {
                        i37 = 1;
                    } else {
                        i37 = Integer.MAX_VALUE;
                    }
                    i6 &= -1879048193;
                } else {
                    i37 = i;
                }
                if (i19 != 0) {
                    i38 = 1;
                } else {
                    i38 = i2;
                }
                if (i22 != 0) {
                    nceVarC = nce.INSTANCE.c();
                } else {
                    nceVarC = nceVar;
                }
                mVar4 = mVarA;
                if (i25 != 0) {
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1() { // from class: com.google.android.qh0
                            public final Object invoke(Object obj) {
                                return a.r((TextLayoutResult) obj);
                            }
                        };
                        dVarF.L(objR);
                    }
                    function4 = (Function1) objR;
                } else {
                    function4 = function2;
                }
                if (i28 != 0) {
                    r48Var3 = null;
                } else {
                    r48Var3 = r48Var;
                }
                Function1<? super TextLayoutResult, Unit> function111111 = function4;
                if (i31 != 0) {
                    solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                } else {
                    solidColor = qu0Var;
                }
                if (i33 != 0) {
                    boolean z11111115 = z5;
                    ps4VarE = qo1.a.e();
                    z11 = z11111115;
                } else {
                    z11 = z5;
                    ps4VarE = ps4Var;
                }
                z12 = z4;
                function5 = function111111;
            }
            dVarF.M();
            nce nceVar18 = nceVarC;
            if (e.k()) {
                e.o(-971111025, i6, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:933)");
            }
            b bVar19 = bVar2;
            ps4<? super Function2<? super d, ? super Integer, Unit>, ? super d, ? super Integer, Unit> ps4Var18 = ps4VarE;
            ImeOptions imeOptionsI16 = keyboardOptionsA.i(z10);
            boolean z11111116 = !z10;
            qu0 qu0Var18 = solidColor;
            if (z10) {
                i39 = 1;
            } else {
                i39 = i38;
            }
            r48 r48Var19 = r48Var3;
            if (z10) {
                i40 = 1;
            } else {
                i40 = i37;
            }
            KeyboardOptions keyboardOptions18 = keyboardOptionsA;
            if ((i6 & 14) == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z13 | ((i6 & 112) == 32);
            objR2 = dVarF.R();
            if (z14) {
                objR2 = new Function1() { // from class: com.google.android.rh0
                    public final Object invoke(Object obj) {
                        return a.s(textFieldValue, function1, (TextFieldValue) obj);
                    }
                };
                dVarF.L(objR2);
            } else {
                objR2 = new Function1() { // from class: com.google.android.rh0
                    public final Object invoke(Object obj) {
                        return a.s(textFieldValue, function1, (TextFieldValue) obj);
                    }
                };
                dVarF.L(objR2);
            }
            int i411117 = i34 << 9;
            int i411118 = ((i6 >> 6) & 7168) | (i6 & 910) | (i411117 & 57344) | (i411117 & 458752) | (i411117 & 3670016) | (i411117 & 29360128);
            int i411119 = (i6 & 7168) | ((i6 >> 15) & 896) | (57344 & i6) | (i34 & 458752);
            dVar2 = dVarF;
            TextStyle textStyle18 = textStyleA;
            boolean z11111117 = z10;
            Function1<? super TextLayoutResult, Unit> function111112 = function5;
            CoreTextFieldKt.w(textFieldValue, (Function1) objR2, bVar19, textStyle18, nceVar18, function111112, r48Var19, qu0Var18, z11111116, i40, i39, imeOptionsI16, mVar4, z12, z11, ps4Var18, null, dVar2, i411118, i411119, 65536);
            if (e.k()) {
                e.n();
            }
            mVar3 = mVar4;
            ps4Var2 = ps4Var18;
            i35 = i37;
            i36 = i38;
            z9 = z11111117;
            nceVar2 = nceVar18;
            qu0Var2 = qu0Var18;
            z7 = z12;
            keyboardOptions2 = keyboardOptions18;
            function3 = function111112;
            z8 = z11;
            r48Var2 = r48Var19;
            textStyle2 = textStyle18;
            bVar3 = bVar19;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            i35 = i;
            nceVar2 = nceVar;
            ps4Var2 = ps4Var;
            z7 = z4;
            mVar3 = mVar2;
            z8 = z5;
            textStyle2 = textStyleA;
            keyboardOptions2 = keyboardOptionsA;
            bVar3 = bVar2;
            z9 = z3;
            i36 = i2;
            function3 = function2;
            r48Var2 = r48Var;
            qu0Var2 = qu0Var;
        }
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.sh0
                public final Object invoke(Object obj, Object obj2) {
                    return a.t(textFieldValue, function1, bVar3, z7, z8, textStyle2, keyboardOptions2, mVar3, z9, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0125  */
    /* JADX WARN: Code duplicated, block: B:103:0x012b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0134  */
    /* JADX WARN: Code duplicated, block: B:106:0x0138  */
    /* JADX WARN: Code duplicated, block: B:108:0x0142  */
    /* JADX WARN: Code duplicated, block: B:109:0x0145  */
    /* JADX WARN: Code duplicated, block: B:111:0x014a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0154  */
    /* JADX WARN: Code duplicated, block: B:116:0x015b  */
    /* JADX WARN: Code duplicated, block: B:118:0x015f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0169  */
    /* JADX WARN: Code duplicated, block: B:121:0x016c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0171  */
    /* JADX WARN: Code duplicated, block: B:126:0x017a  */
    /* JADX WARN: Code duplicated, block: B:127:0x017d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0183  */
    /* JADX WARN: Code duplicated, block: B:131:0x018b  */
    /* JADX WARN: Code duplicated, block: B:132:0x018e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0195  */
    /* JADX WARN: Code duplicated, block: B:137:0x019f  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:164:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:168:0x0208  */
    /* JADX WARN: Code duplicated, block: B:172:0x0214  */
    /* JADX WARN: Code duplicated, block: B:175:0x021e  */
    /* JADX WARN: Code duplicated, block: B:177:0x0225  */
    /* JADX WARN: Code duplicated, block: B:184:0x0251 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:185:0x0253  */
    /* JADX WARN: Code duplicated, block: B:187:0x0258  */
    /* JADX WARN: Code duplicated, block: B:189:0x025c  */
    /* JADX WARN: Code duplicated, block: B:191:0x025f  */
    /* JADX WARN: Code duplicated, block: B:193:0x0268  */
    /* JADX WARN: Code duplicated, block: B:195:0x0271  */
    /* JADX WARN: Code duplicated, block: B:196:0x0278  */
    /* JADX WARN: Code duplicated, block: B:198:0x027b  */
    /* JADX WARN: Code duplicated, block: B:199:0x027d  */
    /* JADX WARN: Code duplicated, block: B:202:0x0283 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:203:0x0285  */
    /* JADX WARN: Code duplicated, block: B:204:0x0288  */
    /* JADX WARN: Code duplicated, block: B:206:0x0290  */
    /* JADX WARN: Code duplicated, block: B:208:0x0294  */
    /* JADX WARN: Code duplicated, block: B:209:0x0297  */
    /* JADX WARN: Code duplicated, block: B:211:0x029b  */
    /* JADX WARN: Code duplicated, block: B:212:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:214:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:216:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:218:0x02be  */
    /* JADX WARN: Code duplicated, block: B:220:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:221:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:224:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:225:0x02db  */
    /* JADX WARN: Code duplicated, block: B:227:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:229:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:232:0x030c  */
    /* JADX WARN: Code duplicated, block: B:233:0x0317  */
    /* JADX WARN: Code duplicated, block: B:236:0x0327  */
    /* JADX WARN: Code duplicated, block: B:237:0x034c  */
    /* JADX WARN: Code duplicated, block: B:240:0x037b  */
    /* JADX WARN: Code duplicated, block: B:242:0x0381  */
    /* JADX WARN: Code duplicated, block: B:245:0x0394  */
    /* JADX WARN: Code duplicated, block: B:246:0x0397  */
    /* JADX WARN: Code duplicated, block: B:249:0x039e  */
    /* JADX WARN: Code duplicated, block: B:251:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:254:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:255:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:258:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:259:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:263:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:266:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:268:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:271:0x0436  */
    /* JADX WARN: Code duplicated, block: B:274:0x044f  */
    /* JADX WARN: Code duplicated, block: B:277:0x046e  */
    /* JADX WARN: Code duplicated, block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:87:0x0102  */
    /* JADX WARN: Code duplicated, block: B:88:0x0105  */
    /* JADX WARN: Code duplicated, block: B:92:0x010f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0113  */
    /* JADX WARN: Code duplicated, block: B:97:0x011e A[ADDED_TO_REGION] */
    public static final void i(final String str, final Function1<? super String, Unit> function1, b bVar, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, m mVar, boolean z3, int i, int i2, nce nceVar, Function1<? super TextLayoutResult, Unit> function2, r48 r48Var, qu0 qu0Var, ps4<? super Function2<? super d, ? super Integer, Unit>, ? super d, ? super Integer, Unit> ps4Var, d dVar, final int i3, final int i4, final int i5) {
        int i6;
        b bVar2;
        int i7;
        boolean z4;
        int i8;
        int i9;
        boolean z5;
        int i10;
        int i11;
        TextStyle textStyleA;
        int i12;
        int i13;
        KeyboardOptions keyboardOptionsA;
        int i14;
        int i15;
        final m mVar2;
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
        int i33;
        int i34;
        boolean z6;
        d dVar2;
        final boolean z7;
        final ps4<? super Function2<? super d, ? super Integer, Unit>, ? super d, ? super Integer, Unit> ps4Var2;
        final boolean z8;
        final KeyboardOptions keyboardOptions2;
        final boolean z9;
        final TextStyle textStyle2;
        final b bVar3;
        final nce nceVar2;
        final Function1<? super TextLayoutResult, Unit> function3;
        final r48 r48Var2;
        final qu0 qu0Var2;
        final int i35;
        final int i36;
        s6b s6bVarH;
        m mVarA;
        boolean z10;
        int i37;
        int i38;
        nce nceVarC;
        Function1<? super TextLayoutResult, Unit> function4;
        r48 r48Var3;
        m mVar3;
        qu0 solidColor;
        ps4<? super Function2<? super d, ? super Integer, Unit>, ? super d, ? super Integer, Unit> ps4VarF;
        boolean z11;
        boolean z12;
        TextStyle textStyle3;
        b bVar4;
        nce nceVar3;
        qu0 qu0Var3;
        int i39;
        KeyboardOptions keyboardOptions3;
        Function1<? super TextLayoutResult, Unit> function5;
        r48 r48Var4;
        Object objR;
        Object objR2;
        d.Companion companion;
        final o58 o58Var;
        final TextFieldValue textFieldValueI;
        boolean zX;
        Object objR3;
        boolean z13;
        Object objR4;
        final o58 o58Var2;
        int i40;
        int i41;
        boolean zX2;
        Object objR5;
        d dVarF = dVar.F(2026950908);
        if ((i3 & 6) == 0) {
            i6 = (dVarF.x(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= dVarF.T(function1) ? 32 : 16;
        }
        int i42 = i5 & 4;
        if (i42 == 0) {
            if ((i3 & 384) == 0) {
                bVar2 = bVar;
                i6 |= dVarF.x(bVar2) ? 256 : 128;
            }
            i7 = i5 & 8;
            if (i7 != 0) {
                if ((i3 & 3072) == 0) {
                    z4 = z;
                    if (dVarF.A(z4)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i6 |= i8;
                }
                i9 = i5 & 16;
                if (i9 != 0) {
                    if ((i3 & 24576) == 0) {
                        z5 = z2;
                        if (dVarF.A(z5)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i6 |= i10;
                    }
                    i11 = i5 & 32;
                    if (i11 != 0) {
                        i6 |= 196608;
                        textStyleA = textStyle;
                    } else {
                        textStyleA = textStyle;
                        if ((i3 & 196608) == 0) {
                            if (dVarF.x(textStyleA)) {
                                i12 = 131072;
                            } else {
                                i12 = 65536;
                            }
                            i6 |= i12;
                        }
                    }
                    i13 = i5 & 64;
                    if (i13 != 0) {
                        i6 |= 1572864;
                        keyboardOptionsA = keyboardOptions;
                    } else {
                        keyboardOptionsA = keyboardOptions;
                        if ((i3 & 1572864) == 0) {
                            if (dVarF.x(keyboardOptionsA)) {
                                i14 = 1048576;
                            } else {
                                i14 = 524288;
                            }
                            i6 |= i14;
                        }
                    }
                    i15 = i5 & 128;
                    if (i15 != 0) {
                        i6 |= 12582912;
                        mVar2 = mVar;
                    } else {
                        mVar2 = mVar;
                        if ((i3 & 12582912) == 0) {
                            if (dVarF.x(mVar2)) {
                                i16 = 8388608;
                            } else {
                                i16 = 4194304;
                            }
                            i6 |= i16;
                        }
                    }
                    i17 = i5 & 256;
                    if (i17 != 0) {
                        i6 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        if (dVarF.A(z3)) {
                            i18 = 67108864;
                        } else {
                            i18 = 33554432;
                        }
                        i6 |= i18;
                    }
                    if ((i3 & 805306368) != 0) {
                        i6 |= ((i5 & 512) == 0 || !dVarF.C(i)) ? 268435456 : 536870912;
                    }
                    i19 = i5 & 1024;
                    if (i19 != 0) {
                        i20 = i4 | 6;
                    } else if ((i4 & 6) == 0) {
                        if (dVarF.C(i2)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i4 | i21;
                    } else {
                        i20 = i4;
                    }
                    i22 = i5 & 2048;
                    if (i22 != 0) {
                        i20 |= 48;
                    } else if ((i4 & 48) != 0) {
                        if (dVarF.x(nceVar)) {
                            i23 = 32;
                        } else {
                            i23 = 16;
                        }
                        i20 |= i23;
                    }
                    i24 = i20;
                    i25 = i5 & 4096;
                    if (i25 != 0) {
                        i26 = i24 | 384;
                    } else if ((i4 & 384) == 0) {
                        if (dVarF.T(function2)) {
                            i27 = 256;
                        } else {
                            i27 = 128;
                        }
                        i26 = i24 | i27;
                    } else {
                        i26 = i24;
                    }
                    i28 = i5 & 8192;
                    if (i28 != 0) {
                        i30 = i26 | 3072;
                    } else {
                        i29 = i26;
                        if ((i4 & 3072) == 0) {
                            i30 = i29 | (dVarF.x(r48Var) ? 2048 : 1024);
                        } else {
                            i30 = i29;
                        }
                    }
                    i31 = i5 & 16384;
                    if (i31 != 0) {
                        i32 = i30;
                        if ((i4 & 24576) == 0) {
                            i32 |= dVarF.x(qu0Var) ? 16384 : 8192;
                        }
                        i33 = i5 & 32768;
                        if (i33 != 0) {
                            i32 |= 196608;
                        } else if ((i4 & 196608) == 0) {
                            i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
                        }
                        i34 = i32;
                        if ((i6 & 306783379) == 306783378 || (74899 & i34) != 74898) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (dVarF.g(z6, i6 & 1)) {
                            dVarF.U();
                            if ((i3 & 1) != 0 || dVarF.t()) {
                                if (i42 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i7 != 0) {
                                    z4 = true;
                                }
                                if (i9 != 0) {
                                    z5 = false;
                                }
                                if (i11 != 0) {
                                    textStyleA = TextStyle.INSTANCE.a();
                                }
                                if (i13 != 0) {
                                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                                }
                                if (i15 != 0) {
                                    mVarA = m.INSTANCE.a();
                                } else {
                                    mVarA = mVar2;
                                }
                                if (i17 != 0) {
                                    z10 = false;
                                } else {
                                    z10 = z3;
                                }
                                if ((i5 & 512) != 0) {
                                    if (z10) {
                                        i37 = 1;
                                    } else {
                                        i37 = Integer.MAX_VALUE;
                                    }
                                    i6 &= -1879048193;
                                } else {
                                    i37 = i;
                                }
                                if (i19 != 0) {
                                    i38 = 1;
                                } else {
                                    i38 = i2;
                                }
                                if (i22 != 0) {
                                    nceVarC = nce.INSTANCE.c();
                                } else {
                                    nceVarC = nceVar;
                                }
                                if (i25 != 0) {
                                    objR = dVarF.R();
                                    if (objR == d.INSTANCE.a()) {
                                        objR = new Function1() { // from class: com.google.android.th0
                                            public final Object invoke(Object obj) {
                                                return a.j((TextLayoutResult) obj);
                                            }
                                        };
                                        dVarF.L(objR);
                                    }
                                    function4 = (Function1) objR;
                                } else {
                                    function4 = function2;
                                }
                                if (i28 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                mVar3 = mVarA;
                                if (i31 != 0) {
                                    solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                                } else {
                                    solidColor = qu0Var;
                                }
                                if (i33 != 0) {
                                    ps4VarF = qo1.a.f();
                                } else {
                                    ps4VarF = ps4Var;
                                }
                                z11 = z10;
                                i = i37;
                                i2 = i38;
                                z12 = z5;
                                textStyle3 = textStyleA;
                                bVar4 = bVar2;
                                nceVar3 = nceVarC;
                                qu0Var3 = solidColor;
                                i39 = i6;
                                keyboardOptions3 = keyboardOptionsA;
                                function5 = function4;
                                r48Var4 = r48Var3;
                            } else {
                                dVarF.q();
                                if ((i5 & 512) != 0) {
                                    i6 &= -1879048193;
                                }
                                z11 = z3;
                                i = i;
                                i2 = i2;
                                nceVar3 = nceVar;
                                ps4VarF = ps4Var;
                                mVar3 = mVar2;
                                keyboardOptions3 = keyboardOptionsA;
                                z12 = z5;
                                textStyle3 = textStyleA;
                                bVar4 = bVar2;
                                r48Var4 = r48Var;
                                qu0Var3 = qu0Var;
                                i39 = i6;
                                function5 = function2;
                            }
                            dVarF.M();
                            if (e.k()) {
                                e.o(2026950908, i39, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:776)");
                            }
                            objR2 = dVarF.R();
                            companion = d.INSTANCE;
                            if (objR2 == companion.a()) {
                                o58 o58VarE = s0.e(new TextFieldValue(str, 0L, (x) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                                dVarF.L(o58VarE);
                                objR2 = o58VarE;
                            }
                            o58Var = (o58) objR2;
                            textFieldValueI = TextFieldValue.i(k(o58Var), str, 0L, null, 6, null);
                            zX = dVarF.x(textFieldValueI);
                            Function1<? super TextLayoutResult, Unit> function6 = function5;
                            objR3 = dVarF.R();
                            b bVar5 = bVar4;
                            if (zX || objR3 == companion.a()) {
                                objR3 = new Function0() { // from class: com.google.android.uh0
                                    public final Object invoke() {
                                        return a.m(textFieldValueI, o58Var);
                                    }
                                };
                                dVarF.L(objR3);
                            }
                            vn3.i((Function0) objR3, dVarF, 0);
                            if ((i39 & 14) == 4) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objR4 = dVarF.R();
                            if (z13 || objR4 == companion.a()) {
                                objR4 = s0.e(str, null, 2, null);
                                dVarF.L(objR4);
                            }
                            o58Var2 = (o58) objR4;
                            ImeOptions imeOptionsI = keyboardOptions3.i(z11);
                            boolean z14 = !z11;
                            if (z11) {
                                i40 = 1;
                            } else {
                                i40 = i2;
                            }
                            if (z11) {
                                i41 = 1;
                            } else {
                                i41 = i;
                            }
                            KeyboardOptions keyboardOptions4 = keyboardOptions3;
                            zX2 = dVarF.x(o58Var2) | ((i39 & 112) == 32);
                            objR5 = dVarF.R();
                            if (zX2 || objR5 == companion.a()) {
                                objR5 = new Function1() { // from class: com.google.android.vh0
                                    public final Object invoke(Object obj) {
                                        return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                                    }
                                };
                                dVarF.L(objR5);
                            }
                            int i43 = i34 << 9;
                            dVar2 = dVarF;
                            boolean z15 = z4;
                            CoreTextFieldKt.w(textFieldValueI, (Function1) objR5, bVar5, textStyle3, nceVar3, function6, r48Var4, qu0Var3, z14, i41, i40, imeOptionsI, mVar3, z15, z12, ps4VarF, null, dVar2, (i39 & 896) | ((i39 >> 6) & 7168) | (57344 & i43) | (458752 & i43) | (3670016 & i43) | (i43 & 29360128), ((i39 >> 15) & 896) | (i39 & 7168) | (57344 & i39) | (i34 & 458752), 65536);
                            if (e.k()) {
                                e.n();
                            }
                            textStyle2 = textStyle3;
                            r48Var2 = r48Var4;
                            qu0Var2 = qu0Var3;
                            z8 = z15;
                            z9 = z12;
                            ps4Var2 = ps4VarF;
                            keyboardOptions2 = keyboardOptions4;
                            z7 = z11;
                            bVar3 = bVar5;
                            nceVar2 = nceVar3;
                            function3 = function6;
                            mVar2 = mVar3;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            z7 = z3;
                            ps4Var2 = ps4Var;
                            z8 = z4;
                            keyboardOptions2 = keyboardOptionsA;
                            z9 = z5;
                            textStyle2 = textStyleA;
                            bVar3 = bVar2;
                            nceVar2 = nceVar;
                            function3 = function2;
                            r48Var2 = r48Var;
                            qu0Var2 = qu0Var;
                        }
                        i35 = i;
                        i36 = i2;
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.wh0
                                public final Object invoke(Object obj, Object obj2) {
                                    return a.q(str, function1, bVar3, z8, z9, textStyle2, keyboardOptions2, mVar2, z7, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i32 = i30 | 24576;
                    i33 = i5 & 32768;
                    if (i33 != 0) {
                        i32 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
                    }
                    i34 = i32;
                    if ((i6 & 306783379) == 306783378) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (dVarF.g(z6, i6 & 1)) {
                        dVarF.U();
                        if ((i3 & 1) != 0) {
                            if (i42 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i7 != 0) {
                                z4 = true;
                            }
                            if (i9 != 0) {
                                z5 = false;
                            }
                            if (i11 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i13 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i15 != 0) {
                                mVarA = m.INSTANCE.a();
                            } else {
                                mVarA = mVar2;
                            }
                            if (i17 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if ((i5 & 512) != 0) {
                                if (z10) {
                                    i37 = 1;
                                } else {
                                    i37 = Integer.MAX_VALUE;
                                }
                                i6 &= -1879048193;
                            } else {
                                i37 = i;
                            }
                            if (i19 != 0) {
                                i38 = 1;
                            } else {
                                i38 = i2;
                            }
                            if (i22 != 0) {
                                nceVarC = nce.INSTANCE.c();
                            } else {
                                nceVarC = nceVar;
                            }
                            if (i25 != 0) {
                                objR = dVarF.R();
                                if (objR == d.INSTANCE.a()) {
                                    objR = new Function1() { // from class: com.google.android.th0
                                        public final Object invoke(Object obj) {
                                            return a.j((TextLayoutResult) obj);
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function4 = (Function1) objR;
                            } else {
                                function4 = function2;
                            }
                            if (i28 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            mVar3 = mVarA;
                            if (i31 != 0) {
                                solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                            } else {
                                solidColor = qu0Var;
                            }
                            if (i33 != 0) {
                                ps4VarF = qo1.a.f();
                            } else {
                                ps4VarF = ps4Var;
                            }
                            z11 = z10;
                            i = i37;
                            i2 = i38;
                            z12 = z5;
                            textStyle3 = textStyleA;
                            bVar4 = bVar2;
                            nceVar3 = nceVarC;
                            qu0Var3 = solidColor;
                            i39 = i6;
                            keyboardOptions3 = keyboardOptionsA;
                            function5 = function4;
                            r48Var4 = r48Var3;
                        } else {
                            if (i42 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i7 != 0) {
                                z4 = true;
                            }
                            if (i9 != 0) {
                                z5 = false;
                            }
                            if (i11 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i13 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i15 != 0) {
                                mVarA = m.INSTANCE.a();
                            } else {
                                mVarA = mVar2;
                            }
                            if (i17 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if ((i5 & 512) != 0) {
                                if (z10) {
                                    i37 = 1;
                                } else {
                                    i37 = Integer.MAX_VALUE;
                                }
                                i6 &= -1879048193;
                            } else {
                                i37 = i;
                            }
                            if (i19 != 0) {
                                i38 = 1;
                            } else {
                                i38 = i2;
                            }
                            if (i22 != 0) {
                                nceVarC = nce.INSTANCE.c();
                            } else {
                                nceVarC = nceVar;
                            }
                            if (i25 != 0) {
                                objR = dVarF.R();
                                if (objR == d.INSTANCE.a()) {
                                    objR = new Function1() { // from class: com.google.android.th0
                                        public final Object invoke(Object obj) {
                                            return a.j((TextLayoutResult) obj);
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function4 = (Function1) objR;
                            } else {
                                function4 = function2;
                            }
                            if (i28 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            mVar3 = mVarA;
                            if (i31 != 0) {
                                solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                            } else {
                                solidColor = qu0Var;
                            }
                            if (i33 != 0) {
                                ps4VarF = qo1.a.f();
                            } else {
                                ps4VarF = ps4Var;
                            }
                            z11 = z10;
                            i = i37;
                            i2 = i38;
                            z12 = z5;
                            textStyle3 = textStyleA;
                            bVar4 = bVar2;
                            nceVar3 = nceVarC;
                            qu0Var3 = solidColor;
                            i39 = i6;
                            keyboardOptions3 = keyboardOptionsA;
                            function5 = function4;
                            r48Var4 = r48Var3;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(2026950908, i39, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:776)");
                        }
                        objR2 = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR2 == companion.a()) {
                            o58 o58VarE2 = s0.e(new TextFieldValue(str, 0L, (x) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                            dVarF.L(o58VarE2);
                            objR2 = o58VarE2;
                        }
                        o58Var = (o58) objR2;
                        textFieldValueI = TextFieldValue.i(k(o58Var), str, 0L, null, 6, null);
                        zX = dVarF.x(textFieldValueI);
                        Function1<? super TextLayoutResult, Unit> function7 = function5;
                        objR3 = dVarF.R();
                        b bVar6 = bVar4;
                        if (zX) {
                            objR3 = new Function0() { // from class: com.google.android.uh0
                                public final Object invoke() {
                                    return a.m(textFieldValueI, o58Var);
                                }
                            };
                            dVarF.L(objR3);
                        } else {
                            objR3 = new Function0() { // from class: com.google.android.uh0
                                public final Object invoke() {
                                    return a.m(textFieldValueI, o58Var);
                                }
                            };
                            dVarF.L(objR3);
                        }
                        vn3.i((Function0) objR3, dVarF, 0);
                        if ((i39 & 14) == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objR4 = dVarF.R();
                        if (z13) {
                            objR4 = s0.e(str, null, 2, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = s0.e(str, null, 2, null);
                            dVarF.L(objR4);
                        }
                        o58Var2 = (o58) objR4;
                        ImeOptions imeOptionsI2 = keyboardOptions3.i(z11);
                        boolean z16 = !z11;
                        if (z11) {
                            i40 = 1;
                        } else {
                            i40 = i2;
                        }
                        if (z11) {
                            i41 = 1;
                        } else {
                            i41 = i;
                        }
                        KeyboardOptions keyboardOptions5 = keyboardOptions3;
                        zX2 = dVarF.x(o58Var2) | ((i39 & 112) == 32);
                        objR5 = dVarF.R();
                        if (zX2) {
                            objR5 = new Function1() { // from class: com.google.android.vh0
                                public final Object invoke(Object obj) {
                                    return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                                }
                            };
                            dVarF.L(objR5);
                        } else {
                            objR5 = new Function1() { // from class: com.google.android.vh0
                                public final Object invoke(Object obj) {
                                    return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                                }
                            };
                            dVarF.L(objR5);
                        }
                        int i44 = i34 << 9;
                        dVar2 = dVarF;
                        boolean z17 = z4;
                        CoreTextFieldKt.w(textFieldValueI, (Function1) objR5, bVar6, textStyle3, nceVar3, function7, r48Var4, qu0Var3, z16, i41, i40, imeOptionsI2, mVar3, z17, z12, ps4VarF, null, dVar2, (i39 & 896) | ((i39 >> 6) & 7168) | (57344 & i44) | (458752 & i44) | (3670016 & i44) | (i44 & 29360128), ((i39 >> 15) & 896) | (i39 & 7168) | (57344 & i39) | (i34 & 458752), 65536);
                        if (e.k()) {
                            e.n();
                        }
                        textStyle2 = textStyle3;
                        r48Var2 = r48Var4;
                        qu0Var2 = qu0Var3;
                        z8 = z17;
                        z9 = z12;
                        ps4Var2 = ps4VarF;
                        keyboardOptions2 = keyboardOptions5;
                        z7 = z11;
                        bVar3 = bVar6;
                        nceVar2 = nceVar3;
                        function3 = function7;
                        mVar2 = mVar3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        z7 = z3;
                        ps4Var2 = ps4Var;
                        z8 = z4;
                        keyboardOptions2 = keyboardOptionsA;
                        z9 = z5;
                        textStyle2 = textStyleA;
                        bVar3 = bVar2;
                        nceVar2 = nceVar;
                        function3 = function2;
                        r48Var2 = r48Var;
                        qu0Var2 = qu0Var;
                    }
                    i35 = i;
                    i36 = i2;
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.wh0
                            public final Object invoke(Object obj, Object obj2) {
                                return a.q(str, function1, bVar3, z8, z9, textStyle2, keyboardOptions2, mVar2, z7, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i6 |= 24576;
                z5 = z2;
                i11 = i5 & 32;
                if (i11 != 0) {
                    i6 |= 196608;
                    textStyleA = textStyle;
                } else {
                    textStyleA = textStyle;
                    if ((i3 & 196608) == 0) {
                        if (dVarF.x(textStyleA)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i6 |= i12;
                    }
                }
                i13 = i5 & 64;
                if (i13 != 0) {
                    i6 |= 1572864;
                    keyboardOptionsA = keyboardOptions;
                } else {
                    keyboardOptionsA = keyboardOptions;
                    if ((i3 & 1572864) == 0) {
                        if (dVarF.x(keyboardOptionsA)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i6 |= i14;
                    }
                }
                i15 = i5 & 128;
                if (i15 != 0) {
                    i6 |= 12582912;
                    mVar2 = mVar;
                } else {
                    mVar2 = mVar;
                    if ((i3 & 12582912) == 0) {
                        if (dVarF.x(mVar2)) {
                            i16 = 8388608;
                        } else {
                            i16 = 4194304;
                        }
                        i6 |= i16;
                    }
                }
                i17 = i5 & 256;
                if (i17 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 100663296) == 0) {
                    if (dVarF.A(z3)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i6 |= i18;
                }
                if ((i3 & 805306368) != 0) {
                    i6 |= ((i5 & 512) == 0 || !dVarF.C(i)) ? 268435456 : 536870912;
                }
                i19 = i5 & 1024;
                if (i19 != 0) {
                    i20 = i4 | 6;
                } else if ((i4 & 6) == 0) {
                    if (dVarF.C(i2)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i4 | i21;
                } else {
                    i20 = i4;
                }
                i22 = i5 & 2048;
                if (i22 != 0) {
                    i20 |= 48;
                } else if ((i4 & 48) != 0) {
                    if (dVarF.x(nceVar)) {
                        i23 = 32;
                    } else {
                        i23 = 16;
                    }
                    i20 |= i23;
                }
                i24 = i20;
                i25 = i5 & 4096;
                if (i25 != 0) {
                    i26 = i24 | 384;
                } else if ((i4 & 384) == 0) {
                    if (dVarF.T(function2)) {
                        i27 = 256;
                    } else {
                        i27 = 128;
                    }
                    i26 = i24 | i27;
                } else {
                    i26 = i24;
                }
                i28 = i5 & 8192;
                if (i28 != 0) {
                    i30 = i26 | 3072;
                } else {
                    i29 = i26;
                    if ((i4 & 3072) == 0) {
                        i30 = i29 | (dVarF.x(r48Var) ? 2048 : 1024);
                    } else {
                        i30 = i29;
                    }
                }
                i31 = i5 & 16384;
                if (i31 != 0) {
                    i32 = i30;
                    if ((i4 & 24576) == 0) {
                        i32 |= dVarF.x(qu0Var) ? 16384 : 8192;
                    }
                    i33 = i5 & 32768;
                    if (i33 != 0) {
                        i32 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
                    }
                    i34 = i32;
                    if ((i6 & 306783379) == 306783378) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (dVarF.g(z6, i6 & 1)) {
                        dVarF.U();
                        if ((i3 & 1) != 0) {
                            if (i42 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i7 != 0) {
                                z4 = true;
                            }
                            if (i9 != 0) {
                                z5 = false;
                            }
                            if (i11 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i13 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i15 != 0) {
                                mVarA = m.INSTANCE.a();
                            } else {
                                mVarA = mVar2;
                            }
                            if (i17 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if ((i5 & 512) != 0) {
                                if (z10) {
                                    i37 = 1;
                                } else {
                                    i37 = Integer.MAX_VALUE;
                                }
                                i6 &= -1879048193;
                            } else {
                                i37 = i;
                            }
                            if (i19 != 0) {
                                i38 = 1;
                            } else {
                                i38 = i2;
                            }
                            if (i22 != 0) {
                                nceVarC = nce.INSTANCE.c();
                            } else {
                                nceVarC = nceVar;
                            }
                            if (i25 != 0) {
                                objR = dVarF.R();
                                if (objR == d.INSTANCE.a()) {
                                    objR = new Function1() { // from class: com.google.android.th0
                                        public final Object invoke(Object obj) {
                                            return a.j((TextLayoutResult) obj);
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function4 = (Function1) objR;
                            } else {
                                function4 = function2;
                            }
                            if (i28 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            mVar3 = mVarA;
                            if (i31 != 0) {
                                solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                            } else {
                                solidColor = qu0Var;
                            }
                            if (i33 != 0) {
                                ps4VarF = qo1.a.f();
                            } else {
                                ps4VarF = ps4Var;
                            }
                            z11 = z10;
                            i = i37;
                            i2 = i38;
                            z12 = z5;
                            textStyle3 = textStyleA;
                            bVar4 = bVar2;
                            nceVar3 = nceVarC;
                            qu0Var3 = solidColor;
                            i39 = i6;
                            keyboardOptions3 = keyboardOptionsA;
                            function5 = function4;
                            r48Var4 = r48Var3;
                        } else {
                            if (i42 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i7 != 0) {
                                z4 = true;
                            }
                            if (i9 != 0) {
                                z5 = false;
                            }
                            if (i11 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i13 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i15 != 0) {
                                mVarA = m.INSTANCE.a();
                            } else {
                                mVarA = mVar2;
                            }
                            if (i17 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if ((i5 & 512) != 0) {
                                if (z10) {
                                    i37 = 1;
                                } else {
                                    i37 = Integer.MAX_VALUE;
                                }
                                i6 &= -1879048193;
                            } else {
                                i37 = i;
                            }
                            if (i19 != 0) {
                                i38 = 1;
                            } else {
                                i38 = i2;
                            }
                            if (i22 != 0) {
                                nceVarC = nce.INSTANCE.c();
                            } else {
                                nceVarC = nceVar;
                            }
                            if (i25 != 0) {
                                objR = dVarF.R();
                                if (objR == d.INSTANCE.a()) {
                                    objR = new Function1() { // from class: com.google.android.th0
                                        public final Object invoke(Object obj) {
                                            return a.j((TextLayoutResult) obj);
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function4 = (Function1) objR;
                            } else {
                                function4 = function2;
                            }
                            if (i28 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            mVar3 = mVarA;
                            if (i31 != 0) {
                                solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                            } else {
                                solidColor = qu0Var;
                            }
                            if (i33 != 0) {
                                ps4VarF = qo1.a.f();
                            } else {
                                ps4VarF = ps4Var;
                            }
                            z11 = z10;
                            i = i37;
                            i2 = i38;
                            z12 = z5;
                            textStyle3 = textStyleA;
                            bVar4 = bVar2;
                            nceVar3 = nceVarC;
                            qu0Var3 = solidColor;
                            i39 = i6;
                            keyboardOptions3 = keyboardOptionsA;
                            function5 = function4;
                            r48Var4 = r48Var3;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(2026950908, i39, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:776)");
                        }
                        objR2 = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR2 == companion.a()) {
                            o58 o58VarE3 = s0.e(new TextFieldValue(str, 0L, (x) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                            dVarF.L(o58VarE3);
                            objR2 = o58VarE3;
                        }
                        o58Var = (o58) objR2;
                        textFieldValueI = TextFieldValue.i(k(o58Var), str, 0L, null, 6, null);
                        zX = dVarF.x(textFieldValueI);
                        Function1<? super TextLayoutResult, Unit> function8 = function5;
                        objR3 = dVarF.R();
                        b bVar7 = bVar4;
                        if (zX) {
                            objR3 = new Function0() { // from class: com.google.android.uh0
                                public final Object invoke() {
                                    return a.m(textFieldValueI, o58Var);
                                }
                            };
                            dVarF.L(objR3);
                        } else {
                            objR3 = new Function0() { // from class: com.google.android.uh0
                                public final Object invoke() {
                                    return a.m(textFieldValueI, o58Var);
                                }
                            };
                            dVarF.L(objR3);
                        }
                        vn3.i((Function0) objR3, dVarF, 0);
                        if ((i39 & 14) == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objR4 = dVarF.R();
                        if (z13) {
                            objR4 = s0.e(str, null, 2, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = s0.e(str, null, 2, null);
                            dVarF.L(objR4);
                        }
                        o58Var2 = (o58) objR4;
                        ImeOptions imeOptionsI3 = keyboardOptions3.i(z11);
                        boolean z18 = !z11;
                        if (z11) {
                            i40 = 1;
                        } else {
                            i40 = i2;
                        }
                        if (z11) {
                            i41 = 1;
                        } else {
                            i41 = i;
                        }
                        KeyboardOptions keyboardOptions6 = keyboardOptions3;
                        zX2 = dVarF.x(o58Var2) | ((i39 & 112) == 32);
                        objR5 = dVarF.R();
                        if (zX2) {
                            objR5 = new Function1() { // from class: com.google.android.vh0
                                public final Object invoke(Object obj) {
                                    return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                                }
                            };
                            dVarF.L(objR5);
                        } else {
                            objR5 = new Function1() { // from class: com.google.android.vh0
                                public final Object invoke(Object obj) {
                                    return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                                }
                            };
                            dVarF.L(objR5);
                        }
                        int i45 = i34 << 9;
                        dVar2 = dVarF;
                        boolean z19 = z4;
                        CoreTextFieldKt.w(textFieldValueI, (Function1) objR5, bVar7, textStyle3, nceVar3, function8, r48Var4, qu0Var3, z18, i41, i40, imeOptionsI3, mVar3, z19, z12, ps4VarF, null, dVar2, (i39 & 896) | ((i39 >> 6) & 7168) | (57344 & i45) | (458752 & i45) | (3670016 & i45) | (i45 & 29360128), ((i39 >> 15) & 896) | (i39 & 7168) | (57344 & i39) | (i34 & 458752), 65536);
                        if (e.k()) {
                            e.n();
                        }
                        textStyle2 = textStyle3;
                        r48Var2 = r48Var4;
                        qu0Var2 = qu0Var3;
                        z8 = z19;
                        z9 = z12;
                        ps4Var2 = ps4VarF;
                        keyboardOptions2 = keyboardOptions6;
                        z7 = z11;
                        bVar3 = bVar7;
                        nceVar2 = nceVar3;
                        function3 = function8;
                        mVar2 = mVar3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        z7 = z3;
                        ps4Var2 = ps4Var;
                        z8 = z4;
                        keyboardOptions2 = keyboardOptionsA;
                        z9 = z5;
                        textStyle2 = textStyleA;
                        bVar3 = bVar2;
                        nceVar2 = nceVar;
                        function3 = function2;
                        r48Var2 = r48Var;
                        qu0Var2 = qu0Var;
                    }
                    i35 = i;
                    i36 = i2;
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.wh0
                            public final Object invoke(Object obj, Object obj2) {
                                return a.q(str, function1, bVar3, z8, z9, textStyle2, keyboardOptions2, mVar2, z7, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i32 = i30 | 24576;
                i33 = i5 & 32768;
                if (i33 != 0) {
                    i32 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
                }
                i34 = i32;
                if ((i6 & 306783379) == 306783378) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (dVarF.g(z6, i6 & 1)) {
                    dVarF.U();
                    if ((i3 & 1) != 0) {
                        if (i42 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i13 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i15 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i37 = 1;
                            } else {
                                i37 = Integer.MAX_VALUE;
                            }
                            i6 &= -1879048193;
                        } else {
                            i37 = i;
                        }
                        if (i19 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i2;
                        }
                        if (i22 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        } else {
                            nceVarC = nceVar;
                        }
                        if (i25 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.th0
                                    public final Object invoke(Object obj) {
                                        return a.j((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        } else {
                            function4 = function2;
                        }
                        if (i28 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        mVar3 = mVarA;
                        if (i31 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                        } else {
                            solidColor = qu0Var;
                        }
                        if (i33 != 0) {
                            ps4VarF = qo1.a.f();
                        } else {
                            ps4VarF = ps4Var;
                        }
                        z11 = z10;
                        i = i37;
                        i2 = i38;
                        z12 = z5;
                        textStyle3 = textStyleA;
                        bVar4 = bVar2;
                        nceVar3 = nceVarC;
                        qu0Var3 = solidColor;
                        i39 = i6;
                        keyboardOptions3 = keyboardOptionsA;
                        function5 = function4;
                        r48Var4 = r48Var3;
                    } else {
                        if (i42 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i13 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i15 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i37 = 1;
                            } else {
                                i37 = Integer.MAX_VALUE;
                            }
                            i6 &= -1879048193;
                        } else {
                            i37 = i;
                        }
                        if (i19 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i2;
                        }
                        if (i22 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        } else {
                            nceVarC = nceVar;
                        }
                        if (i25 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.th0
                                    public final Object invoke(Object obj) {
                                        return a.j((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        } else {
                            function4 = function2;
                        }
                        if (i28 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        mVar3 = mVarA;
                        if (i31 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                        } else {
                            solidColor = qu0Var;
                        }
                        if (i33 != 0) {
                            ps4VarF = qo1.a.f();
                        } else {
                            ps4VarF = ps4Var;
                        }
                        z11 = z10;
                        i = i37;
                        i2 = i38;
                        z12 = z5;
                        textStyle3 = textStyleA;
                        bVar4 = bVar2;
                        nceVar3 = nceVarC;
                        qu0Var3 = solidColor;
                        i39 = i6;
                        keyboardOptions3 = keyboardOptionsA;
                        function5 = function4;
                        r48Var4 = r48Var3;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(2026950908, i39, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:776)");
                    }
                    objR2 = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR2 == companion.a()) {
                        o58 o58VarE4 = s0.e(new TextFieldValue(str, 0L, (x) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                        dVarF.L(o58VarE4);
                        objR2 = o58VarE4;
                    }
                    o58Var = (o58) objR2;
                    textFieldValueI = TextFieldValue.i(k(o58Var), str, 0L, null, 6, null);
                    zX = dVarF.x(textFieldValueI);
                    Function1<? super TextLayoutResult, Unit> function9 = function5;
                    objR3 = dVarF.R();
                    b bVar8 = bVar4;
                    if (zX) {
                        objR3 = new Function0() { // from class: com.google.android.uh0
                            public final Object invoke() {
                                return a.m(textFieldValueI, o58Var);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function0() { // from class: com.google.android.uh0
                            public final Object invoke() {
                                return a.m(textFieldValueI, o58Var);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    vn3.i((Function0) objR3, dVarF, 0);
                    if ((i39 & 14) == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objR4 = dVarF.R();
                    if (z13) {
                        objR4 = s0.e(str, null, 2, null);
                        dVarF.L(objR4);
                    } else {
                        objR4 = s0.e(str, null, 2, null);
                        dVarF.L(objR4);
                    }
                    o58Var2 = (o58) objR4;
                    ImeOptions imeOptionsI4 = keyboardOptions3.i(z11);
                    boolean z110 = !z11;
                    if (z11) {
                        i40 = 1;
                    } else {
                        i40 = i2;
                    }
                    if (z11) {
                        i41 = 1;
                    } else {
                        i41 = i;
                    }
                    KeyboardOptions keyboardOptions7 = keyboardOptions3;
                    zX2 = dVarF.x(o58Var2) | ((i39 & 112) == 32);
                    objR5 = dVarF.R();
                    if (zX2) {
                        objR5 = new Function1() { // from class: com.google.android.vh0
                            public final Object invoke(Object obj) {
                                return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                            }
                        };
                        dVarF.L(objR5);
                    } else {
                        objR5 = new Function1() { // from class: com.google.android.vh0
                            public final Object invoke(Object obj) {
                                return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                            }
                        };
                        dVarF.L(objR5);
                    }
                    int i46 = i34 << 9;
                    dVar2 = dVarF;
                    boolean z111 = z4;
                    CoreTextFieldKt.w(textFieldValueI, (Function1) objR5, bVar8, textStyle3, nceVar3, function9, r48Var4, qu0Var3, z110, i41, i40, imeOptionsI4, mVar3, z111, z12, ps4VarF, null, dVar2, (i39 & 896) | ((i39 >> 6) & 7168) | (57344 & i46) | (458752 & i46) | (3670016 & i46) | (i46 & 29360128), ((i39 >> 15) & 896) | (i39 & 7168) | (57344 & i39) | (i34 & 458752), 65536);
                    if (e.k()) {
                        e.n();
                    }
                    textStyle2 = textStyle3;
                    r48Var2 = r48Var4;
                    qu0Var2 = qu0Var3;
                    z8 = z111;
                    z9 = z12;
                    ps4Var2 = ps4VarF;
                    keyboardOptions2 = keyboardOptions7;
                    z7 = z11;
                    bVar3 = bVar8;
                    nceVar2 = nceVar3;
                    function3 = function9;
                    mVar2 = mVar3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    z7 = z3;
                    ps4Var2 = ps4Var;
                    z8 = z4;
                    keyboardOptions2 = keyboardOptionsA;
                    z9 = z5;
                    textStyle2 = textStyleA;
                    bVar3 = bVar2;
                    nceVar2 = nceVar;
                    function3 = function2;
                    r48Var2 = r48Var;
                    qu0Var2 = qu0Var;
                }
                i35 = i;
                i36 = i2;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.wh0
                        public final Object invoke(Object obj, Object obj2) {
                            return a.q(str, function1, bVar3, z8, z9, textStyle2, keyboardOptions2, mVar2, z7, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i6 |= 3072;
            z4 = z;
            i9 = i5 & 16;
            if (i9 != 0) {
                if ((i3 & 24576) == 0) {
                    z5 = z2;
                    if (dVarF.A(z5)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i6 |= i10;
                }
                i11 = i5 & 32;
                if (i11 != 0) {
                    i6 |= 196608;
                    textStyleA = textStyle;
                } else {
                    textStyleA = textStyle;
                    if ((i3 & 196608) == 0) {
                        if (dVarF.x(textStyleA)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i6 |= i12;
                    }
                }
                i13 = i5 & 64;
                if (i13 != 0) {
                    i6 |= 1572864;
                    keyboardOptionsA = keyboardOptions;
                } else {
                    keyboardOptionsA = keyboardOptions;
                    if ((i3 & 1572864) == 0) {
                        if (dVarF.x(keyboardOptionsA)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i6 |= i14;
                    }
                }
                i15 = i5 & 128;
                if (i15 != 0) {
                    i6 |= 12582912;
                    mVar2 = mVar;
                } else {
                    mVar2 = mVar;
                    if ((i3 & 12582912) == 0) {
                        if (dVarF.x(mVar2)) {
                            i16 = 8388608;
                        } else {
                            i16 = 4194304;
                        }
                        i6 |= i16;
                    }
                }
                i17 = i5 & 256;
                if (i17 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 100663296) == 0) {
                    if (dVarF.A(z3)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i6 |= i18;
                }
                if ((i3 & 805306368) != 0) {
                    i6 |= ((i5 & 512) == 0 || !dVarF.C(i)) ? 268435456 : 536870912;
                }
                i19 = i5 & 1024;
                if (i19 != 0) {
                    i20 = i4 | 6;
                } else if ((i4 & 6) == 0) {
                    if (dVarF.C(i2)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i4 | i21;
                } else {
                    i20 = i4;
                }
                i22 = i5 & 2048;
                if (i22 != 0) {
                    i20 |= 48;
                } else if ((i4 & 48) != 0) {
                    if (dVarF.x(nceVar)) {
                        i23 = 32;
                    } else {
                        i23 = 16;
                    }
                    i20 |= i23;
                }
                i24 = i20;
                i25 = i5 & 4096;
                if (i25 != 0) {
                    i26 = i24 | 384;
                } else if ((i4 & 384) == 0) {
                    if (dVarF.T(function2)) {
                        i27 = 256;
                    } else {
                        i27 = 128;
                    }
                    i26 = i24 | i27;
                } else {
                    i26 = i24;
                }
                i28 = i5 & 8192;
                if (i28 != 0) {
                    i30 = i26 | 3072;
                } else {
                    i29 = i26;
                    if ((i4 & 3072) == 0) {
                        i30 = i29 | (dVarF.x(r48Var) ? 2048 : 1024);
                    } else {
                        i30 = i29;
                    }
                }
                i31 = i5 & 16384;
                if (i31 != 0) {
                    i32 = i30;
                    if ((i4 & 24576) == 0) {
                        i32 |= dVarF.x(qu0Var) ? 16384 : 8192;
                    }
                    i33 = i5 & 32768;
                    if (i33 != 0) {
                        i32 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
                    }
                    i34 = i32;
                    if ((i6 & 306783379) == 306783378) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (dVarF.g(z6, i6 & 1)) {
                        dVarF.U();
                        if ((i3 & 1) != 0) {
                            if (i42 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i7 != 0) {
                                z4 = true;
                            }
                            if (i9 != 0) {
                                z5 = false;
                            }
                            if (i11 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i13 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i15 != 0) {
                                mVarA = m.INSTANCE.a();
                            } else {
                                mVarA = mVar2;
                            }
                            if (i17 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if ((i5 & 512) != 0) {
                                if (z10) {
                                    i37 = 1;
                                } else {
                                    i37 = Integer.MAX_VALUE;
                                }
                                i6 &= -1879048193;
                            } else {
                                i37 = i;
                            }
                            if (i19 != 0) {
                                i38 = 1;
                            } else {
                                i38 = i2;
                            }
                            if (i22 != 0) {
                                nceVarC = nce.INSTANCE.c();
                            } else {
                                nceVarC = nceVar;
                            }
                            if (i25 != 0) {
                                objR = dVarF.R();
                                if (objR == d.INSTANCE.a()) {
                                    objR = new Function1() { // from class: com.google.android.th0
                                        public final Object invoke(Object obj) {
                                            return a.j((TextLayoutResult) obj);
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function4 = (Function1) objR;
                            } else {
                                function4 = function2;
                            }
                            if (i28 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            mVar3 = mVarA;
                            if (i31 != 0) {
                                solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                            } else {
                                solidColor = qu0Var;
                            }
                            if (i33 != 0) {
                                ps4VarF = qo1.a.f();
                            } else {
                                ps4VarF = ps4Var;
                            }
                            z11 = z10;
                            i = i37;
                            i2 = i38;
                            z12 = z5;
                            textStyle3 = textStyleA;
                            bVar4 = bVar2;
                            nceVar3 = nceVarC;
                            qu0Var3 = solidColor;
                            i39 = i6;
                            keyboardOptions3 = keyboardOptionsA;
                            function5 = function4;
                            r48Var4 = r48Var3;
                        } else {
                            if (i42 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i7 != 0) {
                                z4 = true;
                            }
                            if (i9 != 0) {
                                z5 = false;
                            }
                            if (i11 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i13 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i15 != 0) {
                                mVarA = m.INSTANCE.a();
                            } else {
                                mVarA = mVar2;
                            }
                            if (i17 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if ((i5 & 512) != 0) {
                                if (z10) {
                                    i37 = 1;
                                } else {
                                    i37 = Integer.MAX_VALUE;
                                }
                                i6 &= -1879048193;
                            } else {
                                i37 = i;
                            }
                            if (i19 != 0) {
                                i38 = 1;
                            } else {
                                i38 = i2;
                            }
                            if (i22 != 0) {
                                nceVarC = nce.INSTANCE.c();
                            } else {
                                nceVarC = nceVar;
                            }
                            if (i25 != 0) {
                                objR = dVarF.R();
                                if (objR == d.INSTANCE.a()) {
                                    objR = new Function1() { // from class: com.google.android.th0
                                        public final Object invoke(Object obj) {
                                            return a.j((TextLayoutResult) obj);
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function4 = (Function1) objR;
                            } else {
                                function4 = function2;
                            }
                            if (i28 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            mVar3 = mVarA;
                            if (i31 != 0) {
                                solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                            } else {
                                solidColor = qu0Var;
                            }
                            if (i33 != 0) {
                                ps4VarF = qo1.a.f();
                            } else {
                                ps4VarF = ps4Var;
                            }
                            z11 = z10;
                            i = i37;
                            i2 = i38;
                            z12 = z5;
                            textStyle3 = textStyleA;
                            bVar4 = bVar2;
                            nceVar3 = nceVarC;
                            qu0Var3 = solidColor;
                            i39 = i6;
                            keyboardOptions3 = keyboardOptionsA;
                            function5 = function4;
                            r48Var4 = r48Var3;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(2026950908, i39, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:776)");
                        }
                        objR2 = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR2 == companion.a()) {
                            o58 o58VarE5 = s0.e(new TextFieldValue(str, 0L, (x) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                            dVarF.L(o58VarE5);
                            objR2 = o58VarE5;
                        }
                        o58Var = (o58) objR2;
                        textFieldValueI = TextFieldValue.i(k(o58Var), str, 0L, null, 6, null);
                        zX = dVarF.x(textFieldValueI);
                        Function1<? super TextLayoutResult, Unit> function10 = function5;
                        objR3 = dVarF.R();
                        b bVar9 = bVar4;
                        if (zX) {
                            objR3 = new Function0() { // from class: com.google.android.uh0
                                public final Object invoke() {
                                    return a.m(textFieldValueI, o58Var);
                                }
                            };
                            dVarF.L(objR3);
                        } else {
                            objR3 = new Function0() { // from class: com.google.android.uh0
                                public final Object invoke() {
                                    return a.m(textFieldValueI, o58Var);
                                }
                            };
                            dVarF.L(objR3);
                        }
                        vn3.i((Function0) objR3, dVarF, 0);
                        if ((i39 & 14) == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objR4 = dVarF.R();
                        if (z13) {
                            objR4 = s0.e(str, null, 2, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = s0.e(str, null, 2, null);
                            dVarF.L(objR4);
                        }
                        o58Var2 = (o58) objR4;
                        ImeOptions imeOptionsI5 = keyboardOptions3.i(z11);
                        boolean z112 = !z11;
                        if (z11) {
                            i40 = 1;
                        } else {
                            i40 = i2;
                        }
                        if (z11) {
                            i41 = 1;
                        } else {
                            i41 = i;
                        }
                        KeyboardOptions keyboardOptions8 = keyboardOptions3;
                        zX2 = dVarF.x(o58Var2) | ((i39 & 112) == 32);
                        objR5 = dVarF.R();
                        if (zX2) {
                            objR5 = new Function1() { // from class: com.google.android.vh0
                                public final Object invoke(Object obj) {
                                    return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                                }
                            };
                            dVarF.L(objR5);
                        } else {
                            objR5 = new Function1() { // from class: com.google.android.vh0
                                public final Object invoke(Object obj) {
                                    return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                                }
                            };
                            dVarF.L(objR5);
                        }
                        int i47 = i34 << 9;
                        dVar2 = dVarF;
                        boolean z113 = z4;
                        CoreTextFieldKt.w(textFieldValueI, (Function1) objR5, bVar9, textStyle3, nceVar3, function10, r48Var4, qu0Var3, z112, i41, i40, imeOptionsI5, mVar3, z113, z12, ps4VarF, null, dVar2, (i39 & 896) | ((i39 >> 6) & 7168) | (57344 & i47) | (458752 & i47) | (3670016 & i47) | (i47 & 29360128), ((i39 >> 15) & 896) | (i39 & 7168) | (57344 & i39) | (i34 & 458752), 65536);
                        if (e.k()) {
                            e.n();
                        }
                        textStyle2 = textStyle3;
                        r48Var2 = r48Var4;
                        qu0Var2 = qu0Var3;
                        z8 = z113;
                        z9 = z12;
                        ps4Var2 = ps4VarF;
                        keyboardOptions2 = keyboardOptions8;
                        z7 = z11;
                        bVar3 = bVar9;
                        nceVar2 = nceVar3;
                        function3 = function10;
                        mVar2 = mVar3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        z7 = z3;
                        ps4Var2 = ps4Var;
                        z8 = z4;
                        keyboardOptions2 = keyboardOptionsA;
                        z9 = z5;
                        textStyle2 = textStyleA;
                        bVar3 = bVar2;
                        nceVar2 = nceVar;
                        function3 = function2;
                        r48Var2 = r48Var;
                        qu0Var2 = qu0Var;
                    }
                    i35 = i;
                    i36 = i2;
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.wh0
                            public final Object invoke(Object obj, Object obj2) {
                                return a.q(str, function1, bVar3, z8, z9, textStyle2, keyboardOptions2, mVar2, z7, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i32 = i30 | 24576;
                i33 = i5 & 32768;
                if (i33 != 0) {
                    i32 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
                }
                i34 = i32;
                if ((i6 & 306783379) == 306783378) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (dVarF.g(z6, i6 & 1)) {
                    dVarF.U();
                    if ((i3 & 1) != 0) {
                        if (i42 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i13 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i15 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i37 = 1;
                            } else {
                                i37 = Integer.MAX_VALUE;
                            }
                            i6 &= -1879048193;
                        } else {
                            i37 = i;
                        }
                        if (i19 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i2;
                        }
                        if (i22 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        } else {
                            nceVarC = nceVar;
                        }
                        if (i25 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.th0
                                    public final Object invoke(Object obj) {
                                        return a.j((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        } else {
                            function4 = function2;
                        }
                        if (i28 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        mVar3 = mVarA;
                        if (i31 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                        } else {
                            solidColor = qu0Var;
                        }
                        if (i33 != 0) {
                            ps4VarF = qo1.a.f();
                        } else {
                            ps4VarF = ps4Var;
                        }
                        z11 = z10;
                        i = i37;
                        i2 = i38;
                        z12 = z5;
                        textStyle3 = textStyleA;
                        bVar4 = bVar2;
                        nceVar3 = nceVarC;
                        qu0Var3 = solidColor;
                        i39 = i6;
                        keyboardOptions3 = keyboardOptionsA;
                        function5 = function4;
                        r48Var4 = r48Var3;
                    } else {
                        if (i42 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i13 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i15 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i37 = 1;
                            } else {
                                i37 = Integer.MAX_VALUE;
                            }
                            i6 &= -1879048193;
                        } else {
                            i37 = i;
                        }
                        if (i19 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i2;
                        }
                        if (i22 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        } else {
                            nceVarC = nceVar;
                        }
                        if (i25 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.th0
                                    public final Object invoke(Object obj) {
                                        return a.j((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        } else {
                            function4 = function2;
                        }
                        if (i28 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        mVar3 = mVarA;
                        if (i31 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                        } else {
                            solidColor = qu0Var;
                        }
                        if (i33 != 0) {
                            ps4VarF = qo1.a.f();
                        } else {
                            ps4VarF = ps4Var;
                        }
                        z11 = z10;
                        i = i37;
                        i2 = i38;
                        z12 = z5;
                        textStyle3 = textStyleA;
                        bVar4 = bVar2;
                        nceVar3 = nceVarC;
                        qu0Var3 = solidColor;
                        i39 = i6;
                        keyboardOptions3 = keyboardOptionsA;
                        function5 = function4;
                        r48Var4 = r48Var3;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(2026950908, i39, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:776)");
                    }
                    objR2 = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR2 == companion.a()) {
                        o58 o58VarE6 = s0.e(new TextFieldValue(str, 0L, (x) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                        dVarF.L(o58VarE6);
                        objR2 = o58VarE6;
                    }
                    o58Var = (o58) objR2;
                    textFieldValueI = TextFieldValue.i(k(o58Var), str, 0L, null, 6, null);
                    zX = dVarF.x(textFieldValueI);
                    Function1<? super TextLayoutResult, Unit> function11 = function5;
                    objR3 = dVarF.R();
                    b bVar10 = bVar4;
                    if (zX) {
                        objR3 = new Function0() { // from class: com.google.android.uh0
                            public final Object invoke() {
                                return a.m(textFieldValueI, o58Var);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function0() { // from class: com.google.android.uh0
                            public final Object invoke() {
                                return a.m(textFieldValueI, o58Var);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    vn3.i((Function0) objR3, dVarF, 0);
                    if ((i39 & 14) == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objR4 = dVarF.R();
                    if (z13) {
                        objR4 = s0.e(str, null, 2, null);
                        dVarF.L(objR4);
                    } else {
                        objR4 = s0.e(str, null, 2, null);
                        dVarF.L(objR4);
                    }
                    o58Var2 = (o58) objR4;
                    ImeOptions imeOptionsI6 = keyboardOptions3.i(z11);
                    boolean z114 = !z11;
                    if (z11) {
                        i40 = 1;
                    } else {
                        i40 = i2;
                    }
                    if (z11) {
                        i41 = 1;
                    } else {
                        i41 = i;
                    }
                    KeyboardOptions keyboardOptions9 = keyboardOptions3;
                    zX2 = dVarF.x(o58Var2) | ((i39 & 112) == 32);
                    objR5 = dVarF.R();
                    if (zX2) {
                        objR5 = new Function1() { // from class: com.google.android.vh0
                            public final Object invoke(Object obj) {
                                return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                            }
                        };
                        dVarF.L(objR5);
                    } else {
                        objR5 = new Function1() { // from class: com.google.android.vh0
                            public final Object invoke(Object obj) {
                                return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                            }
                        };
                        dVarF.L(objR5);
                    }
                    int i48 = i34 << 9;
                    dVar2 = dVarF;
                    boolean z115 = z4;
                    CoreTextFieldKt.w(textFieldValueI, (Function1) objR5, bVar10, textStyle3, nceVar3, function11, r48Var4, qu0Var3, z114, i41, i40, imeOptionsI6, mVar3, z115, z12, ps4VarF, null, dVar2, (i39 & 896) | ((i39 >> 6) & 7168) | (57344 & i48) | (458752 & i48) | (3670016 & i48) | (i48 & 29360128), ((i39 >> 15) & 896) | (i39 & 7168) | (57344 & i39) | (i34 & 458752), 65536);
                    if (e.k()) {
                        e.n();
                    }
                    textStyle2 = textStyle3;
                    r48Var2 = r48Var4;
                    qu0Var2 = qu0Var3;
                    z8 = z115;
                    z9 = z12;
                    ps4Var2 = ps4VarF;
                    keyboardOptions2 = keyboardOptions9;
                    z7 = z11;
                    bVar3 = bVar10;
                    nceVar2 = nceVar3;
                    function3 = function11;
                    mVar2 = mVar3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    z7 = z3;
                    ps4Var2 = ps4Var;
                    z8 = z4;
                    keyboardOptions2 = keyboardOptionsA;
                    z9 = z5;
                    textStyle2 = textStyleA;
                    bVar3 = bVar2;
                    nceVar2 = nceVar;
                    function3 = function2;
                    r48Var2 = r48Var;
                    qu0Var2 = qu0Var;
                }
                i35 = i;
                i36 = i2;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.wh0
                        public final Object invoke(Object obj, Object obj2) {
                            return a.q(str, function1, bVar3, z8, z9, textStyle2, keyboardOptions2, mVar2, z7, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i6 |= 24576;
            z5 = z2;
            i11 = i5 & 32;
            if (i11 != 0) {
                i6 |= 196608;
                textStyleA = textStyle;
            } else {
                textStyleA = textStyle;
                if ((i3 & 196608) == 0) {
                    if (dVarF.x(textStyleA)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i6 |= i12;
                }
            }
            i13 = i5 & 64;
            if (i13 != 0) {
                i6 |= 1572864;
                keyboardOptionsA = keyboardOptions;
            } else {
                keyboardOptionsA = keyboardOptions;
                if ((i3 & 1572864) == 0) {
                    if (dVarF.x(keyboardOptionsA)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i6 |= i14;
                }
            }
            i15 = i5 & 128;
            if (i15 != 0) {
                i6 |= 12582912;
                mVar2 = mVar;
            } else {
                mVar2 = mVar;
                if ((i3 & 12582912) == 0) {
                    if (dVarF.x(mVar2)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i6 |= i16;
                }
            }
            i17 = i5 & 256;
            if (i17 != 0) {
                i6 |= 100663296;
            } else if ((i3 & 100663296) == 0) {
                if (dVarF.A(z3)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i6 |= i18;
            }
            if ((i3 & 805306368) != 0) {
                i6 |= ((i5 & 512) == 0 || !dVarF.C(i)) ? 268435456 : 536870912;
            }
            i19 = i5 & 1024;
            if (i19 != 0) {
                i20 = i4 | 6;
            } else if ((i4 & 6) == 0) {
                if (dVarF.C(i2)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i20 = i4 | i21;
            } else {
                i20 = i4;
            }
            i22 = i5 & 2048;
            if (i22 != 0) {
                i20 |= 48;
            } else if ((i4 & 48) != 0) {
                if (dVarF.x(nceVar)) {
                    i23 = 32;
                } else {
                    i23 = 16;
                }
                i20 |= i23;
            }
            i24 = i20;
            i25 = i5 & 4096;
            if (i25 != 0) {
                i26 = i24 | 384;
            } else if ((i4 & 384) == 0) {
                if (dVarF.T(function2)) {
                    i27 = 256;
                } else {
                    i27 = 128;
                }
                i26 = i24 | i27;
            } else {
                i26 = i24;
            }
            i28 = i5 & 8192;
            if (i28 != 0) {
                i30 = i26 | 3072;
            } else {
                i29 = i26;
                if ((i4 & 3072) == 0) {
                    i30 = i29 | (dVarF.x(r48Var) ? 2048 : 1024);
                } else {
                    i30 = i29;
                }
            }
            i31 = i5 & 16384;
            if (i31 != 0) {
                i32 = i30;
                if ((i4 & 24576) == 0) {
                    i32 |= dVarF.x(qu0Var) ? 16384 : 8192;
                }
                i33 = i5 & 32768;
                if (i33 != 0) {
                    i32 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
                }
                i34 = i32;
                if ((i6 & 306783379) == 306783378) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (dVarF.g(z6, i6 & 1)) {
                    dVarF.U();
                    if ((i3 & 1) != 0) {
                        if (i42 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i13 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i15 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i37 = 1;
                            } else {
                                i37 = Integer.MAX_VALUE;
                            }
                            i6 &= -1879048193;
                        } else {
                            i37 = i;
                        }
                        if (i19 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i2;
                        }
                        if (i22 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        } else {
                            nceVarC = nceVar;
                        }
                        if (i25 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.th0
                                    public final Object invoke(Object obj) {
                                        return a.j((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        } else {
                            function4 = function2;
                        }
                        if (i28 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        mVar3 = mVarA;
                        if (i31 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                        } else {
                            solidColor = qu0Var;
                        }
                        if (i33 != 0) {
                            ps4VarF = qo1.a.f();
                        } else {
                            ps4VarF = ps4Var;
                        }
                        z11 = z10;
                        i = i37;
                        i2 = i38;
                        z12 = z5;
                        textStyle3 = textStyleA;
                        bVar4 = bVar2;
                        nceVar3 = nceVarC;
                        qu0Var3 = solidColor;
                        i39 = i6;
                        keyboardOptions3 = keyboardOptionsA;
                        function5 = function4;
                        r48Var4 = r48Var3;
                    } else {
                        if (i42 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i13 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i15 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i37 = 1;
                            } else {
                                i37 = Integer.MAX_VALUE;
                            }
                            i6 &= -1879048193;
                        } else {
                            i37 = i;
                        }
                        if (i19 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i2;
                        }
                        if (i22 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        } else {
                            nceVarC = nceVar;
                        }
                        if (i25 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.th0
                                    public final Object invoke(Object obj) {
                                        return a.j((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        } else {
                            function4 = function2;
                        }
                        if (i28 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        mVar3 = mVarA;
                        if (i31 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                        } else {
                            solidColor = qu0Var;
                        }
                        if (i33 != 0) {
                            ps4VarF = qo1.a.f();
                        } else {
                            ps4VarF = ps4Var;
                        }
                        z11 = z10;
                        i = i37;
                        i2 = i38;
                        z12 = z5;
                        textStyle3 = textStyleA;
                        bVar4 = bVar2;
                        nceVar3 = nceVarC;
                        qu0Var3 = solidColor;
                        i39 = i6;
                        keyboardOptions3 = keyboardOptionsA;
                        function5 = function4;
                        r48Var4 = r48Var3;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(2026950908, i39, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:776)");
                    }
                    objR2 = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR2 == companion.a()) {
                        o58 o58VarE7 = s0.e(new TextFieldValue(str, 0L, (x) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                        dVarF.L(o58VarE7);
                        objR2 = o58VarE7;
                    }
                    o58Var = (o58) objR2;
                    textFieldValueI = TextFieldValue.i(k(o58Var), str, 0L, null, 6, null);
                    zX = dVarF.x(textFieldValueI);
                    Function1<? super TextLayoutResult, Unit> function12 = function5;
                    objR3 = dVarF.R();
                    b bVar11 = bVar4;
                    if (zX) {
                        objR3 = new Function0() { // from class: com.google.android.uh0
                            public final Object invoke() {
                                return a.m(textFieldValueI, o58Var);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function0() { // from class: com.google.android.uh0
                            public final Object invoke() {
                                return a.m(textFieldValueI, o58Var);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    vn3.i((Function0) objR3, dVarF, 0);
                    if ((i39 & 14) == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objR4 = dVarF.R();
                    if (z13) {
                        objR4 = s0.e(str, null, 2, null);
                        dVarF.L(objR4);
                    } else {
                        objR4 = s0.e(str, null, 2, null);
                        dVarF.L(objR4);
                    }
                    o58Var2 = (o58) objR4;
                    ImeOptions imeOptionsI7 = keyboardOptions3.i(z11);
                    boolean z116 = !z11;
                    if (z11) {
                        i40 = 1;
                    } else {
                        i40 = i2;
                    }
                    if (z11) {
                        i41 = 1;
                    } else {
                        i41 = i;
                    }
                    KeyboardOptions keyboardOptions10 = keyboardOptions3;
                    zX2 = dVarF.x(o58Var2) | ((i39 & 112) == 32);
                    objR5 = dVarF.R();
                    if (zX2) {
                        objR5 = new Function1() { // from class: com.google.android.vh0
                            public final Object invoke(Object obj) {
                                return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                            }
                        };
                        dVarF.L(objR5);
                    } else {
                        objR5 = new Function1() { // from class: com.google.android.vh0
                            public final Object invoke(Object obj) {
                                return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                            }
                        };
                        dVarF.L(objR5);
                    }
                    int i49 = i34 << 9;
                    dVar2 = dVarF;
                    boolean z117 = z4;
                    CoreTextFieldKt.w(textFieldValueI, (Function1) objR5, bVar11, textStyle3, nceVar3, function12, r48Var4, qu0Var3, z116, i41, i40, imeOptionsI7, mVar3, z117, z12, ps4VarF, null, dVar2, (i39 & 896) | ((i39 >> 6) & 7168) | (57344 & i49) | (458752 & i49) | (3670016 & i49) | (i49 & 29360128), ((i39 >> 15) & 896) | (i39 & 7168) | (57344 & i39) | (i34 & 458752), 65536);
                    if (e.k()) {
                        e.n();
                    }
                    textStyle2 = textStyle3;
                    r48Var2 = r48Var4;
                    qu0Var2 = qu0Var3;
                    z8 = z117;
                    z9 = z12;
                    ps4Var2 = ps4VarF;
                    keyboardOptions2 = keyboardOptions10;
                    z7 = z11;
                    bVar3 = bVar11;
                    nceVar2 = nceVar3;
                    function3 = function12;
                    mVar2 = mVar3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    z7 = z3;
                    ps4Var2 = ps4Var;
                    z8 = z4;
                    keyboardOptions2 = keyboardOptionsA;
                    z9 = z5;
                    textStyle2 = textStyleA;
                    bVar3 = bVar2;
                    nceVar2 = nceVar;
                    function3 = function2;
                    r48Var2 = r48Var;
                    qu0Var2 = qu0Var;
                }
                i35 = i;
                i36 = i2;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.wh0
                        public final Object invoke(Object obj, Object obj2) {
                            return a.q(str, function1, bVar3, z8, z9, textStyle2, keyboardOptions2, mVar2, z7, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i32 = i30 | 24576;
            i33 = i5 & 32768;
            if (i33 != 0) {
                i32 |= 196608;
            } else if ((i4 & 196608) == 0) {
                i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
            }
            i34 = i32;
            if ((i6 & 306783379) == 306783378) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (dVarF.g(z6, i6 & 1)) {
                dVarF.U();
                if ((i3 & 1) != 0) {
                    if (i42 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i9 != 0) {
                        z5 = false;
                    }
                    if (i11 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i13 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i15 != 0) {
                        mVarA = m.INSTANCE.a();
                    } else {
                        mVarA = mVar2;
                    }
                    if (i17 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 512) != 0) {
                        if (z10) {
                            i37 = 1;
                        } else {
                            i37 = Integer.MAX_VALUE;
                        }
                        i6 &= -1879048193;
                    } else {
                        i37 = i;
                    }
                    if (i19 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i2;
                    }
                    if (i22 != 0) {
                        nceVarC = nce.INSTANCE.c();
                    } else {
                        nceVarC = nceVar;
                    }
                    if (i25 != 0) {
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1() { // from class: com.google.android.th0
                                public final Object invoke(Object obj) {
                                    return a.j((TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR);
                        }
                        function4 = (Function1) objR;
                    } else {
                        function4 = function2;
                    }
                    if (i28 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    mVar3 = mVarA;
                    if (i31 != 0) {
                        solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                    } else {
                        solidColor = qu0Var;
                    }
                    if (i33 != 0) {
                        ps4VarF = qo1.a.f();
                    } else {
                        ps4VarF = ps4Var;
                    }
                    z11 = z10;
                    i = i37;
                    i2 = i38;
                    z12 = z5;
                    textStyle3 = textStyleA;
                    bVar4 = bVar2;
                    nceVar3 = nceVarC;
                    qu0Var3 = solidColor;
                    i39 = i6;
                    keyboardOptions3 = keyboardOptionsA;
                    function5 = function4;
                    r48Var4 = r48Var3;
                } else {
                    if (i42 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i9 != 0) {
                        z5 = false;
                    }
                    if (i11 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i13 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i15 != 0) {
                        mVarA = m.INSTANCE.a();
                    } else {
                        mVarA = mVar2;
                    }
                    if (i17 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 512) != 0) {
                        if (z10) {
                            i37 = 1;
                        } else {
                            i37 = Integer.MAX_VALUE;
                        }
                        i6 &= -1879048193;
                    } else {
                        i37 = i;
                    }
                    if (i19 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i2;
                    }
                    if (i22 != 0) {
                        nceVarC = nce.INSTANCE.c();
                    } else {
                        nceVarC = nceVar;
                    }
                    if (i25 != 0) {
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1() { // from class: com.google.android.th0
                                public final Object invoke(Object obj) {
                                    return a.j((TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR);
                        }
                        function4 = (Function1) objR;
                    } else {
                        function4 = function2;
                    }
                    if (i28 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    mVar3 = mVarA;
                    if (i31 != 0) {
                        solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                    } else {
                        solidColor = qu0Var;
                    }
                    if (i33 != 0) {
                        ps4VarF = qo1.a.f();
                    } else {
                        ps4VarF = ps4Var;
                    }
                    z11 = z10;
                    i = i37;
                    i2 = i38;
                    z12 = z5;
                    textStyle3 = textStyleA;
                    bVar4 = bVar2;
                    nceVar3 = nceVarC;
                    qu0Var3 = solidColor;
                    i39 = i6;
                    keyboardOptions3 = keyboardOptionsA;
                    function5 = function4;
                    r48Var4 = r48Var3;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(2026950908, i39, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:776)");
                }
                objR2 = dVarF.R();
                companion = d.INSTANCE;
                if (objR2 == companion.a()) {
                    o58 o58VarE8 = s0.e(new TextFieldValue(str, 0L, (x) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    dVarF.L(o58VarE8);
                    objR2 = o58VarE8;
                }
                o58Var = (o58) objR2;
                textFieldValueI = TextFieldValue.i(k(o58Var), str, 0L, null, 6, null);
                zX = dVarF.x(textFieldValueI);
                Function1<? super TextLayoutResult, Unit> function13 = function5;
                objR3 = dVarF.R();
                b bVar12 = bVar4;
                if (zX) {
                    objR3 = new Function0() { // from class: com.google.android.uh0
                        public final Object invoke() {
                            return a.m(textFieldValueI, o58Var);
                        }
                    };
                    dVarF.L(objR3);
                } else {
                    objR3 = new Function0() { // from class: com.google.android.uh0
                        public final Object invoke() {
                            return a.m(textFieldValueI, o58Var);
                        }
                    };
                    dVarF.L(objR3);
                }
                vn3.i((Function0) objR3, dVarF, 0);
                if ((i39 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objR4 = dVarF.R();
                if (z13) {
                    objR4 = s0.e(str, null, 2, null);
                    dVarF.L(objR4);
                } else {
                    objR4 = s0.e(str, null, 2, null);
                    dVarF.L(objR4);
                }
                o58Var2 = (o58) objR4;
                ImeOptions imeOptionsI8 = keyboardOptions3.i(z11);
                boolean z118 = !z11;
                if (z11) {
                    i40 = 1;
                } else {
                    i40 = i2;
                }
                if (z11) {
                    i41 = 1;
                } else {
                    i41 = i;
                }
                KeyboardOptions keyboardOptions11 = keyboardOptions3;
                zX2 = dVarF.x(o58Var2) | ((i39 & 112) == 32);
                objR5 = dVarF.R();
                if (zX2) {
                    objR5 = new Function1() { // from class: com.google.android.vh0
                        public final Object invoke(Object obj) {
                            return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                        }
                    };
                    dVarF.L(objR5);
                } else {
                    objR5 = new Function1() { // from class: com.google.android.vh0
                        public final Object invoke(Object obj) {
                            return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                        }
                    };
                    dVarF.L(objR5);
                }
                int i410 = i34 << 9;
                dVar2 = dVarF;
                boolean z119 = z4;
                CoreTextFieldKt.w(textFieldValueI, (Function1) objR5, bVar12, textStyle3, nceVar3, function13, r48Var4, qu0Var3, z118, i41, i40, imeOptionsI8, mVar3, z119, z12, ps4VarF, null, dVar2, (i39 & 896) | ((i39 >> 6) & 7168) | (57344 & i410) | (458752 & i410) | (3670016 & i410) | (i410 & 29360128), ((i39 >> 15) & 896) | (i39 & 7168) | (57344 & i39) | (i34 & 458752), 65536);
                if (e.k()) {
                    e.n();
                }
                textStyle2 = textStyle3;
                r48Var2 = r48Var4;
                qu0Var2 = qu0Var3;
                z8 = z119;
                z9 = z12;
                ps4Var2 = ps4VarF;
                keyboardOptions2 = keyboardOptions11;
                z7 = z11;
                bVar3 = bVar12;
                nceVar2 = nceVar3;
                function3 = function13;
                mVar2 = mVar3;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                z7 = z3;
                ps4Var2 = ps4Var;
                z8 = z4;
                keyboardOptions2 = keyboardOptionsA;
                z9 = z5;
                textStyle2 = textStyleA;
                bVar3 = bVar2;
                nceVar2 = nceVar;
                function3 = function2;
                r48Var2 = r48Var;
                qu0Var2 = qu0Var;
            }
            i35 = i;
            i36 = i2;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.wh0
                    public final Object invoke(Object obj, Object obj2) {
                        return a.q(str, function1, bVar3, z8, z9, textStyle2, keyboardOptions2, mVar2, z7, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i6 |= 384;
        bVar2 = bVar;
        i7 = i5 & 8;
        if (i7 != 0) {
            if ((i3 & 3072) == 0) {
                z4 = z;
                if (dVarF.A(z4)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i6 |= i8;
            }
            i9 = i5 & 16;
            if (i9 != 0) {
                if ((i3 & 24576) == 0) {
                    z5 = z2;
                    if (dVarF.A(z5)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i6 |= i10;
                }
                i11 = i5 & 32;
                if (i11 != 0) {
                    i6 |= 196608;
                    textStyleA = textStyle;
                } else {
                    textStyleA = textStyle;
                    if ((i3 & 196608) == 0) {
                        if (dVarF.x(textStyleA)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i6 |= i12;
                    }
                }
                i13 = i5 & 64;
                if (i13 != 0) {
                    i6 |= 1572864;
                    keyboardOptionsA = keyboardOptions;
                } else {
                    keyboardOptionsA = keyboardOptions;
                    if ((i3 & 1572864) == 0) {
                        if (dVarF.x(keyboardOptionsA)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i6 |= i14;
                    }
                }
                i15 = i5 & 128;
                if (i15 != 0) {
                    i6 |= 12582912;
                    mVar2 = mVar;
                } else {
                    mVar2 = mVar;
                    if ((i3 & 12582912) == 0) {
                        if (dVarF.x(mVar2)) {
                            i16 = 8388608;
                        } else {
                            i16 = 4194304;
                        }
                        i6 |= i16;
                    }
                }
                i17 = i5 & 256;
                if (i17 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 100663296) == 0) {
                    if (dVarF.A(z3)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i6 |= i18;
                }
                if ((i3 & 805306368) != 0) {
                    i6 |= ((i5 & 512) == 0 || !dVarF.C(i)) ? 268435456 : 536870912;
                }
                i19 = i5 & 1024;
                if (i19 != 0) {
                    i20 = i4 | 6;
                } else if ((i4 & 6) == 0) {
                    if (dVarF.C(i2)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i4 | i21;
                } else {
                    i20 = i4;
                }
                i22 = i5 & 2048;
                if (i22 != 0) {
                    i20 |= 48;
                } else if ((i4 & 48) != 0) {
                    if (dVarF.x(nceVar)) {
                        i23 = 32;
                    } else {
                        i23 = 16;
                    }
                    i20 |= i23;
                }
                i24 = i20;
                i25 = i5 & 4096;
                if (i25 != 0) {
                    i26 = i24 | 384;
                } else if ((i4 & 384) == 0) {
                    if (dVarF.T(function2)) {
                        i27 = 256;
                    } else {
                        i27 = 128;
                    }
                    i26 = i24 | i27;
                } else {
                    i26 = i24;
                }
                i28 = i5 & 8192;
                if (i28 != 0) {
                    i30 = i26 | 3072;
                } else {
                    i29 = i26;
                    if ((i4 & 3072) == 0) {
                        i30 = i29 | (dVarF.x(r48Var) ? 2048 : 1024);
                    } else {
                        i30 = i29;
                    }
                }
                i31 = i5 & 16384;
                if (i31 != 0) {
                    i32 = i30;
                    if ((i4 & 24576) == 0) {
                        i32 |= dVarF.x(qu0Var) ? 16384 : 8192;
                    }
                    i33 = i5 & 32768;
                    if (i33 != 0) {
                        i32 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
                    }
                    i34 = i32;
                    if ((i6 & 306783379) == 306783378) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (dVarF.g(z6, i6 & 1)) {
                        dVarF.U();
                        if ((i3 & 1) != 0) {
                            if (i42 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i7 != 0) {
                                z4 = true;
                            }
                            if (i9 != 0) {
                                z5 = false;
                            }
                            if (i11 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i13 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i15 != 0) {
                                mVarA = m.INSTANCE.a();
                            } else {
                                mVarA = mVar2;
                            }
                            if (i17 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if ((i5 & 512) != 0) {
                                if (z10) {
                                    i37 = 1;
                                } else {
                                    i37 = Integer.MAX_VALUE;
                                }
                                i6 &= -1879048193;
                            } else {
                                i37 = i;
                            }
                            if (i19 != 0) {
                                i38 = 1;
                            } else {
                                i38 = i2;
                            }
                            if (i22 != 0) {
                                nceVarC = nce.INSTANCE.c();
                            } else {
                                nceVarC = nceVar;
                            }
                            if (i25 != 0) {
                                objR = dVarF.R();
                                if (objR == d.INSTANCE.a()) {
                                    objR = new Function1() { // from class: com.google.android.th0
                                        public final Object invoke(Object obj) {
                                            return a.j((TextLayoutResult) obj);
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function4 = (Function1) objR;
                            } else {
                                function4 = function2;
                            }
                            if (i28 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            mVar3 = mVarA;
                            if (i31 != 0) {
                                solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                            } else {
                                solidColor = qu0Var;
                            }
                            if (i33 != 0) {
                                ps4VarF = qo1.a.f();
                            } else {
                                ps4VarF = ps4Var;
                            }
                            z11 = z10;
                            i = i37;
                            i2 = i38;
                            z12 = z5;
                            textStyle3 = textStyleA;
                            bVar4 = bVar2;
                            nceVar3 = nceVarC;
                            qu0Var3 = solidColor;
                            i39 = i6;
                            keyboardOptions3 = keyboardOptionsA;
                            function5 = function4;
                            r48Var4 = r48Var3;
                        } else {
                            if (i42 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i7 != 0) {
                                z4 = true;
                            }
                            if (i9 != 0) {
                                z5 = false;
                            }
                            if (i11 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i13 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i15 != 0) {
                                mVarA = m.INSTANCE.a();
                            } else {
                                mVarA = mVar2;
                            }
                            if (i17 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if ((i5 & 512) != 0) {
                                if (z10) {
                                    i37 = 1;
                                } else {
                                    i37 = Integer.MAX_VALUE;
                                }
                                i6 &= -1879048193;
                            } else {
                                i37 = i;
                            }
                            if (i19 != 0) {
                                i38 = 1;
                            } else {
                                i38 = i2;
                            }
                            if (i22 != 0) {
                                nceVarC = nce.INSTANCE.c();
                            } else {
                                nceVarC = nceVar;
                            }
                            if (i25 != 0) {
                                objR = dVarF.R();
                                if (objR == d.INSTANCE.a()) {
                                    objR = new Function1() { // from class: com.google.android.th0
                                        public final Object invoke(Object obj) {
                                            return a.j((TextLayoutResult) obj);
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function4 = (Function1) objR;
                            } else {
                                function4 = function2;
                            }
                            if (i28 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            mVar3 = mVarA;
                            if (i31 != 0) {
                                solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                            } else {
                                solidColor = qu0Var;
                            }
                            if (i33 != 0) {
                                ps4VarF = qo1.a.f();
                            } else {
                                ps4VarF = ps4Var;
                            }
                            z11 = z10;
                            i = i37;
                            i2 = i38;
                            z12 = z5;
                            textStyle3 = textStyleA;
                            bVar4 = bVar2;
                            nceVar3 = nceVarC;
                            qu0Var3 = solidColor;
                            i39 = i6;
                            keyboardOptions3 = keyboardOptionsA;
                            function5 = function4;
                            r48Var4 = r48Var3;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(2026950908, i39, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:776)");
                        }
                        objR2 = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR2 == companion.a()) {
                            o58 o58VarE9 = s0.e(new TextFieldValue(str, 0L, (x) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                            dVarF.L(o58VarE9);
                            objR2 = o58VarE9;
                        }
                        o58Var = (o58) objR2;
                        textFieldValueI = TextFieldValue.i(k(o58Var), str, 0L, null, 6, null);
                        zX = dVarF.x(textFieldValueI);
                        Function1<? super TextLayoutResult, Unit> function14 = function5;
                        objR3 = dVarF.R();
                        b bVar13 = bVar4;
                        if (zX) {
                            objR3 = new Function0() { // from class: com.google.android.uh0
                                public final Object invoke() {
                                    return a.m(textFieldValueI, o58Var);
                                }
                            };
                            dVarF.L(objR3);
                        } else {
                            objR3 = new Function0() { // from class: com.google.android.uh0
                                public final Object invoke() {
                                    return a.m(textFieldValueI, o58Var);
                                }
                            };
                            dVarF.L(objR3);
                        }
                        vn3.i((Function0) objR3, dVarF, 0);
                        if ((i39 & 14) == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objR4 = dVarF.R();
                        if (z13) {
                            objR4 = s0.e(str, null, 2, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = s0.e(str, null, 2, null);
                            dVarF.L(objR4);
                        }
                        o58Var2 = (o58) objR4;
                        ImeOptions imeOptionsI9 = keyboardOptions3.i(z11);
                        boolean z1110 = !z11;
                        if (z11) {
                            i40 = 1;
                        } else {
                            i40 = i2;
                        }
                        if (z11) {
                            i41 = 1;
                        } else {
                            i41 = i;
                        }
                        KeyboardOptions keyboardOptions12 = keyboardOptions3;
                        zX2 = dVarF.x(o58Var2) | ((i39 & 112) == 32);
                        objR5 = dVarF.R();
                        if (zX2) {
                            objR5 = new Function1() { // from class: com.google.android.vh0
                                public final Object invoke(Object obj) {
                                    return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                                }
                            };
                            dVarF.L(objR5);
                        } else {
                            objR5 = new Function1() { // from class: com.google.android.vh0
                                public final Object invoke(Object obj) {
                                    return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                                }
                            };
                            dVarF.L(objR5);
                        }
                        int i411 = i34 << 9;
                        dVar2 = dVarF;
                        boolean z1111 = z4;
                        CoreTextFieldKt.w(textFieldValueI, (Function1) objR5, bVar13, textStyle3, nceVar3, function14, r48Var4, qu0Var3, z1110, i41, i40, imeOptionsI9, mVar3, z1111, z12, ps4VarF, null, dVar2, (i39 & 896) | ((i39 >> 6) & 7168) | (57344 & i411) | (458752 & i411) | (3670016 & i411) | (i411 & 29360128), ((i39 >> 15) & 896) | (i39 & 7168) | (57344 & i39) | (i34 & 458752), 65536);
                        if (e.k()) {
                            e.n();
                        }
                        textStyle2 = textStyle3;
                        r48Var2 = r48Var4;
                        qu0Var2 = qu0Var3;
                        z8 = z1111;
                        z9 = z12;
                        ps4Var2 = ps4VarF;
                        keyboardOptions2 = keyboardOptions12;
                        z7 = z11;
                        bVar3 = bVar13;
                        nceVar2 = nceVar3;
                        function3 = function14;
                        mVar2 = mVar3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        z7 = z3;
                        ps4Var2 = ps4Var;
                        z8 = z4;
                        keyboardOptions2 = keyboardOptionsA;
                        z9 = z5;
                        textStyle2 = textStyleA;
                        bVar3 = bVar2;
                        nceVar2 = nceVar;
                        function3 = function2;
                        r48Var2 = r48Var;
                        qu0Var2 = qu0Var;
                    }
                    i35 = i;
                    i36 = i2;
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.wh0
                            public final Object invoke(Object obj, Object obj2) {
                                return a.q(str, function1, bVar3, z8, z9, textStyle2, keyboardOptions2, mVar2, z7, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i32 = i30 | 24576;
                i33 = i5 & 32768;
                if (i33 != 0) {
                    i32 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
                }
                i34 = i32;
                if ((i6 & 306783379) == 306783378) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (dVarF.g(z6, i6 & 1)) {
                    dVarF.U();
                    if ((i3 & 1) != 0) {
                        if (i42 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i13 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i15 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i37 = 1;
                            } else {
                                i37 = Integer.MAX_VALUE;
                            }
                            i6 &= -1879048193;
                        } else {
                            i37 = i;
                        }
                        if (i19 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i2;
                        }
                        if (i22 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        } else {
                            nceVarC = nceVar;
                        }
                        if (i25 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.th0
                                    public final Object invoke(Object obj) {
                                        return a.j((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        } else {
                            function4 = function2;
                        }
                        if (i28 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        mVar3 = mVarA;
                        if (i31 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                        } else {
                            solidColor = qu0Var;
                        }
                        if (i33 != 0) {
                            ps4VarF = qo1.a.f();
                        } else {
                            ps4VarF = ps4Var;
                        }
                        z11 = z10;
                        i = i37;
                        i2 = i38;
                        z12 = z5;
                        textStyle3 = textStyleA;
                        bVar4 = bVar2;
                        nceVar3 = nceVarC;
                        qu0Var3 = solidColor;
                        i39 = i6;
                        keyboardOptions3 = keyboardOptionsA;
                        function5 = function4;
                        r48Var4 = r48Var3;
                    } else {
                        if (i42 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i13 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i15 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i37 = 1;
                            } else {
                                i37 = Integer.MAX_VALUE;
                            }
                            i6 &= -1879048193;
                        } else {
                            i37 = i;
                        }
                        if (i19 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i2;
                        }
                        if (i22 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        } else {
                            nceVarC = nceVar;
                        }
                        if (i25 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.th0
                                    public final Object invoke(Object obj) {
                                        return a.j((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        } else {
                            function4 = function2;
                        }
                        if (i28 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        mVar3 = mVarA;
                        if (i31 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                        } else {
                            solidColor = qu0Var;
                        }
                        if (i33 != 0) {
                            ps4VarF = qo1.a.f();
                        } else {
                            ps4VarF = ps4Var;
                        }
                        z11 = z10;
                        i = i37;
                        i2 = i38;
                        z12 = z5;
                        textStyle3 = textStyleA;
                        bVar4 = bVar2;
                        nceVar3 = nceVarC;
                        qu0Var3 = solidColor;
                        i39 = i6;
                        keyboardOptions3 = keyboardOptionsA;
                        function5 = function4;
                        r48Var4 = r48Var3;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(2026950908, i39, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:776)");
                    }
                    objR2 = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR2 == companion.a()) {
                        o58 o58VarE10 = s0.e(new TextFieldValue(str, 0L, (x) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                        dVarF.L(o58VarE10);
                        objR2 = o58VarE10;
                    }
                    o58Var = (o58) objR2;
                    textFieldValueI = TextFieldValue.i(k(o58Var), str, 0L, null, 6, null);
                    zX = dVarF.x(textFieldValueI);
                    Function1<? super TextLayoutResult, Unit> function15 = function5;
                    objR3 = dVarF.R();
                    b bVar14 = bVar4;
                    if (zX) {
                        objR3 = new Function0() { // from class: com.google.android.uh0
                            public final Object invoke() {
                                return a.m(textFieldValueI, o58Var);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function0() { // from class: com.google.android.uh0
                            public final Object invoke() {
                                return a.m(textFieldValueI, o58Var);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    vn3.i((Function0) objR3, dVarF, 0);
                    if ((i39 & 14) == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objR4 = dVarF.R();
                    if (z13) {
                        objR4 = s0.e(str, null, 2, null);
                        dVarF.L(objR4);
                    } else {
                        objR4 = s0.e(str, null, 2, null);
                        dVarF.L(objR4);
                    }
                    o58Var2 = (o58) objR4;
                    ImeOptions imeOptionsI10 = keyboardOptions3.i(z11);
                    boolean z1112 = !z11;
                    if (z11) {
                        i40 = 1;
                    } else {
                        i40 = i2;
                    }
                    if (z11) {
                        i41 = 1;
                    } else {
                        i41 = i;
                    }
                    KeyboardOptions keyboardOptions13 = keyboardOptions3;
                    zX2 = dVarF.x(o58Var2) | ((i39 & 112) == 32);
                    objR5 = dVarF.R();
                    if (zX2) {
                        objR5 = new Function1() { // from class: com.google.android.vh0
                            public final Object invoke(Object obj) {
                                return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                            }
                        };
                        dVarF.L(objR5);
                    } else {
                        objR5 = new Function1() { // from class: com.google.android.vh0
                            public final Object invoke(Object obj) {
                                return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                            }
                        };
                        dVarF.L(objR5);
                    }
                    int i412 = i34 << 9;
                    dVar2 = dVarF;
                    boolean z1113 = z4;
                    CoreTextFieldKt.w(textFieldValueI, (Function1) objR5, bVar14, textStyle3, nceVar3, function15, r48Var4, qu0Var3, z1112, i41, i40, imeOptionsI10, mVar3, z1113, z12, ps4VarF, null, dVar2, (i39 & 896) | ((i39 >> 6) & 7168) | (57344 & i412) | (458752 & i412) | (3670016 & i412) | (i412 & 29360128), ((i39 >> 15) & 896) | (i39 & 7168) | (57344 & i39) | (i34 & 458752), 65536);
                    if (e.k()) {
                        e.n();
                    }
                    textStyle2 = textStyle3;
                    r48Var2 = r48Var4;
                    qu0Var2 = qu0Var3;
                    z8 = z1113;
                    z9 = z12;
                    ps4Var2 = ps4VarF;
                    keyboardOptions2 = keyboardOptions13;
                    z7 = z11;
                    bVar3 = bVar14;
                    nceVar2 = nceVar3;
                    function3 = function15;
                    mVar2 = mVar3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    z7 = z3;
                    ps4Var2 = ps4Var;
                    z8 = z4;
                    keyboardOptions2 = keyboardOptionsA;
                    z9 = z5;
                    textStyle2 = textStyleA;
                    bVar3 = bVar2;
                    nceVar2 = nceVar;
                    function3 = function2;
                    r48Var2 = r48Var;
                    qu0Var2 = qu0Var;
                }
                i35 = i;
                i36 = i2;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.wh0
                        public final Object invoke(Object obj, Object obj2) {
                            return a.q(str, function1, bVar3, z8, z9, textStyle2, keyboardOptions2, mVar2, z7, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i6 |= 24576;
            z5 = z2;
            i11 = i5 & 32;
            if (i11 != 0) {
                i6 |= 196608;
                textStyleA = textStyle;
            } else {
                textStyleA = textStyle;
                if ((i3 & 196608) == 0) {
                    if (dVarF.x(textStyleA)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i6 |= i12;
                }
            }
            i13 = i5 & 64;
            if (i13 != 0) {
                i6 |= 1572864;
                keyboardOptionsA = keyboardOptions;
            } else {
                keyboardOptionsA = keyboardOptions;
                if ((i3 & 1572864) == 0) {
                    if (dVarF.x(keyboardOptionsA)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i6 |= i14;
                }
            }
            i15 = i5 & 128;
            if (i15 != 0) {
                i6 |= 12582912;
                mVar2 = mVar;
            } else {
                mVar2 = mVar;
                if ((i3 & 12582912) == 0) {
                    if (dVarF.x(mVar2)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i6 |= i16;
                }
            }
            i17 = i5 & 256;
            if (i17 != 0) {
                i6 |= 100663296;
            } else if ((i3 & 100663296) == 0) {
                if (dVarF.A(z3)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i6 |= i18;
            }
            if ((i3 & 805306368) != 0) {
                i6 |= ((i5 & 512) == 0 || !dVarF.C(i)) ? 268435456 : 536870912;
            }
            i19 = i5 & 1024;
            if (i19 != 0) {
                i20 = i4 | 6;
            } else if ((i4 & 6) == 0) {
                if (dVarF.C(i2)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i20 = i4 | i21;
            } else {
                i20 = i4;
            }
            i22 = i5 & 2048;
            if (i22 != 0) {
                i20 |= 48;
            } else if ((i4 & 48) != 0) {
                if (dVarF.x(nceVar)) {
                    i23 = 32;
                } else {
                    i23 = 16;
                }
                i20 |= i23;
            }
            i24 = i20;
            i25 = i5 & 4096;
            if (i25 != 0) {
                i26 = i24 | 384;
            } else if ((i4 & 384) == 0) {
                if (dVarF.T(function2)) {
                    i27 = 256;
                } else {
                    i27 = 128;
                }
                i26 = i24 | i27;
            } else {
                i26 = i24;
            }
            i28 = i5 & 8192;
            if (i28 != 0) {
                i30 = i26 | 3072;
            } else {
                i29 = i26;
                if ((i4 & 3072) == 0) {
                    i30 = i29 | (dVarF.x(r48Var) ? 2048 : 1024);
                } else {
                    i30 = i29;
                }
            }
            i31 = i5 & 16384;
            if (i31 != 0) {
                i32 = i30;
                if ((i4 & 24576) == 0) {
                    i32 |= dVarF.x(qu0Var) ? 16384 : 8192;
                }
                i33 = i5 & 32768;
                if (i33 != 0) {
                    i32 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
                }
                i34 = i32;
                if ((i6 & 306783379) == 306783378) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (dVarF.g(z6, i6 & 1)) {
                    dVarF.U();
                    if ((i3 & 1) != 0) {
                        if (i42 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i13 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i15 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i37 = 1;
                            } else {
                                i37 = Integer.MAX_VALUE;
                            }
                            i6 &= -1879048193;
                        } else {
                            i37 = i;
                        }
                        if (i19 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i2;
                        }
                        if (i22 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        } else {
                            nceVarC = nceVar;
                        }
                        if (i25 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.th0
                                    public final Object invoke(Object obj) {
                                        return a.j((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        } else {
                            function4 = function2;
                        }
                        if (i28 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        mVar3 = mVarA;
                        if (i31 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                        } else {
                            solidColor = qu0Var;
                        }
                        if (i33 != 0) {
                            ps4VarF = qo1.a.f();
                        } else {
                            ps4VarF = ps4Var;
                        }
                        z11 = z10;
                        i = i37;
                        i2 = i38;
                        z12 = z5;
                        textStyle3 = textStyleA;
                        bVar4 = bVar2;
                        nceVar3 = nceVarC;
                        qu0Var3 = solidColor;
                        i39 = i6;
                        keyboardOptions3 = keyboardOptionsA;
                        function5 = function4;
                        r48Var4 = r48Var3;
                    } else {
                        if (i42 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i13 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i15 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i37 = 1;
                            } else {
                                i37 = Integer.MAX_VALUE;
                            }
                            i6 &= -1879048193;
                        } else {
                            i37 = i;
                        }
                        if (i19 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i2;
                        }
                        if (i22 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        } else {
                            nceVarC = nceVar;
                        }
                        if (i25 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.th0
                                    public final Object invoke(Object obj) {
                                        return a.j((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        } else {
                            function4 = function2;
                        }
                        if (i28 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        mVar3 = mVarA;
                        if (i31 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                        } else {
                            solidColor = qu0Var;
                        }
                        if (i33 != 0) {
                            ps4VarF = qo1.a.f();
                        } else {
                            ps4VarF = ps4Var;
                        }
                        z11 = z10;
                        i = i37;
                        i2 = i38;
                        z12 = z5;
                        textStyle3 = textStyleA;
                        bVar4 = bVar2;
                        nceVar3 = nceVarC;
                        qu0Var3 = solidColor;
                        i39 = i6;
                        keyboardOptions3 = keyboardOptionsA;
                        function5 = function4;
                        r48Var4 = r48Var3;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(2026950908, i39, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:776)");
                    }
                    objR2 = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR2 == companion.a()) {
                        o58 o58VarE11 = s0.e(new TextFieldValue(str, 0L, (x) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                        dVarF.L(o58VarE11);
                        objR2 = o58VarE11;
                    }
                    o58Var = (o58) objR2;
                    textFieldValueI = TextFieldValue.i(k(o58Var), str, 0L, null, 6, null);
                    zX = dVarF.x(textFieldValueI);
                    Function1<? super TextLayoutResult, Unit> function16 = function5;
                    objR3 = dVarF.R();
                    b bVar15 = bVar4;
                    if (zX) {
                        objR3 = new Function0() { // from class: com.google.android.uh0
                            public final Object invoke() {
                                return a.m(textFieldValueI, o58Var);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function0() { // from class: com.google.android.uh0
                            public final Object invoke() {
                                return a.m(textFieldValueI, o58Var);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    vn3.i((Function0) objR3, dVarF, 0);
                    if ((i39 & 14) == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objR4 = dVarF.R();
                    if (z13) {
                        objR4 = s0.e(str, null, 2, null);
                        dVarF.L(objR4);
                    } else {
                        objR4 = s0.e(str, null, 2, null);
                        dVarF.L(objR4);
                    }
                    o58Var2 = (o58) objR4;
                    ImeOptions imeOptionsI11 = keyboardOptions3.i(z11);
                    boolean z1114 = !z11;
                    if (z11) {
                        i40 = 1;
                    } else {
                        i40 = i2;
                    }
                    if (z11) {
                        i41 = 1;
                    } else {
                        i41 = i;
                    }
                    KeyboardOptions keyboardOptions14 = keyboardOptions3;
                    zX2 = dVarF.x(o58Var2) | ((i39 & 112) == 32);
                    objR5 = dVarF.R();
                    if (zX2) {
                        objR5 = new Function1() { // from class: com.google.android.vh0
                            public final Object invoke(Object obj) {
                                return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                            }
                        };
                        dVarF.L(objR5);
                    } else {
                        objR5 = new Function1() { // from class: com.google.android.vh0
                            public final Object invoke(Object obj) {
                                return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                            }
                        };
                        dVarF.L(objR5);
                    }
                    int i413 = i34 << 9;
                    dVar2 = dVarF;
                    boolean z1115 = z4;
                    CoreTextFieldKt.w(textFieldValueI, (Function1) objR5, bVar15, textStyle3, nceVar3, function16, r48Var4, qu0Var3, z1114, i41, i40, imeOptionsI11, mVar3, z1115, z12, ps4VarF, null, dVar2, (i39 & 896) | ((i39 >> 6) & 7168) | (57344 & i413) | (458752 & i413) | (3670016 & i413) | (i413 & 29360128), ((i39 >> 15) & 896) | (i39 & 7168) | (57344 & i39) | (i34 & 458752), 65536);
                    if (e.k()) {
                        e.n();
                    }
                    textStyle2 = textStyle3;
                    r48Var2 = r48Var4;
                    qu0Var2 = qu0Var3;
                    z8 = z1115;
                    z9 = z12;
                    ps4Var2 = ps4VarF;
                    keyboardOptions2 = keyboardOptions14;
                    z7 = z11;
                    bVar3 = bVar15;
                    nceVar2 = nceVar3;
                    function3 = function16;
                    mVar2 = mVar3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    z7 = z3;
                    ps4Var2 = ps4Var;
                    z8 = z4;
                    keyboardOptions2 = keyboardOptionsA;
                    z9 = z5;
                    textStyle2 = textStyleA;
                    bVar3 = bVar2;
                    nceVar2 = nceVar;
                    function3 = function2;
                    r48Var2 = r48Var;
                    qu0Var2 = qu0Var;
                }
                i35 = i;
                i36 = i2;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.wh0
                        public final Object invoke(Object obj, Object obj2) {
                            return a.q(str, function1, bVar3, z8, z9, textStyle2, keyboardOptions2, mVar2, z7, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i32 = i30 | 24576;
            i33 = i5 & 32768;
            if (i33 != 0) {
                i32 |= 196608;
            } else if ((i4 & 196608) == 0) {
                i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
            }
            i34 = i32;
            if ((i6 & 306783379) == 306783378) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (dVarF.g(z6, i6 & 1)) {
                dVarF.U();
                if ((i3 & 1) != 0) {
                    if (i42 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i9 != 0) {
                        z5 = false;
                    }
                    if (i11 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i13 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i15 != 0) {
                        mVarA = m.INSTANCE.a();
                    } else {
                        mVarA = mVar2;
                    }
                    if (i17 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 512) != 0) {
                        if (z10) {
                            i37 = 1;
                        } else {
                            i37 = Integer.MAX_VALUE;
                        }
                        i6 &= -1879048193;
                    } else {
                        i37 = i;
                    }
                    if (i19 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i2;
                    }
                    if (i22 != 0) {
                        nceVarC = nce.INSTANCE.c();
                    } else {
                        nceVarC = nceVar;
                    }
                    if (i25 != 0) {
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1() { // from class: com.google.android.th0
                                public final Object invoke(Object obj) {
                                    return a.j((TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR);
                        }
                        function4 = (Function1) objR;
                    } else {
                        function4 = function2;
                    }
                    if (i28 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    mVar3 = mVarA;
                    if (i31 != 0) {
                        solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                    } else {
                        solidColor = qu0Var;
                    }
                    if (i33 != 0) {
                        ps4VarF = qo1.a.f();
                    } else {
                        ps4VarF = ps4Var;
                    }
                    z11 = z10;
                    i = i37;
                    i2 = i38;
                    z12 = z5;
                    textStyle3 = textStyleA;
                    bVar4 = bVar2;
                    nceVar3 = nceVarC;
                    qu0Var3 = solidColor;
                    i39 = i6;
                    keyboardOptions3 = keyboardOptionsA;
                    function5 = function4;
                    r48Var4 = r48Var3;
                } else {
                    if (i42 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i9 != 0) {
                        z5 = false;
                    }
                    if (i11 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i13 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i15 != 0) {
                        mVarA = m.INSTANCE.a();
                    } else {
                        mVarA = mVar2;
                    }
                    if (i17 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 512) != 0) {
                        if (z10) {
                            i37 = 1;
                        } else {
                            i37 = Integer.MAX_VALUE;
                        }
                        i6 &= -1879048193;
                    } else {
                        i37 = i;
                    }
                    if (i19 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i2;
                    }
                    if (i22 != 0) {
                        nceVarC = nce.INSTANCE.c();
                    } else {
                        nceVarC = nceVar;
                    }
                    if (i25 != 0) {
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1() { // from class: com.google.android.th0
                                public final Object invoke(Object obj) {
                                    return a.j((TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR);
                        }
                        function4 = (Function1) objR;
                    } else {
                        function4 = function2;
                    }
                    if (i28 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    mVar3 = mVarA;
                    if (i31 != 0) {
                        solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                    } else {
                        solidColor = qu0Var;
                    }
                    if (i33 != 0) {
                        ps4VarF = qo1.a.f();
                    } else {
                        ps4VarF = ps4Var;
                    }
                    z11 = z10;
                    i = i37;
                    i2 = i38;
                    z12 = z5;
                    textStyle3 = textStyleA;
                    bVar4 = bVar2;
                    nceVar3 = nceVarC;
                    qu0Var3 = solidColor;
                    i39 = i6;
                    keyboardOptions3 = keyboardOptionsA;
                    function5 = function4;
                    r48Var4 = r48Var3;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(2026950908, i39, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:776)");
                }
                objR2 = dVarF.R();
                companion = d.INSTANCE;
                if (objR2 == companion.a()) {
                    o58 o58VarE12 = s0.e(new TextFieldValue(str, 0L, (x) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    dVarF.L(o58VarE12);
                    objR2 = o58VarE12;
                }
                o58Var = (o58) objR2;
                textFieldValueI = TextFieldValue.i(k(o58Var), str, 0L, null, 6, null);
                zX = dVarF.x(textFieldValueI);
                Function1<? super TextLayoutResult, Unit> function17 = function5;
                objR3 = dVarF.R();
                b bVar16 = bVar4;
                if (zX) {
                    objR3 = new Function0() { // from class: com.google.android.uh0
                        public final Object invoke() {
                            return a.m(textFieldValueI, o58Var);
                        }
                    };
                    dVarF.L(objR3);
                } else {
                    objR3 = new Function0() { // from class: com.google.android.uh0
                        public final Object invoke() {
                            return a.m(textFieldValueI, o58Var);
                        }
                    };
                    dVarF.L(objR3);
                }
                vn3.i((Function0) objR3, dVarF, 0);
                if ((i39 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objR4 = dVarF.R();
                if (z13) {
                    objR4 = s0.e(str, null, 2, null);
                    dVarF.L(objR4);
                } else {
                    objR4 = s0.e(str, null, 2, null);
                    dVarF.L(objR4);
                }
                o58Var2 = (o58) objR4;
                ImeOptions imeOptionsI12 = keyboardOptions3.i(z11);
                boolean z1116 = !z11;
                if (z11) {
                    i40 = 1;
                } else {
                    i40 = i2;
                }
                if (z11) {
                    i41 = 1;
                } else {
                    i41 = i;
                }
                KeyboardOptions keyboardOptions15 = keyboardOptions3;
                zX2 = dVarF.x(o58Var2) | ((i39 & 112) == 32);
                objR5 = dVarF.R();
                if (zX2) {
                    objR5 = new Function1() { // from class: com.google.android.vh0
                        public final Object invoke(Object obj) {
                            return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                        }
                    };
                    dVarF.L(objR5);
                } else {
                    objR5 = new Function1() { // from class: com.google.android.vh0
                        public final Object invoke(Object obj) {
                            return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                        }
                    };
                    dVarF.L(objR5);
                }
                int i414 = i34 << 9;
                dVar2 = dVarF;
                boolean z1117 = z4;
                CoreTextFieldKt.w(textFieldValueI, (Function1) objR5, bVar16, textStyle3, nceVar3, function17, r48Var4, qu0Var3, z1116, i41, i40, imeOptionsI12, mVar3, z1117, z12, ps4VarF, null, dVar2, (i39 & 896) | ((i39 >> 6) & 7168) | (57344 & i414) | (458752 & i414) | (3670016 & i414) | (i414 & 29360128), ((i39 >> 15) & 896) | (i39 & 7168) | (57344 & i39) | (i34 & 458752), 65536);
                if (e.k()) {
                    e.n();
                }
                textStyle2 = textStyle3;
                r48Var2 = r48Var4;
                qu0Var2 = qu0Var3;
                z8 = z1117;
                z9 = z12;
                ps4Var2 = ps4VarF;
                keyboardOptions2 = keyboardOptions15;
                z7 = z11;
                bVar3 = bVar16;
                nceVar2 = nceVar3;
                function3 = function17;
                mVar2 = mVar3;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                z7 = z3;
                ps4Var2 = ps4Var;
                z8 = z4;
                keyboardOptions2 = keyboardOptionsA;
                z9 = z5;
                textStyle2 = textStyleA;
                bVar3 = bVar2;
                nceVar2 = nceVar;
                function3 = function2;
                r48Var2 = r48Var;
                qu0Var2 = qu0Var;
            }
            i35 = i;
            i36 = i2;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.wh0
                    public final Object invoke(Object obj, Object obj2) {
                        return a.q(str, function1, bVar3, z8, z9, textStyle2, keyboardOptions2, mVar2, z7, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i6 |= 3072;
        z4 = z;
        i9 = i5 & 16;
        if (i9 != 0) {
            if ((i3 & 24576) == 0) {
                z5 = z2;
                if (dVarF.A(z5)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i6 |= i10;
            }
            i11 = i5 & 32;
            if (i11 != 0) {
                i6 |= 196608;
                textStyleA = textStyle;
            } else {
                textStyleA = textStyle;
                if ((i3 & 196608) == 0) {
                    if (dVarF.x(textStyleA)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i6 |= i12;
                }
            }
            i13 = i5 & 64;
            if (i13 != 0) {
                i6 |= 1572864;
                keyboardOptionsA = keyboardOptions;
            } else {
                keyboardOptionsA = keyboardOptions;
                if ((i3 & 1572864) == 0) {
                    if (dVarF.x(keyboardOptionsA)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i6 |= i14;
                }
            }
            i15 = i5 & 128;
            if (i15 != 0) {
                i6 |= 12582912;
                mVar2 = mVar;
            } else {
                mVar2 = mVar;
                if ((i3 & 12582912) == 0) {
                    if (dVarF.x(mVar2)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i6 |= i16;
                }
            }
            i17 = i5 & 256;
            if (i17 != 0) {
                i6 |= 100663296;
            } else if ((i3 & 100663296) == 0) {
                if (dVarF.A(z3)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i6 |= i18;
            }
            if ((i3 & 805306368) != 0) {
                i6 |= ((i5 & 512) == 0 || !dVarF.C(i)) ? 268435456 : 536870912;
            }
            i19 = i5 & 1024;
            if (i19 != 0) {
                i20 = i4 | 6;
            } else if ((i4 & 6) == 0) {
                if (dVarF.C(i2)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i20 = i4 | i21;
            } else {
                i20 = i4;
            }
            i22 = i5 & 2048;
            if (i22 != 0) {
                i20 |= 48;
            } else if ((i4 & 48) != 0) {
                if (dVarF.x(nceVar)) {
                    i23 = 32;
                } else {
                    i23 = 16;
                }
                i20 |= i23;
            }
            i24 = i20;
            i25 = i5 & 4096;
            if (i25 != 0) {
                i26 = i24 | 384;
            } else if ((i4 & 384) == 0) {
                if (dVarF.T(function2)) {
                    i27 = 256;
                } else {
                    i27 = 128;
                }
                i26 = i24 | i27;
            } else {
                i26 = i24;
            }
            i28 = i5 & 8192;
            if (i28 != 0) {
                i30 = i26 | 3072;
            } else {
                i29 = i26;
                if ((i4 & 3072) == 0) {
                    i30 = i29 | (dVarF.x(r48Var) ? 2048 : 1024);
                } else {
                    i30 = i29;
                }
            }
            i31 = i5 & 16384;
            if (i31 != 0) {
                i32 = i30;
                if ((i4 & 24576) == 0) {
                    i32 |= dVarF.x(qu0Var) ? 16384 : 8192;
                }
                i33 = i5 & 32768;
                if (i33 != 0) {
                    i32 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
                }
                i34 = i32;
                if ((i6 & 306783379) == 306783378) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (dVarF.g(z6, i6 & 1)) {
                    dVarF.U();
                    if ((i3 & 1) != 0) {
                        if (i42 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i13 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i15 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i37 = 1;
                            } else {
                                i37 = Integer.MAX_VALUE;
                            }
                            i6 &= -1879048193;
                        } else {
                            i37 = i;
                        }
                        if (i19 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i2;
                        }
                        if (i22 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        } else {
                            nceVarC = nceVar;
                        }
                        if (i25 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.th0
                                    public final Object invoke(Object obj) {
                                        return a.j((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        } else {
                            function4 = function2;
                        }
                        if (i28 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        mVar3 = mVarA;
                        if (i31 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                        } else {
                            solidColor = qu0Var;
                        }
                        if (i33 != 0) {
                            ps4VarF = qo1.a.f();
                        } else {
                            ps4VarF = ps4Var;
                        }
                        z11 = z10;
                        i = i37;
                        i2 = i38;
                        z12 = z5;
                        textStyle3 = textStyleA;
                        bVar4 = bVar2;
                        nceVar3 = nceVarC;
                        qu0Var3 = solidColor;
                        i39 = i6;
                        keyboardOptions3 = keyboardOptionsA;
                        function5 = function4;
                        r48Var4 = r48Var3;
                    } else {
                        if (i42 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i13 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i15 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i37 = 1;
                            } else {
                                i37 = Integer.MAX_VALUE;
                            }
                            i6 &= -1879048193;
                        } else {
                            i37 = i;
                        }
                        if (i19 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i2;
                        }
                        if (i22 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        } else {
                            nceVarC = nceVar;
                        }
                        if (i25 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.th0
                                    public final Object invoke(Object obj) {
                                        return a.j((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        } else {
                            function4 = function2;
                        }
                        if (i28 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        mVar3 = mVarA;
                        if (i31 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                        } else {
                            solidColor = qu0Var;
                        }
                        if (i33 != 0) {
                            ps4VarF = qo1.a.f();
                        } else {
                            ps4VarF = ps4Var;
                        }
                        z11 = z10;
                        i = i37;
                        i2 = i38;
                        z12 = z5;
                        textStyle3 = textStyleA;
                        bVar4 = bVar2;
                        nceVar3 = nceVarC;
                        qu0Var3 = solidColor;
                        i39 = i6;
                        keyboardOptions3 = keyboardOptionsA;
                        function5 = function4;
                        r48Var4 = r48Var3;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(2026950908, i39, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:776)");
                    }
                    objR2 = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR2 == companion.a()) {
                        o58 o58VarE13 = s0.e(new TextFieldValue(str, 0L, (x) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                        dVarF.L(o58VarE13);
                        objR2 = o58VarE13;
                    }
                    o58Var = (o58) objR2;
                    textFieldValueI = TextFieldValue.i(k(o58Var), str, 0L, null, 6, null);
                    zX = dVarF.x(textFieldValueI);
                    Function1<? super TextLayoutResult, Unit> function18 = function5;
                    objR3 = dVarF.R();
                    b bVar17 = bVar4;
                    if (zX) {
                        objR3 = new Function0() { // from class: com.google.android.uh0
                            public final Object invoke() {
                                return a.m(textFieldValueI, o58Var);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function0() { // from class: com.google.android.uh0
                            public final Object invoke() {
                                return a.m(textFieldValueI, o58Var);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    vn3.i((Function0) objR3, dVarF, 0);
                    if ((i39 & 14) == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objR4 = dVarF.R();
                    if (z13) {
                        objR4 = s0.e(str, null, 2, null);
                        dVarF.L(objR4);
                    } else {
                        objR4 = s0.e(str, null, 2, null);
                        dVarF.L(objR4);
                    }
                    o58Var2 = (o58) objR4;
                    ImeOptions imeOptionsI13 = keyboardOptions3.i(z11);
                    boolean z1118 = !z11;
                    if (z11) {
                        i40 = 1;
                    } else {
                        i40 = i2;
                    }
                    if (z11) {
                        i41 = 1;
                    } else {
                        i41 = i;
                    }
                    KeyboardOptions keyboardOptions16 = keyboardOptions3;
                    zX2 = dVarF.x(o58Var2) | ((i39 & 112) == 32);
                    objR5 = dVarF.R();
                    if (zX2) {
                        objR5 = new Function1() { // from class: com.google.android.vh0
                            public final Object invoke(Object obj) {
                                return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                            }
                        };
                        dVarF.L(objR5);
                    } else {
                        objR5 = new Function1() { // from class: com.google.android.vh0
                            public final Object invoke(Object obj) {
                                return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                            }
                        };
                        dVarF.L(objR5);
                    }
                    int i415 = i34 << 9;
                    dVar2 = dVarF;
                    boolean z1119 = z4;
                    CoreTextFieldKt.w(textFieldValueI, (Function1) objR5, bVar17, textStyle3, nceVar3, function18, r48Var4, qu0Var3, z1118, i41, i40, imeOptionsI13, mVar3, z1119, z12, ps4VarF, null, dVar2, (i39 & 896) | ((i39 >> 6) & 7168) | (57344 & i415) | (458752 & i415) | (3670016 & i415) | (i415 & 29360128), ((i39 >> 15) & 896) | (i39 & 7168) | (57344 & i39) | (i34 & 458752), 65536);
                    if (e.k()) {
                        e.n();
                    }
                    textStyle2 = textStyle3;
                    r48Var2 = r48Var4;
                    qu0Var2 = qu0Var3;
                    z8 = z1119;
                    z9 = z12;
                    ps4Var2 = ps4VarF;
                    keyboardOptions2 = keyboardOptions16;
                    z7 = z11;
                    bVar3 = bVar17;
                    nceVar2 = nceVar3;
                    function3 = function18;
                    mVar2 = mVar3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    z7 = z3;
                    ps4Var2 = ps4Var;
                    z8 = z4;
                    keyboardOptions2 = keyboardOptionsA;
                    z9 = z5;
                    textStyle2 = textStyleA;
                    bVar3 = bVar2;
                    nceVar2 = nceVar;
                    function3 = function2;
                    r48Var2 = r48Var;
                    qu0Var2 = qu0Var;
                }
                i35 = i;
                i36 = i2;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.wh0
                        public final Object invoke(Object obj, Object obj2) {
                            return a.q(str, function1, bVar3, z8, z9, textStyle2, keyboardOptions2, mVar2, z7, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i32 = i30 | 24576;
            i33 = i5 & 32768;
            if (i33 != 0) {
                i32 |= 196608;
            } else if ((i4 & 196608) == 0) {
                i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
            }
            i34 = i32;
            if ((i6 & 306783379) == 306783378) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (dVarF.g(z6, i6 & 1)) {
                dVarF.U();
                if ((i3 & 1) != 0) {
                    if (i42 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i9 != 0) {
                        z5 = false;
                    }
                    if (i11 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i13 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i15 != 0) {
                        mVarA = m.INSTANCE.a();
                    } else {
                        mVarA = mVar2;
                    }
                    if (i17 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 512) != 0) {
                        if (z10) {
                            i37 = 1;
                        } else {
                            i37 = Integer.MAX_VALUE;
                        }
                        i6 &= -1879048193;
                    } else {
                        i37 = i;
                    }
                    if (i19 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i2;
                    }
                    if (i22 != 0) {
                        nceVarC = nce.INSTANCE.c();
                    } else {
                        nceVarC = nceVar;
                    }
                    if (i25 != 0) {
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1() { // from class: com.google.android.th0
                                public final Object invoke(Object obj) {
                                    return a.j((TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR);
                        }
                        function4 = (Function1) objR;
                    } else {
                        function4 = function2;
                    }
                    if (i28 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    mVar3 = mVarA;
                    if (i31 != 0) {
                        solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                    } else {
                        solidColor = qu0Var;
                    }
                    if (i33 != 0) {
                        ps4VarF = qo1.a.f();
                    } else {
                        ps4VarF = ps4Var;
                    }
                    z11 = z10;
                    i = i37;
                    i2 = i38;
                    z12 = z5;
                    textStyle3 = textStyleA;
                    bVar4 = bVar2;
                    nceVar3 = nceVarC;
                    qu0Var3 = solidColor;
                    i39 = i6;
                    keyboardOptions3 = keyboardOptionsA;
                    function5 = function4;
                    r48Var4 = r48Var3;
                } else {
                    if (i42 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i9 != 0) {
                        z5 = false;
                    }
                    if (i11 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i13 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i15 != 0) {
                        mVarA = m.INSTANCE.a();
                    } else {
                        mVarA = mVar2;
                    }
                    if (i17 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 512) != 0) {
                        if (z10) {
                            i37 = 1;
                        } else {
                            i37 = Integer.MAX_VALUE;
                        }
                        i6 &= -1879048193;
                    } else {
                        i37 = i;
                    }
                    if (i19 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i2;
                    }
                    if (i22 != 0) {
                        nceVarC = nce.INSTANCE.c();
                    } else {
                        nceVarC = nceVar;
                    }
                    if (i25 != 0) {
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1() { // from class: com.google.android.th0
                                public final Object invoke(Object obj) {
                                    return a.j((TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR);
                        }
                        function4 = (Function1) objR;
                    } else {
                        function4 = function2;
                    }
                    if (i28 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    mVar3 = mVarA;
                    if (i31 != 0) {
                        solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                    } else {
                        solidColor = qu0Var;
                    }
                    if (i33 != 0) {
                        ps4VarF = qo1.a.f();
                    } else {
                        ps4VarF = ps4Var;
                    }
                    z11 = z10;
                    i = i37;
                    i2 = i38;
                    z12 = z5;
                    textStyle3 = textStyleA;
                    bVar4 = bVar2;
                    nceVar3 = nceVarC;
                    qu0Var3 = solidColor;
                    i39 = i6;
                    keyboardOptions3 = keyboardOptionsA;
                    function5 = function4;
                    r48Var4 = r48Var3;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(2026950908, i39, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:776)");
                }
                objR2 = dVarF.R();
                companion = d.INSTANCE;
                if (objR2 == companion.a()) {
                    o58 o58VarE14 = s0.e(new TextFieldValue(str, 0L, (x) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    dVarF.L(o58VarE14);
                    objR2 = o58VarE14;
                }
                o58Var = (o58) objR2;
                textFieldValueI = TextFieldValue.i(k(o58Var), str, 0L, null, 6, null);
                zX = dVarF.x(textFieldValueI);
                Function1<? super TextLayoutResult, Unit> function19 = function5;
                objR3 = dVarF.R();
                b bVar18 = bVar4;
                if (zX) {
                    objR3 = new Function0() { // from class: com.google.android.uh0
                        public final Object invoke() {
                            return a.m(textFieldValueI, o58Var);
                        }
                    };
                    dVarF.L(objR3);
                } else {
                    objR3 = new Function0() { // from class: com.google.android.uh0
                        public final Object invoke() {
                            return a.m(textFieldValueI, o58Var);
                        }
                    };
                    dVarF.L(objR3);
                }
                vn3.i((Function0) objR3, dVarF, 0);
                if ((i39 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objR4 = dVarF.R();
                if (z13) {
                    objR4 = s0.e(str, null, 2, null);
                    dVarF.L(objR4);
                } else {
                    objR4 = s0.e(str, null, 2, null);
                    dVarF.L(objR4);
                }
                o58Var2 = (o58) objR4;
                ImeOptions imeOptionsI14 = keyboardOptions3.i(z11);
                boolean z11110 = !z11;
                if (z11) {
                    i40 = 1;
                } else {
                    i40 = i2;
                }
                if (z11) {
                    i41 = 1;
                } else {
                    i41 = i;
                }
                KeyboardOptions keyboardOptions17 = keyboardOptions3;
                zX2 = dVarF.x(o58Var2) | ((i39 & 112) == 32);
                objR5 = dVarF.R();
                if (zX2) {
                    objR5 = new Function1() { // from class: com.google.android.vh0
                        public final Object invoke(Object obj) {
                            return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                        }
                    };
                    dVarF.L(objR5);
                } else {
                    objR5 = new Function1() { // from class: com.google.android.vh0
                        public final Object invoke(Object obj) {
                            return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                        }
                    };
                    dVarF.L(objR5);
                }
                int i416 = i34 << 9;
                dVar2 = dVarF;
                boolean z11111 = z4;
                CoreTextFieldKt.w(textFieldValueI, (Function1) objR5, bVar18, textStyle3, nceVar3, function19, r48Var4, qu0Var3, z11110, i41, i40, imeOptionsI14, mVar3, z11111, z12, ps4VarF, null, dVar2, (i39 & 896) | ((i39 >> 6) & 7168) | (57344 & i416) | (458752 & i416) | (3670016 & i416) | (i416 & 29360128), ((i39 >> 15) & 896) | (i39 & 7168) | (57344 & i39) | (i34 & 458752), 65536);
                if (e.k()) {
                    e.n();
                }
                textStyle2 = textStyle3;
                r48Var2 = r48Var4;
                qu0Var2 = qu0Var3;
                z8 = z11111;
                z9 = z12;
                ps4Var2 = ps4VarF;
                keyboardOptions2 = keyboardOptions17;
                z7 = z11;
                bVar3 = bVar18;
                nceVar2 = nceVar3;
                function3 = function19;
                mVar2 = mVar3;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                z7 = z3;
                ps4Var2 = ps4Var;
                z8 = z4;
                keyboardOptions2 = keyboardOptionsA;
                z9 = z5;
                textStyle2 = textStyleA;
                bVar3 = bVar2;
                nceVar2 = nceVar;
                function3 = function2;
                r48Var2 = r48Var;
                qu0Var2 = qu0Var;
            }
            i35 = i;
            i36 = i2;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.wh0
                    public final Object invoke(Object obj, Object obj2) {
                        return a.q(str, function1, bVar3, z8, z9, textStyle2, keyboardOptions2, mVar2, z7, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i6 |= 24576;
        z5 = z2;
        i11 = i5 & 32;
        if (i11 != 0) {
            i6 |= 196608;
            textStyleA = textStyle;
        } else {
            textStyleA = textStyle;
            if ((i3 & 196608) == 0) {
                if (dVarF.x(textStyleA)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i6 |= i12;
            }
        }
        i13 = i5 & 64;
        if (i13 != 0) {
            i6 |= 1572864;
            keyboardOptionsA = keyboardOptions;
        } else {
            keyboardOptionsA = keyboardOptions;
            if ((i3 & 1572864) == 0) {
                if (dVarF.x(keyboardOptionsA)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i6 |= i14;
            }
        }
        i15 = i5 & 128;
        if (i15 != 0) {
            i6 |= 12582912;
            mVar2 = mVar;
        } else {
            mVar2 = mVar;
            if ((i3 & 12582912) == 0) {
                if (dVarF.x(mVar2)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i6 |= i16;
            }
        }
        i17 = i5 & 256;
        if (i17 != 0) {
            i6 |= 100663296;
        } else if ((i3 & 100663296) == 0) {
            if (dVarF.A(z3)) {
                i18 = 67108864;
            } else {
                i18 = 33554432;
            }
            i6 |= i18;
        }
        if ((i3 & 805306368) != 0) {
            i6 |= ((i5 & 512) == 0 || !dVarF.C(i)) ? 268435456 : 536870912;
        }
        i19 = i5 & 1024;
        if (i19 != 0) {
            i20 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            if (dVarF.C(i2)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i20 = i4 | i21;
        } else {
            i20 = i4;
        }
        i22 = i5 & 2048;
        if (i22 != 0) {
            i20 |= 48;
        } else if ((i4 & 48) != 0) {
            if (dVarF.x(nceVar)) {
                i23 = 32;
            } else {
                i23 = 16;
            }
            i20 |= i23;
        }
        i24 = i20;
        i25 = i5 & 4096;
        if (i25 != 0) {
            i26 = i24 | 384;
        } else if ((i4 & 384) == 0) {
            if (dVarF.T(function2)) {
                i27 = 256;
            } else {
                i27 = 128;
            }
            i26 = i24 | i27;
        } else {
            i26 = i24;
        }
        i28 = i5 & 8192;
        if (i28 != 0) {
            i30 = i26 | 3072;
        } else {
            i29 = i26;
            if ((i4 & 3072) == 0) {
                i30 = i29 | (dVarF.x(r48Var) ? 2048 : 1024);
            } else {
                i30 = i29;
            }
        }
        i31 = i5 & 16384;
        if (i31 != 0) {
            i32 = i30;
            if ((i4 & 24576) == 0) {
                i32 |= dVarF.x(qu0Var) ? 16384 : 8192;
            }
            i33 = i5 & 32768;
            if (i33 != 0) {
                i32 |= 196608;
            } else if ((i4 & 196608) == 0) {
                i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
            }
            i34 = i32;
            if ((i6 & 306783379) == 306783378) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (dVarF.g(z6, i6 & 1)) {
                dVarF.U();
                if ((i3 & 1) != 0) {
                    if (i42 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i9 != 0) {
                        z5 = false;
                    }
                    if (i11 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i13 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i15 != 0) {
                        mVarA = m.INSTANCE.a();
                    } else {
                        mVarA = mVar2;
                    }
                    if (i17 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 512) != 0) {
                        if (z10) {
                            i37 = 1;
                        } else {
                            i37 = Integer.MAX_VALUE;
                        }
                        i6 &= -1879048193;
                    } else {
                        i37 = i;
                    }
                    if (i19 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i2;
                    }
                    if (i22 != 0) {
                        nceVarC = nce.INSTANCE.c();
                    } else {
                        nceVarC = nceVar;
                    }
                    if (i25 != 0) {
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1() { // from class: com.google.android.th0
                                public final Object invoke(Object obj) {
                                    return a.j((TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR);
                        }
                        function4 = (Function1) objR;
                    } else {
                        function4 = function2;
                    }
                    if (i28 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    mVar3 = mVarA;
                    if (i31 != 0) {
                        solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                    } else {
                        solidColor = qu0Var;
                    }
                    if (i33 != 0) {
                        ps4VarF = qo1.a.f();
                    } else {
                        ps4VarF = ps4Var;
                    }
                    z11 = z10;
                    i = i37;
                    i2 = i38;
                    z12 = z5;
                    textStyle3 = textStyleA;
                    bVar4 = bVar2;
                    nceVar3 = nceVarC;
                    qu0Var3 = solidColor;
                    i39 = i6;
                    keyboardOptions3 = keyboardOptionsA;
                    function5 = function4;
                    r48Var4 = r48Var3;
                } else {
                    if (i42 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i9 != 0) {
                        z5 = false;
                    }
                    if (i11 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i13 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i15 != 0) {
                        mVarA = m.INSTANCE.a();
                    } else {
                        mVarA = mVar2;
                    }
                    if (i17 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 512) != 0) {
                        if (z10) {
                            i37 = 1;
                        } else {
                            i37 = Integer.MAX_VALUE;
                        }
                        i6 &= -1879048193;
                    } else {
                        i37 = i;
                    }
                    if (i19 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i2;
                    }
                    if (i22 != 0) {
                        nceVarC = nce.INSTANCE.c();
                    } else {
                        nceVarC = nceVar;
                    }
                    if (i25 != 0) {
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1() { // from class: com.google.android.th0
                                public final Object invoke(Object obj) {
                                    return a.j((TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR);
                        }
                        function4 = (Function1) objR;
                    } else {
                        function4 = function2;
                    }
                    if (i28 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    mVar3 = mVarA;
                    if (i31 != 0) {
                        solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                    } else {
                        solidColor = qu0Var;
                    }
                    if (i33 != 0) {
                        ps4VarF = qo1.a.f();
                    } else {
                        ps4VarF = ps4Var;
                    }
                    z11 = z10;
                    i = i37;
                    i2 = i38;
                    z12 = z5;
                    textStyle3 = textStyleA;
                    bVar4 = bVar2;
                    nceVar3 = nceVarC;
                    qu0Var3 = solidColor;
                    i39 = i6;
                    keyboardOptions3 = keyboardOptionsA;
                    function5 = function4;
                    r48Var4 = r48Var3;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(2026950908, i39, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:776)");
                }
                objR2 = dVarF.R();
                companion = d.INSTANCE;
                if (objR2 == companion.a()) {
                    o58 o58VarE15 = s0.e(new TextFieldValue(str, 0L, (x) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    dVarF.L(o58VarE15);
                    objR2 = o58VarE15;
                }
                o58Var = (o58) objR2;
                textFieldValueI = TextFieldValue.i(k(o58Var), str, 0L, null, 6, null);
                zX = dVarF.x(textFieldValueI);
                Function1<? super TextLayoutResult, Unit> function110 = function5;
                objR3 = dVarF.R();
                b bVar19 = bVar4;
                if (zX) {
                    objR3 = new Function0() { // from class: com.google.android.uh0
                        public final Object invoke() {
                            return a.m(textFieldValueI, o58Var);
                        }
                    };
                    dVarF.L(objR3);
                } else {
                    objR3 = new Function0() { // from class: com.google.android.uh0
                        public final Object invoke() {
                            return a.m(textFieldValueI, o58Var);
                        }
                    };
                    dVarF.L(objR3);
                }
                vn3.i((Function0) objR3, dVarF, 0);
                if ((i39 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objR4 = dVarF.R();
                if (z13) {
                    objR4 = s0.e(str, null, 2, null);
                    dVarF.L(objR4);
                } else {
                    objR4 = s0.e(str, null, 2, null);
                    dVarF.L(objR4);
                }
                o58Var2 = (o58) objR4;
                ImeOptions imeOptionsI15 = keyboardOptions3.i(z11);
                boolean z11112 = !z11;
                if (z11) {
                    i40 = 1;
                } else {
                    i40 = i2;
                }
                if (z11) {
                    i41 = 1;
                } else {
                    i41 = i;
                }
                KeyboardOptions keyboardOptions18 = keyboardOptions3;
                zX2 = dVarF.x(o58Var2) | ((i39 & 112) == 32);
                objR5 = dVarF.R();
                if (zX2) {
                    objR5 = new Function1() { // from class: com.google.android.vh0
                        public final Object invoke(Object obj) {
                            return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                        }
                    };
                    dVarF.L(objR5);
                } else {
                    objR5 = new Function1() { // from class: com.google.android.vh0
                        public final Object invoke(Object obj) {
                            return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                        }
                    };
                    dVarF.L(objR5);
                }
                int i417 = i34 << 9;
                dVar2 = dVarF;
                boolean z11113 = z4;
                CoreTextFieldKt.w(textFieldValueI, (Function1) objR5, bVar19, textStyle3, nceVar3, function110, r48Var4, qu0Var3, z11112, i41, i40, imeOptionsI15, mVar3, z11113, z12, ps4VarF, null, dVar2, (i39 & 896) | ((i39 >> 6) & 7168) | (57344 & i417) | (458752 & i417) | (3670016 & i417) | (i417 & 29360128), ((i39 >> 15) & 896) | (i39 & 7168) | (57344 & i39) | (i34 & 458752), 65536);
                if (e.k()) {
                    e.n();
                }
                textStyle2 = textStyle3;
                r48Var2 = r48Var4;
                qu0Var2 = qu0Var3;
                z8 = z11113;
                z9 = z12;
                ps4Var2 = ps4VarF;
                keyboardOptions2 = keyboardOptions18;
                z7 = z11;
                bVar3 = bVar19;
                nceVar2 = nceVar3;
                function3 = function110;
                mVar2 = mVar3;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                z7 = z3;
                ps4Var2 = ps4Var;
                z8 = z4;
                keyboardOptions2 = keyboardOptionsA;
                z9 = z5;
                textStyle2 = textStyleA;
                bVar3 = bVar2;
                nceVar2 = nceVar;
                function3 = function2;
                r48Var2 = r48Var;
                qu0Var2 = qu0Var;
            }
            i35 = i;
            i36 = i2;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.wh0
                    public final Object invoke(Object obj, Object obj2) {
                        return a.q(str, function1, bVar3, z8, z9, textStyle2, keyboardOptions2, mVar2, z7, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i32 = i30 | 24576;
        i33 = i5 & 32768;
        if (i33 != 0) {
            i32 |= 196608;
        } else if ((i4 & 196608) == 0) {
            i32 |= dVarF.T(ps4Var) ? 131072 : 65536;
        }
        i34 = i32;
        if ((i6 & 306783379) == 306783378) {
            z6 = true;
        } else {
            z6 = true;
        }
        if (dVarF.g(z6, i6 & 1)) {
            dVarF.U();
            if ((i3 & 1) != 0) {
                if (i42 != 0) {
                    bVar2 = b.INSTANCE;
                }
                if (i7 != 0) {
                    z4 = true;
                }
                if (i9 != 0) {
                    z5 = false;
                }
                if (i11 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                }
                if (i13 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                }
                if (i15 != 0) {
                    mVarA = m.INSTANCE.a();
                } else {
                    mVarA = mVar2;
                }
                if (i17 != 0) {
                    z10 = false;
                } else {
                    z10 = z3;
                }
                if ((i5 & 512) != 0) {
                    if (z10) {
                        i37 = 1;
                    } else {
                        i37 = Integer.MAX_VALUE;
                    }
                    i6 &= -1879048193;
                } else {
                    i37 = i;
                }
                if (i19 != 0) {
                    i38 = 1;
                } else {
                    i38 = i2;
                }
                if (i22 != 0) {
                    nceVarC = nce.INSTANCE.c();
                } else {
                    nceVarC = nceVar;
                }
                if (i25 != 0) {
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1() { // from class: com.google.android.th0
                            public final Object invoke(Object obj) {
                                return a.j((TextLayoutResult) obj);
                            }
                        };
                        dVarF.L(objR);
                    }
                    function4 = (Function1) objR;
                } else {
                    function4 = function2;
                }
                if (i28 != 0) {
                    r48Var3 = null;
                } else {
                    r48Var3 = r48Var;
                }
                mVar3 = mVarA;
                if (i31 != 0) {
                    solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                } else {
                    solidColor = qu0Var;
                }
                if (i33 != 0) {
                    ps4VarF = qo1.a.f();
                } else {
                    ps4VarF = ps4Var;
                }
                z11 = z10;
                i = i37;
                i2 = i38;
                z12 = z5;
                textStyle3 = textStyleA;
                bVar4 = bVar2;
                nceVar3 = nceVarC;
                qu0Var3 = solidColor;
                i39 = i6;
                keyboardOptions3 = keyboardOptionsA;
                function5 = function4;
                r48Var4 = r48Var3;
            } else {
                if (i42 != 0) {
                    bVar2 = b.INSTANCE;
                }
                if (i7 != 0) {
                    z4 = true;
                }
                if (i9 != 0) {
                    z5 = false;
                }
                if (i11 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                }
                if (i13 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                }
                if (i15 != 0) {
                    mVarA = m.INSTANCE.a();
                } else {
                    mVarA = mVar2;
                }
                if (i17 != 0) {
                    z10 = false;
                } else {
                    z10 = z3;
                }
                if ((i5 & 512) != 0) {
                    if (z10) {
                        i37 = 1;
                    } else {
                        i37 = Integer.MAX_VALUE;
                    }
                    i6 &= -1879048193;
                } else {
                    i37 = i;
                }
                if (i19 != 0) {
                    i38 = 1;
                } else {
                    i38 = i2;
                }
                if (i22 != 0) {
                    nceVarC = nce.INSTANCE.c();
                } else {
                    nceVarC = nceVar;
                }
                if (i25 != 0) {
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1() { // from class: com.google.android.th0
                            public final Object invoke(Object obj) {
                                return a.j((TextLayoutResult) obj);
                            }
                        };
                        dVarF.L(objR);
                    }
                    function4 = (Function1) objR;
                } else {
                    function4 = function2;
                }
                if (i28 != 0) {
                    r48Var3 = null;
                } else {
                    r48Var3 = r48Var;
                }
                mVar3 = mVarA;
                if (i31 != 0) {
                    solidColor = new SolidColor(ei1.INSTANCE.a(), null);
                } else {
                    solidColor = qu0Var;
                }
                if (i33 != 0) {
                    ps4VarF = qo1.a.f();
                } else {
                    ps4VarF = ps4Var;
                }
                z11 = z10;
                i = i37;
                i2 = i38;
                z12 = z5;
                textStyle3 = textStyleA;
                bVar4 = bVar2;
                nceVar3 = nceVarC;
                qu0Var3 = solidColor;
                i39 = i6;
                keyboardOptions3 = keyboardOptionsA;
                function5 = function4;
                r48Var4 = r48Var3;
            }
            dVarF.M();
            if (e.k()) {
                e.o(2026950908, i39, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:776)");
            }
            objR2 = dVarF.R();
            companion = d.INSTANCE;
            if (objR2 == companion.a()) {
                o58 o58VarE16 = s0.e(new TextFieldValue(str, 0L, (x) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                dVarF.L(o58VarE16);
                objR2 = o58VarE16;
            }
            o58Var = (o58) objR2;
            textFieldValueI = TextFieldValue.i(k(o58Var), str, 0L, null, 6, null);
            zX = dVarF.x(textFieldValueI);
            Function1<? super TextLayoutResult, Unit> function111 = function5;
            objR3 = dVarF.R();
            b bVar110 = bVar4;
            if (zX) {
                objR3 = new Function0() { // from class: com.google.android.uh0
                    public final Object invoke() {
                        return a.m(textFieldValueI, o58Var);
                    }
                };
                dVarF.L(objR3);
            } else {
                objR3 = new Function0() { // from class: com.google.android.uh0
                    public final Object invoke() {
                        return a.m(textFieldValueI, o58Var);
                    }
                };
                dVarF.L(objR3);
            }
            vn3.i((Function0) objR3, dVarF, 0);
            if ((i39 & 14) == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            objR4 = dVarF.R();
            if (z13) {
                objR4 = s0.e(str, null, 2, null);
                dVarF.L(objR4);
            } else {
                objR4 = s0.e(str, null, 2, null);
                dVarF.L(objR4);
            }
            o58Var2 = (o58) objR4;
            ImeOptions imeOptionsI16 = keyboardOptions3.i(z11);
            boolean z11114 = !z11;
            if (z11) {
                i40 = 1;
            } else {
                i40 = i2;
            }
            if (z11) {
                i41 = 1;
            } else {
                i41 = i;
            }
            KeyboardOptions keyboardOptions19 = keyboardOptions3;
            zX2 = dVarF.x(o58Var2) | ((i39 & 112) == 32);
            objR5 = dVarF.R();
            if (zX2) {
                objR5 = new Function1() { // from class: com.google.android.vh0
                    public final Object invoke(Object obj) {
                        return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                    }
                };
                dVarF.L(objR5);
            } else {
                objR5 = new Function1() { // from class: com.google.android.vh0
                    public final Object invoke(Object obj) {
                        return a.p(function1, o58Var, o58Var2, (TextFieldValue) obj);
                    }
                };
                dVarF.L(objR5);
            }
            int i418 = i34 << 9;
            dVar2 = dVarF;
            boolean z11115 = z4;
            CoreTextFieldKt.w(textFieldValueI, (Function1) objR5, bVar110, textStyle3, nceVar3, function111, r48Var4, qu0Var3, z11114, i41, i40, imeOptionsI16, mVar3, z11115, z12, ps4VarF, null, dVar2, (i39 & 896) | ((i39 >> 6) & 7168) | (57344 & i418) | (458752 & i418) | (3670016 & i418) | (i418 & 29360128), ((i39 >> 15) & 896) | (i39 & 7168) | (57344 & i39) | (i34 & 458752), 65536);
            if (e.k()) {
                e.n();
            }
            textStyle2 = textStyle3;
            r48Var2 = r48Var4;
            qu0Var2 = qu0Var3;
            z8 = z11115;
            z9 = z12;
            ps4Var2 = ps4VarF;
            keyboardOptions2 = keyboardOptions19;
            z7 = z11;
            bVar3 = bVar110;
            nceVar2 = nceVar3;
            function3 = function111;
            mVar2 = mVar3;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            z7 = z3;
            ps4Var2 = ps4Var;
            z8 = z4;
            keyboardOptions2 = keyboardOptionsA;
            z9 = z5;
            textStyle2 = textStyleA;
            bVar3 = bVar2;
            nceVar2 = nceVar;
            function3 = function2;
            r48Var2 = r48Var;
            qu0Var2 = qu0Var;
        }
        i35 = i;
        i36 = i2;
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.wh0
                public final Object invoke(Object obj, Object obj2) {
                    return a.q(str, function1, bVar3, z8, z9, textStyle2, keyboardOptions2, mVar2, z7, i35, i36, nceVar2, function3, r48Var2, qu0Var2, ps4Var2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(TextLayoutResult textLayoutResult) {
        return Unit.a;
    }

    private static final TextFieldValue k(o58<TextFieldValue> o58Var) {
        return o58Var.getValue();
    }

    private static final void l(o58<TextFieldValue> o58Var, TextFieldValue textFieldValue) {
        o58Var.setValue(textFieldValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(TextFieldValue textFieldValue, o58 o58Var) {
        if (!x.g(textFieldValue.getSelection(), k(o58Var).getSelection()) || !Intrinsics.e(textFieldValue.getComposition(), k(o58Var).getComposition())) {
            l(o58Var, textFieldValue);
        }
        return Unit.a;
    }

    private static final String n(o58<String> o58Var) {
        return o58Var.getValue();
    }

    private static final void o(o58<String> o58Var, String str) {
        o58Var.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(Function1 function1, o58 o58Var, o58 o58Var2, TextFieldValue textFieldValue) {
        l(o58Var, textFieldValue);
        boolean zE = Intrinsics.e(n(o58Var2), textFieldValue.m());
        o(o58Var2, textFieldValue.m());
        if (!zE) {
            function1.invoke(textFieldValue.m());
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(String str, Function1 function1, b bVar, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, m mVar, boolean z3, int i, int i2, nce nceVar, Function1 function2, r48 r48Var, qu0 qu0Var, ps4 ps4Var, int i3, int i4, int i5, d dVar, int i6) {
        i(str, function1, bVar, z, z2, textStyle, keyboardOptions, mVar, z3, i, i2, nceVar, function2, r48Var, qu0Var, ps4Var, dVar, saa.a(i3 | 1), saa.a(i4), i5);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(TextLayoutResult textLayoutResult) {
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(TextFieldValue textFieldValue, Function1 function1, TextFieldValue textFieldValue2) {
        if (!Intrinsics.e(textFieldValue, textFieldValue2)) {
            function1.invoke(textFieldValue2);
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(TextFieldValue textFieldValue, Function1 function1, b bVar, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, m mVar, boolean z3, int i, int i2, nce nceVar, Function1 function2, r48 r48Var, qu0 qu0Var, ps4 ps4Var, int i3, int i4, int i5, d dVar, int i6) {
        h(textFieldValue, function1, bVar, z, z2, textStyle, keyboardOptions, mVar, z3, i, i2, nceVar, function2, r48Var, qu0Var, ps4Var, dVar, saa.a(i3 | 1), saa.a(i4), i5);
        return Unit.a;
    }
}
