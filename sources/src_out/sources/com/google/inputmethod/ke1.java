package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.b;
import com.google.android.q22;
import com.google.android.r43;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001as\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/b;", "text", "Landroidx/compose/ui/b;", "modifier", "Landroidx/compose/ui/text/y;", "style", "", "softWrap", "Lcom/google/android/uyc;", "overflow", "", "maxLines", "Lkotlin/Function1;", "Lcom/google/android/vxc;", "", "onTextLayout", "onClick", "d", "(Landroidx/compose/ui/text/b;Landroidx/compose/ui/b;Landroidx/compose/ui/text/y;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;II)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ke1 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements PointerInputEventHandler {
        final /* synthetic */ o58<TextLayoutResult> a;
        final /* synthetic */ Function1<Integer, Unit> b;

        /* JADX WARN: Multi-variable type inference failed */
        a(o58<TextLayoutResult> o58Var, Function1<? super Integer, Unit> function1) {
            this.a = o58Var;
            this.b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(o58 o58Var, Function1 function1, rn8 rn8Var) {
            TextLayoutResult textLayoutResult = (TextLayoutResult) o58Var.getValue();
            if (textLayoutResult != null) {
                function1.invoke(Integer.valueOf(textLayoutResult.x(rn8Var.getPackedValue())));
            }
            return Unit.a;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(df9 df9Var, q22<? super Unit> q22Var) {
            final o58<TextLayoutResult> o58Var = this.a;
            final Function1<Integer, Unit> function1 = this.b;
            Object objI = TapGestureDetectorKt.i(df9Var, null, null, null, new Function1() { // from class: com.google.android.je1
                public final Object invoke(Object obj) {
                    return ke1.a.b(o58Var, function1, (rn8) obj);
                }
            }, q22Var, 7, null);
            return objI == kotlin.coroutines.intrinsics.a.g() ? objI : Unit.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0122  */
    /* JADX WARN: Code duplicated, block: B:102:0x0128  */
    /* JADX WARN: Code duplicated, block: B:104:0x0134  */
    /* JADX WARN: Code duplicated, block: B:106:0x013f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0147  */
    /* JADX WARN: Code duplicated, block: B:112:0x015c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0170  */
    /* JADX WARN: Code duplicated, block: B:116:0x0173  */
    /* JADX WARN: Code duplicated, block: B:119:0x017b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0181  */
    /* JADX WARN: Code duplicated, block: B:124:0x019b  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:132:0x01da  */
    /* JADX WARN: Code duplicated, block: B:135:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:138:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x0104  */
    /* JADX WARN: Code duplicated, block: B:94:0x0108  */
    /* JADX WARN: Code duplicated, block: B:95:0x010b  */
    /* JADX WARN: Code duplicated, block: B:97:0x010f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0118  */
    @r43
    public static final void d(final b bVar, androidx.compose.ui.b bVar2, TextStyle textStyle, boolean z, int i, int i2, Function1<? super TextLayoutResult, Unit> function1, final Function1<? super Integer, Unit> function2, d dVar, final int i3, final int i4) {
        int i5;
        androidx.compose.ui.b bVar3;
        int i6;
        TextStyle textStyle2;
        int i7;
        int i8;
        int i9;
        int i10;
        int iA;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z2;
        d dVar2;
        final boolean z3;
        final int i16;
        final TextStyle textStyle3;
        final Function1<? super TextLayoutResult, Unit> function3;
        final androidx.compose.ui.b bVar4;
        final int i17;
        s6b s6bVarH;
        TextStyle textStyleA;
        boolean z4;
        int i18;
        int i19;
        final Function1<? super TextLayoutResult, Unit> function4;
        Object objR;
        d.Companion companion;
        final o58 o58Var;
        boolean z5;
        Object objR2;
        boolean z6;
        Object objR3;
        Object objR4;
        int i20;
        d dVarF = dVar.F(-246609449);
        if ((i3 & 6) == 0) {
            i5 = (dVarF.x(bVar) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i21 = i4 & 2;
        if (i21 == 0) {
            if ((i3 & 48) == 0) {
                bVar3 = bVar2;
                i5 |= dVarF.x(bVar3) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 != 0) {
                if ((i3 & 384) == 0) {
                    textStyle2 = textStyle;
                    if (dVarF.x(textStyle2)) {
                        i7 = 256;
                    } else {
                        i7 = 128;
                    }
                    i5 |= i7;
                }
                i8 = i4 & 8;
                if (i8 != 0) {
                    if ((i3 & 3072) == 0) {
                        if (dVarF.A(z)) {
                            i9 = 2048;
                        } else {
                            i9 = 1024;
                        }
                        i5 |= i9;
                    }
                    i10 = i4 & 16;
                    if (i10 != 0) {
                        if ((i3 & 24576) == 0) {
                            iA = i;
                            if (dVarF.C(iA)) {
                                i11 = 16384;
                            } else {
                                i11 = 8192;
                            }
                            i5 |= i11;
                        }
                        i12 = i4 & 32;
                        if (i12 != 0) {
                            i5 |= 196608;
                        } else if ((i3 & 196608) == 0) {
                            if (dVarF.C(i2)) {
                                i13 = 131072;
                            } else {
                                i13 = 65536;
                            }
                            i5 |= i13;
                        }
                        i14 = i4 & 64;
                        if (i14 != 0) {
                            i5 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            if (dVarF.T(function1)) {
                                i15 = 1048576;
                            } else {
                                i15 = 524288;
                            }
                            i5 |= i15;
                        }
                        if ((i3 & 12582912) == 0) {
                            if (dVarF.T(function2)) {
                                i20 = 8388608;
                            } else {
                                i20 = 4194304;
                            }
                            i5 |= i20;
                        }
                        if ((i5 & 4793491) != 4793490) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (dVarF.g(z2, i5 & 1)) {
                            if (i21 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i6 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i8 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i10 != 0) {
                                iA = uyc.INSTANCE.a();
                            }
                            if (i12 != 0) {
                                i19 = Integer.MAX_VALUE;
                                i18 = i14;
                            } else {
                                i18 = i14;
                                i19 = i2;
                            }
                            if (i18 != 0) {
                                objR4 = dVarF.R();
                                if (objR4 == d.INSTANCE.a()) {
                                    objR4 = new Function1() { // from class: com.google.android.ge1
                                        public final Object invoke(Object obj) {
                                            return ke1.e((TextLayoutResult) obj);
                                        }
                                    };
                                    dVarF.L(objR4);
                                }
                                function4 = (Function1) objR4;
                            } else {
                                function4 = function1;
                            }
                            if (e.k()) {
                                e.o(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                            }
                            objR = dVarF.R();
                            companion = d.INSTANCE;
                            if (objR == companion.a()) {
                                objR = s0.e(null, null, 2, null);
                                dVarF.L(objR);
                            }
                            o58Var = (o58) objR;
                            androidx.compose.ui.b.Companion companion2 = androidx.compose.ui.b.INSTANCE;
                            if ((29360128 & i5) == 8388608) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            objR2 = dVarF.R();
                            if (z5 || objR2 == companion.a()) {
                                objR2 = new a(o58Var, function2);
                                dVarF.L(objR2);
                            }
                            androidx.compose.ui.b bVarThen = bVar3.then(ugc.c(companion2, function2, (PointerInputEventHandler) objR2));
                            z6 = (i5 & 3670016) == 1048576;
                            objR3 = dVarF.R();
                            if (z6 || objR3 == companion.a()) {
                                objR3 = new Function1() { // from class: com.google.android.he1
                                    public final Object invoke(Object obj) {
                                        return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR3);
                            }
                            dVar2 = dVarF;
                            mi0.p(bVar, bVarThen, textStyleA, (Function1) objR3, iA, z4, i19, 0, null, null, null, dVar2, (58254 & i5) | (458752 & (i5 << 6)) | ((i5 << 3) & 3670016), 0, 1920);
                            if (e.k()) {
                                e.n();
                            }
                            function3 = function4;
                            textStyle3 = textStyleA;
                            z3 = z4;
                            i16 = i19;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            z3 = z;
                            i16 = i2;
                            textStyle3 = textStyle2;
                            function3 = function1;
                        }
                        bVar4 = bVar3;
                        i17 = iA;
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.ie1
                                public final Object invoke(Object obj, Object obj2) {
                                    return ke1.g(bVar, bVar4, textStyle3, z3, i17, i16, function3, function2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i5 |= 24576;
                    iA = i;
                    i12 = i4 & 32;
                    if (i12 != 0) {
                        i5 |= 196608;
                    } else if ((i3 & 196608) == 0) {
                        if (dVarF.C(i2)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i5 |= i13;
                    }
                    i14 = i4 & 64;
                    if (i14 != 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        if (dVarF.T(function1)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i5 |= i15;
                    }
                    if ((i3 & 12582912) == 0) {
                        if (dVarF.T(function2)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i5 |= i20;
                    }
                    if ((i5 & 4793491) != 4793490) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (dVarF.g(z2, i5 & 1)) {
                        if (i21 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i6 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i8 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i10 != 0) {
                            iA = uyc.INSTANCE.a();
                        }
                        if (i12 != 0) {
                            i19 = Integer.MAX_VALUE;
                            i18 = i14;
                        } else {
                            i18 = i14;
                            i19 = i2;
                        }
                        if (i18 != 0) {
                            objR4 = dVarF.R();
                            if (objR4 == d.INSTANCE.a()) {
                                objR4 = new Function1() { // from class: com.google.android.ge1
                                    public final Object invoke(Object obj) {
                                        return ke1.e((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR4);
                            }
                            function4 = (Function1) objR4;
                        } else {
                            function4 = function1;
                        }
                        if (e.k()) {
                            e.o(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                        }
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = s0.e(null, null, 2, null);
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        androidx.compose.ui.b.Companion companion3 = androidx.compose.ui.b.INSTANCE;
                        if ((29360128 & i5) == 8388608) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        objR2 = dVarF.R();
                        if (z5) {
                            objR2 = new a(o58Var, function2);
                            dVarF.L(objR2);
                        } else {
                            objR2 = new a(o58Var, function2);
                            dVarF.L(objR2);
                        }
                        androidx.compose.ui.b bVarThen2 = bVar3.then(ugc.c(companion3, function2, (PointerInputEventHandler) objR2));
                        if ((i5 & 3670016) == 1048576) {
                        }
                        objR3 = dVarF.R();
                        if (z6) {
                            objR3 = new Function1() { // from class: com.google.android.he1
                                public final Object invoke(Object obj) {
                                    return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR3);
                        } else {
                            objR3 = new Function1() { // from class: com.google.android.he1
                                public final Object invoke(Object obj) {
                                    return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR3);
                        }
                        dVar2 = dVarF;
                        mi0.p(bVar, bVarThen2, textStyleA, (Function1) objR3, iA, z4, i19, 0, null, null, null, dVar2, (58254 & i5) | (458752 & (i5 << 6)) | ((i5 << 3) & 3670016), 0, 1920);
                        if (e.k()) {
                            e.n();
                        }
                        function3 = function4;
                        textStyle3 = textStyleA;
                        z3 = z4;
                        i16 = i19;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        z3 = z;
                        i16 = i2;
                        textStyle3 = textStyle2;
                        function3 = function1;
                    }
                    bVar4 = bVar3;
                    i17 = iA;
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.ie1
                            public final Object invoke(Object obj, Object obj2) {
                                return ke1.g(bVar, bVar4, textStyle3, z3, i17, i16, function3, function2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i5 |= 3072;
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        iA = i;
                        if (dVarF.C(iA)) {
                            i11 = 16384;
                        } else {
                            i11 = 8192;
                        }
                        i5 |= i11;
                    }
                    i12 = i4 & 32;
                    if (i12 != 0) {
                        i5 |= 196608;
                    } else if ((i3 & 196608) == 0) {
                        if (dVarF.C(i2)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i5 |= i13;
                    }
                    i14 = i4 & 64;
                    if (i14 != 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        if (dVarF.T(function1)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i5 |= i15;
                    }
                    if ((i3 & 12582912) == 0) {
                        if (dVarF.T(function2)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i5 |= i20;
                    }
                    if ((i5 & 4793491) != 4793490) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (dVarF.g(z2, i5 & 1)) {
                        if (i21 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i6 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i8 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i10 != 0) {
                            iA = uyc.INSTANCE.a();
                        }
                        if (i12 != 0) {
                            i19 = Integer.MAX_VALUE;
                            i18 = i14;
                        } else {
                            i18 = i14;
                            i19 = i2;
                        }
                        if (i18 != 0) {
                            objR4 = dVarF.R();
                            if (objR4 == d.INSTANCE.a()) {
                                objR4 = new Function1() { // from class: com.google.android.ge1
                                    public final Object invoke(Object obj) {
                                        return ke1.e((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR4);
                            }
                            function4 = (Function1) objR4;
                        } else {
                            function4 = function1;
                        }
                        if (e.k()) {
                            e.o(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                        }
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = s0.e(null, null, 2, null);
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        androidx.compose.ui.b.Companion companion4 = androidx.compose.ui.b.INSTANCE;
                        if ((29360128 & i5) == 8388608) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        objR2 = dVarF.R();
                        if (z5) {
                            objR2 = new a(o58Var, function2);
                            dVarF.L(objR2);
                        } else {
                            objR2 = new a(o58Var, function2);
                            dVarF.L(objR2);
                        }
                        androidx.compose.ui.b bVarThen3 = bVar3.then(ugc.c(companion4, function2, (PointerInputEventHandler) objR2));
                        if ((i5 & 3670016) == 1048576) {
                        }
                        objR3 = dVarF.R();
                        if (z6) {
                            objR3 = new Function1() { // from class: com.google.android.he1
                                public final Object invoke(Object obj) {
                                    return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR3);
                        } else {
                            objR3 = new Function1() { // from class: com.google.android.he1
                                public final Object invoke(Object obj) {
                                    return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR3);
                        }
                        dVar2 = dVarF;
                        mi0.p(bVar, bVarThen3, textStyleA, (Function1) objR3, iA, z4, i19, 0, null, null, null, dVar2, (58254 & i5) | (458752 & (i5 << 6)) | ((i5 << 3) & 3670016), 0, 1920);
                        if (e.k()) {
                            e.n();
                        }
                        function3 = function4;
                        textStyle3 = textStyleA;
                        z3 = z4;
                        i16 = i19;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        z3 = z;
                        i16 = i2;
                        textStyle3 = textStyle2;
                        function3 = function1;
                    }
                    bVar4 = bVar3;
                    i17 = iA;
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.ie1
                            public final Object invoke(Object obj, Object obj2) {
                                return ke1.g(bVar, bVar4, textStyle3, z3, i17, i16, function3, function2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i5 |= 24576;
                iA = i;
                i12 = i4 & 32;
                if (i12 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    if (dVarF.C(i2)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i5 |= i13;
                }
                i14 = i4 & 64;
                if (i14 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    if (dVarF.T(function1)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i5 |= i15;
                }
                if ((i3 & 12582912) == 0) {
                    if (dVarF.T(function2)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i5 |= i20;
                }
                if ((i5 & 4793491) != 4793490) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (dVarF.g(z2, i5 & 1)) {
                    if (i21 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i6 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i8 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i10 != 0) {
                        iA = uyc.INSTANCE.a();
                    }
                    if (i12 != 0) {
                        i19 = Integer.MAX_VALUE;
                        i18 = i14;
                    } else {
                        i18 = i14;
                        i19 = i2;
                    }
                    if (i18 != 0) {
                        objR4 = dVarF.R();
                        if (objR4 == d.INSTANCE.a()) {
                            objR4 = new Function1() { // from class: com.google.android.ge1
                                public final Object invoke(Object obj) {
                                    return ke1.e((TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR4);
                        }
                        function4 = (Function1) objR4;
                    } else {
                        function4 = function1;
                    }
                    if (e.k()) {
                        e.o(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = s0.e(null, null, 2, null);
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    androidx.compose.ui.b.Companion companion5 = androidx.compose.ui.b.INSTANCE;
                    if ((29360128 & i5) == 8388608) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objR2 = dVarF.R();
                    if (z5) {
                        objR2 = new a(o58Var, function2);
                        dVarF.L(objR2);
                    } else {
                        objR2 = new a(o58Var, function2);
                        dVarF.L(objR2);
                    }
                    androidx.compose.ui.b bVarThen4 = bVar3.then(ugc.c(companion5, function2, (PointerInputEventHandler) objR2));
                    if ((i5 & 3670016) == 1048576) {
                    }
                    objR3 = dVarF.R();
                    if (z6) {
                        objR3 = new Function1() { // from class: com.google.android.he1
                            public final Object invoke(Object obj) {
                                return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function1() { // from class: com.google.android.he1
                            public final Object invoke(Object obj) {
                                return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    dVar2 = dVarF;
                    mi0.p(bVar, bVarThen4, textStyleA, (Function1) objR3, iA, z4, i19, 0, null, null, null, dVar2, (58254 & i5) | (458752 & (i5 << 6)) | ((i5 << 3) & 3670016), 0, 1920);
                    if (e.k()) {
                        e.n();
                    }
                    function3 = function4;
                    textStyle3 = textStyleA;
                    z3 = z4;
                    i16 = i19;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    z3 = z;
                    i16 = i2;
                    textStyle3 = textStyle2;
                    function3 = function1;
                }
                bVar4 = bVar3;
                i17 = iA;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.ie1
                        public final Object invoke(Object obj, Object obj2) {
                            return ke1.g(bVar, bVar4, textStyle3, z3, i17, i16, function3, function2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i5 |= 384;
            textStyle2 = textStyle;
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 3072) == 0) {
                    if (dVarF.A(z)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        iA = i;
                        if (dVarF.C(iA)) {
                            i11 = 16384;
                        } else {
                            i11 = 8192;
                        }
                        i5 |= i11;
                    }
                    i12 = i4 & 32;
                    if (i12 != 0) {
                        i5 |= 196608;
                    } else if ((i3 & 196608) == 0) {
                        if (dVarF.C(i2)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i5 |= i13;
                    }
                    i14 = i4 & 64;
                    if (i14 != 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        if (dVarF.T(function1)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i5 |= i15;
                    }
                    if ((i3 & 12582912) == 0) {
                        if (dVarF.T(function2)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i5 |= i20;
                    }
                    if ((i5 & 4793491) != 4793490) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (dVarF.g(z2, i5 & 1)) {
                        if (i21 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i6 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i8 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i10 != 0) {
                            iA = uyc.INSTANCE.a();
                        }
                        if (i12 != 0) {
                            i19 = Integer.MAX_VALUE;
                            i18 = i14;
                        } else {
                            i18 = i14;
                            i19 = i2;
                        }
                        if (i18 != 0) {
                            objR4 = dVarF.R();
                            if (objR4 == d.INSTANCE.a()) {
                                objR4 = new Function1() { // from class: com.google.android.ge1
                                    public final Object invoke(Object obj) {
                                        return ke1.e((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR4);
                            }
                            function4 = (Function1) objR4;
                        } else {
                            function4 = function1;
                        }
                        if (e.k()) {
                            e.o(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                        }
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = s0.e(null, null, 2, null);
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        androidx.compose.ui.b.Companion companion6 = androidx.compose.ui.b.INSTANCE;
                        if ((29360128 & i5) == 8388608) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        objR2 = dVarF.R();
                        if (z5) {
                            objR2 = new a(o58Var, function2);
                            dVarF.L(objR2);
                        } else {
                            objR2 = new a(o58Var, function2);
                            dVarF.L(objR2);
                        }
                        androidx.compose.ui.b bVarThen5 = bVar3.then(ugc.c(companion6, function2, (PointerInputEventHandler) objR2));
                        if ((i5 & 3670016) == 1048576) {
                        }
                        objR3 = dVarF.R();
                        if (z6) {
                            objR3 = new Function1() { // from class: com.google.android.he1
                                public final Object invoke(Object obj) {
                                    return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR3);
                        } else {
                            objR3 = new Function1() { // from class: com.google.android.he1
                                public final Object invoke(Object obj) {
                                    return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR3);
                        }
                        dVar2 = dVarF;
                        mi0.p(bVar, bVarThen5, textStyleA, (Function1) objR3, iA, z4, i19, 0, null, null, null, dVar2, (58254 & i5) | (458752 & (i5 << 6)) | ((i5 << 3) & 3670016), 0, 1920);
                        if (e.k()) {
                            e.n();
                        }
                        function3 = function4;
                        textStyle3 = textStyleA;
                        z3 = z4;
                        i16 = i19;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        z3 = z;
                        i16 = i2;
                        textStyle3 = textStyle2;
                        function3 = function1;
                    }
                    bVar4 = bVar3;
                    i17 = iA;
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.ie1
                            public final Object invoke(Object obj, Object obj2) {
                                return ke1.g(bVar, bVar4, textStyle3, z3, i17, i16, function3, function2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i5 |= 24576;
                iA = i;
                i12 = i4 & 32;
                if (i12 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    if (dVarF.C(i2)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i5 |= i13;
                }
                i14 = i4 & 64;
                if (i14 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    if (dVarF.T(function1)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i5 |= i15;
                }
                if ((i3 & 12582912) == 0) {
                    if (dVarF.T(function2)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i5 |= i20;
                }
                if ((i5 & 4793491) != 4793490) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (dVarF.g(z2, i5 & 1)) {
                    if (i21 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i6 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i8 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i10 != 0) {
                        iA = uyc.INSTANCE.a();
                    }
                    if (i12 != 0) {
                        i19 = Integer.MAX_VALUE;
                        i18 = i14;
                    } else {
                        i18 = i14;
                        i19 = i2;
                    }
                    if (i18 != 0) {
                        objR4 = dVarF.R();
                        if (objR4 == d.INSTANCE.a()) {
                            objR4 = new Function1() { // from class: com.google.android.ge1
                                public final Object invoke(Object obj) {
                                    return ke1.e((TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR4);
                        }
                        function4 = (Function1) objR4;
                    } else {
                        function4 = function1;
                    }
                    if (e.k()) {
                        e.o(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = s0.e(null, null, 2, null);
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    androidx.compose.ui.b.Companion companion7 = androidx.compose.ui.b.INSTANCE;
                    if ((29360128 & i5) == 8388608) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objR2 = dVarF.R();
                    if (z5) {
                        objR2 = new a(o58Var, function2);
                        dVarF.L(objR2);
                    } else {
                        objR2 = new a(o58Var, function2);
                        dVarF.L(objR2);
                    }
                    androidx.compose.ui.b bVarThen6 = bVar3.then(ugc.c(companion7, function2, (PointerInputEventHandler) objR2));
                    if ((i5 & 3670016) == 1048576) {
                    }
                    objR3 = dVarF.R();
                    if (z6) {
                        objR3 = new Function1() { // from class: com.google.android.he1
                            public final Object invoke(Object obj) {
                                return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function1() { // from class: com.google.android.he1
                            public final Object invoke(Object obj) {
                                return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    dVar2 = dVarF;
                    mi0.p(bVar, bVarThen6, textStyleA, (Function1) objR3, iA, z4, i19, 0, null, null, null, dVar2, (58254 & i5) | (458752 & (i5 << 6)) | ((i5 << 3) & 3670016), 0, 1920);
                    if (e.k()) {
                        e.n();
                    }
                    function3 = function4;
                    textStyle3 = textStyleA;
                    z3 = z4;
                    i16 = i19;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    z3 = z;
                    i16 = i2;
                    textStyle3 = textStyle2;
                    function3 = function1;
                }
                bVar4 = bVar3;
                i17 = iA;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.ie1
                        public final Object invoke(Object obj, Object obj2) {
                            return ke1.g(bVar, bVar4, textStyle3, z3, i17, i16, function3, function2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i5 |= 3072;
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    iA = i;
                    if (dVarF.C(iA)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i5 |= i11;
                }
                i12 = i4 & 32;
                if (i12 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    if (dVarF.C(i2)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i5 |= i13;
                }
                i14 = i4 & 64;
                if (i14 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    if (dVarF.T(function1)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i5 |= i15;
                }
                if ((i3 & 12582912) == 0) {
                    if (dVarF.T(function2)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i5 |= i20;
                }
                if ((i5 & 4793491) != 4793490) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (dVarF.g(z2, i5 & 1)) {
                    if (i21 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i6 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i8 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i10 != 0) {
                        iA = uyc.INSTANCE.a();
                    }
                    if (i12 != 0) {
                        i19 = Integer.MAX_VALUE;
                        i18 = i14;
                    } else {
                        i18 = i14;
                        i19 = i2;
                    }
                    if (i18 != 0) {
                        objR4 = dVarF.R();
                        if (objR4 == d.INSTANCE.a()) {
                            objR4 = new Function1() { // from class: com.google.android.ge1
                                public final Object invoke(Object obj) {
                                    return ke1.e((TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR4);
                        }
                        function4 = (Function1) objR4;
                    } else {
                        function4 = function1;
                    }
                    if (e.k()) {
                        e.o(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = s0.e(null, null, 2, null);
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    androidx.compose.ui.b.Companion companion8 = androidx.compose.ui.b.INSTANCE;
                    if ((29360128 & i5) == 8388608) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objR2 = dVarF.R();
                    if (z5) {
                        objR2 = new a(o58Var, function2);
                        dVarF.L(objR2);
                    } else {
                        objR2 = new a(o58Var, function2);
                        dVarF.L(objR2);
                    }
                    androidx.compose.ui.b bVarThen7 = bVar3.then(ugc.c(companion8, function2, (PointerInputEventHandler) objR2));
                    if ((i5 & 3670016) == 1048576) {
                    }
                    objR3 = dVarF.R();
                    if (z6) {
                        objR3 = new Function1() { // from class: com.google.android.he1
                            public final Object invoke(Object obj) {
                                return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function1() { // from class: com.google.android.he1
                            public final Object invoke(Object obj) {
                                return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    dVar2 = dVarF;
                    mi0.p(bVar, bVarThen7, textStyleA, (Function1) objR3, iA, z4, i19, 0, null, null, null, dVar2, (58254 & i5) | (458752 & (i5 << 6)) | ((i5 << 3) & 3670016), 0, 1920);
                    if (e.k()) {
                        e.n();
                    }
                    function3 = function4;
                    textStyle3 = textStyleA;
                    z3 = z4;
                    i16 = i19;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    z3 = z;
                    i16 = i2;
                    textStyle3 = textStyle2;
                    function3 = function1;
                }
                bVar4 = bVar3;
                i17 = iA;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.ie1
                        public final Object invoke(Object obj, Object obj2) {
                            return ke1.g(bVar, bVar4, textStyle3, z3, i17, i16, function3, function2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i5 |= 24576;
            iA = i;
            i12 = i4 & 32;
            if (i12 != 0) {
                i5 |= 196608;
            } else if ((i3 & 196608) == 0) {
                if (dVarF.C(i2)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i5 |= i13;
            }
            i14 = i4 & 64;
            if (i14 != 0) {
                i5 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                if (dVarF.T(function1)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i5 |= i15;
            }
            if ((i3 & 12582912) == 0) {
                if (dVarF.T(function2)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i5 |= i20;
            }
            if ((i5 & 4793491) != 4793490) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (dVarF.g(z2, i5 & 1)) {
                if (i21 != 0) {
                    bVar3 = androidx.compose.ui.b.INSTANCE;
                }
                if (i6 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle2;
                }
                if (i8 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i10 != 0) {
                    iA = uyc.INSTANCE.a();
                }
                if (i12 != 0) {
                    i19 = Integer.MAX_VALUE;
                    i18 = i14;
                } else {
                    i18 = i14;
                    i19 = i2;
                }
                if (i18 != 0) {
                    objR4 = dVarF.R();
                    if (objR4 == d.INSTANCE.a()) {
                        objR4 = new Function1() { // from class: com.google.android.ge1
                            public final Object invoke(Object obj) {
                                return ke1.e((TextLayoutResult) obj);
                            }
                        };
                        dVarF.L(objR4);
                    }
                    function4 = (Function1) objR4;
                } else {
                    function4 = function1;
                }
                if (e.k()) {
                    e.o(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                }
                objR = dVarF.R();
                companion = d.INSTANCE;
                if (objR == companion.a()) {
                    objR = s0.e(null, null, 2, null);
                    dVarF.L(objR);
                }
                o58Var = (o58) objR;
                androidx.compose.ui.b.Companion companion9 = androidx.compose.ui.b.INSTANCE;
                if ((29360128 & i5) == 8388608) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objR2 = dVarF.R();
                if (z5) {
                    objR2 = new a(o58Var, function2);
                    dVarF.L(objR2);
                } else {
                    objR2 = new a(o58Var, function2);
                    dVarF.L(objR2);
                }
                androidx.compose.ui.b bVarThen8 = bVar3.then(ugc.c(companion9, function2, (PointerInputEventHandler) objR2));
                if ((i5 & 3670016) == 1048576) {
                }
                objR3 = dVarF.R();
                if (z6) {
                    objR3 = new Function1() { // from class: com.google.android.he1
                        public final Object invoke(Object obj) {
                            return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                        }
                    };
                    dVarF.L(objR3);
                } else {
                    objR3 = new Function1() { // from class: com.google.android.he1
                        public final Object invoke(Object obj) {
                            return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                        }
                    };
                    dVarF.L(objR3);
                }
                dVar2 = dVarF;
                mi0.p(bVar, bVarThen8, textStyleA, (Function1) objR3, iA, z4, i19, 0, null, null, null, dVar2, (58254 & i5) | (458752 & (i5 << 6)) | ((i5 << 3) & 3670016), 0, 1920);
                if (e.k()) {
                    e.n();
                }
                function3 = function4;
                textStyle3 = textStyleA;
                z3 = z4;
                i16 = i19;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                z3 = z;
                i16 = i2;
                textStyle3 = textStyle2;
                function3 = function1;
            }
            bVar4 = bVar3;
            i17 = iA;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.ie1
                    public final Object invoke(Object obj, Object obj2) {
                        return ke1.g(bVar, bVar4, textStyle3, z3, i17, i16, function3, function2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i5 |= 48;
        bVar3 = bVar2;
        i6 = i4 & 4;
        if (i6 != 0) {
            if ((i3 & 384) == 0) {
                textStyle2 = textStyle;
                if (dVarF.x(textStyle2)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i5 |= i7;
            }
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 3072) == 0) {
                    if (dVarF.A(z)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        iA = i;
                        if (dVarF.C(iA)) {
                            i11 = 16384;
                        } else {
                            i11 = 8192;
                        }
                        i5 |= i11;
                    }
                    i12 = i4 & 32;
                    if (i12 != 0) {
                        i5 |= 196608;
                    } else if ((i3 & 196608) == 0) {
                        if (dVarF.C(i2)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i5 |= i13;
                    }
                    i14 = i4 & 64;
                    if (i14 != 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        if (dVarF.T(function1)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i5 |= i15;
                    }
                    if ((i3 & 12582912) == 0) {
                        if (dVarF.T(function2)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i5 |= i20;
                    }
                    if ((i5 & 4793491) != 4793490) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (dVarF.g(z2, i5 & 1)) {
                        if (i21 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i6 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i8 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i10 != 0) {
                            iA = uyc.INSTANCE.a();
                        }
                        if (i12 != 0) {
                            i19 = Integer.MAX_VALUE;
                            i18 = i14;
                        } else {
                            i18 = i14;
                            i19 = i2;
                        }
                        if (i18 != 0) {
                            objR4 = dVarF.R();
                            if (objR4 == d.INSTANCE.a()) {
                                objR4 = new Function1() { // from class: com.google.android.ge1
                                    public final Object invoke(Object obj) {
                                        return ke1.e((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR4);
                            }
                            function4 = (Function1) objR4;
                        } else {
                            function4 = function1;
                        }
                        if (e.k()) {
                            e.o(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                        }
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = s0.e(null, null, 2, null);
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        androidx.compose.ui.b.Companion companion10 = androidx.compose.ui.b.INSTANCE;
                        if ((29360128 & i5) == 8388608) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        objR2 = dVarF.R();
                        if (z5) {
                            objR2 = new a(o58Var, function2);
                            dVarF.L(objR2);
                        } else {
                            objR2 = new a(o58Var, function2);
                            dVarF.L(objR2);
                        }
                        androidx.compose.ui.b bVarThen9 = bVar3.then(ugc.c(companion10, function2, (PointerInputEventHandler) objR2));
                        if ((i5 & 3670016) == 1048576) {
                        }
                        objR3 = dVarF.R();
                        if (z6) {
                            objR3 = new Function1() { // from class: com.google.android.he1
                                public final Object invoke(Object obj) {
                                    return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR3);
                        } else {
                            objR3 = new Function1() { // from class: com.google.android.he1
                                public final Object invoke(Object obj) {
                                    return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR3);
                        }
                        dVar2 = dVarF;
                        mi0.p(bVar, bVarThen9, textStyleA, (Function1) objR3, iA, z4, i19, 0, null, null, null, dVar2, (58254 & i5) | (458752 & (i5 << 6)) | ((i5 << 3) & 3670016), 0, 1920);
                        if (e.k()) {
                            e.n();
                        }
                        function3 = function4;
                        textStyle3 = textStyleA;
                        z3 = z4;
                        i16 = i19;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        z3 = z;
                        i16 = i2;
                        textStyle3 = textStyle2;
                        function3 = function1;
                    }
                    bVar4 = bVar3;
                    i17 = iA;
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.ie1
                            public final Object invoke(Object obj, Object obj2) {
                                return ke1.g(bVar, bVar4, textStyle3, z3, i17, i16, function3, function2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i5 |= 24576;
                iA = i;
                i12 = i4 & 32;
                if (i12 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    if (dVarF.C(i2)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i5 |= i13;
                }
                i14 = i4 & 64;
                if (i14 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    if (dVarF.T(function1)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i5 |= i15;
                }
                if ((i3 & 12582912) == 0) {
                    if (dVarF.T(function2)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i5 |= i20;
                }
                if ((i5 & 4793491) != 4793490) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (dVarF.g(z2, i5 & 1)) {
                    if (i21 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i6 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i8 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i10 != 0) {
                        iA = uyc.INSTANCE.a();
                    }
                    if (i12 != 0) {
                        i19 = Integer.MAX_VALUE;
                        i18 = i14;
                    } else {
                        i18 = i14;
                        i19 = i2;
                    }
                    if (i18 != 0) {
                        objR4 = dVarF.R();
                        if (objR4 == d.INSTANCE.a()) {
                            objR4 = new Function1() { // from class: com.google.android.ge1
                                public final Object invoke(Object obj) {
                                    return ke1.e((TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR4);
                        }
                        function4 = (Function1) objR4;
                    } else {
                        function4 = function1;
                    }
                    if (e.k()) {
                        e.o(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = s0.e(null, null, 2, null);
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    androidx.compose.ui.b.Companion companion11 = androidx.compose.ui.b.INSTANCE;
                    if ((29360128 & i5) == 8388608) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objR2 = dVarF.R();
                    if (z5) {
                        objR2 = new a(o58Var, function2);
                        dVarF.L(objR2);
                    } else {
                        objR2 = new a(o58Var, function2);
                        dVarF.L(objR2);
                    }
                    androidx.compose.ui.b bVarThen10 = bVar3.then(ugc.c(companion11, function2, (PointerInputEventHandler) objR2));
                    if ((i5 & 3670016) == 1048576) {
                    }
                    objR3 = dVarF.R();
                    if (z6) {
                        objR3 = new Function1() { // from class: com.google.android.he1
                            public final Object invoke(Object obj) {
                                return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function1() { // from class: com.google.android.he1
                            public final Object invoke(Object obj) {
                                return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    dVar2 = dVarF;
                    mi0.p(bVar, bVarThen10, textStyleA, (Function1) objR3, iA, z4, i19, 0, null, null, null, dVar2, (58254 & i5) | (458752 & (i5 << 6)) | ((i5 << 3) & 3670016), 0, 1920);
                    if (e.k()) {
                        e.n();
                    }
                    function3 = function4;
                    textStyle3 = textStyleA;
                    z3 = z4;
                    i16 = i19;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    z3 = z;
                    i16 = i2;
                    textStyle3 = textStyle2;
                    function3 = function1;
                }
                bVar4 = bVar3;
                i17 = iA;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.ie1
                        public final Object invoke(Object obj, Object obj2) {
                            return ke1.g(bVar, bVar4, textStyle3, z3, i17, i16, function3, function2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i5 |= 3072;
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    iA = i;
                    if (dVarF.C(iA)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i5 |= i11;
                }
                i12 = i4 & 32;
                if (i12 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    if (dVarF.C(i2)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i5 |= i13;
                }
                i14 = i4 & 64;
                if (i14 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    if (dVarF.T(function1)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i5 |= i15;
                }
                if ((i3 & 12582912) == 0) {
                    if (dVarF.T(function2)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i5 |= i20;
                }
                if ((i5 & 4793491) != 4793490) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (dVarF.g(z2, i5 & 1)) {
                    if (i21 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i6 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i8 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i10 != 0) {
                        iA = uyc.INSTANCE.a();
                    }
                    if (i12 != 0) {
                        i19 = Integer.MAX_VALUE;
                        i18 = i14;
                    } else {
                        i18 = i14;
                        i19 = i2;
                    }
                    if (i18 != 0) {
                        objR4 = dVarF.R();
                        if (objR4 == d.INSTANCE.a()) {
                            objR4 = new Function1() { // from class: com.google.android.ge1
                                public final Object invoke(Object obj) {
                                    return ke1.e((TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR4);
                        }
                        function4 = (Function1) objR4;
                    } else {
                        function4 = function1;
                    }
                    if (e.k()) {
                        e.o(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = s0.e(null, null, 2, null);
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    androidx.compose.ui.b.Companion companion12 = androidx.compose.ui.b.INSTANCE;
                    if ((29360128 & i5) == 8388608) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objR2 = dVarF.R();
                    if (z5) {
                        objR2 = new a(o58Var, function2);
                        dVarF.L(objR2);
                    } else {
                        objR2 = new a(o58Var, function2);
                        dVarF.L(objR2);
                    }
                    androidx.compose.ui.b bVarThen11 = bVar3.then(ugc.c(companion12, function2, (PointerInputEventHandler) objR2));
                    if ((i5 & 3670016) == 1048576) {
                    }
                    objR3 = dVarF.R();
                    if (z6) {
                        objR3 = new Function1() { // from class: com.google.android.he1
                            public final Object invoke(Object obj) {
                                return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function1() { // from class: com.google.android.he1
                            public final Object invoke(Object obj) {
                                return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    dVar2 = dVarF;
                    mi0.p(bVar, bVarThen11, textStyleA, (Function1) objR3, iA, z4, i19, 0, null, null, null, dVar2, (58254 & i5) | (458752 & (i5 << 6)) | ((i5 << 3) & 3670016), 0, 1920);
                    if (e.k()) {
                        e.n();
                    }
                    function3 = function4;
                    textStyle3 = textStyleA;
                    z3 = z4;
                    i16 = i19;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    z3 = z;
                    i16 = i2;
                    textStyle3 = textStyle2;
                    function3 = function1;
                }
                bVar4 = bVar3;
                i17 = iA;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.ie1
                        public final Object invoke(Object obj, Object obj2) {
                            return ke1.g(bVar, bVar4, textStyle3, z3, i17, i16, function3, function2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i5 |= 24576;
            iA = i;
            i12 = i4 & 32;
            if (i12 != 0) {
                i5 |= 196608;
            } else if ((i3 & 196608) == 0) {
                if (dVarF.C(i2)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i5 |= i13;
            }
            i14 = i4 & 64;
            if (i14 != 0) {
                i5 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                if (dVarF.T(function1)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i5 |= i15;
            }
            if ((i3 & 12582912) == 0) {
                if (dVarF.T(function2)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i5 |= i20;
            }
            if ((i5 & 4793491) != 4793490) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (dVarF.g(z2, i5 & 1)) {
                if (i21 != 0) {
                    bVar3 = androidx.compose.ui.b.INSTANCE;
                }
                if (i6 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle2;
                }
                if (i8 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i10 != 0) {
                    iA = uyc.INSTANCE.a();
                }
                if (i12 != 0) {
                    i19 = Integer.MAX_VALUE;
                    i18 = i14;
                } else {
                    i18 = i14;
                    i19 = i2;
                }
                if (i18 != 0) {
                    objR4 = dVarF.R();
                    if (objR4 == d.INSTANCE.a()) {
                        objR4 = new Function1() { // from class: com.google.android.ge1
                            public final Object invoke(Object obj) {
                                return ke1.e((TextLayoutResult) obj);
                            }
                        };
                        dVarF.L(objR4);
                    }
                    function4 = (Function1) objR4;
                } else {
                    function4 = function1;
                }
                if (e.k()) {
                    e.o(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                }
                objR = dVarF.R();
                companion = d.INSTANCE;
                if (objR == companion.a()) {
                    objR = s0.e(null, null, 2, null);
                    dVarF.L(objR);
                }
                o58Var = (o58) objR;
                androidx.compose.ui.b.Companion companion13 = androidx.compose.ui.b.INSTANCE;
                if ((29360128 & i5) == 8388608) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objR2 = dVarF.R();
                if (z5) {
                    objR2 = new a(o58Var, function2);
                    dVarF.L(objR2);
                } else {
                    objR2 = new a(o58Var, function2);
                    dVarF.L(objR2);
                }
                androidx.compose.ui.b bVarThen12 = bVar3.then(ugc.c(companion13, function2, (PointerInputEventHandler) objR2));
                if ((i5 & 3670016) == 1048576) {
                }
                objR3 = dVarF.R();
                if (z6) {
                    objR3 = new Function1() { // from class: com.google.android.he1
                        public final Object invoke(Object obj) {
                            return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                        }
                    };
                    dVarF.L(objR3);
                } else {
                    objR3 = new Function1() { // from class: com.google.android.he1
                        public final Object invoke(Object obj) {
                            return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                        }
                    };
                    dVarF.L(objR3);
                }
                dVar2 = dVarF;
                mi0.p(bVar, bVarThen12, textStyleA, (Function1) objR3, iA, z4, i19, 0, null, null, null, dVar2, (58254 & i5) | (458752 & (i5 << 6)) | ((i5 << 3) & 3670016), 0, 1920);
                if (e.k()) {
                    e.n();
                }
                function3 = function4;
                textStyle3 = textStyleA;
                z3 = z4;
                i16 = i19;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                z3 = z;
                i16 = i2;
                textStyle3 = textStyle2;
                function3 = function1;
            }
            bVar4 = bVar3;
            i17 = iA;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.ie1
                    public final Object invoke(Object obj, Object obj2) {
                        return ke1.g(bVar, bVar4, textStyle3, z3, i17, i16, function3, function2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i5 |= 384;
        textStyle2 = textStyle;
        i8 = i4 & 8;
        if (i8 != 0) {
            if ((i3 & 3072) == 0) {
                if (dVarF.A(z)) {
                    i9 = 2048;
                } else {
                    i9 = 1024;
                }
                i5 |= i9;
            }
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    iA = i;
                    if (dVarF.C(iA)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i5 |= i11;
                }
                i12 = i4 & 32;
                if (i12 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    if (dVarF.C(i2)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i5 |= i13;
                }
                i14 = i4 & 64;
                if (i14 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    if (dVarF.T(function1)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i5 |= i15;
                }
                if ((i3 & 12582912) == 0) {
                    if (dVarF.T(function2)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i5 |= i20;
                }
                if ((i5 & 4793491) != 4793490) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (dVarF.g(z2, i5 & 1)) {
                    if (i21 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i6 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i8 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i10 != 0) {
                        iA = uyc.INSTANCE.a();
                    }
                    if (i12 != 0) {
                        i19 = Integer.MAX_VALUE;
                        i18 = i14;
                    } else {
                        i18 = i14;
                        i19 = i2;
                    }
                    if (i18 != 0) {
                        objR4 = dVarF.R();
                        if (objR4 == d.INSTANCE.a()) {
                            objR4 = new Function1() { // from class: com.google.android.ge1
                                public final Object invoke(Object obj) {
                                    return ke1.e((TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR4);
                        }
                        function4 = (Function1) objR4;
                    } else {
                        function4 = function1;
                    }
                    if (e.k()) {
                        e.o(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = s0.e(null, null, 2, null);
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    androidx.compose.ui.b.Companion companion14 = androidx.compose.ui.b.INSTANCE;
                    if ((29360128 & i5) == 8388608) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objR2 = dVarF.R();
                    if (z5) {
                        objR2 = new a(o58Var, function2);
                        dVarF.L(objR2);
                    } else {
                        objR2 = new a(o58Var, function2);
                        dVarF.L(objR2);
                    }
                    androidx.compose.ui.b bVarThen13 = bVar3.then(ugc.c(companion14, function2, (PointerInputEventHandler) objR2));
                    if ((i5 & 3670016) == 1048576) {
                    }
                    objR3 = dVarF.R();
                    if (z6) {
                        objR3 = new Function1() { // from class: com.google.android.he1
                            public final Object invoke(Object obj) {
                                return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function1() { // from class: com.google.android.he1
                            public final Object invoke(Object obj) {
                                return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    dVar2 = dVarF;
                    mi0.p(bVar, bVarThen13, textStyleA, (Function1) objR3, iA, z4, i19, 0, null, null, null, dVar2, (58254 & i5) | (458752 & (i5 << 6)) | ((i5 << 3) & 3670016), 0, 1920);
                    if (e.k()) {
                        e.n();
                    }
                    function3 = function4;
                    textStyle3 = textStyleA;
                    z3 = z4;
                    i16 = i19;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    z3 = z;
                    i16 = i2;
                    textStyle3 = textStyle2;
                    function3 = function1;
                }
                bVar4 = bVar3;
                i17 = iA;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.ie1
                        public final Object invoke(Object obj, Object obj2) {
                            return ke1.g(bVar, bVar4, textStyle3, z3, i17, i16, function3, function2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i5 |= 24576;
            iA = i;
            i12 = i4 & 32;
            if (i12 != 0) {
                i5 |= 196608;
            } else if ((i3 & 196608) == 0) {
                if (dVarF.C(i2)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i5 |= i13;
            }
            i14 = i4 & 64;
            if (i14 != 0) {
                i5 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                if (dVarF.T(function1)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i5 |= i15;
            }
            if ((i3 & 12582912) == 0) {
                if (dVarF.T(function2)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i5 |= i20;
            }
            if ((i5 & 4793491) != 4793490) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (dVarF.g(z2, i5 & 1)) {
                if (i21 != 0) {
                    bVar3 = androidx.compose.ui.b.INSTANCE;
                }
                if (i6 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle2;
                }
                if (i8 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i10 != 0) {
                    iA = uyc.INSTANCE.a();
                }
                if (i12 != 0) {
                    i19 = Integer.MAX_VALUE;
                    i18 = i14;
                } else {
                    i18 = i14;
                    i19 = i2;
                }
                if (i18 != 0) {
                    objR4 = dVarF.R();
                    if (objR4 == d.INSTANCE.a()) {
                        objR4 = new Function1() { // from class: com.google.android.ge1
                            public final Object invoke(Object obj) {
                                return ke1.e((TextLayoutResult) obj);
                            }
                        };
                        dVarF.L(objR4);
                    }
                    function4 = (Function1) objR4;
                } else {
                    function4 = function1;
                }
                if (e.k()) {
                    e.o(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                }
                objR = dVarF.R();
                companion = d.INSTANCE;
                if (objR == companion.a()) {
                    objR = s0.e(null, null, 2, null);
                    dVarF.L(objR);
                }
                o58Var = (o58) objR;
                androidx.compose.ui.b.Companion companion15 = androidx.compose.ui.b.INSTANCE;
                if ((29360128 & i5) == 8388608) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objR2 = dVarF.R();
                if (z5) {
                    objR2 = new a(o58Var, function2);
                    dVarF.L(objR2);
                } else {
                    objR2 = new a(o58Var, function2);
                    dVarF.L(objR2);
                }
                androidx.compose.ui.b bVarThen14 = bVar3.then(ugc.c(companion15, function2, (PointerInputEventHandler) objR2));
                if ((i5 & 3670016) == 1048576) {
                }
                objR3 = dVarF.R();
                if (z6) {
                    objR3 = new Function1() { // from class: com.google.android.he1
                        public final Object invoke(Object obj) {
                            return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                        }
                    };
                    dVarF.L(objR3);
                } else {
                    objR3 = new Function1() { // from class: com.google.android.he1
                        public final Object invoke(Object obj) {
                            return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                        }
                    };
                    dVarF.L(objR3);
                }
                dVar2 = dVarF;
                mi0.p(bVar, bVarThen14, textStyleA, (Function1) objR3, iA, z4, i19, 0, null, null, null, dVar2, (58254 & i5) | (458752 & (i5 << 6)) | ((i5 << 3) & 3670016), 0, 1920);
                if (e.k()) {
                    e.n();
                }
                function3 = function4;
                textStyle3 = textStyleA;
                z3 = z4;
                i16 = i19;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                z3 = z;
                i16 = i2;
                textStyle3 = textStyle2;
                function3 = function1;
            }
            bVar4 = bVar3;
            i17 = iA;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.ie1
                    public final Object invoke(Object obj, Object obj2) {
                        return ke1.g(bVar, bVar4, textStyle3, z3, i17, i16, function3, function2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i5 |= 3072;
        i10 = i4 & 16;
        if (i10 != 0) {
            if ((i3 & 24576) == 0) {
                iA = i;
                if (dVarF.C(iA)) {
                    i11 = 16384;
                } else {
                    i11 = 8192;
                }
                i5 |= i11;
            }
            i12 = i4 & 32;
            if (i12 != 0) {
                i5 |= 196608;
            } else if ((i3 & 196608) == 0) {
                if (dVarF.C(i2)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i5 |= i13;
            }
            i14 = i4 & 64;
            if (i14 != 0) {
                i5 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                if (dVarF.T(function1)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i5 |= i15;
            }
            if ((i3 & 12582912) == 0) {
                if (dVarF.T(function2)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i5 |= i20;
            }
            if ((i5 & 4793491) != 4793490) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (dVarF.g(z2, i5 & 1)) {
                if (i21 != 0) {
                    bVar3 = androidx.compose.ui.b.INSTANCE;
                }
                if (i6 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle2;
                }
                if (i8 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i10 != 0) {
                    iA = uyc.INSTANCE.a();
                }
                if (i12 != 0) {
                    i19 = Integer.MAX_VALUE;
                    i18 = i14;
                } else {
                    i18 = i14;
                    i19 = i2;
                }
                if (i18 != 0) {
                    objR4 = dVarF.R();
                    if (objR4 == d.INSTANCE.a()) {
                        objR4 = new Function1() { // from class: com.google.android.ge1
                            public final Object invoke(Object obj) {
                                return ke1.e((TextLayoutResult) obj);
                            }
                        };
                        dVarF.L(objR4);
                    }
                    function4 = (Function1) objR4;
                } else {
                    function4 = function1;
                }
                if (e.k()) {
                    e.o(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                }
                objR = dVarF.R();
                companion = d.INSTANCE;
                if (objR == companion.a()) {
                    objR = s0.e(null, null, 2, null);
                    dVarF.L(objR);
                }
                o58Var = (o58) objR;
                androidx.compose.ui.b.Companion companion16 = androidx.compose.ui.b.INSTANCE;
                if ((29360128 & i5) == 8388608) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objR2 = dVarF.R();
                if (z5) {
                    objR2 = new a(o58Var, function2);
                    dVarF.L(objR2);
                } else {
                    objR2 = new a(o58Var, function2);
                    dVarF.L(objR2);
                }
                androidx.compose.ui.b bVarThen15 = bVar3.then(ugc.c(companion16, function2, (PointerInputEventHandler) objR2));
                if ((i5 & 3670016) == 1048576) {
                }
                objR3 = dVarF.R();
                if (z6) {
                    objR3 = new Function1() { // from class: com.google.android.he1
                        public final Object invoke(Object obj) {
                            return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                        }
                    };
                    dVarF.L(objR3);
                } else {
                    objR3 = new Function1() { // from class: com.google.android.he1
                        public final Object invoke(Object obj) {
                            return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                        }
                    };
                    dVarF.L(objR3);
                }
                dVar2 = dVarF;
                mi0.p(bVar, bVarThen15, textStyleA, (Function1) objR3, iA, z4, i19, 0, null, null, null, dVar2, (58254 & i5) | (458752 & (i5 << 6)) | ((i5 << 3) & 3670016), 0, 1920);
                if (e.k()) {
                    e.n();
                }
                function3 = function4;
                textStyle3 = textStyleA;
                z3 = z4;
                i16 = i19;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                z3 = z;
                i16 = i2;
                textStyle3 = textStyle2;
                function3 = function1;
            }
            bVar4 = bVar3;
            i17 = iA;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.ie1
                    public final Object invoke(Object obj, Object obj2) {
                        return ke1.g(bVar, bVar4, textStyle3, z3, i17, i16, function3, function2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i5 |= 24576;
        iA = i;
        i12 = i4 & 32;
        if (i12 != 0) {
            i5 |= 196608;
        } else if ((i3 & 196608) == 0) {
            if (dVarF.C(i2)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i5 |= i13;
        }
        i14 = i4 & 64;
        if (i14 != 0) {
            i5 |= 1572864;
        } else if ((i3 & 1572864) == 0) {
            if (dVarF.T(function1)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i5 |= i15;
        }
        if ((i3 & 12582912) == 0) {
            if (dVarF.T(function2)) {
                i20 = 8388608;
            } else {
                i20 = 4194304;
            }
            i5 |= i20;
        }
        if ((i5 & 4793491) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (dVarF.g(z2, i5 & 1)) {
            if (i21 != 0) {
                bVar3 = androidx.compose.ui.b.INSTANCE;
            }
            if (i6 != 0) {
                textStyleA = TextStyle.INSTANCE.a();
            } else {
                textStyleA = textStyle2;
            }
            if (i8 != 0) {
                z4 = true;
            } else {
                z4 = z;
            }
            if (i10 != 0) {
                iA = uyc.INSTANCE.a();
            }
            if (i12 != 0) {
                i19 = Integer.MAX_VALUE;
                i18 = i14;
            } else {
                i18 = i14;
                i19 = i2;
            }
            if (i18 != 0) {
                objR4 = dVarF.R();
                if (objR4 == d.INSTANCE.a()) {
                    objR4 = new Function1() { // from class: com.google.android.ge1
                        public final Object invoke(Object obj) {
                            return ke1.e((TextLayoutResult) obj);
                        }
                    };
                    dVarF.L(objR4);
                }
                function4 = (Function1) objR4;
            } else {
                function4 = function1;
            }
            if (e.k()) {
                e.o(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
            }
            objR = dVarF.R();
            companion = d.INSTANCE;
            if (objR == companion.a()) {
                objR = s0.e(null, null, 2, null);
                dVarF.L(objR);
            }
            o58Var = (o58) objR;
            androidx.compose.ui.b.Companion companion17 = androidx.compose.ui.b.INSTANCE;
            if ((29360128 & i5) == 8388608) {
                z5 = true;
            } else {
                z5 = false;
            }
            objR2 = dVarF.R();
            if (z5) {
                objR2 = new a(o58Var, function2);
                dVarF.L(objR2);
            } else {
                objR2 = new a(o58Var, function2);
                dVarF.L(objR2);
            }
            androidx.compose.ui.b bVarThen16 = bVar3.then(ugc.c(companion17, function2, (PointerInputEventHandler) objR2));
            if ((i5 & 3670016) == 1048576) {
            }
            objR3 = dVarF.R();
            if (z6) {
                objR3 = new Function1() { // from class: com.google.android.he1
                    public final Object invoke(Object obj) {
                        return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                    }
                };
                dVarF.L(objR3);
            } else {
                objR3 = new Function1() { // from class: com.google.android.he1
                    public final Object invoke(Object obj) {
                        return ke1.f(o58Var, function4, (TextLayoutResult) obj);
                    }
                };
                dVarF.L(objR3);
            }
            dVar2 = dVarF;
            mi0.p(bVar, bVarThen16, textStyleA, (Function1) objR3, iA, z4, i19, 0, null, null, null, dVar2, (58254 & i5) | (458752 & (i5 << 6)) | ((i5 << 3) & 3670016), 0, 1920);
            if (e.k()) {
                e.n();
            }
            function3 = function4;
            textStyle3 = textStyleA;
            z3 = z4;
            i16 = i19;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            z3 = z;
            i16 = i2;
            textStyle3 = textStyle2;
            function3 = function1;
        }
        bVar4 = bVar3;
        i17 = iA;
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.ie1
                public final Object invoke(Object obj, Object obj2) {
                    return ke1.g(bVar, bVar4, textStyle3, z3, i17, i16, function3, function2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(TextLayoutResult textLayoutResult) {
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(o58 o58Var, Function1 function1, TextLayoutResult textLayoutResult) {
        o58Var.setValue(textLayoutResult);
        function1.invoke(textLayoutResult);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(b bVar, androidx.compose.ui.b bVar2, TextStyle textStyle, boolean z, int i, int i2, Function1 function1, Function1 function2, int i3, int i4, d dVar, int i5) {
        d(bVar, bVar2, textStyle, z, i, i2, function1, function2, dVar, saa.a(i3 | 1), i4);
        return Unit.a;
    }
}
