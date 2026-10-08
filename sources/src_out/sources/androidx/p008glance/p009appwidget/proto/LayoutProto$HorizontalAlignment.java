package androidx.p008glance.p009appwidget.proto;

import androidx.p008glance.p009appwidget.protobuf.u;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public enum LayoutProto$HorizontalAlignment implements u.a {
    UNSPECIFIED_HORIZONTAL_ALIGNMENT(0),
    START(1),
    CENTER_HORIZONTALLY(2),
    END(3),
    UNRECOGNIZED(-1);

    private static final u.b<LayoutProto$HorizontalAlignment> f = new u.b<LayoutProto$HorizontalAlignment>() { // from class: androidx.glance.appwidget.proto.LayoutProto$HorizontalAlignment.a
        @Override // androidx.glance.appwidget.protobuf.u.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LayoutProto$HorizontalAlignment findValueByNumber(int i) {
            return LayoutProto$HorizontalAlignment.c(i);
        }
    };
    private final int value;

    LayoutProto$HorizontalAlignment(int i) {
        this.value = i;
    }

    public static LayoutProto$HorizontalAlignment c(int i) {
        if (i == 0) {
            return UNSPECIFIED_HORIZONTAL_ALIGNMENT;
        }
        if (i == 1) {
            return START;
        }
        if (i == 2) {
            return CENTER_HORIZONTALLY;
        }
        if (i != 3) {
            return null;
        }
        return END;
    }

    @Override // androidx.glance.appwidget.protobuf.u.a
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
