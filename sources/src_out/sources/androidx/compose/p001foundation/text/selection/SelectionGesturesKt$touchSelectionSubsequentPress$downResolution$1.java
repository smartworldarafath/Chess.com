package androidx.compose.p001foundation.text.selection;

import androidx.compose.p001foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.cc0;
import com.google.inputmethod.rn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/cc0;", "Landroidx/compose/foundation/text/selection/DownResolution;", "<anonymous>", "(Lcom/google/android/cc0;)Landroidx/compose/foundation/text/selection/DownResolution;"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1", f = "SelectionGestures.kt", l = {195}, m = "invokeSuspend", v = 1)
final class SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 extends RestrictedSuspendLambda implements Function2<cc0, q22<? super DownResolution>, Object> {
    final /* synthetic */ Ref.LongRef $overSlop;
    final /* synthetic */ long $pointerId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(long j, Ref.LongRef longRef, q22<? super SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1> q22Var) {
        super(2, q22Var);
        this.$pointerId = j;
        this.$overSlop = longRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(Ref.LongRef longRef, PointerInputChange pointerInputChange, rn8 rn8Var) {
        pointerInputChange.a();
        longRef.element = rn8Var.getPackedValue();
        return Unit.a;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 = new SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(this.$pointerId, this.$overSlop, q22Var);
        selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1.L$0 = obj;
        return selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1;
    }

    public final Object invokeSuspend(Object obj) {
        cc0 cc0Var;
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            cc0 cc0Var2 = (cc0) this.L$0;
            long j = this.$pointerId;
            final Ref.LongRef longRef = this.$overSlop;
            Function2 function2 = new Function2() { // from class: androidx.compose.foundation.text.selection.i
                public final Object invoke(Object obj2, Object obj3) {
                    return SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1.m(longRef, (PointerInputChange) obj2, (rn8) obj3);
                }
            };
            this.L$0 = cc0Var2;
            this.label = 1;
            Object objJ = DragGestureDetectorKt.j(cc0Var2, j, function2, this);
            if (objJ == objG) {
                return objG;
            }
            cc0Var = cc0Var2;
            obj = objJ;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cc0Var = (cc0) this.L$0;
            f.b(obj);
        }
        if (((PointerInputChange) obj) != null && (this.$overSlop.element & 9223372034707292159L) != 9205357640488583168L) {
            return DownResolution.Drag;
        }
        PointerInputChange pointerInputChange = (PointerInputChange) m.z0(cc0Var.a2().c());
        if (!androidx.compose.ui.input.pointer.f.d(pointerInputChange)) {
            return DownResolution.Cancel;
        }
        pointerInputChange.a();
        return DownResolution.Up;
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final Object invoke(cc0 cc0Var, q22<? super DownResolution> q22Var) {
        return create(cc0Var, q22Var).invokeSuspend(Unit.a);
    }
}
