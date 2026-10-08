package com.google.inputmethod;

import android.os.Bundle;
import androidx.p008glance.g;
import androidx.p008glance.layout.Alignment;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.google.android.zp3, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Lcom/google/android/zp3;", "Lcom/google/android/jq3;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "Landroidx/glance/g;", "d", "Landroidx/glance/g;", "a", "()Landroidx/glance/g;", "b", "(Landroidx/glance/g;)V", "modifier", "Landroidx/glance/layout/a$b;", "e", "I", "i", "()I", "k", "(I)V", "horizontalAlignment", "Landroid/os/Bundle;", "f", "Landroid/os/Bundle;", "h", "()Landroid/os/Bundle;", "j", "(Landroid/os/Bundle;)V", "activityOptions", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class EmittableLazyList extends jq3 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private g modifier;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private int horizontalAlignment;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private Bundle activityOptions;

    public EmittableLazyList() {
        super(0, true, 1, null);
        this.modifier = g.INSTANCE;
        this.horizontalAlignment = Alignment.INSTANCE.c();
    }

    @Override // com.google.inputmethod.rp3
    /* JADX INFO: renamed from: a, reason: from getter */
    public g getModifier() {
        return this.modifier;
    }

    @Override // com.google.inputmethod.rp3
    public void b(g gVar) {
        this.modifier = gVar;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Bundle getActivityOptions() {
        return this.activityOptions;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    public final void j(Bundle bundle) {
        this.activityOptions = bundle;
    }

    public final void k(int i) {
        this.horizontalAlignment = i;
    }

    public String toString() {
        return "EmittableLazyList(modifier=" + getModifier() + ", horizontalAlignment=" + ((Object) Alignment.b.i(this.horizontalAlignment)) + ", activityOptions=" + this.activityOptions + ", children=[\n" + c() + "\n])";
    }
}
