package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u00002\u00020\u0001B7\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\f\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0019\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/google/android/ti6;", "", "", "key", "objectKey", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupHandle;", "handle", "nodes", "index", "<init>", "(ILjava/lang/Object;JII)V", "a", "I", "getKey", "()I", "b", "Ljava/lang/Object;", "getObjectKey", "()Ljava/lang/Object;", "c", "J", "()J", "d", "e", "joinedKey", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ti6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int key;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Object objectKey;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long handle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int nodes;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int index;

    public ti6(int i, Object obj, long j, int i2, int i3) {
        this.key = i;
        this.objectKey = obj;
        this.handle = j;
        this.nodes = i2;
        this.index = i3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getHandle() {
        return this.handle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    public final Object c() {
        return this.objectKey != null ? new JoinedKey(Integer.valueOf(this.key), this.objectKey) : Integer.valueOf(this.key);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getNodes() {
        return this.nodes;
    }
}
