package com.google.inputmethod;

import androidx.p008glance.p009appwidget.proto.LayoutProto$ContentScale;
import androidx.p008glance.p009appwidget.proto.LayoutProto$DimensionType;
import androidx.p008glance.p009appwidget.proto.LayoutProto$HorizontalAlignment;
import androidx.p008glance.p009appwidget.proto.LayoutProto$LayoutType;
import androidx.p008glance.p009appwidget.proto.LayoutProto$NodeIdentity;
import androidx.p008glance.p009appwidget.proto.LayoutProto$VerticalAlignment;
import androidx.p008glance.p009appwidget.protobuf.GeneratedMessageLite;
import androidx.p008glance.p009appwidget.protobuf.u;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class lo6 extends GeneratedMessageLite<lo6, a> implements at7 {
    public static final int CHILDREN_FIELD_NUMBER = 7;
    private static final lo6 DEFAULT_INSTANCE;
    public static final int HASACTION_FIELD_NUMBER = 9;
    public static final int HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER = 11;
    public static final int HAS_IMAGE_DESCRIPTION_FIELD_NUMBER = 10;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    public static final int HORIZONTAL_ALIGNMENT_FIELD_NUMBER = 4;
    public static final int IDENTITY_FIELD_NUMBER = 8;
    public static final int IMAGE_SCALE_FIELD_NUMBER = 6;
    private static volatile p29<lo6> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VERTICAL_ALIGNMENT_FIELD_NUMBER = 5;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private u.f<lo6> children_ = GeneratedMessageLite.s();
    private boolean hasAction_;
    private boolean hasImageColorFilter_;
    private boolean hasImageDescription_;
    private int height_;
    private int horizontalAlignment_;
    private int identity_;
    private int imageScale_;
    private int type_;
    private int verticalAlignment_;
    private int width_;

    public static final class a extends GeneratedMessageLite.a<lo6, a> implements at7 {
        /* synthetic */ a(io6 io6Var) {
            this();
        }

        public a A(LayoutProto$VerticalAlignment layoutProto$VerticalAlignment) {
            j();
            ((lo6) this.b).j0(layoutProto$VerticalAlignment);
            return this;
        }

        public a C(LayoutProto$DimensionType layoutProto$DimensionType) {
            j();
            ((lo6) this.b).k0(layoutProto$DimensionType);
            return this;
        }

        public a r(Iterable<? extends lo6> iterable) {
            j();
            ((lo6) this.b).X(iterable);
            return this;
        }

        public a s(boolean z) {
            j();
            ((lo6) this.b).b0(z);
            return this;
        }

        public a t(boolean z) {
            j();
            ((lo6) this.b).c0(z);
            return this;
        }

        public a u(boolean z) {
            j();
            ((lo6) this.b).d0(z);
            return this;
        }

        public a v(LayoutProto$DimensionType layoutProto$DimensionType) {
            j();
            ((lo6) this.b).e0(layoutProto$DimensionType);
            return this;
        }

        public a w(LayoutProto$HorizontalAlignment layoutProto$HorizontalAlignment) {
            j();
            ((lo6) this.b).f0(layoutProto$HorizontalAlignment);
            return this;
        }

        public a x(LayoutProto$NodeIdentity layoutProto$NodeIdentity) {
            j();
            ((lo6) this.b).g0(layoutProto$NodeIdentity);
            return this;
        }

        public a y(LayoutProto$ContentScale layoutProto$ContentScale) {
            j();
            ((lo6) this.b).h0(layoutProto$ContentScale);
            return this;
        }

        public a z(LayoutProto$LayoutType layoutProto$LayoutType) {
            j();
            ((lo6) this.b).i0(layoutProto$LayoutType);
            return this;
        }

        private a() {
            super(lo6.DEFAULT_INSTANCE);
        }
    }

    static {
        lo6 lo6Var = new lo6();
        DEFAULT_INSTANCE = lo6Var;
        GeneratedMessageLite.I(lo6.class, lo6Var);
    }

    private lo6() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(Iterable<? extends lo6> iterable) {
        Y();
        androidx.p008glance.p009appwidget.protobuf.a.b(iterable, this.children_);
    }

    private void Y() {
        u.f<lo6> fVar = this.children_;
        if (fVar.k()) {
            return;
        }
        this.children_ = GeneratedMessageLite.C(fVar);
    }

    public static lo6 Z() {
        return DEFAULT_INSTANCE;
    }

    public static a a0() {
        return DEFAULT_INSTANCE.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(boolean z) {
        this.hasAction_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(boolean z) {
        this.hasImageColorFilter_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(boolean z) {
        this.hasImageDescription_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(LayoutProto$DimensionType layoutProto$DimensionType) {
        this.height_ = layoutProto$DimensionType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(LayoutProto$HorizontalAlignment layoutProto$HorizontalAlignment) {
        this.horizontalAlignment_ = layoutProto$HorizontalAlignment.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(LayoutProto$NodeIdentity layoutProto$NodeIdentity) {
        this.identity_ = layoutProto$NodeIdentity.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(LayoutProto$ContentScale layoutProto$ContentScale) {
        this.imageScale_ = layoutProto$ContentScale.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(LayoutProto$LayoutType layoutProto$LayoutType) {
        this.type_ = layoutProto$LayoutType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(LayoutProto$VerticalAlignment layoutProto$VerticalAlignment) {
        this.verticalAlignment_ = layoutProto$VerticalAlignment.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(LayoutProto$DimensionType layoutProto$DimensionType) {
        this.width_ = layoutProto$DimensionType.getNumber();
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.GeneratedMessageLite
    protected final Object r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        p29 bVar;
        io6 io6Var = null;
        switch (io6.a[methodToInvoke.ordinal()]) {
            case 1:
                return new lo6();
            case 2:
                return new a(io6Var);
            case 3:
                return GeneratedMessageLite.E(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0001\u0000\u0001\f\u0002\f\u0003\f\u0004\f\u0005\f\u0006\f\u0007\u001b\b\f\t\u0007\n\u0007\u000b\u0007", new Object[]{"type_", "width_", "height_", "horizontalAlignment_", "verticalAlignment_", "imageScale_", "children_", lo6.class, "identity_", "hasAction_", "hasImageDescription_", "hasImageColorFilter_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p29<lo6> p29Var = PARSER;
                if (p29Var != null) {
                    return p29Var;
                }
                synchronized (lo6.class) {
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
