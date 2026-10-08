package androidx.p008glance.p009appwidget.protobuf;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class w {
    private ByteString a;
    private l b;
    protected volatile i0 c;
    private volatile ByteString d;

    protected void a(i0 i0Var) {
        if (this.c != null) {
            return;
        }
        synchronized (this) {
            if (this.c != null) {
                return;
            }
            try {
                if (this.a != null) {
                    this.c = i0Var.getParserForType().b(this.a, this.b);
                    this.d = this.a;
                } else {
                    this.c = i0Var;
                    this.d = ByteString.a;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.c = i0Var;
                this.d = ByteString.a;
            }
        }
    }

    public int b() {
        if (this.d != null) {
            return this.d.size();
        }
        ByteString byteString = this.a;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.c != null) {
            return this.c.getSerializedSize();
        }
        return 0;
    }

    public i0 c(i0 i0Var) {
        a(i0Var);
        return this.c;
    }

    public i0 d(i0 i0Var) {
        i0 i0Var2 = this.c;
        this.a = null;
        this.d = null;
        this.c = i0Var;
        return i0Var2;
    }

    public ByteString e() {
        if (this.d != null) {
            return this.d;
        }
        ByteString byteString = this.a;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            try {
                if (this.d != null) {
                    return this.d;
                }
                if (this.c == null) {
                    this.d = ByteString.a;
                } else {
                    this.d = this.c.toByteString();
                }
                return this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
