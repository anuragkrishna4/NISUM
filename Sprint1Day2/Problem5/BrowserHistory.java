import java.util.Stack;

public class BrowserHistory {
    private Stack<String> history = new Stack<>();

    public void visit(String url) {
        history.push(url);
        System.out.println("Visited: " + url);
    }

    public void back() {
        if (!history.isEmpty()) {
            String last = history.pop();
            System.out.println("Back from: " + last);
        } else {
            System.out.println("No previous history.");
        }
    }

    // View current page
    public void currentPage() {
        if (!history.isEmpty()) {
            System.out.println("Current page: " + history.peek());
        } else {
            System.out.println("No page visited yet.");
        }
    }

    // View entire history
    public void showHistory() {
        if (history.isEmpty()) {
            System.out.println("History is empty.");
        } else {
            System.out.println("Browser History:");
            for (String site : history) {
                System.out.println(site);
            }
        }
    }

    public static void main(String[] args) {
        BrowserHistory bh = new BrowserHistory();

        bh.visit("https://google.com");
        bh.visit("https://github.com");
        bh.visit("https://stackoverflow.com");

        bh.currentPage();   
        bh.back();          
        bh.currentPage();   
        bh.showHistory();   
    }
}
