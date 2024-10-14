public class TextFormatterStrategyDemo {


    interface TextFormatter {
        String format(String text);
    }


    static class UpperCaseFormatter implements TextFormatter {
        @Override
        public String format(String text) {
            return text.toUpperCase();
        }
    }


    static class LowerCaseFormatter implements TextFormatter {
        @Override
        public String format(String text) {
            return text.toLowerCase();
        }
    }


    static class CapitalizeFormatter implements TextFormatter {
        @Override
        public String format(String text) {
            return text.substring(0, 1).toUpperCase() + text.substring(1).toLowerCase();
        }
    }


    static class TextEditor {
        private TextFormatter textFormatter;

        public void setTextFormatter(TextFormatter textFormatter) {
            this.textFormatter = textFormatter;
        }

        public String publishText(String text) {
            return textFormatter.format(text);
        }
    }


    public static void main(String[] args) {
        TextEditor editor = new TextEditor();


        editor.setTextFormatter(new UpperCaseFormatter());
        System.out.println(editor.publishText("hello world"));


        editor.setTextFormatter(new LowerCaseFormatter());
        System.out.println(editor.publishText("HELLO WORLD"));


        editor.setTextFormatter(new CapitalizeFormatter());
        System.out.println(editor.publishText("hELLO wORLD"));
    }
}
