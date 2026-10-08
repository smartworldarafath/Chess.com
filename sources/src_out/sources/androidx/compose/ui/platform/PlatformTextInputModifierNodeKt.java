package androidx.compose.ui.platform;

import com.google.android.q22;
import com.google.inputmethod.bc9;
import com.google.inputmethod.fs1;
import com.google.inputmethod.ks9;
import com.google.inputmethod.t04;
import com.google.inputmethod.y23;
import com.google.inputmethod.yb9;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0086@¢\u0006\u0004\b\u0007\u0010\b\u001aB\u0010\r\u001a\u00020\u0004*\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0082@¢\u0006\u0004\b\r\u0010\u000e\"\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/google/android/yb9;", "Lkotlin/Function2;", "Lcom/google/android/bc9;", "Lcom/google/android/q22;", "", "", "block", "b", "(Lcom/google/android/yb9;Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "Landroidx/compose/ui/node/m;", "Landroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor;", "chainedInterceptor", "session", "c", "(Landroidx/compose/ui/node/m;Landroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor;Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/ks9;", "a", "Lcom/google/android/ks9;", "LocalChainedPlatformTextInputInterceptor", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class PlatformTextInputModifierNodeKt {
    private static final ks9<ChainedPlatformTextInputInterceptor> a = fs1.j(new Function0<ChainedPlatformTextInputInterceptor>() { // from class: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$LocalChainedPlatformTextInputInterceptor$1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ChainedPlatformTextInputInterceptor invoke() {
            return null;
        }
    });

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(yb9 yb9Var, Function2<? super bc9, ? super q22<?>, ? extends Object> function2, q22<?> q22Var) throws KotlinNothingValueException {
        PlatformTextInputModifierNodeKt$establishTextInputSession$1 platformTextInputModifierNodeKt$establishTextInputSession$1;
        if (q22Var instanceof PlatformTextInputModifierNodeKt$establishTextInputSession$1) {
            platformTextInputModifierNodeKt$establishTextInputSession$1 = (PlatformTextInputModifierNodeKt$establishTextInputSession$1) q22Var;
            int i = platformTextInputModifierNodeKt$establishTextInputSession$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                platformTextInputModifierNodeKt$establishTextInputSession$1.label = i - t04.INVALID_ID;
            } else {
                platformTextInputModifierNodeKt$establishTextInputSession$1 = new PlatformTextInputModifierNodeKt$establishTextInputSession$1(q22Var);
            }
        } else {
            platformTextInputModifierNodeKt$establishTextInputSession$1 = new PlatformTextInputModifierNodeKt$establishTextInputSession$1(q22Var);
        }
        Object obj = platformTextInputModifierNodeKt$establishTextInputSession$1.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i2 = platformTextInputModifierNodeKt$establishTextInputSession$1.label;
        if (i2 == 0) {
            kotlin.f.b(obj);
            if (!yb9Var.getNode().getIsAttached()) {
                throw new IllegalArgumentException("establishTextInputSession called from an unattached node");
            }
            androidx.compose.ui.node.m mVarR = y23.r(yb9Var);
            ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor = (ChainedPlatformTextInputInterceptor) y23.q(yb9Var).getCompositionLocalMap().a(a);
            platformTextInputModifierNodeKt$establishTextInputSession$1.label = 1;
            if (c(mVarR, chainedPlatformTextInputInterceptor, function2, platformTextInputModifierNodeKt$establishTextInputSession$1) == objG) {
                return objG;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r5.x(r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r6.c(r5, r7, r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(androidx.compose.ui.node.m r5, androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor r6, kotlin.jvm.functions.Function2<? super com.google.inputmethod.bc9, ? super com.google.android.q22<?>, ? extends java.lang.Object> r7, com.google.android.q22<?> r8) throws kotlin.KotlinNothingValueException {
        /*
            boolean r0 = r8 instanceof androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 r0 = (androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 r0 = new androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 == r3) goto L30
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            kotlin.f.b(r8)
            goto L55
        L34:
            kotlin.f.b(r8)
            goto L46
        L38:
            kotlin.f.b(r8)
            if (r6 != 0) goto L4c
            r0.label = r4
            java.lang.Object r5 = r5.x(r7, r0)
            if (r5 != r1) goto L46
            goto L54
        L46:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        L4c:
            r0.label = r3
            java.lang.Object r5 = r6.c(r5, r7, r0)
            if (r5 != r1) goto L55
        L54:
            return r1
        L55:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.c(androidx.compose.ui.node.m, androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor, kotlin.jvm.functions.Function2, com.google.android.q22):java.lang.Object");
    }
}
