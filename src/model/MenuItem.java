package model;

import javafx.scene.Node;

import java.io.File;

/**
 * Class: MenuItem
 * @author Mike Deiters
 * @version 1.0
 * April 17, 2016
 * ITEC 3150-01
 *
 * Description: A menu item that has a sound track assigned to it
 *
 * Purpose: Create a menu item with a sound file assigned to it
 */
public class MenuItem extends javafx.scene.control.MenuItem {

    protected File file;

    public MenuItem() {
    }

    public MenuItem( String text ) {
        super(text);
    }

    public MenuItem( String text, Node graphic ) {
        super(text, graphic);
    }

    /**
     * getFile
     * @return file File
     */
    public File getFile() {
        return file;
    }

    /**
     * setFile
     * @param str String
     */
    public void setFile(String str) {
        this.file = new File(str);
    }

    /**
     * setFile
     * @param file File
     */
    public void setFile( File file ) {
        this.file = file;
    }
}
