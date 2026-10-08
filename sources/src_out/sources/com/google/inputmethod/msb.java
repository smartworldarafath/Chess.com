package com.google.inputmethod;

import androidx.collection.d;
import androidx.compose.p004runtime.snapshots.g;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.a;
import kotlinx.coroutines.channels.h;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J%\u0010\n\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0011\u0010\u0003J\u001d\u0010\u0012\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0010¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0013\u0010\u0003J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001cR*\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u0010R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/google/android/msb;", "Lcom/google/android/iwb;", "<init>", "()V", "", "j", "Lkotlinx/coroutines/channels/h;", "channel", "", "obj", "o", "(Lkotlinx/coroutines/channels/h;Ljava/lang/Object;)V", "Lkotlin/Function1;", "e", "(Lkotlinx/coroutines/channels/h;)Lkotlin/jvm/functions/Function1;", "a", "(Lkotlinx/coroutines/channels/h;)V", "b", "f", "c", "Lcom/google/android/o38;", "l", "()Lcom/google/android/o38;", "Ljava/lang/Object;", "soleWatchedObject", "workingSoleWatchedObject", "Landroidx/collection/d;", "d", "Landroidx/collection/d;", "watchSet", "workingWatchSet", "Lkotlinx/coroutines/channels/h;", "k", "()Lkotlinx/coroutines/channels/h;", "setSubscribedChannel", "subscribedChannel", "g", "Lkotlin/jvm/functions/Function1;", "readObserverCache", "Lcom/google/android/nn8;", "h", "Lcom/google/android/nn8;", "unregisterApplyObserver", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class msb extends iwb {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Object soleWatchedObject;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Object workingSoleWatchedObject;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private d<Object> watchSet;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private d<Object> workingWatchSet;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private h<? super Unit> subscribedChannel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Function1<Object, Unit> readObserverCache = new Function1() { // from class: com.google.android.ksb
        public final Object invoke(Object obj) {
            return msb.m(this.a, obj);
        }
    };

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final nn8 unregisterApplyObserver = g.INSTANCE.h(new Function2() { // from class: com.google.android.lsb
        public final Object invoke(Object obj, Object obj2) {
            return msb.n(this.a, (Set) obj, (g) obj2);
        }
    });

    private final void j() {
        this.workingSoleWatchedObject = null;
        this.workingWatchSet = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(msb msbVar, Object obj) {
        h<? super Unit> hVar = msbVar.subscribedChannel;
        Intrinsics.g(hVar);
        msbVar.o(hVar, obj);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[Catch: all -> 0x001a, LOOP:0: B:14:0x0027->B:26:0x0062, LOOP_END, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0009, B:6:0x000d, B:8:0x0017, B:28:0x0066, B:11:0x001c, B:14:0x0027, B:16:0x0037, B:18:0x0043, B:20:0x004c, B:22:0x0057, B:23:0x005a, B:26:0x0062), top: B:36:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0065 A[EDGE_INSN: B:27:0x0065->B:28:0x0066 BREAK  A[LOOP:0: B:14:0x0027->B:26:0x0062]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0065 A[SYNTHETIC] */
    public static final Unit n(msb msbVar, Set set, g gVar) {
        h<? super Unit> hVar;
        synchronized (msbVar.getLock()) {
            try {
                d<Object> dVar = msbVar.watchSet;
                if (dVar != null) {
                    Object[] objArr = dVar.elements;
                    long[] jArr = dVar.metadata;
                    int length = jArr.length - 2;
                    if (length < 0) {
                        hVar = null;
                        break;
                    }
                    int i = 0;
                    loop0: while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128 && set.contains(objArr[(i << 3) + i3])) {
                                    hVar = msbVar.subscribedChannel;
                                    break loop0;
                                }
                                j >>= 8;
                            }
                            if (i2 == 8) {
                                if (i == length) {
                                    i++;
                                }
                            }
                            hVar = null;
                            break;
                        }
                        if (i == length) {
                            hVar = null;
                            break;
                        }
                        i++;
                    }
                } else {
                    if (!m.n0(set, msbVar.soleWatchedObject)) {
                        hVar = null;
                        break;
                    }
                    hVar = msbVar.subscribedChannel;
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (hVar != null) {
            a.b(hVar.e(Unit.a));
        }
        return Unit.a;
    }

    @Override // com.google.inputmethod.iwb
    public void a(h<? super Unit> channel) {
        j();
    }

    @Override // com.google.inputmethod.iwb
    public void b() {
        synchronized (getLock()) {
            try {
                this.soleWatchedObject = this.workingSoleWatchedObject;
                if (this.workingWatchSet == null) {
                    this.watchSet = null;
                } else {
                    if (this.watchSet == null) {
                        this.watchSet = l4b.b();
                    }
                    d<Object> dVar = this.watchSet;
                    this.watchSet = this.workingWatchSet;
                    this.workingWatchSet = dVar;
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.inputmethod.iwb
    public void c() {
        this.unregisterApplyObserver.dispose();
        j();
        synchronized (getLock()) {
            this.subscribedChannel = null;
            this.soleWatchedObject = null;
            this.watchSet = null;
            Unit unit = Unit.a;
        }
    }

    @Override // com.google.inputmethod.iwb
    public Function1<Object, Unit> e(h<? super Unit> channel) {
        h<? super Unit> hVar = this.subscribedChannel;
        if (!(hVar == null || Intrinsics.e(hVar, channel))) {
            ei9.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.subscribedChannel = channel;
        return this.readObserverCache;
    }

    @Override // com.google.inputmethod.iwb
    public void f(h<? super Unit> channel) {
        this.subscribedChannel = null;
        a(channel);
        b();
    }

    public final h<Unit> k() {
        return this.subscribedChannel;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0062 A[LOOP:0: B:14:0x002d->B:24:0x0062, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0065 A[EDGE_INSN: B:28:0x0065->B:25:0x0065 BREAK  A[LOOP:0: B:14:0x002d->B:24:0x0062], SYNTHETIC] */
    public final o38 l() {
        o38 o38Var = new o38();
        h<? super Unit> hVar = this.subscribedChannel;
        if (!(hVar != null)) {
            ei9.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
        }
        d<Object> dVar = this.watchSet;
        if (dVar != null) {
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
                                o38Var.n(hVar, objArr[(i << 3) + i3]);
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
            Object obj = this.soleWatchedObject;
            Intrinsics.g(obj);
            o38Var.n(hVar, obj);
        }
        o38Var.b();
        c();
        return o38Var;
    }

    public void o(h<? super Unit> channel, Object obj) {
        if (!Intrinsics.e(this.subscribedChannel, channel)) {
            ei9.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        d<Object> dVar = this.workingWatchSet;
        Object obj2 = this.workingSoleWatchedObject;
        if (dVar != null) {
            if (!(obj2 == null)) {
                ei9.b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
            }
            dVar.h(obj);
        } else {
            if (obj2 == null) {
                this.workingSoleWatchedObject = obj;
                return;
            }
            d<Object> dVarB = l4b.b();
            dVarB.h(obj2);
            dVarB.h(obj);
            this.workingWatchSet = dVarB;
            this.workingSoleWatchedObject = null;
        }
    }
}
