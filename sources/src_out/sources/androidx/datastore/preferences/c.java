package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.u;
import com.google.inputmethod.dt7;
import com.google.inputmethod.s29;
import java.util.List;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class c extends GeneratedMessageLite<c, a> implements dt7 {
    private static final c DEFAULT_INSTANCE;
    private static volatile s29<c> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private u.f<String> strings_ = GeneratedMessageLite.s();

    public static final class a extends GeneratedMessageLite.a<c, a> implements dt7 {
        /* synthetic */ a(androidx.datastore.preferences.a aVar) {
            this();
        }

        public a r(Iterable<String> iterable) {
            j();
            ((c) this.b).O(iterable);
            return this;
        }

        private a() {
            super(c.DEFAULT_INSTANCE);
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        GeneratedMessageLite.J(c.class, cVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(Iterable<String> iterable) {
        P();
        androidx.datastore.preferences.protobuf.a.b(iterable, this.strings_);
    }

    private void P() {
        u.f<String> fVar = this.strings_;
        if (fVar.k()) {
            return;
        }
        this.strings_ = GeneratedMessageLite.D(fVar);
    }

    public static c Q() {
        return DEFAULT_INSTANCE;
    }

    public static a S() {
        return DEFAULT_INSTANCE.o();
    }

    public List<String> R() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        s29 bVar;
        androidx.datastore.preferences.a aVar = null;
        switch (androidx.datastore.preferences.a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new c();
            case 2:
                return new a(aVar);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                s29<c> s29Var = PARSER;
                if (s29Var != null) {
                    return s29Var;
                }
                synchronized (c.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new GeneratedMessageLite.b(DEFAULT_INSTANCE);
                            PARSER = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
