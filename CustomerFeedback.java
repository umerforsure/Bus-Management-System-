import java.util.ArrayList;

public class CustomerFeedback {
    private ArrayList<String> feedbackList;

    public CustomerFeedback() {
        feedbackList = new ArrayList<>();
    }

    public void addFeedback(String feedback) {
        feedbackList.add(feedback);
    }

    public void displayFeedback() {
        System.out.println("\nCustomer Feedback:");
        for (String feedback : feedbackList) {
            System.out.println("- " + feedback);
        }
    }
}
