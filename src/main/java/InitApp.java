import data.FileData;
import view.MainPage;

public class InitApp {

    // Class will load the data file
    private FileData data;

    // Main class to load the menu
    private MainPage main;

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        InitApp initApp = new InitApp();
        initApp.init();
    }

    /**
     *
     */
    public void init(){
        //load the data file
        data = new FileData();
        data.loadFile();

        //init the console menu
        main = new MainPage();
        main.init();
    }
}
