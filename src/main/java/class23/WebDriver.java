package class23;

public interface WebDriver {

    void openBrowser();

    void closeBrowser();

    void maximizeWindow();

    void findElement();
}
class ChromeDriver implements WebDriver{


    @Override
    public void openBrowser() {
        System.out.println("Open browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("max");
    }

    @Override
    public void findElement() {
        System.out.println("Open");
    }
}
class FireFox implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open it");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close it");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Max it");
    }

    @Override
    public void findElement() {
        System.out.println("Find it");
    }
}