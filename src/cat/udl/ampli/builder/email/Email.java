package cat.udl.ampli.builder.email;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class Email {
    private final String from;
    private final List<String> to;
    private final String subject;
    private final String body;
    private final List<String> ccTo;


    public Email(
            String from, List<String> to, String subject, String body) {
        this(from, to, subject, body, new ArrayList<>());
    }

    public Email(
            String from, List<String> to, String subject, String body,
            List<String> ccTo) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.body = body;
        this.ccTo = ccTo;
    }

    public static class EmailBuilder {

        private final List<String> toList;
        private Optional<String> from;
        private Optional<String> subject;
        private Optional<String> body;
        private final List<String> ccToList;

        static private final UnaryOperator<String> alreadyMsg = (a) -> "Mètode " + a + " ja s'ha cridat correctament una vegada";

        private EmailBuilder() {
            toList = new ArrayList<>();
            ccToList = new ArrayList<>();
            from = Optional.empty();
            subject = Optional.empty();
            body = Optional.empty();
        }

        public EmailBuilder from(String from) {
            uniqueAtribute(this.from, "from");
            checkAddress(from);
            this.from = Optional.ofNullable(from);
            return this;
        }

        private void checkAddress(String from) {
            if (!isCorrectAddress(from))
                throw new EmailBuilderException(from + " is not a correct e-mail address.");
        }

        private void uniqueAtribute(Optional<String> maybeAtribute, String name) {
            if (maybeAtribute.isPresent())
                throw new EmailBuilderException(alreadyMsg.apply(name));
        }

        private boolean isCorrectAddress(String from) {
            return true;
        }

        public EmailBuilder to(String to) {
            checkAddress(to);
            toList.add(to);
            return this;
        }

        public EmailBuilder subject(String subject) {
            uniqueAtribute(this.subject, "subject");
            this.subject = Optional.ofNullable(subject);
            return this;
        }

        public EmailBuilder body(String body) {
            uniqueAtribute(this.body, "body");
            this.body = Optional.ofNullable(body);
            return this;
        }

        public EmailBuilder ccTo(String email) {
            checkAddress(email);
            ccToList.add(email);
            return this;
        }

        public Email make() {
            if (from.isPresent() && subject.isPresent() && body.isPresent() && !toList.isEmpty())
                return new Email(from.get(), toList, subject.get(), body.get(), ccToList);
            throw new EmailBuilderException("No s'han cridat correctament alguns dels mètodes requerits: from, subject, body o to");
        }
    }

    static public EmailBuilder builder() {
        return new EmailBuilder();
    }

    @Override
    public String toString() {
        return "Email: " +
                "from='" + from + '\'' +
                ", to=" + to +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                ", ccTo=" + ccTo;
    }

    public static void main(String[] args) {
        Email email = Email.builder()
                .from("from")
                .to("to1").to("to2")
                .subject("subject").body("body").ccTo("ccTO")
                .make();
        System.out.println(email.toString());
        email = Email.builder()
                .from(null).from("hi")
                .to("to1").to("to2")
                .subject("subject").body("body")
                .make();
        System.out.println(email.toString());
        email = Email.builder()
                .from(null).from("hi").from("HELO")
                .to("to1").to("to2")
                .subject("subject").body("body").ccTo("ccTO")
                .make();
        System.out.println(email.toString());
    }


}
