package androidx.compose.p000animation.core;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.android.ut0;
import com.google.inputmethod.o58;
import com.google.inputmethod.q6c;
import com.google.inputmethod.r58;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1", f = "InfiniteTransition.kt", l = {172, 193}, m = "invokeSuspend", v = 1)
final class InfiniteTransition$run$1$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ o58<q6c<Long>> $toolingOverride;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InfiniteTransition this$0;

    /* JADX INFO: renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$1$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @lq2(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", f = "InfiniteTransition.kt", l = {}, m = "invokeSuspend", v = 1)
    static final class AnonymousClass3 extends SuspendLambda implements Function2<Float, q22<? super Boolean>, Object> {
        /* synthetic */ float F$0;
        int label;

        AnonymousClass3(q22<? super AnonymousClass3> q22Var) {
            super(2, q22Var);
        }

        public final Object a(float f, q22<? super Boolean> q22Var) {
            return create(Float.valueOf(f), q22Var).invokeSuspend(Unit.a);
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(q22Var);
            anonymousClass3.F$0 = ((Number) obj).floatValue();
            return anonymousClass3;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).floatValue(), (q22) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            return ut0.a(this.F$0 > 0.0f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InfiniteTransition$run$1$1(o58<q6c<Long>> o58Var, InfiniteTransition infiniteTransition, q22<? super InfiniteTransition$run$1$1> q22Var) {
        super(2, q22Var);
        this.$toolingOverride = o58Var;
        this.this$0 = infiniteTransition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(o58 o58Var, InfiniteTransition infiniteTransition, Ref.FloatRef floatRef, ta2 ta2Var, long j) {
        q6c q6cVar = (q6c) o58Var.getValue();
        long jLongValue = q6cVar != null ? ((Number) q6cVar.getValue()).longValue() : j;
        if (infiniteTransition.startTimeNanos == Long.MIN_VALUE || floatRef.element != SuspendAnimationKt.E(ta2Var.getCoroutineContext())) {
            infiniteTransition.startTimeNanos = j;
            r58 r58Var = infiniteTransition._animations;
            Object[] objArr = r58Var.content;
            int size = r58Var.getSize();
            for (int i = 0; i < size; i++) {
                ((InfiniteTransition.a) objArr[i]).t();
            }
            floatRef.element = SuspendAnimationKt.E(ta2Var.getCoroutineContext());
        }
        if (floatRef.element == 0.0f) {
            r58 r58Var2 = infiniteTransition._animations;
            Object[] objArr2 = r58Var2.content;
            int size2 = r58Var2.getSize();
            for (int i2 = 0; i2 < size2; i2++) {
                ((InfiniteTransition.a) objArr2[i2]).w();
            }
        } else {
            infiniteTransition.j((long) ((jLongValue - infiniteTransition.startTimeNanos) / floatRef.element));
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float o(ta2 ta2Var) {
        return SuspendAnimationKt.E(ta2Var.getCoroutineContext());
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        InfiniteTransition$run$1$1 infiniteTransition$run$1$1 = new InfiniteTransition$run$1$1(this.$toolingOverride, this.this$0, q22Var);
        infiniteTransition$run$1$1.L$0 = obj;
        return infiniteTransition$run$1$1;
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0040 A[PHI: r1 r8
  0x0040: PHI (r1v3 kotlin.jvm.internal.Ref$FloatRef) = 
  (r1v1 kotlin.jvm.internal.Ref$FloatRef)
  (r1v2 kotlin.jvm.internal.Ref$FloatRef)
  (r1v2 kotlin.jvm.internal.Ref$FloatRef)
  (r1v7 kotlin.jvm.internal.Ref$FloatRef)
 binds: [B:10:0x0030, B:15:0x005b, B:17:0x0076, B:6:0x000e] A[DONT_GENERATE, DONT_INLINE]
  0x0040: PHI (r8v4 com.google.android.ta2) = 
  (r8v2 com.google.android.ta2)
  (r8v3 com.google.android.ta2)
  (r8v3 com.google.android.ta2)
  (r8v7 com.google.android.ta2)
 binds: [B:10:0x0030, B:15:0x005b, B:17:0x0076, B:6:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0056 A[PHI: r1 r8
  0x0056: PHI (r1v2 kotlin.jvm.internal.Ref$FloatRef) = (r1v3 kotlin.jvm.internal.Ref$FloatRef), (r1v5 kotlin.jvm.internal.Ref$FloatRef) binds: [B:12:0x0053, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r8v3 com.google.android.ta2) = (r8v4 com.google.android.ta2), (r8v5 com.google.android.ta2) binds: [B:12:0x0053, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x005d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005b -> B:11:0x0040). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0076 -> B:11:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            java.lang.Object r1 = r7.L$1
            kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref.FloatRef) r1
            java.lang.Object r4 = r7.L$0
            com.google.android.ta2 r4 = (com.google.android.ta2) r4
            kotlin.f.b(r8)
            r8 = r4
            goto L40
        L1b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L23:
            java.lang.Object r1 = r7.L$1
            kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref.FloatRef) r1
            java.lang.Object r4 = r7.L$0
            com.google.android.ta2 r4 = (com.google.android.ta2) r4
            kotlin.f.b(r8)
            r8 = r4
            goto L56
        L30:
            kotlin.f.b(r8)
            java.lang.Object r8 = r7.L$0
            com.google.android.ta2 r8 = (com.google.android.ta2) r8
            kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
            r1.<init>()
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.element = r4
        L40:
            com.google.android.o58<com.google.android.q6c<java.lang.Long>> r4 = r7.$toolingOverride
            androidx.compose.animation.core.InfiniteTransition r5 = r7.this$0
            androidx.compose.animation.core.b r6 = new androidx.compose.animation.core.b
            r6.<init>()
            r7.L$0 = r8
            r7.L$1 = r1
            r7.label = r3
            java.lang.Object r4 = androidx.compose.p000animation.core.InfiniteAnimationPolicyKt.a(r6, r7)
            if (r4 != r0) goto L56
            goto L78
        L56:
            float r4 = r1.element
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L40
            androidx.compose.animation.core.c r4 = new androidx.compose.animation.core.c
            r4.<init>()
            com.google.android.ai4 r4 = androidx.compose.p004runtime.p0.s(r4)
            androidx.compose.animation.core.InfiniteTransition$run$1$1$3 r5 = new androidx.compose.animation.core.InfiniteTransition$run$1$1$3
            r6 = 0
            r5.<init>(r6)
            r7.L$0 = r8
            r7.L$1 = r1
            r7.label = r2
            java.lang.Object r4 = kotlinx.coroutines.flow.d.G(r4, r5, r7)
            if (r4 != r0) goto L40
        L78:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p000animation.core.InfiniteTransition$run$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
