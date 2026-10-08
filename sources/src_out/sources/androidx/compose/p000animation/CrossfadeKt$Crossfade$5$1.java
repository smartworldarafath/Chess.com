package androidx.compose.p000animation;

import androidx.compose.p000animation.core.Transition;
import androidx.compose.p000animation.core.TransitionKt;
import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import androidx.compose.p004runtime.snapshots.g;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.l;
import androidx.compose.ui.graphics.m;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.ps4;
import com.google.android.yg4;
import com.google.inputmethod.dud;
import com.google.inputmethod.ej7;
import com.google.inputmethod.gs1;
import com.google.inputmethod.pp1;
import com.google.inputmethod.q6c;
import com.google.inputmethod.qr;
import com.google.inputmethod.tc;
import com.google.inputmethod.tjd;
import com.google.inputmethod.w2e;
import com.google.inputmethod.xa4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(Landroidx/compose/runtime/d;I)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class CrossfadeKt$Crossfade$5$1 extends Lambda implements Function2<d, Integer, Unit> {
    final /* synthetic */ xa4<Float> $animationSpec;
    final /* synthetic */ ps4<T, d, Integer, Unit> $content;
    final /* synthetic */ T $stateForContent;
    final /* synthetic */ Transition<T> $this_Crossfade;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements Function0<T> {
        final /* synthetic */ Transition a;

        public a(Transition transition) {
            this.a = transition;
        }

        public final T invoke() {
            return (T) this.a.w();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements Function0<Transition.b<T>> {
        final /* synthetic */ Transition a;

        public b(Transition transition) {
            this.a = transition;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Transition.b<T> invoke() {
            return this.a.u();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CrossfadeKt$Crossfade$5$1(Transition<T> transition, xa4<Float> xa4Var, T t, ps4<? super T, ? super d, ? super Integer, Unit> ps4Var) {
        super(2);
        this.$this_Crossfade = transition;
        this.$animationSpec = xa4Var;
        this.$stateForContent = t;
        this.$content = ps4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(q6c<Float> q6cVar) {
        return q6cVar.getValue().floatValue();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        invoke((d) obj, ((Number) obj2).intValue());
        return Unit.a;
    }

    public final void invoke(d dVar, int i) throws Throwable {
        Object objP;
        if (!dVar.g((i & 3) != 2, i & 1)) {
            dVar.q();
            return;
        }
        if (e.k()) {
            e.o(-934471669, i, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:125)");
        }
        Transition<T> transition = this.$this_Crossfade;
        final xa4<Float> xa4Var = this.$animationSpec;
        ps4<Transition.b<T>, d, Integer, xa4<Float>> ps4Var = new ps4<Transition.b<T>, d, Integer, xa4<Float>>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$alpha$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final xa4<Float> a(Transition.b<T> bVar, d dVar2, int i2) {
                dVar2.y(955869654);
                if (e.k()) {
                    e.o(955869654, i2, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:126)");
                }
                xa4<Float> xa4Var2 = xa4Var;
                if (e.k()) {
                    e.n();
                }
                dVar2.u();
                return xa4Var2;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return a((Transition.b) obj, (d) obj2, ((Number) obj3).intValue());
            }
        };
        T t = this.$stateForContent;
        tjd<Float, qr> tjdVarN = w2e.N(yg4.a);
        if (transition.B()) {
            dVar.y(1666827533);
            dVar.u();
            objP = transition.p();
        } else {
            dVar.y(1666573488);
            boolean zX = dVar.x(transition);
            objP = dVar.R();
            if (zX || objP == d.INSTANCE.a()) {
                g.Companion companion = g.INSTANCE;
                g gVarD = companion.d();
                Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
                g gVarE = companion.e(gVarD);
                try {
                    Object objP2 = transition.p();
                    companion.l(gVarD, gVarE, function1G);
                    dVar.L(objP2);
                    objP = objP2;
                } catch (Throwable th) {
                    companion.l(gVarD, gVarE, function1G);
                    throw th;
                }
            }
            dVar.u();
        }
        dVar.y(1378811975);
        if (e.k()) {
            e.o(1378811975, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:127)");
        }
        float f = Intrinsics.e(objP, t) ? 1.0f : 0.0f;
        if (e.k()) {
            e.n();
        }
        dVar.u();
        Float fValueOf = Float.valueOf(f);
        boolean zX2 = dVar.x(transition);
        Object objR = dVar.R();
        if (zX2 || objR == d.INSTANCE.a()) {
            objR = p0.e(new a(transition));
            dVar.L(objR);
        }
        Object value = ((q6c) objR).getValue();
        dVar.y(1378811975);
        if (e.k()) {
            e.o(1378811975, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:127)");
        }
        float f2 = Intrinsics.e(value, t) ? 1.0f : 0.0f;
        if (e.k()) {
            e.n();
        }
        dVar.u();
        Float fValueOf2 = Float.valueOf(f2);
        boolean zX3 = dVar.x(transition);
        Object objR2 = dVar.R();
        if (zX3 || objR2 == d.INSTANCE.a()) {
            objR2 = p0.e(new b(transition));
            dVar.L(objR2);
        }
        final q6c q6cVarR = TransitionKt.r(transition, fValueOf, fValueOf2, (xa4) ps4Var.invoke(((q6c) objR2).getValue(), dVar, 0), tjdVarN, "FloatAnimation", dVar, 0);
        androidx.compose.ui.b.Companion companion2 = androidx.compose.ui.b.INSTANCE;
        boolean zX4 = dVar.x(q6cVarR);
        Object objR3 = dVar.R();
        if (zX4 || objR3 == d.INSTANCE.a()) {
            objR3 = new Function1<m, Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(m mVar) {
                    mVar.c(CrossfadeKt$Crossfade$5$1.b(q6cVarR));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((m) obj);
                    return Unit.a;
                }
            };
            dVar.L(objR3);
        }
        androidx.compose.ui.b bVarC = l.c(companion2, (Function1) objR3);
        ps4<T, d, Integer, Unit> ps4Var2 = this.$content;
        T t2 = this.$stateForContent;
        ej7 ej7VarI = j.i(tc.INSTANCE.o(), false);
        int iHashCode = Long.hashCode(pp1.b(dVar, 0));
        gs1 gs1VarJ = dVar.j();
        androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, bVarC);
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> function0B = companion3.b();
        if (dVar.G() == null) {
            pp1.d();
        }
        dVar.o();
        if (dVar.getInserting()) {
            dVar.W(function0B);
        } else {
            dVar.k();
        }
        d dVarC = dud.c(dVar);
        dud.i(dVarC, ej7VarI, companion3.d());
        dud.i(dVarC, gs1VarJ, companion3.f());
        dud.d(dVarC, Integer.valueOf(iHashCode), companion3.c());
        dud.g(dVarC, companion3.a());
        dud.i(dVarC, bVarE, companion3.e());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
        ps4Var2.invoke(t2, dVar, 0);
        dVar.m();
        if (e.k()) {
            e.n();
        }
    }
}
