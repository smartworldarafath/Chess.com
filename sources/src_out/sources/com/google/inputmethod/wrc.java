package com.google.inputmethod;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/google/android/wrc;", "", "", "mask", "<init>", "(I)V", "other", "", "d", "(Lcom/google/android/wrc;)Z", "", "toString", "()Ljava/lang/String;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "e", "b", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class wrc {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final wrc c = new wrc(0);
    private static final wrc d = new wrc(1);
    private static final wrc e = new wrc(2);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int mask;

    /* JADX INFO: renamed from: com.google.android.wrc$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\n\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000f\u0010\fR \u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\n\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0012\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/google/android/wrc$a;", "", "<init>", "()V", "", "Lcom/google/android/wrc;", "decorations", "a", "(Ljava/util/List;)Lcom/google/android/wrc;", "None", "Lcom/google/android/wrc;", "c", "()Lcom/google/android/wrc;", "getNone$annotations", "Underline", "d", "getUnderline$annotations", "LineThrough", "b", "getLineThrough$annotations", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final wrc a(List<wrc> decorations) {
            Integer numValueOf = 0;
            int size = decorations.size();
            for (int i = 0; i < size; i++) {
                numValueOf = Integer.valueOf(numValueOf.intValue() | decorations.get(i).getMask());
            }
            return new wrc(numValueOf.intValue());
        }

        public final wrc b() {
            return wrc.e;
        }

        public final wrc c() {
            return wrc.c;
        }

        public final wrc d() {
            return wrc.d;
        }

        private Companion() {
        }
    }

    public wrc(int i) {
        this.mask = i;
    }

    public final boolean d(wrc other) {
        int i = this.mask;
        return (other.mask | i) == i;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMask() {
        return this.mask;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof wrc) && this.mask == ((wrc) other).mask;
    }

    public int hashCode() {
        return this.mask;
    }

    public String toString() {
        if (this.mask == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.mask & d.mask) != 0) {
            arrayList.add("Underline");
        }
        if ((this.mask & e.mask) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + m47.e(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
