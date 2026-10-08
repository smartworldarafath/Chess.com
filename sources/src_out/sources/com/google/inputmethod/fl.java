package com.google.inputmethod;

import android.view.InputDevice;
import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0015\u0010\r\u001a\u00020\u0005*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"", "actionMasked", "Lcom/google/android/gv5;", "a", "(I)I", "Landroid/view/MotionEvent;", "motionEvent", "Lcom/google/android/fv5;", "c", "(Landroid/view/MotionEvent;)I", "Lcom/google/android/ev5;", "b", "(Lcom/google/android/ev5;)Landroid/view/MotionEvent;", "nativeEvent", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class fl {
    public static final int a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return gv5.INSTANCE.a();
                }
                if (i != 5) {
                    if (i != 6) {
                        return gv5.INSTANCE.d();
                    }
                }
            }
            return gv5.INSTANCE.c();
        }
        return gv5.INSTANCE.b();
    }

    public static final MotionEvent b(ev5 ev5Var) {
        Intrinsics.h(ev5Var, "null cannot be cast to non-null type androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent");
        return ((el) ev5Var).getNativeEvent();
    }

    public static final int c(MotionEvent motionEvent) {
        if (!motionEvent.isFromSource(2097152)) {
            throw new IllegalArgumentException("MotionEvent must be a touch navigation source");
        }
        InputDevice device = motionEvent.getDevice();
        if (device != null) {
            InputDevice.MotionRange motionRange = device.getMotionRange(0);
            InputDevice.MotionRange motionRange2 = device.getMotionRange(1);
            if (motionRange != null && motionRange2 == null) {
                return fv5.INSTANCE.b();
            }
            if (motionRange2 != null && motionRange == null) {
                return fv5.INSTANCE.c();
            }
            if (motionRange != null && motionRange2 != null) {
                float range = motionRange.getRange();
                float range2 = motionRange2.getRange();
                if (range > range2 && (range2 == 0.0f || range / range2 >= 5.0f)) {
                    return fv5.INSTANCE.b();
                }
                if (range2 > range && (range == 0.0f || range2 / range >= 5.0f)) {
                    return fv5.INSTANCE.c();
                }
            }
        }
        return fv5.INSTANCE.a();
    }
}
