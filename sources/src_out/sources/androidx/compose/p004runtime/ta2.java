package androidx.compose.p004runtime;

import androidx.collection.ScatterSet;
import androidx.collection.d;
import androidx.compose.p004runtime.collection.ScatterSetWrapper;
import androidx.compose.p004runtime.snapshots.e;
import androidx.compose.p004runtime.snapshots.g;
import com.google.android.g41;
import com.google.android.lq2;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.inputmethod.b7c;
import com.google.inputmethod.nn8;
import com.google.inputmethod.x22;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.j;
import kotlinx.coroutines.s;
import kotlinx.coroutines.u;

/* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2, reason: from Kotlin metadata */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {1081}, m = "invokeSuspend", v = 1)
final class ta2 extends SuspendLambda implements Function2<com.google.android.ta2, q22<? super Unit>, Object> {
    final /* synthetic */ ps4<com.google.android.ta2, v, q22<? super Unit>, Object> $block;
    final /* synthetic */ v $parentFrameClock;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$2, reason: from Kotlin metadata and collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
    @lq2(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", f = "Recomposer.kt", l = {1081}, m = "invokeSuspend", v = 1)
    static final class C00442 extends SuspendLambda implements Function2<com.google.android.ta2, q22<? super Unit>, Object> {
        final /* synthetic */ ps4<com.google.android.ta2, v, q22<? super Unit>, Object> $block;
        final /* synthetic */ v $parentFrameClock;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00442(ps4<? super com.google.android.ta2, ? super v, ? super q22<? super Unit>, ? extends Object> ps4Var, v vVar, q22<? super C00442> q22Var) {
            super(2, q22Var);
            this.$block = ps4Var;
            this.$parentFrameClock = vVar;
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            C00442 c00442 = new C00442(this.$block, this.$parentFrameClock, q22Var);
            c00442.L$0 = obj;
            return c00442;
        }

        public final Object invoke(com.google.android.ta2 ta2Var, q22<? super Unit> q22Var) {
            return create(ta2Var, q22Var).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object objG = a.g();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                com.google.android.ta2 ta2Var = (com.google.android.ta2) this.L$0;
                ps4<com.google.android.ta2, v, q22<? super Unit>, Object> ps4Var = this.$block;
                v vVar = this.$parentFrameClock;
                this.label = 1;
                if (ps4Var.invoke(ta2Var, vVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ta2(Recomposer recomposer, ps4<? super com.google.android.ta2, ? super v, ? super q22<? super Unit>, ? extends Object> ps4Var, v vVar, q22<? super ta2> q22Var) {
        super(2, q22Var);
        this.this$0 = recomposer;
        this.$block = ps4Var;
        this.$parentFrameClock = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x007c A[Catch: all -> 0x006f, LOOP:0: B:11:0x0033->B:28:0x007c, LOOP_END, TryCatch #0 {all -> 0x006f, blocks: (B:4:0x0007, B:6:0x0019, B:8:0x0022, B:11:0x0033, B:13:0x0043, B:15:0x004f, B:17:0x0058, B:19:0x0061, B:24:0x0071, B:25:0x0074, B:28:0x007c, B:38:0x00a5, B:29:0x007f, B:30:0x0085, B:32:0x008b, B:34:0x0093, B:37:0x00a1), top: B:48:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a5 A[EDGE_INSN: B:51:0x00a5->B:38:0x00a5 BREAK  A[LOOP:0: B:11:0x0033->B:28:0x007c], SYNTHETIC] */
    public static final Unit l(Recomposer recomposer, Set set, g gVar) {
        g41 g41VarP0;
        synchronized (recomposer.stateLock) {
            try {
                if (((Recomposer.State) recomposer._state.getValue()).compareTo(Recomposer.State.Idle) >= 0) {
                    d dVar = recomposer.snapshotInvalidations;
                    if (set instanceof ScatterSetWrapper) {
                        ScatterSet scatterSetB = ((ScatterSetWrapper) set).b();
                        Object[] objArr = scatterSetB.elements;
                        long[] jArr = scatterSetB.metadata;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i != length) {
                                        break;
                                        break;
                                    }
                                    i++;
                                } else {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            Object obj = objArr[(i << 3) + i3];
                                            if (!(obj instanceof b7c) || ((b7c) obj).g(e.a(1))) {
                                                dVar.h(obj);
                                            }
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    }
                                    if (i != length) {
                                        break;
                                    }
                                    i++;
                                }
                            }
                        }
                    } else {
                        for (Object obj2 : set) {
                            if (!(obj2 instanceof b7c) || ((b7c) obj2).g(e.a(1))) {
                                dVar.h(obj2);
                            }
                        }
                    }
                    g41VarP0 = recomposer.p0();
                } else {
                    g41VarP0 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (g41VarP0 != null) {
            Result.a aVar = Result.a;
            g41VarP0.resumeWith(Result.b(Unit.a));
        }
        return Unit.a;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        ta2 ta2Var = new ta2(this.this$0, this.$block, this.$parentFrameClock, q22Var);
        ta2Var.L$0 = obj;
        return ta2Var;
    }

    public final Object invoke(com.google.android.ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0096 A[Catch: all -> 0x009a, TryCatch #3 {all -> 0x009a, blocks: (B:24:0x0090, B:26:0x0096, B:29:0x009c, B:31:0x00a2, B:32:0x00a7), top: B:60:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a2 A[Catch: all -> 0x009a, TryCatch #3 {all -> 0x009a, blocks: (B:24:0x0090, B:26:0x0096, B:29:0x009c, B:31:0x00a2, B:32:0x00a7), top: B:60:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00cc A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:40:0x00c6, B:42:0x00cc, B:45:0x00d2, B:47:0x00d8, B:48:0x00dd), top: B:54:0x00c6 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d8 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:40:0x00c6, B:42:0x00cc, B:45:0x00d2, B:47:0x00d8, B:48:0x00dd), top: B:54:0x00c6 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) throws Throwable {
        s sVarK;
        nn8 nn8Var;
        Throwable th;
        Object obj2;
        Recomposer recomposer;
        Object obj3;
        Recomposer recomposer2;
        Object objG = a.g();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nn8Var = (nn8) this.L$1;
            sVarK = (s) this.L$0;
            try {
                f.b(obj);
                nn8Var.dispose();
                obj3 = this.this$0.stateLock;
                recomposer2 = this.this$0;
                synchronized (obj3) {
                    try {
                        if (recomposer2.runnerJob == sVarK) {
                            recomposer2.runnerJob = null;
                        }
                        if (recomposer2.p0() != null) {
                            e.b("called outside of runRecomposeAndApplyChanges");
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                Recomposer.INSTANCE.d(this.this$0.recomposerInfo);
                return Unit.a;
            } catch (Throwable th3) {
                th = th3;
                nn8Var.dispose();
                obj2 = this.this$0.stateLock;
                recomposer = this.this$0;
                synchronized (obj2) {
                    try {
                        if (recomposer.runnerJob == sVarK) {
                            recomposer.runnerJob = null;
                        }
                        if (recomposer.p0() != null) {
                            e.b("called outside of runRecomposeAndApplyChanges");
                        }
                        Unit unit2 = Unit.a;
                        Recomposer.INSTANCE.d(this.this$0.recomposerInfo);
                        throw th;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
        }
        f.b(obj);
        sVarK = u.k(((com.google.android.ta2) this.L$0).getCoroutineContext());
        this.this$0.U0(sVarK);
        g.Companion companion = g.INSTANCE;
        final Recomposer recomposer3 = this.this$0;
        nn8 nn8VarH = companion.h(new Function2() { // from class: androidx.compose.runtime.c0
            public final Object invoke(Object obj4, Object obj5) {
                return ta2.l(recomposer3, (Set) obj4, (g) obj5);
            }
        });
        Recomposer.INSTANCE.c(this.this$0.recomposerInfo);
        try {
            List listC0 = this.this$0.C0();
            int size = listC0.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((x22) listC0.get(i2)).w();
            }
            C00442 c00442 = new C00442(this.$block, this.$parentFrameClock, null);
            this.L$0 = sVarK;
            this.L$1 = nn8VarH;
            this.label = 1;
            if (j.g(c00442, this) == objG) {
                return objG;
            }
            nn8Var = nn8VarH;
            nn8Var.dispose();
            obj3 = this.this$0.stateLock;
            recomposer2 = this.this$0;
            synchronized (obj3) {
                if (recomposer2.runnerJob == sVarK) {
                    recomposer2.runnerJob = null;
                }
                if (recomposer2.p0() != null) {
                    e.b("called outside of runRecomposeAndApplyChanges");
                }
                Unit unit3 = Unit.a;
                Recomposer.INSTANCE.d(this.this$0.recomposerInfo);
                return Unit.a;
            }
        } catch (Throwable th5) {
            nn8Var = nn8VarH;
            th = th5;
            nn8Var.dispose();
            obj2 = this.this$0.stateLock;
            recomposer = this.this$0;
            synchronized (obj2) {
                if (recomposer.runnerJob == sVarK) {
                    recomposer.runnerJob = null;
                }
                if (recomposer.p0() != null) {
                    e.b("called outside of runRecomposeAndApplyChanges");
                }
                Unit unit4 = Unit.a;
            }
            Recomposer.INSTANCE.d(this.this$0.recomposerInfo);
            throw th;
        }
    }
}
