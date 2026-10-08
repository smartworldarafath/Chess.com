package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.q.b;
import com.google.inputmethod.dt7;
import com.google.inputmethod.lo6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
final class q<T extends b<T>> {
    private static final q<?> d = new q<>(true);
    private final x0<T, Object> a;
    private boolean b;
    private boolean c;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            b = iArr;
            try {
                iArr[WireFormat.FieldType.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[WireFormat.FieldType.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[WireFormat.FieldType.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[WireFormat.FieldType.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[WireFormat.FieldType.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[WireFormat.FieldType.f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[WireFormat.FieldType.g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[WireFormat.FieldType.h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[WireFormat.FieldType.j.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[WireFormat.FieldType.k.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[WireFormat.FieldType.i.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[WireFormat.FieldType.l.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[WireFormat.FieldType.m.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[WireFormat.FieldType.o.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[WireFormat.FieldType.p.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[WireFormat.FieldType.q.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[WireFormat.FieldType.r.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[WireFormat.FieldType.n.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            a = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface b<T extends b<T>> extends Comparable<T> {
        i0.a M(i0.a aVar, i0 i0Var);

        WireFormat.FieldType b();

        WireFormat.JavaType f();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    private q() {
        this.a = x0.q();
    }

    static void A(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.j) {
            codedOutputStream.z0(i, (i0) obj);
        } else {
            codedOutputStream.V0(i, m(fieldType, false));
            B(codedOutputStream, fieldType, obj);
        }
    }

    static void B(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (a.b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.q0(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.y0(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.G0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.Z0(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.E0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.w0(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.u0(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.k0(((Boolean) obj).booleanValue());
                break;
            case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                codedOutputStream.B0((i0) obj);
                break;
            case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                codedOutputStream.I0((i0) obj);
                break;
            case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.U0((String) obj);
                } else {
                    codedOutputStream.o0((ByteString) obj);
                }
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.l0((byte[]) obj);
                } else {
                    codedOutputStream.o0((ByteString) obj);
                }
                break;
            case 13:
                codedOutputStream.X0(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.M0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.O0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.Q0(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.S0(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof u.a)) {
                    codedOutputStream.s0(((Integer) obj).intValue());
                } else {
                    codedOutputStream.s0(((u.a) obj).getNumber());
                }
                break;
        }
    }

    private static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int d(WireFormat.FieldType fieldType, int i, Object obj) {
        int iU = CodedOutputStream.U(i);
        if (fieldType == WireFormat.FieldType.j) {
            iU *= 2;
        }
        return iU + e(fieldType, obj);
    }

    static int e(WireFormat.FieldType fieldType, Object obj) {
        switch (a.b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.j(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.r(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.y(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.Y(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.w(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.p(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.n(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.e(((Boolean) obj).booleanValue());
            case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                return CodedOutputStream.t((i0) obj);
            case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                return obj instanceof v ? CodedOutputStream.B((v) obj) : CodedOutputStream.G((i0) obj);
            case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return obj instanceof ByteString ? CodedOutputStream.h((ByteString) obj) : CodedOutputStream.T((String) obj);
            case 12:
                return obj instanceof ByteString ? CodedOutputStream.h((ByteString) obj) : CodedOutputStream.f((byte[]) obj);
            case 13:
                return CodedOutputStream.W(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.L(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.N(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.P(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.R(((Long) obj).longValue());
            case 18:
                return obj instanceof u.a ? CodedOutputStream.l(((u.a) obj).getNumber()) : CodedOutputStream.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        WireFormat.FieldType fieldTypeB = bVar.b();
        int number = bVar.getNumber();
        if (!bVar.isRepeated()) {
            return d(fieldTypeB, number, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!bVar.isPacked()) {
            int iD = 0;
            while (i < size) {
                iD += d(fieldTypeB, number, list.get(i));
                i++;
            }
            return iD;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iE = 0;
        while (i < size) {
            iE += e(fieldTypeB, list.get(i));
            i++;
        }
        return CodedOutputStream.U(number) + iE + CodedOutputStream.W(iE);
    }

    public static <T extends b<T>> q<T> h() {
        return (q<T>) d;
    }

    private int k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.f() != WireFormat.JavaType.MESSAGE || key.isRepeated() || key.isPacked()) {
            return f(key, value);
        }
        return value instanceof v ? CodedOutputStream.z(entry.getKey().getNumber(), (v) value) : CodedOutputStream.D(entry.getKey().getNumber(), (i0) value);
    }

    static int m(WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.c();
    }

    private static <T extends b<T>> boolean q(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.f() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        if (!key.isRepeated()) {
            return r(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!r(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean r(Object obj) {
        if (obj instanceof dt7) {
            return ((dt7) obj).isInitialized();
        }
        if (obj instanceof v) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static boolean s(WireFormat.FieldType fieldType, Object obj) {
        u.a(obj);
        switch (a.a[fieldType.a().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof ByteString) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof u.a);
            case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                return (obj instanceof i0) || (obj instanceof v);
            default:
                return false;
        }
    }

    private void w(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof v;
        if (key.isRepeated()) {
            if (z) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objI = i(key);
            if (objI == null) {
                objI = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objI).add(c(it.next()));
            }
            this.a.r(key, objI);
            return;
        }
        if (key.f() != WireFormat.JavaType.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.a.r(key, c(value));
            return;
        }
        Object objI2 = i(key);
        if (objI2 == null) {
            this.a.r(key, c(value));
            if (z) {
                this.c = true;
                return;
            }
            return;
        }
        if (z) {
            value = ((v) value).f();
        }
        this.a.r(key, key.M(((i0) objI2).toBuilder(), (i0) value).build());
    }

    public static <T extends b<T>> q<T> x() {
        return new q<>();
    }

    private void z(T t, Object obj) {
        if (!s(t.b(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.getNumber()), t.b().a(), obj.getClass().getName()));
        }
    }

    public void a(T t, Object obj) {
        List arrayList;
        if (!t.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        z(t, obj);
        Object objI = i(t);
        if (objI == null) {
            arrayList = new ArrayList();
            this.a.r(t, arrayList);
        } else {
            arrayList = (List) objI;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public q<T> clone() {
        q<T> qVarX = x();
        int iK = this.a.k();
        for (int i = 0; i < iK; i++) {
            Map.Entry<K, Object> entryJ = this.a.j(i);
            qVarX.y((b) entryJ.getKey(), entryJ.getValue());
        }
        Iterator it = this.a.m().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            qVarX.y((b) entry.getKey(), entry.getValue());
        }
        qVarX.c = this.c;
        return qVarX;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return this.a.equals(((q) obj).a);
        }
        return false;
    }

    Iterator<Map.Entry<T, Object>> g() {
        if (n()) {
            return Collections.emptyIterator();
        }
        return this.c ? new v.c(this.a.h().iterator()) : this.a.h().iterator();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public Object i(T t) {
        Object obj = this.a.get(t);
        return obj instanceof v ? ((v) obj).f() : obj;
    }

    public int j() {
        int iK = this.a.k();
        int iK2 = 0;
        for (int i = 0; i < iK; i++) {
            iK2 += k(this.a.j(i));
        }
        Iterator it = this.a.m().iterator();
        while (it.hasNext()) {
            iK2 += k((Map.Entry) it.next());
        }
        return iK2;
    }

    public int l() {
        int iK = this.a.k();
        int iF = 0;
        for (int i = 0; i < iK; i++) {
            Map.Entry<K, Object> entryJ = this.a.j(i);
            iF += f((b) entryJ.getKey(), entryJ.getValue());
        }
        Iterator it = this.a.m().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iF += f((b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    boolean n() {
        return this.a.isEmpty();
    }

    public boolean o() {
        return this.b;
    }

    public boolean p() {
        int iK = this.a.k();
        for (int i = 0; i < iK; i++) {
            if (!q(this.a.j(i))) {
                return false;
            }
        }
        Iterator it = this.a.m().iterator();
        while (it.hasNext()) {
            if (!q((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> t() {
        if (n()) {
            return Collections.emptyIterator();
        }
        return this.c ? new v.c(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
    }

    public void u() {
        if (this.b) {
            return;
        }
        int iK = this.a.k();
        for (int i = 0; i < iK; i++) {
            Map.Entry<K, Object> entryJ = this.a.j(i);
            if (entryJ.getValue() instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) entryJ.getValue()).A();
            }
        }
        this.a.p();
        this.b = true;
    }

    public void v(q<T> qVar) {
        int iK = qVar.a.k();
        for (int i = 0; i < iK; i++) {
            w(qVar.a.j(i));
        }
        Iterator it = qVar.a.m().iterator();
        while (it.hasNext()) {
            w((Map.Entry) it.next());
        }
    }

    public void y(T t, Object obj) {
        if (!t.isRepeated()) {
            z(t, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                z(t, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof v) {
            this.c = true;
        }
        this.a.r(t, obj);
    }

    private q(boolean z) {
        this(x0.q());
        u();
    }

    private q(x0<T, Object> x0Var) {
        this.a = x0Var;
        u();
    }
}
