package com.google.inputmethod;

import androidx.p008glance.p009appwidget.protobuf.GeneratedMessageLite;
import androidx.p008glance.p009appwidget.protobuf.u;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class jo6 extends GeneratedMessageLite<jo6, a> implements at7 {
    private static final jo6 DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int NEXT_INDEX_FIELD_NUMBER = 2;
    private static volatile p29<jo6> PARSER;
    private u.f<ko6> layout_ = GeneratedMessageLite.s();
    private int nextIndex_;

    public static final class a extends GeneratedMessageLite.a<jo6, a> implements at7 {
        /* synthetic */ a(io6 io6Var) {
            this();
        }

        public a r(ko6.a aVar) {
            j();
            ((jo6) this.b).P(aVar.build());
            return this;
        }

        public a s() {
            j();
            ((jo6) this.b).Q();
            return this;
        }

        public int t() {
            return ((jo6) this.b).U();
        }

        public a u(int i) {
            j();
            ((jo6) this.b).W(i);
            return this;
        }

        private a() {
            super(jo6.DEFAULT_INSTANCE);
        }
    }

    static {
        jo6 jo6Var = new jo6();
        DEFAULT_INSTANCE = jo6Var;
        GeneratedMessageLite.I(jo6.class, jo6Var);
    }

    private jo6() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(ko6 ko6Var) {
        ko6Var.getClass();
        R();
        this.layout_.add(ko6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        this.layout_ = GeneratedMessageLite.s();
    }

    private void R() {
        u.f<ko6> fVar = this.layout_;
        if (fVar.k()) {
            return;
        }
        this.layout_ = GeneratedMessageLite.C(fVar);
    }

    public static jo6 S() {
        return DEFAULT_INSTANCE;
    }

    public static jo6 V(InputStream inputStream) throws IOException {
        return (jo6) GeneratedMessageLite.G(DEFAULT_INSTANCE, inputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(int i) {
        this.nextIndex_ = i;
    }

    public List<ko6> T() {
        return this.layout_;
    }

    public int U() {
        return this.nextIndex_;
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.GeneratedMessageLite
    protected final Object r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        p29 bVar;
        io6 io6Var = null;
        switch (io6.a[methodToInvoke.ordinal()]) {
            case 1:
                return new jo6();
            case 2:
                return new a(io6Var);
            case 3:
                return GeneratedMessageLite.E(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"layout_", ko6.class, "nextIndex_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p29<jo6> p29Var = PARSER;
                if (p29Var != null) {
                    return p29Var;
                }
                synchronized (jo6.class) {
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
