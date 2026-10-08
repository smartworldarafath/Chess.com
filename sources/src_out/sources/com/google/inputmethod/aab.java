package com.google.inputmethod;

import androidx.compose.ui.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\r\b\u0001\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0015B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u0006R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/google/android/aab;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/fhd;", "", "enabled", "<init>", "(Z)V", "", "n3", "", "p", "Ljava/lang/Object;", "p1", "()Ljava/lang/Object;", "traverseKey", "value", "q", "Z", "m3", "()Z", "r", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class aab extends b.c implements fhd {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int s = 8;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final Object traverseKey = INSTANCE;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean enabled;

    /* JADX INFO: renamed from: com.google.android.aab$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/android/aab$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public aab(boolean z) {
        this.enabled = z;
    }

    /* JADX INFO: renamed from: m3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void n3(boolean enabled) {
        this.enabled = enabled;
    }

    @Override // com.google.inputmethod.fhd
    /* JADX INFO: renamed from: p1, reason: from getter */
    public Object getTraverseKey() {
        return this.traverseKey;
    }
}
