package com.google.inputmethod;

import androidx.compose.p004runtime.snapshots.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.h;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H ¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H ¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H ¢\u0006\u0004\b\f\u0010\u0003J1\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H ¢\u0006\u0004\b\u0012\u0010\u000bJ\u000f\u0010\u0013\u001a\u00020\u0005H ¢\u0006\u0004\b\u0013\u0010\u0003R\u001e\u0010\u0018\u001a\u00060\u0001j\u0002`\u00148\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/google/android/iwb;", "", "<init>", "()V", "Lkotlinx/coroutines/channels/h;", "", "channel", "Lkotlin/Function1;", "e", "(Lkotlinx/coroutines/channels/h;)Lkotlin/jvm/functions/Function1;", "a", "(Lkotlinx/coroutines/channels/h;)V", "b", "T", "Lkotlin/Function0;", "block", "g", "(Lkotlinx/coroutines/channels/h;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "f", "c", "Landroidx/compose/runtime/platform/SynchronizedObject;", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "lock", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class iwb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object lock = new Object();

    public abstract void a(h<? super Unit> channel);

    public abstract void b();

    public abstract void c();

    /* JADX INFO: renamed from: d, reason: from getter */
    protected final Object getLock() {
        return this.lock;
    }

    public abstract Function1<Object, Unit> e(h<? super Unit> channel);

    public abstract void f(h<? super Unit> channel);

    public final <T> T g(h<? super Unit> channel, Function0<? extends T> block) {
        g gVarP = g.INSTANCE.p(e(channel));
        a(channel);
        try {
            g gVarL = gVarP.l();
            try {
                T t = (T) block.invoke();
                gVarP.s(gVarL);
                gVarP.d();
                b();
                return t;
            } catch (Throwable th) {
                gVarP.s(gVarL);
                throw th;
            }
        } catch (Throwable th2) {
            gVarP.d();
            throw th2;
        }
    }
}
