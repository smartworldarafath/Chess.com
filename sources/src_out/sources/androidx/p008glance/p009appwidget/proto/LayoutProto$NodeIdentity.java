package androidx.p008glance.p009appwidget.proto;

import androidx.p008glance.p009appwidget.protobuf.u;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public enum LayoutProto$NodeIdentity implements u.a {
    DEFAULT_IDENTITY(0),
    BACKGROUND_NODE(1),
    UNRECOGNIZED(-1);

    private static final u.b<LayoutProto$NodeIdentity> d = new u.b<LayoutProto$NodeIdentity>() { // from class: androidx.glance.appwidget.proto.LayoutProto$NodeIdentity.a
        @Override // androidx.glance.appwidget.protobuf.u.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LayoutProto$NodeIdentity findValueByNumber(int i) {
            return LayoutProto$NodeIdentity.c(i);
        }
    };
    private final int value;

    LayoutProto$NodeIdentity(int i) {
        this.value = i;
    }

    public static LayoutProto$NodeIdentity c(int i) {
        if (i == 0) {
            return DEFAULT_IDENTITY;
        }
        if (i != 1) {
            return null;
        }
        return BACKGROUND_NODE;
    }

    @Override // androidx.glance.appwidget.protobuf.u.a
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
