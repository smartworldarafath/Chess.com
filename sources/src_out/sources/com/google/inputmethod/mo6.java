package com.google.inputmethod;

import androidx.datastore.p007core.CorruptionException;
import androidx.p008glance.p009appwidget.protobuf.InvalidProtocolBufferException;
import com.google.android.q22;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/google/android/mo6;", "Lcom/google/android/mhb;", "Lcom/google/android/jo6;", "<init>", "()V", "Ljava/io/InputStream;", "input", "readFrom", "(Ljava/io/InputStream;Lcom/google/android/q22;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", "", "b", "(Lcom/google/android/jo6;Ljava/io/OutputStream;Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/jo6;", "a", "()Lcom/google/android/jo6;", "defaultValue", "glance-appwidget-proto"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class mo6 implements mhb<jo6> {
    public static final mo6 a = new mo6();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final jo6 defaultValue;

    static {
        jo6 jo6VarS = jo6.S();
        Intrinsics.checkNotNullExpressionValue(jo6VarS, "getDefaultInstance()");
        defaultValue = jo6VarS;
    }

    private mo6() {
    }

    @Override // com.google.inputmethod.mhb
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public jo6 getDefaultValue() {
        return defaultValue;
    }

    @Override // com.google.inputmethod.mhb
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object writeTo(jo6 jo6Var, OutputStream outputStream, q22<? super Unit> q22Var) throws IOException {
        jo6Var.h(outputStream);
        return Unit.a;
    }

    @Override // com.google.inputmethod.mhb
    public Object readFrom(InputStream inputStream, q22<? super jo6> q22Var) throws IOException {
        try {
            jo6 jo6VarV = jo6.V(inputStream);
            Intrinsics.checkNotNullExpressionValue(jo6VarV, "parseFrom(input)");
            return jo6VarV;
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Cannot read proto.", e);
        }
    }
}
