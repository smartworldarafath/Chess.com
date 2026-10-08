package com.google.inputmethod;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00132\u00020\u0001:\u0001\rBC\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\r\u0010\u0010R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/google/android/kl0;", "", "", "Lcom/google/android/ve2;", "credentialEntries", "Lcom/google/android/k7;", "actions", "Lcom/google/android/p70;", "authenticationActions", "Lcom/google/android/ofa;", "remoteEntry", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/google/android/ofa;)V", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Lcom/google/android/ofa;", "d", "()Lcom/google/android/ofa;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class kl0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<ve2> credentialEntries;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<k7> actions;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<p70> authenticationActions;

    public kl0() {
        this(null, null, null, null, 15, null);
    }

    public final List<k7> a() {
        return this.actions;
    }

    public final List<p70> b() {
        return this.authenticationActions;
    }

    public final List<ve2> c() {
        return this.credentialEntries;
    }

    public final ofa d() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kl0(List<? extends ve2> list, List<k7> list2, List<p70> list3, ofa ofaVar) {
        Intrinsics.checkNotNullParameter(list, "credentialEntries");
        Intrinsics.checkNotNullParameter(list2, "actions");
        Intrinsics.checkNotNullParameter(list3, "authenticationActions");
        this.credentialEntries = list;
        this.actions = list2;
        this.authenticationActions = list3;
    }

    public /* synthetic */ kl0(List list, List list2, List list3, ofa ofaVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? m.p() : list, (i & 2) != 0 ? m.p() : list2, (i & 4) != 0 ? m.p() : list3, (i & 8) != 0 ? null : ofaVar);
    }
}
