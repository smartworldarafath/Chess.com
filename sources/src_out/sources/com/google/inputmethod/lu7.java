package com.google.inputmethod;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class lu7 extends ukc {
    public static lu7 h(ByteBuffer byteBuffer) {
        return i(byteBuffer, new lu7());
    }

    public static lu7 i(ByteBuffer byteBuffer, lu7 lu7Var) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return lu7Var.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public lu7 f(int i, ByteBuffer byteBuffer) {
        g(i, byteBuffer);
        return this;
    }

    public void g(int i, ByteBuffer byteBuffer) {
        c(i, byteBuffer);
    }

    public ju7 j(ju7 ju7Var, int i) {
        int iB = b(6);
        if (iB != 0) {
            return ju7Var.f(a(d(iB) + (i * 4)), this.b);
        }
        return null;
    }

    public int k() {
        int iB = b(6);
        if (iB != 0) {
            return e(iB);
        }
        return 0;
    }

    public int l() {
        int iB = b(4);
        if (iB != 0) {
            return this.b.getInt(iB + this.a);
        }
        return 0;
    }
}
