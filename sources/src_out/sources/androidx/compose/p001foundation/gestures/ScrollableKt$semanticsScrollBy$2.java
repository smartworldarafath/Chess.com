package androidx.compose.p001foundation.gestures;

import androidx.compose.p000animation.core.SuspendAnimationKt;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.ve8;
import com.google.inputmethod.we8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ve8;", "", "<anonymous>", "(Lcom/google/android/ve8;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", f = "Scrollable.kt", l = {1150}, m = "invokeSuspend", v = 1)
final class ScrollableKt$semanticsScrollBy$2 extends SuspendLambda implements Function2<ve8, q22<? super Unit>, Object> {
    final /* synthetic */ long $offset;
    final /* synthetic */ Ref.FloatRef $previousValue;
    final /* synthetic */ ScrollingLogic $this_semanticsScrollBy;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollableKt$semanticsScrollBy$2(ScrollingLogic scrollingLogic, long j, Ref.FloatRef floatRef, q22<? super ScrollableKt$semanticsScrollBy$2> q22Var) {
        super(2, q22Var);
        this.$this_semanticsScrollBy = scrollingLogic;
        this.$offset = j;
        this.$previousValue = floatRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(Ref.FloatRef floatRef, ScrollingLogic scrollingLogic, ve8 ve8Var, float f, float f2) {
        floatRef.element += scrollingLogic.z(scrollingLogic.G(ve8Var.b(scrollingLogic.H(scrollingLogic.z(f - floatRef.element)), we8.INSTANCE.b())));
        return Unit.a;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        ScrollableKt$semanticsScrollBy$2 scrollableKt$semanticsScrollBy$2 = new ScrollableKt$semanticsScrollBy$2(this.$this_semanticsScrollBy, this.$offset, this.$previousValue, q22Var);
        scrollableKt$semanticsScrollBy$2.L$0 = obj;
        return scrollableKt$semanticsScrollBy$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            final ve8 ve8Var = (ve8) this.L$0;
            float fG = this.$this_semanticsScrollBy.G(this.$offset);
            final Ref.FloatRef floatRef = this.$previousValue;
            final ScrollingLogic scrollingLogic = this.$this_semanticsScrollBy;
            Function2 function2 = new Function2() { // from class: androidx.compose.foundation.gestures.s
                public final Object invoke(Object obj2, Object obj3) {
                    return ScrollableKt$semanticsScrollBy$2.m(floatRef, scrollingLogic, ve8Var, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.m(0.0f, fG, 0.0f, null, function2, this, 12, null) == objG) {
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

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final Object invoke(ve8 ve8Var, q22<? super Unit> q22Var) {
        return create(ve8Var, q22Var).invokeSuspend(Unit.a);
    }
}
