package com.google.inputmethod;

import android.view.MotionEvent;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014\"\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/google/android/ve9;", "", "", "uptime", "", "Lcom/google/android/we9;", "pointers", "Landroid/view/MotionEvent;", "motionEvent", "<init>", "(JLjava/util/List;Landroid/view/MotionEvent;)V", "a", "J", "getUptime", "()J", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "(Landroid/view/MotionEvent;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ve9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long uptime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<PointerInputEventData> pointers;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private MotionEvent motionEvent;

    public ve9(long j, List<PointerInputEventData> list, MotionEvent motionEvent) {
        this.uptime = j;
        this.pointers = list;
        this.motionEvent = motionEvent;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final MotionEvent getMotionEvent() {
        return this.motionEvent;
    }

    public final List<PointerInputEventData> b() {
        return this.pointers;
    }

    public final void c(MotionEvent motionEvent) {
        this.motionEvent = motionEvent;
    }
}
