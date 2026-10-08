package androidx.compose.p001foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import com.google.android.lq2;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.cc0;
import com.google.inputmethod.df9;
import com.google.inputmethod.ml9;
import com.google.inputmethod.rn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {274}, m = "invokeSuspend", v = 1)
final class TapGestureDetectorKt$detectTapAndPress$2 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ ps4<ml9, rn8, q22<? super Unit>, Object> $onPress;
    final /* synthetic */ Function1<rn8, Unit> $onTap;
    final /* synthetic */ PressGestureScopeImpl $pressScope;
    final /* synthetic */ df9 $this_detectTapAndPress;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/cc0;", "", "<anonymous>", "(Lcom/google/android/cc0;)V"}, k = 3, mv = {2, 1, 0})
    @lq2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {277, 283}, m = "invokeSuspend", v = 1)
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<cc0, q22<? super Unit>, Object> {
        final /* synthetic */ ta2 $$this$coroutineScope;
        final /* synthetic */ ps4<ml9, rn8, q22<? super Unit>, Object> $onPress;
        final /* synthetic */ Function1<rn8, Unit> $onTap;
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
        @lq2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {280}, m = "invokeSuspend", v = 1)
        static final class C00151 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
            final /* synthetic */ PointerInputChange $down;
            final /* synthetic */ ps4<ml9, rn8, q22<? super Unit>, Object> $onPress;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00151(ps4<? super ml9, ? super rn8, ? super q22<? super Unit>, ? extends Object> ps4Var, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, q22<? super C00151> q22Var) {
                super(2, q22Var);
                this.$onPress = ps4Var;
                this.$pressScope = pressGestureScopeImpl;
                this.$down = pointerInputChange;
            }

            public final q22<Unit> create(Object obj, q22<?> q22Var) {
                return new C00151(this.$onPress, this.$pressScope, this.$down, q22Var);
            }

            public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
                return create(ta2Var, q22Var).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object objG = a.g();
                int i = this.label;
                if (i == 0) {
                    f.b(obj);
                    ps4<ml9, rn8, q22<? super Unit>, Object> ps4Var = this.$onPress;
                    PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                    rn8 rn8VarD = rn8.d(this.$down.getPosition());
                    this.label = 1;
                    if (ps4Var.invoke(pressGestureScopeImpl, rn8VarD, this) == objG) {
                        return objG;
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

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
        @lq2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
        static final class AnonymousClass2 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PressGestureScopeImpl pressGestureScopeImpl, q22<? super AnonymousClass2> q22Var) {
                super(2, q22Var);
                this.$pressScope = pressGestureScopeImpl;
            }

            public final q22<Unit> create(Object obj, q22<?> q22Var) {
                return new AnonymousClass2(this.$pressScope, q22Var);
            }

            public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
                return create(ta2Var, q22Var).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object obj) {
                a.g();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                this.$pressScope.b();
                return Unit.a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
        @lq2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
        static final class AnonymousClass3 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(PressGestureScopeImpl pressGestureScopeImpl, q22<? super AnonymousClass3> q22Var) {
                super(2, q22Var);
                this.$pressScope = pressGestureScopeImpl;
            }

            public final q22<Unit> create(Object obj, q22<?> q22Var) {
                return new AnonymousClass3(this.$pressScope, q22Var);
            }

            public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
                return create(ta2Var, q22Var).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object obj) {
                a.g();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                this.$pressScope.f();
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(ta2 ta2Var, ps4<? super ml9, ? super rn8, ? super q22<? super Unit>, ? extends Object> ps4Var, Function1<? super rn8, Unit> function1, PressGestureScopeImpl pressGestureScopeImpl, q22<? super AnonymousClass1> q22Var) {
            super(2, q22Var);
            this.$$this$coroutineScope = ta2Var;
            this.$onPress = ps4Var;
            this.$onTap = function1;
            this.$pressScope = pressGestureScopeImpl;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(cc0 cc0Var, q22<? super Unit> q22Var) {
            return create(cc0Var, q22Var).invokeSuspend(Unit.a);
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$onPress, this.$onTap, this.$pressScope, q22Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0087, code lost:
        
            if (r0 == r6) goto L19;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r3 = r16
                java.lang.Object r6 = kotlin.coroutines.intrinsics.a.g()
                int r0 = r3.label
                r7 = 2
                r8 = 1
                r9 = 0
                if (r0 == 0) goto L34
                if (r0 == r8) goto L24
                if (r0 != r7) goto L1c
                java.lang.Object r0 = r3.L$0
                kotlinx.coroutines.s r0 = (kotlinx.coroutines.s) r0
                kotlin.f.b(r17)
                r11 = r0
                r0 = r17
                goto L8a
            L1c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L24:
                java.lang.Object r0 = r3.L$1
                kotlinx.coroutines.s r0 = (kotlinx.coroutines.s) r0
                java.lang.Object r1 = r3.L$0
                com.google.android.cc0 r1 = (com.google.inputmethod.cc0) r1
                kotlin.f.b(r17)
                r11 = r0
                r0 = r1
                r1 = r17
                goto L5f
            L34:
                kotlin.f.b(r17)
                java.lang.Object r0 = r3.L$0
                com.google.android.cc0 r0 = (com.google.inputmethod.cc0) r0
                com.google.android.ta2 r10 = r3.$$this$coroutineScope
                kotlinx.coroutines.CoroutineStart r12 = kotlinx.coroutines.CoroutineStart.d
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1
                androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = r3.$pressScope
                r13.<init>(r1, r9)
                r14 = 1
                r15 = 0
                r11 = 0
                kotlinx.coroutines.s r10 = com.google.android.rw0.d(r10, r11, r12, r13, r14, r15)
                r3.L$0 = r0
                r3.L$1 = r10
                r3.label = r8
                r1 = 0
                r2 = 0
                r4 = 3
                r5 = 0
                java.lang.Object r1 = androidx.compose.p001foundation.gestures.TapGestureDetectorKt.d(r0, r1, r2, r3, r4, r5)
                if (r1 != r6) goto L5e
                goto L89
            L5e:
                r11 = r10
            L5f:
                androidx.compose.ui.input.pointer.i r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
                r1.a()
                com.google.android.ps4<com.google.android.ml9, com.google.android.rn8, com.google.android.q22<? super kotlin.Unit>, java.lang.Object> r2 = r3.$onPress
                com.google.android.ps4 r4 = androidx.compose.p001foundation.gestures.TapGestureDetectorKt.b()
                if (r2 == r4) goto L7d
                com.google.android.ta2 r10 = r3.$$this$coroutineScope
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1
                com.google.android.ps4<com.google.android.ml9, com.google.android.rn8, com.google.android.q22<? super kotlin.Unit>, java.lang.Object> r2 = r3.$onPress
                androidx.compose.foundation.gestures.PressGestureScopeImpl r4 = r3.$pressScope
                r13.<init>(r2, r4, r1, r9)
                r14 = 2
                r15 = 0
                r12 = 0
                androidx.compose.p001foundation.gestures.TapGestureDetectorKt.m(r10, r11, r12, r13, r14, r15)
            L7d:
                r3.L$0 = r11
                r3.L$1 = r9
                r3.label = r7
                java.lang.Object r0 = androidx.compose.p001foundation.gestures.TapGestureDetectorKt.r(r0, r9, r3, r8, r9)
                if (r0 != r6) goto L8a
            L89:
                return r6
            L8a:
                androidx.compose.ui.input.pointer.i r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
                if (r0 != 0) goto L9e
                com.google.android.ta2 r10 = r3.$$this$coroutineScope
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2
                androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = r3.$pressScope
                r13.<init>(r0, r9)
                r14 = 2
                r15 = 0
                r12 = 0
                androidx.compose.p001foundation.gestures.TapGestureDetectorKt.m(r10, r11, r12, r13, r14, r15)
                goto Lbf
            L9e:
                r0.a()
                com.google.android.ta2 r10 = r3.$$this$coroutineScope
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3
                androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = r3.$pressScope
                r13.<init>(r1, r9)
                r14 = 2
                r15 = 0
                r12 = 0
                androidx.compose.p001foundation.gestures.TapGestureDetectorKt.m(r10, r11, r12, r13, r14, r15)
                kotlin.jvm.functions.Function1<com.google.android.rn8, kotlin.Unit> r1 = r3.$onTap
                if (r1 == 0) goto Lbf
                long r4 = r0.getPosition()
                com.google.android.rn8 r0 = com.google.inputmethod.rn8.d(r4)
                r1.invoke(r0)
            Lbf:
                kotlin.Unit r0 = kotlin.Unit.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TapGestureDetectorKt$detectTapAndPress$2(df9 df9Var, ps4<? super ml9, ? super rn8, ? super q22<? super Unit>, ? extends Object> ps4Var, Function1<? super rn8, Unit> function1, PressGestureScopeImpl pressGestureScopeImpl, q22<? super TapGestureDetectorKt$detectTapAndPress$2> q22Var) {
        super(2, q22Var);
        this.$this_detectTapAndPress = df9Var;
        this.$onPress = ps4Var;
        this.$onTap = function1;
        this.$pressScope = pressGestureScopeImpl;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        TapGestureDetectorKt$detectTapAndPress$2 tapGestureDetectorKt$detectTapAndPress$2 = new TapGestureDetectorKt$detectTapAndPress$2(this.$this_detectTapAndPress, this.$onPress, this.$onTap, this.$pressScope, q22Var);
        tapGestureDetectorKt$detectTapAndPress$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapAndPress$2;
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ta2 ta2Var = (ta2) this.L$0;
            df9 df9Var = this.$this_detectTapAndPress;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ta2Var, this.$onPress, this.$onTap, this.$pressScope, null);
            this.label = 1;
            if (ForEachGestureKt.d(df9Var, anonymousClass1, this) == objG) {
                return objG;
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
