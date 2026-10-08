package androidx.p008glance.p009appwidget.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class l {
    private static volatile l b;
    static final l c = new l(true);
    private final Map<a, GeneratedMessageLite.e<?, ?>> a;

    private static final class a {
        private final Object a;
        private final int b;

        a(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }
    }

    l() {
        this.a = new HashMap();
    }

    public static l b() {
        l lVarA;
        if (q0.d) {
            return c;
        }
        l lVar = b;
        if (lVar != null) {
            return lVar;
        }
        synchronized (l.class) {
            try {
                lVarA = b;
                if (lVarA == null) {
                    lVarA = k.a();
                    b = lVarA;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVarA;
    }

    public <ContainingType extends i0> GeneratedMessageLite.e<ContainingType, ?> a(ContainingType containingtype, int i) {
        return (GeneratedMessageLite.e) this.a.get(new a(containingtype, i));
    }

    l(boolean z) {
        this.a = Collections.EMPTY_MAP;
    }
}
