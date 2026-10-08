package androidx.datastore.p007core;

import com.google.android.lg1;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.mhb;
import com.google.inputmethod.msd;
import com.google.inputmethod.va3;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@lq2(c = "androidx.datastore.core.FileWriteScope$writeData$2", f = "FileStorage.kt", l = {206}, m = "invokeSuspend", v = 1)
final class FileWriteScope$writeData$2 extends SuspendLambda implements Function1<q22<? super Unit>, Object> {
    final /* synthetic */ T $value;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ FileWriteScope<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileWriteScope$writeData$2(FileWriteScope<T> fileWriteScope, T t, q22<? super FileWriteScope$writeData$2> q22Var) {
        super(1, q22Var);
        this.this$0 = fileWriteScope;
        this.$value = t;
    }

    public final q22<Unit> create(q22<?> q22Var) {
        return new FileWriteScope$writeData$2(this.this$0, this.$value, q22Var);
    }

    public final Object invoke(q22<? super Unit> q22Var) {
        return create(q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) throws Exception {
        Closeable closeable;
        Throwable th;
        FileOutputStream fileOutputStream;
        Object objG = a.g();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                FileOutputStream fileOutputStream2 = new FileOutputStream(this.this$0.getFile());
                FileReadScope fileReadScope = this.this$0;
                T t = this.$value;
                try {
                    mhb mhbVarH = fileReadScope.h();
                    msd msdVar = new msd(fileOutputStream2);
                    this.L$0 = fileOutputStream2;
                    this.L$1 = fileOutputStream2;
                    this.label = 1;
                    if (mhbVarH.writeTo(t, msdVar, this) == objG) {
                        return objG;
                    }
                    fileOutputStream = fileOutputStream2;
                    closeable = fileOutputStream;
                } catch (Throwable th2) {
                    closeable = fileOutputStream2;
                    th = th2;
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fileOutputStream = (FileOutputStream) this.L$1;
                closeable = (Closeable) this.L$0;
                try {
                    f.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        lg1.a(closeable, th);
                        throw th4;
                    }
                }
            }
            fileOutputStream.getFD().sync();
            Unit unit = Unit.a;
            lg1.a(closeable, (Throwable) null);
            return Unit.a;
        } catch (Exception e) {
            if (e instanceof FileNotFoundException) {
                throw va3.c(this.this$0.getFile().getParent(), e);
            }
            throw e;
        }
    }
}
