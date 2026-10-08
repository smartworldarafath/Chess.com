package androidx.compose.p001foundation.gestures;

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
@lq2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {104}, m = "invokeSuspend", v = 1)
final class TapGestureDetectorKt$detectTapGestures$2 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ Function1<rn8, Unit> $onDoubleTap;
    final /* synthetic */ Function1<rn8, Unit> $onLongPress;
    final /* synthetic */ ps4<ml9, rn8, q22<? super Unit>, Object> $onPress;
    final /* synthetic */ Function1<rn8, Unit> $onTap;
    final /* synthetic */ df9 $this_detectTapGestures;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/cc0;", "", "<anonymous>", "(Lcom/google/android/cc0;)V"}, k = 3, mv = {2, 1, 0})
    @lq2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {105}, m = "invokeSuspend", v = 1)
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<cc0, q22<? super Unit>, Object> {
        final /* synthetic */ ta2 $$this$coroutineScope;
        final /* synthetic */ Function1<rn8, Unit> $onDoubleTap;
        final /* synthetic */ Function1<rn8, Unit> $onLongPress;
        final /* synthetic */ ps4<ml9, rn8, q22<? super Unit>, Object> $onPress;
        final /* synthetic */ Function1<rn8, Unit> $onTap;
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(ta2 ta2Var, PressGestureScopeImpl pressGestureScopeImpl, Function1<? super rn8, Unit> function1, Function1<? super rn8, Unit> function2, ps4<? super ml9, ? super rn8, ? super q22<? super Unit>, ? extends Object> ps4Var, Function1<? super rn8, Unit> function3, q22<? super AnonymousClass1> q22Var) {
            super(2, q22Var);
            this.$$this$coroutineScope = ta2Var;
            this.$pressScope = pressGestureScopeImpl;
            this.$onDoubleTap = function1;
            this.$onLongPress = function2;
            this.$onPress = ps4Var;
            this.$onTap = function3;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(cc0 cc0Var, q22<? super Unit> q22Var) {
            return create(cc0Var, q22Var).invokeSuspend(Unit.a);
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$pressScope, this.$onDoubleTap, this.$onLongPress, this.$onPress, this.$onTap, q22Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invokeSuspend(Object obj) {
            Object objG = a.g();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                cc0 cc0Var = (cc0) this.L$0;
                ta2 ta2Var = this.$$this$coroutineScope;
                PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                Function1<rn8, Unit> function1 = this.$onDoubleTap;
                Function1<rn8, Unit> function2 = this.$onLongPress;
                ps4<ml9, rn8, q22<? super Unit>, Object> ps4Var = this.$onPress;
                Function1<rn8, Unit> function3 = this.$onTap;
                this.label = 1;
                if (TapGestureDetectorKt.n(cc0Var, ta2Var, pressGestureScopeImpl, function1, function2, ps4Var, function3, this) == objG) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TapGestureDetectorKt$detectTapGestures$2(df9 df9Var, Function1<? super rn8, Unit> function1, Function1<? super rn8, Unit> function2, ps4<? super ml9, ? super rn8, ? super q22<? super Unit>, ? extends Object> ps4Var, Function1<? super rn8, Unit> function3, q22<? super TapGestureDetectorKt$detectTapGestures$2> q22Var) {
        super(2, q22Var);
        this.$this_detectTapGestures = df9Var;
        this.$onDoubleTap = function1;
        this.$onLongPress = function2;
        this.$onPress = ps4Var;
        this.$onTap = function3;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        TapGestureDetectorKt$detectTapGestures$2 tapGestureDetectorKt$detectTapGestures$2 = new TapGestureDetectorKt$detectTapGestures$2(this.$this_detectTapGestures, this.$onDoubleTap, this.$onLongPress, this.$onPress, this.$onTap, q22Var);
        tapGestureDetectorKt$detectTapGestures$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapGestures$2;
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
            PressGestureScopeImpl pressGestureScopeImpl = new PressGestureScopeImpl(this.$this_detectTapGestures);
            df9 df9Var = this.$this_detectTapGestures;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ta2Var, pressGestureScopeImpl, this.$onDoubleTap, this.$onLongPress, this.$onPress, this.$onTap, null);
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
