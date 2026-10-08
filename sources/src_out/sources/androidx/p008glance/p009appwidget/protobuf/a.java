package androidx.p008glance.p009appwidget.protobuf;

import androidx.p008glance.p009appwidget.protobuf.a;
import androidx.p008glance.p009appwidget.protobuf.a.AbstractC0086a;
import com.google.inputmethod.iz6;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0086a<MessageType, BuilderType>> implements i0 {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0086a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0086a<MessageType, BuilderType>> implements i0.a {
        protected static <T> void b(Iterable<T> iterable, List<? super T> list) {
            u.a(iterable);
            if (!(iterable instanceof iz6)) {
                if (iterable instanceof p0) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    c(iterable, list);
                    return;
                }
            }
            List<?> listG = ((iz6) iterable).g();
            iz6 iz6Var = (iz6) list;
            int size = list.size();
            for (Object obj : listG) {
                if (obj == null) {
                    String str = "Element at index " + (iz6Var.size() - size) + " is null.";
                    for (int size2 = iz6Var.size() - 1; size2 >= size; size2--) {
                        iz6Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof ByteString) {
                    iz6Var.h0((ByteString) obj);
                } else if (obj instanceof byte[]) {
                    iz6Var.h0(ByteString.f((byte[]) obj));
                } else {
                    iz6Var.add((String) obj);
                }
            }
        }

        private static <T> void c(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T t : iterable) {
                if (t == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t);
            }
        }

        protected static UninitializedMessageException f(i0 i0Var) {
            return new UninitializedMessageException(i0Var);
        }

        protected abstract BuilderType d(MessageType messagetype);

        @Override // androidx.glance.appwidget.protobuf.i0.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BuilderType G0(i0 i0Var) {
            if (getDefaultInstanceForType().getClass().isInstance(i0Var)) {
                return (BuilderType) d((a) i0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    protected static <T> void b(Iterable<T> iterable, List<? super T> list) {
        AbstractC0086a.b(iterable, list);
    }

    private String e(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    int c() {
        throw new UnsupportedOperationException();
    }

    int d(u0 u0Var) {
        int iC = c();
        if (iC != -1) {
            return iC;
        }
        int iF = u0Var.f(this);
        g(iF);
        return iF;
    }

    UninitializedMessageException f() {
        return new UninitializedMessageException(this);
    }

    void g(int i) {
        throw new UnsupportedOperationException();
    }

    public void h(OutputStream outputStream) throws IOException {
        CodedOutputStream codedOutputStreamE0 = CodedOutputStream.e0(outputStream, CodedOutputStream.I(getSerializedSize()));
        a(codedOutputStreamE0);
        codedOutputStreamE0.b0();
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.i0
    public ByteString toByteString() {
        try {
            ByteString.g gVarR = ByteString.r(getSerializedSize());
            a(gVarR.b());
            return gVarR.a();
        } catch (IOException e) {
            throw new RuntimeException(e("ByteString"), e);
        }
    }
}
