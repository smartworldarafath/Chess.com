package com.google.inputmethod;

import android.widget.RemoteViews;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.aga, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/google/android/aga;", "", "Landroid/widget/RemoteViews;", "remoteViews", "Lcom/google/android/sy5;", "view", "<init>", "(Landroid/widget/RemoteViews;Lcom/google/android/sy5;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/widget/RemoteViews;", "()Landroid/widget/RemoteViews;", "b", "Lcom/google/android/sy5;", "()Lcom/google/android/sy5;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RemoteViewsInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final RemoteViews remoteViews;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final InsertedViewInfo view;

    public RemoteViewsInfo(RemoteViews remoteViews, InsertedViewInfo insertedViewInfo) {
        this.remoteViews = remoteViews;
        this.view = insertedViewInfo;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final RemoteViews getRemoteViews() {
        return this.remoteViews;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InsertedViewInfo getView() {
        return this.view;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteViewsInfo)) {
            return false;
        }
        RemoteViewsInfo remoteViewsInfo = (RemoteViewsInfo) other;
        return Intrinsics.e(this.remoteViews, remoteViewsInfo.remoteViews) && Intrinsics.e(this.view, remoteViewsInfo.view);
    }

    public int hashCode() {
        return (this.remoteViews.hashCode() * 31) + this.view.hashCode();
    }

    public String toString() {
        return "RemoteViewsInfo(remoteViews=" + this.remoteViews + ", view=" + this.view + ')';
    }
}
