import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainForm extends JFrame{
    private JPanel panel;
    private JTextPane text;
    private JButton buttonOpen;
    private JButton buttonSave;
    private JButton buttonSaveAs;
    private JLabel labelFile;
    public File file;
    public MainForm(){
        this.getContentPane().add(panel);

        buttonOpen.addActionListener(e -> {
            if(dialog(FileDialog.LOAD, "Открыть текстовый файл", "*.txt")){
                StringBuilder s = new StringBuilder();
                try(FileReader reader = new FileReader(file)){
                    int c;
                    while((c = reader.read()) != -1)
                        s.append((char)c);
                }catch (IOException ex){
                    ex.printStackTrace();
                }
                text.setText(s.toString());
                labelFile.setText(file.getName());
            }
        });
        buttonSave.addActionListener(e ->{
            if(file != null) save();
            else saveNew();
        });
        buttonSaveAs.addActionListener(e ->{
            saveNew();
        });
    }

    private void saveNew(){
        if(text.getText().length() > 0)
            if(dialog(FileDialog.SAVE, "Сохранить текстовый файл", "*.txt")){
                save();
                labelFile.setText(file.getName());
            }
    }

    private void save(){
        try{
            FileWriter writer = new FileWriter(file);
            writer.write(text.getText());
            writer.flush();
            writer.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
    private boolean dialog(int dialog, String title, String filter){
        FileDialog fileDialog = new FileDialog(new Frame(), title, dialog);
        fileDialog.setFile(filter);
        fileDialog.setVisible(true);
        File[] files = fileDialog.getFiles();
        if(files.length > 0){
            file = files[0];
            return true;
        }else return false;
    }

}
