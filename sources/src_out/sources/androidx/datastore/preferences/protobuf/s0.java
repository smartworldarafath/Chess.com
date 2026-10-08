package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
final class s0 implements g0 {
    private final i0 a;
    private final String b;
    private final Object[] c;
    private final int d;

    s0(i0 i0Var, String str, Object[] objArr) {
        this.a = i0Var;
        this.b = str;
        this.c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public boolean a() {
        return (this.d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public i0 b() {
        return this.a;
    }

    Object[] c() {
        return this.c;
    }

    String d() {
        return this.b;
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public ProtoSyntax getSyntax() {
        int i = this.d;
        if ((i & 1) != 0) {
            return ProtoSyntax.PROTO2;
        }
        return (i & 4) == 4 ? ProtoSyntax.EDITIONS : ProtoSyntax.PROTO3;
    }
}
