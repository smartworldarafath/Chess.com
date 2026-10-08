package com.google.inputmethod;

import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/google/android/u74;", "", "<init>", "()V", "Ljava/io/File;", "file", "Ljava/io/IOException;", "cause", "c", "(Ljava/io/File;Ljava/io/IOException;)Ljava/io/IOException;", "origException", "b", "a", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u74 {
    public static final u74 a = new u74();

    private u74() {
    }

    private final IOException b(File file, IOException origException) {
        StringBuilder sb = new StringBuilder();
        sb.append("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return new IOException(string, origException);
    }

    private final IOException c(File file, IOException cause) {
        File parentFile = file.getParentFile();
        if (parentFile != null && parentFile.exists()) {
            if (parentFile.isFile()) {
                if (parentFile.canRead()) {
                    return parentFile.canWrite() ? b(file, cause) : b(file, cause);
                }
                return parentFile.canWrite() ? b(file, cause) : b(file, cause);
            }
            if (parentFile.canRead()) {
                return parentFile.canWrite() ? b(file, cause) : b(file, cause);
            }
            return parentFile.canWrite() ? b(file, cause) : b(file, cause);
        }
        return b(file, cause);
    }

    public final IOException a(File file, IOException cause) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(cause, "cause");
        if (!file.exists()) {
            return c(file, cause);
        }
        if (file.isFile()) {
            if (file.canRead()) {
                return file.canWrite() ? c(file, cause) : c(file, cause);
            }
            return file.canWrite() ? c(file, cause) : c(file, cause);
        }
        if (file.canRead()) {
            return file.canWrite() ? c(file, cause) : c(file, cause);
        }
        return file.canWrite() ? c(file, cause) : c(file, cause);
    }
}
