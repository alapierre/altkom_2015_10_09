/*
 * Copyright by oryginal Authors
 */
package pl.altkom.bookstore;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author Adrian Lapierre <adrian at soft-project.pl>
 */
public class GeneratorLiczb {
    
    private int liczba;
    public static final String PROP_LICZBA = "liczba";

    /**
     * Get the value of liczba
     *
     * @return the value of liczba
     */
    public int getLiczba() {
        return liczba;
    }

    /**
     * Set the value of liczba
     *
     * @param liczba new value of liczba
     */
    public void setLiczba(int liczba) {
        int oldLiczba = this.liczba;
        this.liczba = liczba;
        propertyChangeSupport.firePropertyChange(PROP_LICZBA, oldLiczba, liczba);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    /**
     * Add PropertyChangeListener.
     *
     * @param listener
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    /**
     * Remove PropertyChangeListener.
     *
     * @param listener
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    
}
