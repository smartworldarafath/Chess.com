package androidx.p008glance.p009appwidget.protobuf;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'a' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class FieldType {
    public static final FieldType A;
    public static final FieldType B;
    public static final FieldType C;
    public static final FieldType D;
    public static final FieldType E;
    public static final FieldType F;
    public static final FieldType G;
    public static final FieldType H;
    public static final FieldType I;
    public static final FieldType J;
    public static final FieldType K;
    public static final FieldType L;
    public static final FieldType M;
    public static final FieldType N;
    public static final FieldType O;
    public static final FieldType P;
    public static final FieldType Q;
    public static final FieldType R;
    public static final FieldType S;
    public static final FieldType T;
    public static final FieldType U;
    public static final FieldType V;
    public static final FieldType W;
    public static final FieldType X;
    public static final FieldType Y;
    private static final FieldType[] Z;
    public static final FieldType a;
    private static final Type[] a0;
    public static final FieldType b;
    private static final /* synthetic */ FieldType[] b0;
    public static final FieldType c;
    public static final FieldType d;
    public static final FieldType e;
    public static final FieldType f;
    public static final FieldType g;
    public static final FieldType h;
    public static final FieldType i;
    public static final FieldType j;
    public static final FieldType k;
    public static final FieldType l;
    public static final FieldType m;
    public static final FieldType n;
    public static final FieldType o;
    public static final FieldType p;
    public static final FieldType q;
    public static final FieldType r;
    public static final FieldType s;
    public static final FieldType t;
    public static final FieldType u;
    public static final FieldType v;
    public static final FieldType w;
    public static final FieldType x;
    public static final FieldType y;
    public static final FieldType z;
    private final Collection collection;
    private final Class<?> elementType;
    private final int id;
    private final JavaType javaType;
    private final boolean primitiveScalar;

    enum Collection {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean isList;

        Collection(boolean z) {
            this.isList = z;
        }
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[JavaType.values().length];
            b = iArr;
            try {
                iArr[JavaType.h.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[JavaType.j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[JavaType.g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Collection.values().length];
            a = iArr2;
            try {
                iArr2[Collection.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Collection.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[Collection.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        Collection collection = Collection.SCALAR;
        JavaType javaType = JavaType.e;
        FieldType fieldType = new FieldType("DOUBLE", 0, 0, collection, javaType);
        a = fieldType;
        JavaType javaType2 = JavaType.d;
        FieldType fieldType2 = new FieldType("FLOAT", 1, 1, collection, javaType2);
        b = fieldType2;
        JavaType javaType3 = JavaType.c;
        FieldType fieldType3 = new FieldType("INT64", 2, 2, collection, javaType3);
        c = fieldType3;
        FieldType fieldType4 = new FieldType("UINT64", 3, 3, collection, javaType3);
        d = fieldType4;
        JavaType javaType4 = JavaType.b;
        FieldType fieldType5 = new FieldType("INT32", 4, 4, collection, javaType4);
        e = fieldType5;
        FieldType fieldType6 = new FieldType("FIXED64", 5, 5, collection, javaType3);
        f = fieldType6;
        FieldType fieldType7 = new FieldType("FIXED32", 6, 6, collection, javaType4);
        g = fieldType7;
        JavaType javaType5 = JavaType.f;
        FieldType fieldType8 = new FieldType("BOOL", 7, 7, collection, javaType5);
        h = fieldType8;
        JavaType javaType6 = JavaType.g;
        FieldType fieldType9 = new FieldType("STRING", 8, 8, collection, javaType6);
        i = fieldType9;
        JavaType javaType7 = JavaType.j;
        FieldType fieldType10 = new FieldType("MESSAGE", 9, 9, collection, javaType7);
        j = fieldType10;
        JavaType javaType8 = JavaType.h;
        FieldType fieldType11 = new FieldType("BYTES", 10, 10, collection, javaType8);
        k = fieldType11;
        FieldType fieldType12 = new FieldType("UINT32", 11, 11, collection, javaType4);
        l = fieldType12;
        JavaType javaType9 = JavaType.i;
        FieldType fieldType13 = new FieldType("ENUM", 12, 12, collection, javaType9);
        m = fieldType13;
        FieldType fieldType14 = new FieldType("SFIXED32", 13, 13, collection, javaType4);
        n = fieldType14;
        FieldType fieldType15 = new FieldType("SFIXED64", 14, 14, collection, javaType3);
        o = fieldType15;
        FieldType fieldType16 = new FieldType("SINT32", 15, 15, collection, javaType4);
        p = fieldType16;
        FieldType fieldType17 = new FieldType("SINT64", 16, 16, collection, javaType3);
        q = fieldType17;
        FieldType fieldType18 = new FieldType("GROUP", 17, 17, collection, javaType7);
        r = fieldType18;
        Collection collection2 = Collection.VECTOR;
        FieldType fieldType19 = new FieldType("DOUBLE_LIST", 18, 18, collection2, javaType);
        s = fieldType19;
        FieldType fieldType20 = new FieldType("FLOAT_LIST", 19, 19, collection2, javaType2);
        t = fieldType20;
        FieldType fieldType21 = new FieldType("INT64_LIST", 20, 20, collection2, javaType3);
        u = fieldType21;
        FieldType fieldType22 = new FieldType("UINT64_LIST", 21, 21, collection2, javaType3);
        v = fieldType22;
        FieldType fieldType23 = new FieldType("INT32_LIST", 22, 22, collection2, javaType4);
        w = fieldType23;
        FieldType fieldType24 = new FieldType("FIXED64_LIST", 23, 23, collection2, javaType3);
        x = fieldType24;
        FieldType fieldType25 = new FieldType("FIXED32_LIST", 24, 24, collection2, javaType4);
        y = fieldType25;
        FieldType fieldType26 = new FieldType("BOOL_LIST", 25, 25, collection2, javaType5);
        z = fieldType26;
        FieldType fieldType27 = new FieldType("STRING_LIST", 26, 26, collection2, javaType6);
        A = fieldType27;
        FieldType fieldType28 = new FieldType("MESSAGE_LIST", 27, 27, collection2, javaType7);
        B = fieldType28;
        FieldType fieldType29 = new FieldType("BYTES_LIST", 28, 28, collection2, javaType8);
        C = fieldType29;
        FieldType fieldType30 = new FieldType("UINT32_LIST", 29, 29, collection2, javaType4);
        D = fieldType30;
        FieldType fieldType31 = new FieldType("ENUM_LIST", 30, 30, collection2, javaType9);
        E = fieldType31;
        FieldType fieldType32 = new FieldType("SFIXED32_LIST", 31, 31, collection2, javaType4);
        F = fieldType32;
        FieldType fieldType33 = new FieldType("SFIXED64_LIST", 32, 32, collection2, javaType3);
        G = fieldType33;
        FieldType fieldType34 = new FieldType("SINT32_LIST", 33, 33, collection2, javaType4);
        H = fieldType34;
        FieldType fieldType35 = new FieldType("SINT64_LIST", 34, 34, collection2, javaType3);
        I = fieldType35;
        Collection collection3 = Collection.PACKED_VECTOR;
        FieldType fieldType36 = new FieldType("DOUBLE_LIST_PACKED", 35, 35, collection3, javaType);
        J = fieldType36;
        FieldType fieldType37 = new FieldType("FLOAT_LIST_PACKED", 36, 36, collection3, javaType2);
        K = fieldType37;
        FieldType fieldType38 = new FieldType("INT64_LIST_PACKED", 37, 37, collection3, javaType3);
        L = fieldType38;
        FieldType fieldType39 = new FieldType("UINT64_LIST_PACKED", 38, 38, collection3, javaType3);
        M = fieldType39;
        FieldType fieldType40 = new FieldType("INT32_LIST_PACKED", 39, 39, collection3, javaType4);
        N = fieldType40;
        FieldType fieldType41 = new FieldType("FIXED64_LIST_PACKED", 40, 40, collection3, javaType3);
        O = fieldType41;
        FieldType fieldType42 = new FieldType("FIXED32_LIST_PACKED", 41, 41, collection3, javaType4);
        P = fieldType42;
        FieldType fieldType43 = new FieldType("BOOL_LIST_PACKED", 42, 42, collection3, javaType5);
        Q = fieldType43;
        FieldType fieldType44 = new FieldType("UINT32_LIST_PACKED", 43, 43, collection3, javaType4);
        R = fieldType44;
        FieldType fieldType45 = new FieldType("ENUM_LIST_PACKED", 44, 44, collection3, javaType9);
        S = fieldType45;
        FieldType fieldType46 = new FieldType("SFIXED32_LIST_PACKED", 45, 45, collection3, javaType4);
        T = fieldType46;
        FieldType fieldType47 = new FieldType("SFIXED64_LIST_PACKED", 46, 46, collection3, javaType3);
        U = fieldType47;
        FieldType fieldType48 = new FieldType("SINT32_LIST_PACKED", 47, 47, collection3, javaType4);
        V = fieldType48;
        FieldType fieldType49 = new FieldType("SINT64_LIST_PACKED", 48, 48, collection3, javaType3);
        W = fieldType49;
        FieldType fieldType50 = new FieldType("GROUP_LIST", 49, 49, collection2, javaType7);
        X = fieldType50;
        FieldType fieldType51 = new FieldType("MAP", 50, 50, Collection.MAP, JavaType.a);
        Y = fieldType51;
        b0 = new FieldType[]{fieldType, fieldType2, fieldType3, fieldType4, fieldType5, fieldType6, fieldType7, fieldType8, fieldType9, fieldType10, fieldType11, fieldType12, fieldType13, fieldType14, fieldType15, fieldType16, fieldType17, fieldType18, fieldType19, fieldType20, fieldType21, fieldType22, fieldType23, fieldType24, fieldType25, fieldType26, fieldType27, fieldType28, fieldType29, fieldType30, fieldType31, fieldType32, fieldType33, fieldType34, fieldType35, fieldType36, fieldType37, fieldType38, fieldType39, fieldType40, fieldType41, fieldType42, fieldType43, fieldType44, fieldType45, fieldType46, fieldType47, fieldType48, fieldType49, fieldType50, fieldType51};
        a0 = new Type[0];
        FieldType[] fieldTypeArrValues = values();
        Z = new FieldType[fieldTypeArrValues.length];
        for (FieldType fieldType52 : fieldTypeArrValues) {
            Z[fieldType52.id] = fieldType52;
        }
    }

    private FieldType(String str, int i2, int i3, Collection collection, JavaType javaType) {
        int i4;
        super(str, i2);
        this.id = i3;
        this.collection = collection;
        this.javaType = javaType;
        int i5 = a.a[collection.ordinal()];
        if (i5 == 1 || i5 == 2) {
            this.elementType = javaType.a();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (collection != Collection.SCALAR || (i4 = a.b[javaType.ordinal()]) == 1 || i4 == 2 || i4 == 3) ? false : true;
    }

    public static FieldType valueOf(String str) {
        return (FieldType) Enum.valueOf(FieldType.class, str);
    }

    public static FieldType[] values() {
        return (FieldType[]) b0.clone();
    }

    public int a() {
        return this.id;
    }
}
