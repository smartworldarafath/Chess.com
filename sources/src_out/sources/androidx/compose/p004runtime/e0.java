package androidx.compose.p004runtime;

import com.google.inputmethod.aq1;
import com.google.inputmethod.e58;
import com.google.inputmethod.ez;
import com.google.inputmethod.n48;
import com.google.inputmethod.rea;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u001f*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001'B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\nJ\u001f\u0010\u0016\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J5\u0010\u001d\u001a\u00020\u00072\u001a\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00070\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\nJ#\u0010#\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0007¢\u0006\u0004\b%\u0010\nR\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010+R\"\u00101\u001a\u00028\u00008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b'\u0010/\"\u0004\b0\u0010\u0005¨\u00062"}, d2 = {"Landroidx/compose/runtime/e0;", "N", "Lcom/google/android/ez;", "root", "<init>", "(Ljava/lang/Object;)V", "node", "", "j", "k", "()V", "", "index", "count", "b", "(II)V", "from", "to", "f", "(III)V", "clear", "instance", "i", "(ILjava/lang/Object;)V", "h", "Lkotlin/Function2;", "", "block", "value", "g", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;)V", "d", "applier", "Lcom/google/android/rea;", "rememberManager", "m", "(Lcom/google/android/ez;Lcom/google/android/rea;)V", "l", "Lcom/google/android/n48;", "a", "Lcom/google/android/n48;", "operations", "Lcom/google/android/e58;", "Lcom/google/android/e58;", "instances", "c", "Ljava/lang/Object;", "()Ljava/lang/Object;", "setCurrent", "current", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e0<N> implements ez<N> {
    public static final int e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final n48 operations = new n48(0, 1, null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final e58<Object> instances = new e58<>(0, 1, null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private N current;

    public e0(N n) {
        this.current = n;
    }

    @Override // com.google.inputmethod.ez
    public N a() {
        return this.current;
    }

    @Override // com.google.inputmethod.ez
    public void b(int index, int count) {
        this.operations.k(2);
        this.operations.k(index);
        this.operations.k(count);
    }

    @Override // com.google.inputmethod.ez
    public void clear() {
        this.operations.k(4);
    }

    @Override // com.google.inputmethod.ez
    public void d() {
        this.operations.k(8);
    }

    @Override // com.google.inputmethod.ez
    public void f(int from, int to, int count) {
        this.operations.k(3);
        this.operations.k(from);
        this.operations.k(to);
        this.operations.k(count);
    }

    @Override // com.google.inputmethod.ez
    public void g(Function2<? super N, Object, Unit> block, Object value) {
        this.operations.k(7);
        this.instances.n(block);
        this.instances.n(value);
    }

    @Override // com.google.inputmethod.ez
    public void h(int index, N instance) {
        this.operations.k(6);
        this.operations.k(index);
        this.instances.n(instance);
    }

    @Override // com.google.inputmethod.ez
    public void i(int index, N instance) {
        this.operations.k(5);
        this.operations.k(index);
        this.instances.n(instance);
    }

    @Override // com.google.inputmethod.ez
    public void j(N node) {
        this.operations.k(1);
        this.instances.n(node);
    }

    @Override // com.google.inputmethod.ez
    public void k() {
        this.operations.k(0);
    }

    public final void l() {
        this.operations.k(9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(ez<N> applier, rea rememberManager) {
        Exception exc;
        int i;
        n48 n48Var = this.operations;
        int i2 = n48Var._size;
        e58<Object> e58Var = this.instances;
        e58 e58Var2 = new e58(0, 1, null);
        applier.e();
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i3 + 1;
            try {
                try {
                    switch (n48Var.e(i3)) {
                        case 0:
                            applier.k();
                            i3 = i5;
                            break;
                        case 1:
                            int i6 = i4 + 1;
                            applier.j(e58Var.d(i4));
                            i4 = i6;
                            i3 = i5;
                            break;
                        case 2:
                            int i7 = i3 + 2;
                            i3 += 3;
                            applier.b(n48Var.e(i5), n48Var.e(i7));
                            break;
                        case 3:
                            int i8 = i3 + 2;
                            try {
                                int i9 = i3 + 3;
                                try {
                                    i3 += 4;
                                    applier.f(n48Var.e(i5), n48Var.e(i8), n48Var.e(i9));
                                } catch (Exception e2) {
                                    exc = e2;
                                    i3 = i9;
                                    throw new ComposePausableCompositionException(e58Var, e58Var2, n48Var, i3 - 1, exc);
                                }
                            } catch (Exception e3) {
                                exc = e3;
                                i3 = i8;
                            }
                            break;
                        case 4:
                            applier.clear();
                            i3 = i5;
                            break;
                        case 5:
                            i3 += 2;
                            i = i4 + 1;
                            applier.i(n48Var.e(i5), e58Var.d(i4));
                            i4 = i;
                            break;
                        case 6:
                            i3 += 2;
                            try {
                                i = i4 + 1;
                                applier.h(n48Var.e(i5), e58Var.d(i4));
                                i4 = i;
                            } catch (Exception e4) {
                                exc = e4;
                                throw new ComposePausableCompositionException(e58Var, e58Var2, n48Var, i3 - 1, exc);
                            }
                            break;
                        case 7:
                            int i10 = i4 + 1;
                            Object objD = e58Var.d(i4);
                            Intrinsics.h(objD, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                            i4 += 2;
                            applier.g((Function2) a.f(objD, 2), e58Var.d(i10));
                            i3 = i5;
                            break;
                        case 8:
                            Object objA = applier.a();
                            if (objA instanceof aq1) {
                                rememberManager.k((aq1) objA);
                            }
                            e58Var2.n(objA);
                            applier.d();
                            i3 = i5;
                            break;
                        default:
                            i3 = i5;
                            break;
                    }
                } catch (Exception e5) {
                    exc = e5;
                    i3 = i5;
                }
            } catch (Throwable th) {
                applier.c();
                throw th;
            }
        }
        if (!(i4 == e58Var.get_size())) {
            e.b("Applier operation size mismatch");
        }
        e58Var.u();
        n48Var.m();
        applier.c();
    }
}
