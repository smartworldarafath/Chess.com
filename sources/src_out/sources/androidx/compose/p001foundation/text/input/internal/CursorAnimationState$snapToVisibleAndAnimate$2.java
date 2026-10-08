package androidx.compose.p001foundation.text.input.internal;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.android.ut0;
import com.google.inputmethod.w58;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)Z"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", f = "CursorAnimationState.kt", l = {}, m = "invokeSuspend", v = 1)
final class CursorAnimationState$snapToVisibleAndAnimate$2 extends SuspendLambda implements Function2<ta2, q22<? super Boolean>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CursorAnimationState this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
    @lq2(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", f = "CursorAnimationState.kt", l = {72, 77, 79, 81}, m = "invokeSuspend", v = 1)
    static final class AnonymousClass1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
        final /* synthetic */ s $oldJob;
        int label;
        final /* synthetic */ CursorAnimationState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(s sVar, CursorAnimationState cursorAnimationState, q22<? super AnonymousClass1> q22Var) {
            super(2, q22Var);
            this.$oldJob = sVar;
            this.this$0 = cursorAnimationState;
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            return new AnonymousClass1(this.$oldJob, this.this$0, q22Var);
        }

        public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
            return create(ta2Var, q22Var).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0067  */
        /* JADX WARN: Code duplicated, block: B:33:0x0068 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:8:0x0019, B:36:0x0076, B:30:0x005f, B:33:0x0068, B:14:0x0027, B:15:0x002b, B:28:0x0059, B:29:0x005e, B:23:0x0043, B:25:0x0050), top: B:40:0x000f }] */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
        
            if (kotlinx.coroutines.DelayKt.b(500, r10) == r0) goto L35;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0073 -> B:36:0x0076). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
                int r1 = r10.label
                r2 = 0
                r3 = 500(0x1f4, double:2.47E-321)
                r5 = 1065353216(0x3f800000, float:1.0)
                r6 = 4
                r7 = 3
                r8 = 2
                r9 = 1
                if (r1 == 0) goto L33
                if (r1 == r9) goto L2f
                if (r1 == r8) goto L2b
                if (r1 == r7) goto L27
                if (r1 != r6) goto L1f
                kotlin.f.b(r11)     // Catch: java.lang.Throwable -> L1d
                goto L76
            L1d:
                r11 = move-exception
                goto L7c
            L1f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L27:
                kotlin.f.b(r11)     // Catch: java.lang.Throwable -> L1d
                goto L68
            L2b:
                kotlin.f.b(r11)     // Catch: java.lang.Throwable -> L1d
                goto L59
            L2f:
                kotlin.f.b(r11)
                goto L43
            L33:
                kotlin.f.b(r11)
                kotlinx.coroutines.s r11 = r10.$oldJob
                if (r11 == 0) goto L43
                r10.label = r9
                java.lang.Object r11 = kotlinx.coroutines.u.g(r11, r10)
                if (r11 != r0) goto L43
                goto L75
            L43:
                androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1d
                androidx.compose.p001foundation.text.input.internal.CursorAnimationState.b(r11, r5)     // Catch: java.lang.Throwable -> L1d
                androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1d
                boolean r11 = r11.getAnimate()     // Catch: java.lang.Throwable -> L1d
                if (r11 != 0) goto L5f
                r10.label = r8     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r11 = kotlinx.coroutines.DelayKt.a(r10)     // Catch: java.lang.Throwable -> L1d
                if (r11 != r0) goto L59
                goto L75
            L59:
                kotlin.KotlinNothingValueException r11 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L1d
                r11.<init>()     // Catch: java.lang.Throwable -> L1d
                throw r11     // Catch: java.lang.Throwable -> L1d
            L5f:
                r10.label = r7     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r11 = kotlinx.coroutines.DelayKt.b(r3, r10)     // Catch: java.lang.Throwable -> L1d
                if (r11 != r0) goto L68
                goto L75
            L68:
                androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1d
                androidx.compose.p001foundation.text.input.internal.CursorAnimationState.b(r11, r2)     // Catch: java.lang.Throwable -> L1d
                r10.label = r6     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r11 = kotlinx.coroutines.DelayKt.b(r3, r10)     // Catch: java.lang.Throwable -> L1d
                if (r11 != r0) goto L76
            L75:
                return r0
            L76:
                androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1d
                androidx.compose.p001foundation.text.input.internal.CursorAnimationState.b(r11, r5)     // Catch: java.lang.Throwable -> L1d
                goto L5f
            L7c:
                androidx.compose.foundation.text.input.internal.CursorAnimationState r0 = r10.this$0
                androidx.compose.p001foundation.text.input.internal.CursorAnimationState.b(r0, r2)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CursorAnimationState$snapToVisibleAndAnimate$2(CursorAnimationState cursorAnimationState, q22<? super CursorAnimationState$snapToVisibleAndAnimate$2> q22Var) {
        super(2, q22Var);
        this.this$0 = cursorAnimationState;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        CursorAnimationState$snapToVisibleAndAnimate$2 cursorAnimationState$snapToVisibleAndAnimate$2 = new CursorAnimationState$snapToVisibleAndAnimate$2(this.this$0, q22Var);
        cursorAnimationState$snapToVisibleAndAnimate$2.L$0 = obj;
        return cursorAnimationState$snapToVisibleAndAnimate$2;
    }

    public final Object invoke(ta2 ta2Var, q22<? super Boolean> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return ut0.a(w58.a(this.this$0.animationJob, null, rw0.d((ta2) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((s) this.this$0.animationJob.getAndSet(null), this.this$0, null), 3, (Object) null)));
    }
}
