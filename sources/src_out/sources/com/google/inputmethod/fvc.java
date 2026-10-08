package com.google.inputmethod;

import androidx.compose.p001foundation.text.Handle;
import androidx.compose.p001foundation.text.LongPressTextDragObserverKt;
import androidx.compose.p001foundation.text.TextContextMenuItems;
import androidx.compose.p001foundation.text.o;
import androidx.compose.p001foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p001foundation.text.selection.m;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.x;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0015*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"", "isStartHandle", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "direction", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "", "h", "(ZLandroidx/compose/ui/text/style/ResolvedTextDirection;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/d;I)V", "s", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Z)Z", "Lcom/google/android/q16;", "magnifierSize", "Lcom/google/android/rn8;", "j", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;J)J", "Lcom/google/android/p12;", "contextMenuState", "Lcom/google/android/q6c;", "Landroidx/compose/foundation/text/o;", "itemsAvailability", "Lkotlin/Function1;", "Lcom/google/android/n12;", "k", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lcom/google/android/p12;Lcom/google/android/q6c;)Lkotlin/jvm/functions/Function1;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class fvc {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements co8 {
        final /* synthetic */ TextFieldSelectionManager a;
        final /* synthetic */ boolean b;

        a(TextFieldSelectionManager textFieldSelectionManager, boolean z) {
            this.a = textFieldSelectionManager;
            this.b = z;
        }

        @Override // com.google.inputmethod.co8
        public final long a() {
            return this.a.b0(this.b);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements PointerInputEventHandler {
        final /* synthetic */ gsc a;

        b(gsc gscVar) {
            this.a = gscVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(df9 df9Var, q22<? super Unit> q22Var) {
            Object objG = LongPressTextDragObserverKt.g(df9Var, this.a, q22Var);
            return objG == kotlin.coroutines.intrinsics.a.g() ? objG : Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void h(final boolean z, final ResolvedTextDirection resolvedTextDirection, final TextFieldSelectionManager textFieldSelectionManager, d dVar, final int i) {
        int i2;
        d dVarF = dVar.F(-1344558920);
        if ((i & 6) == 0) {
            i2 = (dVarF.A(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.C(resolvedTextDirection.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dVarF.T(textFieldSelectionManager) ? 256 : 128;
        }
        if (dVarF.g((i2 & 147) != 146, i2 & 1)) {
            if (e.k()) {
                e.o(-1344558920, i2, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:1365)");
            }
            int i3 = i2 & 14;
            boolean zX = (i3 == 4) | dVarF.x(textFieldSelectionManager);
            Object objR = dVarF.R();
            if (zX || objR == d.INSTANCE.a()) {
                objR = textFieldSelectionManager.q0(z);
                dVarF.L(objR);
            }
            gsc gscVar = (gsc) objR;
            boolean zT = dVarF.T(textFieldSelectionManager) | (i3 == 4);
            Object objR2 = dVarF.R();
            if (zT || objR2 == d.INSTANCE.a()) {
                objR2 = new a(textFieldSelectionManager, z);
                dVarF.L(objR2);
            }
            co8 co8Var = (co8) objR2;
            boolean zM = x.m(textFieldSelectionManager.p0().getSelection());
            float fA0 = textFieldSelectionManager.a0(z);
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            boolean zT2 = dVarF.T(gscVar);
            Object objR3 = dVarF.R();
            if (zT2 || objR3 == d.INSTANCE.a()) {
                objR3 = new b(gscVar);
                dVarF.L(objR3);
            }
            pn.n(co8Var, z, resolvedTextDirection, zM, 0L, fA0, ugc.c(companion, gscVar, (PointerInputEventHandler) objR3), dVarF, (i2 << 3) & 1008, 16);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.zuc
                public final Object invoke(Object obj, Object obj2) {
                    return fvc.i(z, resolvedTextDirection, textFieldSelectionManager, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(boolean z, ResolvedTextDirection resolvedTextDirection, TextFieldSelectionManager textFieldSelectionManager, int i, d dVar, int i2) {
        h(z, resolvedTextDirection, textFieldSelectionManager, dVar, saa.a(i | 1));
        return Unit.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final long j(TextFieldSelectionManager textFieldSelectionManager, long j) throws NoWhenBranchMatchedException {
        int iN;
        wxc wxcVarN;
        asc textDelegate;
        androidx.compose.ui.text.b text;
        rn8 rn8VarU = textFieldSelectionManager.U();
        if (rn8VarU == null) {
            return rn8.INSTANCE.b();
        }
        long packedValue = rn8VarU.getPackedValue();
        androidx.compose.ui.text.b bVarO0 = textFieldSelectionManager.o0();
        if (bVarO0 == null || bVarO0.length() == 0) {
            return rn8.INSTANCE.b();
        }
        Handle handleW = textFieldSelectionManager.W();
        int i = handleW == null ? -1 : c.$EnumSwitchMapping$0[handleW.ordinal()];
        if (i == -1) {
            return rn8.INSTANCE.b();
        }
        if (i == 1 || i == 2) {
            iN = x.n(textFieldSelectionManager.p0().getSelection());
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iN = x.i(textFieldSelectionManager.p0().getSelection());
        }
        k07 state = textFieldSelectionManager.getState();
        if (state == null || (wxcVarN = state.n()) == null) {
            return rn8.INSTANCE.b();
        }
        k07 state2 = textFieldSelectionManager.getState();
        if (state2 == null || (textDelegate = state2.getTextDelegate()) == null || (text = textDelegate.getText()) == null) {
            return rn8.INSTANCE.b();
        }
        int iO = g.o(textFieldSelectionManager.getOffsetMapping().b(iN), 0, text.length());
        float fIntBitsToFloat = Float.intBitsToFloat((int) (wxcVarN.j(packedValue) >> 32));
        TextLayoutResult value = wxcVarN.getValue();
        int iQ = value.q(iO);
        float fS = value.s(iQ);
        float fT = value.t(iQ);
        float fN = g.n(fIntBitsToFloat, Math.min(fS, fT), Math.max(fS, fT));
        if (!q16.f(j, q16.INSTANCE.a()) && Math.abs(fIntBitsToFloat - fN) > ((int) (j >> 32)) / 2) {
            return rn8.INSTANCE.b();
        }
        float fV = value.v(iQ);
        return rn8.e((((long) Float.floatToRawIntBits(fN)) << 32) | (((long) Float.floatToRawIntBits(((value.m(iQ) - fV) / 2) + fV)) & 4294967295L));
    }

    public static final Function1<n12, Unit> k(final TextFieldSelectionManager textFieldSelectionManager, final ContextMenuState contextMenuState, final q6c<o> q6cVar) {
        return new Function1() { // from class: com.google.android.yuc
            public final Object invoke(Object obj) {
                return fvc.l(q6cVar, textFieldSelectionManager, contextMenuState, (n12) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(q6c q6cVar, final TextFieldSelectionManager textFieldSelectionManager, ContextMenuState contextMenuState, n12 n12Var) {
        int value = ((o) q6cVar.getValue()).getValue();
        r(n12Var, contextMenuState, TextContextMenuItems.a, o.h(value), new Function0() { // from class: com.google.android.avc
            public final Object invoke() {
                return fvc.m(textFieldSelectionManager);
            }
        });
        r(n12Var, contextMenuState, TextContextMenuItems.b, o.g(value), new Function0() { // from class: com.google.android.bvc
            public final Object invoke() {
                return fvc.n(textFieldSelectionManager);
            }
        });
        r(n12Var, contextMenuState, TextContextMenuItems.c, o.i(value), new Function0() { // from class: com.google.android.cvc
            public final Object invoke() {
                return fvc.o(textFieldSelectionManager);
            }
        });
        r(n12Var, contextMenuState, TextContextMenuItems.d, o.j(value), new Function0() { // from class: com.google.android.dvc
            public final Object invoke() {
                return fvc.p(textFieldSelectionManager);
            }
        });
        if (gc9.a()) {
            r(n12Var, contextMenuState, TextContextMenuItems.e, o.f(value), new Function0() { // from class: com.google.android.evc
                public final Object invoke() {
                    return fvc.q(textFieldSelectionManager);
                }
            });
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(TextFieldSelectionManager textFieldSelectionManager) {
        textFieldSelectionManager.I();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(TextFieldSelectionManager textFieldSelectionManager) {
        textFieldSelectionManager.C(false);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(TextFieldSelectionManager textFieldSelectionManager) {
        textFieldSelectionManager.w0();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(TextFieldSelectionManager textFieldSelectionManager) {
        textFieldSelectionManager.y0();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(TextFieldSelectionManager textFieldSelectionManager) {
        textFieldSelectionManager.v();
        return Unit.a;
    }

    private static final void r(n12 n12Var, ContextMenuState contextMenuState, TextContextMenuItems textContextMenuItems, boolean z, Function0<Unit> function0) {
        if (z) {
            n12.g(n12Var, new kk1(textContextMenuItems), null, false, null, new lk1(function0, contextMenuState), 14, null);
        }
    }

    public static final boolean s(TextFieldSelectionManager textFieldSelectionManager, boolean z) {
        kn6 kn6VarM;
        gba gbaVarB;
        k07 state = textFieldSelectionManager.getState();
        if (state == null || (kn6VarM = state.m()) == null || (gbaVarB = m.b(kn6VarM)) == null) {
            return false;
        }
        return m.a(gbaVarB, textFieldSelectionManager.b0(z));
    }
}
