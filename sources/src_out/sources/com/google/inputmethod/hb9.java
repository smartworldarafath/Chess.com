package com.google.inputmethod;

import android.view.View;
import android.widget.Magnifier;
import androidx.compose.p001foundation.u;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/google/android/hb9;", "Landroidx/compose/foundation/u;", "<init>", "()V", "Landroid/view/View;", "view", "", "useTextDefault", "Lcom/google/android/jf3;", "size", "Lcom/google/android/ff3;", "cornerRadius", "elevation", "clippingEnabled", "Lcom/google/android/f43;", "density", "", "initialZoom", "Lcom/google/android/hb9$a;", "c", "(Landroid/view/View;ZJFFZLcom/google/android/f43;F)Lcom/google/android/hb9$a;", "Z", "b", "()Z", "canUpdateZoom", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class hb9 implements u {
    public static final hb9 b = new hb9();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final boolean canUpdateZoom = false;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/google/android/hb9$a;", "Lcom/google/android/gb9;", "Landroid/widget/Magnifier;", "magnifier", "<init>", "(Landroid/widget/Magnifier;)V", "", "c", "()V", "Lcom/google/android/rn8;", "sourceCenter", "magnifierCenter", "", "zoom", "b", "(JJF)V", "dismiss", "a", "Landroid/widget/Magnifier;", "d", "()Landroid/widget/Magnifier;", "Lcom/google/android/q16;", "()J", "size", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class a implements gb9 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Magnifier magnifier;

        public a(Magnifier magnifier) {
            this.magnifier = magnifier;
        }

        @Override // com.google.inputmethod.gb9
        public long a() {
            return q16.c((((long) this.magnifier.getHeight()) & 4294967295L) | (((long) this.magnifier.getWidth()) << 32));
        }

        @Override // com.google.inputmethod.gb9
        public void b(long sourceCenter, long magnifierCenter, float zoom) {
            this.magnifier.show(Float.intBitsToFloat((int) (sourceCenter >> 32)), Float.intBitsToFloat((int) (sourceCenter & 4294967295L)));
        }

        @Override // com.google.inputmethod.gb9
        public void c() {
            this.magnifier.update();
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Magnifier getMagnifier() {
            return this.magnifier;
        }

        @Override // com.google.inputmethod.gb9
        public void dismiss() {
            this.magnifier.dismiss();
        }
    }

    private hb9() {
    }

    @Override // androidx.compose.p001foundation.u
    public boolean b() {
        return canUpdateZoom;
    }

    @Override // androidx.compose.p001foundation.u
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a a(View view, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, f43 density, float initialZoom) {
        return new a(new Magnifier(view));
    }
}
