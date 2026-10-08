package androidx.compose.p002material3;

import androidx.compose.ui.text.b;
import com.google.inputmethod.DateInputFormat;
import com.google.inputmethod.TransformedText;
import com.google.inputmethod.nce;
import com.google.inputmethod.zn8;
import kotlin.Metadata;
import kotlin.ranges.g;
import kotlin.text.h;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\b\u0005*\u0001\u0015\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/b0;", "Lcom/google/android/nce;", "Lcom/google/android/on2;", "dateInputFormat", "<init>", "(Lcom/google/android/on2;)V", "Landroidx/compose/ui/text/b;", "text", "Lcom/google/android/jed;", "a", "(Landroidx/compose/ui/text/b;)Lcom/google/android/jed;", "b", "Lcom/google/android/on2;", "", "c", "I", "firstDelimiterOffset", "d", "secondDelimiterOffset", "e", "dateFormatLength", "androidx/compose/material3/b0$a", "f", "Landroidx/compose/material3/b0$a;", "dateOffsetTranslator", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class b0 implements nce {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final DateInputFormat dateInputFormat;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int firstDelimiterOffset;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int secondDelimiterOffset;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int dateFormatLength;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final a dateOffsetTranslator = new a();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"androidx/compose/material3/b0$a", "Lcom/google/android/zn8;", "", "offset", "b", "(I)I", "a", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements zn8 {
        a() {
        }

        @Override // com.google.inputmethod.zn8
        public int a(int offset) {
            if (offset <= b0.this.firstDelimiterOffset - 1) {
                return offset;
            }
            if (offset <= b0.this.secondDelimiterOffset - 1) {
                return offset - 1;
            }
            return offset <= b0.this.dateFormatLength + 1 ? offset - 2 : b0.this.dateFormatLength;
        }

        @Override // com.google.inputmethod.zn8
        public int b(int offset) {
            if (offset < b0.this.firstDelimiterOffset) {
                return offset;
            }
            if (offset < b0.this.secondDelimiterOffset) {
                return offset + 1;
            }
            return offset <= b0.this.dateFormatLength ? offset + 2 : b0.this.dateFormatLength + 2;
        }
    }

    public b0(DateInputFormat dateInputFormat) {
        this.dateInputFormat = dateInputFormat;
        this.firstDelimiterOffset = h.w0(dateInputFormat.getPatternWithDelimiters(), dateInputFormat.getDelimiter(), 0, false, 6, (Object) null);
        this.secondDelimiterOffset = h.F0(dateInputFormat.getPatternWithDelimiters(), dateInputFormat.getDelimiter(), 0, false, 6, (Object) null);
        this.dateFormatLength = dateInputFormat.getPatternWithoutDelimiters().length();
    }

    @Override // com.google.inputmethod.nce
    public TransformedText a(b text) {
        int i = 0;
        String strP1 = text.getText().length() > this.dateFormatLength ? h.p1(text.getText(), g.A(0, this.dateFormatLength)) : text.getText();
        String str = "";
        int i2 = 0;
        while (i < strP1.length()) {
            int i3 = i2 + 1;
            str = str + strP1.charAt(i);
            if (i3 == this.firstDelimiterOffset || i2 + 2 == this.secondDelimiterOffset) {
                str = str + this.dateInputFormat.getDelimiter();
            }
            i++;
            i2 = i3;
        }
        return new TransformedText(new b(str, null, 2, null), this.dateOffsetTranslator);
    }
}
