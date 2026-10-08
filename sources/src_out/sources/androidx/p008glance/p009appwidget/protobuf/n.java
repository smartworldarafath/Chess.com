package androidx.p008glance.p009appwidget.protobuf;

import com.google.inputmethod.lo6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
final class n extends m<GeneratedMessageLite.d> {

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            a = iArr;
            try {
                iArr[WireFormat.FieldType.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[WireFormat.FieldType.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[WireFormat.FieldType.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[WireFormat.FieldType.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[WireFormat.FieldType.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[WireFormat.FieldType.f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[WireFormat.FieldType.g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[WireFormat.FieldType.h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[WireFormat.FieldType.m.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[WireFormat.FieldType.o.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[WireFormat.FieldType.p.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[WireFormat.FieldType.q.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[WireFormat.FieldType.r.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[WireFormat.FieldType.n.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[WireFormat.FieldType.l.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[WireFormat.FieldType.i.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[WireFormat.FieldType.j.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[WireFormat.FieldType.k.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    n() {
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.m
    int a(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.d) entry.getKey()).getNumber();
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.m
    Object b(l lVar, i0 i0Var, int i) {
        return lVar.a(i0Var, i);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.m
    q<GeneratedMessageLite.d> c(Object obj) {
        return ((GeneratedMessageLite.c) obj).extensions;
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.m
    q<GeneratedMessageLite.d> d(Object obj) {
        return ((GeneratedMessageLite.c) obj).L();
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.m
    boolean e(i0 i0Var) {
        return i0Var instanceof GeneratedMessageLite.c;
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.m
    void f(Object obj) {
        c(obj).t();
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.m
    <UT, UB> UB g(Object obj, t0 t0Var, Object obj2, l lVar, q<GeneratedMessageLite.d> qVar, UB ub, a1<UT, UB> a1Var) throws IOException {
        Object objValueOf;
        Object objI;
        ArrayList arrayList;
        GeneratedMessageLite.e eVar = (GeneratedMessageLite.e) obj2;
        int iC = eVar.c();
        if (eVar.b.isRepeated() && eVar.b.isPacked()) {
            switch (a.a[eVar.a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    t0Var.q(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    t0Var.n(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    t0Var.v(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    t0Var.u(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    t0Var.j(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    t0Var.z(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    t0Var.k(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    t0Var.f(arrayList);
                    break;
                case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                    arrayList = new ArrayList();
                    t0Var.A(arrayList);
                    break;
                case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                    arrayList = new ArrayList();
                    t0Var.s(arrayList);
                    break;
                case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    arrayList = new ArrayList();
                    t0Var.i(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    t0Var.g(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    t0Var.a(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    t0Var.w(arrayList);
                    ub = (UB) w0.z(obj, iC, arrayList, eVar.b.c(), ub, a1Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.b.b());
            }
            qVar.x(eVar.b, arrayList);
            return ub;
        }
        if (eVar.a() != WireFormat.FieldType.n) {
            switch (a.a[eVar.a().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(t0Var.readDouble());
                    break;
                case 2:
                    objValueOf = Float.valueOf(t0Var.readFloat());
                    break;
                case 3:
                    objValueOf = Long.valueOf(t0Var.r());
                    break;
                case 4:
                    objValueOf = Long.valueOf(t0Var.h());
                    break;
                case 5:
                    objValueOf = Integer.valueOf(t0Var.y());
                    break;
                case 6:
                    objValueOf = Long.valueOf(t0Var.readFixed64());
                    break;
                case 7:
                    objValueOf = Integer.valueOf(t0Var.readFixed32());
                    break;
                case 8:
                    objValueOf = Boolean.valueOf(t0Var.t());
                    break;
                case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                    objValueOf = Integer.valueOf(t0Var.c());
                    break;
                case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                    objValueOf = Integer.valueOf(t0Var.C());
                    break;
                case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    objValueOf = Long.valueOf(t0Var.b());
                    break;
                case 12:
                    objValueOf = Integer.valueOf(t0Var.e());
                    break;
                case 13:
                    objValueOf = Long.valueOf(t0Var.B());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objValueOf = t0Var.readBytes();
                    break;
                case 16:
                    objValueOf = t0Var.readString();
                    break;
                case 17:
                    if (!eVar.d()) {
                        Object objI2 = qVar.i(eVar.b);
                        if (objI2 instanceof GeneratedMessageLite) {
                            u0 u0VarD = q0.a().d(objI2);
                            if (!((GeneratedMessageLite) objI2).z()) {
                                Object objG = u0VarD.g();
                                u0VarD.a(objG, objI2);
                                qVar.x(eVar.b, objG);
                                objI2 = objG;
                            }
                            t0Var.H(objI2, u0VarD, lVar);
                            return ub;
                        }
                    }
                    objValueOf = t0Var.J(eVar.b().getClass(), lVar);
                    break;
                case 18:
                    if (!eVar.d()) {
                        Object objI3 = qVar.i(eVar.b);
                        if (objI3 instanceof GeneratedMessageLite) {
                            u0 u0VarD2 = q0.a().d(objI3);
                            if (!((GeneratedMessageLite) objI3).z()) {
                                Object objG2 = u0VarD2.g();
                                u0VarD2.a(objG2, objI3);
                                qVar.x(eVar.b, objG2);
                                objI3 = objG2;
                            }
                            t0Var.I(objI3, u0VarD2, lVar);
                            return ub;
                        }
                    }
                    objValueOf = t0Var.G(eVar.b().getClass(), lVar);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            int iY = t0Var.y();
            if (eVar.b.c().findValueByNumber(iY) == null) {
                return (UB) w0.J(obj, iC, iY, ub, a1Var);
            }
            objValueOf = Integer.valueOf(iY);
        }
        if (eVar.d()) {
            qVar.a(eVar.b, objValueOf);
            return ub;
        }
        int i = a.a[eVar.a().ordinal()];
        if ((i == 17 || i == 18) && (objI = qVar.i(eVar.b)) != null) {
            objValueOf = u.g(objI, objValueOf);
        }
        qVar.x(eVar.b, objValueOf);
        return ub;
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.m
    void h(t0 t0Var, Object obj, l lVar, q<GeneratedMessageLite.d> qVar) throws IOException {
        GeneratedMessageLite.e eVar = (GeneratedMessageLite.e) obj;
        qVar.x(eVar.b, t0Var.G(eVar.b().getClass(), lVar));
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.m
    void i(ByteString byteString, Object obj, l lVar, q<GeneratedMessageLite.d> qVar) throws IOException {
        GeneratedMessageLite.e eVar = (GeneratedMessageLite.e) obj;
        i0.a aVarNewBuilderForType = eVar.b().newBuilderForType();
        f fVarS = byteString.s();
        aVarNewBuilderForType.j1(fVarS, lVar);
        qVar.x(eVar.b, aVarNewBuilderForType.buildPartial());
        fVarS.a(0);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.m
    void j(Writer writer, Map.Entry<?, ?> entry) throws IOException {
        GeneratedMessageLite.d dVar = (GeneratedMessageLite.d) entry.getKey();
        if (!dVar.isRepeated()) {
            switch (a.a[dVar.b().ordinal()]) {
                case 1:
                    writer.z(dVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    writer.F(dVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    writer.C(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    writer.e(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    writer.g(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    writer.m(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    writer.c(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    writer.n(dVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                    writer.k(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                    writer.o(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    writer.w(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    writer.I(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    writer.j(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    writer.g(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    writer.K(dVar.getNumber(), (ByteString) entry.getValue());
                    break;
                case 16:
                    writer.d(dVar.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    writer.O(dVar.getNumber(), entry.getValue(), q0.a().c(entry.getValue().getClass()));
                    break;
                case 18:
                    writer.J(dVar.getNumber(), entry.getValue(), q0.a().c(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.a[dVar.b().ordinal()]) {
            case 1:
                w0.O(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 2:
                w0.S(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 3:
                w0.V(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 4:
                w0.d0(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 5:
                w0.U(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 6:
                w0.R(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 7:
                w0.Q(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 8:
                w0.M(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                w0.c0(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                w0.X(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                w0.Y(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 12:
                w0.Z(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 13:
                w0.a0(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 14:
                w0.U(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 15:
                w0.N(dVar.getNumber(), (List) entry.getValue(), writer);
                break;
            case 16:
                w0.b0(dVar.getNumber(), (List) entry.getValue(), writer);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    w0.T(dVar.getNumber(), (List) entry.getValue(), writer, q0.a().c(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    w0.W(dVar.getNumber(), (List) entry.getValue(), writer, q0.a().c(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
