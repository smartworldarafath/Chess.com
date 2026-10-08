package com.google.inputmethod;

import android.content.Context;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.google.android.qka, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u000f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Lcom/google/android/qka;", "Lcom/google/android/ti1;", "", "resId", "<init>", "(I)V", "Landroid/content/Context;", "context", "Lcom/google/android/ei1;", "a", "(Landroid/content/Context;)J", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "b", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ResourceColorProvider implements ti1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int resId;

    public ResourceColorProvider(int i) {
        this.resId = i;
    }

    @Override // com.google.inputmethod.ti1
    public long a(Context context) {
        return ki1.b(ui1.a.a(context, this.resId));
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getResId() {
        return this.resId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ResourceColorProvider) && this.resId == ((ResourceColorProvider) other).resId;
    }

    public int hashCode() {
        return Integer.hashCode(this.resId);
    }

    public String toString() {
        return "ResourceColorProvider(resId=" + this.resId + ')';
    }
}
