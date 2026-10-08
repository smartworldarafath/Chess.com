package androidx.compose.p001foundation;

import androidx.compose.p001foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.google.android.lq2;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.inputmethod.c65;
import com.google.inputmethod.cs1;
import com.google.inputmethod.df9;
import com.google.inputmethod.e65;
import com.google.inputmethod.ml9;
import com.google.inputmethod.rn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class CombinedClickableNode$createPointerInputNodeIfNeeded$1 implements PointerInputEventHandler {
    final /* synthetic */ CombinedClickableNode a;

    /* JADX INFO: renamed from: androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/android/ml9;", "Lcom/google/android/rn8;", "offset", "", "<anonymous>", "(Lcom/google/android/ml9;Lcom/google/android/rn8;)V"}, k = 3, mv = {2, 1, 0})
    @lq2(c = "androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1$3", f = "Clickable.kt", l = {1132}, m = "invokeSuspend", v = 1)
    static final class AnonymousClass3 extends SuspendLambda implements ps4<ml9, rn8, q22<? super Unit>, Object> {
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CombinedClickableNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(CombinedClickableNode combinedClickableNode, q22<? super AnonymousClass3> q22Var) {
            super(3, q22Var);
            this.this$0 = combinedClickableNode;
        }

        public final Object a(ml9 ml9Var, long j, q22<? super Unit> q22Var) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, q22Var);
            anonymousClass3.L$0 = ml9Var;
            anonymousClass3.J$0 = j;
            return anonymousClass3.invokeSuspend(Unit.a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((ml9) obj, ((rn8) obj2).getPackedValue(), (q22) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            Object objG = a.g();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                ml9 ml9Var = (ml9) this.L$0;
                long j = this.J$0;
                if (this.this$0.getEnabled()) {
                    CombinedClickableNode combinedClickableNode = this.this$0;
                    this.label = 1;
                    if (combinedClickableNode.Q3(ml9Var, j, this) == objG) {
                        return objG;
                    }
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

    CombinedClickableNode$createPointerInputNodeIfNeeded$1(CombinedClickableNode combinedClickableNode) {
        this.a = combinedClickableNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(CombinedClickableNode combinedClickableNode, rn8 rn8Var) {
        Function0 function0 = combinedClickableNode.onDoubleClick;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(CombinedClickableNode combinedClickableNode, rn8 rn8Var) {
        Function0 function0 = combinedClickableNode.onLongClick;
        if (function0 != null) {
            function0.invoke();
        }
        if (combinedClickableNode.getHapticFeedbackEnabled()) {
            ((c65) cs1.a(combinedClickableNode, CompositionLocalsKt.k())).a(e65.INSTANCE.f());
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(CombinedClickableNode combinedClickableNode, rn8 rn8Var) {
        if (combinedClickableNode.getEnabled()) {
            combinedClickableNode.P3().invoke();
        }
        return Unit.a;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(df9 df9Var, q22<? super Unit> q22Var) {
        Function1 function1;
        Function1 function2;
        if (!this.a.getEnabled() || this.a.onDoubleClick == null) {
            function1 = null;
        } else {
            final CombinedClickableNode combinedClickableNode = this.a;
            function1 = new Function1() { // from class: androidx.compose.foundation.h
                public final Object invoke(Object obj) {
                    return CombinedClickableNode$createPointerInputNodeIfNeeded$1.d(combinedClickableNode, (rn8) obj);
                }
            };
        }
        if (!this.a.getEnabled() || this.a.onLongClick == null) {
            function2 = null;
        } else {
            final CombinedClickableNode combinedClickableNode2 = this.a;
            function2 = new Function1() { // from class: androidx.compose.foundation.i
                public final Object invoke(Object obj) {
                    return CombinedClickableNode$createPointerInputNodeIfNeeded$1.e(combinedClickableNode2, (rn8) obj);
                }
            };
        }
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.a, null);
        final CombinedClickableNode combinedClickableNode3 = this.a;
        Object objH = TapGestureDetectorKt.h(df9Var, function1, function2, anonymousClass3, new Function1() { // from class: androidx.compose.foundation.j
            public final Object invoke(Object obj) {
                return CombinedClickableNode$createPointerInputNodeIfNeeded$1.f(combinedClickableNode3, (rn8) obj);
            }
        }, q22Var);
        return objH == a.g() ? objH : Unit.a;
    }
}
