package com.google.inputmethod;

import androidx.compose.ui.b;
import androidx.compose.ui.focus.FocusProperties;
import com.google.android.dt4;
import com.google.android.ws4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/b;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusProperties;", "", "scope", "a", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/b;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class sk4 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements wk4, dt4 {
        private final /* synthetic */ Function1 a;

        a(Function1 function1) {
            this.a = function1;
        }

        @Override // com.google.inputmethod.wk4
        public final /* synthetic */ void a(FocusProperties focusProperties) {
            this.a.invoke(focusProperties);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof wk4) && (obj instanceof dt4)) {
                return Intrinsics.e(getFunctionDelegate(), ((dt4) obj).getFunctionDelegate());
            }
            return false;
        }

        public final ws4<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public static final b a(b bVar, Function1<? super FocusProperties, Unit> function1) {
        return bVar.then(new FocusPropertiesElement(new a(function1)));
    }
}
