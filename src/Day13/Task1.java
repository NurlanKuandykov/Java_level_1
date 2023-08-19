package Day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Nurlan");
        User user2 = new User("Zarina");
        User user3 = new User("Laysan");

        user1.sendMessage(user2,"Hello!");
        user1.sendMessage(user2, "How are you?");

        user2.sendMessage(user1, "Hello");
        user2.sendMessage(user1, "Fine, thanks. And you?");
        user2.sendMessage(user1, "I'm cooking");

        user3.sendMessage(user1, "hello!");
        user3.sendMessage(user1, "how are you?");
        user3.sendMessage(user1, "what are you doing?");

        user1.sendMessage(user3, "Hello! :)");
        user1.sendMessage(user3, "I'm fine! i'm at work. :)");
        user1.sendMessage(user3, "And you? :)");

        user3.sendMessage(user1,"I'm fine too.");

        MessageDatabase.showDialog(user1,user3);
        MessageDatabase.showInfoMessage();
    }
}
