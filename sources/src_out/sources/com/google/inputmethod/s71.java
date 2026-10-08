package com.google.inputmethod;

import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.c;
import java.util.HashMap;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class s71 extends c {
    protected float p0;

    @Deprecated
    protected HashMap<String, Float> q0;

    @Deprecated
    protected HashMap<String, Float> r0;

    @Deprecated
    protected HashMap<String, Float> s0;
    private HashMap<String, Float> t0;
    private HashMap<String, Float> u0;
    protected State.Chain v0;

    public s71(State state, State.Helper helper) {
        super(state, helper);
        this.p0 = 0.5f;
        this.q0 = new HashMap<>();
        this.r0 = new HashMap<>();
        this.s0 = new HashMap<>();
        this.v0 = State.Chain.SPREAD;
    }

    float d0(String str) {
        HashMap<String, Float> map = this.u0;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return this.u0.get(str).floatValue();
    }

    protected float e0(String str) {
        if (this.s0.containsKey(str)) {
            return this.s0.get(str).floatValue();
        }
        return 0.0f;
    }

    float f0(String str) {
        HashMap<String, Float> map = this.t0;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return this.t0.get(str).floatValue();
    }

    protected float g0(String str) {
        if (this.r0.containsKey(str)) {
            return this.r0.get(str).floatValue();
        }
        return 0.0f;
    }

    protected float h0(String str) {
        if (this.q0.containsKey(str)) {
            return this.q0.get(str).floatValue();
        }
        return -1.0f;
    }

    public s71 i0(State.Chain chain) {
        this.v0 = chain;
        return this;
    }
}
