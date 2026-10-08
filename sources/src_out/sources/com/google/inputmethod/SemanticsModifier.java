package com.google.inputmethod;

import androidx.p008glance.g;
import androidx.p008glance.semantics.SemanticsConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.xeb, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/google/android/xeb;", "Landroidx/glance/g$b;", "Landroidx/glance/semantics/SemanticsConfiguration;", "configuration", "<init>", "(Landroidx/glance/semantics/SemanticsConfiguration;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/glance/semantics/SemanticsConfiguration;", "()Landroidx/glance/semantics/SemanticsConfiguration;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SemanticsModifier implements g.b {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final SemanticsConfiguration configuration;

    public SemanticsModifier(SemanticsConfiguration semanticsConfiguration) {
        this.configuration = semanticsConfiguration;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final SemanticsConfiguration getConfiguration() {
        return this.configuration;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SemanticsModifier) && Intrinsics.e(this.configuration, ((SemanticsModifier) other).configuration);
    }

    public int hashCode() {
        return this.configuration.hashCode();
    }

    public String toString() {
        return "SemanticsModifier(configuration=" + this.configuration + ')';
    }
}
