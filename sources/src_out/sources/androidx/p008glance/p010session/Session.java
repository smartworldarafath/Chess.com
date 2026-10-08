package androidx.p008glance.p010session;

import android.content.Context;
import androidx.compose.p004runtime.d;
import com.google.android.h81;
import com.google.android.p81;
import com.google.android.q22;
import com.google.inputmethod.jq3;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.h;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0014\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0001H¦@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0001H\u0084@¢\u0006\u0004\b\u0016\u0010\u0017J,\u0010\u001a\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u0018H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ \u0010!\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001fH\u0096@¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00010)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010*R\u0014\u0010.\u001a\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Landroidx/glance/session/Session;", "", "", "key", "<init>", "(Ljava/lang/String;)V", "Lcom/google/android/jq3;", "b", "()Lcom/google/android/jq3;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "", "j", "(Landroid/content/Context;)Lkotlin/jvm/functions/Function2;", "root", "", "h", "(Landroid/content/Context;Lcom/google/android/jq3;Lcom/google/android/q22;)Ljava/lang/Object;", "event", "i", "(Landroid/content/Context;Ljava/lang/Object;Lcom/google/android/q22;)Ljava/lang/Object;", "l", "(Ljava/lang/Object;Lcom/google/android/q22;)Ljava/lang/Object;", "Lkotlin/Function1;", "block", "k", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "a", "()V", "e", "", "throwable", "f", "(Landroid/content/Context;Ljava/lang/Throwable;Lcom/google/android/q22;)Ljava/lang/Object;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "_isOpen", "Lcom/google/android/h81;", "Lcom/google/android/h81;", "eventChannel", "d", "()Z", "isOpen", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Session {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String key;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AtomicBoolean _isOpen = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final h81<Object> eventChannel = p81.b(Integer.MAX_VALUE, (BufferOverflow) null, (Function1) null, 6, (Object) null);

    public Session(String str) {
        this.key = str;
    }

    static /* synthetic */ Object g(Session session, Context context, Throwable th, q22<? super Unit> q22Var) {
        return Unit.a;
    }

    public final void a() {
        h.a.a(this.eventChannel, (Throwable) null, 1, (Object) null);
        this._isOpen.set(false);
        e();
    }

    public abstract jq3 b();

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    public final boolean d() {
        return this._isOpen.get();
    }

    public void e() {
    }

    public Object f(Context context, Throwable th, q22<? super Unit> q22Var) {
        return g(this, context, th, q22Var);
    }

    public abstract Object h(Context context, jq3 jq3Var, q22<? super Boolean> q22Var);

    public abstract Object i(Context context, Object obj, q22<? super Unit> q22Var);

    public abstract Function2<d, Integer, Unit> j(Context context);

    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083 A[Catch: ClosedReceiveChannelException -> 0x009b, TRY_LEAVE, TryCatch #0 {ClosedReceiveChannelException -> 0x009b, blocks: (B:13:0x0038, B:22:0x0065, B:26:0x007b, B:28:0x0083, B:18:0x0057, B:21:0x005e), top: B:34:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        if (r5.i(r2, r10, r0) == r1) goto L30;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0098 -> B:14:0x003b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(android.content.Context r8, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> r9, com.google.android.q22<? super kotlin.Unit> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.p008glance.p010session.Session$receiveEvents$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.glance.session.Session$receiveEvents$1 r0 = (androidx.p008glance.p010session.Session$receiveEvents$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.glance.session.Session$receiveEvents$1 r0 = new androidx.glance.session.Session$receiveEvents$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L5b
            if (r2 == r4) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r8 = r0.L$3
            com.google.android.o81 r8 = (com.google.android.o81) r8
            java.lang.Object r9 = r0.L$2
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r2 = r0.L$1
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r5 = r0.L$0
            androidx.glance.session.Session r5 = (androidx.p008glance.p010session.Session) r5
            kotlin.f.b(r10)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L9b
        L3b:
            r10 = r8
            r8 = r2
            r2 = r5
            goto L65
        L3f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L47:
            java.lang.Object r8 = r0.L$3
            com.google.android.o81 r8 = (com.google.android.o81) r8
            java.lang.Object r9 = r0.L$2
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r2 = r0.L$1
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r5 = r0.L$0
            androidx.glance.session.Session r5 = (androidx.p008glance.p010session.Session) r5
            kotlin.f.b(r10)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L9b
            goto L7b
        L5b:
            kotlin.f.b(r10)
            com.google.android.h81<java.lang.Object> r10 = r7.eventChannel     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L9b
            com.google.android.o81 r10 = r10.iterator()     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L9b
            r2 = r7
        L65:
            r0.L$0 = r2     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L9b
            r0.L$1 = r8     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L9b
            r0.L$2 = r9     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L9b
            r0.L$3 = r10     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L9b
            r0.label = r4     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L9b
            java.lang.Object r5 = r10.a(r0)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L9b
            if (r5 != r1) goto L76
            goto L9a
        L76:
            r6 = r2
            r2 = r8
            r8 = r10
            r10 = r5
            r5 = r6
        L7b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L9b
            boolean r10 = r10.booleanValue()     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L9b
            if (r10 == 0) goto L9b
            java.lang.Object r10 = r8.next()     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L9b
            r9.invoke(r10)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L9b
            r0.L$0 = r5     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L9b
            r0.L$1 = r2     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L9b
            r0.L$2 = r9     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L9b
            r0.L$3 = r8     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L9b
            r0.label = r3     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L9b
            java.lang.Object r10 = r5.i(r2, r10, r0)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L9b
            if (r10 != r1) goto L3b
        L9a:
            return r1
        L9b:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p008glance.p010session.Session.k(android.content.Context, kotlin.jvm.functions.Function1, com.google.android.q22):java.lang.Object");
    }

    protected final Object l(Object obj, q22<? super Unit> q22Var) {
        Object objX = this.eventChannel.x(obj, q22Var);
        return objX == a.g() ? objX : Unit.a;
    }
}
