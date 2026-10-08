package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.MapFieldLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.c0;
import com.google.inputmethod.dt7;
import com.google.inputmethod.s29;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class b extends GeneratedMessageLite<b, a> implements dt7 {
    private static final b DEFAULT_INSTANCE;
    private static volatile s29<b> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private MapFieldLite<String, PreferencesProto$Value> preferences_ = MapFieldLite.d();

    public static final class a extends GeneratedMessageLite.a<b, a> implements dt7 {
        /* synthetic */ a(androidx.datastore.preferences.a aVar) {
            this();
        }

        public a r(String str, PreferencesProto$Value preferencesProto$Value) {
            str.getClass();
            preferencesProto$Value.getClass();
            j();
            ((b) this.b).O().put(str, preferencesProto$Value);
            return this;
        }

        private a() {
            super(b.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.b$b, reason: collision with other inner class name */
    private static final class C0079b {
        static final c0<String, PreferencesProto$Value> a = c0.d(WireFormat.FieldType.i, "", WireFormat.FieldType.k, PreferencesProto$Value.X());
    }

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        GeneratedMessageLite.J(b.class, bVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, PreferencesProto$Value> O() {
        return Q();
    }

    private MapFieldLite<String, PreferencesProto$Value> Q() {
        if (!this.preferences_.h()) {
            this.preferences_ = this.preferences_.k();
        }
        return this.preferences_;
    }

    private MapFieldLite<String, PreferencesProto$Value> R() {
        return this.preferences_;
    }

    public static a S() {
        return DEFAULT_INSTANCE.o();
    }

    public static b T(InputStream inputStream) throws IOException {
        return (b) GeneratedMessageLite.H(DEFAULT_INSTANCE, inputStream);
    }

    public Map<String, PreferencesProto$Value> P() {
        return Collections.unmodifiableMap(R());
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        s29 bVar;
        androidx.datastore.preferences.a aVar = null;
        switch (androidx.datastore.preferences.a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new b();
            case 2:
                return new a(aVar);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", C0079b.a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                s29<b> s29Var = PARSER;
                if (s29Var != null) {
                    return s29Var;
                }
                synchronized (b.class) {
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
