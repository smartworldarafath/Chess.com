package androidx.p008glance.p009appwidget.protobuf;

import androidx.p008glance.p009appwidget.protobuf.i0;
import com.google.inputmethod.p29;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public abstract class b<MessageType extends i0> implements p29<MessageType> {
    private static final l a = l.b();

    private MessageType c(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw d(messagetype).a().k(messagetype);
    }

    private UninitializedMessageException d(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).f() : new UninitializedMessageException(messagetype);
    }

    @Override // com.google.inputmethod.p29
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType b(ByteString byteString, l lVar) throws InvalidProtocolBufferException {
        return (MessageType) c(f(byteString, lVar));
    }

    public MessageType f(ByteString byteString, l lVar) throws InvalidProtocolBufferException {
        f fVarS = byteString.s();
        MessageType messagetypeA = a(fVarS, lVar);
        try {
            fVarS.a(0);
            return messagetypeA;
        } catch (InvalidProtocolBufferException e) {
            throw e.k(messagetypeA);
        }
    }
}
