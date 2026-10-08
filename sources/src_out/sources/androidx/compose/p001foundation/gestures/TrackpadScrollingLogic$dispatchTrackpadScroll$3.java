package androidx.compose.p001foundation.gestures;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.ve8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ve8;", "", "<anonymous>", "(Lcom/google/android/ve8;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.gestures.TrackpadScrollingLogic$dispatchTrackpadScroll$3", f = "TrackpadScrollingLogic.kt", l = {178}, m = "invokeSuspend", v = 1)
final class TrackpadScrollingLogic$dispatchTrackpadScroll$3 extends SuspendLambda implements Function2<ve8, q22<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<TrackpadScrollingLogic.a> $targetScrollDelta;
    final /* synthetic */ ScrollingLogic $this_dispatchTrackpadScroll;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ TrackpadScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrackpadScrollingLogic$dispatchTrackpadScroll$3(TrackpadScrollingLogic trackpadScrollingLogic, ScrollingLogic scrollingLogic, Ref.ObjectRef<TrackpadScrollingLogic.a> objectRef, q22<? super TrackpadScrollingLogic$dispatchTrackpadScroll$3> q22Var) {
        super(2, q22Var);
        this.this$0 = trackpadScrollingLogic;
        this.$this_dispatchTrackpadScroll = scrollingLogic;
        this.$targetScrollDelta = objectRef;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(ve8 ve8Var, q22<? super Unit> q22Var) {
        return create(ve8Var, q22Var).invokeSuspend(Unit.a);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        TrackpadScrollingLogic$dispatchTrackpadScroll$3 trackpadScrollingLogic$dispatchTrackpadScroll$3 = new TrackpadScrollingLogic$dispatchTrackpadScroll$3(this.this$0, this.$this_dispatchTrackpadScroll, this.$targetScrollDelta, q22Var);
        trackpadScrollingLogic$dispatchTrackpadScroll$3.L$0 = obj;
        return trackpadScrollingLogic$dispatchTrackpadScroll$3;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0060 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x007a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005e -> B:14:0x0061). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x004c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r1 = r6.L$1
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            java.lang.Object r3 = r6.L$0
            com.google.android.ve8 r3 = (com.google.inputmethod.ve8) r3
            kotlin.f.b(r7)
            goto L61
        L17:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1f:
            kotlin.f.b(r7)
            java.lang.Object r7 = r6.L$0
            com.google.android.ve8 r7 = (com.google.inputmethod.ve8) r7
            androidx.compose.foundation.gestures.TrackpadScrollingLogic r1 = r6.this$0
            androidx.compose.foundation.gestures.ScrollingLogic r3 = r6.$this_dispatchTrackpadScroll
            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.TrackpadScrollingLogic$a> r4 = r6.$targetScrollDelta
            java.lang.Object r4 = r4.element
            androidx.compose.foundation.gestures.TrackpadScrollingLogic$a r4 = (androidx.compose.foundation.gestures.TrackpadScrollingLogic.a) r4
            long r4 = r4.getValue()
            long r4 = r3.A(r4)
            float r3 = r3.I(r4)
            androidx.compose.p001foundation.gestures.TrackpadScrollingLogic.j(r1, r7, r3)
            r3 = r7
        L40:
            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.TrackpadScrollingLogic$a> r7 = r6.$targetScrollDelta
            java.lang.Object r7 = r7.element
            androidx.compose.foundation.gestures.TrackpadScrollingLogic$a r7 = (androidx.compose.foundation.gestures.TrackpadScrollingLogic.a) r7
            boolean r7 = r7.getIsEnd()
            if (r7 != 0) goto La5
            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.TrackpadScrollingLogic$a> r1 = r6.$targetScrollDelta
            androidx.compose.foundation.gestures.TrackpadScrollingLogic r7 = r6.this$0
            com.google.android.h81 r7 = androidx.compose.p001foundation.gestures.TrackpadScrollingLogic.l(r7)
            r6.L$0 = r3
            r6.L$1 = r1
            r6.label = r2
            java.lang.Object r7 = androidx.compose.p001foundation.gestures.NonTouchScrollingLogicKt.a(r7, r6)
            if (r7 != r0) goto L61
            return r0
        L61:
            r1.element = r7
            androidx.compose.foundation.gestures.TrackpadScrollingLogic r7 = r6.this$0
            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.TrackpadScrollingLogic$a> r1 = r6.$targetScrollDelta
            java.lang.Object r1 = r1.element
            androidx.compose.foundation.gestures.TrackpadScrollingLogic$a r1 = (androidx.compose.foundation.gestures.TrackpadScrollingLogic.a) r1
            androidx.compose.p001foundation.gestures.TrackpadScrollingLogic.o(r7, r1)
            androidx.compose.foundation.gestures.TrackpadScrollingLogic r7 = r6.this$0
            com.google.android.h81 r1 = androidx.compose.p001foundation.gestures.TrackpadScrollingLogic.l(r7)
            androidx.compose.foundation.gestures.TrackpadScrollingLogic$a r7 = androidx.compose.p001foundation.gestures.TrackpadScrollingLogic.n(r7, r1)
            if (r7 == 0) goto L8b
            androidx.compose.foundation.gestures.TrackpadScrollingLogic r1 = r6.this$0
            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.TrackpadScrollingLogic$a> r4 = r6.$targetScrollDelta
            androidx.compose.p001foundation.gestures.TrackpadScrollingLogic.o(r1, r7)
            java.lang.Object r1 = r4.element
            androidx.compose.foundation.gestures.TrackpadScrollingLogic$a r1 = (androidx.compose.foundation.gestures.TrackpadScrollingLogic.a) r1
            androidx.compose.foundation.gestures.TrackpadScrollingLogic$a r7 = r1.d(r7)
            r4.element = r7
        L8b:
            androidx.compose.foundation.gestures.TrackpadScrollingLogic r7 = r6.this$0
            androidx.compose.foundation.gestures.ScrollingLogic r1 = r6.$this_dispatchTrackpadScroll
            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.TrackpadScrollingLogic$a> r4 = r6.$targetScrollDelta
            java.lang.Object r4 = r4.element
            androidx.compose.foundation.gestures.TrackpadScrollingLogic$a r4 = (androidx.compose.foundation.gestures.TrackpadScrollingLogic.a) r4
            long r4 = r4.getValue()
            long r4 = r1.A(r4)
            float r1 = r1.I(r4)
            androidx.compose.p001foundation.gestures.TrackpadScrollingLogic.j(r7, r3, r1)
            goto L40
        La5:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.gestures.TrackpadScrollingLogic$dispatchTrackpadScroll$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
