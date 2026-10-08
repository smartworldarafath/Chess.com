package androidx.datastore.preferences.protobuf;

import com.google.inputmethod.dt7;
import com.google.inputmethod.s29;
import java.io.IOException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public interface i0 extends dt7 {

    public interface a extends dt7, Cloneable {
        a B(i0 i0Var);

        a O1(f fVar, l lVar) throws IOException;

        i0 build();

        i0 buildPartial();
    }

    void a(CodedOutputStream codedOutputStream) throws IOException;

    s29<? extends i0> getParserForType();

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();

    ByteString toByteString();
}
