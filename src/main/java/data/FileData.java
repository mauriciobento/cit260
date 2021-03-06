package data;

import model.Bank;
import java.io.*;
import java.util.Date;

public class FileData {

    public static Bank bank;

    private final String FILE_NAME = "bank";

    static {
        bank = new Bank();
    }

    /**
     *
     */
    public void saveFile(){
        writeFile();
    }

    private void createFile(){
        File file = new File(FILE_NAME);
        if(!file.exists()){
            writeFile();
        }
    }

    private void writeFile(){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(FILE_NAME);
            ObjectOutputStream o = new ObjectOutputStream(fos);
            o.writeObject(bank);
            o.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     */
    public void loadFile(){
        createFile();
        try {
            FileInputStream fi = new FileInputStream(new File(FILE_NAME));
            ObjectInputStream oi = new ObjectInputStream(fi);
            bank = (Bank) oi.readObject();
            oi.close();
            fi.close();
            if(bank != null){
                System.out.println(new Date()+" - Data base loaded.");
            }else{
                System.err.println(new Date()+" - Data base failed.");
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Data base failed.");
        }
    }

}
