package androidx.compose.p002material3;

import androidx.compose.p004runtime.s0;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.e;
import com.google.android.rw0;
import com.google.inputmethod.bf9;
import com.google.inputmethod.bs1;
import com.google.inputmethod.f43;
import com.google.inputmethod.fn6;
import com.google.inputmethod.g16;
import com.google.inputmethod.k33;
import com.google.inputmethod.kr;
import com.google.inputmethod.l7d;
import com.google.inputmethod.o58;
import com.google.inputmethod.r16;
import com.google.inputmethod.ugc;
import com.google.inputmethod.wgc;
import com.google.inputmethod.y23;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B-\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R+\u00104\u001a\u00020-2\u0006\u0010.\u001a\u00020-8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u0010\u0014R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010:\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107R\u0014\u0010=\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Landroidx/compose/material3/ClockDialNode;", "Lcom/google/android/k33;", "Lcom/google/android/bf9;", "Lcom/google/android/bs1;", "Lcom/google/android/fn6;", "Landroidx/compose/material3/AnalogTimePickerState;", "state", "", "autoSwitchToMinute", "Landroidx/compose/material3/m2;", "selection", "Lcom/google/android/kr;", "", "animationSpec", "<init>", "(Landroidx/compose/material3/AnalogTimePickerState;ZILcom/google/android/kr;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/q16;", "size", "", "f", "(J)V", "Landroidx/compose/ui/input/pointer/e;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "bounds", "x1", "(Landroidx/compose/ui/input/pointer/e;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "K0", "()V", "E3", "(Landroidx/compose/material3/AnalogTimePickerState;ZILcom/google/android/kr;)V", "r", "Landroidx/compose/material3/AnalogTimePickerState;", "s", "Z", "t", "I", "u", "Lcom/google/android/kr;", "v", "F", "offsetX", "w", "offsetY", "Lcom/google/android/g16;", "<set-?>", "x", "Lcom/google/android/o58;", "B3", "()J", "D3", "center", "Lcom/google/android/wgc;", "y", "Lcom/google/android/wgc;", "pointerInputTapNode", "z", "pointerInputDragNode", "C3", "()F", "maxDist", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ClockDialNode extends k33 implements bf9, bs1, fn6 {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private AnalogTimePickerState state;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean autoSwitchToMinute;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private int selection;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private kr<Float> animationSpec;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private float offsetX;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private float offsetY;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final o58 center;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final wgc pointerInputTapNode;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final wgc pointerInputDragNode;

    public /* synthetic */ ClockDialNode(AnalogTimePickerState analogTimePickerState, boolean z, int i, kr krVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(analogTimePickerState, z, i, krVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final long B3() {
        return ((g16) this.center.getValue()).getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float C3() {
        f43 f43VarM = y23.m(this);
        return (f43VarM.x2(TimePickerKt.h) * f43VarM.O1(this.state.u())) / f43VarM.O1(l7d.a.b());
    }

    private final void D3(long j) {
        this.center.setValue(g16.c(j));
    }

    public final void E3(AnalogTimePickerState state, boolean autoSwitchToMinute, int selection, kr<Float> animationSpec) {
        this.state = state;
        this.autoSwitchToMinute = autoSwitchToMinute;
        this.animationSpec = animationSpec;
        if (m2.f(this.selection, selection)) {
            return;
        }
        this.selection = selection;
        rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0172ClockDialNode$updateNode$1(state, animationSpec, null), 3, (Object) null);
    }

    @Override // com.google.inputmethod.bf9
    public void K0() {
        this.pointerInputTapNode.K0();
        this.pointerInputDragNode.K0();
    }

    @Override // com.google.inputmethod.fn6, com.google.inputmethod.kj7
    public void f(long size) {
        D3(r16.b(size));
        this.state.C(y23.m(this).O0((int) (size >> 32)));
    }

    @Override // com.google.inputmethod.bf9
    public void x1(e pointerEvent, PointerEventPass pass, long bounds) {
        this.pointerInputTapNode.x1(pointerEvent, pass, bounds);
        this.pointerInputDragNode.x1(pointerEvent, pass, bounds);
    }

    private ClockDialNode(AnalogTimePickerState analogTimePickerState, boolean z, int i, kr<Float> krVar) {
        this.state = analogTimePickerState;
        this.autoSwitchToMinute = z;
        this.selection = i;
        this.animationSpec = krVar;
        this.center = s0.e(g16.c(g16.INSTANCE.b()), null, 2, null);
        this.pointerInputTapNode = (wgc) m3(ugc.a(new ClockDialNode$pointerInputTapNode$1(this)));
        this.pointerInputDragNode = (wgc) m3(ugc.a(new ClockDialNode$pointerInputDragNode$1(this)));
    }
}
