package androidx.p008glance;

import com.google.inputmethod.e02;
import com.google.inputmethod.hi1;
import com.google.inputmethod.ko5;
import com.google.inputmethod.rp3;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.glance.e, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u000f\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010$\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!\"\u0004\b\"\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/glance/e;", "Lcom/google/android/rp3;", "<init>", "()V", "copy", "()Lcom/google/android/rp3;", "", "toString", "()Ljava/lang/String;", "Landroidx/glance/g;", "a", "Landroidx/glance/g;", "()Landroidx/glance/g;", "b", "(Landroidx/glance/g;)V", "modifier", "Lcom/google/android/ko5;", "Lcom/google/android/ko5;", "e", "()Lcom/google/android/ko5;", "h", "(Lcom/google/android/ko5;)V", "provider", "Lcom/google/android/hi1;", "c", "Lcom/google/android/hi1;", "()Lcom/google/android/hi1;", "f", "(Lcom/google/android/hi1;)V", "colorFilterParams", "Lcom/google/android/e02;", "d", "I", "()I", "g", "(I)V", "contentScale", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EmittableImage implements rp3 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private ko5 provider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private hi1 colorFilterParams;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private g modifier = g.INSTANCE;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private int contentScale = e02.INSTANCE.c();

    @Override // com.google.inputmethod.rp3
    /* JADX INFO: renamed from: a, reason: from getter */
    public g getModifier() {
        return this.modifier;
    }

    @Override // com.google.inputmethod.rp3
    public void b(g gVar) {
        this.modifier = gVar;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final hi1 getColorFilterParams() {
        return this.colorFilterParams;
    }

    @Override // com.google.inputmethod.rp3
    public rp3 copy() {
        EmittableImage emittableImage = new EmittableImage();
        emittableImage.b(getModifier());
        emittableImage.provider = this.provider;
        emittableImage.colorFilterParams = this.colorFilterParams;
        emittableImage.contentScale = this.contentScale;
        return emittableImage;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getContentScale() {
        return this.contentScale;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ko5 getProvider() {
        return this.provider;
    }

    public final void f(hi1 hi1Var) {
        this.colorFilterParams = hi1Var;
    }

    public final void g(int i) {
        this.contentScale = i;
    }

    public final void h(ko5 ko5Var) {
        this.provider = ko5Var;
    }

    public String toString() {
        return "EmittableImage(modifier=" + getModifier() + ", provider=" + this.provider + ", colorFilterParams=" + this.colorFilterParams + ", contentScale=" + ((Object) e02.i(this.contentScale)) + ')';
    }
}
