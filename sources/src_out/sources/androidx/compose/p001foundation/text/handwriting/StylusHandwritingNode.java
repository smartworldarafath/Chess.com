package androidx.compose.p001foundation.text.handwriting;

import androidx.compose.p001foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.e;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.al4;
import com.google.inputmethod.bf9;
import com.google.inputmethod.cc0;
import com.google.inputmethod.df9;
import com.google.inputmethod.dl4;
import com.google.inputmethod.hcc;
import com.google.inputmethod.ik4;
import com.google.inputmethod.k33;
import com.google.inputmethod.ugc;
import com.google.inputmethod.wgc;
import com.google.inputmethod.y23;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\tR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Landroidx/compose/foundation/text/handwriting/StylusHandwritingNode;", "Lcom/google/android/k33;", "Lcom/google/android/bf9;", "Lcom/google/android/ik4;", "Lcom/google/android/al4;", "Lkotlin/Function0;", "", "onHandwritingSlopExceeded", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/google/android/dl4;", "focusState", "J", "(Lcom/google/android/dl4;)V", "Landroidx/compose/ui/input/pointer/e;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Lcom/google/android/q16;", "bounds", "x1", "(Landroidx/compose/ui/input/pointer/e;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "K0", "()V", "r", "Lkotlin/jvm/functions/Function0;", "t3", "()Lkotlin/jvm/functions/Function0;", "u3", "", "s", "Z", "focused", "Lcom/google/android/wgc;", "t", "Lcom/google/android/wgc;", "suspendingPointerInputModifierNode", "Lcom/google/android/pbd;", "w0", "()J", "touchBoundsExpansion", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class StylusHandwritingNode extends k33 implements bf9, ik4, al4 {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private Function0<Unit> onHandwritingSlopExceeded;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean focused;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final wgc suspendingPointerInputModifierNode = (wgc) m3(ugc.a(new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1

        /* JADX INFO: renamed from: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/cc0;", "", "<anonymous>", "(Lcom/google/android/cc0;)V"}, k = 3, mv = {2, 1, 0})
        @lq2(c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", f = "StylusHandwriting.kt", l = {116, 144, 182}, m = "invokeSuspend", v = 1)
        static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<cc0, q22<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ StylusHandwritingNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(StylusHandwritingNode stylusHandwritingNode, q22<? super AnonymousClass1> q22Var) {
                super(2, q22Var);
                this.this$0 = stylusHandwritingNode;
            }

            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(cc0 cc0Var, q22<? super Unit> q22Var) {
                return create(cc0Var, q22Var).invokeSuspend(Unit.a);
            }

            public final q22<Unit> create(Object obj, q22<?> q22Var) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, q22Var);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
            
                if (r8 == r1) goto L74;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00f4, code lost:
            
                if (r9 == r1) goto L74;
             */
            /* JADX WARN: Code restructure failed: missing block: B:73:0x01a3, code lost:
            
                if (r5 == r1) goto L74;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x01a5, code lost:
            
                return r1;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00f4 -> B:42:0x00f8). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01a3 -> B:75:0x01a6). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) throws kotlin.KotlinNothingValueException {
                /*
                    Method dump skipped, instruction units count: 489
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(df9 df9Var, q22<? super Unit> q22Var) {
            Object objD = ForEachGestureKt.d(df9Var, new AnonymousClass1(this.a, null), q22Var);
            return objD == a.g() ? objD : Unit.a;
        }
    }));

    public StylusHandwritingNode(Function0<Unit> function0) {
        this.onHandwritingSlopExceeded = function0;
    }

    @Override // com.google.inputmethod.ik4
    public void J(dl4 focusState) {
        this.focused = focusState.a();
    }

    @Override // com.google.inputmethod.bf9
    public void K0() {
        this.suspendingPointerInputModifierNode.K0();
    }

    public final Function0<Unit> t3() {
        return this.onHandwritingSlopExceeded;
    }

    public final void u3(Function0<Unit> function0) {
        this.onHandwritingSlopExceeded = function0;
    }

    @Override // com.google.inputmethod.bf9
    public long w0() {
        return hcc.a().a(y23.m(this));
    }

    @Override // com.google.inputmethod.bf9
    public void x1(e pointerEvent, PointerEventPass pass, long bounds) {
        this.suspendingPointerInputModifierNode.x1(pointerEvent, pass, bounds);
    }
}
