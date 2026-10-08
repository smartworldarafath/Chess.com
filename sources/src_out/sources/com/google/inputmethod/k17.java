package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.i;
import com.google.android.r2c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aA\u0010\u0010\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aE\u0010\u0014\u001a\u00020\u00052\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u0012\"\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a3\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a7\u0010\u001b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\fH\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a3\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00192\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\fH\u0003¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006 ²\u0006\u0012\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/lifecycle/Lifecycle$Event;", "event", "Lcom/google/android/n17;", "lifecycleOwner", "Lkotlin/Function0;", "", "onEvent", "m", "(Landroidx/lifecycle/Lifecycle$Event;Lcom/google/android/n17;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/d;II)V", "", "key1", "key2", "Lkotlin/Function1;", "Lcom/google/android/v17;", "Lcom/google/android/w17;", "effects", "x", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/n17;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;II)V", "", "keys", "y", "([Ljava/lang/Object;Lcom/google/android/n17;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;II)V", "scope", "B", "(Lcom/google/android/n17;Lcom/google/android/v17;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;I)V", "Lcom/google/android/t17;", "Lcom/google/android/p17;", "r", "(Ljava/lang/Object;Lcom/google/android/n17;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;II)V", "t", "(Lcom/google/android/n17;Lcom/google/android/t17;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;I)V", "currentOnEvent", "lifecycle-runtime-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class k17 {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/google/android/k17$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements jd3 {
        final /* synthetic */ n17 a;
        final /* synthetic */ i b;

        public a(n17 n17Var, i iVar) {
            this.a = n17Var;
            this.b = iVar;
        }

        @Override // com.google.inputmethod.jd3
        public void dispose() {
            this.a.getLifecycle().g(this.b);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/google/android/k17$b", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements jd3 {
        final /* synthetic */ n17 a;
        final /* synthetic */ i b;
        final /* synthetic */ Ref.ObjectRef c;

        public b(n17 n17Var, i iVar, Ref.ObjectRef objectRef) {
            this.a = n17Var;
            this.b = iVar;
            this.c = objectRef;
        }

        @Override // com.google.inputmethod.jd3
        public void dispose() {
            this.a.getLifecycle().g(this.b);
            p17 p17Var = (p17) this.c.element;
            if (p17Var != null) {
                p17Var.a();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/google/android/k17$c", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements jd3 {
        final /* synthetic */ n17 a;
        final /* synthetic */ i b;
        final /* synthetic */ Ref.ObjectRef c;

        public c(n17 n17Var, i iVar, Ref.ObjectRef objectRef) {
            this.a = n17Var;
            this.b = iVar;
            this.c = objectRef;
        }

        @Override // com.google.inputmethod.jd3
        public void dispose() {
            this.a.getLifecycle().g(this.b);
            w17 w17Var = (w17) this.c.element;
            if (w17Var != null) {
                w17Var.a();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(Object[] objArr, n17 n17Var, Function1 function1, int i, int i2, androidx.compose.p004runtime.d dVar, int i3) {
        y(objArr, n17Var, function1, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    private static final void B(final n17 n17Var, final v17 v17Var, final Function1<? super v17, ? extends w17> function1, androidx.compose.p004runtime.d dVar, final int i) {
        int i2;
        androidx.compose.p004runtime.d dVarF = dVar.F(228371534);
        if ((i & 6) == 0) {
            i2 = (dVarF.T(n17Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.T(v17Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dVarF.T(function1) ? 256 : 128;
        }
        if (dVarF.g((i2 & 147) != 146, i2 & 1)) {
            if (e.k()) {
                e.o(228371534, i2, -1, "androidx.lifecycle.compose.LifecycleStartEffectImpl (LifecycleEffect.kt:340)");
            }
            boolean zT = dVarF.T(v17Var) | ((i2 & 896) == 256) | dVarF.T(n17Var);
            Object objR = dVarF.R();
            if (zT || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new Function1() { // from class: com.google.android.f17
                    public final Object invoke(Object obj) {
                        return k17.C(n17Var, v17Var, function1, (kd3) obj);
                    }
                };
                dVarF.L(objR);
            }
            vn3.b(n17Var, v17Var, (Function1) objR, dVarF, i2 & 126);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.g17
                public final Object invoke(Object obj, Object obj2) {
                    return k17.E(n17Var, v17Var, function1, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd3 C(n17 n17Var, final v17 v17Var, final Function1 function1, kd3 kd3Var) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        i iVar = new i() { // from class: com.google.android.h17
            @Override // androidx.lifecycle.i
            public final void d6(n17 n17Var2, Lifecycle.Event event) {
                k17.D(v17Var, objectRef, function1, n17Var2, event);
            }
        };
        n17Var.getLifecycle().c(iVar);
        return new c(n17Var, iVar, objectRef);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(v17 v17Var, Ref.ObjectRef objectRef, Function1 function1, n17 n17Var, Lifecycle.Event event) {
        int i = d.$EnumSwitchMapping$0[event.ordinal()];
        if (i == 1) {
            objectRef.element = function1.invoke(v17Var);
        } else {
            if (i != 2) {
                return;
            }
            w17 w17Var = (w17) objectRef.element;
            if (w17Var != null) {
                w17Var.a();
            }
            objectRef.element = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(n17 n17Var, v17 v17Var, Function1 function1, int i, androidx.compose.p004runtime.d dVar, int i2) {
        B(n17Var, v17Var, function1, dVar, saa.a(i | 1));
        return Unit.a;
    }

    public static final void m(final Lifecycle.Event event, final n17 n17Var, final Function0<Unit> function0, androidx.compose.p004runtime.d dVar, final int i, final int i2) {
        int i3;
        androidx.compose.p004runtime.d dVarF = dVar.F(-709389590);
        if ((i & 6) == 0) {
            i3 = (dVarF.C(event.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && dVarF.T(n17Var)) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= dVarF.T(function0) ? 256 : 128;
        }
        if (dVarF.g((i3 & 147) != 146, i3 & 1)) {
            dVarF.U();
            if ((i & 1) != 0 && !dVarF.t()) {
                dVarF.q();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            } else if ((i2 & 2) != 0) {
                n17Var = (n17) dVarF.v(h67.c());
                i3 &= -113;
            }
            dVarF.M();
            if (e.k()) {
                e.o(-709389590, i3, -1, "androidx.lifecycle.compose.LifecycleEventEffect (LifecycleEffect.kt:55)");
            }
            if (event == Lifecycle.Event.ON_DESTROY) {
                throw new IllegalArgumentException("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
            }
            final q6c q6cVarR = p0.r(function0, dVarF, (i3 >> 6) & 14);
            boolean zX = dVarF.x(q6cVarR) | ((i3 & 14) == 4) | dVarF.T(n17Var);
            Object objR = dVarF.R();
            if (zX || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new Function1() { // from class: com.google.android.j17
                    public final Object invoke(Object obj) {
                        return k17.o(n17Var, event, q6cVarR, (kd3) obj);
                    }
                };
                dVarF.L(objR);
            }
            vn3.c(n17Var, (Function1) objR, dVarF, (i3 >> 3) & 14);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        final n17 n17Var2 = n17Var;
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.z07
                public final Object invoke(Object obj, Object obj2) {
                    return k17.q(event, n17Var2, function0, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final Function0<Unit> n(q6c<? extends Function0<Unit>> q6cVar) {
        return q6cVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd3 o(n17 n17Var, final Lifecycle.Event event, final q6c q6cVar, kd3 kd3Var) {
        i iVar = new i() { // from class: com.google.android.a17
            @Override // androidx.lifecycle.i
            public final void d6(n17 n17Var2, Lifecycle.Event event2) {
                k17.p(event, q6cVar, n17Var2, event2);
            }
        };
        n17Var.getLifecycle().c(iVar);
        return new a(n17Var, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(Lifecycle.Event event, q6c q6cVar, n17 n17Var, Lifecycle.Event event2) {
        if (event2 == event) {
            n(q6cVar).invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(Lifecycle.Event event, n17 n17Var, Function0 function0, int i, int i2, androidx.compose.p004runtime.d dVar, int i3) {
        m(event, n17Var, function0, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    public static final void r(final Object obj, n17 n17Var, final Function1<? super t17, ? extends p17> function1, androidx.compose.p004runtime.d dVar, final int i, final int i2) {
        int i3;
        androidx.compose.p004runtime.d dVarF = dVar.F(1220373486);
        if ((i & 6) == 0) {
            i3 = (dVarF.T(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && dVarF.T(n17Var)) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= dVarF.T(function1) ? 256 : 128;
        }
        if (dVarF.g((i3 & 147) != 146, i3 & 1)) {
            dVarF.U();
            if ((i & 1) != 0 && !dVarF.t()) {
                dVarF.q();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            } else if ((i2 & 2) != 0) {
                n17Var = (n17) dVarF.v(h67.c());
                i3 &= -113;
            }
            dVarF.M();
            if (e.k()) {
                e.o(1220373486, i3, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:447)");
            }
            boolean zX = dVarF.x(obj) | dVarF.x(n17Var);
            Object objR = dVarF.R();
            if (zX || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new t17(n17Var.getLifecycle());
                dVarF.L(objR);
            }
            t(n17Var, (t17) objR, function1, dVarF, ((i3 >> 3) & 14) | (i3 & 896));
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        final n17 n17Var2 = n17Var;
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.y07
                public final Object invoke(Object obj2, Object obj3) {
                    return k17.s(obj, n17Var2, function1, i, i2, (d) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(Object obj, n17 n17Var, Function1 function1, int i, int i2, androidx.compose.p004runtime.d dVar, int i3) {
        r(obj, n17Var, function1, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    private static final void t(final n17 n17Var, final t17 t17Var, final Function1<? super t17, ? extends p17> function1, androidx.compose.p004runtime.d dVar, final int i) {
        int i2;
        androidx.compose.p004runtime.d dVarF = dVar.F(912823238);
        if ((i & 6) == 0) {
            i2 = (dVarF.T(n17Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.T(t17Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dVarF.T(function1) ? 256 : 128;
        }
        if (dVarF.g((i2 & 147) != 146, i2 & 1)) {
            if (e.k()) {
                e.o(912823238, i2, -1, "androidx.lifecycle.compose.LifecycleResumeEffectImpl (LifecycleEffect.kt:663)");
            }
            boolean zT = dVarF.T(t17Var) | ((i2 & 896) == 256) | dVarF.T(n17Var);
            Object objR = dVarF.R();
            if (zT || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new Function1() { // from class: com.google.android.c17
                    public final Object invoke(Object obj) {
                        return k17.u(n17Var, t17Var, function1, (kd3) obj);
                    }
                };
                dVarF.L(objR);
            }
            vn3.b(n17Var, t17Var, (Function1) objR, dVarF, i2 & 126);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.d17
                public final Object invoke(Object obj, Object obj2) {
                    return k17.w(n17Var, t17Var, function1, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd3 u(n17 n17Var, final t17 t17Var, final Function1 function1, kd3 kd3Var) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        i iVar = new i() { // from class: com.google.android.e17
            @Override // androidx.lifecycle.i
            public final void d6(n17 n17Var2, Lifecycle.Event event) {
                k17.v(t17Var, objectRef, function1, n17Var2, event);
            }
        };
        n17Var.getLifecycle().c(iVar);
        return new b(n17Var, iVar, objectRef);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(t17 t17Var, Ref.ObjectRef objectRef, Function1 function1, n17 n17Var, Lifecycle.Event event) {
        int i = d.$EnumSwitchMapping$0[event.ordinal()];
        if (i == 3) {
            objectRef.element = function1.invoke(t17Var);
        } else {
            if (i != 4) {
                return;
            }
            p17 p17Var = (p17) objectRef.element;
            if (p17Var != null) {
                p17Var.a();
            }
            objectRef.element = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(n17 n17Var, t17 t17Var, Function1 function1, int i, androidx.compose.p004runtime.d dVar, int i2) {
        t(n17Var, t17Var, function1, dVar, saa.a(i | 1));
        return Unit.a;
    }

    public static final void x(final Object obj, final Object obj2, n17 n17Var, final Function1<? super v17, ? extends w17> function1, androidx.compose.p004runtime.d dVar, final int i, final int i2) {
        int i3;
        androidx.compose.p004runtime.d dVarF = dVar.F(696924721);
        if ((i & 6) == 0) {
            i3 = (dVarF.T(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= dVarF.T(obj2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && dVarF.T(n17Var)) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= dVarF.T(function1) ? 2048 : 1024;
        }
        if (dVarF.g((i3 & 1171) != 1170, i3 & 1)) {
            dVarF.U();
            if ((i & 1) != 0 && !dVarF.t()) {
                dVarF.q();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            } else if ((i2 & 4) != 0) {
                n17Var = (n17) dVarF.v(h67.c());
                i3 &= -897;
            }
            dVarF.M();
            if (e.k()) {
                e.o(696924721, i3, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:187)");
            }
            boolean zX = dVarF.x(obj) | dVarF.x(obj2) | dVarF.x(n17Var);
            Object objR = dVarF.R();
            if (zX || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new v17(n17Var.getLifecycle());
                dVarF.L(objR);
            }
            B(n17Var, (v17) objR, function1, dVarF, ((i3 >> 6) & 14) | ((i3 >> 3) & 896));
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        final n17 n17Var2 = n17Var;
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.b17
                public final Object invoke(Object obj3, Object obj4) {
                    return k17.z(obj, obj2, n17Var2, function1, i, i2, (d) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    public static final void y(final Object[] objArr, n17 n17Var, final Function1<? super v17, ? extends w17> function1, androidx.compose.p004runtime.d dVar, final int i, final int i2) {
        androidx.compose.p004runtime.d dVarF = dVar.F(-1510305724);
        int i3 = (i & 48) == 0 ? (((i2 & 2) == 0 && dVarF.T(n17Var)) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i3 |= dVarF.T(function1) ? 256 : 128;
        }
        dVarF.V(295146261, Integer.valueOf(objArr.length));
        int i4 = i3 | (dVarF.C(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i4 |= dVarF.T(obj) ? 4 : 0;
        }
        dVarF.Z();
        if ((i4 & 14) == 0) {
            i4 |= 2;
        }
        if (dVarF.g((i4 & 147) != 146, i4 & 1)) {
            dVarF.U();
            if ((i & 1) != 0 && !dVarF.t()) {
                dVarF.q();
                if ((i2 & 2) != 0) {
                    i4 &= -113;
                }
            } else if ((i2 & 2) != 0) {
                n17Var = (n17) dVarF.v(h67.c());
                i4 &= -113;
            }
            dVarF.M();
            if (e.k()) {
                e.o(-1510305724, i4, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:308)");
            }
            r2c r2cVar = new r2c(2);
            r2cVar.b(objArr);
            r2cVar.a(n17Var);
            boolean zX = false;
            for (Object obj2 : r2cVar.d(new Object[r2cVar.c()])) {
                zX |= dVarF.x(obj2);
            }
            Object objR = dVarF.R();
            if (zX || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new v17(n17Var.getLifecycle());
                dVarF.L(objR);
            }
            B(n17Var, (v17) objR, function1, dVarF, (i4 & 896) | ((i4 >> 3) & 14));
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        final n17 n17Var2 = n17Var;
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.i17
                public final Object invoke(Object obj3, Object obj4) {
                    return k17.A(objArr, n17Var2, function1, i, i2, (d) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(Object obj, Object obj2, n17 n17Var, Function1 function1, int i, int i2, androidx.compose.p004runtime.d dVar, int i3) {
        x(obj, obj2, n17Var, function1, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }
}
