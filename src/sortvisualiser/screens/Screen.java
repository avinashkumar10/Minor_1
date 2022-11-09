package sortvisualiser.screens;

import static sortvisualiser.MainApp.WIN_HEIGHT;
import static sortvisualiser.MainApp.WIN_WIDTH;

import java.awt.Dimension;

import javax.swing.JPanel;

import sortvisualiser.MainApp;

public abstract class Screen extends JPanel {
    protected MainApp app;   // object of MainApp class

    public Screen(MainApp app) {
        this.app = app;       // setter function
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(WIN_WIDTH, WIN_HEIGHT);    // return dimension of window
    }

    public abstract void onOpen(); //abstract onOpen method used for starting a sort ting window from beginning
}
