package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.google.android.hv5, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010\u0019R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b#\u0010\u001eR$\u0010(\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b%\u0010\u001e¨\u0006)"}, d2 = {"Lcom/google/android/hv5;", "", "Lcom/google/android/se9;", "id", "", "uptimeMillis", "Lcom/google/android/rn8;", "position", "", "pressed", "", "pressure", "previousUptimeMillis", "previousPosition", "previousPressed", "<init>", "(JJJZFJJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "a", "()V", "", "toString", "()Ljava/lang/String;", "J", "b", "()J", "g", "c", "d", "Z", "()Z", "e", "F", "getPressure", "()F", "f", "getPreviousUptimeMillis", "h", "value", "i", "isConsumed", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IndirectPointerInputChange {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long uptimeMillis;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long position;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final boolean pressed;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final float pressure;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final long previousUptimeMillis;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final long previousPosition;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final boolean previousPressed;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private boolean isConsumed;

    public /* synthetic */ IndirectPointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2);
    }

    public final void a() {
        this.isConsumed = true;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getPressed() {
        return this.pressed;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getPreviousPosition() {
        return this.previousPosition;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsConsumed() {
        return this.isConsumed;
    }

    public String toString() {
        return "IndirectPointerInputChange(id=" + ((Object) se9.d(this.id)) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) rn8.s(this.position)) + ", pressed=" + this.pressed + ", pressure=" + this.pressure + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + ((Object) rn8.s(this.previousPosition)) + ", previousPressed=" + this.previousPressed + ", isConsumed=" + this.isConsumed + ')';
    }

    private IndirectPointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2) {
        this.id = j;
        this.uptimeMillis = j2;
        this.position = j3;
        this.pressed = z;
        this.pressure = f;
        this.previousUptimeMillis = j4;
        this.previousPosition = j5;
        this.previousPressed = z2;
    }
}
