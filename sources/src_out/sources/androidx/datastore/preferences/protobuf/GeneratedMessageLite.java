package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite.a;
import com.google.inputmethod.dt7;
import com.google.inputmethod.s29;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected b1 unknownFields = b1.c();

    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static abstract class a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.a.AbstractC0080a<MessageType, BuilderType> {
        private final MessageType a;
        protected MessageType b;

        protected a(MessageType messagetype) {
            this.a = messagetype;
            if (messagetype.z()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.b = (MessageType) q();
        }

        private static <MessageType> void p(MessageType messagetype, MessageType messagetype2) {
            q0.a().d(messagetype).a(messagetype, messagetype2);
        }

        private MessageType q() {
            return (MessageType) this.a.G();
        }

        @Override // androidx.datastore.preferences.protobuf.i0.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final MessageType build() {
            MessageType messagetype = (MessageType) buildPartial();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw androidx.datastore.preferences.protobuf.a.AbstractC0080a.f(messagetype);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public MessageType buildPartial() {
            if (!this.b.z()) {
                return this.b;
            }
            this.b.A();
            return this.b;
        }

        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            buildertype.b = (MessageType) buildPartial();
            return buildertype;
        }

        @Override // com.google.inputmethod.dt7
        public final boolean isInitialized() {
            return GeneratedMessageLite.y(this.b, false);
        }

        protected final void j() {
            if (this.b.z()) {
                return;
            }
            k();
        }

        protected void k() {
            MessageType messagetype = (MessageType) q();
            p(messagetype, this.b);
            this.b = messagetype;
        }

        @Override // com.google.inputmethod.dt7
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public MessageType getDefaultInstanceForType() {
            return this.a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.datastore.preferences.protobuf.a.AbstractC0080a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public BuilderType d(MessageType messagetype) {
            return (BuilderType) o(messagetype);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public BuilderType O1(f fVar, l lVar) throws IOException {
            j();
            try {
                q0.a().d(this.b).i(this.b, g.L(fVar), lVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        public BuilderType o(MessageType messagetype) {
            if (getDefaultInstanceForType().equals(messagetype)) {
                return this;
            }
            j();
            p(this.b, messagetype);
            return this;
        }
    }

    protected static class b<T extends GeneratedMessageLite<T, ?>> extends androidx.datastore.preferences.protobuf.b<T> {
        private final T b;

        public b(T t) {
            this.b = t;
        }

        @Override // com.google.inputmethod.s29
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public T a(f fVar, l lVar) throws InvalidProtocolBufferException {
            return (T) GeneratedMessageLite.I(this.b, fVar, lVar);
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite<MessageType, BuilderType> implements dt7 {
        protected q<d> extensions = q.h();

        q<d> M() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, com.google.inputmethod.dt7
        public /* bridge */ /* synthetic */ i0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.i0
        public /* bridge */ /* synthetic */ i0.a newBuilderForType() {
            return super.newBuilderForType();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.i0
        public /* bridge */ /* synthetic */ i0.a toBuilder() {
            return super.toBuilder();
        }
    }

    static final class d implements q.b<d> {
        final int a;
        final WireFormat.FieldType b;
        final boolean c;
        final boolean d;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.q.b
        public i0.a M(i0.a aVar, i0 i0Var) {
            return ((a) aVar).o((GeneratedMessageLite) i0Var);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.a - dVar.a;
        }

        @Override // androidx.datastore.preferences.protobuf.q.b
        public WireFormat.FieldType b() {
            return this.b;
        }

        public u.b<?> c() {
            return null;
        }

        @Override // androidx.datastore.preferences.protobuf.q.b
        public WireFormat.JavaType f() {
            return this.b.a();
        }

        @Override // androidx.datastore.preferences.protobuf.q.b
        public int getNumber() {
            return this.a;
        }

        @Override // androidx.datastore.preferences.protobuf.q.b
        public boolean isPacked() {
            return this.d;
        }

        @Override // androidx.datastore.preferences.protobuf.q.b
        public boolean isRepeated() {
            return this.c;
        }
    }

    public static class e<ContainingType extends i0, Type> extends j<ContainingType, Type> {
        final i0 a;
        final d b;

        public WireFormat.FieldType a() {
            return this.b.b();
        }

        public i0 b() {
            return this.a;
        }

        public int c() {
            return this.b.getNumber();
        }

        public boolean d() {
            return this.b.c;
        }
    }

    protected static <E> u.f<E> D(u.f<E> fVar) {
        int size = fVar.size();
        return fVar.a(size == 0 ? 10 : size * 2);
    }

    protected static Object F(i0 i0Var, String str, Object[] objArr) {
        return new s0(i0Var, str, objArr);
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T H(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) j(I(t, f.g(inputStream), l.b()));
    }

    static <T extends GeneratedMessageLite<T, ?>> T I(T t, f fVar, l lVar) throws InvalidProtocolBufferException {
        T t2 = (T) t.G();
        try {
            u0 u0VarD = q0.a().d(t2);
            u0VarD.i(t2, g.L(fVar), lVar);
            u0VarD.e(t2);
            return t2;
        } catch (InvalidProtocolBufferException e2) {
            e = e2;
            if (e.a()) {
                e = new InvalidProtocolBufferException(e);
            }
            throw e.k(t2);
        } catch (UninitializedMessageException e3) {
            throw e3.a().k(t2);
        } catch (IOException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw new InvalidProtocolBufferException(e4).k(t2);
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e5.getCause());
            }
            throw e5;
        }
    }

    protected static <T extends GeneratedMessageLite<?, ?>> void J(Class<T> cls, T t) {
        t.C();
        defaultInstanceMap.put(cls, t);
    }

    private static <T extends GeneratedMessageLite<T, ?>> T j(T t) throws InvalidProtocolBufferException {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw t.f().a().k(t);
    }

    private int n(u0<?> u0Var) {
        return u0Var == null ? q0.a().d(this).f(this) : u0Var.f(this);
    }

    protected static <E> u.f<E> s() {
        return r0.d();
    }

    static <T extends GeneratedMessageLite<?, ?>> T t(Class<T> cls) {
        T t = (T) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((GeneratedMessageLite) d1.i(cls)).getDefaultInstanceForType();
        if (t2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t2);
        return t2;
    }

    static Object x(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final <T extends GeneratedMessageLite<T, ?>> boolean y(T t, boolean z) {
        byte bByteValue = ((Byte) t.p(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = q0.a().d(t).d(t);
        if (z) {
            t.q(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, zD ? t : null);
        }
        return zD;
    }

    protected void A() {
        q0.a().d(this).e(this);
        C();
    }

    void C() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final BuilderType newBuilderForType() {
        return (BuilderType) p(MethodToInvoke.NEW_BUILDER);
    }

    MessageType G() {
        return (MessageType) p(MethodToInvoke.NEW_MUTABLE_INSTANCE);
    }

    void K(int i) {
        this.memoizedHashCode = i;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final BuilderType toBuilder() {
        return (BuilderType) ((a) p(MethodToInvoke.NEW_BUILDER)).o(this);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public void a(CodedOutputStream codedOutputStream) throws IOException {
        q0.a().d(this).h(this, h.P(codedOutputStream));
    }

    @Override // androidx.datastore.preferences.protobuf.a
    int c() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    int d(u0 u0Var) {
        if (!z()) {
            if (c() != Integer.MAX_VALUE) {
                return c();
            }
            int iN = n(u0Var);
            g(iN);
            return iN;
        }
        int iN2 = n(u0Var);
        if (iN2 >= 0) {
            return iN2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iN2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return q0.a().d(this).b(this, (GeneratedMessageLite) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    void g(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final s29<MessageType> getParserForType() {
        return (s29) p(MethodToInvoke.GET_PARSER);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public int getSerializedSize() {
        return d(null);
    }

    public int hashCode() {
        if (z()) {
            return m();
        }
        if (w()) {
            K(m());
        }
        return v();
    }

    Object i() throws Exception {
        return p(MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    @Override // com.google.inputmethod.dt7
    public final boolean isInitialized() {
        return y(this, true);
    }

    void k() {
        this.memoizedHashCode = 0;
    }

    void l() {
        g(Integer.MAX_VALUE);
    }

    int m() {
        return q0.a().d(this).c(this);
    }

    protected final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType o() {
        return (BuilderType) p(MethodToInvoke.NEW_BUILDER);
    }

    protected Object p(MethodToInvoke methodToInvoke) {
        return r(methodToInvoke, null, null);
    }

    protected Object q(MethodToInvoke methodToInvoke, Object obj) {
        return r(methodToInvoke, obj, null);
    }

    protected abstract Object r(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    public String toString() {
        return j0.f(this, super.toString());
    }

    @Override // com.google.inputmethod.dt7
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) p(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    int v() {
        return this.memoizedHashCode;
    }

    boolean w() {
        return v() == 0;
    }

    boolean z() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }
}
