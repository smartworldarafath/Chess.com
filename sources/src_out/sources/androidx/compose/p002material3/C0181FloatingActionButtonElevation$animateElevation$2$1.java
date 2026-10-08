package androidx.compose.p002material3;

import com.google.android.ai4;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.android.ui4;
import com.google.inputmethod.i26;
import com.google.inputmethod.j26;
import com.google.inputmethod.lk4;
import com.google.inputmethod.mk4;
import com.google.inputmethod.yf5;
import com.google.inputmethod.zf5;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: renamed from: androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1", f = "FloatingActionButton.kt", l = {651}, m = "invokeSuspend")
final class C0181FloatingActionButtonElevation$animateElevation$2$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ FloatingActionButtonElevationAnimatable $animatable;
    final /* synthetic */ j26 $interactionSource;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0181FloatingActionButtonElevation$animateElevation$2$1(j26 j26Var, FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, q22<? super C0181FloatingActionButtonElevation$animateElevation$2$1> q22Var) {
        super(2, q22Var);
        this.$interactionSource = j26Var;
        this.$animatable = floatingActionButtonElevationAnimatable;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        C0181FloatingActionButtonElevation$animateElevation$2$1 c0181FloatingActionButtonElevation$animateElevation$2$1 = new C0181FloatingActionButtonElevation$animateElevation$2$1(this.$interactionSource, this.$animatable, q22Var);
        c0181FloatingActionButtonElevation$animateElevation$2$1.L$0 = obj;
        return c0181FloatingActionButtonElevation$animateElevation$2$1;
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
            final ArrayList arrayList = new ArrayList();
            ai4<i26> ai4VarC = this.$interactionSource.c();
            final FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = this.$animatable;
            ui4 ui4Var = new ui4() { // from class: androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1.1

                /* JADX INFO: renamed from: androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1$1$1, reason: from Kotlin metadata and collision with other inner class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
                @lq2(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1$1$1", f = "FloatingActionButton.kt", l = {676}, m = "invokeSuspend")
                static final class C00321 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
                    final /* synthetic */ FloatingActionButtonElevationAnimatable $animatable;
                    final /* synthetic */ i26 $targetInteraction;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00321(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, i26 i26Var, q22<? super C00321> q22Var) {
                        super(2, q22Var);
                        this.$animatable = floatingActionButtonElevationAnimatable;
                        this.$targetInteraction = i26Var;
                    }

                    public final q22<Unit> create(Object obj, q22<?> q22Var) {
                        return new C00321(this.$animatable, this.$targetInteraction, q22Var);
                    }

                    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
                        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object objG = a.g();
                        int i = this.label;
                        if (i == 0) {
                            f.b(obj);
                            FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = this.$animatable;
                            i26 i26Var = this.$targetInteraction;
                            this.label = 1;
                            if (floatingActionButtonElevationAnimatable.b(i26Var, this) == objG) {
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

                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(i26 i26Var, q22<? super Unit> q22Var) {
                    if (i26Var instanceof yf5) {
                        arrayList.add(i26Var);
                    } else if (i26Var instanceof zf5) {
                        arrayList.remove(((zf5) i26Var).getEnter());
                    } else if (i26Var instanceof lk4) {
                        arrayList.add(i26Var);
                    } else if (i26Var instanceof mk4) {
                        arrayList.remove(((mk4) i26Var).getFocus());
                    } else if (i26Var instanceof androidx.compose.foundation.interaction.a.b) {
                        arrayList.add(i26Var);
                    } else if (i26Var instanceof androidx.compose.foundation.interaction.a.c) {
                        arrayList.remove(((androidx.compose.foundation.interaction.a.c) i26Var).getPress());
                    } else if (i26Var instanceof androidx.compose.p001foundation.interaction.a.C0016a) {
                        arrayList.remove(((androidx.compose.p001foundation.interaction.a.C0016a) i26Var).getPress());
                    }
                    rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new C00321(floatingActionButtonElevationAnimatable, (i26) m.N0(arrayList), null), 3, (Object) null);
                    return Unit.a;
                }
            };
            this.label = 1;
            if (ai4VarC.collect(ui4Var, this) == objG) {
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
