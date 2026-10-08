package com.google.inputmethod;

import androidx.p008glance.p009appwidget.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class ko6 extends GeneratedMessageLite<ko6, a> implements at7 {
    private static final ko6 DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int LAYOUT_INDEX_FIELD_NUMBER = 2;
    private static volatile p29<ko6> PARSER;
    private int bitField0_;
    private int layoutIndex_;
    private lo6 layout_;

    public static final class a extends GeneratedMessageLite.a<ko6, a> implements at7 {
        /* synthetic */ a(io6 io6Var) {
            this();
        }

        public a r(lo6 lo6Var) {
            j();
            ((ko6) this.b).R(lo6Var);
            return this;
        }

        public a s(int i) {
            j();
            ((ko6) this.b).S(i);
            return this;
        }

        private a() {
            super(ko6.DEFAULT_INSTANCE);
        }
    }

    static {
        ko6 ko6Var = new ko6();
        DEFAULT_INSTANCE = ko6Var;
        GeneratedMessageLite.I(ko6.class, ko6Var);
    }

    private ko6() {
    }

    public static a Q() {
        return DEFAULT_INSTANCE.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(lo6 lo6Var) {
        lo6Var.getClass();
        this.layout_ = lo6Var;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(int i) {
        this.layoutIndex_ = i;
    }

    public lo6 O() {
        lo6 lo6Var = this.layout_;
        return lo6Var == null ? lo6.Z() : lo6Var;
    }

    public int P() {
        return this.layoutIndex_;
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.GeneratedMessageLite
    protected final Object r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        p29 bVar;
        io6 io6Var = null;
        switch (io6.a[methodToInvoke.ordinal()]) {
            case 1:
                return new ko6();
            case 2:
                return new a(io6Var);
            case 3:
                return GeneratedMessageLite.E(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "layout_", "layoutIndex_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p29<ko6> p29Var = PARSER;
                if (p29Var != null) {
                    return p29Var;
                }
                synchronized (ko6.class) {
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
