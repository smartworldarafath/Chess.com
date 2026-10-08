package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import com.google.inputmethod.di9;
import com.google.inputmethod.lu7;
import com.google.inputmethod.xbd;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class l {
    private final lu7 a;
    private final char[] b;
    private final a c = new a(1024);
    private final Typeface d;

    static class a {
        private final SparseArray<a> a;
        private m b;

        private a() {
            this(1);
        }

        a a(int i) {
            SparseArray<a> sparseArray = this.a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }

        final m b() {
            return this.b;
        }

        void c(m mVar, int i, int i2) {
            a aVarA = a(mVar.b(i));
            if (aVarA == null) {
                aVarA = new a();
                this.a.put(mVar.b(i), aVarA);
            }
            if (i2 > i) {
                aVarA.c(mVar, i + 1, i2);
            } else {
                aVarA.b = mVar;
            }
        }

        a(int i) {
            this.a = new SparseArray<>(i);
        }
    }

    private l(Typeface typeface, lu7 lu7Var) {
        this.d = typeface;
        this.a = lu7Var;
        this.b = new char[lu7Var.k() * 2];
        a(lu7Var);
    }

    private void a(lu7 lu7Var) {
        int iK = lu7Var.k();
        for (int i = 0; i < iK; i++) {
            m mVar = new m(this, i);
            Character.toChars(mVar.f(), this.b, i * 2);
            h(mVar);
        }
    }

    public static l b(Typeface typeface, ByteBuffer byteBuffer) throws IOException {
        try {
            xbd.a("EmojiCompat.MetadataRepo.create");
            return new l(typeface, k.b(byteBuffer));
        } finally {
            xbd.b();
        }
    }

    public char[] c() {
        return this.b;
    }

    public lu7 d() {
        return this.a;
    }

    int e() {
        return this.a.l();
    }

    a f() {
        return this.c;
    }

    Typeface g() {
        return this.d;
    }

    void h(m mVar) {
        di9.h(mVar, "emoji metadata cannot be null");
        di9.b(mVar.c() > 0, "invalid metadata codepoint length");
        this.c.c(mVar, 0, mVar.c() - 1);
    }
}
