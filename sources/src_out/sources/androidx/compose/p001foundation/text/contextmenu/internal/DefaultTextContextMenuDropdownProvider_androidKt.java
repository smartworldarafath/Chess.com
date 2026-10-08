package androidx.compose.p001foundation.text.contextmenu.internal;

import android.content.Context;
import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p001foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.p001foundation.text.contextmenu.provider.BasicTextContextMenuProvider;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import androidx.compose.ui.b;
import androidx.compose.ui.draw.i;
import androidx.compose.ui.graphics.h;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import com.google.android.ps4;
import com.google.inputmethod.TextContextMenuData;
import com.google.inputmethod.TextContextMenuItem;
import com.google.inputmethod.TextContextMenuRemoteActionItem;
import com.google.inputmethod.a22;
import com.google.inputmethod.d02;
import com.google.inputmethod.dp1;
import com.google.inputmethod.ei1;
import com.google.inputmethod.erc;
import com.google.inputmethod.g16;
import com.google.inputmethod.grc;
import com.google.inputmethod.h16;
import com.google.inputmethod.j12;
import com.google.inputmethod.kn6;
import com.google.inputmethod.ko1;
import com.google.inputmethod.n12;
import com.google.inputmethod.o12;
import com.google.inputmethod.ph0;
import com.google.inputmethod.prc;
import com.google.inputmethod.q6c;
import com.google.inputmethod.qrc;
import com.google.inputmethod.rrc;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.sg9;
import com.google.inputmethod.v09;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u001a\u001a\u00020\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 ²\u0006\f\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/b;", "modifier", "Lkotlin/Function0;", "", "content", "z", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "Landroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProvider;", "D", "(Landroidx/compose/runtime/d;I)Landroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProvider;", "Lcom/google/android/rrc;", "session", "Lcom/google/android/grc;", "dataProvider", "Lcom/google/android/kn6;", "anchorLayoutCoordinates", "t", "(Lcom/google/android/rrc;Lcom/google/android/grc;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/d;I)V", "Lcom/google/android/frc;", "data", "l", "(Lcom/google/android/rrc;Lcom/google/android/frc;Landroidx/compose/runtime/d;I)V", "", "resId", "Lcom/google/android/ei1;", "tint", "q", "(IJLandroidx/compose/runtime/d;I)V", "Lcom/google/android/sg9;", "a", "Lcom/google/android/sg9;", "DefaultPopupProperties", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class DefaultTextContextMenuDropdownProvider_androidKt {
    private static final sg9 a = new sg9(true, false, false, false, false, 30, null);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements ps4<ei1, d, Integer, Unit> {
        final /* synthetic */ erc a;

        a(erc ercVar) {
            this.a = ercVar;
        }

        public final void a(long j, d dVar, int i) {
            if ((i & 6) == 0) {
                i |= dVar.D(j) ? 4 : 2;
            }
            if (!dVar.g((i & 19) != 18, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(-1930700965, i, -1, "androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdown.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:150)");
            }
            DefaultTextContextMenuDropdownProvider_androidKt.q(((TextContextMenuItem) this.a).getLeadingIcon(), j, dVar, (i << 3) & 112);
            if (e.k()) {
                e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a(((ei1) obj).getValue(), (d) obj2, ((Number) obj3).intValue());
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(b bVar, Function2 function2, int i, d dVar, int i2) {
        z(bVar, function2, dVar, saa.a(i | 1));
        return Unit.a;
    }

    public static final BasicTextContextMenuProvider D(d dVar, int i) {
        if (e.k()) {
            e.o(1197778906, i, -1, "androidx.compose.foundation.text.contextmenu.internal.defaultTextContextMenuDropdown (DefaultTextContextMenuDropdownProvider.android.kt:98)");
        }
        BasicTextContextMenuProvider basicTextContextMenuProviderM = ph0.m(dp1.a.d(), dVar, 6);
        if (e.k()) {
            e.n();
        }
        return basicTextContextMenuProviderM;
    }

    private static final void l(final rrc rrcVar, final TextContextMenuData textContextMenuData, d dVar, final int i) {
        int i2;
        d dVarF = dVar.F(1904307118);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? dVarF.x(rrcVar) : dVarF.T(rrcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.T(textContextMenuData) ? 32 : 16;
        }
        boolean z = false;
        if (dVarF.g((i2 & 19) != 18, i2 & 1)) {
            if (e.k()) {
                e.o(1904307118, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdown (DefaultTextContextMenuDropdownProvider.android.kt:133)");
            }
            dVarF.y(-1009482584);
            final Context context = (Context) dVarF.v(AndroidCompositionLocals_androidKt.c());
            dVarF.u();
            boolean zT = dVarF.T(textContextMenuData);
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && dVarF.T(rrcVar))) {
                z = true;
            }
            boolean zT2 = zT | z | dVarF.T(context);
            Object objR = dVarF.R();
            if (zT2 || objR == d.INSTANCE.a()) {
                objR = new Function1() { // from class: com.google.android.o03
                    public final Object invoke(Object obj) {
                        return DefaultTextContextMenuDropdownProvider_androidKt.m(textContextMenuData, context, rrcVar, (n12) obj);
                    }
                };
                dVarF.L(objR);
            }
            a22.k(null, null, (Function1) objR, dVarF, 0, 3);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.p03
                public final Object invoke(Object obj, Object obj2) {
                    return DefaultTextContextMenuDropdownProvider_androidKt.p(rrcVar, textContextMenuData, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(TextContextMenuData textContextMenuData, Context context, final rrc rrcVar, n12 n12Var) {
        n12 n12Var2;
        List<erc> listB = textContextMenuData.b();
        int size = listB.size();
        int i = 0;
        while (i < size) {
            final erc ercVar = listB.get(i);
            if (ercVar instanceof TextContextMenuItem) {
                n12Var2 = n12Var;
                n12.g(n12Var2, new Function2() { // from class: com.google.android.q03
                    public final Object invoke(Object obj, Object obj2) {
                        return DefaultTextContextMenuDropdownProvider_androidKt.n(ercVar, (d) obj, ((Integer) obj2).intValue());
                    }
                }, null, false, ((TextContextMenuItem) ercVar).getLeadingIcon() == 0 ? null : ko1.c(-1930700965, true, new a(ercVar)), new Function0() { // from class: com.google.android.r03
                    public final Object invoke() {
                        return DefaultTextContextMenuDropdownProvider_androidKt.o(ercVar, rrcVar);
                    }
                }, 6, null);
            } else {
                n12Var2 = n12Var;
                if (ercVar instanceof TextContextMenuRemoteActionItem) {
                    n.a.q(n12Var2, context, (TextContextMenuRemoteActionItem) ercVar);
                } else if (ercVar instanceof qrc) {
                    n12Var2.i();
                }
            }
            i++;
            n12Var = n12Var2;
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String n(erc ercVar, d dVar, int i) {
        dVar.y(666084174);
        if (e.k()) {
            e.o(666084174, i, -1, "androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdown.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:145)");
        }
        String label = ((TextContextMenuItem) ercVar).getLabel();
        if (e.k()) {
            e.n();
        }
        dVar.u();
        return label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(erc ercVar, rrc rrcVar) {
        ((TextContextMenuItem) ercVar).d().invoke(rrcVar);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(rrc rrcVar, TextContextMenuData textContextMenuData, int i, d dVar, int i2) {
        l(rrcVar, textContextMenuData, dVar, saa.a(i | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(final int i, final long j, d dVar, final int i2) {
        int i3;
        s6b s6bVarH;
        Function2<? super d, ? super Integer, Unit> function2;
        d dVarF = dVar.F(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = (dVarF.C(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dVarF.D(j) ? 32 : 16;
        }
        if (dVarF.g((i3 & 19) != 18, i3 & 1)) {
            if (e.k()) {
                e.o(-1240244237, i3, -1, "androidx.compose.foundation.text.contextmenu.internal.IconBox (DefaultTextContextMenuDropdownProvider.android.kt:166)");
            }
            Context context = (Context) dVarF.v(AndroidCompositionLocals_androidKt.c());
            boolean zX = ((i3 & 14) == 4) | dVarF.x(context);
            Object objR = dVarF.R();
            if (zX || objR == d.INSTANCE.a()) {
                objR = Integer.valueOf(context.obtainStyledAttributes(new int[]{i}).getResourceId(0, -1));
                dVarF.L(objR);
            }
            int iIntValue = ((Number) objR).intValue();
            if (iIntValue == -1) {
                if (e.k()) {
                    e.n();
                }
                s6bVarH = dVarF.H();
                if (s6bVarH == null) {
                    return;
                } else {
                    function2 = new Function2() { // from class: com.google.android.s03
                        public final Object invoke(Object obj, Object obj2) {
                            return DefaultTextContextMenuDropdownProvider_androidKt.r(i, j, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    };
                }
            } else {
                Painter painterC = v09.c(iIntValue, dVarF, 0);
                boolean z = (i3 & 112) == 32;
                Object objR2 = dVarF.R();
                if (z || objR2 == d.INSTANCE.a()) {
                    objR2 = j == 16 ? null : h.Companion.c(h.INSTANCE, j, 0, 2, null);
                    dVarF.L(objR2);
                }
                j.b(i.b(SizeKt.t(b.INSTANCE, o12.a.g()), painterC, false, null, d02.INSTANCE.e(), 0.0f, (h) objR2, 22, null), dVarF, 0);
                if (e.k()) {
                    e.n();
                }
            }
            s6bVarH.a(function2);
        }
        dVarF.q();
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            function2 = new Function2() { // from class: com.google.android.t03
                public final Object invoke(Object obj, Object obj2) {
                    return DefaultTextContextMenuDropdownProvider_androidKt.s(i, j, i2, (d) obj, ((Integer) obj2).intValue());
                }
            };
            s6bVarH.a(function2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(int i, long j, int i2, d dVar, int i3) {
        q(i, j, dVar, saa.a(i2 | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(int i, long j, int i2, d dVar, int i3) {
        q(i, j, dVar, saa.a(i2 | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(final rrc rrcVar, final grc grcVar, final Function0<? extends kn6> function0, d dVar, final int i) {
        int i2;
        d dVarF = dVar.F(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? dVarF.x(rrcVar) : dVarF.T(rrcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? dVarF.x(grcVar) : dVarF.T(grcVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dVarF.T(function0) ? 256 : 128;
        }
        boolean z = false;
        if (dVarF.g((i2 & 147) != 146, i2 & 1)) {
            if (e.k()) {
                e.o(-2040393164, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.OpenContextMenu (DefaultTextContextMenuDropdownProvider.android.kt:109)");
            }
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && dVarF.x(grcVar));
            Object objR = dVarF.R();
            if (z2 || objR == d.INSTANCE.a()) {
                objR = new e(new j12(new Function0() { // from class: com.google.android.j03
                    public final Object invoke() {
                        return DefaultTextContextMenuDropdownProvider_androidKt.u(grcVar, function0);
                    }
                }, (Function2) null, 2, (DefaultConstructorMarker) null));
                dVarF.L(objR);
            }
            e eVar = (e) objR;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && dVarF.T(rrcVar))) {
                z = true;
            }
            Object objR2 = dVarF.R();
            if (z || objR2 == d.INSTANCE.a()) {
                objR2 = new Function0() { // from class: com.google.android.l03
                    public final Object invoke() {
                        return DefaultTextContextMenuDropdownProvider_androidKt.v(rrcVar);
                    }
                };
                dVarF.L(objR2);
            }
            AndroidPopup_androidKt.a(eVar, (Function0) objR2, a, ko1.e(1315155414, true, new Function2() { // from class: com.google.android.m03
                public final Object invoke(Object obj, Object obj2) {
                    return DefaultTextContextMenuDropdownProvider_androidKt.w(grcVar, rrcVar, (d) obj, ((Integer) obj2).intValue());
                }
            }, dVarF, 54), dVarF, 3456, 0);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.n03
                public final Object invoke(Object obj, Object obj2) {
                    return DefaultTextContextMenuDropdownProvider_androidKt.y(rrcVar, grcVar, function0, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g16 u(grc grcVar, Function0 function0) {
        return g16.c(h16.d(grcVar.l2((kn6) function0.invoke())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(rrc rrcVar) {
        rrcVar.close();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(grc grcVar, rrc rrcVar, d dVar, int i) {
        if (dVar.g((i & 3) != 2, i & 1)) {
            if (e.k()) {
                e.o(1315155414, i, -1, "androidx.compose.foundation.text.contextmenu.internal.OpenContextMenu.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:124)");
            }
            boolean zX = dVar.x(grcVar);
            Object objR = dVar.R();
            if (zX || objR == d.INSTANCE.a()) {
                objR = p0.e(new DefaultTextContextMenuDropdownProvider_androidKt$OpenContextMenu$2$data$2$1(grcVar));
                dVar.L(objR);
            }
            l(rrcVar, x((q6c) objR), dVar, 0);
            if (e.k()) {
                e.n();
            }
        } else {
            dVar.q();
        }
        return Unit.a;
    }

    private static final TextContextMenuData x(q6c<TextContextMenuData> q6cVar) {
        return q6cVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(rrc rrcVar, grc grcVar, Function0 function0, int i, d dVar, int i2) {
        t(rrcVar, grcVar, function0, dVar, saa.a(i | 1));
        return Unit.a;
    }

    public static final void z(b bVar, Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i) {
        int i2;
        final b bVar2;
        final Function2<? super d, ? super Integer, Unit> function3;
        d dVarF = dVar.F(1392105195);
        if ((i & 6) == 0) {
            i2 = (dVarF.x(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.T(function2) ? 32 : 16;
        }
        if (dVarF.g((i2 & 19) != 18, i2 & 1)) {
            if (e.k()) {
                e.o(1392105195, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvideDefaultTextContextMenuDropdown (DefaultTextContextMenuDropdownProvider.android.kt:85)");
            }
            bVar2 = bVar;
            function3 = function2;
            ph0.f(bVar2, prc.e(), dp1.a.e(), function3, dVarF, (i2 & 14) | 432 | ((i2 << 6) & 7168));
            if (e.k()) {
                e.n();
            }
        } else {
            bVar2 = bVar;
            function3 = function2;
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.k03
                public final Object invoke(Object obj, Object obj2) {
                    return DefaultTextContextMenuDropdownProvider_androidKt.A(bVar2, function3, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
