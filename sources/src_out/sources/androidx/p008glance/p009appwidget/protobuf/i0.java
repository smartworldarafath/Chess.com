package androidx.p008glance.p009appwidget.protobuf;

import com.google.inputmethod.at7;
import com.google.inputmethod.p29;
import java.io.IOException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public interface i0 extends at7 {

    public interface a extends at7, Cloneable {
        a G0(i0 i0Var);

        i0 build();

        i0 buildPartial();

        a j1(f fVar, l lVar) throws IOException;
    }

    void a(CodedOutputStream codedOutputStream) throws IOException;

    p29<? extends i0> getParserForType();

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();

    ByteString toByteString();
}
