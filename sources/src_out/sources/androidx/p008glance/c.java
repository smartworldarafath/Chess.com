package androidx.p008glance;

import com.google.inputmethod.EmittableText;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/glance/d;", "Lcom/google/android/iq3;", "a", "(Landroidx/glance/d;)Lcom/google/android/iq3;", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {
    public static final EmittableText a(EmittableButton emittableButton) {
        EmittableText emittableText = new EmittableText();
        emittableText.b(emittableButton.getModifier());
        emittableText.h(emittableButton.getText());
        emittableText.g(emittableButton.getStyle());
        emittableText.f(emittableButton.getMaxLines());
        return emittableText;
    }
}
