package com.google.inputmethod;

import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0003R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/google/android/ue9;", "", "<init>", "()V", "Lcom/google/android/ve9;", "pointerInputEvent", "Lcom/google/android/ug9;", "positionCalculator", "Lcom/google/android/o56;", "b", "(Lcom/google/android/ve9;Lcom/google/android/ug9;)Lcom/google/android/o56;", "", "a", "Lcom/google/android/ha7;", "Lcom/google/android/ue9$a;", "Lcom/google/android/ha7;", "previousPointerInputData", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ue9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ha7<a> previousPointerInputData = new ha7<>(0, 1, null);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/google/android/ue9$a;", "", "", "uptime", "Lcom/google/android/rn8;", "positionOnScreen", "", "down", "<init>", "(JJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "J", "c", "()J", "b", "Z", "()Z", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long uptime;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final long positionOnScreen;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean down;

        public /* synthetic */ a(long j, long j2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, z);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getDown() {
            return this.down;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getPositionOnScreen() {
            return this.positionOnScreen;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getUptime() {
            return this.uptime;
        }

        private a(long j, long j2, boolean z) {
            this.uptime = j;
            this.positionOnScreen = j2;
            this.down = z;
        }
    }

    public final void a() {
        this.previousPointerInputData.a();
    }

    public final o56 b(ve9 pointerInputEvent, ug9 positionCalculator) {
        long uptime;
        boolean down;
        long jI;
        ha7 ha7Var = new ha7(pointerInputEvent.b().size());
        List<PointerInputEventData> listB = pointerInputEvent.b();
        int size = listB.size();
        for (int i = 0; i < size; i++) {
            PointerInputEventData pointerInputEventData = listB.get(i);
            a aVarD = this.previousPointerInputData.d(pointerInputEventData.getId());
            if (aVarD == null) {
                down = false;
                uptime = pointerInputEventData.getUptime();
                jI = pointerInputEventData.getPosition();
            } else {
                uptime = aVarD.getUptime();
                down = aVarD.getDown();
                jI = positionCalculator.i(aVarD.getPositionOnScreen());
            }
            ha7Var.h(pointerInputEventData.getId(), new PointerInputChange(pointerInputEventData.getId(), pointerInputEventData.getUptime(), pointerInputEventData.getPosition(), pointerInputEventData.getDown(), pointerInputEventData.getPressure(), uptime, jI, down, false, pointerInputEventData.getType(), pointerInputEventData.c(), pointerInputEventData.getScrollDelta(), pointerInputEventData.getScaleGestureFactor(), pointerInputEventData.getPanGestureOffset(), pointerInputEventData.getOriginalEventPosition(), null));
            if (pointerInputEventData.getDown()) {
                this.previousPointerInputData.h(pointerInputEventData.getId(), new a(pointerInputEventData.getUptime(), pointerInputEventData.getPositionOnScreen(), pointerInputEventData.getDown(), null));
            } else {
                this.previousPointerInputData.i(pointerInputEventData.getId());
            }
        }
        return new o56(ha7Var, pointerInputEvent);
    }
}
