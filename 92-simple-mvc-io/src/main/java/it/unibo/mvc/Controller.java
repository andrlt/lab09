package it.unibo.mvc;

import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;

/**
 * Application controller. Performs the I/O.
 */
public class Controller {

    private final File file;

    public Controller(){
        this.file = new File("output.txt");
    }

    public Controller(final File file, final String path) {
        this.file = file;
    }

    public File getFile(){
        return this.file;
    }

    public String getPathFile(){
        return this.file.getAbsolutePath();
    }

    public void writeFile(String s) throws IOException{
        try(PrintStream ps = new PrintStream(getPathFile(), StandardCharsets.UTF_8)){
            ps.print(s);
        }
    }
}
