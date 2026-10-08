package androidx.p008glance.semantics;

import com.google.inputmethod.lfb;
import com.google.inputmethod.mfb;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ3\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u000f\u0010\u0010R&\u0010\u0014\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/glance/semantics/SemanticsConfiguration;", "Lcom/google/android/mfb;", "<init>", "()V", "T", "Lcom/google/android/lfb;", "key", "value", "", "a", "(Lcom/google/android/lfb;Ljava/lang/Object;)V", "Lkotlin/Function0;", "defaultValue", "b", "(Lcom/google/android/lfb;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "c", "(Lcom/google/android/lfb;)Ljava/lang/Object;", "", "", "Ljava/util/Map;", "props", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SemanticsConfiguration implements mfb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<lfb<?>, Object> props = new LinkedHashMap();

    @Override // com.google.inputmethod.mfb
    public <T> void a(lfb<T> key, T value) {
        this.props.put(key, value);
    }

    public final <T> T b(lfb<T> key, Function0<? extends T> defaultValue) {
        T t = (T) this.props.get(key);
        return t == null ? (T) defaultValue.invoke() : t;
    }

    public final <T> T c(lfb<T> key) {
        return (T) b(key, new Function0<T>() { // from class: androidx.glance.semantics.SemanticsConfiguration$getOrNull$1
            public final T invoke() {
                return null;
            }
        });
    }
}
