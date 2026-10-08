package androidx.compose.p004runtime;

import androidx.collection.ScatterSet;
import androidx.compose.p004runtime.b0;
import com.google.inputmethod.SlotWriter;
import com.google.inputmethod.bxb;
import com.google.inputmethod.d58;
import com.google.inputmethod.fub;
import com.google.inputmethod.k58;
import com.google.inputmethod.ku4;
import com.google.inputmethod.mg;
import com.google.inputmethod.pr1;
import com.google.inputmethod.qaa;
import com.google.inputmethod.s6b;
import com.google.inputmethod.taa;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b.\b\u0001\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001eB\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\f\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\b2\u0018\u0010\n\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0007J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J)\u0010\u001e\u001a\u00020\u00102\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00100\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0010¢\u0006\u0004\b#\u0010\u0018J\u0015\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0003¢\u0006\u0004\b%\u0010&J#\u0010'\u001a\u00020\u00102\n\u0010$\u001a\u0006\u0012\u0002\b\u00030\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b*\u0010&J\r\u0010+\u001a\u00020\u0010¢\u0006\u0004\b+\u0010\u0018J#\u0010.\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0010\u0018\u00010,2\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b.\u0010/R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u0010\u0007R\u0016\u00106\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R$\u0010=\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R*\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010>R\u0016\u0010?\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u00105R\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010AR*\u0010E\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR$\u0010J\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010M\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8@@BX\u0080\u000e¢\u0006\f\u001a\u0004\bK\u0010G\"\u0004\bL\u0010IR\u0011\u0010O\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bN\u0010GR\u0011\u0010Q\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bP\u0010GR$\u0010T\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010G\"\u0004\bS\u0010IR$\u0010W\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bU\u0010G\"\u0004\bV\u0010IR$\u0010Z\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010G\"\u0004\bY\u0010IR$\u0010]\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010G\"\u0004\b\\\u0010IR$\u0010`\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010G\"\u0004\b_\u0010IR$\u0010c\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\ba\u0010G\"\u0004\bb\u0010IR$\u0010f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010G\"\u0004\be\u0010IR$\u0010h\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bg\u0010G\"\u0004\b5\u0010IR$\u0010k\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bi\u0010G\"\u0004\bj\u0010IR\u0011\u0010m\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bl\u0010G¨\u0006n"}, d2 = {"Landroidx/compose/runtime/b0;", "Lcom/google/android/s6b;", "Lcom/google/android/qaa;", "", "Lcom/google/android/taa;", "owner", "<init>", "(Lcom/google/android/taa;)V", "Landroidx/compose/runtime/j;", "Lcom/google/android/k58;", "dependencies", "", "d", "(Landroidx/compose/runtime/j;Lcom/google/android/k58;)Z", "Landroidx/compose/runtime/d;", "composer", "", "e", "(Landroidx/compose/runtime/d;)V", "value", "Landroidx/compose/runtime/InvalidationResult;", "v", "(Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "A", "()V", "c", "invalidate", "Lkotlin/Function2;", "", "block", "a", "(Lkotlin/jvm/functions/Function2;)V", "token", "P", "(I)V", "C", "instance", "z", "(Ljava/lang/Object;)Z", "y", "(Landroidx/compose/runtime/j;Ljava/lang/Object;)V", "instances", "x", "B", "Lkotlin/Function1;", "Lcom/google/android/pr1;", "f", "(I)Lkotlin/jvm/functions/Function1;", "Lcom/google/android/taa;", "getOwner$runtime", "()Lcom/google/android/taa;", "setOwner$runtime", "b", "I", "flags", "Lcom/google/android/mg;", "Lcom/google/android/mg;", "h", "()Lcom/google/android/mg;", "D", "(Lcom/google/android/mg;)V", "anchor", "Lkotlin/jvm/functions/Function2;", "currentToken", "Lcom/google/android/d58;", "Lcom/google/android/d58;", "trackedInstances", "g", "Lcom/google/android/k58;", "trackedDependencies", "o", "()Z", "J", "(Z)V", "rereading", "s", "N", "skipped", "u", "valid", "i", "canRecompose", "t", "O", "used", "r", "M", "reusing", "p", "K", "resetReusing", "m", "H", "paused", "q", "L", "resuming", "j", "E", "defaultsInScope", "k", "F", "defaultsInvalid", "n", "requiresRecompose", "l", "G", "forcedRecompose", "w", "isConditional", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b0 implements s6b, qaa {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int i = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private taa owner;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int flags;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private mg anchor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Function2<? super d, ? super Integer, Unit> block;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int currentToken;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private d58<Object> trackedInstances;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private k58<j<?>, Object> trackedDependencies;

    /* JADX INFO: renamed from: androidx.compose.runtime.b0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/b0$a;", "", "<init>", "()V", "Lcom/google/android/wub;", "slots", "", "Lcom/google/android/ku4;", "anchors", "Lcom/google/android/taa;", "newOwner", "", "a", "(Lcom/google/android/wub;Ljava/util/List;Lcom/google/android/taa;)V", "Lcom/google/android/fub;", "", "b", "(Lcom/google/android/fub;Ljava/util/List;)Z", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(SlotWriter slots, List<ku4> anchors, taa newOwner) {
            if (anchors.isEmpty()) {
                return;
            }
            int size = anchors.size();
            for (int i = 0; i < size; i++) {
                Object objF1 = slots.f1(anchors.get(i), 0);
                b0 b0Var = objF1 instanceof b0 ? (b0) objF1 : null;
                if (b0Var != null) {
                    b0Var.c(newOwner);
                }
            }
        }

        public final boolean b(fub slots, List<ku4> anchors) {
            if (!anchors.isEmpty()) {
                int size = anchors.size();
                for (int i = 0; i < size; i++) {
                    ku4 ku4Var = anchors.get(i);
                    if (slots.O(ku4Var) && (slots.Q(slots.u(ku4Var), 0) instanceof b0)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    public b0(taa taaVar) {
        this.owner = taaVar;
    }

    private final void J(boolean z) {
        int i2 = this.flags;
        this.flags = z ? i2 | 32 : i2 & (-33);
    }

    private final void N(boolean z) {
        int i2 = this.flags;
        this.flags = z ? i2 | 16 : i2 & (-17);
    }

    private final boolean d(j<?> jVar, k58<j<?>, Object> k58Var) {
        Intrinsics.h(jVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        bxb<?> policy = jVar.getPolicy();
        if (policy == null) {
            policy = p0.t();
        }
        return !policy.a(jVar.E().a(), k58Var.e(jVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0087 A[LOOP:0: B:11:0x0020->B:35:0x0087, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x008a A[EDGE_INSN: B:39:0x008a->B:36:0x008a BREAK  A[LOOP:0: B:11:0x0020->B:35:0x0087], SYNTHETIC] */
    public static final Unit g(b0 b0Var, int i2, d58 d58Var, pr1 pr1Var) {
        int i3;
        if (b0Var.currentToken == i2 && Intrinsics.e(d58Var, b0Var.trackedInstances) && (pr1Var instanceof g)) {
            long[] jArr = d58Var.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j = jArr[i4];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i4 != length) {
                            break;
                            break;
                        }
                        i4++;
                    } else {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((255 & j) < 128) {
                                int i8 = (i4 << 3) + i7;
                                Object obj = d58Var.keys[i8];
                                boolean z = d58Var.values[i8] != i2;
                                if (z) {
                                    g gVar = (g) pr1Var;
                                    gVar.Z(obj, b0Var);
                                    i3 = i5;
                                    if (obj instanceof j) {
                                        gVar.Y((j) obj);
                                        k58<j<?>, Object> k58Var = b0Var.trackedDependencies;
                                        if (k58Var != null) {
                                            k58Var.u((j<?>) obj);
                                        }
                                    }
                                } else {
                                    i3 = i5;
                                }
                                if (z) {
                                    d58Var.s(i8);
                                }
                            } else {
                                i3 = i5;
                            }
                            j >>= i3;
                            i7++;
                            i5 = i3;
                        }
                        if (i6 != i5) {
                            break;
                        }
                        if (i4 != length) {
                            break;
                        }
                        i4++;
                    }
                }
            }
        }
        return Unit.a;
    }

    private final boolean o() {
        return (this.flags & 32) != 0;
    }

    public final void A() {
        taa taaVar = this.owner;
        if (taaVar != null) {
            taaVar.d(this);
        }
        this.owner = null;
        this.trackedInstances = null;
        this.trackedDependencies = null;
        this.block = null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0055 A[LOOP:0: B:10:0x001b->B:23:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0058 A[EDGE_INSN: B:32:0x0058->B:24:0x0058 BREAK  A[LOOP:0: B:10:0x001b->B:23:0x0055], SYNTHETIC] */
    public final void B() {
        d58<Object> d58Var;
        taa taaVar = this.owner;
        if (taaVar == null || (d58Var = this.trackedInstances) == null) {
            return;
        }
        J(true);
        try {
            Object[] objArr = d58Var.keys;
            int[] iArr = d58Var.values;
            long[] jArr = d58Var.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                int i5 = (i2 << 3) + i4;
                                Object obj = objArr[i5];
                                int i6 = iArr[i5];
                                taaVar.a(obj);
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        } finally {
            J(false);
        }
    }

    public final void C() {
        if (r()) {
            return;
        }
        N(true);
    }

    public final void D(mg mgVar) {
        this.anchor = mgVar;
    }

    public final void E(boolean z) {
        int i2 = this.flags;
        this.flags = z ? i2 | 2 : i2 & (-3);
    }

    public final void F(boolean z) {
        int i2 = this.flags;
        this.flags = z ? i2 | 4 : i2 & (-5);
    }

    public final void G(boolean z) {
        int i2 = this.flags;
        this.flags = z ? i2 | 64 : i2 & (-65);
    }

    public final void H(boolean z) {
        int i2 = this.flags;
        this.flags = z ? i2 | 256 : i2 & (-257);
    }

    public final void I(boolean z) {
        int i2 = this.flags;
        this.flags = z ? i2 | 8 : i2 & (-9);
    }

    public final void K(boolean z) {
        int i2 = this.flags;
        this.flags = z ? i2 | 1024 : i2 & (-1025);
    }

    public final void L(boolean z) {
        int i2 = this.flags;
        this.flags = z ? i2 | 512 : i2 & (-513);
    }

    public final void M(boolean z) {
        int i2 = this.flags;
        this.flags = z ? i2 | 128 : i2 & (-129);
    }

    public final void O(boolean z) {
        int i2 = this.flags;
        this.flags = z ? i2 | 1 : i2 & (-2);
    }

    public final void P(int token) {
        this.currentToken = token;
        N(false);
    }

    @Override // com.google.inputmethod.s6b
    public void a(Function2<? super d, ? super Integer, Unit> block) {
        this.block = block;
    }

    public final void c(taa owner) {
        this.owner = owner;
    }

    public final void e(d composer) {
        Function2<? super d, ? super Integer, Unit> function2 = this.block;
        if (function2 == null) {
            throw new IllegalStateException("Invalid restart scope");
        }
        function2.invoke(composer, 1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0058 A[LOOP:0: B:9:0x001c->B:22:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x005b A[SYNTHETIC] */
    public final Function1<pr1, Unit> f(final int token) {
        final d58<Object> d58Var = this.trackedInstances;
        if (d58Var != null && !s()) {
            Object[] objArr = d58Var.keys;
            int[] iArr = d58Var.values;
            long[] jArr = d58Var.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                int i5 = (i2 << 3) + i4;
                                Object obj = objArr[i5];
                                if (iArr[i5] != token) {
                                    return new Function1() { // from class: com.google.android.raa
                                        public final Object invoke(Object obj2) {
                                            return b0.g(this.a, token, d58Var, (pr1) obj2);
                                        }
                                    };
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 == 8) {
                            if (i2 != length) {
                                i2++;
                            }
                        }
                    } else if (i2 != length) {
                        i2++;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final mg getAnchor() {
        return this.anchor;
    }

    public final boolean i() {
        return this.block != null;
    }

    @Override // com.google.inputmethod.qaa
    public void invalidate() {
        taa taaVar = this.owner;
        if (taaVar != null) {
            taaVar.m(this, null);
        }
    }

    public final boolean j() {
        return (this.flags & 2) != 0;
    }

    public final boolean k() {
        return (this.flags & 4) != 0;
    }

    public final boolean l() {
        return (this.flags & 64) != 0;
    }

    public final boolean m() {
        return (this.flags & 256) != 0;
    }

    public final boolean n() {
        return (this.flags & 8) != 0;
    }

    public final boolean p() {
        return (this.flags & 1024) != 0;
    }

    public final boolean q() {
        return (this.flags & 512) != 0;
    }

    public final boolean r() {
        return (this.flags & 128) != 0;
    }

    public final boolean s() {
        return (this.flags & 16) != 0;
    }

    public final boolean t() {
        return (this.flags & 1) != 0;
    }

    public final boolean u() {
        if (this.owner != null) {
            mg mgVar = this.anchor;
            if (mgVar != null ? mgVar.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final InvalidationResult v(Object value) {
        InvalidationResult invalidationResultM;
        taa taaVar = this.owner;
        return (taaVar == null || (invalidationResultM = taaVar.m(this, value)) == null) ? InvalidationResult.IGNORED : invalidationResultM;
    }

    public final boolean w() {
        return this.trackedDependencies != null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x006e A[LOOP:0: B:19:0x002f->B:33:0x006e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x0071 A[EDGE_INSN: B:36:0x0071->B:34:0x0071 BREAK  A[LOOP:0: B:19:0x002f->B:33:0x006e], SYNTHETIC] */
    public final boolean x(Object instances) {
        k58<j<?>, Object> k58Var;
        if (instances == null || (k58Var = this.trackedDependencies) == null) {
            return true;
        }
        if (instances instanceof j) {
            return d((j) instances, k58Var);
        }
        if (!(instances instanceof ScatterSet)) {
            return true;
        }
        ScatterSet scatterSet = (ScatterSet) instances;
        if (scatterSet.e()) {
            Object[] objArr = scatterSet.elements;
            long[] jArr = scatterSet.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i2 << 3) + i4];
                                if (!(obj instanceof j) || d((j) obj, k58Var)) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                        if (i2 != length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return false;
    }

    public final void y(j<?> instance, Object value) {
        k58<j<?>, Object> k58Var = this.trackedDependencies;
        if (k58Var == null) {
            k58Var = new k58<>(0, 1, null);
            this.trackedDependencies = k58Var;
        }
        k58Var.x(instance, value);
    }

    public final boolean z(Object instance) {
        int i2 = 0;
        if (o()) {
            return false;
        }
        d58<Object> d58Var = this.trackedInstances;
        int i3 = 1;
        if (d58Var == null) {
            d58Var = new d58<>(i2, i3, null);
            this.trackedInstances = d58Var;
        }
        return d58Var.q(instance, this.currentToken, -1) == this.currentToken;
    }
}
