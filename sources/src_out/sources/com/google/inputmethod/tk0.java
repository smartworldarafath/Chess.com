package com.google.inputmethod;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \r2\u00020\u0001:\u0001\tB#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/google/android/tk0;", "", "", "Lcom/google/android/hd2;", "createEntries", "Lcom/google/android/ofa;", "remoteEntry", "<init>", "(Ljava/util/List;Lcom/google/android/ofa;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "Lcom/google/android/ofa;", "b", "()Lcom/google/android/ofa;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class tk0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<hd2> createEntries;

    /* JADX WARN: Multi-variable type inference failed */
    public tk0() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List<hd2> a() {
        return this.createEntries;
    }

    public final ofa b() {
        return null;
    }

    public tk0(List<hd2> list, ofa ofaVar) {
        Intrinsics.checkNotNullParameter(list, "createEntries");
        this.createEntries = list;
    }

    public /* synthetic */ tk0(List list, ofa ofaVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? m.p() : list, (i & 2) != 0 ? null : ofaVar);
    }
}
