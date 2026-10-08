package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.node.m;
import androidx.compose.ui.platform.AbstractComposeView;
import com.google.inputmethod.kae;
import com.google.inputmethod.qya;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004BI\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013BK\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0014\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\t\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010%R(\u0010-\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010'8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b)\u0010*\"\u0004\b+\u0010,RB\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00142\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103RB\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00142\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010/\u001a\u0004\b6\u00101\"\u0004\b7\u00103RB\u0010<\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00142\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010/\u001a\u0004\b:\u00101\"\u0004\b;\u00103R\u0014\u0010?\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "Landroid/view/View;", "T", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Lcom/google/android/kae;", "Landroid/content/Context;", "context", "Landroidx/compose/runtime/f;", "parentContext", "typedView", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "Lcom/google/android/qya;", "saveStateRegistry", "", "compositeKeyHash", "Landroidx/compose/ui/node/m;", "owner", "<init>", "(Landroid/content/Context;Landroidx/compose/runtime/f;Landroid/view/View;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Lcom/google/android/qya;ILandroidx/compose/ui/node/m;)V", "Lkotlin/Function1;", "factory", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/f;Lcom/google/android/qya;ILandroidx/compose/ui/node/m;)V", "", "D", "()V", "E", "Landroid/view/View;", "F", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "getDispatcher", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "G", "Lcom/google/android/qya;", "H", "I", "", "Ljava/lang/String;", "saveStateKey", "Lcom/google/android/qya$a;", "value", "J", "Lcom/google/android/qya$a;", "setSavableRegistryEntry", "(Lcom/google/android/qya$a;)V", "savableRegistryEntry", "K", "Lkotlin/jvm/functions/Function1;", "getUpdateBlock", "()Lkotlin/jvm/functions/Function1;", "setUpdateBlock", "(Lkotlin/jvm/functions/Function1;)V", "updateBlock", "L", "getResetBlock", "setResetBlock", "resetBlock", "M", "getReleaseBlock", "setReleaseBlock", "releaseBlock", "getViewRoot", "()Landroid/view/View;", "viewRoot", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder implements kae {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final T typedView;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final NestedScrollDispatcher dispatcher;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final qya saveStateRegistry;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final int compositeKeyHash;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final String saveStateKey;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private qya.a savableRegistryEntry;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private Function1<? super T, Unit> updateBlock;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private Function1<? super T, Unit> resetBlock;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private Function1<? super T, Unit> releaseBlock;

    private ViewFactoryHolder(Context context, androidx.compose.p004runtime.f fVar, T t, NestedScrollDispatcher nestedScrollDispatcher, qya qyaVar, int i, m mVar) {
        super(context, fVar, i, nestedScrollDispatcher, t, mVar);
        this.typedView = t;
        this.dispatcher = nestedScrollDispatcher;
        this.saveStateRegistry = qyaVar;
        this.compositeKeyHash = i;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        this.saveStateKey = strValueOf;
        Object objF = qyaVar != null ? qyaVar.f(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objF instanceof SparseArray ? (SparseArray) objF : null;
        if (sparseArray != null) {
            t.restoreHierarchyState(sparseArray);
        }
        D();
        this.updateBlock = AndroidView_androidKt.e();
        this.resetBlock = AndroidView_androidKt.e();
        this.releaseBlock = AndroidView_androidKt.e();
    }

    private final void D() {
        qya qyaVar = this.saveStateRegistry;
        if (qyaVar != null) {
            setSavableRegistryEntry(qyaVar.b(this.saveStateKey, new Function0<Object>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$registerSaveStateProvider$1
                final /* synthetic */ ViewFactoryHolder<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.this$0 = this;
                }

                public final Object invoke() {
                    SparseArray<Parcelable> sparseArray = new SparseArray<>();
                    ((ViewFactoryHolder) this.this$0).typedView.saveHierarchyState(sparseArray);
                    return sparseArray;
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(qya.a aVar) {
        qya.a aVar2 = this.savableRegistryEntry;
        if (aVar2 != null) {
            aVar2.a();
        }
        this.savableRegistryEntry = aVar;
    }

    public final NestedScrollDispatcher getDispatcher() {
        return this.dispatcher;
    }

    public final Function1<T, Unit> getReleaseBlock() {
        return this.releaseBlock;
    }

    public final Function1<T, Unit> getResetBlock() {
        return this.resetBlock;
    }

    @Override // com.google.inputmethod.kae
    public /* bridge */ /* synthetic */ AbstractComposeView getSubCompositionView() {
        return super.getSubCompositionView();
    }

    public final Function1<T, Unit> getUpdateBlock() {
        return this.updateBlock;
    }

    @Override // com.google.inputmethod.kae
    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(Function1<? super T, Unit> function1) {
        this.releaseBlock = function1;
        setRelease(new Function0<Unit>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$releaseBlock$1
            final /* synthetic */ ViewFactoryHolder<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m70invoke();
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m70invoke() {
                this.this$0.getReleaseBlock().invoke(((ViewFactoryHolder) this.this$0).typedView);
                this.this$0.E();
            }
        });
    }

    public final void setResetBlock(Function1<? super T, Unit> function1) {
        this.resetBlock = function1;
        setReset(new Function0<Unit>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$resetBlock$1
            final /* synthetic */ ViewFactoryHolder<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m71invoke();
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m71invoke() {
                this.this$0.getResetBlock().invoke(((ViewFactoryHolder) this.this$0).typedView);
            }
        });
    }

    public final void setUpdateBlock(Function1<? super T, Unit> function1) {
        this.updateBlock = function1;
        setUpdate(new Function0<Unit>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$updateBlock$1
            final /* synthetic */ ViewFactoryHolder<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m72invoke();
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m72invoke() {
                this.this$0.getUpdateBlock().invoke(((ViewFactoryHolder) this.this$0).typedView);
            }
        });
    }

    /* synthetic */ ViewFactoryHolder(Context context, androidx.compose.p004runtime.f fVar, View view, NestedScrollDispatcher nestedScrollDispatcher, qya qyaVar, int i, m mVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : fVar, view, (i2 & 8) != 0 ? new NestedScrollDispatcher() : nestedScrollDispatcher, qyaVar, i, mVar);
    }

    public ViewFactoryHolder(Context context, Function1<? super Context, ? extends T> function1, androidx.compose.p004runtime.f fVar, qya qyaVar, int i, m mVar) {
        this(context, fVar, (View) function1.invoke(context), null, qyaVar, i, mVar, 8, null);
    }
}
