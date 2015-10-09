/*
 * Copyright by oryginal Authors
 */
package pl.altkom.bookstore;

import java.beans.PropertyChangeSupport;

/**
 *
 * @author Adrian Lapierre <adrian at soft-project.pl>
 */
public class Customer {
    
    public static final String PROP_ID = "id";
    public static final String PROP_NAME = "name";
    public static final String PROP_CITI = "citi";
    
    private int id;
    private String name;
    private String citi;
    
        private String nip;
        
    private boolean faktura;

    public static final String PROP_FAKTURA = "faktura";

    /**
     * Get the value of faktura
     *
     * @return the value of faktura
     */
    public boolean isFaktura() {
        return faktura;
    }

    /**
     * Set the value of faktura
     *
     * @param faktura new value of faktura
     */
    public void setFaktura(boolean faktura) {
        boolean oldFaktura = this.faktura;
        this.faktura = faktura;
        propertyChangeSupport.firePropertyChange(PROP_FAKTURA, oldFaktura, faktura);
    }


    public static final String PROP_NIP = "nip";

    /**
     * Get the value of nip
     *
     * @return the value of nip
     */
    public String getNip() {
        return nip;
    }

    /**
     * Set the value of nip
     *
     * @param nip new value of nip
     */
    public void setNip(String nip) {
        String oldNip = this.nip;
        this.nip = nip;
        propertyChangeSupport.firePropertyChange(PROP_NIP, oldNip, nip);
    }

    
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", citi=" + citi + ", nip=" + nip + ", faktura=" + faktura + ", propertyChangeSupport=" + propertyChangeSupport + '}';
    }
    
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        int oldId = this.id;
        this.id = id;
        propertyChangeSupport.firePropertyChange(PROP_ID, oldId, id);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        java.lang.String oldName = this.name;
        this.name = name;
        propertyChangeSupport.firePropertyChange(PROP_NAME, oldName, name);
    }

    /**
     * @return the citi
     */
    public String getCiti() {
        return citi;
    }

    /**
     * @param citi the citi to set
     */
    public void setCiti(String citi) {
        java.lang.String oldCiti = this.citi;
        this.citi = citi;
        propertyChangeSupport.firePropertyChange(PROP_CITI, oldCiti, citi);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Customer other = (Customer) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    
    
    
    
}
