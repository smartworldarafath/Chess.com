package com.google.inputmethod;

import android.app.PictureInPictureUiState;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0003\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\u0004\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/android/m99;", "", "", "isStashed", "isTransitioningToPip", "<init>", "(ZZ)V", "a", "Z", "()Z", "b", "c", "core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m99 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isStashed;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isTransitioningToPip;

    /* JADX INFO: renamed from: com.google.android.m99$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/android/m99$a;", "", "<init>", "()V", "Landroid/app/PictureInPictureUiState;", "uiState", "Lcom/google/android/m99;", "a", "(Landroid/app/PictureInPictureUiState;)Lcom/google/android/m99;", "core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m99 a(PictureInPictureUiState uiState) {
            Intrinsics.checkNotNullParameter(uiState, "uiState");
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                return new m99(uiState.isStashed(), uiState.isTransitioningToPip());
            }
            return i >= 31 ? new m99(uiState.isStashed(), false) : new m99(false, false);
        }

        private Companion() {
        }
    }

    public m99(boolean z, boolean z2) {
        this.isStashed = z;
        this.isTransitioningToPip = z2;
    }
}
