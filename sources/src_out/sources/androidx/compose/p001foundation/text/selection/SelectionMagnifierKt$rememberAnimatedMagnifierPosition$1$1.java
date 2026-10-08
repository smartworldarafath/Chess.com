package androidx.compose.p001foundation.text.selection;

import androidx.compose.p000animation.core.Animatable;
import androidx.compose.p004runtime.p0;
import com.google.android.ai4;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.android.ui4;
import com.google.inputmethod.q6c;
import com.google.inputmethod.rn8;
import com.google.inputmethod.rr;
import com.google.inputmethod.w2c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1", f = "SelectionMagnifier.kt", l = {83}, m = "invokeSuspend", v = 1)
final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ Animatable<rn8, rr> $animatable;
    final /* synthetic */ q6c<rn8> $targetValue$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(q6c<rn8> q6cVar, Animatable<rn8, rr> animatable, q22<? super SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1> q22Var) {
        super(2, q22Var);
        this.$targetValue$delegate = q6cVar;
        this.$animatable = animatable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rn8 l(q6c q6cVar) {
        return rn8.d(SelectionMagnifierKt.n(q6cVar));
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(this.$targetValue$delegate, this.$animatable, q22Var);
        selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.L$0 = obj;
        return selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1;
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            final ta2 ta2Var = (ta2) this.L$0;
            final q6c<rn8> q6cVar = this.$targetValue$delegate;
            ai4 ai4VarS = p0.s(new Function0() { // from class: androidx.compose.foundation.text.selection.l
                public final Object invoke() {
                    return SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.l(q6cVar);
                }
            });
            final Animatable<rn8, rr> animatable = this.$animatable;
            ui4 ui4Var = new ui4() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.2

                /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1, reason: invalid class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
                @lq2(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1", f = "SelectionMagnifier.kt", l = {96}, m = "invokeSuspend", v = 1)
                static final class AnonymousClass1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
                    final /* synthetic */ Animatable<rn8, rr> $animatable;
                    final /* synthetic */ long $targetValue;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Animatable<rn8, rr> animatable, long j, q22<? super AnonymousClass1> q22Var) {
                        super(2, q22Var);
                        this.$animatable = animatable;
                        this.$targetValue = j;
                    }

                    public final q22<Unit> create(Object obj, q22<?> q22Var) {
                        return new AnonymousClass1(this.$animatable, this.$targetValue, q22Var);
                    }

                    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
                        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object objG = a.g();
                        int i = this.label;
                        if (i == 0) {
                            f.b(obj);
                            Animatable<rn8, rr> animatable = this.$animatable;
                            rn8 rn8VarD = rn8.d(this.$targetValue);
                            w2c<rn8> w2cVarL = SelectionMagnifierKt.l();
                            this.label = 1;
                            if (Animatable.f(animatable, rn8VarD, w2cVarL, null, null, this, 12, null) == objG) {
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

                public final Object a(long j, q22<? super Unit> q22Var) {
                    if ((animatable.m().getPackedValue() & 9223372034707292159L) == 9205357640488583168L || (j & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (animatable.m().getPackedValue() & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
                        Object objT = animatable.t(rn8.d(j), q22Var);
                        return objT == a.g() ? objT : Unit.a;
                    }
                    rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(animatable, j, null), 3, (Object) null);
                    return Unit.a;
                }

                public /* bridge */ /* synthetic */ Object emit(Object obj2, q22 q22Var) {
                    return a(((rn8) obj2).getPackedValue(), q22Var);
                }
            };
            this.label = 1;
            if (ai4VarS.collect(ui4Var, this) == objG) {
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
