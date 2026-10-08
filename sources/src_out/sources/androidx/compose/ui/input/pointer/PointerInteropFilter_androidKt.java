package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.cc0;
import com.google.inputmethod.df9;
import com.google.inputmethod.ugc;
import com.google.inputmethod.wia;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/b;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "view", "b", "(Landroidx/compose/ui/b;Landroidx/compose/ui/viewinterop/AndroidViewHolder;)Landroidx/compose/ui/b;", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "watcher", "a", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/b;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class PointerInteropFilter_androidKt {
    public static final androidx.compose.ui.b a(androidx.compose.ui.b bVar, final Function1<? super MotionEvent, Unit> function1) {
        return ugc.c(bVar, function1, new PointerInputEventHandler() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1

            /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/cc0;", "", "<anonymous>", "(Lcom/google/android/cc0;)V"}, k = 3, mv = {2, 1, 0})
            @lq2(c = "androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1", f = "PointerInteropFilter.android.kt", l = {389}, m = "invokeSuspend", v = 1)
            static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<cc0, q22<? super Unit>, Object> {
                final /* synthetic */ Function1<MotionEvent, Unit> $watcher;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(Function1<? super MotionEvent, Unit> function1, q22<? super AnonymousClass1> q22Var) {
                    super(2, q22Var);
                    this.$watcher = function1;
                }

                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(cc0 cc0Var, q22<? super Unit> q22Var) {
                    return create(cc0Var, q22Var).invokeSuspend(Unit.a);
                }

                public final q22<Unit> create(Object obj, q22<?> q22Var) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$watcher, q22Var);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                /* JADX WARN: Code duplicated, block: B:11:0x002f A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:14:0x0038  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:12:0x0030). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                    /*
                        r4 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
                        int r1 = r4.label
                        r2 = 1
                        if (r1 == 0) goto L1b
                        if (r1 != r2) goto L13
                        java.lang.Object r1 = r4.L$0
                        com.google.android.cc0 r1 = (com.google.inputmethod.cc0) r1
                        kotlin.f.b(r5)
                        goto L30
                    L13:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r0)
                        throw r5
                    L1b:
                        kotlin.f.b(r5)
                        java.lang.Object r5 = r4.L$0
                        com.google.android.cc0 r5 = (com.google.inputmethod.cc0) r5
                        r1 = r5
                    L23:
                        androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                        r4.L$0 = r1
                        r4.label = r2
                        java.lang.Object r5 = r1.f2(r5, r4)
                        if (r5 != r0) goto L30
                        return r0
                    L30:
                        androidx.compose.ui.input.pointer.e r5 = (androidx.compose.ui.input.pointer.e) r5
                        android.view.MotionEvent r5 = r5.g()
                        if (r5 == 0) goto L23
                        kotlin.jvm.functions.Function1<android.view.MotionEvent, kotlin.Unit> r3 = r4.$watcher
                        r3.invoke(r5)
                        goto L23
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(df9 df9Var, q22<? super Unit> q22Var) {
                df9Var.V1(true);
                Object objL0 = df9Var.l0(new AnonymousClass1(function1, null), q22Var);
                return objL0 == kotlin.coroutines.intrinsics.a.g() ? objL0 : Unit.a;
            }
        });
    }

    public static final androidx.compose.ui.b b(androidx.compose.ui.b bVar, final AndroidViewHolder androidViewHolder) {
        PointerInteropFilter pointerInteropFilter = new PointerInteropFilter();
        pointerInteropFilter.e(new Function1<MotionEvent, Boolean>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$3
            {
                super(1);
            }

            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(MotionEvent motionEvent) {
                boolean zDispatchTouchEvent;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = androidViewHolder.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = androidViewHolder.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
            }
        });
        wia wiaVar = new wia();
        pointerInteropFilter.k(wiaVar);
        androidViewHolder.setOnRequestDisallowInterceptTouchEvent$ui(wiaVar);
        return bVar.then(pointerInteropFilter);
    }
}
