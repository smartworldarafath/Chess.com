package com.google.inputmethod;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.f;
import androidx.datastore.preferences.protobuf.l;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public interface s29<MessageType> {
    MessageType a(f fVar, l lVar) throws InvalidProtocolBufferException;

    MessageType b(ByteString byteString, l lVar) throws InvalidProtocolBufferException;
}
