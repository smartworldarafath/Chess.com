package com.google.inputmethod;

import androidx.datastore.p007core.FileStorageConnection;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u0015*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u000eB9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/google/android/n84;", "T", "Lcom/google/android/j9c;", "Lcom/google/android/mhb;", "serializer", "Lkotlin/Function1;", "Ljava/io/File;", "Lcom/google/android/f26;", "coordinatorProducer", "Lkotlin/Function0;", "produceFile", "<init>", "(Lcom/google/android/mhb;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Lcom/google/android/k9c;", "a", "()Lcom/google/android/k9c;", "Lcom/google/android/mhb;", "b", "Lkotlin/jvm/functions/Function1;", "c", "Lkotlin/jvm/functions/Function0;", "d", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n84<T> implements j9c<T> {
    private static final Set<String> e = new LinkedHashSet();
    private static final Object f = new Object();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final mhb<T> serializer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function1<File, f26> coordinatorProducer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Function0<File> produceFile;

    /* JADX WARN: Multi-variable type inference failed */
    public n84(mhb<T> mhbVar, Function1<? super File, ? extends f26> function1, Function0<? extends File> function0) {
        Intrinsics.checkNotNullParameter(mhbVar, "serializer");
        Intrinsics.checkNotNullParameter(function1, "coordinatorProducer");
        Intrinsics.checkNotNullParameter(function0, "produceFile");
        this.serializer = mhbVar;
        this.coordinatorProducer = function1;
        this.produceFile = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f26 d(File file) {
        Intrinsics.checkNotNullParameter(file, "it");
        return h26.a(file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(File file) {
        synchronized (f) {
            e.remove(file.getAbsolutePath());
        }
        return Unit.a;
    }

    @Override // com.google.inputmethod.j9c
    public k9c<T> a() throws IOException {
        final File canonicalFile = ((File) this.produceFile.invoke()).getCanonicalFile();
        synchronized (f) {
            String absolutePath = canonicalFile.getAbsolutePath();
            Set<String> set = e;
            if (set.contains(absolutePath)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            Intrinsics.g(absolutePath);
            set.add(absolutePath);
        }
        Intrinsics.g(canonicalFile);
        return new FileStorageConnection(canonicalFile, this.serializer, (f26) this.coordinatorProducer.invoke(canonicalFile), new Function0() { // from class: com.google.android.m84
            public final Object invoke() {
                return n84.e(canonicalFile);
            }
        });
    }

    public /* synthetic */ n84(mhb mhbVar, Function1 function1, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mhbVar, (i & 2) != 0 ? new Function1() { // from class: com.google.android.l84
            public final Object invoke(Object obj) {
                return n84.d((File) obj);
            }
        } : function1, function0);
    }
}
