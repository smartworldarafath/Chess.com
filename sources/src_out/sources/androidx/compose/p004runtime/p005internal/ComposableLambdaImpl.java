package androidx.compose.p004runtime.p005internal;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.p005internal.ComposableLambdaImpl;
import com.google.android.ps4;
import com.google.android.rs4;
import com.google.android.ts4;
import com.google.android.vs4;
import com.google.android.xs4;
import com.google.android.zs4;
import com.google.inputmethod.do1;
import com.google.inputmethod.ko1;
import com.google.inputmethod.qaa;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J6\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ@\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJJ\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010 \u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b!\u0010\"JT\u0010$\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010 \u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b$\u0010%J^\u0010'\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010 \u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010&\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001e\u00108\u001a\n\u0012\u0004\u0012\u000201\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Landroidx/compose/runtime/internal/ComposableLambdaImpl;", "Lcom/google/android/do1;", "", "key", "", "tracked", "", "block", "<init>", "(IZLjava/lang/Object;)V", "", "C", "()V", "Landroidx/compose/runtime/d;", "composer", "B", "(Landroidx/compose/runtime/d;)V", "D", "(Ljava/lang/Object;)V", "c", "changed", "j", "(Landroidx/compose/runtime/d;I)Ljava/lang/Object;", "p1", "k", "(Ljava/lang/Object;Landroidx/compose/runtime/d;I)Ljava/lang/Object;", "p2", "l", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/d;I)Ljava/lang/Object;", "p3", "m", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/d;I)Ljava/lang/Object;", "p4", "o", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/d;I)Ljava/lang/Object;", "p5", "p", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/d;I)Ljava/lang/Object;", "p6", "r", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/d;I)Ljava/lang/Object;", "a", "I", "getKey", "()I", "b", "Z", "Ljava/lang/Object;", "_block", "Lcom/google/android/qaa;", "d", "Lcom/google/android/qaa;", "scope", "", "e", "Ljava/util/List;", "scopes", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ComposableLambdaImpl implements do1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int key;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean tracked;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Object _block;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private qaa scope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private List<qaa> scopes;

    /* JADX INFO: renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<d, Integer, Unit> {
        AnonymousClass1(Object obj) {
            super(2, obj, ComposableLambdaImpl.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        }

        public final void a(d dVar, int i) {
            ((ComposableLambdaImpl) ((AdaptedFunctionReference) this).receiver).j(dVar, i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    public ComposableLambdaImpl(int i, boolean z, Object obj) {
        this.key = i;
        this.tracked = z;
        this._block = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, d dVar, int i2) {
        composableLambdaImpl.r(obj, obj2, obj3, obj4, obj5, obj6, dVar, saa.a(i) | 1);
        return Unit.a;
    }

    private final void B(d composer) {
        qaa qaaVarO;
        if (!this.tracked || (qaaVarO = composer.O()) == null) {
            return;
        }
        composer.z(qaaVarO);
        if (ko1.f(this.scope, qaaVarO)) {
            this.scope = qaaVarO;
            return;
        }
        List<qaa> list = this.scopes;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.scopes = arrayList;
            arrayList.add(qaaVarO);
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (ko1.f(list.get(i), qaaVarO)) {
                list.set(i, qaaVarO);
                return;
            }
        }
        list.add(qaaVarO);
    }

    private final void C() {
        if (this.tracked) {
            qaa qaaVar = this.scope;
            if (qaaVar != null) {
                qaaVar.invalidate();
                this.scope = null;
            }
            List<qaa> list = this.scopes;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).invalidate();
                }
                list.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(ComposableLambdaImpl composableLambdaImpl, Object obj, int i, d dVar, int i2) {
        composableLambdaImpl.k(obj, dVar, saa.a(i) | 1);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, int i, d dVar, int i2) {
        composableLambdaImpl.l(obj, obj2, dVar, saa.a(i) | 1);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, int i, d dVar, int i2) {
        composableLambdaImpl.m(obj, obj2, obj3, dVar, saa.a(i) | 1);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, int i, d dVar, int i2) {
        composableLambdaImpl.o(obj, obj2, obj3, obj4, dVar, saa.a(i) | 1);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, d dVar, int i2) {
        composableLambdaImpl.p(obj, obj2, obj3, obj4, obj5, dVar, saa.a(i) | 1);
        return Unit.a;
    }

    public final void D(Object block) {
        if (Intrinsics.e(this._block, block)) {
            return;
        }
        boolean z = this._block == null;
        this._block = block;
        if (z) {
            return;
        }
        C();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return j((d) obj, ((Number) obj2).intValue());
    }

    public Object j(d c, int changed) {
        d dVarF = c.F(this.key);
        B(dVarF);
        int iD = changed | (dVarF.x(this) ? ko1.d(0) : ko1.g(0));
        Object obj = this._block;
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((Function2) a.f(obj, 2)).invoke(dVarF, Integer.valueOf(iD));
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new AnonymousClass1(this));
        }
        return objInvoke;
    }

    public Object k(final Object p1, d c, final int changed) {
        d dVarF = c.F(this.key);
        B(dVarF);
        int iD = dVarF.x(this) ? ko1.d(1) : ko1.g(1);
        Object obj = this._block;
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((ps4) a.f(obj, 3)).invoke(p1, dVarF, Integer.valueOf(iD | changed));
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.fo1
                public final Object invoke(Object obj2, Object obj3) {
                    return ComposableLambdaImpl.t(this.a, p1, changed, (d) obj2, ((Integer) obj3).intValue());
                }
            });
        }
        return objInvoke;
    }

    public Object l(final Object p1, final Object p2, d c, final int changed) {
        d dVarF = c.F(this.key);
        B(dVarF);
        int iD = dVarF.x(this) ? ko1.d(2) : ko1.g(2);
        Object obj = this._block;
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((rs4) a.f(obj, 4)).invoke(p1, p2, dVarF, Integer.valueOf(iD | changed));
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.eo1
                public final Object invoke(Object obj2, Object obj3) {
                    return ComposableLambdaImpl.w(this.a, p1, p2, changed, (d) obj2, ((Integer) obj3).intValue());
                }
            });
        }
        return objInvoke;
    }

    public Object m(final Object p1, final Object p2, final Object p3, d c, final int changed) {
        d dVarF = c.F(this.key);
        B(dVarF);
        int iD = dVarF.x(this) ? ko1.d(3) : ko1.g(3);
        Object obj = this._block;
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((ts4) a.f(obj, 5)).invoke(p1, p2, p3, dVarF, Integer.valueOf(iD | changed));
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.jo1
                public final Object invoke(Object obj2, Object obj3) {
                    return ComposableLambdaImpl.x(this.a, p1, p2, p3, changed, (d) obj2, ((Integer) obj3).intValue());
                }
            });
        }
        return objInvoke;
    }

    public Object o(final Object p1, final Object p2, final Object p3, final Object p4, d c, final int changed) {
        d dVarF = c.F(this.key);
        B(dVarF);
        int iD = dVarF.x(this) ? ko1.d(4) : ko1.g(4);
        Object obj = this._block;
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objU = ((vs4) a.f(obj, 6)).u(p1, p2, p3, p4, dVarF, Integer.valueOf(iD | changed));
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.ho1
                public final Object invoke(Object obj2, Object obj3) {
                    return ComposableLambdaImpl.y(this.a, p1, p2, p3, p4, changed, (d) obj2, ((Integer) obj3).intValue());
                }
            });
        }
        return objU;
    }

    public Object p(final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, d c, final int changed) {
        d dVarF = c.F(this.key);
        B(dVarF);
        int iD = dVarF.x(this) ? ko1.d(5) : ko1.g(5);
        Object obj = this._block;
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((xs4) a.f(obj, 7)).invoke(p1, p2, p3, p4, p5, dVarF, Integer.valueOf(changed | iD));
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.go1
                public final Object invoke(Object obj2, Object obj3) {
                    return ComposableLambdaImpl.z(this.a, p1, p2, p3, p4, p5, changed, (d) obj2, ((Integer) obj3).intValue());
                }
            });
        }
        return objInvoke;
    }

    public /* bridge */ /* synthetic */ Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return r(obj, obj2, obj3, obj4, obj5, obj6, (d) obj7, ((Number) obj8).intValue());
    }

    public Object r(final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, final Object p6, d c, final int changed) {
        d dVarF = c.F(this.key);
        B(dVarF);
        int iD = dVarF.x(this) ? ko1.d(6) : ko1.g(6);
        Object obj = this._block;
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Function8<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objQ = ((zs4) a.f(obj, 8)).q(p1, p2, p3, p4, p5, p6, dVarF, Integer.valueOf(changed | iD));
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.io1
                public final Object invoke(Object obj2, Object obj3) {
                    return ComposableLambdaImpl.A(this.a, p1, p2, p3, p4, p5, p6, changed, (d) obj2, ((Integer) obj3).intValue());
                }
            });
        }
        return objQ;
    }

    public /* bridge */ /* synthetic */ Object u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return o(obj, obj2, obj3, obj4, (d) obj5, ((Number) obj6).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return k(obj, (d) obj2, ((Number) obj3).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return l(obj, obj2, (d) obj3, ((Number) obj4).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m(obj, obj2, obj3, (d) obj4, ((Number) obj5).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return p(obj, obj2, obj3, obj4, obj5, (d) obj6, ((Number) obj7).intValue());
    }
}
