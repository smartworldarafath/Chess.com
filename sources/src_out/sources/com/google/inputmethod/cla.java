package com.google.inputmethod;

import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0003R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/google/android/cla;", "", "<init>", "()V", "Landroid/content/res/Resources;", "res", "", "id", "Landroid/util/TypedValue;", "b", "(Landroid/content/res/Resources;I)Landroid/util/TypedValue;", "", "a", "Lcom/google/android/o48;", "Lcom/google/android/o48;", "resIdPathMap", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class cla {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final o48<TypedValue> resIdPathMap = new o48<>(0, 1, null);

    public final void a() {
        synchronized (this) {
            this.resIdPathMap.g();
            Unit unit = Unit.a;
        }
    }

    public final TypedValue b(Resources res, int id) {
        TypedValue typedValueB;
        synchronized (this) {
            typedValueB = this.resIdPathMap.b(id);
            if (typedValueB == null) {
                typedValueB = new TypedValue();
                res.getValue(id, typedValueB, true);
                this.resIdPathMap.n(id, typedValueB);
            }
        }
        return typedValueB;
    }
}
