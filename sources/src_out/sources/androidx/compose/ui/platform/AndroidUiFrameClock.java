package androidx.compose.ui.platform;

import android.view.Choreographer;
import com.google.android.g41;
import com.google.android.oq2;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiFrameClock;", "Landroidx/compose/runtime/v;", "Landroid/view/Choreographer;", "choreographer", "Landroidx/compose/ui/platform/AndroidUiDispatcher;", "dispatcher", "<init>", "(Landroid/view/Choreographer;Landroidx/compose/ui/platform/AndroidUiDispatcher;)V", "R", "Lkotlin/Function1;", "", "onFrame", "d0", "(Lkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "a", "Landroid/view/Choreographer;", "c", "()Landroid/view/Choreographer;", "b", "Landroidx/compose/ui/platform/AndroidUiDispatcher;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidUiFrameClock implements androidx.compose.p004runtime.v {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Choreographer choreographer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AndroidUiDispatcher dispatcher;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "frameTimeNanos", "", "doFrame"}, k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Choreographer.FrameCallback {
        final /* synthetic */ g41<R> a;
        final /* synthetic */ AndroidUiFrameClock b;
        final /* synthetic */ Function1<Long, R> c;

        /* JADX WARN: Multi-variable type inference failed */
        a(g41<? super R> g41Var, AndroidUiFrameClock androidUiFrameClock, Function1<? super Long, ? extends R> function1) {
            this.a = g41Var;
            this.b = androidUiFrameClock;
            this.c = function1;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            Object objB;
            g41<R> g41Var = this.a;
            Function1<Long, R> function1 = this.c;
            try {
                Result.a aVar = Result.a;
                objB = Result.b(function1.invoke(Long.valueOf(j)));
            } catch (Throwable th) {
                Result.a aVar2 = Result.a;
                objB = Result.b(kotlin.f.a(th));
            }
            g41Var.resumeWith(objB);
        }
    }

    public AndroidUiFrameClock(Choreographer choreographer, AndroidUiDispatcher androidUiDispatcher) {
        this.choreographer = choreographer;
        this.dispatcher = androidUiDispatcher;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    @Override // androidx.compose.p004runtime.v
    public <R> Object d0(Function1<? super Long, ? extends R> function1, q22<? super R> q22Var) {
        final AndroidUiDispatcher androidUiDispatcher = this.dispatcher;
        if (androidUiDispatcher == null) {
            CoroutineContext.Element element = q22Var.getContext().get(kotlin.coroutines.c.s2);
            androidUiDispatcher = element instanceof AndroidUiDispatcher ? (AndroidUiDispatcher) element : null;
        }
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(kotlin.coroutines.intrinsics.a.d(q22Var), 1);
        eVar.G();
        final a aVar = new a(eVar, this, function1);
        if (androidUiDispatcher == null || !Intrinsics.e(androidUiDispatcher.getChoreographer(), getChoreographer())) {
            getChoreographer().postFrameCallback(aVar);
            eVar.D(new Function1<Throwable, Unit>() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return Unit.a;
                }

                public final void invoke(Throwable th) {
                    this.this$0.getChoreographer().removeFrameCallback(aVar);
                }
            });
        } else {
            androidUiDispatcher.P1(aVar);
            eVar.D(new Function1<Throwable, Unit>() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return Unit.a;
                }

                public final void invoke(Throwable th) {
                    androidUiDispatcher.R1(aVar);
                }
            });
        }
        Object objY = eVar.y();
        if (objY == kotlin.coroutines.intrinsics.a.g()) {
            oq2.c(q22Var);
        }
        return objY;
    }

    public /* bridge */ <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) androidx.compose.runtime.v.a.a(this, r, function2);
    }

    public /* bridge */ <E extends CoroutineContext.Element> E get(CoroutineContext.b<E> bVar) {
        return (E) androidx.compose.runtime.v.a.b(this, bVar);
    }

    public /* bridge */ CoroutineContext minusKey(CoroutineContext.b<?> bVar) {
        return androidx.compose.runtime.v.a.c(this, bVar);
    }

    public /* bridge */ CoroutineContext plus(CoroutineContext coroutineContext) {
        return androidx.compose.runtime.v.a.d(this, coroutineContext);
    }
}
