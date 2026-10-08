package androidx.compose.ui.text.font;

import androidx.compose.p004runtime.s0;
import com.google.android.q22;
import com.google.inputmethod.TypefaceRequest;
import com.google.inputmethod.o58;
import com.google.inputmethod.q6c;
import com.google.inputmethod.t04;
import com.google.inputmethod.wa9;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0002*\u00020\u0004H\u0080@¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R+\u0010(\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010/\u001a\u00020)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.¨\u00060"}, d2 = {"Landroidx/compose/ui/text/font/AsyncFontListLoader;", "Lcom/google/android/q6c;", "", "", "Landroidx/compose/ui/text/font/k;", "fontList", "initialType", "Lcom/google/android/kod;", "typefaceRequest", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "asyncTypefaceCache", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/l0$b;", "", "onCompletion", "Lcom/google/android/wa9;", "platformFontLoader", "<init>", "(Ljava/util/List;Ljava/lang/Object;Lcom/google/android/kod;Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lkotlin/jvm/functions/Function1;Lcom/google/android/wa9;)V", "m", "(Lcom/google/android/q22;)Ljava/lang/Object;", "q", "(Landroidx/compose/ui/text/font/k;Lcom/google/android/q22;)Ljava/lang/Object;", "a", "Ljava/util/List;", "b", "Lcom/google/android/kod;", "c", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "d", "Lkotlin/jvm/functions/Function1;", "e", "Lcom/google/android/wa9;", "<set-?>", "f", "Lcom/google/android/o58;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "", "g", "Z", "()Z", "setCacheable$ui_text", "(Z)V", "cacheable", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AsyncFontListLoader implements q6c<Object> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<k> fontList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TypefaceRequest typefaceRequest;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AsyncTypefaceCache asyncTypefaceCache;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function1<l0.b, Unit> onCompletion;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final wa9 platformFontLoader;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final o58 value;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean cacheable = true;

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncFontListLoader(List<? extends k> list, Object obj, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, Function1<? super l0.b, Unit> function1, wa9 wa9Var) {
        this.fontList = list;
        this.typefaceRequest = typefaceRequest;
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.onCompletion = function1;
        this.platformFontLoader = wa9Var;
        this.value = s0.e(obj, null, 2, null);
    }

    private void setValue(Object obj) {
        this.value.setValue(obj);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getCacheable() {
        return this.cacheable;
    }

    @Override // com.google.inputmethod.q6c
    public Object getValue() {
        return this.value.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b A[Catch: all -> 0x00e6, TRY_LEAVE, TryCatch #0 {all -> 0x00e6, blocks: (B:27:0x0064, B:29:0x007b), top: B:48:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0096  */
    /* JADX WARN: Code duplicated, block: B:34:0x009d A[Catch: all -> 0x0039, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:14:0x0034, B:34:0x009d, B:37:0x00d1, B:21:0x0050, B:24:0x005a), top: B:50:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d1 A[Catch: all -> 0x0039, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:14:0x0034, B:34:0x009d, B:37:0x00d1, B:21:0x0050, B:24:0x005a), top: B:50:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0079 -> B:43:0x00e9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00df -> B:40:0x00e2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object m(com.google.android.q22<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.m(com.google.android.q22):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(k kVar, q22<Object> q22Var) {
        AsyncFontListLoader$loadWithTimeoutOrNull$1 asyncFontListLoader$loadWithTimeoutOrNull$1;
        if (q22Var instanceof AsyncFontListLoader$loadWithTimeoutOrNull$1) {
            asyncFontListLoader$loadWithTimeoutOrNull$1 = (AsyncFontListLoader$loadWithTimeoutOrNull$1) q22Var;
            int i = asyncFontListLoader$loadWithTimeoutOrNull$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                asyncFontListLoader$loadWithTimeoutOrNull$1.label = i - t04.INVALID_ID;
            } else {
                asyncFontListLoader$loadWithTimeoutOrNull$1 = new AsyncFontListLoader$loadWithTimeoutOrNull$1(this, q22Var);
            }
        } else {
            asyncFontListLoader$loadWithTimeoutOrNull$1 = new AsyncFontListLoader$loadWithTimeoutOrNull$1(this, q22Var);
        }
        Object obj = asyncFontListLoader$loadWithTimeoutOrNull$1.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i2 = asyncFontListLoader$loadWithTimeoutOrNull$1.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.f.b(obj);
                return obj;
            }
            kotlin.f.b(obj);
            AsyncFontListLoader$loadWithTimeoutOrNull$2 asyncFontListLoader$loadWithTimeoutOrNull$2 = new AsyncFontListLoader$loadWithTimeoutOrNull$2(this, kVar, null);
            asyncFontListLoader$loadWithTimeoutOrNull$1.L$0 = kVar;
            asyncFontListLoader$loadWithTimeoutOrNull$1.label = 1;
            Object objE = TimeoutKt.e(15000L, asyncFontListLoader$loadWithTimeoutOrNull$2, asyncFontListLoader$loadWithTimeoutOrNull$1);
            return objE == objG ? objG : objE;
        } catch (CancellationException e) {
            if (!kotlinx.coroutines.u.n(asyncFontListLoader$loadWithTimeoutOrNull$1.getContext())) {
                throw e;
            }
            return null;
        } catch (Exception e2) {
            CoroutineExceptionHandler coroutineExceptionHandler = asyncFontListLoader$loadWithTimeoutOrNull$1.getContext().get(CoroutineExceptionHandler.t2);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(asyncFontListLoader$loadWithTimeoutOrNull$1.getContext(), new IllegalStateException("Unable to load font " + kVar, e2));
            }
            return null;
        }
    }
}
