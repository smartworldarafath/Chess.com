package androidx.compose.p001foundation.text.selection;

import android.view.textclassifier.TextClassifier;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.android.x58;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lcom/google/android/ta2;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2", f = "PlatformSelectionBehaviors.android.kt", l = {369, 273, 282}, m = "invokeSuspend", v = 1)
final class PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2<T> extends SuspendLambda implements Function2<ta2, q22<? super T>, Object> {
    final /* synthetic */ Function2<TextClassifier, q22<? super T>, Object> $block;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PlatformSelectionBehaviorsImpl this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lcom/google/android/ta2;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @lq2(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1", f = "PlatformSelectionBehaviors.android.kt", l = {283}, m = "invokeSuspend", v = 1)
    static final class AnonymousClass1 extends SuspendLambda implements Function2<ta2, q22<? super T>, Object> {
        final /* synthetic */ Function2<TextClassifier, q22<? super T>, Object> $block;
        final /* synthetic */ TextClassifier $textClassificationSession;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(TextClassifier textClassifier, Function2<? super TextClassifier, ? super q22<? super T>, ? extends Object> function2, q22<? super AnonymousClass1> q22Var) {
            super(2, q22Var);
            this.$textClassificationSession = textClassifier;
            this.$block = function2;
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            return new AnonymousClass1(this.$textClassificationSession, this.$block, q22Var);
        }

        public final Object invoke(ta2 ta2Var, q22<? super T> q22Var) {
            return create(ta2Var, q22Var).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object objG = a.g();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                return obj;
            }
            f.b(obj);
            TextClassifier textClassifier = this.$textClassificationSession;
            if (textClassifier == null) {
                return null;
            }
            Function2<TextClassifier, q22<? super T>, Object> function2 = this.$block;
            this.label = 1;
            Object objInvoke = function2.invoke(textClassifier, this);
            return objInvoke == objG ? objG : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2(PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, Function2<? super TextClassifier, ? super q22<? super T>, ? extends Object> function2, q22<? super PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2> q22Var) {
        super(2, q22Var);
        this.this$0 = platformSelectionBehaviorsImpl;
        this.$block = function2;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2(this.this$0, this.$block, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super T> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0093 A[RETURN] */
    public final Object invokeSuspend(Object obj) throws Throwable {
        x58 x58Var;
        PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl;
        x58 x58Var2;
        Throwable th;
        TextClassifier textClassifier;
        Object objE;
        Object objG = a.g();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                x58Var = this.this$0.mutex;
                platformSelectionBehaviorsImpl = this.this$0;
                this.L$0 = x58Var;
                this.L$1 = platformSelectionBehaviorsImpl;
                this.label = 1;
                if (x58Var.g((Object) null, this) != objG) {
                }
                return objG;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.b(obj);
                    return obj;
                }
                x58Var2 = (x58) this.L$0;
                try {
                    f.b(obj);
                    textClassifier = (TextClassifier) obj;
                    x58Var = x58Var2;
                    x58Var.h((Object) null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(textClassifier, this.$block, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                    objE = TimeoutKt.e(200L, anonymousClass1, this);
                    if (objE == objG) {
                        return objG;
                    }
                    return objE;
                } catch (Throwable th2) {
                    th = th2;
                    x58Var2.h((Object) null);
                    throw th;
                }
            }
            platformSelectionBehaviorsImpl = (PlatformSelectionBehaviorsImpl) this.L$1;
            x58 x58Var3 = (x58) this.L$0;
            f.b(obj);
            x58Var = x58Var3;
            textClassifier = platformSelectionBehaviorsImpl.textClassificationSession;
            if (textClassifier == null || textClassifier.isDestroyed()) {
                PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1 platformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1 = new PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1(platformSelectionBehaviorsImpl, null);
                this.L$0 = x58Var;
                this.L$1 = null;
                this.label = 2;
                Object objE2 = TimeoutKt.e(300L, platformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1, this);
                if (objE2 != objG) {
                    x58Var2 = x58Var;
                    obj = objE2;
                    textClassifier = (TextClassifier) obj;
                    x58Var = x58Var2;
                    x58Var.h((Object) null);
                    AnonymousClass1 anonymousClass2 = new AnonymousClass1(textClassifier, this.$block, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                    objE = TimeoutKt.e(200L, anonymousClass2, this);
                    if (objE == objG) {
                        return objE;
                    }
                }
            } else {
                x58Var.h((Object) null);
                AnonymousClass1 anonymousClass3 = new AnonymousClass1(textClassifier, this.$block, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                objE = TimeoutKt.e(200L, anonymousClass3, this);
                if (objE == objG) {
                    return objE;
                }
            }
            return objG;
        } catch (Throwable th3) {
            x58Var2 = x58Var;
            th = th3;
            x58Var2.h((Object) null);
            throw th;
        }
    }
}
