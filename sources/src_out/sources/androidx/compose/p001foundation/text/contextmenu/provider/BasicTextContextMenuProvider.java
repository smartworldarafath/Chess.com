package androidx.compose.p001foundation.text.contextmenu.provider;

import androidx.compose.p001foundation.MutatorMutex;
import androidx.compose.p001foundation.text.contextmenu.provider.BasicTextContextMenuProvider;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.s0;
import com.google.android.h81;
import com.google.android.p81;
import com.google.android.q22;
import com.google.android.ts4;
import com.google.inputmethod.grc;
import com.google.inputmethod.kn6;
import com.google.inputmethod.mrc;
import com.google.inputmethod.o58;
import com.google.inputmethod.rrc;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001:\u0001\fB-\u0012$\u0010\b\u001a \u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012R2\u0010\b\u001a \u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R7\u0010 \u001a\b\u0018\u00010\u0018R\u00020\u00002\f\u0010\u0019\u001a\b\u0018\u00010\u0018R\u00020\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProvider;", "Lcom/google/android/mrc;", "Lkotlin/Function3;", "Lcom/google/android/rrc;", "Lcom/google/android/grc;", "Lkotlin/Function0;", "Lcom/google/android/kn6;", "", "contextMenuBlock", "<init>", "(Lcom/google/android/ts4;)V", "dataProvider", "a", "(Lcom/google/android/grc;Lcom/google/android/q22;)Ljava/lang/Object;", "anchorLayoutCoordinates", "d", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/d;I)V", "h", "()V", "Lcom/google/android/ts4;", "Landroidx/compose/foundation/MutatorMutex;", "b", "Landroidx/compose/foundation/MutatorMutex;", "mutatorMutex", "Landroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProvider$a;", "<set-?>", "c", "Lcom/google/android/o58;", "i", "()Landroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProvider$a;", "j", "(Landroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProvider$a;)V", "session", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BasicTextContextMenuProvider implements mrc {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ts4<rrc, grc, Function0<? extends kn6>, d, Integer, Unit> contextMenuBlock;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final MutatorMutex mutatorMutex = new MutatorMutex();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final o58 session = s0.e(null, null, 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProvider$a;", "Lcom/google/android/rrc;", "Lcom/google/android/grc;", "dataProvider", "<init>", "(Landroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProvider;Lcom/google/android/grc;)V", "", "close", "()V", "a", "(Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/grc;", "b", "()Lcom/google/android/grc;", "Lcom/google/android/h81;", "Lcom/google/android/h81;", "channel", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class a implements rrc {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final grc dataProvider;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final h81<Unit> channel = p81.b(0, (BufferOverflow) null, (Function1) null, 7, (Object) null);

        public a(grc grcVar) {
            this.dataProvider = grcVar;
        }

        public final Object a(q22<? super Unit> q22Var) {
            Object objC = this.channel.c(q22Var);
            return objC == kotlin.coroutines.intrinsics.a.g() ? objC : Unit.a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final grc getDataProvider() {
            return this.dataProvider;
        }

        @Override // com.google.inputmethod.rrc
        public void close() {
            this.channel.e(Unit.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BasicTextContextMenuProvider(ts4<? super rrc, ? super grc, ? super Function0<? extends kn6>, ? super d, ? super Integer, Unit> ts4Var) {
        this.contextMenuBlock = ts4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(BasicTextContextMenuProvider basicTextContextMenuProvider, Function0 function0, int i, d dVar, int i2) {
        basicTextContextMenuProvider.d(function0, dVar, saa.a(i | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(BasicTextContextMenuProvider basicTextContextMenuProvider, Function0 function0, int i, d dVar, int i2) {
        basicTextContextMenuProvider.d(function0, dVar, saa.a(i | 1));
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final a i() {
        return (a) this.session.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(a aVar) {
        this.session.setValue(aVar);
    }

    @Override // com.google.inputmethod.mrc
    public Object a(grc grcVar, q22<? super Unit> q22Var) {
        Object objE = MutatorMutex.e(this.mutatorMutex, null, new BasicTextContextMenuProvider$showTextContextMenu$2(this, new a(grcVar), null), q22Var, 1, null);
        return objE == kotlin.coroutines.intrinsics.a.g() ? objE : Unit.a;
    }

    public final void d(final Function0<? extends kn6> function0, d dVar, final int i) {
        int i2;
        final Function0<? extends kn6> function1;
        d dVarF = dVar.F(723898654);
        if ((i & 6) == 0) {
            i2 = (dVarF.T(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.x(this) ? 32 : 16;
        }
        if (dVarF.g((i2 & 19) != 18, i2 & 1)) {
            if (e.k()) {
                e.o(723898654, i2, -1, "androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider.ContextMenu (BasicTextContextMenuProvider.kt:137)");
            }
            a aVarI = i();
            if (aVarI == null) {
                if (e.k()) {
                    e.n();
                }
                s6b s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.ih0
                        public final Object invoke(Object obj, Object obj2) {
                            return BasicTextContextMenuProvider.e(this.a, function0, i, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function1 = function0;
            this.contextMenuBlock.invoke(aVarI, aVarI.getDataProvider(), function1, dVarF, Integer.valueOf((i2 << 6) & 896));
            if (e.k()) {
                e.n();
            }
        } else {
            function1 = function0;
            dVarF.q();
        }
        s6b s6bVarH2 = dVarF.H();
        if (s6bVarH2 != null) {
            s6bVarH2.a(new Function2() { // from class: com.google.android.jh0
                public final Object invoke(Object obj, Object obj2) {
                    return BasicTextContextMenuProvider.f(this.a, function1, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final void h() {
        a aVarI = i();
        if (aVarI != null) {
            aVarI.close();
        }
    }
}
