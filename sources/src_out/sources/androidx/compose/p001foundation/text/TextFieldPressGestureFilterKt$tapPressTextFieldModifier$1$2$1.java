package androidx.compose.p001foundation.text;

import androidx.compose.p001foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p001foundation.interaction.a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.lq2;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.inputmethod.df9;
import com.google.inputmethod.i26;
import com.google.inputmethod.ml9;
import com.google.inputmethod.o58;
import com.google.inputmethod.q6c;
import com.google.inputmethod.r48;
import com.google.inputmethod.rn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1 implements PointerInputEventHandler {
    final /* synthetic */ ta2 a;
    final /* synthetic */ o58<a.b> b;
    final /* synthetic */ r48 c;
    final /* synthetic */ q6c<Function1<rn8, Unit>> d;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/android/ml9;", "Lcom/google/android/rn8;", "it", "", "<anonymous>", "(Lcom/google/android/ml9;Lcom/google/android/rn8;)V"}, k = 3, mv = {2, 1, 0})
    @lq2(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", l = {67}, m = "invokeSuspend", v = 1)
    static final class AnonymousClass1 extends SuspendLambda implements ps4<ml9, rn8, q22<? super Unit>, Object> {
        final /* synthetic */ r48 $interactionSource;
        final /* synthetic */ o58<a.b> $pressedInteraction;
        final /* synthetic */ ta2 $scope;
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
        @lq2(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1", f = "TextFieldPressGestureFilter.kt", l = {60, 64}, m = "invokeSuspend", v = 1)
        static final class C00251 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
            final /* synthetic */ r48 $interactionSource;
            final /* synthetic */ long $it;
            final /* synthetic */ o58<a.b> $pressedInteraction;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00251(o58<a.b> o58Var, long j, r48 r48Var, q22<? super C00251> q22Var) {
                super(2, q22Var);
                this.$pressedInteraction = o58Var;
                this.$it = j;
                this.$interactionSource = r48Var;
            }

            public final q22<Unit> create(Object obj, q22<?> q22Var) {
                return new C00251(this.$pressedInteraction, this.$it, this.$interactionSource, q22Var);
            }

            public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
                return create(ta2Var, q22Var).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code duplicated, block: B:22:0x005a  */
            /* JADX WARN: Code duplicated, block: B:25:0x0065  */
            public final Object invokeSuspend(Object obj) {
                o58<a.b> o58Var;
                o58<a.b> o58Var2;
                a.b bVar;
                r48 r48Var;
                a.b bVar2;
                Object objG = kotlin.coroutines.intrinsics.a.g();
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        o58Var2 = (o58) this.L$0;
                        f.b(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar2 = (a.b) this.L$0;
                        f.b(obj);
                    }
                    bVar = bVar2;
                    this.$pressedInteraction.setValue(bVar);
                    return Unit.a;
                }
                f.b(obj);
                a.b value = this.$pressedInteraction.getValue();
                if (value == null) {
                    bVar = new a.b(this.$it, null);
                    r48Var = this.$interactionSource;
                    if (r48Var != null) {
                        this.L$0 = bVar;
                        this.label = 2;
                        if (r48Var.a(bVar, this) != objG) {
                            bVar2 = bVar;
                            bVar = bVar2;
                        }
                    }
                    this.$pressedInteraction.setValue(bVar);
                    return Unit.a;
                }
                r48 r48Var2 = this.$interactionSource;
                o58Var = this.$pressedInteraction;
                a.C0016a c0016a = new a.C0016a(value);
                if (r48Var2 == null) {
                    o58Var.setValue(null);
                    bVar = new a.b(this.$it, null);
                    r48Var = this.$interactionSource;
                    if (r48Var != null) {
                        this.L$0 = bVar;
                        this.label = 2;
                        if (r48Var.a(bVar, this) != objG) {
                            bVar2 = bVar;
                            bVar = bVar2;
                        }
                    }
                    this.$pressedInteraction.setValue(bVar);
                    return Unit.a;
                }
                this.L$0 = o58Var;
                this.label = 1;
                if (r48Var2.a(c0016a, this) != objG) {
                    o58Var2 = o58Var;
                }
                return objG;
                o58Var = o58Var2;
                o58Var.setValue(null);
                bVar = new a.b(this.$it, null);
                r48Var = this.$interactionSource;
                if (r48Var != null) {
                    this.L$0 = bVar;
                    this.label = 2;
                    if (r48Var.a(bVar, this) != objG) {
                        bVar2 = bVar;
                        bVar = bVar2;
                    }
                    return objG;
                }
                this.$pressedInteraction.setValue(bVar);
                return Unit.a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
        @lq2(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2", f = "TextFieldPressGestureFilter.kt", l = {76}, m = "invokeSuspend", v = 1)
        static final class AnonymousClass2 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
            final /* synthetic */ r48 $interactionSource;
            final /* synthetic */ o58<a.b> $pressedInteraction;
            final /* synthetic */ boolean $success;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(o58<a.b> o58Var, boolean z, r48 r48Var, q22<? super AnonymousClass2> q22Var) {
                super(2, q22Var);
                this.$pressedInteraction = o58Var;
                this.$success = z;
                this.$interactionSource = r48Var;
            }

            public final q22<Unit> create(Object obj, q22<?> q22Var) {
                return new AnonymousClass2(this.$pressedInteraction, this.$success, this.$interactionSource, q22Var);
            }

            public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
                return create(ta2Var, q22Var).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object obj) {
                o58<a.b> o58Var;
                o58<a.b> o58Var2;
                Object objG = kotlin.coroutines.intrinsics.a.g();
                int i = this.label;
                if (i == 0) {
                    f.b(obj);
                    a.b value = this.$pressedInteraction.getValue();
                    if (value != null) {
                        boolean z = this.$success;
                        r48 r48Var = this.$interactionSource;
                        o58Var = this.$pressedInteraction;
                        i26 cVar = z ? new a.c(value) : new a.C0016a(value);
                        if (r48Var != null) {
                            this.L$0 = o58Var;
                            this.label = 1;
                            if (r48Var.a(cVar, this) == objG) {
                                return objG;
                            }
                            o58Var2 = o58Var;
                        }
                        o58Var.setValue(null);
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o58Var2 = (o58) this.L$0;
                f.b(obj);
                o58Var = o58Var2;
                o58Var.setValue(null);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ta2 ta2Var, o58<a.b> o58Var, r48 r48Var, q22<? super AnonymousClass1> q22Var) {
            super(3, q22Var);
            this.$scope = ta2Var;
            this.$pressedInteraction = o58Var;
            this.$interactionSource = r48Var;
        }

        public final Object a(ml9 ml9Var, long j, q22<? super Unit> q22Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scope, this.$pressedInteraction, this.$interactionSource, q22Var);
            anonymousClass1.L$0 = ml9Var;
            anonymousClass1.J$0 = j;
            return anonymousClass1.invokeSuspend(Unit.a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((ml9) obj, ((rn8) obj2).getPackedValue(), (q22) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            Object objG = kotlin.coroutines.intrinsics.a.g();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                ml9 ml9Var = (ml9) this.L$0;
                rw0.d(this.$scope, (CoroutineContext) null, (CoroutineStart) null, new C00251(this.$pressedInteraction, this.J$0, this.$interactionSource, null), 3, (Object) null);
                this.label = 1;
                obj = ml9Var.y2(this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            rw0.d(this.$scope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$pressedInteraction, ((Boolean) obj).booleanValue(), this.$interactionSource, null), 3, (Object) null);
            return Unit.a;
        }
    }

    TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1(ta2 ta2Var, o58<a.b> o58Var, r48 r48Var, q6c<? extends Function1<? super rn8, Unit>> q6cVar) {
        this.a = ta2Var;
        this.b = o58Var;
        this.c = r48Var;
        this.d = q6cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(q6c q6cVar, rn8 rn8Var) {
        ((Function1) q6cVar.getValue()).invoke(rn8Var);
        return Unit.a;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(df9 df9Var, q22<? super Unit> q22Var) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.a, this.b, this.c, null);
        final q6c<Function1<rn8, Unit>> q6cVar = this.d;
        Object objG = TapGestureDetectorKt.g(df9Var, anonymousClass1, new Function1() { // from class: androidx.compose.foundation.text.t
            public final Object invoke(Object obj) {
                return TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.b(q6cVar, (rn8) obj);
            }
        }, q22Var);
        return objG == kotlin.coroutines.intrinsics.a.g() ? objG : Unit.a;
    }
}
