package com.google.inputmethod;

import androidx.compose.ui.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u0000 \u00102\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0011B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/google/android/aw4;", "Lcom/google/android/fhd;", "Lcom/google/android/x23;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/zv4;", "gestureConnection", "<init>", "(Lcom/google/android/zv4;)V", "p", "Lcom/google/android/zv4;", "m3", "()Lcom/google/android/zv4;", "", "p1", "()Ljava/lang/Object;", "traverseKey", "q", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class aw4 extends b.c implements fhd, x23 {

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final zv4 gestureConnection;

    /* JADX INFO: renamed from: com.google.android.aw4$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/android/aw4$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public aw4(zv4 zv4Var) {
        this.gestureConnection = zv4Var;
    }

    /* JADX INFO: renamed from: m3, reason: from getter */
    public final zv4 getGestureConnection() {
        return this.gestureConnection;
    }

    @Override // com.google.inputmethod.fhd
    /* JADX INFO: renamed from: p1 */
    public Object getTraverseKey() {
        return INSTANCE;
    }
}
