package androidx.compose.p001foundation.gestures;

import androidx.compose.p001foundation.MutatePriority;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.fu0;
import com.google.inputmethod.g16;
import com.google.inputmethod.gba;
import com.google.inputmethod.ve8;
import com.google.inputmethod.we8;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s;
import kotlinx.coroutines.u;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", l = {212}, m = "invokeSuspend", v = 1)
final class ContentInViewNode$launchAnimation$2 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ UpdatableAnimationState $animationState;
    final /* synthetic */ fu0 $bringIntoViewSpec;
    final /* synthetic */ long $viewportAdjustmentForReverseScroll;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContentInViewNode this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ve8;", "", "<anonymous>", "(Lcom/google/android/ve8;)V"}, k = 3, mv = {2, 1, 0})
    @lq2(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", l = {219}, m = "invokeSuspend", v = 1)
    static final class AnonymousClass1 extends SuspendLambda implements Function2<ve8, q22<? super Unit>, Object> {
        final /* synthetic */ s $animationJob;
        final /* synthetic */ UpdatableAnimationState $animationState;
        final /* synthetic */ fu0 $bringIntoViewSpec;
        final /* synthetic */ long $viewportAdjustmentForReverseScroll;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ContentInViewNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(UpdatableAnimationState updatableAnimationState, ContentInViewNode contentInViewNode, fu0 fu0Var, long j, s sVar, q22<? super AnonymousClass1> q22Var) {
            super(2, q22Var);
            this.$animationState = updatableAnimationState;
            this.this$0 = contentInViewNode;
            this.$bringIntoViewSpec = fu0Var;
            this.$viewportAdjustmentForReverseScroll = j;
            this.$animationJob = sVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(ContentInViewNode contentInViewNode, UpdatableAnimationState updatableAnimationState, s sVar, ve8 ve8Var, float f) {
            float f2 = contentInViewNode.reverseDirection ? 1.0f : -1.0f;
            ScrollingLogic scrollingLogic = contentInViewNode.scrollingLogic;
            float fG = f2 * scrollingLogic.G(scrollingLogic.A(ve8Var.b(scrollingLogic.A(scrollingLogic.H(f2 * f)), we8.INSTANCE.b())));
            if (Math.abs(fG) < Math.abs(f)) {
                u.f(sVar, "Scroll animation cancelled because scroll was not consumed (" + fG + " < " + f + ')', (Throwable) null, 2, (Object) null);
            }
            return Unit.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(ContentInViewNode contentInViewNode, UpdatableAnimationState updatableAnimationState, fu0 fu0Var) {
            ContentInViewNode contentInViewNode2;
            boolean zC3;
            g gVar = contentInViewNode.bringIntoViewRequests;
            while (true) {
                if (gVar.requests.getSize() == 0) {
                    contentInViewNode2 = contentInViewNode;
                    break;
                }
                gba gbaVar = (gba) ((ContentInViewNode.a) gVar.requests.q()).b().invoke();
                if (gbaVar == null) {
                    contentInViewNode2 = contentInViewNode;
                    zC3 = true;
                } else {
                    contentInViewNode2 = contentInViewNode;
                    zC3 = ContentInViewNode.C3(contentInViewNode2, gbaVar, 0L, 0L, 3, null);
                }
                if (!zC3) {
                    break;
                }
                ((ContentInViewNode.a) gVar.requests.u(gVar.requests.getSize() - 1)).a().resumeWith(Result.b(Unit.a));
                contentInViewNode = contentInViewNode2;
            }
            if (contentInViewNode2.trackingFocusedChild) {
                gba gbaVar2 = (gba) contentInViewNode2.getFocusedRect.invoke();
                if (gbaVar2 != null && ContentInViewNode.C3(contentInViewNode2, gbaVar2, 0L, 0L, 3, null)) {
                    contentInViewNode2.trackingFocusedChild = false;
                }
            }
            updatableAnimationState.f(contentInViewNode2.v3(fu0Var, g16.INSTANCE.b()));
            return Unit.a;
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$animationState, this.this$0, this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll, this.$animationJob, q22Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invokeSuspend(Object obj) {
            Object objG = a.g();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                final ve8 ve8Var = (ve8) this.L$0;
                this.$animationState.f(this.this$0.v3(this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll));
                final UpdatableAnimationState updatableAnimationState = this.$animationState;
                final ContentInViewNode contentInViewNode = this.this$0;
                final s sVar = this.$animationJob;
                Function1<? super Float, Unit> function1 = new Function1() { // from class: androidx.compose.foundation.gestures.h
                    public final Object invoke(Object obj2) {
                        return ContentInViewNode$launchAnimation$2.AnonymousClass1.o(contentInViewNode, updatableAnimationState, sVar, ve8Var, ((Float) obj2).floatValue());
                    }
                };
                final ContentInViewNode contentInViewNode2 = this.this$0;
                final UpdatableAnimationState updatableAnimationState2 = this.$animationState;
                final fu0 fu0Var = this.$bringIntoViewSpec;
                Function0<Unit> function0 = new Function0() { // from class: androidx.compose.foundation.gestures.i
                    public final Object invoke() {
                        return ContentInViewNode$launchAnimation$2.AnonymousClass1.p(contentInViewNode2, updatableAnimationState2, fu0Var);
                    }
                };
                this.label = 1;
                if (updatableAnimationState.c(function1, function0, this) == objG) {
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

        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ve8 ve8Var, q22<? super Unit> q22Var) {
            return create(ve8Var, q22Var).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContentInViewNode$launchAnimation$2(ContentInViewNode contentInViewNode, UpdatableAnimationState updatableAnimationState, fu0 fu0Var, long j, q22<? super ContentInViewNode$launchAnimation$2> q22Var) {
        super(2, q22Var);
        this.this$0 = contentInViewNode;
        this.$animationState = updatableAnimationState;
        this.$bringIntoViewSpec = fu0Var;
        this.$viewportAdjustmentForReverseScroll = j;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        ContentInViewNode$launchAnimation$2 contentInViewNode$launchAnimation$2 = new ContentInViewNode$launchAnimation$2(this.this$0, this.$animationState, this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll, q22Var);
        contentInViewNode$launchAnimation$2.L$0 = obj;
        return contentInViewNode$launchAnimation$2;
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    f.b(obj);
                    s sVarK = u.k(((ta2) this.L$0).getCoroutineContext());
                    this.this$0.isAnimationRunning = true;
                    ScrollingLogic scrollingLogic = this.this$0.scrollingLogic;
                    MutatePriority mutatePriority = MutatePriority.Default;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$animationState, this.this$0, this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll, sVarK, null);
                    this.label = 1;
                    if (scrollingLogic.B(mutatePriority, anonymousClass1, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.b(obj);
                }
                this.this$0.bringIntoViewRequests.f();
                this.this$0.isAnimationRunning = false;
                this.this$0.bringIntoViewRequests.c(null);
                this.this$0.trackingFocusedChild = false;
                return Unit.a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            this.this$0.isAnimationRunning = false;
            this.this$0.bringIntoViewRequests.c(null);
            this.this$0.trackingFocusedChild = false;
            throw th;
        }
    }
}
