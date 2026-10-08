package androidx.compose.p001foundation.gestures;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.t3e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1", f = "AnchoredDraggable.kt", l = {438, 440}, m = "invokeSuspend", v = 1)
final class AnchoredDraggableNode$onDragStopped$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ l.d $event;
    int label;
    final /* synthetic */ AnchoredDraggableNode<T> this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/t3e;", "availableVelocity", "<anonymous>", "(Lcom/google/android/t3e;)Lcom/google/android/t3e;"}, k = 3, mv = {2, 1, 0})
    @lq2(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1", f = "AnchoredDraggable.kt", l = {442}, m = "invokeSuspend", v = 1)
    static final class AnonymousClass1 extends SuspendLambda implements Function2<t3e, q22<? super t3e>, Object> {
        /* synthetic */ long J$0;
        int label;
        final /* synthetic */ AnchoredDraggableNode<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AnchoredDraggableNode<T> anchoredDraggableNode, q22<? super AnonymousClass1> q22Var) {
            super(2, q22Var);
            this.this$0 = anchoredDraggableNode;
        }

        public final Object a(long j, q22<? super t3e> q22Var) {
            return create(t3e.b(j), q22Var).invokeSuspend(Unit.a);
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, q22Var);
            anonymousClass1.J$0 = ((t3e) obj).getPackedValue();
            return anonymousClass1;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((t3e) obj).getPackedValue(), (q22) obj2);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            long jD4;
            Object objG = a.g();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                long j = this.J$0;
                AnchoredDraggableNode<T> anchoredDraggableNode = this.this$0;
                float fA4 = anchoredDraggableNode.A4(j);
                this.J$0 = j;
                this.label = 1;
                obj = anchoredDraggableNode.u4(fA4, this);
                if (obj == objG) {
                    return objG;
                }
                jD4 = j;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jD4 = this.J$0;
                f.b(obj);
            }
            float fFloatValue = ((Number) obj).floatValue();
            float fG = ((AnchoredDraggableNode) this.this$0).state.G();
            float f = ((AnchoredDraggableNode) this.this$0).state.q().f();
            if (fG >= ((AnchoredDraggableNode) this.this$0).state.q().e() || fG <= f) {
                jD4 = this.this$0.D4(fFloatValue);
            }
            return t3e.b(jD4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableNode$onDragStopped$1(AnchoredDraggableNode<T> anchoredDraggableNode, l.d dVar, q22<? super AnchoredDraggableNode$onDragStopped$1> q22Var) {
        super(2, q22Var);
        this.this$0 = anchoredDraggableNode;
        this.$event = dVar;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new AnchoredDraggableNode$onDragStopped$1(this.this$0, this.$event, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r1.u4(r8, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (r1.a(r3, r8, r7) == r0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r8)
            goto L64
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            kotlin.f.b(r8)
            goto L66
        L1e:
            kotlin.f.b(r8)
            androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r8 = r7.this$0
            androidx.compose.foundation.gestures.l$d r1 = r7.$event
            long r4 = r1.getVelocity()
            long r4 = androidx.compose.p001foundation.gestures.AnchoredDraggableNode.o4(r8, r4)
            float r8 = androidx.compose.p001foundation.gestures.AnchoredDraggableNode.q4(r8, r4)
            androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r1 = r7.this$0
            com.google.android.zv8 r1 = androidx.compose.p001foundation.gestures.AnchoredDraggableNode.m4(r1)
            if (r1 != 0) goto L44
            androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r1 = r7.this$0
            r7.label = r3
            java.lang.Object r8 = androidx.compose.p001foundation.gestures.AnchoredDraggableNode.l4(r1, r8, r7)
            if (r8 != r0) goto L66
            goto L63
        L44:
            androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r1 = r7.this$0
            com.google.android.zv8 r1 = androidx.compose.p001foundation.gestures.AnchoredDraggableNode.m4(r1)
            kotlin.jvm.internal.Intrinsics.g(r1)
            androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r3 = r7.this$0
            long r3 = androidx.compose.p001foundation.gestures.AnchoredDraggableNode.t4(r3, r8)
            androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1 r8 = new androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1
            androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r5 = r7.this$0
            r6 = 0
            r8.<init>(r5, r6)
            r7.label = r2
            java.lang.Object r8 = r1.a(r3, r8, r7)
            if (r8 != r0) goto L64
        L63:
            return r0
        L64:
            kotlin.Unit r8 = kotlin.Unit.a
        L66:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.gestures.AnchoredDraggableNode$onDragStopped$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
