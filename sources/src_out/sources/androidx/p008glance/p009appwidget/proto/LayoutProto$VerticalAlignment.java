package androidx.p008glance.p009appwidget.proto;

import androidx.p008glance.p009appwidget.protobuf.u;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public enum LayoutProto$VerticalAlignment implements u.a {
    UNSPECIFIED_VERTICAL_ALIGNMENT(0),
    TOP(1),
    CENTER_VERTICALLY(2),
    BOTTOM(3),
    UNRECOGNIZED(-1);

    private static final u.b<LayoutProto$VerticalAlignment> f = new u.b<LayoutProto$VerticalAlignment>() { // from class: androidx.glance.appwidget.proto.LayoutProto$VerticalAlignment.a
        @Override // androidx.glance.appwidget.protobuf.u.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LayoutProto$VerticalAlignment findValueByNumber(int i) {
            return LayoutProto$VerticalAlignment.c(i);
        }
    };
    private final int value;

    LayoutProto$VerticalAlignment(int i) {
        this.value = i;
    }

    public static LayoutProto$VerticalAlignment c(int i) {
        if (i == 0) {
            return UNSPECIFIED_VERTICAL_ALIGNMENT;
        }
        if (i == 1) {
            return TOP;
        }
        if (i == 2) {
            return CENTER_VERTICALLY;
        }
        if (i != 3) {
            return null;
        }
        return BOTTOM;
    }

    @Override // androidx.glance.appwidget.protobuf.u.a
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
