package androidx.p008glance.p009appwidget.proto;

import androidx.p008glance.p009appwidget.protobuf.u;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public enum LayoutProto$ContentScale implements u.a {
    UNSPECIFIED_CONTENT_SCALE(0),
    FIT(1),
    CROP(2),
    FILL_BOUNDS(3),
    UNRECOGNIZED(-1);

    private static final u.b<LayoutProto$ContentScale> f = new u.b<LayoutProto$ContentScale>() { // from class: androidx.glance.appwidget.proto.LayoutProto$ContentScale.a
        @Override // androidx.glance.appwidget.protobuf.u.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LayoutProto$ContentScale findValueByNumber(int i) {
            return LayoutProto$ContentScale.c(i);
        }
    };
    private final int value;

    LayoutProto$ContentScale(int i) {
        this.value = i;
    }

    public static LayoutProto$ContentScale c(int i) {
        if (i == 0) {
            return UNSPECIFIED_CONTENT_SCALE;
        }
        if (i == 1) {
            return FIT;
        }
        if (i == 2) {
            return CROP;
        }
        if (i != 3) {
            return null;
        }
        return FILL_BOUNDS;
    }

    @Override // androidx.glance.appwidget.protobuf.u.a
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
