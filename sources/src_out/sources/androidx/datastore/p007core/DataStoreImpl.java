package androidx.datastore.p007core;

import androidx.datastore.p007core.DataStoreImpl;
import androidx.datastore.p007core.b;
import com.google.android.a68;
import com.google.android.ai4;
import com.google.android.hl1;
import com.google.android.jl1;
import com.google.android.ox3;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.android.ut0;
import com.google.android.x58;
import com.google.inputmethod.f26;
import com.google.inputmethod.gn2;
import com.google.inputmethod.j9c;
import com.google.inputmethod.k9c;
import com.google.inputmethod.nw5;
import com.google.inputmethod.o6c;
import com.google.inputmethod.ol2;
import com.google.inputmethod.t04;
import com.google.inputmethod.ua4;
import com.google.inputmethod.ya2;
import com.google.inputmethod.ym2;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.c;
import kotlin.collections.m;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 d*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002e-Ba\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u00120\b\u0002\u0010\n\u001a*\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0013\u0010\u0012J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u001b\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u001d\u0010\u0012J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\u001f\u0010\u0012J<\u0010#\u001a\u00028\u00002\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0082@¢\u0006\u0004\b#\u0010$J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010%\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b'\u0010\u0018JI\u0010+\u001a\u00028\u0001\"\u0004\b\u0001\u0010(2\u0006\u0010%\u001a\u00020\u00142\u001c\u0010*\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u00020)H\u0082@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b+\u0010,J4\u0010-\u001a\u00028\u00002\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006H\u0096@¢\u0006\u0004\b-\u0010.J \u00102\u001a\u0002012\u0006\u0010/\u001a\u00028\u00002\u0006\u00100\u001a\u00020\u0014H\u0080@¢\u0006\u0004\b2\u00103R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00104R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u0010>\u001a\b\u0012\u0004\u0012\u00028\u0000098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00102R\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001e\u0010P\u001a\f0MR\b\u0012\u0004\u0012\u00028\u00000\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR \u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000R0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001b\u0010Z\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010T\u001a\u0004\bX\u0010YR \u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R!\u0010c\u001a\b\u0012\u0004\u0012\u00028\u00000R8@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\b_\u0010`*\u0004\ba\u0010b¨\u0006f"}, d2 = {"Landroidx/datastore/core/DataStoreImpl;", "T", "", "Lcom/google/android/j9c;", "storage", "", "Lkotlin/Function2;", "Lcom/google/android/nw5;", "Lcom/google/android/q22;", "", "initTasksList", "Lcom/google/android/ya2;", "corruptionHandler", "Lcom/google/android/ta2;", "scope", "<init>", "(Lcom/google/android/j9c;Ljava/util/List;Lcom/google/android/ya2;Lcom/google/android/ta2;)V", "y", "(Lcom/google/android/q22;)Ljava/lang/Object;", "t", "", "requireLock", "Lcom/google/android/o6c;", "D", "(ZLcom/google/android/q22;)Ljava/lang/Object;", "Landroidx/datastore/core/b$a;", "update", "x", "(Landroidx/datastore/core/b$a;Lcom/google/android/q22;)Ljava/lang/Object;", "z", "A", "B", "transform", "Lkotlin/coroutines/CoroutineContext;", "callerContext", "F", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;Lcom/google/android/q22;)Ljava/lang/Object;", "hasWriteFileLock", "Lcom/google/android/ol2;", "C", "R", "Lkotlin/Function1;", "block", "u", "(ZLkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "a", "(Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "newData", "updateCache", "", "I", "(Ljava/lang/Object;ZLcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/j9c;", "b", "Lcom/google/android/ya2;", "c", "Lcom/google/android/ta2;", "Lcom/google/android/ai4;", "d", "Lcom/google/android/ai4;", "getData", "()Lcom/google/android/ai4;", "data", "Lcom/google/android/x58;", "e", "Lcom/google/android/x58;", "collectorMutex", "f", "collectorCounter", "Lkotlinx/coroutines/s;", "g", "Lkotlinx/coroutines/s;", "collectorJob", "Lcom/google/android/gn2;", "h", "Lcom/google/android/gn2;", "inMemoryCache", "Landroidx/datastore/core/DataStoreImpl$InitDataStore;", "i", "Landroidx/datastore/core/DataStoreImpl$InitDataStore;", "readAndInit", "Lkotlin/Lazy;", "Lcom/google/android/k9c;", "j", "Lkotlin/Lazy;", "storageConnectionDelegate", "Lcom/google/android/f26;", "k", "v", "()Lcom/google/android/f26;", "coordinator", "Landroidx/datastore/core/SimpleActor;", "l", "Landroidx/datastore/core/SimpleActor;", "writeActor", "w", "()Lcom/google/android/k9c;", "getStorageConnection$datastore_core$delegate", "(Landroidx/datastore/core/DataStoreImpl;)Ljava/lang/Object;", "storageConnection", "m", "InitDataStore", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataStoreImpl<T> implements ym2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final j9c<T> storage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ya2<T> corruptionHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ta2 scope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ai4<T> data;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final x58 collectorMutex;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int collectorCounter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private s collectorJob;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final gn2<T> inMemoryCache;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final DataStoreImpl<T>.InitDataStore readAndInit;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Lazy<k9c<T>> storageConnectionDelegate;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Lazy coordinator;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final SimpleActor<b.a<T>> writeActor;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B7\u0012.\u0010\b\u001a*\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0094@¢\u0006\u0004\b\u000b\u0010\fR@\u0010\u000f\u001a,\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/datastore/core/DataStoreImpl$InitDataStore;", "Landroidx/datastore/core/RunOnce;", "", "Lkotlin/Function2;", "Lcom/google/android/nw5;", "Lcom/google/android/q22;", "", "", "initTasksList", "<init>", "(Landroidx/datastore/core/DataStoreImpl;Ljava/util/List;)V", "b", "(Lcom/google/android/q22;)Ljava/lang/Object;", "c", "Ljava/util/List;", "initTasks", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class InitDataStore extends RunOnce {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private List<? extends Function2<? super nw5<T>, ? super q22<? super Unit>, ? extends Object>> initTasks;
        final /* synthetic */ DataStoreImpl<T> d;

        public InitDataStore(DataStoreImpl dataStoreImpl, List<? extends Function2<? super nw5<T>, ? super q22<? super Unit>, ? extends Object>> list) {
            Intrinsics.checkNotNullParameter(list, "initTasksList");
            this.d = dataStoreImpl;
            this.initTasks = m.y1(list);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0063  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
        
            if (r7 == r1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
        
            if (r7 == r1) goto L27;
         */
        @Override // androidx.datastore.p007core.RunOnce
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected java.lang.Object b(com.google.android.q22<? super kotlin.Unit> r7) throws androidx.datastore.p007core.CorruptionException {
            /*
                r6 = this;
                boolean r0 = r7 instanceof androidx.datastore.p007core.DataStoreImpl$InitDataStore$doRun$1
                if (r0 == 0) goto L13
                r0 = r7
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1 r0 = (androidx.datastore.p007core.DataStoreImpl$InitDataStore$doRun$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1 r0 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1
                r0.<init>(r6, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.g()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.f.b(r7)
                goto L60
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L34:
                kotlin.f.b(r7)
                goto L6f
            L38:
                kotlin.f.b(r7)
                java.util.List<? extends kotlin.jvm.functions.Function2<? super com.google.android.nw5<T>, ? super com.google.android.q22<? super kotlin.Unit>, ? extends java.lang.Object>> r7 = r6.initTasks
                if (r7 == 0) goto L63
                kotlin.jvm.internal.Intrinsics.g(r7)
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L49
                goto L63
            L49:
                androidx.datastore.core.DataStoreImpl<T> r7 = r6.d
                com.google.android.f26 r7 = androidx.datastore.p007core.DataStoreImpl.g(r7)
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1 r2 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1
                androidx.datastore.core.DataStoreImpl<T> r4 = r6.d
                r5 = 0
                r2.<init>(r4, r6, r5)
                r0.label = r3
                java.lang.Object r7 = r7.d(r2, r0)
                if (r7 != r1) goto L60
                goto L6e
            L60:
                com.google.android.ol2 r7 = (com.google.inputmethod.ol2) r7
                goto L71
            L63:
                androidx.datastore.core.DataStoreImpl<T> r7 = r6.d
                r0.label = r4
                r2 = 0
                java.lang.Object r7 = androidx.datastore.p007core.DataStoreImpl.p(r7, r2, r0)
                if (r7 != r1) goto L6f
            L6e:
                return r1
            L6f:
                com.google.android.ol2 r7 = (com.google.inputmethod.ol2) r7
            L71:
                androidx.datastore.core.DataStoreImpl<T> r0 = r6.d
                com.google.android.gn2 r0 = androidx.datastore.p007core.DataStoreImpl.h(r0)
                r0.c(r7)
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.InitDataStore.b(com.google.android.q22):java.lang.Object");
        }
    }

    public DataStoreImpl(j9c<T> j9cVar, List<? extends Function2<? super nw5<T>, ? super q22<? super Unit>, ? extends Object>> list, ya2<T> ya2Var, ta2 ta2Var) {
        Intrinsics.checkNotNullParameter(j9cVar, "storage");
        Intrinsics.checkNotNullParameter(list, "initTasksList");
        Intrinsics.checkNotNullParameter(ya2Var, "corruptionHandler");
        Intrinsics.checkNotNullParameter(ta2Var, "scope");
        this.storage = j9cVar;
        this.corruptionHandler = ya2Var;
        this.scope = ta2Var;
        this.data = d.O(new DataStoreImpl$data$1(this, null));
        this.collectorMutex = a68.b(false, 1, (Object) null);
        this.inMemoryCache = new gn2<>();
        this.readAndInit = new InitDataStore(this, list);
        this.storageConnectionDelegate = c.b(new Function0() { // from class: com.google.android.cn2
            public final Object invoke() {
                return DataStoreImpl.E(this.a);
            }
        });
        this.coordinator = c.b(new Function0() { // from class: com.google.android.dn2
            public final Object invoke() {
                return DataStoreImpl.s(this.a);
            }
        });
        this.writeActor = new SimpleActor<>(ta2Var, new Function1() { // from class: com.google.android.en2
            public final Object invoke(Object obj) {
                return DataStoreImpl.G(this.a, (Throwable) obj);
            }
        }, new Function2() { // from class: com.google.android.fn2
            public final Object invoke(Object obj, Object obj2) {
                return DataStoreImpl.H((b.a) obj, (Throwable) obj2);
            }
        }, new DataStoreImpl$writeActor$3(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:42:0x00be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        if (r9 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
    
        if (r9 == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(boolean r8, com.google.android.q22<? super com.google.inputmethod.o6c<T>> r9) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.p007core.DataStoreImpl.A(boolean, com.google.android.q22):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B(q22<? super T> q22Var) {
        return StorageConnectionKt.a(w(), q22Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x0090 A[Catch: CorruptionException -> 0x005e, TryCatch #0 {CorruptionException -> 0x005e, blocks: (B:19:0x0059, B:54:0x00e8, B:24:0x0063, B:51:0x00cd, B:32:0x0078, B:40:0x0090, B:42:0x0096, B:36:0x0081, B:48:0x00bd), top: B:74:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0095  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:64:0x0123  */
    /* JADX WARN: Code duplicated, block: B:67:0x012b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C(boolean z, q22<? super ol2<T>> q22Var) throws CorruptionException {
        DataStoreImpl$readDataOrHandleCorruption$1 dataStoreImpl$readDataOrHandleCorruption$1;
        Ref.ObjectRef objectRef;
        CorruptionException corruptionException;
        Ref.ObjectRef objectRef2;
        Ref.IntRef intRef;
        CorruptionException corruptionException2;
        DataStoreImpl$readDataOrHandleCorruption$3 dataStoreImpl$readDataOrHandleCorruption$3;
        Ref.IntRef intRef2;
        Ref.ObjectRef objectRef3;
        int iHashCode;
        Object objA;
        boolean z2;
        int i;
        Object obj;
        if (q22Var instanceof DataStoreImpl$readDataOrHandleCorruption$1) {
            dataStoreImpl$readDataOrHandleCorruption$1 = (DataStoreImpl$readDataOrHandleCorruption$1) q22Var;
            int i2 = dataStoreImpl$readDataOrHandleCorruption$1.label;
            if ((i2 & t04.INVALID_ID) != 0) {
                dataStoreImpl$readDataOrHandleCorruption$1.label = i2 - t04.INVALID_ID;
            } else {
                dataStoreImpl$readDataOrHandleCorruption$1 = new DataStoreImpl$readDataOrHandleCorruption$1(this, q22Var);
            }
        } else {
            dataStoreImpl$readDataOrHandleCorruption$1 = new DataStoreImpl$readDataOrHandleCorruption$1(this, q22Var);
        }
        Object objA2 = dataStoreImpl$readDataOrHandleCorruption$1.result;
        Object objG = a.g();
        try {
            switch (dataStoreImpl$readDataOrHandleCorruption$1.label) {
                case 0:
                    f.b(objA2);
                    if (z) {
                        dataStoreImpl$readDataOrHandleCorruption$1.Z$0 = z;
                        dataStoreImpl$readDataOrHandleCorruption$1.label = 1;
                        objA2 = B(dataStoreImpl$readDataOrHandleCorruption$1);
                        if (objA2 != objG) {
                            if (objA2 != null) {
                                iHashCode = objA2.hashCode();
                            } else {
                                iHashCode = 0;
                            }
                            f26 f26VarV = v();
                            dataStoreImpl$readDataOrHandleCorruption$1.L$0 = objA2;
                            dataStoreImpl$readDataOrHandleCorruption$1.Z$0 = z;
                            dataStoreImpl$readDataOrHandleCorruption$1.I$0 = iHashCode;
                            dataStoreImpl$readDataOrHandleCorruption$1.label = 2;
                            objA = f26VarV.a(dataStoreImpl$readDataOrHandleCorruption$1);
                            if (objA != objG) {
                                int i3 = iHashCode;
                                z2 = z;
                                i = i3;
                                obj = objA2;
                                objA2 = objA;
                                return new ol2(obj, i, ((Number) objA2).intValue());
                            }
                        }
                    } else {
                        f26 f26VarV2 = v();
                        dataStoreImpl$readDataOrHandleCorruption$1.Z$0 = z;
                        dataStoreImpl$readDataOrHandleCorruption$1.label = 3;
                        objA2 = f26VarV2.a(dataStoreImpl$readDataOrHandleCorruption$1);
                        if (objA2 != objG) {
                            int iIntValue = ((Number) objA2).intValue();
                            f26 f26VarV3 = v();
                            DataStoreImpl$readDataOrHandleCorruption$2 dataStoreImpl$readDataOrHandleCorruption$2 = new DataStoreImpl$readDataOrHandleCorruption$2(this, iIntValue, null);
                            dataStoreImpl$readDataOrHandleCorruption$1.Z$0 = z;
                            dataStoreImpl$readDataOrHandleCorruption$1.label = 4;
                            objA2 = f26VarV3.c(dataStoreImpl$readDataOrHandleCorruption$2, dataStoreImpl$readDataOrHandleCorruption$1);
                            if (objA2 == objG) {
                            }
                            return (ol2) objA2;
                        }
                    }
                    return objG;
                case 1:
                    z = dataStoreImpl$readDataOrHandleCorruption$1.Z$0;
                    f.b(objA2);
                    if (objA2 != null) {
                        iHashCode = objA2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    f26 f26VarV4 = v();
                    dataStoreImpl$readDataOrHandleCorruption$1.L$0 = objA2;
                    dataStoreImpl$readDataOrHandleCorruption$1.Z$0 = z;
                    dataStoreImpl$readDataOrHandleCorruption$1.I$0 = iHashCode;
                    dataStoreImpl$readDataOrHandleCorruption$1.label = 2;
                    objA = f26VarV4.a(dataStoreImpl$readDataOrHandleCorruption$1);
                    if (objA != objG) {
                        int i4 = iHashCode;
                        z2 = z;
                        i = i4;
                        obj = objA2;
                        objA2 = objA;
                        return new ol2(obj, i, ((Number) objA2).intValue());
                    }
                    return objG;
                case 2:
                    i = dataStoreImpl$readDataOrHandleCorruption$1.I$0;
                    z2 = dataStoreImpl$readDataOrHandleCorruption$1.Z$0;
                    obj = dataStoreImpl$readDataOrHandleCorruption$1.L$0;
                    try {
                        f.b(objA2);
                        return new ol2(obj, i, ((Number) objA2).intValue());
                    } catch (CorruptionException e) {
                        e = e;
                        z = z2;
                        objectRef = new Ref.ObjectRef();
                        ya2<T> ya2Var = this.corruptionHandler;
                        dataStoreImpl$readDataOrHandleCorruption$1.L$0 = e;
                        dataStoreImpl$readDataOrHandleCorruption$1.L$1 = objectRef;
                        dataStoreImpl$readDataOrHandleCorruption$1.L$2 = objectRef;
                        dataStoreImpl$readDataOrHandleCorruption$1.Z$0 = z;
                        dataStoreImpl$readDataOrHandleCorruption$1.label = 5;
                        Object objA3 = ya2Var.a(e, dataStoreImpl$readDataOrHandleCorruption$1);
                        if (objA3 != objG) {
                            corruptionException = e;
                            objA2 = objA3;
                            objectRef2 = objectRef;
                            objectRef2.element = objA2;
                            intRef = new Ref.IntRef();
                            try {
                                dataStoreImpl$readDataOrHandleCorruption$3 = new DataStoreImpl$readDataOrHandleCorruption$3(objectRef, this, intRef, null);
                                dataStoreImpl$readDataOrHandleCorruption$1.L$0 = corruptionException;
                                dataStoreImpl$readDataOrHandleCorruption$1.L$1 = objectRef;
                                dataStoreImpl$readDataOrHandleCorruption$1.L$2 = intRef;
                                dataStoreImpl$readDataOrHandleCorruption$1.label = 6;
                                if (u(z, dataStoreImpl$readDataOrHandleCorruption$3, dataStoreImpl$readDataOrHandleCorruption$1) != objG) {
                                    intRef2 = intRef;
                                    objectRef3 = objectRef;
                                    Object obj2 = objectRef3.element;
                                    return new ol2(obj2, obj2 != null ? obj2.hashCode() : 0, intRef2.element);
                                }
                            } catch (Throwable th) {
                                th = th;
                                corruptionException2 = corruptionException;
                                ox3.a(corruptionException2, th);
                                throw corruptionException2;
                            }
                        }
                        return objG;
                    }
                case 3:
                    z = dataStoreImpl$readDataOrHandleCorruption$1.Z$0;
                    f.b(objA2);
                    int iIntValue2 = ((Number) objA2).intValue();
                    f26 f26VarV5 = v();
                    DataStoreImpl$readDataOrHandleCorruption$2 dataStoreImpl$readDataOrHandleCorruption$4 = new DataStoreImpl$readDataOrHandleCorruption$2(this, iIntValue2, null);
                    dataStoreImpl$readDataOrHandleCorruption$1.Z$0 = z;
                    dataStoreImpl$readDataOrHandleCorruption$1.label = 4;
                    objA2 = f26VarV5.c(dataStoreImpl$readDataOrHandleCorruption$4, dataStoreImpl$readDataOrHandleCorruption$1);
                    if (objA2 == objG) {
                        return objG;
                    }
                    return (ol2) objA2;
                case 4:
                    boolean z3 = dataStoreImpl$readDataOrHandleCorruption$1.Z$0;
                    f.b(objA2);
                    return (ol2) objA2;
                case 5:
                    z = dataStoreImpl$readDataOrHandleCorruption$1.Z$0;
                    Ref.ObjectRef objectRef4 = (Ref.ObjectRef) dataStoreImpl$readDataOrHandleCorruption$1.L$2;
                    Ref.ObjectRef objectRef5 = (Ref.ObjectRef) dataStoreImpl$readDataOrHandleCorruption$1.L$1;
                    corruptionException = (CorruptionException) dataStoreImpl$readDataOrHandleCorruption$1.L$0;
                    f.b(objA2);
                    objectRef2 = objectRef4;
                    objectRef = objectRef5;
                    objectRef2.element = objA2;
                    intRef = new Ref.IntRef();
                    dataStoreImpl$readDataOrHandleCorruption$3 = new DataStoreImpl$readDataOrHandleCorruption$3(objectRef, this, intRef, null);
                    dataStoreImpl$readDataOrHandleCorruption$1.L$0 = corruptionException;
                    dataStoreImpl$readDataOrHandleCorruption$1.L$1 = objectRef;
                    dataStoreImpl$readDataOrHandleCorruption$1.L$2 = intRef;
                    dataStoreImpl$readDataOrHandleCorruption$1.label = 6;
                    if (u(z, dataStoreImpl$readDataOrHandleCorruption$3, dataStoreImpl$readDataOrHandleCorruption$1) != objG) {
                        intRef2 = intRef;
                        objectRef3 = objectRef;
                        Object obj3 = objectRef3.element;
                        return new ol2(obj3, obj3 != null ? obj3.hashCode() : 0, intRef2.element);
                    }
                    return objG;
                case 6:
                    intRef2 = (Ref.IntRef) dataStoreImpl$readDataOrHandleCorruption$1.L$2;
                    objectRef3 = (Ref.ObjectRef) dataStoreImpl$readDataOrHandleCorruption$1.L$1;
                    corruptionException2 = (CorruptionException) dataStoreImpl$readDataOrHandleCorruption$1.L$0;
                    try {
                        f.b(objA2);
                        Object obj4 = objectRef3.element;
                        return new ol2(obj4, obj4 != null ? obj4.hashCode() : 0, intRef2.element);
                    } catch (Throwable th2) {
                        th = th2;
                        ox3.a(corruptionException2, th);
                        throw corruptionException2;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (CorruptionException e2) {
            e = e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D(boolean z, q22<? super o6c<T>> q22Var) {
        return rw0.g(this.scope.getCoroutineContext(), new DataStoreImpl$readState$2(this, z, null), q22Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k9c E(DataStoreImpl dataStoreImpl) {
        return dataStoreImpl.storage.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object F(Function2<? super T, ? super q22<? super T>, ? extends Object> function2, CoroutineContext coroutineContext, q22<? super T> q22Var) {
        return v().d(new DataStoreImpl$transformAndWrite$2(this, coroutineContext, function2, null), q22Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(DataStoreImpl dataStoreImpl, Throwable th) {
        if (th != null) {
            dataStoreImpl.inMemoryCache.c(new ua4(th));
        }
        if (dataStoreImpl.storageConnectionDelegate.isInitialized()) {
            dataStoreImpl.w().close();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(b.a aVar, Throwable th) {
        Intrinsics.checkNotNullParameter(aVar, "msg");
        hl1<T> hl1VarA = aVar.a();
        if (th == null) {
            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        hl1VarA.a(th);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f26 s(DataStoreImpl dataStoreImpl) {
        return dataStoreImpl.w().getCoordinator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(q22<? super Unit> q22Var) {
        DataStoreImpl$decrementCollector$1 dataStoreImpl$decrementCollector$1;
        x58 x58Var;
        if (q22Var instanceof DataStoreImpl$decrementCollector$1) {
            dataStoreImpl$decrementCollector$1 = (DataStoreImpl$decrementCollector$1) q22Var;
            int i = dataStoreImpl$decrementCollector$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                dataStoreImpl$decrementCollector$1.label = i - t04.INVALID_ID;
            } else {
                dataStoreImpl$decrementCollector$1 = new DataStoreImpl$decrementCollector$1(this, q22Var);
            }
        } else {
            dataStoreImpl$decrementCollector$1 = new DataStoreImpl$decrementCollector$1(this, q22Var);
        }
        Object obj = dataStoreImpl$decrementCollector$1.result;
        Object objG = a.g();
        int i2 = dataStoreImpl$decrementCollector$1.label;
        if (i2 == 0) {
            f.b(obj);
            x58 x58Var2 = this.collectorMutex;
            dataStoreImpl$decrementCollector$1.L$0 = x58Var2;
            dataStoreImpl$decrementCollector$1.label = 1;
            if (x58Var2.g((Object) null, dataStoreImpl$decrementCollector$1) == objG) {
                return objG;
            }
            x58Var = x58Var2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x58Var = (x58) dataStoreImpl$decrementCollector$1.L$0;
            f.b(obj);
        }
        try {
            int i3 = this.collectorCounter - 1;
            this.collectorCounter = i3;
            if (i3 == 0) {
                s sVar = this.collectorJob;
                if (sVar != null) {
                    s.a.a(sVar, (CancellationException) null, 1, (Object) null);
                }
                this.collectorJob = null;
            }
            Unit unit = Unit.a;
            return Unit.a;
        } finally {
            x58Var.h((Object) null);
        }
    }

    private final <R> Object u(boolean z, Function1<? super q22<? super R>, ? extends Object> function1, q22<? super R> q22Var) {
        return z ? function1.invoke(q22Var) : v().d(new DataStoreImpl$doWithWriteFileLock$2(function1, null), q22Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f26 v() {
        return (f26) this.coordinator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(b.a<T> aVar, q22<? super Unit> q22Var) {
        DataStoreImpl$handleUpdate$1 dataStoreImpl$handleUpdate$1;
        Throwable th;
        hl1<T> hl1Var;
        Object objB;
        if (q22Var instanceof DataStoreImpl$handleUpdate$1) {
            dataStoreImpl$handleUpdate$1 = (DataStoreImpl$handleUpdate$1) q22Var;
            int i = dataStoreImpl$handleUpdate$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                dataStoreImpl$handleUpdate$1.label = i - t04.INVALID_ID;
            } else {
                dataStoreImpl$handleUpdate$1 = new DataStoreImpl$handleUpdate$1(this, q22Var);
            }
        } else {
            dataStoreImpl$handleUpdate$1 = new DataStoreImpl$handleUpdate$1(this, q22Var);
        }
        Object obj = dataStoreImpl$handleUpdate$1.result;
        Object objG = a.g();
        int i2 = dataStoreImpl$handleUpdate$1.label;
        if (i2 == 0) {
            f.b(obj);
            hl1<T> hl1VarA = aVar.a();
            try {
                Result.a aVar2 = Result.a;
                CoroutineContext coroutineContextPlus = aVar.getCallerContext().plus(dataStoreImpl$handleUpdate$1.getContext());
                DataStoreImpl$handleUpdate$2$1 dataStoreImpl$handleUpdate$2$1 = new DataStoreImpl$handleUpdate$2$1(this, aVar, null);
                dataStoreImpl$handleUpdate$1.L$0 = hl1VarA;
                dataStoreImpl$handleUpdate$1.label = 1;
                Object objG2 = rw0.g(coroutineContextPlus, dataStoreImpl$handleUpdate$2$1, dataStoreImpl$handleUpdate$1);
                if (objG2 == objG) {
                    return objG;
                }
                obj = objG2;
                hl1Var = hl1VarA;
            } catch (Throwable th2) {
                th = th2;
                hl1Var = hl1VarA;
                Result.a aVar3 = Result.a;
                objB = Result.b(f.a(th));
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hl1Var = (hl1) dataStoreImpl$handleUpdate$1.L$0;
            try {
                f.b(obj);
            } catch (Throwable th3) {
                th = th3;
                Result.a aVar4 = Result.a;
                objB = Result.b(f.a(th));
            }
        }
        objB = Result.b(obj);
        jl1.d(hl1Var, objB);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(q22<? super Unit> q22Var) {
        DataStoreImpl$incrementCollector$1 dataStoreImpl$incrementCollector$1;
        x58 x58Var;
        if (q22Var instanceof DataStoreImpl$incrementCollector$1) {
            dataStoreImpl$incrementCollector$1 = (DataStoreImpl$incrementCollector$1) q22Var;
            int i = dataStoreImpl$incrementCollector$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                dataStoreImpl$incrementCollector$1.label = i - t04.INVALID_ID;
            } else {
                dataStoreImpl$incrementCollector$1 = new DataStoreImpl$incrementCollector$1(this, q22Var);
            }
        } else {
            dataStoreImpl$incrementCollector$1 = new DataStoreImpl$incrementCollector$1(this, q22Var);
        }
        Object obj = dataStoreImpl$incrementCollector$1.result;
        Object objG = a.g();
        int i2 = dataStoreImpl$incrementCollector$1.label;
        if (i2 == 0) {
            f.b(obj);
            x58Var = this.collectorMutex;
            dataStoreImpl$incrementCollector$1.L$0 = x58Var;
            dataStoreImpl$incrementCollector$1.label = 1;
            if (x58Var.g((Object) null, dataStoreImpl$incrementCollector$1) == objG) {
                return objG;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x58 x58Var2 = (x58) dataStoreImpl$incrementCollector$1.L$0;
            f.b(obj);
            x58Var = x58Var2;
        }
        try {
            int i3 = this.collectorCounter + 1;
            this.collectorCounter = i3;
            if (i3 == 1) {
                this.collectorJob = rw0.d(this.scope, (CoroutineContext) null, (CoroutineStart) null, new ta2(this, null), 3, (Object) null);
            }
            Unit unit = Unit.a;
            return Unit.a;
        } finally {
            x58Var.h((Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r2.c(r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(com.google.android.q22<? super kotlin.Unit> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.datastore.p007core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 r0 = (androidx.datastore.p007core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 r0 = new androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            int r0 = r0.I$0
            kotlin.f.b(r7)     // Catch: java.lang.Throwable -> L2e
            goto L5f
        L2e:
            r7 = move-exception
            goto L66
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            kotlin.f.b(r7)
            goto L4c
        L3c:
            kotlin.f.b(r7)
            com.google.android.f26 r7 = r6.v()
            r0.label = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L4c
            goto L5e
        L4c:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            androidx.datastore.core.DataStoreImpl<T>$InitDataStore r2 = r6.readAndInit     // Catch: java.lang.Throwable -> L62
            r0.I$0 = r7     // Catch: java.lang.Throwable -> L62
            r0.label = r3     // Catch: java.lang.Throwable -> L62
            java.lang.Object r7 = r2.c(r0)     // Catch: java.lang.Throwable -> L62
            if (r7 != r1) goto L5f
        L5e:
            return r1
        L5f:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L62:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L66:
            com.google.android.gn2<T> r1 = r6.inMemoryCache
            com.google.android.t8a r2 = new com.google.android.t8a
            r2.<init>(r7, r0)
            r1.c(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.p007core.DataStoreImpl.z(com.google.android.q22):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I(T t, boolean z, q22<? super Integer> q22Var) {
        DataStoreImpl$writeData$1 dataStoreImpl$writeData$1;
        Ref.IntRef intRef;
        if (q22Var instanceof DataStoreImpl$writeData$1) {
            dataStoreImpl$writeData$1 = (DataStoreImpl$writeData$1) q22Var;
            int i = dataStoreImpl$writeData$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                dataStoreImpl$writeData$1.label = i - t04.INVALID_ID;
            } else {
                dataStoreImpl$writeData$1 = new DataStoreImpl$writeData$1(this, q22Var);
            }
        } else {
            dataStoreImpl$writeData$1 = new DataStoreImpl$writeData$1(this, q22Var);
        }
        Object obj = dataStoreImpl$writeData$1.result;
        Object objG = a.g();
        int i2 = dataStoreImpl$writeData$1.label;
        if (i2 == 0) {
            f.b(obj);
            Ref.IntRef intRef2 = new Ref.IntRef();
            k9c<T> k9cVarW = w();
            DataStoreImpl$writeData$2 dataStoreImpl$writeData$2 = new DataStoreImpl$writeData$2(intRef2, this, t, z, null);
            dataStoreImpl$writeData$1.L$0 = intRef2;
            dataStoreImpl$writeData$1.label = 1;
            if (k9cVarW.b(dataStoreImpl$writeData$2, dataStoreImpl$writeData$1) == objG) {
                return objG;
            }
            intRef = intRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            intRef = (Ref.IntRef) dataStoreImpl$writeData$1.L$0;
            f.b(obj);
        }
        return ut0.e(intRef.element);
    }

    @Override // com.google.inputmethod.ym2
    public Object a(Function2<? super T, ? super q22<? super T>, ? extends Object> function2, q22<? super T> q22Var) {
        c cVar = (c) q22Var.getContext().get(c.Companion.C0078a.a);
        if (cVar != null) {
            cVar.c(this);
        }
        return rw0.g(new c(cVar, this), new DataStoreImpl$updateData$2(this, function2, null), q22Var);
    }

    @Override // com.google.inputmethod.ym2
    public ai4<T> getData() {
        return this.data;
    }

    public final k9c<T> w() {
        return (k9c) this.storageConnectionDelegate.getValue();
    }
}
