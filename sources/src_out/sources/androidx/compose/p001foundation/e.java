package androidx.compose.p001foundation;

import android.view.KeyEvent;
import androidx.compose.p001foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.f;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.google.inputmethod.IndirectPointerInputChange;
import com.google.inputmethod.av5;
import com.google.inputmethod.cs1;
import com.google.inputmethod.ev5;
import com.google.inputmethod.hpa;
import com.google.inputmethod.iv5;
import com.google.inputmethod.p7e;
import com.google.inputmethod.r48;
import com.google.inputmethod.rn8;
import com.google.inputmethod.up1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0011\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u0018J\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b(\u0010%J\u0017\u0010*\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020,2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\"2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000eH\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u000eH\u0016¢\u0006\u0004\b5\u00104JS\u00106\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00062\u0006\u00100\u001a\u000208H\u0004¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00062\u0006\u00100\u001a\u000208H\u0004¢\u0006\u0004\b;\u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006B"}, d2 = {"Landroidx/compose/foundation/e;", "Landroidx/compose/foundation/AbstractClickableNode;", "Lcom/google/android/r48;", "interactionSource", "Lcom/google/android/av5;", "indicationNodeFactory", "", "useLocalIndication", "enabled", "", "onClickLabel", "Lcom/google/android/hpa;", "role", "Lkotlin/Function0;", "", "onClick", "<init>", "(Lcom/google/android/r48;Lcom/google/android/av5;ZZLjava/lang/String;Lcom/google/android/hpa;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/input/pointer/i;", "down", "l4", "(Landroidx/compose/ui/input/pointer/i;)V", "Lcom/google/android/hv5;", "m4", "(Lcom/google/android/hv5;)V", "up", "p4", "q4", "Landroidx/compose/ui/input/pointer/e;", "pointerEvent", "Lcom/google/android/q16;", "bounds", "o4", "(Landroidx/compose/ui/input/pointer/e;J)V", "Lcom/google/android/ev5;", "indirectPointerEvent", "n4", "(Lcom/google/android/ev5;)V", "j4", "(Landroidx/compose/ui/input/pointer/e;)V", "k4", "indirectPointer", "i4", "(Z)V", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "x1", "(Landroidx/compose/ui/input/pointer/e;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "event", "p2", "(Lcom/google/android/ev5;Landroidx/compose/ui/input/pointer/PointerEventPass;)V", "K0", "()V", "z2", "r4", "(Lcom/google/android/r48;Lcom/google/android/av5;ZZLjava/lang/String;Lcom/google/android/hpa;Lkotlin/jvm/functions/Function0;)V", "Lcom/google/android/oi6;", "a4", "(Landroid/view/KeyEvent;)Z", "b4", "Q", "Landroidx/compose/ui/input/pointer/i;", "downEvent", "R", "Lcom/google/android/hv5;", "indirectDownEvent", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class e extends AbstractClickableNode {

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private PointerInputChange downEvent;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private IndirectPointerInputChange indirectDownEvent;

    public /* synthetic */ e(r48 r48Var, av5 av5Var, boolean z, boolean z2, String str, hpa hpaVar, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(r48Var, av5Var, z, z2, str, hpaVar, function0);
    }

    private final void i4(boolean indirectPointer) {
        if (indirectPointer) {
            this.indirectDownEvent = null;
        } else {
            this.downEvent = null;
        }
        R3(indirectPointer);
    }

    private final void j4(androidx.compose.ui.input.pointer.e pointerEvent) {
        if (this.downEvent != null) {
            List<PointerInputChange> listC = pointerEvent.c();
            int size = listC.size();
            for (int i = 0; i < size; i++) {
                PointerInputChange pointerInputChange = listC.get(i);
                if (pointerInputChange.q() && !Intrinsics.e(pointerInputChange, this.downEvent)) {
                    i4(false);
                    return;
                }
            }
        }
    }

    private final void k4(ev5 indirectPointerEvent) {
        if (this.indirectDownEvent != null) {
            List<IndirectPointerInputChange> listB = indirectPointerEvent.b();
            int size = listB.size();
            for (int i = 0; i < size; i++) {
                IndirectPointerInputChange indirectPointerInputChange = listB.get(i);
                if (indirectPointerInputChange.getIsConsumed() && !Intrinsics.e(indirectPointerInputChange, this.indirectDownEvent)) {
                    i4(true);
                    return;
                }
            }
        }
    }

    private final void l4(PointerInputChange down) {
        down.a();
        this.downEvent = down;
        if (getEnabled()) {
            if (up1.isDelayPressesUsingGestureConsumptionEnabled) {
                U3(down);
            } else {
                W3(down.getPosition(), false);
            }
        }
    }

    private final void m4(IndirectPointerInputChange down) {
        down.a();
        this.indirectDownEvent = down;
        if (getEnabled()) {
            if (up1.isDelayPressesUsingGestureConsumptionEnabled) {
                V3(down);
            } else {
                W3(down.getPosition(), true);
            }
        }
    }

    private final void n4(ev5 indirectPointerEvent) {
        float fC = ((p7e) cs1.a(this, CompositionLocalsKt.u())).c();
        List<IndirectPointerInputChange> listB = indirectPointerEvent.b();
        int size = listB.size();
        for (int i = 0; i < size; i++) {
            IndirectPointerInputChange indirectPointerInputChange = listB.get(i);
            long position = indirectPointerInputChange.getPosition();
            IndirectPointerInputChange indirectPointerInputChange2 = this.indirectDownEvent;
            Intrinsics.g(indirectPointerInputChange2);
            boolean z = Math.abs(rn8.k(rn8.p(position, indirectPointerInputChange2.getPosition()))) > fC;
            if (indirectPointerInputChange.getIsConsumed() || z) {
                i4(true);
                return;
            }
        }
    }

    private final void o4(androidx.compose.ui.input.pointer.e pointerEvent, long bounds) {
        long jO3 = O3(bounds);
        List<PointerInputChange> listC = pointerEvent.c();
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = listC.get(i);
            if (pointerInputChange.q() || f.f(pointerInputChange, bounds, jO3)) {
                i4(false);
                return;
            }
        }
    }

    private final void p4(PointerInputChange up) {
        up.a();
        if (getEnabled()) {
            PointerInputChange pointerInputChange = this.downEvent;
            Intrinsics.g(pointerInputChange);
            T3(pointerInputChange.getPosition(), false);
            P3().invoke();
        }
        this.downEvent = null;
    }

    private final void q4(IndirectPointerInputChange up) {
        up.a();
        if (getEnabled()) {
            IndirectPointerInputChange indirectPointerInputChange = this.indirectDownEvent;
            Intrinsics.g(indirectPointerInputChange);
            T3(indirectPointerInputChange.getPosition(), true);
            P3().invoke();
        }
        this.indirectDownEvent = null;
    }

    @Override // androidx.compose.p001foundation.AbstractClickableNode, com.google.inputmethod.bf9
    public void K0() {
        super.K0();
        i4(false);
    }

    @Override // androidx.compose.p001foundation.AbstractClickableNode
    protected final boolean a4(KeyEvent event) {
        return false;
    }

    @Override // androidx.compose.p001foundation.AbstractClickableNode
    protected final boolean b4(KeyEvent event) {
        P3().invoke();
        return true;
    }

    @Override // androidx.compose.p001foundation.AbstractClickableNode, com.google.inputmethod.mv5
    public void p2(ev5 event, PointerEventPass pass) {
        super.p2(event, pass);
        if (pass != PointerEventPass.Main) {
            if (pass == PointerEventPass.Final) {
                k4(event);
                return;
            }
            return;
        }
        if (this.indirectDownEvent == null) {
            List<IndirectPointerInputChange> listB = event.b();
            int size = listB.size();
            for (int i = 0; i < size; i++) {
                if (iv5.g(listB.get(i))) {
                    m4(event.b().get(0));
                    return;
                }
            }
            return;
        }
        List<IndirectPointerInputChange> listB2 = event.b();
        int size2 = listB2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!ClickableKt.j(listB2.get(i2))) {
                n4(event);
                return;
            }
        }
        q4(event.b().get(0));
    }

    public final void r4(r48 interactionSource, av5 indicationNodeFactory, boolean useLocalIndication, boolean enabled, String onClickLabel, hpa role, Function0<Unit> onClick) {
        h4(interactionSource, indicationNodeFactory, useLocalIndication, enabled, onClickLabel, role, onClick);
    }

    @Override // androidx.compose.p001foundation.AbstractClickableNode, com.google.inputmethod.bf9
    public void x1(androidx.compose.ui.input.pointer.e pointerEvent, PointerEventPass pass, long bounds) {
        super.x1(pointerEvent, pass, bounds);
        if (pass != PointerEventPass.Main) {
            if (pass == PointerEventPass.Final) {
                j4(pointerEvent);
            }
        } else {
            if (this.downEvent == null) {
                if (TapGestureDetectorKt.k(pointerEvent, true, false, 2, null)) {
                    l4(pointerEvent.c().get(0));
                    return;
                }
                return;
            }
            List<PointerInputChange> listC = pointerEvent.c();
            int size = listC.size();
            for (int i = 0; i < size; i++) {
                if (!f.c(listC.get(i))) {
                    o4(pointerEvent, bounds);
                    return;
                }
            }
            p4(pointerEvent.c().get(0));
        }
    }

    @Override // com.google.inputmethod.mv5
    public void z2() {
        i4(true);
    }

    private e(r48 r48Var, av5 av5Var, boolean z, boolean z2, String str, hpa hpaVar, Function0<Unit> function0) {
        super(r48Var, av5Var, z, z2, str, hpaVar, function0, null);
    }
}
