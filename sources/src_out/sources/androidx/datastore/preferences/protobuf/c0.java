package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class c0<K, V> {
    private final a<K, V> a;
    private final K b;
    private final V c;

    static class a<K, V> {
        public final WireFormat.FieldType a;
        public final K b;
        public final WireFormat.FieldType c;
        public final V d;

        public a(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
            this.a = fieldType;
            this.b = k;
            this.c = fieldType2;
            this.d = v;
        }
    }

    private c0(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        this.a = new a<>(fieldType, k, fieldType2, v);
        this.b = k;
        this.c = v;
    }

    static <K, V> int b(a<K, V> aVar, K k, V v) {
        return q.d(aVar.a, 1, k) + q.d(aVar.c, 2, v);
    }

    public static <K, V> c0<K, V> d(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        return new c0<>(fieldType, k, fieldType2, v);
    }

    static <K, V> void e(CodedOutputStream codedOutputStream, a<K, V> aVar, K k, V v) throws IOException {
        q.A(codedOutputStream, aVar.a, 1, k);
        q.A(codedOutputStream, aVar.c, 2, v);
    }

    public int a(int i, K k, V v) {
        return CodedOutputStream.U(i) + CodedOutputStream.C(b(this.a, k, v));
    }

    a<K, V> c() {
        return this.a;
    }
}
