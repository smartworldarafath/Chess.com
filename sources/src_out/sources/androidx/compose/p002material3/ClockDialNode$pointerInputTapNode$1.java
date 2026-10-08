package androidx.compose.p002material3;

import androidx.compose.p001foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.lq2;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.inputmethod.df9;
import com.google.inputmethod.ml9;
import com.google.inputmethod.rn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ClockDialNode$pointerInputTapNode$1 implements PointerInputEventHandler {
    final /* synthetic */ ClockDialNode a;

    /* JADX INFO: renamed from: androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/android/ml9;", "Lcom/google/android/rn8;", "it", "", "<anonymous>", "(Lcom/google/android/ml9;Lcom/google/android/rn8;)V"}, k = 3, mv = {2, 0, 0})
    @lq2(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$1", f = "TimePicker.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass1 extends SuspendLambda implements ps4<ml9, rn8, q22<? super Unit>, Object> {
        /* synthetic */ long J$0;
        int label;
        final /* synthetic */ ClockDialNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ClockDialNode clockDialNode, q22<? super AnonymousClass1> q22Var) {
            super(3, q22Var);
            this.this$0 = clockDialNode;
        }

        public final Object a(ml9 ml9Var, long j, q22<? super Unit> q22Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, q22Var);
            anonymousClass1.J$0 = j;
            return anonymousClass1.invokeSuspend(Unit.a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((ml9) obj, ((rn8) obj2).getPackedValue(), (q22) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            long j = this.J$0;
            this.this$0.offsetX = Float.intBitsToFloat((int) (j >> 32));
            this.this$0.offsetY = Float.intBitsToFloat((int) (j & 4294967295L));
            return Unit.a;
        }
    }

    ClockDialNode$pointerInputTapNode$1(ClockDialNode clockDialNode) {
        this.a = clockDialNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(ClockDialNode clockDialNode, rn8 rn8Var) {
        rw0.d(clockDialNode.L2(), (CoroutineContext) null, (CoroutineStart) null, new C0171ClockDialNode$pointerInputTapNode$1$2$1(clockDialNode, rn8Var, null), 3, (Object) null);
        return Unit.a;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(df9 df9Var, q22<? super Unit> q22Var) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.a, null);
        final ClockDialNode clockDialNode = this.a;
        Object objI = TapGestureDetectorKt.i(df9Var, null, null, anonymousClass1, new Function1() { // from class: androidx.compose.material3.d
            public final Object invoke(Object obj) {
                return ClockDialNode$pointerInputTapNode$1.b(clockDialNode, (rn8) obj);
            }
        }, q22Var, 3, null);
        return objI == a.g() ? objI : Unit.a;
    }
}
