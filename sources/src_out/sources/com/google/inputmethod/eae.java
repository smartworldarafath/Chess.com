package com.google.inputmethod;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class eae {
    private final WeakReference<View> a;

    class a extends AnimatorListenerAdapter {
        final /* synthetic */ gae a;
        final /* synthetic */ View b;

        a(gae gaeVar, View view) {
            this.a = gaeVar;
            this.b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a.a(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.b(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.c(this.b);
        }
    }

    eae(View view) {
        this.a = new WeakReference<>(view);
    }

    private void h(View view, gae gaeVar) {
        if (gaeVar != null) {
            view.animate().setListener(new a(gaeVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public eae b(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public void c() {
        View view = this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = this.a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public eae e(long j) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public eae f(Interpolator interpolator) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public eae g(gae gaeVar) {
        View view = this.a.get();
        if (view != null) {
            h(view, gaeVar);
        }
        return this;
    }

    public eae i(long j) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public eae j(final iae iaeVar) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().setUpdateListener(iaeVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.dae
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    iaeVar.a(view);
                }
            } : null);
        }
        return this;
    }

    public void k() {
        View view = this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public eae l(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
