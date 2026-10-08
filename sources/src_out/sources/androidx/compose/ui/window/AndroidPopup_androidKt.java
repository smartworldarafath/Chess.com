package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.p004runtime.p0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.afb;
import com.google.inputmethod.dfa;
import com.google.inputmethod.dj7;
import com.google.inputmethod.dud;
import com.google.inputmethod.ed;
import com.google.inputmethod.ej7;
import com.google.inputmethod.f43;
import com.google.inputmethod.fj7;
import com.google.inputmethod.fs1;
import com.google.inputmethod.gs1;
import com.google.inputmethod.jd3;
import com.google.inputmethod.k16;
import com.google.inputmethod.kd3;
import com.google.inputmethod.kn6;
import com.google.inputmethod.ko1;
import com.google.inputmethod.ks9;
import com.google.inputmethod.nfb;
import com.google.inputmethod.os9;
import com.google.inputmethod.pp1;
import com.google.inputmethod.q16;
import com.google.inputmethod.q6c;
import com.google.inputmethod.qr8;
import com.google.inputmethod.rg9;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.sg9;
import com.google.inputmethod.vn3;
import com.google.inputmethod.xq8;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u001aA\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0013\u001a\u00020\n*\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0016\u001a\u00020\u000f*\u00020\u00052\u0006\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\" \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 \" \u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 ¨\u0006&²\u0006\u0012\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lcom/google/android/rg9;", "popupPositionProvider", "Lkotlin/Function0;", "", "onDismissRequest", "Lcom/google/android/sg9;", "properties", "content", "a", "(Lcom/google/android/rg9;Lkotlin/jvm/functions/Function0;Lcom/google/android/sg9;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;II)V", "", "focusable", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "clippingEnabled", "", "g", "(ZLandroidx/compose/ui/window/SecureFlagPolicy;Z)I", "Landroid/view/View;", "j", "(Landroid/view/View;)Z", "isParentFlagSecureEnabled", "h", "(Lcom/google/android/sg9;Z)I", "Landroid/graphics/Rect;", "Lcom/google/android/k16;", "k", "(Landroid/graphics/Rect;)Lcom/google/android/k16;", "Lcom/google/android/ks9;", "", "Lcom/google/android/ks9;", "getLocalPopupTestTag", "()Lcom/google/android/ks9;", "LocalPopupTestTag", "b", "i", "LocalIsInPopupLayout", "currentContent", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AndroidPopup_androidKt {
    private static final ks9<String> a = fs1.h(null, new Function0<String>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$LocalPopupTestTag$1
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }, 1, null);
    private static final ks9<Boolean> b = fs1.h(null, new Function0<Boolean>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$LocalIsInPopupLayout$1
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Boolean m74invoke() {
            return Boolean.FALSE;
        }
    }, 1, null);

    /* JADX WARN: Code duplicated, block: B:101:0x0208  */
    /* JADX WARN: Code duplicated, block: B:103:0x020e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0229  */
    /* JADX WARN: Code duplicated, block: B:108:0x022f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0250  */
    /* JADX WARN: Code duplicated, block: B:113:0x0256  */
    /* JADX WARN: Code duplicated, block: B:116:0x027d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0289  */
    /* JADX WARN: Code duplicated, block: B:120:0x028d  */
    /* JADX WARN: Code duplicated, block: B:123:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:125:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:128:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:60:0x010e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0143  */
    /* JADX WARN: Code duplicated, block: B:64:0x0156  */
    /* JADX WARN: Code duplicated, block: B:65:0x0158  */
    /* JADX WARN: Code duplicated, block: B:68:0x0160  */
    /* JADX WARN: Code duplicated, block: B:69:0x0162  */
    /* JADX WARN: Code duplicated, block: B:72:0x0178  */
    /* JADX WARN: Code duplicated, block: B:74:0x017e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0198  */
    /* JADX WARN: Code duplicated, block: B:78:0x019a  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:96:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f1  */
    public static final void a(rg9 rg9Var, Function0<Unit> function0, sg9 sg9Var, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, androidx.compose.p004runtime.d dVar, final int i, final int i2) {
        int i3;
        Function0<Unit> function1;
        int i4;
        sg9 sg9Var2;
        int i5;
        boolean z;
        final Function0<Unit> function3;
        final sg9 sg9Var3;
        s6b s6bVarH;
        final Function0<Unit> function4;
        final sg9 sg9Var4;
        View view;
        f43 f43Var;
        String str;
        final LayoutDirection layoutDirection;
        androidx.compose.p004runtime.f fVarE;
        final q6c q6cVarR;
        Object objR;
        androidx.compose.p004runtime.d.Companion aVar;
        UUID uuid;
        boolean zBooleanValue;
        Object objR2;
        boolean z2;
        String str2;
        int i6;
        final PopupLayout popupLayout;
        int i7;
        boolean z3;
        int i8;
        boolean z4;
        boolean zX;
        Object objR3;
        boolean z5;
        boolean z6;
        boolean zX2;
        Object objR4;
        int i9;
        boolean z7;
        boolean z8;
        Object objR5;
        boolean zT;
        Object objR6;
        boolean zT2;
        Object objR7;
        boolean zT3;
        Object objR8;
        Function0<ComposeUiNode> function0B;
        int i10;
        final rg9 rg9Var2 = rg9Var;
        androidx.compose.p004runtime.d dVarF = dVar.F(-1772091631);
        if ((i & 6) == 0) {
            i3 = (dVarF.x(rg9Var2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                function1 = function0;
                i3 |= dVarF.T(function1) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    sg9Var2 = sg9Var;
                    if (dVarF.x(sg9Var2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if (dVarF.T(function2)) {
                        i10 = 2048;
                    } else {
                        i10 = 1024;
                    }
                    i3 |= i10;
                }
                if ((i3 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i11 != 0) {
                        function4 = null;
                    } else {
                        function4 = function1;
                    }
                    if (i4 != 0) {
                        sg9Var4 = new sg9(false, false, false, false, false, 31, null);
                    } else {
                        sg9Var4 = sg9Var2;
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-1772091631, i3, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:417)");
                    }
                    view = (View) dVarF.v(AndroidCompositionLocals_androidKt.g());
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    str = (String) dVarF.v(a);
                    layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                    fVarE = pp1.e(dVarF, 0);
                    q6cVarR = p0.r(function2, dVarF, (i3 >> 9) & 14);
                    Object[] objArr = new Object[0];
                    objR = dVarF.R();
                    aVar = androidx.compose.p004runtime.d.INSTANCE;
                    if (objR == aVar.a()) {
                        objR = new Function0<UUID>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1$1
                            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                            public final UUID invoke() {
                                return UUID.randomUUID();
                            }
                        };
                        dVarF.L(objR);
                    }
                    uuid = (UUID) dfa.l(objArr, (Function0) objR, dVarF, 48);
                    zBooleanValue = ((Boolean) dVarF.v(b)).booleanValue();
                    objR2 = dVarF.R();
                    if (objR2 == aVar.a()) {
                        str2 = str;
                        i6 = 32;
                        final PopupLayout popupLayout2 = new PopupLayout(function4, sg9Var4, str2, view, f43Var, rg9Var2, uuid, zBooleanValue, null, 256, null);
                        rg9Var2 = rg9Var2;
                        z2 = true;
                        popupLayout2.i(fVarE, ko1.c(-297523940, true, new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(androidx.compose.p004runtime.d dVar2, int i12) {
                                if (!dVar2.g((i12 & 3) != 2, i12 & 1)) {
                                    dVar2.q();
                                    return;
                                }
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.o(-297523940, i12, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:440)");
                                }
                                os9<Boolean> os9VarD = AndroidPopup_androidKt.i().d(Boolean.TRUE);
                                final PopupLayout popupLayout3 = popupLayout2;
                                final q6c<Function2<androidx.compose.p004runtime.d, Integer, Unit>> q6cVar = q6cVarR;
                                fs1.c(os9VarD, ko1.e(1022273628, true, new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                                        return Unit.a;
                                    }

                                    public final void invoke(androidx.compose.p004runtime.d dVar3, int i13) {
                                        if (!dVar3.g((i13 & 3) != 2, i13 & 1)) {
                                            dVar3.q();
                                            return;
                                        }
                                        if (androidx.compose.p004runtime.e.k()) {
                                            androidx.compose.p004runtime.e.o(1022273628, i13, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:441)");
                                        }
                                        androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
                                        Object objR9 = dVar3.R();
                                        androidx.compose.p004runtime.d.Companion companion2 = androidx.compose.p004runtime.d.INSTANCE;
                                        if (objR9 == companion2.a()) {
                                            objR9 = new Function1<nfb, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1
                                                public final void a(nfb nfbVar) {
                                                    SemanticsPropertiesKt.P(nfbVar);
                                                }

                                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                    a((nfb) obj);
                                                    return Unit.a;
                                                }
                                            };
                                            dVar3.L(objR9);
                                        }
                                        androidx.compose.ui.b bVarD = afb.d(companion, false, (Function1) objR9, 1, null);
                                        boolean zT4 = dVar3.T(popupLayout3);
                                        final PopupLayout popupLayout4 = popupLayout3;
                                        Object objR10 = dVar3.R();
                                        if (zT4 || objR10 == companion2.a()) {
                                            objR10 = new Function1<q16, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$2$1
                                                {
                                                    super(1);
                                                }

                                                public final void a(long j) {
                                                    popupLayout4.m78setPopupContentSizefhxjrPA(q16.b(j));
                                                    popupLayout4.p();
                                                }

                                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                    a(((q16) obj).getPackedValue());
                                                    return Unit.a;
                                                }
                                            };
                                            dVar3.L(objR10);
                                        }
                                        androidx.compose.ui.b bVarA = ed.a(qr8.a(bVarD, (Function1) objR10), popupLayout3.getCanCalculatePosition() ? 1.0f : 0.0f);
                                        Function2 function2B = AndroidPopup_androidKt.b(q6cVar);
                                        Object objR11 = dVar3.R();
                                        if (objR11 == companion2.a()) {
                                            objR11 = new ej7() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1
                                                @Override // com.google.inputmethod.ej7
                                                /* JADX INFO: renamed from: measure-3p2s80s */
                                                public final fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, long j) {
                                                    int size = list.size();
                                                    if (size == 0) {
                                                        return j.Q1(jVar, 0, 0, null, new Function1<o.a, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1.1
                                                            public final void invoke(o.a aVar2) {
                                                            }

                                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                                invoke((o.a) obj);
                                                                return Unit.a;
                                                            }
                                                        }, 4, null);
                                                    }
                                                    if (size == 1) {
                                                        final o oVarR0 = list.get(0).r0(j);
                                                        return j.Q1(jVar, oVarR0.getWidth(), oVarR0.getHeight(), null, new Function1<o.a, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1.2
                                                            {
                                                                super(1);
                                                            }

                                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                                invoke((o.a) obj);
                                                                return Unit.a;
                                                            }

                                                            public final void invoke(o.a aVar2) {
                                                                o.a.L(aVar2, oVarR0, 0, 0, 0.0f, 4, null);
                                                            }
                                                        }, 4, null);
                                                    }
                                                    final ArrayList arrayList = new ArrayList(list.size());
                                                    int size2 = list.size();
                                                    int iMax = 0;
                                                    int iMax2 = 0;
                                                    for (int i14 = 0; i14 < size2; i14++) {
                                                        o oVarR1 = list.get(i14).r0(j);
                                                        iMax = Math.max(iMax, oVarR1.getWidth());
                                                        iMax2 = Math.max(iMax2, oVarR1.getHeight());
                                                        arrayList.add(oVarR1);
                                                    }
                                                    return j.Q1(jVar, iMax, iMax2, null, new Function1<o.a, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1.3
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(1);
                                                        }

                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                            invoke((o.a) obj);
                                                            return Unit.a;
                                                        }

                                                        public final void invoke(o.a aVar2) {
                                                            int iR = m.r(arrayList);
                                                            if (iR < 0) {
                                                                return;
                                                            }
                                                            int i15 = 0;
                                                            while (true) {
                                                                o.a aVar3 = aVar2;
                                                                o.a.L(aVar3, arrayList.get(i15), 0, 0, 0.0f, 4, null);
                                                                if (i15 == iR) {
                                                                    return;
                                                                }
                                                                i15++;
                                                                aVar2 = aVar3;
                                                            }
                                                        }
                                                    }, 4, null);
                                                }
                                            };
                                            dVar3.L(objR11);
                                        }
                                        ej7 ej7Var = (ej7) objR11;
                                        int iHashCode = Long.hashCode(pp1.b(dVar3, 0));
                                        gs1 gs1VarJ = dVar3.j();
                                        androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar3, bVarA);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> function0B2 = companion3.b();
                                        if (dVar3.G() == null) {
                                            pp1.d();
                                        }
                                        dVar3.o();
                                        if (dVar3.getInserting()) {
                                            dVar3.W(function0B2);
                                        } else {
                                            dVar3.k();
                                        }
                                        androidx.compose.p004runtime.d dVarC = dud.c(dVar3);
                                        dud.i(dVarC, ej7Var, companion3.d());
                                        dud.i(dVarC, gs1VarJ, companion3.f());
                                        dud.i(dVarC, Integer.valueOf(iHashCode), companion3.c());
                                        dud.g(dVarC, companion3.a());
                                        dud.i(dVarC, bVarE, companion3.e());
                                        function2B.invoke(dVar3, 0);
                                        dVar3.m();
                                        if (androidx.compose.p004runtime.e.k()) {
                                            androidx.compose.p004runtime.e.n();
                                        }
                                    }
                                }, dVar2, 54), dVar2, os9.i | 48);
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.n();
                                }
                            }
                        }));
                        dVarF.L(popupLayout2);
                        objR2 = popupLayout2;
                    } else {
                        z2 = true;
                        str2 = str;
                        i6 = 32;
                    }
                    popupLayout = (PopupLayout) objR2;
                    boolean zT4 = dVarF.T(popupLayout);
                    int i12 = i3;
                    i7 = i12 & 112;
                    if (i7 == i6) {
                        z3 = z2;
                    } else {
                        z3 = false;
                    }
                    boolean z9 = zT4 | z3;
                    i8 = i12 & 896;
                    if (i8 == 256) {
                        z4 = z2;
                    } else {
                        z4 = false;
                    }
                    zX = z9 | z4 | dVarF.x(str2) | dVarF.C(layoutDirection.ordinal());
                    objR3 = dVarF.R();
                    if (zX || objR3 == aVar.a()) {
                        final String str3 = str2;
                        objR3 = new Function1<kd3, jd3>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1

                            @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/AndroidPopup_androidKt$Popup$2$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                            public static final class a implements jd3 {
                                final /* synthetic */ PopupLayout a;

                                public a(PopupLayout popupLayout) {
                                    this.a = popupLayout;
                                }

                                @Override // com.google.inputmethod.jd3
                                public void dispose() {
                                    this.a.disposeComposition();
                                    this.a.e();
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                            public final jd3 invoke(kd3 kd3Var) throws NoWhenBranchMatchedException {
                                popupLayout.j();
                                popupLayout.l(function4, sg9Var4, str3, layoutDirection);
                                return new a(popupLayout);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    vn3.c(popupLayout, (Function1) objR3, dVarF, 0);
                    boolean zT5 = dVarF.T(popupLayout);
                    if (i7 == i6) {
                        z5 = z2;
                    } else {
                        z5 = false;
                    }
                    boolean z10 = zT5 | z5;
                    if (i8 == 256) {
                        z6 = z2;
                    } else {
                        z6 = false;
                    }
                    zX2 = z10 | z6 | dVarF.x(str2) | dVarF.C(layoutDirection.ordinal());
                    objR4 = dVarF.R();
                    if (zX2 || objR4 == aVar.a()) {
                        final String str4 = str2;
                        objR4 = new Function0<Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                            public /* bridge */ /* synthetic */ Object invoke() throws NoWhenBranchMatchedException {
                                m76invoke();
                                return Unit.a;
                            }

                            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                            public final void m76invoke() throws NoWhenBranchMatchedException {
                                popupLayout.l(function4, sg9Var4, str4, layoutDirection);
                            }
                        };
                        dVarF.L(objR4);
                    }
                    vn3.i((Function0) objR4, dVarF, 0);
                    boolean zT6 = dVarF.T(popupLayout);
                    i9 = i12 & 14;
                    if (i9 == 4) {
                        z7 = z2;
                    } else {
                        z7 = false;
                    }
                    z8 = zT6 | z7;
                    objR5 = dVarF.R();
                    if (z8 || objR5 == aVar.a()) {
                        objR5 = new Function1<kd3, jd3>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1

                            @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/AndroidPopup_androidKt$Popup$4$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                            public static final class a implements jd3 {
                                @Override // com.google.inputmethod.jd3
                                public void dispose() {
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final jd3 invoke(kd3 kd3Var) {
                                popupLayout.setPositionProvider(rg9Var2);
                                popupLayout.p();
                                return new a();
                            }
                        };
                        dVarF.L(objR5);
                    }
                    vn3.c(rg9Var2, (Function1) objR5, dVarF, i9);
                    zT = dVarF.T(popupLayout);
                    objR6 = dVarF.R();
                    if (zT || objR6 == aVar.a()) {
                        objR6 = new AndroidPopup_androidKt$Popup$5$1(popupLayout, null);
                        dVarF.L(objR6);
                    }
                    vn3.g(popupLayout, (Function2) objR6, dVarF, 0);
                    androidx.compose.ui.b.Companion aVar2 = androidx.compose.ui.b.INSTANCE;
                    zT2 = dVarF.T(popupLayout);
                    objR7 = dVarF.R();
                    if (zT2 || objR7 == aVar.a()) {
                        objR7 = new Function1<kn6, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                            {
                                super(1);
                            }

                            public final void a(kn6 kn6Var) {
                                kn6 kn6VarL = kn6Var.L();
                                Intrinsics.g(kn6VarL);
                                popupLayout.n(kn6VarL);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                a((kn6) obj);
                                return Unit.a;
                            }
                        };
                        dVarF.L(objR7);
                    }
                    androidx.compose.ui.b bVarA = xq8.a(aVar2, (Function1) objR7);
                    zT3 = dVarF.T(popupLayout) | dVarF.C(layoutDirection.ordinal());
                    objR8 = dVarF.R();
                    if (zT3 || objR8 == aVar.a()) {
                        objR8 = new ej7() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1
                            @Override // com.google.inputmethod.ej7
                            /* JADX INFO: renamed from: measure-3p2s80s */
                            public final fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, long j) {
                                popupLayout.setParentLayoutDirection(layoutDirection);
                                return j.Q1(jVar, 0, 0, null, new Function1<o.a, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1.1
                                    public final void invoke(o.a aVar3) {
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((o.a) obj);
                                        return Unit.a;
                                    }
                                }, 4, null);
                            }
                        };
                        dVarF.L(objR8);
                    }
                    ej7 ej7Var = (ej7) objR8;
                    int iHashCode = Long.hashCode(pp1.b(dVarF, 0));
                    gs1 gs1VarJ = dVarF.j();
                    androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, bVarA);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    function0B = companion.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B);
                    } else {
                        dVarF.k();
                    }
                    androidx.compose.p004runtime.d dVarC = dud.c(dVarF);
                    dud.i(dVarC, ej7Var, companion.d());
                    dud.i(dVarC, gs1VarJ, companion.f());
                    dud.i(dVarC, Integer.valueOf(iHashCode), companion.c());
                    dud.g(dVarC, companion.a());
                    dud.i(dVarC, bVarE, companion.e());
                    dVarF.m();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    function3 = function4;
                    sg9Var3 = sg9Var4;
                } else {
                    dVarF.q();
                    function3 = function1;
                    sg9Var3 = sg9Var2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(androidx.compose.p004runtime.d dVar2, int i13) {
                            AndroidPopup_androidKt.a(rg9Var2, function3, sg9Var3, function2, dVar2, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 384;
            sg9Var2 = sg9Var;
            if ((i & 3072) == 0) {
                if (dVarF.T(function2)) {
                    i10 = 2048;
                } else {
                    i10 = 1024;
                }
                i3 |= i10;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i11 != 0) {
                    function4 = null;
                } else {
                    function4 = function1;
                }
                if (i4 != 0) {
                    sg9Var4 = new sg9(false, false, false, false, false, 31, null);
                } else {
                    sg9Var4 = sg9Var2;
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-1772091631, i3, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:417)");
                }
                view = (View) dVarF.v(AndroidCompositionLocals_androidKt.g());
                f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                str = (String) dVarF.v(a);
                layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                fVarE = pp1.e(dVarF, 0);
                q6cVarR = p0.r(function2, dVarF, (i3 >> 9) & 14);
                Object[] objArr2 = new Object[0];
                objR = dVarF.R();
                aVar = androidx.compose.p004runtime.d.INSTANCE;
                if (objR == aVar.a()) {
                    objR = new Function0<UUID>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1$1
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final UUID invoke() {
                            return UUID.randomUUID();
                        }
                    };
                    dVarF.L(objR);
                }
                uuid = (UUID) dfa.l(objArr2, (Function0) objR, dVarF, 48);
                zBooleanValue = ((Boolean) dVarF.v(b)).booleanValue();
                objR2 = dVarF.R();
                if (objR2 == aVar.a()) {
                    str2 = str;
                    i6 = 32;
                    final PopupLayout popupLayout3 = new PopupLayout(function4, sg9Var4, str2, view, f43Var, rg9Var2, uuid, zBooleanValue, null, 256, null);
                    rg9Var2 = rg9Var2;
                    z2 = true;
                    popupLayout3.i(fVarE, ko1.c(-297523940, true, new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(androidx.compose.p004runtime.d dVar2, int i13) {
                            if (!dVar2.g((i13 & 3) != 2, i13 & 1)) {
                                dVar2.q();
                                return;
                            }
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-297523940, i13, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:440)");
                            }
                            os9<Boolean> os9VarD = AndroidPopup_androidKt.i().d(Boolean.TRUE);
                            final PopupLayout popupLayout4 = popupLayout3;
                            final q6c<? extends Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit>> q6cVar = q6cVarR;
                            fs1.c(os9VarD, ko1.e(1022273628, true, new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                                    return Unit.a;
                                }

                                public final void invoke(androidx.compose.p004runtime.d dVar3, int i14) {
                                    if (!dVar3.g((i14 & 3) != 2, i14 & 1)) {
                                        dVar3.q();
                                        return;
                                    }
                                    if (androidx.compose.p004runtime.e.k()) {
                                        androidx.compose.p004runtime.e.o(1022273628, i14, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:441)");
                                    }
                                    androidx.compose.ui.b.Companion companion2 = androidx.compose.ui.b.INSTANCE;
                                    Object objR9 = dVar3.R();
                                    androidx.compose.p004runtime.d.Companion companion3 = androidx.compose.p004runtime.d.INSTANCE;
                                    if (objR9 == companion3.a()) {
                                        objR9 = new Function1<nfb, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1
                                            public final void a(nfb nfbVar) {
                                                SemanticsPropertiesKt.P(nfbVar);
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                a((nfb) obj);
                                                return Unit.a;
                                            }
                                        };
                                        dVar3.L(objR9);
                                    }
                                    androidx.compose.ui.b bVarD = afb.d(companion2, false, (Function1) objR9, 1, null);
                                    boolean zT7 = dVar3.T(popupLayout4);
                                    final PopupLayout popupLayout5 = popupLayout4;
                                    Object objR10 = dVar3.R();
                                    if (zT7 || objR10 == companion3.a()) {
                                        objR10 = new Function1<q16, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$2$1
                                            {
                                                super(1);
                                            }

                                            public final void a(long j) {
                                                popupLayout5.m78setPopupContentSizefhxjrPA(q16.b(j));
                                                popupLayout5.p();
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                a(((q16) obj).getPackedValue());
                                                return Unit.a;
                                            }
                                        };
                                        dVar3.L(objR10);
                                    }
                                    androidx.compose.ui.b bVarA2 = ed.a(qr8.a(bVarD, (Function1) objR10), popupLayout4.getCanCalculatePosition() ? 1.0f : 0.0f);
                                    Function2 function2B = AndroidPopup_androidKt.b(q6cVar);
                                    Object objR11 = dVar3.R();
                                    if (objR11 == companion3.a()) {
                                        objR11 = new ej7() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1
                                            @Override // com.google.inputmethod.ej7
                                            /* JADX INFO: renamed from: measure-3p2s80s */
                                            public final fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, long j) {
                                                int size = list.size();
                                                if (size == 0) {
                                                    return j.Q1(jVar, 0, 0, null, new Function1<o.a, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1.1
                                                        public final void invoke(o.a aVar3) {
                                                        }

                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                            invoke((o.a) obj);
                                                            return Unit.a;
                                                        }
                                                    }, 4, null);
                                                }
                                                if (size == 1) {
                                                    final o oVarR0 = list.get(0).r0(j);
                                                    return j.Q1(jVar, oVarR0.getWidth(), oVarR0.getHeight(), null, new Function1<o.a, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1.2
                                                        {
                                                            super(1);
                                                        }

                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                            invoke((o.a) obj);
                                                            return Unit.a;
                                                        }

                                                        public final void invoke(o.a aVar3) {
                                                            o.a.L(aVar3, oVarR0, 0, 0, 0.0f, 4, null);
                                                        }
                                                    }, 4, null);
                                                }
                                                final List<? extends o> arrayList = new ArrayList(list.size());
                                                int size2 = list.size();
                                                int iMax = 0;
                                                int iMax2 = 0;
                                                for (int i15 = 0; i15 < size2; i15++) {
                                                    o oVarR1 = list.get(i15).r0(j);
                                                    iMax = Math.max(iMax, oVarR1.getWidth());
                                                    iMax2 = Math.max(iMax2, oVarR1.getHeight());
                                                    arrayList.add(oVarR1);
                                                }
                                                return j.Q1(jVar, iMax, iMax2, null, new Function1<o.a, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(1);
                                                    }

                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                        invoke((o.a) obj);
                                                        return Unit.a;
                                                    }

                                                    public final void invoke(o.a aVar3) {
                                                        int iR = m.r(arrayList);
                                                        if (iR < 0) {
                                                            return;
                                                        }
                                                        int i16 = 0;
                                                        while (true) {
                                                            o.a aVar4 = aVar3;
                                                            o.a.L(aVar4, arrayList.get(i16), 0, 0, 0.0f, 4, null);
                                                            if (i16 == iR) {
                                                                return;
                                                            }
                                                            i16++;
                                                            aVar3 = aVar4;
                                                        }
                                                    }
                                                }, 4, null);
                                            }
                                        };
                                        dVar3.L(objR11);
                                    }
                                    ej7 ej7Var2 = (ej7) objR11;
                                    int iHashCode2 = Long.hashCode(pp1.b(dVar3, 0));
                                    gs1 gs1VarJ2 = dVar3.j();
                                    androidx.compose.ui.b bVarE2 = ComposedModifierKt.e(dVar3, bVarA2);
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> function0B2 = companion4.b();
                                    if (dVar3.G() == null) {
                                        pp1.d();
                                    }
                                    dVar3.o();
                                    if (dVar3.getInserting()) {
                                        dVar3.W(function0B2);
                                    } else {
                                        dVar3.k();
                                    }
                                    androidx.compose.p004runtime.d dVarC2 = dud.c(dVar3);
                                    dud.i(dVarC2, ej7Var2, companion4.d());
                                    dud.i(dVarC2, gs1VarJ2, companion4.f());
                                    dud.i(dVarC2, Integer.valueOf(iHashCode2), companion4.c());
                                    dud.g(dVarC2, companion4.a());
                                    dud.i(dVarC2, bVarE2, companion4.e());
                                    function2B.invoke(dVar3, 0);
                                    dVar3.m();
                                    if (androidx.compose.p004runtime.e.k()) {
                                        androidx.compose.p004runtime.e.n();
                                    }
                                }
                            }, dVar2, 54), dVar2, os9.i | 48);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                        }
                    }));
                    dVarF.L(popupLayout3);
                    objR2 = popupLayout3;
                } else {
                    z2 = true;
                    str2 = str;
                    i6 = 32;
                }
                popupLayout = (PopupLayout) objR2;
                boolean zT7 = dVarF.T(popupLayout);
                int i13 = i3;
                i7 = i13 & 112;
                if (i7 == i6) {
                    z3 = z2;
                } else {
                    z3 = false;
                }
                boolean z11 = zT7 | z3;
                i8 = i13 & 896;
                if (i8 == 256) {
                    z4 = z2;
                } else {
                    z4 = false;
                }
                zX = z11 | z4 | dVarF.x(str2) | dVarF.C(layoutDirection.ordinal());
                objR3 = dVarF.R();
                if (zX) {
                    final String str5 = str2;
                    objR3 = new Function1<kd3, jd3>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1

                        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/AndroidPopup_androidKt$Popup$2$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                        public static final class a implements jd3 {
                            final /* synthetic */ PopupLayout a;

                            public a(PopupLayout popupLayout) {
                                this.a = popupLayout;
                            }

                            @Override // com.google.inputmethod.jd3
                            public void dispose() {
                                this.a.disposeComposition();
                                this.a.e();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                        public final jd3 invoke(kd3 kd3Var) throws NoWhenBranchMatchedException {
                            popupLayout.j();
                            popupLayout.l(function4, sg9Var4, str5, layoutDirection);
                            return new a(popupLayout);
                        }
                    };
                    dVarF.L(objR3);
                } else {
                    final String str6 = str2;
                    objR3 = new Function1<kd3, jd3>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1

                        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/AndroidPopup_androidKt$Popup$2$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                        public static final class a implements jd3 {
                            final /* synthetic */ PopupLayout a;

                            public a(PopupLayout popupLayout) {
                                this.a = popupLayout;
                            }

                            @Override // com.google.inputmethod.jd3
                            public void dispose() {
                                this.a.disposeComposition();
                                this.a.e();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                        public final jd3 invoke(kd3 kd3Var) throws NoWhenBranchMatchedException {
                            popupLayout.j();
                            popupLayout.l(function4, sg9Var4, str6, layoutDirection);
                            return new a(popupLayout);
                        }
                    };
                    dVarF.L(objR3);
                }
                vn3.c(popupLayout, (Function1) objR3, dVarF, 0);
                boolean zT8 = dVarF.T(popupLayout);
                if (i7 == i6) {
                    z5 = z2;
                } else {
                    z5 = false;
                }
                boolean z12 = zT8 | z5;
                if (i8 == 256) {
                    z6 = z2;
                } else {
                    z6 = false;
                }
                zX2 = z12 | z6 | dVarF.x(str2) | dVarF.C(layoutDirection.ordinal());
                objR4 = dVarF.R();
                if (zX2) {
                    final String str7 = str2;
                    objR4 = new Function0<Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                        public /* bridge */ /* synthetic */ Object invoke() throws NoWhenBranchMatchedException {
                            m76invoke();
                            return Unit.a;
                        }

                        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m76invoke() throws NoWhenBranchMatchedException {
                            popupLayout.l(function4, sg9Var4, str7, layoutDirection);
                        }
                    };
                    dVarF.L(objR4);
                } else {
                    final String str8 = str2;
                    objR4 = new Function0<Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                        public /* bridge */ /* synthetic */ Object invoke() throws NoWhenBranchMatchedException {
                            m76invoke();
                            return Unit.a;
                        }

                        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m76invoke() throws NoWhenBranchMatchedException {
                            popupLayout.l(function4, sg9Var4, str8, layoutDirection);
                        }
                    };
                    dVarF.L(objR4);
                }
                vn3.i((Function0) objR4, dVarF, 0);
                boolean zT9 = dVarF.T(popupLayout);
                i9 = i13 & 14;
                if (i9 == 4) {
                    z7 = z2;
                } else {
                    z7 = false;
                }
                z8 = zT9 | z7;
                objR5 = dVarF.R();
                if (z8) {
                    objR5 = new Function1<kd3, jd3>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1

                        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/AndroidPopup_androidKt$Popup$4$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                        public static final class a implements jd3 {
                            @Override // com.google.inputmethod.jd3
                            public void dispose() {
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final jd3 invoke(kd3 kd3Var) {
                            popupLayout.setPositionProvider(rg9Var2);
                            popupLayout.p();
                            return new a();
                        }
                    };
                    dVarF.L(objR5);
                } else {
                    objR5 = new Function1<kd3, jd3>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1

                        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/AndroidPopup_androidKt$Popup$4$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                        public static final class a implements jd3 {
                            @Override // com.google.inputmethod.jd3
                            public void dispose() {
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final jd3 invoke(kd3 kd3Var) {
                            popupLayout.setPositionProvider(rg9Var2);
                            popupLayout.p();
                            return new a();
                        }
                    };
                    dVarF.L(objR5);
                }
                vn3.c(rg9Var2, (Function1) objR5, dVarF, i9);
                zT = dVarF.T(popupLayout);
                objR6 = dVarF.R();
                if (zT) {
                    objR6 = new AndroidPopup_androidKt$Popup$5$1(popupLayout, null);
                    dVarF.L(objR6);
                } else {
                    objR6 = new AndroidPopup_androidKt$Popup$5$1(popupLayout, null);
                    dVarF.L(objR6);
                }
                vn3.g(popupLayout, (Function2) objR6, dVarF, 0);
                androidx.compose.ui.b.Companion aVar3 = androidx.compose.ui.b.INSTANCE;
                zT2 = dVarF.T(popupLayout);
                objR7 = dVarF.R();
                if (zT2) {
                    objR7 = new Function1<kn6, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                        {
                            super(1);
                        }

                        public final void a(kn6 kn6Var) {
                            kn6 kn6VarL = kn6Var.L();
                            Intrinsics.g(kn6VarL);
                            popupLayout.n(kn6VarL);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            a((kn6) obj);
                            return Unit.a;
                        }
                    };
                    dVarF.L(objR7);
                } else {
                    objR7 = new Function1<kn6, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                        {
                            super(1);
                        }

                        public final void a(kn6 kn6Var) {
                            kn6 kn6VarL = kn6Var.L();
                            Intrinsics.g(kn6VarL);
                            popupLayout.n(kn6VarL);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            a((kn6) obj);
                            return Unit.a;
                        }
                    };
                    dVarF.L(objR7);
                }
                androidx.compose.ui.b bVarA2 = xq8.a(aVar3, (Function1) objR7);
                zT3 = dVarF.T(popupLayout) | dVarF.C(layoutDirection.ordinal());
                objR8 = dVarF.R();
                if (zT3) {
                    objR8 = new ej7() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1
                        @Override // com.google.inputmethod.ej7
                        /* JADX INFO: renamed from: measure-3p2s80s */
                        public final fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, long j) {
                            popupLayout.setParentLayoutDirection(layoutDirection);
                            return j.Q1(jVar, 0, 0, null, new Function1<o.a, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1.1
                                public final void invoke(o.a aVar4) {
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((o.a) obj);
                                    return Unit.a;
                                }
                            }, 4, null);
                        }
                    };
                    dVarF.L(objR8);
                } else {
                    objR8 = new ej7() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1
                        @Override // com.google.inputmethod.ej7
                        /* JADX INFO: renamed from: measure-3p2s80s */
                        public final fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, long j) {
                            popupLayout.setParentLayoutDirection(layoutDirection);
                            return j.Q1(jVar, 0, 0, null, new Function1<o.a, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1.1
                                public final void invoke(o.a aVar4) {
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((o.a) obj);
                                    return Unit.a;
                                }
                            }, 4, null);
                        }
                    };
                    dVarF.L(objR8);
                }
                ej7 ej7Var2 = (ej7) objR8;
                int iHashCode2 = Long.hashCode(pp1.b(dVarF, 0));
                gs1 gs1VarJ2 = dVarF.j();
                androidx.compose.ui.b bVarE2 = ComposedModifierKt.e(dVarF, bVarA2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                function0B = companion2.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                androidx.compose.p004runtime.d dVarC2 = dud.c(dVarF);
                dud.i(dVarC2, ej7Var2, companion2.d());
                dud.i(dVarC2, gs1VarJ2, companion2.f());
                dud.i(dVarC2, Integer.valueOf(iHashCode2), companion2.c());
                dud.g(dVarC2, companion2.a());
                dud.i(dVarC2, bVarE2, companion2.e());
                dVarF.m();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                function3 = function4;
                sg9Var3 = sg9Var4;
            } else {
                dVarF.q();
                function3 = function1;
                sg9Var3 = sg9Var2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(androidx.compose.p004runtime.d dVar2, int i14) {
                        AndroidPopup_androidKt.a(rg9Var2, function3, sg9Var3, function2, dVar2, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 48;
        function1 = function0;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                sg9Var2 = sg9Var;
                if (dVarF.x(sg9Var2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if (dVarF.T(function2)) {
                    i10 = 2048;
                } else {
                    i10 = 1024;
                }
                i3 |= i10;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i11 != 0) {
                    function4 = null;
                } else {
                    function4 = function1;
                }
                if (i4 != 0) {
                    sg9Var4 = new sg9(false, false, false, false, false, 31, null);
                } else {
                    sg9Var4 = sg9Var2;
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-1772091631, i3, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:417)");
                }
                view = (View) dVarF.v(AndroidCompositionLocals_androidKt.g());
                f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                str = (String) dVarF.v(a);
                layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                fVarE = pp1.e(dVarF, 0);
                q6cVarR = p0.r(function2, dVarF, (i3 >> 9) & 14);
                Object[] objArr3 = new Object[0];
                objR = dVarF.R();
                aVar = androidx.compose.p004runtime.d.INSTANCE;
                if (objR == aVar.a()) {
                    objR = new Function0<UUID>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1$1
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final UUID invoke() {
                            return UUID.randomUUID();
                        }
                    };
                    dVarF.L(objR);
                }
                uuid = (UUID) dfa.l(objArr3, (Function0) objR, dVarF, 48);
                zBooleanValue = ((Boolean) dVarF.v(b)).booleanValue();
                objR2 = dVarF.R();
                if (objR2 == aVar.a()) {
                    str2 = str;
                    i6 = 32;
                    final PopupLayout popupLayout4 = new PopupLayout(function4, sg9Var4, str2, view, f43Var, rg9Var2, uuid, zBooleanValue, null, 256, null);
                    rg9Var2 = rg9Var2;
                    z2 = true;
                    popupLayout4.i(fVarE, ko1.c(-297523940, true, new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(androidx.compose.p004runtime.d dVar2, int i14) {
                            if (!dVar2.g((i14 & 3) != 2, i14 & 1)) {
                                dVar2.q();
                                return;
                            }
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-297523940, i14, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:440)");
                            }
                            os9<Boolean> os9VarD = AndroidPopup_androidKt.i().d(Boolean.TRUE);
                            final PopupLayout popupLayout5 = popupLayout4;
                            final q6c<? extends Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit>> q6cVar = q6cVarR;
                            fs1.c(os9VarD, ko1.e(1022273628, true, new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                                    return Unit.a;
                                }

                                public final void invoke(androidx.compose.p004runtime.d dVar3, int i15) {
                                    if (!dVar3.g((i15 & 3) != 2, i15 & 1)) {
                                        dVar3.q();
                                        return;
                                    }
                                    if (androidx.compose.p004runtime.e.k()) {
                                        androidx.compose.p004runtime.e.o(1022273628, i15, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:441)");
                                    }
                                    androidx.compose.ui.b.Companion companion3 = androidx.compose.ui.b.INSTANCE;
                                    Object objR9 = dVar3.R();
                                    androidx.compose.p004runtime.d.Companion companion4 = androidx.compose.p004runtime.d.INSTANCE;
                                    if (objR9 == companion4.a()) {
                                        objR9 = new Function1<nfb, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1
                                            public final void a(nfb nfbVar) {
                                                SemanticsPropertiesKt.P(nfbVar);
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                a((nfb) obj);
                                                return Unit.a;
                                            }
                                        };
                                        dVar3.L(objR9);
                                    }
                                    androidx.compose.ui.b bVarD = afb.d(companion3, false, (Function1) objR9, 1, null);
                                    boolean zT10 = dVar3.T(popupLayout5);
                                    final PopupLayout popupLayout6 = popupLayout5;
                                    Object objR10 = dVar3.R();
                                    if (zT10 || objR10 == companion4.a()) {
                                        objR10 = new Function1<q16, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$2$1
                                            {
                                                super(1);
                                            }

                                            public final void a(long j) {
                                                popupLayout6.m78setPopupContentSizefhxjrPA(q16.b(j));
                                                popupLayout6.p();
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                a(((q16) obj).getPackedValue());
                                                return Unit.a;
                                            }
                                        };
                                        dVar3.L(objR10);
                                    }
                                    androidx.compose.ui.b bVarA3 = ed.a(qr8.a(bVarD, (Function1) objR10), popupLayout5.getCanCalculatePosition() ? 1.0f : 0.0f);
                                    Function2 function2B = AndroidPopup_androidKt.b(q6cVar);
                                    Object objR11 = dVar3.R();
                                    if (objR11 == companion4.a()) {
                                        objR11 = new ej7() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1
                                            @Override // com.google.inputmethod.ej7
                                            /* JADX INFO: renamed from: measure-3p2s80s */
                                            public final fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, long j) {
                                                int size = list.size();
                                                if (size == 0) {
                                                    return j.Q1(jVar, 0, 0, null, new Function1<o.a, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1.1
                                                        public final void invoke(o.a aVar4) {
                                                        }

                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                            invoke((o.a) obj);
                                                            return Unit.a;
                                                        }
                                                    }, 4, null);
                                                }
                                                if (size == 1) {
                                                    final o oVarR0 = list.get(0).r0(j);
                                                    return j.Q1(jVar, oVarR0.getWidth(), oVarR0.getHeight(), null, new Function1<o.a, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1.2
                                                        {
                                                            super(1);
                                                        }

                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                            invoke((o.a) obj);
                                                            return Unit.a;
                                                        }

                                                        public final void invoke(o.a aVar4) {
                                                            o.a.L(aVar4, oVarR0, 0, 0, 0.0f, 4, null);
                                                        }
                                                    }, 4, null);
                                                }
                                                final List<? extends o> arrayList = new ArrayList(list.size());
                                                int size2 = list.size();
                                                int iMax = 0;
                                                int iMax2 = 0;
                                                for (int i16 = 0; i16 < size2; i16++) {
                                                    o oVarR1 = list.get(i16).r0(j);
                                                    iMax = Math.max(iMax, oVarR1.getWidth());
                                                    iMax2 = Math.max(iMax2, oVarR1.getHeight());
                                                    arrayList.add(oVarR1);
                                                }
                                                return j.Q1(jVar, iMax, iMax2, null, new Function1<o.a, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(1);
                                                    }

                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                        invoke((o.a) obj);
                                                        return Unit.a;
                                                    }

                                                    public final void invoke(o.a aVar4) {
                                                        int iR = m.r(arrayList);
                                                        if (iR < 0) {
                                                            return;
                                                        }
                                                        int i17 = 0;
                                                        while (true) {
                                                            o.a aVar5 = aVar4;
                                                            o.a.L(aVar5, arrayList.get(i17), 0, 0, 0.0f, 4, null);
                                                            if (i17 == iR) {
                                                                return;
                                                            }
                                                            i17++;
                                                            aVar4 = aVar5;
                                                        }
                                                    }
                                                }, 4, null);
                                            }
                                        };
                                        dVar3.L(objR11);
                                    }
                                    ej7 ej7Var3 = (ej7) objR11;
                                    int iHashCode3 = Long.hashCode(pp1.b(dVar3, 0));
                                    gs1 gs1VarJ3 = dVar3.j();
                                    androidx.compose.ui.b bVarE3 = ComposedModifierKt.e(dVar3, bVarA3);
                                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> function0B2 = companion5.b();
                                    if (dVar3.G() == null) {
                                        pp1.d();
                                    }
                                    dVar3.o();
                                    if (dVar3.getInserting()) {
                                        dVar3.W(function0B2);
                                    } else {
                                        dVar3.k();
                                    }
                                    androidx.compose.p004runtime.d dVarC3 = dud.c(dVar3);
                                    dud.i(dVarC3, ej7Var3, companion5.d());
                                    dud.i(dVarC3, gs1VarJ3, companion5.f());
                                    dud.i(dVarC3, Integer.valueOf(iHashCode3), companion5.c());
                                    dud.g(dVarC3, companion5.a());
                                    dud.i(dVarC3, bVarE3, companion5.e());
                                    function2B.invoke(dVar3, 0);
                                    dVar3.m();
                                    if (androidx.compose.p004runtime.e.k()) {
                                        androidx.compose.p004runtime.e.n();
                                    }
                                }
                            }, dVar2, 54), dVar2, os9.i | 48);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                        }
                    }));
                    dVarF.L(popupLayout4);
                    objR2 = popupLayout4;
                } else {
                    z2 = true;
                    str2 = str;
                    i6 = 32;
                }
                popupLayout = (PopupLayout) objR2;
                boolean zT10 = dVarF.T(popupLayout);
                int i14 = i3;
                i7 = i14 & 112;
                if (i7 == i6) {
                    z3 = z2;
                } else {
                    z3 = false;
                }
                boolean z13 = zT10 | z3;
                i8 = i14 & 896;
                if (i8 == 256) {
                    z4 = z2;
                } else {
                    z4 = false;
                }
                zX = z13 | z4 | dVarF.x(str2) | dVarF.C(layoutDirection.ordinal());
                objR3 = dVarF.R();
                if (zX) {
                    final String str9 = str2;
                    objR3 = new Function1<kd3, jd3>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1

                        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/AndroidPopup_androidKt$Popup$2$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                        public static final class a implements jd3 {
                            final /* synthetic */ PopupLayout a;

                            public a(PopupLayout popupLayout) {
                                this.a = popupLayout;
                            }

                            @Override // com.google.inputmethod.jd3
                            public void dispose() {
                                this.a.disposeComposition();
                                this.a.e();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                        public final jd3 invoke(kd3 kd3Var) throws NoWhenBranchMatchedException {
                            popupLayout.j();
                            popupLayout.l(function4, sg9Var4, str9, layoutDirection);
                            return new a(popupLayout);
                        }
                    };
                    dVarF.L(objR3);
                } else {
                    final String str10 = str2;
                    objR3 = new Function1<kd3, jd3>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1

                        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/AndroidPopup_androidKt$Popup$2$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                        public static final class a implements jd3 {
                            final /* synthetic */ PopupLayout a;

                            public a(PopupLayout popupLayout) {
                                this.a = popupLayout;
                            }

                            @Override // com.google.inputmethod.jd3
                            public void dispose() {
                                this.a.disposeComposition();
                                this.a.e();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                        public final jd3 invoke(kd3 kd3Var) throws NoWhenBranchMatchedException {
                            popupLayout.j();
                            popupLayout.l(function4, sg9Var4, str10, layoutDirection);
                            return new a(popupLayout);
                        }
                    };
                    dVarF.L(objR3);
                }
                vn3.c(popupLayout, (Function1) objR3, dVarF, 0);
                boolean zT11 = dVarF.T(popupLayout);
                if (i7 == i6) {
                    z5 = z2;
                } else {
                    z5 = false;
                }
                boolean z14 = zT11 | z5;
                if (i8 == 256) {
                    z6 = z2;
                } else {
                    z6 = false;
                }
                zX2 = z14 | z6 | dVarF.x(str2) | dVarF.C(layoutDirection.ordinal());
                objR4 = dVarF.R();
                if (zX2) {
                    final String str11 = str2;
                    objR4 = new Function0<Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                        public /* bridge */ /* synthetic */ Object invoke() throws NoWhenBranchMatchedException {
                            m76invoke();
                            return Unit.a;
                        }

                        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m76invoke() throws NoWhenBranchMatchedException {
                            popupLayout.l(function4, sg9Var4, str11, layoutDirection);
                        }
                    };
                    dVarF.L(objR4);
                } else {
                    final String str12 = str2;
                    objR4 = new Function0<Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                        public /* bridge */ /* synthetic */ Object invoke() throws NoWhenBranchMatchedException {
                            m76invoke();
                            return Unit.a;
                        }

                        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m76invoke() throws NoWhenBranchMatchedException {
                            popupLayout.l(function4, sg9Var4, str12, layoutDirection);
                        }
                    };
                    dVarF.L(objR4);
                }
                vn3.i((Function0) objR4, dVarF, 0);
                boolean zT12 = dVarF.T(popupLayout);
                i9 = i14 & 14;
                if (i9 == 4) {
                    z7 = z2;
                } else {
                    z7 = false;
                }
                z8 = zT12 | z7;
                objR5 = dVarF.R();
                if (z8) {
                    objR5 = new Function1<kd3, jd3>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1

                        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/AndroidPopup_androidKt$Popup$4$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                        public static final class a implements jd3 {
                            @Override // com.google.inputmethod.jd3
                            public void dispose() {
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final jd3 invoke(kd3 kd3Var) {
                            popupLayout.setPositionProvider(rg9Var2);
                            popupLayout.p();
                            return new a();
                        }
                    };
                    dVarF.L(objR5);
                } else {
                    objR5 = new Function1<kd3, jd3>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1

                        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/AndroidPopup_androidKt$Popup$4$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                        public static final class a implements jd3 {
                            @Override // com.google.inputmethod.jd3
                            public void dispose() {
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final jd3 invoke(kd3 kd3Var) {
                            popupLayout.setPositionProvider(rg9Var2);
                            popupLayout.p();
                            return new a();
                        }
                    };
                    dVarF.L(objR5);
                }
                vn3.c(rg9Var2, (Function1) objR5, dVarF, i9);
                zT = dVarF.T(popupLayout);
                objR6 = dVarF.R();
                if (zT) {
                    objR6 = new AndroidPopup_androidKt$Popup$5$1(popupLayout, null);
                    dVarF.L(objR6);
                } else {
                    objR6 = new AndroidPopup_androidKt$Popup$5$1(popupLayout, null);
                    dVarF.L(objR6);
                }
                vn3.g(popupLayout, (Function2) objR6, dVarF, 0);
                androidx.compose.ui.b.Companion aVar4 = androidx.compose.ui.b.INSTANCE;
                zT2 = dVarF.T(popupLayout);
                objR7 = dVarF.R();
                if (zT2) {
                    objR7 = new Function1<kn6, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                        {
                            super(1);
                        }

                        public final void a(kn6 kn6Var) {
                            kn6 kn6VarL = kn6Var.L();
                            Intrinsics.g(kn6VarL);
                            popupLayout.n(kn6VarL);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            a((kn6) obj);
                            return Unit.a;
                        }
                    };
                    dVarF.L(objR7);
                } else {
                    objR7 = new Function1<kn6, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                        {
                            super(1);
                        }

                        public final void a(kn6 kn6Var) {
                            kn6 kn6VarL = kn6Var.L();
                            Intrinsics.g(kn6VarL);
                            popupLayout.n(kn6VarL);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            a((kn6) obj);
                            return Unit.a;
                        }
                    };
                    dVarF.L(objR7);
                }
                androidx.compose.ui.b bVarA3 = xq8.a(aVar4, (Function1) objR7);
                zT3 = dVarF.T(popupLayout) | dVarF.C(layoutDirection.ordinal());
                objR8 = dVarF.R();
                if (zT3) {
                    objR8 = new ej7() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1
                        @Override // com.google.inputmethod.ej7
                        /* JADX INFO: renamed from: measure-3p2s80s */
                        public final fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, long j) {
                            popupLayout.setParentLayoutDirection(layoutDirection);
                            return j.Q1(jVar, 0, 0, null, new Function1<o.a, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1.1
                                public final void invoke(o.a aVar5) {
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((o.a) obj);
                                    return Unit.a;
                                }
                            }, 4, null);
                        }
                    };
                    dVarF.L(objR8);
                } else {
                    objR8 = new ej7() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1
                        @Override // com.google.inputmethod.ej7
                        /* JADX INFO: renamed from: measure-3p2s80s */
                        public final fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, long j) {
                            popupLayout.setParentLayoutDirection(layoutDirection);
                            return j.Q1(jVar, 0, 0, null, new Function1<o.a, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1.1
                                public final void invoke(o.a aVar5) {
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((o.a) obj);
                                    return Unit.a;
                                }
                            }, 4, null);
                        }
                    };
                    dVarF.L(objR8);
                }
                ej7 ej7Var3 = (ej7) objR8;
                int iHashCode3 = Long.hashCode(pp1.b(dVarF, 0));
                gs1 gs1VarJ3 = dVarF.j();
                androidx.compose.ui.b bVarE3 = ComposedModifierKt.e(dVarF, bVarA3);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                function0B = companion3.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                androidx.compose.p004runtime.d dVarC3 = dud.c(dVarF);
                dud.i(dVarC3, ej7Var3, companion3.d());
                dud.i(dVarC3, gs1VarJ3, companion3.f());
                dud.i(dVarC3, Integer.valueOf(iHashCode3), companion3.c());
                dud.g(dVarC3, companion3.a());
                dud.i(dVarC3, bVarE3, companion3.e());
                dVarF.m();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                function3 = function4;
                sg9Var3 = sg9Var4;
            } else {
                dVarF.q();
                function3 = function1;
                sg9Var3 = sg9Var2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(androidx.compose.p004runtime.d dVar2, int i15) {
                        AndroidPopup_androidKt.a(rg9Var2, function3, sg9Var3, function2, dVar2, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 384;
        sg9Var2 = sg9Var;
        if ((i & 3072) == 0) {
            if (dVarF.T(function2)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i3 |= i10;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (dVarF.g(z, i3 & 1)) {
            if (i11 != 0) {
                function4 = null;
            } else {
                function4 = function1;
            }
            if (i4 != 0) {
                sg9Var4 = new sg9(false, false, false, false, false, 31, null);
            } else {
                sg9Var4 = sg9Var2;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1772091631, i3, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:417)");
            }
            view = (View) dVarF.v(AndroidCompositionLocals_androidKt.g());
            f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
            str = (String) dVarF.v(a);
            layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
            fVarE = pp1.e(dVarF, 0);
            q6cVarR = p0.r(function2, dVarF, (i3 >> 9) & 14);
            Object[] objArr4 = new Object[0];
            objR = dVarF.R();
            aVar = androidx.compose.p004runtime.d.INSTANCE;
            if (objR == aVar.a()) {
                objR = new Function0<UUID>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1$1
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final UUID invoke() {
                        return UUID.randomUUID();
                    }
                };
                dVarF.L(objR);
            }
            uuid = (UUID) dfa.l(objArr4, (Function0) objR, dVarF, 48);
            zBooleanValue = ((Boolean) dVarF.v(b)).booleanValue();
            objR2 = dVarF.R();
            if (objR2 == aVar.a()) {
                str2 = str;
                i6 = 32;
                final PopupLayout popupLayout5 = new PopupLayout(function4, sg9Var4, str2, view, f43Var, rg9Var2, uuid, zBooleanValue, null, 256, null);
                rg9Var2 = rg9Var2;
                z2 = true;
                popupLayout5.i(fVarE, ko1.c(-297523940, true, new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(androidx.compose.p004runtime.d dVar2, int i15) {
                        if (!dVar2.g((i15 & 3) != 2, i15 & 1)) {
                            dVar2.q();
                            return;
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-297523940, i15, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:440)");
                        }
                        os9<Boolean> os9VarD = AndroidPopup_androidKt.i().d(Boolean.TRUE);
                        final PopupLayout popupLayout6 = popupLayout5;
                        final q6c<? extends Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit>> q6cVar = q6cVarR;
                        fs1.c(os9VarD, ko1.e(1022273628, true, new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(androidx.compose.p004runtime.d dVar3, int i16) {
                                if (!dVar3.g((i16 & 3) != 2, i16 & 1)) {
                                    dVar3.q();
                                    return;
                                }
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.o(1022273628, i16, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:441)");
                                }
                                androidx.compose.ui.b.Companion companion4 = androidx.compose.ui.b.INSTANCE;
                                Object objR9 = dVar3.R();
                                androidx.compose.p004runtime.d.Companion companion5 = androidx.compose.p004runtime.d.INSTANCE;
                                if (objR9 == companion5.a()) {
                                    objR9 = new Function1<nfb, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1
                                        public final void a(nfb nfbVar) {
                                            SemanticsPropertiesKt.P(nfbVar);
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            a((nfb) obj);
                                            return Unit.a;
                                        }
                                    };
                                    dVar3.L(objR9);
                                }
                                androidx.compose.ui.b bVarD = afb.d(companion4, false, (Function1) objR9, 1, null);
                                boolean zT13 = dVar3.T(popupLayout6);
                                final PopupLayout popupLayout7 = popupLayout6;
                                Object objR10 = dVar3.R();
                                if (zT13 || objR10 == companion5.a()) {
                                    objR10 = new Function1<q16, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$2$1
                                        {
                                            super(1);
                                        }

                                        public final void a(long j) {
                                            popupLayout7.m78setPopupContentSizefhxjrPA(q16.b(j));
                                            popupLayout7.p();
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            a(((q16) obj).getPackedValue());
                                            return Unit.a;
                                        }
                                    };
                                    dVar3.L(objR10);
                                }
                                androidx.compose.ui.b bVarA4 = ed.a(qr8.a(bVarD, (Function1) objR10), popupLayout6.getCanCalculatePosition() ? 1.0f : 0.0f);
                                Function2 function2B = AndroidPopup_androidKt.b(q6cVar);
                                Object objR11 = dVar3.R();
                                if (objR11 == companion5.a()) {
                                    objR11 = new ej7() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1
                                        @Override // com.google.inputmethod.ej7
                                        /* JADX INFO: renamed from: measure-3p2s80s */
                                        public final fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, long j) {
                                            int size = list.size();
                                            if (size == 0) {
                                                return j.Q1(jVar, 0, 0, null, new Function1<o.a, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1.1
                                                    public final void invoke(o.a aVar5) {
                                                    }

                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                        invoke((o.a) obj);
                                                        return Unit.a;
                                                    }
                                                }, 4, null);
                                            }
                                            if (size == 1) {
                                                final o oVarR0 = list.get(0).r0(j);
                                                return j.Q1(jVar, oVarR0.getWidth(), oVarR0.getHeight(), null, new Function1<o.a, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1.2
                                                    {
                                                        super(1);
                                                    }

                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                        invoke((o.a) obj);
                                                        return Unit.a;
                                                    }

                                                    public final void invoke(o.a aVar5) {
                                                        o.a.L(aVar5, oVarR0, 0, 0, 0.0f, 4, null);
                                                    }
                                                }, 4, null);
                                            }
                                            final List<? extends o> arrayList = new ArrayList(list.size());
                                            int size2 = list.size();
                                            int iMax = 0;
                                            int iMax2 = 0;
                                            for (int i17 = 0; i17 < size2; i17++) {
                                                o oVarR1 = list.get(i17).r0(j);
                                                iMax = Math.max(iMax, oVarR1.getWidth());
                                                iMax2 = Math.max(iMax2, oVarR1.getHeight());
                                                arrayList.add(oVarR1);
                                            }
                                            return j.Q1(jVar, iMax, iMax2, null, new Function1<o.a, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1.3
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(1);
                                                }

                                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                    invoke((o.a) obj);
                                                    return Unit.a;
                                                }

                                                public final void invoke(o.a aVar5) {
                                                    int iR = m.r(arrayList);
                                                    if (iR < 0) {
                                                        return;
                                                    }
                                                    int i18 = 0;
                                                    while (true) {
                                                        o.a aVar6 = aVar5;
                                                        o.a.L(aVar6, arrayList.get(i18), 0, 0, 0.0f, 4, null);
                                                        if (i18 == iR) {
                                                            return;
                                                        }
                                                        i18++;
                                                        aVar5 = aVar6;
                                                    }
                                                }
                                            }, 4, null);
                                        }
                                    };
                                    dVar3.L(objR11);
                                }
                                ej7 ej7Var4 = (ej7) objR11;
                                int iHashCode4 = Long.hashCode(pp1.b(dVar3, 0));
                                gs1 gs1VarJ4 = dVar3.j();
                                androidx.compose.ui.b bVarE4 = ComposedModifierKt.e(dVar3, bVarA4);
                                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> function0B2 = companion6.b();
                                if (dVar3.G() == null) {
                                    pp1.d();
                                }
                                dVar3.o();
                                if (dVar3.getInserting()) {
                                    dVar3.W(function0B2);
                                } else {
                                    dVar3.k();
                                }
                                androidx.compose.p004runtime.d dVarC4 = dud.c(dVar3);
                                dud.i(dVarC4, ej7Var4, companion6.d());
                                dud.i(dVarC4, gs1VarJ4, companion6.f());
                                dud.i(dVarC4, Integer.valueOf(iHashCode4), companion6.c());
                                dud.g(dVarC4, companion6.a());
                                dud.i(dVarC4, bVarE4, companion6.e());
                                function2B.invoke(dVar3, 0);
                                dVar3.m();
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.n();
                                }
                            }
                        }, dVar2, 54), dVar2, os9.i | 48);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                    }
                }));
                dVarF.L(popupLayout5);
                objR2 = popupLayout5;
            } else {
                z2 = true;
                str2 = str;
                i6 = 32;
            }
            popupLayout = (PopupLayout) objR2;
            boolean zT13 = dVarF.T(popupLayout);
            int i15 = i3;
            i7 = i15 & 112;
            if (i7 == i6) {
                z3 = z2;
            } else {
                z3 = false;
            }
            boolean z15 = zT13 | z3;
            i8 = i15 & 896;
            if (i8 == 256) {
                z4 = z2;
            } else {
                z4 = false;
            }
            zX = z15 | z4 | dVarF.x(str2) | dVarF.C(layoutDirection.ordinal());
            objR3 = dVarF.R();
            if (zX) {
                final String str13 = str2;
                objR3 = new Function1<kd3, jd3>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1

                    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/AndroidPopup_androidKt$Popup$2$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                    public static final class a implements jd3 {
                        final /* synthetic */ PopupLayout a;

                        public a(PopupLayout popupLayout) {
                            this.a = popupLayout;
                        }

                        @Override // com.google.inputmethod.jd3
                        public void dispose() {
                            this.a.disposeComposition();
                            this.a.e();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                    public final jd3 invoke(kd3 kd3Var) throws NoWhenBranchMatchedException {
                        popupLayout.j();
                        popupLayout.l(function4, sg9Var4, str13, layoutDirection);
                        return new a(popupLayout);
                    }
                };
                dVarF.L(objR3);
            } else {
                final String str14 = str2;
                objR3 = new Function1<kd3, jd3>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1

                    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/AndroidPopup_androidKt$Popup$2$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                    public static final class a implements jd3 {
                        final /* synthetic */ PopupLayout a;

                        public a(PopupLayout popupLayout) {
                            this.a = popupLayout;
                        }

                        @Override // com.google.inputmethod.jd3
                        public void dispose() {
                            this.a.disposeComposition();
                            this.a.e();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                    public final jd3 invoke(kd3 kd3Var) throws NoWhenBranchMatchedException {
                        popupLayout.j();
                        popupLayout.l(function4, sg9Var4, str14, layoutDirection);
                        return new a(popupLayout);
                    }
                };
                dVarF.L(objR3);
            }
            vn3.c(popupLayout, (Function1) objR3, dVarF, 0);
            boolean zT14 = dVarF.T(popupLayout);
            if (i7 == i6) {
                z5 = z2;
            } else {
                z5 = false;
            }
            boolean z16 = zT14 | z5;
            if (i8 == 256) {
                z6 = z2;
            } else {
                z6 = false;
            }
            zX2 = z16 | z6 | dVarF.x(str2) | dVarF.C(layoutDirection.ordinal());
            objR4 = dVarF.R();
            if (zX2) {
                final String str15 = str2;
                objR4 = new Function0<Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                    public /* bridge */ /* synthetic */ Object invoke() throws NoWhenBranchMatchedException {
                        m76invoke();
                        return Unit.a;
                    }

                    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m76invoke() throws NoWhenBranchMatchedException {
                        popupLayout.l(function4, sg9Var4, str15, layoutDirection);
                    }
                };
                dVarF.L(objR4);
            } else {
                final String str16 = str2;
                objR4 = new Function0<Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                    public /* bridge */ /* synthetic */ Object invoke() throws NoWhenBranchMatchedException {
                        m76invoke();
                        return Unit.a;
                    }

                    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m76invoke() throws NoWhenBranchMatchedException {
                        popupLayout.l(function4, sg9Var4, str16, layoutDirection);
                    }
                };
                dVarF.L(objR4);
            }
            vn3.i((Function0) objR4, dVarF, 0);
            boolean zT15 = dVarF.T(popupLayout);
            i9 = i15 & 14;
            if (i9 == 4) {
                z7 = z2;
            } else {
                z7 = false;
            }
            z8 = zT15 | z7;
            objR5 = dVarF.R();
            if (z8) {
                objR5 = new Function1<kd3, jd3>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1

                    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/AndroidPopup_androidKt$Popup$4$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                    public static final class a implements jd3 {
                        @Override // com.google.inputmethod.jd3
                        public void dispose() {
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final jd3 invoke(kd3 kd3Var) {
                        popupLayout.setPositionProvider(rg9Var2);
                        popupLayout.p();
                        return new a();
                    }
                };
                dVarF.L(objR5);
            } else {
                objR5 = new Function1<kd3, jd3>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1

                    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/AndroidPopup_androidKt$Popup$4$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                    public static final class a implements jd3 {
                        @Override // com.google.inputmethod.jd3
                        public void dispose() {
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final jd3 invoke(kd3 kd3Var) {
                        popupLayout.setPositionProvider(rg9Var2);
                        popupLayout.p();
                        return new a();
                    }
                };
                dVarF.L(objR5);
            }
            vn3.c(rg9Var2, (Function1) objR5, dVarF, i9);
            zT = dVarF.T(popupLayout);
            objR6 = dVarF.R();
            if (zT) {
                objR6 = new AndroidPopup_androidKt$Popup$5$1(popupLayout, null);
                dVarF.L(objR6);
            } else {
                objR6 = new AndroidPopup_androidKt$Popup$5$1(popupLayout, null);
                dVarF.L(objR6);
            }
            vn3.g(popupLayout, (Function2) objR6, dVarF, 0);
            androidx.compose.ui.b.Companion aVar5 = androidx.compose.ui.b.INSTANCE;
            zT2 = dVarF.T(popupLayout);
            objR7 = dVarF.R();
            if (zT2) {
                objR7 = new Function1<kn6, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                    {
                        super(1);
                    }

                    public final void a(kn6 kn6Var) {
                        kn6 kn6VarL = kn6Var.L();
                        Intrinsics.g(kn6VarL);
                        popupLayout.n(kn6VarL);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a((kn6) obj);
                        return Unit.a;
                    }
                };
                dVarF.L(objR7);
            } else {
                objR7 = new Function1<kn6, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                    {
                        super(1);
                    }

                    public final void a(kn6 kn6Var) {
                        kn6 kn6VarL = kn6Var.L();
                        Intrinsics.g(kn6VarL);
                        popupLayout.n(kn6VarL);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a((kn6) obj);
                        return Unit.a;
                    }
                };
                dVarF.L(objR7);
            }
            androidx.compose.ui.b bVarA4 = xq8.a(aVar5, (Function1) objR7);
            zT3 = dVarF.T(popupLayout) | dVarF.C(layoutDirection.ordinal());
            objR8 = dVarF.R();
            if (zT3) {
                objR8 = new ej7() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1
                    @Override // com.google.inputmethod.ej7
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, long j) {
                        popupLayout.setParentLayoutDirection(layoutDirection);
                        return j.Q1(jVar, 0, 0, null, new Function1<o.a, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1.1
                            public final void invoke(o.a aVar6) {
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((o.a) obj);
                                return Unit.a;
                            }
                        }, 4, null);
                    }
                };
                dVarF.L(objR8);
            } else {
                objR8 = new ej7() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1
                    @Override // com.google.inputmethod.ej7
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, long j) {
                        popupLayout.setParentLayoutDirection(layoutDirection);
                        return j.Q1(jVar, 0, 0, null, new Function1<o.a, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1.1
                            public final void invoke(o.a aVar6) {
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((o.a) obj);
                                return Unit.a;
                            }
                        }, 4, null);
                    }
                };
                dVarF.L(objR8);
            }
            ej7 ej7Var4 = (ej7) objR8;
            int iHashCode4 = Long.hashCode(pp1.b(dVarF, 0));
            gs1 gs1VarJ4 = dVarF.j();
            androidx.compose.ui.b bVarE4 = ComposedModifierKt.e(dVarF, bVarA4);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            function0B = companion4.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            androidx.compose.p004runtime.d dVarC4 = dud.c(dVarF);
            dud.i(dVarC4, ej7Var4, companion4.d());
            dud.i(dVarC4, gs1VarJ4, companion4.f());
            dud.i(dVarC4, Integer.valueOf(iHashCode4), companion4.c());
            dud.g(dVarC4, companion4.a());
            dud.i(dVarC4, bVarE4, companion4.e());
            dVarF.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            function3 = function4;
            sg9Var3 = sg9Var4;
        } else {
            dVarF.q();
            function3 = function1;
            sg9Var3 = sg9Var2;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(androidx.compose.p004runtime.d dVar2, int i16) {
                    AndroidPopup_androidKt.a(rg9Var2, function3, sg9Var3, function2, dVar2, saa.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Function2<androidx.compose.p004runtime.d, Integer, Unit> b(q6c<? extends Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit>> q6cVar) {
        return q6cVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(boolean z, SecureFlagPolicy secureFlagPolicy, boolean z2) {
        int i = !z ? 262152 : 262144;
        if (secureFlagPolicy == SecureFlagPolicy.SecureOn) {
            i |= 8192;
        }
        return !z2 ? i | 512 : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(sg9 sg9Var, boolean z) {
        if (sg9Var.getInheritSecurePolicy() && z) {
            return sg9Var.getFlags() | 8192;
        }
        return (!sg9Var.getInheritSecurePolicy() || z) ? sg9Var.getFlags() : sg9Var.getFlags() & (-8193);
    }

    public static final ks9<Boolean> i() {
        return b;
    }

    public static final boolean j(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k16 k(Rect rect) {
        return new k16(rect.left, rect.top, rect.right, rect.bottom);
    }
}
