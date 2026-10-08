package androidx.compose.p001foundation.text.contextmenu.internal;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.view.textclassifier.TextClassification;
import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.draw.c;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.ps4;
import com.google.inputmethod.TextContextMenuRemoteActionItem;
import com.google.inputmethod.ei1;
import com.google.inputmethod.ko1;
import com.google.inputmethod.n12;
import com.google.inputmethod.o12;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.w41;
import com.google.inputmethod.xi;
import com.google.inputmethod.yqc;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u00020\u0006*\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/internal/n;", "", "<init>", "()V", "Landroid/graphics/drawable/Icon;", "icon", "", "j", "(Landroid/graphics/drawable/Icon;Landroidx/compose/runtime/d;I)V", "Landroid/graphics/drawable/Drawable;", "drawable", "i", "(Landroid/graphics/drawable/Drawable;Landroidx/compose/runtime/d;I)V", "Lcom/google/android/n12;", "Landroid/content/Context;", "context", "Lcom/google/android/src;", "component", "q", "(Lcom/google/android/n12;Landroid/content/Context;Lcom/google/android/src;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class n {
    public static final n a = new n();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements ps4<ei1, d, Integer, Unit> {
        final /* synthetic */ Drawable a;

        a(Drawable drawable) {
            this.a = drawable;
        }

        public final void a(long j, d dVar, int i) {
            if (!dVar.g((i & 17) != 16, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(-1123224187, i, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous>.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:247)");
            }
            n.a.i(this.a, dVar, 48);
            if (e.k()) {
                e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a(((ei1) obj).getValue(), (d) obj2, ((Number) obj3).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements ps4<ei1, d, Integer, Unit> {
        final /* synthetic */ RemoteAction a;

        b(RemoteAction remoteAction) {
            this.a = remoteAction;
        }

        public final void a(long j, d dVar, int i) {
            if (!dVar.g((i & 17) != 16, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(-1261173016, i, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:257)");
            }
            n.a.j(this.a.getIcon(), dVar, 48);
            if (e.k()) {
                e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a(((ei1) obj).getValue(), (d) obj2, ((Number) obj3).intValue());
            return Unit.a;
        }
    }

    private n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(final Drawable drawable, d dVar, final int i) {
        int i2;
        d dVarF = dVar.F(257732500);
        if ((i & 6) == 0) {
            i2 = (dVarF.T(drawable) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (dVarF.g((i2 & 3) != 2, i2 & 1)) {
            if (e.k()) {
                e.o(257732500, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.IconBox (DefaultTextContextMenuDropdownProvider.android.kt:274)");
            }
            androidx.compose.ui.b bVarT = SizeKt.t(androidx.compose.ui.b.INSTANCE, o12.a.g());
            boolean zT = dVarF.T(drawable);
            Object objR = dVarF.R();
            if (zT || objR == d.INSTANCE.a()) {
                objR = new Function1() { // from class: androidx.compose.foundation.text.contextmenu.internal.l
                    public final Object invoke(Object obj) {
                        return n.m(drawable, (DrawScope) obj);
                    }
                };
                dVarF.L(objR);
            }
            j.b(c.b(bVarT, (Function1) objR), dVarF, 0);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.m
                public final Object invoke(Object obj, Object obj2) {
                    return n.n(this.a, drawable, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(final Icon icon, d dVar, final int i) {
        int i2;
        s6b s6bVarH;
        Function2<? super d, ? super Integer, Unit> function2;
        d dVarF = dVar.F(2116504409);
        if ((i & 6) == 0) {
            i2 = (dVarF.T(icon) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.x(this) ? 32 : 16;
        }
        if (dVarF.g((i2 & 19) != 18, i2 & 1)) {
            if (e.k()) {
                e.o(2116504409, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.IconBox (DefaultTextContextMenuDropdownProvider.android.kt:267)");
            }
            Context context = (Context) dVarF.v(AndroidCompositionLocals_androidKt.c());
            boolean zX = dVarF.x(icon) | dVarF.x(context);
            Object objR = dVarF.R();
            if (zX || objR == d.INSTANCE.a()) {
                objR = icon.loadDrawable(context);
                dVarF.L(objR);
            }
            Drawable drawable = (Drawable) objR;
            if (drawable == null) {
                if (e.k()) {
                    e.n();
                }
                s6bVarH = dVarF.H();
                if (s6bVarH == null) {
                    return;
                } else {
                    function2 = new Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.j
                        public final Object invoke(Object obj, Object obj2) {
                            return n.k(this.a, icon, i, (d) obj, ((Integer) obj2).intValue());
                        }
                    };
                }
            } else {
                i(drawable, dVarF, i2 & 112);
                if (e.k()) {
                    e.n();
                }
            }
            s6bVarH.a(function2);
        }
        dVarF.q();
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            function2 = new Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.k
                public final Object invoke(Object obj, Object obj2) {
                    return n.l(this.a, icon, i, (d) obj, ((Integer) obj2).intValue());
                }
            };
            s6bVarH.a(function2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(n nVar, Icon icon, int i, d dVar, int i2) {
        nVar.j(icon, dVar, saa.a(i | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(n nVar, Icon icon, int i, d dVar, int i2) {
        nVar.j(icon, dVar, saa.a(i | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(Drawable drawable, DrawScope drawScope) {
        w41 w41VarB = drawScope.getDrawContext().b();
        drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (drawScope.d() >> 32)), (int) Float.intBitsToFloat((int) (drawScope.d() & 4294967295L)));
        drawable.draw(xi.d(w41VarB));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(n nVar, Drawable drawable, int i, d dVar, int i2) {
        nVar.i(drawable, dVar, saa.a(i | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String r(TextClassification textClassification, d dVar, int i) {
        dVar.y(950061013);
        if (e.k()) {
            e.o(950061013, i, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:246)");
        }
        String strValueOf = String.valueOf(textClassification.getLabel());
        if (e.k()) {
            e.n();
        }
        dVar.u();
        return strValueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(Context context, TextClassification textClassification) throws PendingIntent.CanceledException {
        yqc.a.a(context, textClassification);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String t(RemoteAction remoteAction, d dVar, int i) {
        dVar.y(-1376593684);
        if (e.k()) {
            e.o(-1376593684, i, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:254)");
        }
        String string = remoteAction.getTitle().toString();
        if (e.k()) {
            e.n();
        }
        dVar.u();
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(RemoteAction remoteAction) throws PendingIntent.CanceledException {
        yqc.a.b(remoteAction.getActionIntent());
        return Unit.a;
    }

    public final void q(n12 n12Var, final Context context, TextContextMenuRemoteActionItem textContextMenuRemoteActionItem) {
        if (context == null) {
            return;
        }
        int index = textContextMenuRemoteActionItem.getIndex();
        final TextClassification textClassification = textContextMenuRemoteActionItem.getTextClassification();
        if (index < 0) {
            Function2 function2 = new Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.f
                public final Object invoke(Object obj, Object obj2) {
                    return n.r(textClassification, (d) obj, ((Integer) obj2).intValue());
                }
            };
            Drawable icon = textClassification.getIcon();
            n12.g(n12Var, function2, null, false, icon != null ? ko1.c(-1123224187, true, new a(icon)) : null, new Function0() { // from class: androidx.compose.foundation.text.contextmenu.internal.g
                public final Object invoke() {
                    return n.s(context, textClassification);
                }
            }, 6, null);
        } else {
            final RemoteAction remoteAction = textClassification.getActions().get(index);
            n12.g(n12Var, new Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.h
                public final Object invoke(Object obj, Object obj2) {
                    return n.t(remoteAction, (d) obj, ((Integer) obj2).intValue());
                }
            }, null, false, ((index == 0) || remoteAction.shouldShowIcon()) ? ko1.c(-1261173016, true, new b(remoteAction)) : null, new Function0() { // from class: androidx.compose.foundation.text.contextmenu.internal.i
                public final Object invoke() {
                    return n.u(remoteAction);
                }
            }, 6, null);
        }
    }
}
