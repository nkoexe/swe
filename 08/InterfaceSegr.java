interface Vehikel {
    void fahre();
    void fliege();
    void schwimme();
}

class Boot implements Vehikel {
    public void schwimme(){};
    public void fliege(){throw new UnsupportedOperationException("Kann ich ned");};
    public void fahre(){throw new UnsupportedOperationException("Kann ich ned");};

}

// Fix

interface Schwimmer{
    void schwimme();
}

interface Flieger{
    void fliege();
}

interface Fahrer{
    void fahre();
}

class BootNeu implements Schwimmer{
    public void schwimme(){};
}