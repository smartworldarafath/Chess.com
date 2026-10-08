package androidx.p008glance.p009appwidget.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
interface t0 {
    void A(List<Integer> list) throws IOException;

    long B() throws IOException;

    int C() throws IOException;

    String D() throws IOException;

    <K, V> void E(Map<K, V> map, c0.a<K, V> aVar, l lVar) throws IOException;

    @Deprecated
    <T> void F(List<T> list, u0<T> u0Var, l lVar) throws IOException;

    <T> T G(Class<T> cls, l lVar) throws IOException;

    <T> void H(T t, u0<T> u0Var, l lVar) throws IOException;

    <T> void I(T t, u0<T> u0Var, l lVar) throws IOException;

    @Deprecated
    <T> T J(Class<T> cls, l lVar) throws IOException;

    <T> void K(List<T> list, u0<T> u0Var, l lVar) throws IOException;

    void a(List<Long> list) throws IOException;

    long b() throws IOException;

    int c() throws IOException;

    int d() throws IOException;

    int e() throws IOException;

    void f(List<Boolean> list) throws IOException;

    void g(List<Integer> list) throws IOException;

    int getTag();

    long h() throws IOException;

    void i(List<Long> list) throws IOException;

    void j(List<Integer> list) throws IOException;

    void k(List<Integer> list) throws IOException;

    int l() throws IOException;

    void m(List<String> list) throws IOException;

    void n(List<Float> list) throws IOException;

    boolean o() throws IOException;

    void p(List<ByteString> list) throws IOException;

    void q(List<Double> list) throws IOException;

    long r() throws IOException;

    ByteString readBytes() throws IOException;

    double readDouble() throws IOException;

    int readFixed32() throws IOException;

    long readFixed64() throws IOException;

    float readFloat() throws IOException;

    String readString() throws IOException;

    void s(List<Integer> list) throws IOException;

    boolean t() throws IOException;

    void u(List<Long> list) throws IOException;

    void v(List<Long> list) throws IOException;

    void w(List<Integer> list) throws IOException;

    void x(List<String> list) throws IOException;

    int y() throws IOException;

    void z(List<Long> list) throws IOException;
}
