package androidx.p008glance.p009appwidget.proto;

import androidx.p008glance.p009appwidget.protobuf.u;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public enum LayoutProto$DimensionType implements u.a {
    UNKNOWN_DIMENSION_TYPE(0),
    EXACT(1),
    WRAP(2),
    FILL(3),
    EXPAND(4),
    UNRECOGNIZED(-1);

    private static final u.b<LayoutProto$DimensionType> g = new u.b<LayoutProto$DimensionType>() { // from class: androidx.glance.appwidget.proto.LayoutProto$DimensionType.a
        @Override // androidx.glance.appwidget.protobuf.u.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LayoutProto$DimensionType findValueByNumber(int i) {
            return LayoutProto$DimensionType.c(i);
        }
    };
    private final int value;

    LayoutProto$DimensionType(int i) {
        this.value = i;
    }

    public static LayoutProto$DimensionType c(int i) {
        if (i == 0) {
            return UNKNOWN_DIMENSION_TYPE;
        }
        if (i == 1) {
            return EXACT;
        }
        if (i == 2) {
            return WRAP;
        }
        if (i == 3) {
            return FILL;
        }
        if (i != 4) {
            return null;
        }
        return EXPAND;
    }

    @Override // androidx.glance.appwidget.protobuf.u.a
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
