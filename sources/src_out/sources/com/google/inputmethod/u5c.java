package com.google.inputmethod;

import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\n\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/google/android/u5c;", "Lcom/google/android/r5c;", "Landroid/content/Intent;", "intent", "Lcom/google/android/v7;", "parameters", "Landroid/os/Bundle;", "activityOptions", "<init>", "(Landroid/content/Intent;Lcom/google/android/v7;Landroid/os/Bundle;)V", "a", "Landroid/content/Intent;", "c", "()Landroid/content/Intent;", "b", "Lcom/google/android/v7;", "getParameters", "()Lcom/google/android/v7;", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class u5c implements r5c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Intent intent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final v7 parameters;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Bundle activityOptions;

    public u5c(Intent intent, v7 v7Var, Bundle bundle) {
        this.intent = intent;
        this.parameters = v7Var;
        this.activityOptions = bundle;
    }

    @Override // com.google.inputmethod.r5c
    /* JADX INFO: renamed from: a, reason: from getter */
    public Bundle getActivityOptions() {
        return this.activityOptions;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Intent getIntent() {
        return this.intent;
    }

    @Override // com.google.inputmethod.r5c
    public v7 getParameters() {
        return this.parameters;
    }
}
