package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.google.inputmethod.ef9;
import com.google.inputmethod.kn6;
import com.google.inputmethod.o56;
import com.google.inputmethod.rn8;
import com.google.inputmethod.ze9;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0004R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"androidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1", "Lcom/google/android/ze9;", "", "c", "()V", "Landroidx/compose/ui/input/pointer/e;", "pointerEvent", "", "shouldConsume", "b", "(Landroidx/compose/ui/input/pointer/e;Z)V", "d", "(Landroidx/compose/ui/input/pointer/e;)V", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Lcom/google/android/q16;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/e;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancel", "Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", "a", "Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", "state", "Landroidx/compose/ui/input/pointer/e;", "lastEventDispatchedToInitialPass", "getShareWithSiblings", "()Z", "shareWithSiblings", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PointerInteropFilter$pointerInputFilter$1 extends ze9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private PointerInteropFilter.DispatchToViewState state = PointerInteropFilter.DispatchToViewState.Unknown;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private e lastEventDispatchedToInitialPass;
    final /* synthetic */ PointerInteropFilter c;

    PointerInteropFilter$pointerInputFilter$1(PointerInteropFilter pointerInteropFilter) {
        this.c = pointerInteropFilter;
    }

    private final void b(e pointerEvent, boolean shouldConsume) {
        List<PointerInputChange> listC = pointerEvent.c();
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            if (listC.get(i).q()) {
                d(pointerEvent);
                return;
            }
        }
        kn6 layoutCoordinates$ui = getLayoutCoordinates();
        if (layoutCoordinates$ui == null) {
            throw new IllegalStateException("layoutCoordinates not set");
        }
        long jN = layoutCoordinates$ui.N(rn8.INSTANCE.c());
        final PointerInteropFilter pointerInteropFilter = this.c;
        ef9.c(pointerEvent, jN, new Function1<MotionEvent, Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0) {
                    pointerInteropFilter.c().invoke(motionEvent);
                } else {
                    this.this$0.state = ((Boolean) pointerInteropFilter.c().invoke(motionEvent)).booleanValue() ? PointerInteropFilter.DispatchToViewState.Dispatching : PointerInteropFilter.DispatchToViewState.NotDispatching;
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((MotionEvent) obj);
                return Unit.a;
            }
        });
        if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
            if (shouldConsume) {
                int size2 = listC.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    listC.get(i2).a();
                }
            }
            o56 internalPointerEvent = pointerEvent.getInternalPointerEvent();
            if (internalPointerEvent != null) {
                internalPointerEvent.e(!this.c.getDisallowIntercept());
            }
        }
    }

    private final void c() {
        this.state = PointerInteropFilter.DispatchToViewState.Unknown;
        this.c.d(false);
        this.lastEventDispatchedToInitialPass = null;
    }

    private final void d(e pointerEvent) {
        if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
            kn6 layoutCoordinates$ui = getLayoutCoordinates();
            if (layoutCoordinates$ui == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            long jN = layoutCoordinates$ui.N(rn8.INSTANCE.c());
            final PointerInteropFilter pointerInteropFilter = this.c;
            ef9.b(pointerEvent, jN, new Function1<MotionEvent, Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$stopDispatching$1
                {
                    super(1);
                }

                public final void a(MotionEvent motionEvent) {
                    pointerInteropFilter.c().invoke(motionEvent);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((MotionEvent) obj);
                    return Unit.a;
                }
            });
        }
        this.state = PointerInteropFilter.DispatchToViewState.NotDispatching;
    }

    @Override // com.google.inputmethod.ze9
    public boolean getShareWithSiblings() {
        return true;
    }

    @Override // com.google.inputmethod.ze9
    public void onCancel() {
        if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            final PointerInteropFilter pointerInteropFilter = this.c;
            ef9.a(jUptimeMillis, new Function1<MotionEvent, Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$onCancel$1
                {
                    super(1);
                }

                public final void a(MotionEvent motionEvent) {
                    pointerInteropFilter.c().invoke(motionEvent);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((MotionEvent) obj);
                    return Unit.a;
                }
            });
            c();
        }
    }

    @Override // com.google.inputmethod.ze9
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public void mo15onPointerEventH0pRuoY(e pointerEvent, PointerEventPass pass, long bounds) {
        boolean z;
        boolean z2;
        boolean z3;
        List<PointerInputChange> listC = pointerEvent.c();
        int size = listC.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            PointerInputChange pointerInputChange = listC.get(i);
            if (f.b(pointerInputChange) || f.d(pointerInputChange)) {
                z = false;
                break;
            }
            i++;
        }
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = listC.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                z2 = true;
                break;
            } else {
                if (listC.get(i2).q()) {
                    z2 = false;
                    break;
                }
                i2++;
            }
        }
        if (this.c.getDisallowIntercept()) {
            z3 = true;
            break;
        }
        int size3 = listC.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                if (!z2) {
                    z3 = false;
                    break;
                }
                break;
            } else {
                PointerInputChange pointerInputChange2 = listC.get(i3);
                if (!f.b(pointerInputChange2) && !f.d(pointerInputChange2)) {
                    i3++;
                }
            }
            z3 = true;
            break;
        }
        if (this.state != PointerInteropFilter.DispatchToViewState.NotDispatching) {
            if (pass == PointerEventPass.Initial && z3) {
                this.lastEventDispatchedToInitialPass = pointerEvent;
                b(pointerEvent, !z || this.c.getDisallowIntercept());
            }
            if (pass == PointerEventPass.Main && z && Intrinsics.e(pointerEvent, this.lastEventDispatchedToInitialPass) && this.c.getDisallowIntercept()) {
                int size4 = listC.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    listC.get(i4).a();
                }
            }
            if (pass == PointerEventPass.Final && !z3 && !Intrinsics.e(pointerEvent, this.lastEventDispatchedToInitialPass)) {
                b(pointerEvent, true);
            }
        }
        if (pass == PointerEventPass.Final) {
            int size5 = listC.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    c();
                    break;
                } else if (!f.d(listC.get(i5))) {
                    break;
                } else {
                    i5++;
                }
            }
            if (Intrinsics.e(pointerEvent, this.lastEventDispatchedToInitialPass) && z) {
                int size6 = listC.size();
                for (int i6 = 0; i6 < size6; i6++) {
                    if (listC.get(i6).q()) {
                        if (this.c.getDisallowIntercept()) {
                            break;
                        }
                        d(pointerEvent);
                        return;
                    }
                }
                int size7 = listC.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    listC.get(i7).a();
                }
            }
        }
    }
}
