package androidx.databinding;

import java.io.Serializable;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class ObservableField<T> extends b implements Serializable {
    static final long serialVersionUID = 1;
    private T mValue;

    public void b(T t) {
        if (t != this.mValue) {
            this.mValue = t;
            a();
        }
    }
}
