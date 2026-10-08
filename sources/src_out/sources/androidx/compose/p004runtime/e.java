package androidx.compose.p004runtime;

import androidx.collection.d;
import androidx.compose.p004runtime.e;
import com.google.android.qjd;
import com.google.inputmethod.OpaqueKey;
import com.google.inputmethod.SlotWriter;
import com.google.inputmethod.aq1;
import com.google.inputmethod.ez;
import com.google.inputmethod.fub;
import com.google.inputmethod.k58;
import com.google.inputmethod.kq1;
import com.google.inputmethod.ku4;
import com.google.inputmethod.lu4;
import com.google.inputmethod.mg;
import com.google.inputmethod.q08;
import com.google.inputmethod.r08;
import com.google.inputmethod.r6b;
import com.google.inputmethod.sea;
import com.google.inputmethod.taa;
import com.google.inputmethod.x22;
import com.google.inputmethod.zea;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0014\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a/\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0011\u001a\u00020\t*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a5\u0010!\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001eH\u0000¢\u0006\u0004\b!\u0010\"\"\"\u0010*\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)\" \u00100\u001a\u00020+8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010,\u0012\u0004\b/\u0010\r\u001a\u0004\b-\u0010.\" \u00103\u001a\u00020+8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010,\u0012\u0004\b2\u0010\r\u001a\u0004\b1\u0010.\" \u00106\u001a\u00020+8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b!\u0010,\u0012\u0004\b5\u0010\r\u001a\u0004\b4\u0010.\" \u00109\u001a\u00020+8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b&\u0010,\u0012\u0004\b8\u0010\r\u001a\u0004\b7\u0010.\" \u0010<\u001a\u00020+8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b4\u0010,\u0012\u0004\b;\u0010\r\u001a\u0004\b:\u0010.\" \u0010\u001c\u001a\u00020+8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b-\u0010,\u0012\u0004\b>\u0010\r\u001a\u0004\b=\u0010.¨\u0006?"}, d2 = {"", "k", "()Z", "", "key", "dirty1", "dirty2", "", "info", "", "o", "(IIILjava/lang/String;)V", "n", "()V", "Lcom/google/android/wub;", "Lcom/google/android/sea;", "rememberManager", "l", "(Lcom/google/android/wub;Lcom/google/android/sea;)V", "message", "", "c", "(Ljava/lang/String;)Ljava/lang/Void;", "b", "(Ljava/lang/String;)V", "Lcom/google/android/x22;", "composition", "Lcom/google/android/r08;", "reference", "slots", "Lcom/google/android/ez;", "applier", "Lcom/google/android/q08;", "d", "(Lcom/google/android/x22;Lcom/google/android/r08;Lcom/google/android/wub;Lcom/google/android/ez;)Lcom/google/android/q08;", "Lcom/google/android/kq1;", "a", "I", "e", "()I", "setComposeStackTraceMode-76WK1J0", "(I)V", "composeStackTraceMode", "", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", "getInvocation$annotations", "invocation", "h", "getProvider$annotations", "provider", "f", "getCompositionLocalMap$annotations", "compositionLocalMap", "getProviderValues", "getProviderValues$annotations", "providerValues", "i", "getProviderMaps$annotations", "providerMaps", "j", "getReference$annotations", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {
    private static int a = kq1.INSTANCE.a();
    private static final Object b = new OpaqueKey("provider");
    private static final Object c = new OpaqueKey("provider");
    private static final Object d = new OpaqueKey("compositionLocalMap");
    private static final Object e = new OpaqueKey("providerValues");
    private static final Object f = new OpaqueKey("providers");
    private static final Object g = new OpaqueKey("reference");

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"androidx/compose/runtime/e$a", "Lcom/google/android/taa;", "Landroidx/compose/runtime/b0;", "scope", "", "instance", "Landroidx/compose/runtime/InvalidationResult;", "m", "(Landroidx/compose/runtime/b0;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "", "d", "(Landroidx/compose/runtime/b0;)V", "value", "a", "(Ljava/lang/Object;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements taa {
        final /* synthetic */ x22 a;
        final /* synthetic */ r08 b;

        a(x22 x22Var, r08 r08Var) {
            this.a = x22Var;
            this.b = r08Var;
        }

        @Override // com.google.inputmethod.taa
        public void a(Object value) {
        }

        @Override // com.google.inputmethod.taa
        public void d(b0 scope) {
        }

        @Override // com.google.inputmethod.taa
        public InvalidationResult m(b0 scope, Object instance) {
            InvalidationResult invalidationResultM;
            x22 x22Var = this.a;
            taa taaVar = x22Var instanceof taa ? (taa) x22Var : null;
            if (taaVar == null || (invalidationResultM = taaVar.m(scope, instance)) == null) {
                invalidationResultM = InvalidationResult.IGNORED;
            }
            if (invalidationResultM != InvalidationResult.IGNORED) {
                return invalidationResultM;
            }
            r08 r08Var = this.b;
            r08Var.i(m.b1(r08Var.d(), qjd.a(scope, instance)));
            return InvalidationResult.SCHEDULED;
        }
    }

    public static final void b(String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final Void c(String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final q08 d(x22 x22Var, r08 r08Var, SlotWriter slotWriter, ez<?> ezVar) {
        r08 r08Var2;
        fub fubVar;
        List listP;
        mg mgVar;
        long[] jArr;
        mg mgVar2;
        fub fubVar2;
        long[] jArr2;
        long j;
        int i;
        boolean zD;
        Object obj;
        int i2;
        long j2;
        Object obj2;
        fub fubVar3 = new fub();
        if (slotWriter.b0()) {
            fubVar3.d();
        }
        if (slotWriter.a0()) {
            fubVar3.c();
        }
        int currentGroup = slotWriter.getCurrentGroup();
        if (ezVar != null && slotWriter.J0(currentGroup) > 0) {
            int parent = slotWriter.getParent();
            while (parent > 0 && !slotWriter.w0(parent)) {
                parent = slotWriter.L0(parent);
            }
            if (parent >= 0 && slotWriter.w0(parent)) {
                Object objH0 = slotWriter.H0(parent);
                int i3 = parent + 1;
                int iL0 = parent + slotWriter.l0(parent);
                int iJ0 = 0;
                while (i3 < iL0) {
                    int iL1 = slotWriter.l0(i3) + i3;
                    if (iL1 > currentGroup) {
                        break;
                    }
                    iJ0 += slotWriter.w0(i3) ? 1 : slotWriter.J0(i3);
                    i3 = iL1;
                }
                int iJ1 = slotWriter.w0(currentGroup) ? 1 : slotWriter.J0(currentGroup);
                ezVar.j(objH0);
                ezVar.b(iJ0, iJ1);
                ezVar.k();
            }
        }
        mg mgVarA = r08Var.getAnchor();
        if (mgVarA.a()) {
            Intrinsics.h(x22Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            g gVar = (g) x22Var;
            if (r6b.i(gVar.invalidations) > 0) {
                listP = new ArrayList();
                k58 k58Var = gVar.invalidations;
                long[] jArr3 = k58Var.metadata;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j3 = jArr3[i4];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((j3 & 255) < 128) {
                                    int i8 = (i4 << 3) + i7;
                                    int i9 = i5;
                                    Object obj3 = k58Var.keys[i8];
                                    mgVar2 = mgVarA;
                                    Object obj4 = k58Var.values[i8];
                                    Intrinsics.h(obj3, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap");
                                    if (obj4 instanceof d) {
                                        Intrinsics.h(obj4, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                        d dVar = (d) obj4;
                                        Object[] objArr = dVar.elements;
                                        long[] jArr4 = dVar.metadata;
                                        jArr2 = jArr3;
                                        int length2 = jArr4.length - 2;
                                        if (length2 >= 0) {
                                            j = j3;
                                            int i10 = 0;
                                            while (true) {
                                                long j4 = jArr4[i10];
                                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                    int i12 = 0;
                                                    while (i12 < i11) {
                                                        if ((j4 & 255) < 128) {
                                                            i2 = i12;
                                                            int i13 = (i10 << 3) + i2;
                                                            j2 = j4;
                                                            Object obj5 = objArr[i13];
                                                            b0 b0Var = (b0) obj3;
                                                            mg mgVarH = b0Var.getAnchor();
                                                            if (mgVarH != null) {
                                                                obj2 = obj3;
                                                                fubVar3 = fubVar3;
                                                                if (slotWriter.o0(lu4.a(mgVar2), lu4.a(mgVarH))) {
                                                                    listP.add(qjd.a(b0Var, obj5));
                                                                    dVar.A(i13);
                                                                }
                                                            }
                                                            j4 = j2 >> i9;
                                                            i12 = i2 + 1;
                                                            obj3 = obj2;
                                                            fubVar3 = fubVar3;
                                                        } else {
                                                            i2 = i12;
                                                            j2 = j4;
                                                        }
                                                        obj2 = obj3;
                                                        j4 = j2 >> i9;
                                                        i12 = i2 + 1;
                                                        obj3 = obj2;
                                                        fubVar3 = fubVar3;
                                                    }
                                                    fubVar2 = fubVar3;
                                                    obj = obj3;
                                                    if (i11 != i9) {
                                                        break;
                                                    }
                                                } else {
                                                    fubVar2 = fubVar3;
                                                    obj = obj3;
                                                }
                                                if (i10 == length2) {
                                                    break;
                                                }
                                                i10++;
                                                obj3 = obj;
                                                fubVar3 = fubVar2;
                                                i9 = 8;
                                            }
                                        } else {
                                            fubVar2 = fubVar3;
                                            j = j3;
                                        }
                                        zD = dVar.d();
                                    } else {
                                        fubVar2 = fubVar3;
                                        jArr2 = jArr3;
                                        j = j3;
                                        Intrinsics.h(obj4, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                        b0 b0Var2 = (b0) obj3;
                                        mg mgVarH2 = b0Var2.getAnchor();
                                        if (mgVarH2 == null || !slotWriter.o0(lu4.a(mgVar2), lu4.a(mgVarH2))) {
                                            zD = false;
                                        } else {
                                            listP.add(qjd.a(b0Var2, obj4));
                                            zD = true;
                                        }
                                    }
                                    if (zD) {
                                        k58Var.v(i8);
                                    }
                                    i = 8;
                                } else {
                                    mgVar2 = mgVarA;
                                    fubVar2 = fubVar3;
                                    jArr2 = jArr3;
                                    j = j3;
                                    i = i5;
                                }
                                j3 = j >> i;
                                i7++;
                                i5 = i;
                                mgVarA = mgVar2;
                                jArr3 = jArr2;
                                fubVar3 = fubVar2;
                            }
                            mgVar = mgVarA;
                            fubVar = fubVar3;
                            jArr = jArr3;
                            if (i6 != i5) {
                                break;
                            }
                        } else {
                            mgVar = mgVarA;
                            fubVar = fubVar3;
                            jArr = jArr3;
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                        mgVarA = mgVar;
                        jArr3 = jArr;
                        fubVar3 = fubVar;
                    }
                } else {
                    fubVar = fubVar3;
                }
            } else {
                fubVar = fubVar3;
                listP = m.p();
            }
            r08Var2 = r08Var;
            r08Var2.i(m.a1(r08Var.d(), listP));
        } else {
            r08Var2 = r08Var;
            fubVar = fubVar3;
        }
        SlotWriter slotWriterN = fubVar.N();
        try {
            slotWriterN.F();
            slotWriterN.n1(126665345, r08Var2.c());
            SlotWriter.z0(slotWriterN, 0, 1, null);
            slotWriterN.s1(r08Var2.getParameter());
            List<ku4> listG0 = slotWriter.G0(lu4.a(r08Var2.getAnchor()), 1, slotWriterN);
            slotWriterN.c1();
            slotWriterN.S();
            slotWriterN.T();
            slotWriterN.K(true);
            fub fubVar4 = fubVar;
            q08 q08Var = new q08(fubVar4);
            b0.Companion aVar = b0.INSTANCE;
            if (!aVar.b(fubVar4, listG0)) {
                return q08Var;
            }
            a aVar2 = new a(x22Var, r08Var2);
            SlotWriter slotWriterN2 = fubVar4.N();
            try {
                aVar.a(slotWriterN2, listG0, aVar2);
                Unit unit = Unit.a;
                boolean z = true;
                return q08Var;
            } finally {
                slotWriterN2.K(false);
            }
        } catch (Throwable th) {
            slotWriterN.K(false);
            throw th;
        }
    }

    public static final int e() {
        return a;
    }

    public static final Object f() {
        return d;
    }

    public static final Object g() {
        return b;
    }

    public static final Object h() {
        return c;
    }

    public static final Object i() {
        return f;
    }

    public static final Object j() {
        return g;
    }

    public static final boolean k() {
        return false;
    }

    public static final void l(SlotWriter slotWriter, final sea seaVar) {
        slotWriter.X(slotWriter.getCurrentGroup(), new Function2() { // from class: com.google.android.tq1
            public final Object invoke(Object obj, Object obj2) {
                return e.m(seaVar, ((Integer) obj).intValue(), obj2);
            }
        });
        slotWriter.S0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(sea seaVar, int i, Object obj) {
        if (obj instanceof aq1) {
            seaVar.c((aq1) obj);
        }
        if (obj instanceof zea) {
            seaVar.e((zea) obj);
        }
        if (obj instanceof b0) {
            ((b0) obj).A();
        }
        return Unit.a;
    }

    public static final void n() {
    }

    public static final void o(int i, int i2, int i3, String str) {
    }
}
