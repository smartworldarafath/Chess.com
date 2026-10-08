package androidx.p008glance.p009appwidget.proto;

import androidx.p008glance.p009appwidget.protobuf.u;
import com.google.inputmethod.lo6;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public enum LayoutProto$LayoutType implements u.a {
    UNKNOWN_TYPE(0),
    ROW(1),
    COLUMN(2),
    BOX(3),
    TEXT(4),
    LAZY_COLUMN(5),
    LIST_ITEM(6),
    CHECK_BOX(7),
    BUTTON(8),
    SPACER(9),
    SWITCH(10),
    ANDROID_REMOTE_VIEWS(11),
    REMOTE_VIEWS_ROOT(12),
    IMAGE(13),
    LINEAR_PROGRESS_INDICATOR(14),
    CIRCULAR_PROGRESS_INDICATOR(15),
    LAZY_VERTICAL_GRID(16),
    VERTICAL_GRID_ITEM(17),
    RADIO_GROUP(18),
    RADIO_BUTTON(19),
    RADIO_ROW(20),
    RADIO_COLUMN(21),
    SIZE_BOX(22),
    UNRECOGNIZED(-1);

    private static final u.b<LayoutProto$LayoutType> y = new u.b<LayoutProto$LayoutType>() { // from class: androidx.glance.appwidget.proto.LayoutProto$LayoutType.a
        @Override // androidx.glance.appwidget.protobuf.u.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LayoutProto$LayoutType findValueByNumber(int i) {
            return LayoutProto$LayoutType.c(i);
        }
    };
    private final int value;

    LayoutProto$LayoutType(int i) {
        this.value = i;
    }

    public static LayoutProto$LayoutType c(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_TYPE;
            case 1:
                return ROW;
            case 2:
                return COLUMN;
            case 3:
                return BOX;
            case 4:
                return TEXT;
            case 5:
                return LAZY_COLUMN;
            case 6:
                return LIST_ITEM;
            case 7:
                return CHECK_BOX;
            case 8:
                return BUTTON;
            case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                return SPACER;
            case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                return SWITCH;
            case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return ANDROID_REMOTE_VIEWS;
            case 12:
                return REMOTE_VIEWS_ROOT;
            case 13:
                return IMAGE;
            case 14:
                return LINEAR_PROGRESS_INDICATOR;
            case 15:
                return CIRCULAR_PROGRESS_INDICATOR;
            case 16:
                return LAZY_VERTICAL_GRID;
            case 17:
                return VERTICAL_GRID_ITEM;
            case 18:
                return RADIO_GROUP;
            case 19:
                return RADIO_BUTTON;
            case 20:
                return RADIO_ROW;
            case 21:
                return RADIO_COLUMN;
            case 22:
                return SIZE_BOX;
            default:
                return null;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.u.a
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
