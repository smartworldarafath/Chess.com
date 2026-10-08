package com.google.inputmethod;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/google/android/roa;", "", "<init>", "()V", "Lcom/google/android/qoa;", "indicationInstance", "Lcom/google/android/toa;", "rippleHostView", "", "d", "(Lcom/google/android/qoa;Lcom/google/android/toa;)V", "b", "(Lcom/google/android/qoa;)Lcom/google/android/toa;", "a", "(Lcom/google/android/toa;)Lcom/google/android/qoa;", "c", "(Lcom/google/android/qoa;)V", "", "Ljava/util/Map;", "indicationToHostMap", "hostToIndicationMap", "material-ripple"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class roa {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<qoa, toa> indicationToHostMap = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Map<toa, qoa> hostToIndicationMap = new LinkedHashMap();

    public final qoa a(toa rippleHostView) {
        return this.hostToIndicationMap.get(rippleHostView);
    }

    public final toa b(qoa indicationInstance) {
        return this.indicationToHostMap.get(indicationInstance);
    }

    public final void c(qoa indicationInstance) {
        toa toaVar = this.indicationToHostMap.get(indicationInstance);
        if (toaVar != null) {
            this.hostToIndicationMap.remove(toaVar);
        }
        this.indicationToHostMap.remove(indicationInstance);
    }

    public final void d(qoa indicationInstance, toa rippleHostView) {
        this.indicationToHostMap.put(indicationInstance, rippleHostView);
        this.hostToIndicationMap.put(rippleHostView, indicationInstance);
    }
}
