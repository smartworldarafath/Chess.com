package com.google.inputmethod;

import android.view.MotionEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\r\u0010\u0013R\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/google/android/el;", "", "", "Lcom/google/android/hv5;", "changes", "Lcom/google/android/gv5;", "type", "Lcom/google/android/fv5;", "primaryDirectionalMotionAxis", "Landroid/view/MotionEvent;", "nativeEvent", "<init>", "(Ljava/util/List;IILandroid/view/MotionEvent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "I", "getType-4ZHQPSE", "()I", "c", "d", "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class el implements ev5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<IndirectPointerInputChange> changes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int primaryDirectionalMotionAxis;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final MotionEvent nativeEvent;

    public /* synthetic */ el(List list, int i, int i2, MotionEvent motionEvent, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i, i2, motionEvent);
    }

    @Override // com.google.inputmethod.ev5
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getPrimaryDirectionalMotionAxis() {
        return this.primaryDirectionalMotionAxis;
    }

    @Override // com.google.inputmethod.ev5
    public List<IndirectPointerInputChange> b() {
        return this.changes;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final MotionEvent getNativeEvent() {
        return this.nativeEvent;
    }

    private el(List<IndirectPointerInputChange> list, int i, int i2, MotionEvent motionEvent) {
        this.changes = list;
        this.type = i;
        this.primaryDirectionalMotionAxis = i2;
        this.nativeEvent = motionEvent;
        if (b().isEmpty()) {
            throw new IllegalArgumentException("changes cannot be empty");
        }
    }
}
