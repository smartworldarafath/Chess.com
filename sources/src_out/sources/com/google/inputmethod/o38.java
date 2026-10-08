package com.google.inputmethod;

import androidx.collection.d;
import androidx.compose.p004runtime.snapshots.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.h;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001:\u0003\u0012\u000e\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\t\u0010\nJ)\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0010¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u0010\u0010\u0003J\u001d\u0010\u0011\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0010¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u0012\u0010\u0003R(\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR2\u0010\u001f\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u000b0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010!¨\u0006#"}, d2 = {"Lcom/google/android/o38;", "Lcom/google/android/iwb;", "<init>", "()V", "Lkotlinx/coroutines/channels/h;", "", "channel", "", "obj", "n", "(Lkotlinx/coroutines/channels/h;Ljava/lang/Object;)V", "Lkotlin/Function1;", "e", "(Lkotlinx/coroutines/channels/h;)Lkotlin/jvm/functions/Function1;", "a", "(Lkotlinx/coroutines/channels/h;)V", "b", "f", "c", "Lcom/google/android/r6b;", "Lcom/google/android/k58;", "subscriptions", "", "Lcom/google/android/o38$c;", "Ljava/util/List;", "pendingChanges", "Landroidx/collection/d;", "d", "Landroidx/collection/d;", "toNotify", "Lcom/google/android/k58;", "readObserverCache", "Lcom/google/android/nn8;", "Lcom/google/android/nn8;", "unregisterApplyObserver", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class o38 extends iwb {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private k58<Object, Object> subscriptions = r6b.e(null, 1, null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<c> pendingChanges = new ArrayList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final d<h<Unit>> toNotify = l4b.b();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final k58<h<Unit>, Function1<Object, Unit>> readObserverCache = k4b.c();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final nn8 unregisterApplyObserver = g.INSTANCE.h(new Function2() { // from class: com.google.android.m38
        public final Object invoke(Object obj, Object obj2) {
            return o38.l(this.a, (Set) obj, (g) obj2);
        }
    });

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\t\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/google/android/o38$a;", "Lcom/google/android/o38$c;", "", "obj", "Lkotlinx/coroutines/channels/h;", "", "channel", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/h;)V", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "Lkotlinx/coroutines/channels/h;", "()Lkotlinx/coroutines/channels/h;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Object obj;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final h<Unit> channel;

        public a(Object obj, h<? super Unit> hVar) {
            this.obj = obj;
            this.channel = hVar;
        }

        public final h<Unit> a() {
            return this.channel;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Object getObj() {
            return this.obj;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/android/o38$b;", "Lcom/google/android/o38$c;", "Lkotlinx/coroutines/channels/h;", "", "channel", "<init>", "(Lkotlinx/coroutines/channels/h;)V", "a", "Lkotlinx/coroutines/channels/h;", "()Lkotlinx/coroutines/channels/h;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final h<Unit> channel;

        public b(h<? super Unit> hVar) {
            this.channel = hVar;
        }

        public final h<Unit> a() {
            return this.channel;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/google/android/o38$c;", "", "Lcom/google/android/o38$a;", "Lcom/google/android/o38$b;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private interface c {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(o38 o38Var, h hVar, Object obj) {
        o38Var.n(hVar, obj);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0058 A[Catch: all -> 0x004e, LOOP:0: B:7:0x001c->B:19:0x0058, LOOP_END, TryCatch #0 {all -> 0x004e, blocks: (B:4:0x0005, B:7:0x001c, B:9:0x002c, B:11:0x0038, B:13:0x0041, B:16:0x0050, B:19:0x0058, B:20:0x005b), top: B:26:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x005b A[EDGE_INSN: B:29:0x005b->B:20:0x005b BREAK  A[LOOP:0: B:7:0x001c->B:19:0x0058], SYNTHETIC] */
    public static final Unit l(final o38 o38Var, final Set set, g gVar) {
        synchronized (o38Var.getLock()) {
            try {
                r6b.g(o38Var.subscriptions, new Function1() { // from class: com.google.android.n38
                    public final Object invoke(Object obj) {
                        return o38.m(set, o38Var, obj);
                    }
                });
                d<h<Unit>> dVar = o38Var.toNotify;
                Object[] objArr = dVar.elements;
                long[] jArr = dVar.metadata;
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
                                    ((h) objArr[(i << 3) + i3]).e(Unit.a);
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
                o38Var.toNotify.m();
            } catch (Throwable th) {
                throw th;
            }
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0058 A[LOOP:0: B:11:0x001f->B:21:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[EDGE_INSN: B:26:0x0062->B:23:0x0062 BREAK  A[LOOP:0: B:11:0x001f->B:21:0x0058], SYNTHETIC] */
    public static final Unit m(Set set, o38 o38Var, Object obj) {
        Object objE;
        if (set.contains(obj) && (objE = o38Var.subscriptions.e(obj)) != null) {
            if (objE instanceof d) {
                d dVar = (d) objE;
                Object[] objArr = dVar.elements;
                long[] jArr = dVar.metadata;
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
                                    o38Var.toNotify.h((h) objArr[(i << 3) + i3]);
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
                o38Var.toNotify.h((h) objE);
            }
        }
        return Unit.a;
    }

    @Override // com.google.inputmethod.iwb
    public void a(h<? super Unit> channel) {
        this.pendingChanges.add(new b(channel));
    }

    @Override // com.google.inputmethod.iwb
    public void b() {
        synchronized (getLock()) {
            try {
                List<c> list = this.pendingChanges;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    c cVar = list.get(i);
                    if (cVar instanceof a) {
                        r6b.a(this.subscriptions, ((a) cVar).getObj(), ((a) cVar).a());
                    } else {
                        if (!(cVar instanceof b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        r6b.n(this.subscriptions, ((b) cVar).a());
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.pendingChanges.clear();
    }

    @Override // com.google.inputmethod.iwb
    public void c() {
        this.unregisterApplyObserver.dispose();
        this.pendingChanges.clear();
        this.readObserverCache.k();
        synchronized (getLock()) {
            r6b.c(this.subscriptions);
            Unit unit = Unit.a;
        }
    }

    @Override // com.google.inputmethod.iwb
    public Function1<Object, Unit> e(final h<? super Unit> channel) {
        Function1<Object, Unit> function1E = this.readObserverCache.e(channel);
        if (function1E != null) {
            return function1E;
        }
        Function1<Object, Unit> function1 = new Function1() { // from class: com.google.android.l38
            public final Object invoke(Object obj) {
                return o38.k(this.a, channel, obj);
            }
        };
        this.readObserverCache.r(channel, function1);
        return function1;
    }

    @Override // com.google.inputmethod.iwb
    public void f(h<? super Unit> channel) {
        this.readObserverCache.u(channel);
        a(channel);
        b();
    }

    public void n(h<? super Unit> channel, Object obj) {
        this.pendingChanges.add(new a(obj, channel));
    }
}
