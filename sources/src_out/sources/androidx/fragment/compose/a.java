package androidx.fragment.compose;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentContainerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/fragment/compose/a;", "Lkotlin/Function1;", "Landroid/content/Context;", "Landroid/view/View;", "", "containerId", "<init>", "(I)V", "context", "Landroidx/fragment/app/FragmentContainerView;", "b", "(Landroid/content/Context;)Landroidx/fragment/app/FragmentContainerView;", "a", "I", "Landroidx/fragment/app/FragmentContainerView;", "lastCreatedContainer", "()Landroidx/fragment/app/FragmentContainerView;", "container", "fragment-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class a implements Function1<Context, View> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int containerId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private FragmentContainerView lastCreatedContainer;

    public a(int i) {
        this.containerId = i;
    }

    public final FragmentContainerView a() {
        FragmentContainerView fragmentContainerView = this.lastCreatedContainer;
        if (fragmentContainerView != null) {
            return fragmentContainerView;
        }
        throw new IllegalStateException(("AndroidView has not created a container for " + this.containerId + " yet").toString());
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FragmentContainerView invoke(Context context) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(this.containerId);
        this.lastCreatedContainer = fragmentContainerView;
        return fragmentContainerView;
    }
}
