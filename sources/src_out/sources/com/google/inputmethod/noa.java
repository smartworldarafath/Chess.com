package com.google.inputmethod;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\f\u001a\u00020\u0017*\u00020\u0016¢\u0006\u0004\b\f\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\r*\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001b¨\u0006("}, d2 = {"Lcom/google/android/noa;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "changed", "", "l", "t", "r", "b", "", "onLayout", "(ZIIII)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "requestLayout", "()V", "Lcom/google/android/qoa;", "Lcom/google/android/toa;", "(Lcom/google/android/qoa;)Lcom/google/android/toa;", "a", "(Lcom/google/android/qoa;)V", "I", "MaxRippleHosts", "", "Ljava/util/List;", "rippleHosts", "c", "unusedRippleHosts", "Lcom/google/android/roa;", "d", "Lcom/google/android/roa;", "rippleHostMap", "e", "nextHostIndex", "material-ripple"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class noa extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int MaxRippleHosts;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<toa> rippleHosts;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<toa> unusedRippleHosts;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final roa rippleHostMap;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int nextHostIndex;

    public noa(Context context) {
        super(context);
        this.MaxRippleHosts = 5;
        ArrayList arrayList = new ArrayList();
        this.rippleHosts = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.unusedRippleHosts = arrayList2;
        this.rippleHostMap = new roa();
        setClipChildren(false);
        toa toaVar = new toa(context);
        addView(toaVar);
        arrayList.add(toaVar);
        arrayList2.add(toaVar);
        this.nextHostIndex = 1;
        setTag(xy9.L, Boolean.TRUE);
    }

    public final void a(qoa qoaVar) {
        qoaVar.q2();
        toa toaVarB = this.rippleHostMap.b(qoaVar);
        if (toaVarB != null) {
            toaVarB.d();
            this.rippleHostMap.c(qoaVar);
            this.unusedRippleHosts.add(toaVarB);
        }
    }

    public final toa b(qoa qoaVar) {
        toa toaVarB = this.rippleHostMap.b(qoaVar);
        if (toaVarB != null) {
            return toaVarB;
        }
        toa toaVar = (toa) m.Q(this.unusedRippleHosts);
        if (toaVar == null) {
            if (this.nextHostIndex > m.r(this.rippleHosts)) {
                toaVar = new toa(getContext());
                addView(toaVar);
                this.rippleHosts.add(toaVar);
            } else {
                toaVar = this.rippleHosts.get(this.nextHostIndex);
                qoa qoaVarA = this.rippleHostMap.a(toaVar);
                if (qoaVarA != null) {
                    qoaVarA.q2();
                    this.rippleHostMap.c(qoaVarA);
                    toaVar.d();
                }
            }
            int i = this.nextHostIndex;
            if (i < this.MaxRippleHosts - 1) {
                this.nextHostIndex = i + 1;
            } else {
                this.nextHostIndex = 0;
            }
        }
        this.rippleHostMap.d(qoaVar, toaVar);
        return toaVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }
}
