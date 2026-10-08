package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.google.inputmethod.lo6;
import com.google.inputmethod.pae;
import com.google.inputmethod.ul3;
import com.google.inputmethod.v0a;
import java.util.HashMap;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class e extends f {
    String h = null;
    int i = androidx.constraintlayout.motion.widget.a.f;
    int j = 0;
    float k = Float.NaN;
    float l = Float.NaN;
    float m = Float.NaN;
    float n = Float.NaN;
    float o = Float.NaN;
    float p = Float.NaN;
    int q = 0;
    private float r = Float.NaN;
    private float s = Float.NaN;

    private static class a {
        private static SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(v0a.Q5, 1);
            a.append(v0a.O5, 2);
            a.append(v0a.X5, 3);
            a.append(v0a.M5, 4);
            a.append(v0a.N5, 5);
            a.append(v0a.U5, 6);
            a.append(v0a.V5, 7);
            a.append(v0a.P5, 9);
            a.append(v0a.W5, 8);
            a.append(v0a.T5, 11);
            a.append(v0a.S5, 12);
            a.append(v0a.R5, 10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(e eVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (a.get(index)) {
                    case 1:
                        if (MotionLayout.d1) {
                            int resourceId = typedArray.getResourceId(index, eVar.b);
                            eVar.b = resourceId;
                            if (resourceId == -1) {
                                eVar.c = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            eVar.c = typedArray.getString(index);
                        } else {
                            eVar.b = typedArray.getResourceId(index, eVar.b);
                        }
                        break;
                    case 2:
                        eVar.a = typedArray.getInt(index, eVar.a);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type == 3) {
                            eVar.h = typedArray.getString(index);
                        } else {
                            eVar.h = ul3.c[typedArray.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        eVar.g = typedArray.getInteger(index, eVar.g);
                        break;
                    case 5:
                        eVar.j = typedArray.getInt(index, eVar.j);
                        break;
                    case 6:
                        eVar.m = typedArray.getFloat(index, eVar.m);
                        break;
                    case 7:
                        eVar.n = typedArray.getFloat(index, eVar.n);
                        break;
                    case 8:
                        float f = typedArray.getFloat(index, eVar.l);
                        eVar.k = f;
                        eVar.l = f;
                        break;
                    case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                        eVar.q = typedArray.getInt(index, eVar.q);
                        break;
                    case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                        eVar.i = typedArray.getInt(index, eVar.i);
                        break;
                    case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                        eVar.k = typedArray.getFloat(index, eVar.k);
                        break;
                    case 12:
                        eVar.l = typedArray.getFloat(index, eVar.l);
                        break;
                    default:
                        Integer.toHexString(index);
                        a.get(index);
                        break;
                }
            }
            int i2 = eVar.a;
        }
    }

    public e() {
        this.d = 2;
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void a(HashMap<String, pae> map) {
    }

    @Override // androidx.constraintlayout.motion.widget.a
    /* JADX INFO: renamed from: b */
    public androidx.constraintlayout.motion.widget.a clone() {
        return new e().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public androidx.constraintlayout.motion.widget.a c(androidx.constraintlayout.motion.widget.a aVar) {
        super.c(aVar);
        e eVar = (e) aVar;
        this.h = eVar.h;
        this.i = eVar.i;
        this.j = eVar.j;
        this.k = eVar.k;
        this.l = Float.NaN;
        this.m = eVar.m;
        this.n = eVar.n;
        this.o = eVar.o;
        this.p = eVar.p;
        this.r = eVar.r;
        this.s = eVar.s;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void e(Context context, AttributeSet attributeSet) {
        a.b(this, context.obtainStyledAttributes(attributeSet, v0a.L5));
    }
}
