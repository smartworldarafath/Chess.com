package androidx.compose.ui.viewinterop;

import androidx.compose.ui.relocation.BringIntoViewModifierNodeKt;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.inputmethod.gba;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B5\u0012,\u0010\u0007\u001a(\u0012\u001a\u0012\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0004\u0018\u0001`\u0005\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ;\u0010\r\u001a\u00020\u00042,\u0010\u0007\u001a(\u0012\u001a\u0012\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0004\u0018\u0001`\u0005\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0006¢\u0006\u0004\b\r\u0010\tRH\u0010\u0007\u001a(\u0012\u001a\u0012\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0004\u0018\u0001`\u0005\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\tR)\u0010\u0015\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/viewinterop/BringIntoViewNode;", "Landroidx/compose/ui/b$c;", "Lkotlin/Function1;", "Lcom/google/android/gba;", "", "Landroidx/compose/ui/viewinterop/BringIntoViewRequester;", "Landroidx/compose/ui/viewinterop/OnRequesterReady;", "onRequesterReady", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "V2", "()V", "W2", "m3", "p", "Lkotlin/jvm/functions/Function1;", "getOnRequesterReady", "()Lkotlin/jvm/functions/Function1;", "setOnRequesterReady", "q", "getRequester", "requester", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class BringIntoViewNode extends androidx.compose.ui.b.c {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private Function1<? super Function1<? super gba, Unit>, Unit> onRequesterReady;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final Function1<gba, Unit> requester = new Function1<gba, Unit>() { // from class: androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1

        /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
        @lq2(c = "androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1$1", f = "AndroidViewHolder.android.kt", l = {764}, m = "invokeSuspend", v = 1)
        static final class AnonymousClass1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
            final /* synthetic */ gba $rect;
            int label;
            final /* synthetic */ BringIntoViewNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BringIntoViewNode bringIntoViewNode, gba gbaVar, q22<? super AnonymousClass1> q22Var) {
                super(2, q22Var);
                this.this$0 = bringIntoViewNode;
                this.$rect = gbaVar;
            }

            public final q22<Unit> create(Object obj, q22<?> q22Var) {
                return new AnonymousClass1(this.this$0, this.$rect, q22Var);
            }

            public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
                return create(ta2Var, q22Var).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object objG = kotlin.coroutines.intrinsics.a.g();
                int i = this.label;
                if (i == 0) {
                    kotlin.f.b(obj);
                    BringIntoViewNode bringIntoViewNode = this.this$0;
                    final gba gbaVar = this.$rect;
                    Function0<gba> function0 = new Function0<gba>() { // from class: androidx.compose.ui.viewinterop.BringIntoViewNode.requester.1.1.1
                        {
                            super(0);
                        }

                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final gba invoke() {
                            return gbaVar;
                        }
                    };
                    this.label = 1;
                    if (BringIntoViewModifierNodeKt.a(bringIntoViewNode, function0, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.f.b(obj);
                }
                return Unit.a;
            }
        }

        {
            super(1);
        }

        public final void a(gba gbaVar) {
            if (this.this$0.getIsAttached()) {
                rw0.d(this.this$0.L2(), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, gbaVar, null), 3, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((gba) obj);
            return Unit.a;
        }
    };

    public BringIntoViewNode(Function1<? super Function1<? super gba, Unit>, Unit> function1) {
        this.onRequesterReady = function1;
    }

    @Override // androidx.compose.ui.b.c
    public void V2() {
        this.onRequesterReady.invoke(this.requester);
    }

    @Override // androidx.compose.ui.b.c
    public void W2() {
        this.onRequesterReady.invoke((Object) null);
    }

    public final void m3(Function1<? super Function1<? super gba, Unit>, Unit> onRequesterReady) {
        this.onRequesterReady = onRequesterReady;
        if (getIsAttached()) {
            onRequesterReady.invoke(this.requester);
        }
    }
}
