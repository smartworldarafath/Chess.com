package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import com.google.inputmethod.z0a;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
class p implements LayoutInflater.Factory2 {
    final FragmentManager a;

    class a implements View.OnAttachStateChangeListener {
        final /* synthetic */ t a;

        a(t tVar) {
            this.a = tVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment fragmentK = this.a.k();
            this.a.m();
            SpecialEffectsController.u((ViewGroup) fragmentK.mView.getParent(), p.this.a).q();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    p(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        t tVarC;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z0a.a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(z0a.b);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(z0a.c, -1);
        String string = typedArrayObtainStyledAttributes.getString(z0a.d);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !n.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentP0 = resourceId != -1 ? this.a.p0(resourceId) : null;
        if (fragmentP0 == null && string != null) {
            fragmentP0 = this.a.q0(string);
        }
        if (fragmentP0 == null && id != -1) {
            fragmentP0 = this.a.p0(id);
        }
        if (fragmentP0 == null) {
            fragmentP0 = this.a.C0().a(context.getClassLoader(), attributeValue);
            fragmentP0.mFromLayout = true;
            fragmentP0.mFragmentId = resourceId != 0 ? resourceId : id;
            fragmentP0.mContainerId = id;
            fragmentP0.mTag = string;
            fragmentP0.mInLayout = true;
            FragmentManager fragmentManager = this.a;
            fragmentP0.mFragmentManager = fragmentManager;
            fragmentP0.mHost = fragmentManager.E0();
            fragmentP0.onInflate(this.a.E0().getContext(), attributeSet, fragmentP0.mSavedFragmentState);
            tVarC = this.a.l(fragmentP0);
            if (FragmentManager.R0(2)) {
                fragmentP0.toString();
                Integer.toHexString(resourceId);
            }
        } else {
            if (fragmentP0.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            fragmentP0.mInLayout = true;
            FragmentManager fragmentManager2 = this.a;
            fragmentP0.mFragmentManager = fragmentManager2;
            fragmentP0.mHost = fragmentManager2.E0();
            fragmentP0.onInflate(this.a.E0().getContext(), attributeSet, fragmentP0.mSavedFragmentState);
            tVarC = this.a.C(fragmentP0);
            if (FragmentManager.R0(2)) {
                fragmentP0.toString();
                Integer.toHexString(resourceId);
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        FragmentStrictMode.g(fragmentP0, viewGroup);
        fragmentP0.mContainer = viewGroup;
        tVarC.m();
        tVarC.j();
        View view2 = fragmentP0.mView;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fragmentP0.mView.getTag() == null) {
            fragmentP0.mView.setTag(string);
        }
        fragmentP0.mView.addOnAttachStateChangeListener(new a(tVarC));
        return fragmentP0.mView;
    }
}
